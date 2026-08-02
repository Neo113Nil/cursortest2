package org.maplibre.android.offline;

import C.o0;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegionError;", "", "", "reason", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OfflineRegionError {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f79972a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f79973b;

    @Keep
    private OfflineRegionError(String str, String str2) {
        this.f79972a = str;
        this.f79973b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !OfflineRegionError.class.equals(obj.getClass())) {
            return false;
        }
        OfflineRegionError offlineRegionError = (OfflineRegionError) obj;
        if (Intrinsics.d(this.f79972a, offlineRegionError.f79972a)) {
            return Intrinsics.d(this.f79973b, offlineRegionError.f79973b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f79973b.hashCode() + (this.f79972a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OfflineRegionError{reason='");
        sb2.append(this.f79972a);
        sb2.append("', message='");
        return o0.c(sb2, this.f79973b, "'}");
    }
}
