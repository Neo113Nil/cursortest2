package ru.ozon.app.android.common.filterWidgets.filtervalues.data.api.applyfilters;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.api.applyfilters.ApplySearchFiltersRequest;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ApplyFilterShortRequestInfo;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u001a\"\u0010\b\u001a\u00020\t*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\n"}, d2 = {"toRequest", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/api/applyfilters/ApplySearchFiltersRequest;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/ApplyFilterShortRequestInfo;", "ids", "", "", "isInverted", "", "extractApplyFilterInfo", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/api/applyfilters/ApplySearchFiltersRequest$ApplyFilters;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MapperKt {
    private static final ApplySearchFiltersRequest.ApplyFilters extractApplyFilterInfo(ApplyFilterShortRequestInfo applyFilterShortRequestInfo, List<String> list, boolean z11) {
        return new ApplySearchFiltersRequest.ApplyFilters(applyFilterShortRequestInfo.getKey(), applyFilterShortRequestInfo.getType(), z11, list);
    }

    @NotNull
    public static final ApplySearchFiltersRequest toRequest(@NotNull ApplyFilterShortRequestInfo applyFilterShortRequestInfo, @NotNull List<String> ids, boolean z11) {
        Intrinsics.checkNotNullParameter(applyFilterShortRequestInfo, "<this>");
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new ApplySearchFiltersRequest(applyFilterShortRequestInfo.getRefer(), C7714v.a0(extractApplyFilterInfo(applyFilterShortRequestInfo, ids, z11)));
    }
}
