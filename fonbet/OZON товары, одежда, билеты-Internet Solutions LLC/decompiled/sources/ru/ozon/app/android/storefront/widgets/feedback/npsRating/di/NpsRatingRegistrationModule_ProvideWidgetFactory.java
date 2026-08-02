package ru.ozon.app.android.storefront.widgets.feedback.npsRating.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.feedback.npsRating.core.NpsRatingConfig;
import ru.ozon.app.android.storefront.widgets.feedback.npsRating.core.NpsRatingViewMapper;

/* loaded from: classes7.dex */
public final class NpsRatingRegistrationModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(NpsRatingConfig npsRatingConfig, NpsRatingViewMapper npsRatingViewMapper) {
        Widget2 provideWidget = NpsRatingRegistrationModule.INSTANCE.provideWidget(npsRatingConfig, npsRatingViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
