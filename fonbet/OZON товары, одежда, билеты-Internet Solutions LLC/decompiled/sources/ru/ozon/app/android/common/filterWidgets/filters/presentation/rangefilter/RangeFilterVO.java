package ru.ozon.app.android.common.filterWidgets.filters.presentation.rangefilter;

import D40.a;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.atoms.data.RangeFilter;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/rangefilter/RangeFilterVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/storefront/core/atoms/data/RangeFilter;", "rangeFilter", "", "originalUrl", "", "showSeparator", "<init>", "(JLru/ozon/app/android/storefront/core/atoms/data/RangeFilter;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/storefront/core/atoms/data/RangeFilter;", "getRangeFilter", "()Lru/ozon/app/android/storefront/core/atoms/data/RangeFilter;", "Ljava/lang/String;", "getOriginalUrl", "Z", "getShowSeparator", "()Z", "getScrollWidgetKey", "()Ljava/lang/Integer;", "scrollWidgetKey", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RangeFilterVO implements c {
    private final long id;

    @NotNull
    private final String originalUrl;

    @NotNull
    private final RangeFilter rangeFilter;
    private final boolean showSeparator;

    public RangeFilterVO(long j11, @NotNull RangeFilter rangeFilter, @NotNull String originalUrl, boolean z11) {
        Intrinsics.checkNotNullParameter(rangeFilter, "rangeFilter");
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        this.id = j11;
        this.rangeFilter = rangeFilter;
        this.originalUrl = originalUrl;
        this.showSeparator = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RangeFilterVO)) {
            return false;
        }
        RangeFilterVO rangeFilterVO = (RangeFilterVO) other;
        return this.id == rangeFilterVO.id && Intrinsics.d(this.rangeFilter, rangeFilterVO.rangeFilter) && Intrinsics.d(this.originalUrl, rangeFilterVO.originalUrl) && this.showSeparator == rangeFilterVO.showSeparator;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    @NotNull
    public final RangeFilter getRangeFilter() {
        return this.rangeFilter;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        String title = this.rangeFilter.getTitle();
        if (title != null) {
            return Integer.valueOf(title.hashCode());
        }
        return null;
    }

    public final boolean getShowSeparator() {
        return this.showSeparator;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return Boolean.hashCode(this.showSeparator) + g.a((this.rangeFilter.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.originalUrl);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        RangeFilter rangeFilter = this.rangeFilter;
        String str = this.originalUrl;
        boolean z11 = this.showSeparator;
        StringBuilder sb2 = new StringBuilder("RangeFilterVO(id=");
        sb2.append(j11);
        sb2.append(", rangeFilter=");
        sb2.append(rangeFilter);
        a.g(", originalUrl=", str, ", showSeparator=", sb2, z11);
        sb2.append(")");
        return sb2.toString();
    }
}
