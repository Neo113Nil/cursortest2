package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.data.FlightOrderDetailsV2Mapper;

@Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0015\u001a\u00060\u0011j\u0002`\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u001a\u001a\u00060\u0016j\u0002`\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"ru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/di/FlightOrderDetailsV2Component$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/di/FlightOrderDetailsV2Component;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponent", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2Mapper;", "flightOrderDetailsV2Mapper$delegate", "LSc/j;", "getFlightOrderDetailsV2Mapper", "()Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2Mapper;", "flightOrderDetailsV2Mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV2Component$Companion$create$1$1 implements FlightOrderDetailsV2Component {
    private final ContextComponentDependencies contextComponentDependencies;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: flightOrderDetailsV2Mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j flightOrderDetailsV2Mapper = k.b(new FlightOrderDetailsV2Component$Companion$create$1$1$flightOrderDetailsV2Mapper$2(this));
    private final RetainComposerComponentApi retainComponent;

    FlightOrderDetailsV2Component$Companion$create$1$1(C7475g c7475g) {
        this.retainComponent = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.di.FlightOrderDetailsV2Component
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.di.FlightOrderDetailsV2Component
    public FlightOrderDetailsV2Mapper getFlightOrderDetailsV2Mapper() {
        return (FlightOrderDetailsV2Mapper) this.flightOrderDetailsV2Mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.di.FlightOrderDetailsV2Component
    public l getTokenizedAnalytics() {
        return this.retainComponent.getTokenizedAnalytics();
    }
}
