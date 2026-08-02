package ki;

import I0.C3173b;
import N3.C3660k;
import Sc.C;
import Z1.h;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final long f71629a;

    /* renamed from: b, reason: collision with root package name */
    private final long f71630b;

    /* renamed from: c, reason: collision with root package name */
    private final float f71631c;

    /* renamed from: d, reason: collision with root package name */
    private final float f71632d;

    public g(long j11, long j12, float f7, float f11) {
        this.f71629a = j11;
        this.f71630b = j12;
        this.f71631c = f7;
        this.f71632d = f11;
    }

    public final long a() {
        return this.f71629a;
    }

    public final long b() {
        return this.f71630b;
    }

    public final float c() {
        return this.f71631c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return C7807Z.p(this.f71629a, gVar.f71629a) && C7807Z.p(this.f71630b, gVar.f71630b) && h.b(this.f71631c, gVar.f71631c) && h.b(this.f71632d, gVar.f71632d);
    }

    public final int hashCode() {
        int i11 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        return Pk0.b.a(this.f71632d, Pk0.b.a(this.f71631c, Pk0.c.a(Long.hashCode(this.f71629a) * 31, 31, this.f71630b), 31), 31);
    }

    @NotNull
    public final String toString() {
        String v11 = C7807Z.v(this.f71629a);
        String v12 = C7807Z.v(this.f71630b);
        return C3173b.c(C3660k.d("DsIconButtonStyle(backgroundColor=", v11, ", iconColor=", v12, ", size="), h.c(this.f71631c), ", cornerRadius=", h.c(this.f71632d), ", iconGradientBrush=null)");
    }
}
