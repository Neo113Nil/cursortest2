package defpackage;

import com.sofascore.results.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lj4 implements et8 {
    public final /* synthetic */ IntRange a;
    public final /* synthetic */ kg2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ di4 f;
    public final /* synthetic */ ci4 g;

    public lj4(IntRange intRange, kg2 kg2Var, int i, int i2, Function1 function1, di4 di4Var, ci4 ci4Var) {
        this.a = intRange;
        this.b = kg2Var;
        this.c = i;
        this.d = i2;
        this.e = function1;
        this.f = di4Var;
        this.g = ci4Var;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        of3 of3Var = (of3) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 48) == 0) {
            intValue2 |= ((av8) of3Var).e(intValue) ? 32 : 16;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue2 & 1, (intValue2 & 145) != 144)) {
            int i = intValue + this.a.a;
            String a = ig2.a(i, this.b.a);
            xtc j = bkh.j(pj4.x, pj4.w);
            boolean z = i == this.c;
            boolean z2 = i == this.d;
            Function1 function1 = this.e;
            boolean g = av8Var.g(function1) | av8Var.e(i);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                O = new kj4(i, 0, function1);
                av8Var.n0(O);
            }
            this.f.getClass();
            oj4.m(a, j, z, z2, (Function0) O, String.format(cga.B(R.string.m3c_date_picker_navigate_to_year_description, av8Var), Arrays.copyOf(new Object[]{a}, 1)), this.g, av8Var, 48);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
