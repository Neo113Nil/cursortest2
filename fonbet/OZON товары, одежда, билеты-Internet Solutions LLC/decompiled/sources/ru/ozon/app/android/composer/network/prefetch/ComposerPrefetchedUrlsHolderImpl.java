package ru.ozon.app.android.composer.network.prefetch;

import Mc.a;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.ImagesContract;
import io.reactivex.x;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;
import ru.ozon.app.android.composer.network.cache.cacheGroup.DefaultCacheGroup;
import ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchedUrlsHolder;
import ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchedUrlsHolderImpl;
import sc.C9656b;
import uc.i;
import vc.q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\bH\u0016J,\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchedUrlsHolderImpl;", "Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchedUrlsHolder;", "composerRunningPrefetchedRequestUrlsHolder", "Lru/ozon/app/android/composer/network/prefetch/ComposerRunningPrefetchedRequestUrlsHolder;", "<init>", "(Lru/ozon/app/android/composer/network/prefetch/ComposerRunningPrefetchedRequestUrlsHolder;)V", "urls", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchedUrlsHolder$PrefetchedUrl;", "get", ImagesContract.URL, "upsert", "", "cacheGroup", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "maxAgeSeconds", "", "redirectUrl", ProductAction.ACTION_REMOVE, "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerPrefetchedUrlsHolderImpl implements ComposerPrefetchedUrlsHolder {

    @NotNull
    private final ComposerRunningPrefetchedRequestUrlsHolder composerRunningPrefetchedRequestUrlsHolder;

    @NotNull
    private final ConcurrentHashMap<String, ComposerPrefetchedUrlsHolder.PrefetchedUrl> urls;

    public ComposerPrefetchedUrlsHolderImpl(@NotNull ComposerRunningPrefetchedRequestUrlsHolder composerRunningPrefetchedRequestUrlsHolder) {
        Intrinsics.checkNotNullParameter(composerRunningPrefetchedRequestUrlsHolder, "composerRunningPrefetchedRequestUrlsHolder");
        this.composerRunningPrefetchedRequestUrlsHolder = composerRunningPrefetchedRequestUrlsHolder;
        this.urls = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void remove(String url, CacheGroup cacheGroup) {
        InterfaceC8487b clearExpiredCacheDisposable;
        ComposerPrefetchedUrlsHolder.PrefetchedUrl remove = this.urls.remove(url);
        if (remove != null && (clearExpiredCacheDisposable = remove.getClearExpiredCacheDisposable()) != null) {
            clearExpiredCacheDisposable.dispose();
        }
        this.composerRunningPrefetchedRequestUrlsHolder.removeIf(new ComposerPrefetchedUrlsHolderImpl$remove$1(url, cacheGroup));
    }

    @Override // ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchedUrlsHolder
    public ComposerPrefetchedUrlsHolder.PrefetchedUrl get(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.urls.get(url);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [Kr.g] */
    @Override // ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchedUrlsHolder
    public void upsert(@NotNull final String url, final CacheGroup cacheGroup, long maxAgeSeconds, String redirectUrl) {
        Intrinsics.checkNotNullParameter(url, "url");
        remove(url, cacheGroup);
        ConcurrentHashMap<String, ComposerPrefetchedUrlsHolder.PrefetchedUrl> concurrentHashMap = this.urls;
        CacheGroup cacheGroup2 = cacheGroup == null ? DefaultCacheGroup.INSTANCE : cacheGroup;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        x a11 = a.a();
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(a11, "scheduler is null");
        q qVar = new q(maxAgeSeconds, timeUnit, a11);
        i iVar = new i(new InterfaceC9019a() { // from class: Kr.g
            @Override // qc.InterfaceC9019a
            public final void run() {
                ComposerPrefetchedUrlsHolderImpl.this.remove(url, cacheGroup);
            }
        });
        qVar.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        concurrentHashMap.put(url, new ComposerPrefetchedUrlsHolder.PrefetchedUrl(cacheGroup2, redirectUrl, iVar));
        ComposerRunningPrefetchedRequestUrlsHolder composerRunningPrefetchedRequestUrlsHolder = this.composerRunningPrefetchedRequestUrlsHolder;
        if (redirectUrl == null) {
            redirectUrl = url;
        }
        composerRunningPrefetchedRequestUrlsHolder.updateRequestUrl(url, redirectUrl);
    }
}
