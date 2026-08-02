package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.LifecycleEventRequestKt;
import gatewayprotocol.v1.LifecycleEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isActive", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@il4(c = "com.unity3d.ads.core.domain.events.LifecycleEventObserver$invoke$2", f = "LifecycleEventObserver.kt", l = {46, 54, 55}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class LifecycleEventObserver$invoke$2 extends hoi implements Function2<Boolean, rq3<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ LifecycleEventObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleEventObserver$invoke$2(LifecycleEventObserver lifecycleEventObserver, rq3<? super LifecycleEventObserver$invoke$2> rq3Var) {
        super(2, rq3Var);
        this.this$0 = lifecycleEventObserver;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        LifecycleEventObserver$invoke$2 lifecycleEventObserver$invoke$2 = new LifecycleEventObserver$invoke$2(this.this$0, rq3Var);
        lifecycleEventObserver$invoke$2.Z$0 = ((Boolean) obj).booleanValue();
        return lifecycleEventObserver$invoke$2;
    }

    public final Object invoke(boolean z, rq3<? super Unit> rq3Var) {
        return ((LifecycleEventObserver$invoke$2) create(Boolean.valueOf(z), rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:2)|(1:(1:(1:(3:7|8|9)(2:11|12))(5:13|14|15|16|17))(2:23|24))(5:28|(1:30)(1:36)|31|32|(2:34|19)(1:35))|25|(2:27|19)|14|15|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e2, code lost:
    
        if (com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r6, null, r8, r9, r10, r11, 1, null) != r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e5, code lost:
    
        r14 = r11.this$0.logger;
        com.unity3d.ads.core.log.Logger.DefaultImpls.trace$default(r14, "Failed to send lifecycle event, likely due to network issues. Event will be dropped.", null, 2, null);
     */
    @Override // defpackage.h21
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
        lu3 lu3Var = lu3.a;
        int i = this.label;
        try {
        } catch (UnityAdsNetworkException unused) {
            lifecycleEventObserver$invoke$2 = this;
        }
        if (i == 0) {
            y6a.M(obj);
            lifecycleEventType = this.Z$0 ? LifecycleEventRequestOuterClass.LifecycleEventType.LIFECYCLE_EVENT_TYPE_FOREGROUND : LifecycleEventRequestOuterClass.LifecycleEventType.LIFECYCLE_EVENT_TYPE_BACKGROUND;
            lifecycleEventObserver = this.this$0;
            LifecycleEventRequestKt.Dsl.Companion companion = LifecycleEventRequestKt.Dsl.INSTANCE;
            LifecycleEventRequestOuterClass.LifecycleEventRequest.Builder newBuilder = LifecycleEventRequestOuterClass.LifecycleEventRequest.newBuilder();
            newBuilder.getClass();
            _create = companion._create(newBuilder);
            deviceInfoRepository = lifecycleEventObserver.deviceInfoRepository;
            this.L$0 = lifecycleEventType;
            this.L$1 = lifecycleEventObserver;
            this.L$2 = _create;
            this.L$3 = _create;
            this.L$4 = _create;
            this.label = 1;
            obj = deviceInfoRepository.staticDeviceInfo(this);
            if (obj == lu3Var) {
                return lu3Var;
            }
            dsl = _create;
            dsl2 = dsl;
        } else if (i == 1) {
            _create = (LifecycleEventRequestKt.Dsl) this.L$4;
            dsl = (LifecycleEventRequestKt.Dsl) this.L$3;
            dsl2 = (LifecycleEventRequestKt.Dsl) this.L$2;
            lifecycleEventObserver = (LifecycleEventObserver) this.L$1;
            lifecycleEventType = (LifecycleEventRequestOuterClass.LifecycleEventType) this.L$0;
            y6a.M(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
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
        UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder2 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        newBuilder2.getClass();
        UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(newBuilder2);
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
        if (obj == lu3Var) {
            return lu3Var;
        }
        UniversalRequestOuterClass.UniversalRequest universalRequest2 = (UniversalRequestOuterClass.UniversalRequest) obj;
        gatewayClient = this.this$0.gatewayClient;
        getRequestPolicy = this.this$0.getRequestPolicy;
        RequestPolicy invoke2 = getRequestPolicy.invoke();
        OperationType operationType2 = OperationType.LIFECYCLE_EVENT;
        this.label = 3;
        lifecycleEventObserver$invoke$2 = this;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (rq3<? super Unit>) obj2);
    }
}
