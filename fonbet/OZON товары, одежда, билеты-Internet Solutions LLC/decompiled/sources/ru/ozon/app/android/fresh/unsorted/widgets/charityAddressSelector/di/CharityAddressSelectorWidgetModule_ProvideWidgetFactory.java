package ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.data.CharityAddressSelectorConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.presentation.CharityAddressSelectorViewMapper;

/* loaded from: classes6.dex */
public final class CharityAddressSelectorWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CharityAddressSelectorWidgetModule charityAddressSelectorWidgetModule, CharityAddressSelectorConfig charityAddressSelectorConfig, CharityAddressSelectorViewMapper charityAddressSelectorViewMapper) {
        Widget2 provideWidget = charityAddressSelectorWidgetModule.provideWidget(charityAddressSelectorConfig, charityAddressSelectorViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
