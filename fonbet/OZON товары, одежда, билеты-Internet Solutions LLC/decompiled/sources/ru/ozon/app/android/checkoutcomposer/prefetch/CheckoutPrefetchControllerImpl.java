package ru.ozon.app.android.checkoutcomposer.prefetch;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7747g;
import kotlin.sequences.l;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchController;
import ru.ozon.app.android.checkoutcomposer.common.configurator.CheckoutRequestInterceptor;
import ru.ozon.app.android.checkoutcomposer.common.configurator.InitCheckoutRequestConfigurator;
import ru.ozon.app.android.checkoutcomposer.flags.CheckoutPrefetchBigFlag;
import ru.ozon.app.android.checkoutcomposer.flags.CheckoutPrefetchFreshFlag;
import ru.ozon.app.android.checkoutcomposer.flags.CheckoutPrefetchUrlWhitelistFlag;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.composer.network.cache.util.PageUrl;
import ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchService;
import ru.ozon.app.android.composer.network.referrer.ReferrerValueController;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.payment.ui.configurators.AvailableNativePaymentInterceptor;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.utils.UriExtKt;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001EBe\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010#\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020'2\u0006\u0010 \u001a\u00020\u001eH\u0002¢\u0006\u0004\b*\u0010+JG\u0010-\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u001e2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b-\u0010.J-\u00100\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u001e2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020/\u0018\u00010\u001dH\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\"H\u0016¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00107R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00108R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00109R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010:R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010;R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010<R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010=R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/prefetch/CheckoutPrefetchControllerImpl;", "Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchService;", "composerPrefetchService", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/checkoutcomposer/prefetch/CheckoutCacheHandler;", "cacheHandler", "Lru/ozon/app/android/checkoutcomposer/common/configurator/InitCheckoutRequestConfigurator;", "initCheckoutRequestConfigurator", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "referrerValueController", "Lru/ozon/app/android/payment/ui/configurators/AvailableNativePaymentInterceptor;", "availableNativePaymentInterceptor", "Lru/ozon/app/android/checkoutcomposer/common/configurator/CheckoutRequestInterceptor;", "checkoutRequestInterceptor", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchService;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/checkoutcomposer/prefetch/CheckoutCacheHandler;Lru/ozon/app/android/checkoutcomposer/common/configurator/InitCheckoutRequestConfigurator;Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;Lru/ozon/app/android/payment/ui/configurators/AvailableNativePaymentInterceptor;Lru/ozon/app/android/checkoutcomposer/common/configurator/CheckoutRequestInterceptor;)V", "Lxe/M;", "coroutineScope", "", "", "params", "deeplink", "currentPage", "", "launchPrefetch", "(Lxe/M;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "", "isPrefetchEnabled", "(Landroid/content/Context;)Z", "isValidUrl", "(Ljava/lang/String;)Z", ImagesContract.URL, "prefetch", "(Ljava/lang/String;Ljava/util/Map;Landroid/content/Context;Lxe/M;Ljava/lang/String;)V", "", "removeCacheForRequestIfNeeded", "(Ljava/lang/String;Ljava/util/Map;)V", "removeAllCache", "()V", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchService;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/checkoutcomposer/prefetch/CheckoutCacheHandler;", "Lru/ozon/app/android/checkoutcomposer/common/configurator/InitCheckoutRequestConfigurator;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "Lru/ozon/app/android/payment/ui/configurators/AvailableNativePaymentInterceptor;", "Lru/ozon/app/android/checkoutcomposer/common/configurator/CheckoutRequestInterceptor;", "Lru/ozon/app/android/checkoutcomposer/prefetch/CheckoutPrefetchControllerImpl$PrefetchedRequest;", "latestPrefetchedRequest", "Lru/ozon/app/android/checkoutcomposer/prefetch/CheckoutPrefetchControllerImpl$PrefetchedRequest;", "Lxe/B0;", "prefetchJob", "Lxe/B0;", "PrefetchedRequest", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckoutPrefetchControllerImpl implements CheckoutPrefetchController {

    @NotNull
    private final AuthStateStorage authStateStorage;

    @NotNull
    private final AvailableNativePaymentInterceptor availableNativePaymentInterceptor;

    @NotNull
    private final CheckoutCacheHandler cacheHandler;

    @NotNull
    private final CheckoutRequestInterceptor checkoutRequestInterceptor;

    @NotNull
    private final ComposerPrefetchService composerPrefetchService;

    @NotNull
    private final CoroutineDispatcherProvider dispatcherProvider;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final InitCheckoutRequestConfigurator initCheckoutRequestConfigurator;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private PrefetchedRequest latestPrefetchedRequest;
    private B0 prefetchJob;

    @NotNull
    private final ReferrerValueController referrerValueController;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/prefetch/CheckoutPrefetchControllerImpl$PrefetchedRequest;", "", ImagesContract.URL, "", "bodyParams", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getUrl", "()Ljava/lang/String;", "getBodyParams", "()Ljava/util/Map;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class PrefetchedRequest {
        private final Map<String, Object> bodyParams;

        @NotNull
        private final String url;

        public PrefetchedRequest(@NotNull String url, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.bodyParams = map;
        }

        public final Map<String, Object> getBodyParams() {
            return this.bodyParams;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }
    }

    public CheckoutPrefetchControllerImpl(@NotNull FeatureChecker featureChecker, @NotNull FeatureService featureService, @NotNull ComposerPrefetchService composerPrefetchService, @NotNull JsonParser jsonDeserializer, @NotNull CheckoutCacheHandler cacheHandler, @NotNull InitCheckoutRequestConfigurator initCheckoutRequestConfigurator, @NotNull AuthStateStorage authStateStorage, @NotNull CoroutineDispatcherProvider dispatcherProvider, @NotNull ReferrerValueController referrerValueController, @NotNull AvailableNativePaymentInterceptor availableNativePaymentInterceptor, @NotNull CheckoutRequestInterceptor checkoutRequestInterceptor) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(composerPrefetchService, "composerPrefetchService");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(cacheHandler, "cacheHandler");
        Intrinsics.checkNotNullParameter(initCheckoutRequestConfigurator, "initCheckoutRequestConfigurator");
        Intrinsics.checkNotNullParameter(authStateStorage, "authStateStorage");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(referrerValueController, "referrerValueController");
        Intrinsics.checkNotNullParameter(availableNativePaymentInterceptor, "availableNativePaymentInterceptor");
        Intrinsics.checkNotNullParameter(checkoutRequestInterceptor, "checkoutRequestInterceptor");
        this.featureChecker = featureChecker;
        this.featureService = featureService;
        this.composerPrefetchService = composerPrefetchService;
        this.jsonDeserializer = jsonDeserializer;
        this.cacheHandler = cacheHandler;
        this.initCheckoutRequestConfigurator = initCheckoutRequestConfigurator;
        this.authStateStorage = authStateStorage;
        this.dispatcherProvider = dispatcherProvider;
        this.referrerValueController = referrerValueController;
        this.availableNativePaymentInterceptor = availableNativePaymentInterceptor;
        this.checkoutRequestInterceptor = checkoutRequestInterceptor;
        this.latestPrefetchedRequest = new PrefetchedRequest("", null);
    }

    private final boolean isPrefetchEnabled(Context context) {
        return MiniAppExtKt.isExpress(context) ? this.featureChecker.isEnabled(CheckoutPrefetchFreshFlag.INSTANCE) : this.featureChecker.isEnabled(CheckoutPrefetchBigFlag.INSTANCE);
    }

    private final boolean isValidUrl(String deeplink) {
        C7747g.a aVar;
        String authority = Uri.parse(deeplink).getAuthority();
        if (authority == null) {
            return false;
        }
        String stringKey = this.featureService.getStringKey(CheckoutPrefetchUrlWhitelistFlag.INSTANCE);
        if (h.K(stringKey)) {
            stringKey = null;
        }
        if (stringKey == null) {
            return true;
        }
        Iterator it = l.h(l.v(h.c0(stringKey, new String[]{","}), CheckoutPrefetchControllerImpl$isValidUrl$1.INSTANCE), CheckoutPrefetchControllerImpl$isValidUrl$2.INSTANCE).iterator();
        do {
            aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                return false;
            }
        } while (!authority.equals((String) aVar.next()));
        return true;
    }

    private final void launchPrefetch(M coroutineScope, Map<String, String> params, String deeplink, String currentPage) {
        this.prefetchJob = C10727i.c(coroutineScope, null, null, new CheckoutPrefetchControllerImpl$launchPrefetch$1(this.prefetchJob, this, params, currentPage, UriExtKt.removeSchema(deeplink), null), 3);
    }

    @Override // ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchController
    public void prefetch(@NotNull String url, Map<String, String> params, @NotNull Context context, @NotNull M coroutineScope, String currentPage) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        if (isValidUrl(url) && this.authStateStorage.isAuthenticated() && isPrefetchEnabled(context)) {
            launchPrefetch(coroutineScope, params, url, currentPage);
        }
    }

    @Override // ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchController
    public void removeAllCache() {
        this.cacheHandler.removeAllCacheForGroup(ClearCacheReason.CHECKOUT_PREFETCH_CONTROLLER_REMOVE_ALL_CACHE);
    }

    public void removeCacheForRequestIfNeeded(@NotNull String url, Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!h.K(this.latestPrefetchedRequest.getUrl()) && (!Intrinsics.d(this.latestPrefetchedRequest.getUrl(), url) || !Intrinsics.d(this.latestPrefetchedRequest.getBodyParams(), params))) {
            this.cacheHandler.m570removeCacheForGroupAD7EpEU(this.cacheHandler.mo637adaptPageUrlForCachingwvZU0FE(PageUrl.m657constructorimpl(this.latestPrefetchedRequest.getUrl())), ClearCacheReason.CHECKOUT_PREFETCH_CONTROLLER_PREFETCH_REQUEST_CHANGED);
        }
        this.latestPrefetchedRequest = new PrefetchedRequest(url, params);
    }
}
