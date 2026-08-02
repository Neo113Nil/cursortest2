package ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.data.OverlayButtonsV2Mapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.presentation.OverlayButtonsV2AsyncActionViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/di/OverlayButtonsV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "composerWidgetAsyncComponentApi", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2Mapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2AsyncActionViewModel;", "asyncActionWidgetViewModel", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2AsyncActionViewModel;", "getAsyncActionWidgetViewModel", "()Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2AsyncActionViewModel;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OverlayButtonsV2Component implements InterfaceC6958a {

    @NotNull
    private final AnalyticsComponentApi analyticsComponentApi;

    @NotNull
    private final OverlayButtonsV2AsyncActionViewModel asyncActionWidgetViewModel;

    @NotNull
    private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;

    @NotNull
    private final ContextComponentDependencies contextComponentDependencies;

    @NotNull
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    public OverlayButtonsV2Component(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.contextComponentDependencies = (ContextComponentDependencies) storage.getComponent(ContextComponentDependencies.class);
        ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) storage.getComponent(ComposerWidgetAsyncComponentApi.class);
        this.composerWidgetAsyncComponentApi = composerWidgetAsyncComponentApi;
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) storage.getComponent(CoroutineDispatchersComponentApi.class);
        this.coroutineDispatchersComponentApi = coroutineDispatchersComponentApi;
        AnalyticsComponentApi analyticsComponentApi = (AnalyticsComponentApi) storage.getComponent(AnalyticsComponentApi.class);
        this.analyticsComponentApi = analyticsComponentApi;
        this.mapper = k.b(new OverlayButtonsV2Component$mapper$2(this));
        this.asyncActionWidgetViewModel = new OverlayButtonsV2AsyncActionViewModel(composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository(), getMapper(), coroutineDispatchersComponentApi.getDispatcherProvider(), analyticsComponentApi.getPerformanceTrackerDelegate());
    }

    @NotNull
    public final OverlayButtonsV2AsyncActionViewModel getAsyncActionWidgetViewModel() {
        return this.asyncActionWidgetViewModel;
    }

    @NotNull
    public final OverlayButtonsV2Mapper getMapper() {
        return (OverlayButtonsV2Mapper) this.mapper.getValue();
    }
}
