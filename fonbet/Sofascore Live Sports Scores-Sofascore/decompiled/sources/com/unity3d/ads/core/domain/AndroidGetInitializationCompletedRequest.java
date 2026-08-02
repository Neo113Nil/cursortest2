package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.coherence.CoherenceLibraryManager;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.InitializationCompletedEventRequestKt;
import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationCompletedRequest;", "Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/domain/coherence/CoherenceLibraryManager;", "coherenceLibraryManager", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/coherence/CoherenceLibraryManager;)V", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "invoke", "(Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/domain/coherence/CoherenceLibraryManager;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGetInitializationCompletedRequest implements GetInitializationCompletedRequest {

    @NotNull
    private final CoherenceLibraryManager coherenceLibraryManager;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidGetInitializationCompletedRequest(@NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull SessionRepository sessionRepository, @NotNull CoherenceLibraryManager coherenceLibraryManager) {
        getUniversalRequestForPayLoad.getClass();
        deviceInfoRepository.getClass();
        sessionRepository.getClass();
        coherenceLibraryManager.getClass();
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.coherenceLibraryManager = coherenceLibraryManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.domain.GetInitializationCompletedRequest
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull rq3<? super UniversalRequestOuterClass.UniversalRequest> rq3Var) {
        AndroidGetInitializationCompletedRequest$invoke$1 androidGetInitializationCompletedRequest$invoke$1;
        int i;
        InitializationCompletedEventRequestKt.Dsl _create;
        InitializationCompletedEventRequestKt.Dsl dsl;
        InitializationCompletedEventRequestKt.Dsl dsl2;
        byte[] commonAttributes;
        if (rq3Var instanceof AndroidGetInitializationCompletedRequest$invoke$1) {
            androidGetInitializationCompletedRequest$invoke$1 = (AndroidGetInitializationCompletedRequest$invoke$1) rq3Var;
            int i2 = androidGetInitializationCompletedRequest$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetInitializationCompletedRequest$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidGetInitializationCompletedRequest$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = androidGetInitializationCompletedRequest$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    InitializationCompletedEventRequestKt.Dsl.Companion companion = InitializationCompletedEventRequestKt.Dsl.INSTANCE;
                    InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder newBuilder = InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder();
                    newBuilder.getClass();
                    _create = companion._create(newBuilder);
                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    androidGetInitializationCompletedRequest$invoke$1.L$0 = _create;
                    androidGetInitializationCompletedRequest$invoke$1.L$1 = _create;
                    androidGetInitializationCompletedRequest$invoke$1.L$2 = _create;
                    androidGetInitializationCompletedRequest$invoke$1.label = 1;
                    obj = deviceInfoRepository.staticDeviceInfo(androidGetInitializationCompletedRequest$invoke$1);
                    if (obj != lu3Var) {
                        dsl = _create;
                        dsl2 = dsl;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                _create = (InitializationCompletedEventRequestKt.Dsl) androidGetInitializationCompletedRequest$invoke$1.L$2;
                dsl = (InitializationCompletedEventRequestKt.Dsl) androidGetInitializationCompletedRequest$invoke$1.L$1;
                dsl2 = (InitializationCompletedEventRequestKt.Dsl) androidGetInitializationCompletedRequest$invoke$1.L$0;
                y6a.M(obj);
                _create.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
                dsl.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
                if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getEnableCoherenceLibrary() && (commonAttributes = this.coherenceLibraryManager.getCommonAttributes()) != null) {
                    ByteString copyFrom = ByteString.copyFrom(commonAttributes);
                    copyFrom.getClass();
                    dsl.setCoherenceAttributes(copyFrom);
                }
                InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest _build = dsl2._build();
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder2 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                newBuilder2.getClass();
                UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(newBuilder2);
                _create2.setInitializationCompletedEventRequest(_build);
                UniversalRequestOuterClass.UniversalRequest.Payload _build2 = _create2._build();
                GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = this.getUniversalRequestForPayLoad;
                androidGetInitializationCompletedRequest$invoke$1.L$0 = null;
                androidGetInitializationCompletedRequest$invoke$1.L$1 = null;
                androidGetInitializationCompletedRequest$invoke$1.L$2 = null;
                androidGetInitializationCompletedRequest$invoke$1.label = 2;
                Object invoke = getUniversalRequestForPayLoad.invoke(_build2, androidGetInitializationCompletedRequest$invoke$1);
                return invoke != lu3Var ? lu3Var : invoke;
            }
        }
        androidGetInitializationCompletedRequest$invoke$1 = new AndroidGetInitializationCompletedRequest$invoke$1(this, rq3Var);
        Object obj2 = androidGetInitializationCompletedRequest$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidGetInitializationCompletedRequest$invoke$1.label;
        if (i != 0) {
        }
        _create.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj2);
        dsl.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
        if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getEnableCoherenceLibrary()) {
            ByteString copyFrom2 = ByteString.copyFrom(commonAttributes);
            copyFrom2.getClass();
            dsl.setCoherenceAttributes(copyFrom2);
        }
        InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest _build3 = dsl2._build();
        UniversalRequestKt universalRequestKt2 = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion22 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder22 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        newBuilder22.getClass();
        UniversalRequestKt.PayloadKt.Dsl _create22 = companion22._create(newBuilder22);
        _create22.setInitializationCompletedEventRequest(_build3);
        UniversalRequestOuterClass.UniversalRequest.Payload _build22 = _create22._build();
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2 = this.getUniversalRequestForPayLoad;
        androidGetInitializationCompletedRequest$invoke$1.L$0 = null;
        androidGetInitializationCompletedRequest$invoke$1.L$1 = null;
        androidGetInitializationCompletedRequest$invoke$1.L$2 = null;
        androidGetInitializationCompletedRequest$invoke$1.label = 2;
        Object invoke2 = getUniversalRequestForPayLoad2.invoke(_build22, androidGetInitializationCompletedRequest$invoke$1);
        if (invoke2 != lu3Var2) {
        }
    }
}
