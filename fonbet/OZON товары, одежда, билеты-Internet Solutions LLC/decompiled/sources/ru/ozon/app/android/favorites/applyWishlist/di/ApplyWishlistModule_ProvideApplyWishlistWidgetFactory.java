package ru.ozon.app.android.favorites.applyWishlist.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.favorites.applyWishlist.data.ApplyWishlistConfig;
import ru.ozon.app.android.favorites.applyWishlist.presentation.ApplyWishlistViewMapper;

/* loaded from: classes6.dex */
public final class ApplyWishlistModule_ProvideApplyWishlistWidgetFactory implements e<Widget2> {
    public static Widget2 provideApplyWishlistWidget(ApplyWishlistConfig applyWishlistConfig, ApplyWishlistViewMapper applyWishlistViewMapper) {
        Widget2 provideApplyWishlistWidget = ApplyWishlistModule.provideApplyWishlistWidget(applyWishlistConfig, applyWishlistViewMapper);
        j.d(provideApplyWishlistWidget);
        return provideApplyWishlistWidget;
    }
}
