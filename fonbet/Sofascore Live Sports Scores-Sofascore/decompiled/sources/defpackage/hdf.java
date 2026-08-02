package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hdf implements qcc {
    public final oe4 a;
    public final kr9 b;
    public final sx2 c;
    public final it7 d;

    public hdf(oe4 oe4Var, hp4 hp4Var) {
        kr9 kr9Var = new kr9(hp4Var, 28);
        sx2 sx2Var = new sx2(7, false);
        it7 it7Var = new it7(21);
        this.a = oe4Var;
        this.b = kr9Var;
        this.c = sx2Var;
        this.d = it7Var;
    }

    @Override // defpackage.qcc
    public final vcc a(h6c h6cVar) {
        h6cVar.b.getClass();
        return new jdf(h6cVar, this.a, this.b, this.c.s(h6cVar), this.d, null);
    }

    @Override // defpackage.qcc
    public final int[] getSupportedTypes() {
        return new int[]{4};
    }
}
