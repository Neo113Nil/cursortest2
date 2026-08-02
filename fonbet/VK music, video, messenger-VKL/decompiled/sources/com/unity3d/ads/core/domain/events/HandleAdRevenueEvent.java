package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.AdRevenueData;
import com.unity3d.ads.core.data.model.AdRevenueOrigin;
import com.unity3d.ads.core.data.repository.AdRevenueRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import gatewayprotocol.v1.AdRevenueEventRequestKt;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.s3q0;
import xsna.sh50;
import xsna.spj;

/* compiled from: HandleAdRevenueEvent.kt */
/* loaded from: classes14.dex */
public final class HandleAdRevenueEvent {
    private final AdRevenueRepository adRevenueRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetAdRevenueEventData getAdRevenueEventData;

    public HandleAdRevenueEvent(AdRevenueRepository adRevenueRepository, DeviceInfoRepository deviceInfoRepository, GetAdRevenueEventData getAdRevenueEventData) {
        this.adRevenueRepository = adRevenueRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getAdRevenueEventData = getAdRevenueEventData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b9, code lost:
    
        if (r9.emit(r8, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(AdRevenueData adRevenueData, ClientInfoOuterClass.MediationProvider mediationProvider, AdRevenueOrigin adRevenueOrigin, spj<? super s3q0> spjVar) {
        HandleAdRevenueEvent$invoke$1 handleAdRevenueEvent$invoke$1;
        int i;
        AdRevenueEventRequestKt.Dsl _create;
        Object staticDeviceInfo;
        AdRevenueData adRevenueData2;
        ClientInfoOuterClass.MediationProvider mediationProvider2;
        AdRevenueEventRequestKt.Dsl dsl;
        AdRevenueEventRequestKt.Dsl dsl2;
        AdRevenueEventRequestOuterClass.AdRevenueOrigin proto;
        if (spjVar instanceof HandleAdRevenueEvent$invoke$1) {
            handleAdRevenueEvent$invoke$1 = (HandleAdRevenueEvent$invoke$1) spjVar;
            int i2 = handleAdRevenueEvent$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                handleAdRevenueEvent$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = handleAdRevenueEvent$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = handleAdRevenueEvent$invoke$1.label;
                if (i != 0) {
                    a.a(obj);
                    _create = AdRevenueEventRequestKt.Dsl.Companion._create(AdRevenueEventRequestOuterClass.AdRevenueEventRequest.newBuilder());
                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    handleAdRevenueEvent$invoke$1.L$0 = adRevenueData;
                    handleAdRevenueEvent$invoke$1.L$1 = mediationProvider;
                    handleAdRevenueEvent$invoke$1.L$2 = adRevenueOrigin;
                    handleAdRevenueEvent$invoke$1.L$3 = _create;
                    handleAdRevenueEvent$invoke$1.L$4 = _create;
                    handleAdRevenueEvent$invoke$1.L$5 = _create;
                    handleAdRevenueEvent$invoke$1.label = 1;
                    staticDeviceInfo = deviceInfoRepository.staticDeviceInfo(handleAdRevenueEvent$invoke$1);
                    if (staticDeviceInfo != coroutineSingletons) {
                        adRevenueData2 = adRevenueData;
                        mediationProvider2 = mediationProvider;
                        dsl = _create;
                        dsl2 = dsl;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                    return s3q0.a;
                }
                dsl = (AdRevenueEventRequestKt.Dsl) handleAdRevenueEvent$invoke$1.L$5;
                dsl2 = (AdRevenueEventRequestKt.Dsl) handleAdRevenueEvent$invoke$1.L$4;
                AdRevenueEventRequestKt.Dsl dsl3 = (AdRevenueEventRequestKt.Dsl) handleAdRevenueEvent$invoke$1.L$3;
                AdRevenueOrigin adRevenueOrigin2 = (AdRevenueOrigin) handleAdRevenueEvent$invoke$1.L$2;
                mediationProvider2 = (ClientInfoOuterClass.MediationProvider) handleAdRevenueEvent$invoke$1.L$1;
                adRevenueData2 = (AdRevenueData) handleAdRevenueEvent$invoke$1.L$0;
                a.a(obj);
                _create = dsl3;
                adRevenueOrigin = adRevenueOrigin2;
                staticDeviceInfo = obj;
                dsl.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) staticDeviceInfo);
                dsl2.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
                dsl2.setMediationProvider(mediationProvider2);
                proto = HandleAdRevenueEventKt.toProto(adRevenueOrigin);
                dsl2.setAdRevenueOrigin(proto);
                dsl2.setAdRevenueData(this.getAdRevenueEventData.invoke(adRevenueData2));
                AdRevenueEventRequestOuterClass.AdRevenueEventRequest _build = _create._build();
                sh50<AdRevenueEventRequestOuterClass.AdRevenueEventRequest> adRevenueEvents = this.adRevenueRepository.getAdRevenueEvents();
                handleAdRevenueEvent$invoke$1.L$0 = null;
                handleAdRevenueEvent$invoke$1.L$1 = null;
                handleAdRevenueEvent$invoke$1.L$2 = null;
                handleAdRevenueEvent$invoke$1.L$3 = null;
                handleAdRevenueEvent$invoke$1.L$4 = null;
                handleAdRevenueEvent$invoke$1.L$5 = null;
                handleAdRevenueEvent$invoke$1.label = 2;
            }
        }
        handleAdRevenueEvent$invoke$1 = new HandleAdRevenueEvent$invoke$1(this, spjVar);
        Object obj2 = handleAdRevenueEvent$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = handleAdRevenueEvent$invoke$1.label;
        if (i != 0) {
        }
        dsl.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) staticDeviceInfo);
        dsl2.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
        dsl2.setMediationProvider(mediationProvider2);
        proto = HandleAdRevenueEventKt.toProto(adRevenueOrigin);
        dsl2.setAdRevenueOrigin(proto);
        dsl2.setAdRevenueData(this.getAdRevenueEventData.invoke(adRevenueData2));
        AdRevenueEventRequestOuterClass.AdRevenueEventRequest _build2 = _create._build();
        sh50<AdRevenueEventRequestOuterClass.AdRevenueEventRequest> adRevenueEvents2 = this.adRevenueRepository.getAdRevenueEvents();
        handleAdRevenueEvent$invoke$1.L$0 = null;
        handleAdRevenueEvent$invoke$1.L$1 = null;
        handleAdRevenueEvent$invoke$1.L$2 = null;
        handleAdRevenueEvent$invoke$1.L$3 = null;
        handleAdRevenueEvent$invoke$1.L$4 = null;
        handleAdRevenueEvent$invoke$1.L$5 = null;
        handleAdRevenueEvent$invoke$1.label = 2;
    }
}
