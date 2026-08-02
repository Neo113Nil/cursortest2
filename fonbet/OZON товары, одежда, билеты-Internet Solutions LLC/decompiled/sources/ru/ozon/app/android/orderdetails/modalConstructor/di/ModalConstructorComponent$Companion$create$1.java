package ru.ozon.app.android.orderdetails.modalConstructor.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;

@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0015\u001a\u00060\u0011j\u0002`\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/ozon/app/android/orderdetails/modalConstructor/di/ModalConstructorComponent$Companion$create$1", "Lru/ozon/app/android/orderdetails/modalConstructor/di/ModalConstructorComponent;", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider$delegate", "LSc/j;", "getAdultListDelegateProvider", "()Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "getAdultHandler", "()Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ModalConstructorComponent$Companion$create$1 implements ModalConstructorComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: adultListDelegateProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j adultListDelegateProvider;

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(ModalConstructorComponent$Companion$create$1$handlersInhibitor$2.INSTANCE);

    ModalConstructorComponent$Companion$create$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.adultListDelegateProvider = k.b(new ModalConstructorComponent$Companion$create$1$adultListDelegateProvider$2(this, c7475g));
    }

    public AdultHandler getAdultHandler() {
        return ((AccountComponentApi) this.$storage.getComponent(AccountComponentApi.class)).getAdultHandler();
    }

    @Override // ru.ozon.app.android.orderdetails.modalConstructor.di.ModalConstructorComponent
    public AdultListDelegateProvider getAdultListDelegateProvider() {
        return (AdultListDelegateProvider) this.adultListDelegateProvider.getValue();
    }

    @Override // ru.ozon.app.android.orderdetails.modalConstructor.di.ModalConstructorComponent
    public d getCustomActionHandlersStoreFactory() {
        return ((CustomActionHandlersComponentApi) this.$storage.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.orderdetails.modalConstructor.di.ModalConstructorComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }
}
