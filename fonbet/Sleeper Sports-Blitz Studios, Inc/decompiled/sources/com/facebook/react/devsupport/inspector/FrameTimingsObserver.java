package com.facebook.react.devsupport.inspector;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Base64;
import android.view.FrameMetrics;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import io.sentry.rrweb.RRWebSpanEvent;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: FrameTimingsObserver.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001'B2\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010\u0016\u001a\u00020\nJ\u0010\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u001e\u0010\u001f\u001a\u00020\n2\u0014\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\n0\u0005H\u0002J*\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;", "", "screenshotsEnabled", "", "onFrameTimingSequence", "Lkotlin/Function1;", "Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;", "Lkotlin/ParameterName;", "name", "sequence", "", "<init>", "(ZLkotlin/jvm/functions/Function1;)V", "isSupported", "mainHandler", "Landroid/os/Handler;", "frameCounter", "", "isTracing", "currentWindow", "Landroid/view/Window;", "start", "stop", "setCurrentWindow", "window", "frameMetricsListener", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "emitFrameTiming", "beginTimestamp", "", RRWebSpanEvent.JsonKeys.END_TIMESTAMP, "captureScreenshot", "callback", "", "encodeScreenshot", "bitmap", "Landroid/graphics/Bitmap;", "width", "height", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FrameTimingsObserver {
    private static final int SCREENSHOT_QUALITY = 80;
    private static final float SCREENSHOT_SCALE_FACTOR = 0.75f;
    private volatile Window currentWindow;
    private int frameCounter;
    private final Window.OnFrameMetricsAvailableListener frameMetricsListener;
    private final boolean isSupported;
    private volatile boolean isTracing;
    private final Handler mainHandler;
    private final Function1<FrameTimingSequence, Unit> onFrameTimingSequence;
    private final boolean screenshotsEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public FrameTimingsObserver(boolean z, Function1<? super FrameTimingSequence, Unit> onFrameTimingSequence) {
        Intrinsics.checkNotNullParameter(onFrameTimingSequence, "onFrameTimingSequence");
        this.screenshotsEnabled = z;
        this.onFrameTimingSequence = onFrameTimingSequence;
        this.isSupported = true;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.frameMetricsListener = new Window.OnFrameMetricsAvailableListener() { // from class: com.facebook.react.devsupport.inspector.FrameTimingsObserver$$ExternalSyntheticLambda3
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                FrameTimingsObserver.frameMetricsListener$lambda$0(FrameTimingsObserver.this, window, frameMetrics, i);
            }
        };
    }

    public final void start() {
        if (this.isSupported) {
            this.frameCounter = 0;
            this.isTracing = true;
            long nanoTime = System.nanoTime();
            emitFrameTiming(nanoTime, nanoTime);
            Window window = this.currentWindow;
            if (window != null) {
                window.addOnFrameMetricsAvailableListener(this.frameMetricsListener, this.mainHandler);
            }
        }
    }

    public final void stop() {
        if (this.isSupported) {
            this.isTracing = false;
            Window window = this.currentWindow;
            if (window != null) {
                window.removeOnFrameMetricsAvailableListener(this.frameMetricsListener);
            }
            this.mainHandler.removeCallbacksAndMessages(null);
        }
    }

    public final void setCurrentWindow(Window window) {
        Window window2;
        if (!this.isSupported || this.currentWindow == window) {
            return;
        }
        Window window3 = this.currentWindow;
        if (window3 != null) {
            window3.removeOnFrameMetricsAvailableListener(this.frameMetricsListener);
        }
        this.currentWindow = window;
        if (!this.isTracing || (window2 = this.currentWindow) == null) {
            return;
        }
        window2.addOnFrameMetricsAvailableListener(this.frameMetricsListener, this.mainHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void frameMetricsListener$lambda$0(FrameTimingsObserver frameTimingsObserver, Window window, FrameMetrics frameMetrics, int i) {
        if (frameTimingsObserver.isTracing) {
            long metric = frameMetrics.getMetric(11);
            frameTimingsObserver.emitFrameTiming(metric, frameMetrics.getMetric(8) + metric);
        }
    }

    private final void emitFrameTiming(final long beginTimestamp, final long endTimestamp) {
        final int i = this.frameCounter;
        this.frameCounter = i + 1;
        final int myTid = Process.myTid();
        if (!this.screenshotsEnabled) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new FrameTimingsObserver$emitFrameTiming$2(this, i, myTid, beginTimestamp, endTimestamp, null), 3, null);
        } else {
            captureScreenshot(new Function1() { // from class: com.facebook.react.devsupport.inspector.FrameTimingsObserver$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit emitFrameTiming$lambda$1;
                    emitFrameTiming$lambda$1 = FrameTimingsObserver.emitFrameTiming$lambda$1(FrameTimingsObserver.this, i, myTid, beginTimestamp, endTimestamp, (String) obj);
                    return emitFrameTiming$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit emitFrameTiming$lambda$1(FrameTimingsObserver frameTimingsObserver, int i, int i2, long j, long j2, String str) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new FrameTimingsObserver$emitFrameTiming$1$1(frameTimingsObserver, i, i2, j, j2, str, null), 3, null);
        return Unit.INSTANCE;
    }

    private final void captureScreenshot(final Function1<? super String, Unit> callback) {
        if (Build.VERSION.SDK_INT < 26) {
            callback.invoke(null);
            return;
        }
        final Window window = this.currentWindow;
        if (window == null) {
            callback.invoke(null);
            return;
        }
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        final int width = decorView.getWidth();
        final int height = decorView.getHeight();
        final Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        PixelCopy.request(window, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.facebook.react.devsupport.inspector.FrameTimingsObserver$$ExternalSyntheticLambda4
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                FrameTimingsObserver.captureScreenshot$lambda$2(createBitmap, callback, this, window, width, height, i);
            }
        }, this.mainHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void captureScreenshot$lambda$2(Bitmap bitmap, Function1 function1, FrameTimingsObserver frameTimingsObserver, Window window, int i, int i2, int i3) {
        if (i3 == 0) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new FrameTimingsObserver$captureScreenshot$1$1(function1, frameTimingsObserver, window, bitmap, i, i2, null), 3, null);
        } else {
            bitmap.recycle();
            function1.invoke(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String encodeScreenshot(Window window, Bitmap bitmap, int width, int height) {
        Bitmap bitmap2;
        Bitmap bitmap3 = null;
        try {
            float f = window.getContext().getResources().getDisplayMetrics().density;
            bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) ((width / f) * 0.75f), (int) ((height / f) * 0.75f), true);
            try {
                Bitmap.CompressFormat compressFormat = Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.JPEG;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                    bitmap2.compress(compressFormat, 80, byteArrayOutputStream2);
                    String encodeToString = Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 2);
                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    bitmap.recycle();
                    return encodeToString;
                } finally {
                }
            } catch (Exception unused) {
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                bitmap.recycle();
                return null;
            } catch (Throwable th) {
                th = th;
                bitmap3 = bitmap2;
                if (bitmap3 != null) {
                    bitmap3.recycle();
                }
                bitmap.recycle();
                throw th;
            }
        } catch (Exception unused2) {
            bitmap2 = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
