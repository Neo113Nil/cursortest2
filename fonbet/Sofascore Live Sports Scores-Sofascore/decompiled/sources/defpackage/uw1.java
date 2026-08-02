package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uw1 implements am4 {
    public final yt9 a;
    public final tvd b;
    public final g4h c;
    public final hf6 d;

    public uw1(yt9 yt9Var, tvd tvdVar, g4h g4hVar, hf6 hf6Var) {
        this.a = yt9Var;
        this.b = tvdVar;
        this.c = g4hVar;
        this.d = hf6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004b, code lost:
    
        if (r7.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.am4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        sw1 sw1Var;
        lu3 lu3Var;
        int i;
        g4h g4hVar;
        Throwable th;
        g4h g4hVar2;
        Object F;
        try {
            if (rq3Var instanceof sw1) {
                sw1Var = (sw1) rq3Var;
                int i2 = sw1Var.u;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sw1Var.u = i2 - Integer.MIN_VALUE;
                    Object obj = sw1Var.s;
                    lu3Var = lu3.a;
                    i = sw1Var.u;
                    if (i != 0) {
                        y6a.M(obj);
                        g4hVar = this.c;
                        sw1Var.r = g4hVar;
                        sw1Var.u = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g4hVar2 = sw1Var.r;
                            try {
                                y6a.M(obj);
                                vl4 vl4Var = (vl4) obj;
                                g4hVar2.c();
                                return vl4Var;
                            } catch (Throwable th2) {
                                th = th2;
                                g4hVar2.c();
                                throw th;
                            }
                        }
                        g4h g4hVar3 = sw1Var.r;
                        y6a.M(obj);
                        g4hVar = g4hVar3;
                    }
                    yj1 yj1Var = new yj1(this, 4);
                    sw1Var.r = g4hVar;
                    sw1Var.u = 2;
                    F = v8a.F(yj1Var, sw1Var);
                    if (F != lu3Var) {
                        g4h g4hVar4 = g4hVar;
                        obj = F;
                        g4hVar2 = g4hVar4;
                        vl4 vl4Var2 = (vl4) obj;
                        g4hVar2.c();
                        return vl4Var2;
                    }
                    return lu3Var;
                }
            }
            yj1 yj1Var2 = new yj1(this, 4);
            sw1Var.r = g4hVar;
            sw1Var.u = 2;
            F = v8a.F(yj1Var2, sw1Var);
            if (F != lu3Var) {
            }
            return lu3Var;
        } catch (Throwable th3) {
            g4h g4hVar5 = g4hVar;
            th = th3;
            g4hVar2 = g4hVar5;
            g4hVar2.c();
            throw th;
        }
        sw1Var = new sw1(this, (sq3) rq3Var);
        Object obj2 = sw1Var.s;
        lu3Var = lu3.a;
        i = sw1Var.u;
        if (i != 0) {
        }
    }
}
