package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g2f {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g2f(boolean z, boolean z2, boolean z3, rzg rzgVar, boolean z4) {
        this(rzgVar == rzg.a, z2, z3, z4 ? r2 : r2 | 512);
        ff5 ff5Var = t20.a;
        int i = !z ? 262152 : 262144;
        i = rzgVar == rzg.b ? i | 8192 : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2f)) {
            return false;
        }
        g2f g2fVar = (g2f) obj;
        return this.a == g2fVar.a && this.b == g2fVar.b && this.c == g2fVar.c && this.d == g2fVar.d && this.e == g2fVar.e && this.f == g2fVar.f;
    }

    public final int hashCode() {
        return (dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, false) + this.f) * 31;
    }

    public g2f(boolean z, boolean z2, boolean z3, int i) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = true;
        this.f = 1002;
    }

    public g2f(int i) {
        this((i & 1) == 0, (i & 2) != 0, (i & 4) != 0, rzg.a, true);
    }

    public /* synthetic */ g2f(boolean z) {
        this(z, rzg.a, true);
    }

    public g2f(boolean z, rzg rzgVar, boolean z2) {
        this(z, true, true, rzgVar, z2);
    }
}
