package com.yandex.mapkit.offline_cache.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.offline_cache.DataMoveListener;
import com.yandex.mapkit.offline_cache.OfflineCacheManager;
import com.yandex.mapkit.offline_cache.Region;
import com.yandex.mapkit.offline_cache.RegionListUpdatesListener;
import com.yandex.mapkit.offline_cache.RegionListener;
import com.yandex.mapkit.offline_cache.RegionState;
import com.yandex.mapkit.offline_cache.RegionsAtPointListener;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import java.util.List;

/* loaded from: classes9.dex */
public class OfflineCacheManagerBinding implements OfflineCacheManager {
    private final NativeObject nativeObject;
    protected Subscription<DataMoveListener> dataMoveListenerSubscription = new Subscription<DataMoveListener>() { // from class: com.yandex.mapkit.offline_cache.internal.OfflineCacheManagerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(DataMoveListener dataMoveListener) {
            return OfflineCacheManagerBinding.createDataMoveListener(dataMoveListener);
        }
    };
    protected Subscription<OfflineCacheManager.ErrorListener> errorListenerSubscription = new Subscription<OfflineCacheManager.ErrorListener>() { // from class: com.yandex.mapkit.offline_cache.internal.OfflineCacheManagerBinding.2
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(OfflineCacheManager.ErrorListener errorListener) {
            return OfflineCacheManagerBinding.createErrorListener(errorListener);
        }
    };
    protected Subscription<RegionListUpdatesListener> regionListUpdatesListenerSubscription = new Subscription<RegionListUpdatesListener>() { // from class: com.yandex.mapkit.offline_cache.internal.OfflineCacheManagerBinding.3
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(RegionListUpdatesListener regionListUpdatesListener) {
            return OfflineCacheManagerBinding.createRegionListUpdatesListener(regionListUpdatesListener);
        }
    };
    protected Subscription<RegionListener> regionListenerSubscription = new Subscription<RegionListener>() { // from class: com.yandex.mapkit.offline_cache.internal.OfflineCacheManagerBinding.4
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(RegionListener regionListener) {
            return OfflineCacheManagerBinding.createRegionListener(regionListener);
        }
    };

    protected OfflineCacheManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createDataMoveListener(DataMoveListener dataMoveListener);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createErrorListener(OfflineCacheManager.ErrorListener errorListener);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createRegionListUpdatesListener(RegionListUpdatesListener regionListUpdatesListener);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createRegionListener(RegionListener regionListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void addErrorListener(@NonNull OfflineCacheManager.ErrorListener errorListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void addRegionListUpdatesListener(@NonNull RegionListUpdatesListener regionListUpdatesListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void addRegionListener(@NonNull RegionListener regionListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void allowUseCellularNetwork(boolean z11);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void clear(@NonNull OfflineCacheManager.ClearListener clearListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void computeCacheSize(@NonNull OfflineCacheManager.SizeListener sizeListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void drop(int i11);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void enableAutoUpdate(boolean z11);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    @NonNull
    public native List<String> getCities(int i11);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native Long getDownloadedReleaseTime(int i11);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native float getProgress(int i11);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    @NonNull
    public native RegionState getState(int i11);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native boolean isLegacyPath(int i11);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native boolean isValid();

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native boolean mayBeOutOfAvailableSpace(int i11);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void moveData(@NonNull String str, @NonNull DataMoveListener dataMoveListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void pauseDownload(int i11);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    @NonNull
    public native List<Region> regions();

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void removeErrorListener(@NonNull OfflineCacheManager.ErrorListener errorListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void removeRegionListUpdatesListener(@NonNull RegionListUpdatesListener regionListUpdatesListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void removeRegionListener(@NonNull RegionListener regionListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void requestPath(@NonNull OfflineCacheManager.PathGetterListener pathGetterListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void requestRegionsAtPoint(@NonNull Point point, @NonNull RegionsAtPointListener regionsAtPointListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void setCachePath(@NonNull String str, @NonNull OfflineCacheManager.PathSetterListener pathSetterListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void startDownload(int i11);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void stopDownload(int i11);
}
