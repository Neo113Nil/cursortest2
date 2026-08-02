package ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data.QuickFiltersDTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data.QuickFiltersMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersVO;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionAsyncWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersAsyncActionViewModel;", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionAsyncWidgetViewModel;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$QuickFiltersState;", "asyncWidgetRepository", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "mapper", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersMapper;", "dispatcherProvider", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "performanceTrackerDelegate", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersMapper;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;)V", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuickFiltersAsyncActionViewModel extends AsyncActionAsyncWidgetViewModel<QuickFiltersDTO, QuickFiltersVO.QuickFiltersState> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickFiltersAsyncActionViewModel(@NotNull ComposerAsyncWidgetRepository asyncWidgetRepository, @NotNull QuickFiltersMapper mapper, @NotNull CoroutineDispatcherProvider dispatcherProvider, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate) {
        super(asyncWidgetRepository, mapper, dispatcherProvider, performanceTrackerDelegate, QuickFiltersDTO.class, 0, 32, null);
        Intrinsics.checkNotNullParameter(asyncWidgetRepository, "asyncWidgetRepository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
    }
}
