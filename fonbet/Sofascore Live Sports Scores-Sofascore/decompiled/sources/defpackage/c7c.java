package defpackage;

import android.os.Handler;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c7c {
    public final hij a = new hij();
    public final jij b = new jij();
    public final bn4 c;
    public final Handler d;
    public long e;
    public int f;
    public boolean g;
    public x6c h;
    public x6c i;
    public x6c j;
    public int k;
    public Object l;
    public long m;

    public c7c(bn4 bn4Var, Handler handler) {
        this.c = bn4Var;
        this.d = handler;
    }

    public static rcc l(lij lijVar, Object obj, long j, long j2, jij jijVar, hij hijVar) {
        lijVar.g(obj, hijVar);
        lijVar.n(hijVar.c, jijVar);
        int b = lijVar.b(obj);
        while (hijVar.d == 0) {
            jg jgVar = hijVar.g;
            if (jgVar.a <= 0 || !hijVar.g(jgVar.d) || hijVar.c(0L) != -1) {
                break;
            }
            int i = b + 1;
            if (b >= jijVar.n) {
                break;
            }
            lijVar.f(i, hijVar, true);
            obj = hijVar.b;
            obj.getClass();
            b = i;
        }
        lijVar.g(obj, hijVar);
        int c = hijVar.c(j);
        return c == -1 ? new rcc(obj, j2, hijVar.b(j)) : new rcc(obj, c, hijVar.f(c), j2, -1);
    }

    public final x6c a() {
        x6c x6cVar = this.h;
        if (x6cVar == null) {
            return null;
        }
        if (x6cVar == this.i) {
            this.i = x6cVar.l;
        }
        x6cVar.f();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            x6c x6cVar2 = this.h;
            this.l = x6cVar2.b;
            this.m = x6cVar2.f.a.d;
        }
        this.h = this.h.l;
        j();
        return this.h;
    }

    public final void b() {
        if (this.k == 0) {
            return;
        }
        x6c x6cVar = this.h;
        qx9.u(x6cVar);
        this.l = x6cVar.b;
        this.m = x6cVar.f.a.d;
        while (x6cVar != null) {
            x6cVar.f();
            x6cVar = x6cVar.l;
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        j();
    }

    public final a7c c(lij lijVar, x6c x6cVar, long j) {
        lij lijVar2;
        long j2;
        boolean z;
        lij lijVar3;
        jij jijVar;
        Object obj;
        long j3;
        hij hijVar;
        long j4;
        long j5;
        long j6;
        long j7;
        a7c a7cVar = x6cVar.f;
        long j8 = x6cVar.o;
        long j9 = a7cVar.e;
        long j10 = a7cVar.c;
        long j11 = (j8 + j9) - j;
        boolean z2 = a7cVar.g;
        rcc rccVar = a7cVar.a;
        Object obj2 = rccVar.a;
        jij jijVar2 = this.b;
        boolean z3 = false;
        hij hijVar2 = this.a;
        if (!z2) {
            int i = rccVar.e;
            lijVar.g(obj2, hijVar2);
            if (!rccVar.a()) {
                int f = hijVar2.f(i);
                if (hijVar2.g(i) && hijVar2.e(i, f) == 3) {
                    z3 = true;
                }
                if (f != hijVar2.g.a(i).b && !z3) {
                    return e(lijVar, rccVar.a, rccVar.e, f, a7cVar.e, rccVar.d);
                }
                lijVar.g(obj2, hijVar2);
                long d = hijVar2.d(i);
                return f(lijVar, rccVar.a, d == Long.MIN_VALUE ? hijVar2.d : hijVar2.g.a(i).g + d, a7cVar.e, rccVar.d);
            }
            int i2 = rccVar.b;
            int i3 = hijVar2.g.a(i2).b;
            if (i3 == -1) {
                return null;
            }
            int a = hijVar2.g.a(i2).a(rccVar.c);
            if (a < i3) {
                return e(lijVar, rccVar.a, i2, a, a7cVar.c, rccVar.d);
            }
            if (j10 == C.TIME_UNSET) {
                lijVar2 = lijVar;
                Pair j12 = lijVar2.j(jijVar2, hijVar2, hijVar2.c, C.TIME_UNSET, Math.max(0L, j11));
                hijVar2 = hijVar2;
                if (j12 == null) {
                    return null;
                }
                j2 = ((Long) j12.second).longValue();
            } else {
                lijVar2 = lijVar;
                j2 = j10;
            }
            int i4 = rccVar.b;
            lijVar2.g(obj2, hijVar2);
            long d2 = hijVar2.d(i4);
            return f(lijVar2, rccVar.a, Math.max(d2 == Long.MIN_VALUE ? hijVar2.d : hijVar2.g.a(i4).g + d2, j2), a7cVar.c, rccVar.d);
        }
        long j13 = 0;
        int d3 = lijVar.d(lijVar.b(obj2), hijVar2, jijVar2, this.f, this.g);
        if (d3 == -1) {
            return null;
        }
        int i5 = lijVar.f(d3, hijVar2, true).c;
        Object obj3 = hijVar2.b;
        obj3.getClass();
        long j14 = rccVar.d;
        if (lijVar.m(i5, jijVar2, 0L).m == d3) {
            z = true;
            Pair j15 = lijVar.j(jijVar2, hijVar2, i5, C.TIME_UNSET, Math.max(0L, j11));
            if (j15 == null) {
                return null;
            }
            Object obj4 = j15.first;
            long longValue = ((Long) j15.second).longValue();
            x6c x6cVar2 = x6cVar.l;
            if (x6cVar2 == null || !x6cVar2.b.equals(obj4)) {
                j7 = this.e;
                this.e = 1 + j7;
            } else {
                j7 = x6cVar2.f.a.d;
            }
            lijVar3 = lijVar;
            jijVar = jijVar2;
            obj = obj4;
            j13 = -9223372036854775807L;
            long j16 = j7;
            hijVar = hijVar2;
            j4 = longValue;
            j3 = j16;
        } else {
            z = true;
            lijVar3 = lijVar;
            jijVar = jijVar2;
            obj = obj3;
            j3 = j14;
            hijVar = hijVar2;
            j4 = 0;
        }
        rcc l = l(lijVar3, obj, j4, j3, jijVar, hijVar);
        long j17 = j4;
        hij hijVar3 = hijVar;
        if (j13 != C.TIME_UNSET && j10 != C.TIME_UNSET) {
            if (lijVar3.g(obj2, hijVar3).g.a > 0 && hijVar3.g(hijVar3.g.d)) {
                z3 = z;
            }
            if (l.a() && z3) {
                j5 = j17;
                j6 = j10;
            } else if (z3) {
                j6 = j13;
                j5 = j10;
            }
            return d(lijVar3, l, j6, j5);
        }
        j5 = j17;
        j6 = j13;
        return d(lijVar3, l, j6, j5);
    }

    public final a7c d(lij lijVar, rcc rccVar, long j, long j2) {
        lijVar.g(rccVar.a, this.a);
        boolean a = rccVar.a();
        Object obj = rccVar.a;
        return a ? e(lijVar, obj, rccVar.b, rccVar.c, j, rccVar.d) : f(lijVar, obj, j2, j, rccVar.d);
    }

    public final a7c e(lij lijVar, Object obj, int i, int i2, long j, long j2) {
        rcc rccVar = new rcc(obj, i, i2, j2, -1);
        hij hijVar = this.a;
        long a = lijVar.g(obj, hijVar).a(i, i2);
        long j3 = i2 == hijVar.f(i) ? hijVar.g.b : 0L;
        boolean g = hijVar.g(i);
        if (a != C.TIME_UNSET && j3 >= a) {
            j3 = Math.max(0L, a - 1);
        }
        return new a7c(rccVar, j3, j, C.TIME_UNSET, a, g, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a7c f(lij lijVar, Object obj, long j, long j2, long j3) {
        boolean z;
        boolean z2;
        long j4;
        long j5;
        long j6;
        long j7;
        hij hijVar = this.a;
        lijVar.g(obj, hijVar);
        int b = hijVar.b(j);
        int i = 1;
        if (b == -1) {
            jg jgVar = hijVar.g;
            if (jgVar.a > 0 && hijVar.g(jgVar.d)) {
                z2 = true;
            }
            z2 = false;
        } else {
            if (hijVar.g(b) && hijVar.d(b) == hijVar.d) {
                gg a = hijVar.g.a(b);
                int i2 = a.b;
                if (i2 != -1) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        int i4 = a.e[i3];
                        if (i4 != 0 && i4 != 1) {
                        }
                    }
                    z = false;
                    if (!z) {
                        z2 = true;
                        b = -1;
                    }
                }
                z = true;
                if (!z) {
                }
            }
            z2 = false;
        }
        rcc rccVar = new rcc(obj, j3, b);
        boolean z3 = !rccVar.a() && b == -1;
        boolean i5 = i(lijVar, rccVar);
        boolean h = h(lijVar, rccVar, z3);
        boolean z4 = b != -1 && hijVar.g(b);
        if (b != -1) {
            j5 = hijVar.d(b);
        } else {
            if (!z2) {
                j4 = -9223372036854775807L;
                j6 = (j4 != C.TIME_UNSET || j4 == Long.MIN_VALUE) ? hijVar.d : j4;
                if (j6 != C.TIME_UNSET || j < j6) {
                    j7 = j;
                } else {
                    if (!h && z2) {
                        i = 0;
                    }
                    j7 = Math.max(0L, j6 - i);
                }
                return new a7c(rccVar, j7, j2, j4, j6, z4, z3, i5, h);
            }
            j5 = hijVar.d;
        }
        j4 = j5;
        if (j4 != C.TIME_UNSET) {
        }
        if (j6 != C.TIME_UNSET) {
        }
        j7 = j;
        return new a7c(rccVar, j7, j2, j4, j6, z4, z3, i5, h);
    }

    public final a7c g(lij lijVar, a7c a7cVar) {
        rcc rccVar = a7cVar.a;
        int i = rccVar.e;
        boolean z = false;
        boolean z2 = !rccVar.a() && i == -1;
        int i2 = rccVar.b;
        boolean i3 = i(lijVar, rccVar);
        boolean h = h(lijVar, rccVar, z2);
        Object obj = rccVar.a;
        hij hijVar = this.a;
        lijVar.g(obj, hijVar);
        long d = (rccVar.a() || i == -1) ? -9223372036854775807L : hijVar.d(i);
        long a = rccVar.a() ? hijVar.a(i2, rccVar.c) : (d == C.TIME_UNSET || d == Long.MIN_VALUE) ? hijVar.d : d;
        if (rccVar.a()) {
            z = hijVar.g(i2);
        } else if (i != -1 && hijVar.g(i)) {
            z = true;
        }
        return new a7c(rccVar, a7cVar.b, a7cVar.c, d, a, z, z2, i3, h);
    }

    public final boolean h(lij lijVar, rcc rccVar, boolean z) {
        int b = lijVar.b(rccVar.a);
        hij hijVar = this.a;
        int i = lijVar.f(b, hijVar, false).c;
        jij jijVar = this.b;
        return !lijVar.m(i, jijVar, 0L).g && lijVar.d(b, hijVar, jijVar, this.f, this.g) == -1 && z;
    }

    public final boolean i(lij lijVar, rcc rccVar) {
        boolean z = !rccVar.a() && rccVar.e == -1;
        Object obj = rccVar.a;
        if (z) {
            if (lijVar.m(lijVar.g(obj, this.a).c, this.b, 0L).n == lijVar.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        zu9 s = hv9.s();
        for (x6c x6cVar = this.h; x6cVar != null; x6cVar = x6cVar.l) {
            s.c(x6cVar.f.a);
        }
        x6c x6cVar2 = this.i;
        this.d.post(new p3(27, this, s, x6cVar2 == null ? null : x6cVar2.f.a));
    }

    public final boolean k(x6c x6cVar) {
        boolean z = false;
        qx9.t(x6cVar != null);
        if (x6cVar.equals(this.j)) {
            return false;
        }
        this.j = x6cVar;
        while (true) {
            x6cVar = x6cVar.l;
            if (x6cVar == null) {
                break;
            }
            if (x6cVar == this.i) {
                this.i = this.h;
                z = true;
            }
            x6cVar.f();
            this.k--;
        }
        x6c x6cVar2 = this.j;
        if (x6cVar2.l != null) {
            x6cVar2.b();
            x6cVar2.l = null;
            x6cVar2.c();
        }
        j();
        return z;
    }

    public final rcc m(lij lijVar, Object obj, long j) {
        long j2;
        int b;
        hij hijVar = this.a;
        int i = lijVar.g(obj, hijVar).c;
        Object obj2 = this.l;
        if (obj2 == null || (b = lijVar.b(obj2)) == -1 || lijVar.f(b, hijVar, false).c != i) {
            x6c x6cVar = this.h;
            while (true) {
                if (x6cVar == null) {
                    x6c x6cVar2 = this.h;
                    while (true) {
                        if (x6cVar2 != null) {
                            int b2 = lijVar.b(x6cVar2.b);
                            if (b2 != -1 && lijVar.f(b2, hijVar, false).c == i) {
                                j2 = x6cVar2.f.a.d;
                                break;
                            }
                            x6cVar2 = x6cVar2.l;
                        } else {
                            j2 = this.e;
                            this.e = 1 + j2;
                            if (this.h == null) {
                                this.l = obj;
                                this.m = j2;
                            }
                        }
                    }
                } else {
                    if (x6cVar.b.equals(obj)) {
                        j2 = x6cVar.f.a.d;
                        break;
                    }
                    x6cVar = x6cVar.l;
                }
            }
        } else {
            j2 = this.m;
        }
        lijVar.g(obj, hijVar);
        int i2 = hijVar.c;
        jij jijVar = this.b;
        lijVar.n(i2, jijVar);
        Object obj3 = obj;
        boolean z = false;
        for (int b3 = lijVar.b(obj); b3 >= jijVar.m; b3--) {
            lijVar.f(b3, hijVar, true);
            boolean z2 = hijVar.g.a > 0;
            z |= z2;
            if (hijVar.c(hijVar.d) != -1) {
                obj3 = hijVar.b;
                obj3.getClass();
            }
            if (z && (!z2 || hijVar.d != 0)) {
                break;
            }
        }
        return l(lijVar, obj3, j, j2, jijVar, hijVar);
    }

    public final boolean n(lij lijVar) {
        lij lijVar2;
        x6c x6cVar;
        x6c x6cVar2 = this.h;
        if (x6cVar2 == null) {
            return true;
        }
        int b = lijVar.b(x6cVar2.b);
        while (true) {
            lijVar2 = lijVar;
            b = lijVar2.d(b, this.a, this.b, this.f, this.g);
            while (true) {
                x6cVar = x6cVar2.l;
                if (x6cVar == null || x6cVar2.f.g) {
                    break;
                }
                x6cVar2 = x6cVar;
            }
            if (b == -1 || x6cVar == null || lijVar2.b(x6cVar.b) != b) {
                break;
            }
            x6cVar2 = x6cVar;
            lijVar = lijVar2;
        }
        boolean k = k(x6cVar2);
        x6cVar2.f = g(lijVar2, x6cVar2.f);
        return !k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:
    
        r14 = k(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(lij lijVar, long j, long j2) {
        boolean k;
        a7c a7cVar;
        x6c x6cVar = this.h;
        x6c x6cVar2 = null;
        while (true) {
            if (x6cVar == null) {
                break;
            }
            a7c a7cVar2 = x6cVar.f;
            if (x6cVar2 == null) {
                a7cVar = g(lijVar, a7cVar2);
            } else {
                a7c c = c(lijVar, x6cVar2, j);
                if (c == null) {
                    k = k(x6cVar2);
                    break;
                }
                if (a7cVar2.b != c.b || !a7cVar2.a.equals(c.a)) {
                    break;
                }
                a7cVar = c;
            }
            long j3 = a7cVar.e;
            x6cVar.f = a7cVar.a(a7cVar2.c);
            long j4 = a7cVar2.e;
            if (j4 == C.TIME_UNSET || j4 == j3) {
                x6cVar2 = x6cVar;
                x6cVar = x6cVar.l;
            } else {
                x6cVar.h();
                boolean z = x6cVar == this.i && !x6cVar.f.f && (j2 == Long.MIN_VALUE || j2 >= ((j3 > C.TIME_UNSET ? 1 : (j3 == C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : x6cVar.o + j3));
                if (k(x6cVar) || z) {
                    return false;
                }
            }
        }
        return !k;
    }
}
