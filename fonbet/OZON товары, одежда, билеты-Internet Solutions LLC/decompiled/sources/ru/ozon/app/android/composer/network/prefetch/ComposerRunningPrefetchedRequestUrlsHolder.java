package ru.ozon.app.android.composer.network.prefetch;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&J\u0014\u0010\u0007\u001a\u00020\b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&J\u001c\u0010\t\u001a\u00020\b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\n\u001a\u00020\u000bH&J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000e\u001a\u00020\u0003H&J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H&J\u0014\u0010\u0012\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&J,\u0010\u0013\u001a\u00020\r2\"\u0010\u0014\u001a\u001e\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00030\u0016\u0012\u0004\u0012\u00020\b0\u0015H&¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/composer/network/prefetch/ComposerRunningPrefetchedRequestUrlsHolder;", "", "get", "Lru/ozon/app/android/composer/network/prefetch/FinalRequestInfo;", "deeplink", "", "Lru/ozon/app/android/composer/network/prefetch/Deeplink;", "isLoading", "", "putIfAbsent", "cacheGroup", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "putIfExist", "", "finalRequestInfo", "updateRequestUrl", "requestUrl", "redirectUrl", "removeByKey", "removeIf", "filter", "Lkotlin/Function1;", "", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ComposerRunningPrefetchedRequestUrlsHolder {
    FinalRequestInfo get(@NotNull String deeplink);

    boolean isLoading(@NotNull String deeplink);

    boolean putIfAbsent(@NotNull String deeplink, @NotNull CacheGroup cacheGroup);

    void putIfExist(@NotNull String deeplink, @NotNull FinalRequestInfo finalRequestInfo);

    void removeByKey(@NotNull String deeplink);

    void removeIf(@NotNull Function1<? super Map.Entry<String, FinalRequestInfo>, Boolean> filter);

    void updateRequestUrl(@NotNull String requestUrl, @NotNull String redirectUrl);
}
