package defpackage;

import android.content.Context;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class o34 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ o34(int i, int i2, Function1 function1) {
        this.a = i2;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 6;
        Object obj3 = nf3.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                r34.c(function1, (of3) obj, aba.K(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                r34.a(function1, (of3) obj, aba.K(1));
                break;
            case 2:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    boolean g = av8Var.g(function1);
                    Object O = av8Var.O();
                    if (g || O == obj3) {
                        O = new y47(i2, function1);
                        av8Var.n0(O);
                    }
                    fcp.L((ct8) O, null, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 3:
                Float f = (Float) obj;
                f.floatValue();
                ((Float) obj2).floatValue();
                function1.invoke(f);
                break;
            case 4:
                tl7 tl7Var = (tl7) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                tl7Var.getClass();
                function1.invoke(new vs6(tl7Var, booleanValue));
                break;
            case 5:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                function1.invoke(new t57(str, str2));
                break;
            case 6:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    String v = oea.v(R.string.fantasy_edit_team_name, av8Var2);
                    ImageVector N = s6a.N(R.drawable.ic_chevron_right_small_16, 6, av8Var2);
                    boolean g2 = av8Var2.g(function1);
                    Object O2 = av8Var2.O();
                    if (g2 || O2 == obj3) {
                        O2 = new rt6(24, function1);
                        av8Var2.n0(O2);
                    }
                    m77.e(v, N, (Function0) O2, null, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
            case 7:
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    String v2 = oea.v(R.string.rules, av8Var3);
                    ImageVector N2 = s6a.N(R.drawable.ic_external_link_16, 6, av8Var3);
                    boolean g3 = av8Var3.g(function1);
                    Object O3 = av8Var3.O();
                    if (g3 || O3 == obj3) {
                        O3 = new rt6(27, function1);
                        av8Var3.n0(O3);
                    }
                    m77.e(v2, N2, (Function0) O3, null, av8Var3, 0);
                    String v3 = oea.v(R.string.terms_and_conditions, av8Var3);
                    ImageVector N3 = s6a.N(R.drawable.ic_external_link_16, 6, av8Var3);
                    boolean g4 = av8Var3.g(function1);
                    Object O4 = av8Var3.O();
                    if (g4 || O4 == obj3) {
                        O4 = new rt6(28, function1);
                        av8Var3.n0(O4);
                    }
                    m77.e(v3, N3, (Function0) O4, null, av8Var3, 0);
                    String v4 = oea.v(R.string.privacy_policy, av8Var3);
                    ImageVector N4 = s6a.N(R.drawable.ic_external_link_16, 6, av8Var3);
                    boolean g5 = av8Var3.g(function1);
                    Object O5 = av8Var3.O();
                    if (g5 || O5 == obj3) {
                        O5 = new rt6(29, function1);
                        av8Var3.n0(O5);
                    }
                    m77.e(v4, N4, (Function0) O5, null, av8Var3, 0);
                } else {
                    av8Var3.W();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                break;
            case 9:
                Integer num = (Integer) obj2;
                num.intValue();
                ((Context) obj).getClass();
                function1.invoke(num);
                break;
            case 10:
                String str3 = (String) obj;
                str3.getClass();
                ((w3f) obj2).getClass();
                function1.invoke(str3);
                break;
            case 11:
                int intValue4 = ((Integer) obj).intValue();
                ((String) obj2).getClass();
                function1.invoke(new fw7(intValue4));
                break;
            case 12:
                huj hujVar = (huj) obj;
                int intValue5 = ((Integer) obj2).intValue();
                hujVar.getClass();
                function1.invoke(new ltj(hujVar, intValue5));
                break;
            case 13:
                function1.invoke(obj);
                break;
            case 14:
                int intValue6 = ((Integer) obj).intValue();
                String str4 = (String) obj2;
                str4.getClass();
                function1.invoke(new pgl(intValue6, str4));
                break;
            default:
                int intValue7 = ((Integer) obj2).intValue();
                ((Context) obj).getClass();
                function1.invoke(new khl(intValue7));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ o34(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }
}
