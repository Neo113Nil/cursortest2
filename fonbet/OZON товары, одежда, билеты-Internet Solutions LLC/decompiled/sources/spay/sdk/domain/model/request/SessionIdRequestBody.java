package spay.sdk.domain.model.request;

import I0.C3173b;
import Lf.a;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lspay/sdk/domain/model/request/SessionIdRequestBody;", "", "redirectUri", "", "merchantLogin", "orderId", "bindingId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBindingId", "()Ljava/lang/String;", "getMerchantLogin", "getOrderId", "getRedirectUri", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SessionIdRequestBody {
    private final String bindingId;
    private final String merchantLogin;

    @NotNull
    private final String orderId;

    @NotNull
    private final String redirectUri;

    public SessionIdRequestBody(@NotNull String redirectUri, String str, @NotNull String orderId, String str2) {
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.redirectUri = redirectUri;
        this.merchantLogin = str;
        this.orderId = orderId;
        this.bindingId = str2;
    }

    public static /* synthetic */ SessionIdRequestBody copy$default(SessionIdRequestBody sessionIdRequestBody, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionIdRequestBody.redirectUri;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionIdRequestBody.merchantLogin;
        }
        if ((i11 & 4) != 0) {
            str3 = sessionIdRequestBody.orderId;
        }
        if ((i11 & 8) != 0) {
            str4 = sessionIdRequestBody.bindingId;
        }
        return sessionIdRequestBody.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getRedirectUri() {
        return this.redirectUri;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBindingId() {
        return this.bindingId;
    }

    @NotNull
    public final SessionIdRequestBody copy(@NotNull String redirectUri, String merchantLogin, @NotNull String orderId, String bindingId) {
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new SessionIdRequestBody(redirectUri, merchantLogin, orderId, bindingId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionIdRequestBody)) {
            return false;
        }
        SessionIdRequestBody sessionIdRequestBody = (SessionIdRequestBody) other;
        return Intrinsics.d(this.redirectUri, sessionIdRequestBody.redirectUri) && Intrinsics.d(this.merchantLogin, sessionIdRequestBody.merchantLogin) && Intrinsics.d(this.orderId, sessionIdRequestBody.orderId) && Intrinsics.d(this.bindingId, sessionIdRequestBody.bindingId);
    }

    public final String getBindingId() {
        return this.bindingId;
    }

    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getRedirectUri() {
        return this.redirectUri;
    }

    public int hashCode() {
        int hashCode = this.redirectUri.hashCode() * 31;
        String str = this.merchantLogin;
        int b02 = a.b0((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.orderId);
        String str2 = this.bindingId;
        return b02 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.redirectUri;
        String str2 = this.merchantLogin;
        return C3173b.c(C3660k.d("SessionIdRequestBody(redirectUri=", str, ", merchantLogin=", str2, ", orderId="), this.orderId, ", bindingId=", this.bindingId, ")");
    }

    public /* synthetic */ SessionIdRequestBody(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, str3, (i11 & 8) != 0 ? null : str4);
    }
}
