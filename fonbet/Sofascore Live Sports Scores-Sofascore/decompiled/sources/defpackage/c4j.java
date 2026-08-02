package defpackage;

import com.sofascore.results.wc26.data.WorldCupLastDanceUiModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class c4j implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv9 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ c4j(gv9 gv9Var, Function1 function1, int i) {
        this.a = i;
        this.b = gv9Var;
        this.c = function1;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2 = this.a;
        Function1 function1 = this.c;
        gv9 gv9Var = this.b;
        switch (i2) {
            case 0:
                xpa xpaVar = (xpa) obj;
                int intValue = ((Integer) obj2).intValue();
                of3 of3Var = (of3) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                xpaVar.getClass();
                if ((intValue2 & 6) == 0) {
                    i = (((av8) of3Var).g(xpaVar) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((av8) of3Var).e(intValue) ? 32 : 16;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(i & 1, (i & 147) != 146)) {
                    y6a.o((Pair) gv9Var.get(intValue), function1, xpa.a(xpaVar, utc.a, 3), av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                ((Integer) obj4).getClass();
                ((u5e) obj).getClass();
                w3a.d((WorldCupLastDanceUiModel) gv9Var.get(intValue3), function1, null, (of3) obj3, 0);
                break;
        }
        return Unit.a;
    }
}
