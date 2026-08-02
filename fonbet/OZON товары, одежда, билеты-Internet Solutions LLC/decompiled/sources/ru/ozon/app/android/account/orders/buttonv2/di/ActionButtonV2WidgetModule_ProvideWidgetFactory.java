package ru.ozon.app.android.account.orders.buttonv2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.account.orders.buttonv2.core.ActionButtonV2Config;
import ru.ozon.app.android.account.orders.buttonv2.presentation.ActionButtonV2OverlayWidgetViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class ActionButtonV2WidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ActionButtonV2WidgetModule actionButtonV2WidgetModule, ActionButtonV2Config actionButtonV2Config, ActionButtonV2OverlayWidgetViewMapper actionButtonV2OverlayWidgetViewMapper) {
        Widget2 provideWidget = actionButtonV2WidgetModule.provideWidget(actionButtonV2Config, actionButtonV2OverlayWidgetViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
