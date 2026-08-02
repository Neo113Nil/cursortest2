package ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.data.CurtainGoalsV2Config;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.presentation.CurtainGoalsV2ViewMapper;

/* loaded from: classes6.dex */
public final class CurtainGoalsV2WidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CurtainGoalsV2WidgetModule curtainGoalsV2WidgetModule, CurtainGoalsV2Config curtainGoalsV2Config, CurtainGoalsV2ViewMapper curtainGoalsV2ViewMapper) {
        Widget2 provideWidget = curtainGoalsV2WidgetModule.provideWidget(curtainGoalsV2Config, curtainGoalsV2ViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
