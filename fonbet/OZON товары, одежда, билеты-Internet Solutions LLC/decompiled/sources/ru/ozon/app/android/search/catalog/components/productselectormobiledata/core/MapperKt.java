package ru.ozon.app.android.search.catalog.components.productselectormobiledata.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep.model.ProductSelectorMobileDataAllStepVO;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.ProductSelectorMobileDataDTO;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.models.ProductSelectorMobileDataConcreteStepVO;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u0010\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001*\u00020\u0003\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0003H\u0002¨\u0006\b"}, d2 = {"toAllStepVO", "", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/model/ProductSelectorMobileDataAllStepVO;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO;", "toStepVO", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/models/ProductSelectorMobileDataConcreteStepVO;", "extractActionBarModel", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/SelectorDataActionBarModel;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapperKt {
    private static final SelectorDataActionBarModel extractActionBarModel(ProductSelectorMobileDataDTO productSelectorMobileDataDTO) {
        return new SelectorDataActionBarModel(productSelectorMobileDataDTO.getTitle(), productSelectorMobileDataDTO.getSubtitle(), productSelectorMobileDataDTO.getClearButton(), productSelectorMobileDataDTO.getCloseButton());
    }

    @NotNull
    public static final List<ProductSelectorMobileDataAllStepVO> toAllStepVO(@NotNull ProductSelectorMobileDataDTO productSelectorMobileDataDTO) {
        Intrinsics.checkNotNullParameter(productSelectorMobileDataDTO, "<this>");
        ArrayList arrayList = new ArrayList();
        if (Intrinsics.d(productSelectorMobileDataDTO.getType(), ProductSelectorMobileDataDTO.ALL_STEP_TYPE) && productSelectorMobileDataDTO.getSelectorData() != null) {
            long hashCode = productSelectorMobileDataDTO.hashCode();
            List<ProductSelectorMobileDataDTO.ActiveFilters> activeFilters = productSelectorMobileDataDTO.getActiveFilters();
            if (activeFilters == null) {
                activeFilters = K.f71697a;
            }
            arrayList.add(new ProductSelectorMobileDataAllStepVO(hashCode, activeFilters, extractActionBarModel(productSelectorMobileDataDTO), productSelectorMobileDataDTO.getSelectorData(), productSelectorMobileDataDTO.getActionButton(), productSelectorMobileDataDTO.getTrackingInfo()));
        }
        return arrayList;
    }

    @NotNull
    public static final List<ProductSelectorMobileDataConcreteStepVO> toStepVO(@NotNull ProductSelectorMobileDataDTO productSelectorMobileDataDTO) {
        Intrinsics.checkNotNullParameter(productSelectorMobileDataDTO, "<this>");
        ArrayList arrayList = new ArrayList();
        if (Intrinsics.d(productSelectorMobileDataDTO.getType(), ProductSelectorMobileDataDTO.STEP_TYPE) && productSelectorMobileDataDTO.getSelectorStepData() != null) {
            long hashCode = productSelectorMobileDataDTO.hashCode();
            List<ProductSelectorMobileDataDTO.ActiveFilters> activeFilters = productSelectorMobileDataDTO.getActiveFilters();
            if (activeFilters == null) {
                activeFilters = K.f71697a;
            }
            arrayList.add(new ProductSelectorMobileDataConcreteStepVO(hashCode, activeFilters, extractActionBarModel(productSelectorMobileDataDTO), productSelectorMobileDataDTO.getSelectorStepData(), productSelectorMobileDataDTO.getActionButton(), productSelectorMobileDataDTO.getTrackingInfo()));
        }
        return arrayList;
    }
}
