package ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.di;

import Pc.a;
import Vg.d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SellerHeaderViewModel;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.ui.switchingbutton.di.SwitchingButtonComponentApi;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\nJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00060\u0006j\u0002`\u0007H&¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/di/SellerTransparencyProfileComponent;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "LPc/a;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SellerHeaderViewModel;", "getSellerHeaderViewModel", "()LPc/a;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "Factory", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SellerTransparencyProfileComponent extends AccountComponentApi {

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/di/SellerTransparencyProfileComponent$Factory;", "", "create", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/di/SellerTransparencyProfileComponent;", "componentDependencies", "Lru/ozon/app/android/ui/switchingbutton/di/SwitchingButtonComponentApi;", "accountDependencies", "Lru/ozon/app/android/account/di/AccountComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "networkDependencies", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "favComponentApi", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "favoriteCoreComponentApi", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public interface Factory {
        @NotNull
        SellerTransparencyProfileComponent create(@NotNull SwitchingButtonComponentApi componentDependencies, @NotNull AccountComponentApi accountDependencies, @NotNull ActionComponentApi actionComponentApi, @NotNull NetworkComponentApi networkDependencies, @NotNull FavoriteComponentApi favComponentApi, @NotNull StorageComponentApi storageComponentApi, @NotNull CustomActionHandlersComponentApi customActionHandlersComponentApi, @NotNull NavigationComponentApi navigationComponentApi, @NotNull FavoriteCoreComponentApi favoriteCoreComponentApi);
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    a<SellerHeaderViewModel> getSellerHeaderViewModel();
}
