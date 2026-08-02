package ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.pdp.domain.actionHandlers.R$string;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0010\u001a\u00020\u000f2\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/actionHandlers/pdp/sellerSubscribe/SellerUnsubscribeActionHandler;", "Lru/ozon/app/android/actionHandlers/pdp/sellerSubscribe/BaseSellerSubscribeActionHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "sellerFavoriteService", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;)V", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "", "sellerId", "", "updateEvent", "(Ll10/b;Ljava/lang/String;)V", "getErrorNotificationTitle", "()Ljava/lang/String;", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "actionId", "Ljava/lang/String;", "getActionId", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SellerUnsubscribeActionHandler extends BaseSellerSubscribeActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final SellerFavoriteService sellerFavoriteService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerUnsubscribeActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull AuthStateStorage authStateStorage, @NotNull SellerFavoriteService sellerFavoriteService) {
        super(actionV2Repository, authStateStorage);
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(authStateStorage, "authStateStorage");
        Intrinsics.checkNotNullParameter(sellerFavoriteService, "sellerFavoriteService");
        this.sellerFavoriteService = sellerFavoriteService;
        this.actionId = "sisUnlike";
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe.BaseSellerSubscribeActionHandler
    @NotNull
    public String getErrorNotificationTitle() {
        return StringProvider.getString(R$string.seller_unsubscribe_error_text);
    }

    @Override // ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe.BaseSellerSubscribeActionHandler
    public void updateEvent(@NotNull InterfaceC7851b controller, @NotNull String sellerId) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(sellerId, "sellerId");
        Long y02 = h.y0(sellerId);
        if (y02 != null) {
            this.sellerFavoriteService.removeSellerFavoriteLocal(y02.longValue());
        }
        controller.update(new SellerSubscribeUpdateKey(sellerId, false));
    }
}
