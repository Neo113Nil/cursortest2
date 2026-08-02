package spay.seamlessAuth.core.data.network.request;

import J8.b;
import Lf.a;
import N3.C3660k;
import com.google.android.gms.common.Scopes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lspay/seamlessAuth/core/data/network/request/ExchangeTokenRequest;", "", "subjectToken", "", "resource", "resourceClientId", "subjectTokenType", "grantType", "scope", "", "Lspay/seamlessAuth/core/data/network/request/ScopeItem;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getGrantType", "()Ljava/lang/String;", "getResource", "getResourceClientId", "getScope", "()Ljava/util/List;", "getSubjectToken", "getSubjectTokenType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ExchangeTokenRequest {

    @b("grant_type")
    @NotNull
    private final String grantType;

    @b("resource")
    @NotNull
    private final String resource;

    @b("resource_client_id")
    @NotNull
    private final String resourceClientId;

    @b("scope")
    @NotNull
    private final List<ScopeItem> scope;

    @b("subject_token")
    @NotNull
    private final String subjectToken;

    @b("subject_token_type")
    @NotNull
    private final String subjectTokenType;

    public ExchangeTokenRequest(@NotNull String subjectToken, @NotNull String resource, @NotNull String resourceClientId, @NotNull String subjectTokenType, @NotNull String grantType, @NotNull List<ScopeItem> scope) {
        Intrinsics.checkNotNullParameter(subjectToken, "subjectToken");
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(resourceClientId, "resourceClientId");
        Intrinsics.checkNotNullParameter(subjectTokenType, "subjectTokenType");
        Intrinsics.checkNotNullParameter(grantType, "grantType");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.subjectToken = subjectToken;
        this.resource = resource;
        this.resourceClientId = resourceClientId;
        this.subjectTokenType = subjectTokenType;
        this.grantType = grantType;
        this.scope = scope;
    }

    public static /* synthetic */ ExchangeTokenRequest copy$default(ExchangeTokenRequest exchangeTokenRequest, String str, String str2, String str3, String str4, String str5, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = exchangeTokenRequest.subjectToken;
        }
        if ((i11 & 2) != 0) {
            str2 = exchangeTokenRequest.resource;
        }
        if ((i11 & 4) != 0) {
            str3 = exchangeTokenRequest.resourceClientId;
        }
        if ((i11 & 8) != 0) {
            str4 = exchangeTokenRequest.subjectTokenType;
        }
        if ((i11 & 16) != 0) {
            str5 = exchangeTokenRequest.grantType;
        }
        if ((i11 & 32) != 0) {
            list = exchangeTokenRequest.scope;
        }
        String str6 = str5;
        List list2 = list;
        return exchangeTokenRequest.copy(str, str2, str3, str4, str6, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSubjectToken() {
        return this.subjectToken;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getResource() {
        return this.resource;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getResourceClientId() {
        return this.resourceClientId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSubjectTokenType() {
        return this.subjectTokenType;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getGrantType() {
        return this.grantType;
    }

    @NotNull
    public final List<ScopeItem> component6() {
        return this.scope;
    }

    @NotNull
    public final ExchangeTokenRequest copy(@NotNull String subjectToken, @NotNull String resource, @NotNull String resourceClientId, @NotNull String subjectTokenType, @NotNull String grantType, @NotNull List<ScopeItem> scope) {
        Intrinsics.checkNotNullParameter(subjectToken, "subjectToken");
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(resourceClientId, "resourceClientId");
        Intrinsics.checkNotNullParameter(subjectTokenType, "subjectTokenType");
        Intrinsics.checkNotNullParameter(grantType, "grantType");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new ExchangeTokenRequest(subjectToken, resource, resourceClientId, subjectTokenType, grantType, scope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExchangeTokenRequest)) {
            return false;
        }
        ExchangeTokenRequest exchangeTokenRequest = (ExchangeTokenRequest) other;
        return Intrinsics.d(this.subjectToken, exchangeTokenRequest.subjectToken) && Intrinsics.d(this.resource, exchangeTokenRequest.resource) && Intrinsics.d(this.resourceClientId, exchangeTokenRequest.resourceClientId) && Intrinsics.d(this.subjectTokenType, exchangeTokenRequest.subjectTokenType) && Intrinsics.d(this.grantType, exchangeTokenRequest.grantType) && Intrinsics.d(this.scope, exchangeTokenRequest.scope);
    }

    @NotNull
    public final String getGrantType() {
        return this.grantType;
    }

    @NotNull
    public final String getResource() {
        return this.resource;
    }

    @NotNull
    public final String getResourceClientId() {
        return this.resourceClientId;
    }

    @NotNull
    public final List<ScopeItem> getScope() {
        return this.scope;
    }

    @NotNull
    public final String getSubjectToken() {
        return this.subjectToken;
    }

    @NotNull
    public final String getSubjectTokenType() {
        return this.subjectTokenType;
    }

    public int hashCode() {
        return this.scope.hashCode() + a.b0(a.b0(a.b0(a.b0(this.subjectToken.hashCode() * 31, this.resource), this.resourceClientId), this.subjectTokenType), this.grantType);
    }

    @NotNull
    public String toString() {
        String str = this.subjectToken;
        String str2 = this.resource;
        String str3 = this.resourceClientId;
        String str4 = this.subjectTokenType;
        String str5 = this.grantType;
        List<ScopeItem> list = this.scope;
        StringBuilder d11 = C3660k.d("ExchangeTokenRequest(subjectToken=", str, ", resource=", str2, ", resourceClientId=");
        Nh.a.h(d11, str3, ", subjectTokenType=", str4, ", grantType=");
        d11.append(str5);
        d11.append(", scope=");
        d11.append(list);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ ExchangeTokenRequest(String str, String str2, String str3, String str4, String str5, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? M1.b.m("U0JFUklEX0FQUF9UT0tFTg==") : str4, (i11 & 16) != 0 ? "urn:ietf:params:oauth:grant-type:token-exchange" : str5, (i11 & 32) != 0 ? C7714v.a0(new ScopeItem(Scopes.OPEN_ID)) : list);
    }
}
