package ai.verisoul.sdk.helpers.sensor;

import Ph.AbstractC1440a0;
import Ph.P;
import Ph.Q;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelperImpl$beginSession$1", f = "GatherUserEventsHelperImpl.kt", i = {0}, l = {65}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class GatherUserEventsHelperImpl$beginSession$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sessionId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GatherUserEventsHelperImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GatherUserEventsHelperImpl$beginSession$1(GatherUserEventsHelperImpl gatherUserEventsHelperImpl, String str, Continuation<? super GatherUserEventsHelperImpl$beginSession$1> continuation) {
        super(2, continuation);
        this.this$0 = gatherUserEventsHelperImpl;
        this.$sessionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        GatherUserEventsHelperImpl$beginSession$1 gatherUserEventsHelperImpl$beginSession$1 = new GatherUserEventsHelperImpl$beginSession$1(this.this$0, this.$sessionId, continuation);
        gatherUserEventsHelperImpl$beginSession$1.L$0 = obj;
        return gatherUserEventsHelperImpl$beginSession$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((GatherUserEventsHelperImpl$beginSession$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        P p10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            p10 = (P) this.L$0;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p10 = (P) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (Q.i(p10)) {
            this.this$0.checkIfAccelerometerDataShouldBeSend(this.$sessionId);
            this.L$0 = p10;
            this.label = 1;
            if (AbstractC1440a0.a(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
