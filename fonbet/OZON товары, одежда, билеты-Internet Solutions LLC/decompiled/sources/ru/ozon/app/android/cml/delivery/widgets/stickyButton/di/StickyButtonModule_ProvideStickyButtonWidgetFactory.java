package ru.ozon.app.android.cml.delivery.widgets.stickyButton.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cml.delivery.widgets.stickyButton.data.StickyButtonConfig;
import ru.ozon.app.android.cml.delivery.widgets.stickyButton.presentation.StickyButtonViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class StickyButtonModule_ProvideStickyButtonWidgetFactory implements e<Widget2> {
    public static Widget2 provideStickyButtonWidget(StickyButtonConfig stickyButtonConfig, StickyButtonViewMapper stickyButtonViewMapper) {
        Widget2 provideStickyButtonWidget = StickyButtonModule.INSTANCE.provideStickyButtonWidget(stickyButtonConfig, stickyButtonViewMapper);
        j.d(provideStickyButtonWidget);
        return provideStickyButtonWidget;
    }
}
