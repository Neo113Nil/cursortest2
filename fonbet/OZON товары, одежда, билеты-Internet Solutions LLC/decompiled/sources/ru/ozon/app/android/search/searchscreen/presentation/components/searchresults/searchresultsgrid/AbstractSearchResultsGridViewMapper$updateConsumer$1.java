package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid;

import A00.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.common.SelectedStateChangedEvent;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.models.TopRightButtonCheckBox;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$J$a;", "update", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;", "oldVO", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;)Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class AbstractSearchResultsGridViewMapper$updateConsumer$1 extends AbstractC7737t implements Function2<a.J.InterfaceC0007a, SearchResultsGridVO, SearchResultsGridVO> {
    public static final AbstractSearchResultsGridViewMapper$updateConsumer$1 INSTANCE = new AbstractSearchResultsGridViewMapper$updateConsumer$1();

    AbstractSearchResultsGridViewMapper$updateConsumer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final SearchResultsGridVO invoke(a.J.InterfaceC0007a update, SearchResultsGridVO oldVO) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        if (update instanceof SelectedStateChangedEvent) {
            SelectedStateChangedEvent selectedStateChangedEvent = (SelectedStateChangedEvent) update;
            long sku = selectedStateChangedEvent.getSku();
            Long checkboxSku = oldVO.getCheckboxSku();
            if (checkboxSku != null && sku == checkboxSku.longValue()) {
                List<Object> topRightButtons = oldVO.getTopRightButtons();
                if (topRightButtons != null) {
                    List<Object> list = topRightButtons;
                    ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
                    for (Object obj : list) {
                        if (obj instanceof TopRightButtonCheckBox) {
                            obj = TopRightButtonCheckBox.copy$default((TopRightButtonCheckBox) obj, selectedStateChangedEvent.getIsSelected(), null, 2, null);
                        }
                        arrayList2.add(obj);
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                return SearchResultsGridVO.copy$default(oldVO, null, null, 0, 0, false, null, 0L, null, arrayList, null, null, null, null, null, null, null, null, null, 261887, null);
            }
        }
        return oldVO;
    }
}
