package ru.ozon.app.android.favorites.createshoppinglist.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.favorites.createshoppinglist.data.CreateShoppingListConfig;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListSaveButtonViewMapper;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListSuggestItemViewMapper;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListSuggestTitleViewMapper;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListTitleViewMapper;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.spacer.CreateShoppingListSpacerViewMapper;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/di/CreateShoppingListModule;", "", "<init>", "()V", "provideCreateShoppingListWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/favorites/createshoppinglist/data/CreateShoppingListConfig;", "createShoppingListTitleViewMapper", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListTitleViewMapper;", "createShoppingListSuggestTitleViewMapper", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListSuggestTitleViewMapper;", "createShoppingListSuggestItemViewMapper", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListSuggestItemViewMapper;", "createShoppingListSpacerViewMapper", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/spacer/CreateShoppingListSpacerViewMapper;", "createShoppingListSaveButtonViewMapper", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListSaveButtonViewMapper;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CreateShoppingListModule {

    @NotNull
    public static final CreateShoppingListModule INSTANCE = new CreateShoppingListModule();

    private CreateShoppingListModule() {
    }

    @NotNull
    public static final Widget2 provideCreateShoppingListWidget(@NotNull CreateShoppingListConfig config, @NotNull CreateShoppingListTitleViewMapper createShoppingListTitleViewMapper, @NotNull CreateShoppingListSuggestTitleViewMapper createShoppingListSuggestTitleViewMapper, @NotNull CreateShoppingListSuggestItemViewMapper createShoppingListSuggestItemViewMapper, @NotNull CreateShoppingListSpacerViewMapper createShoppingListSpacerViewMapper, @NotNull CreateShoppingListSaveButtonViewMapper createShoppingListSaveButtonViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(createShoppingListTitleViewMapper, "createShoppingListTitleViewMapper");
        Intrinsics.checkNotNullParameter(createShoppingListSuggestTitleViewMapper, "createShoppingListSuggestTitleViewMapper");
        Intrinsics.checkNotNullParameter(createShoppingListSuggestItemViewMapper, "createShoppingListSuggestItemViewMapper");
        Intrinsics.checkNotNullParameter(createShoppingListSpacerViewMapper, "createShoppingListSpacerViewMapper");
        Intrinsics.checkNotNullParameter(createShoppingListSaveButtonViewMapper, "createShoppingListSaveButtonViewMapper");
        return new Widget2("favorites", "createShoppingList", config, new ViewMapper2[]{createShoppingListTitleViewMapper, createShoppingListSuggestTitleViewMapper, createShoppingListSuggestItemViewMapper, createShoppingListSpacerViewMapper, createShoppingListSaveButtonViewMapper});
    }
}
