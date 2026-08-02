package com.facebook.react.devsupport.inspector;

import android.graphics.Bitmap;
import android.view.Window;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FrameTimingsObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.facebook.react.devsupport.inspector.FrameTimingsObserver$captureScreenshot$1$1", f = "FrameTimingsObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class FrameTimingsObserver$captureScreenshot$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ Function1<String, Unit> $callback;
    final /* synthetic */ int $height;
    final /* synthetic */ int $width;
    final /* synthetic */ Window $window;
    int label;
    final /* synthetic */ FrameTimingsObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FrameTimingsObserver$captureScreenshot$1$1(Function1<? super String, Unit> function1, FrameTimingsObserver frameTimingsObserver, Window window, Bitmap bitmap, int i, int i2, Continuation<? super FrameTimingsObserver$captureScreenshot$1$1> continuation) {
        super(2, continuation);
        this.$callback = function1;
        this.this$0 = frameTimingsObserver;
        this.$window = window;
        this.$bitmap = bitmap;
        this.$width = i;
        this.$height = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FrameTimingsObserver$captureScreenshot$1$1(this.$callback, this.this$0, this.$window, this.$bitmap, this.$width, this.$height, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FrameTimingsObserver$captureScreenshot$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String encodeScreenshot;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Function1<String, Unit> function1 = this.$callback;
        encodeScreenshot = this.this$0.encodeScreenshot(this.$window, this.$bitmap, this.$width, this.$height);
        function1.invoke(encodeScreenshot);
        return Unit.INSTANCE;
    }
}
