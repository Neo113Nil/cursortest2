package ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.favorites.ui.shoppinglists.SharedSellerViewModel;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SellerHeaderViewModel;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.core.SellerTransparencyV3Mapper;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.seller.di.SisBrandFavoriteComponentApi;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteButtonDelegateFactory;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000m\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001e\u0010$\u001a\u00060\"j\u0002`#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010,\u001a\u00020(8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"ru/ozon/app/android/marketing/widgets/sellerTransparencyV3/di/SellerTransparencyV3Component$Companion$create$1$1", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/di/SellerTransparencyV3Component;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "Lru/ozon/app/android/seller/di/SisBrandFavoriteComponentApi;", "sisBrandFavoriteComponentApi", "Lru/ozon/app/android/seller/di/SisBrandFavoriteComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SellerHeaderViewModel;", "sellerHeaderViewModel$delegate", "LSc/j;", "getSellerHeaderViewModel", "()Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SellerHeaderViewModel;", "sellerHeaderViewModel", "Lru/ozon/app/android/favorites/ui/shoppinglists/SharedSellerViewModel;", "sharedSellerViewModel$delegate", "getSharedSellerViewModel", "()Lru/ozon/app/android/favorites/ui/shoppinglists/SharedSellerViewModel;", "sharedSellerViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LVg/d;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/core/SellerTransparencyV3Mapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/core/SellerTransparencyV3Mapper;", "mapper", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteButtonDelegateFactory;", "getSisBrandFavoriteButtonDelegateFactory", "()Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteButtonDelegateFactory;", "sisBrandFavoriteButtonDelegateFactory", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerTransparencyV3Component$Companion$create$1$1 implements SellerTransparencyV3Component {
    private final AccountComponentApi accountComponentApi;
    private final ActionComponentApi actionComponentApi;
    private final ContextComponentDependencies contextComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final d customActionHandlersStoreFactory;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper;
    private final NavigationComponentApi navigationComponentApi;

    /* renamed from: sellerHeaderViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j sellerHeaderViewModel;

    /* renamed from: sharedSellerViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j sharedSellerViewModel;
    private final SisBrandFavoriteComponentApi sisBrandFavoriteComponentApi;
    private final StorageComponentApi storageComponentApi;

    SellerTransparencyV3Component$Companion$create$1$1(C7475g c7475g) {
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        CustomActionHandlersComponentApi customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.customActionHandlersComponentApi = customActionHandlersComponentApi;
        this.navigationComponentApi = (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class);
        this.sisBrandFavoriteComponentApi = (SisBrandFavoriteComponentApi) c7475g.getComponent(SisBrandFavoriteComponentApi.class);
        this.contextComponentApi = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.sellerHeaderViewModel = k.b(new SellerTransparencyV3Component$Companion$create$1$1$sellerHeaderViewModel$2(this));
        this.sharedSellerViewModel = k.b(SellerTransparencyV3Component$Companion$create$1$1$sharedSellerViewModel$2.INSTANCE);
        this.customActionHandlersStoreFactory = customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
        this.mapper = k.b(new SellerTransparencyV3Component$Companion$create$1$1$mapper$2(this));
    }

    @Override // ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.di.SellerTransparencyV3Component
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersStoreFactory;
    }

    @Override // ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.di.SellerTransparencyV3Component
    public SellerTransparencyV3Mapper getMapper() {
        return (SellerTransparencyV3Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.di.SellerTransparencyV3Component
    public SellerHeaderViewModel getSellerHeaderViewModel() {
        return (SellerHeaderViewModel) this.sellerHeaderViewModel.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.di.SellerTransparencyV3Component
    public SharedSellerViewModel getSharedSellerViewModel() {
        return (SharedSellerViewModel) this.sharedSellerViewModel.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.di.SellerTransparencyV3Component
    public SisBrandFavoriteButtonDelegateFactory getSisBrandFavoriteButtonDelegateFactory() {
        return this.sisBrandFavoriteComponentApi.getSisBrandFavoriteButtonDelegateFactory();
    }
}
