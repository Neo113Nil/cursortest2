package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.Cluster;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import we0.k;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0094@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u0010\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/AbstractAlgorithm;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;", "<init>", "()V", "", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/Cluster;", "clusters", "", "minClusterItemsCount", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "convertClustersToClusterizingResult", "(Ljava/util/Set;I)Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "", "zoom", "getClusters", "(F)Ljava/util/Set;", "getZoomOutOfMinValueClusterizingResult", "(FLkotlin/coroutines/d;)Ljava/lang/Object;", "clusterItem", "", "onClusterItemProcessed", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;)V", "Lwe0/k;", "clusteringOptions", "(FLwe0/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AbstractAlgorithm<T extends ClusterItem> implements Algorithm<T> {
    /* JADX WARN: Multi-variable type inference failed */
    private final ClusterizingResult<T> convertClustersToClusterizingResult(Set<? extends Cluster<T>> clusters, int minClusterItemsCount) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = clusters.iterator();
        while (it.hasNext()) {
            Cluster cluster = (Cluster) it.next();
            if (cluster.getItems().size() < minClusterItemsCount) {
                Collection<T> items = cluster.getItems();
                Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
                for (T t2 : items) {
                    arrayList.add(t2);
                    Intrinsics.f(t2);
                    onClusterItemProcessed(t2);
                }
            } else {
                hashSet.add(cluster);
                Collection<T> items2 = cluster.getItems();
                Intrinsics.checkNotNullExpressionValue(items2, "getItems(...)");
                for (T t11 : items2) {
                    Intrinsics.f(t11);
                    onClusterItemProcessed(t11);
                }
            }
        }
        return new ClusterizingResult<>(hashSet, arrayList);
    }

    static /* synthetic */ <T extends ClusterItem> Object getClusters$suspendImpl(AbstractAlgorithm<T> abstractAlgorithm, float f7, k kVar, d<? super ClusterizingResult<T>> dVar) {
        return ((int) f7) > kVar.b() ? abstractAlgorithm.getZoomOutOfMinValueClusterizingResult(f7, dVar) : abstractAlgorithm.convertClustersToClusterizingResult(abstractAlgorithm.getClusters(f7), kVar.a());
    }

    static <T extends ClusterItem> Object getZoomOutOfMinValueClusterizingResult$suspendImpl(AbstractAlgorithm<T> abstractAlgorithm, float f7, d<? super ClusterizingResult<T>> dVar) {
        return new ClusterizingResult(M.f71699a, abstractAlgorithm.getItems());
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public Object getClusters(float f7, @NotNull k kVar, @NotNull d<? super ClusterizingResult<T>> dVar) {
        return getClusters$suspendImpl(this, f7, kVar, dVar);
    }

    @NotNull
    public abstract Set<Cluster<T>> getClusters(float zoom);

    protected Object getZoomOutOfMinValueClusterizingResult(float f7, @NotNull d<? super ClusterizingResult<T>> dVar) {
        return getZoomOutOfMinValueClusterizingResult$suspendImpl(this, f7, dVar);
    }

    protected void onClusterItemProcessed(@NotNull T clusterItem) {
        Intrinsics.checkNotNullParameter(clusterItem, "clusterItem");
    }
}
