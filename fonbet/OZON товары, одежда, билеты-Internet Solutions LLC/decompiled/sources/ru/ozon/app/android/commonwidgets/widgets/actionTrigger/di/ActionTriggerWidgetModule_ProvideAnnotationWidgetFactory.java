package ru.ozon.app.android.commonwidgets.widgets.actionTrigger.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.commonwidgets.widgets.actionTrigger.data.ActionTriggerConfig;
import ru.ozon.app.android.commonwidgets.widgets.actionTrigger.presentation.ActionTriggerViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class ActionTriggerWidgetModule_ProvideAnnotationWidgetFactory implements e<Widget2> {
    public static Widget2 provideAnnotationWidget(ActionTriggerConfig actionTriggerConfig, ActionTriggerViewMapper actionTriggerViewMapper) {
        Widget2 provideAnnotationWidget = ActionTriggerWidgetModule.provideAnnotationWidget(actionTriggerConfig, actionTriggerViewMapper);
        j.d(provideAnnotationWidget);
        return provideAnnotationWidget;
    }
}
