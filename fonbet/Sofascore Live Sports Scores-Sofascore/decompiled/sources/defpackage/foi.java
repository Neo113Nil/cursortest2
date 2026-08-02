package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class foi implements rq3, mu3 {
    public int a = Integer.MIN_VALUE;
    public final /* synthetic */ goi b;

    public foi(goi goiVar) {
        this.b = goiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [rq3[]] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // defpackage.mu3
    public final mu3 getCallerFrame() {
        z0i z0iVar = z0i.a;
        int i = this.a;
        goi goiVar = this.b;
        if (i == Integer.MIN_VALUE) {
            i = goiVar.f;
            this.a = i;
        }
        if (i < 0) {
            this.a = Integer.MIN_VALUE;
            z0iVar = null;
        } else {
            try {
                ?? r2 = goiVar.e[i];
                if (r2 != 0) {
                    this.a = i - 1;
                    z0iVar = r2;
                }
            } catch (Throwable unused) {
            }
        }
        if (z0iVar instanceof mu3) {
            return z0iVar;
        }
        return null;
    }

    @Override // defpackage.rq3
    public final CoroutineContext getContext() {
        goi goiVar = this.b;
        rq3[] rq3VarArr = goiVar.e;
        int i = goiVar.f;
        rq3 rq3Var = rq3VarArr[i];
        if (rq3Var != this && rq3Var != null) {
            return rq3Var.getContext();
        }
        int i2 = i - 1;
        while (i2 >= 0) {
            int i3 = i2 - 1;
            rq3 rq3Var2 = rq3VarArr[i2];
            if (rq3Var2 != this && rq3Var2 != null) {
                return rq3Var2.getContext();
            }
            i2 = i3;
        }
        a70.r("Not started");
        return null;
    }

    @Override // defpackage.rq3
    public final void resumeWith(Object obj) {
        p2g p2gVar = w2g.b;
        boolean z = obj instanceof u2g;
        goi goiVar = this.b;
        if (!z) {
            goiVar.e(false);
            return;
        }
        Throwable a = w2g.a(obj);
        a.getClass();
        goiVar.f(new u2g(a));
    }
}
