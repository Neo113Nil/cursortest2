package ru.ozon.app.android.composer.network.cache.interceptor;

import Sc.InterfaceC4008j;
import Sc.k;
import We.B;
import We.C4864f;
import We.G;
import We.L;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.ComposerCacheService;
import ru.ozon.app.android.composer.network.util.ResponsesKt;
import ru.ozon.app.android.network.interceptors.BXInterceptor;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/composer/network/cache/interceptor/SubstituteCacheControlMaxAgeInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "Lru/ozon/app/android/composer/network/cache/ComposerCacheService;", "composerCacheService", "<init>", "(Lru/ozon/app/android/composer/network/cache/ComposerCacheService;)V", "", "maxAge", "", "createCacheControlHeaderValue", "(I)Ljava/lang/String;", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "Lru/ozon/app/android/composer/network/cache/ComposerCacheService;", "LWe/f$a;", "cacheControlBuilder$delegate", "LSc/j;", "getCacheControlBuilder", "()LWe/f$a;", "cacheControlBuilder", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SubstituteCacheControlMaxAgeInterceptor extends BXInterceptor {

    /* renamed from: cacheControlBuilder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cacheControlBuilder;

    @NotNull
    private final ComposerCacheService composerCacheService;

    public SubstituteCacheControlMaxAgeInterceptor(@NotNull ComposerCacheService composerCacheService) {
        Intrinsics.checkNotNullParameter(composerCacheService, "composerCacheService");
        this.composerCacheService = composerCacheService;
        this.cacheControlBuilder = k.b(SubstituteCacheControlMaxAgeInterceptor$cacheControlBuilder$2.INSTANCE);
    }

    private final String createCacheControlHeaderValue(int maxAge) {
        C4864f.a cacheControlBuilder = getCacheControlBuilder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        cacheControlBuilder.b(maxAge);
        return cacheControlBuilder.a().toString();
    }

    private final C4864f.a getCacheControlBuilder() {
        return (C4864f.a) this.cacheControlBuilder.getValue();
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        L proceed = chain.proceed(request);
        Integer formatMaxAge = this.composerCacheService.formatMaxAge(request, proceed);
        return formatMaxAge != null ? ResponsesKt.withCacheControl(proceed, createCacheControlHeaderValue(formatMaxAge.intValue())) : proceed;
    }
}
