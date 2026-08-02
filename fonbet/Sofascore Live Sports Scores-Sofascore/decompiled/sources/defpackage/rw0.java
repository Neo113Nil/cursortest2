package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rw0 extends vw0 {
    public final int a;
    public final m9k b;
    public final m9k c;

    public rw0(int i, m9k m9kVar, m9k m9kVar2) {
        this.a = i;
        this.b = m9kVar;
        this.c = m9kVar2;
    }

    @Override // defpackage.vw0
    public final Integer a() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.vw0
    public final r9k b() {
        return this.b;
    }

    @Override // defpackage.vw0
    public final r9k c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw0)) {
            return false;
        }
        rw0 rw0Var = (rw0) obj;
        return this.a == rw0Var.a && this.b.equals(rw0Var.b) && this.c.equals(rw0Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + dmi.c(Integer.hashCode(this.a) * 31, 31, this.b.a);
    }

    public final String toString() {
        return "Champion(id=" + this.a + ", label=" + this.b + ", name=" + this.c + ")";
    }
}
