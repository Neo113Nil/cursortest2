package ru.ozon.app.android.common.filterWidgets.filters.data;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.brandFilter.cells.BrandCellVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"cellsRadius", "", "defaultTopInset", "", "defaultBottomInset", "toVO", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandFilter/cells/BrandCellVO;", "Lru/ozon/app/android/common/filterWidgets/filters/data/BrandFilterModel;", "id", "", "determineLayoutModel", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandFilter/cells/BrandCellVO$LayoutModel;", "brandsCount", "brandIndex", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BrandFilterModelKt {
    private static final float cellsRadius = ResourceExtKt.toPxF(12);
    private static final int defaultTopInset = ResourceExtKt.toPx(8);
    private static final int defaultBottomInset = ResourceExtKt.toPx(8);

    private static final BrandCellVO.LayoutModel determineLayoutModel(int i11, int i12) {
        if (i11 != 1) {
            return i12 == 0 ? new BrandCellVO.LayoutModel(defaultTopInset, 0, cellsRadius, 0.0f) : i12 == i11 - 1 ? new BrandCellVO.LayoutModel(0, defaultBottomInset, 0.0f, cellsRadius) : new BrandCellVO.LayoutModel(0, 0, 0.0f, 0.0f);
        }
        int i13 = defaultTopInset;
        int i14 = defaultBottomInset;
        float f7 = cellsRadius;
        return new BrandCellVO.LayoutModel(i13, i14, f7, f7);
    }

    @NotNull
    public static final BrandCellVO toVO(@NotNull BrandFilterModel brandFilterModel, long j11) {
        Intrinsics.checkNotNullParameter(brandFilterModel, "<this>");
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio brandCell = brandFilterModel.getBrandCell();
        String originalUrl = brandFilterModel.getOriginalUrl();
        BrandCellVO.LayoutModel determineLayoutModel = determineLayoutModel(brandFilterModel.getBrandsCount(), brandFilterModel.getBrandIndex());
        Map<String, TokenizedTrackingInfo> trackingInfo = brandFilterModel.getTrackingInfo();
        return new BrandCellVO(j11, brandCell, originalUrl, determineLayoutModel, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
