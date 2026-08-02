package com.socure.docv.capturesdk.core.storage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* compiled from: Cache.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/socure/docv/capturesdk/core/storage/Cache;", ExifInterface.GPS_DIRECTION_TRUE, "", "clear", "", "get", "()Ljava/lang/Object;", "set", "value", "(Ljava/lang/Object;)V", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface Cache<T> {
    void clear();

    T get();

    void set(T value);
}
