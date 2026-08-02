package ru.ozon.app.android.marketing.widgets.bigPromoNavbar.core;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.marketing.R$plurals;
import ru.ozon.app.android.marketing.common.flags.WarmupQuantityStringForNavBarFlag;
import ru.ozon.app.android.marketing.widgets.bigPromoNavbar.presentation.BigPromoNavbarView;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BigPromoCounterNavBarPreCreateInfoProvider$provide$1 extends AbstractC7737t implements Function0<View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ BigPromoCounterNavBarPreCreateInfoProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BigPromoCounterNavBarPreCreateInfoProvider$provide$1(BigPromoCounterNavBarPreCreateInfoProvider bigPromoCounterNavBarPreCreateInfoProvider, Context context) {
        super(0);
        this.this$0 = bigPromoCounterNavBarPreCreateInfoProvider;
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        FeatureChecker featureChecker;
        featureChecker = this.this$0.featureChecker;
        if (featureChecker.isEnabled(WarmupQuantityStringForNavBarFlag.INSTANCE)) {
            StringProvider.getQuantityString(R$plurals.black_friday_status_plurals_days, 4, 4);
        }
        return new BigPromoNavbarView(this.$context, null, 0, 0, 14, null);
    }
}
