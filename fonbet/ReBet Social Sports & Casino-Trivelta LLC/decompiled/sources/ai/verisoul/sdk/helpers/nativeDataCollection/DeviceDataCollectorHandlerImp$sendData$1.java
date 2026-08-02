package ai.verisoul.sdk.helpers.nativeDataCollection;

import com.plaid.internal.EnumC3631g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ai.verisoul.sdk.helpers.nativeDataCollection.DeviceDataCollectorHandlerImp", f = "DeviceDataCollectorHandler.kt", i = {0, 0, 0, 0}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE}, m = "sendData", n = {"this", "onFailure", "onSuccess", "startTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
/* loaded from: classes.dex */
public final class DeviceDataCollectorHandlerImp$sendData$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeviceDataCollectorHandlerImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceDataCollectorHandlerImp$sendData$1(DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp, Continuation<? super DeviceDataCollectorHandlerImp$sendData$1> continuation) {
        super(continuation);
        this.this$0 = deviceDataCollectorHandlerImp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object sendData;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendData = this.this$0.sendData(null, null, null, null, this);
        return sendData;
    }
}
