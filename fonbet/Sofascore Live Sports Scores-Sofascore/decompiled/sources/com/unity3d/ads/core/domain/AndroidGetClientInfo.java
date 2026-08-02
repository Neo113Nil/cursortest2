package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.ClientInfoKt;
import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetClientInfo;", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "mediationRepository", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "omidManager", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "offerwallManager", "Lcom/unity3d/ads/core/data/datasource/FIdExistenceDataSource;", "fIdExistenceDataSource", "Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;", "adQualityVersionDataSource", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/MediationRepository;Lcom/unity3d/ads/core/data/manager/OmidManager;Lcom/unity3d/ads/core/data/manager/OfferwallManager;Lcom/unity3d/ads/core/data/datasource/FIdExistenceDataSource;Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;)V", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "invoke", "(Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "Lcom/unity3d/ads/core/data/datasource/FIdExistenceDataSource;", "Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGetClientInfo implements GetClientInfo {

    @NotNull
    private final AdQualityVersionDataSource adQualityVersionDataSource;

    @NotNull
    private final FIdExistenceDataSource fIdExistenceDataSource;

    @NotNull
    private final MediationRepository mediationRepository;

    @NotNull
    private final OfferwallManager offerwallManager;

    @NotNull
    private final OmidManager omidManager;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidGetClientInfo(@NotNull SessionRepository sessionRepository, @NotNull MediationRepository mediationRepository, @NotNull OmidManager omidManager, @NotNull OfferwallManager offerwallManager, @NotNull FIdExistenceDataSource fIdExistenceDataSource, @NotNull AdQualityVersionDataSource adQualityVersionDataSource) {
        sessionRepository.getClass();
        mediationRepository.getClass();
        omidManager.getClass();
        offerwallManager.getClass();
        fIdExistenceDataSource.getClass();
        adQualityVersionDataSource.getClass();
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
        this.omidManager = omidManager;
        this.offerwallManager = offerwallManager;
        this.fIdExistenceDataSource = fIdExistenceDataSource;
        this.adQualityVersionDataSource = adQualityVersionDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.domain.GetClientInfo
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull rq3<? super ClientInfoOuterClass.ClientInfo> rq3Var) {
        AndroidGetClientInfo$invoke$1 androidGetClientInfo$invoke$1;
        int i;
        ClientInfoKt.Dsl dsl;
        ClientInfoKt.Dsl dsl2;
        String str;
        String invoke;
        if (rq3Var instanceof AndroidGetClientInfo$invoke$1) {
            androidGetClientInfo$invoke$1 = (AndroidGetClientInfo$invoke$1) rq3Var;
            int i2 = androidGetClientInfo$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetClientInfo$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidGetClientInfo$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = androidGetClientInfo$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    ClientInfoKt.Dsl.Companion companion = ClientInfoKt.Dsl.INSTANCE;
                    ClientInfoOuterClass.ClientInfo.Builder newBuilder = ClientInfoOuterClass.ClientInfo.newBuilder();
                    newBuilder.getClass();
                    ClientInfoKt.Dsl _create = companion._create(newBuilder);
                    _create.setSdkVersion(41900);
                    _create.setSdkVersionName("4.19.0");
                    String gameId = this.sessionRepository.getGameId();
                    if (gameId != null) {
                        _create.setGameId(gameId);
                    }
                    _create.setTest(this.sessionRepository.isTestModeEnabled());
                    _create.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
                    _create.setMediationProvider((ClientInfoOuterClass.MediationProvider) this.mediationRepository.getMediationProvider().invoke());
                    String name = this.mediationRepository.getName();
                    if (name != null && _create.getMediationProvider() == ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM && !StringsKt.R(name)) {
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
                    if (version2 == lu3Var) {
                        return lu3Var;
                    }
                    dsl = _create;
                    obj = version2;
                    dsl2 = dsl;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dsl = (ClientInfoKt.Dsl) androidGetClientInfo$invoke$1.L$1;
                    dsl2 = (ClientInfoKt.Dsl) androidGetClientInfo$invoke$1.L$0;
                    y6a.M(obj);
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
        androidGetClientInfo$invoke$1 = new AndroidGetClientInfo$invoke$1(this, rq3Var);
        Object obj2 = androidGetClientInfo$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
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
