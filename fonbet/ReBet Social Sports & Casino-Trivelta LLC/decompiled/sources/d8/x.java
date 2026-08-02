package d8;

import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final AccessToken f45142a;

    /* renamed from: b, reason: collision with root package name */
    public final AuthenticationToken f45143b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f45144c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f45145d;

    public x(AccessToken accessToken, AuthenticationToken authenticationToken, Set recentlyGrantedPermissions, Set recentlyDeniedPermissions) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        Intrinsics.checkNotNullParameter(recentlyDeniedPermissions, "recentlyDeniedPermissions");
        this.f45142a = accessToken;
        this.f45143b = authenticationToken;
        this.f45144c = recentlyGrantedPermissions;
        this.f45145d = recentlyDeniedPermissions;
    }

    public final AccessToken a() {
        return this.f45142a;
    }

    public final Set b() {
        return this.f45145d;
    }

    public final Set c() {
        return this.f45144c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.areEqual(this.f45142a, xVar.f45142a) && Intrinsics.areEqual(this.f45143b, xVar.f45143b) && Intrinsics.areEqual(this.f45144c, xVar.f45144c) && Intrinsics.areEqual(this.f45145d, xVar.f45145d);
    }

    public int hashCode() {
        int hashCode = this.f45142a.hashCode() * 31;
        AuthenticationToken authenticationToken = this.f45143b;
        return ((((hashCode + (authenticationToken == null ? 0 : authenticationToken.hashCode())) * 31) + this.f45144c.hashCode()) * 31) + this.f45145d.hashCode();
    }

    public String toString() {
        return "LoginResult(accessToken=" + this.f45142a + ", authenticationToken=" + this.f45143b + ", recentlyGrantedPermissions=" + this.f45144c + ", recentlyDeniedPermissions=" + this.f45145d + ')';
    }
}
