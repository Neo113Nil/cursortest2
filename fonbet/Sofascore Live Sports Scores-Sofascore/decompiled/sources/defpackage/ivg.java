package defpackage;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ivg extends k95 implements wia, p3h {
    public myd J;
    public p78 K;
    public final h9d L;
    public final jp4 M;
    public final svg N;
    public final dvg O;
    public final ne8 P;
    public final wo3 Q;
    public fvg R;
    public gvg S;
    public qwc T;
    public quj U;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [bw4, ivg] */
    /* JADX WARN: Type inference failed for: r1v2, types: [p78] */
    public ivg(a42 a42Var, p78 p78Var, wzc wzcVar, ewd ewdVar, myd mydVar, jvg jvgVar, boolean z, boolean z2) {
        super(bvg.a, z, wzcVar, ewdVar);
        this.J = mydVar;
        this.K = p78Var;
        h9d h9dVar = new h9d();
        this.L = h9dVar;
        jp4 jp4Var = new jp4(new ol4(new cqa((kx4) bvg.d)));
        this.M = jp4Var;
        myd mydVar2 = this.J;
        ?? r1 = this.K;
        svg svgVar = new svg(jvgVar, mydVar2, r1 == 0 ? jp4Var : r1, ewdVar, z2, h9dVar, this, new evg(this, 0));
        this.N = svgVar;
        dvg dvgVar = new dvg(svgVar, z);
        this.O = dvgVar;
        ne8 ne8Var = new ne8(2, 10, null);
        k1(ne8Var);
        this.P = ne8Var;
        wo3 wo3Var = new wo3(ewdVar, svgVar, z2, a42Var, new evg(this, 1));
        k1(wo3Var);
        this.Q = wo3Var;
        k1(new m9d(dvgVar, h9dVar));
        x32 x32Var = new x32();
        x32Var.o = wo3Var;
        k1(x32Var);
    }

    @Override // defpackage.k95, defpackage.pze
    public final void B(fze fzeVar, gze gzeVar, long j) {
        int i;
        int i2;
        List list = fzeVar.a;
        int size = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (((Boolean) this.r.invoke(new vze(((mze) list.get(i3)).i))).booleanValue()) {
                super.B(fzeVar, gzeVar, j);
                break;
            }
            i3++;
        }
        if (this.u == null) {
            zw8 zw8Var = new zw8(this);
            k1(zw8Var);
            this.u = zw8Var;
        }
        if (this.s) {
            gze gzeVar2 = gze.a;
            rq3 rq3Var = null;
            svg svgVar = this.N;
            if (gzeVar == gzeVar2 && fzeVar.f == 6) {
                qwc qwcVar = this.T;
                if (qwcVar == null) {
                    qwc qwcVar2 = new qwc(svgVar, new dad(ViewConfiguration.get(pco.N(this).getContext()), 5), new sc3(2, this, ivg.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 2), c6o.c0(this).y);
                    this.T = qwcVar2;
                    qwcVar = qwcVar2;
                }
                ku3 Y0 = Y0();
                if (qwcVar.h == null) {
                    qwcVar.h = xw3.L(Y0, null, null, new gjb(qwcVar, rq3Var, 13), 3);
                }
            }
            qwc qwcVar3 = this.T;
            if (qwcVar3 != null && fzeVar.f == 6) {
                int size2 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        if (gzeVar == gze.a && qwcVar3.a) {
                            qwcVar3.n(fzeVar);
                            ccc.a(fzeVar);
                        }
                        if (gzeVar == gze.b && !qwcVar3.a && qwcVar3.n(fzeVar)) {
                            ccc.a(fzeVar);
                        }
                    } else if (((mze) list.get(i4)).b()) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            if (gzeVar == gze.a && ((i2 = fzeVar.f) == 10 || i2 == 11 || i2 == 12)) {
                quj qujVar = this.U;
                if (qujVar == null) {
                    i = 10;
                    quj qujVar2 = new quj(svgVar, new sc3(2, this, ivg.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 3), c6o.c0(this).y);
                    this.U = qujVar2;
                    qujVar = qujVar2;
                } else {
                    i = 10;
                }
                ku3 Y02 = Y0();
                if (qujVar.g == null) {
                    qujVar.g = xw3.L(Y02, null, null, new kuj(qujVar, rq3Var, 2), 3);
                }
            } else {
                i = 10;
            }
            quj qujVar3 = this.U;
            if (qujVar3 != null) {
                int i5 = fzeVar.f;
                if (i5 == i || i5 == 11 || i5 == 12) {
                    int size3 = list.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        if (((mze) list.get(i6)).b()) {
                            return;
                        }
                    }
                    if (gzeVar == gze.a && qujVar3.a) {
                        qujVar3.l(fzeVar);
                        ccc.a(fzeVar);
                    }
                    if (gzeVar == gze.b && !qujVar3.a && qujVar3.l(fzeVar)) {
                        ccc.a(fzeVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.k95
    public final boolean C1() {
        svg svgVar = this.N;
        if (svgVar.a.b()) {
            return true;
        }
        myd mydVar = svgVar.b;
        return mydVar != null ? mydVar.b() : false;
    }

    public final void F1(a42 a42Var, p78 p78Var, wzc wzcVar, ewd ewdVar, myd mydVar, jvg jvgVar, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (this.s != z) {
            this.O.b = z;
            z3 = true;
        } else {
            z3 = false;
        }
        p78 p78Var2 = p78Var == null ? this.M : p78Var;
        svg svgVar = this.N;
        if (!Intrinsics.c(svgVar.a, jvgVar)) {
            svgVar.a = jvgVar;
            z5 = true;
        }
        svgVar.b = mydVar;
        ewd ewdVar2 = svgVar.d;
        if (ewdVar2 != ewdVar) {
            svgVar.d = ewdVar;
            ewdVar2 = ewdVar;
            z5 = true;
        }
        if (svgVar.e != z2) {
            svgVar.e = z2;
        } else {
            z4 = z5;
        }
        svgVar.c = p78Var2;
        svgVar.f = this.L;
        wo3 wo3Var = this.Q;
        wo3Var.o = ewdVar;
        wo3Var.q = z2;
        wo3Var.r = a42Var;
        this.J = mydVar;
        this.K = p78Var;
        vqg vqgVar = bvg.a;
        ewd ewdVar3 = ewd.a;
        if (ewdVar2 != ewdVar3) {
            ewdVar3 = ewd.b;
        }
        E1(vqgVar, z, wzcVar, ewdVar3, z4);
        if (z3) {
            this.R = null;
            this.S = null;
            sea.p(this);
        }
    }

    @Override // defpackage.wtc
    public final boolean Z0() {
        return false;
    }

    @Override // defpackage.wtc
    public final void c1() {
        if (this.n) {
            kx4 kx4Var = c6o.c0(this).y;
            jp4 jp4Var = this.M;
            jp4Var.getClass();
            jp4Var.a = new ol4(new cqa(kx4Var));
        }
        qwc qwcVar = this.T;
        if (qwcVar != null) {
            qwcVar.d = c6o.c0(this).y;
        }
        quj qujVar = this.U;
        if (qujVar != null) {
            qujVar.d = c6o.c0(this).y;
        }
    }

    @Override // defpackage.p3h
    public final void i(b4h b4hVar) {
        if (this.s && (this.R == null || this.S == null)) {
            this.R = new fvg(this, 0);
            this.S = new gvg(this, null);
        }
        fvg fvgVar = this.R;
        if (fvgVar != null) {
            KProperty[] kPropertyArr = y3h.a;
            b4hVar.a(k3h.d, new m9(null, fvgVar));
        }
        gvg gvgVar = this.S;
        if (gvgVar != null) {
            KProperty[] kPropertyArr2 = y3h.a;
            b4hVar.a(k3h.e, gvgVar);
        }
    }

    @Override // defpackage.xv4, defpackage.pze
    public final void l() {
        y0();
        if (this.n) {
            kx4 kx4Var = c6o.c0(this).y;
            jp4 jp4Var = this.M;
            jp4Var.getClass();
            jp4Var.a = new ol4(new cqa(kx4Var));
        }
        qwc qwcVar = this.T;
        if (qwcVar != null) {
            qwcVar.d = c6o.c0(this).y;
        }
        quj qujVar = this.U;
        if (qujVar != null) {
            qujVar.d = c6o.c0(this).y;
        }
    }

    @Override // defpackage.wia
    public final boolean n0(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.k95
    public final Object o1(j95 j95Var, j95 j95Var2) {
        m1d m1dVar = m1d.b;
        svg svgVar = this.N;
        Object f = svgVar.f(m1dVar, new v1f(j95Var, svgVar, (rq3) null, 14), j95Var2);
        return f == lu3.a ? f : Unit.a;
    }

    @Override // defpackage.k95
    public final void u1(s85 s85Var) {
        xw3.L(this.L.c(), null, null, new big(s85Var, this, null, 3), 3);
    }

    @Override // defpackage.wia
    public final boolean w0(KeyEvent keyEvent) {
        long floatToRawIntBits;
        if (!this.s || ((!qia.a(u0a.w(keyEvent), qia.D) && !qia.a(d2a.b(keyEvent.getKeyCode()), qia.C)) || u0a.z(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.N.d == ewd.a;
        wo3 wo3Var = this.Q;
        if (z) {
            int l1 = (int) (wo3Var.l1() & 4294967295L);
            floatToRawIntBits = (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (4294967295L & Float.floatToRawIntBits(qia.a(d2a.b(keyEvent.getKeyCode()), qia.C) ? l1 : -l1));
        } else {
            int l12 = (int) (wo3Var.l1() >> 32);
            floatToRawIntBits = (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L) | (Float.floatToRawIntBits(qia.a(d2a.b(keyEvent.getKeyCode()), qia.C) ? l12 : -l12) << 32);
        }
        xw3.L(Y0(), null, null, new gvg(this, floatToRawIntBits, null, 0), 3);
        return true;
    }

    @Override // defpackage.k95
    public final void t1(long j) {
    }
}
