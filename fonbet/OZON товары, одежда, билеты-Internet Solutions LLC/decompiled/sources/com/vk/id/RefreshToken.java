package com.vk.id;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/vk/id/RefreshToken;", "", "", "token", "", "scopes", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "Ljava/util/Set;", "getScopes", "()Ljava/util/Set;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RefreshToken {
    private final Set<String> scopes;

    @NotNull
    private final String token;

    public RefreshToken(@NotNull String token, Set<String> set) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.token = token;
        this.scopes = set;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!RefreshToken.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type com.vk.id.RefreshToken");
        RefreshToken refreshToken = (RefreshToken) other;
        return Intrinsics.d(this.token, refreshToken.token) && Intrinsics.d(this.scopes, refreshToken.scopes);
    }

    public int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        Set<String> set = this.scopes;
        return hashCode + (set != null ? set.hashCode() : 0);
    }
}
