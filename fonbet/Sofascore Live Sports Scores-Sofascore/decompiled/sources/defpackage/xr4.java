package defpackage;

import java.util.HashMap;
import java.util.Random;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xr4 {
    public static final tr4 h = new tr4(1);
    public static final Random i = new Random();
    public s6c d;
    public String f;
    public final kij a = new kij();
    public final iij b = new iij();
    public final HashMap c = new HashMap();
    public mij e = mij.a;
    public long g = -1;

    public final void a(vr4 vr4Var) {
        long j = vr4Var.c;
        if (j != -1 && vr4Var.e) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r12 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vr4 b(int i2, scc sccVar) {
        long j;
        long j2;
        long j3;
        HashMap hashMap = this.c;
        vr4 vr4Var = null;
        long j4 = Long.MAX_VALUE;
        for (vr4 vr4Var2 : hashMap.values()) {
            long j5 = vr4Var2.c;
            scc sccVar2 = vr4Var2.d;
            if (j5 == -1 && i2 == vr4Var2.b && sccVar != null) {
                long j6 = sccVar.d;
                xr4 xr4Var = vr4Var2.g;
                j = -1;
                vr4 vr4Var3 = (vr4) xr4Var.c.get(xr4Var.f);
                if (vr4Var3 != null) {
                    j3 = vr4Var3.c;
                }
                j3 = xr4Var.g + 1;
                if (j6 >= j3) {
                    vr4Var2.c = j6;
                }
            } else {
                j = -1;
            }
            if (sccVar != null) {
                long j7 = sccVar.d;
                if (j7 != j) {
                    if (sccVar2 == null) {
                        if (!sccVar.b() && j7 == vr4Var2.c) {
                            j2 = vr4Var2.c;
                            if (j2 == j || j2 < j4) {
                                vr4Var = vr4Var2;
                                j4 = j2;
                            } else if (j2 == j4) {
                                String str = nik.a;
                                if (vr4Var.d != null && sccVar2 != null) {
                                    vr4Var = vr4Var2;
                                }
                            }
                        }
                    } else if (j7 == sccVar2.d && sccVar.b == sccVar2.b && sccVar.c == sccVar2.c) {
                        j2 = vr4Var2.c;
                        if (j2 == j) {
                        }
                        vr4Var = vr4Var2;
                        j4 = j2;
                    }
                }
            }
            if (i2 == vr4Var2.b) {
                j2 = vr4Var2.c;
                if (j2 == j) {
                }
                vr4Var = vr4Var2;
                j4 = j2;
            }
        }
        if (vr4Var != null) {
            return vr4Var;
        }
        String str2 = (String) h.get();
        vr4 vr4Var4 = new vr4(this, str2, i2, sccVar);
        hashMap.put(str2, vr4Var4);
        return vr4Var4;
    }

    public final synchronized String c(mij mijVar, scc sccVar) {
        return b(mijVar.g(sccVar.a, this.b).c, sccVar).a;
    }

    public final void d(qv qvVar) {
        scc sccVar;
        mij mijVar = qvVar.b;
        int i2 = qvVar.c;
        scc sccVar2 = qvVar.d;
        boolean p = mijVar.p();
        String str = this.f;
        HashMap hashMap = this.c;
        if (p) {
            if (str != null) {
                vr4 vr4Var = (vr4) hashMap.get(str);
                vr4Var.getClass();
                a(vr4Var);
                return;
            }
            return;
        }
        vr4 vr4Var2 = (vr4) hashMap.get(str);
        this.f = b(i2, sccVar2).a;
        e(qvVar);
        if (sccVar2 != null) {
            long j = sccVar2.d;
            if (sccVar2.b()) {
                if (vr4Var2 != null && vr4Var2.c == j && (sccVar = vr4Var2.d) != null && sccVar.b == sccVar2.b && sccVar.c == sccVar2.c) {
                    return;
                }
                b(i2, new scc(sccVar2.a, j));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void e(qv qvVar) {
        long j;
        this.d.getClass();
        if (qvVar.b.p()) {
            return;
        }
        scc sccVar = qvVar.d;
        if (sccVar != null) {
            long j2 = sccVar.d;
            if (j2 != -1) {
                vr4 vr4Var = (vr4) this.c.get(this.f);
                if (vr4Var != null) {
                    j = vr4Var.c;
                    if (j != -1) {
                        if (j2 < j) {
                            return;
                        }
                    }
                }
                j = this.g + 1;
                if (j2 < j) {
                }
            }
            vr4 vr4Var2 = (vr4) this.c.get(this.f);
            if (vr4Var2 != null && vr4Var2.c == -1 && vr4Var2.b != qvVar.c) {
                return;
            }
        }
        vr4 b = b(qvVar.c, qvVar.d);
        if (this.f == null) {
            this.f = b.a;
        }
        scc sccVar2 = qvVar.d;
        if (sccVar2 != null && sccVar2.b()) {
            scc sccVar3 = qvVar.d;
            vr4 b2 = b(qvVar.c, new scc(sccVar3.a, sccVar3.d, sccVar3.b));
            if (!b2.e) {
                b2.e = true;
                qvVar.b.g(qvVar.d.a, this.b);
                Math.max(0L, nik.h0(this.b.b(qvVar.d.b)) + nik.h0(this.b.e));
                this.d.getClass();
            }
        }
        if (!b.e) {
            b.e = true;
            this.d.getClass();
        }
        if (b.a.equals(this.f) && !b.f) {
            b.f = true;
            this.d.l(qvVar, b.a);
        }
    }
}
