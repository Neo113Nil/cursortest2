package ru.ozon.app.android.storefront.widgets.feedback.result.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.feedback.common.RateMainButtonViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.result.core.ResultConfig;
import ru.ozon.app.android.storefront.widgets.feedback.result.core.ResultViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;

/* loaded from: classes7.dex */
public final class ResultModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ResultConfig resultConfig, ResultViewMapper resultViewMapper, RateMainButtonViewMapper<ResultDTO> rateMainButtonViewMapper) {
        Widget2 provideWidget = ResultModule.INSTANCE.provideWidget(resultConfig, resultViewMapper, rateMainButtonViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
