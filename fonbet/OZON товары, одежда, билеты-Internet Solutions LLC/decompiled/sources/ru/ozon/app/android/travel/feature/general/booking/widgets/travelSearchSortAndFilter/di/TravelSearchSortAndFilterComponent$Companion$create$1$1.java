package ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResultApi;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.data.TravelSearchSortAndFilterMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.presentation.TravelSearchSortAndFilterViewModel;

@Metadata(d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR#\u0010\u0011\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001b\u001a\u00060\u0017j\u0002`\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010 \u001a\u00060\u001cj\u0002`\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"ru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/di/TravelSearchSortAndFilterComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/di/TravelSearchSortAndFilterComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "handlersApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "kotlin.jvm.PlatformType", "actionApi$delegate", "LSc/j;", "getActionApi", "()Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "actionApi", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/data/TravelSearchSortAndFilterMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/data/TravelSearchSortAndFilterMapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterViewModel;", "viewModel", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelSearchSortAndFilterComponent$Companion$create$1$1 implements TravelSearchSortAndFilterComponent {
    private final CustomActionHandlersComponentApi handlersApi;
    private final NetworkComponentApi networkApi;
    private final RetainComposerComponentApi retainApi;

    /* renamed from: actionApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j actionApi = k.b(new TravelSearchSortAndFilterComponent$Companion$create$1$1$actionApi$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(TravelSearchSortAndFilterComponent$Companion$create$1$1$mapper$2.INSTANCE);

    TravelSearchSortAndFilterComponent$Companion$create$1$1(C7475g c7475g) {
        this.networkApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.handlersApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.retainApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    private final TravelCommonActionResultApi getActionApi() {
        return (TravelCommonActionResultApi) this.actionApi.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.di.TravelSearchSortAndFilterComponent
    public d getActionHandlersStoreFactory() {
        return this.handlersApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.di.TravelSearchSortAndFilterComponent
    public TravelSearchSortAndFilterMapper getMapper() {
        return (TravelSearchSortAndFilterMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.di.TravelSearchSortAndFilterComponent
    public l getTokenizedAnalytics() {
        return this.retainApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.di.TravelSearchSortAndFilterComponent
    public TravelSearchSortAndFilterViewModel getViewModel() {
        TravelCommonActionResultApi actionApi = getActionApi();
        Intrinsics.checkNotNullExpressionValue(actionApi, "<get-actionApi>(...)");
        return new TravelSearchSortAndFilterViewModel(actionApi);
    }
}
