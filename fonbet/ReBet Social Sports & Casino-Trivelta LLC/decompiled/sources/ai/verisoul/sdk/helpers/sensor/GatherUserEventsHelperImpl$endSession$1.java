package ai.verisoul.sdk.helpers.sensor;

import Ph.C0;
import Ph.F0;
import Ph.P;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelperImpl$endSession$1", f = "GatherUserEventsHelperImpl.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nGatherUserEventsHelperImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GatherUserEventsHelperImpl.kt\nai/verisoul/sdk/helpers/sensor/GatherUserEventsHelperImpl$endSession$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,343:1\n1855#2,2:344\n*S KotlinDebug\n*F\n+ 1 GatherUserEventsHelperImpl.kt\nai/verisoul/sdk/helpers/sensor/GatherUserEventsHelperImpl$endSession$1\n*L\n76#1:344,2\n*E\n"})
/* loaded from: classes.dex */
public final class GatherUserEventsHelperImpl$endSession$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ GatherUserEventsHelperImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GatherUserEventsHelperImpl$endSession$1(GatherUserEventsHelperImpl gatherUserEventsHelperImpl, Continuation<? super GatherUserEventsHelperImpl$endSession$1> continuation) {
        super(2, continuation);
        this.this$0 = gatherUserEventsHelperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GatherUserEventsHelperImpl$endSession$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((GatherUserEventsHelperImpl$endSession$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C0 c02;
        List list;
        List list2;
        List list3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            c02 = this.this$0.sensorJob;
            if (c02 != null) {
                this.label = 1;
                if (F0.f(c02, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.sensorJob = null;
        list = this.this$0.uploadJobs;
        GatherUserEventsHelperImpl gatherUserEventsHelperImpl = this.this$0;
        synchronized (list) {
            try {
                list2 = gatherUserEventsHelperImpl.uploadJobs;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    C0.a.b((C0) it.next(), null, 1, null);
                }
                list3 = gatherUserEventsHelperImpl.uploadJobs;
                list3.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return Unit.INSTANCE;
    }
}
