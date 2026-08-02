package ru.ozon.app.android.composer.network.cache;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/composer/network/cache/ClearCacheReason;", "", "<init>", "(Ljava/lang/String;I)V", "REFRESHED", "SWIPED_TO_REFRESH", "ADULT_STATE_CHANGED", "TEENS_MODE_STATE_CHANGED", "CART_STATE_CHANGED", "FAVORITE_STATE_CHANGED", "USER_STATE_CHANGED", "LOCALE_CHANGED", "LOCATION_STATE_CHANGED", "ADDRESS_STATE_CHANGED", "CURRENCY_STATE_CHANGED", "COUPON_STATE_CHANGED", "PREFETCH_FAILED", "SUGGEST_RESULT_CACHE_HIT", "DIALOG_SEARCH_CACHE_HIT", "CART_MISSING_RESPONSE_MAX_AGE", "CART_PREFETCH_CONTROLLER_PREFETCH", "CART_PREFETCH_CONTROLLER_BEFORE_START_PREFETCH", "CART_PREFETCH_CONTROLLER_CANCEL_ORDER", "CART_PREFETCH_CONTROLLER_CANCEL_ORDER_HANDLER_V3", "CHECKOUT_MISSING_RESPONSE_MAX_AGE", "CHECKOUT_PREFETCH_CONTROLLER_PREFETCH_REQUEST_CHANGED", "CHECKOUT_PREFETCH_CONTROLLER_REMOVE_ALL_CACHE", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClearCacheReason {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ClearCacheReason[] $VALUES;
    public static final ClearCacheReason REFRESHED = new ClearCacheReason("REFRESHED", 0);
    public static final ClearCacheReason SWIPED_TO_REFRESH = new ClearCacheReason("SWIPED_TO_REFRESH", 1);
    public static final ClearCacheReason ADULT_STATE_CHANGED = new ClearCacheReason("ADULT_STATE_CHANGED", 2);
    public static final ClearCacheReason TEENS_MODE_STATE_CHANGED = new ClearCacheReason("TEENS_MODE_STATE_CHANGED", 3);
    public static final ClearCacheReason CART_STATE_CHANGED = new ClearCacheReason("CART_STATE_CHANGED", 4);
    public static final ClearCacheReason FAVORITE_STATE_CHANGED = new ClearCacheReason("FAVORITE_STATE_CHANGED", 5);
    public static final ClearCacheReason USER_STATE_CHANGED = new ClearCacheReason("USER_STATE_CHANGED", 6);
    public static final ClearCacheReason LOCALE_CHANGED = new ClearCacheReason("LOCALE_CHANGED", 7);
    public static final ClearCacheReason LOCATION_STATE_CHANGED = new ClearCacheReason("LOCATION_STATE_CHANGED", 8);
    public static final ClearCacheReason ADDRESS_STATE_CHANGED = new ClearCacheReason("ADDRESS_STATE_CHANGED", 9);
    public static final ClearCacheReason CURRENCY_STATE_CHANGED = new ClearCacheReason("CURRENCY_STATE_CHANGED", 10);
    public static final ClearCacheReason COUPON_STATE_CHANGED = new ClearCacheReason("COUPON_STATE_CHANGED", 11);
    public static final ClearCacheReason PREFETCH_FAILED = new ClearCacheReason("PREFETCH_FAILED", 12);
    public static final ClearCacheReason SUGGEST_RESULT_CACHE_HIT = new ClearCacheReason("SUGGEST_RESULT_CACHE_HIT", 13);
    public static final ClearCacheReason DIALOG_SEARCH_CACHE_HIT = new ClearCacheReason("DIALOG_SEARCH_CACHE_HIT", 14);
    public static final ClearCacheReason CART_MISSING_RESPONSE_MAX_AGE = new ClearCacheReason("CART_MISSING_RESPONSE_MAX_AGE", 15);
    public static final ClearCacheReason CART_PREFETCH_CONTROLLER_PREFETCH = new ClearCacheReason("CART_PREFETCH_CONTROLLER_PREFETCH", 16);
    public static final ClearCacheReason CART_PREFETCH_CONTROLLER_BEFORE_START_PREFETCH = new ClearCacheReason("CART_PREFETCH_CONTROLLER_BEFORE_START_PREFETCH", 17);
    public static final ClearCacheReason CART_PREFETCH_CONTROLLER_CANCEL_ORDER = new ClearCacheReason("CART_PREFETCH_CONTROLLER_CANCEL_ORDER", 18);
    public static final ClearCacheReason CART_PREFETCH_CONTROLLER_CANCEL_ORDER_HANDLER_V3 = new ClearCacheReason("CART_PREFETCH_CONTROLLER_CANCEL_ORDER_HANDLER_V3", 19);
    public static final ClearCacheReason CHECKOUT_MISSING_RESPONSE_MAX_AGE = new ClearCacheReason("CHECKOUT_MISSING_RESPONSE_MAX_AGE", 20);
    public static final ClearCacheReason CHECKOUT_PREFETCH_CONTROLLER_PREFETCH_REQUEST_CHANGED = new ClearCacheReason("CHECKOUT_PREFETCH_CONTROLLER_PREFETCH_REQUEST_CHANGED", 21);
    public static final ClearCacheReason CHECKOUT_PREFETCH_CONTROLLER_REMOVE_ALL_CACHE = new ClearCacheReason("CHECKOUT_PREFETCH_CONTROLLER_REMOVE_ALL_CACHE", 22);

    private static final /* synthetic */ ClearCacheReason[] $values() {
        return new ClearCacheReason[]{REFRESHED, SWIPED_TO_REFRESH, ADULT_STATE_CHANGED, TEENS_MODE_STATE_CHANGED, CART_STATE_CHANGED, FAVORITE_STATE_CHANGED, USER_STATE_CHANGED, LOCALE_CHANGED, LOCATION_STATE_CHANGED, ADDRESS_STATE_CHANGED, CURRENCY_STATE_CHANGED, COUPON_STATE_CHANGED, PREFETCH_FAILED, SUGGEST_RESULT_CACHE_HIT, DIALOG_SEARCH_CACHE_HIT, CART_MISSING_RESPONSE_MAX_AGE, CART_PREFETCH_CONTROLLER_PREFETCH, CART_PREFETCH_CONTROLLER_BEFORE_START_PREFETCH, CART_PREFETCH_CONTROLLER_CANCEL_ORDER, CART_PREFETCH_CONTROLLER_CANCEL_ORDER_HANDLER_V3, CHECKOUT_MISSING_RESPONSE_MAX_AGE, CHECKOUT_PREFETCH_CONTROLLER_PREFETCH_REQUEST_CHANGED, CHECKOUT_PREFETCH_CONTROLLER_REMOVE_ALL_CACHE};
    }

    static {
        ClearCacheReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ClearCacheReason(String str, int i11) {
    }

    public static ClearCacheReason valueOf(String str) {
        return (ClearCacheReason) Enum.valueOf(ClearCacheReason.class, str);
    }

    public static ClearCacheReason[] values() {
        return (ClearCacheReason[]) $VALUES.clone();
    }
}
