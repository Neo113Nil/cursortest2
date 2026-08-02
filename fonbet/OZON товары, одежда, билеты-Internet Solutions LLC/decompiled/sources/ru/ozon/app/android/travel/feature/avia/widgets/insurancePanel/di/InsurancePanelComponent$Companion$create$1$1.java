package ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResultApi;
import ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.data.InsurancePanelMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.InsurancePanelViewModel;

@Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001e\u001a\u00060\u001aj\u0002`\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"ru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/di/InsurancePanelComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/di/InsurancePanelComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "kotlin.jvm.PlatformType", "travelCommonActionResultApi$delegate", "LSc/j;", "getTravelCommonActionResultApi", "()Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "travelCommonActionResultApi", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelMapper;", "insurancePanelMapper$delegate", "getInsurancePanelMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelMapper;", "insurancePanelMapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelViewModel;", "insurancePanelViewModelProvider$delegate", "getInsurancePanelViewModelProvider", "()LPc/a;", "insurancePanelViewModelProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InsurancePanelComponent$Companion$create$1$1 implements InsurancePanelComponent {
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: travelCommonActionResultApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j travelCommonActionResultApi = k.b(new InsurancePanelComponent$Companion$create$1$1$travelCommonActionResultApi$2(this));

    /* renamed from: insurancePanelMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j insurancePanelMapper = k.b(InsurancePanelComponent$Companion$create$1$1$insurancePanelMapper$2.INSTANCE);

    /* renamed from: insurancePanelViewModelProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j insurancePanelViewModelProvider = k.b(new InsurancePanelComponent$Companion$create$1$1$insurancePanelViewModelProvider$2(this));

    InsurancePanelComponent$Companion$create$1$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TravelCommonActionResultApi getTravelCommonActionResultApi() {
        return (TravelCommonActionResultApi) this.travelCommonActionResultApi.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.di.InsurancePanelComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.di.InsurancePanelComponent
    public InsurancePanelMapper getInsurancePanelMapper() {
        return (InsurancePanelMapper) this.insurancePanelMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.di.InsurancePanelComponent
    public Pc.a<InsurancePanelViewModel> getInsurancePanelViewModelProvider() {
        return (Pc.a) this.insurancePanelViewModelProvider.getValue();
    }
}
