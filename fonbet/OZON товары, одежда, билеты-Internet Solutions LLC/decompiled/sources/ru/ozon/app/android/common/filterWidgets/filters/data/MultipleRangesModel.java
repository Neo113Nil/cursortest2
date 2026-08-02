package ru.ozon.app.android.common.filterWidgets.filters.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/MultipleRangesModel;", "", "Lru/ozon/app/android/common/filterWidgets/filters/data/RangeFilterModel;", "rangesFilter", "Lru/ozon/app/android/common/filterWidgets/filters/data/TagFilterModel;", "tagFilter", "<init>", "(Lru/ozon/app/android/common/filterWidgets/filters/data/RangeFilterModel;Lru/ozon/app/android/common/filterWidgets/filters/data/TagFilterModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/common/filterWidgets/filters/data/RangeFilterModel;", "getRangesFilter", "()Lru/ozon/app/android/common/filterWidgets/filters/data/RangeFilterModel;", "Lru/ozon/app/android/common/filterWidgets/filters/data/TagFilterModel;", "getTagFilter", "()Lru/ozon/app/android/common/filterWidgets/filters/data/TagFilterModel;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MultipleRangesModel {
    private final RangeFilterModel rangesFilter;
    private final TagFilterModel tagFilter;

    public MultipleRangesModel(RangeFilterModel rangeFilterModel, TagFilterModel tagFilterModel) {
        this.rangesFilter = rangeFilterModel;
        this.tagFilter = tagFilterModel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultipleRangesModel)) {
            return false;
        }
        MultipleRangesModel multipleRangesModel = (MultipleRangesModel) other;
        return Intrinsics.d(this.rangesFilter, multipleRangesModel.rangesFilter) && Intrinsics.d(this.tagFilter, multipleRangesModel.tagFilter);
    }

    public final RangeFilterModel getRangesFilter() {
        return this.rangesFilter;
    }

    public final TagFilterModel getTagFilter() {
        return this.tagFilter;
    }

    public int hashCode() {
        RangeFilterModel rangeFilterModel = this.rangesFilter;
        int hashCode = (rangeFilterModel == null ? 0 : rangeFilterModel.hashCode()) * 31;
        TagFilterModel tagFilterModel = this.tagFilter;
        return hashCode + (tagFilterModel != null ? tagFilterModel.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MultipleRangesModel(rangesFilter=" + this.rangesFilter + ", tagFilter=" + this.tagFilter + ")";
    }
}
