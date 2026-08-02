package io.ktor.client.plugins.cache.storage;

import com.ironsource.X3;
import io.ktor.http.Url;
import io.ktor.util.collections.ConcurrentMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileCacheStorage.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0016R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00110\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/ktor/client/plugins/cache/storage/CachingCacheStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "delegate", "<init>", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;)V", "Lio/ktor/http/Url;", "url", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "data", "", X3.i.U, "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "varyKeys", "find", "(Lio/ktor/http/Url;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "findAll", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "removeAll", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "Lio/ktor/util/collections/ConcurrentMap;", "Lio/ktor/util/collections/ConcurrentMap;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CachingCacheStorage implements CacheStorage {
    private final CacheStorage delegate;
    private final ConcurrentMap<Url, Set<CachedResponseData>> store;

    public CachingCacheStorage(CacheStorage delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.store = new ConcurrentMap<>(0, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r8.store(r6, r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object store(Url url, CachedResponseData cachedResponseData, Continuation<? super Unit> continuation) {
        CachingCacheStorage$store$1 cachingCacheStorage$store$1;
        int i;
        ConcurrentMap<Url, Set<CachedResponseData>> concurrentMap;
        if (continuation instanceof CachingCacheStorage$store$1) {
            cachingCacheStorage$store$1 = (CachingCacheStorage$store$1) continuation;
            if ((cachingCacheStorage$store$1.label & Integer.MIN_VALUE) != 0) {
                cachingCacheStorage$store$1.label -= Integer.MIN_VALUE;
                Object obj = cachingCacheStorage$store$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cachingCacheStorage$store$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CacheStorage cacheStorage = this.delegate;
                    cachingCacheStorage$store$1.L$0 = url;
                    cachingCacheStorage$store$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        url = (Url) cachingCacheStorage$store$1.L$1;
                        concurrentMap = (Map) cachingCacheStorage$store$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        concurrentMap.put(url, obj);
                        return Unit.INSTANCE;
                    }
                    url = (Url) cachingCacheStorage$store$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                concurrentMap = this.store;
                CacheStorage cacheStorage2 = this.delegate;
                cachingCacheStorage$store$1.L$0 = concurrentMap;
                cachingCacheStorage$store$1.L$1 = url;
                cachingCacheStorage$store$1.label = 2;
                obj = cacheStorage2.findAll(url, cachingCacheStorage$store$1);
            }
        }
        cachingCacheStorage$store$1 = new CachingCacheStorage$store$1(this, continuation);
        Object obj2 = cachingCacheStorage$store$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cachingCacheStorage$store$1.label;
        if (i != 0) {
        }
        concurrentMap = this.store;
        CacheStorage cacheStorage22 = this.delegate;
        cachingCacheStorage$store$1.L$0 = concurrentMap;
        cachingCacheStorage$store$1.L$1 = url;
        cachingCacheStorage$store$1.label = 2;
        obj2 = cacheStorage22.findAll(url, cachingCacheStorage$store$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object find(Url url, Map<String, String> map, Continuation<? super CachedResponseData> continuation) {
        CachingCacheStorage$find$1 cachingCacheStorage$find$1;
        int i;
        Map<String, String> map2;
        Map map3;
        Url url2;
        if (continuation instanceof CachingCacheStorage$find$1) {
            cachingCacheStorage$find$1 = (CachingCacheStorage$find$1) continuation;
            if ((cachingCacheStorage$find$1.label & Integer.MIN_VALUE) != 0) {
                cachingCacheStorage$find$1.label -= Integer.MIN_VALUE;
                Object obj = cachingCacheStorage$find$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cachingCacheStorage$find$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.store.containsKey(url)) {
                        ConcurrentMap<Url, Set<CachedResponseData>> concurrentMap = this.store;
                        CacheStorage cacheStorage = this.delegate;
                        cachingCacheStorage$find$1.L$0 = url;
                        cachingCacheStorage$find$1.L$1 = map;
                        cachingCacheStorage$find$1.L$2 = concurrentMap;
                        cachingCacheStorage$find$1.L$3 = url;
                        cachingCacheStorage$find$1.label = 1;
                        Object findAll = cacheStorage.findAll(url, cachingCacheStorage$find$1);
                        if (findAll == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        map2 = map;
                        map3 = concurrentMap;
                        obj = findAll;
                        url2 = url;
                    }
                    for (Object obj2 : (Set) MapsKt.getValue(this.store, url)) {
                        CachedResponseData cachedResponseData = (CachedResponseData) obj2;
                        if (map.isEmpty()) {
                            return obj2;
                        }
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            if (!Intrinsics.areEqual(cachedResponseData.getVaryKeys().get(entry.getKey()), entry.getValue())) {
                                break;
                            }
                        }
                        return obj2;
                    }
                    return null;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                url = (Url) cachingCacheStorage$find$1.L$3;
                map3 = (Map) cachingCacheStorage$find$1.L$2;
                map2 = (Map) cachingCacheStorage$find$1.L$1;
                url2 = (Url) cachingCacheStorage$find$1.L$0;
                ResultKt.throwOnFailure(obj);
                map3.put(url, obj);
                url = url2;
                map = map2;
                while (r6.hasNext()) {
                }
                return null;
            }
        }
        cachingCacheStorage$find$1 = new CachingCacheStorage$find$1(this, continuation);
        Object obj3 = cachingCacheStorage$find$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cachingCacheStorage$find$1.label;
        if (i != 0) {
        }
        map3.put(url, obj3);
        url = url2;
        map = map2;
        while (r6.hasNext()) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object findAll(Url url, Continuation<? super Set<CachedResponseData>> continuation) {
        CachingCacheStorage$findAll$1 cachingCacheStorage$findAll$1;
        int i;
        Map map;
        Url url2;
        if (continuation instanceof CachingCacheStorage$findAll$1) {
            cachingCacheStorage$findAll$1 = (CachingCacheStorage$findAll$1) continuation;
            if ((cachingCacheStorage$findAll$1.label & Integer.MIN_VALUE) != 0) {
                cachingCacheStorage$findAll$1.label -= Integer.MIN_VALUE;
                Object obj = cachingCacheStorage$findAll$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cachingCacheStorage$findAll$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.store.containsKey(url)) {
                        ConcurrentMap<Url, Set<CachedResponseData>> concurrentMap = this.store;
                        CacheStorage cacheStorage = this.delegate;
                        cachingCacheStorage$findAll$1.L$0 = url;
                        cachingCacheStorage$findAll$1.L$1 = concurrentMap;
                        cachingCacheStorage$findAll$1.L$2 = url;
                        cachingCacheStorage$findAll$1.label = 1;
                        Object findAll = cacheStorage.findAll(url, cachingCacheStorage$findAll$1);
                        if (findAll == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        map = concurrentMap;
                        obj = findAll;
                        url2 = url;
                    }
                    return MapsKt.getValue(this.store, url);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                url = (Url) cachingCacheStorage$findAll$1.L$2;
                map = (Map) cachingCacheStorage$findAll$1.L$1;
                url2 = (Url) cachingCacheStorage$findAll$1.L$0;
                ResultKt.throwOnFailure(obj);
                map.put(url, obj);
                url = url2;
                return MapsKt.getValue(this.store, url);
            }
        }
        cachingCacheStorage$findAll$1 = new CachingCacheStorage$findAll$1(this, continuation);
        Object obj2 = cachingCacheStorage$findAll$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cachingCacheStorage$findAll$1.label;
        if (i != 0) {
        }
        map.put(url, obj2);
        url = url2;
        return MapsKt.getValue(this.store, url);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r8.remove(r6, r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object remove(Url url, Map<String, String> map, Continuation<? super Unit> continuation) {
        CachingCacheStorage$remove$1 cachingCacheStorage$remove$1;
        int i;
        ConcurrentMap<Url, Set<CachedResponseData>> concurrentMap;
        if (continuation instanceof CachingCacheStorage$remove$1) {
            cachingCacheStorage$remove$1 = (CachingCacheStorage$remove$1) continuation;
            if ((cachingCacheStorage$remove$1.label & Integer.MIN_VALUE) != 0) {
                cachingCacheStorage$remove$1.label -= Integer.MIN_VALUE;
                Object obj = cachingCacheStorage$remove$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cachingCacheStorage$remove$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CacheStorage cacheStorage = this.delegate;
                    cachingCacheStorage$remove$1.L$0 = url;
                    cachingCacheStorage$remove$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        url = (Url) cachingCacheStorage$remove$1.L$1;
                        concurrentMap = (Map) cachingCacheStorage$remove$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        concurrentMap.put(url, obj);
                        return Unit.INSTANCE;
                    }
                    url = (Url) cachingCacheStorage$remove$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                concurrentMap = this.store;
                CacheStorage cacheStorage2 = this.delegate;
                cachingCacheStorage$remove$1.L$0 = concurrentMap;
                cachingCacheStorage$remove$1.L$1 = url;
                cachingCacheStorage$remove$1.label = 2;
                obj = cacheStorage2.findAll(url, cachingCacheStorage$remove$1);
            }
        }
        cachingCacheStorage$remove$1 = new CachingCacheStorage$remove$1(this, continuation);
        Object obj2 = cachingCacheStorage$remove$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cachingCacheStorage$remove$1.label;
        if (i != 0) {
        }
        concurrentMap = this.store;
        CacheStorage cacheStorage22 = this.delegate;
        cachingCacheStorage$remove$1.L$0 = concurrentMap;
        cachingCacheStorage$remove$1.L$1 = url;
        cachingCacheStorage$remove$1.label = 2;
        obj2 = cacheStorage22.findAll(url, cachingCacheStorage$remove$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object removeAll(Url url, Continuation<? super Unit> continuation) {
        CachingCacheStorage$removeAll$1 cachingCacheStorage$removeAll$1;
        int i;
        if (continuation instanceof CachingCacheStorage$removeAll$1) {
            cachingCacheStorage$removeAll$1 = (CachingCacheStorage$removeAll$1) continuation;
            if ((cachingCacheStorage$removeAll$1.label & Integer.MIN_VALUE) != 0) {
                cachingCacheStorage$removeAll$1.label -= Integer.MIN_VALUE;
                Object obj = cachingCacheStorage$removeAll$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cachingCacheStorage$removeAll$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CacheStorage cacheStorage = this.delegate;
                    cachingCacheStorage$removeAll$1.L$0 = url;
                    cachingCacheStorage$removeAll$1.label = 1;
                    if (cacheStorage.removeAll(url, cachingCacheStorage$removeAll$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    url = (Url) cachingCacheStorage$removeAll$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                this.store.remove(url);
                return Unit.INSTANCE;
            }
        }
        cachingCacheStorage$removeAll$1 = new CachingCacheStorage$removeAll$1(this, continuation);
        Object obj2 = cachingCacheStorage$removeAll$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cachingCacheStorage$removeAll$1.label;
        if (i != 0) {
        }
        this.store.remove(url);
        return Unit.INSTANCE;
    }
}
