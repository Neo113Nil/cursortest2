package ru.ozon.app.android.favorites.buttonStack.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.favorites.buttonStack.data.ButtonStackConfig;
import ru.ozon.app.android.favorites.buttonStack.presentation.ButtonStackViewMapper;
import ru.ozon.app.android.favorites.buttonStack.presentation.OverlayStickyBannerViewMapper;

/* loaded from: classes6.dex */
public final class ButtonStackWidgetModule_ProvideButtonStackWidgetFactory implements e<Widget2> {
    public static Widget2 provideButtonStackWidget(ButtonStackConfig buttonStackConfig, ButtonStackViewMapper buttonStackViewMapper, OverlayStickyBannerViewMapper overlayStickyBannerViewMapper) {
        Widget2 provideButtonStackWidget = ButtonStackWidgetModule.provideButtonStackWidget(buttonStackConfig, buttonStackViewMapper, overlayStickyBannerViewMapper);
        j.d(provideButtonStackWidget);
        return provideButtonStackWidget;
    }
}
