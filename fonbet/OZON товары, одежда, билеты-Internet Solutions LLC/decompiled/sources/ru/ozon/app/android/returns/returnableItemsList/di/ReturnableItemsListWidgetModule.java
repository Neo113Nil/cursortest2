package ru.ozon.app.android.returns.returnableItemsList.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.returns.returnableItemsList.core.ReturnableItemsListConfig;
import ru.ozon.app.android.returns.returnableItemsList.presentation.paginationMobile.viewMapper.PaginationMobileViewMapper;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.item.viewMapper.ReturnableItemsListViewMapper;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.title.viewMapper.ReturnableItemsTitleViewMapper;
import ru.ozon.app.android.returns.returnableItemsList.presentation.totalMobile.viewMapper.TotalMobileViewMapper;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/di/ReturnableItemsListWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/returns/returnableItemsList/core/ReturnableItemsListConfig;", "returnableItemsTitleViewMapper", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewMapper/ReturnableItemsTitleViewMapper;", "returnableItemsListViewMapper", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewMapper/ReturnableItemsListViewMapper;", "paginationMobileViewMapper", "Lru/ozon/app/android/returns/returnableItemsList/presentation/paginationMobile/viewMapper/PaginationMobileViewMapper;", "totalMobileViewMapper", "Lru/ozon/app/android/returns/returnableItemsList/presentation/totalMobile/viewMapper/TotalMobileViewMapper;", "islandSeparatorViewMapper", "Lru/ozon/app/android/islandSeparator/core/CommonIslandSeparatorViewMapper2;", "provideWidget$details_prodGoogleAllVendorsRelease", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnableItemsListWidgetModule {
    @NotNull
    public final Widget2 provideWidget$details_prodGoogleAllVendorsRelease(@NotNull ReturnableItemsListConfig config, @NotNull ReturnableItemsTitleViewMapper returnableItemsTitleViewMapper, @NotNull ReturnableItemsListViewMapper returnableItemsListViewMapper, @NotNull PaginationMobileViewMapper paginationMobileViewMapper, @NotNull TotalMobileViewMapper totalMobileViewMapper, @NotNull CommonIslandSeparatorViewMapper2 islandSeparatorViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(returnableItemsTitleViewMapper, "returnableItemsTitleViewMapper");
        Intrinsics.checkNotNullParameter(returnableItemsListViewMapper, "returnableItemsListViewMapper");
        Intrinsics.checkNotNullParameter(paginationMobileViewMapper, "paginationMobileViewMapper");
        Intrinsics.checkNotNullParameter(totalMobileViewMapper, "totalMobileViewMapper");
        Intrinsics.checkNotNullParameter(islandSeparatorViewMapper, "islandSeparatorViewMapper");
        return new Widget2("rms", "returnableItemsList", config, new ViewMapper2[]{returnableItemsTitleViewMapper, returnableItemsListViewMapper, paginationMobileViewMapper, totalMobileViewMapper, islandSeparatorViewMapper});
    }
}
