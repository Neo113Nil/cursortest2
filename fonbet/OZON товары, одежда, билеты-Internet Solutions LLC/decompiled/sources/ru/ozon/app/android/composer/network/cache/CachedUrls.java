package ru.ozon.app.android.composer.network.cache;

import android.util.LruCache;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;
import ru.ozon.app.android.composer.network.cache.flags.CacheCleanLimitFlag;
import ru.ozon.app.android.composer.network.cache.util.AdaptedPageUrl;
import ru.ozon.app.android.composer.network.cache.util.PageUrl;
import ru.ozon.app.android.network.abtool.FeatureService;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0017\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0018J'\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/composer/network/cache/CachedUrls;", "", "featureService", "Lru/ozon/app/android/network/abtool/FeatureService;", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;)V", "groupedAdaptedPageUrls", "", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "", "Lru/ozon/app/android/composer/network/cache/util/AdaptedPageUrl;", "adaptedPageUrlToGroupMap", "adaptedPageUrls", "Landroid/util/LruCache;", "Lru/ozon/app/android/composer/network/cache/util/PageUrl;", "getAdaptedPageUrl", "pageUrl", "getAdaptedPageUrl-MD8nlSw$composer_prodGoogleAllVendorsRelease", "(Ljava/lang/String;)Ljava/lang/String;", "getCacheGroup", "getCacheGroup-s5N2fkQ$composer_prodGoogleAllVendorsRelease", "(Ljava/lang/String;)Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "getAdaptedUrlsForCacheGroup", "cacheGroup", "getAdaptedUrlsForCacheGroup$composer_prodGoogleAllVendorsRelease", "put", "", "adaptedPageUrl", "put-ct3_1dI$composer_prodGoogleAllVendorsRelease", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;)V", "onEntryRemoved", "onEntryRemoved-s5N2fkQ", "(Ljava/lang/String;)V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CachedUrls {

    @NotNull
    private final Map<AdaptedPageUrl, CacheGroup> adaptedPageUrlToGroupMap;

    @NotNull
    private final LruCache<PageUrl, AdaptedPageUrl> adaptedPageUrls;

    @NotNull
    private final Map<CacheGroup, Set<AdaptedPageUrl>> groupedAdaptedPageUrls;

    public CachedUrls(@NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.groupedAdaptedPageUrls = new LinkedHashMap();
        this.adaptedPageUrlToGroupMap = new LinkedHashMap();
        final int intKey = featureService.getIntKey(CacheCleanLimitFlag.INSTANCE);
        this.adaptedPageUrls = new LruCache<PageUrl, AdaptedPageUrl>(intKey) { // from class: ru.ozon.app.android.composer.network.cache.CachedUrls$special$$inlined$lruCache$default$1
            @Override // android.util.LruCache
            protected AdaptedPageUrl create(@NotNull PageUrl key) {
                return null;
            }

            @Override // android.util.LruCache
            protected void entryRemoved(boolean evicted, @NotNull PageUrl key, @NotNull AdaptedPageUrl oldValue, AdaptedPageUrl newValue) {
                AdaptedPageUrl adaptedPageUrl = newValue;
                if (adaptedPageUrl != null) {
                    adaptedPageUrl.getValue();
                }
                String value = oldValue.getValue();
                key.getValue();
                this.m625onEntryRemoveds5N2fkQ(value);
            }

            @Override // android.util.LruCache
            protected int sizeOf(@NotNull PageUrl key, @NotNull AdaptedPageUrl value) {
                return 1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onEntryRemoved-s5N2fkQ, reason: not valid java name */
    public final void m625onEntryRemoveds5N2fkQ(String adaptedPageUrl) {
        Set<AdaptedPageUrl> set;
        CacheGroup remove = this.adaptedPageUrlToGroupMap.remove(AdaptedPageUrl.m643boximpl(adaptedPageUrl));
        if (remove == null || (set = this.groupedAdaptedPageUrls.get(remove)) == null) {
            return;
        }
        this.groupedAdaptedPageUrls.put(remove, e0.c(set, AdaptedPageUrl.m643boximpl(adaptedPageUrl)));
    }

    /* renamed from: getAdaptedPageUrl-MD8nlSw$composer_prodGoogleAllVendorsRelease, reason: not valid java name */
    public final String m626getAdaptedPageUrlMD8nlSw$composer_prodGoogleAllVendorsRelease(@NotNull String pageUrl) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        AdaptedPageUrl adaptedPageUrl = this.adaptedPageUrls.get(PageUrl.m656boximpl(pageUrl));
        if (adaptedPageUrl != null) {
            return adaptedPageUrl.getValue();
        }
        return null;
    }

    @NotNull
    public final Set<AdaptedPageUrl> getAdaptedUrlsForCacheGroup$composer_prodGoogleAllVendorsRelease(@NotNull CacheGroup cacheGroup) {
        Intrinsics.checkNotNullParameter(cacheGroup, "cacheGroup");
        Set<AdaptedPageUrl> set = this.groupedAdaptedPageUrls.get(cacheGroup);
        return set == null ? M.f71699a : set;
    }

    /* renamed from: getCacheGroup-s5N2fkQ$composer_prodGoogleAllVendorsRelease, reason: not valid java name */
    public final CacheGroup m627getCacheGroups5N2fkQ$composer_prodGoogleAllVendorsRelease(@NotNull String pageUrl) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        return this.adaptedPageUrlToGroupMap.get(AdaptedPageUrl.m643boximpl(pageUrl));
    }

    /* renamed from: put-ct3_1dI$composer_prodGoogleAllVendorsRelease, reason: not valid java name */
    public final void m628putct3_1dI$composer_prodGoogleAllVendorsRelease(@NotNull String pageUrl, @NotNull String adaptedPageUrl, @NotNull CacheGroup cacheGroup) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        Intrinsics.checkNotNullParameter(adaptedPageUrl, "adaptedPageUrl");
        Intrinsics.checkNotNullParameter(cacheGroup, "cacheGroup");
        this.adaptedPageUrls.put(PageUrl.m656boximpl(pageUrl), AdaptedPageUrl.m643boximpl(adaptedPageUrl));
        this.adaptedPageUrlToGroupMap.put(AdaptedPageUrl.m643boximpl(adaptedPageUrl), cacheGroup);
        Set<AdaptedPageUrl> set = this.groupedAdaptedPageUrls.get(cacheGroup);
        this.groupedAdaptedPageUrls.put(cacheGroup, set != null ? e0.g(set, AdaptedPageUrl.m643boximpl(adaptedPageUrl)) : e0.h(AdaptedPageUrl.m643boximpl(adaptedPageUrl)));
    }
}
