package ai.verisoul.sdk.helpers.nativeDataCollection;

import Ph.C0;
import Ph.F0;
import Ph.P;
import Wh.a;
import com.plaid.internal.EnumC3631g;
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
@DebugMetadata(c = "ai.verisoul.sdk.helpers.nativeDataCollection.DeviceDataCollectorHandlerImp$shutdown$1", f = "DeviceDataCollectorHandler.kt", i = {0, 1}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_ICON_INCOMPLETE_VALUE}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
@SourceDebugExtension({"SMAP\nDeviceDataCollectorHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceDataCollectorHandler.kt\nai/verisoul/sdk/helpers/nativeDataCollection/DeviceDataCollectorHandlerImp$shutdown$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,217:1\n120#2,10:218\n*S KotlinDebug\n*F\n+ 1 DeviceDataCollectorHandler.kt\nai/verisoul/sdk/helpers/nativeDataCollection/DeviceDataCollectorHandlerImp$shutdown$1\n*L\n208#1:218,10\n*E\n"})
/* loaded from: classes.dex */
public final class DeviceDataCollectorHandlerImp$shutdown$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DeviceDataCollectorHandlerImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceDataCollectorHandlerImp$shutdown$1(DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp, Continuation<? super DeviceDataCollectorHandlerImp$shutdown$1> continuation) {
        super(2, continuation);
        this.this$0 = deviceDataCollectorHandlerImp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DeviceDataCollectorHandlerImp$shutdown$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceDataCollectorHandlerImp$shutdown$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (r6.f(null, r5) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar;
        DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp;
        C0 c02;
        DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp2;
        a aVar2;
        Throwable th2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                aVar = this.this$0.collectionMutex;
                deviceDataCollectorHandlerImp = this.this$0;
                this.L$0 = aVar;
                this.L$1 = deviceDataCollectorHandlerImp;
                this.label = 1;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    deviceDataCollectorHandlerImp2 = (DeviceDataCollectorHandlerImp) this.L$1;
                    aVar2 = (a) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar2;
                        deviceDataCollectorHandlerImp = deviceDataCollectorHandlerImp2;
                        deviceDataCollectorHandlerImp.currentJob = null;
                        Unit unit = Unit.INSTANCE;
                        aVar.g(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar2.g(null);
                        throw th2;
                    }
                }
                deviceDataCollectorHandlerImp = (DeviceDataCollectorHandlerImp) this.L$1;
                a aVar3 = (a) this.L$0;
                ResultKt.throwOnFailure(obj);
                aVar = aVar3;
            }
            c02 = deviceDataCollectorHandlerImp.currentJob;
            if (c02 != null) {
                this.L$0 = aVar;
                this.L$1 = deviceDataCollectorHandlerImp;
                this.label = 2;
                if (F0.f(c02, this) != coroutine_suspended) {
                    deviceDataCollectorHandlerImp2 = deviceDataCollectorHandlerImp;
                    aVar2 = aVar;
                    aVar = aVar2;
                    deviceDataCollectorHandlerImp = deviceDataCollectorHandlerImp2;
                }
                return coroutine_suspended;
            }
            deviceDataCollectorHandlerImp.currentJob = null;
            Unit unit2 = Unit.INSTANCE;
            aVar.g(null);
            return Unit.INSTANCE;
        } catch (Throwable th4) {
            aVar2 = aVar;
            th2 = th4;
            aVar2.g(null);
            throw th2;
        }
    }
}
