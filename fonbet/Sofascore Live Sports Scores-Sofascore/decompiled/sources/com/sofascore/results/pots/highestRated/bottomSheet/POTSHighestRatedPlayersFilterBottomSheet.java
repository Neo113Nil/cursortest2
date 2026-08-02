package com.sofascore.results.pots.highestRated.bottomSheet;

import android.os.Bundle;
import androidx.compose.runtime.e;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a99;
import defpackage.aee;
import defpackage.av8;
import defpackage.b1e;
import defpackage.bba;
import defpackage.bf3;
import defpackage.bfc;
import defpackage.bkh;
import defpackage.c1e;
import defpackage.cga;
import defpackage.d1e;
import defpackage.d2a;
import defpackage.dh3;
import defpackage.duf;
import defpackage.e1d;
import defpackage.e1e;
import defpackage.eqf;
import defpackage.f50;
import defpackage.fc6;
import defpackage.ff3;
import defpackage.fl8;
import defpackage.fqj;
import defpackage.fuf;
import defpackage.fw6;
import defpackage.gqh;
import defpackage.gv9;
import defpackage.hf3;
import defpackage.hkg;
import defpackage.if3;
import defpackage.j9d;
import defpackage.jaa;
import defpackage.jmc;
import defpackage.joa;
import defpackage.k13;
import defpackage.k8g;
import defpackage.kg0;
import defpackage.kqh;
import defpackage.kv1;
import defpackage.kw2;
import defpackage.l6g;
import defpackage.l8g;
import defpackage.l98;
import defpackage.llc;
import defpackage.lz;
import defpackage.m28;
import defpackage.mha;
import defpackage.mp9;
import defpackage.n9e;
import defpackage.nf3;
import defpackage.nq8;
import defpackage.oea;
import defpackage.of3;
import defpackage.oqf;
import defpackage.ord;
import defpackage.otk;
import defpackage.oyn;
import defpackage.q1e;
import defpackage.q9k;
import defpackage.r0e;
import defpackage.ry;
import defpackage.t1d;
import defpackage.t23;
import defpackage.tc3;
import defpackage.tol;
import defpackage.u23;
import defpackage.u28;
import defpackage.uj8;
import defpackage.un0;
import defpackage.utc;
import defpackage.uxf;
import defpackage.v1e;
import defpackage.vxd;
import defpackage.waa;
import defpackage.wd8;
import defpackage.ww9;
import defpackage.wya;
import defpackage.x0e;
import defpackage.xtc;
import defpackage.xxb;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.zg3;
import defpackage.zt7;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002²\u0006\u0010\u0010\b\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/sofascore/results/pots/highestRated/bottomSheet/POTSHighestRatedPlayersFilterBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "Lvnb;", "Lr0e;", "state", "Loqf;", "rootBounds", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class POTSHighestRatedPlayersFilterBottomSheet extends Hilt_POTSHighestRatedPlayersFilterBottomSheet {
    public final otk C;
    public final otk D;

    public POTSHighestRatedPlayersFilterBottomSheet() {
        fuf fufVar = duf.a;
        this.C = new otk(fufVar.getOrCreateKotlinClass(v1e.class), new x0e(this, 0), new x0e(this, 2), new x0e(this, 1));
        joa a = ypa.a(ysa.c, new jmc(new x0e(this, 3), 20));
        this.D = new otk(fufVar.getOrCreateKotlinClass(b1e.class), new llc(a, 21), new wya(20, this, a), new llc(a, 22));
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getF() {
        return new tc3(310838855, new t1d(this, 6), true);
    }

    public final void L(Function0 function0, Function0 function02, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-183551476);
        if ((i & 6) == 0) {
            i2 = i | (av8Var.i(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function02) ? 32 : 16;
        }
        int i3 = i2;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc b0 = l98.b0(n9e.q(d2a.E(bkh.d(utcVar, 1.0f), 8.0f, null, false, 0L, 30), lz.D(R.color.surface_P, av8Var), oyn.e), 16.0f);
            l8g a = k8g.a(ww9.c, uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            mha.h(oea.v(R.string.close, av8Var), function0, null, gqh.a, null, false, false, false, 0L, 0, 0, av8Var, ((i3 << 3) & 112) | 3072, 0, 2036);
            mha.h(fc6.f(16.0f, R.string.apply, av8Var, av8Var, utcVar), function02, null, kqh.a, null, false, false, false, 0L, 0, 0, av8Var, (i3 & 112) | 3072, 0, 2036);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(this, function0, function02, i, 23);
        }
    }

    public final void M(r0e r0eVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var;
        xtc xtcVar2;
        a99 a99Var;
        utc utcVar;
        int i2;
        boolean z;
        int i3;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-386609434);
        int i4 = i | (av8Var2.g(r0eVar) ? 4 : 2) | (av8Var2.i(function1) ? 32 : 16) | 384 | (av8Var2.i(this) ? a.o : 1024);
        if (av8Var2.T(i4 & 1, (i4 & 1171) != 1170)) {
            wd8 wd8Var = (wd8) av8Var2.k(dh3.i);
            Object O = av8Var2.O();
            a99 a99Var2 = nf3.a;
            if (O == a99Var2) {
                O = e.f(null);
                av8Var2.n0(O);
            }
            e1d e1dVar = (e1d) O;
            j9d L = jaa.L(av8Var2);
            utc utcVar2 = utc.a;
            xtc z2 = lz.J(utcVar2, L, null).z(bkh.c);
            boolean i5 = av8Var2.i(wd8Var);
            Object O2 = av8Var2.O();
            if (i5 || O2 == a99Var2) {
                O2 = new kw2(wd8Var, 1);
                av8Var2.n0(O2);
            }
            xtc y = tol.y(z2, false, false, false, 0L, null, (Function0) O2, av8Var2, 27);
            Object O3 = av8Var2.O();
            int i6 = 21;
            if (O3 == a99Var2) {
                O3 = new fw6(i6, e1dVar);
                av8Var2.n0(O3);
            }
            xtc A = un0.A(y, (Function1) O3);
            kg0 kg0Var = ww9.h;
            kv1 kv1Var = uxf.o;
            u23 a = t23.a(kg0Var, kv1Var, av8Var2, 6);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, A);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            xtc d0 = l98.d0(l98.f0(hkg.u0(utcVar2, hkg.o0(av8Var2), false, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 40.0f, 5), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var2, 0);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            av8Var2.d0(-798990458);
            m28 m28Var = r0eVar.a;
            c1e c1eVar = (c1e) m28Var.b;
            bfc bfcVar = c1eVar != null ? new bfc(c1eVar.b, c1eVar, c1eVar.a, new tc3(83136374, new bba(c1eVar, 21), true)) : null;
            gv9<c1e> gv9Var = m28Var.c;
            ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
            for (c1e c1eVar2 : gv9Var) {
                arrayList.add(new bfc(c1eVar2.b, c1eVar2, c1eVar2.a, new tc3(83136374, new bba(c1eVar2, 21), true)));
            }
            gv9 W = l6g.W(arrayList);
            q9k q9kVar = m28Var.d;
            av8Var2.d0(-901886153);
            String a3 = q9kVar.a(av8Var2);
            av8Var2.s(false);
            boolean z3 = m28Var.e;
            oqf oqfVar = (oqf) e1dVar.getValue();
            int i7 = i4 & 112;
            boolean z4 = i7 == 32;
            Object O4 = av8Var2.O();
            if (z4 || O4 == a99Var2) {
                O4 = new uj8(25, function1);
                av8Var2.n0(O4);
            }
            cga.m(bfcVar, W, (Function1) O4, null, null, a3, null, z3, false, false, false, 0L, null, 0, 0, 0, 0, oqfVar, true, av8Var2, 0, 2096600);
            nq8.h(av8Var2, bkh.e(utcVar2, 24.0f));
            Unit unit = Unit.a;
            av8Var2.s(false);
            av8Var2.d0(-798963770);
            m28 m28Var2 = r0eVar.b;
            d1e d1eVar = (d1e) m28Var2.b;
            int i8 = 20;
            bfc bfcVar2 = d1eVar != null ? new bfc(String.valueOf(d1eVar.a), d1eVar, d1eVar.b, new tc3(-1927468631, new bba(d1eVar, i8), true)) : null;
            gv9 gv9Var2 = m28Var2.c;
            ArrayList arrayList2 = new ArrayList(k13.r(gv9Var2, 10));
            Iterator it = gv9Var2.iterator();
            while (it.hasNext()) {
                d1e d1eVar2 = (d1e) it.next();
                arrayList2.add(new bfc(String.valueOf(d1eVar2.a), d1eVar2, d1eVar2.b, new tc3(-1927468631, new bba(d1eVar2, i8), true)));
                bfcVar2 = bfcVar2;
                it = it;
                i8 = 20;
            }
            bfc bfcVar3 = bfcVar2;
            gv9 W2 = l6g.W(arrayList2);
            q9k q9kVar2 = m28Var2.d;
            av8Var2.d0(-338619282);
            String a4 = q9kVar2.a(av8Var2);
            av8Var2.s(false);
            boolean z5 = m28Var2.e;
            oqf oqfVar2 = (oqf) e1dVar.getValue();
            boolean z6 = i7 == 32;
            Object O5 = av8Var2.O();
            if (z6 || O5 == a99Var2) {
                O5 = new uj8(26, function1);
                av8Var2.n0(O5);
            }
            Function1 function12 = (Function1) O5;
            boolean z7 = i7 == 32;
            Object O6 = av8Var2.O();
            if (z7 || O6 == a99Var2) {
                O6 = new uj8(27, function1);
                av8Var2.n0(O6);
            }
            cga.m(bfcVar3, W2, function12, null, null, a4, (Function1) O6, z5, false, false, false, 0L, null, 0, 0, 0, 3, oqfVar2, true, av8Var2, 0, 2096472);
            av8Var = av8Var2;
            nq8.h(av8Var, bkh.e(utcVar2, 24.0f));
            Unit unit2 = Unit.a;
            av8Var.s(false);
            xtc d = bkh.d(utcVar2, 1.0f);
            u28 u28Var = r0eVar.c;
            boolean z8 = i7 == 32;
            Object O7 = av8Var.O();
            if (z8 || O7 == a99Var2) {
                O7 = new uj8(28, function1);
                av8Var.n0(O7);
            }
            tol.i(u28Var, (Function1) O7, d, av8Var, 384);
            xtc f = vxd.f(utcVar2, 8.0f, av8Var, utcVar2, 1.0f);
            u28 u28Var2 = r0eVar.d;
            boolean z9 = i7 == 32;
            Object O8 = av8Var.O();
            if (z9 || O8 == a99Var2) {
                O8 = new uj8(29, function1);
                av8Var.n0(O8);
            }
            tol.i(u28Var2, (Function1) O8, f, av8Var, 384);
            nq8.h(av8Var, bkh.e(utcVar2, 8.0f));
            av8Var.s(true);
            boolean i9 = av8Var.i(this);
            Object O9 = av8Var.O();
            if (i9 || O9 == a99Var2) {
                a99Var = a99Var2;
                utcVar = utcVar2;
                i2 = i4;
                z = true;
                i3 = 20;
                fl8 fl8Var = new fl8(0, this, POTSHighestRatedPlayersFilterBottomSheet.class, "dismiss", "dismiss()V", 0, 9);
                av8Var.n0(fl8Var);
                O9 = fl8Var;
            } else {
                i2 = i4;
                z = true;
                utcVar = utcVar2;
                a99Var = a99Var2;
                i3 = 20;
            }
            Function0 function0 = (Function0) ((KFunction) O9);
            boolean i10 = av8Var.i(this);
            Object O10 = av8Var.O();
            if (i10 || O10 == a99Var) {
                O10 = new xxb(this, i3);
                av8Var.n0(O10);
            }
            L(function0, (Function0) O10, av8Var, (i2 >> 3) & 896);
            av8Var.s(z);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mp9(i, 7, this, r0eVar, function1, xtcVar2);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q1e q1eVar = (q1e) ((v1e) this.C.getValue()).l().a();
        if (q1eVar != null) {
            e1e e1eVar = q1eVar.c;
            b1e b1eVar = (b1e) this.D.getValue();
            b1eVar.o(new ord(4, b1eVar, e1eVar));
        }
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "FilterModal";
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog, com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x */
    public final boolean getW() {
        return false;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.filter_by);
        string.getClass();
        return string;
    }
}
