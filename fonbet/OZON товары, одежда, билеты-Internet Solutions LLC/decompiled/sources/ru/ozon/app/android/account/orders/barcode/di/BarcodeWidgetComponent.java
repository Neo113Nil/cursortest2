package ru.ozon.app.android.account.orders.barcode.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.barcode.data.BarcodeMapper;
import ru.ozon.app.android.account.orders.barcode.presentation.viewmodel.BarcodeViewModel;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.barcodecache.di.BarcodeCacheComponentApi;
import ru.ozon.app.android.barcodecache.drawable.BarcodeDrawableCache;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001c2\u00060\u0001j\u0002`\u0002:\u0001\u001cR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/di/BarcodeWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/account/orders/barcode/data/BarcodeMapper;", "getMapper", "()Lru/ozon/app/android/account/orders/barcode/data/BarcodeMapper;", "mapper", "Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel;", "getViewModel", "()Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel;", "viewModel", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "getOnboardingViewModel", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "onboardingViewModel", "Lru/ozon/app/android/barcodecache/drawable/BarcodeDrawableCache;", "getBarcodeDrawableCache", "()Lru/ozon/app/android/barcodecache/drawable/BarcodeDrawableCache;", "barcodeDrawableCache", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BarcodeWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/di/BarcodeWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/app/android/account/orders/barcode/di/BarcodeWidgetComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/account/orders/barcode/di/BarcodeWidgetComponent;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final BarcodeWidgetComponent create(@NotNull final C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new BarcodeWidgetComponent(storage) { // from class: ru.ozon.app.android.account.orders.barcode.di.BarcodeWidgetComponent$Companion$create$1
                private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
                private final BarcodeCacheComponentApi barcodeCacheComponentApi;
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
                private final NetworkComponentApi networkComponentApi;
                private final OnBoardingComponentApi onboardingComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(BarcodeWidgetComponent$Companion$create$1$mapper$2.INSTANCE);

                /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j handlersInhibitor = k.b(BarcodeWidgetComponent$Companion$create$1$handlersInhibitor$2.INSTANCE);

                {
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) storage.getComponent(CustomActionHandlersComponentApi.class);
                    this.networkComponentApi = (NetworkComponentApi) storage.getComponent(NetworkComponentApi.class);
                    this.barcodeCacheComponentApi = (BarcodeCacheComponentApi) storage.getComponent(BarcodeCacheComponentApi.class);
                    this.onboardingComponentApi = (OnBoardingComponentApi) storage.getComponent(OnBoardingComponentApi.class);
                    this.androidPlatformComponentDependencies = (AndroidPlatformComponentDependencies) storage.getComponent(AndroidPlatformComponentDependencies.class);
                }

                @Override // ru.ozon.app.android.account.orders.barcode.di.BarcodeWidgetComponent
                public BarcodeDrawableCache getBarcodeDrawableCache() {
                    return this.barcodeCacheComponentApi.getBarcodeBitmapCache();
                }

                @Override // ru.ozon.app.android.account.orders.barcode.di.BarcodeWidgetComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.account.orders.barcode.di.BarcodeWidgetComponent
                public HandlersInhibitor getHandlersInhibitor() {
                    return (HandlersInhibitor) this.handlersInhibitor.getValue();
                }

                @Override // ru.ozon.app.android.account.orders.barcode.di.BarcodeWidgetComponent
                public BarcodeMapper getMapper() {
                    return (BarcodeMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.account.orders.barcode.di.BarcodeWidgetComponent
                public BaseOnBoardingViewModel.Default getOnboardingViewModel() {
                    return new BaseOnBoardingViewModel.Default(this.onboardingComponentApi.getDefaultOnBoardingDisplayRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayOnPageRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayDisableRepository());
                }

                @Override // ru.ozon.app.android.account.orders.barcode.di.BarcodeWidgetComponent
                public BarcodeViewModel getViewModel() {
                    return new BarcodeViewModel(this.barcodeCacheComponentApi.getPersistentCacheManager(), this.networkComponentApi.getInternetConnectionUtils(), this.androidPlatformComponentDependencies.getAppType());
                }
            };
        }
    }

    @NotNull
    BarcodeDrawableCache getBarcodeDrawableCache();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    BarcodeMapper getMapper();

    @NotNull
    BaseOnBoardingViewModel.Default getOnboardingViewModel();

    @NotNull
    BarcodeViewModel getViewModel();
}
