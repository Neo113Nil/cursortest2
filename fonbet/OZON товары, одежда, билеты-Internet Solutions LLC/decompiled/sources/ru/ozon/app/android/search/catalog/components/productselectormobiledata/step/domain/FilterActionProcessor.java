package ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.domain;

import Tl.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.ProductSelectorMobileDataDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/domain/FilterActionProcessor;", "", "applyFilterActionProcesser", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/domain/ApplyFilterActionProcessor;", "discardFilterActionProcesser", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/domain/DiscardFilterActionProcesser;", "resetFilterProcesser", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/domain/ResetFilterActionProcesser;", "rangeChangeFilterProcesser", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/domain/RangeChangeFilterProcesser;", "<init>", "(Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/domain/ApplyFilterActionProcessor;Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/domain/DiscardFilterActionProcesser;Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/domain/ResetFilterActionProcesser;Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/domain/RangeChangeFilterProcesser;)V", "processFilterAction", "", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO$ActiveFilters;", "currentFilters", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "isFilterAction", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FilterActionProcessor {

    @NotNull
    private final ApplyFilterActionProcessor applyFilterActionProcesser;

    @NotNull
    private final DiscardFilterActionProcesser discardFilterActionProcesser;

    @NotNull
    private final RangeChangeFilterProcesser rangeChangeFilterProcesser;

    @NotNull
    private final ResetFilterActionProcesser resetFilterProcesser;

    public FilterActionProcessor(@NotNull ApplyFilterActionProcessor applyFilterActionProcesser, @NotNull DiscardFilterActionProcesser discardFilterActionProcesser, @NotNull ResetFilterActionProcesser resetFilterProcesser, @NotNull RangeChangeFilterProcesser rangeChangeFilterProcesser) {
        Intrinsics.checkNotNullParameter(applyFilterActionProcesser, "applyFilterActionProcesser");
        Intrinsics.checkNotNullParameter(discardFilterActionProcesser, "discardFilterActionProcesser");
        Intrinsics.checkNotNullParameter(resetFilterProcesser, "resetFilterProcesser");
        Intrinsics.checkNotNullParameter(rangeChangeFilterProcesser, "rangeChangeFilterProcesser");
        this.applyFilterActionProcesser = applyFilterActionProcesser;
        this.discardFilterActionProcesser = discardFilterActionProcesser;
        this.resetFilterProcesser = resetFilterProcesser;
        this.rangeChangeFilterProcesser = rangeChangeFilterProcesser;
    }

    public final boolean isFilterAction(@NotNull AtomAction.Click action) {
        return b.i(action, "action", "applyFilter") || Intrinsics.d(action.getId(), "discardFilter") || Intrinsics.d(action.getId(), "onRangeChanged") || Intrinsics.d(action.getId(), "resetFilters");
    }

    public final List<ProductSelectorMobileDataDTO.ActiveFilters> processFilterAction(@NotNull List<ProductSelectorMobileDataDTO.ActiveFilters> currentFilters, @NotNull AtomAction.Click action) {
        Intrinsics.checkNotNullParameter(currentFilters, "currentFilters");
        Intrinsics.checkNotNullParameter(action, "action");
        String id2 = action.getId();
        if (id2 == null) {
            return null;
        }
        switch (id2.hashCode()) {
            case -1448781908:
                if (id2.equals("resetFilters")) {
                    return this.resetFilterProcesser.resetFilter(currentFilters, action);
                }
                return null;
            case 1170166198:
                if (id2.equals("discardFilter")) {
                    return this.discardFilterActionProcesser.processDiscardFilter(currentFilters, action);
                }
                return null;
            case 2000150070:
                if (id2.equals("onRangeChanged")) {
                    return this.rangeChangeFilterProcesser.onRangeChange(currentFilters, action);
                }
                return null;
            case 2046324870:
                if (id2.equals("applyFilter")) {
                    return this.applyFilterActionProcesser.processApplyFilter(currentFilters, action);
                }
                return null;
            default:
                return null;
        }
    }
}
