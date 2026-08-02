package ru.ozon.app.android.composer.network.prefetch;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;
import ru.ozon.app.android.composer.network.prefetch.ComposerRunningPrefetchedRequestUrlsHolderImpl;
import ru.ozon.app.android.composer.network.prefetch.FinalRequestInfo;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u001c\u0010\r\u001a\u00020\f2\n\u0010\n\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\n\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\u0014\u0010\u0016\u001a\u00020\u00112\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007H\u0016J,\u0010\u0017\u001a\u00020\u00112\"\u0010\u0018\u001a\u001e\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u001a\u0012\u0004\u0012\u00020\f0\u0019H\u0016R\u001e\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/composer/network/prefetch/ComposerRunningPrefetchedRequestUrlsHolderImpl;", "Lru/ozon/app/android/composer/network/prefetch/ComposerRunningPrefetchedRequestUrlsHolder;", "<init>", "()V", "runningPrefetchedRequestUrls", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lru/ozon/app/android/composer/network/prefetch/Deeplink;", "Lru/ozon/app/android/composer/network/prefetch/FinalRequestInfo;", "get", "deeplink", "isLoading", "", "putIfAbsent", "cacheGroup", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "putIfExist", "", "finalRequestInfo", "updateRequestUrl", "requestUrl", "redirectUrl", "removeByKey", "removeIf", "filter", "Lkotlin/Function1;", "", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerRunningPrefetchedRequestUrlsHolderImpl implements ComposerRunningPrefetchedRequestUrlsHolder {

    @NotNull
    private final ConcurrentHashMap<String, FinalRequestInfo> runningPrefetchedRequestUrls = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinalRequestInfo putIfExist$lambda$0(Function2 function2, Object obj, Object obj2) {
        return (FinalRequestInfo) function2.invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeIf$lambda$3(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    @Override // ru.ozon.app.android.composer.network.prefetch.ComposerRunningPrefetchedRequestUrlsHolder
    public FinalRequestInfo get(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return this.runningPrefetchedRequestUrls.get(deeplink);
    }

    @Override // ru.ozon.app.android.composer.network.prefetch.ComposerRunningPrefetchedRequestUrlsHolder
    public boolean isLoading(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        FinalRequestInfo finalRequestInfo = this.runningPrefetchedRequestUrls.get(deeplink);
        if (finalRequestInfo != null) {
            return Intrinsics.d(finalRequestInfo.getIsLoading(), Boolean.TRUE);
        }
        return false;
    }

    @Override // ru.ozon.app.android.composer.network.prefetch.ComposerRunningPrefetchedRequestUrlsHolder
    public boolean putIfAbsent(@NotNull String deeplink, @NotNull CacheGroup cacheGroup) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(cacheGroup, "cacheGroup");
        return this.runningPrefetchedRequestUrls.putIfAbsent(deeplink, new FinalRequestInfo(null, null, Boolean.TRUE, cacheGroup, 2, null)) != null;
    }

    @Override // ru.ozon.app.android.composer.network.prefetch.ComposerRunningPrefetchedRequestUrlsHolder
    public void putIfExist(@NotNull String deeplink, @NotNull FinalRequestInfo finalRequestInfo) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(finalRequestInfo, "finalRequestInfo");
        ConcurrentHashMap<String, FinalRequestInfo> concurrentHashMap = this.runningPrefetchedRequestUrls;
        final ComposerRunningPrefetchedRequestUrlsHolderImpl$putIfExist$1 composerRunningPrefetchedRequestUrlsHolderImpl$putIfExist$1 = new ComposerRunningPrefetchedRequestUrlsHolderImpl$putIfExist$1(finalRequestInfo);
        concurrentHashMap.computeIfPresent(deeplink, new BiFunction() { // from class: Kr.i
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                FinalRequestInfo putIfExist$lambda$0;
                putIfExist$lambda$0 = ComposerRunningPrefetchedRequestUrlsHolderImpl.putIfExist$lambda$0(Function2.this, obj, obj2);
                return putIfExist$lambda$0;
            }
        });
    }

    @Override // ru.ozon.app.android.composer.network.prefetch.ComposerRunningPrefetchedRequestUrlsHolder
    public void removeByKey(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.runningPrefetchedRequestUrls.remove(deeplink);
    }

    @Override // ru.ozon.app.android.composer.network.prefetch.ComposerRunningPrefetchedRequestUrlsHolder
    public void removeIf(@NotNull final Function1<? super Map.Entry<String, FinalRequestInfo>, Boolean> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.runningPrefetchedRequestUrls.entrySet().removeIf(new Predicate() { // from class: Kr.h
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean removeIf$lambda$3;
                removeIf$lambda$3 = ComposerRunningPrefetchedRequestUrlsHolderImpl.removeIf$lambda$3(Function1.this, obj);
                return removeIf$lambda$3;
            }
        });
    }

    @Override // ru.ozon.app.android.composer.network.prefetch.ComposerRunningPrefetchedRequestUrlsHolder
    public void updateRequestUrl(@NotNull String requestUrl, @NotNull String redirectUrl) {
        Object obj;
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        if (Intrinsics.d(requestUrl, redirectUrl)) {
            return;
        }
        Set<Map.Entry<String, FinalRequestInfo>> entrySet = this.runningPrefetchedRequestUrls.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
        Iterator<T> it = entrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((FinalRequestInfo) ((Map.Entry) obj).getValue()).getUrl(), redirectUrl)) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            putIfExist((String) key, FinalRequestInfo.copy$default((FinalRequestInfo) entry.getValue(), null, requestUrl, null, null, 13, null));
        }
    }
}
