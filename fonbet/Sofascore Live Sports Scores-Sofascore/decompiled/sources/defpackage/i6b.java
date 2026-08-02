package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i6b {
    public final g6b a;
    public final e6b b;
    public final r45 c;
    public final ob3 d;

    public i6b(g6b g6bVar, e6b e6bVar, r45 r45Var, yda ydaVar) {
        g6bVar.getClass();
        this.a = g6bVar;
        this.b = e6bVar;
        this.c = r45Var;
        ob3 ob3Var = new ob3(2, this, ydaVar);
        this.d = ob3Var;
        if (g6bVar.b() != e6b.a) {
            g6bVar.a(ob3Var);
        } else {
            ydaVar.e(null);
            a();
        }
    }

    public final void a() {
        this.a.d(this.d);
        r45 r45Var = this.c;
        r45Var.b = true;
        r45Var.a();
    }
}
