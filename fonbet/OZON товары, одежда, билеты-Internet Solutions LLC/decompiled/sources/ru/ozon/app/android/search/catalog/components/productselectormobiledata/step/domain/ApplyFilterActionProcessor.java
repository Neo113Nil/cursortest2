package ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.domain;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.ProductSelectorMobileDataDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\tJ \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J \u0010\f\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J\f\u0010\r\u001a\u00020\u000e*\u00020\tH\u0002J\u001c\u0010\u000f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/domain/ApplyFilterActionProcessor;", "", "<init>", "()V", "processApplyFilter", "", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO$ActiveFilters;", "currentFilters", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "updateCurrentFilters", "filter", "updateFilterActionOrCreate", "actionIsValid", "", "updateValue", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isSingle", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ApplyFilterActionProcessor {
    private final boolean actionIsValid(AtomAction.Click click) {
        Map<String, String> params = click.getParams();
        if ((params != null ? params.get("key") : null) == null) {
            return false;
        }
        Map<String, String> params2 = click.getParams();
        if ((params2 != null ? params2.get("type") : null) == null) {
            return false;
        }
        Map<String, String> params3 = click.getParams();
        return (params3 != null ? params3.get(AppMeasurementSdk.ConditionalUserProperty.VALUE) : null) != null;
    }

    private final List<ProductSelectorMobileDataDTO.ActiveFilters> updateCurrentFilters(List<ProductSelectorMobileDataDTO.ActiveFilters> list, ProductSelectorMobileDataDTO.ActiveFilters activeFilters) {
        ArrayList arrayList = new ArrayList();
        List<ProductSelectorMobileDataDTO.ActiveFilters> list2 = list;
        for (ProductSelectorMobileDataDTO.ActiveFilters activeFilters2 : list2) {
            if (Intrinsics.d(activeFilters2.getKey(), activeFilters.getKey()) && Intrinsics.d(activeFilters2.getType(), activeFilters.getType())) {
                arrayList.add(activeFilters);
            } else {
                arrayList.add(activeFilters2);
            }
        }
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (ProductSelectorMobileDataDTO.ActiveFilters activeFilters3 : list2) {
                if (Intrinsics.d(activeFilters3.getType(), activeFilters.getType()) && Intrinsics.d(activeFilters3.getKey(), activeFilters.getKey())) {
                    return arrayList;
                }
            }
        }
        arrayList.add(activeFilters);
        return arrayList;
    }

    private final ProductSelectorMobileDataDTO.ActiveFilters updateFilterActionOrCreate(List<ProductSelectorMobileDataDTO.ActiveFilters> currentFilters, AtomAction.Click action) {
        String str;
        Map<String, String> params;
        String str2;
        Map<String, String> params2;
        String str3;
        String str4;
        Map<String, String> params3 = action.getParams();
        Object obj = null;
        if (params3 == null || (str = params3.get("key")) == null || (params = action.getParams()) == null || (str2 = params.get("type")) == null || (params2 = action.getParams()) == null || (str3 = params2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE)) == null) {
            return null;
        }
        Map<String, String> params4 = action.getParams();
        boolean parseBoolean = (params4 == null || (str4 = params4.get("isSingle")) == null) ? false : Boolean.parseBoolean(str4);
        Iterator<T> it = currentFilters.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ProductSelectorMobileDataDTO.ActiveFilters activeFilters = (ProductSelectorMobileDataDTO.ActiveFilters) next;
            if (Intrinsics.d(activeFilters.getKey(), str) && Intrinsics.d(activeFilters.getType(), str2)) {
                obj = next;
                break;
            }
        }
        ProductSelectorMobileDataDTO.ActiveFilters activeFilters2 = (ProductSelectorMobileDataDTO.ActiveFilters) obj;
        if (activeFilters2 == null) {
            activeFilters2 = new ProductSelectorMobileDataDTO.ActiveFilters(str, str2, K.f71697a);
        }
        return updateValue(activeFilters2, str3, parseBoolean);
    }

    private final ProductSelectorMobileDataDTO.ActiveFilters updateValue(ProductSelectorMobileDataDTO.ActiveFilters activeFilters, String str, boolean z11) {
        if (str.length() == 0) {
            return activeFilters;
        }
        List<String> values = activeFilters.getValues();
        if (values == null) {
            values = new ArrayList<>();
        }
        ArrayList W02 = C7714v.W0(values);
        if (z11) {
            W02.clear();
        }
        W02.add(str);
        return ProductSelectorMobileDataDTO.ActiveFilters.copy$default(activeFilters, null, null, C7714v.U0(W02), 3, null);
    }

    public final List<ProductSelectorMobileDataDTO.ActiveFilters> processApplyFilter(@NotNull List<ProductSelectorMobileDataDTO.ActiveFilters> currentFilters, @NotNull AtomAction.Click action) {
        ProductSelectorMobileDataDTO.ActiveFilters updateFilterActionOrCreate;
        Intrinsics.checkNotNullParameter(currentFilters, "currentFilters");
        Intrinsics.checkNotNullParameter(action, "action");
        if (actionIsValid(action) && (updateFilterActionOrCreate = updateFilterActionOrCreate(currentFilters, action)) != null) {
            return updateCurrentFilters(currentFilters, updateFilterActionOrCreate);
        }
        return null;
    }
}
