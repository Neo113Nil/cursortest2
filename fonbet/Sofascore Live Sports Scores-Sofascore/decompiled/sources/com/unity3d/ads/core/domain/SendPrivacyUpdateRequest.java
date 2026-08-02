package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/domain/SendPrivacyUpdateRequest;", "", "Lcom/unity3d/ads/core/domain/GetPrivacyUpdateRequest;", "getPrivacyUpdateRequest", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getRequestPolicy", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "gatewayClient", "<init>", "(Lcom/unity3d/ads/core/domain/GetPrivacyUpdateRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;)V", "", "privacyUpdateVersion", "Lcom/google/protobuf/ByteString;", "privacyUpdateContent", "Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "invoke", "(ILcom/google/protobuf/ByteString;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetPrivacyUpdateRequest;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SendPrivacyUpdateRequest {

    @NotNull
    private final GatewayClient gatewayClient;

    @NotNull
    private final GetPrivacyUpdateRequest getPrivacyUpdateRequest;

    @NotNull
    private final GetRequestPolicy getRequestPolicy;

    public SendPrivacyUpdateRequest(@NotNull GetPrivacyUpdateRequest getPrivacyUpdateRequest, @NotNull GetRequestPolicy getRequestPolicy, @NotNull GatewayClient gatewayClient) {
        getPrivacyUpdateRequest.getClass();
        getRequestPolicy.getClass();
        gatewayClient.getClass();
        this.getPrivacyUpdateRequest = getPrivacyUpdateRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r12 != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (r12 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(int i, @NotNull ByteString byteString, @NotNull rq3<? super PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse> rq3Var) {
        SendPrivacyUpdateRequest$invoke$1 sendPrivacyUpdateRequest$invoke$1;
        int i2;
        if (rq3Var instanceof SendPrivacyUpdateRequest$invoke$1) {
            sendPrivacyUpdateRequest$invoke$1 = (SendPrivacyUpdateRequest$invoke$1) rq3Var;
            int i3 = sendPrivacyUpdateRequest$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sendPrivacyUpdateRequest$invoke$1.label = i3 - Integer.MIN_VALUE;
                SendPrivacyUpdateRequest$invoke$1 sendPrivacyUpdateRequest$invoke$12 = sendPrivacyUpdateRequest$invoke$1;
                Object obj = sendPrivacyUpdateRequest$invoke$12.result;
                lu3 lu3Var = lu3.a;
                i2 = sendPrivacyUpdateRequest$invoke$12.label;
                if (i2 != 0) {
                    y6a.M(obj);
                    GetPrivacyUpdateRequest getPrivacyUpdateRequest = this.getPrivacyUpdateRequest;
                    sendPrivacyUpdateRequest$invoke$12.label = 1;
                    obj = getPrivacyUpdateRequest.invoke(i, byteString, sendPrivacyUpdateRequest$invoke$12);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse = ((UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getPrivacyUpdateResponse();
                        privacyUpdateResponse.getClass();
                        return privacyUpdateResponse;
                    }
                    y6a.M(obj);
                }
                RequestPolicy invoke = this.getRequestPolicy.invoke();
                GatewayClient gatewayClient = this.gatewayClient;
                OperationType operationType = OperationType.PRIVACY_UPDATE;
                sendPrivacyUpdateRequest$invoke$12.label = 2;
                obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, (UniversalRequestOuterClass.UniversalRequest) obj, invoke, operationType, sendPrivacyUpdateRequest$invoke$12, 1, null);
            }
        }
        sendPrivacyUpdateRequest$invoke$1 = new SendPrivacyUpdateRequest$invoke$1(this, rq3Var);
        SendPrivacyUpdateRequest$invoke$1 sendPrivacyUpdateRequest$invoke$122 = sendPrivacyUpdateRequest$invoke$1;
        Object obj2 = sendPrivacyUpdateRequest$invoke$122.result;
        lu3 lu3Var2 = lu3.a;
        i2 = sendPrivacyUpdateRequest$invoke$122.label;
        if (i2 != 0) {
        }
        RequestPolicy invoke2 = this.getRequestPolicy.invoke();
        GatewayClient gatewayClient2 = this.gatewayClient;
        OperationType operationType2 = OperationType.PRIVACY_UPDATE;
        sendPrivacyUpdateRequest$invoke$122.label = 2;
        obj2 = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, (UniversalRequestOuterClass.UniversalRequest) obj2, invoke2, operationType2, sendPrivacyUpdateRequest$invoke$122, 1, null);
    }
}
