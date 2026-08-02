package ru.ozon.app.android.composer.network.cache;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;
import ru.ozon.app.android.composer.network.cache.cacheGroup.DefaultCacheGroup;
import ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler;
import ru.ozon.app.android.composer.network.cache.util.Url;
import ru.ozon.app.android.composer.network.util.StringsKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/composer/network/cache/CacheHandlersHolder;", "", "", "Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandler;", "cacheHandlers", "<init>", "(Ljava/util/Set;)V", "", "getAll", "()Ljava/util/Collection;", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "cacheGroup", "get", "(Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;)Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandler;", "Lru/ozon/app/android/composer/network/cache/util/Url;", ImagesContract.URL, "get-VgcI5v0", "(Ljava/lang/String;)Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandler;", "get-zMoF2ac", "(Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;)Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandler;", "Ljava/util/Set;", "", "groupedCacheHandlers", "Ljava/util/Map;", "", "urlToCacheHandlerMap", "default", "Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandler;", "getDefault", "()Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandler;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CacheHandlersHolder {

    @NotNull
    private final Set<ComposerCacheHandler> cacheHandlers;

    @NotNull
    private final ComposerCacheHandler default;

    @NotNull
    private final Map<CacheGroup, ComposerCacheHandler> groupedCacheHandlers;

    @NotNull
    private final Map<Url, ComposerCacheHandler> urlToCacheHandlerMap;

    public CacheHandlersHolder(@NotNull Set<ComposerCacheHandler> cacheHandlers) {
        Intrinsics.checkNotNullParameter(cacheHandlers, "cacheHandlers");
        this.cacheHandlers = cacheHandlers;
        Set<ComposerCacheHandler> set = cacheHandlers;
        int h11 = U.h(C7714v.z(set, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
        for (Object obj : set) {
            linkedHashMap.put(((ComposerCacheHandler) obj).getCacheGroup(), obj);
        }
        this.groupedCacheHandlers = linkedHashMap;
        this.urlToCacheHandlerMap = new LinkedHashMap();
        this.default = (ComposerCacheHandler) U.e(linkedHashMap, DefaultCacheGroup.INSTANCE);
    }

    private static final ComposerCacheHandler get_VgcI5v0$findAndCache(String str, CacheHandlersHolder cacheHandlersHolder) {
        Object obj;
        String m671pageUrlVgcI5v0 = StringsKt.m671pageUrlVgcI5v0(str);
        Iterator<T> it = cacheHandlersHolder.cacheHandlers.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ComposerCacheHandler) obj).mo521canHandle46iOEHo(str, m671pageUrlVgcI5v0)) {
                break;
            }
        }
        ComposerCacheHandler composerCacheHandler = (ComposerCacheHandler) obj;
        if (composerCacheHandler != null) {
            cacheHandlersHolder.urlToCacheHandlerMap.put(Url.m663boximpl(str), composerCacheHandler);
        }
        return composerCacheHandler;
    }

    @NotNull
    public final ComposerCacheHandler get(@NotNull CacheGroup cacheGroup) {
        Intrinsics.checkNotNullParameter(cacheGroup, "cacheGroup");
        return (ComposerCacheHandler) U.e(this.groupedCacheHandlers, cacheGroup);
    }

    /* renamed from: get-VgcI5v0, reason: not valid java name */
    public final ComposerCacheHandler m621getVgcI5v0(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ComposerCacheHandler composerCacheHandler = this.urlToCacheHandlerMap.get(Url.m663boximpl(url));
        return composerCacheHandler == null ? get_VgcI5v0$findAndCache(url, this) : composerCacheHandler;
    }

    /* renamed from: get-zMoF2ac, reason: not valid java name */
    public final ComposerCacheHandler m622getzMoF2ac(@NotNull String url, CacheGroup cacheGroup) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (cacheGroup == null) {
            return m621getVgcI5v0(url);
        }
        ComposerCacheHandler composerCacheHandler = get(cacheGroup);
        this.urlToCacheHandlerMap.put(Url.m663boximpl(url), composerCacheHandler);
        return composerCacheHandler;
    }

    @NotNull
    public final Collection<ComposerCacheHandler> getAll() {
        return this.cacheHandlers;
    }

    @NotNull
    public final ComposerCacheHandler getDefault() {
        return this.default;
    }
}
