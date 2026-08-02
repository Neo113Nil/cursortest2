package defpackage;

import android.content.ClipData;
import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lcj {
    public final jwj a;
    public final cej b;
    public kx4 c;
    public boolean d;
    public final kkj e;
    public final ku3 f;
    public final eje g;
    public iy2 h;
    public boolean i;
    public z69 j;
    public Function0 l;
    public w9j m;
    public final e1d r;
    public final e1d s;
    public final e1d t;
    public yih u;
    public int v;
    public l6f w;
    public final ay4 x;
    public final fjg y;
    public final e1d k = e.f(Boolean.TRUE);
    public final e1d n = e.f(new dnd(9205357640488583168L));
    public final e1d o = e.f(new dnd(9205357640488583168L));
    public final e1d p = e.f(null);
    public final e1d q = e.f(acj.a);

    public lcj(jwj jwjVar, cej cejVar, kx4 kx4Var, boolean z, boolean z2, kkj kkjVar, ku3 ku3Var, eje ejeVar, iy2 iy2Var) {
        this.a = jwjVar;
        this.b = cejVar;
        this.c = kx4Var;
        this.d = z2;
        this.e = kkjVar;
        this.f = ku3Var;
        this.g = ejeVar;
        this.h = iy2Var;
        this.i = z;
        Boolean bool = Boolean.FALSE;
        this.r = e.f(bool);
        this.s = e.f(gfj.a);
        this.t = e.f(bool);
        this.v = -1;
        this.x = goh.b(new mo1(this, 3));
        this.y = new fjg(this.h);
    }

    public static final void f(esf esfVar, esf esfVar2, lcj lcjVar) {
        if ((esfVar.a & 9223372034707292159L) != 9205357640488583168L) {
            esfVar.a = 9205357640488583168L;
            esfVar2.a = 9205357640488583168L;
            lcjVar.b();
        }
    }

    public static final void h(esf esfVar, esf esfVar2, lcj lcjVar) {
        if ((esfVar.a & 9223372034707292159L) != 9205357640488583168L) {
            lcjVar.b();
            esfVar.a = 9205357640488583168L;
            esfVar2.a = 0L;
            lcjVar.v = -1;
        }
    }

    public final void A(k69 k69Var, long j) {
        ((eoh) this.p).setValue(k69Var);
        ((eoh) this.o).setValue(new dnd(j));
    }

    public final long B(m9j m9jVar, int i, int i2, boolean z, ilg ilgVar, boolean z2, boolean z3, a79 a79Var) {
        long g;
        z69 z69Var;
        long j = m9jVar.d;
        pej pejVar = new pej(j);
        if (z3 || (!z2 && pej.d(j))) {
            pejVar = null;
        }
        aej c = this.b.c();
        if (c == null) {
            g = pej.b;
        } else if (pejVar == null && Intrinsics.c(ilgVar, k03.g)) {
            g = t6a.g(i, i2);
        } else {
            yih m = oea.m(c, i, i2, this.v, pejVar != null ? pejVar.a : pej.b, pejVar == null, z);
            if (pejVar == null || m.o(this.u)) {
                w2h a = ilgVar.a(m);
                g = t6a.g(a.a.b, a.b.b);
                this.u = m;
                this.v = z ? i : i2;
            } else {
                g = pejVar.a;
            }
        }
        if (a79Var != null && ((pej.g(g) != pej.g(j) || pej.f(g) != pej.f(j)) && (z69Var = this.j) != null)) {
            ((kie) z69Var).a(a79Var.a);
        }
        return g;
    }

    public final oqf a(aej aejVar, m9j m9jVar) {
        if (!pej.d(m9jVar.d)) {
            return oqf.e;
        }
        oqf c = aejVar.c((int) (m9jVar.d >> 32));
        float floor = (float) Math.floor(this.c.H0(2.0f));
        if (floor < 1.0f) {
            floor = 1.0f;
        }
        float f = aejVar.a.h == ema.a ? (floor / 2.0f) + c.a : c.c - (floor / 2.0f);
        float f2 = floor / 2.0f;
        float f3 = ((int) (aejVar.c >> 32)) - f2;
        if (f > f3) {
            f = f3;
        }
        if (f < f2) {
            f = f2;
        }
        float floor2 = ((int) floor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
        return new oqf(floor2 - f2, c.b, floor2 + f2, c.d);
    }

    public final void b() {
        ((eoh) this.p).setValue(null);
        ((eoh) this.o).setValue(new dnd(9205357640488583168L));
        ((eoh) this.n).setValue(new dnd(9205357640488583168L));
    }

    public final Unit c(boolean z, hoi hoiVar) {
        q80 q80Var;
        jwj jwjVar = this.a;
        if (pej.d(jwjVar.d().d)) {
            q80Var = null;
        } else {
            m9j d = jwjVar.d();
            q80Var = new q80(d.c.subSequence(pej.g(d.d), pej.f(d.d)).toString());
            if (z) {
                jwjVar.a();
            }
        }
        if (q80Var == null) {
            return Unit.a;
        }
        Unit a = ((fy) this.h).a(oyn.Q(q80Var));
        return a == lu3.a ? a : Unit.a;
    }

    public final Unit d(hoi hoiVar) {
        q80 q80Var;
        jwj jwjVar = this.a;
        if (pej.d(jwjVar.d().d) || !m()) {
            q80Var = null;
        } else {
            m9j d = jwjVar.d();
            q80Var = new q80(d.c.subSequence(pej.g(d.d), pej.f(d.d)).toString());
            jwjVar.c();
        }
        if (q80Var == null) {
            return Unit.a;
        }
        Unit a = ((fy) this.h).a(oyn.Q(q80Var));
        return a == lu3.a ? a : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(qze qzeVar, sq3 sq3Var) {
        dcj dcjVar;
        int i;
        esf esfVar;
        Throwable th;
        esf esfVar2;
        if (sq3Var instanceof dcj) {
            dcjVar = (dcj) sq3Var;
            int i2 = dcjVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dcjVar.v = i2 - Integer.MIN_VALUE;
                dcj dcjVar2 = dcjVar;
                Object obj = dcjVar2.t;
                lu3 lu3Var = lu3.a;
                i = dcjVar2.v;
                if (i != 0) {
                    y6a.M(obj);
                    esf esfVar3 = new esf();
                    esfVar3.a = 9205357640488583168L;
                    esf esfVar4 = new esf();
                    esfVar4.a = 9205357640488583168L;
                    try {
                        vsc vscVar = new vsc(28, esfVar3, this, esfVar4);
                        zbj zbjVar = new zbj(esfVar3, esfVar4, this, 1);
                        zbj zbjVar2 = new zbj(esfVar3, esfVar4, this, 2);
                        mfh mfhVar = new mfh(12, esfVar4, this, esfVar3);
                        dcjVar2.r = esfVar3;
                        dcjVar2.s = esfVar4;
                        dcjVar2.v = 1;
                        if (e95.e(qzeVar, vscVar, zbjVar, zbjVar2, mfhVar, dcjVar2) == lu3Var) {
                            return lu3Var;
                        }
                        esfVar = esfVar3;
                        esfVar2 = esfVar4;
                    } catch (Throwable th2) {
                        esfVar = esfVar3;
                        th = th2;
                        esfVar2 = esfVar4;
                        f(esfVar, esfVar2, this);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    esfVar2 = dcjVar2.s;
                    esfVar = dcjVar2.r;
                    try {
                        y6a.M(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        f(esfVar, esfVar2, this);
                        throw th;
                    }
                }
                f(esfVar, esfVar2, this);
                return Unit.a;
            }
        }
        dcjVar = new dcj(this, sq3Var);
        dcj dcjVar22 = dcjVar;
        Object obj2 = dcjVar22.t;
        lu3 lu3Var2 = lu3.a;
        i = dcjVar22.v;
        if (i != 0) {
        }
        f(esfVar, esfVar2, this);
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(qze qzeVar, boolean z, sq3 sq3Var) {
        ecj ecjVar;
        int i;
        esf esfVar;
        k69 k69Var;
        esf esfVar2;
        esf esfVar3;
        esf esfVar4;
        b05 b05Var;
        zbj zbjVar;
        zbj zbjVar2;
        if (sq3Var instanceof ecj) {
            ecjVar = (ecj) sq3Var;
            int i2 = ecjVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ecjVar.w = i2 - Integer.MIN_VALUE;
                ecj ecjVar2 = ecjVar;
                Object obj = ecjVar2.u;
                lu3 lu3Var = lu3.a;
                i = ecjVar2.w;
                if (i != 0) {
                    y6a.M(obj);
                    esf esfVar5 = new esf();
                    esfVar5.a = 9205357640488583168L;
                    esf esfVar6 = new esf();
                    esfVar6.a = 0L;
                    k69 k69Var2 = z ? k69.b : k69.c;
                    try {
                        try {
                            b05Var = new b05(esfVar5, this, z, k69Var2, esfVar6, 7);
                            k69Var2 = k69Var2;
                            zbjVar = new zbj(esfVar5, this, esfVar6, 3);
                            zbjVar2 = new zbj(esfVar5, this, esfVar6, 0);
                            esfVar4 = esfVar5;
                        } catch (Throwable th) {
                            th = th;
                            esfVar = esfVar5;
                            k69Var = k69Var2;
                            esfVar2 = esfVar6;
                            esfVar3 = esfVar2;
                            esfVar4 = esfVar;
                            if (l() == k69Var) {
                            }
                            throw th;
                        }
                        try {
                            f70 f70Var = new f70(esfVar6, this, k69Var2, esfVar4, z);
                            esfVar2 = esfVar6;
                            k69Var = k69Var2;
                            esfVar = esfVar4;
                            try {
                                ecjVar2.r = esfVar;
                                ecjVar2.s = esfVar2;
                                ecjVar2.t = k69Var;
                                ecjVar2.w = 1;
                                if (e95.e(qzeVar, b05Var, zbjVar, zbjVar2, f70Var, ecjVar2) == lu3Var) {
                                    return lu3Var;
                                }
                                esfVar3 = esfVar2;
                                esfVar4 = esfVar;
                            } catch (Throwable th2) {
                                th = th2;
                                esfVar3 = esfVar2;
                                esfVar4 = esfVar;
                                if (l() == k69Var) {
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            k69Var = k69Var2;
                            esfVar3 = esfVar6;
                            if (l() == k69Var) {
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        esfVar = esfVar5;
                        k69Var = k69Var2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k69Var = ecjVar2.t;
                    esfVar3 = ecjVar2.s;
                    esfVar4 = ecjVar2.r;
                    try {
                        y6a.M(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        if (l() == k69Var) {
                            h(esfVar4, esfVar3, this);
                        }
                        throw th;
                    }
                }
                if (l() == k69Var) {
                    h(esfVar4, esfVar3, this);
                }
                return Unit.a;
            }
        }
        ecjVar = new ecj(this, sq3Var);
        ecj ecjVar22 = ecjVar;
        Object obj2 = ecjVar22.u;
        lu3 lu3Var2 = lu3.a;
        i = ecjVar22.w;
        if (i != 0) {
        }
        if (l() == k69Var) {
        }
        return Unit.a;
    }

    public final Object i(qze qzeVar, hoi hoiVar) {
        Object k1 = ((ooi) qzeVar).k1(new l00(this, null, 4), hoiVar);
        return k1 == lu3.a ? k1 : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if ((r0 != null ? defpackage.pea.q(r5, defpackage.pea.H(r0)) : false) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final iaj j(boolean z) {
        m9j d = this.a.d();
        boolean booleanValue = ((Boolean) ((eoh) this.r).getValue()).booleanValue();
        boolean z2 = ((acj) ((eoh) this.q).getValue()) == acj.a;
        k69 l = l();
        if (booleanValue && z2 && pej.d(d.d) && d.f == null && d.c.length() > 0) {
            if (l != k69.a) {
                nnh w = bea.w();
                Function1 e = w != null ? w.e() : null;
                nnh C = bea.C(w);
                try {
                    long c = k().c();
                    bea.K(w, C, e);
                    dma q = q();
                } catch (Throwable th) {
                    bea.K(w, C, e);
                    throw th;
                }
            }
            return new iaj(true, z ? k().c() : 9205357640488583168L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d1g.a, false);
        }
        return iaj.f;
    }

    public final oqf k() {
        aej c = this.b.c();
        return c == null ? oqf.e : a(c, this.a.d());
    }

    public final k69 l() {
        return (k69) ((eoh) this.p).getValue();
    }

    public final boolean m() {
        return this.i;
    }

    public final long n() {
        e1d e1dVar = this.o;
        if ((((dnd) ((eoh) e1dVar).getValue()).a & 9223372034707292159L) == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        e1d e1dVar2 = this.n;
        if ((((dnd) ((eoh) e1dVar2).getValue()).a & 9223372034707292159L) == 9205357640488583168L) {
            return r4a.v(this.b, ((dnd) ((eoh) e1dVar).getValue()).a);
        }
        long j = ((dnd) ((eoh) e1dVar).getValue()).a;
        long j2 = ((dnd) ((eoh) e1dVar2).getValue()).a;
        dma q = q();
        return dnd.i(j, dnd.h(j2, q != null ? q.w(0L) : 9205357640488583168L));
    }

    public final long o(boolean z) {
        long j;
        aej c = this.b.c();
        if (c == null) {
            return 0L;
        }
        long j2 = this.a.d().d;
        if (z) {
            int i = pej.c;
            j = j2 >> 32;
        } else {
            int i2 = pej.c;
            j = 4294967295L & j2;
        }
        return y6a.D(c, (int) j, z, pej.h(j2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if ((r1 != null ? defpackage.pea.q(r6, defpackage.pea.H(r1)) : false) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final iaj p(boolean z, boolean z2) {
        k69 k69Var = z ? k69.b : k69.c;
        aej c = this.b.c();
        if (c == null) {
            return iaj.f;
        }
        jwj jwjVar = this.a;
        long j = jwjVar.d().d;
        if (pej.d(j)) {
            return iaj.f;
        }
        long o = o(z);
        if (((acj) ((eoh) this.q).getValue()) == acj.a) {
            if (l() != k69Var) {
                dma q = q();
            }
            if (jwjVar.d().f != null) {
                return iaj.f;
            }
            d1g a = c.a(z ? (int) (j >> 32) : Math.max(((int) (j & 4294967295L)) - 1, 0));
            boolean h = pej.h(j);
            if (z2) {
                dma q2 = q();
                if (q2 != null) {
                    o = r4a.t(o, pea.H(q2));
                }
            } else {
                o = 9205357640488583168L;
            }
            return new iaj(true, o, l4a.u(c, (int) (z ? j >> 32 : j & 4294967295L)), a, h);
        }
        return iaj.f;
    }

    public final dma q() {
        dma e = this.b.e();
        if (e == null || !e.f()) {
            return null;
        }
        return e;
    }

    public final void r() {
        eje ejeVar = this.g;
        if (ejeVar == null) {
            return;
        }
        jwj jwjVar = this.a;
        CharSequence charSequence = jwjVar.d().c;
        long j = jwjVar.d().d;
        if (charSequence.length() <= 0 || pej.d(j)) {
            return;
        }
        xw3.L(this.f, null, nu3.d, new h2(ejeVar, charSequence, j, this, null, 7), 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (t(r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        if (t(r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(sq3 sq3Var) {
        hcj hcjVar;
        int i;
        if (sq3Var instanceof hcj) {
            hcjVar = (hcj) sq3Var;
            int i2 = hcjVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hcjVar.t = i2 - Integer.MIN_VALUE;
                Object obj = hcjVar.r;
                Object obj2 = lu3.a;
                i = hcjVar.t;
                if (i == 0) {
                    if (i == 1) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    if (i == 2) {
                        y6a.M(obj);
                        gy2 gy2Var = (gy2) obj;
                        if (gy2Var != null) {
                            gy2Var.a.getDescription();
                            throw null;
                        }
                        hcjVar.t = 3;
                    } else {
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    return Unit.a;
                }
                y6a.M(obj);
                w9j w9jVar = this.m;
                if (w9jVar != null) {
                    w9jVar.invoke();
                }
                hcjVar.t = 1;
            }
        }
        hcjVar = new hcj(this, sq3Var);
        Object obj3 = hcjVar.r;
        Object obj22 = lu3.a;
        i = hcjVar.t;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0053, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(sq3 sq3Var) {
        icj icjVar;
        int i;
        gy2 gy2Var;
        CharSequence text;
        if (sq3Var instanceof icj) {
            icjVar = (icj) sq3Var;
            int i2 = icjVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                icjVar.t = i2 - Integer.MIN_VALUE;
                Object obj = icjVar.r;
                lu3 lu3Var = lu3.a;
                i = icjVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    iy2 iy2Var = this.h;
                    icjVar.t = 1;
                    ClipData primaryClip = ((fy) iy2Var).a.a().getPrimaryClip();
                    obj = primaryClip != null ? new gy2(primaryClip) : null;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        String str = (String) obj;
                        if (str != null) {
                            haj hajVar = haj.a;
                            jwj.h(this.a, str, false, 10);
                            return Unit.a;
                        }
                        return Unit.a;
                    }
                    y6a.M(obj);
                }
                gy2Var = (gy2) obj;
                if (gy2Var != null) {
                    icjVar.t = 2;
                    ClipData.Item itemAt = gy2Var.a.getItemAt(0);
                    obj = (itemAt == null || (text = itemAt.getText()) == null) ? null : text.toString();
                }
                return Unit.a;
            }
        }
        icjVar = new icj(this, sq3Var);
        Object obj2 = icjVar.r;
        lu3 lu3Var2 = lu3.a;
        i = icjVar.t;
        if (i != 0) {
        }
        gy2Var = (gy2) obj2;
        if (gy2Var != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(long j) {
        int g;
        boolean z;
        j3h j3hVar;
        int i;
        long g2;
        long j2;
        j3h j3hVar2;
        hwj hwjVar;
        aej c = this.b.c();
        if (c == null || (g = c.b.g(j)) == -1) {
            return false;
        }
        jwj jwjVar = this.a;
        ay4 ay4Var = jwjVar.d;
        e1d e1dVar = jwjVar.e;
        e7a e7aVar = (ay4Var == null || (hwjVar = (hwj) ay4Var.getValue()) == null) ? null : hwjVar.b;
        long a = e7aVar != null ? e7aVar.a(g, false) : t6a.g(g, g);
        long f = jwjVar.f(a);
        int ordinal = ((pej.d(a) && pej.d(f)) ? a1a.a : (pej.d(a) || pej.d(f)) ? (!pej.d(a) || pej.d(f)) ? a1a.d : a1a.b : a1a.c).ordinal();
        if (ordinal == 0) {
            z = false;
        } else {
            if (ordinal == 1) {
                z = false;
                oqf c2 = c.c((int) (f >> 32));
                oqf c3 = c.c((int) (f & 4294967295L));
                float v = t6a.v(j, c2);
                float v2 = t6a.v(j, c3);
                if (v != v2 && v < v2) {
                    l2l l2lVar = l2l.a;
                    j3hVar2 = new j3h(l2lVar, l2lVar);
                } else {
                    l2l l2lVar2 = l2l.b;
                    j3hVar2 = new j3h(l2lVar2, l2lVar2);
                }
                j3hVar = j3hVar2;
                i = (int) (a >> 32);
                g2 = t6a.g(i, i);
                if (!pej.c(g2, jwjVar.a.c().d)) {
                }
                jwjVar.k(g2);
                if (j3hVar != null) {
                }
                return true;
            }
            z = false;
            if (ordinal == 2) {
                oqf c4 = c.c((int) (f >> 32));
                oqf c5 = c.c((int) (f & 4294967295L));
                float v3 = t6a.v(j, c4);
                float v4 = t6a.v(j, c5);
                if (v3 == v4 || v3 >= v4) {
                    j2 = a & 4294967295L;
                    i = (int) j2;
                    j3hVar = null;
                    g2 = t6a.g(i, i);
                    if (!pej.c(g2, jwjVar.a.c().d) && (j3hVar == null || j3hVar.equals((j3h) ((eoh) e1dVar).getValue()))) {
                        return z;
                    }
                    jwjVar.k(g2);
                    if (j3hVar != null) {
                        ((eoh) e1dVar).setValue(j3hVar);
                    }
                    return true;
                }
            } else if (ordinal != 3) {
                zzl.b();
                return false;
            }
        }
        j2 = a >> 32;
        i = (int) j2;
        j3hVar = null;
        g2 = t6a.g(i, i);
        if (!pej.c(g2, jwjVar.a.c().d)) {
        }
        jwjVar.k(g2);
        if (j3hVar != null) {
        }
        return true;
    }

    public final void v(boolean z) {
        ((eoh) this.k).setValue(Boolean.valueOf(z));
    }

    public final void w(boolean z) {
        ((eoh) this.r).setValue(Boolean.valueOf(z));
    }

    public final void x(gfj gfjVar) {
        ((eoh) this.s).setValue(gfjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(sq3 sq3Var) {
        kcj kcjVar;
        int i;
        kkj kkjVar;
        e1d e1dVar;
        u8j u8jVar;
        g9i g9iVar;
        try {
            if (sq3Var instanceof kcj) {
                kcjVar = (kcj) sq3Var;
                int i2 = kcjVar.t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kcjVar.t = i2 - Integer.MIN_VALUE;
                    Object obj = kcjVar.r;
                    lu3 lu3Var = lu3.a;
                    i = kcjVar.t;
                    kkjVar = this.e;
                    e1dVar = this.s;
                    CancellationException cancellationException = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    if (i != 0) {
                        y6a.M(obj);
                        m1f m1fVar = new m1f(this, objArr == true ? 1 : 0, 28);
                        kcjVar.t = 1;
                        obj = s9a.r(m1fVar, kcjVar);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            return Unit.a;
        } finally {
            w(false);
            if (((gfj) ((eoh) e1dVar).getValue()) != gfj.a && (u8jVar = kkjVar.a) != null && (g9iVar = u8jVar.u) != null) {
                g9iVar.e(null);
                u8jVar.u = null;
            }
        }
        kcjVar = new kcj(this, sq3Var);
        Object obj2 = kcjVar.r;
        lu3 lu3Var2 = lu3.a;
        i = kcjVar.t;
        kkjVar = this.e;
        e1dVar = this.s;
        CancellationException cancellationException2 = null;
        Object[] objArr3 = 0;
        Object[] objArr22 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r0.hasMimeType("text/*") == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Unit z() {
        fjg fjgVar = this.y;
        fy fyVar = (fy) ((iy2) fjgVar.b);
        boolean z = fyVar.a.a().hasPrimaryClip() && (r0 = fyVar.a.a().getPrimaryClipDescription()) != null;
        fjgVar.a = z;
        Unit unit = Unit.a;
        lu3 lu3Var = lu3.a;
        return unit;
    }
}
