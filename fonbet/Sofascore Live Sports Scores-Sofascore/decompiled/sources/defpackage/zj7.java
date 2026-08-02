package defpackage;

import com.sofascore.results.R;
import com.sofascore.results.onboarding.OnboardingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class zj7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ zj7(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.a;
        boolean z = this.b;
        switch (i3) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    if (z) {
                        i = 299270289;
                        i2 = R.color.error;
                    } else {
                        i = 299270800;
                        i2 = R.color.n_lv_3;
                    }
                    kq9.b(s6a.N(R.drawable.ic_delete, 6, av8Var), null, bkh.l(utc.a, 24.0f), ((r13) wih.a(ljg.f(av8Var, i, i2, av8Var, false), s02.h0(250, 0, null, 6), "clear_icon_color_animation", av8Var, 432, 8).getValue()).a, av8Var, 432, 0);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                k53.M(z, (of3) obj, aba.K(1));
                return Unit.a;
            case 2:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i4 = OnboardingActivity.L;
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    fsd.a(z, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 3:
                ((Integer) obj2).getClass();
                ((r60) obj).getClass();
                int i5 = z ? -1 : 1;
                return l98.l0(uo5.m(s02.h0(300, 0, null, 6), new bvb(i5, 8)), uo5.o(s02.h0(300, 0, null, 6), new bvb(i5, 9)));
            case 4:
                ((Integer) obj2).getClass();
                fsd.a(z, (of3) obj, aba.K(1));
                return Unit.a;
            default:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (z) {
                    return rei.f(yid.m(num), 0, num2);
                }
                int m = yid.m(num);
                return num2 != null ? fc6.g(m, num2.intValue(), "/") : String.valueOf(m);
        }
    }

    public /* synthetic */ zj7(boolean z, int i, int i2) {
        this.a = i2;
        this.b = z;
    }
}
