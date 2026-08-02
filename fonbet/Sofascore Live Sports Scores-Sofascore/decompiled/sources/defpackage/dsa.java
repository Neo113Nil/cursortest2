package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dsa implements xqa {
    public final int a;
    public final List b;
    public final boolean c;
    public final fo d;
    public final lv1 e;
    public final ema f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final Object k;
    public final Object l;
    public final rqa m;
    public final long n;
    public int o;
    public final int p;
    public final int q;
    public final int r;
    public boolean s;
    public int t = Integer.MIN_VALUE;
    public int u;
    public int v;
    public final int[] w;

    public dsa(int i, List list, boolean z, fo foVar, lv1 lv1Var, ema emaVar, int i2, int i3, int i4, long j, Object obj, Object obj2, rqa rqaVar, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = foVar;
        this.e = lv1Var;
        this.f = emaVar;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = j;
        this.k = obj;
        this.l = obj2;
        this.m = rqaVar;
        this.n = j2;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            qhe qheVar = (qhe) list.get(i7);
            boolean z2 = this.c;
            i5 += z2 ? qheVar.b : qheVar.a;
            i6 = Math.max(i6, !z2 ? qheVar.b : qheVar.a);
        }
        this.p = i5;
        int i8 = i5 + this.i;
        this.q = i8 >= 0 ? i8 : 0;
        this.r = i6;
        this.w = new int[this.b.size() * 2];
    }

    @Override // defpackage.xqa
    public final void a(int i, int i2, int i3, int i4) {
        m(i, i3, i4);
    }

    @Override // defpackage.xqa
    public final int b() {
        return this.b.size();
    }

    @Override // defpackage.xqa
    public final int c() {
        return 1;
    }

    @Override // defpackage.xqa
    public final long d() {
        return this.n;
    }

    @Override // defpackage.xqa
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.xqa
    public final int f() {
        return this.q;
    }

    @Override // defpackage.xqa
    public final Object g(int i) {
        return ((qhe) this.b.get(i)).h();
    }

    @Override // defpackage.xqa
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.xqa
    public final Object getKey() {
        return this.k;
    }

    @Override // defpackage.xqa
    public final void h() {
        this.s = true;
    }

    @Override // defpackage.xqa
    public final long i(int i) {
        if (i == 0 && this.b.size() == 0) {
            int i2 = this.o;
            return this.c ? i2 & 4294967295L : i2 << 32;
        }
        int i3 = i * 2;
        int[] iArr = this.w;
        return (iArr[i3 + 1] & 4294967295L) | (iArr[i3] << 32);
    }

    @Override // defpackage.xqa
    public final int j() {
        return 0;
    }

    public final int k(long j) {
        return (int) (this.c ? j & 4294967295L : j >> 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(phe pheVar, boolean z) {
        List list;
        int i;
        if (this.t == Integer.MIN_VALUE) {
            u3a.a("position() should be called first");
        }
        List list2 = this.b;
        int size = list2.size();
        int i2 = 0;
        while (i2 < size) {
            qhe qheVar = (qhe) list2.get(i2);
            int i3 = this.u;
            boolean z2 = this.c;
            int i4 = i3 - (z2 ? qheVar.b : qheVar.a);
            int i5 = this.v;
            long i6 = i(i2);
            lqa a = this.m.a(i2, this.k);
            n29 n29Var = null;
            Object[] objArr = 0;
            if (a != null) {
                if (z) {
                    a.r = i6;
                    list = list2;
                    i = size;
                } else {
                    list = list2;
                    i = size;
                    if (!r6a.b(a.r, 9223372034707292159L)) {
                        i6 = a.r;
                    }
                    long d = r6a.d(i6, ((r6a) ((eoh) a.q).getValue()).a);
                    if (((k(i6) <= i4 && k(d) <= i4) || (k(i6) >= i5 && k(d) >= i5)) && ((Boolean) ((eoh) a.h).getValue()).booleanValue()) {
                        xw3.L(a.a, null, null, new jqa(a, objArr == true ? 1 : 0, 1), 3);
                    }
                    i6 = d;
                }
                n29Var = a.n;
            } else {
                list = list2;
                i = size;
            }
            long d2 = r6a.d(i6, this.j);
            if (!z && a != null) {
                a.m = d2;
            }
            if (z2) {
                if (n29Var != null) {
                    pheVar.d(qheVar);
                    qheVar.a0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r6a.d(d2, qheVar.e), n29Var);
                } else {
                    phe.o(pheVar, qheVar, d2);
                }
            } else if (n29Var == null) {
                phe.k(pheVar, qheVar, d2);
            } else if (pheVar.b() == ema.a || pheVar.c() == 0) {
                pheVar.d(qheVar);
                qheVar.a0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r6a.d(d2, qheVar.e), n29Var);
            } else {
                int c = (pheVar.c() - qheVar.a) - ((int) (d2 >> 32));
                pheVar.d(qheVar);
                qheVar.a0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r6a.d((((int) (d2 & 4294967295L)) & 4294967295L) | (c << 32), qheVar.e), n29Var);
            }
            i2++;
            list2 = list;
            size = i;
        }
    }

    public final void m(int i, int i2, int i3) {
        int i4;
        this.o = i;
        boolean z = this.c;
        this.t = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            qhe qheVar = (qhe) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.w;
            if (z) {
                fo foVar = this.d;
                if (foVar == null) {
                    throw wv8.d("null horizontalAlignment when isVertical == true");
                }
                iArr[i6] = foVar.a(qheVar.a, i2, this.f);
                iArr[i6 + 1] = i;
                i4 = qheVar.b;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                lv1 lv1Var = this.e;
                if (lv1Var == null) {
                    throw wv8.d("null verticalAlignment when isVertical == false");
                }
                iArr[i7] = lv1Var.a(qheVar.b, i3);
                i4 = qheVar.a;
            }
            i += i4;
        }
        this.u = -this.g;
        this.v = this.t + this.h;
    }
}
