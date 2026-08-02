package ru.ozon.app.android.common.filterWidgets.filters.data;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.brandFilter.title.BrandTitleVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVO", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandFilter/title/BrandTitleVO;", "Lru/ozon/app/android/common/filterWidgets/filters/data/BrandFilterTitleModel;", "id", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BrandFilterTitleModelKt {
    @NotNull
    public static final BrandTitleVO toVO(@NotNull BrandFilterTitleModel brandFilterTitleModel, long j11) {
        Intrinsics.checkNotNullParameter(brandFilterTitleModel, "<this>");
        String title = brandFilterTitleModel.getTitle();
        Map<String, TokenizedTrackingInfo> trackingInfo = brandFilterTitleModel.getTrackingInfo();
        return new BrandTitleVO(j11, title, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
