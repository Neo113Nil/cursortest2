package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class b55 implements ya {
    public final /* synthetic */ int a;
    public final /* synthetic */ d55 b;

    public /* synthetic */ b55(d55 d55Var, int i) {
        this.a = i;
        this.b = d55Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r2 == false) goto L24;
     */
    @Override // defpackage.ya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean b;
        int i = this.a;
        boolean z = true;
        d55 d55Var = this.b;
        switch (i) {
            case 0:
                mjc mjcVar = (mjc) d55Var.g;
                lw9 lw9Var = (lw9) d55Var.i;
                mjcVar.getClass();
                if (!lw9Var.b.b) {
                    ((k48) mjcVar.c).c().addOnSuccessListener(mjcVar.g, new kjc(mjcVar, lw9Var, 0));
                    int i2 = ljc.a[lw9Var.a.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            b = mjc.b(((gtc) lw9Var).f);
                        } else if (i2 != 3) {
                            if (i2 == 4) {
                                b = mjc.b(((at9) lw9Var).d);
                            }
                            z = false;
                            mjcVar.c(lw9Var, "fiam_impression", z);
                        } else {
                            b = mjc.b(((wz0) lw9Var).f);
                        }
                        z = true ^ b;
                        mjcVar.c(lw9Var, "fiam_impression", z);
                    } else {
                        jk2 jk2Var = (jk2) lw9Var;
                        boolean b2 = mjc.b(jk2Var.f);
                        boolean b3 = mjc.b(jk2Var.g);
                        if (!b2) {
                        }
                        z = false;
                        mjcVar.c(lw9Var, "fiam_impression", z);
                    }
                }
                qy4 qy4Var = mjcVar.f;
                for (py4 py4Var : qy4Var.e.values()) {
                    Executor executor = qy4Var.a;
                    py4Var.getClass();
                    executor.execute(new mc3(25, py4Var, lw9Var));
                }
                break;
            default:
                d55Var.a = true;
                break;
        }
    }
}
