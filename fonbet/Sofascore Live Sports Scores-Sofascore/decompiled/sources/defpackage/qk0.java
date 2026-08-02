package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qk0 extends sk0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ tk0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk0(tk0 tk0Var, int i) {
        super(tk0Var, 0);
        this.c = i;
        switch (i) {
            case 1:
                this.d = tk0Var;
                super(tk0Var, 0);
                jde.b();
                break;
            default:
                this.d = tk0Var;
                jde.b();
                break;
        }
    }

    @Override // defpackage.sk0
    public final void a() {
        tk0 tk0Var;
        int i;
        tk0 tk0Var2;
        switch (this.c) {
            case 0:
                x52 x52Var = new x52();
                jde.c();
                try {
                    bw9 bw9Var = jde.a;
                    bw9Var.getClass();
                    synchronized (this.d.a) {
                        x52 x52Var2 = this.d.b;
                        x52Var.W(x52Var2, x52Var2.m());
                        tk0Var = this.d;
                        tk0Var.e = false;
                        i = tk0Var.l;
                    }
                    tk0Var.h.W(x52Var, x52Var.b);
                    synchronized (this.d.a) {
                        this.d.l -= i;
                    }
                    bw9Var.getClass();
                    return;
                } catch (Throwable th) {
                    try {
                        jde.a.getClass();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                x52 x52Var3 = new x52();
                jde.c();
                try {
                    bw9 bw9Var2 = jde.a;
                    bw9Var2.getClass();
                    synchronized (this.d.a) {
                        x52 x52Var4 = this.d.b;
                        x52Var3.W(x52Var4, x52Var4.b);
                        tk0Var2 = this.d;
                        tk0Var2.f = false;
                    }
                    tk0Var2.h.W(x52Var3, x52Var3.b);
                    this.d.h.flush();
                    bw9Var2.getClass();
                    return;
                } catch (Throwable th3) {
                    try {
                        jde.a.getClass();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
        }
    }
}
