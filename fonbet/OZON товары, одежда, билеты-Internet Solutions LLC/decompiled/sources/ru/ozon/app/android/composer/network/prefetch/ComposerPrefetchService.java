package ru.ozon.app.android.composer.network.prefetch;

import L00.c;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\fH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchService;", "", "Lru/ozon/app/android/composer/network/cache/util/Url;", ImagesContract.URL, "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "cacheGroup", "", "shouldJoinRequest-zMoF2ac", "(Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;)Z", "shouldJoinRequest", "", "deeplink", "", "params", "LL00/c;", "prefetch", "(Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;Ljava/util/Map;)LL00/c;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ComposerPrefetchService {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c prefetch$default(ComposerPrefetchService composerPrefetchService, String str, CacheGroup cacheGroup, Map map, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prefetch");
            }
            if ((i11 & 4) != 0) {
                map = U.c();
            }
            return composerPrefetchService.prefetch(str, cacheGroup, map);
        }
    }

    c prefetch(@NotNull String deeplink, @NotNull CacheGroup cacheGroup, @NotNull Map<String, ? extends Object> params);

    /* renamed from: shouldJoinRequest-zMoF2ac, reason: not valid java name */
    boolean mo670shouldJoinRequestzMoF2ac(@NotNull String url, CacheGroup cacheGroup);
}
