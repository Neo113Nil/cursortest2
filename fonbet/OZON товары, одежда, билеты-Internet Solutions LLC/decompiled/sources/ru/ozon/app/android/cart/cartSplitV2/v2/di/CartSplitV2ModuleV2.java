package ru.ozon.app.android.cart.cartSplitV2.v2.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.CartSplitV2SubWidgetsConfig;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.CartSplitV2AccessoriesViewMapper;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.CartSplitV2CellItemViewMapper;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsViewMapper;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.header.CartSplitV2HeaderViewMapper;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/di/CartSplitV2ModuleV2;", "", "<init>", "()V", "provideCartSplitV2Widget", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "subWidgetConfig", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2SubWidgetsConfig;", "headerViewMapper", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/CartSplitV2HeaderViewMapper;", "productViewMapperV2", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductViewMapper;", "controlsViewMapperV2", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/CartSplitV2ControlsViewMapper;", "accessoriesViewMapperV2", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/CartSplitV2AccessoriesViewMapper;", "islandSeparatorViewMapper", "Lru/ozon/app/android/islandSeparator/core/CommonIslandSeparatorViewMapper2;", "separatorViewMapper", "Lru/ozon/app/android/separator/core/SeparatorViewMapper;", "cartCellItemViewMapper", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/CartSplitV2CellItemViewMapper;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartSplitV2ModuleV2 {
    @NotNull
    public final Set<Widget2> provideCartSplitV2Widget(@NotNull CartSplitV2SubWidgetsConfig subWidgetConfig, @NotNull CartSplitV2HeaderViewMapper headerViewMapper, @NotNull CartSplitV2ProductViewMapper productViewMapperV2, @NotNull CartSplitV2ControlsViewMapper controlsViewMapperV2, @NotNull CartSplitV2AccessoriesViewMapper accessoriesViewMapperV2, @NotNull CommonIslandSeparatorViewMapper2 islandSeparatorViewMapper, @NotNull SeparatorViewMapper separatorViewMapper, @NotNull CartSplitV2CellItemViewMapper cartCellItemViewMapper) {
        Intrinsics.checkNotNullParameter(subWidgetConfig, "subWidgetConfig");
        Intrinsics.checkNotNullParameter(headerViewMapper, "headerViewMapper");
        Intrinsics.checkNotNullParameter(productViewMapperV2, "productViewMapperV2");
        Intrinsics.checkNotNullParameter(controlsViewMapperV2, "controlsViewMapperV2");
        Intrinsics.checkNotNullParameter(accessoriesViewMapperV2, "accessoriesViewMapperV2");
        Intrinsics.checkNotNullParameter(islandSeparatorViewMapper, "islandSeparatorViewMapper");
        Intrinsics.checkNotNullParameter(separatorViewMapper, "separatorViewMapper");
        Intrinsics.checkNotNullParameter(cartCellItemViewMapper, "cartCellItemViewMapper");
        return e0.a(new Widget2("cart", "cartSplit", subWidgetConfig, new ViewMapper2[]{islandSeparatorViewMapper, headerViewMapper, separatorViewMapper, productViewMapperV2, controlsViewMapperV2, accessoriesViewMapperV2, cartCellItemViewMapper}));
    }
}
