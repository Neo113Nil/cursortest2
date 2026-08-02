package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class krb extends w1a {
    public final jrb k;
    public final z1a l;
    public final /* synthetic */ qrb m;

    public krb(qrb qrbVar, jrb jrbVar, c4g c4gVar) {
        this.m = qrbVar;
        this.k = jrbVar;
        z1a.y(c4gVar, "resolver");
        this.l = c4gVar;
    }

    @Override // defpackage.w1a
    public final void A(k3d k3dVar) {
        this.m.m.execute(new vlo(this, k3dVar, false, 16));
    }

    @Override // defpackage.w1a
    public final void z(xei xeiVar) {
        z1a.r("the error status must not be OK", !xeiVar.f());
        this.m.m.execute(new pyn(this, xeiVar, false, 14));
    }
}
