package ru.ozon.app.android.fresh.unsorted.widgets.expressAvailability.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.expressAvailability.data.ExpressAvailabilityConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.expressAvailability.presentation.ExpressAvailabilityViewMapper;

/* loaded from: classes6.dex */
public final class ExpressAvailabilityWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ExpressAvailabilityWidgetModule expressAvailabilityWidgetModule, ExpressAvailabilityConfig expressAvailabilityConfig, ExpressAvailabilityViewMapper expressAvailabilityViewMapper) {
        Widget2 provideWidget = expressAvailabilityWidgetModule.provideWidget(expressAvailabilityConfig, expressAvailabilityViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
