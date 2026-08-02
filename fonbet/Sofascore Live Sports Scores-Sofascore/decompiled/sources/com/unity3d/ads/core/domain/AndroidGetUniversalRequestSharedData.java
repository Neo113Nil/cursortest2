package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.services.core.properties.SdkProperties;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetUniversalRequestSharedData;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "getSharedDataTimestamps", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "getLimitedSessionToken", "Lcom/unity3d/ads/core/data/repository/DeveloperConsentRepository;", "developerConsentRepository", "<init>", "(Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;Lcom/unity3d/ads/core/data/repository/DeveloperConsentRepository;)V", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "invoke", "(Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "Lcom/unity3d/ads/core/data/repository/DeveloperConsentRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGetUniversalRequestSharedData implements GetUniversalRequestSharedData {

    @NotNull
    private final DeveloperConsentRepository developerConsentRepository;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetLimitedSessionToken getLimitedSessionToken;

    @NotNull
    private final GetSharedDataTimestamps getSharedDataTimestamps;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidGetUniversalRequestSharedData(@NotNull GetSharedDataTimestamps getSharedDataTimestamps, @NotNull SessionRepository sessionRepository, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull GetLimitedSessionToken getLimitedSessionToken, @NotNull DeveloperConsentRepository developerConsentRepository) {
        getSharedDataTimestamps.getClass();
        sessionRepository.getClass();
        deviceInfoRepository.getClass();
        getLimitedSessionToken.getClass();
        developerConsentRepository.getClass();
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.developerConsentRepository = developerConsentRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestSharedData
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull rq3<? super UniversalRequestOuterClass.UniversalRequest.SharedData> rq3Var) {
        AndroidGetUniversalRequestSharedData$invoke$1 androidGetUniversalRequestSharedData$invoke$1;
        int i;
        UniversalRequestKt.SharedDataKt.Dsl _create;
        UniversalRequestKt.SharedDataKt.Dsl dsl;
        UniversalRequestKt.SharedDataKt.Dsl dsl2;
        UniversalRequestKt.SharedDataKt.Dsl dsl3;
        if (rq3Var instanceof AndroidGetUniversalRequestSharedData$invoke$1) {
            androidGetUniversalRequestSharedData$invoke$1 = (AndroidGetUniversalRequestSharedData$invoke$1) rq3Var;
            int i2 = androidGetUniversalRequestSharedData$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetUniversalRequestSharedData$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidGetUniversalRequestSharedData$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = androidGetUniversalRequestSharedData$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                    UniversalRequestKt.SharedDataKt.Dsl.Companion companion = UniversalRequestKt.SharedDataKt.Dsl.INSTANCE;
                    UniversalRequestOuterClass.UniversalRequest.SharedData.Builder newBuilder = UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder();
                    newBuilder.getClass();
                    _create = companion._create(newBuilder);
                    ByteString sessionToken = this.sessionRepository.getSessionToken();
                    if (!sessionToken.isEmpty()) {
                        _create.setSessionToken(sessionToken);
                        dsl3 = _create;
                        _create.setTimestamps(this.getSharedDataTimestamps.invoke());
                        _create.setSdkStartTime(TimestampExtensionsKt.fromMillis(SdkProperties.getInitializationTimeEpoch()));
                        _create.setAppStartTime(TimestampExtensionsKt.fromMillis(SdkProperties.getAppInitializationTimeSinceEpoch()));
                        _create.setDeveloperConsent(this.developerConsentRepository.getDeveloperConsent());
                        _create.setPii(this.deviceInfoRepository.getPiiData());
                        return dsl3._build();
                    }
                    GetLimitedSessionToken getLimitedSessionToken = this.getLimitedSessionToken;
                    androidGetUniversalRequestSharedData$invoke$1.L$0 = _create;
                    androidGetUniversalRequestSharedData$invoke$1.L$1 = _create;
                    androidGetUniversalRequestSharedData$invoke$1.L$2 = _create;
                    androidGetUniversalRequestSharedData$invoke$1.label = 1;
                    Object invoke = getLimitedSessionToken.invoke(androidGetUniversalRequestSharedData$invoke$1);
                    if (invoke == lu3Var) {
                        return lu3Var;
                    }
                    dsl = _create;
                    dsl2 = dsl;
                    obj = invoke;
                    dsl3 = dsl2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dsl = (UniversalRequestKt.SharedDataKt.Dsl) androidGetUniversalRequestSharedData$invoke$1.L$2;
                    dsl2 = (UniversalRequestKt.SharedDataKt.Dsl) androidGetUniversalRequestSharedData$invoke$1.L$1;
                    dsl3 = (UniversalRequestKt.SharedDataKt.Dsl) androidGetUniversalRequestSharedData$invoke$1.L$0;
                    y6a.M(obj);
                }
                dsl.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) obj);
                _create = dsl2;
                _create.setTimestamps(this.getSharedDataTimestamps.invoke());
                _create.setSdkStartTime(TimestampExtensionsKt.fromMillis(SdkProperties.getInitializationTimeEpoch()));
                _create.setAppStartTime(TimestampExtensionsKt.fromMillis(SdkProperties.getAppInitializationTimeSinceEpoch()));
                _create.setDeveloperConsent(this.developerConsentRepository.getDeveloperConsent());
                _create.setPii(this.deviceInfoRepository.getPiiData());
                return dsl3._build();
            }
        }
        androidGetUniversalRequestSharedData$invoke$1 = new AndroidGetUniversalRequestSharedData$invoke$1(this, rq3Var);
        Object obj2 = androidGetUniversalRequestSharedData$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidGetUniversalRequestSharedData$invoke$1.label;
        if (i != 0) {
        }
        dsl.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) obj2);
        _create = dsl2;
        _create.setTimestamps(this.getSharedDataTimestamps.invoke());
        _create.setSdkStartTime(TimestampExtensionsKt.fromMillis(SdkProperties.getInitializationTimeEpoch()));
        _create.setAppStartTime(TimestampExtensionsKt.fromMillis(SdkProperties.getAppInitializationTimeSinceEpoch()));
        _create.setDeveloperConsent(this.developerConsentRepository.getDeveloperConsent());
        _create.setPii(this.deviceInfoRepository.getPiiData());
        return dsl3._build();
    }
}
