package ru.ozon.app.android.geo.mapPreview.data;

import C.o0;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/geo/mapPreview/data/Pin;", "", "anchorPoint", "Lru/ozon/app/android/geo/mapPreview/data/AnchorPoint;", "coordinates", "Lru/ozon/app/android/geo/mapPreview/data/Coordinates;", "icon", "", "<init>", "(Lru/ozon/app/android/geo/mapPreview/data/AnchorPoint;Lru/ozon/app/android/geo/mapPreview/data/Coordinates;Ljava/lang/String;)V", "getAnchorPoint", "()Lru/ozon/app/android/geo/mapPreview/data/AnchorPoint;", "getCoordinates", "()Lru/ozon/app/android/geo/mapPreview/data/Coordinates;", "getIcon", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Pin {

    @NotNull
    private final AnchorPoint anchorPoint;

    @NotNull
    private final Coordinates coordinates;

    @NotNull
    private final String icon;

    public Pin(@NotNull AnchorPoint anchorPoint, @NotNull Coordinates coordinates, @NotNull String icon) {
        Intrinsics.checkNotNullParameter(anchorPoint, "anchorPoint");
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.anchorPoint = anchorPoint;
        this.coordinates = coordinates;
        this.icon = icon;
    }

    public static /* synthetic */ Pin copy$default(Pin pin, AnchorPoint anchorPoint, Coordinates coordinates, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            anchorPoint = pin.anchorPoint;
        }
        if ((i11 & 2) != 0) {
            coordinates = pin.coordinates;
        }
        if ((i11 & 4) != 0) {
            str = pin.icon;
        }
        return pin.copy(anchorPoint, coordinates, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AnchorPoint getAnchorPoint() {
        return this.anchorPoint;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final Pin copy(@NotNull AnchorPoint anchorPoint, @NotNull Coordinates coordinates, @NotNull String icon) {
        Intrinsics.checkNotNullParameter(anchorPoint, "anchorPoint");
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new Pin(anchorPoint, coordinates, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pin)) {
            return false;
        }
        Pin pin = (Pin) other;
        return Intrinsics.d(this.anchorPoint, pin.anchorPoint) && Intrinsics.d(this.coordinates, pin.coordinates) && Intrinsics.d(this.icon, pin.icon);
    }

    @NotNull
    public final AnchorPoint getAnchorPoint() {
        return this.anchorPoint;
    }

    @NotNull
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return this.icon.hashCode() + ((this.coordinates.hashCode() + (this.anchorPoint.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        AnchorPoint anchorPoint = this.anchorPoint;
        Coordinates coordinates = this.coordinates;
        String str = this.icon;
        StringBuilder sb2 = new StringBuilder("Pin(anchorPoint=");
        sb2.append(anchorPoint);
        sb2.append(", coordinates=");
        sb2.append(coordinates);
        sb2.append(", icon=");
        return o0.c(sb2, str, ")");
    }

    public /* synthetic */ Pin(AnchorPoint anchorPoint, Coordinates coordinates, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new AnchorPoint(0.5d, 1.0d) : anchorPoint, coordinates, str);
    }
}
