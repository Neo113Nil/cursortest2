package ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.data.SteppedThermometerConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.presentation.SteppedThermometerViewMapper;

/* loaded from: classes6.dex */
public final class SteppedThermometerModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(SteppedThermometerModule steppedThermometerModule, SteppedThermometerConfig steppedThermometerConfig, SteppedThermometerViewMapper steppedThermometerViewMapper) {
        Widget2 provideWidget = steppedThermometerModule.provideWidget(steppedThermometerConfig, steppedThermometerViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
