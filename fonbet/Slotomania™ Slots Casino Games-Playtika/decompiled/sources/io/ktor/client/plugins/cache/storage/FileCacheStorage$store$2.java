package io.ktor.client.plugins.cache.storage;

import io.ktor.http.Url;
import io.ktor.util.collections.ConcurrentMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: FileCacheStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2", f = "FileCacheStorage.kt", i = {0, 0, 0, 1, 1, 1, 2}, l = {254, 257, 258}, m = "invokeSuspend", n = {"urlHex", "this_$iv", "$this$withLock_u24default$iv$iv", "urlHex", "this_$iv", "$this$withLock_u24default$iv$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0"})
/* loaded from: classes2.dex */
final class FileCacheStorage$store$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CachedResponseData $data;
    final /* synthetic */ Url $url;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ FileCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileCacheStorage$store$2(FileCacheStorage fileCacheStorage, Url url, CachedResponseData cachedResponseData, Continuation<? super FileCacheStorage$store$2> continuation) {
        super(2, continuation);
        this.this$0 = fileCacheStorage;
        this.$url = url;
        this.$data = cachedResponseData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileCacheStorage$store$2(this.this$0, this.$url, this.$data, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileCacheStorage$store$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:20:0x0036, B:21:0x009e, B:22:0x00ad, B:24:0x00b3, B:27:0x00c8, B:32:0x00cc, B:38:0x0088), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        String key;
        CachedResponseData cachedResponseData;
        FileCacheStorage fileCacheStorage;
        Mutex mutex2;
        String str;
        CachedResponseData cachedResponseData2;
        FileCacheStorage fileCacheStorage2;
        List plus;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                ResultKt.throwOnFailure(obj);
                key = this.this$0.key(this.$url);
                FileCacheStorage fileCacheStorage3 = this.this$0;
                CachedResponseData cachedResponseData3 = this.$data;
                Mutex mutex3 = (Mutex) fileCacheStorage3.mutexes.computeIfAbsent((ConcurrentMap) key, (Function0) FileCacheStorage$updateCache$mutex$1.INSTANCE);
                this.L$0 = key;
                this.L$1 = fileCacheStorage3;
                this.L$2 = cachedResponseData3;
                this.L$3 = mutex3;
                this.label = 1;
                if (mutex3.lock(null, this) != coroutine_suspended) {
                    cachedResponseData = cachedResponseData3;
                    fileCacheStorage = fileCacheStorage3;
                    mutex2 = mutex3;
                }
                return coroutine_suspended;
            }
            if (r1 != 1) {
                if (r1 != 2) {
                    if (r1 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex = (Mutex) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        mutex.unlock(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                Mutex mutex4 = (Mutex) this.L$3;
                cachedResponseData2 = (CachedResponseData) this.L$2;
                fileCacheStorage2 = (FileCacheStorage) this.L$1;
                str = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                r1 = mutex4;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Set) obj) {
                    if (!Intrinsics.areEqual(((CachedResponseData) obj2).getVaryKeys(), cachedResponseData2.getVaryKeys())) {
                        arrayList.add(obj2);
                    }
                }
                plus = CollectionsKt.plus((Collection<? extends CachedResponseData>) arrayList, cachedResponseData2);
                this.L$0 = r1;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
                if (fileCacheStorage2.writeCacheUnsafe(str, plus, this) != coroutine_suspended) {
                    mutex = r1;
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            Mutex mutex5 = (Mutex) this.L$3;
            cachedResponseData = (CachedResponseData) this.L$2;
            fileCacheStorage = (FileCacheStorage) this.L$1;
            String str2 = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            key = str2;
            mutex2 = mutex5;
            this.L$0 = key;
            this.L$1 = fileCacheStorage;
            this.L$2 = cachedResponseData;
            this.L$3 = mutex2;
            this.label = 2;
            Object readCacheUnsafe = fileCacheStorage.readCacheUnsafe(key, this);
            if (readCacheUnsafe == coroutine_suspended) {
                return coroutine_suspended;
            }
            FileCacheStorage fileCacheStorage4 = fileCacheStorage;
            str = key;
            obj = readCacheUnsafe;
            cachedResponseData2 = cachedResponseData;
            fileCacheStorage2 = fileCacheStorage4;
            r1 = mutex2;
            ArrayList arrayList2 = new ArrayList();
            while (r13.hasNext()) {
            }
            plus = CollectionsKt.plus((Collection<? extends CachedResponseData>) arrayList2, cachedResponseData2);
            this.L$0 = r1;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
            if (fileCacheStorage2.writeCacheUnsafe(str, plus, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            mutex = r1;
        }
    }
}
