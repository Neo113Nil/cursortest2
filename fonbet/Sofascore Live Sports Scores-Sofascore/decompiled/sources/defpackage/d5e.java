package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d5e implements e5e {
    public final float a;

    public d5e(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5e)) {
            return false;
        }
        return p75.b(this.a, ((d5e) obj).a);
    }

    @Override // defpackage.e5e
    public final int f(kx4 kx4Var, int i) {
        return kx4Var.e0(this.a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
