package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.i;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import xsna.et10;
import xsna.ewo0;
import xsna.ft10;
import xsna.fxc0;
import xsna.otu;
import xsna.rfw;
import xsna.u5;
import xsna.zw1;

/* compiled from: MediaPeriodQueue.java */
/* loaded from: classes12.dex */
public final class g {
    public final zw1 c;
    public final otu d;
    public final u5 e;
    public long f;
    public int g;
    public boolean h;
    public ExoPlayer.c i;

    @Nullable
    public et10 j;

    @Nullable
    public et10 k;

    @Nullable
    public et10 l;

    @Nullable
    public et10 m;

    @Nullable
    public et10 n;
    public int o;

    @Nullable
    public Object p;
    public long q;
    public final ewo0.b a = new ewo0.b();
    public final ewo0.c b = new ewo0.c();
    public ArrayList r = new ArrayList();

    public g(zw1 zw1Var, otu otuVar, u5 u5Var, ExoPlayer.c cVar) {
        this.c = zw1Var;
        this.d = otuVar;
        this.e = u5Var;
        this.i = cVar;
    }

    public static i.b p(ewo0 ewo0Var, Object obj, long j, long j2, ewo0.c cVar, ewo0.b bVar) {
        ewo0Var.g(obj, bVar);
        ewo0Var.n(bVar.c, cVar);
        ewo0Var.b(obj);
        int i = bVar.g.a;
        if (i != 0) {
            if (i == 1) {
                bVar.f(0);
            }
            bVar.g.getClass();
            bVar.g(0);
        }
        ewo0Var.g(obj, bVar);
        int c = bVar.c(j);
        return c == -1 ? new i.b(obj, j2, bVar.b(j)) : new i.b(obj, c, bVar.e(c), j2, -1);
    }

    @Nullable
    public final et10 a() {
        et10 et10Var = this.j;
        if (et10Var == null) {
            return null;
        }
        if (et10Var == this.k) {
            this.k = et10Var.m;
        }
        if (et10Var == this.l) {
            this.l = et10Var.m;
        }
        et10Var.i();
        int i = this.o - 1;
        this.o = i;
        if (i == 0) {
            this.m = null;
            et10 et10Var2 = this.j;
            this.p = et10Var2.b;
            this.q = et10Var2.g.a.d;
        }
        this.j = this.j.m;
        l();
        return this.j;
    }

    public final void b() {
        if (this.o == 0) {
            return;
        }
        et10 et10Var = this.j;
        et10Var.getClass();
        this.p = et10Var.b;
        this.q = et10Var.g.a.d;
        while (et10Var != null) {
            et10Var.i();
            et10Var = et10Var.m;
        }
        this.j = null;
        this.m = null;
        this.k = null;
        this.l = null;
        this.o = 0;
        l();
    }

    @Nullable
    public final ft10 c(ewo0 ewo0Var, et10 et10Var, long j) {
        long j2;
        ewo0.b bVar;
        ewo0 ewo0Var2;
        Object obj;
        long j3;
        long j4;
        long j5;
        long r;
        ft10 ft10Var = et10Var.g;
        long j6 = (et10Var.p + ft10Var.e) - j;
        if (!ft10Var.h) {
            i.b bVar2 = ft10Var.a;
            Object obj2 = bVar2.a;
            int i = bVar2.e;
            ewo0.b bVar3 = this.a;
            ewo0Var.g(obj2, bVar3);
            boolean z = ft10Var.g;
            if (!bVar2.b()) {
                if (i != -1) {
                    bVar3.f(i);
                }
                int e = bVar3.e(i);
                bVar3.g(i);
                if (e != bVar3.g.a(i).a) {
                    return e(ewo0Var, bVar2.a, bVar2.e, e, ft10Var.e, bVar2.d, z);
                }
                ewo0Var.g(obj2, bVar3);
                bVar3.d(i);
                bVar3.g.a(i).getClass();
                return f(ewo0Var, bVar2.a, 0L, ft10Var.e, bVar2.d, false);
            }
            int i2 = bVar2.b;
            int i3 = bVar3.g.a(i2).a;
            if (i3 == -1) {
                return null;
            }
            int a = bVar3.g.a(i2).a(bVar2.c);
            if (a < i3) {
                return e(ewo0Var, bVar2.a, i2, a, ft10Var.c, bVar2.d, z);
            }
            long j7 = ft10Var.c;
            if (j7 == C.TIME_UNSET) {
                int i4 = bVar3.c;
                long max = Math.max(0L, j6);
                j2 = 0;
                Pair<Object, Long> j8 = ewo0Var.j(this.b, bVar3, i4, C.TIME_UNSET, max);
                bVar = bVar3;
                ewo0Var2 = ewo0Var;
                if (j8 == null) {
                    return null;
                }
                j7 = ((Long) j8.second).longValue();
            } else {
                j2 = 0;
                bVar = bVar3;
                ewo0Var2 = ewo0Var;
            }
            int i5 = bVar2.b;
            ewo0Var2.g(obj2, bVar);
            bVar.d(i5);
            bVar.g.a(i5).getClass();
            return f(ewo0Var, bVar2.a, Math.max(j2, j7), ft10Var.c, bVar2.d, z);
        }
        ft10 ft10Var2 = et10Var.g;
        i.b bVar4 = ft10Var2.a;
        long j9 = ft10Var2.c;
        int d = ewo0Var.d(ewo0Var.b(bVar4.a), this.a, this.b, this.g, this.h);
        if (d != -1) {
            ewo0.b bVar5 = this.a;
            int i6 = ewo0Var.f(d, bVar5, true).c;
            Object obj3 = bVar5.b;
            obj3.getClass();
            long j10 = bVar4.d;
            if (ewo0Var.m(i6, this.b, 0L).n == d) {
                Pair<Object, Long> j11 = ewo0Var.j(this.b, this.a, i6, C.TIME_UNSET, Math.max(0L, j6));
                if (j11 != null) {
                    Object obj4 = j11.first;
                    long longValue = ((Long) j11.second).longValue();
                    et10 et10Var2 = et10Var.m;
                    if (et10Var2 == null || !et10Var2.b.equals(obj4)) {
                        r = r(obj4);
                        if (r == -1) {
                            r = this.f;
                            this.f = 1 + r;
                        }
                    } else {
                        r = et10Var2.g.a.d;
                    }
                    obj = obj4;
                    j3 = longValue;
                    j5 = r;
                    j4 = -9223372036854775807L;
                }
            } else {
                obj = obj3;
                j3 = 0;
                j4 = 0;
                j5 = j10;
            }
            i.b p = p(ewo0Var, obj, j3, j5, this.b, this.a);
            if (j4 != C.TIME_UNSET && j9 != C.TIME_UNSET) {
                int i7 = ewo0Var.g(bVar4.a, bVar5).g.a;
                bVar5.g.getClass();
                if (i7 > 0) {
                    bVar5.g(0);
                }
            }
            return d(ewo0Var, p, j4, j3);
        }
        return null;
    }

    public final ft10 d(ewo0 ewo0Var, i.b bVar, long j, long j2) {
        ewo0Var.g(bVar.a, this.a);
        return bVar.b() ? e(ewo0Var, bVar.a, bVar.b, bVar.c, j, bVar.d, false) : f(ewo0Var, bVar.a, j2, j, bVar.d, false);
    }

    public final ft10 e(ewo0 ewo0Var, Object obj, int i, int i2, long j, long j2, boolean z) {
        i.b bVar = new i.b(obj, i, i2, j2, -1);
        ewo0.b bVar2 = this.a;
        long a = ewo0Var.g(obj, bVar2).a(i, i2);
        if (i2 == bVar2.e(i)) {
            bVar2.g.getClass();
        }
        bVar2.g(i);
        long j3 = 0;
        if (a != C.TIME_UNSET && 0 >= a) {
            j3 = Math.max(0L, a - 1);
        }
        return new ft10(bVar, j3, j, C.TIME_UNSET, a, z, false, false, false, false);
    }

    public final ft10 f(ewo0 ewo0Var, Object obj, long j, long j2, long j3, boolean z) {
        long j4;
        ewo0.b bVar = this.a;
        ewo0Var.g(obj, bVar);
        int b = bVar.b(j);
        boolean z2 = false;
        if (b != -1) {
            bVar.g(b);
        } else if (bVar.g.a > 0) {
            bVar.g(0);
        }
        i.b bVar2 = new i.b(obj, j3, b);
        if (!bVar2.b() && b == -1) {
            z2 = true;
        }
        boolean j5 = j(ewo0Var, bVar2);
        boolean i = i(ewo0Var, bVar2, z2);
        if (b != -1) {
            bVar.g(b);
        }
        if (b != -1) {
            bVar.f(b);
        }
        if (b != -1) {
            bVar.d(b);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        long j6 = (j4 == C.TIME_UNSET || j4 == Long.MIN_VALUE) ? bVar.d : j4;
        return new ft10(bVar2, (j6 == C.TIME_UNSET || j < j6) ? j : Math.max(0L, j6 - 1), j2, j4, j6, z, false, z2, j5, i);
    }

    @Nullable
    public final et10 g() {
        return this.l;
    }

    public final ft10 h(ewo0 ewo0Var, ft10 ft10Var) {
        long j;
        i.b bVar = ft10Var.a;
        boolean b = bVar.b();
        int i = bVar.e;
        boolean z = !b && i == -1;
        int i2 = bVar.b;
        boolean j2 = j(ewo0Var, bVar);
        boolean i3 = i(ewo0Var, bVar, z);
        Object obj = bVar.a;
        ewo0.b bVar2 = this.a;
        ewo0Var.g(obj, bVar2);
        if (bVar.b() || i == -1) {
            j = -9223372036854775807L;
        } else {
            bVar2.d(i);
            j = 0;
        }
        long a = bVar.b() ? bVar2.a(i2, bVar.c) : (j == C.TIME_UNSET || j == Long.MIN_VALUE) ? bVar2.d : j;
        if (bVar.b()) {
            bVar2.g(i2);
        } else if (i != -1) {
            bVar2.g(i);
        }
        return new ft10(bVar, ft10Var.b, ft10Var.c, j, a, ft10Var.f, false, z, j2, i3);
    }

    public final boolean i(ewo0 ewo0Var, i.b bVar, boolean z) {
        int b = ewo0Var.b(bVar.a);
        if (!ewo0Var.m(ewo0Var.f(b, this.a, false).c, this.b, 0L).i) {
            if (ewo0Var.d(b, this.a, this.b, this.g, this.h) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(ewo0 ewo0Var, i.b bVar) {
        boolean z = !bVar.b() && bVar.e == -1;
        Object obj = bVar.a;
        if (z) {
            if (ewo0Var.m(ewo0Var.g(obj, this.a).c, this.b, 0L).o == ewo0Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        et10 et10Var = this.n;
        if (et10Var == null || et10Var.h()) {
            this.n = null;
            for (int i = 0; i < this.r.size(); i++) {
                et10 et10Var2 = (et10) this.r.get(i);
                if (!et10Var2.h()) {
                    this.n = et10Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        ImmutableList.b bVar = ImmutableList.c;
        ImmutableList.a aVar = new ImmutableList.a();
        for (et10 et10Var = this.j; et10Var != null; et10Var = et10Var.m) {
            aVar.c(et10Var.g.a);
        }
        et10 et10Var2 = this.k;
        this.d.post(new rfw(this, aVar, et10Var2 == null ? null : et10Var2.g.a, 1));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.media3.exoplayer.source.q, java.lang.Object] */
    public final void m(long j) {
        et10 et10Var = this.m;
        if (et10Var != null) {
            fxc0.z(et10Var.m == null);
            if (et10Var.e) {
                et10Var.a.reevaluateBuffer(j - et10Var.p);
            }
        }
    }

    public final void n(ArrayList arrayList) {
        for (int i = 0; i < this.r.size(); i++) {
            ((et10) this.r.get(i)).i();
        }
        this.r = arrayList;
        this.n = null;
        k();
    }

    public final int o(et10 et10Var) {
        et10Var.getClass();
        int i = 0;
        if (et10Var.equals(this.m)) {
            return 0;
        }
        this.m = et10Var;
        while (true) {
            et10Var = et10Var.m;
            if (et10Var == null) {
                break;
            }
            if (et10Var == this.k) {
                et10 et10Var2 = this.j;
                this.k = et10Var2;
                this.l = et10Var2;
                i = 3;
            }
            if (et10Var == this.l) {
                this.l = this.k;
                i |= 2;
            }
            et10Var.i();
            this.o--;
        }
        et10 et10Var3 = this.m;
        et10Var3.getClass();
        if (et10Var3.m != null) {
            et10Var3.b();
            et10Var3.m = null;
            et10Var3.c();
        }
        l();
        return i;
    }

    public final i.b q(ewo0 ewo0Var, Object obj, long j) {
        long r;
        int b;
        Object obj2 = obj;
        ewo0.b bVar = this.a;
        int i = ewo0Var.g(obj2, bVar).c;
        Object obj3 = this.p;
        if (obj3 == null || (b = ewo0Var.b(obj3)) == -1 || ewo0Var.f(b, bVar, false).c != i) {
            et10 et10Var = this.j;
            while (true) {
                if (et10Var == null) {
                    et10 et10Var2 = this.j;
                    while (true) {
                        if (et10Var2 != null) {
                            int b2 = ewo0Var.b(et10Var2.b);
                            if (b2 != -1 && ewo0Var.f(b2, bVar, false).c == i) {
                                r = et10Var2.g.a.d;
                                break;
                            }
                            et10Var2 = et10Var2.m;
                        } else {
                            r = r(obj2);
                            if (r == -1) {
                                r = this.f;
                                this.f = 1 + r;
                                if (this.j == null) {
                                    this.p = obj2;
                                    this.q = r;
                                }
                            }
                        }
                    }
                } else {
                    if (et10Var.b.equals(obj2)) {
                        r = et10Var.g.a.d;
                        break;
                    }
                    et10Var = et10Var.m;
                }
            }
        } else {
            r = this.q;
        }
        ewo0Var.g(obj2, bVar);
        int i2 = bVar.c;
        ewo0.c cVar = this.b;
        ewo0Var.n(i2, cVar);
        boolean z = false;
        for (int b3 = ewo0Var.b(obj); b3 >= cVar.n; b3--) {
            ewo0Var.f(b3, bVar, true);
            boolean z2 = bVar.g.a > 0;
            z |= z2;
            if (bVar.c(bVar.d) != -1) {
                obj2 = bVar.b;
                obj2.getClass();
            }
            if (z && (!z2 || bVar.d != 0)) {
                break;
            }
        }
        return p(ewo0Var, obj2, j, r, this.b, this.a);
    }

    public final long r(Object obj) {
        for (int i = 0; i < this.r.size(); i++) {
            et10 et10Var = (et10) this.r.get(i);
            if (et10Var.b.equals(obj)) {
                return et10Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int s(ewo0 ewo0Var) {
        ewo0 ewo0Var2;
        et10 et10Var;
        et10 et10Var2 = this.j;
        if (et10Var2 == null) {
            return 0;
        }
        int b = ewo0Var.b(et10Var2.b);
        while (true) {
            ewo0Var2 = ewo0Var;
            b = ewo0Var2.d(b, this.a, this.b, this.g, this.h);
            while (true) {
                et10Var2.getClass();
                et10Var = et10Var2.m;
                if (et10Var == null || et10Var2.g.h) {
                    break;
                }
                et10Var2 = et10Var;
            }
            if (b == -1 || et10Var == null || ewo0Var2.b(et10Var.b) != b) {
                break;
            }
            et10Var2 = et10Var;
            ewo0Var = ewo0Var2;
        }
        int o = o(et10Var2);
        et10Var2.g = h(ewo0Var2, et10Var2.g);
        return o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b4, code lost:
    
        return o(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t(ewo0 ewo0Var, long j, long j2, long j3) {
        ft10 ft10Var;
        boolean z;
        et10 et10Var = this.j;
        et10 et10Var2 = null;
        while (true) {
            int i = 0;
            if (et10Var == null) {
                return 0;
            }
            ft10 ft10Var2 = et10Var.g;
            if (et10Var2 == null) {
                ft10Var = h(ewo0Var, ft10Var2);
            } else {
                ft10 c = c(ewo0Var, et10Var2, j);
                if (c == null || ft10Var2.b != c.b || !ft10Var2.a.equals(c.a)) {
                    break;
                }
                ft10Var = c;
            }
            long j4 = ft10Var.e;
            long j5 = ft10Var2.c;
            long j6 = ft10Var2.e;
            et10Var.g = ft10Var.a(j5);
            if (j6 != j4) {
                et10Var.k();
                long j7 = j4 == C.TIME_UNSET ? Long.MAX_VALUE : j4 + et10Var.p;
                boolean z2 = et10Var == this.k && !et10Var.g.g && (j2 == Long.MIN_VALUE || j2 >= j7);
                boolean z3 = et10Var == this.l && (j3 == Long.MIN_VALUE || j3 >= j7);
                int o = o(et10Var);
                if (o != 0) {
                    return o;
                }
                if (j6 == C.TIME_UNSET && ft10Var2.d == Long.MIN_VALUE) {
                    long j8 = ft10Var.d;
                    if (j8 != C.TIME_UNSET && j8 != Long.MIN_VALUE) {
                        z = true;
                        if (z2 && (j6 != C.TIME_UNSET || z)) {
                            i = 1;
                        }
                        return !z3 ? i | 2 : i;
                    }
                }
                z = false;
                if (z2) {
                    i = 1;
                }
                if (!z3) {
                }
            } else {
                et10Var2 = et10Var;
                et10Var = et10Var.m;
            }
        }
    }
}
