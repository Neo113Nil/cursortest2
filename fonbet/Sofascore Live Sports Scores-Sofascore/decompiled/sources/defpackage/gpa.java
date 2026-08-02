package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gpa implements xqa {
    public final int a;
    public final Object b;
    public final int c;
    public final ema d;
    public final int e;
    public final int f;
    public final List g;
    public final long h;
    public final Object i;
    public final rqa j;
    public final long k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public int p = Integer.MIN_VALUE;
    public int q;
    public int r;
    public final long s;
    public long t;
    public int u;
    public int v;
    public boolean w;

    public gpa(int i, Object obj, int i2, int i3, ema emaVar, int i4, int i5, List list, long j, Object obj2, rqa rqaVar, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = i2;
        this.d = emaVar;
        this.e = i4;
        this.f = i5;
        this.g = list;
        this.h = j;
        this.i = obj2;
        this.j = rqaVar;
        this.k = j2;
        this.l = i6;
        this.m = i7;
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = Math.max(i8, ((qhe) list.get(i9)).b);
        }
        this.n = i8;
        int i10 = i3 + i8;
        this.o = i10 >= 0 ? i10 : 0;
        this.s = (this.c << 32) | (i8 & 4294967295L);
        this.t = 0L;
        this.u = -1;
        this.v = -1;
    }

    @Override // defpackage.xqa
    public final void a(int i, int i2, int i3, int i4) {
        l(i, i2, i3, i4, -1, -1);
    }

    @Override // defpackage.xqa
    public final int b() {
        return this.g.size();
    }

    @Override // defpackage.xqa
    public final int c() {
        return this.m;
    }

    @Override // defpackage.xqa
    public final long d() {
        return this.k;
    }

    @Override // defpackage.xqa
    public final boolean e() {
        return true;
    }

    @Override // defpackage.xqa
    public final int f() {
        return this.o;
    }

    @Override // defpackage.xqa
    public final Object g(int i) {
        return ((qhe) this.g.get(i)).h();
    }

    @Override // defpackage.xqa
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.xqa
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.xqa
    public final void h() {
        this.w = true;
    }

    @Override // defpackage.xqa
    public final long i(int i) {
        return this.t;
    }

    @Override // defpackage.xqa
    public final int j() {
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(phe pheVar, boolean z) {
        if (this.p == Integer.MIN_VALUE) {
            u3a.a("position() should be called first");
        }
        List list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            qhe qheVar = (qhe) list.get(i);
            int i2 = this.q - qheVar.b;
            int i3 = this.r;
            long j = this.t;
            lqa a = this.j.a(i, this.b);
            n29 n29Var = null;
            Object[] objArr = 0;
            if (a != null) {
                if (z) {
                    a.r = j;
                } else {
                    long d = r6a.d(!r6a.b(a.r, 9223372034707292159L) ? a.r : j, ((r6a) ((eoh) a.q).getValue()).a);
                    int i4 = (int) (j & 4294967295L);
                    if (((i4 <= i2 && ((int) (d & 4294967295L)) <= i2) || (i4 >= i3 && ((int) (d & 4294967295L)) >= i3)) && ((Boolean) ((eoh) a.h).getValue()).booleanValue()) {
                        xw3.L(a.a, null, null, new jqa(a, objArr == true ? 1 : 0, 1), 3);
                    }
                    j = d;
                }
                n29Var = a.n;
            }
            long d2 = r6a.d(j, this.h);
            if (!z && a != null) {
                a.m = d2;
            }
            if (n29Var != null) {
                pheVar.d(qheVar);
                qheVar.a0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r6a.d(d2, qheVar.e), n29Var);
            } else {
                phe.o(pheVar, qheVar, d2);
            }
        }
    }

    public final void l(int i, int i2, int i3, int i4, int i5, int i6) {
        this.p = i4;
        if (this.d == ema.b) {
            i2 = (i3 - i2) - this.c;
        }
        this.t = (i2 << 32) | (i & 4294967295L);
        this.u = i5;
        this.v = i6;
        this.q = -this.e;
        this.r = i4 + this.f;
    }
}
