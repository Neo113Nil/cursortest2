package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B)\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0014R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "", "calculatedClusters", "", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/Cluster;", "calculatedClusterItems", "", "<init>", "(Ljava/util/Set;Ljava/util/Collection;)V", "getCalculatedClusters", "()Ljava/util/Set;", "getCalculatedClusterItems", "()Ljava/util/Collection;", "plus", "other", "isEmpty", "", "trySwitchClustersToSimpleCollection", "", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClusterizingResult<T extends ClusterItem> {

    @NotNull
    private final Collection<T> calculatedClusterItems;

    @NotNull
    private final Set<Cluster<T>> calculatedClusters;

    /* JADX WARN: Multi-variable type inference failed */
    public ClusterizingResult(@NotNull Set<? extends Cluster<T>> calculatedClusters, @NotNull Collection<? extends T> calculatedClusterItems) {
        Intrinsics.checkNotNullParameter(calculatedClusters, "calculatedClusters");
        Intrinsics.checkNotNullParameter(calculatedClusterItems, "calculatedClusterItems");
        this.calculatedClusters = calculatedClusters;
        this.calculatedClusterItems = calculatedClusterItems;
    }

    @NotNull
    public final Collection<T> getCalculatedClusterItems() {
        return this.calculatedClusterItems;
    }

    @NotNull
    public final Set<Cluster<T>> getCalculatedClusters() {
        return this.calculatedClusters;
    }

    public final boolean isEmpty() {
        return this.calculatedClusters.isEmpty() && this.calculatedClusterItems.isEmpty();
    }

    @NotNull
    public final ClusterizingResult<T> plus(@NotNull ClusterizingResult<T> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new ClusterizingResult<>(e0.f(this.calculatedClusters, other.calculatedClusters), C7714v.p0(other.calculatedClusterItems, this.calculatedClusterItems));
    }

    public final void trySwitchClustersToSimpleCollection() {
        Iterator<T> it = this.calculatedClusters.iterator();
        while (it.hasNext()) {
            Cluster cluster = (Cluster) it.next();
            if (cluster instanceof StaticCluster) {
                ((StaticCluster) cluster).switchToSimpleCollection();
            }
        }
    }
}
