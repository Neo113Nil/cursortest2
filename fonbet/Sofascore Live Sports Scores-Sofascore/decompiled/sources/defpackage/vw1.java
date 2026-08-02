package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vw1 {
    public final zt9 a;
    public final xvd b;
    public final g4h c;
    public final int d;

    public vw1(zt9 zt9Var, xvd xvdVar, g4h g4hVar, int i) {
        this.a = zt9Var;
        this.b = xvdVar;
        this.c = g4hVar;
        this.d = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0052, code lost:
    
        if (r8.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        tw1 tw1Var;
        lu3 lu3Var;
        int i;
        g4h g4hVar;
        Throwable th;
        g4h g4hVar2;
        Object F;
        try {
            if (sq3Var instanceof tw1) {
                tw1Var = (tw1) sq3Var;
                int i2 = tw1Var.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    tw1Var.v = i2 - Integer.MIN_VALUE;
                    Object obj = tw1Var.t;
                    lu3Var = lu3.a;
                    i = tw1Var.v;
                    if (i != 0) {
                        y6a.M(obj);
                        tw1Var.r = this;
                        g4hVar = this.c;
                        tw1Var.s = g4hVar;
                        tw1Var.v = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g4hVar2 = (g4h) tw1Var.r;
                            try {
                                y6a.M(obj);
                                wl4 wl4Var = (wl4) obj;
                                g4hVar2.c();
                                return wl4Var;
                            } catch (Throwable th2) {
                                th = th2;
                                g4hVar2.c();
                                throw th;
                            }
                        }
                        g4h g4hVar3 = tw1Var.s;
                        vw1 vw1Var = (vw1) tw1Var.r;
                        y6a.M(obj);
                        g4hVar = g4hVar3;
                        this = vw1Var;
                    }
                    w1 w1Var = new w1(this, 21);
                    tw1Var.r = g4hVar;
                    tw1Var.s = null;
                    tw1Var.v = 2;
                    F = v8a.F(w1Var, tw1Var);
                    if (F != lu3Var) {
                        g4h g4hVar4 = g4hVar;
                        obj = F;
                        g4hVar2 = g4hVar4;
                        wl4 wl4Var2 = (wl4) obj;
                        g4hVar2.c();
                        return wl4Var2;
                    }
                    return lu3Var;
                }
            }
            w1 w1Var2 = new w1(this, 21);
            tw1Var.r = g4hVar;
            tw1Var.s = null;
            tw1Var.v = 2;
            F = v8a.F(w1Var2, tw1Var);
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
        tw1Var = new tw1(this, sq3Var);
        Object obj2 = tw1Var.t;
        lu3Var = lu3.a;
        i = tw1Var.v;
        if (i != 0) {
        }
    }
}
