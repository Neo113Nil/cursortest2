package com.facebook.react.devsupport.inspector;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.P;
import Ph.Q;
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
import com.facebook.react.uimanager.ViewProps;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B:\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0082@¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\fJ\u0006\u0010\u001b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;", "", "window", "Landroid/view/Window;", "screenshotsEnabled", "", "onFrameTimingSequence", "Lkotlin/Function1;", "Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;", "Lkotlin/ParameterName;", "name", "sequence", "", "<init>", "(Landroid/view/Window;ZLkotlin/jvm/functions/Function1;)V", "handler", "Landroid/os/Handler;", "frameCounter", "", "bitmapBuffer", "Landroid/graphics/Bitmap;", "frameMetricsListener", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "captureScreenshot", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ViewProps.START, "stop", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFrameTimingsObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameTimingsObserver.kt\ncom/facebook/react/devsupport/inspector/FrameTimingsObserver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n1#2:146\n*E\n"})
/* loaded from: classes2.dex */
public final class FrameTimingsObserver {

    @Nullable
    private Bitmap bitmapBuffer;
    private int frameCounter;

    @NotNull
    private final Window.OnFrameMetricsAvailableListener frameMetricsListener;

    @NotNull
    private final Handler handler;

    @NotNull
    private final Function1<FrameTimingSequence, Unit> onFrameTimingSequence;
    private final boolean screenshotsEnabled;

    @NotNull
    private final Window window;

    /* JADX WARN: Multi-variable type inference failed */
    public FrameTimingsObserver(@NotNull Window window, boolean z10, @NotNull Function1<? super FrameTimingSequence, Unit> onFrameTimingSequence) {
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(onFrameTimingSequence, "onFrameTimingSequence");
        this.window = window;
        this.screenshotsEnabled = z10;
        this.onFrameTimingSequence = onFrameTimingSequence;
        this.handler = new Handler(Looper.getMainLooper());
        this.frameMetricsListener = new Window.OnFrameMetricsAvailableListener() { // from class: com.facebook.react.devsupport.inspector.b
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window2, FrameMetrics frameMetrics, int i10) {
                FrameTimingsObserver.frameMetricsListener$lambda$0(FrameTimingsObserver.this, window2, frameMetrics, i10);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r3 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object captureScreenshot(Continuation<? super String> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT < 26) {
            safeContinuation.resumeWith(Result.m147constructorimpl(null));
        } else {
            View decorView = this.window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            final int width = decorView.getWidth();
            final int height = decorView.getHeight();
            Bitmap bitmap2 = this.bitmapBuffer;
            if (bitmap2 != null) {
                if (bitmap2.getWidth() == width && bitmap2.getHeight() == height) {
                    bitmap = bitmap2;
                }
            }
            bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.bitmapBuffer = bitmap;
            Intrinsics.checkNotNullExpressionValue(bitmap, "also(...)");
            PixelCopy.request(this.window, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.facebook.react.devsupport.inspector.FrameTimingsObserver$captureScreenshot$2$1

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.facebook.react.devsupport.inspector.FrameTimingsObserver$captureScreenshot$2$1$1", f = "FrameTimingsObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.facebook.react.devsupport.inspector.FrameTimingsObserver$captureScreenshot$2$1$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Bitmap $bitmap;
                    final /* synthetic */ Continuation<String> $continuation;
                    final /* synthetic */ int $height;
                    final /* synthetic */ int $width;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(int i10, int i11, Bitmap bitmap, Continuation<? super String> continuation, Continuation<? super AnonymousClass1> continuation2) {
                        super(2, continuation2);
                        this.$width = i10;
                        this.$height = i11;
                        this.$bitmap = bitmap;
                        this.$continuation = continuation;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.$width, this.$height, this.$bitmap, this.$continuation, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(P p10, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        try {
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.$bitmap, (int) (this.$width * 0.25f), (int) (this.$height * 0.25f), true);
                            Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            createScaledBitmap.compress(Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.WEBP, 0, byteArrayOutputStream);
                            this.$continuation.resumeWith(Result.m147constructorimpl(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
                            createScaledBitmap.recycle();
                        } catch (Exception unused) {
                            this.$continuation.resumeWith(Result.m147constructorimpl(null));
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i10) {
                    if (i10 == 0) {
                        AbstractC1459k.d(Q.a(C1452g0.a()), null, null, new AnonymousClass1(width, height, bitmap, safeContinuation, null), 3, null);
                    } else {
                        safeContinuation.resumeWith(Result.m147constructorimpl(null));
                    }
                }
            }, this.handler);
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void frameMetricsListener$lambda$0(FrameTimingsObserver frameTimingsObserver, Window window, FrameMetrics frameMetrics, int i10) {
        long metric = frameMetrics.getMetric(11);
        long metric2 = metric + frameMetrics.getMetric(1);
        frameMetrics.getMetric(2);
        frameMetrics.getMetric(3);
        frameMetrics.getMetric(4);
        frameMetrics.getMetric(5);
        long metric3 = metric + frameMetrics.getMetric(8);
        int i11 = frameTimingsObserver.frameCounter;
        frameTimingsObserver.frameCounter = i11 + 1;
        AbstractC1459k.d(Q.a(C1452g0.a()), null, null, new FrameTimingsObserver$frameMetricsListener$1$1(frameTimingsObserver, i11, Process.myTid(), metric, metric2, metric3, null), 3, null);
    }

    public final void start() {
        this.frameCounter = 0;
        this.window.addOnFrameMetricsAvailableListener(this.frameMetricsListener, this.handler);
    }

    public final void stop() {
        this.window.removeOnFrameMetricsAvailableListener(this.frameMetricsListener);
        this.handler.removeCallbacksAndMessages(null);
        Bitmap bitmap = this.bitmapBuffer;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.bitmapBuffer = null;
    }
}
