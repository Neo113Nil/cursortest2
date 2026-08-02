package ru.ozon.app.android.search.widgets.aiHelper.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.aiHelper.data.AiHelperConfig;
import ru.ozon.app.android.search.widgets.aiHelper.presentation.AiHelperViewMapper;

/* loaded from: classes7.dex */
public final class AiHelperModule_ProvideFeedbackTileWidgetFactory implements e<Widget2> {
    public static Widget2 provideFeedbackTileWidget(AiHelperConfig aiHelperConfig, AiHelperViewMapper aiHelperViewMapper) {
        Widget2 provideFeedbackTileWidget = AiHelperModule.INSTANCE.provideFeedbackTileWidget(aiHelperConfig, aiHelperViewMapper);
        j.d(provideFeedbackTileWidget);
        return provideFeedbackTileWidget;
    }
}
