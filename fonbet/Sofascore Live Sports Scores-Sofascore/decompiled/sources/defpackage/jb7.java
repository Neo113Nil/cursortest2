package defpackage;

import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jb7 implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv9 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ jb7(gv9 gv9Var, Function1 function1, int i) {
        this.a = i;
        this.b = gv9Var;
        this.c = function1;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.a;
        Function1 function1 = this.c;
        gv9 gv9Var = this.b;
        switch (i3) {
            case 0:
                bpa bpaVar = (bpa) obj;
                int intValue = ((Number) obj2).intValue();
                of3 of3Var = (of3) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((av8) of3Var).g(bpaVar) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((av8) of3Var).e(intValue) ? 32 : 16;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(i & 1, (i & 147) != 146)) {
                    mp6 mp6Var = (mp6) gv9Var.get(intValue);
                    av8Var.d0(-1475664883);
                    long D = lz.D(R.color.surface_2, av8Var);
                    xtc d = bkh.d(utc.a, 1.0f);
                    boolean g = av8Var.g(function1);
                    Object O = av8Var.O();
                    if (g || O == nf3.a) {
                        O = new zn6(4, function1);
                        av8Var.n0(O);
                    }
                    n9e.f(mp6Var, (Function1) O, d, D, av8Var, 384, 0);
                    av8Var.s(false);
                } else {
                    av8Var.W();
                }
                break;
            default:
                xpa xpaVar = (xpa) obj;
                int intValue3 = ((Number) obj2).intValue();
                of3 of3Var2 = (of3) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((av8) of3Var2).g(xpaVar) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((av8) of3Var2).e(intValue3) ? 32 : 16;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
                    zil zilVar = (zil) gv9Var.get(intValue3);
                    av8Var2.d0(894315222);
                    r4a.m(zilVar, function1, av8Var2, 0);
                    av8Var2.s(false);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
