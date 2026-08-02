package com.facebook.react.devsupport.inspector;

import Ph.P;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "com.facebook.react.devsupport.inspector.FrameTimingsObserver$frameMetricsListener$1$1", f = "FrameTimingsObserver.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class FrameTimingsObserver$frameMetricsListener$1$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $beginDrawingTimestamp;
    final /* synthetic */ long $commitTimestamp;
    final /* synthetic */ long $endDrawingTimestamp;
    final /* synthetic */ int $frameId;
    final /* synthetic */ int $threadId;
    int label;
    final /* synthetic */ FrameTimingsObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameTimingsObserver$frameMetricsListener$1$1(FrameTimingsObserver frameTimingsObserver, int i10, int i11, long j10, long j11, long j12, Continuation<? super FrameTimingsObserver$frameMetricsListener$1$1> continuation) {
        super(2, continuation);
        this.this$0 = frameTimingsObserver;
        this.$frameId = i10;
        this.$threadId = i11;
        this.$beginDrawingTimestamp = j10;
        this.$commitTimestamp = j11;
        this.$endDrawingTimestamp = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FrameTimingsObserver$frameMetricsListener$1$1(this.this$0, this.$frameId, this.$threadId, this.$beginDrawingTimestamp, this.$commitTimestamp, this.$endDrawingTimestamp, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(P p10, Continuation<? super Unit> continuation) {
        return ((FrameTimingsObserver$frameMetricsListener$1$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        String str;
        Function1 function1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            z10 = this.this$0.screenshotsEnabled;
            if (!z10) {
                str = null;
                String str2 = str;
                function1 = this.this$0.onFrameTimingSequence;
                function1.invoke(new FrameTimingSequence(this.$frameId, this.$threadId, this.$beginDrawingTimestamp, this.$commitTimestamp, this.$endDrawingTimestamp, str2));
                return Unit.INSTANCE;
            }
            FrameTimingsObserver frameTimingsObserver = this.this$0;
            this.label = 1;
            obj = frameTimingsObserver.captureScreenshot(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        str = (String) obj;
        String str22 = str;
        function1 = this.this$0.onFrameTimingSequence;
        function1.invoke(new FrameTimingSequence(this.$frameId, this.$threadId, this.$beginDrawingTimestamp, this.$commitTimestamp, this.$endDrawingTimestamp, str22));
        return Unit.INSTANCE;
    }
}
