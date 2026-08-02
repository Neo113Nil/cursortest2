package ru.ozon.app.android.account.orders.recipientWidget.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.account.orders.recipientWidget.RecipientConfig;
import ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class RecipientWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(RecipientWidgetModule recipientWidgetModule, RecipientConfig recipientConfig, RecipientViewMapper recipientViewMapper) {
        Widget2 provideWidget = recipientWidgetModule.provideWidget(recipientConfig, recipientViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
