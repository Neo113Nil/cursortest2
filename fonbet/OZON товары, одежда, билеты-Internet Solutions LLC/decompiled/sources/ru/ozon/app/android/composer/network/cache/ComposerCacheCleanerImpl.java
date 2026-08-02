package ru.ozon.app.android.composer.network.cache;

import K1.G;
import Nk.a;
import We.C4862d;
import We.C4863e;
import android.net.Uri;
import android.util.LruCache;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;
import ru.ozon.app.android.composer.network.cache.util.AdaptedPageUrl;
import ru.ozon.app.android.composer.network.cache.util.AdaptedUrl;
import ru.ozon.app.android.logger.BxLogger;
import ru.ozon.app.android.logger.OzonLogger;
import ru.ozon.app.android.utils.UriExtKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001fB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0014J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/composer/network/cache/ComposerCacheCleanerImpl;", "Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;", "LWe/d;", "cache", "Lru/ozon/app/android/composer/network/cache/CachedUrls;", "cachedUrls", "<init>", "(LWe/d;Lru/ozon/app/android/composer/network/cache/CachedUrls;)V", "", "pageUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Lru/ozon/app/android/composer/network/cache/util/AdaptedPageUrl;", "Lru/ozon/app/android/composer/network/cache/ClearCacheReason;", "reason", "", "clearFor-AD7EpEU", "(Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)V", "clearFor", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "cacheGroup", "(Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)V", "Lru/ozon/app/android/composer/network/cache/util/AdaptedUrl;", "adaptedUrl", "removeFromClearHistory-s7RZ03s", "(Ljava/lang/String;)Lru/ozon/app/android/composer/network/cache/ClearCacheReason;", "removeFromClearHistory", "LWe/d;", "Lru/ozon/app/android/composer/network/cache/CachedUrls;", "Landroid/util/LruCache;", "clearHistory", "Landroid/util/LruCache;", "OpaqueUriInCacheException", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerCacheCleanerImpl implements ComposerCacheCleaner {

    @NotNull
    private final C4862d cache;

    @NotNull
    private final CachedUrls cachedUrls;

    @NotNull
    private final LruCache<AdaptedUrl, ClearCacheReason> clearHistory;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/composer/network/cache/ComposerCacheCleanerImpl$OpaqueUriInCacheException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class OpaqueUriInCacheException extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpaqueUriInCacheException(@NotNull Uri uri) {
            super("Opaque URI in OkHttpCache: " + uri);
            Intrinsics.checkNotNullParameter(uri, "uri");
        }
    }

    public ComposerCacheCleanerImpl(@NotNull C4862d cache, @NotNull CachedUrls cachedUrls) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(cachedUrls, "cachedUrls");
        this.cache = cache;
        this.cachedUrls = cachedUrls;
        final int i11 = 50;
        this.clearHistory = new LruCache<AdaptedUrl, ClearCacheReason>(i11) { // from class: ru.ozon.app.android.composer.network.cache.ComposerCacheCleanerImpl$special$$inlined$lruCache$default$1
            @Override // android.util.LruCache
            protected ClearCacheReason create(@NotNull AdaptedUrl key) {
                return null;
            }

            @Override // android.util.LruCache
            protected void entryRemoved(boolean evicted, @NotNull AdaptedUrl key, @NotNull ClearCacheReason oldValue, ClearCacheReason newValue) {
            }

            @Override // android.util.LruCache
            protected int sizeOf(@NotNull AdaptedUrl key, @NotNull ClearCacheReason value) {
                return 1;
            }
        };
    }

    private final String pageUrl(String str) {
        Uri parse = Uri.parse(str);
        if (!parse.isOpaque()) {
            return parse.getQueryParameter(ImagesContract.URL);
        }
        BxLogger bxLogger = BxLogger.INSTANCE;
        OzonLogger.DefaultImpls.log$default(bxLogger, 4, null, a.b("original url = ", str), 2, null);
        OzonLogger.DefaultImpls.log$default(bxLogger, 4, null, G.b(parse, "parsed opaque uri = "), 2, null);
        bxLogger.logException(new OpaqueUriInCacheException(parse));
        return null;
    }

    @Override // ru.ozon.app.android.composer.network.cache.ComposerCacheCleaner
    public void clearFor(@NotNull CacheGroup cacheGroup, @NotNull ClearCacheReason reason) {
        Intrinsics.checkNotNullParameter(cacheGroup, "cacheGroup");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Set<AdaptedPageUrl> adaptedUrlsForCacheGroup$composer_prodGoogleAllVendorsRelease = this.cachedUrls.getAdaptedUrlsForCacheGroup$composer_prodGoogleAllVendorsRelease(cacheGroup);
        if (adaptedUrlsForCacheGroup$composer_prodGoogleAllVendorsRelease.isEmpty()) {
            return;
        }
        Set<AdaptedPageUrl> set = adaptedUrlsForCacheGroup$composer_prodGoogleAllVendorsRelease;
        ArrayList arrayList = new ArrayList(C7714v.z(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(UriExtKt.removeSchema(((AdaptedPageUrl) it.next()).getValue()));
        }
        C4863e s11 = this.cache.s();
        while (s11.hasNext()) {
            String str = (String) s11.next();
            String pageUrl = pageUrl(str);
            if (pageUrl != null && !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (h.e0(pageUrl, (String) it2.next(), false)) {
                        this.clearHistory.put(AdaptedUrl.m649boximpl(AdaptedUrl.m651constructorimpl(str)), reason);
                        s11.remove();
                        break;
                    }
                }
            }
        }
    }

    @Override // ru.ozon.app.android.composer.network.cache.ComposerCacheCleaner
    /* renamed from: clearFor-AD7EpEU */
    public void mo629clearForAD7EpEU(@NotNull String pageUrl, @NotNull ClearCacheReason reason) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        Intrinsics.checkNotNullParameter(reason, "reason");
        String removeSchema = UriExtKt.removeSchema(pageUrl);
        C4863e s11 = this.cache.s();
        while (s11.hasNext()) {
            String str = (String) s11.next();
            String pageUrl2 = pageUrl(str);
            if (pageUrl2 != null && h.e0(pageUrl2, removeSchema, false)) {
                this.clearHistory.put(AdaptedUrl.m649boximpl(AdaptedUrl.m651constructorimpl(str)), reason);
                s11.remove();
            }
        }
    }

    @Override // ru.ozon.app.android.composer.network.cache.ComposerCacheCleaner
    /* renamed from: removeFromClearHistory-s7RZ03s */
    public ClearCacheReason mo630removeFromClearHistorys7RZ03s(@NotNull String adaptedUrl) {
        Intrinsics.checkNotNullParameter(adaptedUrl, "adaptedUrl");
        return this.clearHistory.remove(AdaptedUrl.m649boximpl(adaptedUrl));
    }
}
