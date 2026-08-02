package com.yandex.mapkit.offline_cache;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.Error;
import java.util.List;

/* loaded from: classes9.dex */
public interface OfflineCacheManager {

    public interface ClearListener {
        void onClearCompleted();
    }

    public interface ErrorListener {
        void onError(@NonNull Error error);

        void onRegionError(@NonNull Error error, int i11);
    }

    public interface PathGetterListener {
        void onPathReceived(@NonNull String str);
    }

    public interface PathSetterListener {
        void onPathSet();

        void onPathSetError(@NonNull Error error);
    }

    public interface SizeListener {
        void onSizeComputed(Long l11);
    }

    void addErrorListener(@NonNull ErrorListener errorListener);

    void addRegionListUpdatesListener(@NonNull RegionListUpdatesListener regionListUpdatesListener);

    void addRegionListener(@NonNull RegionListener regionListener);

    void allowUseCellularNetwork(boolean z11);

    void clear(@NonNull ClearListener clearListener);

    void computeCacheSize(@NonNull SizeListener sizeListener);

    void drop(int i11);

    void enableAutoUpdate(boolean z11);

    @NonNull
    List<String> getCities(int i11);

    Long getDownloadedReleaseTime(int i11);

    float getProgress(int i11);

    @NonNull
    RegionState getState(int i11);

    boolean isLegacyPath(int i11);

    boolean isValid();

    boolean mayBeOutOfAvailableSpace(int i11);

    void moveData(@NonNull String str, @NonNull DataMoveListener dataMoveListener);

    void pauseDownload(int i11);

    @NonNull
    List<Region> regions();

    void removeErrorListener(@NonNull ErrorListener errorListener);

    void removeRegionListUpdatesListener(@NonNull RegionListUpdatesListener regionListUpdatesListener);

    void removeRegionListener(@NonNull RegionListener regionListener);

    void requestPath(@NonNull PathGetterListener pathGetterListener);

    void requestRegionsAtPoint(@NonNull Point point, @NonNull RegionsAtPointListener regionsAtPointListener);

    void setCachePath(@NonNull String str, @NonNull PathSetterListener pathSetterListener);

    void startDownload(int i11);

    void stopDownload(int i11);
}
