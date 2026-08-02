package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCacheResult;
import we0.k;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH¤@¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\rH¤@¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\r2\u0006\u0010\u0011\u001a\u00020\u0010H¤@¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u000b\u0010\u0014J*\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u000e\u0010\u0015J2\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0012\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/AbstractClusterCacheResult;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/ClusterCacheResult;", "Lwe0/k;", "clusteringOptions", "<init>", "(Lwe0/k;)V", "", "zoomLevel", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "getClustersFromZoomLevel", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "", "getAllCachedClusters", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/ranges/IntRange;", "zoomRange", "getClustersFromZoomRange", "(Lkotlin/ranges/IntRange;Lkotlin/coroutines/d;)Ljava/lang/Object;", "(ILwe0/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "(Lwe0/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "(Lkotlin/ranges/IntRange;Lwe0/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lwe0/k;", "getClusteringOptions", "()Lwe0/k;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AbstractClusterCacheResult<T extends ClusterItem> implements ClusterCacheResult<T> {

    @NotNull
    private final k clusteringOptions;

    public AbstractClusterCacheResult(@NotNull k clusteringOptions) {
        Intrinsics.checkNotNullParameter(clusteringOptions, "clusteringOptions");
        this.clusteringOptions = clusteringOptions;
    }

    static /* synthetic */ <T extends ClusterItem> Object getAllCachedClusters$suspendImpl(AbstractClusterCacheResult<T> abstractClusterCacheResult, k kVar, d<? super Map<Integer, ClusterizingResult<T>>> dVar) {
        return !Intrinsics.d(((AbstractClusterCacheResult) abstractClusterCacheResult).clusteringOptions, kVar) ? U.c() : abstractClusterCacheResult.getAllCachedClusters(dVar);
    }

    static /* synthetic */ <T extends ClusterItem> Object getClustersFromZoomLevel$suspendImpl(AbstractClusterCacheResult<T> abstractClusterCacheResult, int i11, k kVar, d<? super ClusterizingResult<T>> dVar) {
        if (Intrinsics.d(((AbstractClusterCacheResult) abstractClusterCacheResult).clusteringOptions, kVar)) {
            return abstractClusterCacheResult.getClustersFromZoomLevel(i11, dVar);
        }
        return null;
    }

    static /* synthetic */ <T extends ClusterItem> Object getClustersFromZoomRange$suspendImpl(AbstractClusterCacheResult<T> abstractClusterCacheResult, IntRange intRange, k kVar, d<? super Map<Integer, ClusterizingResult<T>>> dVar) {
        return !Intrinsics.d(((AbstractClusterCacheResult) abstractClusterCacheResult).clusteringOptions, kVar) ? U.c() : abstractClusterCacheResult.getClustersFromZoomRange(intRange, dVar);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCacheResult
    public Object clearSuspend(@NotNull d<? super Unit> dVar) {
        return ClusterCacheResult.DefaultImpls.clearSuspend(this, dVar);
    }

    protected abstract Object getAllCachedClusters(@NotNull d<? super Map<Integer, ClusterizingResult<T>>> dVar);

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCacheResult
    public Object getAllCachedClusters(@NotNull k kVar, @NotNull d<? super Map<Integer, ClusterizingResult<T>>> dVar) {
        return getAllCachedClusters$suspendImpl(this, kVar, dVar);
    }

    @NotNull
    public final k getClusteringOptions() {
        return this.clusteringOptions;
    }

    protected abstract Object getClustersFromZoomLevel(int i11, @NotNull d<? super ClusterizingResult<T>> dVar);

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCacheResult
    public Object getClustersFromZoomLevel(int i11, @NotNull k kVar, @NotNull d<? super ClusterizingResult<T>> dVar) {
        return getClustersFromZoomLevel$suspendImpl(this, i11, kVar, dVar);
    }

    protected abstract Object getClustersFromZoomRange(@NotNull IntRange intRange, @NotNull d<? super Map<Integer, ClusterizingResult<T>>> dVar);

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCacheResult
    public Object getClustersFromZoomRange(@NotNull IntRange intRange, @NotNull k kVar, @NotNull d<? super Map<Integer, ClusterizingResult<T>>> dVar) {
        return getClustersFromZoomRange$suspendImpl(this, intRange, kVar, dVar);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCacheResult
    public Object isCacheExistSuspend(@NotNull d<? super Boolean> dVar) {
        return ClusterCacheResult.DefaultImpls.isCacheExistSuspend(this, dVar);
    }
}
