package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.storage;

import G.g;
import N3.C3660k;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ8\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/storage/TokenId;", "", "tokenId", "", "token", "reason", "enableFastEntry", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getTokenId", "()Ljava/lang/String;", "getToken", "getReason", "getEnableFastEntry", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/storage/TokenId;", "equals", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TokenId {
    private final Boolean enableFastEntry;

    @NotNull
    private final String reason;

    @NotNull
    private final String token;

    @NotNull
    private final String tokenId;

    public TokenId(@i(name = "token_id") @NotNull String tokenId, @i(name = "token") @NotNull String token, @i(name = "reason_title") @NotNull String reason, @i(name = "set_fast_entry") Boolean bool) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.tokenId = tokenId;
        this.token = token;
        this.reason = reason;
        this.enableFastEntry = bool;
    }

    public static /* synthetic */ TokenId copy$default(TokenId tokenId, String str, String str2, String str3, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tokenId.tokenId;
        }
        if ((i11 & 2) != 0) {
            str2 = tokenId.token;
        }
        if ((i11 & 4) != 0) {
            str3 = tokenId.reason;
        }
        if ((i11 & 8) != 0) {
            bool = tokenId.enableFastEntry;
        }
        return tokenId.copy(str, str2, str3, bool);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTokenId() {
        return this.tokenId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getEnableFastEntry() {
        return this.enableFastEntry;
    }

    @NotNull
    public final TokenId copy(@i(name = "token_id") @NotNull String tokenId, @i(name = "token") @NotNull String token, @i(name = "reason_title") @NotNull String reason, @i(name = "set_fast_entry") Boolean enableFastEntry) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new TokenId(tokenId, token, reason, enableFastEntry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenId)) {
            return false;
        }
        TokenId tokenId = (TokenId) other;
        return Intrinsics.d(this.tokenId, tokenId.tokenId) && Intrinsics.d(this.token, tokenId.token) && Intrinsics.d(this.reason, tokenId.reason) && Intrinsics.d(this.enableFastEntry, tokenId.enableFastEntry);
    }

    public final Boolean getEnableFastEntry() {
        return this.enableFastEntry;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getTokenId() {
        return this.tokenId;
    }

    public int hashCode() {
        int a11 = g.a(g.a(this.tokenId.hashCode() * 31, 31, this.token), 31, this.reason);
        Boolean bool = this.enableFastEntry;
        return a11 + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.tokenId;
        String str2 = this.token;
        String str3 = this.reason;
        Boolean bool = this.enableFastEntry;
        StringBuilder d11 = C3660k.d("TokenId(tokenId=", str, ", token=", str2, ", reason=");
        d11.append(str3);
        d11.append(", enableFastEntry=");
        d11.append(bool);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ TokenId(String str, String str2, String str3, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? null : bool);
    }
}
