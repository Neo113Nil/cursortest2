package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dk0 {
    public static final dk0 a = new dk0();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(apf apfVar, nt9 nt9Var, sq3 sq3Var) {
        ck0 ck0Var;
        int i;
        wt9 wt9Var;
        if (sq3Var instanceof ck0) {
            ck0Var = (ck0) sq3Var;
            int i2 = ck0Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ck0Var.u = i2 - Integer.MIN_VALUE;
                Object obj = ck0Var.s;
                Object obj2 = lu3.a;
                i = ck0Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    ck0Var.r = nt9Var;
                    ck0Var.u = 1;
                    obj = apfVar.c(nt9Var, ck0Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nt9Var = ck0Var.r;
                    y6a.M(obj);
                }
                wt9Var = (wt9) obj;
                if (!(wt9Var instanceof emi)) {
                    emi emiVar = (emi) wt9Var;
                    return new pj0(wnn.w(emiVar.a, nt9Var.a, 1), emiVar);
                }
                if (!(wt9Var instanceof fq5)) {
                    zzl.b();
                    return null;
                }
                fq5 fq5Var = (fq5) wt9Var;
                nr9 nr9Var = fq5Var.a;
                return new lj0(nr9Var != null ? wnn.w(nr9Var, nt9Var.a, 1) : null, fq5Var);
            }
        }
        ck0Var = new ck0(this, sq3Var);
        Object obj3 = ck0Var.s;
        Object obj22 = lu3.a;
        i = ck0Var.u;
        if (i != 0) {
        }
        wt9Var = (wt9) obj3;
        if (!(wt9Var instanceof emi)) {
        }
    }
}
