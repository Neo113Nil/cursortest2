package ru.ozon.app.android.cart.cartSplitV2.v1.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.cart.cartSplitV2.v1.data.CartSplitV2Config;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemViewMapper;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title.CartSplitV2TitleViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class CartSplitV2Module_ProvideCartSplitV2WidgetFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideCartSplitV2Widget(CartSplitV2Module cartSplitV2Module, CartSplitV2Config cartSplitV2Config, CartSplitV2ItemViewMapper cartSplitV2ItemViewMapper, CartSplitV2TitleViewMapper cartSplitV2TitleViewMapper) {
        Set<Widget2> provideCartSplitV2Widget = cartSplitV2Module.provideCartSplitV2Widget(cartSplitV2Config, cartSplitV2ItemViewMapper, cartSplitV2TitleViewMapper);
        j.d(provideCartSplitV2Widget);
        return provideCartSplitV2Widget;
    }
}
