package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import defpackage.a70;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.w2g;
import defpackage.y6a;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "gatewayClient", "Lcom/unity3d/ads/core/domain/events/HandleGatewayEventResponse;", "handleGatewayEventResponse", "Lcom/unity3d/ads/core/domain/events/UniversalRequestTtlValidator;", "universalRequestTtlValidator", "Lcom/unity3d/ads/core/data/model/OperationType;", "operationType", "<init>", "(Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/events/HandleGatewayEventResponse;Lcom/unity3d/ads/core/domain/events/UniversalRequestTtlValidator;Lcom/unity3d/ads/core/data/model/OperationType;)V", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "universalRequest", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "requestPolicy", "", "invoke", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;Lcom/unity3d/ads/gatewayclient/RequestPolicy;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "Lcom/unity3d/ads/core/domain/events/HandleGatewayEventResponse;", "Lcom/unity3d/ads/core/domain/events/UniversalRequestTtlValidator;", "Lcom/unity3d/ads/core/data/model/OperationType;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UniversalRequestEventSender {

    @NotNull
    private final GatewayClient gatewayClient;

    @NotNull
    private final HandleGatewayEventResponse handleGatewayEventResponse;

    @NotNull
    private final OperationType operationType;

    @NotNull
    private final UniversalRequestTtlValidator universalRequestTtlValidator;

    public UniversalRequestEventSender(@NotNull GatewayClient gatewayClient, @NotNull HandleGatewayEventResponse handleGatewayEventResponse, @NotNull UniversalRequestTtlValidator universalRequestTtlValidator, @NotNull OperationType operationType) {
        gatewayClient.getClass();
        handleGatewayEventResponse.getClass();
        universalRequestTtlValidator.getClass();
        operationType.getClass();
        this.gatewayClient = gatewayClient;
        this.handleGatewayEventResponse = handleGatewayEventResponse;
        this.universalRequestTtlValidator = universalRequestTtlValidator;
        this.operationType = operationType;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|8|(1:(1:(3:12|13|14)(2:16|17))(1:18))(2:28|(2:30|31)(2:32|(2:34|26)))|19|20|(2:22|23)(1:24)))|38|6|7|8|(0)(0)|19|20|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        if (r11.invoke((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r14, r6) == r9) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0037, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0062, code lost:
    
        r13 = defpackage.w2g.b;
        r14 = new defpackage.u2g(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(@NotNull UniversalRequestOuterClass.UniversalRequest universalRequest, @NotNull RequestPolicy requestPolicy, @NotNull rq3<? super Unit> rq3Var) {
        UniversalRequestEventSender$invoke$1 universalRequestEventSender$invoke$1;
        int i;
        Object u2gVar;
        if (rq3Var instanceof UniversalRequestEventSender$invoke$1) {
            universalRequestEventSender$invoke$1 = (UniversalRequestEventSender$invoke$1) rq3Var;
            int i2 = universalRequestEventSender$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                universalRequestEventSender$invoke$1.label = i2 - Integer.MIN_VALUE;
                UniversalRequestEventSender$invoke$1 universalRequestEventSender$invoke$12 = universalRequestEventSender$invoke$1;
                Object obj = universalRequestEventSender$invoke$12.result;
                lu3 lu3Var = lu3.a;
                i = universalRequestEventSender$invoke$12.label;
                if (i != 0) {
                    y6a.M(obj);
                    if (!this.universalRequestTtlValidator.invoke(universalRequest, requestPolicy)) {
                        return Unit.a;
                    }
                    p2g p2gVar = w2g.b;
                    GatewayClient gatewayClient = this.gatewayClient;
                    OperationType operationType = this.operationType;
                    universalRequestEventSender$invoke$12.label = 1;
                    obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, requestPolicy, operationType, universalRequestEventSender$invoke$12, 1, null);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                u2gVar = (UniversalResponseOuterClass.UniversalResponse) obj;
                p2g p2gVar2 = w2g.b;
                if (!(w2g.a(u2gVar) instanceof GatewayException)) {
                    return Unit.a;
                }
                HandleGatewayEventResponse handleGatewayEventResponse = this.handleGatewayEventResponse;
                y6a.M(u2gVar);
                universalRequestEventSender$invoke$12.label = 2;
            }
        }
        universalRequestEventSender$invoke$1 = new UniversalRequestEventSender$invoke$1(this, rq3Var);
        UniversalRequestEventSender$invoke$1 universalRequestEventSender$invoke$122 = universalRequestEventSender$invoke$1;
        Object obj2 = universalRequestEventSender$invoke$122.result;
        lu3 lu3Var2 = lu3.a;
        i = universalRequestEventSender$invoke$122.label;
        if (i != 0) {
        }
        u2gVar = (UniversalResponseOuterClass.UniversalResponse) obj2;
        p2g p2gVar22 = w2g.b;
        if (!(w2g.a(u2gVar) instanceof GatewayException)) {
        }
    }

    public /* synthetic */ UniversalRequestEventSender(GatewayClient gatewayClient, HandleGatewayEventResponse handleGatewayEventResponse, UniversalRequestTtlValidator universalRequestTtlValidator, OperationType operationType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gatewayClient, handleGatewayEventResponse, universalRequestTtlValidator, (i & 8) != 0 ? OperationType.UNIVERSAL_EVENT : operationType);
    }
}
