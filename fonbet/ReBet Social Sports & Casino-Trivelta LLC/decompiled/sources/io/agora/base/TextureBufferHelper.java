package io.agora.base;

import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import io.agora.base.VideoFrame;
import io.agora.base.internal.JniCommon;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.EglBase10;
import io.agora.base.internal.video.EglBase14;
import io.agora.base.internal.video.GlRectDrawer;
import io.agora.base.internal.video.GlTextureFrameBuffer;
import io.agora.base.internal.video.RendererCommon;
import io.agora.base.internal.video.YuvConverter;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class TextureBufferHelper {
    private static final String TAG = "TextureBufferHelper";
    private ByteBuffer alphaBuffer;
    private final EglBase eglBase;
    private final Handler handler;
    private boolean isQuitting;
    private int numOfTextureInUse;
    private GlRectDrawer textureDrawer;
    private GlTextureFrameBuffer textureFrameBuffer;
    private final YuvConverter yuvConverter;

    public static /* synthetic */ int access$210(TextureBufferHelper textureBufferHelper) {
        int i10 = textureBufferHelper.numOfTextureInUse;
        textureBufferHelper.numOfTextureInUse = i10 - 1;
        return i10;
    }

    public static TextureBufferHelper create(final String str, final EglBase.Context context) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        try {
            return (TextureBufferHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<TextureBufferHelper>() { // from class: io.agora.base.TextureBufferHelper.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public TextureBufferHelper call() {
                    try {
                        return new TextureBufferHelper(EglBase.Context.this, handler);
                    } catch (RuntimeException e10) {
                        Logging.e(TextureBufferHelper.TAG, str + " create failure", e10);
                        return null;
                    }
                }
            });
        } catch (Exception e10) {
            Logging.e(TAG, str + " create failure", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        }
        if (isTextureInUse() || !this.isQuitting) {
            throw new IllegalStateException("Unexpected release.");
        }
        Logging.d(TAG, "release()");
        GlRectDrawer glRectDrawer = this.textureDrawer;
        if (glRectDrawer != null) {
            glRectDrawer.release();
            this.textureDrawer = null;
        }
        GlTextureFrameBuffer glTextureFrameBuffer = this.textureFrameBuffer;
        if (glTextureFrameBuffer != null) {
            glTextureFrameBuffer.release();
            this.textureFrameBuffer = null;
        }
        ByteBuffer byteBuffer = this.alphaBuffer;
        if (byteBuffer != null) {
            JniCommon.nativeFreeByteBuffer(byteBuffer);
            this.alphaBuffer = null;
        }
        this.yuvConverter.release();
        this.eglBase.release();
        this.handler.getLooper().quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void returnTextureFrame() {
        this.handler.post(new Runnable() { // from class: io.agora.base.TextureBufferHelper.4
            @Override // java.lang.Runnable
            public void run() {
                TextureBufferHelper.access$210(TextureBufferHelper.this);
                if (!TextureBufferHelper.this.isQuitting || TextureBufferHelper.this.isTextureInUse()) {
                    return;
                }
                TextureBufferHelper.this.release();
            }
        });
    }

    public int convertToRGBA(TextureBuffer textureBuffer, int i10) {
        if (textureBuffer == null) {
            return 0;
        }
        if (this.textureDrawer == null) {
            this.textureDrawer = new GlRectDrawer();
        }
        if (this.textureFrameBuffer == null) {
            this.textureFrameBuffer = new GlTextureFrameBuffer(6408);
        }
        int i11 = i10 % 180;
        int width = i11 == 0 ? textureBuffer.getWidth() : textureBuffer.getHeight();
        int height = i11 == 0 ? textureBuffer.getHeight() : textureBuffer.getWidth();
        this.textureFrameBuffer.setSize(width, height);
        GLES20.glBindFramebuffer(36160, this.textureFrameBuffer.getFrameBufferId());
        GLES20.glClear(16384);
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preRotate(i10);
        matrix.preTranslate(-0.5f, -0.5f);
        matrix.postConcat(textureBuffer.getTransformMatrix());
        float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix);
        if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.RGB) {
            this.textureDrawer.drawRgb(textureBuffer.getTextureId(), 0, convertMatrixFromAndroidGraphicsMatrix, width, height, 0, 0, width, height, 0, AlphaStitchMode.ALPHA_NO_STITCH.value());
        } else {
            this.textureDrawer.drawOes(textureBuffer.getTextureId(), 0, convertMatrixFromAndroidGraphicsMatrix, width, height, 0, 0, width, height, 0, AlphaStitchMode.ALPHA_NO_STITCH.value());
        }
        GLES20.glBindFramebuffer(36160, 0);
        return this.textureFrameBuffer.getTextureId();
    }

    public void dispose() {
        Logging.d(TAG, "dispose()");
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: io.agora.base.TextureBufferHelper.5
                @Override // java.lang.Runnable
                public void run() {
                    TextureBufferHelper.this.isQuitting = true;
                    if (TextureBufferHelper.this.isTextureInUse()) {
                        return;
                    }
                    TextureBufferHelper.this.release();
                }
            });
        } catch (Exception e10) {
            Logging.d(TAG, "dispose fail: " + e10.getMessage());
        }
    }

    public EglBase getEglBase() {
        return this.eglBase;
    }

    public Handler getHandler() {
        return this.handler;
    }

    public <V> V invoke(Callable<V> callable) {
        return (V) ThreadUtils.invokeAtFrontUninterruptibly(this.handler, callable);
    }

    public boolean isTextureInUse() {
        return this.numOfTextureInUse > 0;
    }

    public ByteBuffer parseAlphaData(TextureBuffer textureBuffer, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (textureBuffer.getType() != VideoFrame.TextureBuffer.Type.RGB) {
            return null;
        }
        int i15 = i10 % 180;
        int width = i15 == 0 ? textureBuffer.getWidth() : textureBuffer.getHeight();
        int height = i15 == 0 ? textureBuffer.getHeight() : textureBuffer.getWidth();
        int i16 = width % 4;
        if (i16 == 0) {
            i11 = 6408;
            i12 = width / 4;
        } else {
            i11 = 6406;
            i12 = width;
        }
        if (this.textureDrawer == null) {
            this.textureDrawer = new GlRectDrawer();
        }
        if (this.textureFrameBuffer == null) {
            this.textureFrameBuffer = new GlTextureFrameBuffer(6408);
        }
        this.textureFrameBuffer.setSize(i12, height);
        GLES20.glBindFramebuffer(36160, this.textureFrameBuffer.getFrameBufferId());
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preRotate(i10);
        if (z10) {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.preTranslate(-0.5f, -0.5f);
        matrix.postConcat(textureBuffer.getTransformMatrix());
        float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix);
        if (i16 == 0) {
            int i17 = i12;
            this.textureDrawer.drawAlpha(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, width, height, 0, 0, i17, height);
            i13 = i17;
            i14 = 36160;
        } else {
            i13 = i12;
            i14 = 36160;
            this.textureDrawer.drawRgb(textureBuffer.getTextureId(), 0, convertMatrixFromAndroidGraphicsMatrix, width, height, 0, 0, width, height, 0, AlphaStitchMode.ALPHA_NO_STITCH.value());
            width = width;
            height = height;
        }
        ByteBuffer byteBuffer = this.alphaBuffer;
        if (byteBuffer == null) {
            this.alphaBuffer = JniCommon.nativeAllocateByteBuffer(width * height);
        } else {
            int i18 = width * height;
            if (byteBuffer.capacity() != i18) {
                Logging.w(TAG, "fillAlphaData size is changed, alphaBuffer.capacity: " + this.alphaBuffer.capacity() + "  buffer.width: " + width + "  buffer.height: " + height);
                JniCommon.nativeFreeByteBuffer(this.alphaBuffer);
                this.alphaBuffer = JniCommon.nativeAllocateByteBuffer(i18);
            } else {
                this.alphaBuffer.clear();
            }
        }
        GLES20.glReadPixels(0, 0, i13, height, i11, 5121, this.alphaBuffer);
        GLES20.glBindFramebuffer(i14, 0);
        return this.alphaBuffer;
    }

    public VideoFrame.TextureBuffer wrapTextureBuffer(int i10, int i11, VideoFrame.TextureBuffer.Type type, int i12, Matrix matrix) {
        return wrapTextureBuffer(i10, i11, type, i12, matrix, false);
    }

    private TextureBufferHelper(EglBase.Context context, Handler handler) {
        this.yuvConverter = new YuvConverter();
        this.numOfTextureInUse = 0;
        this.isQuitting = false;
        if (handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("TextureBufferHelper must be created on the handler thread");
        }
        this.handler = handler;
        EglBase eglBase14 = (EglBase14.isEGL14Supported() && (context == null || (context instanceof EglBase14.Context))) ? new EglBase14((EglBase14.Context) context, EglBase.CONFIG_PIXEL_BUFFER) : new EglBase10((EglBase10.Context) context, EglBase.CONFIG_PIXEL_BUFFER);
        this.eglBase = eglBase14;
        try {
            eglBase14.createDummyPbufferSurface();
            eglBase14.makeCurrent();
        } catch (RuntimeException e10) {
            this.eglBase.release();
            handler.getLooper().quit();
            throw e10;
        }
    }

    public VideoFrame.TextureBuffer wrapTextureBuffer(int i10, int i11, VideoFrame.TextureBuffer.Type type, int i12, Matrix matrix, boolean z10) {
        this.numOfTextureInUse++;
        return new TextureBuffer(this.eglBase.getEglBaseContext(), i10, i11, type, i12, matrix, this.handler, this.yuvConverter, new Runnable() { // from class: io.agora.base.TextureBufferHelper.2
            @Override // java.lang.Runnable
            public void run() {
                TextureBufferHelper.this.returnTextureFrame();
            }
        }, z10);
    }

    public VideoFrame.TextureBuffer wrapTextureBuffer(int i10, int i11, VideoFrame.TextureBuffer.Type type, int i12, long j10, Matrix matrix) {
        this.numOfTextureInUse++;
        return new TextureBuffer(this.eglBase.getEglBaseContext(), i10, i11, type, i12, j10, matrix, this.handler, this.yuvConverter, new Runnable() { // from class: io.agora.base.TextureBufferHelper.3
            @Override // java.lang.Runnable
            public void run() {
                TextureBufferHelper.this.returnTextureFrame();
            }
        });
    }
}
