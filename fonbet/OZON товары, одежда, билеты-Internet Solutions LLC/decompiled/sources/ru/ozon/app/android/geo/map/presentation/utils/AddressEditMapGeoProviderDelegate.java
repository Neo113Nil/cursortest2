package ru.ozon.app.android.geo.map.presentation.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.data.AddressEditMapDTO;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/utils/AddressEditMapGeoProviderDelegate;", "", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;", "type", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "getGeoProviderConfig", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;)Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "getCurrentGeoProviderConfig", "()Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "setCurrentGeoProviderConfig", "(Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;)V", "currentGeoProviderConfig", "", "getContextLocationUid", "()Ljava/lang/String;", "setContextLocationUid", "(Ljava/lang/String;)V", "contextLocationUid", "getSessionId", "setSessionId", "sessionId", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AddressEditMapGeoProviderDelegate {
    String getContextLocationUid();

    GeoProviderConfig getCurrentGeoProviderConfig();

    GeoProviderConfig getGeoProviderConfig(@NotNull AddressEditMapDTO.Selector.Type type);

    @NotNull
    String getSessionId();

    void setContextLocationUid(String str);
}
