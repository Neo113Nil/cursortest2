package ru.ozon.app.android.composer.di.modules;

import Qj0.D;
import Qj0.H;
import Qj0.M;
import We.B;
import We.C4862d;
import We.E;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.AbstractC8922e;
import ru.ozon.app.android.composer.di.modules.OkHttpClientProvider;
import ru.ozon.app.android.composer.network.ComposerFirstLoadInterceptor;
import ru.ozon.app.android.composer.network.ComposerHttpInterceptor;
import ru.ozon.app.android.composer.network.ComposerPageIdNetworkInterceptor;
import ru.ozon.app.android.composer.network.ComposerReferrerInterceptor;
import ru.ozon.app.android.composer.network.TestCookieInterceptor;
import ru.ozon.app.android.composer.network.cache.flags.AdaptUrlInterceptorsBeforeCacheFlag;
import ru.ozon.app.android.composer.network.cache.interceptor.NotifyCacheHitInterceptor;
import ru.ozon.app.android.composer.network.cache.interceptor.OnSaveToCacheInterceptor;
import ru.ozon.app.android.composer.network.cache.interceptor.SubstituteCacheControlMaxAgeInterceptor;
import ru.ozon.app.android.composer.network.cache.interceptor.adaptUrl.readFromCache.AdaptRequestUrlAppInterceptor;
import ru.ozon.app.android.composer.network.cache.interceptor.adaptUrl.readFromCache.RestoreRequestUrlNetworkInterceptor;
import ru.ozon.app.android.composer.network.cache.interceptor.adaptUrl.saveToCache.AdaptRequestUrlNetworkInterceptor;
import ru.ozon.app.android.composer.network.cache.interceptor.adaptUrl.saveToCache.RestoreRequestUrlAppInterceptor;
import ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CacheErrorInterceptor;
import ru.ozon.app.android.composer.network.join.JoinRequestsAppInterceptor;
import ru.ozon.app.android.composer.network.prefetch.PrefetchEventInterceptor;
import ru.ozon.app.android.composer.network.redirect.AppsFlyerRedirectNetworkInterceptor;
import ru.ozon.app.android.composer.network.redirect.RedirectAppInterceptor;
import ru.ozon.app.android.composer.network.redirect.RedirectNetworkInterceptor;
import ru.ozon.app.android.composer.network.redirect.RestrictRedirectsNetworkInterceptor;
import ru.ozon.app.android.composer.network.referrer.ReferrerHeaderInterceptor;
import ru.ozon.app.android.composer.network.referrer.ReferrerReviewHeaderInterceptor;
import ru.ozon.app.android.composer.network.security.search.SourceInterceptor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.flags.BxSdkOzonNetworkEnabledFlag;
import ru.ozon.app.android.network.gnc.GncOkHttpClientBuilder;
import ru.ozon.app.android.network.homeprefetch.HomePrefetchInterceptor;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b!\b\u0001\u0018\u00002\u00020\u0001B©\u0002\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\b\b\u0001\u00101\u001a\u000200\u0012\b\b\u0001\u00102\u001a\u000200\u0012\b\b\u0001\u00103\u001a\u000200\u0012\b\b\u0001\u00104\u001a\u000200\u0012\b\b\u0001\u00105\u001a\u000200\u0012\u000e\b\u0001\u00107\u001a\b\u0012\u0004\u0012\u00020006\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u000100\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010<\u001a\u00020;\u0012\b\b\u0001\u0010=\u001a\u000200¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u00042\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u0013\u0010E\u001a\u00020D*\u00020DH\u0002¢\u0006\u0004\bE\u0010FJ\u0013\u0010H\u001a\u00020G*\u00020DH\u0002¢\u0006\u0004\bH\u0010IJ\u0013\u0010J\u001a\u00020G*\u00020DH\u0002¢\u0006\u0004\bJ\u0010IJ\u0013\u0010J\u001a\u00020G*\u000209H\u0002¢\u0006\u0004\bJ\u0010KJ\u0015\u0010L\u001a\u00020\u00042\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bL\u0010CR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010MR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010NR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010OR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010PR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010QR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010RR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010SR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010TR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010UR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010VR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010WR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010XR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010YR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010ZR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010[R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\\R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010]R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010^R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010_R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010`R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010aR\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010bR\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010cR\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010dR\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010dR\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010dR\u0014\u00104\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010dR\u0014\u00105\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010dR\u001a\u00107\u001a\b\u0012\u0004\u0012\u000200068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010eR\u0016\u00108\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010dR\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010fR\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010gR\u0014\u0010=\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010d¨\u0006h"}, d2 = {"Lru/ozon/app/android/composer/di/modules/OkHttpClientProvider;", "", "Landroid/content/Context;", "context", "LWe/E;", "okHttpClient", "LWe/d;", "cache", "Lru/ozon/app/android/composer/network/join/JoinRequestsAppInterceptor;", "joinRequestsAppInterceptor", "Lru/ozon/app/android/network/homeprefetch/HomePrefetchInterceptor;", "homePrefetchInterceptor", "Lru/ozon/app/android/composer/network/ComposerFirstLoadInterceptor;", "composerFirstLoadInterceptor", "Lru/ozon/app/android/composer/network/ComposerReferrerInterceptor;", "composerReferrerInterceptor", "Lru/ozon/app/android/composer/network/referrer/ReferrerHeaderInterceptor;", "referrerHeaderInterceptor", "Lru/ozon/app/android/composer/network/referrer/ReferrerReviewHeaderInterceptor;", "productReviewReferrerInterceptor", "Lru/ozon/app/android/composer/network/ComposerHttpInterceptor;", "composerHttpInterceptor", "Lru/ozon/app/android/composer/network/redirect/RedirectAppInterceptor;", "redirectAppInterceptor", "Lru/ozon/app/android/composer/network/redirect/RedirectNetworkInterceptor;", "redirectNetworkInterceptor", "Lru/ozon/app/android/composer/network/redirect/AppsFlyerRedirectNetworkInterceptor;", "appsFlyerRedirectNetworkInterceptor", "Lru/ozon/app/android/composer/network/cache/interceptor/NotifyCacheHitInterceptor;", "notifyCacheHitInterceptor", "Lru/ozon/app/android/composer/network/prefetch/PrefetchEventInterceptor;", "prefetchEventInterceptor", "Lru/ozon/app/android/composer/network/cache/interceptor/adaptUrl/readFromCache/AdaptRequestUrlAppInterceptor;", "adaptRequestUrlAppInterceptor", "Lru/ozon/app/android/composer/network/cache/interceptor/OnSaveToCacheInterceptor;", "onSaveToCacheInterceptor", "Lru/ozon/app/android/composer/network/cache/interceptor/adaptUrl/saveToCache/AdaptRequestUrlNetworkInterceptor;", "adaptRequestUrlNetworkInterceptor", "Lru/ozon/app/android/composer/network/cache/interceptor/SubstituteCacheControlMaxAgeInterceptor;", "substituteCacheControlMaxAgeInterceptor", "Lru/ozon/app/android/composer/network/redirect/RestrictRedirectsNetworkInterceptor;", "restrictRedirectsNetworkInterceptor", "Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CacheErrorInterceptor;", "cacheErrorInterceptor", "Lru/ozon/app/android/composer/network/security/search/SourceInterceptor;", "sourceInterceptor", "Lru/ozon/app/android/composer/network/TestCookieInterceptor;", "testCookieInterceptor", "LWe/B;", "encodingInterceptor", "logRequestsInterceptor", "cartPaginationNoStoreCacheInterceptor", "mapTraceInterceptor", "geoRequestsLogInterceptor", "", "ozonIdNetworkInterceptors", "notificationStatusInterceptor", "Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "gncOkHttpClientBuilder", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "failedExternalLinkRetryInterceptor", "<init>", "(Landroid/content/Context;LWe/E;LWe/d;Lru/ozon/app/android/composer/network/join/JoinRequestsAppInterceptor;Lru/ozon/app/android/network/homeprefetch/HomePrefetchInterceptor;Lru/ozon/app/android/composer/network/ComposerFirstLoadInterceptor;Lru/ozon/app/android/composer/network/ComposerReferrerInterceptor;Lru/ozon/app/android/composer/network/referrer/ReferrerHeaderInterceptor;Lru/ozon/app/android/composer/network/referrer/ReferrerReviewHeaderInterceptor;Lru/ozon/app/android/composer/network/ComposerHttpInterceptor;Lru/ozon/app/android/composer/network/redirect/RedirectAppInterceptor;Lru/ozon/app/android/composer/network/redirect/RedirectNetworkInterceptor;Lru/ozon/app/android/composer/network/redirect/AppsFlyerRedirectNetworkInterceptor;Lru/ozon/app/android/composer/network/cache/interceptor/NotifyCacheHitInterceptor;Lru/ozon/app/android/composer/network/prefetch/PrefetchEventInterceptor;Lru/ozon/app/android/composer/network/cache/interceptor/adaptUrl/readFromCache/AdaptRequestUrlAppInterceptor;Lru/ozon/app/android/composer/network/cache/interceptor/OnSaveToCacheInterceptor;Lru/ozon/app/android/composer/network/cache/interceptor/adaptUrl/saveToCache/AdaptRequestUrlNetworkInterceptor;Lru/ozon/app/android/composer/network/cache/interceptor/SubstituteCacheControlMaxAgeInterceptor;Lru/ozon/app/android/composer/network/redirect/RestrictRedirectsNetworkInterceptor;Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CacheErrorInterceptor;Lru/ozon/app/android/composer/network/security/search/SourceInterceptor;Lru/ozon/app/android/composer/network/TestCookieInterceptor;LWe/B;LWe/B;LWe/B;LWe/B;LWe/B;Ljava/util/List;LWe/B;Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;Lru/ozon/app/android/network/abtool/FeatureChecker;LWe/B;)V", "", "isCronetEnabled", "provideGncOkHttpClient", "(Z)LWe/E;", "LWe/E$a;", "addInterceptors", "(LWe/E$a;)LWe/E$a;", "", "addAdaptUrlAndCacheInterceptors", "(LWe/E$a;)V", "addCacheInterceptors", "(Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;)V", "provide", "Landroid/content/Context;", "LWe/E;", "LWe/d;", "Lru/ozon/app/android/composer/network/join/JoinRequestsAppInterceptor;", "Lru/ozon/app/android/network/homeprefetch/HomePrefetchInterceptor;", "Lru/ozon/app/android/composer/network/ComposerFirstLoadInterceptor;", "Lru/ozon/app/android/composer/network/ComposerReferrerInterceptor;", "Lru/ozon/app/android/composer/network/referrer/ReferrerHeaderInterceptor;", "Lru/ozon/app/android/composer/network/referrer/ReferrerReviewHeaderInterceptor;", "Lru/ozon/app/android/composer/network/ComposerHttpInterceptor;", "Lru/ozon/app/android/composer/network/redirect/RedirectAppInterceptor;", "Lru/ozon/app/android/composer/network/redirect/RedirectNetworkInterceptor;", "Lru/ozon/app/android/composer/network/redirect/AppsFlyerRedirectNetworkInterceptor;", "Lru/ozon/app/android/composer/network/cache/interceptor/NotifyCacheHitInterceptor;", "Lru/ozon/app/android/composer/network/prefetch/PrefetchEventInterceptor;", "Lru/ozon/app/android/composer/network/cache/interceptor/adaptUrl/readFromCache/AdaptRequestUrlAppInterceptor;", "Lru/ozon/app/android/composer/network/cache/interceptor/OnSaveToCacheInterceptor;", "Lru/ozon/app/android/composer/network/cache/interceptor/adaptUrl/saveToCache/AdaptRequestUrlNetworkInterceptor;", "Lru/ozon/app/android/composer/network/cache/interceptor/SubstituteCacheControlMaxAgeInterceptor;", "Lru/ozon/app/android/composer/network/redirect/RestrictRedirectsNetworkInterceptor;", "Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CacheErrorInterceptor;", "Lru/ozon/app/android/composer/network/security/search/SourceInterceptor;", "Lru/ozon/app/android/composer/network/TestCookieInterceptor;", "LWe/B;", "Ljava/util/List;", "Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OkHttpClientProvider {

    @NotNull
    private final AdaptRequestUrlAppInterceptor adaptRequestUrlAppInterceptor;

    @NotNull
    private final AdaptRequestUrlNetworkInterceptor adaptRequestUrlNetworkInterceptor;

    @NotNull
    private final AppsFlyerRedirectNetworkInterceptor appsFlyerRedirectNetworkInterceptor;

    @NotNull
    private final C4862d cache;

    @NotNull
    private final CacheErrorInterceptor cacheErrorInterceptor;

    @NotNull
    private final B cartPaginationNoStoreCacheInterceptor;

    @NotNull
    private final ComposerFirstLoadInterceptor composerFirstLoadInterceptor;

    @NotNull
    private final ComposerHttpInterceptor composerHttpInterceptor;

    @NotNull
    private final ComposerReferrerInterceptor composerReferrerInterceptor;

    @NotNull
    private final Context context;

    @NotNull
    private final B encodingInterceptor;

    @NotNull
    private final B failedExternalLinkRetryInterceptor;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final B geoRequestsLogInterceptor;

    @NotNull
    private final GncOkHttpClientBuilder gncOkHttpClientBuilder;

    @NotNull
    private final HomePrefetchInterceptor homePrefetchInterceptor;

    @NotNull
    private final JoinRequestsAppInterceptor joinRequestsAppInterceptor;

    @NotNull
    private final B logRequestsInterceptor;

    @NotNull
    private final B mapTraceInterceptor;
    private final B notificationStatusInterceptor;

    @NotNull
    private final NotifyCacheHitInterceptor notifyCacheHitInterceptor;

    @NotNull
    private final E okHttpClient;

    @NotNull
    private final OnSaveToCacheInterceptor onSaveToCacheInterceptor;

    @NotNull
    private final List<B> ozonIdNetworkInterceptors;

    @NotNull
    private final PrefetchEventInterceptor prefetchEventInterceptor;

    @NotNull
    private final ReferrerReviewHeaderInterceptor productReviewReferrerInterceptor;

    @NotNull
    private final RedirectAppInterceptor redirectAppInterceptor;

    @NotNull
    private final RedirectNetworkInterceptor redirectNetworkInterceptor;

    @NotNull
    private final ReferrerHeaderInterceptor referrerHeaderInterceptor;

    @NotNull
    private final RestrictRedirectsNetworkInterceptor restrictRedirectsNetworkInterceptor;

    @NotNull
    private final SourceInterceptor sourceInterceptor;

    @NotNull
    private final SubstituteCacheControlMaxAgeInterceptor substituteCacheControlMaxAgeInterceptor;

    @NotNull
    private final TestCookieInterceptor testCookieInterceptor;

    public OkHttpClientProvider(@NotNull Context context, @NotNull E okHttpClient, @NotNull C4862d cache, @NotNull JoinRequestsAppInterceptor joinRequestsAppInterceptor, @NotNull HomePrefetchInterceptor homePrefetchInterceptor, @NotNull ComposerFirstLoadInterceptor composerFirstLoadInterceptor, @NotNull ComposerReferrerInterceptor composerReferrerInterceptor, @NotNull ReferrerHeaderInterceptor referrerHeaderInterceptor, @NotNull ReferrerReviewHeaderInterceptor productReviewReferrerInterceptor, @NotNull ComposerHttpInterceptor composerHttpInterceptor, @NotNull RedirectAppInterceptor redirectAppInterceptor, @NotNull RedirectNetworkInterceptor redirectNetworkInterceptor, @NotNull AppsFlyerRedirectNetworkInterceptor appsFlyerRedirectNetworkInterceptor, @NotNull NotifyCacheHitInterceptor notifyCacheHitInterceptor, @NotNull PrefetchEventInterceptor prefetchEventInterceptor, @NotNull AdaptRequestUrlAppInterceptor adaptRequestUrlAppInterceptor, @NotNull OnSaveToCacheInterceptor onSaveToCacheInterceptor, @NotNull AdaptRequestUrlNetworkInterceptor adaptRequestUrlNetworkInterceptor, @NotNull SubstituteCacheControlMaxAgeInterceptor substituteCacheControlMaxAgeInterceptor, @NotNull RestrictRedirectsNetworkInterceptor restrictRedirectsNetworkInterceptor, @NotNull CacheErrorInterceptor cacheErrorInterceptor, @NotNull SourceInterceptor sourceInterceptor, @NotNull TestCookieInterceptor testCookieInterceptor, @NotNull B encodingInterceptor, @NotNull B logRequestsInterceptor, @NotNull B cartPaginationNoStoreCacheInterceptor, @NotNull B mapTraceInterceptor, @NotNull B geoRequestsLogInterceptor, @NotNull List<B> ozonIdNetworkInterceptors, B b11, @NotNull GncOkHttpClientBuilder gncOkHttpClientBuilder, @NotNull FeatureChecker featureChecker, @NotNull B failedExternalLinkRetryInterceptor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(joinRequestsAppInterceptor, "joinRequestsAppInterceptor");
        Intrinsics.checkNotNullParameter(homePrefetchInterceptor, "homePrefetchInterceptor");
        Intrinsics.checkNotNullParameter(composerFirstLoadInterceptor, "composerFirstLoadInterceptor");
        Intrinsics.checkNotNullParameter(composerReferrerInterceptor, "composerReferrerInterceptor");
        Intrinsics.checkNotNullParameter(referrerHeaderInterceptor, "referrerHeaderInterceptor");
        Intrinsics.checkNotNullParameter(productReviewReferrerInterceptor, "productReviewReferrerInterceptor");
        Intrinsics.checkNotNullParameter(composerHttpInterceptor, "composerHttpInterceptor");
        Intrinsics.checkNotNullParameter(redirectAppInterceptor, "redirectAppInterceptor");
        Intrinsics.checkNotNullParameter(redirectNetworkInterceptor, "redirectNetworkInterceptor");
        Intrinsics.checkNotNullParameter(appsFlyerRedirectNetworkInterceptor, "appsFlyerRedirectNetworkInterceptor");
        Intrinsics.checkNotNullParameter(notifyCacheHitInterceptor, "notifyCacheHitInterceptor");
        Intrinsics.checkNotNullParameter(prefetchEventInterceptor, "prefetchEventInterceptor");
        Intrinsics.checkNotNullParameter(adaptRequestUrlAppInterceptor, "adaptRequestUrlAppInterceptor");
        Intrinsics.checkNotNullParameter(onSaveToCacheInterceptor, "onSaveToCacheInterceptor");
        Intrinsics.checkNotNullParameter(adaptRequestUrlNetworkInterceptor, "adaptRequestUrlNetworkInterceptor");
        Intrinsics.checkNotNullParameter(substituteCacheControlMaxAgeInterceptor, "substituteCacheControlMaxAgeInterceptor");
        Intrinsics.checkNotNullParameter(restrictRedirectsNetworkInterceptor, "restrictRedirectsNetworkInterceptor");
        Intrinsics.checkNotNullParameter(cacheErrorInterceptor, "cacheErrorInterceptor");
        Intrinsics.checkNotNullParameter(sourceInterceptor, "sourceInterceptor");
        Intrinsics.checkNotNullParameter(testCookieInterceptor, "testCookieInterceptor");
        Intrinsics.checkNotNullParameter(encodingInterceptor, "encodingInterceptor");
        Intrinsics.checkNotNullParameter(logRequestsInterceptor, "logRequestsInterceptor");
        Intrinsics.checkNotNullParameter(cartPaginationNoStoreCacheInterceptor, "cartPaginationNoStoreCacheInterceptor");
        Intrinsics.checkNotNullParameter(mapTraceInterceptor, "mapTraceInterceptor");
        Intrinsics.checkNotNullParameter(geoRequestsLogInterceptor, "geoRequestsLogInterceptor");
        Intrinsics.checkNotNullParameter(ozonIdNetworkInterceptors, "ozonIdNetworkInterceptors");
        Intrinsics.checkNotNullParameter(gncOkHttpClientBuilder, "gncOkHttpClientBuilder");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(failedExternalLinkRetryInterceptor, "failedExternalLinkRetryInterceptor");
        this.context = context;
        this.okHttpClient = okHttpClient;
        this.cache = cache;
        this.joinRequestsAppInterceptor = joinRequestsAppInterceptor;
        this.homePrefetchInterceptor = homePrefetchInterceptor;
        this.composerFirstLoadInterceptor = composerFirstLoadInterceptor;
        this.composerReferrerInterceptor = composerReferrerInterceptor;
        this.referrerHeaderInterceptor = referrerHeaderInterceptor;
        this.productReviewReferrerInterceptor = productReviewReferrerInterceptor;
        this.composerHttpInterceptor = composerHttpInterceptor;
        this.redirectAppInterceptor = redirectAppInterceptor;
        this.redirectNetworkInterceptor = redirectNetworkInterceptor;
        this.appsFlyerRedirectNetworkInterceptor = appsFlyerRedirectNetworkInterceptor;
        this.notifyCacheHitInterceptor = notifyCacheHitInterceptor;
        this.prefetchEventInterceptor = prefetchEventInterceptor;
        this.adaptRequestUrlAppInterceptor = adaptRequestUrlAppInterceptor;
        this.onSaveToCacheInterceptor = onSaveToCacheInterceptor;
        this.adaptRequestUrlNetworkInterceptor = adaptRequestUrlNetworkInterceptor;
        this.substituteCacheControlMaxAgeInterceptor = substituteCacheControlMaxAgeInterceptor;
        this.restrictRedirectsNetworkInterceptor = restrictRedirectsNetworkInterceptor;
        this.cacheErrorInterceptor = cacheErrorInterceptor;
        this.sourceInterceptor = sourceInterceptor;
        this.testCookieInterceptor = testCookieInterceptor;
        this.encodingInterceptor = encodingInterceptor;
        this.logRequestsInterceptor = logRequestsInterceptor;
        this.cartPaginationNoStoreCacheInterceptor = cartPaginationNoStoreCacheInterceptor;
        this.mapTraceInterceptor = mapTraceInterceptor;
        this.geoRequestsLogInterceptor = geoRequestsLogInterceptor;
        this.ozonIdNetworkInterceptors = ozonIdNetworkInterceptors;
        this.notificationStatusInterceptor = b11;
        this.gncOkHttpClientBuilder = gncOkHttpClientBuilder;
        this.featureChecker = featureChecker;
        this.failedExternalLinkRetryInterceptor = failedExternalLinkRetryInterceptor;
    }

    private final void addAdaptUrlAndCacheInterceptors(E.a aVar) {
        boolean isEnabled = this.featureChecker.isEnabled(AdaptUrlInterceptorsBeforeCacheFlag.INSTANCE);
        if (!isEnabled) {
            addCacheInterceptors(aVar);
        }
        aVar.a(this.sourceInterceptor);
        B b11 = this.notificationStatusInterceptor;
        if (b11 != null) {
            aVar.a(b11);
        }
        aVar.a(new RestoreRequestUrlAppInterceptor());
        aVar.a(this.adaptRequestUrlAppInterceptor);
        if (isEnabled) {
            addCacheInterceptors(aVar);
        }
        aVar.a(this.cacheErrorInterceptor);
        aVar.b(new RestoreRequestUrlNetworkInterceptor());
        aVar.b(this.adaptRequestUrlNetworkInterceptor);
    }

    private final void addCacheInterceptors(E.a aVar) {
        aVar.a(this.notifyCacheHitInterceptor);
        aVar.a(this.onSaveToCacheInterceptor);
    }

    private final E.a addInterceptors(E.a aVar) {
        ArrayList S11 = aVar.S();
        int indexOf = S11.indexOf(this.encodingInterceptor);
        if (indexOf < 0) {
            indexOf = 0;
        }
        S11.add(indexOf, new H());
        aVar.a(this.testCookieInterceptor);
        aVar.a(this.homePrefetchInterceptor);
        aVar.a(this.joinRequestsAppInterceptor);
        aVar.a(this.composerFirstLoadInterceptor);
        aVar.a(this.composerReferrerInterceptor);
        aVar.a(this.referrerHeaderInterceptor);
        aVar.a(this.productReviewReferrerInterceptor);
        aVar.a(this.composerHttpInterceptor);
        aVar.a(this.redirectAppInterceptor);
        addAdaptUrlAndCacheInterceptors(aVar);
        aVar.b(new ComposerPageIdNetworkInterceptor());
        aVar.b(this.cartPaginationNoStoreCacheInterceptor);
        aVar.b(this.mapTraceInterceptor);
        aVar.b(this.geoRequestsLogInterceptor);
        aVar.b(this.redirectNetworkInterceptor);
        aVar.b(this.appsFlyerRedirectNetworkInterceptor);
        aVar.b(this.substituteCacheControlMaxAgeInterceptor);
        aVar.b(this.restrictRedirectsNetworkInterceptor);
        aVar.b(this.failedExternalLinkRetryInterceptor);
        for (B b11 : this.ozonIdNetworkInterceptors) {
            if (aVar.T().remove(b11)) {
                aVar.T().add(b11);
            }
        }
        aVar.b(new M());
        ArrayList T11 = aVar.T();
        T11.remove(this.logRequestsInterceptor);
        T11.add(this.logRequestsInterceptor);
        return aVar;
    }

    private final E provideGncOkHttpClient(boolean isCronetEnabled) {
        int i11;
        GncOkHttpClientBuilder deepCopy = this.gncOkHttpClientBuilder.deepCopy();
        deepCopy.isCronetEnabled(isCronetEnabled);
        List<AbstractC8922e> interceptors = deepCopy.interceptors();
        ListIterator<AbstractC8922e> listIterator = interceptors.listIterator(interceptors.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i11 = -1;
                break;
            }
            if (Intrinsics.d(listIterator.previous().getKey(), this.encodingInterceptor.getClass().getName())) {
                i11 = listIterator.nextIndex();
                break;
            }
        }
        if (i11 < 0) {
            i11 = 0;
        }
        deepCopy.addAppInterceptor(new H(), i11);
        GncOkHttpClientBuilder.addAppInterceptor$default(deepCopy, this.testCookieInterceptor, 0, 2, null);
        GncOkHttpClientBuilder.addAppInterceptor$default(deepCopy, this.homePrefetchInterceptor, 0, 2, null);
        GncOkHttpClientBuilder.addAppInterceptor$default(deepCopy, this.joinRequestsAppInterceptor, 0, 2, null);
        GncOkHttpClientBuilder.addAppInterceptor$default(deepCopy, this.composerFirstLoadInterceptor, 0, 2, null);
        GncOkHttpClientBuilder.addAppInterceptor$default(deepCopy, this.composerReferrerInterceptor, 0, 2, null);
        GncOkHttpClientBuilder.addAppInterceptor$default(deepCopy, this.referrerHeaderInterceptor, 0, 2, null);
        GncOkHttpClientBuilder.addAppInterceptor$default(deepCopy, this.productReviewReferrerInterceptor, 0, 2, null);
        GncOkHttpClientBuilder.addAppInterceptor$default(deepCopy, this.composerHttpInterceptor, 0, 2, null);
        GncOkHttpClientBuilder.addAppInterceptor$default(deepCopy, this.redirectAppInterceptor, 0, 2, null);
        boolean isEnabled = this.featureChecker.isEnabled(AdaptUrlInterceptorsBeforeCacheFlag.INSTANCE);
        if (!isEnabled) {
            addCacheInterceptors(deepCopy);
        }
        GncOkHttpClientBuilder.addAppInterceptor$default(deepCopy, this.sourceInterceptor, 0, 2, null);
        B b11 = this.notificationStatusInterceptor;
        if (b11 != null) {
            GncOkHttpClientBuilder.addAppInterceptor$default(deepCopy, b11, 0, 2, null);
        }
        GncOkHttpClientBuilder.addAppInterceptor$default(deepCopy, new RestoreRequestUrlAppInterceptor(), 0, 2, null);
        GncOkHttpClientBuilder.addAppInterceptor$default(deepCopy, this.adaptRequestUrlAppInterceptor, 0, 2, null);
        if (isEnabled) {
            addCacheInterceptors(deepCopy);
        }
        GncOkHttpClientBuilder.addAppInterceptor$default(deepCopy, this.cacheErrorInterceptor, 0, 2, null);
        GncOkHttpClientBuilder.addNetworkInterceptor$default(deepCopy, new RestoreRequestUrlNetworkInterceptor(), 0, 2, null);
        GncOkHttpClientBuilder.addNetworkInterceptor$default(deepCopy, this.adaptRequestUrlNetworkInterceptor, 0, 2, null);
        GncOkHttpClientBuilder.addNetworkInterceptor$default(deepCopy, new ComposerPageIdNetworkInterceptor(), 0, 2, null);
        GncOkHttpClientBuilder.addNetworkInterceptor$default(deepCopy, this.cartPaginationNoStoreCacheInterceptor, 0, 2, null);
        GncOkHttpClientBuilder.addNetworkInterceptor$default(deepCopy, this.mapTraceInterceptor, 0, 2, null);
        GncOkHttpClientBuilder.addNetworkInterceptor$default(deepCopy, this.geoRequestsLogInterceptor, 0, 2, null);
        GncOkHttpClientBuilder.addNetworkInterceptor$default(deepCopy, this.redirectNetworkInterceptor, 0, 2, null);
        GncOkHttpClientBuilder.addNetworkInterceptor$default(deepCopy, this.appsFlyerRedirectNetworkInterceptor, 0, 2, null);
        GncOkHttpClientBuilder.addNetworkInterceptor$default(deepCopy, this.substituteCacheControlMaxAgeInterceptor, 0, 2, null);
        GncOkHttpClientBuilder.addNetworkInterceptor$default(deepCopy, this.restrictRedirectsNetworkInterceptor, 0, 2, null);
        GncOkHttpClientBuilder.addNetworkInterceptor$default(deepCopy, this.failedExternalLinkRetryInterceptor, 0, 2, null);
        for (B b12 : this.ozonIdNetworkInterceptors) {
            List<AbstractC8922e> interceptors2 = deepCopy.interceptors();
            final OkHttpClientProvider$provideGncOkHttpClient$1$2$hasInterceptor$1 okHttpClientProvider$provideGncOkHttpClient$1$2$hasInterceptor$1 = new OkHttpClientProvider$provideGncOkHttpClient$1$2$hasInterceptor$1(b12);
            if (interceptors2.removeIf(new Predicate() { // from class: Fr.b
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean provideGncOkHttpClient$lambda$5$lambda$3$lambda$2;
                    provideGncOkHttpClient$lambda$5$lambda$3$lambda$2 = OkHttpClientProvider.provideGncOkHttpClient$lambda$5$lambda$3$lambda$2(Function1.this, obj);
                    return provideGncOkHttpClient$lambda$5$lambda$3$lambda$2;
                }
            })) {
                GncOkHttpClientBuilder.addNetworkInterceptor$default(deepCopy, b12, 0, 2, null);
            }
        }
        GncOkHttpClientBuilder.addNetworkInterceptor$default(deepCopy, new M(), 0, 2, null);
        List<AbstractC8922e> interceptors3 = deepCopy.interceptors();
        final OkHttpClientProvider$provideGncOkHttpClient$1$3 okHttpClientProvider$provideGncOkHttpClient$1$3 = new OkHttpClientProvider$provideGncOkHttpClient$1$3(this);
        interceptors3.removeIf(new Predicate() { // from class: Fr.c
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean provideGncOkHttpClient$lambda$5$lambda$4;
                provideGncOkHttpClient$lambda$5$lambda$4 = OkHttpClientProvider.provideGncOkHttpClient$lambda$5$lambda$4(Function1.this, obj);
                return provideGncOkHttpClient$lambda$5$lambda$4;
            }
        });
        GncOkHttpClientBuilder.addNetworkInterceptor$default(deepCopy, this.logRequestsInterceptor, 0, 2, null);
        deepCopy.cache(this.cache);
        deepCopy.eventListenerFactory(new D(this.context, this.prefetchEventInterceptor));
        return deepCopy.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideGncOkHttpClient$lambda$5$lambda$3$lambda$2(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideGncOkHttpClient$lambda$5$lambda$4(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    @NotNull
    public final E provide(boolean isCronetEnabled) {
        if (this.featureChecker.isEnabled(BxSdkOzonNetworkEnabledFlag.INSTANCE)) {
            return provideGncOkHttpClient(isCronetEnabled);
        }
        E e11 = this.okHttpClient;
        e11.getClass();
        E.a addInterceptors = addInterceptors(new E.a(e11));
        addInterceptors.c(this.cache);
        addInterceptors.k(new D(this.context, this.prefetchEventInterceptor));
        return new E(addInterceptors);
    }

    private final void addCacheInterceptors(GncOkHttpClientBuilder gncOkHttpClientBuilder) {
        GncOkHttpClientBuilder.addAppInterceptor$default(gncOkHttpClientBuilder, this.notifyCacheHitInterceptor, 0, 2, null);
        GncOkHttpClientBuilder.addAppInterceptor$default(gncOkHttpClientBuilder, this.onSaveToCacheInterceptor, 0, 2, null);
    }
}
