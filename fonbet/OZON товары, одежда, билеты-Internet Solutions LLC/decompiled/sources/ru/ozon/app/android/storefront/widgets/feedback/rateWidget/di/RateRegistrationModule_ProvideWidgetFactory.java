package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.feedback.common.RateMainButtonViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.core.RateConfig;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.core.RateViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.data.RateDTO;

/* loaded from: classes7.dex */
public final class RateRegistrationModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(RateConfig rateConfig, RateViewMapper rateViewMapper, RateMainButtonViewMapper<RateDTO> rateMainButtonViewMapper) {
        Widget2 provideWidget = RateRegistrationModule.INSTANCE.provideWidget(rateConfig, rateViewMapper, rateMainButtonViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
