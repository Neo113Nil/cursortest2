package defpackage;

import android.os.Build;
import android.view.ViewParent;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class wdd extends tkb implements g1c, dma, syd {
    public static final f4g N = new f4g();
    public static final ola O = new ola();
    public static final float[] P = xzb.a();
    public static final rdd Q = new rdd();
    public static final k03 R = new k03();
    public float A;
    public w0d B;
    public ola C;
    public boolean E;
    public boolean F;
    public n29 G;
    public uj2 H;
    public sz I;
    public boolean K;
    public qyd L;
    public n29 M;
    public final wma o;
    public wdd p;
    public wdd q;
    public boolean r;
    public boolean s;
    public Function1 t;
    public kx4 u;
    public ema v;
    public l1c x;
    public h0d y;
    public float w = 0.8f;
    public long z = 0;
    public uah D = oyn.e;
    public final tdd J = new tdd(this, 1);

    public wdd(wma wmaVar) {
        this.o = wmaVar;
        this.u = wmaVar.y;
        this.v = wmaVar.z;
    }

    public static wdd z1(dma dmaVar) {
        wdd wddVar;
        wkb wkbVar = dmaVar instanceof wkb ? (wkb) dmaVar : null;
        if (wkbVar != null && (wddVar = wkbVar.a.o) != null) {
            return wddVar;
        }
        dmaVar.getClass();
        return (wdd) dmaVar;
    }

    public final oqf A1() {
        if (e1().n) {
            dma y = o6a.y(this);
            w0d w0dVar = this.B;
            if (w0dVar == null) {
                w0dVar = new w0d();
                this.B = w0dVar;
            }
            long T0 = T0(d1());
            int i = (int) (T0 >> 32);
            w0dVar.b = -Float.intBitsToFloat(i);
            int i2 = (int) (T0 & 4294967295L);
            w0dVar.c = -Float.intBitsToFloat(i2);
            w0dVar.d = Float.intBitsToFloat(i) + V();
            w0dVar.e = Float.intBitsToFloat(i2) + S();
            while (this != y) {
                this.v1(w0dVar, false, true);
                if (!w0dVar.b()) {
                    this = this.q;
                    this.getClass();
                }
            }
            return new oqf(w0dVar.b, w0dVar.c, w0dVar.d, w0dVar.e);
        }
        return oqf.e;
    }

    @Override // defpackage.tkb
    public final tkb B0() {
        return this.q;
    }

    public final void B1(wdd wddVar, float[] fArr) {
        float[] a;
        if (Intrinsics.c(wddVar, this)) {
            return;
        }
        wdd wddVar2 = this.q;
        wddVar2.getClass();
        wddVar2.B1(wddVar, fArr);
        if (!r6a.b(this.z, 0L)) {
            float[] fArr2 = P;
            xzb.d(fArr2);
            long j = this.z;
            xzb.g(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            xzb.f(fArr, fArr2);
        }
        qyd qydVar = this.L;
        if (qydVar == null || (a = ((q29) qydVar).a()) == null) {
            return;
        }
        xzb.f(fArr, a);
    }

    public final void C1(wdd wddVar, float[] fArr) {
        while (!this.equals(wddVar)) {
            qyd qydVar = this.L;
            if (qydVar != null) {
                xzb.f(fArr, ((q29) qydVar).b());
            }
            if (!r6a.b(this.z, 0L)) {
                float[] fArr2 = P;
                xzb.d(fArr2);
                xzb.g(fArr2, (int) (r0 >> 32), (int) (r0 & 4294967295L));
                xzb.f(fArr, fArr2);
            }
            this = this.q;
            this.getClass();
        }
    }

    public final void D1(Function1 function1, boolean z) {
        ryd rydVar;
        i1d i1dVar;
        Reference poll;
        if (function1 != null && this.M != null) {
            r3a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        int i = 0;
        wma wmaVar = this.o;
        boolean z2 = (!z && this.t == function1 && Intrinsics.c(this.u, wmaVar.y) && this.v == wmaVar.z) ? false : true;
        this.u = wmaVar.y;
        this.v = wmaVar.z;
        boolean H = wmaVar.H();
        tdd tddVar = this.J;
        if (H && function1 != null) {
            this.t = function1;
            if (this.L != null) {
                if (z2) {
                    E1(true);
                    return;
                }
                return;
            }
            ryd a = zma.a(wmaVar);
            sz szVar = this.I;
            if (szVar == null) {
                sz szVar2 = new sz(6, this, new tdd(this, i));
                this.I = szVar2;
                szVar = szVar2;
            }
            qyd n = ((xy) a).n(szVar, tddVar, null);
            q29 q29Var = (q29) n;
            q29Var.e(this.c);
            q29Var.d(this.z);
            this.L = n;
            E1(true);
            wmaVar.J = true;
            tddVar.invoke();
            return;
        }
        this.t = null;
        qyd qydVar = this.L;
        if (qydVar != null) {
            q29 q29Var2 = (q29) qydVar;
            if (!y6a.F(q29Var2.b())) {
                wmaVar.N(this);
            }
            q29Var2.d = null;
            q29Var2.e = null;
            q29Var2.g = true;
            q29Var2.f(false);
            k29 k29Var = q29Var2.b;
            if (k29Var != null) {
                k29Var.a(q29Var2.a);
                xy xyVar = q29Var2.c;
                c0l c0lVar = xyVar.y0;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) c0lVar.c;
                    i1dVar = (i1d) c0lVar.b;
                    poll = referenceQueue.poll();
                    if (poll != null) {
                        i1dVar.q(poll);
                    }
                } while (poll != null);
                i1dVar.b(new WeakReference(q29Var2, (ReferenceQueue) c0lVar.c));
                xyVar.E.j(q29Var2);
            }
            this.L = null;
            wmaVar.J = true;
            tddVar.invoke();
            if (e1().n && wmaVar.I() && (rydVar = wmaVar.n) != null) {
                ((xy) rydVar).D(wmaVar);
            }
        }
        this.K = false;
    }

    public final void E1(boolean z) {
        char c;
        xy xyVar;
        boolean z2;
        xy xyVar2;
        ryd rydVar;
        Function0 function0;
        int i;
        Function0 function02;
        if (this.M != null) {
            return;
        }
        qyd qydVar = this.L;
        Function1 function1 = this.t;
        if (qydVar == null) {
            if (function1 == null) {
                return;
            }
            r3a.b("null layer with a non-null layerBlock");
            return;
        }
        if (function1 == null) {
            throw wt3.j("updateLayerParameters requires a non-null layerBlock");
        }
        f4g f4gVar = N;
        f4gVar.a();
        wma wmaVar = this.o;
        f4gVar.s = wmaVar.y;
        f4gVar.t = wmaVar.z;
        f4gVar.r = d7a.I(this.c);
        ((xy) zma.a(wmaVar)).getSnapshotObserver().a.i(this, s84.A, new wya(18, function1, this));
        ola olaVar = this.C;
        if (olaVar == null) {
            olaVar = new ola();
            this.C = olaVar;
        }
        ola olaVar2 = O;
        olaVar2.getClass();
        olaVar2.a = olaVar.a;
        olaVar2.b = olaVar.b;
        olaVar2.c = olaVar.c;
        olaVar2.d = olaVar.d;
        olaVar2.e = olaVar.e;
        olaVar2.f = olaVar.f;
        olaVar2.g = olaVar.g;
        olaVar2.h = olaVar.h;
        olaVar2.i = olaVar.i;
        float f = f4gVar.b;
        olaVar.a = f;
        olaVar.b = f4gVar.c;
        olaVar.c = f4gVar.e;
        olaVar.d = f4gVar.f;
        olaVar.e = f4gVar.j;
        olaVar.f = f4gVar.k;
        olaVar.g = f4gVar.l;
        olaVar.h = f4gVar.m;
        long j = f4gVar.n;
        olaVar.i = j;
        q29 q29Var = (q29) qydVar;
        xy xyVar3 = q29Var.c;
        int i2 = f4gVar.a | q29Var.n;
        q29Var.l = f4gVar.t;
        q29Var.k = f4gVar.s;
        int i3 = i2 & 4096;
        if (i3 != 0) {
            q29Var.o = j;
        }
        if ((i2 & 1) != 0) {
            p29 p29Var = q29Var.a.a;
            if (p29Var.A() != f) {
                p29Var.p(f);
            }
        }
        if ((i2 & 2) != 0) {
            n29 n29Var = q29Var.a;
            float f2 = f4gVar.c;
            p29 p29Var2 = n29Var.a;
            if (p29Var2.O() != f2) {
                p29Var2.F(f2);
            }
        }
        if ((i2 & 4) != 0) {
            q29Var.a.g(f4gVar.d);
        }
        if ((i2 & 8) != 0) {
            n29 n29Var2 = q29Var.a;
            float f3 = f4gVar.e;
            p29 p29Var3 = n29Var2.a;
            if (p29Var3.J() != f3) {
                p29Var3.M(f3);
            }
        }
        if ((i2 & 16) != 0) {
            n29 n29Var3 = q29Var.a;
            float f4 = f4gVar.f;
            p29 p29Var4 = n29Var3.a;
            if (p29Var4.I() != f4) {
                p29Var4.c(f4);
            }
        }
        if ((i2 & 32) != 0) {
            n29 n29Var4 = q29Var.a;
            float f5 = f4gVar.g;
            p29 p29Var5 = n29Var4.a;
            if (p29Var5.N() != f5) {
                p29Var5.B(f5);
                n29Var4.g = true;
                n29Var4.a();
            }
            if (f4gVar.g > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !q29Var.t && (function02 = q29Var.e) != null) {
                function02.invoke();
            }
        }
        if ((i2 & 64) != 0) {
            n29 n29Var5 = q29Var.a;
            long j2 = f4gVar.h;
            p29 p29Var6 = n29Var5.a;
            long l = p29Var6.l();
            int i4 = r13.j;
            if (!e8k.a(j2, l)) {
                p29Var6.n(j2);
            }
        }
        if ((i2 & 128) != 0) {
            n29 n29Var6 = q29Var.a;
            long j3 = f4gVar.i;
            p29 p29Var7 = n29Var6.a;
            long m = p29Var7.m();
            int i5 = r13.j;
            if (!e8k.a(j3, m)) {
                p29Var7.u(j3);
            }
        }
        if ((i2 & 1024) != 0) {
            n29 n29Var7 = q29Var.a;
            float f6 = f4gVar.l;
            p29 p29Var8 = n29Var7.a;
            if (p29Var8.k() != f6) {
                p29Var8.C(f6);
            }
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            n29 n29Var8 = q29Var.a;
            float f7 = f4gVar.j;
            p29 p29Var9 = n29Var8.a;
            if (p29Var9.K() != f7) {
                p29Var9.x(f7);
            }
        }
        if ((i2 & 512) != 0) {
            n29 n29Var9 = q29Var.a;
            float f8 = f4gVar.k;
            p29 p29Var10 = n29Var9.a;
            if (p29Var10.i() != f8) {
                p29Var10.z(f8);
            }
        }
        if ((i2 & a.o) != 0) {
            n29 n29Var10 = q29Var.a;
            float f9 = f4gVar.m;
            p29 p29Var11 = n29Var10.a;
            if (p29Var11.q() != f9) {
                p29Var11.w(f9);
            }
        }
        if (i3 != 0) {
            c = ' ';
            boolean a = xvj.a(q29Var.o, xvj.b);
            n29 n29Var11 = q29Var.a;
            if (!a) {
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (q29Var.o & 4294967295L)) * ((int) (q29Var.f & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (q29Var.o >> 32)) * ((int) (q29Var.f >> 32))) << 32);
                if (!dnd.c(n29Var11.v, floatToRawIntBits)) {
                    n29Var11.v = floatToRawIntBits;
                    n29Var11.a.G(floatToRawIntBits);
                }
            } else if (!dnd.c(n29Var11.v, 9205357640488583168L)) {
                n29Var11.v = 9205357640488583168L;
                n29Var11.a.G(9205357640488583168L);
            }
        } else {
            c = ' ';
        }
        if ((i2 & 16384) != 0) {
            n29 n29Var12 = q29Var.a;
            boolean z3 = f4gVar.p;
            if (n29Var12.w != z3) {
                n29Var12.w = z3;
                n29Var12.g = true;
                n29Var12.a();
            }
        }
        if ((131072 & i2) != 0) {
            n29 n29Var13 = q29Var.a;
            qy1 qy1Var = f4gVar.u;
            p29 p29Var12 = n29Var13.a;
            if (!Intrinsics.c(p29Var12.b(), qy1Var)) {
                p29Var12.r(qy1Var);
            }
        }
        if ((262144 & i2) != 0) {
            p29 p29Var13 = q29Var.a.a;
            if (!Intrinsics.c(p29Var13.g(), null)) {
                p29Var13.o();
            }
        }
        if ((524288 & i2) != 0) {
            n29 n29Var14 = q29Var.a;
            int i6 = f4gVar.v;
            p29 p29Var14 = n29Var14.a;
            if (p29Var14.y() != i6) {
                p29Var14.d(i6);
            }
        }
        if ((32768 & i2) != 0) {
            n29 n29Var15 = q29Var.a;
            int i7 = f4gVar.q;
            if (i7 == 0) {
                i = 0;
            } else if (i7 == 1) {
                i = 1;
            } else {
                i = 2;
                if (i7 != 2) {
                    a70.r("Not supported composition strategy");
                    return;
                }
            }
            p29 p29Var15 = n29Var15.a;
            if (p29Var15.f() != i) {
                p29Var15.L(i);
            }
        }
        if ((i2 & 7963) != 0) {
            q29Var.q = true;
            q29Var.r = true;
        }
        if (Intrinsics.c(q29Var.p, f4gVar.w)) {
            xyVar = xyVar3;
            z2 = false;
        } else {
            pea peaVar = f4gVar.w;
            q29Var.p = peaVar;
            if (peaVar == null) {
                xyVar = xyVar3;
            } else {
                n29 n29Var16 = q29Var.a;
                if (peaVar instanceof dxd) {
                    oqf oqfVar = ((dxd) peaVar).g;
                    float f10 = oqfVar.a;
                    float f11 = oqfVar.b;
                    xyVar = xyVar3;
                    n29Var16.h((Float.floatToRawIntBits(f10) << c) | (Float.floatToRawIntBits(f11) & 4294967295L), (Float.floatToRawIntBits(oqfVar.c - f10) << c) | (Float.floatToRawIntBits(oqfVar.d - f11) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    xyVar = xyVar3;
                    if (peaVar instanceof cxd) {
                        b20 b20Var = ((cxd) peaVar).g;
                        n29Var16.k = null;
                        n29Var16.i = 9205357640488583168L;
                        n29Var16.h = 0L;
                        n29Var16.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        n29Var16.g = true;
                        n29Var16.n = false;
                        n29Var16.l = b20Var;
                        n29Var16.a();
                    } else {
                        if (!(peaVar instanceof exd)) {
                            zzl.b();
                            return;
                        }
                        exd exdVar = (exd) peaVar;
                        b20 b20Var2 = exdVar.h;
                        if (b20Var2 != null) {
                            n29Var16.k = null;
                            n29Var16.i = 9205357640488583168L;
                            n29Var16.h = 0L;
                            n29Var16.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            n29Var16.g = true;
                            n29Var16.n = false;
                            n29Var16.l = b20Var2;
                            n29Var16.a();
                        } else {
                            e7g e7gVar = exdVar.g;
                            float f12 = e7gVar.b;
                            float f13 = e7gVar.a;
                            n29Var16.h((Float.floatToRawIntBits(f13) << c) | (Float.floatToRawIntBits(f12) & 4294967295L), (Float.floatToRawIntBits(e7gVar.c - f13) << c) | (Float.floatToRawIntBits(e7gVar.d - f12) & 4294967295L), Float.intBitsToFloat((int) (e7gVar.h >> c)));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((peaVar instanceof cxd) || ((peaVar instanceof exd) && !uaa.t(((exd) peaVar).g))) && (function0 = q29Var.e) != null)) {
                    function0.invoke();
                }
            }
            z2 = true;
        }
        q29Var.n = f4gVar.a;
        if (i2 != 0 || z2) {
            ViewParent parent = xyVar.getParent();
            if (parent != null) {
                xyVar2 = xyVar;
                parent.onDescendantInvalidated(xyVar2, xyVar2);
            } else {
                xyVar2 = xyVar;
            }
            if (xy.t()) {
                xyVar2.R(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        boolean z4 = this.s;
        this.s = f4gVar.p;
        this.w = f4gVar.d;
        boolean z5 = olaVar2.a == olaVar.a && olaVar2.b == olaVar.b && olaVar2.c == olaVar.c && olaVar2.d == olaVar.d && olaVar2.e == olaVar.e && olaVar2.f == olaVar.f && olaVar2.g == olaVar.g && olaVar2.h == olaVar.h && xvj.a(olaVar2.i, olaVar.i);
        if (z && ((!z5 || z4 != this.s) && (rydVar = wmaVar.n) != null)) {
            ((xy) rydVar).D(wmaVar);
        }
        if (z5) {
            return;
        }
        wmaVar.N(this);
        if (wmaVar.P > 0) {
            xy xyVar4 = (xy) zma.a(wmaVar);
            k1d k1dVar = (k1d) xyVar4.W.f;
            if (wmaVar.P > 0) {
                ((i1d) k1dVar.b).b(wmaVar);
                wmaVar.O = true;
            }
            xyVar4.K(null);
        }
    }

    @Override // defpackage.tkb
    public final long F0() {
        return this.z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F1(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        qyd qydVar = this.L;
        if (qydVar == null || !this.s) {
            return true;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        n29 n29Var = ((q29) qydVar).a;
        if (n29Var.w) {
            pea e = n29Var.e();
            if (!(e instanceof dxd)) {
                if (e instanceof exd) {
                    e7g e7gVar = ((exd) e).g;
                    float f = e7gVar.c;
                    float f2 = e7gVar.b;
                    float f3 = e7gVar.d;
                    float f4 = e7gVar.a;
                    long j2 = e7gVar.f;
                    long j3 = e7gVar.h;
                    z = false;
                    z2 = true;
                    long j4 = e7gVar.g;
                    long j5 = e7gVar.e;
                    if (intBitsToFloat >= f4 && intBitsToFloat < f && intBitsToFloat2 >= f2 && intBitsToFloat2 < f3) {
                        int i = (int) (j5 >> 32);
                        float intBitsToFloat3 = Float.intBitsToFloat(i);
                        int i2 = (int) (j2 >> 32);
                        if (Float.intBitsToFloat(i2) + intBitsToFloat3 <= f - f4) {
                            int i3 = (int) (j3 >> 32);
                            float intBitsToFloat4 = Float.intBitsToFloat(i3);
                            int i4 = (int) (j4 >> 32);
                            if (Float.intBitsToFloat(i4) + intBitsToFloat4 <= f - f4) {
                                int i5 = (int) (j5 & 4294967295L);
                                int i6 = (int) (j3 & 4294967295L);
                                if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= f3 - f2) {
                                    int i7 = (int) (j2 & 4294967295L);
                                    int i8 = (int) (j4 & 4294967295L);
                                    if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= f3 - f2) {
                                        float intBitsToFloat5 = Float.intBitsToFloat(i) + f4;
                                        float intBitsToFloat6 = Float.intBitsToFloat(i5) + f2;
                                        float intBitsToFloat7 = f - Float.intBitsToFloat(i2);
                                        float intBitsToFloat8 = Float.intBitsToFloat(i7) + f2;
                                        float intBitsToFloat9 = f - Float.intBitsToFloat(i4);
                                        float intBitsToFloat10 = f3 - Float.intBitsToFloat(i8);
                                        float intBitsToFloat11 = f3 - Float.intBitsToFloat(i6);
                                        float intBitsToFloat12 = Float.intBitsToFloat(i3) + f4;
                                        if (intBitsToFloat < intBitsToFloat5 && intBitsToFloat2 < intBitsToFloat6) {
                                            z3 = i2a.C(intBitsToFloat, intBitsToFloat2, intBitsToFloat5, intBitsToFloat6, e7gVar.e);
                                        } else if (intBitsToFloat < intBitsToFloat12 && intBitsToFloat2 > intBitsToFloat11) {
                                            z3 = i2a.C(intBitsToFloat, intBitsToFloat2, intBitsToFloat12, intBitsToFloat11, e7gVar.h);
                                        } else if (intBitsToFloat <= intBitsToFloat7 || intBitsToFloat2 >= intBitsToFloat8) {
                                            if (intBitsToFloat > intBitsToFloat9 && intBitsToFloat2 > intBitsToFloat10) {
                                                z3 = i2a.C(intBitsToFloat, intBitsToFloat2, intBitsToFloat9, intBitsToFloat10, e7gVar.g);
                                            }
                                            z3 = z2;
                                        } else {
                                            z3 = i2a.C(intBitsToFloat, intBitsToFloat2, intBitsToFloat7, intBitsToFloat8, e7gVar.f);
                                        }
                                    }
                                }
                            }
                        }
                        b20 a = e20.a();
                        b20.c(a, e7gVar);
                        z3 = i2a.B(intBitsToFloat, intBitsToFloat2, a);
                    }
                } else {
                    z = false;
                    z2 = true;
                    if (!(e instanceof cxd)) {
                        zzl.b();
                        return false;
                    }
                    z3 = i2a.B(intBitsToFloat, intBitsToFloat2, ((cxd) e).g);
                }
                return z3 ? z2 : z;
            }
            oqf oqfVar = ((dxd) e).g;
            if (oqfVar.a > intBitsToFloat || intBitsToFloat >= oqfVar.c || oqfVar.b > intBitsToFloat2 || intBitsToFloat2 >= oqfVar.d) {
                z = false;
                z2 = true;
            }
            z3 = z;
            if (z3) {
            }
        }
        z = false;
        z2 = true;
        z3 = z2;
        if (z3) {
        }
    }

    @Override // defpackage.dma
    public final long I(long j) {
        if (!e1().n) {
            r3a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((xy) zma.a(this.o)).y(P(j));
    }

    @Override // defpackage.dma
    public final dma K() {
        boolean z = e1().n;
        wma wmaVar = this.o;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (wma wmaVar2 = wmaVar; wmaVar2 != null; wmaVar2 = wmaVar2.v()) {
                sb.append("\n|");
                sb.append(wmaVar2);
                sb.append(" isAttached=");
                sb.append(wmaVar2.H());
                sb.append(" modifier=");
                sb.append(wmaVar2.K);
                sb.append(" tail=");
                sb.append(e1());
            }
            r3a.b(sb.toString());
        }
        n1();
        return ((wdd) wmaVar.F.e).q;
    }

    @Override // defpackage.tkb
    public final void N0() {
        n29 n29Var = this.M;
        long j = this.z;
        if (n29Var != null) {
            a0(this.A, j, n29Var);
        } else {
            b0(j, this.A, this.t);
        }
    }

    @Override // defpackage.dma
    public final long P(long j) {
        if (!e1().n) {
            r3a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        n1();
        while (this != null) {
            wma wmaVar = this.o;
            if (this == ((wdd) wmaVar.F.e) && !wmaVar.c) {
                long b = ((xy) zma.a(wmaVar)).getRectManager().b(wmaVar);
                if (!r6a.b(b, 9223372034707292159L)) {
                    return s6a.H(j, b);
                }
            }
            qyd qydVar = this.L;
            if (qydVar != null) {
                q29 q29Var = (q29) qydVar;
                float[] b2 = q29Var.b();
                if (!q29Var.s) {
                    j = xzb.b(j, b2);
                }
            }
            j = s6a.H(j, this.z);
            this = this.q;
        }
        return j;
    }

    public final void P0(wdd wddVar, w0d w0dVar, boolean z) {
        if (wddVar == this) {
            return;
        }
        wdd wddVar2 = this.q;
        if (wddVar2 != null) {
            wddVar2.P0(wddVar, w0dVar, z);
        }
        long j = this.z;
        float f = (int) (j >> 32);
        w0dVar.b -= f;
        w0dVar.d -= f;
        float f2 = (int) (j & 4294967295L);
        w0dVar.c -= f2;
        w0dVar.e -= f2;
        qyd qydVar = this.L;
        if (qydVar != null) {
            q29 q29Var = (q29) qydVar;
            float[] a = q29Var.a();
            if (!q29Var.s) {
                if (a == null) {
                    w0dVar.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    w0dVar.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    w0dVar.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    w0dVar.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    xzb.c(a, w0dVar);
                }
            }
            if (this.s && z) {
                long j2 = this.c;
                w0dVar.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final long S0(wdd wddVar, long j) {
        if (wddVar == this) {
            return j;
        }
        wdd wddVar2 = this.q;
        return (wddVar2 == null || Intrinsics.c(wddVar, wddVar2)) ? b1(j) : b1(wddVar2.S0(wddVar, j));
    }

    public final long T0(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - V();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - S();
        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat / 2.0f);
        float max2 = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public final float U0(long j, long j2) {
        if (V() >= Float.intBitsToFloat((int) (j2 >> 32)) && S() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long T0 = T0(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (T0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (T0 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -intBitsToFloat3 : intBitsToFloat3 - V());
        long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (j & 4294967295L)) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -r8 : r8 - S())) & 4294967295L);
        if ((intBitsToFloat > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || intBitsToFloat2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) <= intBitsToFloat && Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) <= intBitsToFloat2) {
            return dnd.e(floatToRawIntBits);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void V0(uj2 uj2Var, n29 n29Var) {
        qyd qydVar = this.L;
        if (qydVar == null) {
            long j = this.z;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            uj2Var.g(f, f2);
            Y0(uj2Var, n29Var);
            uj2Var.g(-f, -f2);
            return;
        }
        q29 q29Var = (q29) qydVar;
        wj2 wj2Var = q29Var.m;
        q29Var.g();
        q29Var.t = q29Var.a.a.N() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        sx2 sx2Var = wj2Var.b;
        sx2Var.K(uj2Var);
        sx2Var.b = n29Var;
        ww9.x(wj2Var, q29Var.a);
    }

    public final void Y0(uj2 uj2Var, n29 n29Var) {
        wdd wddVar;
        uj2 uj2Var2;
        n29 n29Var2;
        wtc f1 = f1(4);
        if (f1 == null) {
            t1(uj2Var, n29Var);
            return;
        }
        wma wmaVar = this.o;
        wmaVar.getClass();
        yma sharedDrawScope = ((xy) zma.a(wmaVar)).getSharedDrawScope();
        long I = d7a.I(this.c);
        sharedDrawScope.getClass();
        i1d i1dVar = null;
        while (f1 != null) {
            if (f1 instanceof ga5) {
                wddVar = this;
                uj2Var2 = uj2Var;
                n29Var2 = n29Var;
                sharedDrawScope.b(uj2Var2, I, wddVar, (ga5) f1, n29Var2);
            } else {
                wddVar = this;
                uj2Var2 = uj2Var;
                n29Var2 = n29Var;
                if ((f1.c & 4) != 0 && (f1 instanceof bw4)) {
                    int i = 0;
                    for (wtc wtcVar = ((bw4) f1).p; wtcVar != null; wtcVar = wtcVar.f) {
                        if ((wtcVar.c & 4) != 0) {
                            i++;
                            if (i == 1) {
                                f1 = wtcVar;
                            } else {
                                if (i1dVar == null) {
                                    i1dVar = new i1d(new wtc[16], 0);
                                }
                                if (f1 != null) {
                                    i1dVar.b(f1);
                                    f1 = null;
                                }
                                i1dVar.b(wtcVar);
                            }
                        }
                    }
                    if (i == 1) {
                        uj2Var = uj2Var2;
                        this = wddVar;
                        n29Var = n29Var2;
                    }
                }
            }
            f1 = c6o.X(i1dVar);
            uj2Var = uj2Var2;
            this = wddVar;
            n29Var = n29Var2;
        }
    }

    public abstract void Z0();

    @Override // defpackage.qhe
    public abstract void a0(float f, long j, n29 n29Var);

    public final wdd a1(wdd wddVar) {
        wma wmaVar = wddVar.o;
        wma wmaVar2 = this.o;
        if (wmaVar == wmaVar2) {
            wtc e1 = wddVar.e1();
            wtc e12 = e1();
            if (!e12.a.n) {
                r3a.b("visitLocalAncestors called on an unattached node");
            }
            for (wtc wtcVar = e12.a.e; wtcVar != null; wtcVar = wtcVar.e) {
                if ((wtcVar.c & 2) != 0 && wtcVar == e1) {
                    return wddVar;
                }
            }
            return this;
        }
        while (wmaVar.p > wmaVar2.p) {
            wmaVar = wmaVar.v();
            wmaVar.getClass();
        }
        wma wmaVar3 = wmaVar2;
        while (wmaVar3.p > wmaVar.p) {
            wmaVar3 = wmaVar3.v();
            wmaVar3.getClass();
        }
        while (wmaVar != wmaVar3) {
            wmaVar = wmaVar.v();
            wmaVar3 = wmaVar3.v();
            if (wmaVar == null || wmaVar3 == null) {
                a70.p("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (wmaVar3 != wmaVar2) {
            if (wmaVar != wddVar.o) {
                return (z3a) wmaVar.F.d;
            }
            return wddVar;
        }
        return this;
    }

    public final long b1(long j) {
        long j2 = this.z;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        qyd qydVar = this.L;
        if (qydVar != null) {
            q29 q29Var = (q29) qydVar;
            float[] a = q29Var.a();
            if (a == null) {
                return 9187343241974906880L;
            }
            if (!q29Var.s) {
                return xzb.b(floatToRawIntBits, a);
            }
        }
        return floatToRawIntBits;
    }

    public abstract vkb c1();

    @Override // defpackage.dma
    public final void d(dma dmaVar, float[] fArr) {
        wdd z1 = z1(dmaVar);
        z1.n1();
        wdd a1 = a1(z1);
        xzb.d(fArr);
        z1.C1(a1, fArr);
        B1(a1, fArr);
    }

    public final long d1() {
        return this.u.R0(this.o.A.e());
    }

    @Override // defpackage.dma
    public final long e() {
        return this.c;
    }

    public abstract wtc e1();

    @Override // defpackage.dma
    public final boolean f() {
        return e1().n;
    }

    public final wtc f1(int i) {
        boolean g = xdd.g(i);
        wtc e1 = e1();
        if (!g && (e1 = e1.e) == null) {
            return null;
        }
        for (wtc g1 = g1(g); g1 != null && (g1.d & i) != 0; g1 = g1.f) {
            if ((g1.c & i) != 0) {
                return g1;
            }
            if (g1 == e1) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.dma
    public final long g(long j) {
        if (!e1().n) {
            r3a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        dma y = o6a.y(this);
        xy xyVar = (xy) zma.a(this.o);
        xyVar.H();
        return o(y, dnd.h(xzb.b(j, xyVar.e0), y.P(0L)));
    }

    public final wtc g1(boolean z) {
        wtc e1;
        c40 c40Var = this.o.F;
        if (((wdd) c40Var.e) == this) {
            return (wtc) c40Var.g;
        }
        wdd wddVar = this.q;
        if (!z) {
            if (wddVar != null) {
                return wddVar.e1();
            }
            return null;
        }
        if (wddVar == null || (e1 = wddVar.e1()) == null) {
            return null;
        }
        return e1.f;
    }

    @Override // defpackage.kx4
    public final float getFontScale() {
        return this.o.y.getFontScale();
    }

    @Override // defpackage.l9a
    public final ema getLayoutDirection() {
        return this.o.z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [wtc] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [wtc] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [i1d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [i1d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.qhe, defpackage.g1c
    public final Object h() {
        wma wmaVar = this.o;
        if (!wmaVar.F.n(64)) {
            return null;
        }
        e1();
        fsf fsfVar = new fsf();
        for (wtc wtcVar = (hti) wmaVar.F.f; wtcVar != null; wtcVar = wtcVar.e) {
            if ((wtcVar.c & 64) != 0) {
                bw4 bw4Var = wtcVar;
                ?? r5 = 0;
                while (bw4Var != 0) {
                    if (bw4Var instanceof d9e) {
                        fsfVar.a = ((d9e) bw4Var).d(wmaVar.y, fsfVar.a);
                    } else if ((bw4Var.c & 64) != 0 && (bw4Var instanceof bw4)) {
                        wtc wtcVar2 = bw4Var.p;
                        int i = 0;
                        bw4Var = bw4Var;
                        r5 = r5;
                        while (wtcVar2 != null) {
                            if ((wtcVar2.c & 64) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    bw4Var = wtcVar2;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new i1d(new wtc[16], 0);
                                    }
                                    if (bw4Var != 0) {
                                        r5.b(bw4Var);
                                        bw4Var = 0;
                                    }
                                    r5.b(wtcVar2);
                                }
                            }
                            wtcVar2 = wtcVar2.f;
                            bw4Var = bw4Var;
                            r5 = r5;
                        }
                        if (i == 1) {
                        }
                    }
                    bw4Var = c6o.X(r5);
                }
            }
        }
        return fsfVar.a;
    }

    public final void h1(wtc wtcVar, sdd sddVar, long j, jc9 jc9Var, int i, boolean z) {
        if (wtcVar == null) {
            k1(sddVar, j, jc9Var, i, z);
            return;
        }
        if (!sddVar.d(wtcVar)) {
            h1(bea.E(wtcVar, sddVar.b()), sddVar, j, jc9Var, i, z);
            return;
        }
        int i2 = jc9Var.c;
        l0d l0dVar = jc9Var.a;
        jc9Var.d(i2 + 1, l0dVar.b);
        jc9Var.c++;
        l0dVar.a(wtcVar);
        jc9Var.b.a(un0.g(-1.0f, z, false));
        h1(bea.E(wtcVar, sddVar.b()), sddVar, j, jc9Var, i, z);
        jc9Var.c = i2;
    }

    public final void i1(wtc wtcVar, sdd sddVar, long j, jc9 jc9Var, int i, boolean z, float f) {
        if (wtcVar == null) {
            k1(sddVar, j, jc9Var, i, z);
            return;
        }
        if (!sddVar.d(wtcVar)) {
            i1(bea.E(wtcVar, sddVar.b()), sddVar, j, jc9Var, i, z, f);
            return;
        }
        int i2 = jc9Var.c;
        l0d l0dVar = jc9Var.a;
        jc9Var.d(i2 + 1, l0dVar.b);
        jc9Var.c++;
        l0dVar.a(wtcVar);
        jc9Var.b.a(un0.g(f, z, false));
        s1(bea.E(wtcVar, sddVar.b()), sddVar, j, jc9Var, i, z, f, true);
        jc9Var.c = i2;
    }

    @Override // defpackage.kx4
    public final float j() {
        return this.o.y.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (defpackage.xw3.A(r19.c(), defpackage.un0.g(r2, r7, false)) > 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j1(sdd sddVar, long j, jc9 jc9Var, int i, boolean z) {
        boolean z2;
        l0d l0dVar = jc9Var.a;
        wtc f1 = f1(sddVar.b());
        boolean z3 = false;
        if (!F1(j)) {
            if (i == 1) {
                float U0 = U0(j, d1());
                if ((Float.floatToRawIntBits(U0) & Integer.MAX_VALUE) < 2139095040) {
                    if (jc9Var.c != l0dVar.b - 1) {
                        if (xw3.A(jc9Var.c(), un0.g(U0, false, false)) <= 0) {
                            return;
                        }
                    }
                    i1(f1, sddVar, j, jc9Var, i, false, U0);
                    return;
                }
                return;
            }
            return;
        }
        if (f1 == null) {
            k1(sddVar, j, jc9Var, i, z);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (intBitsToFloat >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && intBitsToFloat2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && intBitsToFloat < V() && intBitsToFloat2 < S()) {
            h1(f1, sddVar, j, jc9Var, i, z);
            return;
        }
        float U02 = i == 1 ? U0(j, d1()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(U02) & Integer.MAX_VALUE) < 2139095040) {
            if (jc9Var.c == l0dVar.b - 1) {
                z2 = z;
            } else {
                z2 = z;
            }
            z3 = true;
        } else {
            z2 = z;
        }
        s1(f1, sddVar, j, jc9Var, i, z2, U02, z3);
    }

    public void k1(sdd sddVar, long j, jc9 jc9Var, int i, boolean z) {
        wdd wddVar = this.p;
        if (wddVar != null) {
            wddVar.j1(sddVar, wddVar.b1(j), jc9Var, i, z);
        }
    }

    @Override // defpackage.dma
    public final long l(dma dmaVar, long j) {
        return o(dmaVar, j);
    }

    public final void l1() {
        qyd qydVar = this.L;
        if (qydVar != null) {
            ((q29) qydVar).c();
            return;
        }
        wdd wddVar = this.q;
        if (wddVar != null) {
            wddVar.l1();
        }
    }

    @Override // defpackage.dma
    public final long m(long j) {
        if (!e1().n) {
            r3a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return o(o6a.y(this), ((xy) zma.a(this.o)).L(j));
    }

    public final boolean m1() {
        if (this.L != null && this.w <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return true;
        }
        wdd wddVar = this.q;
        if (wddVar != null) {
            return wddVar.m1();
        }
        return false;
    }

    public final void n1() {
        this.o.G.b();
    }

    @Override // defpackage.dma
    public final long o(dma dmaVar, long j) {
        if (dmaVar instanceof wkb) {
            wkb wkbVar = (wkb) dmaVar;
            wkbVar.a.o.n1();
            return wkbVar.o(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        wdd z1 = z1(dmaVar);
        z1.n1();
        wdd a1 = a1(z1);
        while (z1 != a1) {
            qyd qydVar = z1.L;
            if (qydVar != null) {
                q29 q29Var = (q29) qydVar;
                float[] b = q29Var.b();
                if (!q29Var.s) {
                    j = xzb.b(j, b);
                }
            }
            j = s6a.H(j, z1.z);
            z1 = z1.q;
            z1.getClass();
        }
        return S0(a1, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [wtc] */
    /* JADX WARN: Type inference failed for: r7v7, types: [wtc] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [i1d] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [i1d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void o1() {
        wtc wtcVar;
        boolean g = xdd.g(128);
        wtc g1 = g1(g);
        if (g1 == null || (g1.a.d & 128) == 0) {
            return;
        }
        nnh w = bea.w();
        Function1 e = w != null ? w.e() : null;
        nnh C = bea.C(w);
        try {
            if (g) {
                wtcVar = e1();
            } else {
                wtcVar = e1().e;
                if (wtcVar == null) {
                    Unit unit = Unit.a;
                    bea.K(w, C, e);
                }
            }
            for (wtc g12 = g1(g); g12 != null && (g12.d & 128) != 0; g12 = g12.f) {
                if ((g12.c & 128) != 0) {
                    bw4 bw4Var = g12;
                    ?? r8 = 0;
                    while (bw4Var != 0) {
                        if (bw4Var instanceof o1c) {
                            ((o1c) bw4Var).c(this.c);
                        } else if ((bw4Var.c & 128) != 0 && (bw4Var instanceof bw4)) {
                            wtc wtcVar2 = bw4Var.p;
                            int i = 0;
                            bw4Var = bw4Var;
                            r8 = r8;
                            while (wtcVar2 != null) {
                                if ((wtcVar2.c & 128) != 0) {
                                    i++;
                                    r8 = r8;
                                    if (i == 1) {
                                        bw4Var = wtcVar2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new i1d(new wtc[16], 0);
                                        }
                                        if (bw4Var != 0) {
                                            r8.b(bw4Var);
                                            bw4Var = 0;
                                        }
                                        r8.b(wtcVar2);
                                    }
                                }
                                wtcVar2 = wtcVar2.f;
                                bw4Var = bw4Var;
                                r8 = r8;
                            }
                            if (i == 1) {
                            }
                        }
                        bw4Var = c6o.X(r8);
                    }
                }
                if (g12 == wtcVar) {
                    break;
                }
            }
            Unit unit2 = Unit.a;
            bea.K(w, C, e);
        } catch (Throwable th) {
            bea.K(w, C, e);
            throw th;
        }
    }

    @Override // defpackage.dma
    public final oqf p(dma dmaVar, boolean z) {
        if (!e1().n) {
            r3a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!dmaVar.f()) {
            r3a.b("LayoutCoordinates " + dmaVar + " is not attached!");
        }
        wdd z1 = z1(dmaVar);
        z1.n1();
        wdd a1 = a1(z1);
        w0d w0dVar = this.B;
        if (w0dVar == null) {
            w0dVar = new w0d();
            this.B = w0dVar;
        }
        w0dVar.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        w0dVar.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        w0dVar.d = (int) (dmaVar.e() >> 32);
        w0dVar.e = (int) (dmaVar.e() & 4294967295L);
        while (z1 != a1) {
            z1.v1(w0dVar, z, false);
            if (w0dVar.b()) {
                return oqf.e;
            }
            z1 = z1.q;
            z1.getClass();
        }
        P0(a1, w0dVar, z);
        return new oqf(w0dVar.b, w0dVar.c, w0dVar.d, w0dVar.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [wtc] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [wtc] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [i1d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [i1d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void p1() {
        boolean g = xdd.g(4194304);
        wtc e1 = e1();
        if (!g && (e1 = e1.e) == null) {
            return;
        }
        for (wtc g1 = g1(g); g1 != null && (g1.d & 4194304) != 0; g1 = g1.f) {
            if ((g1.c & 4194304) != 0) {
                bw4 bw4Var = g1;
                ?? r5 = 0;
                while (bw4Var != 0) {
                    if (bw4Var instanceof ula) {
                        ((ula) bw4Var).q0(this);
                    } else if ((bw4Var.c & 4194304) != 0 && (bw4Var instanceof bw4)) {
                        wtc wtcVar = bw4Var.p;
                        int i = 0;
                        bw4Var = bw4Var;
                        r5 = r5;
                        while (wtcVar != null) {
                            if ((wtcVar.c & 4194304) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    bw4Var = wtcVar;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new i1d(new wtc[16], 0);
                                    }
                                    if (bw4Var != 0) {
                                        r5.b(bw4Var);
                                        bw4Var = 0;
                                    }
                                    r5.b(wtcVar);
                                }
                            }
                            wtcVar = wtcVar.f;
                            bw4Var = bw4Var;
                            r5 = r5;
                        }
                        if (i == 1) {
                        }
                    }
                    bw4Var = c6o.X(r5);
                }
            }
            if (g1 == e1) {
                return;
            }
        }
    }

    public final void q1() {
        this.r = true;
        this.J.invoke();
        w1();
        if (r6a.b(this.z, 0L)) {
            return;
        }
        this.o.N(this);
    }

    public final void r1() {
        boolean g = xdd.g(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        wtc g1 = g1(g);
        if (g1 == null || (g1.a.d & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0) {
            return;
        }
        wtc e1 = e1();
        if (!g && (e1 = e1.e) == null) {
            return;
        }
        for (wtc g12 = g1(g); g12 != null && (g12.d & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0; g12 = g12.f) {
            if ((g12.c & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                wtc wtcVar = g12;
                i1d i1dVar = null;
                while (wtcVar != null) {
                    if (wtcVar instanceof zqd) {
                        ((zqd) wtcVar).l1();
                    } else if ((wtcVar.c & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 && (wtcVar instanceof bw4)) {
                        int i = 0;
                        for (wtc wtcVar2 = ((bw4) wtcVar).p; wtcVar2 != null; wtcVar2 = wtcVar2.f) {
                            if ((wtcVar2.c & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                                i++;
                                if (i == 1) {
                                    wtcVar = wtcVar2;
                                } else {
                                    if (i1dVar == null) {
                                        i1dVar = new i1d(new wtc[16], 0);
                                    }
                                    if (wtcVar != null) {
                                        i1dVar.b(wtcVar);
                                        wtcVar = null;
                                    }
                                    i1dVar.b(wtcVar2);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    wtcVar = c6o.X(i1dVar);
                }
            }
            if (g12 == e1) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [wtc] */
    /* JADX WARN: Type inference failed for: r3v28 */
    public final void s1(wtc wtcVar, sdd sddVar, long j, jc9 jc9Var, int i, boolean z, float f, boolean z2) {
        wtc X;
        l0d l0dVar = jc9Var.a;
        if (wtcVar == null) {
            k1(sddVar, j, jc9Var, i, z);
            return;
        }
        if (!sddVar.d(wtcVar)) {
            s1(bea.E(wtcVar, sddVar.b()), sddVar, j, jc9Var, i, z, f, z2);
            return;
        }
        int i2 = i;
        if (i2 == 3 || i2 == 4) {
            i1d i1dVar = null;
            bw4 bw4Var = wtcVar;
            while (true) {
                if (bw4Var == 0) {
                    break;
                }
                if (bw4Var instanceof pze) {
                    long r0 = ((pze) bw4Var).r0();
                    int i3 = (int) (j >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i3);
                    wma wmaVar = this.o;
                    ema emaVar = wmaVar.z;
                    int i4 = sqj.b;
                    long j2 = Long.MIN_VALUE & r0;
                    if (intBitsToFloat >= (-(((j2 == 0 || emaVar == ema.a) ? (int) r0 : (int) (r0 >> 30)) & 32767))) {
                        if (Float.intBitsToFloat(i3) < V() + (((j2 == 0 || wmaVar.z == ema.a) ? (int) (r0 >> 30) : (int) r0) & 32767)) {
                            int i5 = (int) (j & 4294967295L);
                            if (Float.intBitsToFloat(i5) >= (-(((int) (r0 >> 15)) & 32767))) {
                                if (Float.intBitsToFloat(i5) < (((int) (r0 >> 45)) & 32767) + S()) {
                                    udd uddVar = new udd(this, wtcVar, sddVar, j, jc9Var, i2, z, f, z2);
                                    a0d a0dVar = jc9Var.b;
                                    int i6 = jc9Var.c;
                                    int i7 = l0dVar.b;
                                    if (i6 == i7 - 1) {
                                        jc9Var.d(i6 + 1, i7);
                                        jc9Var.c++;
                                        l0dVar.a(wtcVar);
                                        a0dVar.a(un0.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z, true));
                                        uddVar.invoke();
                                        jc9Var.c = i6;
                                        return;
                                    }
                                    long c = jc9Var.c();
                                    int i8 = jc9Var.c;
                                    if (!xw3.I(c)) {
                                        if (xw3.G(c) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            int i9 = jc9Var.c;
                                            jc9Var.d(i9 + 1, l0dVar.b);
                                            jc9Var.c++;
                                            l0dVar.a(wtcVar);
                                            a0dVar.a(un0.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z, true));
                                            uddVar.invoke();
                                            jc9Var.c = i9;
                                            return;
                                        }
                                        return;
                                    }
                                    int i10 = l0dVar.b;
                                    int i11 = i10 - 1;
                                    jc9Var.c = i11;
                                    jc9Var.d(i10, l0dVar.b);
                                    jc9Var.c++;
                                    l0dVar.a(wtcVar);
                                    a0dVar.a(un0.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z, true));
                                    uddVar.invoke();
                                    jc9Var.c = i11;
                                    if (xw3.G(jc9Var.c()) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        jc9Var.d(i8 + 1, jc9Var.c + 1);
                                    }
                                    jc9Var.c = i8;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((bw4Var.c & 16) != 0 && (bw4Var instanceof bw4)) {
                        wtc wtcVar2 = bw4Var.p;
                        int i12 = 0;
                        X = bw4Var;
                        i1dVar = i1dVar;
                        while (wtcVar2 != null) {
                            if ((wtcVar2.c & 16) != 0) {
                                i12++;
                                i1dVar = i1dVar;
                                if (i12 == 1) {
                                    X = wtcVar2;
                                } else {
                                    if (i1dVar == null) {
                                        i1dVar = new i1d(new wtc[16], 0);
                                    }
                                    if (X != null) {
                                        i1dVar.b(X);
                                        X = null;
                                    }
                                    i1dVar.b(wtcVar2);
                                }
                            }
                            wtcVar2 = wtcVar2.f;
                            X = X;
                            i1dVar = i1dVar;
                        }
                        if (i12 == 1) {
                            i2 = i;
                            bw4Var = X;
                            i1dVar = i1dVar;
                        }
                    }
                    X = c6o.X(i1dVar);
                    i2 = i;
                    bw4Var = X;
                    i1dVar = i1dVar;
                }
            }
        }
        if (z2) {
            i1(wtcVar, sddVar, j, jc9Var, i, z, f);
        } else {
            y1(wtcVar, sddVar, j, jc9Var, i, z, f);
        }
    }

    @Override // defpackage.tkb
    public final tkb t0() {
        return this.p;
    }

    public abstract void t1(uj2 uj2Var, n29 n29Var);

    @Override // defpackage.syd
    public final boolean u0() {
        return (this.L == null || this.r || !this.o.H()) ? false : true;
    }

    public final void u1(long j, float f, Function1 function1, n29 n29Var) {
        int i = 0;
        wma wmaVar = this.o;
        if (n29Var != null) {
            if (function1 != null) {
                r3a.a("both ways to create layers shouldn't be used together");
            }
            if (this.M != n29Var) {
                this.M = null;
                D1(null, false);
                this.M = n29Var;
            }
            if (this.L == null) {
                ryd a = zma.a(wmaVar);
                sz szVar = this.I;
                if (szVar == null) {
                    sz szVar2 = new sz(6, this, new tdd(this, i));
                    this.I = szVar2;
                    szVar = szVar2;
                }
                tdd tddVar = this.J;
                qyd n = ((xy) a).n(szVar, tddVar, n29Var);
                q29 q29Var = (q29) n;
                q29Var.e(this.c);
                q29Var.d(j);
                this.L = n;
                wmaVar.J = true;
                tddVar.invoke();
            }
        } else {
            if (this.M != null) {
                this.M = null;
                D1(null, false);
            }
            D1(function1, false);
        }
        if (!r6a.b(this.z, j)) {
            ((xy) zma.a(wmaVar)).R(-4.0f);
            this.z = j;
            qyd qydVar = this.L;
            if (qydVar != null) {
                ((q29) qydVar).d(j);
            } else {
                wdd wddVar = this.q;
                if (wddVar != null) {
                    wddVar.l1();
                }
            }
            wmaVar.N(this);
            tkb.J0(this);
            ryd rydVar = wmaVar.n;
            if (rydVar != null) {
                ((xy) rydVar).D(wmaVar);
            }
        }
        this.A = f;
        if (this == ((wdd) wmaVar.F.e)) {
            ((xy) zma.a(wmaVar)).getRectManager().f(wmaVar);
        }
        if (this.k) {
            return;
        }
        r0(z0());
    }

    public final void v1(w0d w0dVar, boolean z, boolean z2) {
        long j;
        qyd qydVar = this.L;
        if (qydVar != null) {
            if (this.s) {
                if (z2) {
                    long d1 = d1();
                    float f = w0dVar.b;
                    float f2 = w0dVar.c;
                    if (w0dVar.d >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        long j2 = this.c;
                        if (f <= ((int) (j2 >> 32)) && w0dVar.e >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 <= ((int) (j2 & 4294967295L))) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (d1 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (d1 & 4294967295L));
                            float f3 = (intBitsToFloat - (w0dVar.d - w0dVar.b)) / 2.0f;
                            if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                f -= f3;
                            } else {
                                float f4 = (-intBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (intBitsToFloat2 - (w0dVar.e - w0dVar.c)) / 2.0f;
                            if (f5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                f2 -= f5;
                            } else {
                                float f6 = (-intBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            j = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                            long j3 = this.c;
                            float f7 = (int) (j3 >> 32);
                            int i = (int) (d1 >> 32);
                            float f8 = (int) (j3 & 4294967295L);
                            int i2 = (int) (d1 & 4294967295L);
                            w0dVar.a(intBitsToFloat3, intBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + intBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + intBitsToFloat4)));
                        }
                    }
                    j = 0;
                    float intBitsToFloat32 = Float.intBitsToFloat((int) (j >> 32));
                    float intBitsToFloat42 = Float.intBitsToFloat((int) (j & 4294967295L));
                    long j32 = this.c;
                    float f72 = (int) (j32 >> 32);
                    int i3 = (int) (d1 >> 32);
                    float f82 = (int) (j32 & 4294967295L);
                    int i22 = (int) (d1 & 4294967295L);
                    w0dVar.a(intBitsToFloat32, intBitsToFloat42, Math.min(Float.intBitsToFloat(i3) + f72, Math.max(f72, Float.intBitsToFloat(i3) + intBitsToFloat32)), Math.min(Float.intBitsToFloat(i22) + f82, Math.max(f82, Float.intBitsToFloat(i22) + intBitsToFloat42)));
                } else if (z) {
                    long j4 = this.c;
                    w0dVar.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                }
                if (w0dVar.b()) {
                    return;
                }
            }
            q29 q29Var = (q29) qydVar;
            float[] b = q29Var.b();
            if (!q29Var.s) {
                if (b == null) {
                    w0dVar.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    w0dVar.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    w0dVar.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    w0dVar.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    xzb.c(b, w0dVar);
                }
            }
        }
        long j5 = this.z;
        float f9 = (int) (j5 >> 32);
        w0dVar.b += f9;
        w0dVar.d += f9;
        float f10 = (int) (j5 & 4294967295L);
        w0dVar.c += f10;
        w0dVar.e += f10;
    }

    @Override // defpackage.dma
    public final long w(long j) {
        long P2 = P(j);
        xy xyVar = (xy) zma.a(this.o);
        xyVar.H();
        return xzb.b(P2, xyVar.d0);
    }

    public final void w1() {
        if (this.L != null) {
            if (this.M != null) {
                this.M = null;
            }
            D1(null, false);
            this.o.U(false);
        }
    }

    @Override // defpackage.tkb
    public final boolean x0() {
        return this.x != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [wtc] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [wtc] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [i1d] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [i1d] */
    public final void x1(l1c l1cVar) {
        wdd wddVar;
        l1c l1cVar2 = this.x;
        if (l1cVar != l1cVar2) {
            this.x = l1cVar;
            wma wmaVar = this.o;
            int i = 0;
            if (l1cVar2 == null || l1cVar.getWidth() != l1cVar2.getWidth() || l1cVar.getHeight() != l1cVar2.getHeight()) {
                int width = l1cVar.getWidth();
                int height = l1cVar.getHeight();
                qyd qydVar = this.L;
                if (qydVar != null) {
                    ((q29) qydVar).e((width << 32) | (height & 4294967295L));
                } else if (wmaVar.I() && (wddVar = this.q) != null) {
                    wddVar.l1();
                }
                i0((height & 4294967295L) | (width << 32));
                if (this.t != null) {
                    E1(false);
                }
                boolean g = xdd.g(4);
                wtc e1 = e1();
                if (g || (e1 = e1.e) != null) {
                    for (wtc g1 = g1(g); g1 != null && (g1.d & 4) != 0; g1 = g1.f) {
                        if ((g1.c & 4) != 0) {
                            bw4 bw4Var = g1;
                            ?? r9 = 0;
                            while (bw4Var != 0) {
                                if (bw4Var instanceof ga5) {
                                    ((ga5) bw4Var).B0();
                                } else if ((bw4Var.c & 4) != 0 && (bw4Var instanceof bw4)) {
                                    wtc wtcVar = bw4Var.p;
                                    int i2 = 0;
                                    bw4Var = bw4Var;
                                    r9 = r9;
                                    while (wtcVar != null) {
                                        if ((wtcVar.c & 4) != 0) {
                                            i2++;
                                            r9 = r9;
                                            if (i2 == 1) {
                                                bw4Var = wtcVar;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new i1d(new wtc[16], 0);
                                                }
                                                if (bw4Var != 0) {
                                                    r9.b(bw4Var);
                                                    bw4Var = 0;
                                                }
                                                r9.b(wtcVar);
                                            }
                                        }
                                        wtcVar = wtcVar.f;
                                        bw4Var = bw4Var;
                                        r9 = r9;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                bw4Var = c6o.X(r9);
                            }
                        }
                        if (g1 == e1) {
                            break;
                        }
                    }
                }
                ryd rydVar = wmaVar.n;
                if (rydVar != null) {
                    ((xy) rydVar).D(wmaVar);
                }
                wmaVar.N(this);
            }
            h0d h0dVar = this.y;
            if ((h0dVar == null || h0dVar.e == 0) && l1cVar.a().isEmpty()) {
                return;
            }
            h0d h0dVar2 = this.y;
            Map a = l1cVar.a();
            if (h0dVar2 != null && h0dVar2.e == a.size()) {
                Object[] objArr = h0dVar2.b;
                int[] iArr = h0dVar2.c;
                long[] jArr = h0dVar2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) a.get((jo) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            wmaVar.G.p.y.f();
            h0d h0dVar3 = this.y;
            if (h0dVar3 == null) {
                h0d h0dVar4 = vjd.a;
                h0dVar3 = new h0d();
                this.y = h0dVar3;
            }
            h0dVar3.a();
            for (Map.Entry entry : l1cVar.a().entrySet()) {
                h0dVar3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override // defpackage.tkb
    public final wma y0() {
        return this.o;
    }

    public final void y1(wtc wtcVar, sdd sddVar, long j, jc9 jc9Var, int i, boolean z, float f) {
        int i2;
        l0d l0dVar = jc9Var.a;
        if (wtcVar == null) {
            k1(sddVar, j, jc9Var, i, z);
            return;
        }
        if (!sddVar.d(wtcVar)) {
            y1(bea.E(wtcVar, sddVar.b()), sddVar, j, jc9Var, i, z, f);
            return;
        }
        if (!sddVar.a(wtcVar)) {
            s1(bea.E(wtcVar, sddVar.b()), sddVar, j, jc9Var, i, z, f, false);
            return;
        }
        vdd vddVar = new vdd(this, wtcVar, sddVar, j, jc9Var, i, z, f);
        a0d a0dVar = jc9Var.b;
        int i3 = jc9Var.c;
        int i4 = l0dVar.b;
        if (i3 != i4 - 1) {
            long c = jc9Var.c();
            int i5 = jc9Var.c;
            int i6 = l0dVar.b;
            int i7 = i6 - 1;
            jc9Var.c = i7;
            jc9Var.d(i6, l0dVar.b);
            jc9Var.c++;
            l0dVar.a(wtcVar);
            a0dVar.a(un0.g(f, z, false));
            vddVar.invoke();
            jc9Var.c = i7;
            long c2 = jc9Var.c();
            if (jc9Var.c + 1 >= l0dVar.b - 1 || xw3.A(c, c2) <= 0) {
                jc9Var.d(jc9Var.c + 1, l0dVar.b);
            } else {
                int i8 = i5 + 1;
                boolean I = xw3.I(c2);
                int i9 = jc9Var.c;
                jc9Var.d(i8, I ? i9 + 2 : i9 + 1);
            }
            jc9Var.c = i5;
            return;
        }
        int i10 = i3 + 1;
        jc9Var.d(i10, i4);
        jc9Var.c++;
        l0dVar.a(wtcVar);
        a0dVar.a(un0.g(f, z, false));
        vddVar.invoke();
        jc9Var.c = i3;
        if (i10 == l0dVar.b - 1 || xw3.I(jc9Var.c())) {
            int i11 = jc9Var.c;
            int i12 = i11 + 1;
            l0dVar.k(i12);
            if (i12 < 0 || i12 >= (i2 = a0dVar.b)) {
                zzl.r("Index must be between 0 and size");
                return;
            }
            long[] jArr = a0dVar.a;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                mh0.h(jArr, jArr, i12, i11 + 2, i2);
            }
            a0dVar.b--;
        }
    }

    @Override // defpackage.dma
    public final void z(float[] fArr) {
        ryd a = zma.a(this.o);
        wdd z1 = z1(o6a.y(this));
        C1(z1, fArr);
        if (a instanceof xy) {
            ((xy) a).x(fArr);
            return;
        }
        long I = z1.I(0L);
        if ((9223372034707292159L & I) != 9205357640488583168L) {
            xzb.g(fArr, Float.intBitsToFloat((int) (I >> 32)), Float.intBitsToFloat((int) (I & 4294967295L)));
        }
    }

    @Override // defpackage.tkb
    public final l1c z0() {
        l1c l1cVar = this.x;
        if (l1cVar != null) {
            return l1cVar;
        }
        a70.r("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.tkb
    public final dma w0() {
        return this;
    }
}
