package defpackage;

import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class uo6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gk7 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ cdi d;

    public /* synthetic */ uo6(gk7 gk7Var, Function0 function0, e1d e1dVar, int i) {
        this.a = i;
        this.b = gk7Var;
        this.c = function0;
        this.d = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        a99 a99Var = nf3.a;
        cdi cdiVar = this.d;
        gk7 gk7Var = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                    String str = (String) cdiVar.getValue();
                    String str2 = str == null ? "" : str;
                    boolean i2 = av8Var.i(gk7Var);
                    Object O = av8Var.O();
                    if (i2 || O == a99Var) {
                        O = new wo6(gk7Var, 0);
                        av8Var.n0(O);
                    }
                    oea.e(str2, (Function1) O, this.c, null, null, s6a.N(R.drawable.ic_close, 6, av8Var), av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    String str3 = (String) cdiVar.getValue();
                    String str4 = str3 == null ? "" : str3;
                    boolean i3 = av8Var2.i(gk7Var);
                    Object O2 = av8Var2.O();
                    if (i3 || O2 == a99Var) {
                        O2 = new wo6(gk7Var, 7);
                        av8Var2.n0(O2);
                    }
                    oea.e(str4, (Function1) O2, this.c, null, null, s6a.N(R.drawable.ic_close, 6, av8Var2), av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
