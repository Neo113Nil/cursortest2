package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class aj4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ xtc c;

    public aj4(int i, Function1 function1, xtc xtcVar) {
        this.a = i;
        this.b = function1;
        this.c = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        int intValue = ((Number) obj2).intValue();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
            int i = this.a;
            Object obj3 = nf3.a;
            Function1 function1 = this.b;
            if (i == 0) {
                av8Var.d0(-101264927);
                ImageVector imageVector = u6h.n;
                if (imageVector == null) {
                    fu9 fu9Var = new fu9("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                    km5 km5Var = jmk.a;
                    pvh pvhVar = new pvh(r13.b);
                    ef0 ef0Var = new ef0(4);
                    ArrayList arrayList = ef0Var.a;
                    ef0Var.l(3.0f, 17.25f);
                    arrayList.add(new vbe(21.0f));
                    ef0Var.i(3.75f);
                    ef0Var.j(17.81f, 9.94f);
                    ef0Var.k(-3.75f, -3.75f);
                    ef0Var.j(3.0f, 17.25f);
                    ef0Var.f();
                    ef0Var.l(20.71f, 7.04f);
                    ef0Var.g(0.39f, -0.39f, 0.39f, -1.02f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.41f);
                    ef0Var.k(-2.34f, -2.34f);
                    ef0Var.g(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    ef0Var.k(-1.83f, 1.83f);
                    ef0Var.k(3.75f, 3.75f);
                    ef0Var.k(1.83f, -1.83f);
                    ef0Var.f();
                    fu9.a(fu9Var, arrayList, pvhVar);
                    imageVector = fu9Var.b();
                    u6h.n = imageVector;
                }
                ImageVector imageVector2 = imageVector;
                String B = cga.B(R.string.m3c_date_picker_switch_to_input_mode, av8Var);
                boolean g = av8Var.g(function1);
                Object O = av8Var.O();
                if (g || O == obj3) {
                    O = new ri(14, function1);
                    av8Var.n0(O);
                }
                oj4.h(0, 16, av8Var, this.c, imageVector2, B, (Function0) O, false);
                av8Var.s(false);
            } else {
                av8Var.d0(-100967048);
                ImageVector imageVector3 = u6h.o;
                if (imageVector3 == null) {
                    fu9 fu9Var2 = new fu9("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                    km5 km5Var2 = jmk.a;
                    pvh pvhVar2 = new pvh(r13.b);
                    ef0 ef0Var2 = new ef0(4);
                    ef0Var2.l(9.0f, 11.0f);
                    ef0Var2.j(7.0f, 11.0f);
                    ef0Var2.n(2.0f);
                    ef0Var2.i(2.0f);
                    ef0Var2.n(-2.0f);
                    ef0Var2.f();
                    ef0Var2.l(13.0f, 11.0f);
                    ef0Var2.i(-2.0f);
                    ef0Var2.n(2.0f);
                    ef0Var2.i(2.0f);
                    ef0Var2.n(-2.0f);
                    ef0Var2.f();
                    ef0Var2.l(17.0f, 11.0f);
                    ef0Var2.i(-2.0f);
                    ef0Var2.n(2.0f);
                    ef0Var2.i(2.0f);
                    ef0Var2.n(-2.0f);
                    ef0Var2.f();
                    ef0Var2.l(19.0f, 4.0f);
                    ef0Var2.i(-1.0f);
                    ef0Var2.j(18.0f, 2.0f);
                    ef0Var2.i(-2.0f);
                    ef0Var2.n(2.0f);
                    ef0Var2.j(8.0f, 4.0f);
                    ef0Var2.j(8.0f, 2.0f);
                    ef0Var2.j(6.0f, 2.0f);
                    ef0Var2.n(2.0f);
                    ef0Var2.j(5.0f, 4.0f);
                    ef0Var2.g(-1.11f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.99f, 0.9f, -1.99f, 2.0f);
                    ef0Var2.j(3.0f, 20.0f);
                    ef0Var2.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                    ef0Var2.i(14.0f);
                    ef0Var2.g(1.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, -0.9f, 2.0f, -2.0f);
                    ef0Var2.j(21.0f, 6.0f);
                    ef0Var2.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    ef0Var2.f();
                    ef0Var2.l(19.0f, 20.0f);
                    ef0Var2.j(5.0f, 20.0f);
                    ef0Var2.j(5.0f, 9.0f);
                    ef0Var2.i(14.0f);
                    ef0Var2.n(11.0f);
                    ef0Var2.f();
                    fu9.a(fu9Var2, ef0Var2.a, pvhVar2);
                    imageVector3 = fu9Var2.b();
                    u6h.o = imageVector3;
                }
                ImageVector imageVector4 = imageVector3;
                String B2 = cga.B(R.string.m3c_date_picker_switch_to_calendar_mode, av8Var);
                boolean g2 = av8Var.g(function1);
                Object O2 = av8Var.O();
                if (g2 || O2 == obj3) {
                    O2 = new ri(15, function1);
                    av8Var.n0(O2);
                }
                oj4.h(0, 16, av8Var, this.c, imageVector4, B2, (Function0) O2, false);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
