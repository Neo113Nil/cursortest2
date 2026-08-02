package ai.verisoul.sdk.helpers.sensor;

import Ph.P;
import ai.verisoul.sdk.helpers.sensor.accelerometer.AccelerometerSensorData;
import com.plaid.internal.EnumC3631g;
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
@DebugMetadata(c = "ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelperImpl$uploadAccelerometerData$1", f = "GatherUserEventsHelperImpl.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class GatherUserEventsHelperImpl$uploadAccelerometerData$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ AccelerometerSensorData $sensorData;
    int label;
    final /* synthetic */ GatherUserEventsHelperImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GatherUserEventsHelperImpl$uploadAccelerometerData$1(GatherUserEventsHelperImpl gatherUserEventsHelperImpl, AccelerometerSensorData accelerometerSensorData, Continuation<? super GatherUserEventsHelperImpl$uploadAccelerometerData$1> continuation) {
        super(2, continuation);
        this.this$0 = gatherUserEventsHelperImpl;
        this.$sensorData = accelerometerSensorData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GatherUserEventsHelperImpl$uploadAccelerometerData$1(this.this$0, this.$sensorData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((GatherUserEventsHelperImpl$uploadAccelerometerData$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object uploadData;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            GatherUserEventsHelperImpl gatherUserEventsHelperImpl = this.this$0;
            AccelerometerSensorData accelerometerSensorData = this.$sensorData;
            this.label = 1;
            uploadData = gatherUserEventsHelperImpl.uploadData(accelerometerSensorData, this);
            if (uploadData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
