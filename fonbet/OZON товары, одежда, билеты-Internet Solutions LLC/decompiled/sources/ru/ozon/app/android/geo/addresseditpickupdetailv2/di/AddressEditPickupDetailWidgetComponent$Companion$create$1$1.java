package ru.ozon.app.android.geo.addresseditpickupdetailv2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickupDetailOnBoardingViewModel;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"ru/ozon/app/android/geo/addresseditpickupdetailv2/di/AddressEditPickupDetailWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/di/AddressEditPickupDetailWidgetComponent;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onBoardingComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "getOnBoardingComponentApi", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "getCustomActionHandlersComponentApi", "()Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickupDetailOnBoardingViewModel;", "onBoardingViewModel$delegate", "LSc/j;", "getOnBoardingViewModel", "()Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickupDetailOnBoardingViewModel;", "onBoardingViewModel", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditPickupDetailWidgetComponent$Companion$create$1$1 implements AddressEditPickupDetailWidgetComponent {
    private final AppType appType;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final OnBoardingComponentApi onBoardingComponentApi;

    /* renamed from: onBoardingViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j onBoardingViewModel = k.b(new AddressEditPickupDetailWidgetComponent$Companion$create$1$1$onBoardingViewModel$2(this));
    private final l tokenizedAnalytics;

    AddressEditPickupDetailWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.onBoardingComponentApi = (OnBoardingComponentApi) c7475g.getComponent(OnBoardingComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.appType = ((AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class)).getAppType();
        this.tokenizedAnalytics = ((RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.geo.addresseditpickupdetailv2.di.AddressEditPickupDetailWidgetComponent
    public AppType getAppType() {
        return this.appType;
    }

    @Override // ru.ozon.app.android.geo.addresseditpickupdetailv2.di.AddressEditPickupDetailWidgetComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    public final OnBoardingComponentApi getOnBoardingComponentApi() {
        return this.onBoardingComponentApi;
    }

    @Override // ru.ozon.app.android.geo.addresseditpickupdetailv2.di.AddressEditPickupDetailWidgetComponent
    public AddressEditPickupDetailOnBoardingViewModel getOnBoardingViewModel() {
        return (AddressEditPickupDetailOnBoardingViewModel) this.onBoardingViewModel.getValue();
    }

    @Override // ru.ozon.app.android.geo.addresseditpickupdetailv2.di.AddressEditPickupDetailWidgetComponent
    public l getTokenizedAnalytics() {
        return this.tokenizedAnalytics;
    }
}
