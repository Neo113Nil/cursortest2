package ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.domain;

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

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/domain/RangeChangeFilterProcesser;", "", "<init>", "()V", "onRangeChange", "", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO$ActiveFilters;", "currentFilters", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RangeChangeFilterProcesser {
    public final List<ProductSelectorMobileDataDTO.ActiveFilters> onRangeChange(@NotNull List<ProductSelectorMobileDataDTO.ActiveFilters> currentFilters, @NotNull AtomAction.Click action) {
        String str;
        Map<String, String> params;
        String str2;
        Map<String, String> params2;
        String str3;
        Map<String, String> params3;
        String str4;
        Intrinsics.checkNotNullParameter(currentFilters, "currentFilters");
        Intrinsics.checkNotNullParameter(action, "action");
        Map<String, String> params4 = action.getParams();
        Object obj = null;
        if (params4 == null || (str = params4.get("key")) == null || (params = action.getParams()) == null || (str2 = params.get("type")) == null || (params2 = action.getParams()) == null || (str3 = params2.get("fromValue")) == null || (params3 = action.getParams()) == null || (str4 = params3.get("toValue")) == null) {
            return null;
        }
        ProductSelectorMobileDataDTO.ActiveFilters activeFilters = new ProductSelectorMobileDataDTO.ActiveFilters(str, str2, C7714v.b0(str3, str4));
        Iterator<T> it = currentFilters.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ProductSelectorMobileDataDTO.ActiveFilters activeFilters2 = (ProductSelectorMobileDataDTO.ActiveFilters) next;
            if (Intrinsics.d(activeFilters2.getKey(), str) && Intrinsics.d(activeFilters2.getType(), str2)) {
                obj = next;
                break;
            }
        }
        ProductSelectorMobileDataDTO.ActiveFilters activeFilters3 = (ProductSelectorMobileDataDTO.ActiveFilters) obj;
        ArrayList W02 = C7714v.W0(currentFilters);
        if (activeFilters3 != null) {
            W02.remove(activeFilters3);
        }
        W02.add(activeFilters);
        return W02;
    }
}
