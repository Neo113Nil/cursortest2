package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ybh implements gp3 {
    public final int a;
    public final s50 b;
    public final s50 c;
    public final s50 d;
    public final boolean e;

    public ybh(String str, int i, s50 s50Var, s50 s50Var2, s50 s50Var3, boolean z) {
        this.a = i;
        this.b = s50Var;
        this.c = s50Var2;
        this.d = s50Var3;
        this.e = z;
    }

    @Override // defpackage.gp3
    public final fo3 a(gmb gmbVar, plb plbVar, p41 p41Var) {
        return new k1k(p41Var, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.b + ", end: " + this.c + ", offset: " + this.d + "}";
    }
}
