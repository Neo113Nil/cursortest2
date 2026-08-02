package ru.ozon.mapsdk.common.geoproxy.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/GeometryResponse;", "", "point", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeometryResponse$PointResponse;", "viewPort", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeometryResponse$ViewPortResponse;", "<init>", "(Lru/ozon/mapsdk/common/geoproxy/data/model/GeometryResponse$PointResponse;Lru/ozon/mapsdk/common/geoproxy/data/model/GeometryResponse$ViewPortResponse;)V", "getPoint", "()Lru/ozon/mapsdk/common/geoproxy/data/model/GeometryResponse$PointResponse;", "getViewPort", "()Lru/ozon/mapsdk/common/geoproxy/data/model/GeometryResponse$ViewPortResponse;", "PointResponse", "ViewPortResponse", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GeometryResponse {

    @NotNull
    private final PointResponse point;

    @NotNull
    private final ViewPortResponse viewPort;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/GeometryResponse$PointResponse;", "", "lat", "", "lon", "<init>", "(DD)V", "getLat", "()D", "getLon", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PointResponse {
        private final double lat;
        private final double lon;

        public PointResponse(double d11, double d12) {
            this.lat = d11;
            this.lon = d12;
        }

        public final double getLat() {
            return this.lat;
        }

        public final double getLon() {
            return this.lon;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/GeometryResponse$ViewPortResponse;", "", "leftLowerCorner", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeometryResponse$PointResponse;", "rightUpperCorner", "<init>", "(Lru/ozon/mapsdk/common/geoproxy/data/model/GeometryResponse$PointResponse;Lru/ozon/mapsdk/common/geoproxy/data/model/GeometryResponse$PointResponse;)V", "getLeftLowerCorner", "()Lru/ozon/mapsdk/common/geoproxy/data/model/GeometryResponse$PointResponse;", "getRightUpperCorner", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewPortResponse {

        @NotNull
        private final PointResponse leftLowerCorner;

        @NotNull
        private final PointResponse rightUpperCorner;

        public ViewPortResponse(@NotNull PointResponse leftLowerCorner, @NotNull PointResponse rightUpperCorner) {
            Intrinsics.checkNotNullParameter(leftLowerCorner, "leftLowerCorner");
            Intrinsics.checkNotNullParameter(rightUpperCorner, "rightUpperCorner");
            this.leftLowerCorner = leftLowerCorner;
            this.rightUpperCorner = rightUpperCorner;
        }

        @NotNull
        public final PointResponse getLeftLowerCorner() {
            return this.leftLowerCorner;
        }

        @NotNull
        public final PointResponse getRightUpperCorner() {
            return this.rightUpperCorner;
        }
    }

    public GeometryResponse(@NotNull PointResponse point, @NotNull ViewPortResponse viewPort) {
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(viewPort, "viewPort");
        this.point = point;
        this.viewPort = viewPort;
    }

    @NotNull
    public final PointResponse getPoint() {
        return this.point;
    }

    @NotNull
    public final ViewPortResponse getViewPort() {
        return this.viewPort;
    }
}
