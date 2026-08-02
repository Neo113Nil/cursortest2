package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qj0 extends sj0 {
    public final d7e a;
    public final fmi b;

    public qj0(d7e d7eVar, fmi fmiVar) {
        this.a = d7eVar;
        this.b = fmiVar;
    }

    @Override // defpackage.sj0
    public final d7e a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj0)) {
            return false;
        }
        qj0 qj0Var = (qj0) obj;
        return this.a.equals(qj0Var.a) && this.b.equals(qj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.a + ", result=" + this.b + ')';
    }
}
