package ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.cart.widgets.cartTabs.data.CartTabsDTO;
import ru.ozon.app.android.fresh.cart.widgets.cartTabs.di.CartTabsDIComponent;
import ru.ozon.composer.compose.widget.scrollable.j;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/cart/widgets/cartTabs/di/CartTabsDIComponent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CartTabsViewMapperKt$cartTabsViewMapper$1$diComponent$2 extends AbstractC7737t implements Function0<CartTabsDIComponent> {
    final /* synthetic */ j<CartTabsDTO, CartTabsVO> $this_viewMapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartTabsViewMapperKt$cartTabsViewMapper$1$diComponent$2(j<CartTabsDTO, CartTabsVO> jVar) {
        super(0);
        this.$this_viewMapper = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CartTabsDIComponent invoke() {
        return (CartTabsDIComponent) this.$this_viewMapper.getWidgetComponentStorage().getComponent(CartTabsDIComponent.class);
    }
}
