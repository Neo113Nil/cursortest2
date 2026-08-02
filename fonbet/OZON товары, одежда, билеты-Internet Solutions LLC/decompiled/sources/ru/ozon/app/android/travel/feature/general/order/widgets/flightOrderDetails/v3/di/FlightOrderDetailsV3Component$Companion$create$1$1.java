package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.data.FlightOrderDetailsV3Mapper;

@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"ru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/di/FlightOrderDetailsV3Component$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/di/FlightOrderDetailsV3Component;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponent", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/data/FlightOrderDetailsV3Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/data/FlightOrderDetailsV3Mapper;", "mapper", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "getContextComponentApi", "()Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentApi", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV3Component$Companion$create$1$1 implements FlightOrderDetailsV3Component {
    final /* synthetic */ C7475g $storage;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new FlightOrderDetailsV3Component$Companion$create$1$1$mapper$2(this));
    private final RetainComposerComponentApi retainComponent;

    FlightOrderDetailsV3Component$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.retainComponent = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContextComponentDependencies getContextComponentApi() {
        return (ContextComponentDependencies) this.$storage.getComponent(ContextComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.di.FlightOrderDetailsV3Component
    public FlightOrderDetailsV3Mapper getMapper() {
        return (FlightOrderDetailsV3Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.di.FlightOrderDetailsV3Component
    public l getTokenizedAnalytics() {
        return this.retainComponent.getTokenizedAnalytics();
    }
}
