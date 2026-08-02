package ru.ozon.app.android.common.filterWidgets.filters.presentation.rangefilter;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.data.RangeFilterModel;
import ru.ozon.app.android.storefront.core.atoms.data.RangeFilter;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVo", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/rangefilter/RangeFilterVO;", "Lru/ozon/app/android/common/filterWidgets/filters/data/RangeFilterModel;", "id", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RangeFilterVOKt {
    @NotNull
    public static final RangeFilterVO toVo(@NotNull RangeFilterModel rangeFilterModel, long j11) {
        Intrinsics.checkNotNullParameter(rangeFilterModel, "<this>");
        RangeFilter rangeFilter = rangeFilterModel.getRangeFilter();
        AtomActionDTO action = rangeFilterModel.getRangeFilter().getAction();
        return new RangeFilterVO(j11, RangeFilter.copy$default(rangeFilter, 0.0f, null, 0.0f, null, null, null, null, action != null ? AtomActionDTO.copy$default(action, AtomActionDTO.Behavior.CUSTOM, null, null, null, null, 30, null) : null, null, null, null, null, 3967, null), rangeFilterModel.getOriginalUrl(), rangeFilterModel.getShowSeparator());
    }
}
