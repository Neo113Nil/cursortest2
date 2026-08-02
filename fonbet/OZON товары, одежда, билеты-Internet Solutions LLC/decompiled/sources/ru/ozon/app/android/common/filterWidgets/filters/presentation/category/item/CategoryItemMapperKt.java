package ru.ozon.app.android.common.filterWidgets.filters.presentation.category.item;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.data.FilterCategoryItemModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toVO", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/item/CategoryItemVO;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FilterCategoryItemModel;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CategoryItemMapperKt {
    @NotNull
    public static final CategoryItemVO toVO(@NotNull FilterCategoryItemModel filterCategoryItemModel) {
        Intrinsics.checkNotNullParameter(filterCategoryItemModel, "<this>");
        long hashCode = filterCategoryItemModel.hashCode();
        int hashCode2 = filterCategoryItemModel.getCategory().getCell().getTitle().hashCode();
        return new CategoryItemVO(hashCode, Integer.valueOf(hashCode2), filterCategoryItemModel.getCategory().getLevel(), filterCategoryItemModel.getOriginalUrl(), filterCategoryItemModel.getCategory().getCell());
    }
}
