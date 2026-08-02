package defpackage;

import com.android.billingclient.api.ProductDetails;
import com.sofascore.results.profile.view.WeeklyStreakRestoreModal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class o5l implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WeeklyStreakRestoreModal b;

    public /* synthetic */ o5l(WeeklyStreakRestoreModal weeklyStreakRestoreModal, int i) {
        this.a = i;
        this.b = weeklyStreakRestoreModal;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        int i = this.a;
        WeeklyStreakRestoreModal weeklyStreakRestoreModal = this.b;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(1567114832, av8Var, new o5l(weeklyStreakRestoreModal, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    int intValue2 = ((Number) weeklyStreakRestoreModal.y.getValue()).intValue();
                    long longValue = ((Number) weeklyStreakRestoreModal.z.getValue()).longValue();
                    ProductDetails productDetails = WeeklyStreakRestoreModal.A;
                    if (productDetails == null || (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) == null || (str = oneTimePurchaseOfferDetails.getFormattedPrice()) == null) {
                        str = "";
                    }
                    String str2 = str;
                    boolean i3 = av8Var2.i(weeklyStreakRestoreModal);
                    Object O = av8Var2.O();
                    if (i3 || O == nf3.a) {
                        O = new p5l(weeklyStreakRestoreModal, 2);
                        av8Var2.n0(O);
                    }
                    wba.f(intValue2, longValue, str2, (Function0) O, null, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
