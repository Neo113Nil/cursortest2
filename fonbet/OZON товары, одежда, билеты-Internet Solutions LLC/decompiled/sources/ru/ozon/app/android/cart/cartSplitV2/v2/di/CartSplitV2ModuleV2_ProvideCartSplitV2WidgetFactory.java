package ru.ozon.app.android.cart.cartSplitV2.v2.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.CartSplitV2SubWidgetsConfig;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.CartSplitV2AccessoriesViewMapper;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.CartSplitV2CellItemViewMapper;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsViewMapper;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.header.CartSplitV2HeaderViewMapper;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;

/* loaded from: classes6.dex */
public final class CartSplitV2ModuleV2_ProvideCartSplitV2WidgetFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideCartSplitV2Widget(CartSplitV2ModuleV2 cartSplitV2ModuleV2, CartSplitV2SubWidgetsConfig cartSplitV2SubWidgetsConfig, CartSplitV2HeaderViewMapper cartSplitV2HeaderViewMapper, CartSplitV2ProductViewMapper cartSplitV2ProductViewMapper, CartSplitV2ControlsViewMapper cartSplitV2ControlsViewMapper, CartSplitV2AccessoriesViewMapper cartSplitV2AccessoriesViewMapper, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2, SeparatorViewMapper separatorViewMapper, CartSplitV2CellItemViewMapper cartSplitV2CellItemViewMapper) {
        Set<Widget2> provideCartSplitV2Widget = cartSplitV2ModuleV2.provideCartSplitV2Widget(cartSplitV2SubWidgetsConfig, cartSplitV2HeaderViewMapper, cartSplitV2ProductViewMapper, cartSplitV2ControlsViewMapper, cartSplitV2AccessoriesViewMapper, commonIslandSeparatorViewMapper2, separatorViewMapper, cartSplitV2CellItemViewMapper);
        j.d(provideCartSplitV2Widget);
        return provideCartSplitV2Widget;
    }
}
