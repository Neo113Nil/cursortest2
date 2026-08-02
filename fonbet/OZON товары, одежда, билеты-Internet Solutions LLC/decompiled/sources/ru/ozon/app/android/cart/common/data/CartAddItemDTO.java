package ru.ozon.app.android.cart.common.data;

import B4.V;
import K1.G;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000fHÆ\u0003J\u0017\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0003J\u007f\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0001J\u0013\u00107\u001a\u00020\u00032\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020%HÖ\u0001J\t\u0010:\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u001f\u0010#\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u001f\u0010'\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0011\u0010)\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+¨\u0006;"}, d2 = {"Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "", "success", "", "deeplink", "", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "Lru/ozon/uni/android/flashbar/model/Restriction;", "cart", "Lru/ozon/app/android/cart/common/data/Cart;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "notificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "params", "", "itemsTrackingInfo", "Lru/ozon/app/android/cart/common/data/CartItemTracking;", "<init>", "(ZLjava/lang/String;Lru/ozon/uni/android/flashbar/model/Restriction;Lru/ozon/app/android/cart/common/data/Cart;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/util/Map;Ljava/util/Map;)V", "getSuccess", "()Z", "getDeeplink", "()Ljava/lang/String;", "getRestriction", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "getCart", "()Lru/ozon/app/android/cart/common/data/Cart;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getParams", "()Ljava/util/Map;", "getItemsTrackingInfo", "items", "", "", "getItems", "familyItems", "getFamilyItems", "totalCount", "getTotalCount", "()I", "totalFamilyCount", "getTotalFamilyCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartAddItemDTO {
    private final AtomActionDTO action;
    private final Cart cart;
    private final String deeplink;
    private final Map<Long, Integer> familyItems;
    private final Map<Long, Integer> items;
    private final Map<String, CartItemTracking> itemsTrackingInfo;
    private final NotificationDTO notificationBar;
    private final Map<String, String> params;
    private final Restriction restriction;
    private final boolean success;
    private final int totalCount;
    private final int totalFamilyCount;

    public CartAddItemDTO(boolean z11, String str, Restriction restriction, Cart cart, AtomActionDTO atomActionDTO, NotificationDTO notificationDTO, Map<String, String> map, Map<String, CartItemTracking> map2) {
        LinkedHashMap linkedHashMap;
        int i11;
        Collection<Integer> values;
        Collection<Integer> values2;
        List<CartItemResponse> cartItemsFamily;
        List<CartItemResponse> cartItems;
        this.success = z11;
        this.deeplink = str;
        this.restriction = restriction;
        this.cart = cart;
        this.action = atomActionDTO;
        this.notificationBar = notificationDTO;
        this.params = map;
        this.itemsTrackingInfo = map2;
        LinkedHashMap linkedHashMap2 = null;
        if (cart == null || (cartItems = cart.getCartItems()) == null) {
            linkedHashMap = null;
        } else {
            List<CartItemResponse> list = cartItems;
            int h11 = U.h(C7714v.z(list, 10));
            linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
            for (CartItemResponse cartItemResponse : list) {
                Pair pair = new Pair(Long.valueOf(cartItemResponse.getId()), Integer.valueOf(cartItemResponse.getQty()));
                linkedHashMap.put(pair.e(), pair.f());
            }
        }
        this.items = linkedHashMap;
        Cart cart2 = this.cart;
        if (cart2 != null && (cartItemsFamily = cart2.getCartItemsFamily()) != null) {
            List<CartItemResponse> list2 = cartItemsFamily;
            int h12 = U.h(C7714v.z(list2, 10));
            linkedHashMap2 = new LinkedHashMap(h12 >= 16 ? h12 : 16);
            for (CartItemResponse cartItemResponse2 : list2) {
                Pair pair2 = new Pair(Long.valueOf(cartItemResponse2.getId()), Integer.valueOf(cartItemResponse2.getQty()));
                linkedHashMap2.put(pair2.e(), pair2.f());
            }
        }
        this.familyItems = linkedHashMap2;
        Map<Long, Integer> map3 = this.items;
        int i12 = 0;
        if (map3 == null || (values2 = map3.values()) == null) {
            i11 = 0;
        } else {
            Iterator<T> it = values2.iterator();
            i11 = 0;
            while (it.hasNext()) {
                i11 += ((Number) it.next()).intValue();
            }
        }
        this.totalCount = i11;
        Map<Long, Integer> map4 = this.familyItems;
        if (map4 != null && (values = map4.values()) != null) {
            Iterator<T> it2 = values.iterator();
            while (it2.hasNext()) {
                i12 += ((Number) it2.next()).intValue();
            }
        }
        this.totalFamilyCount = i12;
    }

    public static /* synthetic */ CartAddItemDTO copy$default(CartAddItemDTO cartAddItemDTO, boolean z11, String str, Restriction restriction, Cart cart, AtomActionDTO atomActionDTO, NotificationDTO notificationDTO, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = cartAddItemDTO.success;
        }
        if ((i11 & 2) != 0) {
            str = cartAddItemDTO.deeplink;
        }
        if ((i11 & 4) != 0) {
            restriction = cartAddItemDTO.restriction;
        }
        if ((i11 & 8) != 0) {
            cart = cartAddItemDTO.cart;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = cartAddItemDTO.action;
        }
        if ((i11 & 32) != 0) {
            notificationDTO = cartAddItemDTO.notificationBar;
        }
        if ((i11 & 64) != 0) {
            map = cartAddItemDTO.params;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map2 = cartAddItemDTO.itemsTrackingInfo;
        }
        Map map3 = map;
        Map map4 = map2;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        NotificationDTO notificationDTO2 = notificationDTO;
        return cartAddItemDTO.copy(z11, str, restriction, cart, atomActionDTO2, notificationDTO2, map3, map4);
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
    public final Restriction getRestriction() {
        return this.restriction;
    }

    /* renamed from: component4, reason: from getter */
    public final Cart getCart() {
        return this.cart;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component6, reason: from getter */
    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    public final Map<String, String> component7() {
        return this.params;
    }

    public final Map<String, CartItemTracking> component8() {
        return this.itemsTrackingInfo;
    }

    @NotNull
    public final CartAddItemDTO copy(boolean success, String deeplink, Restriction restriction, Cart cart, AtomActionDTO action, NotificationDTO notificationBar, Map<String, String> params, Map<String, CartItemTracking> itemsTrackingInfo) {
        return new CartAddItemDTO(success, deeplink, restriction, cart, action, notificationBar, params, itemsTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartAddItemDTO)) {
            return false;
        }
        CartAddItemDTO cartAddItemDTO = (CartAddItemDTO) other;
        return this.success == cartAddItemDTO.success && Intrinsics.d(this.deeplink, cartAddItemDTO.deeplink) && Intrinsics.d(this.restriction, cartAddItemDTO.restriction) && Intrinsics.d(this.cart, cartAddItemDTO.cart) && Intrinsics.d(this.action, cartAddItemDTO.action) && Intrinsics.d(this.notificationBar, cartAddItemDTO.notificationBar) && Intrinsics.d(this.params, cartAddItemDTO.params) && Intrinsics.d(this.itemsTrackingInfo, cartAddItemDTO.itemsTrackingInfo);
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

    public final Map<Long, Integer> getFamilyItems() {
        return this.familyItems;
    }

    public final Map<Long, Integer> getItems() {
        return this.items;
    }

    public final Map<String, CartItemTracking> getItemsTrackingInfo() {
        return this.itemsTrackingInfo;
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

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final int getTotalFamilyCount() {
        return this.totalFamilyCount;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.success) * 31;
        String str = this.deeplink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Restriction restriction = this.restriction;
        int hashCode3 = (hashCode2 + (restriction == null ? 0 : restriction.hashCode())) * 31;
        Cart cart = this.cart;
        int hashCode4 = (hashCode3 + (cart == null ? 0 : cart.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode5 = (hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        NotificationDTO notificationDTO = this.notificationBar;
        int hashCode6 = (hashCode5 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
        Map<String, String> map = this.params;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, CartItemTracking> map2 = this.itemsTrackingInfo;
        return hashCode7 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        boolean z11 = this.success;
        String str = this.deeplink;
        Restriction restriction = this.restriction;
        Cart cart = this.cart;
        AtomActionDTO atomActionDTO = this.action;
        NotificationDTO notificationDTO = this.notificationBar;
        Map<String, String> map = this.params;
        Map<String, CartItemTracking> map2 = this.itemsTrackingInfo;
        StringBuilder d11 = G.d("CartAddItemDTO(success=", ", deeplink=", str, ", restriction=", z11);
        d11.append(restriction);
        d11.append(", cart=");
        d11.append(cart);
        d11.append(", action=");
        d11.append(atomActionDTO);
        d11.append(", notificationBar=");
        d11.append(notificationDTO);
        d11.append(", params=");
        return V.c(d11, map, ", itemsTrackingInfo=", map2, ")");
    }
}
