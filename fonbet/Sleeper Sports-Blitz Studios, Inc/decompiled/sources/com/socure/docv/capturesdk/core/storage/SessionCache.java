package com.socure.docv.capturesdk.core.storage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SessionCache.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0004R\u0012\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/core/storage/SessionCache;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/socure/docv/capturesdk/core/storage/Cache;", "value", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "clear", "", "get", "()Ljava/lang/Object;", "set", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SessionCache<T> implements Cache<T> {
    public static final int $stable = 8;
    private T value;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SessionCache() {
        this(r0, 1, r0);
        DefaultConstructorMarker defaultConstructorMarker = null;
    }

    public SessionCache(T t) {
        this.value = t;
    }

    public /* synthetic */ SessionCache(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }

    @Override // com.socure.docv.capturesdk.core.storage.Cache
    public void set(T value) {
        this.value = value;
    }

    @Override // com.socure.docv.capturesdk.core.storage.Cache
    public T get() {
        return this.value;
    }

    @Override // com.socure.docv.capturesdk.core.storage.Cache
    public void clear() {
        this.value = null;
    }
}
