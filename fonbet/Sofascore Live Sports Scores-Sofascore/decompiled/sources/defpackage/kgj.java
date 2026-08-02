package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kgj {
    public final int a;
    public final wtc b;
    public final Function1 c;
    public kgj d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ lgj h;

    public kgj(lgj lgjVar, int i, wtc wtcVar, Function1 function1) {
        this.h = lgjVar;
        this.a = i;
        this.b = wtcVar;
        this.c = function1;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        nwf nwfVar;
        nwf nwfVar2;
        long j5 = this.h.f;
        wtc wtcVar = this.b;
        wdd a0 = c6o.a0(wtcVar, 2);
        wma c0 = c6o.c0(wtcVar);
        boolean I = c0.I();
        c40 c40Var = c0.F;
        if (I) {
            if (((wdd) c40Var.e) != a0) {
                long floatToRawIntBits = (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = a0.c;
                wdd wddVar = (wdd) c40Var.e;
                wddVar.getClass();
                nwfVar = new nwf(s6a.L(wddVar.o(a0, floatToRawIntBits)), (4294967295L & (((int) (r3 & 4294967295L)) + ((int) (j6 & 4294967295L)))) | ((((int) (r3 >> 32)) + ((int) (j6 >> 32))) << 32), j3, j4, j5, fArr, wtcVar);
            } else {
                nwfVar = new nwf(j, j2, j3, j4, j5, fArr, wtcVar);
            }
            nwfVar2 = nwfVar;
        } else {
            nwfVar2 = null;
        }
        if (nwfVar2 == null) {
            return;
        }
        this.c.invoke(nwfVar2);
    }

    public final void b() {
        lgj lgjVar = this.h;
        uzc uzcVar = lgjVar.a;
        int i = this.a;
        kgj kgjVar = (kgj) uzcVar.g(i);
        if (kgjVar != null) {
            if (kgjVar == this) {
                kgj kgjVar2 = this.d;
                this.d = null;
                if (kgjVar2 == null) {
                    wma c0 = c6o.c0(this.b.a);
                    if (c0.g) {
                        ((xy) zma.a(c0)).getRectManager().b.D(c0.b, false);
                        return;
                    }
                    return;
                }
                int d = uzcVar.d(i);
                Object[] objArr = uzcVar.c;
                Object obj = objArr[d];
                uzcVar.b[d] = i;
                objArr[d] = kgjVar2;
                return;
            }
            int d2 = uzcVar.d(i);
            Object[] objArr2 = uzcVar.c;
            Object obj2 = objArr2[d2];
            uzcVar.b[d2] = i;
            objArr2[d2] = kgjVar;
            while (true) {
                kgj kgjVar3 = kgjVar.d;
                if (kgjVar3 == null) {
                    break;
                }
                if (kgjVar3 == this) {
                    kgjVar.d = this.d;
                    this.d = null;
                    return;
                }
                kgjVar = kgjVar3;
            }
        }
        kgj kgjVar4 = lgjVar.b;
        if (kgjVar4 == this) {
            lgjVar.b = kgjVar4.d;
            this.d = null;
            return;
        }
        kgj kgjVar5 = kgjVar4 != null ? kgjVar4.d : null;
        while (true) {
            kgj kgjVar6 = kgjVar4;
            kgjVar4 = kgjVar5;
            if (kgjVar4 == null) {
                return;
            }
            if (kgjVar4 == this) {
                if (kgjVar6 != null) {
                    kgjVar6.d = kgjVar4.d;
                }
                this.d = null;
                return;
            }
            kgjVar5 = kgjVar4.d;
        }
    }
}
