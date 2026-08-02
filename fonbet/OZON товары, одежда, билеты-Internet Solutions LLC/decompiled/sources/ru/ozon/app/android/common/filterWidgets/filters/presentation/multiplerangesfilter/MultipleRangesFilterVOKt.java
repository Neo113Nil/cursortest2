package ru.ozon.app.android.common.filterWidgets.filters.presentation.multiplerangesfilter;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.data.MultipleRangesModel;
import ru.ozon.app.android.common.filterWidgets.filters.data.RangeFilterModel;
import ru.ozon.app.android.common.filterWidgets.filters.data.TagFilterModel;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.rangefilter.RangeFilterVO;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.rangefilter.RangeFilterVOKt;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.TagFilterVOKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVo", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/multiplerangesfilter/MultipleRangesFilterVO;", "Lru/ozon/app/android/common/filterWidgets/filters/data/MultipleRangesModel;", "stateId", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MultipleRangesFilterVOKt {
    @NotNull
    public static final MultipleRangesFilterVO toVo(@NotNull MultipleRangesModel multipleRangesModel, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(multipleRangesModel, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        RangeFilterModel rangesFilter = multipleRangesModel.getRangesFilter();
        RangeFilterVO vo = rangesFilter != null ? RangeFilterVOKt.toVo(rangesFilter, hashCode) : null;
        TagFilterModel tagFilter = multipleRangesModel.getTagFilter();
        return new MultipleRangesFilterVO(hashCode, vo, tagFilter != null ? TagFilterVOKt.toVo(tagFilter, stateId) : null);
    }
}
