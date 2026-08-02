package ru.ozon.app.android.common;

import Fl.e;
import L00.c;
import L00.d;
import L00.g;
import L00.j;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import io.reactivex.k;
import io.reactivex.x;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.common.SearchUrlPrefetchServiceImpl;
import ru.ozon.app.android.common.flags.CancelPrefetchedSearchCallsFlag;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;
import ru.ozon.app.android.composer.network.cache.flags.PlatformNetworkCachingEnabledFlag;
import ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchService;
import ru.ozon.app.android.composer.network.prefetch.ComposerRunningPrefetchedRequestUrlsHolder;
import ru.ozon.app.android.composer.network.prefetch.UrlPrefetchedEventHolder;
import ru.ozon.app.android.composer.network.util.ComposerRequestsKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.UriExtKt;
import sc.C9653a;
import sc.C9656b;
import xc.C10699b;
import xc.h;
import xc.n;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J'\u0010&\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010\u0016JC\u0010+\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140'2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/app/android/common/SearchUrlPrefetchServiceImpl;", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchService;", "composerPrefetchService", "LL00/d;", "callFactory", "Lru/ozon/app/android/composer/network/prefetch/ComposerRunningPrefetchedRequestUrlsHolder;", "composerRunningPrefetchedRequestUrlsHolder", "Lru/ozon/app/android/composer/network/prefetch/UrlPrefetchedEventHolder;", "urlPrefetchedEventHolder", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchService;LL00/d;Lru/ozon/app/android/composer/network/prefetch/ComposerRunningPrefetchedRequestUrlsHolder;Lru/ozon/app/android/composer/network/prefetch/UrlPrefetchedEventHolder;)V", "", "deeplink", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "cacheGroup", "", "useCache", "", "internalPrefetch", "(Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;Z)V", "Lio/reactivex/k;", "LL00/j;", "tryToFetchFromCache", "(Ljava/lang/String;)Lio/reactivex/k;", "LL00/g;", "request", "fetch", "(LL00/g;)Lio/reactivex/k;", "actualCallDeeplink", "cancelRedundantCalls", "(Ljava/lang/String;)V", "Landroidx/lifecycle/J;", "lifecycleOwner", "addLifecycleObserver", "(Landroidx/lifecycle/J;)V", "prefetch", "Lkotlin/Function1;", "navigateAction", "Lkotlin/Function0;", "loadingAction", "navigateWhenRequestPrefetched", "(Ljava/lang/String;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchService;", "LL00/d;", "Lru/ozon/app/android/composer/network/prefetch/ComposerRunningPrefetchedRequestUrlsHolder;", "Lru/ozon/app/android/composer/network/prefetch/UrlPrefetchedEventHolder;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lnc/b;", "urlPrefetchDisposable", "Lnc/b;", "Ljava/util/concurrent/ConcurrentHashMap;", "LL00/c;", "calls", "Ljava/util/concurrent/ConcurrentHashMap;", "prefetch_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SearchUrlPrefetchServiceImpl implements SearchUrlPrefetchService {

    @NotNull
    private final d callFactory;

    @NotNull
    private final ConcurrentHashMap<String, c> calls;

    @NotNull
    private final ComposerPrefetchService composerPrefetchService;

    @NotNull
    private final ComposerRunningPrefetchedRequestUrlsHolder composerRunningPrefetchedRequestUrlsHolder;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final Handler handler;
    private InterfaceC8487b urlPrefetchDisposable;

    @NotNull
    private final UrlPrefetchedEventHolder urlPrefetchedEventHolder;

    public SearchUrlPrefetchServiceImpl(@NotNull FeatureChecker featureChecker, @NotNull ComposerPrefetchService composerPrefetchService, @NotNull d callFactory, @NotNull ComposerRunningPrefetchedRequestUrlsHolder composerRunningPrefetchedRequestUrlsHolder, @NotNull UrlPrefetchedEventHolder urlPrefetchedEventHolder) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(composerPrefetchService, "composerPrefetchService");
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        Intrinsics.checkNotNullParameter(composerRunningPrefetchedRequestUrlsHolder, "composerRunningPrefetchedRequestUrlsHolder");
        Intrinsics.checkNotNullParameter(urlPrefetchedEventHolder, "urlPrefetchedEventHolder");
        this.featureChecker = featureChecker;
        this.composerPrefetchService = composerPrefetchService;
        this.callFactory = callFactory;
        this.composerRunningPrefetchedRequestUrlsHolder = composerRunningPrefetchedRequestUrlsHolder;
        this.urlPrefetchedEventHolder = urlPrefetchedEventHolder;
        this.handler = new Handler(Looper.getMainLooper());
        this.calls = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addLifecycleObserver(J lifecycleOwner) {
        lifecycleOwner.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.common.SearchUrlPrefetchServiceImpl$addLifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Handler handler;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onDestroy(owner);
                handler = SearchUrlPrefetchServiceImpl.this.handler;
                handler.removeCallbacksAndMessages(null);
            }
        });
    }

    private final void cancelRedundantCalls(String actualCallDeeplink) {
        Set<Map.Entry<String, c>> entrySet = this.calls.entrySet();
        final SearchUrlPrefetchServiceImpl$cancelRedundantCalls$1 searchUrlPrefetchServiceImpl$cancelRedundantCalls$1 = new SearchUrlPrefetchServiceImpl$cancelRedundantCalls$1(actualCallDeeplink);
        entrySet.removeIf(new Predicate() { // from class: yq.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean cancelRedundantCalls$lambda$4;
                cancelRedundantCalls$lambda$4 = SearchUrlPrefetchServiceImpl.cancelRedundantCalls$lambda$4(Function1.this, obj);
                return cancelRedundantCalls$lambda$4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cancelRedundantCalls$lambda$4(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    private final k<j> fetch(final g request) {
        h hVar = new h(new Callable() { // from class: yq.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                j fetch$lambda$3;
                fetch$lambda$3 = SearchUrlPrefetchServiceImpl.fetch$lambda$3(SearchUrlPrefetchServiceImpl.this, request);
                return fetch$lambda$3;
            }
        });
        x b11 = Mc.a.b();
        C9656b.c(b11, "scheduler is null");
        xc.k kVar = new xc.k(new n(hVar, b11), C8125a.a());
        Intrinsics.checkNotNullExpressionValue(kVar, "observeOn(...)");
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j fetch$lambda$3(SearchUrlPrefetchServiceImpl searchUrlPrefetchServiceImpl, g gVar) {
        return searchUrlPrefetchServiceImpl.callFactory.a(gVar).b();
    }

    private final void internalPrefetch(String deeplink, CacheGroup cacheGroup, boolean useCache) {
        if (this.composerRunningPrefetchedRequestUrlsHolder.putIfAbsent(deeplink, cacheGroup) && useCache) {
            return;
        }
        g.a aVar = new g.a();
        aVar.g(UriExtKt.removeSchema(deeplink));
        aVar.b();
        k<j> fetch = fetch(ComposerRequestsKt.prefetch(ComposerRequestsKt.forceNetwork(aVar)).a());
        Fl.d dVar = new Fl.d(new SearchUrlPrefetchServiceImpl$internalPrefetch$1(this, deeplink, cacheGroup), 4);
        e eVar = new e(new SearchUrlPrefetchServiceImpl$internalPrefetch$2(this, deeplink), 2);
        InterfaceC9019a interfaceC9019a = C9653a.f98523c;
        fetch.getClass();
        C10699b c10699b = new C10699b(dVar, eVar, interfaceC9019a);
        fetch.a(c10699b);
        this.urlPrefetchDisposable = c10699b;
    }

    private final k<j> tryToFetchFromCache(String deeplink) {
        g.a aVar = new g.a();
        aVar.g(UriExtKt.removeSchema(deeplink));
        aVar.b();
        return fetch(ComposerRequestsKt.forceCache(aVar).a());
    }

    @Override // ru.ozon.app.android.common.SearchUrlPrefetchService
    public void navigateWhenRequestPrefetched(@NotNull String deeplink, @NotNull J lifecycleOwner, @NotNull Function1<? super String, Unit> navigateAction, Function0<Unit> loadingAction) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(navigateAction, "navigateAction");
        if (this.featureChecker.isEnabled(CancelPrefetchedSearchCallsFlag.INSTANCE)) {
            cancelRedundantCalls(deeplink);
        }
        if (!this.composerRunningPrefetchedRequestUrlsHolder.isLoading(deeplink)) {
            navigateAction.invoke(deeplink);
            return;
        }
        if (loadingAction != null) {
            loadingAction.invoke();
        }
        tryToFetchFromCache(deeplink).a(new SearchUrlPrefetchServiceImpl$navigateWhenRequestPrefetched$1(this, navigateAction, deeplink, lifecycleOwner));
    }

    @Override // ru.ozon.app.android.common.SearchUrlPrefetchService
    public void prefetch(@NotNull String deeplink, @NotNull CacheGroup cacheGroup, boolean useCache) {
        c prefetch$default;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(cacheGroup, "cacheGroup");
        if (!this.featureChecker.isEnabled(PlatformNetworkCachingEnabledFlag.INSTANCE)) {
            internalPrefetch(deeplink, cacheGroup, useCache);
            return;
        }
        if (!this.featureChecker.isEnabled(CancelPrefetchedSearchCallsFlag.INSTANCE)) {
            ComposerPrefetchService.DefaultImpls.prefetch$default(this.composerPrefetchService, deeplink, cacheGroup, null, 4, null);
        } else {
            if (this.calls.get(deeplink) != null || (prefetch$default = ComposerPrefetchService.DefaultImpls.prefetch$default(this.composerPrefetchService, deeplink, cacheGroup, null, 4, null)) == null) {
                return;
            }
            this.calls.put(deeplink, prefetch$default);
        }
    }
}
