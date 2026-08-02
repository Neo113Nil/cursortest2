package io.ktor.client.plugins.cache.storage;

import com.ironsource.X3;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.client.plugins.cache.HttpCacheEntry;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Url;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpCacheStorage.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt", f = "HttpCacheStorage.kt", i = {0, 0}, l = {Sdk.SDKMetric.SDKMetricType.NATIVE_AD_DISPLAY_DURATION_VALUE}, m = X3.i.U, n = {"$this$store", "url"}, s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
final class HttpCacheStorageKt$store$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    HttpCacheStorageKt$store$1(Continuation<? super HttpCacheStorageKt$store$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HttpCacheStorageKt.store((HttpCacheStorage) null, (Url) null, (HttpResponse) null, false, (Continuation<? super HttpCacheEntry>) this);
    }
}
