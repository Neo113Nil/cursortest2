package ru.ozon.app.android.fresh.main.widgets.addressCommunication.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.addressCommunication.data.AddressCommunicationConfig;
import ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation.AddressCommunicationViewMapper;

/* loaded from: classes6.dex */
public final class AddressCommunicationWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(AddressCommunicationWidgetModule addressCommunicationWidgetModule, AddressCommunicationConfig addressCommunicationConfig, AddressCommunicationViewMapper addressCommunicationViewMapper) {
        Widget2 provideWidget = addressCommunicationWidgetModule.provideWidget(addressCommunicationConfig, addressCommunicationViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
