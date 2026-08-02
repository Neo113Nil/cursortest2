package ai.verisoul.sdk.helpers.sensor;

import Ph.AbstractC1440a0;
import Ph.P;
import ai.verisoul.sdk.helpers.sensor.accelerometer.AccelerometerData;
import ai.verisoul.sdk.helpers.sensor.accelerometer.AccelerometerHelper;
import ai.verisoul.sdk.helpers.sensor.accelerometer.MotionEventData;
import ai.verisoul.sdk.logger.Logger;
import com.plaid.internal.EnumC3631g;
import java.util.List;
import java.util.concurrent.CancellationException;
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
@DebugMetadata(c = "ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelperImpl$gatherData$job$1", f = "GatherUserEventsHelperImpl.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class GatherUserEventsHelperImpl$gatherData$job$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ MotionEventData $motionEventData;
    final /* synthetic */ List<AccelerometerData> $preTouchData;
    final /* synthetic */ int $sampleNumber;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ long $startGatheringDataTimestamp;
    final /* synthetic */ long $touchTimestamp;
    int label;
    final /* synthetic */ GatherUserEventsHelperImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GatherUserEventsHelperImpl$gatherData$job$1(GatherUserEventsHelperImpl gatherUserEventsHelperImpl, List<AccelerometerData> list, long j10, MotionEventData motionEventData, String str, int i10, long j11, Continuation<? super GatherUserEventsHelperImpl$gatherData$job$1> continuation) {
        super(2, continuation);
        this.this$0 = gatherUserEventsHelperImpl;
        this.$preTouchData = list;
        this.$touchTimestamp = j10;
        this.$motionEventData = motionEventData;
        this.$sessionId = str;
        this.$sampleNumber = i10;
        this.$startGatheringDataTimestamp = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GatherUserEventsHelperImpl$gatherData$job$1(this.this$0, this.$preTouchData, this.$touchTimestamp, this.$motionEventData, this.$sessionId, this.$sampleNumber, this.$startGatheringDataTimestamp, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((GatherUserEventsHelperImpl$gatherData$job$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String str;
        String str2;
        long j10;
        AccelerometerHelper accelerometerHelper;
        List combinePreAndPostData;
        String str3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                j10 = this.this$0.oneSecond;
                this.label = 1;
                if (AbstractC1440a0.a(j10, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            accelerometerHelper = this.this$0.getAccelerometerHelper();
            combinePreAndPostData = this.this$0.combinePreAndPostData(this.$preTouchData, accelerometerHelper.getCurrentBufferSnapshot(), this.$touchTimestamp);
            GatherUserEventsHelperImpl gatherUserEventsHelperImpl = this.this$0;
            MotionEventData motionEventData = this.$motionEventData;
            String str4 = this.$sessionId;
            str3 = gatherUserEventsHelperImpl.projectId;
            gatherUserEventsHelperImpl.uploadAccelerometerData(combinePreAndPostData, motionEventData, str4, str3, this.$sampleNumber, this.$startGatheringDataTimestamp);
        } catch (CancellationException e10) {
            Logger logger = Logger.INSTANCE;
            str2 = this.this$0.tag;
            logger.debug(str2, "Data gathering cancelled");
            throw e10;
        } catch (Exception e11) {
            Logger logger2 = Logger.INSTANCE;
            str = this.this$0.tag;
            logger2.error(str, "Error gathering data: " + e11.getMessage());
        }
        return Unit.INSTANCE;
    }
}
