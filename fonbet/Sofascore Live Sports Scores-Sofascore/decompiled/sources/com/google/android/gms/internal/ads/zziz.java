package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zziz extends zzbf {
    public final int b;
    public final zzzj c;

    public zziz(zzzj zzzjVar) {
        this.c = zzzjVar;
        this.b = zzzjVar.b.length;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbe b(int i, zzbe zzbeVar, long j) {
        int q = q(i);
        int u = u(q);
        int t = t(q);
        s(q).b(i - u, zzbeVar, j);
        Object v = v(q);
        Object obj = zzbe.m;
        Object obj2 = zzbeVar.a;
        if (obj != obj2) {
            v = Pair.create(v, obj2);
        }
        zzbeVar.a = v;
        zzbeVar.k += t;
        zzbeVar.l += t;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbd d(int i, zzbd zzbdVar, boolean z) {
        int p = p(i);
        int u = u(p);
        s(p).d(i - t(p), zzbdVar, z);
        zzbdVar.c += u;
        if (z) {
            Object v = v(p);
            Object obj = zzbdVar.b;
            obj.getClass();
            zzbdVar.b = Pair.create(v, obj);
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int e(Object obj) {
        int e;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int r = r(obj2);
            if (r != -1 && (e = s(r).e(obj3)) != -1) {
                return t(r) + e;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final Object f(int i) {
        int p = p(i);
        return Pair.create(v(p), s(p).f(i - t(p)));
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int h(int i, int i2, boolean z) {
        int q = q(i);
        int u = u(q);
        int h = s(q).h(i - u, i2 == 2 ? 0 : i2, z);
        if (h != -1) {
            return u + h;
        }
        int w = w(q, z);
        while (w != -1 && s(w).g()) {
            w = w(w, z);
        }
        if (w != -1) {
            return s(w).k(z) + u(w);
        }
        if (i2 == 2) {
            return k(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int i(int i) {
        int q = q(i);
        int u = u(q);
        int i2 = s(q).i(i - u);
        if (i2 != -1) {
            return u + i2;
        }
        int x = x(q, false);
        while (x != -1 && s(x).g()) {
            x = x(x, false);
        }
        if (x == -1) {
            return -1;
        }
        return s(x).j(false) + u(x);
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int j(boolean z) {
        int i;
        int i2 = this.b;
        if (i2 != 0) {
            if (z) {
                int[] iArr = this.c.b;
                int length = iArr.length;
                i = length > 0 ? iArr[length - 1] : -1;
            } else {
                i = i2 - 1;
            }
            while (s(i).g()) {
                i = x(i, z);
                if (i == -1) {
                }
            }
            return s(i).j(z) + u(i);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int k(boolean z) {
        if (this.b != 0) {
            int i = 0;
            if (z) {
                int[] iArr = this.c.b;
                i = iArr.length > 0 ? iArr[0] : -1;
            }
            while (s(i).g()) {
                i = w(i, z);
                if (i == -1) {
                }
            }
            return s(i).k(z) + u(i);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbd o(Object obj, zzbd zzbdVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int r = r(obj2);
        int u = u(r);
        s(r).o(obj3, zzbdVar);
        zzbdVar.c += u;
        zzbdVar.b = obj;
        return zzbdVar;
    }

    public abstract int p(int i);

    public abstract int q(int i);

    public abstract int r(Object obj);

    public abstract zzbf s(int i);

    public abstract int t(int i);

    public abstract int u(int i);

    public abstract Object v(int i);

    public final int w(int i, boolean z) {
        if (!z) {
            if (i >= this.b - 1) {
                return -1;
            }
            return i + 1;
        }
        zzzj zzzjVar = this.c;
        int i2 = zzzjVar.c[i] + 1;
        int[] iArr = zzzjVar.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int x(int i, boolean z) {
        if (!z) {
            if (i <= 0) {
                return -1;
            }
            return i - 1;
        }
        zzzj zzzjVar = this.c;
        int i2 = zzzjVar.c[i] - 1;
        if (i2 >= 0) {
            return zzzjVar.b[i2];
        }
        return -1;
    }
}
