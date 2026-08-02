package ru.ozon.app.android.composer.network.di;

import Pc.a;
import QZ.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.configurator.state.factory.ComposerInterceptorFactory;
import ru.ozon.app.android.composer.network.cache.CacheComposerInterceptor;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/composer/network/di/CacheComposerInterceptorFactory;", "Lru/ozon/app/android/composer/configurator/state/factory/ComposerInterceptorFactory;", "LPc/a;", "Lru/ozon/app/android/composer/network/cache/CacheComposerInterceptor;", "provider", "<init>", "(LPc/a;)V", "LQZ/g;", "create", "()LQZ/g;", "LPc/a;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CacheComposerInterceptorFactory implements ComposerInterceptorFactory {

    @NotNull
    private final a<CacheComposerInterceptor> provider;

    public CacheComposerInterceptorFactory(@NotNull a<CacheComposerInterceptor> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.provider = provider;
    }

    @Override // ru.ozon.app.android.composer.configurator.state.factory.ComposerInterceptorFactory
    @NotNull
    public g create() {
        CacheComposerInterceptor cacheComposerInterceptor = this.provider.get();
        Intrinsics.checkNotNullExpressionValue(cacheComposerInterceptor, "get(...)");
        return cacheComposerInterceptor;
    }
}
