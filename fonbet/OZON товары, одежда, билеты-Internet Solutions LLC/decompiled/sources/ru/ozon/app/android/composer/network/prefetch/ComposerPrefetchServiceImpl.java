package ru.ozon.app.android.composer.network.prefetch;

import Hl.C3166b;
import Kr.a;
import Kr.b;
import Kr.e;
import L00.c;
import L00.d;
import L00.g;
import L00.j;
import android.annotation.SuppressLint;
import com.google.android.gms.common.internal.ImagesContract;
import io.reactivex.l;
import io.reactivex.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.f;
import ru.ozon.app.android.composer.network.cache.CacheHandlersHolder;
import ru.ozon.app.android.composer.network.cache.CacheHandlersHoldersKt;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;
import ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler;
import ru.ozon.app.android.composer.network.cache.util.PageUrl;
import ru.ozon.app.android.composer.network.util.ComposerRequestsKt;
import ru.ozon.app.android.utils.UriExtKt;
import sc.C9653a;
import sc.C9656b;
import xc.C10699b;
import xc.C10700c;
import xc.h;
import xc.n;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00140\u0013H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010!\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020\u001b*\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b%\u0010&J)\u0010+\u001a\n **\u0004\u0018\u00010)0)*\u00020\u00162\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190'H\u0002¢\u0006\u0004\b+\u0010,J!\u0010/\u001a\u00020\u00102\u0006\u0010$\u001a\u00020-2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b.\u0010\u0012J5\u00100\u001a\u0004\u0018\u00010\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b0\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchServiceImpl;", "Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchService;", "LL00/d;", "callFactory", "Lru/ozon/app/android/composer/network/cache/CacheHandlersHolder;", "cacheHandlersHolder", "Lru/ozon/app/android/composer/network/prefetch/ComposerRunningPrefetchedRequestUrlsHolder;", "composerRunningPrefetchedRequestUrlsHolder", "Lru/ozon/app/android/composer/network/prefetch/UrlPrefetchedEventHolder;", "urlPrefetchedEventHolder", "<init>", "(LL00/d;Lru/ozon/app/android/composer/network/cache/CacheHandlersHolder;Lru/ozon/app/android/composer/network/prefetch/ComposerRunningPrefetchedRequestUrlsHolder;Lru/ozon/app/android/composer/network/prefetch/UrlPrefetchedEventHolder;)V", "", "deeplink", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "cacheGroup", "", "shouldIgnorePrefetch", "(Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;)Z", "", "", "params", "LL00/c;", "internalPrefetch", "(Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;Ljava/util/Map;)LL00/c;", "LL00/j;", "response", "", "onSuccess", "(Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;LL00/j;)V", "", "throwable", "localUrl", "onError", "(Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;Ljava/lang/Throwable;Ljava/lang/String;)V", "Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandler;", ImagesContract.URL, "onPrefetchFail", "(Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandler;Ljava/lang/String;)V", "Lio/reactivex/l;", "emitter", "Lnc/b;", "kotlin.jvm.PlatformType", "executeAsync", "(LL00/c;Lio/reactivex/l;)Lnc/b;", "Lru/ozon/app/android/composer/network/cache/util/Url;", "shouldJoinRequest-zMoF2ac", "shouldJoinRequest", "prefetch", "LL00/d;", "Lru/ozon/app/android/composer/network/cache/CacheHandlersHolder;", "Lru/ozon/app/android/composer/network/prefetch/ComposerRunningPrefetchedRequestUrlsHolder;", "Lru/ozon/app/android/composer/network/prefetch/UrlPrefetchedEventHolder;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerPrefetchServiceImpl implements ComposerPrefetchService {

    @NotNull
    private final CacheHandlersHolder cacheHandlersHolder;

    @NotNull
    private final d callFactory;

    @NotNull
    private final ComposerRunningPrefetchedRequestUrlsHolder composerRunningPrefetchedRequestUrlsHolder;

    @NotNull
    private final UrlPrefetchedEventHolder urlPrefetchedEventHolder;

    public ComposerPrefetchServiceImpl(@NotNull d callFactory, @NotNull CacheHandlersHolder cacheHandlersHolder, @NotNull ComposerRunningPrefetchedRequestUrlsHolder composerRunningPrefetchedRequestUrlsHolder, @NotNull UrlPrefetchedEventHolder urlPrefetchedEventHolder) {
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        Intrinsics.checkNotNullParameter(cacheHandlersHolder, "cacheHandlersHolder");
        Intrinsics.checkNotNullParameter(composerRunningPrefetchedRequestUrlsHolder, "composerRunningPrefetchedRequestUrlsHolder");
        Intrinsics.checkNotNullParameter(urlPrefetchedEventHolder, "urlPrefetchedEventHolder");
        this.callFactory = callFactory;
        this.cacheHandlersHolder = cacheHandlersHolder;
        this.composerRunningPrefetchedRequestUrlsHolder = composerRunningPrefetchedRequestUrlsHolder;
        this.urlPrefetchedEventHolder = urlPrefetchedEventHolder;
    }

    private final InterfaceC8487b executeAsync(c cVar, l<j> lVar) {
        h hVar = new h(new a(cVar, 0));
        x b11 = Mc.a.b();
        C9656b.c(b11, "scheduler is null");
        n nVar = new n(hVar, b11);
        C10699b c10699b = new C10699b(new C3166b(new ComposerPrefetchServiceImpl$executeAsync$2(lVar)), new b(new ComposerPrefetchServiceImpl$executeAsync$3(lVar), 0), C9653a.f98523c);
        nVar.a(c10699b);
        return c10699b;
    }

    @SuppressLint({"CheckResult"})
    private final c internalPrefetch(String deeplink, CacheGroup cacheGroup, Map<String, ? extends Object> params) {
        g.a aVar = new g.a();
        aVar.g(UriExtKt.removeSchema(deeplink));
        aVar.b();
        aVar.h(params);
        g.a prefetch = ComposerRequestsKt.prefetch(ComposerRequestsKt.forceNetwork(aVar));
        prefetch.h(params);
        prefetch.k(CacheGroup.class, cacheGroup);
        c a11 = this.callFactory.a(prefetch.a());
        new C10700c(new Kr.c(this, a11)).a(new C10699b(new Kr.d(new ComposerPrefetchServiceImpl$internalPrefetch$2(this, deeplink, cacheGroup), 0), new e(new ComposerPrefetchServiceImpl$internalPrefetch$3(this, deeplink, cacheGroup, a11.c().j()), 0), C9653a.f98523c));
        return a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void internalPrefetch$lambda$0(ComposerPrefetchServiceImpl composerPrefetchServiceImpl, final c cVar, l emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        composerPrefetchServiceImpl.executeAsync(cVar, emitter);
        emitter.a(new f() { // from class: Kr.f
            @Override // qc.f
            public final void cancel() {
                L00.c.this.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(String deeplink, CacheGroup cacheGroup, Throwable throwable, String localUrl) {
        FinalRequestInfo finalRequestInfo = this.composerRunningPrefetchedRequestUrlsHolder.get(deeplink);
        ComposerCacheHandler composerCacheHandler = this.cacheHandlersHolder.get(cacheGroup);
        if (finalRequestInfo != null) {
            onPrefetchFail(composerCacheHandler, finalRequestInfo.getUrl());
            onPrefetchFail(composerCacheHandler, finalRequestInfo.getRequestUrl());
        }
        composerCacheHandler.onPrefetchFail(localUrl, throwable);
        this.composerRunningPrefetchedRequestUrlsHolder.removeByKey(deeplink);
        Lm0.a.f17149a.e(throwable);
    }

    private final void onPrefetchFail(ComposerCacheHandler composerCacheHandler, String str) {
        if (str == null) {
            return;
        }
        composerCacheHandler.mo638onPrefetchFailucI2Kkw(PageUrl.m657constructorimpl(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSuccess(String deeplink, CacheGroup cacheGroup, j response) {
        this.composerRunningPrefetchedRequestUrlsHolder.putIfExist(deeplink, new FinalRequestInfo(response.h().j(), null, Boolean.FALSE, cacheGroup, 2, null));
        this.urlPrefetchedEventHolder.onUrlPrefetched(deeplink);
    }

    private final boolean shouldIgnorePrefetch(String deeplink, CacheGroup cacheGroup) {
        ComposerCacheHandler composerCacheHandler = this.cacheHandlersHolder.get(cacheGroup);
        if (this.composerRunningPrefetchedRequestUrlsHolder.putIfAbsent(deeplink, cacheGroup)) {
            return composerCacheHandler.getIgnorePrefetchIfAlreadyRunning() || composerCacheHandler.getIgnorePrefetchIfHasInCache();
        }
        return false;
    }

    @Override // ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchService
    public c prefetch(@NotNull String deeplink, @NotNull CacheGroup cacheGroup, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(cacheGroup, "cacheGroup");
        Intrinsics.checkNotNullParameter(params, "params");
        if (shouldIgnorePrefetch(deeplink, cacheGroup)) {
            return null;
        }
        return internalPrefetch(deeplink, cacheGroup, params);
    }

    @Override // ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchService
    /* renamed from: shouldJoinRequest-zMoF2ac */
    public boolean mo670shouldJoinRequestzMoF2ac(@NotNull String url, CacheGroup cacheGroup) {
        Intrinsics.checkNotNullParameter(url, "url");
        return CacheHandlersHoldersKt.m623getOrDefault7mni29M(this.cacheHandlersHolder, url, cacheGroup).mo526shouldJoinRequestVgcI5v0(url);
    }
}
