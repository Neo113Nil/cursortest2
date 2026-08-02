package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ez2 implements hc2 {
    public final va2 b;
    public final r3 c;

    public ez2(va2 va2Var, r3 r3Var) {
        this.b = va2Var;
        this.c = r3Var;
    }

    @Override // defpackage.hc2
    public final void a(Throwable th) {
        this.b.a(th);
    }

    @Override // defpackage.hc2
    public final Throwable b() {
        return this.b.b();
    }

    @Override // defpackage.hc2
    public final Object c(sq3 sq3Var) {
        return this.b.c(sq3Var);
    }

    @Override // defpackage.hc2
    public final w52 d() {
        return this.b.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r5.c.invoke(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r5.b.e(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.hc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(rq3 rq3Var) {
        dz2 dz2Var;
        int i;
        if (rq3Var instanceof dz2) {
            dz2Var = (dz2) rq3Var;
            int i2 = dz2Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dz2Var.t = i2 - Integer.MIN_VALUE;
                Object obj = dz2Var.r;
                lu3 lu3Var = lu3.a;
                i = dz2Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    dz2Var.t = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                dz2Var.t = 2;
            }
        }
        dz2Var = new dz2(this, rq3Var);
        Object obj2 = dz2Var.r;
        lu3 lu3Var2 = lu3.a;
        i = dz2Var.t;
        if (i != 0) {
        }
        dz2Var.t = 2;
    }
}
