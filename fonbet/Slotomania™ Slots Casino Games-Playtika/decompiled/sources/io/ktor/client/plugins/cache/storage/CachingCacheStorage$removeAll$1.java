package io.ktor.client.plugins.cache.storage;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FileCacheStorage.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0}, l = {Sdk.SDKMetric.SDKMetricType.NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE}, m = "removeAll", n = {"url"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class CachingCacheStorage$removeAll$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CachingCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachingCacheStorage$removeAll$1(CachingCacheStorage cachingCacheStorage, Continuation<? super CachingCacheStorage$removeAll$1> continuation) {
        super(continuation);
        this.this$0 = cachingCacheStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.removeAll(null, this);
    }
}
