package spay.sdk.domain.model.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J?\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lspay/sdk/domain/model/response/BindingSessionId;", "", "sessionId", "", "cardRegion", "Lspay/sdk/domain/model/response/CardRegion;", "checkResult", "Lspay/sdk/domain/model/response/BindingCheckResult;", "fraudMonCheckResult", "Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;", "features", "Lspay/sdk/domain/model/response/BindingPaymentFeatures;", "(Ljava/lang/String;Lspay/sdk/domain/model/response/CardRegion;Lspay/sdk/domain/model/response/BindingCheckResult;Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;Lspay/sdk/domain/model/response/BindingPaymentFeatures;)V", "getCardRegion", "()Lspay/sdk/domain/model/response/CardRegion;", "getCheckResult", "()Lspay/sdk/domain/model/response/BindingCheckResult;", "getFeatures", "()Lspay/sdk/domain/model/response/BindingPaymentFeatures;", "getFraudMonCheckResult", "()Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;", "getSessionId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BindingSessionId {

    @NotNull
    private final CardRegion cardRegion;
    private final BindingCheckResult checkResult;

    @NotNull
    private final BindingPaymentFeatures features;
    private final FraudMonCheckResult fraudMonCheckResult;

    @NotNull
    private final String sessionId;

    public BindingSessionId(@NotNull String sessionId, @NotNull CardRegion cardRegion, BindingCheckResult bindingCheckResult, FraudMonCheckResult fraudMonCheckResult, @NotNull BindingPaymentFeatures features) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(cardRegion, "cardRegion");
        Intrinsics.checkNotNullParameter(features, "features");
        this.sessionId = sessionId;
        this.cardRegion = cardRegion;
        this.checkResult = bindingCheckResult;
        this.fraudMonCheckResult = fraudMonCheckResult;
        this.features = features;
    }

    public static /* synthetic */ BindingSessionId copy$default(BindingSessionId bindingSessionId, String str, CardRegion cardRegion, BindingCheckResult bindingCheckResult, FraudMonCheckResult fraudMonCheckResult, BindingPaymentFeatures bindingPaymentFeatures, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bindingSessionId.sessionId;
        }
        if ((i11 & 2) != 0) {
            cardRegion = bindingSessionId.cardRegion;
        }
        if ((i11 & 4) != 0) {
            bindingCheckResult = bindingSessionId.checkResult;
        }
        if ((i11 & 8) != 0) {
            fraudMonCheckResult = bindingSessionId.fraudMonCheckResult;
        }
        if ((i11 & 16) != 0) {
            bindingPaymentFeatures = bindingSessionId.features;
        }
        BindingPaymentFeatures bindingPaymentFeatures2 = bindingPaymentFeatures;
        BindingCheckResult bindingCheckResult2 = bindingCheckResult;
        return bindingSessionId.copy(str, cardRegion, bindingCheckResult2, fraudMonCheckResult, bindingPaymentFeatures2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CardRegion getCardRegion() {
        return this.cardRegion;
    }

    /* renamed from: component3, reason: from getter */
    public final BindingCheckResult getCheckResult() {
        return this.checkResult;
    }

    /* renamed from: component4, reason: from getter */
    public final FraudMonCheckResult getFraudMonCheckResult() {
        return this.fraudMonCheckResult;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BindingPaymentFeatures getFeatures() {
        return this.features;
    }

    @NotNull
    public final BindingSessionId copy(@NotNull String sessionId, @NotNull CardRegion cardRegion, BindingCheckResult checkResult, FraudMonCheckResult fraudMonCheckResult, @NotNull BindingPaymentFeatures features) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(cardRegion, "cardRegion");
        Intrinsics.checkNotNullParameter(features, "features");
        return new BindingSessionId(sessionId, cardRegion, checkResult, fraudMonCheckResult, features);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindingSessionId)) {
            return false;
        }
        BindingSessionId bindingSessionId = (BindingSessionId) other;
        return Intrinsics.d(this.sessionId, bindingSessionId.sessionId) && this.cardRegion == bindingSessionId.cardRegion && Intrinsics.d(this.checkResult, bindingSessionId.checkResult) && Intrinsics.d(this.fraudMonCheckResult, bindingSessionId.fraudMonCheckResult) && this.features == bindingSessionId.features;
    }

    @NotNull
    public final CardRegion getCardRegion() {
        return this.cardRegion;
    }

    public final BindingCheckResult getCheckResult() {
        return this.checkResult;
    }

    @NotNull
    public final BindingPaymentFeatures getFeatures() {
        return this.features;
    }

    public final FraudMonCheckResult getFraudMonCheckResult() {
        return this.fraudMonCheckResult;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int hashCode = (this.cardRegion.hashCode() + (this.sessionId.hashCode() * 31)) * 31;
        BindingCheckResult bindingCheckResult = this.checkResult;
        int hashCode2 = (hashCode + (bindingCheckResult == null ? 0 : bindingCheckResult.hashCode())) * 31;
        FraudMonCheckResult fraudMonCheckResult = this.fraudMonCheckResult;
        return this.features.hashCode() + ((hashCode2 + (fraudMonCheckResult != null ? fraudMonCheckResult.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "BindingSessionId(sessionId=" + this.sessionId + ", cardRegion=" + this.cardRegion + ", checkResult=" + this.checkResult + ", fraudMonCheckResult=" + this.fraudMonCheckResult + ", features=" + this.features + ")";
    }
}
