package ru.ozon.app.android.cart.domain.prefetch.cache;

import Qj0.B;
import Qj0.G;
import Qj0.Q;
import Qj0.U;
import Qj0.t0;
import Sc.o;
import We.L;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ImagesContract;
import ei0.InterfaceC6369b;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.domain.prefetch.flags.SendPclPagePerformanceEventEnabled;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.composer.network.cache.util.AdaptedUrl;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.tracker.performance.ObjectTypes;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\b\u0005\b\u0001\u0018\u0000 J2\u00020\u0001:\u0001JB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u001a\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J_\u0010)\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b'\u0010(J/\u00101\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\n2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00104\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u0016¢\u0006\u0004\b6\u00107J\u001d\u0010:\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u0016¢\u0006\u0004\b8\u00109J!\u0010=\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b;\u0010<J\u001d\u0010@\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u00105\u001a\u00020\u0017¢\u0006\u0004\b>\u0010?J'\u0010C\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010DR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010ER \u0010G\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001e0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR \u0010I\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010H¨\u0006K"}, d2 = {"Lru/ozon/app/android/cart/domain/prefetch/cache/PclPageTracker;", "", "Lei0/b;", "ozonTracker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lei0/b;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/app/android/composer/network/cache/util/AdaptedUrl;", ImagesContract.URL, "", "maxAge", "", "requestId", "", "didCache-6yvGy08", "(Ljava/lang/String;ILjava/lang/String;)V", "didCache", "statusCode", "goToUrl-m93uvGI", "(Ljava/lang/String;I)V", "goToUrl", "Lru/ozon/app/android/composer/network/cache/ClearCacheReason;", "Lru/ozon/app/android/cart/domain/prefetch/cache/CartCacheReason;", "toCacheReason-p4RCBwo", "(Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)Ljava/lang/String;", "toCacheReason", "Lru/ozon/app/android/composer/network/cache/util/AdaptedPageUrl;", "pageUrl", "", "Lru/ozon/app/android/cart/domain/prefetch/cache/CacheData;", "getByPageUrl-s5N2fkQ", "(Ljava/lang/String;)Ljava/util/Map;", "getByPageUrl", "cacheEventType", "cacheReason", "", "cacheLifeTime", "cacheMaxAge", "track-XRZuTpQ", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "track", "", "isPrefetch", "responseMaxAge", "LWe/L;", "response", "didRequest-0QDl-Tg", "(Ljava/lang/String;ZLjava/lang/Integer;LWe/L;)V", "didRequest", "didCacheHit-s7RZ03s", "(Ljava/lang/String;)V", "didCacheHit", "reason", "invalidateCache", "(Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)V", "invalidateCacheFor-AD7EpEU", "(Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)V", "invalidateCacheFor", "didPrefetchError-m93uvGI", "(Ljava/lang/String;LWe/L;)V", "didPrefetchError", "setPrefetchReason-fi36itM", "(Ljava/lang/String;Ljava/lang/String;)V", "setPrefetchReason", "pageLoad-vorYDGg", "(Ljava/lang/String;Ljava/lang/String;I)V", "pageLoad", "Lei0/b;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "", "urlsCachingData", "Ljava/util/Map;", "urlsPrefetchReasons", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PclPageTracker {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final InterfaceC6369b ozonTracker;

    @NotNull
    private final Map<AdaptedUrl, CacheData> urlsCachingData;

    @NotNull
    private final Map<AdaptedUrl, CartCacheReason> urlsPrefetchReasons;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/domain/prefetch/cache/PclPageTracker$Companion;", "", "<init>", "()V", "REASON_SHOULD_CACHE_INVALIDATE", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClearCacheReason.values().length];
            try {
                iArr[ClearCacheReason.REFRESHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClearCacheReason.SWIPED_TO_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClearCacheReason.ADULT_STATE_CHANGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClearCacheReason.TEENS_MODE_STATE_CHANGED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClearCacheReason.CART_STATE_CHANGED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ClearCacheReason.FAVORITE_STATE_CHANGED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ClearCacheReason.USER_STATE_CHANGED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ClearCacheReason.LOCALE_CHANGED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ClearCacheReason.LOCATION_STATE_CHANGED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ClearCacheReason.ADDRESS_STATE_CHANGED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ClearCacheReason.CURRENCY_STATE_CHANGED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ClearCacheReason.COUPON_STATE_CHANGED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ClearCacheReason.PREFETCH_FAILED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ClearCacheReason.SUGGEST_RESULT_CACHE_HIT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ClearCacheReason.DIALOG_SEARCH_CACHE_HIT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ClearCacheReason.CART_MISSING_RESPONSE_MAX_AGE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ClearCacheReason.CART_PREFETCH_CONTROLLER_PREFETCH.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ClearCacheReason.CART_PREFETCH_CONTROLLER_BEFORE_START_PREFETCH.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ClearCacheReason.CART_PREFETCH_CONTROLLER_CANCEL_ORDER.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ClearCacheReason.CART_PREFETCH_CONTROLLER_CANCEL_ORDER_HANDLER_V3.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ClearCacheReason.CHECKOUT_MISSING_RESPONSE_MAX_AGE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ClearCacheReason.CHECKOUT_PREFETCH_CONTROLLER_PREFETCH_REQUEST_CHANGED.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ClearCacheReason.CHECKOUT_PREFETCH_CONTROLLER_REMOVE_ALL_CACHE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PclPageTracker(@NotNull InterfaceC6369b ozonTracker, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.ozonTracker = ozonTracker;
        this.featureChecker = featureChecker;
        this.urlsCachingData = new ConcurrentHashMap();
        this.urlsPrefetchReasons = new ConcurrentHashMap();
    }

    /* renamed from: didCache-6yvGy08, reason: not valid java name */
    private final void m533didCache6yvGy08(String url, int maxAge, String requestId) {
        if (maxAge > 0) {
            CacheData cacheData = new CacheData(maxAge, SystemClock.elapsedRealtime(), requestId);
            this.urlsCachingData.put(AdaptedUrl.m649boximpl(url), cacheData);
            m539trackXRZuTpQ$default(this, "didCache", cacheData.getRequestId(), null, null, Integer.valueOf(maxAge), url, null, 76, null);
        }
    }

    /* renamed from: didPrefetchError-m93uvGI$default, reason: not valid java name */
    public static /* synthetic */ void m534didPrefetchErrorm93uvGI$default(PclPageTracker pclPageTracker, String str, L l11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l11 = null;
        }
        pclPageTracker.m541didPrefetchErrorm93uvGI(str, l11);
    }

    /* renamed from: getByPageUrl-s5N2fkQ, reason: not valid java name */
    private final Map<AdaptedUrl, CacheData> m535getByPageUrls5N2fkQ(String pageUrl) {
        Map<AdaptedUrl, CacheData> map = this.urlsCachingData;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<AdaptedUrl, CacheData> entry : map.entrySet()) {
            if (h.e0(entry.getKey().getValue(), pageUrl, false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* renamed from: goToUrl-m93uvGI, reason: not valid java name */
    private final void m536goToUrlm93uvGI(String url, int statusCode) {
        CacheData remove = this.urlsCachingData.remove(AdaptedUrl.m649boximpl(url));
        if (remove == null) {
            return;
        }
        remove.endCache();
        m538trackXRZuTpQ("didCacheMiss", remove.getRequestId(), remove.getIsExpired() ? CartCacheReason.m528constructorimpl("expired") : null, Double.valueOf(remove.getCacheLifeTime()), Integer.valueOf(remove.getMaxAge()), url, Integer.valueOf(statusCode));
        if (remove.getIsExpired()) {
            m539trackXRZuTpQ$default(this, "expired", remove.getRequestId(), null, Double.valueOf(remove.getCacheLifeTime()), null, url, null, 84, null);
        }
    }

    /* renamed from: toCacheReason-p4RCBwo, reason: not valid java name */
    private final String m537toCacheReasonp4RCBwo(ClearCacheReason clearCacheReason) {
        String str;
        switch (WhenMappings.$EnumSwitchMapping$0[clearCacheReason.ordinal()]) {
            case 1:
                str = "refreshingPage";
                break;
            case 2:
                str = "pullToRefreshCart";
                break;
            case 3:
                str = "adultStateChanged";
                break;
            case 4:
                str = "teensModeStateChanged";
                break;
            case 5:
                str = "changeInCart";
                break;
            case 6:
                str = "changesInFavorites";
                break;
            case 7:
                str = "userStateChanged";
                break;
            case 8:
                str = "localeDidChange";
                break;
            case 9:
                str = "locationStateChanged";
                break;
            case 10:
                str = "addressStateChanged";
                break;
            case 11:
                str = "currentCurrencyDidChange";
                break;
            case 12:
                str = "addingCoupon";
                break;
            case 13:
                str = "prefetchFailed";
                break;
            case 14:
                str = "suggestResultCacheHit";
                break;
            case 15:
                str = "dialogSearchCacheHit";
                break;
            case 16:
                str = "cartMissingResponseMaxAge";
                break;
            case 17:
                str = "cartComposerDidLoad";
                break;
            case 18:
                str = "beforeStartPrefetch";
                break;
            case 19:
                str = "cancellingOrder";
                break;
            case 20:
                str = "cancelOrderHandlerV3";
                break;
            case 21:
                str = "checkoutMissingResponseMaxAge";
                break;
            case 22:
                str = "checkoutPrefetchControllerPrefetchRequestChanged";
                break;
            case 23:
                str = "checkoutPrefetchControllerRemoveAllCache";
                break;
            default:
                throw new o();
        }
        return CartCacheReason.m528constructorimpl(str);
    }

    /* renamed from: track-XRZuTpQ, reason: not valid java name */
    private final void m538trackXRZuTpQ(String cacheEventType, String requestId, String cacheReason, Double cacheLifeTime, Integer cacheMaxAge, String url, Integer statusCode) {
        String str = cacheEventType + ";" + (cacheReason == null ? null : cacheReason) + ";" + requestId;
        U beginTrace = this.ozonTracker.beginTrace(str);
        if (cacheReason == null) {
            cacheReason = null;
        }
        G g10 = new G(cacheEventType, cacheReason, cacheLifeTime, cacheMaxAge != null ? Long.valueOf(cacheMaxAge.intValue()) : null);
        int i11 = U.f23535i;
        beginTrace.n(g10, true);
        beginTrace.n(new B(ObjectTypes.PCL_PAGE), true);
        if (url != null) {
            beginTrace.n(new t0(url), true);
        }
        if (requestId != null) {
            beginTrace.n(new Qj0.L(requestId), true);
        }
        if (statusCode != null) {
            beginTrace.n(new Q(statusCode.intValue()), true);
        }
        this.ozonTracker.endTrace(str);
    }

    /* renamed from: track-XRZuTpQ$default, reason: not valid java name */
    static /* synthetic */ void m539trackXRZuTpQ$default(PclPageTracker pclPageTracker, String str, String str2, String str3, Double d11, Integer num, String str4, Integer num2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        if ((i11 & 8) != 0) {
            d11 = null;
        }
        if ((i11 & 16) != 0) {
            num = null;
        }
        if ((i11 & 32) != 0) {
            str4 = null;
        }
        if ((i11 & 64) != 0) {
            num2 = null;
        }
        pclPageTracker.m538trackXRZuTpQ(str, str2, str3, d11, num, str4, num2);
    }

    /* renamed from: didCacheHit-s7RZ03s, reason: not valid java name */
    public final void m540didCacheHits7RZ03s(@NotNull String url) {
        CacheData remove;
        Intrinsics.checkNotNullParameter(url, "url");
        if (!this.featureChecker.isEnabled(SendPclPagePerformanceEventEnabled.INSTANCE) || (remove = this.urlsCachingData.remove(AdaptedUrl.m649boximpl(url))) == null) {
            return;
        }
        remove.endCache();
        m539trackXRZuTpQ$default(this, "didCacheHit", remove.getRequestId(), null, Double.valueOf(remove.getCacheLifeTime()), Integer.valueOf(remove.getMaxAge()), url, 999, 4, null);
    }

    /* renamed from: didPrefetchError-m93uvGI, reason: not valid java name */
    public final void m541didPrefetchErrorm93uvGI(@NotNull String pageUrl, L response) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        if (this.featureChecker.isEnabled(SendPclPagePerformanceEventEnabled.INSTANCE)) {
            CartCacheReason cartCacheReason = this.urlsPrefetchReasons.get(AdaptedUrl.m649boximpl(pageUrl));
            m539trackXRZuTpQ$default(this, "didPrefetchError", null, cartCacheReason != null ? cartCacheReason.getValue() : null, null, null, pageUrl, response != null ? Integer.valueOf(response.m()) : null, 26, null);
        }
    }

    /* renamed from: didRequest-0QDl-Tg, reason: not valid java name */
    public final void m542didRequest0QDlTg(@NotNull String url, boolean isPrefetch, Integer responseMaxAge, @NotNull L response) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(response, "response");
        if (this.featureChecker.isEnabled(SendPclPagePerformanceEventEnabled.INSTANCE)) {
            if (!response.v()) {
                if (isPrefetch) {
                    m541didPrefetchErrorm93uvGI(url, response);
                    return;
                }
                return;
            }
            String c11 = response.r().c("server-timing");
            String requestIdOrNull = c11 != null ? RequestIdParserKt.requestIdOrNull(c11) : null;
            if (!isPrefetch) {
                m536goToUrlm93uvGI(url, response.m());
            } else if (responseMaxAge != null) {
                CartCacheReason cartCacheReason = this.urlsPrefetchReasons.get(AdaptedUrl.m649boximpl(url));
                m539trackXRZuTpQ$default(this, "didPrefetch", requestIdOrNull, cartCacheReason != null ? cartCacheReason.getValue() : null, null, responseMaxAge, url, Integer.valueOf(response.m()), 8, null);
                m533didCache6yvGy08(url, responseMaxAge.intValue(), requestIdOrNull);
            }
        }
    }

    public final void invalidateCache(@NotNull ClearCacheReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (this.featureChecker.isEnabled(SendPclPagePerformanceEventEnabled.INSTANCE)) {
            if (this.urlsCachingData.isEmpty()) {
                m539trackXRZuTpQ$default(this, "shouldCacheInvalidate", null, m537toCacheReasonp4RCBwo(reason), null, null, null, null, 122, null);
                return;
            }
            for (Map.Entry<AdaptedUrl, CacheData> entry : this.urlsCachingData.entrySet()) {
                entry.getValue().endCache();
                String m537toCacheReasonp4RCBwo = m537toCacheReasonp4RCBwo(reason);
                double cacheLifeTime = entry.getValue().getCacheLifeTime();
                int maxAge = entry.getValue().getMaxAge();
                m539trackXRZuTpQ$default(this, "shouldCacheInvalidate", entry.getValue().getRequestId(), m537toCacheReasonp4RCBwo, Double.valueOf(cacheLifeTime), Integer.valueOf(maxAge), entry.getKey().getValue(), null, 64, null);
            }
        }
    }

    /* renamed from: invalidateCacheFor-AD7EpEU, reason: not valid java name */
    public final void m543invalidateCacheForAD7EpEU(@NotNull String pageUrl, @NotNull ClearCacheReason reason) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (this.featureChecker.isEnabled(SendPclPagePerformanceEventEnabled.INSTANCE)) {
            Map<AdaptedUrl, CacheData> m535getByPageUrls5N2fkQ = m535getByPageUrls5N2fkQ(pageUrl);
            if (m535getByPageUrls5N2fkQ.isEmpty()) {
                m539trackXRZuTpQ$default(this, "shouldCacheInvalidate", null, m537toCacheReasonp4RCBwo(reason), null, null, null, null, 122, null);
                return;
            }
            for (Map.Entry<AdaptedUrl, CacheData> entry : m535getByPageUrls5N2fkQ.entrySet()) {
                entry.getValue().endCache();
                String m537toCacheReasonp4RCBwo = m537toCacheReasonp4RCBwo(reason);
                double cacheLifeTime = entry.getValue().getCacheLifeTime();
                int maxAge = entry.getValue().getMaxAge();
                m539trackXRZuTpQ$default(this, "shouldCacheInvalidate", entry.getValue().getRequestId(), m537toCacheReasonp4RCBwo, Double.valueOf(cacheLifeTime), Integer.valueOf(maxAge), entry.getKey().getValue(), null, 64, null);
            }
        }
    }

    /* renamed from: pageLoad-vorYDGg, reason: not valid java name */
    public final void m544pageLoadvorYDGg(String requestId, @NotNull String url, int statusCode) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.featureChecker.isEnabled(SendPclPagePerformanceEventEnabled.INSTANCE)) {
            m539trackXRZuTpQ$default(this, "pageLoad", requestId, null, null, null, url, Integer.valueOf(statusCode), 28, null);
        }
    }

    /* renamed from: setPrefetchReason-fi36itM, reason: not valid java name */
    public final void m545setPrefetchReasonfi36itM(@NotNull String url, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (this.featureChecker.isEnabled(SendPclPagePerformanceEventEnabled.INSTANCE)) {
            this.urlsPrefetchReasons.put(AdaptedUrl.m649boximpl(url), CartCacheReason.m527boximpl(reason));
        }
    }
}
