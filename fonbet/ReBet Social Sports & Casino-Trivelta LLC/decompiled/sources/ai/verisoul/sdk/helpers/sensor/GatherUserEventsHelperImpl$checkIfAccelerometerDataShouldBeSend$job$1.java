package ai.verisoul.sdk.helpers.sensor;

import Ph.P;
import ai.verisoul.sdk.helpers.sensor.accelerometer.AccelerometerSensorData;
import ai.verisoul.sdk.logger.Logger;
import com.plaid.internal.EnumC3631g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
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
@DebugMetadata(c = "ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelperImpl$checkIfAccelerometerDataShouldBeSend$job$1", f = "GatherUserEventsHelperImpl.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class GatherUserEventsHelperImpl$checkIfAccelerometerDataShouldBeSend$job$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sessionId;
    int label;
    final /* synthetic */ GatherUserEventsHelperImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GatherUserEventsHelperImpl$checkIfAccelerometerDataShouldBeSend$job$1(GatherUserEventsHelperImpl gatherUserEventsHelperImpl, String str, Continuation<? super GatherUserEventsHelperImpl$checkIfAccelerometerDataShouldBeSend$job$1> continuation) {
        super(2, continuation);
        this.this$0 = gatherUserEventsHelperImpl;
        this.$sessionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GatherUserEventsHelperImpl$checkIfAccelerometerDataShouldBeSend$job$1(this.this$0, this.$sessionId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((GatherUserEventsHelperImpl$checkIfAccelerometerDataShouldBeSend$job$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0028 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        String str;
        String str2;
        ConcurrentLinkedQueue concurrentLinkedQueue;
        ConcurrentLinkedQueue concurrentLinkedQueue2;
        Object uploadData;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                ResultKt.throwOnFailure(obj);
            } catch (CancellationException e10) {
                Logger logger = Logger.INSTANCE;
                str2 = this.this$0.tag;
                logger.debug(str2, "Queue processing cancelled");
                throw e10;
            } catch (Exception e11) {
                Logger logger2 = Logger.INSTANCE;
                str = this.this$0.tag;
                logger2.error(str, "Error processing queue: " + e11.getMessage());
            }
        }
        while (!concurrentLinkedQueue.isEmpty()) {
            concurrentLinkedQueue2 = this.this$0.dataQueue;
            AccelerometerSensorData accelerometerSensorData = (AccelerometerSensorData) concurrentLinkedQueue2.poll();
            if (accelerometerSensorData != null) {
                String str3 = this.$sessionId;
                GatherUserEventsHelperImpl gatherUserEventsHelperImpl = this.this$0;
                accelerometerSensorData.setSessionId(str3);
                this.label = 1;
                uploadData = gatherUserEventsHelperImpl.uploadData(accelerometerSensorData, this);
                if (uploadData == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
