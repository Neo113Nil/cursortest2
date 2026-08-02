package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sw0 extends vw0 {
    public final r9k a;
    public final q9k b;

    public sw0(q9k q9kVar, r9k r9kVar) {
        this.a = r9kVar;
        this.b = q9kVar;
    }

    @Override // defpackage.vw0
    public final r9k b() {
        return this.a;
    }

    @Override // defpackage.vw0
    public final r9k c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw0)) {
            return false;
        }
        sw0 sw0Var = (sw0) obj;
        return this.a.equals(sw0Var.a) && this.b.equals(sw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ComingSoon(label=" + this.a + ", name=" + this.b + ")";
    }
}
