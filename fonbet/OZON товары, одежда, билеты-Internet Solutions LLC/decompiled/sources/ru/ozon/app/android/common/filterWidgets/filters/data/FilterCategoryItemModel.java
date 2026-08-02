package ru.ozon.app.android.common.filterWidgets.filters.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.data.FiltersDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FilterCategoryItemModel;", "", "", "originalUrl", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$CategoryFilter$Category;", "category", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$CategoryFilter$Category;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOriginalUrl", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$CategoryFilter$Category;", "getCategory", "()Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$CategoryFilter$Category;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FilterCategoryItemModel {

    @NotNull
    private final FiltersDTO.Section.Filter.CategoryFilter.Category category;

    @NotNull
    private final String originalUrl;

    public FilterCategoryItemModel(@NotNull String originalUrl, @NotNull FiltersDTO.Section.Filter.CategoryFilter.Category category) {
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        Intrinsics.checkNotNullParameter(category, "category");
        this.originalUrl = originalUrl;
        this.category = category;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterCategoryItemModel)) {
            return false;
        }
        FilterCategoryItemModel filterCategoryItemModel = (FilterCategoryItemModel) other;
        return Intrinsics.d(this.originalUrl, filterCategoryItemModel.originalUrl) && Intrinsics.d(this.category, filterCategoryItemModel.category);
    }

    @NotNull
    public final FiltersDTO.Section.Filter.CategoryFilter.Category getCategory() {
        return this.category;
    }

    @NotNull
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    public int hashCode() {
        return this.category.hashCode() + (this.originalUrl.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "FilterCategoryItemModel(originalUrl=" + this.originalUrl + ", category=" + this.category + ")";
    }
}
