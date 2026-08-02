package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.adquality.UpdateAdQualitySessionToken;
import com.unity3d.ads.core.extensions.ErrorExtensionsKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.s3q0;
import xsna.spj;
import xsna.xh50;

/* compiled from: AndroidHandleGatewayUniversalResponse.kt */
/* loaded from: classes14.dex */
public final class AndroidHandleGatewayUniversalResponse implements HandleGatewayUniversalResponse {
    private final AndroidAppSetIdDataSource appSetIdDataSource;
    private final DeviceInfoRepository deviceInfoRepository;
    private final SessionRepository sessionRepository;
    private final UpdateAdQualitySessionToken updateAdQualitySessionToken;

    public AndroidHandleGatewayUniversalResponse(SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, AndroidAppSetIdDataSource androidAppSetIdDataSource, UpdateAdQualitySessionToken updateAdQualitySessionToken) {
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.appSetIdDataSource = androidAppSetIdDataSource;
        this.updateAdQualitySessionToken = updateAdQualitySessionToken;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x013e, code lost:
    
        if (r15.setPrivacyFsm(r14, r0) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0140, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0126, code lost:
    
        if (r15.setGatewayCache(r2, r0) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:
    
        if (r15.setPrivacy(r2, r0) == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.domain.HandleGatewayUniversalResponse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(UniversalResponseOuterClass.UniversalResponse universalResponse, spj<? super s3q0> spjVar) {
        AndroidHandleGatewayUniversalResponse$invoke$1 androidHandleGatewayUniversalResponse$invoke$1;
        int i;
        MutableDataOuterClass.MutableData mutableData;
        if (spjVar instanceof AndroidHandleGatewayUniversalResponse$invoke$1) {
            androidHandleGatewayUniversalResponse$invoke$1 = (AndroidHandleGatewayUniversalResponse$invoke$1) spjVar;
            int i2 = androidHandleGatewayUniversalResponse$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidHandleGatewayUniversalResponse$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidHandleGatewayUniversalResponse$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidHandleGatewayUniversalResponse$invoke$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (universalResponse.hasError()) {
                        String initErrorMsg = UnityAdsErrorKt.getInitErrorMsg(universalResponse.getError().getErrorCode(), this.sessionRepository.getGameId());
                        if (initErrorMsg == null) {
                            initErrorMsg = universalResponse.getError().getErrorText();
                        }
                        throw new GatewayException(initErrorMsg, new IllegalStateException(universalResponse.getError().getErrorText()), "gateway_universal", universalResponse.getError().getErrorText(), universalResponse.getError().getErrorCode(), ErrorExtensionsKt.getErrorTokenOrNull(universalResponse.getError()));
                    }
                    if (universalResponse.hasMutableData()) {
                        mutableData = universalResponse.getMutableData();
                        xh50<AllowedPiiOuterClass.AllowedPii> allowedPii = this.deviceInfoRepository.getAllowedPii();
                        while (!allowedPii.compareAndSet(allowedPii.getValue(), mutableData.getAllowedPii())) {
                        }
                        if (mutableData.getAllowedPii().getAppsetId()) {
                            this.appSetIdDataSource.invoke();
                        }
                        this.sessionRepository.setGatewayState(mutableData.getCurrentState());
                        if (mutableData.hasSessionToken()) {
                            this.sessionRepository.setSessionToken(mutableData.getSessionToken());
                            this.updateAdQualitySessionToken.invoke(mutableData.getSessionToken());
                        }
                        if (mutableData.hasPrivacy()) {
                            SessionRepository sessionRepository = this.sessionRepository;
                            ByteString privacy = mutableData.getPrivacy();
                            androidHandleGatewayUniversalResponse$invoke$1.L$0 = mutableData;
                            androidHandleGatewayUniversalResponse$invoke$1.label = 1;
                        }
                    }
                    return s3q0.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    mutableData = (MutableDataOuterClass.MutableData) androidHandleGatewayUniversalResponse$invoke$1.L$0;
                    kotlin.a.a(obj);
                    if (mutableData.hasPrivacyFsm()) {
                        SessionRepository sessionRepository2 = this.sessionRepository;
                        ByteString privacyFsm = mutableData.getPrivacyFsm();
                        androidHandleGatewayUniversalResponse$invoke$1.L$0 = null;
                        androidHandleGatewayUniversalResponse$invoke$1.label = 3;
                    }
                    return s3q0.a;
                }
                mutableData = (MutableDataOuterClass.MutableData) androidHandleGatewayUniversalResponse$invoke$1.L$0;
                kotlin.a.a(obj);
                if (mutableData.hasSessionCounters()) {
                    this.sessionRepository.setSessionCounters(mutableData.getSessionCounters());
                }
                if (mutableData.hasCache()) {
                    SessionRepository sessionRepository3 = this.sessionRepository;
                    ByteString cache = mutableData.getCache();
                    androidHandleGatewayUniversalResponse$invoke$1.L$0 = mutableData;
                    androidHandleGatewayUniversalResponse$invoke$1.label = 2;
                }
                if (mutableData.hasPrivacyFsm()) {
                }
                return s3q0.a;
            }
        }
        androidHandleGatewayUniversalResponse$invoke$1 = new AndroidHandleGatewayUniversalResponse$invoke$1(this, spjVar);
        Object obj2 = androidHandleGatewayUniversalResponse$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidHandleGatewayUniversalResponse$invoke$1.label;
        if (i != 0) {
        }
        if (mutableData.hasSessionCounters()) {
        }
        if (mutableData.hasCache()) {
        }
        if (mutableData.hasPrivacyFsm()) {
        }
        return s3q0.a;
    }
}
