package ru.ozon.app.android.fresh.geo.widgets.addressPopupButton.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.geo.widgets.addressPopupButton.data.AddressPopupButtonConfig;
import ru.ozon.app.android.fresh.geo.widgets.addressPopupButton.presentation.AddressPopupButtonViewMapper;

/* loaded from: classes6.dex */
public final class AddressPopupButtonWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(AddressPopupButtonWidgetModule addressPopupButtonWidgetModule, AddressPopupButtonConfig addressPopupButtonConfig, AddressPopupButtonViewMapper addressPopupButtonViewMapper) {
        Widget2 provideWidget = addressPopupButtonWidgetModule.provideWidget(addressPopupButtonConfig, addressPopupButtonViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
