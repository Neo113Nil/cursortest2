package ru.ozon.mapsdk.common.geoproxy.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderObject;", "", "info", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "<init>", "(Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;)V", "getInfo", "()Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class GeoProviderObject {

    @NotNull
    private final GeoProviderConfig info;

    public GeoProviderObject(@NotNull GeoProviderConfig info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.info = info;
    }

    public static /* synthetic */ GeoProviderObject copy$default(GeoProviderObject geoProviderObject, GeoProviderConfig geoProviderConfig, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            geoProviderConfig = geoProviderObject.info;
        }
        return geoProviderObject.copy(geoProviderConfig);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final GeoProviderConfig getInfo() {
        return this.info;
    }

    @NotNull
    public final GeoProviderObject copy(@NotNull GeoProviderConfig info) {
        Intrinsics.checkNotNullParameter(info, "info");
        return new GeoProviderObject(info);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GeoProviderObject) && Intrinsics.d(this.info, ((GeoProviderObject) other).info);
    }

    @NotNull
    public final GeoProviderConfig getInfo() {
        return this.info;
    }

    public int hashCode() {
        return this.info.hashCode();
    }

    @NotNull
    public String toString() {
        return "GeoProviderObject(info=" + this.info + ")";
    }
}
