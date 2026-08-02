package ru.ozon.app.android.composer.network.util;

import We.G;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWe/G;", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "cacheGroup", "(LWe/G;)Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "composer_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequestsKt {
    public static final CacheGroup cacheGroup(@NotNull G g10) {
        Intrinsics.checkNotNullParameter(g10, "<this>");
        return (CacheGroup) g10.i(CacheGroup.class);
    }
}
