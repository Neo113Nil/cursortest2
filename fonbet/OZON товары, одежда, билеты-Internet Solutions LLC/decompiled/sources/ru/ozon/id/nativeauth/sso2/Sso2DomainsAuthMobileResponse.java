package ru.ozon.id.nativeauth.sso2;

import Ak.C2436a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lru/ozon/id/nativeauth/sso2/Sso2DomainsAuthMobileResponse;", "", "authActionsRequiredDomains", "", "", "authActionsNonRequiredDomains", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getAuthActionsRequiredDomains", "()Ljava/util/List;", "getAuthActionsNonRequiredDomains", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Sso2DomainsAuthMobileResponse {
    private final List<String> authActionsNonRequiredDomains;

    @NotNull
    private final List<String> authActionsRequiredDomains;

    public Sso2DomainsAuthMobileResponse() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Sso2DomainsAuthMobileResponse copy$default(Sso2DomainsAuthMobileResponse sso2DomainsAuthMobileResponse, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = sso2DomainsAuthMobileResponse.authActionsRequiredDomains;
        }
        if ((i11 & 2) != 0) {
            list2 = sso2DomainsAuthMobileResponse.authActionsNonRequiredDomains;
        }
        return sso2DomainsAuthMobileResponse.copy(list, list2);
    }

    @NotNull
    public final List<String> component1() {
        return this.authActionsRequiredDomains;
    }

    public final List<String> component2() {
        return this.authActionsNonRequiredDomains;
    }

    @NotNull
    public final Sso2DomainsAuthMobileResponse copy(@NotNull List<String> authActionsRequiredDomains, List<String> authActionsNonRequiredDomains) {
        Intrinsics.checkNotNullParameter(authActionsRequiredDomains, "authActionsRequiredDomains");
        return new Sso2DomainsAuthMobileResponse(authActionsRequiredDomains, authActionsNonRequiredDomains);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sso2DomainsAuthMobileResponse)) {
            return false;
        }
        Sso2DomainsAuthMobileResponse sso2DomainsAuthMobileResponse = (Sso2DomainsAuthMobileResponse) other;
        return Intrinsics.d(this.authActionsRequiredDomains, sso2DomainsAuthMobileResponse.authActionsRequiredDomains) && Intrinsics.d(this.authActionsNonRequiredDomains, sso2DomainsAuthMobileResponse.authActionsNonRequiredDomains);
    }

    public final List<String> getAuthActionsNonRequiredDomains() {
        return this.authActionsNonRequiredDomains;
    }

    @NotNull
    public final List<String> getAuthActionsRequiredDomains() {
        return this.authActionsRequiredDomains;
    }

    public int hashCode() {
        int hashCode = this.authActionsRequiredDomains.hashCode() * 31;
        List<String> list = this.authActionsNonRequiredDomains;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return C2436a.b("Sso2DomainsAuthMobileResponse(authActionsRequiredDomains=", this.authActionsRequiredDomains, ", authActionsNonRequiredDomains=", ")", this.authActionsNonRequiredDomains);
    }

    public Sso2DomainsAuthMobileResponse(@NotNull List<String> authActionsRequiredDomains, List<String> list) {
        Intrinsics.checkNotNullParameter(authActionsRequiredDomains, "authActionsRequiredDomains");
        this.authActionsRequiredDomains = authActionsRequiredDomains;
        this.authActionsNonRequiredDomains = list;
    }

    public Sso2DomainsAuthMobileResponse(List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, (i11 & 2) != 0 ? null : list2);
    }
}
