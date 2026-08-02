package ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v1.data;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v1.presentation.SearchResultsNavTitleVO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v1/data/SearchResultsNavTitleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v1/data/SearchResultsNavTitleDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v1/presentation/SearchResultsNavTitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v1/data/SearchResultsNavTitleDTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v1/presentation/SearchResultsNavTitleVO;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v1/data/SearchResultsNavTitleDTO;Ll20/d;)Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchResultsNavTitleMapper implements Function2<SearchResultsNavTitleDTO, d, List<? extends SearchResultsNavTitleVO>> {
    private final SearchResultsNavTitleVO toVO(SearchResultsNavTitleDTO searchResultsNavTitleDTO, String str) {
        long hashCode = str.hashCode();
        TextAtom departure = searchResultsNavTitleDTO.getDeparture();
        TextAtom arrival = searchResultsNavTitleDTO.getArrival();
        TextAtom symbolBetween = searchResultsNavTitleDTO.getSymbolBetween();
        TextAtom subtitle = searchResultsNavTitleDTO.getSubtitle();
        Map<String, TokenizedTrackingInfo> trackingInfo = searchResultsNavTitleDTO.getTrackingInfo();
        return new SearchResultsNavTitleVO(hashCode, departure, arrival, symbolBetween, subtitle, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SearchResultsNavTitleVO> invoke(@NotNull SearchResultsNavTitleDTO dto, @NotNull d info) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(toVO(dto, info.d()));
    }
}
