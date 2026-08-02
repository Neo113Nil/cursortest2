package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* compiled from: AndroidGetUniversalRequestSharedData.kt */
/* loaded from: classes14.dex */
public final class AndroidGetUniversalRequestSharedData implements GetUniversalRequestSharedData {
    private final DeveloperConsentRepository developerConsentRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetLimitedSessionToken getLimitedSessionToken;
    private final GetSharedDataTimestamps getSharedDataTimestamps;
    private final SessionRepository sessionRepository;

    public AndroidGetUniversalRequestSharedData(GetSharedDataTimestamps getSharedDataTimestamps, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, GetLimitedSessionToken getLimitedSessionToken, DeveloperConsentRepository developerConsentRepository) {
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.developerConsentRepository = developerConsentRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestSharedData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(spj<? super UniversalRequestOuterClass.UniversalRequest.SharedData> spjVar) {
        AndroidGetUniversalRequestSharedData$invoke$1 androidGetUniversalRequestSharedData$invoke$1;
        int i;
        UniversalRequestKt.SharedDataKt.Dsl _create;
        UniversalRequestKt.SharedDataKt.Dsl dsl;
        UniversalRequestKt.SharedDataKt.Dsl dsl2;
        UniversalRequestKt.SharedDataKt.Dsl dsl3;
        if (spjVar instanceof AndroidGetUniversalRequestSharedData$invoke$1) {
            androidGetUniversalRequestSharedData$invoke$1 = (AndroidGetUniversalRequestSharedData$invoke$1) spjVar;
            int i2 = androidGetUniversalRequestSharedData$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetUniversalRequestSharedData$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidGetUniversalRequestSharedData$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidGetUniversalRequestSharedData$invoke$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                    _create = UniversalRequestKt.SharedDataKt.Dsl.Companion._create(UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder());
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
                    if (invoke == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    dsl = _create;
                    dsl2 = dsl;
                    obj = invoke;
                    dsl3 = dsl2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dsl = (UniversalRequestKt.SharedDataKt.Dsl) androidGetUniversalRequestSharedData$invoke$1.L$2;
                    dsl2 = (UniversalRequestKt.SharedDataKt.Dsl) androidGetUniversalRequestSharedData$invoke$1.L$1;
                    dsl3 = (UniversalRequestKt.SharedDataKt.Dsl) androidGetUniversalRequestSharedData$invoke$1.L$0;
                    kotlin.a.a(obj);
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
        androidGetUniversalRequestSharedData$invoke$1 = new AndroidGetUniversalRequestSharedData$invoke$1(this, spjVar);
        Object obj2 = androidGetUniversalRequestSharedData$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
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
