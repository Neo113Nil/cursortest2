package ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.ProductSelectorMobileDataDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\tJ&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/domain/ResetFilterActionProcesser;", "", "<init>", "()V", "resetFilter", "", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO$ActiveFilters;", "currentFilters", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "processResetFilter", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ResetFilterActionProcesser {
    private final List<ProductSelectorMobileDataDTO.ActiveFilters> processResetFilter(List<ProductSelectorMobileDataDTO.ActiveFilters> currentFilters, AtomAction.Click action) {
        String str;
        List m11;
        Map<String, String> params = action.getParams();
        if (params == null || (str = params.get("keys")) == null || (m11 = h.m(str, new String[]{","}, 0, 6)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : currentFilters) {
            if (m11.contains(((ProductSelectorMobileDataDTO.ActiveFilters) obj).getKey())) {
                arrayList.add(obj);
            }
        }
        ArrayList W02 = C7714v.W0(currentFilters);
        W02.removeAll(arrayList);
        return W02;
    }

    public final List<ProductSelectorMobileDataDTO.ActiveFilters> resetFilter(@NotNull List<ProductSelectorMobileDataDTO.ActiveFilters> currentFilters, @NotNull AtomAction.Click action) {
        Intrinsics.checkNotNullParameter(currentFilters, "currentFilters");
        Intrinsics.checkNotNullParameter(action, "action");
        return processResetFilter(currentFilters, action);
    }
}
