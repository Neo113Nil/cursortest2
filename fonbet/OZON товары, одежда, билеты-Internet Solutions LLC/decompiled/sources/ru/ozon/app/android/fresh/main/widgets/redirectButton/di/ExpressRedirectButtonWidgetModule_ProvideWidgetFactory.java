package ru.ozon.app.android.fresh.main.widgets.redirectButton.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.redirectButton.data.ExpressRedirectButtonConfig;
import ru.ozon.app.android.fresh.main.widgets.redirectButton.presentation.ExpressRedirectButtonViewMapper;

/* loaded from: classes6.dex */
public final class ExpressRedirectButtonWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ExpressRedirectButtonWidgetModule expressRedirectButtonWidgetModule, ExpressRedirectButtonConfig expressRedirectButtonConfig, ExpressRedirectButtonViewMapper expressRedirectButtonViewMapper) {
        Widget2 provideWidget = expressRedirectButtonWidgetModule.provideWidget(expressRedirectButtonConfig, expressRedirectButtonViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
