package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: AndroidHandleGatewayUniversalResponse.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleGatewayUniversalResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "appSetIdDataSource", "Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;)V", "invoke", "", "response", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidHandleGatewayUniversalResponse implements HandleGatewayUniversalResponse {
    private final AndroidAppSetIdDataSource appSetIdDataSource;
    private final DeviceInfoRepository deviceInfoRepository;
    private final SessionRepository sessionRepository;

    public AndroidHandleGatewayUniversalResponse(SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, AndroidAppSetIdDataSource appSetIdDataSource) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(appSetIdDataSource, "appSetIdDataSource");
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.appSetIdDataSource = appSetIdDataSource;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0171, code lost:
    
        if (r14.setPrivacyFsm(r13, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0173, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0152, code lost:
    
        if (r14.setGatewayCache(r5, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011f, code lost:
    
        if (r14.setPrivacy(r2, r0) == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.core.domain.HandleGatewayUniversalResponse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(UniversalResponseOuterClass.UniversalResponse universalResponse, Continuation<? super Unit> continuation) {
        AndroidHandleGatewayUniversalResponse$invoke$1 androidHandleGatewayUniversalResponse$invoke$1;
        int i;
        MutableDataOuterClass.MutableData mutableData;
        AllowedPiiOuterClass.AllowedPii value;
        AllowedPiiOuterClass.AllowedPii allowedPii;
        AndroidHandleGatewayUniversalResponse androidHandleGatewayUniversalResponse;
        if (continuation instanceof AndroidHandleGatewayUniversalResponse$invoke$1) {
            androidHandleGatewayUniversalResponse$invoke$1 = (AndroidHandleGatewayUniversalResponse$invoke$1) continuation;
            if ((androidHandleGatewayUniversalResponse$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidHandleGatewayUniversalResponse$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = androidHandleGatewayUniversalResponse$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidHandleGatewayUniversalResponse$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (universalResponse.hasError()) {
                        ErrorOuterClass.PublicErrorCode errorCode = universalResponse.getError().getErrorCode();
                        Intrinsics.checkNotNullExpressionValue(errorCode, "response.error.errorCode");
                        String initErrorMsg = UnityAdsErrorKt.getInitErrorMsg(errorCode, this.sessionRepository.getGameId());
                        if (initErrorMsg == null) {
                            initErrorMsg = universalResponse.getError().getErrorText();
                        }
                        String str = initErrorMsg;
                        Intrinsics.checkNotNullExpressionValue(str, "response.error.errorCode… response.error.errorText");
                        throw new GatewayException(str, new IllegalStateException(universalResponse.getError().getErrorText()), "gateway_universal", universalResponse.getError().getErrorText(), universalResponse.getError().getErrorCode());
                    }
                    if (universalResponse.hasMutableData()) {
                        mutableData = universalResponse.getMutableData();
                        MutableStateFlow<AllowedPiiOuterClass.AllowedPii> allowedPii2 = this.deviceInfoRepository.getAllowedPii();
                        do {
                            value = allowedPii2.getValue();
                            allowedPii = mutableData.getAllowedPii();
                            Intrinsics.checkNotNullExpressionValue(allowedPii, "mutableData.allowedPii");
                        } while (!allowedPii2.compareAndSet(value, allowedPii));
                        if (mutableData.getAllowedPii().getAppsetId()) {
                            this.appSetIdDataSource.invoke();
                        }
                        SessionRepository sessionRepository = this.sessionRepository;
                        ByteString currentState = mutableData.getCurrentState();
                        Intrinsics.checkNotNullExpressionValue(currentState, "mutableData.currentState");
                        sessionRepository.setGatewayState(currentState);
                        if (mutableData.hasSessionToken()) {
                            SessionRepository sessionRepository2 = this.sessionRepository;
                            ByteString sessionToken = mutableData.getSessionToken();
                            Intrinsics.checkNotNullExpressionValue(sessionToken, "mutableData.sessionToken");
                            sessionRepository2.setSessionToken(sessionToken);
                        }
                        if (mutableData.hasPrivacy()) {
                            SessionRepository sessionRepository3 = this.sessionRepository;
                            ByteString privacy = mutableData.getPrivacy();
                            Intrinsics.checkNotNullExpressionValue(privacy, "mutableData.privacy");
                            androidHandleGatewayUniversalResponse$invoke$1.L$0 = this;
                            androidHandleGatewayUniversalResponse$invoke$1.L$1 = mutableData;
                            androidHandleGatewayUniversalResponse$invoke$1.label = 1;
                        }
                        androidHandleGatewayUniversalResponse = this;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    mutableData = (MutableDataOuterClass.MutableData) androidHandleGatewayUniversalResponse$invoke$1.L$1;
                    androidHandleGatewayUniversalResponse = (AndroidHandleGatewayUniversalResponse) androidHandleGatewayUniversalResponse$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (mutableData.hasPrivacyFsm()) {
                        SessionRepository sessionRepository4 = androidHandleGatewayUniversalResponse.sessionRepository;
                        ByteString privacyFsm = mutableData.getPrivacyFsm();
                        Intrinsics.checkNotNullExpressionValue(privacyFsm, "mutableData.privacyFsm");
                        androidHandleGatewayUniversalResponse$invoke$1.L$0 = null;
                        androidHandleGatewayUniversalResponse$invoke$1.L$1 = null;
                        androidHandleGatewayUniversalResponse$invoke$1.label = 3;
                    }
                    return Unit.INSTANCE;
                }
                mutableData = (MutableDataOuterClass.MutableData) androidHandleGatewayUniversalResponse$invoke$1.L$1;
                androidHandleGatewayUniversalResponse = (AndroidHandleGatewayUniversalResponse) androidHandleGatewayUniversalResponse$invoke$1.L$0;
                ResultKt.throwOnFailure(obj);
                if (mutableData.hasSessionCounters()) {
                    SessionRepository sessionRepository5 = androidHandleGatewayUniversalResponse.sessionRepository;
                    SessionCountersOuterClass.SessionCounters sessionCounters = mutableData.getSessionCounters();
                    Intrinsics.checkNotNullExpressionValue(sessionCounters, "mutableData.sessionCounters");
                    sessionRepository5.setSessionCounters(sessionCounters);
                }
                if (mutableData.hasCache()) {
                    SessionRepository sessionRepository6 = androidHandleGatewayUniversalResponse.sessionRepository;
                    ByteString cache = mutableData.getCache();
                    Intrinsics.checkNotNullExpressionValue(cache, "mutableData.cache");
                    androidHandleGatewayUniversalResponse$invoke$1.L$0 = androidHandleGatewayUniversalResponse;
                    androidHandleGatewayUniversalResponse$invoke$1.L$1 = mutableData;
                    androidHandleGatewayUniversalResponse$invoke$1.label = 2;
                }
                if (mutableData.hasPrivacyFsm()) {
                }
                return Unit.INSTANCE;
            }
        }
        androidHandleGatewayUniversalResponse$invoke$1 = new AndroidHandleGatewayUniversalResponse$invoke$1(this, continuation);
        Object obj2 = androidHandleGatewayUniversalResponse$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidHandleGatewayUniversalResponse$invoke$1.label;
        if (i != 0) {
        }
        if (mutableData.hasSessionCounters()) {
        }
        if (mutableData.hasCache()) {
        }
        if (mutableData.hasPrivacyFsm()) {
        }
        return Unit.INSTANCE;
    }
}
