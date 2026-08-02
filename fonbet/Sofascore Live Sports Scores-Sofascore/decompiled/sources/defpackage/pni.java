package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class pni implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ xtc d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ pni(gv9 gv9Var, long j, gv9 gv9Var2, float f, xtc xtcVar, int i) {
        this.e = gv9Var;
        this.b = j;
        this.f = gv9Var2;
        this.c = f;
        this.d = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                uah uahVar = (uah) obj4;
                tc3 tc3Var = (tc3) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc L = u0a.L(this.d, uahVar, u0a.M(this.b, (wo4) av8Var.k(cj5.a), this.c, av8Var), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    Object O = av8Var.O();
                    a99 a99Var = nf3.a;
                    if (O == a99Var) {
                        O = new rfi(2);
                        av8Var.n0(O);
                    }
                    xtc a = o3h.a(L, false, (Function1) O);
                    Unit unit = Unit.a;
                    Object O2 = av8Var.O();
                    if (O2 == a99Var) {
                        O2 = nw2.d;
                        av8Var.n0(O2);
                    }
                    xtc a2 = koi.a(a, unit, (PointerInputEventHandler) O2);
                    k1c c = e12.c(uxf.c, true);
                    int G = z8e.G(av8Var);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, a2);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    f50 f50Var = hf3.j;
                    if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                        mz1.t(G, av8Var, G, f50Var);
                    }
                    waa.K(av8Var, C, hf3.d);
                    fc6.v(0, tc3Var, av8Var, true);
                } else {
                    av8Var.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                t2k.c((gv9) obj4, this.b, (gv9) obj3, this.c, this.d, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ pni(xtc xtcVar, uah uahVar, long j, float f, tc3 tc3Var) {
        this.d = xtcVar;
        this.e = uahVar;
        this.b = j;
        this.c = f;
        this.f = tc3Var;
    }
}
