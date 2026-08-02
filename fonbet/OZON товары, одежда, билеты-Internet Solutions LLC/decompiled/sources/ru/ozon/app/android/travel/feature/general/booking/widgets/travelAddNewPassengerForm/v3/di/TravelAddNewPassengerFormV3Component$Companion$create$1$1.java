package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.di;

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
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data.TravelAddNewPassengerFormV3Mapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data.TravelAddNewPassengerFormV3ResultApi;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3ViewModel;

@Metadata(d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR#\u0010\u0011\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001f\u001a\u00060\u001bj\u0002`\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010$\u001a\u00060 j\u0002`!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"ru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/di/TravelAddNewPassengerFormV3Component$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/di/TravelAddNewPassengerFormV3Component;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3ResultApi;", "kotlin.jvm.PlatformType", "travelAddNewPassengerFormV3ResultApi$delegate", "LSc/j;", "getTravelAddNewPassengerFormV3ResultApi", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3ResultApi;", "travelAddNewPassengerFormV3ResultApi", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3Mapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3Mapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelAddNewPassengerFormV3Component$Companion$create$1$1 implements TravelAddNewPassengerFormV3Component {
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: travelAddNewPassengerFormV3ResultApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j travelAddNewPassengerFormV3ResultApi = k.b(new TravelAddNewPassengerFormV3Component$Companion$create$1$1$travelAddNewPassengerFormV3ResultApi$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(TravelAddNewPassengerFormV3Component$Companion$create$1$1$mapper$2.INSTANCE);

    TravelAddNewPassengerFormV3Component$Companion$create$1$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    private final TravelAddNewPassengerFormV3ResultApi getTravelAddNewPassengerFormV3ResultApi() {
        return (TravelAddNewPassengerFormV3ResultApi) this.travelAddNewPassengerFormV3ResultApi.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.di.TravelAddNewPassengerFormV3Component
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.di.TravelAddNewPassengerFormV3Component
    public TravelAddNewPassengerFormV3Mapper getMapper() {
        return (TravelAddNewPassengerFormV3Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.di.TravelAddNewPassengerFormV3Component
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.di.TravelAddNewPassengerFormV3Component
    public TravelAddNewPassengerFormV3ViewModel getViewModel() {
        TravelAddNewPassengerFormV3ResultApi travelAddNewPassengerFormV3ResultApi = getTravelAddNewPassengerFormV3ResultApi();
        Intrinsics.checkNotNullExpressionValue(travelAddNewPassengerFormV3ResultApi, "<get-travelAddNewPassengerFormV3ResultApi>(...)");
        return new TravelAddNewPassengerFormV3ViewModel(travelAddNewPassengerFormV3ResultApi, getMapper());
    }
}
