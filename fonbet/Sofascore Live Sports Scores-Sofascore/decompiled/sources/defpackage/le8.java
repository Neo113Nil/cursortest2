package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class le8 extends bw4 implements tkd, ug3 {
    public final ne8 q;
    public ara r;

    public le8() {
        ne8 ne8Var = new ne8(0, 9, new p1(2, this, le8.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 7));
        k1(ne8Var);
        this.q = ne8Var;
    }

    @Override // defpackage.tkd
    public final void Z() {
        fsf fsfVar = new fsf();
        z1a.R(this, new z07(19, fsfVar, this));
        ara araVar = (ara) fsfVar.a;
        if (this.q.p1().g()) {
            ara araVar2 = this.r;
            if (araVar2 != null) {
                araVar2.b();
            }
            if (araVar != null) {
                araVar.a();
            } else {
                araVar = null;
            }
            this.r = araVar;
        }
    }
}
