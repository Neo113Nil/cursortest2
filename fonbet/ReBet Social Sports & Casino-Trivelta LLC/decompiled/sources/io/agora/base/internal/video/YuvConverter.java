package io.agora.base.internal.video;

import android.graphics.Matrix;
import android.opengl.GLES20;
import io.agora.base.AlphaStitchMode;
import io.agora.base.ColorSpace;
import io.agora.base.JavaI010Buffer;
import io.agora.base.JavaI420Buffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.JniCommon;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.GlGenericDrawer;
import io.agora.base.internal.video.YuvConverterStats;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class YuvConverter {
    private static final int ANDROID_MATRIX_LENGTH = 9;
    private static final boolean DEBUG = false;
    private static final String FRAGMENT_SHADER = "uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n";
    private static final String TAG = "YuvConverter";
    private static boolean enableHardwareBuffer = false;
    private static boolean enablePboOpt = true;
    private final List<YuvConverterStats> convertStatsList;
    private long convertTimeCounter;
    private long convertTimeInNS;
    private final GlGenericDrawer drawer;
    private final GlRectDrawer drawer10bit;
    private Matrix formerTextureMatrix;
    private final GPUPBOUtil gpupboUtil;
    private final HardwareBufferHelper hardwareBufferHelper;
    private final GlTextureFrameBuffer i010TextureFrameBuffer;
    private final GlTextureFrameBuffer i420TextureFrameBuffer;
    private int maxTextureSize;
    private final ShaderCallbacks shaderCallbacks;
    private final ThreadUtils.ThreadChecker threadChecker;
    private static final AtomicBoolean mIsNeedForceResetPbo = new AtomicBoolean(false);
    private static boolean enableConvertPerLog = false;
    private static boolean enableReportYuvConvertStats = true;

    /* renamed from: io.agora.base.internal.video.YuvConverter$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
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

    public static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        private float[] coeffs;
        private int coeffsLoc;
        private ColorSpace colorSpace;
        private float stepSize;
        private int xUnitLoc;
        private static final float[] Y_COEFFS_BIT601_LIMIT = {0.256788f, 0.504129f, 0.0979059f, 0.0627451f};
        private static final float[] U_COEFFS_BIT601_LIMIT = {-0.148223f, -0.290993f, 0.439216f, 0.501961f};
        private static final float[] V_COEFFS_BIT601_LIMIT = {0.439216f, -0.367788f, -0.0714274f, 0.501961f};
        private static final float[] Y_COEFFS_BIT601_FULL = {0.299f, 0.587f, 0.114f, 0.0f};
        private static final float[] U_COEFFS_BIT601_FULL = {-0.168736f, -0.331264f, 0.5f, 0.5f};
        private static final float[] V_COEFFS_BIT601_FULL = {0.5f, -0.418688f, -0.0813124f, 0.5f};
        private static final float[] Y_COEFFS_BIT709_LIMIT = {0.183f, 0.614f, 0.062f, 0.0627451f};
        private static final float[] U_COEFFS_BIT709_LIMIT = {-0.101f, -0.339f, 0.439f, 0.5f};
        private static final float[] V_COEFFS_BIT709_LIMIT = {0.439f, -0.399f, -0.04f, 0.5f};
        private static final float[] Y_COEFFS_BIT709_FULL = {0.2126f, 0.7154f, 0.072f, 0.0f};
        private static final float[] U_COEFFS_BIT709_FULL = {-0.1145f, -0.3855f, 0.5f, 0.5f};
        private static final float[] V_COEFFS_BIT709_FULL = {0.5f, -0.4543f, -0.0457f, 0.5f};
        private static final float[] Y_BT2020_FULL = {0.2627f, 0.678f, 0.0593f, 0.0f};
        private static final float[] U_BT2020_FULL = {-0.1396f, -0.3604f, 0.5f, 0.5f};
        private static final float[] V_BT2020_FULL = {0.5f, -0.4598f, -0.0402f, 0.5f};

        private ShaderCallbacks() {
            this.colorSpace = new WrappedNativeColorSpace(ColorSpace.Range.Full.getRange(), ColorSpace.Matrix.SMPTE170M.getMatrix(), ColorSpace.Transfer.SMPTE170M.getTransfer(), ColorSpace.Primary.kSMPTE170M.getPrimary());
        }

        @Override // io.agora.base.internal.video.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
            this.xUnitLoc = glShader.getUniformLocation("xUnit");
            this.coeffsLoc = glShader.getUniformLocation("coeffs");
        }

        @Override // io.agora.base.internal.video.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i10, int i11, int i12, int i13) {
            GLES20.glUniform4fv(this.coeffsLoc, 1, this.coeffs, 0);
            int i14 = this.xUnitLoc;
            float f10 = this.stepSize;
            float f11 = i10;
            GLES20.glUniform2f(i14, (fArr[0] * f10) / f11, (f10 * fArr[1]) / f11);
        }

        public void setColorSpace(ColorSpace colorSpace) {
            if (colorSpace != null) {
                this.colorSpace = colorSpace;
            }
        }

        public void setPlaneU() {
            this.stepSize = 2.0f;
            if (this.colorSpace.getTransfer() == ColorSpace.Transfer.BT2020_10) {
                this.coeffs = U_BT2020_FULL;
            } else if (this.colorSpace.getRange() == ColorSpace.Range.Full) {
                this.coeffs = this.colorSpace.getMatrix() == ColorSpace.Matrix.BT709 ? U_COEFFS_BIT709_FULL : U_COEFFS_BIT601_FULL;
            } else {
                this.coeffs = this.colorSpace.getMatrix() == ColorSpace.Matrix.BT709 ? U_COEFFS_BIT709_LIMIT : U_COEFFS_BIT601_LIMIT;
            }
        }

        public void setPlaneV() {
            this.stepSize = 2.0f;
            if (this.colorSpace.getTransfer() == ColorSpace.Transfer.BT2020_10) {
                this.coeffs = V_BT2020_FULL;
            } else if (this.colorSpace.getRange() == ColorSpace.Range.Full) {
                this.coeffs = this.colorSpace.getMatrix() == ColorSpace.Matrix.BT709 ? V_COEFFS_BIT709_FULL : V_COEFFS_BIT601_FULL;
            } else {
                this.coeffs = this.colorSpace.getMatrix() == ColorSpace.Matrix.BT709 ? V_COEFFS_BIT709_LIMIT : V_COEFFS_BIT601_LIMIT;
            }
        }

        public void setPlaneY() {
            this.stepSize = 1.0f;
            if (this.colorSpace.getTransfer() == ColorSpace.Transfer.BT2020_10) {
                this.coeffs = Y_BT2020_FULL;
            } else if (this.colorSpace.getRange() == ColorSpace.Range.Full) {
                this.coeffs = this.colorSpace.getMatrix() == ColorSpace.Matrix.BT709 ? Y_COEFFS_BIT709_FULL : Y_COEFFS_BIT601_FULL;
            } else {
                this.coeffs = this.colorSpace.getMatrix() == ColorSpace.Matrix.BT709 ? Y_COEFFS_BIT709_LIMIT : Y_COEFFS_BIT601_LIMIT;
            }
        }
    }

    public YuvConverter() {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.i420TextureFrameBuffer = new GlTextureFrameBuffer(6408);
        ShaderCallbacks shaderCallbacks = new ShaderCallbacks();
        this.shaderCallbacks = shaderCallbacks;
        this.drawer = new GlGenericDrawer(FRAGMENT_SHADER, shaderCallbacks);
        this.i010TextureFrameBuffer = new GlTextureFrameBuffer(34842);
        this.drawer10bit = new GlRectDrawer();
        this.gpupboUtil = new GPUPBOUtil();
        this.formerTextureMatrix = new Matrix();
        this.maxTextureSize = 0;
        this.convertTimeInNS = 0L;
        this.convertTimeCounter = 0L;
        this.convertStatsList = new ArrayList();
        this.hardwareBufferHelper = new HardwareBufferHelper();
        threadChecker.detachThread();
    }

    private boolean checkMaxTextureSize(int i10, int i11) {
        if (this.maxTextureSize == 0) {
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(3379, iArr, 0);
            GlUtil.checkNoGLES2Error("glGetIntegerv of max texture size error");
            this.maxTextureSize = iArr[0];
        }
        int i12 = this.maxTextureSize;
        if (i12 >= i10 && i12 >= i11) {
            return false;
        }
        Logging.e(TAG, "reach max texture size width:" + i10 + ", height:" + i11 + ", maxTextureSize:" + this.maxTextureSize);
        return true;
    }

    @CalledByNative
    public static void clearPboBuffer() {
        mIsNeedForceResetPbo.set(true);
    }

    private JavaI010Buffer convert10Texture(VideoFrame.TextureBuffer textureBuffer) {
        this.threadChecker.checkIsOnValidThread();
        int width = textureBuffer.getWidth();
        int height = textureBuffer.getHeight();
        int i10 = ((width + 7) / 8) * 8;
        int i11 = (height + 1) / 2;
        int i12 = height + i11;
        int i13 = i10 / 4;
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        if (checkMaxTextureSize(i13, i12)) {
            return null;
        }
        this.i010TextureFrameBuffer.setSize(i13, i12);
        this.shaderCallbacks.setColorSpace(new WrappedNativeColorSpace(ColorSpace.Range.Full.getRange(), ColorSpace.Matrix.BT2020_CL.getMatrix(), ColorSpace.Transfer.BT2020_10.getTransfer(), ColorSpace.Primary.kBT2020.getPrimary()));
        GLES20.glBindFramebuffer(36160, this.i010TextureFrameBuffer.getFrameBufferId());
        GlUtil.checkNoGLES2Error("glBindFramebuffer");
        this.shaderCallbacks.setPlaneY();
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, 0, 0, i13, height, 0);
        this.shaderCallbacks.setPlaneU();
        int i14 = i13 / 2;
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, 0, height, i14, i11, 0);
        this.shaderCallbacks.setPlaneV();
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, i14, height, i14, i11, 0);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i10 * i12 * 4);
        GLES20.glReadPixels(0, 0, width, i12, 6408, 5126, allocateDirect);
        GLES20.glBindFramebuffer(36160, 0);
        GlUtil.checkNoGLES2Error("glReadPixels setSize");
        allocateDirect.order(ByteOrder.nativeOrder());
        final ByteBuffer byteBuffer = get10BitBuffer(allocateDirect, width, height, i10, i12);
        int i15 = i10 * height;
        int i16 = i15 * 2;
        int i17 = i15 / 4;
        int i18 = (i15 + i17) * 2;
        byteBuffer.position(0);
        byteBuffer.limit(i16);
        ByteBuffer slice = byteBuffer.slice();
        byteBuffer.position(i16);
        int i19 = i17 * 2;
        byteBuffer.limit(i16 + i19);
        ByteBuffer slice2 = byteBuffer.slice();
        byteBuffer.position(i18);
        byteBuffer.limit(i18 + i19);
        int i20 = i10 / 2;
        return JavaI010Buffer.wrap(width, height, slice, i10, slice2, i20, byteBuffer.slice(), i20, new Runnable() { // from class: io.agora.base.internal.video.YuvConverter.2
            @Override // java.lang.Runnable
            public void run() {
                JniCommon.nativeFreeByteBuffer(byteBuffer);
            }
        });
    }

    private void drawTexture(int i10, VideoFrame.TextureBuffer.Type type, int i11, int i12, int i13) {
        GLES20.glClear(16384);
        int i14 = AnonymousClass3.$SwitchMap$io$agora$base$VideoFrame$TextureBuffer$Type[type.ordinal()];
        if (i14 == 1) {
            this.drawer10bit.drawOes(i10, 0, GlUtil.IDENTITY_MATRIX, i11, i12, 0, 0, i11, i12, i13, AlphaStitchMode.ALPHA_NO_STITCH.value());
        } else {
            if (i14 != 2) {
                throw new IllegalArgumentException("Unknown texture type.");
            }
            this.drawer10bit.drawRgb(i10, 0, GlUtil.IDENTITY_MATRIX, i11, i12, 0, 0, i11, i12, i13, AlphaStitchMode.ALPHA_NO_STITCH.value());
        }
        GlUtil.checkNoGLES2Error("yuvconvert.drawFrameBuffer");
    }

    private ByteBuffer get10BitBuffer(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13) {
        int i14 = i12 * i13;
        float[] fArr = new float[i14];
        byteBuffer.asFloatBuffer().get(fArr);
        int i15 = i10 * i11;
        byte[] bArr = new byte[i15 * 2];
        int i16 = (i15 / 4) * 2;
        byte[] bArr2 = new byte[i16];
        byte[] bArr3 = new byte[i16];
        for (int i17 = 0; i17 < i12; i17++) {
            for (int i18 = 0; i18 < i13; i18++) {
                int i19 = (i18 * i12) + i17;
                try {
                    float f10 = fArr[i19];
                    if (i19 < i12 * i11) {
                        short s10 = (short) (f10 * 1024.0f);
                        int i20 = i19 * 2;
                        bArr[i20] = (byte) (s10 & 255);
                        bArr[i20 + 1] = (byte) (s10 >> 8);
                    } else if (i17 < i12 / 2) {
                        short s11 = (short) (f10 * 1024.0f);
                        int i21 = (((i18 - i11) * (i12 / 2)) + i17) * 2;
                        bArr2[i21] = (byte) (s11 & 255);
                        bArr2[i21 + 1] = (byte) (s11 >> 8);
                    } else {
                        short s12 = (short) (f10 * 1024.0f);
                        int i22 = ((((i18 - i11) * (i12 / 2)) + i17) - (i12 / 2)) * 2;
                        bArr3[i22] = (byte) (s12 & 255);
                        bArr3[i22 + 1] = (byte) (s12 >> 8);
                    }
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i14 * 2);
        nativeAllocateByteBuffer.put(bArr);
        nativeAllocateByteBuffer.put(bArr2);
        nativeAllocateByteBuffer.put(bArr3);
        nativeAllocateByteBuffer.flip();
        return nativeAllocateByteBuffer;
    }

    private YuvConverterStats getYuvConverterStats(int i10, int i11, YuvConverterStats.YuvConvertMethod yuvConvertMethod) {
        YuvConverterStats yuvConverterStats = null;
        for (YuvConverterStats yuvConverterStats2 : this.convertStatsList) {
            if (yuvConverterStats2.getWidth() == i10 && yuvConverterStats2.getHeight() == i11 && yuvConverterStats2.getMethod() == yuvConvertMethod.value) {
                yuvConverterStats = yuvConverterStats2;
            }
        }
        if (yuvConverterStats != null) {
            return yuvConverterStats;
        }
        YuvConverterStats yuvConverterStats3 = new YuvConverterStats(i10, i11, yuvConvertMethod);
        this.convertStatsList.add(yuvConverterStats3);
        return yuvConverterStats3;
    }

    public static native void nativeReportYuvConvertStats(YuvConverterStats yuvConverterStats);

    @CalledByNative
    public static void setEnableConvertPerLog(boolean z10) {
        enableConvertPerLog = z10;
    }

    @CalledByNative
    public static void setEnableConvertReport(boolean z10) {
        enableReportYuvConvertStats = z10;
    }

    @CalledByNative
    public static void setEnableHardwareBuffer(boolean z10) {
        enableHardwareBuffer = z10;
    }

    @CalledByNative
    public static void setEnablePboOpt(boolean z10) {
        enablePboOpt = z10;
    }

    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer) {
        return convert(textureBuffer, null);
    }

    public JavaI010Buffer convertI010(VideoFrame.TextureBuffer textureBuffer) {
        if (HdrUtil.isSupportedEGL3()) {
            return convert10Texture(textureBuffer);
        }
        return null;
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.drawer.release();
        this.i420TextureFrameBuffer.release();
        this.gpupboUtil.release();
        this.threadChecker.detachThread();
        this.convertStatsList.clear();
        this.hardwareBufferHelper.release();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0187 A[Catch: Exception -> 0x0197, TryCatch #0 {Exception -> 0x0197, blocks: (B:26:0x0175, B:28:0x0187, B:30:0x0194, B:31:0x01a2, B:33:0x01b0, B:36:0x01c4, B:38:0x019a, B:39:0x01dd, B:41:0x01e1, B:43:0x01e8, B:45:0x01ef, B:46:0x01f1, B:48:0x01ff, B:49:0x01eb, B:50:0x0202), top: B:25:0x0175 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e1 A[Catch: Exception -> 0x0197, TryCatch #0 {Exception -> 0x0197, blocks: (B:26:0x0175, B:28:0x0187, B:30:0x0194, B:31:0x01a2, B:33:0x01b0, B:36:0x01c4, B:38:0x019a, B:39:0x01dd, B:41:0x01e1, B:43:0x01e8, B:45:0x01ef, B:46:0x01f1, B:48:0x01ff, B:49:0x01eb, B:50:0x0202), top: B:25:0x0175 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer, ColorSpace colorSpace) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        final ByteBuffer byteBuffer;
        this.threadChecker.checkIsOnValidThread();
        int width = textureBuffer.getWidth();
        int height = textureBuffer.getHeight();
        int i14 = ((width + 7) / 8) * 8;
        int i15 = (height + 1) / 2;
        int i16 = height + i15;
        int i17 = i14 / 4;
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        if (checkMaxTextureSize(i17, i16)) {
            return null;
        }
        boolean z13 = !textureBuffer.getTransformMatrix().equals(this.formerTextureMatrix);
        try {
            if (enableHardwareBuffer) {
                i10 = i16;
                i11 = i17;
                if (this.hardwareBufferHelper.prepare(i11, i10, 1, 259L, z13)) {
                    z10 = true;
                    if (z10) {
                        i12 = i11;
                        i13 = i10;
                        this.i420TextureFrameBuffer.setSize(i12, i13);
                    } else {
                        int i18 = i10;
                        int i19 = i11;
                        this.i420TextureFrameBuffer.bindTexture(this.hardwareBufferHelper.getOesTextureId(), 36197, i19, i18, z13);
                        i12 = i19;
                        i13 = i18;
                    }
                    GLES20.glBindFramebuffer(36160, this.i420TextureFrameBuffer.getFrameBufferId());
                    GlUtil.checkNoGLES2Error("glBindFramebuffer");
                    this.shaderCallbacks.setColorSpace(colorSpace);
                    this.shaderCallbacks.setPlaneY();
                    VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, 0, 0, i12, height, 0);
                    this.shaderCallbacks.setPlaneU();
                    int i20 = i12 / 2;
                    VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, 0, height, i20, i15, 0);
                    this.shaderCallbacks.setPlaneV();
                    VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, i20, height, i20, i15, 0);
                    ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i14 * i13);
                    long nanoTime = (!enableConvertPerLog || enableReportYuvConvertStats) ? System.nanoTime() : 0L;
                    z11 = !z10 && this.hardwareBufferHelper.readFrame(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), nativeAllocateByteBuffer);
                    if (z11) {
                        z12 = enablePboOpt && this.gpupboUtil.readFrame(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), z13, 6408, 5121, nativeAllocateByteBuffer, mIsNeedForceResetPbo.get());
                        AtomicBoolean atomicBoolean = mIsNeedForceResetPbo;
                        if (atomicBoolean.get()) {
                            atomicBoolean.set(false);
                        }
                        if (!z12) {
                            GLES20.glReadPixels(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), 6408, 5121, nativeAllocateByteBuffer);
                            byteBuffer = nativeAllocateByteBuffer;
                            float[] fArr = new float[9];
                            textureBuffer.getTransformMatrix().getValues(fArr);
                            this.formerTextureMatrix.setValues(fArr);
                            if (enableConvertPerLog) {
                                long nanoTime2 = System.nanoTime() - nanoTime;
                                if (this.convertTimeInNS == 0) {
                                    this.convertTimeInNS = nanoTime2;
                                } else {
                                    this.convertTimeInNS = (long) ((r4 + nanoTime2) / 2.0d);
                                }
                                long j10 = this.convertTimeCounter + 1;
                                this.convertTimeCounter = j10;
                                if (j10 % 100 == 0) {
                                    this.convertTimeCounter = 0L;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("pbo ");
                                    sb2.append(z12 ? "YES" : "NO");
                                    sb2.append(", avg timing for read pixel, ");
                                    sb2.append(this.convertTimeInNS);
                                    sb2.append(" ns");
                                    Logging.w(TAG, sb2.toString());
                                }
                            }
                            if (enableReportYuvConvertStats) {
                                long nanoTime3 = System.nanoTime() - nanoTime;
                                YuvConverterStats.YuvConvertMethod yuvConvertMethod = z12 ? YuvConverterStats.YuvConvertMethod.PBO : YuvConverterStats.YuvConvertMethod.GL_READ_PIXELS;
                                if (z11) {
                                    yuvConvertMethod = YuvConverterStats.YuvConvertMethod.HARDWARE_BUFFER;
                                }
                                YuvConverterStats yuvConverterStats = getYuvConverterStats(width, height, yuvConvertMethod);
                                if (yuvConverterStats.stats((int) (nanoTime3 / 1000))) {
                                    nativeReportYuvConvertStats(yuvConverterStats);
                                }
                            }
                            GlUtil.checkNoGLES2Error("YuvConverter.convert");
                            GLES20.glBindFramebuffer(36160, 0);
                            int i21 = i14 * height;
                            int i22 = i14 / 2;
                            int i23 = i21 + i22;
                            byteBuffer.position(0);
                            byteBuffer.limit(i21);
                            ByteBuffer slice = byteBuffer.slice();
                            byteBuffer.position(i21);
                            int i24 = (i14 * (i15 - 1)) + i22;
                            byteBuffer.limit(i21 + i24);
                            ByteBuffer slice2 = byteBuffer.slice();
                            byteBuffer.position(i23);
                            byteBuffer.limit(i23 + i24);
                            return JavaI420Buffer.wrap(width, height, slice, i14, slice2, i14, byteBuffer.slice(), i14, new Runnable() { // from class: io.agora.base.internal.video.YuvConverter.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    JniCommon.nativeFreeByteBuffer(byteBuffer);
                                }
                            });
                        }
                    } else {
                        z12 = false;
                    }
                    byteBuffer = nativeAllocateByteBuffer;
                    float[] fArr2 = new float[9];
                    textureBuffer.getTransformMatrix().getValues(fArr2);
                    this.formerTextureMatrix.setValues(fArr2);
                    if (enableConvertPerLog) {
                    }
                    if (enableReportYuvConvertStats) {
                    }
                    GlUtil.checkNoGLES2Error("YuvConverter.convert");
                    GLES20.glBindFramebuffer(36160, 0);
                    int i212 = i14 * height;
                    int i222 = i14 / 2;
                    int i232 = i212 + i222;
                    byteBuffer.position(0);
                    byteBuffer.limit(i212);
                    ByteBuffer slice3 = byteBuffer.slice();
                    byteBuffer.position(i212);
                    int i242 = (i14 * (i15 - 1)) + i222;
                    byteBuffer.limit(i212 + i242);
                    ByteBuffer slice22 = byteBuffer.slice();
                    byteBuffer.position(i232);
                    byteBuffer.limit(i232 + i242);
                    return JavaI420Buffer.wrap(width, height, slice3, i14, slice22, i14, byteBuffer.slice(), i14, new Runnable() { // from class: io.agora.base.internal.video.YuvConverter.1
                        @Override // java.lang.Runnable
                        public void run() {
                            JniCommon.nativeFreeByteBuffer(byteBuffer);
                        }
                    });
                }
            } else {
                i10 = i16;
                i11 = i17;
            }
            float[] fArr22 = new float[9];
            textureBuffer.getTransformMatrix().getValues(fArr22);
            this.formerTextureMatrix.setValues(fArr22);
            if (enableConvertPerLog) {
            }
            if (enableReportYuvConvertStats) {
            }
            GlUtil.checkNoGLES2Error("YuvConverter.convert");
            GLES20.glBindFramebuffer(36160, 0);
            int i2122 = i14 * height;
            int i2222 = i14 / 2;
            int i2322 = i2122 + i2222;
            byteBuffer.position(0);
            byteBuffer.limit(i2122);
            ByteBuffer slice32 = byteBuffer.slice();
            byteBuffer.position(i2122);
            int i2422 = (i14 * (i15 - 1)) + i2222;
            byteBuffer.limit(i2122 + i2422);
            ByteBuffer slice222 = byteBuffer.slice();
            byteBuffer.position(i2322);
            byteBuffer.limit(i2322 + i2422);
            return JavaI420Buffer.wrap(width, height, slice32, i14, slice222, i14, byteBuffer.slice(), i14, new Runnable() { // from class: io.agora.base.internal.video.YuvConverter.1
                @Override // java.lang.Runnable
                public void run() {
                    JniCommon.nativeFreeByteBuffer(byteBuffer);
                }
            });
        } catch (Exception e10) {
            JniCommon.nativeFreeByteBuffer(byteBuffer);
            Logging.w(TAG, "convert error: " + e10.getMessage());
            return null;
        }
        z10 = false;
        if (z10) {
        }
        GLES20.glBindFramebuffer(36160, this.i420TextureFrameBuffer.getFrameBufferId());
        GlUtil.checkNoGLES2Error("glBindFramebuffer");
        this.shaderCallbacks.setColorSpace(colorSpace);
        this.shaderCallbacks.setPlaneY();
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, 0, 0, i12, height, 0);
        this.shaderCallbacks.setPlaneU();
        int i202 = i12 / 2;
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, 0, height, i202, i15, 0);
        this.shaderCallbacks.setPlaneV();
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, i202, height, i202, i15, 0);
        ByteBuffer nativeAllocateByteBuffer2 = JniCommon.nativeAllocateByteBuffer(i14 * i13);
        if (enableConvertPerLog) {
        }
        if (z10) {
        }
        if (z11) {
        }
        byteBuffer = nativeAllocateByteBuffer2;
    }
}
