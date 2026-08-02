package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;

@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001f\u0010\u000e\u001a\u00060\bj\u0002`\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"ru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/di/MercuryCertificatesAddressComponent$Companion$create$1$1", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/di/MercuryCertificatesAddressComponent;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponent", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory$delegate", "LSc/j;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/di/MercuryCertificatesAddressViewModelFactory;", "viewModelFactory$delegate", "getViewModelFactory", "()Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/di/MercuryCertificatesAddressViewModelFactory;", "viewModelFactory", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MercuryCertificatesAddressComponent$Companion$create$1$1 implements MercuryCertificatesAddressComponent {
    private final ActionComponentApi actionComponentApi;

    /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersStoreFactory;
    private final RetainComposerComponentApi retainComposerComponent;

    /* renamed from: viewModelFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModelFactory = k.b(new MercuryCertificatesAddressComponent$Companion$create$1$1$viewModelFactory$2(this));

    MercuryCertificatesAddressComponent$Companion$create$1$1(C7475g c7475g) {
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.retainComposerComponent = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.customActionHandlersStoreFactory = k.b(new MercuryCertificatesAddressComponent$Companion$create$1$1$customActionHandlersStoreFactory$2(c7475g));
    }

    @Override // ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.di.MercuryCertificatesAddressComponent
    public d getCustomActionHandlersStoreFactory() {
        return (d) this.customActionHandlersStoreFactory.getValue();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.di.MercuryCertificatesAddressComponent
    public MercuryCertificatesAddressViewModelFactory getViewModelFactory() {
        return (MercuryCertificatesAddressViewModelFactory) this.viewModelFactory.getValue();
    }
}
