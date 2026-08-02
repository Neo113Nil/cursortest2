package ru.ozon.app.android.geo.mapupdater;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/geo/mapupdater/MapUpdateEvent;", "LA00/a$J$a;", "", "link", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "viewPort", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "getViewPort", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MapUpdateEvent implements a.J.InterfaceC0007a {

    @NotNull
    private final String link;

    @NotNull
    private final AddressEditMapVO.ViewPort viewPort;

    public MapUpdateEvent(@NotNull String link, @NotNull AddressEditMapVO.ViewPort viewPort) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(viewPort, "viewPort");
        this.link = link;
        this.viewPort = viewPort;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapUpdateEvent)) {
            return false;
        }
        MapUpdateEvent mapUpdateEvent = (MapUpdateEvent) other;
        return Intrinsics.d(this.link, mapUpdateEvent.link) && Intrinsics.d(this.viewPort, mapUpdateEvent.viewPort);
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final AddressEditMapVO.ViewPort getViewPort() {
        return this.viewPort;
    }

    public int hashCode() {
        return this.viewPort.hashCode() + (this.link.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "MapUpdateEvent(link=" + this.link + ", viewPort=" + this.viewPort + ")";
    }
}
