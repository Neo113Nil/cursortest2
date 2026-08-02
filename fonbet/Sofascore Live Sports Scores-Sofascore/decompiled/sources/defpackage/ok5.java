package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ok5 implements mk5 {
    public vy8 a = ty8.a;
    public e23 b = ecf.a;

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
        ok5 ok5Var = new ok5();
        ok5Var.a = this.a;
        ok5Var.b = this.b;
        return ok5Var;
    }

    public final String toString() {
        return "EmittableCircularProgressIndicator(modifier=" + this.a + ", color=" + this.b + ')';
    }
}
