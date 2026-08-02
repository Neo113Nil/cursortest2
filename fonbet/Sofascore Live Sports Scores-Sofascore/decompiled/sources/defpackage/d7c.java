package defpackage;

import android.util.Pair;
import com.google.android.gms.internal.ads.zza;
import com.google.android.gms.internal.ads.zzabe;
import com.google.android.gms.internal.ads.zzabm;
import com.google.android.gms.internal.ads.zzabp;
import com.google.android.gms.internal.ads.zzbd;
import com.google.android.gms.internal.ads.zzbe;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzgxj;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzjx;
import com.google.android.gms.internal.ads.zznq;
import com.google.android.gms.internal.ads.zzxm;
import com.google.android.gms.internal.ads.zzxo;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class d7c {
    public long a;
    public int b;
    public boolean c;
    public int d;
    public Object e;
    public long f;
    public ArrayList g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;

    public d7c(zznq zznqVar, zzea zzeaVar, xto xtoVar) {
        this.j = zznqVar;
        this.k = zzeaVar;
        this.q = xtoVar;
        this.h = new zzbd();
        this.i = new zzbe();
        this.g = new ArrayList();
    }

    public static scc n(mij mijVar, Object obj, long j, long j2, kij kijVar, iij iijVar) {
        mijVar.g(obj, iijVar);
        mijVar.n(iijVar.c, kijVar);
        mijVar.b(obj);
        int i = iijVar.g.b;
        if (i != 0) {
            if (i == 1) {
                iijVar.d(0);
            }
            iijVar.e(iijVar.g.e);
        }
        mijVar.g(obj, iijVar);
        int d = iijVar.g.d(j, iijVar.d);
        return d == -1 ? new scc(obj, j2, iijVar.g.c(j, iijVar.d)) : new scc(obj, d, iijVar.c(d), j2, -1);
    }

    public static zzxo s(zzbf zzbfVar, Object obj, long j, zzbe zzbeVar, zzbd zzbdVar) {
        zzbfVar.o(obj, zzbdVar);
        zzbfVar.b(zzbdVar.c, zzbeVar, 0L);
        zzbfVar.e(obj);
        zzbdVar.f.getClass();
        zzbfVar.o(obj, zzbdVar);
        zzbdVar.f.a(-1);
        return new zzxo(obj, j, -1);
    }

    public boolean A(zzbf zzbfVar, zzxo zzxoVar, boolean z) {
        int e = zzbfVar.e(zzxoVar.a);
        zzbd zzbdVar = (zzbd) this.h;
        int i = zzbfVar.d(e, zzbdVar, false).c;
        zzbe zzbeVar = (zzbe) this.i;
        return !zzbfVar.b(i, zzbeVar, 0L).g && zzbfVar.l(e, zzbdVar, zzbeVar, this.b, this.c) == -1 && z;
    }

    public long B(zzbf zzbfVar, zzxo zzxoVar) {
        Object obj = zzxoVar.a;
        zzbd zzbdVar = (zzbd) this.h;
        zzbfVar.o(obj, zzbdVar);
        if (zzxoVar.b()) {
            return zzbdVar.b(zzxoVar.b, zzxoVar.c);
        }
        int i = zzxoVar.e;
        if (i == -1) {
            return zzbdVar.d;
        }
        zzbdVar.f.a(i).getClass();
        return 0L;
    }

    public int C(zzbf zzbfVar, int i) {
        this.b = i;
        return v(zzbfVar);
    }

    public int D(zzbf zzbfVar, boolean z) {
        this.c = z;
        return v(zzbfVar);
    }

    public void E(zzjx zzjxVar) {
        zzjxVar.getClass();
        J();
    }

    public void F(long j) {
        jxo jxoVar = (jxo) this.o;
        if (jxoVar != null) {
            zzguk.f(jxoVar.m == null);
            if (jxoVar.e) {
                jxoVar.a.a(j - jxoVar.p);
            }
        }
    }

    public boolean G() {
        jxo jxoVar = (jxo) this.o;
        if (jxoVar != null) {
            return !jxoVar.g.h && jxoVar.b() && ((jxo) this.o).g.e != C.TIME_UNSET && this.d < 100;
        }
        return true;
    }

    public kxo H(long j, eyo eyoVar) {
        jxo jxoVar = (jxo) this.o;
        if (jxoVar != null) {
            return w(eyoVar.a, jxoVar, j);
        }
        zzbf zzbfVar = eyoVar.a;
        zzxo zzxoVar = eyoVar.b;
        long j2 = eyoVar.c;
        long j3 = eyoVar.r;
        Object obj = zzxoVar.a;
        zzbfVar.o(obj, (zzbd) this.h);
        return zzxoVar.b() ? x(zzbfVar, obj, zzxoVar.b, zzxoVar.c, j2, zzxoVar.d) : y(zzbfVar, obj, j3, C.TIME_UNSET, j2, zzxoVar.d);
    }

    public jxo I(kxo kxoVar) {
        jxo jxoVar;
        long j = kxoVar.b;
        jxo jxoVar2 = (jxo) this.o;
        long j2 = jxoVar2 == null ? 1000000000000L : (jxoVar2.p + jxoVar2.g.e) - j;
        int i = 0;
        while (true) {
            if (i >= this.g.size()) {
                jxoVar = null;
                break;
            }
            kxo kxoVar2 = ((jxo) this.g.get(i)).g;
            long j3 = kxoVar2.e;
            long j4 = kxoVar.e;
            if ((j3 == C.TIME_UNSET || j3 == j4) && kxoVar2.b == j && kxoVar2.a.equals(kxoVar.a)) {
                jxoVar = (jxo) this.g.remove(i);
                break;
            }
            i++;
        }
        if (jxoVar == null) {
            xwo xwoVar = (xwo) ((xto) this.q).b;
            zzabp c = xwoVar.f.c(xwoVar.s);
            xwoVar.X.getClass();
            jxoVar = new jxo(xwoVar.b, j2, xwoVar.d, c, xwoVar.r, kxoVar, xwoVar.e);
        } else {
            jxoVar.g = kxoVar;
            jxoVar.p = j2;
        }
        jxo jxoVar3 = (jxo) this.o;
        if (jxoVar3 == null) {
            this.l = jxoVar;
            this.m = jxoVar;
            this.n = jxoVar;
        } else if (jxoVar != jxoVar3.m) {
            jxoVar3.i();
            jxoVar3.m = jxoVar;
        }
        this.e = null;
        this.o = jxoVar;
        this.d++;
        t();
        return jxoVar;
    }

    public void J() {
        if (this.g.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.g.size(); i++) {
            ((jxo) this.g.get(i)).h();
        }
        this.g = arrayList;
        this.p = null;
        O();
    }

    public jxo K() {
        jxo jxoVar = (jxo) this.n;
        jxo jxoVar2 = (jxo) this.m;
        if (jxoVar == jxoVar2) {
            jxoVar2.getClass();
            this.n = jxoVar2.m;
        }
        jxoVar2.getClass();
        this.m = jxoVar2.m;
        t();
        jxo jxoVar3 = (jxo) this.m;
        jxoVar3.getClass();
        return jxoVar3;
    }

    public void L() {
        jxo jxoVar;
        jxo jxoVar2 = (jxo) this.n;
        if (jxoVar2 == null || (jxoVar = jxoVar2.m) == null) {
            throw null;
        }
        this.n = jxoVar;
        t();
    }

    public jxo M() {
        jxo jxoVar = (jxo) this.l;
        if (jxoVar == null) {
            return null;
        }
        if (jxoVar == ((jxo) this.m)) {
            this.m = jxoVar.m;
        }
        if (jxoVar == ((jxo) this.n)) {
            this.n = jxoVar.m;
        }
        jxoVar.h();
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.o = null;
            jxo jxoVar2 = (jxo) this.l;
            this.e = jxoVar2.b;
            this.f = jxoVar2.g.a.d;
        }
        this.l = ((jxo) this.l).m;
        t();
        return (jxo) this.l;
    }

    public int N(jxo jxoVar) {
        jxoVar.getClass();
        int i = 0;
        if (jxoVar == ((jxo) this.o)) {
            return 0;
        }
        this.o = jxoVar;
        int i2 = 0;
        while (true) {
            jxoVar = jxoVar.m;
            if (jxoVar == null) {
                break;
            }
            jxo jxoVar2 = (jxo) this.m;
            if (jxoVar == jxoVar2) {
                jxoVar2 = (jxo) this.l;
                this.m = jxoVar2;
                this.n = jxoVar2;
                i2 = 3;
            }
            if (jxoVar == ((jxo) this.n)) {
                this.n = jxoVar2;
                i2 |= 2;
            }
            jxoVar.h();
            this.d--;
        }
        jxo jxoVar3 = (jxo) this.o;
        jxoVar3.getClass();
        if (jxoVar3.m != null) {
            jxoVar3.i();
            jxoVar3.m = null;
            while (true) {
                zzabm zzabmVar = jxoVar3.o;
                if (i >= zzabmVar.a) {
                    break;
                }
                zzabmVar.a(i);
                zzabe zzabeVar = jxoVar3.o.c[i];
                i++;
            }
        }
        t();
        return i2;
    }

    public void O() {
        jxo jxoVar = (jxo) this.p;
        if (jxoVar == null || jxoVar.c()) {
            this.p = null;
            for (int i = 0; i < this.g.size(); i++) {
                jxo jxoVar2 = (jxo) this.g.get(i);
                if (!jxoVar2.c()) {
                    this.p = jxoVar2;
                    return;
                }
            }
        }
    }

    public jxo P(zzxm zzxmVar) {
        for (int i = 0; i < this.g.size(); i++) {
            jxo jxoVar = (jxo) this.g.get(i);
            if (jxoVar.a == zzxmVar) {
                return jxoVar;
            }
        }
        return null;
    }

    public void Q() {
        if (this.d == 0) {
            return;
        }
        jxo jxoVar = (jxo) this.l;
        jxoVar.getClass();
        this.e = jxoVar.b;
        this.f = jxoVar.g.a.d;
        while (jxoVar != null) {
            jxoVar.h();
            jxoVar = jxoVar.m;
        }
        this.l = null;
        this.o = null;
        this.m = null;
        this.n = null;
        this.d = 0;
        t();
    }

    public int R(zzbf zzbfVar, long j, long j2, long j3) {
        long j4;
        kxo kxoVar;
        int i;
        kxo a;
        kxo kxoVar2;
        zzbf zzbfVar2 = zzbfVar;
        jxo jxoVar = (jxo) this.l;
        jxo jxoVar2 = null;
        while (jxoVar != null) {
            kxo kxoVar3 = jxoVar.g;
            zzxo zzxoVar = kxoVar3.a;
            if (jxoVar2 != null) {
                kxo w = w(zzbfVar2, jxoVar2, j);
                if (w != null) {
                    long j5 = kxoVar3.c;
                    if (zzxoVar.equals(w.a)) {
                        long j6 = kxoVar3.b;
                        j4 = C.TIME_UNSET;
                        long j7 = w.b;
                        if (j6 == j7) {
                            kxoVar = kxoVar3;
                            i = 0;
                        } else if (j5 != C.TIME_UNSET) {
                            kxoVar = kxoVar3;
                            i = 0;
                            long j8 = w.c;
                            if (j8 != C.TIME_UNSET) {
                                if (Math.abs((j7 - j8) - (j6 - j5)) >= 5000000) {
                                }
                            }
                        }
                        a = j6 != j7 ? w.a(j6, j5) : w;
                        kxoVar2 = kxoVar;
                    }
                }
                return N(jxoVar2);
            }
            a = S(zzbfVar2, kxoVar3);
            kxoVar2 = kxoVar3;
            j4 = C.TIME_UNSET;
            i = 0;
            long j9 = kxoVar2.d;
            jxoVar.g = j9 == a.d ? a : new kxo(a.a, a.b, a.c, j9, a.e, a.f, a.g, a.h);
            long j10 = kxoVar2.e;
            long j11 = a.e;
            if (j10 != j11) {
                long j12 = j11 == j4 ? Long.MAX_VALUE : j11 + jxoVar.p;
                int i2 = (jxoVar != ((jxo) this.m) || (j2 != Long.MIN_VALUE && j2 < j12)) ? i : 1;
                int i3 = (jxoVar != ((jxo) this.n) || (j3 != Long.MIN_VALUE && j3 < j12)) ? i : 1;
                int N = N(jxoVar);
                if (N != 0) {
                    return N;
                }
                int i4 = (i2 == 0 || (j10 == j4 && zzxoVar.e == -1)) ? i : 1;
                return i3 != 0 ? i4 | 2 : i4;
            }
            jxoVar2 = jxoVar;
            jxoVar = jxoVar.m;
            zzbfVar2 = zzbfVar;
        }
        return 0;
    }

    public kxo S(zzbf zzbfVar, kxo kxoVar) {
        zzxo zzxoVar = kxoVar.a;
        int i = zzxoVar.e;
        boolean z = !zzxoVar.b() && i == -1;
        boolean z2 = z(zzbfVar, zzxoVar);
        boolean A = A(zzbfVar, zzxoVar, z);
        long B = B(zzbfVar, zzxoVar);
        Object obj = zzxoVar.a;
        zzbd zzbdVar = (zzbd) this.h;
        zzbfVar.o(obj, zzbdVar);
        if (zzxoVar.b()) {
            zzbdVar.c(zzxoVar.b);
        } else if (i != -1) {
            zzbdVar.c(i);
        }
        return new kxo(zzxoVar, kxoVar.b, kxoVar.c, kxoVar.d, B, z, z2, A);
    }

    public zzxo T(eyo eyoVar, zzbf zzbfVar, Object obj, boolean z, boolean z2) {
        long u;
        int e;
        zzbe zzbeVar = (zzbe) this.i;
        zzbd zzbdVar = (zzbd) this.h;
        int i = zzbfVar.o(obj, zzbdVar).c;
        Object obj2 = this.e;
        if (obj2 == null || (e = zzbfVar.e(obj2)) == -1 || zzbfVar.d(e, zzbdVar, false).c != i) {
            jxo jxoVar = (jxo) this.l;
            while (true) {
                if (jxoVar == null) {
                    jxo jxoVar2 = (jxo) this.l;
                    while (true) {
                        if (jxoVar2 != null) {
                            int e2 = zzbfVar.e(jxoVar2.b);
                            if (e2 != -1 && zzbfVar.d(e2, zzbdVar, false).c == i) {
                                u = jxoVar2.g.a.d;
                                break;
                            }
                            jxoVar2 = jxoVar2.m;
                        } else {
                            u = u(obj);
                            if (u == -1) {
                                u = this.a;
                                this.a = 1 + u;
                                if (((jxo) this.l) == null) {
                                    this.e = obj;
                                    this.f = u;
                                }
                            }
                        }
                    }
                } else {
                    if (jxoVar.b.equals(obj)) {
                        u = jxoVar.g.a.d;
                        break;
                    }
                    jxoVar = jxoVar.m;
                }
            }
        } else {
            u = this.f;
        }
        if (!z && !z2) {
            zzxo zzxoVar = eyoVar.b;
            long j = u;
            zzxo s = s(zzbfVar, obj, j, zzbeVar, zzbdVar);
            if (zzxoVar.b() && zzxoVar.equals(s)) {
                return zzxoVar;
            }
            zzbfVar.o(obj, zzbdVar);
            return new zzxo(obj, j, -1);
        }
        long j2 = u;
        zzbfVar.o(obj, zzbdVar);
        zzbfVar.b(zzbdVar.c, zzbeVar, 0L);
        for (int e3 = zzbfVar.e(obj); e3 >= zzbeVar.k; e3--) {
            zzbfVar.d(e3, zzbdVar, true);
            zzbdVar.f.getClass();
            zzbdVar.f.a(-1);
        }
        return s(zzbfVar, obj, j2, zzbeVar, zzbdVar);
    }

    public y6c a() {
        y6c y6cVar = (y6c) this.m;
        if (y6cVar == null) {
            return null;
        }
        if (y6cVar == ((y6c) this.n)) {
            this.n = y6cVar.m;
        }
        if (y6cVar == ((y6c) this.o)) {
            this.o = y6cVar.m;
        }
        y6cVar.i();
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.p = null;
            y6c y6cVar2 = (y6c) this.m;
            this.e = y6cVar2.b;
            this.f = y6cVar2.g.a.d;
        }
        this.m = ((y6c) this.m).m;
        k();
        return (y6c) this.m;
    }

    public void b() {
        if (this.d == 0) {
            return;
        }
        y6c y6cVar = (y6c) this.m;
        y6cVar.getClass();
        this.e = y6cVar.b;
        this.f = y6cVar.g.a.d;
        while (y6cVar != null) {
            y6cVar.i();
            y6cVar = y6cVar.m;
        }
        this.m = null;
        this.p = null;
        this.n = null;
        this.o = null;
        this.d = 0;
        k();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b7c c(mij mijVar, y6c y6cVar, long j) {
        long j2;
        long j3;
        Pair j4;
        b7c b7cVar;
        scc sccVar;
        mij mijVar2;
        iij iijVar;
        kij kijVar;
        Object obj;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        Pair j10;
        long j11;
        Object obj2 = this.i;
        kij kijVar2 = (kij) obj2;
        Object obj3 = this.h;
        iij iijVar2 = (iij) obj3;
        b7c b7cVar2 = y6cVar.g;
        long j12 = (y6cVar.p + b7cVar2.f) - j;
        if (!b7cVar2.i) {
            scc sccVar2 = b7cVar2.a;
            Object obj4 = sccVar2.a;
            int i = sccVar2.e;
            mijVar.g(obj4, iijVar2);
            boolean z = b7cVar2.h;
            if (!sccVar2.b()) {
                if (i != -1) {
                    iijVar2.d(i);
                }
                int c = iijVar2.c(i);
                iijVar2.e(i);
                if (c != iijVar2.g.b(i).b) {
                    return e(mijVar, sccVar2.a, sccVar2.e, c, b7cVar2.f, sccVar2.d, z);
                }
                mijVar.g(obj4, iijVar2);
                long b = iijVar2.b(i);
                if (b == Long.MIN_VALUE) {
                    b = iijVar2.d;
                } else {
                    iijVar2.g.b(i).getClass();
                }
                return f(mijVar, sccVar2.a, b, C.TIME_UNSET, b7cVar2.f, sccVar2.d, false);
            }
            int i2 = sccVar2.b;
            int i3 = iijVar2.g.b(i2).b;
            if (i3 != -1) {
                int b2 = iijVar2.g.b(i2).b(sccVar2.c);
                if (b2 < i3) {
                    return e(mijVar, sccVar2.a, i2, b2, b7cVar2.d, sccVar2.d, z);
                }
                long j13 = b7cVar2.d;
                if (j13 == C.TIME_UNSET) {
                    int i4 = iijVar2.c;
                    if (iijVar2.d == C.TIME_UNSET) {
                        mijVar.n(i4, kijVar2);
                        if (kijVar2.h && !kijVar2.j) {
                            j3 = Math.max(0L, j12);
                            j4 = mijVar.j(kijVar2, iijVar2, iijVar2.c, C.TIME_UNSET, j3);
                            if (j4 != null) {
                                j13 = ((Long) j4.second).longValue();
                                j2 = j3;
                            }
                        }
                    }
                    j3 = -9223372036854775807L;
                    j4 = mijVar.j(kijVar2, iijVar2, iijVar2.c, C.TIME_UNSET, j3);
                    if (j4 != null) {
                    }
                } else {
                    j2 = -9223372036854775807L;
                }
                int i5 = sccVar2.b;
                mijVar.g(obj4, iijVar2);
                long b3 = iijVar2.b(i5);
                if (b3 == Long.MIN_VALUE) {
                    b3 = iijVar2.d;
                } else {
                    iijVar2.g.b(i5).getClass();
                }
                return f(mijVar, sccVar2.a, Math.max(b3, j13), j2, b7cVar2.d, sccVar2.d, z);
            }
            return null;
        }
        kij kijVar3 = (kij) obj2;
        iij iijVar3 = (iij) obj3;
        b7c b7cVar3 = y6cVar.g;
        scc sccVar3 = b7cVar3.a;
        long j14 = b7cVar3.d;
        int d = mijVar.d(mijVar.b(sccVar3.a), iijVar3, kijVar3, this.b, this.c);
        if (d != -1) {
            int i6 = mijVar.f(d, iijVar3, true).c;
            Object obj5 = iijVar3.b;
            obj5.getClass();
            b7cVar = null;
            long j15 = sccVar3.d;
            if (mijVar.m(i6, kijVar3, 0L).m == d) {
                int i7 = iijVar3.c;
                if (iijVar3.d == C.TIME_UNSET) {
                    mijVar.n(i7, kijVar3);
                    if (kijVar3.h && !kijVar3.j) {
                        j9 = Math.max(0L, j12);
                        sccVar = sccVar3;
                        long j16 = j9;
                        j10 = mijVar.j(kijVar3, iijVar3, i6, C.TIME_UNSET, j16);
                        if (j10 != null) {
                            Object obj6 = j10.first;
                            long longValue = ((Long) j10.second).longValue();
                            y6c y6cVar2 = y6cVar.m;
                            if (y6cVar2 == null || !y6cVar2.b.equals(obj6)) {
                                long p = p(obj6);
                                if (p == -1) {
                                    p = this.a;
                                    this.a = 1 + p;
                                }
                                j11 = p;
                            } else {
                                j11 = y6cVar2.g.a.d;
                            }
                            iijVar = iijVar3;
                            j5 = longValue;
                            j8 = j16;
                            mijVar2 = mijVar;
                            kijVar = kijVar3;
                            obj = obj6;
                            j6 = j11;
                            j7 = -9223372036854775807L;
                        }
                    }
                }
                j9 = -9223372036854775807L;
                sccVar = sccVar3;
                long j162 = j9;
                j10 = mijVar.j(kijVar3, iijVar3, i6, C.TIME_UNSET, j162);
                if (j10 != null) {
                }
            } else {
                sccVar = sccVar3;
                mijVar2 = mijVar;
                iijVar = iijVar3;
                kijVar = kijVar3;
                obj = obj5;
                j5 = 0;
                j6 = j15;
                j7 = 0;
                j8 = -9223372036854775807L;
            }
            scc n = n(mijVar2, obj, j5, j6, kijVar, iijVar);
            long j17 = j5;
            iij iijVar4 = iijVar;
            if (j7 != C.TIME_UNSET && j14 != C.TIME_UNSET) {
                int i8 = mijVar2.g(sccVar.a, iijVar4).g.b;
                int i9 = iijVar4.g.e;
                if (i8 > 0) {
                    iijVar4.e(i9);
                }
            }
            return d(mijVar2, n, j7, j17, j8);
        }
        b7cVar = null;
        return b7cVar;
    }

    public b7c d(mij mijVar, scc sccVar, long j, long j2, long j3) {
        mijVar.g(sccVar.a, (iij) this.h);
        boolean b = sccVar.b();
        Object obj = sccVar.a;
        return b ? e(mijVar, obj, sccVar.b, sccVar.c, j, sccVar.d, false) : f(mijVar, obj, j2, j3, j, sccVar.d, false);
    }

    public b7c e(mij mijVar, Object obj, int i, int i2, long j, long j2, boolean z) {
        scc sccVar = new scc(obj, i, i2, j2, -1);
        iij iijVar = (iij) this.h;
        long a = mijVar.g(obj, iijVar).a(i, i2);
        long j3 = i2 == iijVar.c(i) ? iijVar.g.c : 0L;
        iijVar.e(i);
        if (a != C.TIME_UNSET && j3 >= a) {
            j3 = Math.max(0L, a - 1);
        }
        return new b7c(sccVar, j3, C.TIME_UNSET, j, C.TIME_UNSET, a, z, false, false, false, false);
    }

    public b7c f(mij mijVar, Object obj, long j, long j2, long j3, long j4, boolean z) {
        iij iijVar = (iij) this.h;
        mijVar.g(obj, iijVar);
        int c = iijVar.g.c(j, iijVar.d);
        if (c == -1) {
            kg kgVar = iijVar.g;
            if (kgVar.b > 0) {
                iijVar.e(kgVar.e);
            }
        } else {
            iijVar.e(c);
        }
        scc sccVar = new scc(obj, j4, c);
        boolean z2 = !sccVar.b() && c == -1;
        boolean i = i(mijVar, sccVar);
        boolean h = h(mijVar, sccVar, z2);
        if (c != -1) {
            iijVar.e(c);
        }
        if (c != -1) {
            iijVar.d(c);
        }
        long b = c != -1 ? iijVar.b(c) : -9223372036854775807L;
        long j5 = (b == C.TIME_UNSET || b == Long.MIN_VALUE) ? iijVar.d : b;
        return new b7c(sccVar, (j5 == C.TIME_UNSET || j < j5) ? j : Math.max(0L, j5 - 1), j2, j3, b, j5, z, false, z2, i, h);
    }

    public b7c g(mij mijVar, b7c b7cVar) {
        scc sccVar = b7cVar.a;
        int i = sccVar.e;
        boolean z = !sccVar.b() && i == -1;
        int i2 = sccVar.b;
        boolean i3 = i(mijVar, sccVar);
        boolean h = h(mijVar, sccVar, z);
        Object obj = sccVar.a;
        iij iijVar = (iij) this.h;
        mijVar.g(obj, iijVar);
        long b = (sccVar.b() || i == -1) ? -9223372036854775807L : iijVar.b(i);
        long a = sccVar.b() ? iijVar.a(i2, sccVar.c) : (b == C.TIME_UNSET || b == Long.MIN_VALUE) ? iijVar.d : b;
        if (sccVar.b()) {
            iijVar.e(i2);
        } else if (i != -1) {
            iijVar.e(i);
        }
        return new b7c(sccVar, b7cVar.b, b7cVar.c, b7cVar.d, b, a, b7cVar.g, false, z, i3, h);
    }

    public boolean h(mij mijVar, scc sccVar, boolean z) {
        int b = mijVar.b(sccVar.a);
        iij iijVar = (iij) this.h;
        int i = mijVar.f(b, iijVar, false).c;
        kij kijVar = (kij) this.i;
        return !mijVar.m(i, kijVar, 0L).h && mijVar.d(b, iijVar, kijVar, this.b, this.c) == -1 && z;
    }

    public boolean i(mij mijVar, scc sccVar) {
        boolean z = !sccVar.b() && sccVar.e == -1;
        Object obj = sccVar.a;
        if (z) {
            if (mijVar.m(mijVar.g(obj, (iij) this.h).c, (kij) this.i, 0L).n == mijVar.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public void j() {
        y6c y6cVar = (y6c) this.q;
        if (y6cVar == null || y6cVar.h()) {
            this.q = null;
            for (int i = 0; i < this.g.size(); i++) {
                y6c y6cVar2 = (y6c) this.g.get(i);
                if (!y6cVar2.h()) {
                    this.q = y6cVar2;
                    return;
                }
            }
        }
    }

    public void k() {
        zu9 s = hv9.s();
        for (y6c y6cVar = (y6c) this.m; y6cVar != null; y6cVar = y6cVar.m) {
            s.c(y6cVar.g.a);
        }
        y6c y6cVar2 = (y6c) this.n;
        ((zqi) this.k).e(new p3(28, this, s, y6cVar2 == null ? null : y6cVar2.g.a));
    }

    public void l(long j) {
        y6c y6cVar = (y6c) this.p;
        if (y6cVar != null) {
            z1a.E(y6cVar.m == null);
            if (y6cVar.e) {
                y6cVar.a.reevaluateBuffer(j - y6cVar.p);
            }
        }
    }

    public int m(y6c y6cVar) {
        y6cVar.getClass();
        int i = 0;
        if (y6cVar != ((y6c) this.p)) {
            this.p = y6cVar;
            while (true) {
                y6cVar = y6cVar.m;
                if (y6cVar == null) {
                    break;
                }
                y6c y6cVar2 = (y6c) this.n;
                if (y6cVar == y6cVar2) {
                    y6cVar2 = (y6c) this.m;
                    this.n = y6cVar2;
                    this.o = y6cVar2;
                    i = 3;
                }
                if (y6cVar == ((y6c) this.o)) {
                    this.o = y6cVar2;
                    i |= 2;
                }
                y6cVar.i();
                this.d--;
            }
            y6c y6cVar3 = (y6c) this.p;
            y6cVar3.getClass();
            if (y6cVar3.m != null) {
                y6cVar3.b();
                y6cVar3.m = null;
                y6cVar3.c();
            }
            k();
        }
        return i;
    }

    public scc o(mij mijVar, Object obj, long j) {
        long p;
        int b;
        Object obj2 = obj;
        kij kijVar = (kij) this.i;
        iij iijVar = (iij) this.h;
        int i = mijVar.g(obj2, iijVar).c;
        Object obj3 = this.e;
        if (obj3 == null || (b = mijVar.b(obj3)) == -1 || mijVar.f(b, iijVar, false).c != i) {
            y6c y6cVar = (y6c) this.m;
            while (true) {
                if (y6cVar == null) {
                    y6c y6cVar2 = (y6c) this.m;
                    while (true) {
                        if (y6cVar2 != null) {
                            int b2 = mijVar.b(y6cVar2.b);
                            if (b2 != -1 && mijVar.f(b2, iijVar, false).c == i) {
                                p = y6cVar2.g.a.d;
                                break;
                            }
                            y6cVar2 = y6cVar2.m;
                        } else {
                            p = p(obj2);
                            if (p == -1) {
                                p = this.a;
                                this.a = 1 + p;
                                if (((y6c) this.m) == null) {
                                    this.e = obj2;
                                    this.f = p;
                                }
                            }
                        }
                    }
                } else {
                    if (y6cVar.b.equals(obj2)) {
                        p = y6cVar.g.a.d;
                        break;
                    }
                    y6cVar = y6cVar.m;
                }
            }
        } else {
            p = this.f;
        }
        long j2 = p;
        mijVar.g(obj2, iijVar);
        mijVar.n(iijVar.c, kijVar);
        boolean z = false;
        for (int b3 = mijVar.b(obj); b3 >= kijVar.m; b3--) {
            mijVar.f(b3, iijVar, true);
            kg kgVar = iijVar.g;
            boolean z2 = kgVar.b > 0;
            z |= z2;
            long j3 = iijVar.d;
            if (kgVar.d(j3, j3) != -1) {
                obj2 = iijVar.b;
                obj2.getClass();
            }
            if (z && (!z2 || iijVar.d != 0)) {
                break;
            }
        }
        return n(mijVar, obj2, j, j2, kijVar, iijVar);
    }

    public long p(Object obj) {
        for (int i = 0; i < this.g.size(); i++) {
            y6c y6cVar = (y6c) this.g.get(i);
            if (y6cVar.b.equals(obj)) {
                return y6cVar.g.a.d;
            }
        }
        return -1L;
    }

    public int q(mij mijVar) {
        mij mijVar2;
        y6c y6cVar;
        y6c y6cVar2 = (y6c) this.m;
        if (y6cVar2 == null) {
            return 0;
        }
        int b = mijVar.b(y6cVar2.b);
        while (true) {
            mijVar2 = mijVar;
            b = mijVar2.d(b, (iij) this.h, (kij) this.i, this.b, this.c);
            while (true) {
                y6cVar = y6cVar2.m;
                if (y6cVar == null || y6cVar2.g.i) {
                    break;
                }
                y6cVar2 = y6cVar;
            }
            if (b == -1 || y6cVar == null || mijVar2.b(y6cVar.b) != b) {
                break;
            }
            y6cVar2 = y6cVar;
            mijVar = mijVar2;
        }
        int m = m(y6cVar2);
        y6cVar2.g = g(mijVar2, y6cVar2.g);
        return m;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int r(mij mijVar, long j, long j2, long j3) {
        long j4;
        int i;
        b7c b;
        int i2;
        y6c y6cVar = (y6c) this.m;
        y6c y6cVar2 = null;
        while (y6cVar != null) {
            b7c b7cVar = y6cVar.g;
            if (y6cVar2 != null) {
                b7c c = c(mijVar, y6cVar2, j);
                if (c != null) {
                    long j5 = c.b;
                    scc sccVar = b7cVar.a;
                    long j6 = b7cVar.c;
                    j4 = C.TIME_UNSET;
                    long j7 = b7cVar.b;
                    i = 0;
                    if (sccVar.equals(c.a)) {
                        if (j7 != j5) {
                            if (j6 != C.TIME_UNSET) {
                                long j8 = c.c;
                                if (j8 != C.TIME_UNSET) {
                                    if (Math.abs((j5 - j8) - (j7 - j6)) >= 5000000) {
                                    }
                                }
                            }
                        }
                        b = j7 != j5 ? c.b(j7, j6) : c;
                    }
                }
                return m(y6cVar2);
            }
            b = g(mijVar, b7cVar);
            j4 = C.TIME_UNSET;
            i = 0;
            long j9 = b.f;
            long j10 = b7cVar.d;
            long j11 = b7cVar.f;
            y6cVar.g = b.a(j10);
            if (j11 != j9) {
                y6cVar.k();
                long j12 = j9 == j4 ? Long.MAX_VALUE : j9 + y6cVar.p;
                int i3 = 1;
                int i4 = (y6cVar != ((y6c) this.n) || y6cVar.g.h || (j2 != Long.MIN_VALUE && j2 < j12)) ? i : 1;
                int i5 = (y6cVar != ((y6c) this.o) || (j3 != Long.MIN_VALUE && j3 < j12)) ? i : 1;
                int m = m(y6cVar);
                if (m != 0) {
                    return m;
                }
                if (j11 == j4 && b7cVar.e == Long.MIN_VALUE) {
                    long j13 = b.e;
                    if (j13 != j4 && j13 != Long.MIN_VALUE) {
                        i2 = 1;
                        if (i4 != 0 || (j11 == j4 && i2 == 0)) {
                            i3 = i;
                        }
                        return i5 == 0 ? i3 | 2 : i3;
                    }
                }
                i2 = i;
                if (i4 != 0) {
                }
                i3 = i;
                if (i5 == 0) {
                }
            } else {
                y6cVar2 = y6cVar;
                y6cVar = y6cVar.m;
            }
        }
        return 0;
    }

    public void t() {
        mio mioVar = zzgxm.b;
        zzgxj zzgxjVar = new zzgxj();
        for (jxo jxoVar = (jxo) this.l; jxoVar != null; jxoVar = jxoVar.m) {
            zzgxjVar.c(jxoVar.g.a);
        }
        jxo jxoVar2 = (jxo) this.m;
        ((zzea) this.k).f(new jgo(10, this, zzgxjVar, jxoVar2 == null ? null : jxoVar2.g.a));
    }

    public long u(Object obj) {
        for (int i = 0; i < this.g.size(); i++) {
            jxo jxoVar = (jxo) this.g.get(i);
            if (jxoVar.b.equals(obj)) {
                return jxoVar.g.a.d;
            }
        }
        return -1L;
    }

    public int v(zzbf zzbfVar) {
        zzbf zzbfVar2;
        jxo jxoVar;
        jxo jxoVar2 = (jxo) this.l;
        if (jxoVar2 == null) {
            return 0;
        }
        int e = zzbfVar.e(jxoVar2.b);
        while (true) {
            zzbfVar2 = zzbfVar;
            e = zzbfVar2.l(e, (zzbd) this.h, (zzbe) this.i, this.b, this.c);
            while (true) {
                jxoVar = jxoVar2.m;
                if (jxoVar == null || jxoVar2.g.f) {
                    break;
                }
                jxoVar2 = jxoVar;
            }
            if (e == -1 || jxoVar == null || zzbfVar2.e(jxoVar.b) != e) {
                break;
            }
            jxoVar2 = jxoVar;
            zzbfVar = zzbfVar2;
        }
        int N = N(jxoVar2);
        jxoVar2.g = S(zzbfVar2, jxoVar2.g);
        return N;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0180 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kxo w(zzbf zzbfVar, jxo jxoVar, long j) {
        zza a;
        int i;
        int[] iArr;
        int i2;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        Pair n;
        int i3;
        zzbf zzbfVar2;
        zzbe zzbeVar;
        Object obj;
        long j7;
        zzbd zzbdVar;
        long j8;
        long j9;
        long j10;
        Pair n2;
        long j11;
        zzbe zzbeVar2 = (zzbe) this.i;
        zzbd zzbdVar2 = (zzbd) this.h;
        kxo kxoVar = jxoVar.g;
        long j12 = jxoVar.p;
        long j13 = kxoVar.e;
        boolean z = kxoVar.f;
        long j14 = (j12 + j13) - j;
        zzxo zzxoVar = kxoVar.a;
        Object obj2 = zzxoVar.a;
        int i4 = -1;
        if (z) {
            long j15 = 0;
            int l = zzbfVar.l(zzbfVar.e(obj2), zzbdVar2, zzbeVar2, this.b, this.c);
            if (l == -1) {
                return null;
            }
            int i5 = zzbfVar.d(l, zzbdVar2, true).c;
            Object obj3 = zzbdVar2.b;
            obj3.getClass();
            long j16 = zzxoVar.d;
            if (zzbfVar.b(i5, zzbeVar2, 0L).k == l) {
                int i6 = zzbdVar2.c;
                if (zzbdVar2.d == C.TIME_UNSET) {
                    zzbfVar.b(i6, zzbeVar2, 0L);
                    if (zzbeVar2.g && !zzbeVar2.i) {
                        j10 = Math.max(0L, j14);
                        n2 = zzbfVar.n(zzbeVar2, zzbdVar2, i5, C.TIME_UNSET, j10);
                        if (n2 != null) {
                            return null;
                        }
                        Object obj4 = n2.first;
                        long longValue = ((Long) n2.second).longValue();
                        jxo jxoVar2 = jxoVar.m;
                        if (jxoVar2 == null || !jxoVar2.b.equals(obj4)) {
                            long u = u(obj4);
                            if (u == -1) {
                                u = this.a;
                                this.a = 1 + u;
                            }
                            j11 = u;
                        } else {
                            j11 = jxoVar2.g.a.d;
                        }
                        zzbeVar = zzbeVar2;
                        obj = obj4;
                        zzbdVar = zzbdVar2;
                        j8 = j11;
                        j9 = j10;
                        j15 = longValue;
                        zzbfVar2 = zzbfVar;
                        j7 = -9223372036854775807L;
                    }
                }
                j10 = -9223372036854775807L;
                n2 = zzbfVar.n(zzbeVar2, zzbdVar2, i5, C.TIME_UNSET, j10);
                if (n2 != null) {
                }
            } else {
                zzbfVar2 = zzbfVar;
                zzbeVar = zzbeVar2;
                obj = obj3;
                j7 = 0;
                zzbdVar = zzbdVar2;
                j8 = j16;
                j9 = -9223372036854775807L;
            }
            zzxo s = s(zzbfVar2, obj, j8, zzbeVar, zzbdVar);
            zzbd zzbdVar3 = zzbdVar;
            if (j7 != C.TIME_UNSET && kxoVar.d != C.TIME_UNSET) {
                zzbfVar2.o(obj2, zzbdVar3).f.getClass();
                zzbdVar3.f.getClass();
            }
            Object obj5 = s.a;
            zzbfVar2.o(obj5, zzbdVar3);
            boolean b = s.b();
            long j17 = s.d;
            return b ? x(zzbfVar2, obj5, -1, -1, j7, j17) : y(zzbfVar2, obj5, j15, j9, j7, j17);
        }
        zzbfVar.o(obj2, zzbdVar2);
        if (zzxoVar.b()) {
            int i7 = zzxoVar.b;
            if (zzbdVar2.f.a(i7).a == -1) {
                return null;
            }
            int i8 = zzxoVar.c;
            zza a2 = zzbdVar2.f.a(i7);
            int i9 = 1;
            int i10 = i8 + 1;
            while (true) {
                int[] iArr2 = a2.d;
                if (i10 >= iArr2.length || (i3 = iArr2[i10]) == 0 || i3 == i9) {
                    break;
                }
                i10++;
                i9 = 1;
            }
            long j18 = kxoVar.d;
            if (i10 < 0) {
                return x(zzbfVar, obj2, i7, i10, j18, zzxoVar.d);
            }
            if (j18 == C.TIME_UNSET) {
                int i11 = zzbdVar2.c;
                if (zzbdVar2.d == C.TIME_UNSET) {
                    zzbfVar.b(i11, zzbeVar2, 0L);
                    if (zzbeVar2.g && !zzbeVar2.i) {
                        j6 = Math.max(0L, j14);
                        j2 = 0;
                        long j19 = j6;
                        n = zzbfVar.n(zzbeVar2, zzbdVar2, zzbdVar2.c, C.TIME_UNSET, j19);
                        zzbdVar2 = zzbdVar2;
                        if (n != null) {
                            return null;
                        }
                        j3 = ((Long) n.second).longValue();
                        j5 = j19;
                        j4 = -9223372036854775807L;
                    }
                }
                j6 = -9223372036854775807L;
                j2 = 0;
                long j192 = j6;
                n = zzbfVar.n(zzbeVar2, zzbdVar2, zzbdVar2.c, C.TIME_UNSET, j192);
                zzbdVar2 = zzbdVar2;
                if (n != null) {
                }
            } else {
                j2 = 0;
                j3 = j18;
                j4 = j3;
                j5 = -9223372036854775807L;
            }
            zzbfVar.o(obj2, zzbdVar2);
            zzbdVar2.f.a(i7).getClass();
            zzbdVar2.f.a(i7).getClass();
            return y(zzbfVar, obj2, Math.max(j2, j3), j5, j4, zzxoVar.d);
        }
        int i12 = zzxoVar.e;
        if (i12 != -1) {
            zzbdVar2.f.getClass();
            if (i12 == -1) {
                zzbdVar2.f.a(-1);
                a = zzbdVar2.f.a(i4);
                i = 0;
                while (true) {
                    iArr = a.d;
                    if (i >= iArr.length || (i2 = iArr[i]) == 0 || i2 == 1) {
                        break;
                    }
                    i++;
                }
                zzbdVar2.c(i4);
                if (i == zzbdVar2.f.a(i4).a) {
                    return x(zzbfVar, obj2, i4, i, j13, zzxoVar.d);
                }
                zzbfVar.o(obj2, zzbdVar2);
                zzbdVar2.f.a(i4).getClass();
                zzbdVar2.f.a(i4).getClass();
                return y(zzbfVar, obj2, 0L, C.TIME_UNSET, j13, zzxoVar.d);
            }
        }
        i4 = i12;
        a = zzbdVar2.f.a(i4);
        i = 0;
        while (true) {
            iArr = a.d;
            if (i >= iArr.length) {
                break;
            }
            break;
            i++;
        }
        zzbdVar2.c(i4);
        if (i == zzbdVar2.f.a(i4).a) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r13.f.getClass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kxo x(zzbf zzbfVar, Object obj, int i, int i2, long j, long j2) {
        int i3;
        zzxo zzxoVar = new zzxo(obj, i, i2, j2, -1);
        zzbd zzbdVar = (zzbd) this.h;
        long b = zzbfVar.o(obj, zzbdVar).b(i, i2);
        zza a = zzbdVar.f.a(i);
        int i4 = 0;
        while (true) {
            int[] iArr = a.d;
            if (i4 >= iArr.length || (i3 = iArr[i4]) == 0 || i3 == 1) {
                break;
            }
            i4++;
        }
        zzbdVar.c(i);
        long j3 = 0;
        if (b != C.TIME_UNSET && b <= 0) {
            j3 = Math.max(0L, (-1) + b);
        }
        return new kxo(zzxoVar, j3, C.TIME_UNSET, j, b, false, false, false);
    }

    public kxo y(zzbf zzbfVar, Object obj, long j, long j2, long j3, long j4) {
        zzbfVar.o(obj, (zzbd) this.h);
        zzxo zzxoVar = new zzxo(obj, j4, -1);
        boolean z = !zzxoVar.b();
        boolean z2 = z(zzbfVar, zzxoVar);
        boolean A = A(zzbfVar, zzxoVar, z);
        long B = B(zzbfVar, zzxoVar);
        return new kxo(zzxoVar, (B == C.TIME_UNSET || j < B) ? j : Math.max(0L, (-1) + B), j2, j3, B, z, z2, A);
    }

    public boolean z(zzbf zzbfVar, zzxo zzxoVar) {
        if (!zzxoVar.b() && zzxoVar.e == -1) {
            Object obj = zzxoVar.a;
            int i = zzbfVar.o(obj, (zzbd) this.h).c;
            if (zzbfVar.b(i, (zzbe) this.i, 0L).l == zzbfVar.e(obj)) {
                return true;
            }
        }
        return false;
    }

    public d7c(cn4 cn4Var, zqi zqiVar, kt4 kt4Var) {
        this.j = cn4Var;
        this.k = zqiVar;
        this.l = kt4Var;
        this.h = new iij();
        this.i = new kij();
        this.g = new ArrayList();
    }
}
