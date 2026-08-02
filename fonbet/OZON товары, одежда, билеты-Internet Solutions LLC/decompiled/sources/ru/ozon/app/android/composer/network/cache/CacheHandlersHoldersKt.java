package ru.ozon.app.android.composer.network.cache;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;
import ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0000¨\u0006\n"}, d2 = {"getOrDefault", "Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandler;", "Lru/ozon/app/android/composer/network/cache/CacheHandlersHolder;", ImagesContract.URL, "Lru/ozon/app/android/composer/network/cache/util/Url;", "cacheGroup", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "getOrDefault-7mni29M", "(Lru/ozon/app/android/composer/network/cache/CacheHandlersHolder;Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;)Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandler;", "group", "composer_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CacheHandlersHoldersKt {
    @NotNull
    public static final ComposerCacheHandler getOrDefault(@NotNull CacheHandlersHolder cacheHandlersHolder, CacheGroup cacheGroup) {
        Intrinsics.checkNotNullParameter(cacheHandlersHolder, "<this>");
        return cacheGroup != null ? cacheHandlersHolder.get(cacheGroup) : cacheHandlersHolder.getDefault();
    }

    @NotNull
    /* renamed from: getOrDefault-7mni29M, reason: not valid java name */
    public static final ComposerCacheHandler m623getOrDefault7mni29M(@NotNull CacheHandlersHolder getOrDefault, @NotNull String url, CacheGroup cacheGroup) {
        Intrinsics.checkNotNullParameter(getOrDefault, "$this$getOrDefault");
        Intrinsics.checkNotNullParameter(url, "url");
        ComposerCacheHandler m622getzMoF2ac = getOrDefault.m622getzMoF2ac(url, cacheGroup);
        return m622getzMoF2ac == null ? getOrDefault.getDefault() : m622getzMoF2ac;
    }
}
