package defpackage;

import com.sofascore.results.league.fragment.topStats.TopStatsCategory;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class k3j implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tee b;
    public final /* synthetic */ gv9 c;
    public final /* synthetic */ g3j d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function1 f;

    public k3j(int i, tee teeVar, gv9 gv9Var, g3j g3jVar, String str, Function1 function1) {
        this.a = i;
        this.b = teeVar;
        this.c = gv9Var;
        this.d = g3jVar;
        this.e = str;
        this.f = function1;
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
            teeVar.containsKey(Integer.valueOf(i));
            av8Var.d0(327383195);
            TopStatsCategory topStatsCategory = (TopStatsCategory) this.c.get(i);
            xtc c0 = l98.c0(utc.a, 8.0f, 4.0f);
            c3j c3jVar = this.d.h;
            boolean z = (c3jVar != null ? c3jVar.a : null) == h3j.a;
            Function1 function1 = this.f;
            boolean g = av8Var.g(function1) | av8Var.i(topStatsCategory);
            Object O = av8Var.O();
            Object obj4 = nf3.a;
            if (g || O == obj4) {
                O = new j3j(function1, topStatsCategory, 0);
                av8Var.n0(O);
            }
            Function0 function0 = (Function0) O;
            boolean g2 = av8Var.g(function1) | av8Var.i(topStatsCategory);
            Object O2 = av8Var.O();
            if (g2 || O2 == obj4) {
                O2 = new j3j(function1, topStatsCategory, 1);
                av8Var.n0(O2);
            }
            mha.k(this.e, topStatsCategory, function0, z, (Function0) O2, c0, 0L, false, 0, false, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, av8Var, 196608, 0, 16320);
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
