package ru.ozon.app.android.geo.addressEditForm.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.geo.addressEditForm.presentation.AddressEditFormOnBoardingViewModel;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModelImpl;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"ru/ozon/app/android/geo/addressEditForm/di/AddressEditFormWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/geo/addressEditForm/di/AddressEditFormWidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onBoardingComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "getOnBoardingComponentApi", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormOnBoardingViewModel;", "onBoardingViewModel$delegate", "LSc/j;", "getOnBoardingViewModel", "()Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormOnBoardingViewModel;", "onBoardingViewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModelImpl;", "showYandexSearchSheetViewModel$delegate", "getShowYandexSearchSheetViewModel", "()Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModelImpl;", "showYandexSearchSheetViewModel", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditFormWidgetComponent$Companion$create$1$1 implements AddressEditFormWidgetComponent {
    private final OnBoardingComponentApi onBoardingComponentApi;

    /* renamed from: onBoardingViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j onBoardingViewModel = k.b(new AddressEditFormWidgetComponent$Companion$create$1$1$onBoardingViewModel$2(this));

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(AddressEditFormWidgetComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

    /* renamed from: showYandexSearchSheetViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j showYandexSearchSheetViewModel = k.b(AddressEditFormWidgetComponent$Companion$create$1$1$showYandexSearchSheetViewModel$2.INSTANCE);

    AddressEditFormWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.onBoardingComponentApi = (OnBoardingComponentApi) c7475g.getComponent(OnBoardingComponentApi.class);
    }

    @Override // ru.ozon.app.android.geo.addressEditForm.di.AddressEditFormWidgetComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    public final OnBoardingComponentApi getOnBoardingComponentApi() {
        return this.onBoardingComponentApi;
    }

    @Override // ru.ozon.app.android.geo.addressEditForm.di.AddressEditFormWidgetComponent
    public AddressEditFormOnBoardingViewModel getOnBoardingViewModel() {
        return (AddressEditFormOnBoardingViewModel) this.onBoardingViewModel.getValue();
    }

    @Override // ru.ozon.app.android.geo.addressEditForm.di.AddressEditFormWidgetComponent
    public YandexSearchSheetSharedViewModelImpl getShowYandexSearchSheetViewModel() {
        return (YandexSearchSheetSharedViewModelImpl) this.showYandexSearchSheetViewModel.getValue();
    }
}
