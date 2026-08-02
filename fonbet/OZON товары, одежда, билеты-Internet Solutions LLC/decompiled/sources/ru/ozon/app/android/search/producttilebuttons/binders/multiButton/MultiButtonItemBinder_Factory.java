package ru.ozon.app.android.search.producttilebuttons.binders.multiButton;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.cart.ui.CartAtomBinder;
import ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate.SwitchingButtonSingleAtomDelegate;

/* loaded from: classes13.dex */
public final class MultiButtonItemBinder_Factory implements e<MultiButtonItemBinder> {
    private final a<CartAtomBinder> cartAtomBinderProvider;
    private final a<SwitchingButtonSingleAtomDelegate> switchingButtonBinderProvider;

    public MultiButtonItemBinder_Factory(a<CartAtomBinder> aVar, a<SwitchingButtonSingleAtomDelegate> aVar2) {
        this.cartAtomBinderProvider = aVar;
        this.switchingButtonBinderProvider = aVar2;
    }

    public static MultiButtonItemBinder_Factory create(a<CartAtomBinder> aVar, a<SwitchingButtonSingleAtomDelegate> aVar2) {
        return new MultiButtonItemBinder_Factory(aVar, aVar2);
    }

    public static MultiButtonItemBinder newInstance(CartAtomBinder cartAtomBinder, SwitchingButtonSingleAtomDelegate switchingButtonSingleAtomDelegate) {
        return new MultiButtonItemBinder(cartAtomBinder, switchingButtonSingleAtomDelegate);
    }

    @Override // Pc.a
    public MultiButtonItemBinder get() {
        return newInstance(this.cartAtomBinderProvider.get(), this.switchingButtonBinderProvider.get());
    }
}
