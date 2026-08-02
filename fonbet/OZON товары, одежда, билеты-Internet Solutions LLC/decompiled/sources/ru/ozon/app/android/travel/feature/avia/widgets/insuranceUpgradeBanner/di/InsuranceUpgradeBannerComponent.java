package ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.data.InsuranceUpgradeBannerMapper;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/di/InsuranceUpgradeBannerComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/data/InsuranceUpgradeBannerMapper;", "insuranceUpgradeBannerMapper$delegate", "LSc/j;", "getInsuranceUpgradeBannerMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/data/InsuranceUpgradeBannerMapper;", "insuranceUpgradeBannerMapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InsuranceUpgradeBannerComponent implements InterfaceC6958a {

    @NotNull
    private final ContextComponentDependencies contextComponentDependencies;

    @NotNull
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: insuranceUpgradeBannerMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j insuranceUpgradeBannerMapper;

    public InsuranceUpgradeBannerComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.contextComponentDependencies = (ContextComponentDependencies) storage.getComponent(ContextComponentDependencies.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) storage.getComponent(CustomActionHandlersComponentApi.class);
        this.insuranceUpgradeBannerMapper = k.b(new InsuranceUpgradeBannerComponent$insuranceUpgradeBannerMapper$2(this));
    }

    @NotNull
    public final d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @NotNull
    public final InsuranceUpgradeBannerMapper getInsuranceUpgradeBannerMapper() {
        return (InsuranceUpgradeBannerMapper) this.insuranceUpgradeBannerMapper.getValue();
    }
}
