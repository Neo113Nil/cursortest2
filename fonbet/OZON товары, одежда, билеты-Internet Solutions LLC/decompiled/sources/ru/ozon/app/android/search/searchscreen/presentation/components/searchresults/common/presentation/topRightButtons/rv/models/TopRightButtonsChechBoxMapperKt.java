package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.models;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.common.SelectedIconStateInfo;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/models/TopRightButtonCheckBox;", "", "extractSku", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/models/TopRightButtonCheckBox;)Ljava/lang/Long;", "Lru/ozon/app/android/favorites/common/SelectedIconStateInfo;", "mapToSelectedInfoIconState", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/models/TopRightButtonCheckBox;)Lru/ozon/app/android/favorites/common/SelectedIconStateInfo;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TopRightButtonsChechBoxMapperKt {
    public static final Long extractSku(@NotNull TopRightButtonCheckBox topRightButtonCheckBox) {
        String str;
        Intrinsics.checkNotNullParameter(topRightButtonCheckBox, "<this>");
        Map<String, String> params = topRightButtonCheckBox.getAction().getParams();
        if (params == null || (str = params.get("sku")) == null) {
            return null;
        }
        return h.y0(str);
    }

    public static final SelectedIconStateInfo mapToSelectedInfoIconState(@NotNull TopRightButtonCheckBox topRightButtonCheckBox) {
        String str;
        Long y02;
        Intrinsics.checkNotNullParameter(topRightButtonCheckBox, "<this>");
        Map<String, String> params = topRightButtonCheckBox.getAction().getParams();
        if (params == null || (str = params.get("sku")) == null || (y02 = h.y0(str)) == null) {
            return null;
        }
        return new SelectedIconStateInfo(y02.longValue(), topRightButtonCheckBox.isSelected());
    }
}
