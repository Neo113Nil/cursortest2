package defpackage;

import android.widget.CheckBox;
import android.widget.RelativeLayout;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class os4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ os4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        utc utcVar = utc.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Number) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    uxf uxfVar = ww9.c;
                    lv1 lv1Var = uxf.m;
                    ct8 ct8Var = ((iih) obj3).e;
                    l8g a = k8g.a(uxfVar, lv1Var, av8Var, 54);
                    int G = z8e.G(av8Var);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, utcVar);
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
                    f50 f50Var = hf3.j;
                    if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                        mz1.t(G, av8Var, G, f50Var);
                    }
                    waa.K(av8Var, C, hf3.d);
                    ct8Var.invoke(p8g.a, av8Var, 6);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Number) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    td4.y(((a3e) obj3).a, 48, 12, av8Var2, bkh.l(utcVar, 24.0f), null, false);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                String str = (String) obj;
                ((Number) obj2).intValue();
                str.getClass();
                boolean equals = str.equals("First");
                pye pyeVar = (pye) obj3;
                int i2 = equals ? 1 : 2;
                pyeVar.y = i2;
                j22 j22Var = pyeVar.d;
                ((RelativeLayout) j22Var.q).setRotation(i2 == 1 ? 180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ((CheckBox) j22Var.f).setChecked(false);
                if (equals) {
                    pyeVar.s(false, pyeVar.t, pyeVar.o);
                    if (!pyeVar.E) {
                        pyeVar.q();
                    }
                    pyeVar.E = false;
                } else {
                    pyeVar.s(false, pyeVar.u, pyeVar.p);
                    pyeVar.q();
                }
                break;
        }
        return Unit.a;
    }
}
