package ru.ozon.app.android.cart.alltocart.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cart.alltocart.core.AllToCartConfig;
import ru.ozon.app.android.cart.alltocart.core.AllToCartViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class AllToCartModule_ProvideAllToCartWidgetFactory implements e<Widget> {
    public static Widget provideAllToCartWidget(AllToCartConfig allToCartConfig, AllToCartViewMapper allToCartViewMapper) {
        Widget provideAllToCartWidget = AllToCartModule.provideAllToCartWidget(allToCartConfig, allToCartViewMapper);
        j.d(provideAllToCartWidget);
        return provideAllToCartWidget;
    }
}
