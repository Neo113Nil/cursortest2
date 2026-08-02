package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator;

import Ae.M0;
import kotlin.Metadata;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCacheResult;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003R*\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0018\u00010\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/decorator/ClusterCacheDecorator;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "", "LAe/M0;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/ClusterCacheResult;", "getClusterCacheResult", "()LAe/M0;", "setClusterCacheResult", "(LAe/M0;)V", "clusterCacheResult", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ClusterCacheDecorator<T extends ClusterItem> {
    M0<ClusterCacheResult<T>> getClusterCacheResult();

    void setClusterCacheResult(M0<? extends ClusterCacheResult<T>> m02);
}
