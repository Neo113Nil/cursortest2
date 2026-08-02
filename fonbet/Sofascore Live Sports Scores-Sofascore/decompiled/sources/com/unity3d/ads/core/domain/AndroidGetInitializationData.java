package com.unity3d.ads.core.domain;

import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.InitializationDataKt;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationData;", "Lcom/unity3d/ads/core/domain/GetInitializationData;", "Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;", "getInitializeRequestPayload", "Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;", "getUniversalRequestSharedData", "<init>", "(Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;)V", "Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "invoke", "(Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGetInitializationData implements GetInitializationData {

    @NotNull
    private final GetInitializationRequestPayload getInitializeRequestPayload;

    @NotNull
    private final GetUniversalRequestSharedData getUniversalRequestSharedData;

    public AndroidGetInitializationData(@NotNull GetInitializationRequestPayload getInitializationRequestPayload, @NotNull GetUniversalRequestSharedData getUniversalRequestSharedData) {
        getInitializationRequestPayload.getClass();
        getUniversalRequestSharedData.getClass();
        this.getInitializeRequestPayload = getInitializationRequestPayload;
        this.getUniversalRequestSharedData = getUniversalRequestSharedData;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.domain.GetInitializationData
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull rq3<? super InitializationDataOuterClass.InitializationData> rq3Var) {
        AndroidGetInitializationData$invoke$1 androidGetInitializationData$invoke$1;
        Object obj;
        lu3 lu3Var;
        int i;
        InitializationDataKt.Dsl _create;
        InitializationDataKt.Dsl dsl;
        InitializationDataKt.Dsl dsl2;
        InitializationDataKt.Dsl dsl3;
        InitializationDataKt.Dsl dsl4;
        if (rq3Var instanceof AndroidGetInitializationData$invoke$1) {
            androidGetInitializationData$invoke$1 = (AndroidGetInitializationData$invoke$1) rq3Var;
            int i2 = androidGetInitializationData$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetInitializationData$invoke$1.label = i2 - Integer.MIN_VALUE;
                obj = androidGetInitializationData$invoke$1.result;
                lu3Var = lu3.a;
                i = androidGetInitializationData$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    InitializationDataKt.Dsl.Companion companion = InitializationDataKt.Dsl.INSTANCE;
                    InitializationDataOuterClass.InitializationData.Builder newBuilder = InitializationDataOuterClass.InitializationData.newBuilder();
                    newBuilder.getClass();
                    _create = companion._create(newBuilder);
                    GetInitializationRequestPayload getInitializationRequestPayload = this.getInitializeRequestPayload;
                    androidGetInitializationData$invoke$1.L$0 = _create;
                    androidGetInitializationData$invoke$1.L$1 = _create;
                    androidGetInitializationData$invoke$1.L$2 = _create;
                    androidGetInitializationData$invoke$1.label = 1;
                    obj = getInitializationRequestPayload.invoke(androidGetInitializationData$invoke$1);
                    if (obj != lu3Var) {
                        dsl = _create;
                        dsl2 = dsl;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dsl3 = (InitializationDataKt.Dsl) androidGetInitializationData$invoke$1.L$1;
                    dsl4 = (InitializationDataKt.Dsl) androidGetInitializationData$invoke$1.L$0;
                    y6a.M(obj);
                    dsl3.setSharedData((UniversalRequestOuterClass.UniversalRequest.SharedData) obj);
                    return dsl4._build();
                }
                InitializationDataKt.Dsl dsl5 = (InitializationDataKt.Dsl) androidGetInitializationData$invoke$1.L$2;
                InitializationDataKt.Dsl dsl6 = (InitializationDataKt.Dsl) androidGetInitializationData$invoke$1.L$1;
                dsl2 = (InitializationDataKt.Dsl) androidGetInitializationData$invoke$1.L$0;
                y6a.M(obj);
                dsl = dsl5;
                _create = dsl6;
                dsl.setInitializationRequest((InitializationRequestOuterClass.InitializationRequest) obj);
                GetUniversalRequestSharedData getUniversalRequestSharedData = this.getUniversalRequestSharedData;
                androidGetInitializationData$invoke$1.L$0 = dsl2;
                androidGetInitializationData$invoke$1.L$1 = _create;
                androidGetInitializationData$invoke$1.L$2 = null;
                androidGetInitializationData$invoke$1.label = 2;
                obj = getUniversalRequestSharedData.invoke(androidGetInitializationData$invoke$1);
                if (obj != lu3Var) {
                    dsl3 = _create;
                    dsl4 = dsl2;
                    dsl3.setSharedData((UniversalRequestOuterClass.UniversalRequest.SharedData) obj);
                    return dsl4._build();
                }
                return lu3Var;
            }
        }
        androidGetInitializationData$invoke$1 = new AndroidGetInitializationData$invoke$1(this, rq3Var);
        obj = androidGetInitializationData$invoke$1.result;
        lu3Var = lu3.a;
        i = androidGetInitializationData$invoke$1.label;
        if (i != 0) {
        }
        dsl.setInitializationRequest((InitializationRequestOuterClass.InitializationRequest) obj);
        GetUniversalRequestSharedData getUniversalRequestSharedData2 = this.getUniversalRequestSharedData;
        androidGetInitializationData$invoke$1.L$0 = dsl2;
        androidGetInitializationData$invoke$1.L$1 = _create;
        androidGetInitializationData$invoke$1.L$2 = null;
        androidGetInitializationData$invoke$1.label = 2;
        obj = getUniversalRequestSharedData2.invoke(androidGetInitializationData$invoke$1);
        if (obj != lu3Var) {
        }
        return lu3Var;
    }
}
