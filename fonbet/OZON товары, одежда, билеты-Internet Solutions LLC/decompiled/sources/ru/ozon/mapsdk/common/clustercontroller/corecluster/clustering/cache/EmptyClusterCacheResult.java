package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import we0.k;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0094@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u000bH\u0094@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0094@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/EmptyClusterCacheResult;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/AbstractClusterCacheResult;", "<init>", "()V", "", "zoomLevel", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "getClustersFromZoomLevel", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "", "getAllCachedClusters", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/ranges/IntRange;", "zoomRange", "getClustersFromZoomRange", "(Lkotlin/ranges/IntRange;Lkotlin/coroutines/d;)Ljava/lang/Object;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptyClusterCacheResult<T extends ClusterItem> extends AbstractClusterCacheResult<T> {
    public EmptyClusterCacheResult() {
        super(new k(0, 0));
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult
    protected Object getAllCachedClusters(@NotNull d<? super Map<Integer, ClusterizingResult<T>>> dVar) {
        return U.c();
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult
    protected Object getClustersFromZoomLevel(int i11, @NotNull d<? super ClusterizingResult<T>> dVar) {
        return null;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult
    protected Object getClustersFromZoomRange(@NotNull IntRange intRange, @NotNull d<? super Map<Integer, ClusterizingResult<T>>> dVar) {
        return U.c();
    }
}
