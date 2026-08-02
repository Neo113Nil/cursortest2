package com.facebook.login;

import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class x {
    public final AccessToken a;
    public final AuthenticationToken b;
    public final LinkedHashSet c;
    public final LinkedHashSet d;

    public x(AccessToken accessToken, AuthenticationToken authenticationToken, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        this.a = accessToken;
        this.b = authenticationToken;
        this.c = linkedHashSet;
        this.d = linkedHashSet2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.a.equals(xVar.a) && Intrinsics.c(this.b, xVar.b) && this.c.equals(xVar.c) && this.d.equals(xVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        AuthenticationToken authenticationToken = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (authenticationToken == null ? 0 : authenticationToken.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "LoginResult(accessToken=" + this.a + ", authenticationToken=" + this.b + ", recentlyGrantedPermissions=" + this.c + ", recentlyDeniedPermissions=" + this.d + ')';
    }
}
