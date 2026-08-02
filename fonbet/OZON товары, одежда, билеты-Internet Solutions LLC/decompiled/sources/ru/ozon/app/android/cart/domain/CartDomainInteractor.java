package ru.ozon.app.android.cart.domain;

import Ae.InterfaceC2395h;
import WZ.l;
import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.AddProductsWithTokenizedAnalytics;
import ru.ozon.app.android.cart.domain.model.RemoveProductWithTokenizedAnalyticsParams;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\u0010H'¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cart/domain/CartDomainInteractor;", "", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "attach", "(LWZ/l;)V", "Lru/ozon/app/android/cart/common/models/AddProductsWithTokenizedAnalytics;", "params", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "showErrorNotification", "Lio/reactivex/y;", "Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "addProductsWithTokenizedAnalytics", "(Lru/ozon/app/android/cart/common/models/AddProductsWithTokenizedAnalytics;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)Lio/reactivex/y;", "Lru/ozon/app/android/cart/domain/model/RemoveProductWithTokenizedAnalyticsParams;", "removeProductWithTokenizedAnalytics", "(Lru/ozon/app/android/cart/domain/model/RemoveProductWithTokenizedAnalyticsParams;)Lio/reactivex/y;", "LAe/h;", "Lru/ozon/app/android/cart/common/domain/CartState;", "getCartStateFlow", "()LAe/h;", "cartStateFlow", "getFamilyCartStateFlow", "familyCartStateFlow", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CartDomainInteractor {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ y addProductsWithTokenizedAnalytics$default(CartDomainInteractor cartDomainInteractor, AddProductsWithTokenizedAnalytics addProductsWithTokenizedAnalytics, NotificationDTO notificationDTO, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addProductsWithTokenizedAnalytics");
            }
            if ((i11 & 2) != 0) {
                notificationDTO = null;
            }
            return cartDomainInteractor.addProductsWithTokenizedAnalytics(addProductsWithTokenizedAnalytics, notificationDTO);
        }
    }

    @NotNull
    y<CartAddItemDTO> addProductsWithTokenizedAnalytics(@NotNull AddProductsWithTokenizedAnalytics params, NotificationDTO showErrorNotification);

    void attach(@NotNull l tokenizedAnalytics);

    @NotNull
    InterfaceC2395h<CartState> getCartStateFlow();

    @NotNull
    InterfaceC2395h<CartState> getFamilyCartStateFlow();

    @NotNull
    y<CartAddItemDTO> removeProductWithTokenizedAnalytics(@NotNull RemoveProductWithTokenizedAnalyticsParams params);
}
