package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pe2 implements oe4 {
    public he2 a;
    public t9d c;
    public boolean e;
    public oe4 f;
    public int g;
    public wwl h;
    public m08 b = new m08();
    public ye2 d = ye2.i7;

    @Override // defpackage.oe4
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qe2 createDataSource() {
        oe4 oe4Var = this.f;
        oe2 oe2Var = null;
        re4 createDataSource = oe4Var != null ? oe4Var.createDataSource() : null;
        int i = this.g;
        he2 he2Var = this.a;
        he2Var.getClass();
        if (!this.e && createDataSource != null) {
            t9d t9dVar = this.c;
            if (t9dVar != null) {
                ghh ghhVar = (ghh) t9dVar.a;
                ghhVar.getClass();
                oe2Var = new oe2(ghhVar);
            } else {
                oe2Var = new oe2(he2Var);
            }
        }
        return new qe2(he2Var, createDataSource, this.b.createDataSource(), oe2Var, this.d, i, this.h);
    }
}
