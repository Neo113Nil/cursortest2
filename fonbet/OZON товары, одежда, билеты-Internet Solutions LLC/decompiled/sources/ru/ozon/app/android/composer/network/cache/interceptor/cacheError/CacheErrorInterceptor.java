package ru.ozon.app.android.composer.network.cache.interceptor.cacheError;

import We.B;
import We.L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.flags.CatchRequestErrorsFlag;
import ru.ozon.app.android.composer.network.cache.flags.CheckCacheDelayMillisFlag;
import ru.ozon.app.android.composer.network.cache.flags.LogCanceledRequestFlag;
import ru.ozon.app.android.composer.network.cache.flags.LogManualRemoveFromCacheFlag;
import ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CatchErrorsStrategy;
import ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CheckCacheStrategy;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.interceptors.BXInterceptor;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CacheErrorInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CheckCacheStrategy$Enabled$Factory;", "enabledCheckCacheStrategyFactory", "<init>", "(Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CheckCacheStrategy$Enabled$Factory;)V", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CheckCacheStrategy;", "currentStrategy", "handleCheckCacheDelayFlag", "(Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CheckCacheStrategy;)Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CheckCacheStrategy;", "Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CatchErrorsStrategy;", "checkCacheStrategy", "handleCatchRequestErrorsFlag", "(Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CatchErrorsStrategy;Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CheckCacheStrategy;)Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CatchErrorsStrategy;", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "", "onFeatureFlagsChanged", "(Lru/ozon/app/android/network/abtool/FeatureService;)V", "Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CheckCacheStrategy$Enabled$Factory;", "Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CheckCacheStrategy;", "catchErrorsStrategy", "Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CatchErrorsStrategy;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CacheErrorInterceptor extends BXInterceptor {

    @NotNull
    private CatchErrorsStrategy catchErrorsStrategy;

    @NotNull
    private CheckCacheStrategy checkCacheStrategy;

    @NotNull
    private final CheckCacheStrategy.Enabled.Factory enabledCheckCacheStrategyFactory;

    public CacheErrorInterceptor(@NotNull CheckCacheStrategy.Enabled.Factory enabledCheckCacheStrategyFactory) {
        Intrinsics.checkNotNullParameter(enabledCheckCacheStrategyFactory, "enabledCheckCacheStrategyFactory");
        this.enabledCheckCacheStrategyFactory = enabledCheckCacheStrategyFactory;
        this.checkCacheStrategy = CheckCacheStrategy.Disabled.INSTANCE;
        this.catchErrorsStrategy = CatchErrorsStrategy.Disabled.INSTANCE;
    }

    private final CatchErrorsStrategy handleCatchRequestErrorsFlag(FeatureService featureService, CatchErrorsStrategy currentStrategy, CheckCacheStrategy checkCacheStrategy) {
        if (!Intrinsics.d(checkCacheStrategy, CheckCacheStrategy.Disabled.INSTANCE) && featureService.getBooleanKey(CatchRequestErrorsFlag.INSTANCE)) {
            return Intrinsics.d(currentStrategy, CatchErrorsStrategy.Disabled.INSTANCE) ? new CatchErrorsStrategy.Enabled() : currentStrategy;
        }
        return CatchErrorsStrategy.Disabled.INSTANCE;
    }

    private final CheckCacheStrategy handleCheckCacheDelayFlag(FeatureService featureService, CheckCacheStrategy currentStrategy) {
        long intKey = featureService.getIntKey(CheckCacheDelayMillisFlag.INSTANCE);
        if (intKey < 0) {
            return CheckCacheStrategy.Disabled.INSTANCE;
        }
        boolean booleanKey = featureService.getBooleanKey(LogCanceledRequestFlag.INSTANCE);
        boolean booleanKey2 = featureService.getBooleanKey(LogManualRemoveFromCacheFlag.INSTANCE);
        if (currentStrategy instanceof CheckCacheStrategy.Enabled) {
            CheckCacheStrategy.Enabled enabled = (CheckCacheStrategy.Enabled) currentStrategy;
            if (enabled.getCheckCacheDelayMillis() == intKey && enabled.getLogCanceledRequest() == booleanKey && Intrinsics.d(enabled.getLogManualRemoveFromCache(), Boolean.valueOf(booleanKey2))) {
                return currentStrategy;
            }
        }
        return this.enabledCheckCacheStrategyFactory.create(intKey, booleanKey, Boolean.valueOf(booleanKey2));
    }

    public final void onFeatureFlagsChanged(@NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        CheckCacheStrategy handleCheckCacheDelayFlag = handleCheckCacheDelayFlag(featureService, this.checkCacheStrategy);
        this.checkCacheStrategy = handleCheckCacheDelayFlag;
        this.catchErrorsStrategy = handleCatchRequestErrorsFlag(featureService, this.catchErrorsStrategy, handleCheckCacheDelayFlag);
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        CatchErrorsStrategy catchErrorsStrategy = this.catchErrorsStrategy;
        L execute = catchErrorsStrategy.execute(chain);
        this.checkCacheStrategy.execute(execute, chain, catchErrorsStrategy);
        return execute;
    }
}
