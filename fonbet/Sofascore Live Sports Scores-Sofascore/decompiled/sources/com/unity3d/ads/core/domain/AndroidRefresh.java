package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.gatewayclient.GatewayClient;
import defpackage.a70;
import defpackage.au3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidRefresh;", "Lcom/unity3d/ads/core/domain/Refresh;", "Lau3;", "defaultDispatcher", "Lcom/unity3d/ads/core/domain/GetAdDataRefreshRequest;", "getAdDataRefreshRequest", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getRequestPolicy", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "gatewayClient", "<init>", "(Lau3;Lcom/unity3d/ads/core/domain/GetAdDataRefreshRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;)V", "Lcom/google/protobuf/ByteString;", "opportunityId", HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "invoke", "(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lrq3;)Ljava/lang/Object;", "Lau3;", "Lcom/unity3d/ads/core/domain/GetAdDataRefreshRequest;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidRefresh implements Refresh {

    @NotNull
    private final au3 defaultDispatcher;

    @NotNull
    private final GatewayClient gatewayClient;

    @NotNull
    private final GetAdDataRefreshRequest getAdDataRefreshRequest;

    @NotNull
    private final GetRequestPolicy getRequestPolicy;

    public AndroidRefresh(@NotNull au3 au3Var, @NotNull GetAdDataRefreshRequest getAdDataRefreshRequest, @NotNull GetRequestPolicy getRequestPolicy, @NotNull GatewayClient gatewayClient) {
        au3Var.getClass();
        getAdDataRefreshRequest.getClass();
        getRequestPolicy.getClass();
        gatewayClient.getClass();
        this.defaultDispatcher = au3Var;
        this.getAdDataRefreshRequest = getAdDataRefreshRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.core.domain.Refresh
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull ByteString byteString, @NotNull ByteString byteString2, @NotNull rq3<? super AdDataRefreshResponseOuterClass.AdDataRefreshResponse> rq3Var) {
        AndroidRefresh$invoke$1 androidRefresh$invoke$1;
        int i;
        if (rq3Var instanceof AndroidRefresh$invoke$1) {
            androidRefresh$invoke$1 = (AndroidRefresh$invoke$1) rq3Var;
            int i2 = androidRefresh$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidRefresh$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidRefresh$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = androidRefresh$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    au3 au3Var = this.defaultDispatcher;
                    AndroidRefresh$invoke$2 androidRefresh$invoke$2 = new AndroidRefresh$invoke$2(this, byteString2, byteString, null);
                    androidRefresh$invoke$1.label = 1;
                    obj = xw3.R(au3Var, androidRefresh$invoke$2, androidRefresh$invoke$1);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                obj.getClass();
                return obj;
            }
        }
        androidRefresh$invoke$1 = new AndroidRefresh$invoke$1(this, rq3Var);
        Object obj2 = androidRefresh$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidRefresh$invoke$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }
}
