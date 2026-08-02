package defpackage;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class wi implements et8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wi(int i, cj cjVar, Context context) {
        this.b = i;
        this.c = cjVar;
        this.d = context;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                cj cjVar = (cj) obj6;
                Context context = (Context) obj5;
                gv9 gv9Var = (gv9) obj2;
                of3 of3Var = (of3) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((k60) obj).getClass();
                gv9Var.getClass();
                eld eldVar = (eld) CollectionsKt.firstOrNull(gv9Var);
                boolean z = (((intValue & 112) ^ 48) > 32 && ((av8) of3Var).g(gv9Var)) || (intValue & 48) == 32;
                av8 av8Var = (av8) of3Var;
                Object O = av8Var.O();
                a99 a99Var = nf3.a;
                if (z || O == a99Var) {
                    O = gv9Var.size() > 1 ? CollectionsKt.S(gv9Var, 1) : km5.a;
                    av8Var.n0(O);
                }
                List list = (List) O;
                xtc d0 = l98.d0(lz.J(bkh.c, jaa.L(av8Var), null), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
                int i2 = this.b;
                boolean e = av8Var.e(i2) | av8Var.g(eldVar) | av8Var.g(cjVar) | av8Var.i(list) | av8Var.i(context);
                Object O2 = av8Var.O();
                if (e || O2 == a99Var) {
                    xi xiVar = new xi(i2, 0, eldVar, list, cjVar, context);
                    av8Var.n0(xiVar);
                    O2 = xiVar;
                }
                v8a.a(d0, null, C, ng0Var, null, null, false, null, (Function1) O2, av8Var, 24960, 490);
                break;
            default:
                f06 f06Var = (f06) obj6;
                Function1 function1 = (Function1) obj5;
                ((Integer) obj2).getClass();
                of3 of3Var2 = (of3) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((xpa) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 129) != 128)) {
                    l6g.o(f06Var.c, f06Var.d, f06Var.e, this.b, function1, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ wi(int i, f06 f06Var, Function1 function1) {
        this.c = f06Var;
        this.b = i;
        this.d = function1;
    }
}
