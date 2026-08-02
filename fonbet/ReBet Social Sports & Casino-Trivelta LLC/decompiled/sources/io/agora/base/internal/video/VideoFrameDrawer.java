package io.agora.base.internal.video;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import io.agora.base.AlphaStitchMode;
import io.agora.base.ColorSpace;
import io.agora.base.JavaI010Buffer;
import io.agora.base.JavaP010Buffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.video.RendererCommon;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class VideoFrameDrawer {
    static final float[] srcPoints = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    private VideoFrame lastConvertFrame;
    private VideoFrame lastI1010Frame;
    private VideoFrame lastI420Frame;
    private int renderHeight;
    private int renderWidth;
    private ColorSpace renderedColorSpace;
    private final float[] dstPoints = new float[6];
    private final Point renderSize = new Point();
    private final YuvUploader yuvUploader = new YuvUploader(null);
    private final Matrix renderMatrix = new Matrix();

    /* renamed from: io.agora.base.internal.video.VideoFrameDrawer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$agora$base$VideoFrame$TextureBuffer$Type;

        static {
            int[] iArr = new int[VideoFrame.TextureBuffer.Type.values().length];
            $SwitchMap$io$agora$base$VideoFrame$TextureBuffer$Type = iArr;
            try {
                iArr[VideoFrame.TextureBuffer.Type.OES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$agora$base$VideoFrame$TextureBuffer$Type[VideoFrame.TextureBuffer.Type.RGB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void calculateTransformedRenderSize(int i10, int i11, Matrix matrix) {
        if (matrix == null) {
            this.renderWidth = i10;
            this.renderHeight = i11;
            return;
        }
        matrix.mapPoints(this.dstPoints, srcPoints);
        for (int i12 = 0; i12 < 3; i12++) {
            float[] fArr = this.dstPoints;
            int i13 = i12 * 2;
            fArr[i13] = fArr[i13] * i10;
            int i14 = i13 + 1;
            fArr[i14] = fArr[i14] * i11;
        }
        float[] fArr2 = this.dstPoints;
        this.renderWidth = distance(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        float[] fArr3 = this.dstPoints;
        this.renderHeight = distance(fArr3[0], fArr3[1], fArr3[4], fArr3[5]);
    }

    private static int distance(float f10, float f11, float f12, float f13) {
        return (int) Math.round(Math.hypot(f12 - f10, f13 - f11));
    }

    public static void drawTexture(RendererCommon.GlDrawer glDrawer, VideoFrame.TextureBuffer textureBuffer, int i10, Matrix matrix, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        TextureBufferPool.waitFenceSignal2(textureBuffer.getFenceObject(), "VideoFrameDrawer");
        Matrix matrix2 = new Matrix(textureBuffer.getTransformMatrix());
        matrix2.preConcat(matrix);
        float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int i19 = AnonymousClass1.$SwitchMap$io$agora$base$VideoFrame$TextureBuffer$Type[textureBuffer.getType().ordinal()];
        if (i19 == 1) {
            glDrawer.drawOes(textureBuffer.getTextureId(), i10, convertMatrixFromAndroidGraphicsMatrix, i11, i12, i13, i14, i15, i16, i17, i18);
        } else {
            if (i19 != 2) {
                throw new RuntimeException("Unknown texture type.");
            }
            glDrawer.drawRgb(textureBuffer.getTextureId(), i10, convertMatrixFromAndroidGraphicsMatrix, i11, i12, i13, i14, i15, i16, i17, i18);
        }
    }

    public void convertByDrawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix, int i10, int i11, int i12, int i13) {
        calculateTransformedRenderSize(i12, i13, matrix);
        boolean z10 = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
        this.renderMatrix.reset();
        this.renderMatrix.preTranslate(0.5f, 0.5f);
        if (!z10) {
            this.renderMatrix.preScale(1.0f, -1.0f);
        }
        this.renderMatrix.preRotate(0.0f);
        this.renderMatrix.preTranslate(-0.5f, -0.5f);
        if (matrix != null) {
            this.renderMatrix.preConcat(matrix);
        }
        if (z10) {
            drawTexture(glDrawer, (VideoFrame.TextureBuffer) videoFrame.getBuffer(), 0, this.renderMatrix, this.renderWidth, this.renderHeight, i10, i11, i12, i13, videoFrame.getColorSpace().getTransfer().getTransfer());
            return;
        }
        if (videoFrame != this.lastConvertFrame) {
            this.lastConvertFrame = videoFrame;
            VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
            GLES20.glPixelStorei(3317, 1);
            this.yuvUploader.uploadFromBuffer(i420);
            i420.release();
        }
        glDrawer.drawYuv(this.yuvUploader.getYuvTextures(), 0, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i10, i11, i12, i13, videoFrame.getColorSpace(), videoFrame.getColorSpace().getTransfer().getTransfer());
    }

    public void disableNegativeAlphaData() {
        YuvUploader yuvUploader = this.yuvUploader;
        if (yuvUploader != null) {
            yuvUploader.disableNegativeAlphaData();
        }
    }

    public void doLut10Frame(RendererCommon.GlDrawer glDrawer, byte[] bArr) {
        glDrawer.setLut10Texture(bArr);
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer) {
        drawFrame(videoFrame, glDrawer, null);
    }

    public void release() {
        this.yuvUploader.release();
        this.lastI420Frame = null;
        this.lastI1010Frame = null;
        this.lastConvertFrame = null;
    }

    public ColorSpace renderedColorSpace() {
        return this.renderedColorSpace;
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix) {
        drawFrame(videoFrame, glDrawer, matrix, 0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), false);
    }

    public static class YuvUploader {
        private int alphaTexture;
        private ByteBuffer copyAlphaBuffer;
        private ByteBuffer copyBuffer;
        private boolean enableNegativeAlphaData;
        private int[] yuvTextures;

        private YuvUploader() {
            this.alphaTexture = 0;
            this.enableNegativeAlphaData = true;
        }

        public void disableNegativeAlphaData() {
            this.enableNegativeAlphaData = false;
        }

        public int getAlphaTexture() {
            return this.alphaTexture;
        }

        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public void release() {
            this.copyBuffer = null;
            this.copyAlphaBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
            int i10 = this.alphaTexture;
            if (i10 > 0) {
                GLES20.glDeleteTextures(1, new int[]{i10}, 0);
                this.alphaTexture = 0;
            }
        }

        public int uploadAlphaData(int i10, int i11, ByteBuffer byteBuffer, boolean z10) {
            if (this.alphaTexture == 0) {
                this.alphaTexture = GlUtil.generateTexture(3553);
            }
            boolean z11 = false;
            if (i10 <= 0 || i11 <= 0) {
                return 0;
            }
            int i12 = i10 * i11;
            if (z10 && this.enableNegativeAlphaData) {
                z11 = true;
            }
            if (z11) {
                ByteBuffer byteBuffer2 = this.copyAlphaBuffer;
                if (byteBuffer2 == null || byteBuffer2.capacity() < i12) {
                    this.copyAlphaBuffer = ByteBuffer.allocateDirect(i12);
                }
                YuvHelper.copyPlane(byteBuffer, i10, this.copyAlphaBuffer, i10, i10, -i11);
            }
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, this.alphaTexture);
            GLES20.glTexImage2D(3553, 0, 6406, i10, i11, 0, 6406, 5121, z11 ? this.copyAlphaBuffer : byteBuffer);
            return this.alphaTexture;
        }

        public int[] uploadFromBuffer(VideoFrame.I420Buffer i420Buffer) {
            return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()}, true);
        }

        public int[] uploadI1010FromBuffer(JavaI010Buffer javaI010Buffer) {
            return uploadYuvData(javaI010Buffer.getWidth(), javaI010Buffer.getHeight(), new int[]{javaI010Buffer.getStrideY(), javaI010Buffer.getStrideU(), javaI010Buffer.getStrideV()}, new ByteBuffer[]{javaI010Buffer.getDataY(), javaI010Buffer.getDataU(), javaI010Buffer.getDataV()}, false);
        }

        public int[] uploadYuvData(int i10, int i11, int[] iArr, ByteBuffer[] byteBufferArr, boolean z10) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            int i12 = i10 / 2;
            int[] iArr2 = {i10, i12, i12};
            int i13 = i11 / 2;
            int[] iArr3 = {i11, i13, i13};
            int i14 = 0;
            for (int i15 = 0; i15 < 3; i15++) {
                int i16 = iArr[i15];
                int i17 = iArr2[i15];
                if (i16 > i17) {
                    i14 = z10 ? Math.max(i14, i17 * iArr3[i15]) : Math.max(i14, i17 * iArr3[i15] * 2);
                }
            }
            if (i14 > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < i14)) {
                this.copyBuffer = ByteBuffer.allocateDirect(i14);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                for (int i18 = 0; i18 < 3; i18++) {
                    this.yuvTextures[i18] = GlUtil.generateTexture(3553);
                    GlUtil.checkNoGLES2Error("generateTexture");
                }
            }
            for (int i19 = 0; i19 < 3; i19++) {
                GLES20.glActiveTexture(33984 + i19);
                GLES20.glBindTexture(3553, this.yuvTextures[i19]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                int i20 = iArr[i19];
                int i21 = iArr2[i19];
                if (i20 == i21) {
                    byteBuffer = byteBufferArr[i19];
                } else {
                    if (z10) {
                        YuvHelper.copyPlane(byteBufferArr[i19], i20, this.copyBuffer, i21, i21, iArr3[i19]);
                    } else {
                        YuvHelper.copyPlane16(byteBufferArr[i19], i20, this.copyBuffer, i21, i21, iArr3[i19]);
                    }
                    byteBuffer = this.copyBuffer;
                }
                ByteBuffer byteBuffer3 = byteBuffer;
                if (z10) {
                    GLES20.glTexImage2D(3553, 0, 6409, iArr2[i19], iArr3[i19], 0, 6409, 5121, byteBuffer3);
                } else {
                    GLES20.glTexImage2D(3553, 0, 6410, iArr2[i19], iArr3[i19], 0, 6410, 5121, byteBuffer3);
                }
                GlUtil.checkNoGLES2Error("glTexImage2D");
            }
            return this.yuvTextures;
        }

        public /* synthetic */ YuvUploader(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix, int i10, int i11, int i12, int i13, boolean z10) {
        calculateTransformedRenderSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), matrix);
        boolean z11 = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
        this.renderMatrix.reset();
        this.renderMatrix.preTranslate(0.5f, 0.5f);
        if (!z11) {
            this.renderMatrix.preScale(1.0f, -1.0f);
        }
        this.renderMatrix.preRotate(videoFrame.getRotation());
        this.renderMatrix.preTranslate(-0.5f, -0.5f);
        if (matrix != null) {
            this.renderMatrix.preConcat(matrix);
        }
        int i14 = 0;
        if (z11) {
            this.lastI420Frame = null;
            this.lastI1010Frame = null;
            if (videoFrame.getAlphaBuffer() != null && z10) {
                i14 = this.yuvUploader.uploadAlphaData(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getAlphaBuffer(), z11);
            }
            drawTexture(glDrawer, (VideoFrame.TextureBuffer) videoFrame.getBuffer(), i14, this.renderMatrix, this.renderWidth, this.renderHeight, i10, i11, i12, i13, videoFrame.getColorSpace().getTransfer().getTransfer(), videoFrame.getAlphaStitchMode());
        } else {
            if (((videoFrame.getBuffer() instanceof JavaI010Buffer) || (videoFrame.getBuffer() instanceof JavaP010Buffer)) && videoFrame != this.lastI1010Frame) {
                this.lastI1010Frame = videoFrame;
                JavaI010Buffer javaI010Buffer = (JavaI010Buffer) videoFrame.getBuffer().toI010();
                if (javaI010Buffer != null) {
                    this.yuvUploader.uploadI1010FromBuffer(javaI010Buffer);
                    javaI010Buffer.release();
                }
            } else if (videoFrame != this.lastI420Frame) {
                this.lastI420Frame = videoFrame;
                VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                this.yuvUploader.uploadFromBuffer(i420);
                i420.release();
                if (videoFrame.getAlphaBuffer() != null && z10) {
                    i14 = this.yuvUploader.uploadAlphaData(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getAlphaBuffer(), z11);
                }
            } else if (z10) {
                i14 = this.yuvUploader.getAlphaTexture();
            }
            int i15 = i14;
            if (videoFrame.getAlphaStitchMode() == AlphaStitchMode.ALPHA_NO_STITCH.value()) {
                glDrawer.drawYuv(this.yuvUploader.getYuvTextures(), i15, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i10, i11, i12, i13, videoFrame.getColorSpace(), videoFrame.getColorSpace().getTransfer().getTransfer());
            } else {
                glDrawer.drawAlphaStitchGraph(this.yuvUploader.getYuvTextures(), i15, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i10, i11, i12, i13, videoFrame.getColorSpace(), videoFrame.getColorSpace().getTransfer().getTransfer(), videoFrame.getAlphaStitchMode());
            }
        }
        this.renderedColorSpace = glDrawer.renderedColorSpace();
    }

    public static void drawTexture(RendererCommon.GlDrawer glDrawer, VideoFrame.TextureBuffer textureBuffer, int i10, Matrix matrix, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        drawTexture(glDrawer, textureBuffer, i10, matrix, i11, i12, i13, i14, i15, i16, i17, AlphaStitchMode.ALPHA_NO_STITCH.value());
    }
}
