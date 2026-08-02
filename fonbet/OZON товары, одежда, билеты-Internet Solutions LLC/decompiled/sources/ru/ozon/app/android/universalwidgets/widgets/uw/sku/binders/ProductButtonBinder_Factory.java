package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.cart.ui.CartAtomBinder;

/* loaded from: classes2.dex */
public final class ProductButtonBinder_Factory implements e<ProductButtonBinder> {
    private final a<CartAtomBinder> cartAtomBinderProvider;

    public ProductButtonBinder_Factory(a<CartAtomBinder> aVar) {
        this.cartAtomBinderProvider = aVar;
    }

    public static ProductButtonBinder_Factory create(a<CartAtomBinder> aVar) {
        return new ProductButtonBinder_Factory(aVar);
    }

    public static ProductButtonBinder newInstance(CartAtomBinder cartAtomBinder) {
        return new ProductButtonBinder(cartAtomBinder);
    }

    @Override // Pc.a
    public ProductButtonBinder get() {
        return newInstance(this.cartAtomBinderProvider.get());
    }
}
