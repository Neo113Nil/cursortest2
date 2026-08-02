package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n1c {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final fo e;
    public final lv1 f;
    public final ema g;
    public final boolean h;
    public final int i;
    public final int[] j;
    public int k;
    public int l;

    public n1c(int i, int i2, List list, long j, Object obj, ewd ewdVar, fo foVar, lv1 lv1Var, ema emaVar) {
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = foVar;
        this.f = lv1Var;
        this.g = emaVar;
        this.h = ewdVar == ewd.a;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            qhe qheVar = (qhe) list.get(i4);
            i3 = Math.max(i3, !this.h ? qheVar.b : qheVar.a);
        }
        this.i = i3;
        this.j = new int[this.b.size() * 2];
        this.l = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.k += i;
        int[] iArr = this.j;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.h;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        this.k = i;
        boolean z = this.h;
        this.l = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            qhe qheVar = (qhe) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.j;
            if (z) {
                fo foVar = this.e;
                if (foVar == null) {
                    throw wv8.d("null horizontalAlignment");
                }
                iArr[i6] = foVar.a(qheVar.a, i2, this.g);
                iArr[i6 + 1] = i;
                i4 = qheVar.b;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                lv1 lv1Var = this.f;
                if (lv1Var == null) {
                    throw wv8.d("null verticalAlignment");
                }
                iArr[i7] = lv1Var.a(qheVar.b, i3);
                i4 = qheVar.a;
            }
            i += i4;
        }
    }
}
