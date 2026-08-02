package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Result;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.s3q0;
import xsna.spj;
import xsna.zcl;

/* compiled from: UniversalRequestEventSender.kt */
/* loaded from: classes14.dex */
public final class UniversalRequestEventSender {
    private final GatewayClient gatewayClient;
    private final HandleGatewayEventResponse handleGatewayEventResponse;
    private final OperationType operationType;
    private final UniversalRequestTtlValidator universalRequestTtlValidator;

    public UniversalRequestEventSender(GatewayClient gatewayClient, HandleGatewayEventResponse handleGatewayEventResponse, UniversalRequestTtlValidator universalRequestTtlValidator, OperationType operationType) {
        this.gatewayClient = gatewayClient;
        this.handleGatewayEventResponse = handleGatewayEventResponse;
        this.universalRequestTtlValidator = universalRequestTtlValidator;
        this.operationType = operationType;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|8|(1:(1:(3:12|13|14)(2:16|17))(1:18))(2:28|(2:30|31)(3:32|33|(2:35|26)))|19|20|(2:22|23)(1:24)))|39|6|7|8|(0)(0)|19|20|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r12.invoke((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r14, r6) == r9) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0038, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        r14 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, spj<? super s3q0> spjVar) {
        UniversalRequestEventSender$invoke$1 universalRequestEventSender$invoke$1;
        int i;
        Object failure;
        if (spjVar instanceof UniversalRequestEventSender$invoke$1) {
            universalRequestEventSender$invoke$1 = (UniversalRequestEventSender$invoke$1) spjVar;
            int i2 = universalRequestEventSender$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                universalRequestEventSender$invoke$1.label = i2 - Integer.MIN_VALUE;
                UniversalRequestEventSender$invoke$1 universalRequestEventSender$invoke$12 = universalRequestEventSender$invoke$1;
                Object obj = universalRequestEventSender$invoke$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = universalRequestEventSender$invoke$12.label;
                if (i != 0) {
                    a.a(obj);
                    if (!this.universalRequestTtlValidator.invoke(universalRequest, requestPolicy)) {
                        return s3q0.a;
                    }
                    GatewayClient gatewayClient = this.gatewayClient;
                    OperationType operationType = this.operationType;
                    universalRequestEventSender$invoke$12.label = 1;
                    obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, requestPolicy, operationType, universalRequestEventSender$invoke$12, 1, null);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a.a(obj);
                        return s3q0.a;
                    }
                    a.a(obj);
                }
                failure = (UniversalResponseOuterClass.UniversalResponse) obj;
                if (!(Result.a(failure) instanceof GatewayException)) {
                    return s3q0.a;
                }
                HandleGatewayEventResponse handleGatewayEventResponse = this.handleGatewayEventResponse;
                a.a(failure);
                universalRequestEventSender$invoke$12.label = 2;
            }
        }
        universalRequestEventSender$invoke$1 = new UniversalRequestEventSender$invoke$1(this, spjVar);
        UniversalRequestEventSender$invoke$1 universalRequestEventSender$invoke$122 = universalRequestEventSender$invoke$1;
        Object obj2 = universalRequestEventSender$invoke$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = universalRequestEventSender$invoke$122.label;
        if (i != 0) {
        }
        failure = (UniversalResponseOuterClass.UniversalResponse) obj2;
        if (!(Result.a(failure) instanceof GatewayException)) {
        }
    }

    public /* synthetic */ UniversalRequestEventSender(GatewayClient gatewayClient, HandleGatewayEventResponse handleGatewayEventResponse, UniversalRequestTtlValidator universalRequestTtlValidator, OperationType operationType, int i, zcl zclVar) {
        this(gatewayClient, handleGatewayEventResponse, universalRequestTtlValidator, (i & 8) != 0 ? OperationType.UNIVERSAL_EVENT : operationType);
    }
}
