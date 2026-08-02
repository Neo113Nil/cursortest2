package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.AdRevenueData;
import com.unity3d.ads.core.data.model.AdRevenueOrigin;
import com.unity3d.ads.core.data.repository.AdRevenueRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import defpackage.a70;
import defpackage.b1d;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.AdRevenueEventRequestKt;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/domain/events/HandleAdRevenueEvent;", "", "Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;", "adRevenueRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/domain/events/GetAdRevenueEventData;", "getAdRevenueEventData", "<init>", "(Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/domain/events/GetAdRevenueEventData;)V", "Lcom/unity3d/ads/core/data/model/AdRevenueData;", "data", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "mediationProvider", "Lcom/unity3d/ads/core/data/model/AdRevenueOrigin;", "origin", "", "invoke", "(Lcom/unity3d/ads/core/data/model/AdRevenueData;Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;Lcom/unity3d/ads/core/data/model/AdRevenueOrigin;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/domain/events/GetAdRevenueEventData;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HandleAdRevenueEvent {

    @NotNull
    private final AdRevenueRepository adRevenueRepository;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetAdRevenueEventData getAdRevenueEventData;

    public HandleAdRevenueEvent(@NotNull AdRevenueRepository adRevenueRepository, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull GetAdRevenueEventData getAdRevenueEventData) {
        adRevenueRepository.getClass();
        deviceInfoRepository.getClass();
        getAdRevenueEventData.getClass();
        this.adRevenueRepository = adRevenueRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getAdRevenueEventData = getAdRevenueEventData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ba, code lost:
    
        if (r8.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(@NotNull AdRevenueData adRevenueData, @NotNull ClientInfoOuterClass.MediationProvider mediationProvider, @NotNull AdRevenueOrigin adRevenueOrigin, @NotNull rq3<? super Unit> rq3Var) {
        HandleAdRevenueEvent$invoke$1 handleAdRevenueEvent$invoke$1;
        int i;
        AdRevenueEventRequestKt.Dsl _create;
        Object staticDeviceInfo;
        AdRevenueData adRevenueData2;
        ClientInfoOuterClass.MediationProvider mediationProvider2;
        AdRevenueEventRequestKt.Dsl dsl;
        AdRevenueEventRequestKt.Dsl dsl2;
        AdRevenueEventRequestOuterClass.AdRevenueOrigin proto;
        if (rq3Var instanceof HandleAdRevenueEvent$invoke$1) {
            handleAdRevenueEvent$invoke$1 = (HandleAdRevenueEvent$invoke$1) rq3Var;
            int i2 = handleAdRevenueEvent$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                handleAdRevenueEvent$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = handleAdRevenueEvent$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = handleAdRevenueEvent$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    AdRevenueEventRequestKt.Dsl.Companion companion = AdRevenueEventRequestKt.Dsl.INSTANCE;
                    AdRevenueEventRequestOuterClass.AdRevenueEventRequest.Builder newBuilder = AdRevenueEventRequestOuterClass.AdRevenueEventRequest.newBuilder();
                    newBuilder.getClass();
                    _create = companion._create(newBuilder);
                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    handleAdRevenueEvent$invoke$1.L$0 = adRevenueData;
                    handleAdRevenueEvent$invoke$1.L$1 = mediationProvider;
                    handleAdRevenueEvent$invoke$1.L$2 = adRevenueOrigin;
                    handleAdRevenueEvent$invoke$1.L$3 = _create;
                    handleAdRevenueEvent$invoke$1.L$4 = _create;
                    handleAdRevenueEvent$invoke$1.L$5 = _create;
                    handleAdRevenueEvent$invoke$1.label = 1;
                    staticDeviceInfo = deviceInfoRepository.staticDeviceInfo(handleAdRevenueEvent$invoke$1);
                    if (staticDeviceInfo != lu3Var) {
                        adRevenueData2 = adRevenueData;
                        mediationProvider2 = mediationProvider;
                        dsl = _create;
                        dsl2 = dsl;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dsl = (AdRevenueEventRequestKt.Dsl) handleAdRevenueEvent$invoke$1.L$5;
                dsl2 = (AdRevenueEventRequestKt.Dsl) handleAdRevenueEvent$invoke$1.L$4;
                AdRevenueEventRequestKt.Dsl dsl3 = (AdRevenueEventRequestKt.Dsl) handleAdRevenueEvent$invoke$1.L$3;
                AdRevenueOrigin adRevenueOrigin2 = (AdRevenueOrigin) handleAdRevenueEvent$invoke$1.L$2;
                mediationProvider2 = (ClientInfoOuterClass.MediationProvider) handleAdRevenueEvent$invoke$1.L$1;
                adRevenueData2 = (AdRevenueData) handleAdRevenueEvent$invoke$1.L$0;
                y6a.M(obj);
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
                b1d adRevenueEvents = this.adRevenueRepository.getAdRevenueEvents();
                handleAdRevenueEvent$invoke$1.L$0 = null;
                handleAdRevenueEvent$invoke$1.L$1 = null;
                handleAdRevenueEvent$invoke$1.L$2 = null;
                handleAdRevenueEvent$invoke$1.L$3 = null;
                handleAdRevenueEvent$invoke$1.L$4 = null;
                handleAdRevenueEvent$invoke$1.L$5 = null;
                handleAdRevenueEvent$invoke$1.label = 2;
            }
        }
        handleAdRevenueEvent$invoke$1 = new HandleAdRevenueEvent$invoke$1(this, rq3Var);
        Object obj2 = handleAdRevenueEvent$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
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
        b1d adRevenueEvents2 = this.adRevenueRepository.getAdRevenueEvents();
        handleAdRevenueEvent$invoke$1.L$0 = null;
        handleAdRevenueEvent$invoke$1.L$1 = null;
        handleAdRevenueEvent$invoke$1.L$2 = null;
        handleAdRevenueEvent$invoke$1.L$3 = null;
        handleAdRevenueEvent$invoke$1.L$4 = null;
        handleAdRevenueEvent$invoke$1.L$5 = null;
        handleAdRevenueEvent$invoke$1.label = 2;
    }
}
