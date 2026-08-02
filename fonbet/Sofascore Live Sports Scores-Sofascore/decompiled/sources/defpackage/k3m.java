package defpackage;

import com.blaze.blazesdk.features.search.ui.SearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k3m implements Function2 {
    public final /* synthetic */ SearchActivity a;

    public k3m(SearchActivity searchActivity) {
        this.a = searchActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        SearchActivity searchActivity = this.a;
        e1d l = sea.l(((prl) searchActivity.b.getValue()).c, of3Var, 0);
        Object[] objArr = new Object[0];
        av8 av8Var2 = (av8) of3Var;
        av8Var2.d0(703386015);
        Object O = av8Var2.O();
        if (O == nf3.a) {
            O = new wel(16);
            av8Var2.n0(O);
        }
        av8Var2.s(false);
        tzb.b(null, null, null, yqo.H(2096086880, av8Var2, new pzl((e1d) o3a.L(objArr, null, null, (Function0) O, av8Var2, 3072, 6), searchActivity, l)), av8Var2, 3072, 7);
        return Unit.a;
    }
}
