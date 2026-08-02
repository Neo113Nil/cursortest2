package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q75 implements vt3 {
    public final float a;

    public q75(float f) {
        this.a = f;
    }

    @Override // defpackage.vt3
    public final float a(long j, kx4 kx4Var) {
        return kx4Var.H0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q75) && p75.b(this.a, ((q75) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
