package ru.ozon.app.android.fresh.unsorted.widgets.addressSelectorLite.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.addressSelectorLite.data.AddressSelectorLiteConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.addressSelectorLite.presentation.AddressSelectorLiteViewMapper;

/* loaded from: classes6.dex */
public final class AddressSelectorLiteWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(AddressSelectorLiteWidgetModule addressSelectorLiteWidgetModule, AddressSelectorLiteConfig addressSelectorLiteConfig, AddressSelectorLiteViewMapper addressSelectorLiteViewMapper) {
        Widget2 provideWidget = addressSelectorLiteWidgetModule.provideWidget(addressSelectorLiteConfig, addressSelectorLiteViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
