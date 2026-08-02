package ru.ozon.app.android.favorites.wishlistMultiselect.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.favorites.wishlistMultiselect.data.WishlistMultiselectConfig;
import ru.ozon.app.android.favorites.wishlistMultiselect.presentation.WishlistMultiselectNoUiViewMapper;

/* loaded from: classes6.dex */
public final class WishlistMultiselectModule_ProvideWishlistMultiselectWidgetFactory implements e<Widget2> {
    public static Widget2 provideWishlistMultiselectWidget(WishlistMultiselectConfig wishlistMultiselectConfig, WishlistMultiselectNoUiViewMapper wishlistMultiselectNoUiViewMapper) {
        Widget2 provideWishlistMultiselectWidget = WishlistMultiselectModule.INSTANCE.provideWishlistMultiselectWidget(wishlistMultiselectConfig, wishlistMultiselectNoUiViewMapper);
        j.d(provideWishlistMultiselectWidget);
        return provideWishlistMultiselectWidget;
    }
}
