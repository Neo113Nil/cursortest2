package ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResultApi;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.presentation.ServicePackSelectionV3ViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3ViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class ServicePackSelectionV3Component$Companion$create$1$1$viewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<ServicePackSelectionV3ViewModel>> {
    final /* synthetic */ ServicePackSelectionV3Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServicePackSelectionV3Component$Companion$create$1$1$viewModelProvider$2(ServicePackSelectionV3Component$Companion$create$1$1 servicePackSelectionV3Component$Companion$create$1$1) {
        super(0);
        this.this$0 = servicePackSelectionV3Component$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ServicePackSelectionV3ViewModel invoke$lambda$0(ServicePackSelectionV3Component$Companion$create$1$1 servicePackSelectionV3Component$Companion$create$1$1) {
        TravelCommonActionResultApi travelCommonActionResultApi;
        travelCommonActionResultApi = servicePackSelectionV3Component$Companion$create$1$1.getTravelCommonActionResultApi();
        Intrinsics.checkNotNullExpressionValue(travelCommonActionResultApi, "access$getTravelCommonActionResultApi(...)");
        return new ServicePackSelectionV3ViewModel(travelCommonActionResultApi);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<ServicePackSelectionV3ViewModel> invoke() {
        final ServicePackSelectionV3Component$Companion$create$1$1 servicePackSelectionV3Component$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.di.a
            @Override // Pc.a
            public final Object get() {
                ServicePackSelectionV3ViewModel invoke$lambda$0;
                invoke$lambda$0 = ServicePackSelectionV3Component$Companion$create$1$1$viewModelProvider$2.invoke$lambda$0(ServicePackSelectionV3Component$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}
