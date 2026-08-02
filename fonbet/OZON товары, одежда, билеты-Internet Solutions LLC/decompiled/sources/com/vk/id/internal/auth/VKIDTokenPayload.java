package com.vk.id.internal.auth;

import E0.C2942q;
import G.g;
import I0.C3173b;
import N3.C3660k;
import Pk0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001f\u0010\u000e¨\u0006 "}, d2 = {"Lcom/vk/id/internal/auth/VKIDTokenPayload;", "", "", "accessToken", "refreshToken", "idToken", "", "expiresIn", "userId", "state", "scope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccessToken", "getRefreshToken", "getIdToken", "J", "getExpiresIn", "()J", "getUserId", "getState", "getScope", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class VKIDTokenPayload {

    @NotNull
    private final String accessToken;
    private final long expiresIn;

    @NotNull
    private final String idToken;

    @NotNull
    private final String refreshToken;

    @NotNull
    private final String scope;

    @NotNull
    private final String state;
    private final long userId;

    public VKIDTokenPayload(@NotNull String accessToken, @NotNull String refreshToken, @NotNull String idToken, long j11, long j12, @NotNull String state, @NotNull String scope) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.idToken = idToken;
        this.expiresIn = j11;
        this.userId = j12;
        this.state = state;
        this.scope = scope;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VKIDTokenPayload)) {
            return false;
        }
        VKIDTokenPayload vKIDTokenPayload = (VKIDTokenPayload) other;
        return Intrinsics.d(this.accessToken, vKIDTokenPayload.accessToken) && Intrinsics.d(this.refreshToken, vKIDTokenPayload.refreshToken) && Intrinsics.d(this.idToken, vKIDTokenPayload.idToken) && this.expiresIn == vKIDTokenPayload.expiresIn && this.userId == vKIDTokenPayload.userId && Intrinsics.d(this.state, vKIDTokenPayload.state) && Intrinsics.d(this.scope, vKIDTokenPayload.scope);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    public final long getExpiresIn() {
        return this.expiresIn;
    }

    @NotNull
    public final String getIdToken() {
        return this.idToken;
    }

    @NotNull
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @NotNull
    public final String getScope() {
        return this.scope;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.scope.hashCode() + g.a(c.a(c.a(g.a(g.a(this.accessToken.hashCode() * 31, 31, this.refreshToken), 31, this.idToken), 31, this.expiresIn), 31, this.userId), 31, this.state);
    }

    @NotNull
    public String toString() {
        String str = this.accessToken;
        String str2 = this.refreshToken;
        String str3 = this.idToken;
        long j11 = this.expiresIn;
        long j12 = this.userId;
        String str4 = this.state;
        String str5 = this.scope;
        StringBuilder d11 = C3660k.d("VKIDTokenPayload(accessToken=", str, ", refreshToken=", str2, ", idToken=");
        d11.append(str3);
        d11.append(", expiresIn=");
        d11.append(j11);
        C2942q.f(d11, ", userId=", j12, ", state=");
        return C3173b.c(d11, str4, ", scope=", str5, ")");
    }
}
