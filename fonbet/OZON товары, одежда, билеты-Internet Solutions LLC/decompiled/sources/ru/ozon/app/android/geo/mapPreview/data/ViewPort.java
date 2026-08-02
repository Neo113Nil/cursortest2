package ru.ozon.app.android.geo.mapPreview.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/geo/mapPreview/data/ViewPort;", "", "leftBottom", "Lru/ozon/app/android/geo/mapPreview/data/PointOnMap;", "rightTop", "<init>", "(Lru/ozon/app/android/geo/mapPreview/data/PointOnMap;Lru/ozon/app/android/geo/mapPreview/data/PointOnMap;)V", "getLeftBottom", "()Lru/ozon/app/android/geo/mapPreview/data/PointOnMap;", "getRightTop", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ViewPort {

    @NotNull
    private final PointOnMap leftBottom;

    @NotNull
    private final PointOnMap rightTop;

    public ViewPort(@NotNull PointOnMap leftBottom, @NotNull PointOnMap rightTop) {
        Intrinsics.checkNotNullParameter(leftBottom, "leftBottom");
        Intrinsics.checkNotNullParameter(rightTop, "rightTop");
        this.leftBottom = leftBottom;
        this.rightTop = rightTop;
    }

    public static /* synthetic */ ViewPort copy$default(ViewPort viewPort, PointOnMap pointOnMap, PointOnMap pointOnMap2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pointOnMap = viewPort.leftBottom;
        }
        if ((i11 & 2) != 0) {
            pointOnMap2 = viewPort.rightTop;
        }
        return viewPort.copy(pointOnMap, pointOnMap2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PointOnMap getLeftBottom() {
        return this.leftBottom;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PointOnMap getRightTop() {
        return this.rightTop;
    }

    @NotNull
    public final ViewPort copy(@NotNull PointOnMap leftBottom, @NotNull PointOnMap rightTop) {
        Intrinsics.checkNotNullParameter(leftBottom, "leftBottom");
        Intrinsics.checkNotNullParameter(rightTop, "rightTop");
        return new ViewPort(leftBottom, rightTop);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewPort)) {
            return false;
        }
        ViewPort viewPort = (ViewPort) other;
        return Intrinsics.d(this.leftBottom, viewPort.leftBottom) && Intrinsics.d(this.rightTop, viewPort.rightTop);
    }

    @NotNull
    public final PointOnMap getLeftBottom() {
        return this.leftBottom;
    }

    @NotNull
    public final PointOnMap getRightTop() {
        return this.rightTop;
    }

    public int hashCode() {
        return this.rightTop.hashCode() + (this.leftBottom.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ViewPort(leftBottom=" + this.leftBottom + ", rightTop=" + this.rightTop + ")";
    }
}
