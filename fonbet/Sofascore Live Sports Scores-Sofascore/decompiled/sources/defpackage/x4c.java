package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class x4c {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public x4c(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4c)) {
            return false;
        }
        x4c x4cVar = (x4c) obj;
        return this.a == x4cVar.a && this.b == x4cVar.b && this.c == x4cVar.c && this.d == x4cVar.d && this.e == x4cVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + dmi.e(dmi.e(dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder k = w1l.k("MediaHeadFlags(all=", this.a, ", highlights=", this.b, ", clips=");
        vxd.t(", news=", ", social=", k, this.c, this.d);
        return wt3.p(k, this.e, ")");
    }
}
