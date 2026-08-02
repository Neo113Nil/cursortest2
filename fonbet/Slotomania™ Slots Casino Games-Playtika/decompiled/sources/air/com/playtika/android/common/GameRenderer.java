package air.com.playtika.android.common;

import air.com.playtika.android.common.GameRenderer;
import air.com.playtika.android.common.gles.EglCore;
import air.com.playtika.android.common.gles.WindowSurface;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.exoplayer2.C;
import java.util.Objects;

/* loaded from: classes5.dex */
public class GameRenderer extends Thread implements Choreographer.FrameCallback {
    private static final String TAG = "GameRenderer";
    private long frameCount;
    private long frameTime;
    private long lastFrameTimeNanos;
    private EglCore mEglCore;
    private volatile RenderHandler mHandler;
    private final SurfaceHolder mSurfaceHolder;
    private WindowSurface mWindowSurface;
    private UiAnrWatcher uiAnrWatcher;
    private final Object mStartLock = new Object();
    private boolean mReady = false;

    public static class RenderHandler extends Handler {
        private final GameRenderer renderThread;

        public RenderHandler(Looper looper, GameRenderer gameRenderer) {
            super(looper);
            this.renderThread = gameRenderer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$sendSurfaceCreated$0(int i, int i2, SharedSdkContext sharedSdkContext, InitOptions initOptions) {
            this.renderThread.surfaceCreated(i, i2, sharedSdkContext, initOptions);
        }

        public void sendSurfaceCreated(final int i, final int i2, final SharedSdkContext sharedSdkContext, final InitOptions initOptions) {
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    GameRenderer.RenderHandler.this.lambda$sendSurfaceCreated$0(i, i2, sharedSdkContext, initOptions);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$sendSurfaceChanged$1(int i, int i2) {
            this.renderThread.surfaceChanged(i, i2);
        }

        public void sendSurfaceChanged(final int i, final int i2) {
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    GameRenderer.RenderHandler.this.lambda$sendSurfaceChanged$1(i, i2);
                }
            });
        }

        public void sendSurfaceDestroyed() {
            final GameRenderer gameRenderer = this.renderThread;
            Objects.requireNonNull(gameRenderer);
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    GameRenderer.this.surfaceDestroyed();
                }
            });
        }

        public void sendDoPause() {
            final GameRenderer gameRenderer = this.renderThread;
            Objects.requireNonNull(gameRenderer);
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    GameRenderer.this.doPause();
                }
            });
        }

        public void sendDoResume() {
            final GameRenderer gameRenderer = this.renderThread;
            Objects.requireNonNull(gameRenderer);
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    GameRenderer.this.doResume();
                }
            });
        }

        public void sendShutdown() {
            final GameRenderer gameRenderer = this.renderThread;
            Objects.requireNonNull(gameRenderer);
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    GameRenderer.this.shutdown();
                }
            });
        }

        public void sendActionDown(final float f, final float f2) {
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    SharedSdkContext.nativeTouchBegin(f, f2);
                }
            });
        }

        public void sendActionUp(final float f, final float f2) {
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    SharedSdkContext.nativeTouchEnd(f, f2);
                }
            });
        }

        public void sendActionMove(final float f, final float f2) {
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    SharedSdkContext.nativeTouchMove(f, f2);
                }
            });
        }

        public void sendBackPressed() {
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    SharedSdkContext.nativeBackPressed();
                }
            });
        }

        public void sendLowMemory() {
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    SharedSdkContext.nativeLowMemory();
                }
            });
        }

        public void sendExecuteScript(final String str, final boolean z) {
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    SharedSdkContext.nativeExecuteScript(str, z);
                }
            });
        }

        public void sendIntent(final String str) {
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    SharedSdkContext.nativeHandleIntent(str);
                }
            });
        }

        public void sendReloadApp(final SharedSdkContext sharedSdkContext) {
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    SharedSdkContext.nativeReloadApp(SharedSdkContext.this);
                }
            });
        }

        public void sendKeyDown(final int i) {
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda21
                @Override // java.lang.Runnable
                public final void run() {
                    SharedSdkContext.nativeKeyDown(i);
                }
            });
        }

        public void sendKeyUp(final int i) {
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    SharedSdkContext.nativeKeyUp(i);
                }
            });
        }

        public void sendTextInput(final String str) {
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    SharedSdkContext.nativeTextInput(str);
                }
            });
        }

        public void sendKeyboardVisibilityChanged(final int i) {
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    SharedSdkContext.nativeKeyboardVisibilityChanged(i);
                }
            });
        }

        public void sendSetDefaultAudioStreamValues(final int i, final int i2) {
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    SharedSdkContext.nativeSetDefaultAudioStreamValues(i, i2);
                }
            });
        }

        public void sendDebugConfigReady(final String str) {
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    SharedSdkContext.nativeDebugConfigReady(str);
                }
            });
        }

        public void handleSetFps(final int i) {
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    SharedSdkContext.nativeSetFps(i);
                }
            });
        }

        public void handleSafeInsets(final int i, final int i2, final int i3, final int i4) {
            post(new Runnable() { // from class: air.com.playtika.android.common.GameRenderer$RenderHandler$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    SharedSdkContext.nativeSetSafeInsets(i, i2, i3, i4);
                }
            });
        }
    }

    public GameRenderer(SurfaceHolder surfaceHolder, Context context) {
        this.mSurfaceHolder = surfaceHolder;
        this.uiAnrWatcher = new UiAnrWatcher(context);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.mHandler = new RenderHandler(Looper.myLooper(), this);
        synchronized (this.mStartLock) {
            this.mReady = true;
            this.mStartLock.notify();
        }
        Looper.loop();
        Log.d(TAG, "looper quit");
        synchronized (this.mStartLock) {
            this.mReady = false;
        }
    }

    public void waitUntilReady() {
        synchronized (this.mStartLock) {
            while (!this.mReady) {
                try {
                    this.mStartLock.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shutdown() {
        Log.d(TAG, "shutdown");
        EglCore eglCore = this.mEglCore;
        if (eglCore != null) {
            eglCore.release();
            this.mEglCore = null;
        }
        UiAnrWatcher uiAnrWatcher = this.uiAnrWatcher;
        if (uiAnrWatcher != null) {
            uiAnrWatcher.shutdown();
            this.uiAnrWatcher = null;
        }
        Looper.myLooper().quit();
    }

    public RenderHandler getHandler() {
        return this.mHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void surfaceCreated(int i, int i2, SharedSdkContext sharedSdkContext, InitOptions initOptions) {
        Surface surface = this.mSurfaceHolder.getSurface();
        if (CommonHelper.surfaceCreated.get() && surface.isValid()) {
            Log.d(TAG, "prepareGl");
            if (this.mEglCore == null) {
                this.mEglCore = new EglCore();
            }
            WindowSurface windowSurface = new WindowSurface(this.mEglCore);
            this.mWindowSurface = windowSurface;
            boolean makeCurrent = windowSurface.makeCurrent(surface);
            SharedSdkContext.nativeInitApp(sharedSdkContext, sharedSdkContext.getActivity().getAssets(), initOptions.filesPath, initOptions.cachePath, initOptions.userAgent, initOptions.platform, initOptions.apiLevel);
            if (makeCurrent) {
                return;
            }
            SharedSdkContext.nativeOnSurfaceCreated(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void surfaceChanged(int i, int i2) {
        Surface surface = this.mSurfaceHolder.getSurface();
        if (CommonHelper.surfaceReady.get() && surface.isValid()) {
            Log.d(TAG, "surfaceChanged " + i + "x" + i2);
            SharedSdkContext.nativeOnSurfaceChanged(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doPause() {
        Log.d(TAG, "onPause unhooking choreographer");
        Choreographer.getInstance().removeFrameCallback(this);
        this.uiAnrWatcher.stop();
        SharedSdkContext.nativeOnPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doResume() {
        Log.d(TAG, "onResume re-hooking choreographer");
        this.lastFrameTimeNanos = 0L;
        Choreographer.getInstance().postFrameCallback(this);
        this.uiAnrWatcher.start();
        SharedSdkContext.nativeOnResume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void surfaceDestroyed() {
        Log.d(TAG, "surfaceDestroyed");
        WindowSurface windowSurface = this.mWindowSurface;
        if (windowSurface != null) {
            windowSurface.release();
            this.mWindowSurface = null;
        }
        EglCore eglCore = this.mEglCore;
        if (eglCore != null) {
            eglCore.makeNothingCurrent();
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        long j2 = this.lastFrameTimeNanos;
        if (j2 > 0 && j > j2) {
            long j3 = this.frameTime + (j - j2);
            this.frameTime = j3;
            long j4 = this.frameCount + 1;
            this.frameCount = j4;
            if (j4 >= 10) {
                int max = Math.max((int) (C.NANOS_PER_SECOND / (j3 / j4)), 20);
                this.frameCount = 0L;
                this.frameTime = 0L;
                getHandler().handleSetFps(max);
            }
        }
        this.lastFrameTimeNanos = j;
        if (CommonHelper.paused.get()) {
            return;
        }
        Choreographer.getInstance().postFrameCallback(this);
        WindowSurface windowSurface = this.mWindowSurface;
        if (windowSurface == null || this.mEglCore == null || !windowSurface.isValid() || !CommonHelper.surfaceReady.get()) {
            return;
        }
        SharedSdkContext.nativeRender();
        this.mWindowSurface.swapBuffers();
    }
}
