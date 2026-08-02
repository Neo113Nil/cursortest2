package ru.ozon.app.android.fresh.cart.widgets.reorderTile.di;

import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.data.ReorderTileConfig;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.ReorderTileViewMapper;
import ru.ozon.app.android.fresh.common.widgets.header.HeaderApi;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/di/ReorderTileWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "reorderTileConfig", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileConfig;", "reorderTileViewMapper", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileViewMapper;", "headerApi", "Lru/ozon/app/android/fresh/common/widgets/header/HeaderApi;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReorderTileWidgetModule {

    @NotNull
    public static final ReorderTileWidgetModule INSTANCE = new ReorderTileWidgetModule();

    private ReorderTileWidgetModule() {
    }

    @NotNull
    public final Widget2 provideWidget(@NotNull ReorderTileConfig reorderTileConfig, @NotNull ReorderTileViewMapper reorderTileViewMapper, HeaderApi headerApi) {
        Intrinsics.checkNotNullParameter(reorderTileConfig, "reorderTileConfig");
        Intrinsics.checkNotNullParameter(reorderTileViewMapper, "reorderTileViewMapper");
        ViewMapper2[] elements = {headerApi != null ? headerApi.getViewMapper() : null, reorderTileViewMapper};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new Widget2("express", "reorderTile", reorderTileConfig, (ViewMapper2[]) C7705l.B(elements).toArray(new ViewMapper2[0]));
    }
}
