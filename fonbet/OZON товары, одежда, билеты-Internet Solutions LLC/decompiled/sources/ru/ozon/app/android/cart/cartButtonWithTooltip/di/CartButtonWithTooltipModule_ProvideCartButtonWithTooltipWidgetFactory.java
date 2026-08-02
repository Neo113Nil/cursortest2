package ru.ozon.app.android.cart.cartButtonWithTooltip.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cart.cartButtonWithTooltip.data.CartButtonWithTooltipConfig;
import ru.ozon.app.android.cart.cartButtonWithTooltip.presentation.CartButtonWithTooltipViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class CartButtonWithTooltipModule_ProvideCartButtonWithTooltipWidgetFactory implements e<Widget2> {
    public static Widget2 provideCartButtonWithTooltipWidget(CartButtonWithTooltipConfig cartButtonWithTooltipConfig, CartButtonWithTooltipViewMapper cartButtonWithTooltipViewMapper) {
        Widget2 provideCartButtonWithTooltipWidget = CartButtonWithTooltipModule.INSTANCE.provideCartButtonWithTooltipWidget(cartButtonWithTooltipConfig, cartButtonWithTooltipViewMapper);
        j.d(provideCartButtonWithTooltipWidget);
        return provideCartButtonWithTooltipWidget;
    }
}
