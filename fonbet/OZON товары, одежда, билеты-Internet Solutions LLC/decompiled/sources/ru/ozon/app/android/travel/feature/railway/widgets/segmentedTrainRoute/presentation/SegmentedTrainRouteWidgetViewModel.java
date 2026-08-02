package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.data.SegmentedTrainRouteDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.data.SegmentedTrainRouteMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.presentation.skeleton.SegmentedTrainRouteSkeletonVI;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/SegmentedTrainRouteWidgetViewModel;", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel;", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO;", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonVI$State;", "asyncWidgetRepository", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "mapper", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteMapper;", "dispatcherProvider", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteMapper;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "fetchWidget", "", "asyncData", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SegmentedTrainRouteWidgetViewModel extends AbstractAsyncWidgetViewModel<SegmentedTrainRouteDTO, SegmentedTrainRouteSkeletonVI.State> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedTrainRouteWidgetViewModel(@NotNull ComposerAsyncWidgetRepository asyncWidgetRepository, @NotNull SegmentedTrainRouteMapper mapper, @NotNull CoroutineDispatcherProvider dispatcherProvider) {
        super(asyncWidgetRepository, mapper, dispatcherProvider, null, 8, null);
        Intrinsics.checkNotNullParameter(asyncWidgetRepository, "asyncWidgetRepository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
    }

    public void fetchWidget(@NotNull String asyncData) {
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        AbstractAsyncWidgetViewModel.fetchWidget$default(this, SegmentedTrainRouteDTO.class, asyncData, null, 4, null);
    }
}
