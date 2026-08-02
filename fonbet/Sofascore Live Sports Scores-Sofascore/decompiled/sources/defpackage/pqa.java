package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pqa {
    public an3 b;
    public int c;
    public int d;
    public int f;
    public int g;
    public final /* synthetic */ rqa h;
    public lqa[] a = z8e.d;
    public int e = 1;

    public pqa(rqa rqaVar) {
        this.h = rqaVar;
    }

    public static void b(pqa pqaVar, xqa xqaVar, ku3 ku3Var, k29 k29Var, int i, int i2) {
        pqaVar.h.getClass();
        long i3 = xqaVar.i(0);
        pqaVar.a(xqaVar, ku3Var, k29Var, i, i2, (int) (!xqaVar.e() ? i3 & 4294967295L : i3 >> 32));
    }

    public final void a(xqa xqaVar, ku3 ku3Var, k29 k29Var, int i, int i2, int i3) {
        lqa[] lqaVarArr;
        lqa[] lqaVarArr2 = this.a;
        int length = lqaVarArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                this.f = i;
                this.g = i2;
                break;
            } else {
                lqa lqaVar = lqaVarArr2[i4];
                if (lqaVar != null && lqaVar.g) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        int b = xqaVar.b();
        int length2 = this.a.length;
        while (true) {
            lqaVarArr = this.a;
            if (b >= length2) {
                break;
            }
            lqa lqaVar2 = lqaVarArr[b];
            if (lqaVar2 != null) {
                lqaVar2.c();
            }
            b++;
        }
        if (lqaVarArr.length != xqaVar.b()) {
            this.a = (lqa[]) Arrays.copyOf(this.a, xqaVar.b());
        }
        this.b = new an3(xqaVar.d());
        this.c = i3;
        this.d = xqaVar.j();
        this.e = xqaVar.c();
        int b2 = xqaVar.b();
        for (int i5 = 0; i5 < b2; i5++) {
            Object g = xqaVar.g(i5);
            aqa aqaVar = g instanceof aqa ? (aqa) g : null;
            lqa[] lqaVarArr3 = this.a;
            if (aqaVar == null) {
                lqa lqaVar3 = lqaVarArr3[i5];
                if (lqaVar3 != null) {
                    lqaVar3.c();
                }
                this.a[i5] = null;
            } else {
                lqa lqaVar4 = lqaVarArr3[i5];
                if (lqaVar4 == null) {
                    lqaVar4 = new lqa(ku3Var, k29Var, new sr8(this.h, 15));
                    this.a[i5] = lqaVar4;
                }
                lqaVar4.d = aqaVar.o;
                lqaVar4.e = aqaVar.p;
                lqaVar4.f = aqaVar.q;
            }
        }
    }
}
