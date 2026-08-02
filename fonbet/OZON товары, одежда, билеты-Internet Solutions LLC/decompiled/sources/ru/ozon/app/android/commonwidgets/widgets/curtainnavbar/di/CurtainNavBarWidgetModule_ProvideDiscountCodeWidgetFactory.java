package ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.core.CurtainNavBarConfig;
import ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.core.CurtainNavBarViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class CurtainNavBarWidgetModule_ProvideDiscountCodeWidgetFactory implements e<Widget> {
    public static Widget provideDiscountCodeWidget(CurtainNavBarConfig curtainNavBarConfig, CurtainNavBarViewMapper curtainNavBarViewMapper) {
        Widget provideDiscountCodeWidget = CurtainNavBarWidgetModule.provideDiscountCodeWidget(curtainNavBarConfig, curtainNavBarViewMapper);
        j.d(provideDiscountCodeWidget);
        return provideDiscountCodeWidget;
    }
}
