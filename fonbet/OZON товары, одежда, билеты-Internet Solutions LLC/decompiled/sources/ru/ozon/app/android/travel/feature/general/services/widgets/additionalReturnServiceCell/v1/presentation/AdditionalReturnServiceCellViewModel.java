package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.data.AdditionalReturnServiceCellDTO;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.data.AdditionalReturnServiceCellMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.presentation.AdditionalReturnServiceCellVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellViewModel;", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/data/AdditionalReturnServiceCellDTO;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellVO$Content;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "asyncWidgetRepository", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/data/AdditionalReturnServiceCellMapper;", "mapper", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/data/AdditionalReturnServiceCellMapper;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;)V", "", "asyncData", "", "params", "", "fetchWidgetWithParams", "(Ljava/lang/String;Ljava/util/Map;)V", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalReturnServiceCellViewModel extends AbstractAsyncWidgetViewModel<AdditionalReturnServiceCellDTO, AdditionalReturnServiceCellVO.Content> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalReturnServiceCellViewModel(@NotNull ComposerAsyncWidgetRepository asyncWidgetRepository, @NotNull AdditionalReturnServiceCellMapper mapper, @NotNull CoroutineDispatcherProvider dispatcherProvider, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate) {
        super(asyncWidgetRepository, mapper, dispatcherProvider, performanceTrackerDelegate);
        Intrinsics.checkNotNullParameter(asyncWidgetRepository, "asyncWidgetRepository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
    }

    public final void fetchWidgetWithParams(@NotNull String asyncData, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        fetchWidget(AdditionalReturnServiceCellDTO.class, asyncData, params);
    }
}
