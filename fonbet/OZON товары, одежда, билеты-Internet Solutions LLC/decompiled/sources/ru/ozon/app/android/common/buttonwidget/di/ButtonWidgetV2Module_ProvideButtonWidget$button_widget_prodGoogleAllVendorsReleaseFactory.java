package ru.ozon.app.android.common.buttonwidget.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.common.buttonwidget.core.ButtonConfig;
import ru.ozon.app.android.common.buttonwidget.core.ButtonV2ViewMapper;
import ru.ozon.app.android.common.buttonwidget.core.ButtonV3ViewMapper;
import ru.ozon.app.android.common.buttonwidget.core.ButtonViewMapper;
import ru.ozon.app.android.common.buttonwidget.sticky.ButtonViewStickyNoUIMapper;
import ru.ozon.app.android.common.buttonwidget.sticky.ButtonViewV3StickyNoUIMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class ButtonWidgetV2Module_ProvideButtonWidget$button_widget_prodGoogleAllVendorsReleaseFactory implements e<Widget2> {
    public static Widget2 provideButtonWidget$button_widget_prodGoogleAllVendorsRelease(ButtonConfig buttonConfig, ButtonViewMapper buttonViewMapper, ButtonV2ViewMapper buttonV2ViewMapper, ButtonV3ViewMapper buttonV3ViewMapper, ButtonViewStickyNoUIMapper buttonViewStickyNoUIMapper, ButtonViewV3StickyNoUIMapper buttonViewV3StickyNoUIMapper) {
        Widget2 provideButtonWidget$button_widget_prodGoogleAllVendorsRelease = ButtonWidgetV2Module.INSTANCE.provideButtonWidget$button_widget_prodGoogleAllVendorsRelease(buttonConfig, buttonViewMapper, buttonV2ViewMapper, buttonV3ViewMapper, buttonViewStickyNoUIMapper, buttonViewV3StickyNoUIMapper);
        j.d(provideButtonWidget$button_widget_prodGoogleAllVendorsRelease);
        return provideButtonWidget$button_widget_prodGoogleAllVendorsRelease;
    }
}
