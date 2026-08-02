package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class hg9 implements cwh {
    public final jl9 a;
    public final on8 b;
    public boolean c;
    public final /* synthetic */ mg9 d;

    public hg9(mg9 mg9Var, jl9 jl9Var) {
        jl9Var.getClass();
        this.d = mg9Var;
        this.a = jl9Var;
        this.b = new on8(((lof) mg9Var.c.b).a.timeout());
    }

    public final void e(q89 q89Var) {
        jod jodVar;
        ss3 ss3Var;
        q89Var.getClass();
        mg9 mg9Var = this.d;
        int i = mg9Var.d;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            zzl.q(mg9Var.d, "state: ");
            return;
        }
        on8 on8Var = this.b;
        pij pijVar = on8Var.e;
        on8Var.e = pij.d;
        pijVar.a();
        pijVar.b();
        mg9Var.d = 6;
        if (q89Var.size() <= 0 || (jodVar = mg9Var.a) == null || (ss3Var = jodVar.j) == null) {
            return;
        }
        yi9.b(ss3Var, this.a, q89Var);
    }

    @Override // defpackage.cwh
    public long read(x52 x52Var, long j) {
        mg9 mg9Var = this.d;
        x52Var.getClass();
        try {
            return ((lof) mg9Var.c.b).read(x52Var, j);
        } catch (IOException e) {
            mg9Var.b.a();
            this.e(mg9.f);
            throw e;
        }
    }

    @Override // defpackage.cwh
    public final pij timeout() {
        return this.b;
    }
}
