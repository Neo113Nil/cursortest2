package n0;

import Sc.C;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;
import u0.C9915y;
import u0.InterfaceC9914x;

/* renamed from: n0.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8379U {

    /* renamed from: a, reason: collision with root package name */
    private final long f76121a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9915y f76122b;

    public C8379U() {
        long c11 = C7811b0.c(4284900966L);
        C9915y a11 = androidx.compose.foundation.layout.T.a(0.0f, 3, 0.0f);
        this.f76121a = c11;
        this.f76122b = a11;
    }

    @NotNull
    public final InterfaceC9914x a() {
        return this.f76122b;
    }

    public final long b() {
        return this.f76121a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C8379U.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        C8379U c8379u = (C8379U) obj;
        return C7807Z.p(this.f76121a, c8379u.f76121a) && Intrinsics.d(this.f76122b, c8379u.f76122b);
    }

    public final int hashCode() {
        int i11 = C7807Z.f72260n;
        C.Companion companion = Sc.C.INSTANCE;
        return this.f76122b.hashCode() + (Long.hashCode(this.f76121a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverscrollConfiguration(glowColor=");
        Bi.a.e(this.f76121a, ", drawPadding=", sb2);
        sb2.append(this.f76122b);
        sb2.append(')');
        return sb2.toString();
    }
}
