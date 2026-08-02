package ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.data.ServicePackageSelectionButtonNoUiMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.data.ServicePackageSelectionMapper;

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"ru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/di/ServicePackageSelectionComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/di/ServicePackageSelectionComponent;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/data/ServicePackageSelectionMapper;", "servicePackageSelectionMapper$delegate", "LSc/j;", "getServicePackageSelectionMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/data/ServicePackageSelectionMapper;", "servicePackageSelectionMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/data/ServicePackageSelectionButtonNoUiMapper;", "servicePackageSelectionButtonNoUiMapper$delegate", "getServicePackageSelectionButtonNoUiMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/data/ServicePackageSelectionButtonNoUiMapper;", "servicePackageSelectionButtonNoUiMapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ServicePackageSelectionComponent$Companion$create$1$1 implements ServicePackageSelectionComponent {
    private final ContextComponentDependencies contextComponentDependencies;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: servicePackageSelectionMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j servicePackageSelectionMapper = k.b(new ServicePackageSelectionComponent$Companion$create$1$1$servicePackageSelectionMapper$2(this));

    /* renamed from: servicePackageSelectionButtonNoUiMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j servicePackageSelectionButtonNoUiMapper = k.b(ServicePackageSelectionComponent$Companion$create$1$1$servicePackageSelectionButtonNoUiMapper$2.INSTANCE);

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(ServicePackageSelectionComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

    ServicePackageSelectionComponent$Companion$create$1$1(C7475g c7475g) {
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.di.ServicePackageSelectionComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.di.ServicePackageSelectionComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.di.ServicePackageSelectionComponent
    public ServicePackageSelectionButtonNoUiMapper getServicePackageSelectionButtonNoUiMapper() {
        return (ServicePackageSelectionButtonNoUiMapper) this.servicePackageSelectionButtonNoUiMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.di.ServicePackageSelectionComponent
    public ServicePackageSelectionMapper getServicePackageSelectionMapper() {
        return (ServicePackageSelectionMapper) this.servicePackageSelectionMapper.getValue();
    }
}
