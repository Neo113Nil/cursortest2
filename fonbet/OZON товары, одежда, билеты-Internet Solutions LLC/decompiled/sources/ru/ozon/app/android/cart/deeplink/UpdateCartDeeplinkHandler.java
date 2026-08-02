package ru.ozon.app.android.cart.deeplink;

import GZ.j;
import IZ.c;
import Lh.a;
import android.content.Context;
import android.net.Uri;
import com.squareup.moshi.D;
import java.lang.reflect.ParameterizedType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.C8882c;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.data.CartItemRequest;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.models.AddProductsToCartParams;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import ru.ozon.uni.android.flashbar.model.Restriction;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002#$B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/ozon/app/android/cart/deeplink/UpdateCartDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;", "atMostQaUserDestinationInterceptor", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;)V", "Landroid/net/Uri;", "uri", "LpZ/h;", "updateCart", "(Landroid/net/Uri;)LpZ/h;", "Lru/ozon/app/android/cart/common/domain/CartType;", "getCartType", "(Landroid/net/Uri;)Lru/ozon/app/android/cart/common/domain/CartType;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/c;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/c;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Ljava/lang/reflect/ParameterizedType;", "type", "Ljava/lang/reflect/ParameterizedType;", "Companion", "ParseUpdateCartParamsException", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpdateCartDeeplinkHandler extends c {

    @NotNull
    private final CartService cartService;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final ParameterizedType type;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cart/deeplink/UpdateCartDeeplinkHandler$Companion;", "", "<init>", "()V", "CART_UPDATE_AUTHORITY", "", "CART_UPDATE_QUERY_PARAMETER", "CART_UPDATE_CART_TYPE_PARAMETER", "ERROR_PARSE_PRODUCTS_MSG", "UPDATE_CART_SUCCESS_MSG", "UPDATE_CART_ERROR_MSG", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cart/deeplink/UpdateCartDeeplinkHandler$ParseUpdateCartParamsException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "msg", "", "<init>", "(Ljava/lang/String;)V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class ParseUpdateCartParamsException extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParseUpdateCartParamsException(@NotNull String msg) {
            super(msg);
            Intrinsics.checkNotNullParameter(msg, "msg");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateCartDeeplinkHandler(@NotNull CartService cartService, @NotNull JsonParser jsonDeserializer, @NotNull AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor) {
        super(atMostQaUserDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(atMostQaUserDestinationInterceptor, "atMostQaUserDestinationInterceptor");
        this.cartService = cartService;
        this.jsonDeserializer = jsonDeserializer;
        this.type = D.e(List.class, CartItemRequest.class);
    }

    private final CartType getCartType(Uri uri) {
        Object obj;
        String queryParameter = uri.getQueryParameter("cartType");
        if (queryParameter == null) {
            return CartType.MAIN_CART;
        }
        String B02 = h.B0(h.z0(queryParameter).toString(), '\"', '\'');
        Iterator<E> it = CartType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((CartType) obj).getType(), B02)) {
                break;
            }
        }
        CartType cartType = (CartType) obj;
        return cartType == null ? CartType.MAIN_CART : cartType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pZ.h updateCart(Uri uri) {
        List list;
        String str;
        String queryParameter = uri.getQueryParameter("products");
        if (queryParameter == null || (list = (List) this.jsonDeserializer.fromJson(queryParameter, this.type)) == null) {
            throw new ParseUpdateCartParamsException("Ошибка при парсинге products");
        }
        CartType cartType = getCartType(uri);
        List<CartItemRequest> list2 = list;
        int h11 = U.h(C7714v.z(list2, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (CartItemRequest cartItemRequest : list2) {
            Pair pair = new Pair(Long.valueOf(cartItemRequest.getId()), new CartItemInfo(cartItemRequest.getQuantity(), cartItemRequest.getSelectedDeliverySchema(), cartItemRequest.getSortAfterSku(), cartItemRequest.getForStars(), null, cartItemRequest.getParams(), 16, null));
            linkedHashMap.put(pair.e(), pair.f());
        }
        CartAddItemDTO d11 = this.cartService.addMultipleProductsWithPrefetch(new AddProductsToCartParams(linkedHashMap, null, cartType, 2, null)).d();
        if (d11.getSuccess()) {
            str = "Корзина успешно изменена через диплинк";
        } else {
            Restriction restriction = d11.getRestriction();
            if (restriction == null || (str = restriction.getMessage()) == null) {
                str = "Ошибка при изменении корзины через диплинк";
            }
        }
        return new pZ.h(str);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        String queryParameter;
        Intrinsics.checkNotNullParameter(route, "route");
        return Intrinsics.d(route.b().getScheme(), "ozontech") && a.f(route, "cartUpdate") && (queryParameter = route.b().getQueryParameter("products")) != null && !h.K(queryParameter);
    }

    @Override // IZ.a
    @NotNull
    public C8882c getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        return new C8882c(new UpdateCartDeeplinkHandler$getDestination$1(this, route, null));
    }
}
