package ru.ozon.app.android.button.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.button.core.ActionButtonConfig;
import ru.ozon.app.android.button.core.ActionButtonOverlayViewMapper;
import ru.ozon.app.android.button.core.ActionButtonViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class ActionButtonModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ActionButtonModule actionButtonModule, ActionButtonConfig actionButtonConfig, ActionButtonViewMapper actionButtonViewMapper, ActionButtonOverlayViewMapper actionButtonOverlayViewMapper) {
        Widget2 provideWidget = actionButtonModule.provideWidget(actionButtonConfig, actionButtonViewMapper, actionButtonOverlayViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
