package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ig9 implements ejh {
    public final on8 a;
    public boolean b;
    public final /* synthetic */ mg9 c;

    public ig9(mg9 mg9Var) {
        this.c = mg9Var;
        this.a = new on8(((kof) mg9Var.c.c).a.timeout());
    }

    @Override // defpackage.ejh
    public final void W(x52 x52Var, long j) {
        x52Var.getClass();
        if (this.b) {
            a70.r("closed");
            return;
        }
        if (j == 0) {
            return;
        }
        kof kofVar = (kof) this.c.c.c;
        if (kofVar.c) {
            a70.r("closed");
            return;
        }
        kofVar.b.a1(j);
        kofVar.k();
        kofVar.S("\r\n");
        kofVar.W(x52Var, j);
        kofVar.S("\r\n");
    }

    @Override // defpackage.ejh, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((kof) this.c.c.c).S("0\r\n\r\n");
        on8 on8Var = this.a;
        pij pijVar = on8Var.e;
        on8Var.e = pij.d;
        pijVar.a();
        pijVar.b();
        this.c.d = 3;
    }

    @Override // defpackage.ejh, java.io.Flushable
    public final synchronized void flush() {
        if (this.b) {
            return;
        }
        ((kof) this.c.c.c).flush();
    }

    @Override // defpackage.ejh
    public final pij timeout() {
        return this.a;
    }
}
