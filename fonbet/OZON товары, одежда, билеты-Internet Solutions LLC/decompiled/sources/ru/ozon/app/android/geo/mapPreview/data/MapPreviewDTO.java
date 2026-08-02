package ru.ozon.app.android.geo.mapPreview.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/geo/mapPreview/data/MapPreviewDTO;", "", "isUserInteractionEnabled", "", "pins", "", "Lru/ozon/app/android/geo/mapPreview/data/Pin;", "viewport", "Lru/ozon/app/android/geo/mapPreview/data/ViewPort;", "<init>", "(ZLjava/util/List;Lru/ozon/app/android/geo/mapPreview/data/ViewPort;)V", "()Z", "getPins", "()Ljava/util/List;", "getViewport", "()Lru/ozon/app/android/geo/mapPreview/data/ViewPort;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MapPreviewDTO {
    private final boolean isUserInteractionEnabled;
    private final List<Pin> pins;

    @NotNull
    private final ViewPort viewport;

    public MapPreviewDTO(boolean z11, List<Pin> list, @NotNull ViewPort viewport) {
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        this.isUserInteractionEnabled = z11;
        this.pins = list;
        this.viewport = viewport;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MapPreviewDTO copy$default(MapPreviewDTO mapPreviewDTO, boolean z11, List list, ViewPort viewPort, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = mapPreviewDTO.isUserInteractionEnabled;
        }
        if ((i11 & 2) != 0) {
            list = mapPreviewDTO.pins;
        }
        if ((i11 & 4) != 0) {
            viewPort = mapPreviewDTO.viewport;
        }
        return mapPreviewDTO.copy(z11, list, viewPort);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsUserInteractionEnabled() {
        return this.isUserInteractionEnabled;
    }

    public final List<Pin> component2() {
        return this.pins;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ViewPort getViewport() {
        return this.viewport;
    }

    @NotNull
    public final MapPreviewDTO copy(boolean isUserInteractionEnabled, List<Pin> pins, @NotNull ViewPort viewport) {
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        return new MapPreviewDTO(isUserInteractionEnabled, pins, viewport);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapPreviewDTO)) {
            return false;
        }
        MapPreviewDTO mapPreviewDTO = (MapPreviewDTO) other;
        return this.isUserInteractionEnabled == mapPreviewDTO.isUserInteractionEnabled && Intrinsics.d(this.pins, mapPreviewDTO.pins) && Intrinsics.d(this.viewport, mapPreviewDTO.viewport);
    }

    public final List<Pin> getPins() {
        return this.pins;
    }

    @NotNull
    public final ViewPort getViewport() {
        return this.viewport;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isUserInteractionEnabled) * 31;
        List<Pin> list = this.pins;
        return this.viewport.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final boolean isUserInteractionEnabled() {
        return this.isUserInteractionEnabled;
    }

    @NotNull
    public String toString() {
        return "MapPreviewDTO(isUserInteractionEnabled=" + this.isUserInteractionEnabled + ", pins=" + this.pins + ", viewport=" + this.viewport + ")";
    }

    public /* synthetic */ MapPreviewDTO(boolean z11, List list, ViewPort viewPort, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : list, viewPort);
    }
}
