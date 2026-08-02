package com.margelo.nitro.nitrofetch;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import io.intercom.android.sdk.NotificationStatuses;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FetchCache.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0006J\u001c\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0016\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bJ\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u0006J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u000eR \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/margelo/nitro/nitrofetch/FetchCache;", "", "<init>", "()V", "pending", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/concurrent/CompletableFuture;", "Lcom/margelo/nitro/nitrofetch/NitroResponse;", "results", "Lcom/margelo/nitro/nitrofetch/CachedEntry;", "getPending", SDKConstants.PARAM_KEY, "setPending", "", "future", NotificationStatuses.COMPLETE_STATUS, "value", "completeExceptionally", "t", "", "getResult", "getResultIfFresh", "maxAgeMs", "", "hasFreshResult", "", "clear", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FetchCache {
    public static final FetchCache INSTANCE = new FetchCache();
    private static final ConcurrentHashMap<String, CompletableFuture<NitroResponse>> pending = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, CachedEntry> results = new ConcurrentHashMap<>();

    private FetchCache() {
    }

    public final CompletableFuture<NitroResponse> getPending(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return pending.get(key);
    }

    public final void setPending(final String key, CompletableFuture<NitroResponse> future) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(future, "future");
        pending.put(key, future);
        final Function2 function2 = new Function2() { // from class: com.margelo.nitro.nitrofetch.FetchCache$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit pending$lambda$0;
                pending$lambda$0 = FetchCache.setPending$lambda$0(key, (NitroResponse) obj, (Throwable) obj2);
                return pending$lambda$0;
            }
        };
        future.whenComplete(new BiConsumer() { // from class: com.margelo.nitro.nitrofetch.FetchCache$$ExternalSyntheticLambda1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Function2.this.invoke(obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPending$lambda$0(String str, NitroResponse nitroResponse, Throwable th) {
        pending.remove(str);
        return Unit.INSTANCE;
    }

    public final void complete(String key, NitroResponse value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        results.put(key, new CachedEntry(value, System.currentTimeMillis()));
        ConcurrentHashMap<String, CompletableFuture<NitroResponse>> concurrentHashMap = pending;
        CompletableFuture<NitroResponse> completableFuture = concurrentHashMap.get(key);
        if (completableFuture != null) {
            completableFuture.complete(value);
        }
        concurrentHashMap.remove(key);
    }

    public final void completeExceptionally(String key, Throwable t) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(t, "t");
        ConcurrentHashMap<String, CompletableFuture<NitroResponse>> concurrentHashMap = pending;
        CompletableFuture<NitroResponse> completableFuture = concurrentHashMap.get(key);
        if (completableFuture != null) {
            completableFuture.completeExceptionally(t);
        }
        concurrentHashMap.remove(key);
    }

    public final NitroResponse getResult(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CachedEntry remove = results.remove(key);
        if (remove == null) {
            return null;
        }
        return remove.getResponse();
    }

    public final NitroResponse getResultIfFresh(String key, long maxAgeMs) {
        Intrinsics.checkNotNullParameter(key, "key");
        CachedEntry remove = results.remove(key);
        if (remove != null && System.currentTimeMillis() - remove.getTimestampMs() <= maxAgeMs) {
            return remove.getResponse();
        }
        return null;
    }

    public final boolean hasFreshResult(String key, long maxAgeMs) {
        Intrinsics.checkNotNullParameter(key, "key");
        CachedEntry cachedEntry = results.get(key);
        return cachedEntry != null && System.currentTimeMillis() - cachedEntry.getTimestampMs() <= maxAgeMs;
    }

    public final void clear() {
        pending.clear();
        results.clear();
    }
}
