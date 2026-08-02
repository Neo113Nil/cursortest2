package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.domain;

import Ae.InterfaceC2395h;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingWebSocket;", "", "", "connectionUrl", "LAe/h;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingSocketEvent;", "eventFlow", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "latitude", "longitude", "", "initCourierLocation", "(DD)V", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface GeotrackingWebSocket {
    Object eventFlow(@NotNull String str, @NotNull d<? super InterfaceC2395h<? extends GeotrackingSocketEvent>> dVar);

    void initCourierLocation(double latitude, double longitude);
}
