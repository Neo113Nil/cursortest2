package ru.ozon.app.android.favorites.shoppinglistv2.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.favorites.shoppinglistv2.data.ShoppingListsV2Config;
import ru.ozon.app.android.favorites.shoppinglistv2.presentation.createlist.ShoppingListsV2CreateListViewMapper;
import ru.ozon.app.android.favorites.shoppinglistv2.presentation.item.ShoppingListsV2ItemViewMapper;
import ru.ozon.app.android.favorites.shoppinglistv2.presentation.title.ShoppingListsV2TitleViewMapper;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/favorites/shoppinglistv2/di/ShoppingListsV2Module;", "", "<init>", "()V", "provideShoppingListsV2Widget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/favorites/shoppinglistv2/data/ShoppingListsV2Config;", "shoppingListsV2CreateListViewMapper", "Lru/ozon/app/android/favorites/shoppinglistv2/presentation/createlist/ShoppingListsV2CreateListViewMapper;", "shoppingListsV2ItemViewMapper", "Lru/ozon/app/android/favorites/shoppinglistv2/presentation/item/ShoppingListsV2ItemViewMapper;", "shoppingListsV2TitleViewMapper", "Lru/ozon/app/android/favorites/shoppinglistv2/presentation/title/ShoppingListsV2TitleViewMapper;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShoppingListsV2Module {

    @NotNull
    public static final ShoppingListsV2Module INSTANCE = new ShoppingListsV2Module();

    private ShoppingListsV2Module() {
    }

    @NotNull
    public static final Widget2 provideShoppingListsV2Widget(@NotNull ShoppingListsV2Config config, @NotNull ShoppingListsV2CreateListViewMapper shoppingListsV2CreateListViewMapper, @NotNull ShoppingListsV2ItemViewMapper shoppingListsV2ItemViewMapper, @NotNull ShoppingListsV2TitleViewMapper shoppingListsV2TitleViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(shoppingListsV2CreateListViewMapper, "shoppingListsV2CreateListViewMapper");
        Intrinsics.checkNotNullParameter(shoppingListsV2ItemViewMapper, "shoppingListsV2ItemViewMapper");
        Intrinsics.checkNotNullParameter(shoppingListsV2TitleViewMapper, "shoppingListsV2TitleViewMapper");
        return new Widget2("favorites", "shoppingLists", config, new ViewMapper2[]{shoppingListsV2CreateListViewMapper, shoppingListsV2TitleViewMapper, shoppingListsV2ItemViewMapper});
    }
}
