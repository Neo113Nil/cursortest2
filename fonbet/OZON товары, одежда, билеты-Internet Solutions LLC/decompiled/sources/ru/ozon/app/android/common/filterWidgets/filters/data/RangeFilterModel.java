package ru.ozon.app.android.common.filterWidgets.filters.data;

import G.g;
import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.atoms.data.RangeFilter;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/RangeFilterModel;", "", "Lru/ozon/app/android/storefront/core/atoms/data/RangeFilter;", "rangeFilter", "", "originalUrl", "", "showSeparator", "<init>", "(Lru/ozon/app/android/storefront/core/atoms/data/RangeFilter;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/core/atoms/data/RangeFilter;", "getRangeFilter", "()Lru/ozon/app/android/storefront/core/atoms/data/RangeFilter;", "Ljava/lang/String;", "getOriginalUrl", "Z", "getShowSeparator", "()Z", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RangeFilterModel {

    @NotNull
    private final String originalUrl;

    @NotNull
    private final RangeFilter rangeFilter;
    private final boolean showSeparator;

    public RangeFilterModel(@NotNull RangeFilter rangeFilter, @NotNull String originalUrl, boolean z11) {
        Intrinsics.checkNotNullParameter(rangeFilter, "rangeFilter");
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        this.rangeFilter = rangeFilter;
        this.originalUrl = originalUrl;
        this.showSeparator = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RangeFilterModel)) {
            return false;
        }
        RangeFilterModel rangeFilterModel = (RangeFilterModel) other;
        return Intrinsics.d(this.rangeFilter, rangeFilterModel.rangeFilter) && Intrinsics.d(this.originalUrl, rangeFilterModel.originalUrl) && this.showSeparator == rangeFilterModel.showSeparator;
    }

    @NotNull
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    @NotNull
    public final RangeFilter getRangeFilter() {
        return this.rangeFilter;
    }

    public final boolean getShowSeparator() {
        return this.showSeparator;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showSeparator) + g.a(this.rangeFilter.hashCode() * 31, 31, this.originalUrl);
    }

    @NotNull
    public String toString() {
        RangeFilter rangeFilter = this.rangeFilter;
        String str = this.originalUrl;
        boolean z11 = this.showSeparator;
        StringBuilder sb2 = new StringBuilder("RangeFilterModel(rangeFilter=");
        sb2.append(rangeFilter);
        sb2.append(", originalUrl=");
        sb2.append(str);
        sb2.append(", showSeparator=");
        return a.a(")", sb2, z11);
    }
}
