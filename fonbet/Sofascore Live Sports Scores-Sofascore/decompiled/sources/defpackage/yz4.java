package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class yz4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ e1d c;

    public /* synthetic */ yz4(Function1 function1, e1d e1dVar, int i) {
        this.a = i;
        this.b = function1;
        this.c = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        e1d e1dVar = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (!av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    av8Var.W();
                } else if (((String) e1dVar.getValue()).length() > 0) {
                    av8Var.d0(1271962457);
                    ImageVector N = s6a.N(R.drawable.ic_close, 6, av8Var);
                    xtc l = bkh.l(utc.a, 24.0f);
                    boolean g = av8Var.g(function1);
                    Object O = av8Var.O();
                    if (g || O == nf3.a) {
                        O = new s91(function1, e1dVar, 2);
                        av8Var.n0(O);
                    }
                    kq9.b(N, null, tol.y(l, false, false, false, 0L, null, (Function0) O, av8Var, 29), 0L, av8Var, 48, 8);
                    av8Var.s(false);
                } else {
                    av8Var.d0(1272388180);
                    av8Var.s(false);
                }
                break;
            case 1:
                Boolean bool = (Boolean) e1dVar.getValue();
                bool.booleanValue();
                function1.invoke(bool);
                break;
            default:
                Boolean bool2 = (Boolean) e1dVar.getValue();
                bool2.booleanValue();
                function1.invoke(bool2);
                break;
        }
        return Unit.a;
    }
}
