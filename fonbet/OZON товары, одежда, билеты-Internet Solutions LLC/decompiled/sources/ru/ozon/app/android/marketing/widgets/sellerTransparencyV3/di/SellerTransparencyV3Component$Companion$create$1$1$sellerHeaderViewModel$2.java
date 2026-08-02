package ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SellerHeaderViewModel;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SellerHeaderViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SellerTransparencyV3Component$Companion$create$1$1$sellerHeaderViewModel$2 extends AbstractC7737t implements Function0<SellerHeaderViewModel> {
    final /* synthetic */ SellerTransparencyV3Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerTransparencyV3Component$Companion$create$1$1$sellerHeaderViewModel$2(SellerTransparencyV3Component$Companion$create$1$1 sellerTransparencyV3Component$Companion$create$1$1) {
        super(0);
        this.this$0 = sellerTransparencyV3Component$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SellerHeaderViewModel invoke() {
        ActionComponentApi actionComponentApi;
        StorageComponentApi storageComponentApi;
        AccountComponentApi accountComponentApi;
        NavigationComponentApi navigationComponentApi;
        actionComponentApi = this.this$0.actionComponentApi;
        ActionV2Repository actionRepository = actionComponentApi.getActionRepository();
        storageComponentApi = this.this$0.storageComponentApi;
        AuthStateStorage authStateStorage = storageComponentApi.getAuthStateStorage();
        accountComponentApi = this.this$0.accountComponentApi;
        SellerFavoriteService sellerFavoriteService = accountComponentApi.getSellerFavoriteService();
        navigationComponentApi = this.this$0.navigationComponentApi;
        return new SellerHeaderViewModel(actionRepository, authStateStorage, sellerFavoriteService, navigationComponentApi.getOzonRouter());
    }
}
