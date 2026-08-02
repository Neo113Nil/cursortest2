package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xk5 implements mk5 {
    public cfj b;
    public String a = "";
    public int c = Integer.MAX_VALUE;
    public vy8 d = ty8.a;

    @Override // defpackage.mk5
    public final void a(vy8 vy8Var) {
        this.d = vy8Var;
    }

    @Override // defpackage.mk5
    public final vy8 b() {
        return this.d;
    }

    @Override // defpackage.mk5
    public final mk5 copy() {
        xk5 xk5Var = new xk5();
        xk5Var.d = this.d;
        xk5Var.a = this.a;
        xk5Var.b = this.b;
        xk5Var.c = this.c;
        return xk5Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmittableText(");
        sb.append(this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", modifier=");
        sb.append(this.d);
        sb.append(", maxLines=");
        return wv8.j(sb, this.c, ')');
    }
}
