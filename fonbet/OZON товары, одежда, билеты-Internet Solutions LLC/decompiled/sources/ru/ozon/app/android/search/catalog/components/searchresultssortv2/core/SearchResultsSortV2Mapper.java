package ru.ozon.app.android.search.catalog.components.searchresultssortv2.core;

import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.list.Select;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.data.SearchResultsSortV2DTO;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.presentation.SearchResultsSortV2VO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/search/catalog/components/searchresultssortv2/core/SearchResultsSortV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/data/SearchResultsSortV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/presentation/SearchResultsSortV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/core/SortMarginMeasurer;", "sortMarginMeasurer", "<init>", "(Lru/ozon/app/android/search/catalog/components/searchresultssortv2/core/SortMarginMeasurer;)V", "", "id", "toVo", "(Lru/ozon/app/android/search/catalog/components/searchresultssortv2/data/SearchResultsSortV2DTO;J)Lru/ozon/app/android/search/catalog/components/searchresultssortv2/presentation/SearchResultsSortV2VO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/search/catalog/components/searchresultssortv2/data/SearchResultsSortV2DTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/core/SortMarginMeasurer;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchResultsSortV2Mapper implements Function2<SearchResultsSortV2DTO, d, List<? extends SearchResultsSortV2VO>> {

    @NotNull
    private final SortMarginMeasurer sortMarginMeasurer;
    public static final int $stable = 8;

    public SearchResultsSortV2Mapper(@NotNull SortMarginMeasurer sortMarginMeasurer) {
        Intrinsics.checkNotNullParameter(sortMarginMeasurer, "sortMarginMeasurer");
        this.sortMarginMeasurer = sortMarginMeasurer;
    }

    private final SearchResultsSortV2VO toVo(SearchResultsSortV2DTO searchResultsSortV2DTO, long j11) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        ButtonV3Atom.SmallIconButton viewButton = searchResultsSortV2DTO.getViewButton();
        Select sortButton = searchResultsSortV2DTO.getSortButton();
        float f7 = searchResultsSortV2DTO.getViewButton() == null ? 0.0f : 0.5f;
        SearchResultsSortV2VO.SortButtonMargins measure = this.sortMarginMeasurer.measure(searchResultsSortV2DTO.getViewButton(), searchResultsSortV2DTO.getFilterButton());
        SearchResultsSortV2DTO.FilterButton filterButton = searchResultsSortV2DTO.getFilterButton();
        SearchResultsSortV2DTO.FilterButton filterButton2 = searchResultsSortV2DTO.getFilterButton();
        t tVar = null;
        if (filterButton2 != null && (trackingInfo = filterButton2.getTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null);
        }
        return new SearchResultsSortV2VO(j11, viewButton, sortButton, f7, measure, filterButton, tVar);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SearchResultsSortV2VO> invoke(@NotNull SearchResultsSortV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }
}
