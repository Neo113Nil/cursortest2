package ru.ozon.app.android.cart.cartSplitV2.v1.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v1.data.CartSplitV2Config;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemViewMapper;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title.CartSplitV2TitleViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/di/CartSplitV2Module;", "", "<init>", "()V", "provideCartSplitV2Widget", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2Config;", "itemViewMapper", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemViewMapper;", "titleViewMapper", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleViewMapper;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartSplitV2Module {
    @NotNull
    public final Set<Widget2> provideCartSplitV2Widget(@NotNull CartSplitV2Config config, @NotNull CartSplitV2ItemViewMapper itemViewMapper, @NotNull CartSplitV2TitleViewMapper titleViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(itemViewMapper, "itemViewMapper");
        Intrinsics.checkNotNullParameter(titleViewMapper, "titleViewMapper");
        return e0.a(new Widget2("cart", "cartSplit", config, new ViewMapper2[]{titleViewMapper, itemViewMapper}));
    }
}
