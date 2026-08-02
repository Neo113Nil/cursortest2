package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5LoadingNoUiMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi.HotelsSearchResultsV5LoadingNoUiVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncMultipleRequestsWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.tracker.performance.MetricType;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJC\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5LoadingWidgetViewModel;", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncMultipleRequestsWidgetViewModel;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "asyncWidgetRepository", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5LoadingNoUiMapper;", "mapper", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5LoadingNoUiMapper;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "", "asyncData", "", "params", "Lru/ozon/tracker/performance/MetricType;", "", "additionalMetrics", "", "fetchWidgetWithParams", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;", "hotels", "updateHotels", "(Ljava/util/List;)Ljava/util/List;", "", "cashedHotels", "Ljava/util/Map;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5LoadingWidgetViewModel extends AbstractAsyncMultipleRequestsWidgetViewModel<HotelsSearchResultsV5DTO, HotelsSearchResultsV5LoadingNoUiVO.State> {

    @NotNull
    private final Map<Long, HotelsSearchResultsV5CardVO> cashedHotels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsSearchResultsV5LoadingWidgetViewModel(@NotNull ComposerAsyncWidgetRepository asyncWidgetRepository, @NotNull HotelsSearchResultsV5LoadingNoUiMapper mapper, @NotNull CoroutineDispatcherProvider dispatcherProvider) {
        super(asyncWidgetRepository, mapper, dispatcherProvider);
        Intrinsics.checkNotNullParameter(asyncWidgetRepository, "asyncWidgetRepository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.cashedHotels = new LinkedHashMap();
    }

    public final void fetchWidgetWithParams(@NotNull String asyncData, Map<String, String> params, Map<MetricType, Long> additionalMetrics) {
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        fetchWidget(HotelsSearchResultsV5DTO.class, asyncData, params, additionalMetrics);
    }

    public final List<HotelsSearchResultsV5CardVO> updateHotels(@NotNull List<HotelsSearchResultsV5CardVO> hotels) {
        Intrinsics.checkNotNullParameter(hotels, "hotels");
        ArrayList arrayList = new ArrayList();
        for (HotelsSearchResultsV5CardVO hotelsSearchResultsV5CardVO : hotels) {
            if (!Intrinsics.d(this.cashedHotels.get(Long.valueOf(hotelsSearchResultsV5CardVO.getId())), hotelsSearchResultsV5CardVO)) {
                this.cashedHotels.put(Long.valueOf(hotelsSearchResultsV5CardVO.getId()), hotelsSearchResultsV5CardVO);
                arrayList.add(hotelsSearchResultsV5CardVO);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
