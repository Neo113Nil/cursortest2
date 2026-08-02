package ru.ozon.app.android.commonwidgets.widgets.closeButton.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.commonwidgets.widgets.closeButton.data.CloseButtonConfig;
import ru.ozon.app.android.commonwidgets.widgets.closeButton.presentation.CloseButtonViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class CloseButtonModule_ProvideCloseButtonWidgetFactory implements e<Widget> {
    public static Widget provideCloseButtonWidget(CloseButtonConfig closeButtonConfig, CloseButtonViewMapper closeButtonViewMapper) {
        Widget provideCloseButtonWidget = CloseButtonModule.provideCloseButtonWidget(closeButtonConfig, closeButtonViewMapper);
        j.d(provideCloseButtonWidget);
        return provideCloseButtonWidget;
    }
}
