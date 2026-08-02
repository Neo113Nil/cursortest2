package com.socure.docv.capturesdk.core.storage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cache.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"require", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/socure/docv/capturesdk/core/storage/Cache;", "(Lcom/socure/docv/capturesdk/core/storage/Cache;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CacheKt {
    public static final <T> T require(Cache<T> cache) {
        Intrinsics.checkNotNullParameter(cache, "<this>");
        T t = cache.get();
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
