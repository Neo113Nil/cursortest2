package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm.di;

import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm.data.HotelsPageRoomsSearchFormMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm.presentation.HotelsPageRoomsSearchFormWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageRoomsSearchForm/di/HotelsPageRoomsSearchFormComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "composerWidgetAsyncComponentApi", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageRoomsSearchForm/data/HotelsPageRoomsSearchFormMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageRoomsSearchForm/data/HotelsPageRoomsSearchFormMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageRoomsSearchForm/presentation/HotelsPageRoomsSearchFormWidgetViewModel;", "widgetViewModelProvider$delegate", "getWidgetViewModelProvider", "()LPc/a;", "widgetViewModelProvider", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsPageRoomsSearchFormComponent implements InterfaceC6958a {

    @NotNull
    private final AnalyticsComponentApi analyticsComponentApi;

    @NotNull
    private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;

    @NotNull
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    /* renamed from: widgetViewModelProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j widgetViewModelProvider;

    public HotelsPageRoomsSearchFormComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) storage.getComponent(ComposerWidgetAsyncComponentApi.class);
        this.analyticsComponentApi = (AnalyticsComponentApi) storage.getComponent(AnalyticsComponentApi.class);
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) storage.getComponent(CoroutineDispatchersComponentApi.class);
        this.mapper = k.b(HotelsPageRoomsSearchFormComponent$mapper$2.INSTANCE);
        this.widgetViewModelProvider = k.b(new HotelsPageRoomsSearchFormComponent$widgetViewModelProvider$2(this));
    }

    @NotNull
    public final HotelsPageRoomsSearchFormMapper getMapper() {
        return (HotelsPageRoomsSearchFormMapper) this.mapper.getValue();
    }

    @NotNull
    public final Pc.a<HotelsPageRoomsSearchFormWidgetViewModel> getWidgetViewModelProvider() {
        return (Pc.a) this.widgetViewModelProvider.getValue();
    }
}
