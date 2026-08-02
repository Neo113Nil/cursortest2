package ru.ozon.app.android.checkoutcomposer.addressPartsInput.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.core.AddressPartsInputWidgetMapper;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.presentation.AddressPartsInputViewModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0015\u001a\u00060\u0013j\u0002`\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"ru/ozon/app/android/checkoutcomposer/addressPartsInput/di/AddressPartsInputComponent$Companion$create$1$1", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/di/AddressPartsInputComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/core/AddressPartsInputWidgetMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/checkoutcomposer/addressPartsInput/core/AddressPartsInputWidgetMapper;", "mapper", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel;", "viewModel$delegate", "getViewModel", "()Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LVg/d;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressPartsInputComponent$Companion$create$1$1 implements AddressPartsInputComponent {
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final d customActionHandlersStoreFactory;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModel;

    AddressPartsInputComponent$Companion$create$1$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        CustomActionHandlersComponentApi customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.customActionHandlersComponentApi = customActionHandlersComponentApi;
        this.mapper = k.b(AddressPartsInputComponent$Companion$create$1$1$mapper$2.INSTANCE);
        this.viewModel = k.b(new AddressPartsInputComponent$Companion$create$1$1$viewModel$2(this));
        this.customActionHandlersStoreFactory = customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.addressPartsInput.di.AddressPartsInputComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersStoreFactory;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.addressPartsInput.di.AddressPartsInputComponent
    public AddressPartsInputWidgetMapper getMapper() {
        return (AddressPartsInputWidgetMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.addressPartsInput.di.AddressPartsInputComponent
    public AddressPartsInputViewModel getViewModel() {
        return (AddressPartsInputViewModel) this.viewModel.getValue();
    }
}
