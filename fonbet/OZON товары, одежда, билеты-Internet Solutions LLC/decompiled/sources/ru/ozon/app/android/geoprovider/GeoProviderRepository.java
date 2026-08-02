package ru.ozon.app.android.geoprovider;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.model.ActualBXTab;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lru/ozon/app/android/geoprovider/GeoProviderRepository;", "", "fetchGeoProvider", "", "locationUid", "", "fetchGeoProviderWithResult", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "getGeoProviderConfig", "actualBXTab", "Lru/ozon/mapsdk/common/geoproxy/model/ActualBXTab;", "allProvidersLoaded", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface GeoProviderRepository {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ GeoProviderConfig getGeoProviderConfig$default(GeoProviderRepository geoProviderRepository, ActualBXTab actualBXTab, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGeoProviderConfig");
            }
            if ((i11 & 1) != 0) {
                actualBXTab = ActualBXTab.NONE;
            }
            return geoProviderRepository.getGeoProviderConfig(actualBXTab);
        }
    }

    boolean allProvidersLoaded();

    void fetchGeoProvider(String locationUid);

    @NotNull
    GeoProviderConfig fetchGeoProviderWithResult(String locationUid);

    GeoProviderConfig getGeoProviderConfig(@NotNull ActualBXTab actualBXTab);
}
