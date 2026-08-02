package defpackage;

import com.blaze.blazesdk.features.search.ui.SearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pzl implements Function2 {
    public final /* synthetic */ e1d a;
    public final /* synthetic */ SearchActivity b;
    public final /* synthetic */ cdi c;

    public pzl(e1d e1dVar, SearchActivity searchActivity, cdi cdiVar) {
        this.a = e1dVar;
        this.b = searchActivity;
        this.c = cdiVar;
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
        q5a.p(bkh.c, null, null, null, null, 0, l3m.a, 0L, null, yqo.H(1649409007, of3Var, new ovl(this.a, this.b, this.c)), of3Var, 806879238, 446);
        return Unit.a;
    }
}
