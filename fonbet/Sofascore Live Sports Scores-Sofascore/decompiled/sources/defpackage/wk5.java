package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wk5 implements mk5 {
    public vy8 a = ty8.a;

    @Override // defpackage.mk5
    public final void a(vy8 vy8Var) {
        this.a = vy8Var;
    }

    @Override // defpackage.mk5
    public final vy8 b() {
        return this.a;
    }

    @Override // defpackage.mk5
    public final mk5 copy() {
        wk5 wk5Var = new wk5();
        wk5Var.a = this.a;
        return wk5Var;
    }

    public final String toString() {
        return "EmittableSpacer(modifier=" + this.a + ')';
    }
}
