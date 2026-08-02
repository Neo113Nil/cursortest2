package defpackage;

import com.sofascore.results.ads.UpgradeSofascoreActivity;
import com.sofascore.results.subscription.SubscriptionPriceBundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class odk implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ UpgradeSofascoreActivity b;
    public final /* synthetic */ SubscriptionPriceBundle c;

    public /* synthetic */ odk(UpgradeSofascoreActivity upgradeSofascoreActivity, SubscriptionPriceBundle subscriptionPriceBundle) {
        this.b = upgradeSofascoreActivity;
        this.c = subscriptionPriceBundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        SubscriptionPriceBundle subscriptionPriceBundle = this.c;
        UpgradeSofascoreActivity upgradeSofascoreActivity = this.b;
        String str = null;
        jv jvVar = (jv) obj;
        switch (i) {
            case 0:
                int i2 = UpgradeSofascoreActivity.M;
                jvVar.getClass();
                boolean z = jvVar == jv.FEATURED_OFFER && subscriptionPriceBundle.m != null;
                String str2 = z ? subscriptionPriceBundle.m : subscriptionPriceBundle.g;
                bli bliVar = upgradeSofascoreActivity.Q().g;
                bliVar.getClass();
                String str3 = subscriptionPriceBundle.a;
                if (z) {
                    cu cuVar = cu.e;
                    str = "black-friday-2025";
                } else {
                    cu cuVar2 = subscriptionPriceBundle.i;
                    if (cuVar2 != null) {
                        str = cuVar2.a;
                    }
                }
                bliVar.k(upgradeSofascoreActivity, str3, str2, str);
                break;
            default:
                int i3 = UpgradeSofascoreActivity.M;
                jvVar.getClass();
                int ordinal = jvVar.ordinal();
                if (ordinal == 4) {
                    bli bliVar2 = upgradeSofascoreActivity.Q().g;
                    bliVar2.getClass();
                    bliVar2.k(upgradeSofascoreActivity, subscriptionPriceBundle.a, subscriptionPriceBundle.g, null);
                    Unit unit = Unit.a;
                } else if (ordinal == 5) {
                    bli bliVar3 = upgradeSofascoreActivity.Q().g;
                    bliVar3.getClass();
                    bliVar3.k(upgradeSofascoreActivity, subscriptionPriceBundle.a, subscriptionPriceBundle.h, null);
                    Unit unit2 = Unit.a;
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ odk(SubscriptionPriceBundle subscriptionPriceBundle, UpgradeSofascoreActivity upgradeSofascoreActivity) {
        this.c = subscriptionPriceBundle;
        this.b = upgradeSofascoreActivity;
    }
}
