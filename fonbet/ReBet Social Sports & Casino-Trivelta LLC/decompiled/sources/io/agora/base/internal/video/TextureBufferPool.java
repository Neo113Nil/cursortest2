package io.agora.base.internal.video;

import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import io.agora.base.AlphaStitchMode;
import io.agora.base.TextureBuffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.ATrace;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.EglBase10;
import io.agora.base.internal.video.EglBase14;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGL10;
import lb.C5444x;

/* loaded from: classes2.dex */
public class TextureBufferPool {
    private static final String TAG = "TextureBufferPool";
    private static final boolean VERBOSE = false;
    private final GlRectDrawer drawer;
    private int dropCount;
    private final EglBase eglBase;
    private final EglBase.Context eglContext;
    private final int glPixelFormat;
    private final Handler handler;
    private boolean isQuitting;
    private final int keepBufferCnt;
    private final int maxBufferCnt;
    private final String name;
    private final boolean ownGlThread;
    private Runnable poolBufferReleaseCallback;
    private boolean shrinkPool;
    private final ArrayList<TextureInfo> textureInfoList;
    private final YuvConverter yuvConverter;
    private final YuvConverter yuvConverterInternal;
    private static final AtomicInteger nextSeq = new AtomicInteger(0);
    private static int MAX_SYNC_OUT_TIME = 10000000;
    private static List<String> glFlushBuggyDevices = Arrays.asList("Pixel 7", "Redmi 4A", "Redmi 5A", "V2231A");
    private static boolean forceGlFinish = false;
    private static boolean useGlFence = true;
    public static AtomicInteger fenceCount = new AtomicInteger(0);

    /* renamed from: io.agora.base.internal.video.TextureBufferPool$9, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass9 {
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

    public static class TextureInfo {
        int frameBufferId;
        int textureId;
        boolean inUse = false;
        boolean specified = false;
        int width = 0;
        int height = 0;
        long fenceObject = 0;

        public TextureInfo(int i10, int i11) {
            this.textureId = i10;
            this.frameBufferId = i11;
        }

        public String toString() {
            return "TextureInfo{textureId=" + this.textureId + ", frameBufferId=" + this.frameBufferId + ", inUse=" + this.inUse + ", specified=" + this.specified + ", width=" + this.width + ", height=" + this.height + ", fenceObject=" + this.fenceObject + '}';
        }
    }

    private TextureInfo acquireTextureFramebuffer() {
        TextureInfo textureInfo;
        Iterator<TextureInfo> it = this.textureInfoList.iterator();
        while (true) {
            if (!it.hasNext()) {
                textureInfo = null;
                break;
            }
            textureInfo = it.next();
            if (!textureInfo.inUse) {
                break;
            }
        }
        if (textureInfo == null) {
            if (this.textureInfoList.size() >= this.maxBufferCnt) {
                int i10 = this.dropCount + 1;
                this.dropCount = i10;
                ATrace.traceCounter("Drop@TexPool", i10);
                return null;
            }
            int generateTexture = GlUtil.generateTexture(3553);
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            TextureInfo textureInfo2 = new TextureInfo(generateTexture, iArr[0]);
            this.textureInfoList.add(textureInfo2);
            textureInfo = textureInfo2;
        }
        textureInfo.inUse = true;
        return textureInfo;
    }

    @CalledByNative
    public static TextureBufferPool create(String str, final EglBase.Context context, final int i10) {
        final String str2;
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        final TextureBufferPool[] textureBufferPoolArr = {null};
        try {
            str2 = str;
        } catch (Exception e10) {
            e = e10;
            str2 = str;
        }
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: io.agora.base.internal.video.TextureBufferPool.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        textureBufferPoolArr[0] = new TextureBufferPool(str2, i10, 6408, handler, true, TextureBufferPool.createEglAndMakeCurrent(EglBase.Context.this), EglBase.Context.this, (YuvConverter) null);
                    } catch (RuntimeException e11) {
                        Logging.e(TextureBufferPool.TAG, str2 + " failed to initialize egl", e11);
                        handler.getLooper().quit();
                    }
                }
            });
        } catch (Exception e11) {
            e = e11;
            Exception exc = e;
            Logging.e(TAG, str2 + " failed to initialize egl", exc);
            return textureBufferPoolArr[0];
        }
        return textureBufferPoolArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static EglBase createEglAndMakeCurrent(EglBase.Context context) {
        EglBase create = EglBaseFactory.create(context, EglBase.CONFIG_PIXEL_BUFFER);
        try {
            create.createDummyPbufferSurface();
            create.makeCurrent();
            return create;
        } catch (RuntimeException e10) {
            create.release();
            throw e10;
        }
    }

    public static TextureBufferPool createWithinGlThread(String str, int i10, int i11, Handler handler, EglBase eglBase, EglBase.Context context, YuvConverter yuvConverter, boolean z10) {
        return new TextureBufferPool(str, i10, i11, handler, false, eglBase, context, yuvConverter, z10);
    }

    public static void deleteFenceObject(long j10, String str) {
        if (j10 != 0) {
            synchronized (EglBase.lock) {
                try {
                    if (GLES30.glIsSync(j10)) {
                        GLES30.glDeleteSync(j10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VideoFrame.TextureBuffer doTextureCopy(int i10, VideoFrame.TextureBuffer.Type type, int i11, int i12, int i13, Matrix matrix, long j10, final Runnable runnable) {
        EglBase.Context context = this.eglContext;
        if ((context instanceof EglBase10.Context) && ((EglBase10.Context) context).getEglContext().equals(EGL10.EGL_NO_CONTEXT)) {
            return null;
        }
        EglBase.Context context2 = this.eglContext;
        if ((context2 instanceof EglBase14.Context) && ((EglBase14.Context) context2).getEglContext().equals(EGL14.EGL_NO_CONTEXT)) {
            return null;
        }
        if (j10 != 0) {
            waitFenceSignal2(j10, this.name);
        }
        final TextureInfo acquireTextureFramebuffer = acquireTextureFramebuffer();
        if (acquireTextureFramebuffer == null) {
            Logging.w(TAG, this.name + "acquireTextureFramebuffer failed!");
            return null;
        }
        ATrace.beginSection("setupTextureFrameBuffer");
        boolean z10 = setupTextureFrameBuffer(acquireTextureFramebuffer, i11, i12, i13);
        ATrace.endSection();
        if (!z10) {
            Logging.w(TAG, this.name + "setupTextureFrameBuffer failed!");
            releaseTextureFramebuffer(acquireTextureFramebuffer);
            return null;
        }
        GLES20.glBindFramebuffer(36160, acquireTextureFramebuffer.frameBufferId);
        ATrace.beginSection("drawTexture");
        drawTexture(i10, type, i11, i12, i13);
        ATrace.endSection();
        ATrace.beginSection("flush");
        GLES20.glBindFramebuffer(36160, 0);
        synchronized (EglBase.lock) {
            GLES20.glUseProgram(0);
        }
        long gLFenceObject = useGlFence ? getGLFenceObject() : 0L;
        if (gLFenceObject == 0) {
            GLES20.glFlush();
        }
        acquireTextureFramebuffer.fenceObject = gLFenceObject;
        if (isGlFlushBuggyDevice()) {
            GLES20.glFinish();
        }
        ATrace.endSection();
        TextureBuffer textureBuffer = new TextureBuffer(this.eglContext, i11, i12, VideoFrame.TextureBuffer.Type.RGB, acquireTextureFramebuffer.textureId, matrix, this.handler, this.yuvConverter, new Runnable() { // from class: io.agora.base.internal.video.TextureBufferPool.8
            @Override // java.lang.Runnable
            public void run() {
                TextureBufferPool.this.handler.post(new Runnable() { // from class: io.agora.base.internal.video.TextureBufferPool.8.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass8 anonymousClass8 = AnonymousClass8.this;
                        TextureBufferPool.this.releaseTextureFramebuffer(acquireTextureFramebuffer);
                        if (TextureBufferPool.this.isQuitting && !TextureBufferPool.this.anyTextureInUse()) {
                            Logging.i(TextureBufferPool.TAG, TextureBufferPool.this.name + " ready to release since no buffer in flight");
                            TextureBufferPool.this.release();
                        }
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        if (TextureBufferPool.this.poolBufferReleaseCallback != null) {
                            TextureBufferPool.this.poolBufferReleaseCallback.run();
                        }
                    }
                });
            }
        }, this, gLFenceObject, nextSeq.getAndIncrement(), HdrUtil.is10BitLumaDepth(i13));
        final TextureBuffer[] textureBufferArr = {textureBuffer};
        return textureBuffer;
    }

    private void drawTexture(int i10, VideoFrame.TextureBuffer.Type type, int i11, int i12, int i13) {
        GLES20.glClear(16384);
        int i14 = AnonymousClass9.$SwitchMap$io$agora$base$VideoFrame$TextureBuffer$Type[type.ordinal()];
        if (i14 == 1) {
            this.drawer.drawOes(i10, 0, GlUtil.IDENTITY_MATRIX, i11, i12, 0, 0, i11, i12, i13, AlphaStitchMode.ALPHA_NO_STITCH.value());
        } else {
            if (i14 != 2) {
                throw new IllegalArgumentException("Unknown texture type.");
            }
            this.drawer.drawRgb(i10, 0, GlUtil.IDENTITY_MATRIX, i11, i12, 0, 0, i11, i12, i13, AlphaStitchMode.ALPHA_NO_STITCH.value());
        }
        GlUtil.checkNoGLES2Error("TextureBufferPool.drawFrameBuffer");
    }

    public static long getGLFenceObject() {
        long glFenceSync = GLES30.glFenceSync(37143, 0);
        if (glFenceSync != 0) {
            GLES20.glFlush();
        }
        return glFenceSync;
    }

    @CalledByNative
    public static boolean isGlFlushBuggyDevice() {
        Iterator<String> it = glFlushBuggyDevices.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(Build.MODEL)) {
                return true;
            }
        }
        return forceGlFinish;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        Logging.i(TAG, this.name + " release()");
        if (!this.textureInfoList.isEmpty()) {
            int size = this.textureInfoList.size();
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            for (int i10 = 0; i10 < size; i10++) {
                TextureInfo textureInfo = this.textureInfoList.get(i10);
                iArr[i10] = textureInfo.textureId;
                iArr2[i10] = textureInfo.frameBufferId;
                deleteFenceObject(textureInfo.fenceObject, this.name);
            }
            Logging.i(TAG, this.name + ": delete textures " + Arrays.toString(iArr) + " framebuffers:" + Arrays.toString(iArr2));
            GLES20.glDeleteTextures(size, iArr, 0);
            GLES20.glDeleteFramebuffers(size, iArr2, 0);
            this.textureInfoList.clear();
        }
        this.yuvConverterInternal.release();
        this.drawer.release();
        if (this.ownGlThread) {
            EglBase eglBase = this.eglBase;
            if (eglBase != null) {
                eglBase.release();
            }
            this.handler.getLooper().quit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseTextureFramebuffer(TextureInfo textureInfo) {
        textureInfo.inUse = false;
        if (this.shrinkPool) {
            int indexOf = this.textureInfoList.indexOf(textureInfo);
            if (indexOf < 0) {
                Logging.e(TAG, ((Thread.currentThread().getName() + " texture info not found!") + " texInfo.textureId: ") + textureInfo.textureId);
            } else if (indexOf >= this.keepBufferCnt) {
                GLES20.glDeleteTextures(1, new int[]{textureInfo.textureId}, 0);
                GLES20.glDeleteFramebuffers(1, new int[]{textureInfo.frameBufferId}, 0);
                this.textureInfoList.remove(indexOf);
            }
        }
        deleteFenceObject(textureInfo.fenceObject, this.name);
    }

    @CalledByNative
    public static void setForceGlFinish(boolean z10) {
        Logging.i(TAG, "setForceGlFinish " + z10);
        forceGlFinish = z10;
    }

    @CalledByNative
    public static void setUseGlFence(boolean z10) {
        Logging.i(TAG, "setUseGlFence " + z10);
        useGlFence = z10;
    }

    private boolean setupTextureFrameBuffer(TextureInfo textureInfo, int i10, int i11, int i12) {
        if (i10 <= 0 || i11 <= 0) {
            Logging.w(TAG, "Invalid size: " + i10 + C5444x.f55808b + i11);
            return false;
        }
        if (textureInfo.specified && textureInfo.width == i10 && textureInfo.height == i11) {
            return true;
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, textureInfo.textureId);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        ATrace.beginSection("glTexImage2D");
        if (HdrUtil.is10BitLumaDepth(i12) && HdrUtil.isSupportedEGL3()) {
            GLES20.glTexImage2D(3553, 0, 34842, i10, i11, 0, 6408, 5131, null);
        } else {
            int i13 = this.glPixelFormat;
            GLES20.glTexImage2D(3553, 0, i13, i10, i11, 0, i13, 5121, null);
        }
        ATrace.endSection();
        GlUtil.checkNoGLES2Error("TextureBufferPool.glTexImage2D");
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, textureInfo.frameBufferId);
        ATrace.beginSection("glFramebufferTexture2D");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, textureInfo.textureId, 0);
        ATrace.endSection();
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        GLES20.glBindFramebuffer(36160, 0);
        if (glCheckFramebufferStatus == 36053) {
            textureInfo.specified = true;
            textureInfo.width = i10;
            textureInfo.height = i11;
            return true;
        }
        Logging.w(TAG, "Framebuffer not complete, status: " + glCheckFramebufferStatus);
        return false;
    }

    public static boolean waitFenceSignal(long j10, String str) {
        System.currentTimeMillis();
        if (j10 != 0 && GLES30.glIsSync(j10)) {
            switch (GLES30.glClientWaitSync(j10, 1, MAX_SYNC_OUT_TIME)) {
                case 37146:
                case 37148:
                    return true;
                case 37147:
                default:
                    return false;
                case 37149:
                    int eglGetError = EGL14.eglGetError();
                    Logging.e(TAG, "waitFenceSignal error:" + eglGetError);
                    break;
            }
        }
        return false;
    }

    public static boolean waitFenceSignal2(long j10, String str) {
        System.currentTimeMillis();
        if (j10 == 0) {
            return false;
        }
        synchronized (EglBase.lock) {
            try {
                if (GLES30.glIsSync(j10)) {
                    GLES30.glWaitSync(j10, 0, -1L);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    public boolean anyTextureInUse() {
        Iterator<TextureInfo> it = this.textureInfoList.iterator();
        while (it.hasNext()) {
            if (it.next().inUse) {
                return true;
            }
        }
        return false;
    }

    @CalledByNative
    public void deleteGlFenceIfNeeded(final long j10) {
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(this.handler, 1000L, new Callable<Void>() { // from class: io.agora.base.internal.video.TextureBufferPool.7
                @Override // java.util.concurrent.Callable
                public Void call() {
                    TextureBufferPool.deleteFenceObject(j10, TextureBufferPool.this.name);
                    return null;
                }
            });
        } catch (Exception unused) {
        }
    }

    @CalledByNative
    public void dispose() {
        Logging.i(TAG, this.name + " dispose()");
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: io.agora.base.internal.video.TextureBufferPool.5
                @Override // java.lang.Runnable
                public void run() {
                    TextureBufferPool.this.isQuitting = true;
                    if (TextureBufferPool.this.anyTextureInUse()) {
                        return;
                    }
                    Logging.i(TextureBufferPool.TAG, TextureBufferPool.this.name + " ready to release since no more buffer in flight");
                    TextureBufferPool.this.release();
                }
            });
        } catch (Exception e10) {
            Logging.i(TAG, this.name + " dispose fail: " + e10.getMessage());
        }
    }

    @CalledByNative
    public VideoFrame.TextureBuffer doGetEmptyBufferFromPool(int i10, int i11, Matrix matrix) {
        final TextureInfo acquireTextureFramebuffer = acquireTextureFramebuffer();
        if (acquireTextureFramebuffer == null) {
            Logging.w(TAG, this.name + "acquireTextureFramebuffer failed!");
            return null;
        }
        ATrace.beginSection("setupTextureFrameBuffer");
        boolean z10 = setupTextureFrameBuffer(acquireTextureFramebuffer, i10, i11, 0);
        ATrace.endSection();
        if (z10) {
            return new TextureBuffer(this.eglContext, i10, i11, VideoFrame.TextureBuffer.Type.RGB, acquireTextureFramebuffer.textureId, matrix, this.handler, this.yuvConverter, new Runnable() { // from class: io.agora.base.internal.video.TextureBufferPool.4
                @Override // java.lang.Runnable
                public void run() {
                    TextureBufferPool.this.handler.post(new Runnable() { // from class: io.agora.base.internal.video.TextureBufferPool.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                            TextureBufferPool.this.releaseTextureFramebuffer(acquireTextureFramebuffer);
                            if (TextureBufferPool.this.isQuitting && !TextureBufferPool.this.anyTextureInUse()) {
                                Logging.d(TextureBufferPool.TAG, TextureBufferPool.this.name + " ready to release since no buffer in flight");
                                TextureBufferPool.this.release();
                            }
                            if (TextureBufferPool.this.poolBufferReleaseCallback != null) {
                                TextureBufferPool.this.poolBufferReleaseCallback.run();
                            }
                        }
                    });
                }
            }, this, 0L, nextSeq.getAndIncrement(), HdrUtil.is10BitLumaDepth(0));
        }
        Logging.w(TAG, this.name + "setupTextureFrameBuffer failed!");
        releaseTextureFramebuffer(acquireTextureFramebuffer);
        return null;
    }

    @CalledByNative
    public VideoFrame.TextureBuffer getEmptyBufferFromPool(final int i10, final int i11, final float[] fArr) {
        try {
            return (VideoFrame.TextureBuffer) ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Callable<VideoFrame.TextureBuffer>() { // from class: io.agora.base.internal.video.TextureBufferPool.3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public VideoFrame.TextureBuffer call() {
                    return TextureBufferPool.this.doGetEmptyBufferFromPool(i10, i11, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr));
                }
            });
        } catch (Exception e10) {
            Logging.w(TAG, "textureCopy faile: " + e10.getMessage());
            return null;
        }
    }

    public void setPoolBufferReleaseCallback(Runnable runnable) {
        this.poolBufferReleaseCallback = runnable;
    }

    @CalledByNative
    public VideoFrame.TextureBuffer textureCopy(VideoFrame.TextureBuffer textureBuffer, Runnable runnable) {
        return textureCopy(textureBuffer, 0, runnable);
    }

    @CalledByNative
    public void waitGlFenceIfNeeded(final long j10) {
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(this.handler, 1000L, new Callable<Void>() { // from class: io.agora.base.internal.video.TextureBufferPool.6
                @Override // java.util.concurrent.Callable
                public Void call() {
                    TextureBufferPool.waitFenceSignal2(j10, TextureBufferPool.this.name);
                    return null;
                }
            });
        } catch (Exception unused) {
        }
    }

    private TextureBufferPool(String str, int i10, int i11, Handler handler, boolean z10, EglBase eglBase, EglBase.Context context, YuvConverter yuvConverter, boolean z11) {
        YuvConverter yuvConverter2 = new YuvConverter();
        this.yuvConverterInternal = yuvConverter2;
        this.shrinkPool = true;
        this.textureInfoList = new ArrayList<>();
        this.poolBufferReleaseCallback = null;
        this.isQuitting = false;
        this.dropCount = 0;
        this.name = str;
        int max = Math.max(i10, 1);
        this.maxBufferCnt = max;
        this.shrinkPool = z11;
        this.keepBufferCnt = z11 ? Math.min(max, 3) : max;
        this.glPixelFormat = i11;
        this.handler = handler;
        this.ownGlThread = z10;
        this.eglBase = eglBase;
        this.yuvConverter = yuvConverter == null ? yuvConverter2 : yuvConverter;
        context = context == null ? eglBase.getEglBaseContext() : context;
        this.eglContext = context;
        this.drawer = new GlRectDrawer();
        Logging.i(TAG, str + " init buffer pool, ownGlThread: " + z10 + " cnt: " + i10 + " sharedContext: " + context + " " + this);
    }

    public static TextureBufferPool createWithinGlThread(String str, int i10, int i11, Handler handler, EglBase eglBase, EglBase.Context context, YuvConverter yuvConverter) {
        return new TextureBufferPool(str, i10, i11, handler, false, eglBase, context, yuvConverter);
    }

    public VideoFrame.TextureBuffer textureCopy(VideoFrame.TextureBuffer textureBuffer, int i10, Runnable runnable) {
        if (textureBuffer != null) {
            return textureCopy(textureBuffer.getTextureId(), textureBuffer.getType(), textureBuffer.getWidth(), textureBuffer.getHeight(), textureBuffer.getTransformMatrix(), textureBuffer.getFenceObject(), i10, runnable);
        }
        Logging.w(TAG, "textureCopy: " + this.name + " textureBuffer null");
        return null;
    }

    public VideoFrame.TextureBuffer textureCopy(final int i10, final VideoFrame.TextureBuffer.Type type, final int i11, final int i12, final Matrix matrix, final long j10, final int i13, final Runnable runnable) {
        try {
            return (VideoFrame.TextureBuffer) ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Callable<VideoFrame.TextureBuffer>() { // from class: io.agora.base.internal.video.TextureBufferPool.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public VideoFrame.TextureBuffer call() {
                    return TextureBufferPool.this.doTextureCopy(i10, type, i11, i12, i13, matrix, j10, runnable);
                }
            });
        } catch (Exception e10) {
            Logging.w(TAG, "textureCopy faile: " + e10.getMessage());
            return null;
        }
    }

    private TextureBufferPool(String str, int i10, int i11, Handler handler, boolean z10, EglBase eglBase, EglBase.Context context, YuvConverter yuvConverter) {
        this(str, i10, i11, handler, z10, eglBase, context, yuvConverter, true);
    }
}
