package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nih implements ll6 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public pl6 f;
    public vsj g;

    public nih(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        int i = this.b;
        int i2 = this.a;
        z1a.E((i2 == -1 || i == -1) ? false : true);
        j9e j9eVar = new j9e(i);
        ((bp4) nl6Var).peekFully(j9eVar.a, 0, i, false);
        return j9eVar.H() == i2;
    }

    @Override // defpackage.ll6
    public final int b(nl6 nl6Var, b78 b78Var) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            zzl.s();
            return 0;
        }
        vsj vsjVar = this.g;
        vsjVar.getClass();
        int c = vsjVar.c(nl6Var, 1024, true);
        if (c != -1) {
            this.d += c;
            return 0;
        }
        this.e = 2;
        this.g.a(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        this.f = pl6Var;
        vsj mo2track = pl6Var.mo2track(1024, 4);
        this.g = mo2track;
        qm8 qm8Var = new qm8();
        String str = this.c;
        qm8Var.m = sjc.p(str);
        qm8Var.n = sjc.p(str);
        w1l.r(qm8Var, mo2track);
        this.f.endTracks();
        this.f.m(new pih());
        this.e = 1;
    }

    @Override // defpackage.ll6
    public final void seek(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.ll6
    public final void release() {
    }
}
