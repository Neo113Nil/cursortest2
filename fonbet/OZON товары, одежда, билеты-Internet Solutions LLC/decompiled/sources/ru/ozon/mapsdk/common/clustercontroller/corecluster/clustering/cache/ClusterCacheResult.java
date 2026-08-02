package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import we0.k;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J(\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\nJ*\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\f\u0010\rJ2\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/ClusterCacheResult;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "", "", "zoomLevel", "Lwe0/k;", "clusteringOptions", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "getClustersFromZoomLevel", "(ILwe0/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "getAllCachedClusters", "(Lwe0/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/ranges/IntRange;", "zoomRange", "getClustersFromZoomRange", "(Lkotlin/ranges/IntRange;Lwe0/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "isCacheExistSuspend", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "clearSuspend", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ClusterCacheResult<T extends ClusterItem> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <T extends ClusterItem> Object clearSuspend(@NotNull ClusterCacheResult<T> clusterCacheResult, @NotNull d<? super Unit> dVar) {
            return Unit.f71690a;
        }

        public static <T extends ClusterItem> Object isCacheExistSuspend(@NotNull ClusterCacheResult<T> clusterCacheResult, @NotNull d<? super Boolean> dVar) {
            return Boolean.FALSE;
        }
    }

    Object clearSuspend(@NotNull d<? super Unit> dVar);

    Object getAllCachedClusters(@NotNull k kVar, @NotNull d<? super Map<Integer, ClusterizingResult<T>>> dVar);

    Object getClustersFromZoomLevel(int i11, @NotNull k kVar, @NotNull d<? super ClusterizingResult<T>> dVar);

    Object getClustersFromZoomRange(@NotNull IntRange intRange, @NotNull k kVar, @NotNull d<? super Map<Integer, ClusterizingResult<T>>> dVar);

    Object isCacheExistSuspend(@NotNull d<? super Boolean> dVar);
}
