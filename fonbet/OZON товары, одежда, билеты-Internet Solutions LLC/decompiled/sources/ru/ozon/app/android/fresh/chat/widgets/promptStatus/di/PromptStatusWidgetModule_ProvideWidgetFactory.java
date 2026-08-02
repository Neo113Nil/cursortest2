package ru.ozon.app.android.fresh.chat.widgets.promptStatus.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.chat.widgets.promptStatus.core.PromptStatusConfig;
import ru.ozon.app.android.fresh.chat.widgets.promptStatus.core.PromptStatusViewMapper;

/* loaded from: classes6.dex */
public final class PromptStatusWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(PromptStatusWidgetModule promptStatusWidgetModule, PromptStatusConfig promptStatusConfig, PromptStatusViewMapper promptStatusViewMapper) {
        Widget2 provideWidget = promptStatusWidgetModule.provideWidget(promptStatusConfig, promptStatusViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
