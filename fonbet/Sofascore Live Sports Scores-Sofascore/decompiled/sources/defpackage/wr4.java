package defpackage;

import java.util.HashMap;
import java.util.Random;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wr4 {
    public static final tr4 g = new tr4(0);
    public static final Random h = new Random();
    public r6c d;
    public String f;
    public final jij a = new jij();
    public final hij b = new hij();
    public final HashMap c = new HashMap();
    public lij e = lij.a;

    public final ur4 a(int i, rcc rccVar) {
        long j;
        HashMap hashMap = this.c;
        ur4 ur4Var = null;
        long j2 = Long.MAX_VALUE;
        for (ur4 ur4Var2 : hashMap.values()) {
            long j3 = ur4Var2.c;
            rcc rccVar2 = ur4Var2.d;
            if (j3 == -1 && i == ur4Var2.b && rccVar != null) {
                j3 = rccVar.d;
                ur4Var2.c = j3;
            }
            if (rccVar != null) {
                long j4 = rccVar.d;
                if (rccVar2 != null) {
                    j = -1;
                    if (j4 == rccVar2.d && rccVar.b == rccVar2.b && rccVar.c == rccVar2.c) {
                    }
                } else if (!rccVar.a()) {
                    j3 = ur4Var2.c;
                    if (j4 == j3) {
                        j = -1;
                    }
                }
            } else if (i == ur4Var2.b) {
                j = -1;
            }
            if (j3 == j || j3 < j2) {
                ur4Var = ur4Var2;
                j2 = j3;
            } else if (j3 == j2) {
                int i2 = lik.a;
                if (ur4Var.d != null && rccVar2 != null) {
                    ur4Var = ur4Var2;
                }
            }
        }
        if (ur4Var != null) {
            return ur4Var;
        }
        String str = (String) g.get();
        ur4 ur4Var3 = new ur4(this, str, i, rccVar);
        hashMap.put(str, ur4Var3);
        return ur4Var3;
    }

    public final synchronized String b(lij lijVar, rcc rccVar) {
        return a(lijVar.g(rccVar.a, this.b).c, rccVar).a;
    }

    public final void c(pv pvVar) {
        rcc rccVar;
        lij lijVar = pvVar.b;
        int i = pvVar.c;
        rcc rccVar2 = pvVar.d;
        if (lijVar.p()) {
            this.f = null;
            return;
        }
        ur4 ur4Var = (ur4) this.c.get(this.f);
        this.f = a(i, rccVar2).a;
        d(pvVar);
        if (rccVar2 != null) {
            long j = rccVar2.d;
            if (rccVar2.a()) {
                if (ur4Var != null && ur4Var.c == j && (rccVar = ur4Var.d) != null && rccVar.b == rccVar2.b && rccVar.c == rccVar2.c) {
                    return;
                }
                a(i, new rcc(rccVar2.a, j));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r1.d < r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void d(pv pvVar) {
        try {
            this.d.getClass();
        } finally {
        }
        if (pvVar.b.p()) {
            return;
        }
        ur4 ur4Var = (ur4) this.c.get(this.f);
        rcc rccVar = pvVar.d;
        if (rccVar != null && ur4Var != null) {
            long j = ur4Var.c;
            if (j == -1) {
                if (ur4Var.b != pvVar.c) {
                    return;
                }
            }
        }
        ur4 a = a(pvVar.c, rccVar);
        if (this.f == null) {
            this.f = a.a;
        }
        rcc rccVar2 = pvVar.d;
        if (rccVar2 != null && rccVar2.a()) {
            rcc rccVar3 = pvVar.d;
            ur4 a2 = a(pvVar.c, new rcc(rccVar3.a, rccVar3.d, rccVar3.b));
            if (!a2.e) {
                a2.e = true;
                pvVar.b.g(pvVar.d.a, this.b);
                Math.max(0L, lik.F(this.b.d(pvVar.d.b)) + lik.F(this.b.e));
                this.d.getClass();
            }
        }
        if (!a.e) {
            a.e = true;
            this.d.getClass();
        }
        if (a.a.equals(this.f) && !a.f) {
            a.f = true;
            this.d.e(pvVar, a.a);
        }
    }
}
