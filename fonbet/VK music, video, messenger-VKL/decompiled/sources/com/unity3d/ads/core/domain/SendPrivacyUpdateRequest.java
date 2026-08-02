package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* compiled from: SendPrivacyUpdateRequest.kt */
/* loaded from: classes14.dex */
public final class SendPrivacyUpdateRequest {
    private final GatewayClient gatewayClient;
    private final GetPrivacyUpdateRequest getPrivacyUpdateRequest;
    private final GetRequestPolicy getRequestPolicy;

    public SendPrivacyUpdateRequest(GetPrivacyUpdateRequest getPrivacyUpdateRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient) {
        this.getPrivacyUpdateRequest = getPrivacyUpdateRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r12 != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r12 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(int i, ByteString byteString, spj<? super PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse> spjVar) {
        SendPrivacyUpdateRequest$invoke$1 sendPrivacyUpdateRequest$invoke$1;
        int i2;
        if (spjVar instanceof SendPrivacyUpdateRequest$invoke$1) {
            sendPrivacyUpdateRequest$invoke$1 = (SendPrivacyUpdateRequest$invoke$1) spjVar;
            int i3 = sendPrivacyUpdateRequest$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sendPrivacyUpdateRequest$invoke$1.label = i3 - Integer.MIN_VALUE;
                SendPrivacyUpdateRequest$invoke$1 sendPrivacyUpdateRequest$invoke$12 = sendPrivacyUpdateRequest$invoke$1;
                Object obj = sendPrivacyUpdateRequest$invoke$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = sendPrivacyUpdateRequest$invoke$12.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    GetPrivacyUpdateRequest getPrivacyUpdateRequest = this.getPrivacyUpdateRequest;
                    sendPrivacyUpdateRequest$invoke$12.label = 1;
                    obj = getPrivacyUpdateRequest.invoke(i, byteString, sendPrivacyUpdateRequest$invoke$12);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return ((UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getPrivacyUpdateResponse();
                    }
                    kotlin.a.a(obj);
                }
                RequestPolicy invoke = this.getRequestPolicy.invoke();
                GatewayClient gatewayClient = this.gatewayClient;
                OperationType operationType = OperationType.PRIVACY_UPDATE;
                sendPrivacyUpdateRequest$invoke$12.label = 2;
                obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, (UniversalRequestOuterClass.UniversalRequest) obj, invoke, operationType, sendPrivacyUpdateRequest$invoke$12, 1, null);
            }
        }
        sendPrivacyUpdateRequest$invoke$1 = new SendPrivacyUpdateRequest$invoke$1(this, spjVar);
        SendPrivacyUpdateRequest$invoke$1 sendPrivacyUpdateRequest$invoke$122 = sendPrivacyUpdateRequest$invoke$1;
        Object obj2 = sendPrivacyUpdateRequest$invoke$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
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
