package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ud8 {
    public final yd8 a;
    public final xy b;
    public final y0d c;
    public final y0d d;
    public boolean e;

    public ud8(yd8 yd8Var, xy xyVar) {
        this.a = yd8Var;
        this.b = xyVar;
        y0d y0dVar = rrg.a;
        this.c = new y0d();
        this.d = new y0d();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        av6 av6Var = new av6(0, this, ud8.class, "invalidateNodes", "invalidateNodes()V", 0, 28);
        l0d l0dVar = this.b.z0;
        if (l0dVar.g(av6Var) < 0) {
            l0dVar.a(av6Var);
        }
        this.e = true;
    }
}
