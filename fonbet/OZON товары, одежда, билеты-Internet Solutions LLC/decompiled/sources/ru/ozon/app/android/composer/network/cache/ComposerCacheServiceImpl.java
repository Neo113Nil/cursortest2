package ru.ozon.app.android.composer.network.cache;

import We.G;
import We.L;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;
import ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler;
import ru.ozon.app.android.composer.network.cache.flags.AddResponseAgeToMaxAgeEnabledFlag;
import ru.ozon.app.android.composer.network.cache.flags.PlatformNetworkCachingEnabledFlag;
import ru.ozon.app.android.composer.network.cache.interceptor.adaptUrl.UrlChangesKt;
import ru.ozon.app.android.composer.network.cache.util.Url;
import ru.ozon.app.android.composer.network.util.RequestsKt;
import ru.ozon.app.android.composer.network.util.StringsKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ve.EnumC10311b;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0010\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ\u0013\u0010\u001a\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u0013\u0010\u001c\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u000fJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010 J)\u0010'\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u0004\u0018\u00010\u00142\u0006\u0010)\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00106\u001a\u00020\u001e2\u0006\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/composer/network/cache/ComposerCacheServiceImpl;", "Lru/ozon/app/android/composer/network/cache/ComposerCacheService;", "Lru/ozon/app/android/composer/network/cache/CacheHandlersHolder;", "cacheHandlersHolder", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;", "composerCacheCleaner", "Lru/ozon/app/android/composer/network/cache/CachedUrls;", "cachedUrls", "<init>", "(Lru/ozon/app/android/composer/network/cache/CacheHandlersHolder;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;Lru/ozon/app/android/composer/network/cache/CachedUrls;)V", "LWe/L;", "Lkotlin/time/b;", "calculateAge-5sfh64U", "(LWe/L;)J", "calculateAge", "Ljava/util/Date;", "parseDateHeader", "(LWe/L;)Ljava/util/Date;", "", "parseAgeHeader", "(LWe/L;)I", "receivedAge-5sfh64U", "receivedAge", "duration-5sfh64U", "duration", "residentDuration-5sfh64U", "residentDuration", "response", "", "handleSavedToCacheResponse", "(LWe/L;)V", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "cacheGroup", "Lru/ozon/app/android/composer/network/cache/util/Url;", "requestUrl", "onCacheHit-7mni29M", "(Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;Ljava/lang/String;LWe/L;)V", "onCacheHit", "LWe/G;", "request", "adaptRequestForCaching", "(LWe/G;)LWe/G;", "formatMaxAge", "(LWe/G;LWe/L;)Ljava/lang/Integer;", "Lru/ozon/app/android/composer/network/cache/ClearCacheReason;", "reason", "clearAllCache", "(Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)V", "Lru/ozon/app/android/composer/network/cache/util/PageUrl;", "pageUrl", "clearFor-FyG2aqw", "(Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)V", "clearFor", "Lru/ozon/app/android/composer/network/cache/CacheHandlersHolder;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;", "Lru/ozon/app/android/composer/network/cache/CachedUrls;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerCacheServiceImpl implements ComposerCacheService {

    @NotNull
    private final CacheHandlersHolder cacheHandlersHolder;

    @NotNull
    private final CachedUrls cachedUrls;

    @NotNull
    private final ComposerCacheCleaner composerCacheCleaner;

    @NotNull
    private final FeatureChecker featureChecker;

    public ComposerCacheServiceImpl(@NotNull CacheHandlersHolder cacheHandlersHolder, @NotNull FeatureChecker featureChecker, @NotNull ComposerCacheCleaner composerCacheCleaner, @NotNull CachedUrls cachedUrls) {
        Intrinsics.checkNotNullParameter(cacheHandlersHolder, "cacheHandlersHolder");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(composerCacheCleaner, "composerCacheCleaner");
        Intrinsics.checkNotNullParameter(cachedUrls, "cachedUrls");
        this.cacheHandlersHolder = cacheHandlersHolder;
        this.featureChecker = featureChecker;
        this.composerCacheCleaner = composerCacheCleaner;
        this.cachedUrls = cachedUrls;
    }

    /* renamed from: calculateAge-5sfh64U, reason: not valid java name */
    private final long m633calculateAge5sfh64U(L l11) {
        return b.l(b.l(m635receivedAge5sfh64U(l11), m634duration5sfh64U(l11)), m636residentDuration5sfh64U(l11));
    }

    /* renamed from: duration-5sfh64U, reason: not valid java name */
    private final long m634duration5sfh64U(L l11) {
        b.Companion companion = b.INSTANCE;
        return c.h(l11.I() - l11.O(), EnumC10311b.MILLISECONDS);
    }

    private final int parseAgeHeader(L l11) {
        String c11 = l11.r().c("Age");
        if (c11 == null) {
            return -1;
        }
        return Ye.b.C(-1, c11);
    }

    private final Date parseDateHeader(L l11) {
        String c11 = l11.r().c("Date");
        if (c11 != null) {
            return DatesKt.toHttpDateOrNull(c11);
        }
        return null;
    }

    /* renamed from: receivedAge-5sfh64U, reason: not valid java name */
    private final long m635receivedAge5sfh64U(L l11) {
        Date parseDateHeader = parseDateHeader(l11);
        int parseAgeHeader = parseAgeHeader(l11);
        b.Companion companion = b.INSTANCE;
        long h11 = c.h(parseDateHeader != null ? Math.max(0L, l11.I() - parseDateHeader.getTime()) : 0L, EnumC10311b.MILLISECONDS);
        if (parseAgeHeader == -1) {
            return h11;
        }
        b a11 = b.e(h11);
        b b11 = b.e(c.g(parseAgeHeader, EnumC10311b.SECONDS));
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        if (a11.compareTo(b11) < 0) {
            a11 = b11;
        }
        return a11.getF71985a();
    }

    /* renamed from: residentDuration-5sfh64U, reason: not valid java name */
    private final long m636residentDuration5sfh64U(L l11) {
        b.Companion companion = b.INSTANCE;
        return c.h(System.currentTimeMillis() - l11.I(), EnumC10311b.MILLISECONDS);
    }

    @Override // ru.ozon.app.android.composer.network.cache.ComposerCacheService
    @NotNull
    public G adaptRequestForCaching(@NotNull G request) {
        Intrinsics.checkNotNullParameter(request, "request");
        String m664constructorimpl = Url.m664constructorimpl(request.j());
        String mo607adaptRequestForCachingjpqkY4 = CacheHandlersHoldersKt.m623getOrDefault7mni29M(this.cacheHandlersHolder, m664constructorimpl, RequestsKt.cacheGroup(request)).mo607adaptRequestForCachingjpqkY4(m664constructorimpl);
        return Intrinsics.d(m664constructorimpl, mo607adaptRequestForCachingjpqkY4) ? request : UrlChangesKt.m642withAdaptedUrlhUd_yQ(request, mo607adaptRequestForCachingjpqkY4, m664constructorimpl);
    }

    @Override // ru.ozon.app.android.composer.network.cache.ComposerCacheService
    public void clearAllCache(@NotNull ClearCacheReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        for (ComposerCacheHandler composerCacheHandler : this.cacheHandlersHolder.getAll()) {
            if (composerCacheHandler.shouldClearAllCache(reason)) {
                this.composerCacheCleaner.clearFor(composerCacheHandler.getCacheGroup(), reason);
            }
        }
    }

    @Override // ru.ozon.app.android.composer.network.cache.ComposerCacheService
    /* renamed from: clearFor-FyG2aqw */
    public void mo631clearForFyG2aqw(@NotNull String pageUrl, @NotNull ClearCacheReason reason) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        Intrinsics.checkNotNullParameter(reason, "reason");
        String m626getAdaptedPageUrlMD8nlSw$composer_prodGoogleAllVendorsRelease = this.cachedUrls.m626getAdaptedPageUrlMD8nlSw$composer_prodGoogleAllVendorsRelease(pageUrl);
        ComposerCacheHandler orDefault = CacheHandlersHoldersKt.getOrDefault(this.cacheHandlersHolder, m626getAdaptedPageUrlMD8nlSw$composer_prodGoogleAllVendorsRelease != null ? this.cachedUrls.m627getCacheGroups5N2fkQ$composer_prodGoogleAllVendorsRelease(m626getAdaptedPageUrlMD8nlSw$composer_prodGoogleAllVendorsRelease) : null);
        if (orDefault.mo525shouldClearCacheForFyG2aqw(pageUrl, reason)) {
            if (m626getAdaptedPageUrlMD8nlSw$composer_prodGoogleAllVendorsRelease == null) {
                m626getAdaptedPageUrlMD8nlSw$composer_prodGoogleAllVendorsRelease = orDefault.mo637adaptPageUrlForCachingwvZU0FE(pageUrl);
            }
            this.composerCacheCleaner.mo629clearForAD7EpEU(m626getAdaptedPageUrlMD8nlSw$composer_prodGoogleAllVendorsRelease, reason);
        }
    }

    @Override // ru.ozon.app.android.composer.network.cache.ComposerCacheService
    public Integer formatMaxAge(@NotNull G request, @NotNull L response) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        if (!this.featureChecker.isEnabled(PlatformNetworkCachingEnabledFlag.INSTANCE)) {
            return null;
        }
        Integer valueOf = Integer.valueOf(response.d().c());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        String m664constructorimpl = Url.m664constructorimpl(request.j());
        Integer mo522formatMaxAgeForCachingpM1TDTc = CacheHandlersHoldersKt.m623getOrDefault7mni29M(this.cacheHandlersHolder, m664constructorimpl, RequestsKt.cacheGroup(request)).mo522formatMaxAgeForCachingpM1TDTc(m664constructorimpl, ru.ozon.app.android.network.utils.RequestsKt.isPrefetch(request), valueOf, response);
        if (mo522formatMaxAgeForCachingpM1TDTc == null) {
            return null;
        }
        int intValue = mo522formatMaxAgeForCachingpM1TDTc.intValue();
        if (!this.featureChecker.isEnabled(AddResponseAgeToMaxAgeEnabledFlag.INSTANCE)) {
            return mo522formatMaxAgeForCachingpM1TDTc;
        }
        long m633calculateAge5sfh64U = m633calculateAge5sfh64U(response);
        b.Companion companion = b.INSTANCE;
        EnumC10311b enumC10311b = EnumC10311b.SECONDS;
        return Integer.valueOf((int) b.o(b.l(m633calculateAge5sfh64U, c.g(intValue, enumC10311b)), enumC10311b));
    }

    @Override // ru.ozon.app.android.composer.network.cache.ComposerCacheService
    public void handleSavedToCacheResponse(@NotNull L response) {
        Intrinsics.checkNotNullParameter(response, "response");
        G L11 = response.L();
        String m664constructorimpl = Url.m664constructorimpl(L11.j());
        String m671pageUrlVgcI5v0 = StringsKt.m671pageUrlVgcI5v0(m664constructorimpl);
        if (m671pageUrlVgcI5v0 == null) {
            return;
        }
        String m626getAdaptedPageUrlMD8nlSw$composer_prodGoogleAllVendorsRelease = this.cachedUrls.m626getAdaptedPageUrlMD8nlSw$composer_prodGoogleAllVendorsRelease(m671pageUrlVgcI5v0);
        CacheGroup m627getCacheGroups5N2fkQ$composer_prodGoogleAllVendorsRelease = m626getAdaptedPageUrlMD8nlSw$composer_prodGoogleAllVendorsRelease != null ? this.cachedUrls.m627getCacheGroups5N2fkQ$composer_prodGoogleAllVendorsRelease(m626getAdaptedPageUrlMD8nlSw$composer_prodGoogleAllVendorsRelease) : null;
        if (m626getAdaptedPageUrlMD8nlSw$composer_prodGoogleAllVendorsRelease == null || m627getCacheGroups5N2fkQ$composer_prodGoogleAllVendorsRelease == null) {
            ComposerCacheHandler m623getOrDefault7mni29M = CacheHandlersHoldersKt.m623getOrDefault7mni29M(this.cacheHandlersHolder, m664constructorimpl, RequestsKt.cacheGroup(L11));
            m626getAdaptedPageUrlMD8nlSw$composer_prodGoogleAllVendorsRelease = m623getOrDefault7mni29M.mo637adaptPageUrlForCachingwvZU0FE(m671pageUrlVgcI5v0);
            m627getCacheGroups5N2fkQ$composer_prodGoogleAllVendorsRelease = m623getOrDefault7mni29M.getCacheGroup();
        }
        this.cachedUrls.m628putct3_1dI$composer_prodGoogleAllVendorsRelease(m671pageUrlVgcI5v0, m626getAdaptedPageUrlMD8nlSw$composer_prodGoogleAllVendorsRelease, m627getCacheGroups5N2fkQ$composer_prodGoogleAllVendorsRelease);
    }

    @Override // ru.ozon.app.android.composer.network.cache.ComposerCacheService
    /* renamed from: onCacheHit-7mni29M */
    public void mo632onCacheHit7mni29M(CacheGroup cacheGroup, @NotNull String requestUrl, @NotNull L response) {
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        Intrinsics.checkNotNullParameter(response, "response");
        if (this.featureChecker.isEnabled(PlatformNetworkCachingEnabledFlag.INSTANCE)) {
            CacheHandlersHoldersKt.m623getOrDefault7mni29M(this.cacheHandlersHolder, requestUrl, cacheGroup).mo523onCacheHitzMoF2ac(requestUrl, response);
        }
    }
}
