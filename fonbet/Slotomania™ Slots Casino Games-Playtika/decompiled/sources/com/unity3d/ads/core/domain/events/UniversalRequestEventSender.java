package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UniversalRequestEventSender.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "handleGatewayEventResponse", "Lcom/unity3d/ads/core/domain/events/HandleGatewayEventResponse;", "universalRequestTtlValidator", "Lcom/unity3d/ads/core/domain/events/UniversalRequestTtlValidator;", "operationType", "Lcom/unity3d/ads/core/data/model/OperationType;", "(Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/events/HandleGatewayEventResponse;Lcom/unity3d/ads/core/domain/events/UniversalRequestTtlValidator;Lcom/unity3d/ads/core/data/model/OperationType;)V", "invoke", "", "universalRequest", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "requestPolicy", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;Lcom/unity3d/ads/gatewayclient/RequestPolicy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UniversalRequestEventSender {
    private final GatewayClient gatewayClient;
    private final HandleGatewayEventResponse handleGatewayEventResponse;
    private final OperationType operationType;
    private final UniversalRequestTtlValidator universalRequestTtlValidator;

    public UniversalRequestEventSender(GatewayClient gatewayClient, HandleGatewayEventResponse handleGatewayEventResponse, UniversalRequestTtlValidator universalRequestTtlValidator, OperationType operationType) {
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        Intrinsics.checkNotNullParameter(handleGatewayEventResponse, "handleGatewayEventResponse");
        Intrinsics.checkNotNullParameter(universalRequestTtlValidator, "universalRequestTtlValidator");
        Intrinsics.checkNotNullParameter(operationType, "operationType");
        this.gatewayClient = gatewayClient;
        this.handleGatewayEventResponse = handleGatewayEventResponse;
        this.universalRequestTtlValidator = universalRequestTtlValidator;
        this.operationType = operationType;
    }

    public /* synthetic */ UniversalRequestEventSender(GatewayClient gatewayClient, HandleGatewayEventResponse handleGatewayEventResponse, UniversalRequestTtlValidator universalRequestTtlValidator, OperationType operationType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gatewayClient, handleGatewayEventResponse, universalRequestTtlValidator, (i & 8) != 0 ? OperationType.UNIVERSAL_EVENT : operationType);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (r12.invoke((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13, r6) == r9) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, Continuation<? super Unit> continuation) {
        UniversalRequestEventSender$invoke$1 universalRequestEventSender$invoke$1;
        int i;
        Throwable th;
        UniversalRequestEventSender universalRequestEventSender;
        Object m11180constructorimpl;
        if (continuation instanceof UniversalRequestEventSender$invoke$1) {
            universalRequestEventSender$invoke$1 = (UniversalRequestEventSender$invoke$1) continuation;
            if ((universalRequestEventSender$invoke$1.label & Integer.MIN_VALUE) != 0) {
                universalRequestEventSender$invoke$1.label -= Integer.MIN_VALUE;
                UniversalRequestEventSender$invoke$1 universalRequestEventSender$invoke$12 = universalRequestEventSender$invoke$1;
                Object obj = universalRequestEventSender$invoke$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = universalRequestEventSender$invoke$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.universalRequestTtlValidator.invoke(universalRequest, requestPolicy)) {
                        return Unit.INSTANCE;
                    }
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        UniversalRequestEventSender universalRequestEventSender2 = this;
                        GatewayClient gatewayClient = this.gatewayClient;
                        OperationType operationType = this.operationType;
                        universalRequestEventSender$invoke$12.L$0 = this;
                        universalRequestEventSender$invoke$12.label = 1;
                        obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, requestPolicy, operationType, universalRequestEventSender$invoke$12, 1, null);
                        if (obj != coroutine_suspended) {
                            universalRequestEventSender = this;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        universalRequestEventSender = this;
                        Result.Companion companion2 = Result.INSTANCE;
                        m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
                        if (!(Result.m11183exceptionOrNullimpl(m11180constructorimpl) instanceof GatewayException)) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                universalRequestEventSender = (UniversalRequestEventSender) universalRequestEventSender$invoke$12.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th3) {
                    th = th3;
                    Result.Companion companion22 = Result.INSTANCE;
                    m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
                    if (!(Result.m11183exceptionOrNullimpl(m11180constructorimpl) instanceof GatewayException)) {
                    }
                }
                m11180constructorimpl = Result.m11180constructorimpl((UniversalResponseOuterClass.UniversalResponse) obj);
                if (!(Result.m11183exceptionOrNullimpl(m11180constructorimpl) instanceof GatewayException)) {
                    return Unit.INSTANCE;
                }
                HandleGatewayEventResponse handleGatewayEventResponse = universalRequestEventSender.handleGatewayEventResponse;
                ResultKt.throwOnFailure(m11180constructorimpl);
                universalRequestEventSender$invoke$12.L$0 = null;
                universalRequestEventSender$invoke$12.label = 2;
            }
        }
        universalRequestEventSender$invoke$1 = new UniversalRequestEventSender$invoke$1(this, continuation);
        UniversalRequestEventSender$invoke$1 universalRequestEventSender$invoke$122 = universalRequestEventSender$invoke$1;
        Object obj2 = universalRequestEventSender$invoke$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = universalRequestEventSender$invoke$122.label;
        if (i != 0) {
        }
        m11180constructorimpl = Result.m11180constructorimpl((UniversalResponseOuterClass.UniversalResponse) obj2);
        if (!(Result.m11183exceptionOrNullimpl(m11180constructorimpl) instanceof GatewayException)) {
        }
    }
}
