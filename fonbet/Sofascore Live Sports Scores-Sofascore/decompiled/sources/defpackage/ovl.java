package defpackage;

import com.blaze.blazesdk.features.search.ui.SearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ovl implements ct8 {
    public final /* synthetic */ e1d a;
    public final /* synthetic */ SearchActivity b;
    public final /* synthetic */ cdi c;

    public ovl(e1d e1dVar, SearchActivity searchActivity, cdi cdiVar) {
        this.a = e1dVar;
        this.b = searchActivity;
        this.c = cdiVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p3e p3eVar = (p3e) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Number) obj3).intValue();
        p3eVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(p3eVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        lrl lrlVar = (lrl) this.c.getValue();
        e1d e1dVar = this.a;
        String str = (String) e1dVar.getValue();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.d0(-2015733657);
        boolean g = av8Var2.g(e1dVar);
        SearchActivity searchActivity = this.b;
        boolean i = g | av8Var2.i(searchActivity);
        Object O = av8Var2.O();
        Object obj4 = nf3.a;
        if (i || O == obj4) {
            O = new bcl(13, searchActivity, e1dVar);
            av8Var2.n0(O);
        }
        Function1 function1 = (Function1) O;
        av8Var2.s(false);
        prl prlVar = (prl) searchActivity.b.getValue();
        av8Var2.d0(-2015727489);
        boolean i2 = av8Var2.i(prlVar);
        Object O2 = av8Var2.O();
        if (i2 || O2 == obj4) {
            O2 = new mrl(prlVar);
            av8Var2.n0(O2);
        }
        av8Var2.s(false);
        Function1 function12 = (Function1) ((KFunction) O2);
        av8Var2.d0(-2015725545);
        boolean g2 = av8Var2.g(e1dVar) | av8Var2.i(searchActivity);
        Object O3 = av8Var2.O();
        if (g2 || O3 == obj4) {
            O3 = new ufl(7, searchActivity, e1dVar);
            av8Var2.n0(O3);
        }
        Function0 function0 = (Function0) O3;
        av8Var2.s(false);
        av8Var2.d0(-2015722701);
        boolean i3 = av8Var2.i(searchActivity);
        Object O4 = av8Var2.O();
        if (i3 || O4 == obj4) {
            O4 = new ndk(searchActivity, 14);
            av8Var2.n0(O4);
        }
        av8Var2.s(false);
        rpm.b(lrlVar, str, function1, function12, function0, (Function0) O4, ((prl) searchActivity.b.getValue()).g, p3eVar, av8Var2, (intValue << 21) & 29360128);
        return Unit.a;
    }
}
