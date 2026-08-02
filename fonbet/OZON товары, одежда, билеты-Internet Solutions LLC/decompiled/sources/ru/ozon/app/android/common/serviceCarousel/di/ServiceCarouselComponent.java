package ru.ozon.app.android.common.serviceCarousel.di;

import Pc.a;
import Vg.d;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewModel;
import ru.ozon.app.android.common.serviceCarousel.presentation.onboarding.ServiceCarouselOnboardingViewModel;
import ru.ozon.app.android.commonvertical.sharedCarouselViewModel.SharedCarouselViewModel;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0015J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H&¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H&¢\u0006\u0004\b\n\u0010\u0006J\u0013\u0010\r\u001a\u00060\u000bj\u0002`\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/common/serviceCarousel/di/ServiceCarouselComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LPc/a;", "Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselViewModel;", "getViewModel", "()LPc/a;", "Lru/ozon/app/android/common/serviceCarousel/presentation/onboarding/ServiceCarouselOnboardingViewModel;", "getOnBoardingViewModel", "Lru/ozon/app/android/commonvertical/sharedCarouselViewModel/SharedCarouselViewModel;", "getSharedViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "getCoroutineDispatchersProvider", "()Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lru/ozon/app/android/network/abtool/FeatureService;", "getFeatureService", "()Lru/ozon/app/android/network/abtool/FeatureService;", "Factory", "service-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ServiceCarouselComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lru/ozon/app/android/common/serviceCarousel/di/ServiceCarouselComponent$Factory;", "", "create", "Lru/ozon/app/android/common/serviceCarousel/di/ServiceCarouselComponent;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "service-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public interface Factory {
        @NotNull
        ServiceCarouselComponent create(@NotNull NetworkComponentApi networkComponentApi, @NotNull StorageComponentApi storageComponentApi, @NotNull CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, @NotNull CustomActionHandlersComponentApi customActionHandlersComponentApi);
    }

    @NotNull
    CoroutineDispatcherProvider getCoroutineDispatchersProvider();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    FeatureService getFeatureService();

    @NotNull
    a<ServiceCarouselOnboardingViewModel> getOnBoardingViewModel();

    @NotNull
    a<SharedCarouselViewModel> getSharedViewModel();

    @NotNull
    a<ServiceCarouselViewModel> getViewModel();
}
