package ru.ozon.app.android.common.filterWidgets.filters.presentation.multiplerangesfilter;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.rangefilter.RangeFilterVO;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.TagFilterVO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/multiplerangesfilter/MultipleRangesFilterVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/rangefilter/RangeFilterVO;", "rangeFilterVO", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/TagFilterVO;", "tagFilterVO", "<init>", "(JLru/ozon/app/android/common/filterWidgets/filters/presentation/rangefilter/RangeFilterVO;Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/TagFilterVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/rangefilter/RangeFilterVO;", "getRangeFilterVO", "()Lru/ozon/app/android/common/filterWidgets/filters/presentation/rangefilter/RangeFilterVO;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/TagFilterVO;", "getTagFilterVO", "()Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/TagFilterVO;", "getScrollWidgetKey", "()Ljava/lang/Integer;", "scrollWidgetKey", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MultipleRangesFilterVO implements c {
    private final long id;
    private final RangeFilterVO rangeFilterVO;
    private final TagFilterVO tagFilterVO;

    public MultipleRangesFilterVO(long j11, RangeFilterVO rangeFilterVO, TagFilterVO tagFilterVO) {
        this.id = j11;
        this.rangeFilterVO = rangeFilterVO;
        this.tagFilterVO = tagFilterVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultipleRangesFilterVO)) {
            return false;
        }
        MultipleRangesFilterVO multipleRangesFilterVO = (MultipleRangesFilterVO) other;
        return this.id == multipleRangesFilterVO.id && Intrinsics.d(this.rangeFilterVO, multipleRangesFilterVO.rangeFilterVO) && Intrinsics.d(this.tagFilterVO, multipleRangesFilterVO.tagFilterVO);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final RangeFilterVO getRangeFilterVO() {
        return this.rangeFilterVO;
    }

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        return Integer.valueOf(Long.hashCode(getId()));
    }

    public final TagFilterVO getTagFilterVO() {
        return this.tagFilterVO;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        RangeFilterVO rangeFilterVO = this.rangeFilterVO;
        int hashCode2 = (hashCode + (rangeFilterVO == null ? 0 : rangeFilterVO.hashCode())) * 31;
        TagFilterVO tagFilterVO = this.tagFilterVO;
        return hashCode2 + (tagFilterVO != null ? tagFilterVO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MultipleRangesFilterVO(id=" + this.id + ", rangeFilterVO=" + this.rangeFilterVO + ", tagFilterVO=" + this.tagFilterVO + ")";
    }
}
