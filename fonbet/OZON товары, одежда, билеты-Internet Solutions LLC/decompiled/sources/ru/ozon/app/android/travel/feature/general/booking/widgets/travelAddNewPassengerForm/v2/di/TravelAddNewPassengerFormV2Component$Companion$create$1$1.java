package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.data.TravelAddNewPassengerFormV2Mapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.TravelAddNewPassengerFormV2ViewModel;

@Metadata(d1 = {"\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0019\u001a\u00060\u0015j\u0002`\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001e\u001a\u00060\u001aj\u0002`\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"ru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/di/TravelAddNewPassengerFormV2Component$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/di/TravelAddNewPassengerFormV2Component;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2Mapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelAddNewPassengerFormV2Component$Companion$create$1$1 implements TravelAddNewPassengerFormV2Component {
    private final ContextComponentDependencies contextComponentDependencies;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new TravelAddNewPassengerFormV2Component$Companion$create$1$1$mapper$2(this));
    private final RetainComposerComponentApi retainComposerComponentApi;

    TravelAddNewPassengerFormV2Component$Companion$create$1$1(C7475g c7475g) {
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.di.TravelAddNewPassengerFormV2Component
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.di.TravelAddNewPassengerFormV2Component
    public TravelAddNewPassengerFormV2Mapper getMapper() {
        return (TravelAddNewPassengerFormV2Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.di.TravelAddNewPassengerFormV2Component
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.di.TravelAddNewPassengerFormV2Component
    public TravelAddNewPassengerFormV2ViewModel getViewModel() {
        return new TravelAddNewPassengerFormV2ViewModel();
    }
}
