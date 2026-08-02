package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.LifecycleEventRequestKt;
import gatewayprotocol.v1.LifecycleEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: LifecycleEventObserver.kt */
@b6l(c = "com.unity3d.ads.core.domain.events.LifecycleEventObserver$invoke$2", f = "LifecycleEventObserver.kt", l = {46, 54, 55}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class LifecycleEventObserver$invoke$2 extends SuspendLambda implements wzs<Boolean, spj<? super s3q0>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ LifecycleEventObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleEventObserver$invoke$2(LifecycleEventObserver lifecycleEventObserver, spj<? super LifecycleEventObserver$invoke$2> spjVar) {
        super(2, spjVar);
        this.this$0 = lifecycleEventObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        LifecycleEventObserver$invoke$2 lifecycleEventObserver$invoke$2 = new LifecycleEventObserver$invoke$2(this.this$0, spjVar);
        lifecycleEventObserver$invoke$2.Z$0 = ((Boolean) obj).booleanValue();
        return lifecycleEventObserver$invoke$2;
    }

    @Override // xsna.wzs
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, spj<? super s3q0> spjVar) {
        return invoke(bool.booleanValue(), spjVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:2)|(1:(1:(1:(4:7|8|9|10)(2:12|13))(5:14|15|16|17|18))(2:24|25))(7:30|(1:32)(1:37)|33|34|(1:36)|29|20)|26|(3:28|29|20)|15|16|17|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00df, code lost:
    
        if (com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r6, null, r8, r9, r10, r11, 1, null) != r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e2, code lost:
    
        r15 = r11.this$0.logger;
        com.unity3d.ads.core.log.Logger.DefaultImpls.trace$default(r15, "Failed to send lifecycle event, likely due to network issues. Event will be dropped.", null, 2, null);
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LifecycleEventObserver$invoke$2 lifecycleEventObserver$invoke$2;
        LifecycleEventRequestOuterClass.LifecycleEventType lifecycleEventType;
        LifecycleEventObserver lifecycleEventObserver;
        LifecycleEventRequestKt.Dsl _create;
        DeviceInfoRepository deviceInfoRepository;
        LifecycleEventRequestKt.Dsl dsl;
        LifecycleEventRequestKt.Dsl dsl2;
        DeviceInfoRepository deviceInfoRepository2;
        GetByteStringId getByteStringId;
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
        GatewayClient gatewayClient;
        GetRequestPolicy getRequestPolicy;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (UnityAdsNetworkException unused) {
            lifecycleEventObserver$invoke$2 = this;
        }
        if (i == 0) {
            a.a(obj);
            lifecycleEventType = this.Z$0 ? LifecycleEventRequestOuterClass.LifecycleEventType.LIFECYCLE_EVENT_TYPE_FOREGROUND : LifecycleEventRequestOuterClass.LifecycleEventType.LIFECYCLE_EVENT_TYPE_BACKGROUND;
            lifecycleEventObserver = this.this$0;
            _create = LifecycleEventRequestKt.Dsl.Companion._create(LifecycleEventRequestOuterClass.LifecycleEventRequest.newBuilder());
            deviceInfoRepository = lifecycleEventObserver.deviceInfoRepository;
            this.L$0 = lifecycleEventType;
            this.L$1 = lifecycleEventObserver;
            this.L$2 = _create;
            this.L$3 = _create;
            this.L$4 = _create;
            this.label = 1;
            obj = deviceInfoRepository.staticDeviceInfo(this);
            if (obj != coroutineSingletons) {
                dsl = _create;
                dsl2 = dsl;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            _create = (LifecycleEventRequestKt.Dsl) this.L$4;
            dsl = (LifecycleEventRequestKt.Dsl) this.L$3;
            dsl2 = (LifecycleEventRequestKt.Dsl) this.L$2;
            lifecycleEventObserver = (LifecycleEventObserver) this.L$1;
            lifecycleEventType = (LifecycleEventRequestOuterClass.LifecycleEventType) this.L$0;
            a.a(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.a(obj);
                return s3q0.a;
            }
            a.a(obj);
            UniversalRequestOuterClass.UniversalRequest universalRequest = (UniversalRequestOuterClass.UniversalRequest) obj;
            gatewayClient = this.this$0.gatewayClient;
            getRequestPolicy = this.this$0.getRequestPolicy;
            RequestPolicy invoke = getRequestPolicy.invoke();
            OperationType operationType = OperationType.LIFECYCLE_EVENT;
            this.label = 3;
            lifecycleEventObserver$invoke$2 = this;
        }
        _create.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
        deviceInfoRepository2 = lifecycleEventObserver.deviceInfoRepository;
        dsl.setDynamicDeviceInfo(deviceInfoRepository2.getDynamicDeviceInfo());
        dsl.setLifecycleEventType(lifecycleEventType);
        getByteStringId = lifecycleEventObserver.getByteStringId;
        dsl.setEventId(getByteStringId.invoke());
        LifecycleEventRequestOuterClass.LifecycleEventRequest _build = dsl2._build();
        UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl _create2 = UniversalRequestKt.PayloadKt.Dsl.Companion._create(UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder());
        _create2.setLifecycleEventRequest(_build);
        UniversalRequestOuterClass.UniversalRequest.Payload _build2 = _create2._build();
        getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
        obj = getUniversalRequestForPayLoad.invoke(_build2, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        UniversalRequestOuterClass.UniversalRequest universalRequest2 = (UniversalRequestOuterClass.UniversalRequest) obj;
        gatewayClient = this.this$0.gatewayClient;
        getRequestPolicy = this.this$0.getRequestPolicy;
        RequestPolicy invoke2 = getRequestPolicy.invoke();
        OperationType operationType2 = OperationType.LIFECYCLE_EVENT;
        this.label = 3;
        lifecycleEventObserver$invoke$2 = this;
    }

    public final Object invoke(boolean z, spj<? super s3q0> spjVar) {
        return ((LifecycleEventObserver$invoke$2) create(Boolean.valueOf(z), spjVar)).invokeSuspend(s3q0.a);
    }
}
