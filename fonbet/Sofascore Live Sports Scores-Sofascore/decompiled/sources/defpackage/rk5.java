package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rk5 implements mk5 {
    public dt9 b;
    public fjj c;
    public vy8 a = ty8.a;
    public int d = 1;

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
        rk5 rk5Var = new rk5();
        rk5Var.a = this.a;
        rk5Var.b = this.b;
        rk5Var.c = this.c;
        rk5Var.d = this.d;
        return rk5Var;
    }

    public final String toString() {
        return "EmittableImage(modifier=" + this.a + ", provider=" + this.b + ", colorFilterParams=" + this.c + ", contentScale=" + ((Object) np3.a(this.d)) + ')';
    }
}
