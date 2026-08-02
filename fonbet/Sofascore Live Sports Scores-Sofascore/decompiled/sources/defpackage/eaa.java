package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class eaa implements tfi {
    public final gv9 a;
    public final String b;

    public eaa(b7 b7Var) {
        b7Var.getClass();
        this.a = b7Var;
        this.b = "intro";
    }

    @Override // defpackage.tfi
    public final String a() {
        return this.b;
    }

    @Override // defpackage.tfi
    public final gv9 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eaa)) {
            return false;
        }
        eaa eaaVar = (eaa) obj;
        return this.a.equals(eaaVar.a) && this.b.equals(eaaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IntroSegment(cards=" + this.a + ", analyticsCategory=" + this.b + ")";
    }
}
