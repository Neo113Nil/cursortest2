package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pj0 implements rj0 {
    public final d7e a;
    public final emi b;

    public pj0(d7e d7eVar, emi emiVar) {
        this.a = d7eVar;
        this.b = emiVar;
    }

    @Override // defpackage.rj0
    public final d7e a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj0)) {
            return false;
        }
        pj0 pj0Var = (pj0) obj;
        return this.a.equals(pj0Var.a) && this.b.equals(pj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.a + ", result=" + this.b + ")";
    }
}
