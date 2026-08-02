package io.ktor.client.plugins.cache.storage;

import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FileCacheStorage.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 1, 1, 1, 1, 2}, l = {171, 174, 176}, m = "readCacheUnsafe", n = {AppsFlyerProperties.CHANNEL, AppsFlyerProperties.CHANNEL, "caches", "requestsCount", "i", "caches"}, s = {"L$1", "L$1", "L$2", "I$0", "I$1", "L$1"})
/* loaded from: classes2.dex */
final class FileCacheStorage$readCacheUnsafe$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FileCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileCacheStorage$readCacheUnsafe$1(FileCacheStorage fileCacheStorage, Continuation<? super FileCacheStorage$readCacheUnsafe$1> continuation) {
        super(continuation);
        this.this$0 = fileCacheStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.readCacheUnsafe(null, this);
    }
}
