package ru.ozon.app.android.composer.network.cache.interceptor.adaptUrl.readFromCache;

import We.B;
import We.L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.interceptor.adaptUrl.UrlChangesKt;
import ru.ozon.app.android.network.interceptors.BXInterceptor;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/composer/network/cache/interceptor/adaptUrl/readFromCache/RestoreRequestUrlNetworkInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "<init>", "()V", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RestoreRequestUrlNetworkInterceptor extends BXInterceptor {
    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return chain.proceed(UrlChangesKt.withOriginalUrl(chain.request()));
    }
}
