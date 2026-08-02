package ru.ozon.app.android.search.catalog.components.productselectormobiledata.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.ProductSelectorMobileDataDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"buildPostParamsMapForApplyFilters", "", "", "", "", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO$ActiveFilters;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UtilsKt {
    @NotNull
    public static final Map<String, Object> buildPostParamsMapForApplyFilters(@NotNull List<ProductSelectorMobileDataDTO.ActiveFilters> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            List<String> values = ((ProductSelectorMobileDataDTO.ActiveFilters) obj).getValues();
            if (values != null && !values.isEmpty()) {
                arrayList.add(obj);
            }
        }
        return U.l(new Pair("applyFilters", arrayList));
    }
}
