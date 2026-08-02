package ru.ozon.app.android.fresh.chat.widgets.responseActions.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.chat.widgets.responseActions.core.ResponseActionsConfig;
import ru.ozon.app.android.fresh.chat.widgets.responseActions.core.ResponseActionsViewMapper;

/* loaded from: classes6.dex */
public final class ResponseActionsWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ResponseActionsWidgetModule responseActionsWidgetModule, ResponseActionsConfig responseActionsConfig, ResponseActionsViewMapper responseActionsViewMapper) {
        Widget2 provideWidget = responseActionsWidgetModule.provideWidget(responseActionsConfig, responseActionsViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
