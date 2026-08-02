package ru.ozon.app.android.cart.domain.prefetch.cache;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.w0;
import We.L;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.domain.prefetch.flags.CartPrefetchWithJoinEnabled;
import ru.ozon.app.android.cart.domain.prefetch.flags.CartRemoveExtraCacheRemovalFlag;
import ru.ozon.app.android.cart.domain.utils.CartDeeplinkValidator;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.composer.network.cache.ComposerCacheCleaner;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;
import ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl;
import ru.ozon.app.android.composer.network.cache.util.Url;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001f\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010*\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020&2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010/\u001a\u00020)2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b0\u00101J\u001d\u00105\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020&2\u0006\u0010\u000f\u001a\u000202¢\u0006\u0004\b3\u00104J'\u00108\u001a\u00020)2\b\u00106\u001a\u0004\u0018\u00010&2\u0006\u0010\u0017\u001a\u00020&2\u0006\u00107\u001a\u00020\u0019¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:R\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010>R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000e0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000e0B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010H\u001a\u00020G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lru/ozon/app/android/cart/domain/prefetch/cache/CartCacheHandler;", "Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandlerDefaultImpl;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/cart/domain/prefetch/cache/CartAdaptRequestForCachingDelegate;", "adaptRequestForCachingDelegate", "Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;", "composerCacheCleaner", "Lru/ozon/app/android/cart/domain/prefetch/cache/PclPageTracker;", "pclPageTracker", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/cart/domain/prefetch/cache/CartAdaptRequestForCachingDelegate;Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;Lru/ozon/app/android/cart/domain/prefetch/cache/PclPageTracker;)V", "Lru/ozon/app/android/composer/network/cache/util/PageUrl;", "pageUrl", "Lru/ozon/app/android/composer/network/cache/ClearCacheReason;", "reason", "", "shouldClearCacheFor-FyG2aqw", "(Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)Z", "shouldClearCacheFor", "shouldClearAllCache", "(Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)Z", "Lru/ozon/app/android/composer/network/cache/util/Url;", ImagesContract.URL, "isPrefetch", "", "responseMaxAge", "LWe/L;", "response", "formatMaxAgeForCaching-pM1TDTc", "(Ljava/lang/String;ZLjava/lang/Integer;LWe/L;)Ljava/lang/Integer;", "formatMaxAgeForCaching", "canHandle-46iOEHo", "(Ljava/lang/String;Ljava/lang/String;)Z", "canHandle", "shouldJoinRequest-VgcI5v0", "(Ljava/lang/String;)Z", "shouldJoinRequest", "", "", "throwable", "", "onPrefetchFail", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "requestUrl", "onCacheHit-zMoF2ac", "(Ljava/lang/String;LWe/L;)V", "onCacheHit", "removeAllCacheForGroup", "(Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)V", "Lru/ozon/app/android/cart/domain/prefetch/cache/CartCacheReason;", "setPrefetchReason-CvmKg8I", "(Ljava/lang/String;Ljava/lang/String;)V", "setPrefetchReason", "requestId", "statusCode", "tracePageLoad", "(Ljava/lang/String;Ljava/lang/String;I)V", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/cart/domain/prefetch/cache/CartAdaptRequestForCachingDelegate;", "getAdaptRequestForCachingDelegate", "()Lru/ozon/app/android/cart/domain/prefetch/cache/CartAdaptRequestForCachingDelegate;", "Lru/ozon/app/android/cart/domain/prefetch/cache/PclPageTracker;", "LAe/w0;", "_cartClearCacheReasonSharedFlow", "LAe/w0;", "LAe/B0;", "cartClearCacheReasonSharedFlow", "LAe/B0;", "getCartClearCacheReasonSharedFlow", "()LAe/B0;", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "cacheGroup", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "getCacheGroup", "()Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "getRemoveExtraDeleteCache", "()Z", "removeExtraDeleteCache", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartCacheHandler extends ComposerCacheHandlerDefaultImpl {

    @NotNull
    private final w0<ClearCacheReason> _cartClearCacheReasonSharedFlow;

    @NotNull
    private final CartAdaptRequestForCachingDelegate adaptRequestForCachingDelegate;

    @NotNull
    private final CacheGroup cacheGroup;

    @NotNull
    private final B0<ClearCacheReason> cartClearCacheReasonSharedFlow;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final PclPageTracker pclPageTracker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartCacheHandler(@NotNull FeatureChecker featureChecker, @NotNull CartAdaptRequestForCachingDelegate adaptRequestForCachingDelegate, @NotNull ComposerCacheCleaner composerCacheCleaner, @NotNull PclPageTracker pclPageTracker) {
        super(composerCacheCleaner);
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(adaptRequestForCachingDelegate, "adaptRequestForCachingDelegate");
        Intrinsics.checkNotNullParameter(composerCacheCleaner, "composerCacheCleaner");
        Intrinsics.checkNotNullParameter(pclPageTracker, "pclPageTracker");
        this.featureChecker = featureChecker;
        this.adaptRequestForCachingDelegate = adaptRequestForCachingDelegate;
        this.pclPageTracker = pclPageTracker;
        C0 b11 = E0.b(0, 1, EnumC11113a.DROP_OLDEST, 1);
        this._cartClearCacheReasonSharedFlow = b11;
        this.cartClearCacheReasonSharedFlow = C2399j.a(b11);
        this.cacheGroup = CartCacheGroup.INSTANCE;
    }

    private final boolean getRemoveExtraDeleteCache() {
        return this.featureChecker.isEnabled(CartRemoveExtraCacheRemovalFlag.INSTANCE);
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl, ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    /* renamed from: canHandle-46iOEHo, reason: not valid java name */
    public boolean mo521canHandle46iOEHo(@NotNull String url, String pageUrl) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (pageUrl == null) {
            return super.mo521canHandle46iOEHo(url, null);
        }
        return CartDeeplinkValidator.INSTANCE.validateCash(Uri.parse("ozon://" + h.S(pageUrl, "/")));
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl, ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    /* renamed from: formatMaxAgeForCaching-pM1TDTc, reason: not valid java name */
    public Integer mo522formatMaxAgeForCachingpM1TDTc(@NotNull String url, boolean isPrefetch, Integer responseMaxAge, @NotNull L response) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(response, "response");
        if (getRemoveExtraDeleteCache() && responseMaxAge == null && isPrefetch) {
            removeAllCacheForGroup(ClearCacheReason.CART_MISSING_RESPONSE_MAX_AGE);
        } else if (!getRemoveExtraDeleteCache() && responseMaxAge == null) {
            removeAllCacheForGroup(ClearCacheReason.CART_MISSING_RESPONSE_MAX_AGE);
        }
        this.pclPageTracker.m542didRequest0QDlTg(mo607adaptRequestForCachingjpqkY4(url), isPrefetch, responseMaxAge, response);
        return responseMaxAge;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    @NotNull
    public CacheGroup getCacheGroup() {
        return this.cacheGroup;
    }

    @NotNull
    public final B0<ClearCacheReason> getCartClearCacheReasonSharedFlow() {
        return this.cartClearCacheReasonSharedFlow;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl, ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    /* renamed from: onCacheHit-zMoF2ac, reason: not valid java name */
    public void mo523onCacheHitzMoF2ac(@NotNull String requestUrl, @NotNull L response) {
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        Intrinsics.checkNotNullParameter(response, "response");
        this.pclPageTracker.m540didCacheHits7RZ03s(mo607adaptRequestForCachingjpqkY4(requestUrl));
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl, ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    public void onPrefetchFail(@NotNull String url, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        PclPageTracker.m534didPrefetchErrorm93uvGI$default(this.pclPageTracker, mo607adaptRequestForCachingjpqkY4(Url.m665constructorimpl(url)), null, 2, null);
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl
    public void removeAllCacheForGroup(@NotNull ClearCacheReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        super.removeAllCacheForGroup(reason);
        this.pclPageTracker.invalidateCache(reason);
    }

    /* renamed from: setPrefetchReason-CvmKg8I, reason: not valid java name */
    public final void m524setPrefetchReasonCvmKg8I(@NotNull String url, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.pclPageTracker.m545setPrefetchReasonfi36itM(mo607adaptRequestForCachingjpqkY4(Url.m665constructorimpl(url)), reason);
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl, ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    public boolean shouldClearAllCache(@NotNull ClearCacheReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this._cartClearCacheReasonSharedFlow.tryEmit(reason);
        boolean z11 = reason != ClearCacheReason.CART_STATE_CHANGED;
        if (z11) {
            this.pclPageTracker.invalidateCache(reason);
        }
        return z11;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl, ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    /* renamed from: shouldClearCacheFor-FyG2aqw, reason: not valid java name */
    public boolean mo525shouldClearCacheForFyG2aqw(@NotNull String pageUrl, @NotNull ClearCacheReason reason) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        Intrinsics.checkNotNullParameter(reason, "reason");
        boolean z11 = false;
        if (!getRemoveExtraDeleteCache() ? reason != ClearCacheReason.REFRESHED : !(reason == ClearCacheReason.REFRESHED || reason == ClearCacheReason.SWIPED_TO_REFRESH)) {
            z11 = true;
        }
        if (z11) {
            this.pclPageTracker.m543invalidateCacheForAD7EpEU(mo637adaptPageUrlForCachingwvZU0FE(pageUrl), reason);
        }
        return z11;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl, ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    /* renamed from: shouldJoinRequest-VgcI5v0, reason: not valid java name */
    public boolean mo526shouldJoinRequestVgcI5v0(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.featureChecker.isEnabled(CartPrefetchWithJoinEnabled.INSTANCE);
    }

    public final void tracePageLoad(String requestId, @NotNull String url, int statusCode) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.pclPageTracker.m544pageLoadvorYDGg(requestId, mo607adaptRequestForCachingjpqkY4(Url.m665constructorimpl(url)), statusCode);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl
    @NotNull
    public CartAdaptRequestForCachingDelegate getAdaptRequestForCachingDelegate() {
        return this.adaptRequestForCachingDelegate;
    }
}
