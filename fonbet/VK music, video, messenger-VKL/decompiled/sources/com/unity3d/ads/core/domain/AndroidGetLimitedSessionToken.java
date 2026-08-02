package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.LimitedSessionTokenKt;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* compiled from: AndroidGetLimitedSessionToken.kt */
/* loaded from: classes14.dex */
public final class AndroidGetLimitedSessionToken implements GetLimitedSessionToken {
    private final DeviceInfoRepository deviceInfoRepository;
    private final MediationRepository mediationRepository;
    private final SessionRepository sessionRepository;

    public AndroidGetLimitedSessionToken(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, MediationRepository mediationRepository) {
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.GetLimitedSessionToken
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(spj<? super UniversalRequestOuterClass.LimitedSessionToken> spjVar) {
        AndroidGetLimitedSessionToken$invoke$1 androidGetLimitedSessionToken$invoke$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        LimitedSessionTokenKt.Dsl _create;
        LimitedSessionTokenKt.Dsl dsl;
        LimitedSessionTokenKt.Dsl dsl2;
        LimitedSessionTokenKt.Dsl dsl3;
        LimitedSessionTokenKt.Dsl dsl4;
        LimitedSessionTokenKt.Dsl dsl5;
        LimitedSessionTokenKt.Dsl dsl6;
        LimitedSessionTokenKt.Dsl dsl7;
        LimitedSessionTokenKt.Dsl dsl8;
        LimitedSessionTokenKt.Dsl dsl9;
        LimitedSessionTokenKt.Dsl dsl10;
        LimitedSessionTokenKt.Dsl dsl11;
        String gameId;
        String name;
        String version;
        if (spjVar instanceof AndroidGetLimitedSessionToken$invoke$1) {
            androidGetLimitedSessionToken$invoke$1 = (AndroidGetLimitedSessionToken$invoke$1) spjVar;
            int i2 = androidGetLimitedSessionToken$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetLimitedSessionToken$invoke$1.label = i2 - Integer.MIN_VALUE;
                obj = androidGetLimitedSessionToken$invoke$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidGetLimitedSessionToken$invoke$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    _create = LimitedSessionTokenKt.Dsl.Companion._create(UniversalRequestOuterClass.LimitedSessionToken.newBuilder());
                    _create.setSessionId(this.sessionRepository.getSessionId());
                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    androidGetLimitedSessionToken$invoke$1.L$0 = _create;
                    androidGetLimitedSessionToken$invoke$1.L$1 = _create;
                    androidGetLimitedSessionToken$invoke$1.L$2 = _create;
                    androidGetLimitedSessionToken$invoke$1.label = 1;
                    obj = deviceInfoRepository.staticDeviceInfo(androidGetLimitedSessionToken$invoke$1);
                    if (obj != coroutineSingletons) {
                        dsl = _create;
                        dsl2 = dsl;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        dsl3 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$2;
                        dsl4 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$1;
                        dsl5 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$0;
                        kotlin.a.a(obj);
                        dsl3.setDeviceModel(((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getDeviceModel());
                        DeviceInfoRepository deviceInfoRepository2 = this.deviceInfoRepository;
                        androidGetLimitedSessionToken$invoke$1.L$0 = dsl5;
                        androidGetLimitedSessionToken$invoke$1.L$1 = dsl4;
                        androidGetLimitedSessionToken$invoke$1.L$2 = dsl4;
                        androidGetLimitedSessionToken$invoke$1.label = 3;
                        obj = deviceInfoRepository2.staticDeviceInfo(androidGetLimitedSessionToken$invoke$1);
                        if (obj != coroutineSingletons) {
                            dsl6 = dsl4;
                            dsl7 = dsl6;
                            dsl8 = dsl5;
                            dsl6.setOsVersion(((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getOsVersion());
                            DeviceInfoRepository deviceInfoRepository3 = this.deviceInfoRepository;
                            androidGetLimitedSessionToken$invoke$1.L$0 = dsl8;
                            androidGetLimitedSessionToken$invoke$1.L$1 = dsl7;
                            androidGetLimitedSessionToken$invoke$1.L$2 = dsl7;
                            androidGetLimitedSessionToken$invoke$1.label = 4;
                            obj = deviceInfoRepository3.getIdfi(androidGetLimitedSessionToken$invoke$1);
                            if (obj != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dsl9 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$2;
                        dsl10 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$1;
                        dsl11 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$0;
                        kotlin.a.a(obj);
                        dsl9.setIdfi((String) obj);
                        dsl10.setSdkVersion(41900);
                        dsl10.setSdkVersionName("4.19.0");
                        gameId = this.sessionRepository.getGameId();
                        if (gameId != null) {
                            dsl10.setGameId(gameId);
                        }
                        dsl10.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
                        dsl10.setMediationProvider(this.mediationRepository.getMediationProvider().invoke());
                        name = this.mediationRepository.getName();
                        if (name != null && dsl10.getMediationProvider() == ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM) {
                            dsl10.setCustomMediationName(name);
                        }
                        version = this.mediationRepository.getVersion();
                        if (version != null) {
                            dsl10.setMediationVersion(version);
                        }
                        return dsl11._build();
                    }
                    dsl6 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$2;
                    dsl7 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$1;
                    dsl8 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$0;
                    kotlin.a.a(obj);
                    dsl6.setOsVersion(((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getOsVersion());
                    DeviceInfoRepository deviceInfoRepository32 = this.deviceInfoRepository;
                    androidGetLimitedSessionToken$invoke$1.L$0 = dsl8;
                    androidGetLimitedSessionToken$invoke$1.L$1 = dsl7;
                    androidGetLimitedSessionToken$invoke$1.L$2 = dsl7;
                    androidGetLimitedSessionToken$invoke$1.label = 4;
                    obj = deviceInfoRepository32.getIdfi(androidGetLimitedSessionToken$invoke$1);
                    if (obj != coroutineSingletons) {
                        dsl9 = dsl7;
                        dsl10 = dsl9;
                        dsl11 = dsl8;
                        dsl9.setIdfi((String) obj);
                        dsl10.setSdkVersion(41900);
                        dsl10.setSdkVersionName("4.19.0");
                        gameId = this.sessionRepository.getGameId();
                        if (gameId != null) {
                        }
                        dsl10.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
                        dsl10.setMediationProvider(this.mediationRepository.getMediationProvider().invoke());
                        name = this.mediationRepository.getName();
                        if (name != null) {
                            dsl10.setCustomMediationName(name);
                        }
                        version = this.mediationRepository.getVersion();
                        if (version != null) {
                        }
                        return dsl11._build();
                    }
                    return coroutineSingletons;
                }
                _create = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$2;
                dsl = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$1;
                dsl2 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$0;
                kotlin.a.a(obj);
                _create.setDeviceMake(((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getDeviceMake());
                DeviceInfoRepository deviceInfoRepository4 = this.deviceInfoRepository;
                androidGetLimitedSessionToken$invoke$1.L$0 = dsl2;
                androidGetLimitedSessionToken$invoke$1.L$1 = dsl;
                androidGetLimitedSessionToken$invoke$1.L$2 = dsl;
                androidGetLimitedSessionToken$invoke$1.label = 2;
                obj = deviceInfoRepository4.staticDeviceInfo(androidGetLimitedSessionToken$invoke$1);
                if (obj != coroutineSingletons) {
                    dsl3 = dsl;
                    dsl4 = dsl3;
                    dsl5 = dsl2;
                    dsl3.setDeviceModel(((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getDeviceModel());
                    DeviceInfoRepository deviceInfoRepository22 = this.deviceInfoRepository;
                    androidGetLimitedSessionToken$invoke$1.L$0 = dsl5;
                    androidGetLimitedSessionToken$invoke$1.L$1 = dsl4;
                    androidGetLimitedSessionToken$invoke$1.L$2 = dsl4;
                    androidGetLimitedSessionToken$invoke$1.label = 3;
                    obj = deviceInfoRepository22.staticDeviceInfo(androidGetLimitedSessionToken$invoke$1);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        androidGetLimitedSessionToken$invoke$1 = new AndroidGetLimitedSessionToken$invoke$1(this, spjVar);
        obj = androidGetLimitedSessionToken$invoke$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidGetLimitedSessionToken$invoke$1.label;
        if (i != 0) {
        }
        _create.setDeviceMake(((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getDeviceMake());
        DeviceInfoRepository deviceInfoRepository42 = this.deviceInfoRepository;
        androidGetLimitedSessionToken$invoke$1.L$0 = dsl2;
        androidGetLimitedSessionToken$invoke$1.L$1 = dsl;
        androidGetLimitedSessionToken$invoke$1.L$2 = dsl;
        androidGetLimitedSessionToken$invoke$1.label = 2;
        obj = deviceInfoRepository42.staticDeviceInfo(androidGetLimitedSessionToken$invoke$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
