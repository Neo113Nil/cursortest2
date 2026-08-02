package ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.domain;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.ProductSelectorMobileDataDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\tJ&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0014\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/domain/DiscardFilterActionProcesser;", "", "<init>", "()V", "processDiscardFilter", "", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO$ActiveFilters;", "currentFilters", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "discardFilter", "updateFilterItemWithRemoveValue", "valueForRemove", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscardFilterActionProcesser {
    private final List<ProductSelectorMobileDataDTO.ActiveFilters> discardFilter(AtomAction.Click action, List<ProductSelectorMobileDataDTO.ActiveFilters> currentFilters) {
        String str;
        Map<String, String> params;
        String str2;
        Map<String, String> params2;
        String str3;
        Object obj;
        Map<String, String> params3 = action.getParams();
        if (params3 != null && (str = params3.get("key")) != null && (params = action.getParams()) != null && (str2 = params.get("type")) != null && (params2 = action.getParams()) != null && (str3 = params2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE)) != null) {
            Iterator<T> it = currentFilters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                ProductSelectorMobileDataDTO.ActiveFilters activeFilters = (ProductSelectorMobileDataDTO.ActiveFilters) obj;
                if (Intrinsics.d(activeFilters.getKey(), str) && Intrinsics.d(activeFilters.getType(), str2)) {
                    break;
                }
            }
            ProductSelectorMobileDataDTO.ActiveFilters activeFilters2 = (ProductSelectorMobileDataDTO.ActiveFilters) obj;
            if (activeFilters2 != null) {
                ProductSelectorMobileDataDTO.ActiveFilters updateFilterItemWithRemoveValue = updateFilterItemWithRemoveValue(activeFilters2, str3);
                ArrayList W02 = C7714v.W0(currentFilters);
                W02.remove(activeFilters2);
                W02.add(updateFilterItemWithRemoveValue);
                return W02;
            }
        }
        return null;
    }

    private final ProductSelectorMobileDataDTO.ActiveFilters updateFilterItemWithRemoveValue(ProductSelectorMobileDataDTO.ActiveFilters activeFilters, String str) {
        List<String> values = activeFilters.getValues();
        ArrayList W02 = values != null ? C7714v.W0(values) : new ArrayList();
        W02.remove(str);
        return ProductSelectorMobileDataDTO.ActiveFilters.copy$default(activeFilters, null, null, W02, 3, null);
    }

    public final List<ProductSelectorMobileDataDTO.ActiveFilters> processDiscardFilter(@NotNull List<ProductSelectorMobileDataDTO.ActiveFilters> currentFilters, @NotNull AtomAction.Click action) {
        Intrinsics.checkNotNullParameter(currentFilters, "currentFilters");
        Intrinsics.checkNotNullParameter(action, "action");
        return discardFilter(action, currentFilters);
    }
}
