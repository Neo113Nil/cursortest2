package defpackage;

import com.sofascore.results.weeklyChallenge.ui.components.bottomSheet.PromotionDemotionBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class xdf implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ p4b d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ PromotionDemotionBottomSheet f;

    public /* synthetic */ xdf(int i, String str, p4b p4bVar, boolean z, PromotionDemotionBottomSheet promotionDemotionBottomSheet, int i2) {
        this.a = i2;
        this.b = i;
        this.c = str;
        this.d = p4bVar;
        this.e = z;
        this.f = promotionDemotionBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-1475412855, av8Var, new xdf(this.b, this.c, this.d, this.e, this.f, 1)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    PromotionDemotionBottomSheet promotionDemotionBottomSheet = this.f;
                    int weeklyStreakCount = promotionDemotionBottomSheet.H().getWeeklyStreakCount();
                    boolean i2 = av8Var2.i(promotionDemotionBottomSheet);
                    Object O = av8Var2.O();
                    if (i2 || O == nf3.a) {
                        O = new ydf(promotionDemotionBottomSheet, 2);
                        av8Var2.n0(O);
                    }
                    u0a.k(this.b, this.c, this.d, this.e, weeklyStreakCount, (Function0) O, null, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
