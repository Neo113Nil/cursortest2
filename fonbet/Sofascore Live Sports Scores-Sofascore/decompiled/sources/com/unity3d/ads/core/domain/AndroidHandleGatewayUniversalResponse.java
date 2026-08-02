package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.adquality.UpdateAdQualitySessionToken;
import com.unity3d.ads.core.extensions.ErrorExtensionsKt;
import defpackage.a70;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleGatewayUniversalResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;", "appSetIdDataSource", "Lcom/unity3d/ads/core/domain/adquality/UpdateAdQualitySessionToken;", "updateAdQualitySessionToken", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;Lcom/unity3d/ads/core/domain/adquality/UpdateAdQualitySessionToken;)V", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "response", "", "invoke", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;", "Lcom/unity3d/ads/core/domain/adquality/UpdateAdQualitySessionToken;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidHandleGatewayUniversalResponse implements HandleGatewayUniversalResponse {

    @NotNull
    private final AndroidAppSetIdDataSource appSetIdDataSource;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final UpdateAdQualitySessionToken updateAdQualitySessionToken;

    public AndroidHandleGatewayUniversalResponse(@NotNull SessionRepository sessionRepository, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull AndroidAppSetIdDataSource androidAppSetIdDataSource, @NotNull UpdateAdQualitySessionToken updateAdQualitySessionToken) {
        sessionRepository.getClass();
        deviceInfoRepository.getClass();
        androidAppSetIdDataSource.getClass();
        updateAdQualitySessionToken.getClass();
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.appSetIdDataSource = androidAppSetIdDataSource;
        this.updateAdQualitySessionToken = updateAdQualitySessionToken;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0164, code lost:
    
        if (r0.setPrivacyFsm(r1, r2) == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0166, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x014a, code lost:
    
        if (r1.setGatewayCache(r8, r2) == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011e, code lost:
    
        if (r1.setPrivacy(r9, r2) == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.unity3d.ads.core.domain.HandleGatewayUniversalResponse
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull UniversalResponseOuterClass.UniversalResponse universalResponse, @NotNull rq3<? super Unit> rq3Var) {
        AndroidHandleGatewayUniversalResponse$invoke$1 androidHandleGatewayUniversalResponse$invoke$1;
        int i;
        MutableDataOuterClass.MutableData mutableData;
        fdi fdiVar;
        Object value;
        AllowedPiiOuterClass.AllowedPii allowedPii;
        if (rq3Var instanceof AndroidHandleGatewayUniversalResponse$invoke$1) {
            androidHandleGatewayUniversalResponse$invoke$1 = (AndroidHandleGatewayUniversalResponse$invoke$1) rq3Var;
            int i2 = androidHandleGatewayUniversalResponse$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidHandleGatewayUniversalResponse$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidHandleGatewayUniversalResponse$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = androidHandleGatewayUniversalResponse$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    if (universalResponse.hasError()) {
                        ErrorOuterClass.PublicErrorCode errorCode = universalResponse.getError().getErrorCode();
                        errorCode.getClass();
                        String initErrorMsg = UnityAdsErrorKt.getInitErrorMsg(errorCode, this.sessionRepository.getGameId());
                        if (initErrorMsg == null) {
                            initErrorMsg = universalResponse.getError().getErrorText();
                        }
                        String str = initErrorMsg;
                        str.getClass();
                        IllegalStateException illegalStateException = new IllegalStateException(universalResponse.getError().getErrorText());
                        String errorText = universalResponse.getError().getErrorText();
                        ErrorOuterClass.PublicErrorCode errorCode2 = universalResponse.getError().getErrorCode();
                        ErrorOuterClass.Error error = universalResponse.getError();
                        error.getClass();
                        throw new GatewayException(str, illegalStateException, "gateway_universal", errorText, errorCode2, ErrorExtensionsKt.getErrorTokenOrNull(error));
                    }
                    if (universalResponse.hasMutableData()) {
                        mutableData = universalResponse.getMutableData();
                        f1d allowedPii2 = this.deviceInfoRepository.getAllowedPii();
                        do {
                            fdiVar = (fdi) allowedPii2;
                            value = fdiVar.getValue();
                            allowedPii = mutableData.getAllowedPii();
                            allowedPii.getClass();
                        } while (!fdiVar.k(value, allowedPii));
                        if (mutableData.getAllowedPii().getAppsetId()) {
                            this.appSetIdDataSource.invoke();
                        }
                        SessionRepository sessionRepository = this.sessionRepository;
                        ByteString currentState = mutableData.getCurrentState();
                        currentState.getClass();
                        sessionRepository.setGatewayState(currentState);
                        if (mutableData.hasSessionToken()) {
                            SessionRepository sessionRepository2 = this.sessionRepository;
                            ByteString sessionToken = mutableData.getSessionToken();
                            sessionToken.getClass();
                            sessionRepository2.setSessionToken(sessionToken);
                            UpdateAdQualitySessionToken updateAdQualitySessionToken = this.updateAdQualitySessionToken;
                            ByteString sessionToken2 = mutableData.getSessionToken();
                            sessionToken2.getClass();
                            updateAdQualitySessionToken.invoke(sessionToken2);
                        }
                        if (mutableData.hasPrivacy()) {
                            SessionRepository sessionRepository3 = this.sessionRepository;
                            ByteString privacy = mutableData.getPrivacy();
                            privacy.getClass();
                            androidHandleGatewayUniversalResponse$invoke$1.L$0 = mutableData;
                            androidHandleGatewayUniversalResponse$invoke$1.label = 1;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableData = (MutableDataOuterClass.MutableData) androidHandleGatewayUniversalResponse$invoke$1.L$0;
                    y6a.M(obj);
                    if (mutableData.hasPrivacyFsm()) {
                        SessionRepository sessionRepository4 = this.sessionRepository;
                        ByteString privacyFsm = mutableData.getPrivacyFsm();
                        privacyFsm.getClass();
                        androidHandleGatewayUniversalResponse$invoke$1.L$0 = null;
                        androidHandleGatewayUniversalResponse$invoke$1.label = 3;
                    }
                    return Unit.a;
                }
                mutableData = (MutableDataOuterClass.MutableData) androidHandleGatewayUniversalResponse$invoke$1.L$0;
                y6a.M(obj);
                if (mutableData.hasSessionCounters()) {
                    SessionRepository sessionRepository5 = this.sessionRepository;
                    SessionCountersOuterClass.SessionCounters sessionCounters = mutableData.getSessionCounters();
                    sessionCounters.getClass();
                    sessionRepository5.setSessionCounters(sessionCounters);
                }
                if (mutableData.hasCache()) {
                    SessionRepository sessionRepository6 = this.sessionRepository;
                    ByteString cache = mutableData.getCache();
                    cache.getClass();
                    androidHandleGatewayUniversalResponse$invoke$1.L$0 = mutableData;
                    androidHandleGatewayUniversalResponse$invoke$1.label = 2;
                }
                if (mutableData.hasPrivacyFsm()) {
                }
                return Unit.a;
            }
        }
        androidHandleGatewayUniversalResponse$invoke$1 = new AndroidHandleGatewayUniversalResponse$invoke$1(this, rq3Var);
        Object obj2 = androidHandleGatewayUniversalResponse$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidHandleGatewayUniversalResponse$invoke$1.label;
        if (i != 0) {
        }
        if (mutableData.hasSessionCounters()) {
        }
        if (mutableData.hasCache()) {
        }
        if (mutableData.hasPrivacyFsm()) {
        }
        return Unit.a;
    }
}
