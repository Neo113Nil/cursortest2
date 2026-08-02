package defpackage;

import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class n34 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ n34(boolean z, Function0 function0) {
        this.a = 2;
        this.b = z;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function0 function0 = this.c;
        boolean z = this.b;
        of3 of3Var = (of3) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                r34.b(z, function0, of3Var, aba.K(1));
                break;
            case 1:
                num.getClass();
                jq7.c(z, function0, of3Var, aba.K(1));
                break;
            case 2:
                int intValue = num.intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    y6a.d(this.b, this.c, null, false, t6a.r(lz.D(R.color.primary_default, av8Var), lz.D(R.color.primary_default, av8Var), av8Var), av8Var, 0, 44);
                } else {
                    av8Var.W();
                }
                break;
            default:
                num.getClass();
                ufd.c(z, function0, of3Var, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ n34(boolean z, Function0 function0, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = function0;
    }
}
