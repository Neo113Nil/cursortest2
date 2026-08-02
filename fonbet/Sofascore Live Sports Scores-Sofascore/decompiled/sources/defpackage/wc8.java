package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wc8 extends n3 {
    public final gsg c;
    public final int d;

    public wc8(ob8 ob8Var, gsg gsgVar, int i) {
        super(ob8Var);
        this.c = gsgVar;
        this.d = i;
    }

    @Override // defpackage.ob8
    public final void e(ed8 ed8Var) {
        fsg a = this.c.a();
        boolean z = ed8Var instanceof ai3;
        int i = this.d;
        ob8 ob8Var = this.b;
        if (z) {
            ob8Var.d(new uc8((ai3) ed8Var, a, i));
        } else {
            ob8Var.d(new vc8(ed8Var, a, i));
        }
    }
}
