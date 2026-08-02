package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import gatewayprotocol.v1.ClientInfoKt;
import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.drm0;
import xsna.spj;

/* compiled from: AndroidGetClientInfo.kt */
/* loaded from: classes14.dex */
public final class AndroidGetClientInfo implements GetClientInfo {
    private final AdQualityVersionDataSource adQualityVersionDataSource;
    private final FIdExistenceDataSource fIdExistenceDataSource;
    private final MediationRepository mediationRepository;
    private final OfferwallManager offerwallManager;
    private final OmidManager omidManager;
    private final SessionRepository sessionRepository;

    public AndroidGetClientInfo(SessionRepository sessionRepository, MediationRepository mediationRepository, OmidManager omidManager, OfferwallManager offerwallManager, FIdExistenceDataSource fIdExistenceDataSource, AdQualityVersionDataSource adQualityVersionDataSource) {
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
        this.omidManager = omidManager;
        this.offerwallManager = offerwallManager;
        this.fIdExistenceDataSource = fIdExistenceDataSource;
        this.adQualityVersionDataSource = adQualityVersionDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.domain.GetClientInfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(spj<? super ClientInfoOuterClass.ClientInfo> spjVar) {
        AndroidGetClientInfo$invoke$1 androidGetClientInfo$invoke$1;
        int i;
        ClientInfoKt.Dsl dsl;
        ClientInfoKt.Dsl dsl2;
        String str;
        String invoke;
        if (spjVar instanceof AndroidGetClientInfo$invoke$1) {
            androidGetClientInfo$invoke$1 = (AndroidGetClientInfo$invoke$1) spjVar;
            int i2 = androidGetClientInfo$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetClientInfo$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidGetClientInfo$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidGetClientInfo$invoke$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ClientInfoKt.Dsl _create = ClientInfoKt.Dsl.Companion._create(ClientInfoOuterClass.ClientInfo.newBuilder());
                    _create.setSdkVersion(41900);
                    _create.setSdkVersionName("4.19.0");
                    String gameId = this.sessionRepository.getGameId();
                    if (gameId != null) {
                        _create.setGameId(gameId);
                    }
                    _create.setTest(this.sessionRepository.isTestModeEnabled());
                    _create.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
                    _create.setMediationProvider(this.mediationRepository.getMediationProvider().invoke());
                    String name = this.mediationRepository.getName();
                    if (name != null && _create.getMediationProvider() == ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM && !drm0.N(name)) {
                        _create.setCustomMediationName(name);
                    }
                    String version = this.mediationRepository.getVersion();
                    if (version != null) {
                        _create.setMediationVersion(version);
                    }
                    OfferwallManager offerwallManager = this.offerwallManager;
                    androidGetClientInfo$invoke$1.L$0 = _create;
                    androidGetClientInfo$invoke$1.L$1 = _create;
                    androidGetClientInfo$invoke$1.label = 1;
                    Object version2 = offerwallManager.getVersion(androidGetClientInfo$invoke$1);
                    if (version2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    dsl = _create;
                    obj = version2;
                    dsl2 = dsl;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dsl = (ClientInfoKt.Dsl) androidGetClientInfo$invoke$1.L$1;
                    dsl2 = (ClientInfoKt.Dsl) androidGetClientInfo$invoke$1.L$0;
                    kotlin.a.a(obj);
                }
                str = (String) obj;
                if (str != null) {
                    dsl.setOfferwallVersion(str);
                }
                dsl.setOmidVersion(this.omidManager.getVersion());
                dsl.setOmidPartnerVersion("1");
                dsl.setSdkDevelopmentPlatform(!MadeWithUnityDetector.isMadeWithUnity() ? "Unity" : "");
                dsl.setIsFidAvailable(this.fIdExistenceDataSource.invoke());
                invoke = this.adQualityVersionDataSource.invoke();
                if (invoke != null) {
                    dsl.setAdQualitySdkVersion(invoke);
                }
                return dsl2._build();
            }
        }
        androidGetClientInfo$invoke$1 = new AndroidGetClientInfo$invoke$1(this, spjVar);
        Object obj2 = androidGetClientInfo$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidGetClientInfo$invoke$1.label;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        dsl.setOmidVersion(this.omidManager.getVersion());
        dsl.setOmidPartnerVersion("1");
        dsl.setSdkDevelopmentPlatform(!MadeWithUnityDetector.isMadeWithUnity() ? "Unity" : "");
        dsl.setIsFidAvailable(this.fIdExistenceDataSource.invoke());
        invoke = this.adQualityVersionDataSource.invoke();
        if (invoke != null) {
        }
        return dsl2._build();
    }
}
