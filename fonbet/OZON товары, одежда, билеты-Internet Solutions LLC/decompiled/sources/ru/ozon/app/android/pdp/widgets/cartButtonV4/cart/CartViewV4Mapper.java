package ru.ozon.app.android.pdp.widgets.cartButtonV4.cart;

import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonPreCreateVHState;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartViewV4Mapper;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/BaseCartV4ViewMapper;", "<init>", "()V", "Ll10/i;", "container", "Ld20/b;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;", "createHolder", "(Ll10/i;)Ld20/b;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartViewV4Mapper extends BaseCartV4ViewMapper {
    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        CartButtonV4Dto cartButtonV4Dto = state instanceof CartButtonV4Dto ? (CartButtonV4Dto) state : null;
        return cartButtonV4Dto != null && cartButtonV4Dto.getRelatedProductsCurtain() == null && (cartButtonV4Dto.getConfiguration() instanceof CartButtonV4Dto.Configuration.CartData);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<CartVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        CartViewBinder cartViewBinder = component().getCartViewBinder();
        CartButtonPreCreateVHState cachedState = cartPreCreateVHStateHolder().getCachedState();
        Intrinsics.g(cachedState, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartPreCreateViewHolderState");
        return new CartButtonOverlayViewHolder(container, cartViewBinder, ((CartPreCreateViewHolderState) cachedState).getHasShadow(), component().getFeatureChecker());
    }
}
