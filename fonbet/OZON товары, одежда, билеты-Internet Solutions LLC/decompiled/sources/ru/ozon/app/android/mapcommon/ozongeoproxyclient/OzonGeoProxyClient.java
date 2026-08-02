package ru.ozon.app.android.mapcommon.ozongeoproxyclient;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.model.ApiHost;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\r\u001a\u0004\u0018\u00010\fH&J\b\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "", "setConfig", "", "appName", "", "host", "Lru/ozon/mapsdk/common/geoproxy/model/ApiHost;", "locationUid", "setAppName", "fetchGeoProvider", "fetchGeoProviderWithResult", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "getGeoProviderConfig", "isGeoProviderHold", "", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OzonGeoProxyClient {
    void fetchGeoProvider(String locationUid);

    @NotNull
    GeoProviderConfig fetchGeoProviderWithResult(String locationUid);

    GeoProviderConfig getGeoProviderConfig();

    boolean isGeoProviderHold();

    void setAppName(@NotNull String appName, String locationUid);

    void setConfig(@NotNull String appName, @NotNull ApiHost host, String locationUid);
}
