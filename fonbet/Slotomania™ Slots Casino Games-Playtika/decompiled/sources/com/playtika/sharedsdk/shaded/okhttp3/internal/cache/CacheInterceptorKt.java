package com.playtika.sharedsdk.shaded.okhttp3.internal.cache;

import com.playtika.sharedsdk.shaded.okhttp3.HttpUrl;
import com.playtika.sharedsdk.shaded.okhttp3.Request;
import com.playtika.sharedsdk.shaded.okhttp3.internal.http.HttpMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CacheInterceptor.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002¨\u0006\u0002"}, d2 = {"requestForCache", "Lcom/playtika/sharedsdk/shaded/okhttp3/Request;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CacheInterceptorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Request requestForCache(Request request) {
        HttpUrl cacheUrlOverride = request.getCacheUrlOverride();
        return cacheUrlOverride != null ? (HttpMethod.INSTANCE.isCacheable(request.method()) || Intrinsics.areEqual(request.method(), "POST")) ? request.newBuilder().get().url(cacheUrlOverride).cacheUrlOverride(null).build() : request : request;
    }
}
