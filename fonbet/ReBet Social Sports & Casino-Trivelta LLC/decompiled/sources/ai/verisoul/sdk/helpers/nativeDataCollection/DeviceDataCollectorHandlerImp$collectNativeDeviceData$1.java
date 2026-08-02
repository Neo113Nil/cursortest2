package ai.verisoul.sdk.helpers.nativeDataCollection;

import Ph.AbstractC1459k;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.helpers.nativeDataCollection.DeviceDataCollectorHandlerImp$collectNativeDeviceData$1", f = "DeviceDataCollectorHandler.kt", i = {0, 0, 1, 1, 2, 2}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 72, EnumC3631g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, m = "invokeSuspend", n = {"$this$launch", "$this$withLock_u24default$iv", "$this$launch", "$this$withLock_u24default$iv", "newJob", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nDeviceDataCollectorHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceDataCollectorHandler.kt\nai/verisoul/sdk/helpers/nativeDataCollection/DeviceDataCollectorHandlerImp$collectNativeDeviceData$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,217:1\n120#2,10:218\n120#2,10:228\n*S KotlinDebug\n*F\n+ 1 DeviceDataCollectorHandler.kt\nai/verisoul/sdk/helpers/nativeDataCollection/DeviceDataCollectorHandlerImp$collectNativeDeviceData$1\n*L\n71#1:218,10\n162#1:228,10\n*E\n"})
/* loaded from: classes.dex */
public final class DeviceDataCollectorHandlerImp$collectNativeDeviceData$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Exception, Unit> $onFailure;
    final /* synthetic */ Function0<Unit> $onSuccess;
    final /* synthetic */ String $projectId;
    final /* synthetic */ String $sessionId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DeviceDataCollectorHandlerImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeviceDataCollectorHandlerImp$collectNativeDeviceData$1(DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp, String str, String str2, Function1<? super Exception, Unit> function1, Function0<Unit> function0, Continuation<? super DeviceDataCollectorHandlerImp$collectNativeDeviceData$1> continuation) {
        super(2, continuation);
        this.this$0 = deviceDataCollectorHandlerImp;
        this.$sessionId = str;
        this.$projectId = str2;
        this.$onFailure = function1;
        this.$onSuccess = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DeviceDataCollectorHandlerImp$collectNativeDeviceData$1 deviceDataCollectorHandlerImp$collectNativeDeviceData$1 = new DeviceDataCollectorHandlerImp$collectNativeDeviceData$1(this.this$0, this.$sessionId, this.$projectId, this.$onFailure, this.$onSuccess, continuation);
        deviceDataCollectorHandlerImp$collectNativeDeviceData$1.L$0 = obj;
        return deviceDataCollectorHandlerImp$collectNativeDeviceData$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceDataCollectorHandlerImp$collectNativeDeviceData$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        P p10;
        a aVar;
        a aVar2;
        DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp;
        Throwable th2;
        a aVar3;
        C0 c02;
        P p11;
        P p12;
        a aVar4;
        C0 d10;
        C0 c03;
        DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                p10 = (P) this.L$0;
                aVar = this.this$0.collectionMutex;
                DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp3 = this.this$0;
                this.L$0 = p10;
                this.L$1 = aVar;
                this.L$2 = deviceDataCollectorHandlerImp3;
                this.label = 1;
                if (aVar.f(null, this) != coroutine_suspended) {
                    aVar2 = aVar;
                    deviceDataCollectorHandlerImp = deviceDataCollectorHandlerImp3;
                }
                return coroutine_suspended;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    deviceDataCollectorHandlerImp2 = (DeviceDataCollectorHandlerImp) this.L$2;
                    aVar4 = (a) this.L$1;
                    c03 = (C0) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    try {
                        deviceDataCollectorHandlerImp2.currentJob = c03;
                        Unit unit = Unit.INSTANCE;
                        aVar4.g(null);
                        return Unit.INSTANCE;
                    } finally {
                        aVar4.g(null);
                    }
                }
                aVar3 = (a) this.L$1;
                p12 = (P) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    Unit unit2 = Unit.INSTANCE;
                    aVar2 = aVar3;
                    p11 = p12;
                    aVar2.g(null);
                    d10 = AbstractC1459k.d(p11, null, null, new DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1(this.this$0, this.$sessionId, this.$projectId, this.$onFailure, this.$onSuccess, null), 3, null);
                    aVar4 = this.this$0.collectionMutex;
                    DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp4 = this.this$0;
                    this.L$0 = d10;
                    this.L$1 = aVar4;
                    this.L$2 = deviceDataCollectorHandlerImp4;
                    this.label = 3;
                    if (aVar4.f(null, this) != coroutine_suspended) {
                        c03 = d10;
                        deviceDataCollectorHandlerImp2 = deviceDataCollectorHandlerImp4;
                        deviceDataCollectorHandlerImp2.currentJob = c03;
                        Unit unit3 = Unit.INSTANCE;
                        aVar4.g(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            }
            deviceDataCollectorHandlerImp = (DeviceDataCollectorHandlerImp) this.L$2;
            aVar2 = (a) this.L$1;
            P p13 = (P) this.L$0;
            ResultKt.throwOnFailure(obj);
            p10 = p13;
            c02 = deviceDataCollectorHandlerImp.currentJob;
            if (c02 == null) {
                p11 = p10;
                aVar2.g(null);
                d10 = AbstractC1459k.d(p11, null, null, new DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1(this.this$0, this.$sessionId, this.$projectId, this.$onFailure, this.$onSuccess, null), 3, null);
                aVar4 = this.this$0.collectionMutex;
                DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp42 = this.this$0;
                this.L$0 = d10;
                this.L$1 = aVar4;
                this.L$2 = deviceDataCollectorHandlerImp42;
                this.label = 3;
                if (aVar4.f(null, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            this.L$0 = p10;
            this.L$1 = aVar2;
            this.L$2 = null;
            this.label = 2;
            if (F0.f(c02, this) != coroutine_suspended) {
                p12 = p10;
                aVar3 = aVar2;
                Unit unit22 = Unit.INSTANCE;
                aVar2 = aVar3;
                p11 = p12;
                aVar2.g(null);
                d10 = AbstractC1459k.d(p11, null, null, new DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1(this.this$0, this.$sessionId, this.$projectId, this.$onFailure, this.$onSuccess, null), 3, null);
                aVar4 = this.this$0.collectionMutex;
                DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp422 = this.this$0;
                this.L$0 = d10;
                this.L$1 = aVar4;
                this.L$2 = deviceDataCollectorHandlerImp422;
                this.label = 3;
                if (aVar4.f(null, this) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        } catch (Throwable th4) {
            th2 = th4;
            aVar3 = aVar2;
            throw th2;
        }
    }
}
