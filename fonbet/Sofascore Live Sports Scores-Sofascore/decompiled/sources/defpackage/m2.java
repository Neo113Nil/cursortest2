package defpackage;

import android.view.KeyEvent;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class m2 extends bw4 implements pze, wia, p3h, jyj, ug3, tkd, a2a, xw8 {
    public static final rik L = new rik(15);
    public zw8 A;
    public xv4 B;
    public l6f C;
    public sf9 D;
    public final b0d E;
    public long F;
    public l6f G;
    public wzc H;
    public boolean I;
    public g9i J;
    public final rik K;
    public wzc q;
    public j1a r;
    public boolean s;
    public String t;
    public u5g u;
    public boolean v;
    public Function0 w;
    public final se8 x;
    public j1a y;
    public ooi z;

    public m2(wzc wzcVar, j1a j1aVar, boolean z, boolean z2, String str, u5g u5gVar, Function0 function0) {
        this.q = wzcVar;
        this.r = j1aVar;
        this.s = z;
        this.t = str;
        this.u = u5gVar;
        this.v = z2;
        this.w = function0;
        this.x = new se8(wzcVar, 0, new f2(1, this, m2.class, "onFocusChange", "onFocusChange(Z)V", 0, 0));
        int i = vjb.a;
        this.E = new b0d(6);
        this.F = 0L;
        wzc wzcVar2 = this.q;
        this.H = wzcVar2;
        this.I = wzcVar2 == null;
        this.K = L;
    }

    public void B(fze fzeVar, gze gzeVar, long j) {
        ooi o1;
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.F = (Float.floatToRawIntBits((int) (j2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L);
        v1();
        if (this.v) {
            if (this.A == null) {
                zw8 zw8Var = new zw8(this);
                k1(zw8Var);
                this.A = zw8Var;
            }
            if (gzeVar == gze.b) {
                int i = fzeVar.f;
                rq3 rq3Var = null;
                if (i == 4) {
                    xw3.L(Y0(), null, null, new l2(this, rq3Var, 0), 3);
                } else if (i == 5) {
                    xw3.L(Y0(), null, null, new l2(this, rq3Var, 1), 3);
                }
            }
        }
        if (this.z == null && (o1 = o1()) != null) {
            k1(o1);
            this.z = o1;
        }
        ooi ooiVar = this.z;
        if (ooiVar != null) {
            ooiVar.B(fzeVar, gzeVar, j);
        }
    }

    @Override // defpackage.p3h
    public final boolean U0() {
        return true;
    }

    @Override // defpackage.tkd
    public final void Z() {
        if (this.s) {
            z1a.R(this, new e2(this, 0));
        }
    }

    @Override // defpackage.wtc
    public final boolean Z0() {
        return false;
    }

    @Override // defpackage.wtc
    public final void c1() {
        Z();
        if (!this.I) {
            v1();
        }
        if (this.v) {
            k1(this.x);
        }
    }

    @Override // defpackage.wtc
    public final void d1() {
        p1();
        if (this.H == null) {
            this.q = null;
        }
        xv4 xv4Var = this.B;
        if (xv4Var != null) {
            l1(xv4Var);
        }
        this.B = null;
        zw8 zw8Var = this.A;
        if (zw8Var != null) {
            l1(zw8Var);
        }
        this.A = null;
    }

    @Override // defpackage.p3h
    public final void i(b4h b4hVar) {
        u5g u5gVar = this.u;
        if (u5gVar != null) {
            y3h.j(b4hVar, u5gVar.a);
        }
        String str = this.t;
        e2 e2Var = new e2(this, 1);
        KProperty[] kPropertyArr = y3h.a;
        b4hVar.a(k3h.b, new m9(str, e2Var));
        if (this.v) {
            this.x.i(b4hVar);
        } else {
            b4hVar.a(w3h.j, Unit.a);
        }
        n1(b4hVar);
    }

    @Override // defpackage.wia
    public final boolean n0(KeyEvent keyEvent) {
        return false;
    }

    public ooi o1() {
        return null;
    }

    public final void p1() {
        wzc wzcVar = this.q;
        b0d b0dVar = this.E;
        if (wzcVar != null) {
            l6f l6fVar = this.C;
            if (l6fVar != null) {
                wzcVar.c(new k6f(l6fVar));
            }
            l6f l6fVar2 = this.G;
            if (l6fVar2 != null) {
                wzcVar.c(new k6f(l6fVar2));
            }
            sf9 sf9Var = this.D;
            if (sf9Var != null) {
                wzcVar.c(new tf9(sf9Var));
            }
            Object[] objArr = b0dVar.c;
            long[] jArr = b0dVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                wzcVar.c(new k6f((l6f) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.C = null;
        this.G = null;
        this.D = null;
        b0dVar.a();
    }

    public final long q1(long j) {
        long R0 = c6o.c0(this).y.R0(((hsk) tgj.x(this, dh3.t)).e());
        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (R0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float max2 = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (R0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    public final void r1(boolean z) {
        wzc wzcVar = this.q;
        if (wzcVar != null) {
            g9i g9iVar = this.J;
            int i = 1;
            rq3 rq3Var = null;
            if (g9iVar == null || !g9iVar.isActive()) {
                l6f l6fVar = z ? this.G : this.C;
                if (l6fVar != null) {
                    k6f k6fVar = new k6f(l6fVar);
                    yda ydaVar = (yda) ((ad2) Y0()).b.get(uic.g);
                    xw3.L(Y0(), null, null, new g2(wzcVar, k6fVar, ydaVar != null ? ydaVar.n(new s1(i, wzcVar, k6fVar)) : null, rq3Var, 0), 3);
                }
            } else {
                g9i g9iVar2 = this.J;
                if (g9iVar2 != null) {
                    g9iVar2.e(null);
                }
            }
            if (z) {
                this.G = null;
            } else {
                this.C = null;
            }
        }
    }

    @Override // defpackage.jyj
    public final Object s() {
        return this.K;
    }

    public final void s1(long j, boolean z) {
        wzc wzcVar = this.q;
        if (wzcVar != null) {
            g9i g9iVar = this.J;
            if (g9iVar == null || !g9iVar.isActive()) {
                l6f l6fVar = z ? this.G : this.C;
                if (l6fVar != null) {
                    xw3.L(Y0(), null, null, new i2(l6fVar, wzcVar, null), 3);
                }
            } else {
                g9iVar.e(null);
                xw3.L(Y0(), null, null, new h2(g9iVar, j, wzcVar, (rq3) null, 0), 3);
            }
            if (z) {
                this.G = null;
            } else {
                this.C = null;
            }
        }
    }

    public final void t1(q1a q1aVar) {
        wzc wzcVar = this.q;
        if (wzcVar != null) {
            l6f l6fVar = new l6f(q1aVar.c);
            asf asfVar = new asf();
            jca.X(this, zw8.p, new uj8(3, new r82(2, q1aVar, asfVar)));
            rq3 rq3Var = null;
            if (asfVar.a || uw2.a(this)) {
                this.J = xw3.L(Y0(), null, null, new j2(wzcVar, l6fVar, this, rq3Var, 0), 3);
            } else {
                this.G = l6fVar;
                xw3.L(Y0(), null, null, new i2(wzcVar, l6fVar, rq3Var, 1), 3);
            }
        }
    }

    public final void u1(mze mzeVar) {
        boolean z;
        wzc wzcVar = this.q;
        if (wzcVar != null) {
            l6f l6fVar = new l6f(mzeVar.c);
            int i = 3;
            wib wibVar = zw8.p;
            if (mzeVar == null) {
                jyj C = jca.C(this, wibVar);
                zw8 zw8Var = C instanceof zw8 ? (zw8) C : null;
                z = (zw8Var != null ? zw8Var.o : null) != null;
            } else {
                asf asfVar = new asf();
                jca.X(this, wibVar, new uj8(i, new r82(i, mzeVar, asfVar)));
                z = asfVar.a;
            }
            rq3 rq3Var = null;
            if (z || uw2.a(this)) {
                this.J = xw3.L(Y0(), null, null, new j2(wzcVar, l6fVar, this, rq3Var, 1), 3);
            } else {
                this.C = l6fVar;
                xw3.L(Y0(), null, null, new i2(wzcVar, l6fVar, rq3Var, 2), 3);
            }
        }
    }

    public final void v1() {
        if (this.B != null) {
            return;
        }
        j1a j1aVar = this.s ? this.y : this.r;
        if (j1aVar != null) {
            wzc wzcVar = this.q;
            if (wzcVar == null) {
                wzcVar = new xzc();
                this.q = wzcVar;
            }
            this.x.o1(wzcVar);
            wzc wzcVar2 = this.q;
            wzcVar2.getClass();
            xv4 b = j1aVar.b(wzcVar2);
            k1(b);
            this.B = b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0077 A[RETURN] */
    @Override // defpackage.wia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w0(KeyEvent keyEvent) {
        boolean z;
        v1();
        long w = u0a.w(keyEvent);
        boolean z2 = this.v;
        int i = 3;
        rq3 rq3Var = null;
        b0d b0dVar = this.E;
        if (z2) {
            int i2 = 2;
            if (u0a.z(keyEvent) == 2 && oyn.K(keyEvent)) {
                if (b0dVar.b(w)) {
                    z = false;
                } else {
                    l6f l6fVar = new l6f(this.F);
                    b0dVar.g(l6fVar, w);
                    if (this.q != null) {
                        xw3.L(Y0(), null, null, new k2(this, l6fVar, rq3Var, i2), 3);
                    }
                    z = true;
                }
                return x1(keyEvent) || z;
            }
        }
        if (this.v && u0a.z(keyEvent) == 1 && oyn.K(keyEvent)) {
            l6f l6fVar2 = (l6f) b0dVar.f(w);
            if (l6fVar2 != null) {
                if (this.q != null) {
                    xw3.L(Y0(), null, null, new k2(this, l6fVar2, rq3Var, i), 3);
                }
                y1(keyEvent);
            }
            if (l6fVar2 != null) {
            }
        }
    }

    public abstract boolean x1(KeyEvent keyEvent);

    public void y0() {
        sf9 sf9Var;
        wzc wzcVar = this.q;
        if (wzcVar != null && (sf9Var = this.D) != null) {
            wzcVar.c(new tf9(sf9Var));
        }
        this.D = null;
        ooi ooiVar = this.z;
        if (ooiVar != null) {
            ooiVar.y0();
        }
    }

    public abstract void y1(KeyEvent keyEvent);

    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z1(wzc wzcVar, j1a j1aVar, boolean z, boolean z2, String str, u5g u5gVar, Function0 function0) {
        boolean z3;
        boolean z4;
        xv4 xv4Var;
        boolean z5 = true;
        if (Intrinsics.c(this.H, wzcVar)) {
            z3 = false;
        } else {
            p1();
            this.H = wzcVar;
            this.q = wzcVar;
            z3 = true;
        }
        if (!Intrinsics.c(this.r, j1aVar)) {
            this.r = j1aVar;
            z3 = true;
        }
        if (this.s != z) {
            this.s = z;
            if (z) {
                Z();
            }
            z3 = true;
        }
        boolean z6 = this.v;
        se8 se8Var = this.x;
        if (z6 != z2) {
            if (z2) {
                k1(se8Var);
            } else {
                l1(se8Var);
                p1();
            }
            sea.p(this);
            this.v = z2;
        }
        if (!Intrinsics.c(this.t, str)) {
            this.t = str;
            sea.p(this);
        }
        if (!Intrinsics.c(this.u, u5gVar)) {
            this.u = u5gVar;
            sea.p(this);
        }
        this.w = function0;
        boolean z7 = this.I;
        wzc wzcVar2 = this.H;
        if (z7 != (wzcVar2 == null)) {
            z4 = wzcVar2 == null;
            this.I = z4;
            if (z4 || this.B != null) {
                z7 = z4;
            }
            if (z5 && ((xv4Var = this.B) != null || !z4)) {
                if (xv4Var != null) {
                    l1(xv4Var);
                }
                this.B = null;
                v1();
            }
            se8Var.o1(this.q);
        }
        z5 = z3;
        z4 = z7;
        if (z5) {
            if (xv4Var != null) {
            }
            this.B = null;
            v1();
        }
        se8Var.o1(this.q);
    }

    public void w1() {
    }

    public void n1(b4h b4hVar) {
    }
}
