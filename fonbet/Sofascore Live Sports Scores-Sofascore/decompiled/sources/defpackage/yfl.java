package defpackage;

import com.sofascore.results.league.fragment.topStats.TopPlayerCategoryUiModel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yfl implements et8 {
    public final /* synthetic */ List a;
    public final /* synthetic */ ajl b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;

    public yfl(List list, ajl ajlVar, boolean z, int i, Function1 function1) {
        this.a = list;
        this.b = ajlVar;
        this.c = z;
        this.d = i;
        this.e = function1;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xpa xpaVar = (xpa) obj;
        int intValue = ((Number) obj2).intValue();
        of3 of3Var = (of3) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((av8) of3Var).g(xpaVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((av8) of3Var).e(intValue) ? 32 : 16;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 147) != 146)) {
            TopPlayerCategoryUiModel topPlayerCategoryUiModel = (TopPlayerCategoryUiModel) this.a.get(intValue);
            av8Var.d0(-820644641);
            vnj vnjVar = (vnj) CollectionsKt.firstOrNull(topPlayerCategoryUiModel.b);
            String str = topPlayerCategoryUiModel.a;
            Integer num = topPlayerCategoryUiModel.e;
            if (vnjVar == null) {
                av8Var.d0(-820453404);
                av8Var.s(false);
            } else {
                av8Var.d0(-820453403);
                unj unjVar = vnjVar.a;
                int i2 = unjVar.a;
                String str2 = unjVar.b;
                String str3 = unjVar.c;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str3;
                String str5 = unjVar.e.b;
                ajl ajlVar = this.b;
                q5a.f(this.c, this.d, i2, str, str2, str4, str5, num, ajlVar != null ? Integer.valueOf(ajlVar.b) : null, ajlVar != null ? ajlVar.c : null, this.e, av8Var, 0);
                av8Var.s(false);
            }
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
