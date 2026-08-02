package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m99 implements ll6 {
    public final ll6 a;
    public final boolean b;

    public m99(int i) {
        boolean z = (i & 1) != 0;
        this.b = z;
        if (z) {
            this.a = new nih(-1, -1, "image/heif");
        } else {
            this.a = new l99();
        }
    }

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        return this.b ? wkn.O((bp4) nl6Var, false) : this.a.a(nl6Var);
    }

    @Override // defpackage.ll6
    public final int b(nl6 nl6Var, b78 b78Var) {
        return this.a.b(nl6Var, b78Var);
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        this.a.e(pl6Var);
    }

    @Override // defpackage.ll6
    public final void release() {
        this.a.release();
    }

    @Override // defpackage.ll6
    public final void seek(long j, long j2) {
        this.a.seek(j, j2);
    }
}
