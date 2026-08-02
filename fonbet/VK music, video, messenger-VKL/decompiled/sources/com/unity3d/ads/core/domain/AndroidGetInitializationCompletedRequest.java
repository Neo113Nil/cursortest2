package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.coherence.CoherenceLibraryManager;
import gatewayprotocol.v1.InitializationCompletedEventRequestKt;
import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* compiled from: AndroidGetInitializationCompletedRequest.kt */
/* loaded from: classes14.dex */
public final class AndroidGetInitializationCompletedRequest implements GetInitializationCompletedRequest {
    private final CoherenceLibraryManager coherenceLibraryManager;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final SessionRepository sessionRepository;

    public AndroidGetInitializationCompletedRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, CoherenceLibraryManager coherenceLibraryManager) {
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.coherenceLibraryManager = coherenceLibraryManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.core.domain.GetInitializationCompletedRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(spj<? super UniversalRequestOuterClass.UniversalRequest> spjVar) {
        AndroidGetInitializationCompletedRequest$invoke$1 androidGetInitializationCompletedRequest$invoke$1;
        int i;
        InitializationCompletedEventRequestKt.Dsl _create;
        InitializationCompletedEventRequestKt.Dsl dsl;
        InitializationCompletedEventRequestKt.Dsl dsl2;
        byte[] commonAttributes;
        if (spjVar instanceof AndroidGetInitializationCompletedRequest$invoke$1) {
            androidGetInitializationCompletedRequest$invoke$1 = (AndroidGetInitializationCompletedRequest$invoke$1) spjVar;
            int i2 = androidGetInitializationCompletedRequest$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetInitializationCompletedRequest$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidGetInitializationCompletedRequest$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidGetInitializationCompletedRequest$invoke$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    _create = InitializationCompletedEventRequestKt.Dsl.Companion._create(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder());
                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    androidGetInitializationCompletedRequest$invoke$1.L$0 = _create;
                    androidGetInitializationCompletedRequest$invoke$1.L$1 = _create;
                    androidGetInitializationCompletedRequest$invoke$1.L$2 = _create;
                    androidGetInitializationCompletedRequest$invoke$1.label = 1;
                    obj = deviceInfoRepository.staticDeviceInfo(androidGetInitializationCompletedRequest$invoke$1);
                    if (obj != coroutineSingletons) {
                        dsl = _create;
                        dsl2 = dsl;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return obj;
                }
                _create = (InitializationCompletedEventRequestKt.Dsl) androidGetInitializationCompletedRequest$invoke$1.L$2;
                dsl = (InitializationCompletedEventRequestKt.Dsl) androidGetInitializationCompletedRequest$invoke$1.L$1;
                dsl2 = (InitializationCompletedEventRequestKt.Dsl) androidGetInitializationCompletedRequest$invoke$1.L$0;
                kotlin.a.a(obj);
                _create.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
                dsl.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
                if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getEnableCoherenceLibrary() && (commonAttributes = this.coherenceLibraryManager.getCommonAttributes()) != null) {
                    dsl.setCoherenceAttributes(ByteString.copyFrom(commonAttributes));
                }
                InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest _build = dsl2._build();
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl _create2 = UniversalRequestKt.PayloadKt.Dsl.Companion._create(UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder());
                _create2.setInitializationCompletedEventRequest(_build);
                UniversalRequestOuterClass.UniversalRequest.Payload _build2 = _create2._build();
                GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = this.getUniversalRequestForPayLoad;
                androidGetInitializationCompletedRequest$invoke$1.L$0 = null;
                androidGetInitializationCompletedRequest$invoke$1.L$1 = null;
                androidGetInitializationCompletedRequest$invoke$1.L$2 = null;
                androidGetInitializationCompletedRequest$invoke$1.label = 2;
                Object invoke = getUniversalRequestForPayLoad.invoke(_build2, androidGetInitializationCompletedRequest$invoke$1);
                return invoke != coroutineSingletons ? coroutineSingletons : invoke;
            }
        }
        androidGetInitializationCompletedRequest$invoke$1 = new AndroidGetInitializationCompletedRequest$invoke$1(this, spjVar);
        Object obj2 = androidGetInitializationCompletedRequest$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidGetInitializationCompletedRequest$invoke$1.label;
        if (i != 0) {
        }
        _create.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj2);
        dsl.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
        if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getEnableCoherenceLibrary()) {
            dsl.setCoherenceAttributes(ByteString.copyFrom(commonAttributes));
        }
        InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest _build3 = dsl2._build();
        UniversalRequestKt universalRequestKt2 = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl _create22 = UniversalRequestKt.PayloadKt.Dsl.Companion._create(UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder());
        _create22.setInitializationCompletedEventRequest(_build3);
        UniversalRequestOuterClass.UniversalRequest.Payload _build22 = _create22._build();
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2 = this.getUniversalRequestForPayLoad;
        androidGetInitializationCompletedRequest$invoke$1.L$0 = null;
        androidGetInitializationCompletedRequest$invoke$1.L$1 = null;
        androidGetInitializationCompletedRequest$invoke$1.L$2 = null;
        androidGetInitializationCompletedRequest$invoke$1.label = 2;
        Object invoke2 = getUniversalRequestForPayLoad2.invoke(_build22, androidGetInitializationCompletedRequest$invoke$1);
        if (invoke2 != coroutineSingletons2) {
        }
    }
}
