package ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.di;

import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.data.AviaSkeletonLoaderMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.data.AviaSkeletonLoaderShimmerMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.presentation.loader.AviaSkeletonLoaderWidgetViewModel;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/di/AviaSkeletonLoaderComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/data/AviaSkeletonLoaderMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/data/AviaSkeletonLoaderMapper;", "mapper", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/data/AviaSkeletonLoaderShimmerMapper;", "shimmerMapper$delegate", "getShimmerMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/data/AviaSkeletonLoaderShimmerMapper;", "shimmerMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderWidgetViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderWidgetViewModel;", "viewModel", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "getPerformanceTrackerDelegate", "()Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AviaSkeletonLoaderComponent implements InterfaceC6958a {

    @NotNull
    private final ActionComponentApi actionComponentApi;

    @NotNull
    private final AnalyticsComponentApi analyticsComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    /* renamed from: shimmerMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j shimmerMapper;

    public AviaSkeletonLoaderComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.actionComponentApi = (ActionComponentApi) storage.getComponent(ActionComponentApi.class);
        this.analyticsComponentApi = (AnalyticsComponentApi) storage.getComponent(AnalyticsComponentApi.class);
        this.mapper = k.b(AviaSkeletonLoaderComponent$mapper$2.INSTANCE);
        this.shimmerMapper = k.b(AviaSkeletonLoaderComponent$shimmerMapper$2.INSTANCE);
    }

    @NotNull
    public final AviaSkeletonLoaderMapper getMapper() {
        return (AviaSkeletonLoaderMapper) this.mapper.getValue();
    }

    @NotNull
    public final PerformanceTrackerDelegate getPerformanceTrackerDelegate() {
        return this.analyticsComponentApi.getPerformanceTrackerDelegate();
    }

    @NotNull
    public final AviaSkeletonLoaderShimmerMapper getShimmerMapper() {
        return (AviaSkeletonLoaderShimmerMapper) this.shimmerMapper.getValue();
    }

    @NotNull
    public final AviaSkeletonLoaderWidgetViewModel getViewModel() {
        return new AviaSkeletonLoaderWidgetViewModel(this.actionComponentApi.getActionRepository());
    }
}
