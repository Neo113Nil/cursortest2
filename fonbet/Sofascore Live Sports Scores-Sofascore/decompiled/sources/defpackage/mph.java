package defpackage;

import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class mph implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cdi b;

    public /* synthetic */ mph(cdi cdiVar, int i) {
        this.a = i;
        this.b = cdiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        utc utcVar = utc.a;
        cdi cdiVar = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    cga.b(((Number) cdiVar.getValue()).floatValue(), av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    kq9.b(s6a.N(R.drawable.ic_chevron_down, 6, av8Var2), null, haa.v(bkh.l(utcVar, 24.0f), ((Number) cdiVar.getValue()).floatValue()), lz.D(R.color.on_color_primary, av8Var2), av8Var2, 48, 0);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    kq9.b(s6a.N(R.drawable.ic_chevron_down, 6, av8Var3), null, haa.v(bkh.l(utcVar, 24.0f), ((Number) cdiVar.getValue()).floatValue()), lz.D(R.color.on_color_primary, av8Var3), av8Var3, 48, 0);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }
}
