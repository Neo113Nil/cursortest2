package defpackage;

import com.sofascore.results.fantasy.shared.FantasySquadInfoDisplayModeBottomSheet;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class lk7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasySquadInfoDisplayModeBottomSheet b;

    public /* synthetic */ lk7(FantasySquadInfoDisplayModeBottomSheet fantasySquadInfoDisplayModeBottomSheet, int i) {
        this.a = i;
        this.b = fantasySquadInfoDisplayModeBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        FantasySquadInfoDisplayModeBottomSheet fantasySquadInfoDisplayModeBottomSheet = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(531163414, av8Var, new lk7(fantasySquadInfoDisplayModeBottomSheet, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    xtc f0 = l98.f0(hkg.u0(bkh.d(utc.a, 1.0f), hkg.o0(av8Var2), false, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 7);
                    u23 a = t23.a(ww9.d, uxf.o, av8Var2, 0);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, f0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a, hf3.g);
                    waa.K(av8Var2, m, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C, hf3.d);
                    av8Var2.d0(-1090928647);
                    kp5 kp5Var = il8.k;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : kp5Var) {
                        if (((Boolean) ((il8) obj3).d.invoke(fantasySquadInfoDisplayModeBottomSheet.F().getN())).booleanValue()) {
                            arrayList.add(obj3);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        il8 il8Var = (il8) it.next();
                        boolean z = il8Var == fantasySquadInfoDisplayModeBottomSheet.F().r();
                        boolean i3 = av8Var2.i(fantasySquadInfoDisplayModeBottomSheet);
                        Object O = av8Var2.O();
                        if (i3 || O == nf3.a) {
                            O = new x16(fantasySquadInfoDisplayModeBottomSheet, 22);
                            av8Var2.n0(O);
                        }
                        tol.f(il8Var, z, (Function1) O, null, av8Var2, 0);
                    }
                    av8Var2.s(false);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
