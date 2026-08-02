package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.runtime;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult;
import we0.k;
import we0.u;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0006H\u0094@¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u000eH\u0094@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0094@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0018\u0010\u0010R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/runtime/RuntimeClusterCacheResult;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/AbstractClusterCacheResult;", "Lwe0/u;", "Lwe0/k;", "clusteringOptions", "", "", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "cacheMap", "<init>", "(Lwe0/k;Ljava/util/Map;)V", "zoomLevel", "getClustersFromZoomLevel", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "", "getAllCachedClusters", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/ranges/IntRange;", "zoomRange", "getClustersFromZoomRange", "(Lkotlin/ranges/IntRange;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "isCacheExistSuspend", "", "clearSuspend", "Ljava/util/Map;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RuntimeClusterCacheResult extends AbstractClusterCacheResult<u> {

    @NotNull
    private final Map<Integer, ClusterizingResult<u>> cacheMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RuntimeClusterCacheResult(@NotNull k clusteringOptions, @NotNull Map<Integer, ClusterizingResult<u>> cacheMap) {
        super(clusteringOptions);
        Intrinsics.checkNotNullParameter(clusteringOptions, "clusteringOptions");
        Intrinsics.checkNotNullParameter(cacheMap, "cacheMap");
        this.cacheMap = cacheMap;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult, ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCacheResult
    public Object clearSuspend(@NotNull d<? super Unit> dVar) {
        this.cacheMap.clear();
        return Unit.f71690a;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult
    protected Object getAllCachedClusters(@NotNull d<? super Map<Integer, ClusterizingResult<u>>> dVar) {
        return this.cacheMap;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult
    protected Object getClustersFromZoomLevel(int i11, @NotNull d<? super ClusterizingResult<u>> dVar) {
        return this.cacheMap.get(new Integer(i11));
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult
    protected Object getClustersFromZoomRange(@NotNull IntRange intRange, @NotNull d<? super Map<Integer, ClusterizingResult<u>>> dVar) {
        Map<Integer, ClusterizingResult<u>> map = this.cacheMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, ClusterizingResult<u>> entry : map.entrySet()) {
            if (intRange.n(entry.getKey().intValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult, ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCacheResult
    public Object isCacheExistSuspend(@NotNull d<? super Boolean> dVar) {
        return Boolean.valueOf(!this.cacheMap.isEmpty());
    }
}
