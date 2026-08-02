package ru.ozon.app.android.search.catalog.components.categoryMenu.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.catalog.components.categoryMenu.data.CategoryMenuConfig;
import ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.button.CategoryMenuButtonOverlayViewMapper;
import ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.item.CategoryMenuItemViewMapper;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/catalog/components/categoryMenu/di/CategoryMenuDiModule;", "", "<init>", "()V", "provideCategoryMenuWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "categoryMenuConfig", "Lru/ozon/app/android/search/catalog/components/categoryMenu/data/CategoryMenuConfig;", "categoryMenuItemViewMapper", "Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/item/CategoryMenuItemViewMapper;", "categoryMenuButtonOverlayViewMapper", "Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/button/CategoryMenuButtonOverlayViewMapper;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CategoryMenuDiModule {

    @NotNull
    public static final CategoryMenuDiModule INSTANCE = new CategoryMenuDiModule();

    private CategoryMenuDiModule() {
    }

    @NotNull
    public final Widget2 provideCategoryMenuWidget(@NotNull CategoryMenuConfig categoryMenuConfig, @NotNull CategoryMenuItemViewMapper categoryMenuItemViewMapper, @NotNull CategoryMenuButtonOverlayViewMapper categoryMenuButtonOverlayViewMapper) {
        Intrinsics.checkNotNullParameter(categoryMenuConfig, "categoryMenuConfig");
        Intrinsics.checkNotNullParameter(categoryMenuItemViewMapper, "categoryMenuItemViewMapper");
        Intrinsics.checkNotNullParameter(categoryMenuButtonOverlayViewMapper, "categoryMenuButtonOverlayViewMapper");
        return new Widget2("catalog", "categoryMenu", categoryMenuConfig, new ViewMapper2[]{categoryMenuItemViewMapper, categoryMenuButtonOverlayViewMapper});
    }
}
