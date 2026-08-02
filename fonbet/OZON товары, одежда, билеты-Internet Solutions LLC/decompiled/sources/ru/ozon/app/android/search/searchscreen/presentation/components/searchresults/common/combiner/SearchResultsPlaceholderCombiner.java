package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.combiner;

import T00.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/combiner/SearchResultsPlaceholderCombiner;", "", "<init>", "()V", "", "LT00/j;", "", "row", HammersV3BodyDTO.PLACEHOLDER, "", "addByRow", "(Ljava/util/List;ILT00/j;)V", "", "rawWidgets", "", "", "placeholderRawWidgets", "combineGrid", "(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchResultsPlaceholderCombiner {
    private final void addByRow(List<j> list, int i11, j jVar) {
        if (i11 >= list.size()) {
            list.add(jVar);
        } else if (i11 <= 0) {
            list.add(0, jVar);
        } else {
            list.add(i11, jVar);
        }
    }

    @NotNull
    public final List<j> combineGrid(@NotNull List<j> rawWidgets, @NotNull Map<String, ? extends List<j>> placeholderRawWidgets) {
        Integer placeholderRow;
        j jVar;
        Intrinsics.checkNotNullParameter(rawWidgets, "rawWidgets");
        Intrinsics.checkNotNullParameter(placeholderRawWidgets, "placeholderRawWidgets");
        j jVar2 = (j) C7714v.M(rawWidgets);
        Object f7 = jVar2 != null ? jVar2.f() : null;
        PlaceholderRow placeholderRow2 = f7 instanceof PlaceholderRow ? (PlaceholderRow) f7 : null;
        if (placeholderRow2 == null || (placeholderRow = placeholderRow2.getPlaceholderRow()) == null) {
            return rawWidgets;
        }
        int intValue = placeholderRow.intValue();
        List<j> list = placeholderRawWidgets.get("shelf-placeholder");
        if (list == null || (jVar = (j) C7714v.M(list)) == null) {
            return rawWidgets;
        }
        ArrayList W02 = C7714v.W0(rawWidgets);
        addByRow(W02, (intValue * 2) - 2, jVar);
        return W02;
    }
}
