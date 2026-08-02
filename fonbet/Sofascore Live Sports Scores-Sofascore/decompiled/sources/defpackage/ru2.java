package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ru2 implements jpg {
    public final su2 a;
    public final hpg b;
    public final int c;
    public boolean d;
    public final /* synthetic */ su2 e;

    public ru2(su2 su2Var, su2 su2Var2, hpg hpgVar, int i) {
        this.e = su2Var;
        this.a = su2Var2;
        this.b = hpgVar;
        this.c = i;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        su2 su2Var = this.e;
        b10 b10Var = su2Var.g;
        int[] iArr = su2Var.b;
        int i = this.c;
        b10Var.i(iArr[i], su2Var.c[i], 0, null, su2Var.t);
        this.d = true;
    }

    @Override // defpackage.jpg
    public final int e(fp4 fp4Var, im4 im4Var, int i) {
        su2 su2Var = this.e;
        if (su2Var.k()) {
            return -3;
        }
        x41 x41Var = su2Var.v;
        hpg hpgVar = this.b;
        if (x41Var != null && x41Var.c(this.c + 1) <= hpgVar.u()) {
            return -3;
        }
        a();
        return hpgVar.E(fp4Var, im4Var, i, su2Var.z);
    }

    @Override // defpackage.jpg
    public final boolean isReady() {
        su2 su2Var = this.e;
        return !su2Var.k() && this.b.z(su2Var.z);
    }

    @Override // defpackage.jpg
    public final int skipData(long j) {
        su2 su2Var = this.e;
        if (su2Var.k()) {
            return 0;
        }
        boolean z = su2Var.z;
        hpg hpgVar = this.b;
        int w = hpgVar.w(j, z);
        x41 x41Var = su2Var.v;
        if (x41Var != null) {
            w = Math.min(w, x41Var.c(this.c + 1) - hpgVar.u());
        }
        hpgVar.J(w);
        if (w > 0) {
            a();
        }
        return w;
    }

    @Override // defpackage.jpg
    public final void maybeThrowError() {
    }
}
