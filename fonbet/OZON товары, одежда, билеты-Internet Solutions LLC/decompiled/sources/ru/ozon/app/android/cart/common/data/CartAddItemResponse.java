package ru.ozon.app.android.cart.common.data;

import K1.G;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010HÆ\u0003J\u0017\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0003J\u008b\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0001J\u0013\u0010/\u001a\u00020\u00032\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#¨\u00064"}, d2 = {"Lru/ozon/app/android/cart/common/data/CartAddItemResponse;", "", "success", "", "deeplink", "", "link", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "Lru/ozon/uni/android/flashbar/model/Restriction;", "cart", "Lru/ozon/app/android/cart/common/data/Cart;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "notificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "params", "", "itemsTrackingInfo", "Lru/ozon/app/android/cart/common/data/CartItemTracking;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/flashbar/model/Restriction;Lru/ozon/app/android/cart/common/data/Cart;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/util/Map;Ljava/util/Map;)V", "getSuccess", "()Z", "getDeeplink", "()Ljava/lang/String;", "getLink", "getRestriction", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "getCart", "()Lru/ozon/app/android/cart/common/data/Cart;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getParams", "()Ljava/util/Map;", "getItemsTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartAddItemResponse {
    private final AtomActionDTO action;
    private final Cart cart;
    private final String deeplink;
    private final Map<String, CartItemTracking> itemsTrackingInfo;
    private final String link;
    private final NotificationDTO notificationBar;
    private final Map<String, String> params;
    private final Restriction restriction;
    private final boolean success;

    public CartAddItemResponse(boolean z11, String str, String str2, Restriction restriction, Cart cart, AtomActionDTO atomActionDTO, NotificationDTO notificationDTO, Map<String, String> map, Map<String, CartItemTracking> map2) {
        this.success = z11;
        this.deeplink = str;
        this.link = str2;
        this.restriction = restriction;
        this.cart = cart;
        this.action = atomActionDTO;
        this.notificationBar = notificationDTO;
        this.params = map;
        this.itemsTrackingInfo = map2;
    }

    public static /* synthetic */ CartAddItemResponse copy$default(CartAddItemResponse cartAddItemResponse, boolean z11, String str, String str2, Restriction restriction, Cart cart, AtomActionDTO atomActionDTO, NotificationDTO notificationDTO, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = cartAddItemResponse.success;
        }
        if ((i11 & 2) != 0) {
            str = cartAddItemResponse.deeplink;
        }
        if ((i11 & 4) != 0) {
            str2 = cartAddItemResponse.link;
        }
        if ((i11 & 8) != 0) {
            restriction = cartAddItemResponse.restriction;
        }
        if ((i11 & 16) != 0) {
            cart = cartAddItemResponse.cart;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = cartAddItemResponse.action;
        }
        if ((i11 & 64) != 0) {
            notificationDTO = cartAddItemResponse.notificationBar;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = cartAddItemResponse.params;
        }
        if ((i11 & 256) != 0) {
            map2 = cartAddItemResponse.itemsTrackingInfo;
        }
        Map map3 = map;
        Map map4 = map2;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        NotificationDTO notificationDTO2 = notificationDTO;
        Cart cart2 = cart;
        String str3 = str2;
        return cartAddItemResponse.copy(z11, str, str3, restriction, cart2, atomActionDTO2, notificationDTO2, map3, map4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* renamed from: component4, reason: from getter */
    public final Restriction getRestriction() {
        return this.restriction;
    }

    /* renamed from: component5, reason: from getter */
    public final Cart getCart() {
        return this.cart;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component7, reason: from getter */
    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    public final Map<String, String> component8() {
        return this.params;
    }

    public final Map<String, CartItemTracking> component9() {
        return this.itemsTrackingInfo;
    }

    @NotNull
    public final CartAddItemResponse copy(boolean success, String deeplink, String link, Restriction restriction, Cart cart, AtomActionDTO action, NotificationDTO notificationBar, Map<String, String> params, Map<String, CartItemTracking> itemsTrackingInfo) {
        return new CartAddItemResponse(success, deeplink, link, restriction, cart, action, notificationBar, params, itemsTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartAddItemResponse)) {
            return false;
        }
        CartAddItemResponse cartAddItemResponse = (CartAddItemResponse) other;
        return this.success == cartAddItemResponse.success && Intrinsics.d(this.deeplink, cartAddItemResponse.deeplink) && Intrinsics.d(this.link, cartAddItemResponse.link) && Intrinsics.d(this.restriction, cartAddItemResponse.restriction) && Intrinsics.d(this.cart, cartAddItemResponse.cart) && Intrinsics.d(this.action, cartAddItemResponse.action) && Intrinsics.d(this.notificationBar, cartAddItemResponse.notificationBar) && Intrinsics.d(this.params, cartAddItemResponse.params) && Intrinsics.d(this.itemsTrackingInfo, cartAddItemResponse.itemsTrackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Cart getCart() {
        return this.cart;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final Map<String, CartItemTracking> getItemsTrackingInfo() {
        return this.itemsTrackingInfo;
    }

    public final String getLink() {
        return this.link;
    }

    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final Restriction getRestriction() {
        return this.restriction;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.success) * 31;
        String str = this.deeplink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.link;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Restriction restriction = this.restriction;
        int hashCode4 = (hashCode3 + (restriction == null ? 0 : restriction.hashCode())) * 31;
        Cart cart = this.cart;
        int hashCode5 = (hashCode4 + (cart == null ? 0 : cart.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        NotificationDTO notificationDTO = this.notificationBar;
        int hashCode7 = (hashCode6 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
        Map<String, String> map = this.params;
        int hashCode8 = (hashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, CartItemTracking> map2 = this.itemsTrackingInfo;
        return hashCode8 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        boolean z11 = this.success;
        String str = this.deeplink;
        String str2 = this.link;
        Restriction restriction = this.restriction;
        Cart cart = this.cart;
        AtomActionDTO atomActionDTO = this.action;
        NotificationDTO notificationDTO = this.notificationBar;
        Map<String, String> map = this.params;
        Map<String, CartItemTracking> map2 = this.itemsTrackingInfo;
        StringBuilder d11 = G.d("CartAddItemResponse(success=", ", deeplink=", str, ", link=", z11);
        d11.append(str2);
        d11.append(", restriction=");
        d11.append(restriction);
        d11.append(", cart=");
        d11.append(cart);
        d11.append(", action=");
        d11.append(atomActionDTO);
        d11.append(", notificationBar=");
        d11.append(notificationDTO);
        d11.append(", params=");
        d11.append(map);
        d11.append(", itemsTrackingInfo=");
        return P.f(d11, map2, ")");
    }
}
