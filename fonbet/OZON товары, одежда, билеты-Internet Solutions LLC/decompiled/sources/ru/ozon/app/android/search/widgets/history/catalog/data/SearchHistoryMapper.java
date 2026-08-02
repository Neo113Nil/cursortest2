package ru.ozon.app.android.search.widgets.history.catalog.data;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.search.widgets.history.catalog.data.SearchHistoryDTO;
import ru.ozon.app.android.search.widgets.history.catalog.presentation.SearchHistoryItemVO;
import ru.ozon.app.android.search.widgets.utils.SuggestionsUtilsKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/search/widgets/history/catalog/data/SearchHistoryMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/widgets/history/catalog/data/SearchHistoryDTO;", "Ll20/d;", "", "Lru/ozon/app/android/search/widgets/history/catalog/presentation/SearchHistoryItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/search/widgets/history/catalog/data/SearchHistoryDTO;Ll20/d;)Ljava/util/List;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchHistoryMapper implements Function2<SearchHistoryDTO, d, List<? extends SearchHistoryItemVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SearchHistoryItemVO> invoke(@NotNull SearchHistoryDTO state, @NotNull d widgetInfo) {
        String title;
        SearchHistoryDTO state2 = state;
        Intrinsics.checkNotNullParameter(state2, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<SearchHistoryDTO.ItemDTO> items = state2.getItems();
        ArrayList arrayList = null;
        if (items != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : items) {
                if (((SearchHistoryDTO.ItemDTO) obj).getTitle().length() > 0) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(C7714v.z(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                SearchHistoryDTO.ItemDTO itemDTO = (SearchHistoryDTO.ItemDTO) next;
                String formatSuggestionDeeplink = SuggestionsUtilsKt.formatSuggestionDeeplink(itemDTO.getDeeplink());
                long hashCode = (formatSuggestionDeeplink + "_" + itemDTO.getTitle()).hashCode();
                String title2 = itemDTO.getTitle();
                Boolean shouldPrefetch = itemDTO.getShouldPrefetch();
                boolean booleanValue = shouldPrefetch != null ? shouldPrefetch.booleanValue() : false;
                boolean z11 = Intrinsics.d(itemDTO.isHighlighted(), Boolean.TRUE) || (title = state2.getTitle()) == null || h.K(title);
                String removeHistoryActionName = state2.getRemoveHistoryActionName();
                Map<String, TokenizedTrackingInfo> trackingInfo = itemDTO.getTrackingInfo();
                t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
                Map<String, TokenizedTrackingInfo> searchTrackingInfo = itemDTO.getSearchTrackingInfo();
                t tokenizedEvent$default2 = searchTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(searchTrackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
                Map<String, TokenizedTrackingInfo> removeTrackingInfo = itemDTO.getRemoveTrackingInfo();
                arrayList3.add(new SearchHistoryItemVO(hashCode, title2, formatSuggestionDeeplink, booleanValue, z11, removeHistoryActionName, tokenizedEvent$default, (i11 == C7714v.P(state.getItems()) && i11 == 0) ? false : true, tokenizedEvent$default2, removeTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(removeTrackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
                state2 = state;
                i11 = i12;
            }
            arrayList = arrayList3;
        }
        return arrayList == null ? K.f71697a : arrayList;
    }
}
