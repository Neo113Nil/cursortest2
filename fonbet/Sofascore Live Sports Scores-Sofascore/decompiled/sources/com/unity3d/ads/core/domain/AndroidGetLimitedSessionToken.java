package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.LimitedSessionTokenKt;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetLimitedSessionToken;", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "mediationRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/MediationRepository;)V", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "invoke", "(Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGetLimitedSessionToken implements GetLimitedSessionToken {

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final MediationRepository mediationRepository;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidGetLimitedSessionToken(@NotNull DeviceInfoRepository deviceInfoRepository, @NotNull SessionRepository sessionRepository, @NotNull MediationRepository mediationRepository) {
        deviceInfoRepository.getClass();
        sessionRepository.getClass();
        mediationRepository.getClass();
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.GetLimitedSessionToken
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull rq3<? super UniversalRequestOuterClass.LimitedSessionToken> rq3Var) {
        AndroidGetLimitedSessionToken$invoke$1 androidGetLimitedSessionToken$invoke$1;
        Object obj;
        lu3 lu3Var;
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
        if (rq3Var instanceof AndroidGetLimitedSessionToken$invoke$1) {
            androidGetLimitedSessionToken$invoke$1 = (AndroidGetLimitedSessionToken$invoke$1) rq3Var;
            int i2 = androidGetLimitedSessionToken$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetLimitedSessionToken$invoke$1.label = i2 - Integer.MIN_VALUE;
                obj = androidGetLimitedSessionToken$invoke$1.result;
                lu3Var = lu3.a;
                i = androidGetLimitedSessionToken$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    LimitedSessionTokenKt.Dsl.Companion companion = LimitedSessionTokenKt.Dsl.INSTANCE;
                    UniversalRequestOuterClass.LimitedSessionToken.Builder newBuilder = UniversalRequestOuterClass.LimitedSessionToken.newBuilder();
                    newBuilder.getClass();
                    _create = companion._create(newBuilder);
                    _create.setSessionId(this.sessionRepository.getSessionId());
                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    androidGetLimitedSessionToken$invoke$1.L$0 = _create;
                    androidGetLimitedSessionToken$invoke$1.L$1 = _create;
                    androidGetLimitedSessionToken$invoke$1.L$2 = _create;
                    androidGetLimitedSessionToken$invoke$1.label = 1;
                    obj = deviceInfoRepository.staticDeviceInfo(androidGetLimitedSessionToken$invoke$1);
                    if (obj != lu3Var) {
                        dsl = _create;
                        dsl2 = dsl;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        dsl3 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$2;
                        dsl4 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$1;
                        dsl5 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$0;
                        y6a.M(obj);
                        String deviceModel = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getDeviceModel();
                        deviceModel.getClass();
                        dsl3.setDeviceModel(deviceModel);
                        DeviceInfoRepository deviceInfoRepository2 = this.deviceInfoRepository;
                        androidGetLimitedSessionToken$invoke$1.L$0 = dsl5;
                        androidGetLimitedSessionToken$invoke$1.L$1 = dsl4;
                        androidGetLimitedSessionToken$invoke$1.L$2 = dsl4;
                        androidGetLimitedSessionToken$invoke$1.label = 3;
                        obj = deviceInfoRepository2.staticDeviceInfo(androidGetLimitedSessionToken$invoke$1);
                        if (obj != lu3Var) {
                            dsl6 = dsl4;
                            dsl7 = dsl6;
                            dsl8 = dsl5;
                            String osVersion = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getOsVersion();
                            osVersion.getClass();
                            dsl6.setOsVersion(osVersion);
                            DeviceInfoRepository deviceInfoRepository3 = this.deviceInfoRepository;
                            androidGetLimitedSessionToken$invoke$1.L$0 = dsl8;
                            androidGetLimitedSessionToken$invoke$1.L$1 = dsl7;
                            androidGetLimitedSessionToken$invoke$1.L$2 = dsl7;
                            androidGetLimitedSessionToken$invoke$1.label = 4;
                            obj = deviceInfoRepository3.getIdfi(androidGetLimitedSessionToken$invoke$1);
                            if (obj != lu3Var) {
                            }
                        }
                        return lu3Var;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dsl9 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$2;
                        dsl10 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$1;
                        dsl11 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$0;
                        y6a.M(obj);
                        dsl9.setIdfi((String) obj);
                        dsl10.setSdkVersion(41900);
                        dsl10.setSdkVersionName("4.19.0");
                        gameId = this.sessionRepository.getGameId();
                        if (gameId != null) {
                            dsl10.setGameId(gameId);
                        }
                        dsl10.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
                        dsl10.setMediationProvider((ClientInfoOuterClass.MediationProvider) this.mediationRepository.getMediationProvider().invoke());
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
                    y6a.M(obj);
                    String osVersion2 = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getOsVersion();
                    osVersion2.getClass();
                    dsl6.setOsVersion(osVersion2);
                    DeviceInfoRepository deviceInfoRepository32 = this.deviceInfoRepository;
                    androidGetLimitedSessionToken$invoke$1.L$0 = dsl8;
                    androidGetLimitedSessionToken$invoke$1.L$1 = dsl7;
                    androidGetLimitedSessionToken$invoke$1.L$2 = dsl7;
                    androidGetLimitedSessionToken$invoke$1.label = 4;
                    obj = deviceInfoRepository32.getIdfi(androidGetLimitedSessionToken$invoke$1);
                    if (obj != lu3Var) {
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
                        dsl10.setMediationProvider((ClientInfoOuterClass.MediationProvider) this.mediationRepository.getMediationProvider().invoke());
                        name = this.mediationRepository.getName();
                        if (name != null) {
                            dsl10.setCustomMediationName(name);
                        }
                        version = this.mediationRepository.getVersion();
                        if (version != null) {
                        }
                        return dsl11._build();
                    }
                    return lu3Var;
                }
                _create = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$2;
                dsl = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$1;
                dsl2 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$0;
                y6a.M(obj);
                String deviceMake = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getDeviceMake();
                deviceMake.getClass();
                _create.setDeviceMake(deviceMake);
                DeviceInfoRepository deviceInfoRepository4 = this.deviceInfoRepository;
                androidGetLimitedSessionToken$invoke$1.L$0 = dsl2;
                androidGetLimitedSessionToken$invoke$1.L$1 = dsl;
                androidGetLimitedSessionToken$invoke$1.L$2 = dsl;
                androidGetLimitedSessionToken$invoke$1.label = 2;
                obj = deviceInfoRepository4.staticDeviceInfo(androidGetLimitedSessionToken$invoke$1);
                if (obj != lu3Var) {
                    dsl3 = dsl;
                    dsl4 = dsl3;
                    dsl5 = dsl2;
                    String deviceModel2 = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getDeviceModel();
                    deviceModel2.getClass();
                    dsl3.setDeviceModel(deviceModel2);
                    DeviceInfoRepository deviceInfoRepository22 = this.deviceInfoRepository;
                    androidGetLimitedSessionToken$invoke$1.L$0 = dsl5;
                    androidGetLimitedSessionToken$invoke$1.L$1 = dsl4;
                    androidGetLimitedSessionToken$invoke$1.L$2 = dsl4;
                    androidGetLimitedSessionToken$invoke$1.label = 3;
                    obj = deviceInfoRepository22.staticDeviceInfo(androidGetLimitedSessionToken$invoke$1);
                    if (obj != lu3Var) {
                    }
                }
                return lu3Var;
            }
        }
        androidGetLimitedSessionToken$invoke$1 = new AndroidGetLimitedSessionToken$invoke$1(this, rq3Var);
        obj = androidGetLimitedSessionToken$invoke$1.result;
        lu3Var = lu3.a;
        i = androidGetLimitedSessionToken$invoke$1.label;
        if (i != 0) {
        }
        String deviceMake2 = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getDeviceMake();
        deviceMake2.getClass();
        _create.setDeviceMake(deviceMake2);
        DeviceInfoRepository deviceInfoRepository42 = this.deviceInfoRepository;
        androidGetLimitedSessionToken$invoke$1.L$0 = dsl2;
        androidGetLimitedSessionToken$invoke$1.L$1 = dsl;
        androidGetLimitedSessionToken$invoke$1.L$2 = dsl;
        androidGetLimitedSessionToken$invoke$1.label = 2;
        obj = deviceInfoRepository42.staticDeviceInfo(androidGetLimitedSessionToken$invoke$1);
        if (obj != lu3Var) {
        }
        return lu3Var;
    }
}
