package ru.ozon.mapsdk.common.geoproxy.data.composermodels;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0017"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/composermodels/ComposerLatLng;", "", "lat", "", "lon", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getLat", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLon", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lru/ozon/mapsdk/common/geoproxy/data/composermodels/ComposerLatLng;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ComposerLatLng {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Double lat;
    private final Double lon;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/composermodels/ComposerLatLng$Companion;", "", "<init>", "()V", "Lwe0/m;", "latLng", "Lru/ozon/mapsdk/common/geoproxy/data/composermodels/ComposerLatLng;", "formLatLng", "(Lwe0/m;)Lru/ozon/mapsdk/common/geoproxy/data/composermodels/ComposerLatLng;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComposerLatLng formLatLng(@NotNull m latLng) {
            Intrinsics.checkNotNullParameter(latLng, "latLng");
            return new ComposerLatLng(Double.valueOf(latLng.getLatitude()), Double.valueOf(latLng.getLongitude()));
        }

        private Companion() {
        }
    }

    public ComposerLatLng(Double d11, Double d12) {
        this.lat = d11;
        this.lon = d12;
    }

    public static /* synthetic */ ComposerLatLng copy$default(ComposerLatLng composerLatLng, Double d11, Double d12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = composerLatLng.lat;
        }
        if ((i11 & 2) != 0) {
            d12 = composerLatLng.lon;
        }
        return composerLatLng.copy(d11, d12);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getLat() {
        return this.lat;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getLon() {
        return this.lon;
    }

    @NotNull
    public final ComposerLatLng copy(Double lat, Double lon) {
        return new ComposerLatLng(lat, lon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposerLatLng)) {
            return false;
        }
        ComposerLatLng composerLatLng = (ComposerLatLng) other;
        return Intrinsics.d(this.lat, composerLatLng.lat) && Intrinsics.d(this.lon, composerLatLng.lon);
    }

    public final Double getLat() {
        return this.lat;
    }

    public final Double getLon() {
        return this.lon;
    }

    public int hashCode() {
        Double d11 = this.lat;
        int hashCode = (d11 == null ? 0 : d11.hashCode()) * 31;
        Double d12 = this.lon;
        return hashCode + (d12 != null ? d12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ComposerLatLng(lat=" + this.lat + ", lon=" + this.lon + ")";
    }
}
