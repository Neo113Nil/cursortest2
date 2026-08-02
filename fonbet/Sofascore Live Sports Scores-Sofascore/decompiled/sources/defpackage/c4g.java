package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c4g extends z1a {
    public static final rm0 l = new rm0("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");
    public final z1a i;
    public final az0 j;
    public final xx3 k;

    public c4g(o65 o65Var, az0 az0Var, xx3 xx3Var) {
        this.i = o65Var;
        this.j = az0Var;
        this.k = xx3Var;
    }

    @Override // defpackage.z1a
    public String K() {
        return this.i.K();
    }

    @Override // defpackage.z1a
    public final void W() {
        this.i.W();
    }

    @Override // defpackage.z1a
    public final void X() {
        this.i.X();
        az0 az0Var = this.j;
        xx3 xx3Var = az0Var.b;
        xx3Var.i();
        xx3Var.execute(new y2(az0Var, 20));
    }

    @Override // defpackage.z1a
    public final void Y(w1a w1aVar) {
        this.i.Y(new b4g(this, w1aVar));
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(this.i, "delegate");
        return I.toString();
    }
}
