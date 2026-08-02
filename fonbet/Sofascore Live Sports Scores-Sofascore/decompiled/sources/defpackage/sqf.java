package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sqf implements gp3 {
    public final /* synthetic */ int a = 1;
    public final String b;
    public final s50 c;
    public final boolean d;
    public final z50 e;
    public final Object f;

    public sqf(String str, s50 s50Var, s50 s50Var2, x50 x50Var, boolean z) {
        this.b = str;
        this.c = s50Var;
        this.e = s50Var2;
        this.f = x50Var;
        this.d = z;
    }

    @Override // defpackage.gp3
    public final fo3 a(gmb gmbVar, plb plbVar, p41 p41Var) {
        switch (this.a) {
            case 0:
                return new rqf(gmbVar, p41Var, this);
            default:
                return new fzf(gmbVar, p41Var, this);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "RectangleShape{position=" + this.e + ", size=" + ((z50) this.f) + '}';
            default:
                return super.toString();
        }
    }

    public sqf(String str, z50 z50Var, r50 r50Var, s50 s50Var, boolean z) {
        this.b = str;
        this.e = z50Var;
        this.f = r50Var;
        this.c = s50Var;
        this.d = z;
    }
}
