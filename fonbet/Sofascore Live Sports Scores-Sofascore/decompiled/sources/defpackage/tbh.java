package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tbh implements gp3 {
    public final String a;
    public final int b;
    public final r50 c;
    public final boolean d;

    public tbh(String str, int i, r50 r50Var, boolean z) {
        this.a = str;
        this.b = i;
        this.c = r50Var;
        this.d = z;
    }

    @Override // defpackage.gp3
    public final fo3 a(gmb gmbVar, plb plbVar, p41 p41Var) {
        return new zah(gmbVar, p41Var, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.a);
        sb.append(", index=");
        return wv8.j(sb, this.b, '}');
    }
}
