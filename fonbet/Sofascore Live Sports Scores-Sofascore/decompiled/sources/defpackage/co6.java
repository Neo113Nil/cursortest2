package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class co6 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tee b;
    public final /* synthetic */ ppb c;
    public final /* synthetic */ Function1 d;

    public co6(int i, tee teeVar, ppb ppbVar, Function1 function1) {
        this.a = i;
        this.b = teeVar;
        this.c = ppbVar;
        this.d = function1;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        xpa xpaVar = (xpa) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Number) obj3).intValue();
        xpaVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(xpaVar) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            int i = this.a;
            Integer valueOf = Integer.valueOf(i - 1);
            tee teeVar = this.b;
            teeVar.containsKey(valueOf);
            boolean containsKey = teeVar.containsKey(Integer.valueOf(i));
            av8Var.d0(-676849641);
            do7 do7Var = (do7) this.c.a.get(i);
            Function1 function1 = this.d;
            boolean g = av8Var.g(function1);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                O = new zn6(2, function1);
                av8Var.n0(O);
            }
            Function1 function12 = (Function1) O;
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(xpa.a(xpaVar, utcVar, 7), 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            if (!containsKey) {
                d0 = d0.z(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7));
            }
            oyn.k(do7Var, function12, d0, av8Var, 0);
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
