package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.data.HotelsBookTotalV3DTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.data.HotelsBookTotalV3Mapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.vo.HotelsBookTotalV3VO;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3AsyncWidgetViewModel;", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "repository", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3Mapper;", "mapper", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3Mapper;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;)V", "", "asyncData", "", "", "params", "", "fetchWidgetWithParams", "(Ljava/lang/String;Ljava/util/Map;)V", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3AsyncWidgetViewModel extends AbstractAsyncWidgetViewModel<HotelsBookTotalV3DTO, HotelsBookTotalV3VO> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsBookTotalV3AsyncWidgetViewModel(@NotNull ComposerAsyncWidgetRepository repository, @NotNull HotelsBookTotalV3Mapper mapper, @NotNull CoroutineDispatcherProvider dispatcherProvider, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate) {
        super(repository, mapper, dispatcherProvider, performanceTrackerDelegate);
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
    }

    public final void fetchWidgetWithParams(@NotNull String asyncData, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        Intrinsics.checkNotNullParameter(params, "params");
        fetchWidget(HotelsBookTotalV3DTO.class, asyncData, params);
    }
}
