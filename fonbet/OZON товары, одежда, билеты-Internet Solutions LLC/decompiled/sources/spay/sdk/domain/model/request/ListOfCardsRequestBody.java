package spay.sdk.domain.model.request;

import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lspay/sdk/domain/model/request/ListOfCardsRequestBody;", "", "sessionId", "", "merchantLogin", "priorityCardOnly", "", "orderId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getMerchantLogin", "()Ljava/lang/String;", "getOrderId", "getPriorityCardOnly", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSessionId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lspay/sdk/domain/model/request/ListOfCardsRequestBody;", "equals", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ListOfCardsRequestBody {
    private final String merchantLogin;

    @NotNull
    private final String orderId;
    private final Boolean priorityCardOnly;

    @NotNull
    private final String sessionId;

    public ListOfCardsRequestBody(@NotNull String sessionId, String str, Boolean bool, @NotNull String orderId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.sessionId = sessionId;
        this.merchantLogin = str;
        this.priorityCardOnly = bool;
        this.orderId = orderId;
    }

    public static /* synthetic */ ListOfCardsRequestBody copy$default(ListOfCardsRequestBody listOfCardsRequestBody, String str, String str2, Boolean bool, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = listOfCardsRequestBody.sessionId;
        }
        if ((i11 & 2) != 0) {
            str2 = listOfCardsRequestBody.merchantLogin;
        }
        if ((i11 & 4) != 0) {
            bool = listOfCardsRequestBody.priorityCardOnly;
        }
        if ((i11 & 8) != 0) {
            str3 = listOfCardsRequestBody.orderId;
        }
        return listOfCardsRequestBody.copy(str, str2, bool, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getPriorityCardOnly() {
        return this.priorityCardOnly;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final ListOfCardsRequestBody copy(@NotNull String sessionId, String merchantLogin, Boolean priorityCardOnly, @NotNull String orderId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new ListOfCardsRequestBody(sessionId, merchantLogin, priorityCardOnly, orderId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListOfCardsRequestBody)) {
            return false;
        }
        ListOfCardsRequestBody listOfCardsRequestBody = (ListOfCardsRequestBody) other;
        return Intrinsics.d(this.sessionId, listOfCardsRequestBody.sessionId) && Intrinsics.d(this.merchantLogin, listOfCardsRequestBody.merchantLogin) && Intrinsics.d(this.priorityCardOnly, listOfCardsRequestBody.priorityCardOnly) && Intrinsics.d(this.orderId, listOfCardsRequestBody.orderId);
    }

    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    public final Boolean getPriorityCardOnly() {
        return this.priorityCardOnly;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int hashCode = this.sessionId.hashCode() * 31;
        String str = this.merchantLogin;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.priorityCardOnly;
        return this.orderId.hashCode() + ((hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.sessionId;
        String str2 = this.merchantLogin;
        Boolean bool = this.priorityCardOnly;
        String str3 = this.orderId;
        StringBuilder d11 = C3660k.d("ListOfCardsRequestBody(sessionId=", str, ", merchantLogin=", str2, ", priorityCardOnly=");
        d11.append(bool);
        d11.append(", orderId=");
        d11.append(str3);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ ListOfCardsRequestBody(String str, String str2, Boolean bool, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bool, str3);
    }
}
