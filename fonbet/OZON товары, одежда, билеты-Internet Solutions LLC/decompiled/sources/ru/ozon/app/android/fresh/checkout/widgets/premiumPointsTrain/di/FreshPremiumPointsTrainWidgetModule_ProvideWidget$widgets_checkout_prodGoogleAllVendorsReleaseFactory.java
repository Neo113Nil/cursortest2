package ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.data.FreshPremiumPointsTrainConfig;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.FreshPremiumPointsTrainMultipleViewMapper;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.singleCarriageTrain.FreshPremiumPointsTrainSingleViewMapper;

/* loaded from: classes6.dex */
public final class FreshPremiumPointsTrainWidgetModule_ProvideWidget$widgets_checkout_prodGoogleAllVendorsReleaseFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidget$widgets_checkout_prodGoogleAllVendorsRelease(FreshPremiumPointsTrainConfig freshPremiumPointsTrainConfig, FreshPremiumPointsTrainSingleViewMapper freshPremiumPointsTrainSingleViewMapper, FreshPremiumPointsTrainMultipleViewMapper freshPremiumPointsTrainMultipleViewMapper) {
        Set<Widget2> provideWidget$widgets_checkout_prodGoogleAllVendorsRelease = FreshPremiumPointsTrainWidgetModule.INSTANCE.provideWidget$widgets_checkout_prodGoogleAllVendorsRelease(freshPremiumPointsTrainConfig, freshPremiumPointsTrainSingleViewMapper, freshPremiumPointsTrainMultipleViewMapper);
        j.d(provideWidget$widgets_checkout_prodGoogleAllVendorsRelease);
        return provideWidget$widgets_checkout_prodGoogleAllVendorsRelease;
    }
}
