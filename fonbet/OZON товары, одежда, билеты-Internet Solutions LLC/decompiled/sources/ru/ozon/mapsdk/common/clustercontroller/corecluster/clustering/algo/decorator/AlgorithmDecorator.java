package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import we0.k;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0016\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096A¢\u0006\u0004\b!\u0010\"R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001c\u0010-\u001a\u00020(8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/decorator/AlgorithmDecorator;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;", "algorithm", "<init>", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;)V", "", "id", "getItemById", "(Ljava/lang/String;)Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "item", "", "addItem", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;)Z", "", "items", "addItems", "(Ljava/util/Collection;)Z", "removeItem", "removeItemById", "(Ljava/lang/String;)Z", "removeItems", "updateItem", "isItemExist", "", "clearItems", "()V", "", "zoom", "Lwe0/k;", "clusteringOptions", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "getClusters", "(FLwe0/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;", "getAlgorithm", "()Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;", "getItems", "()Ljava/util/Collection;", "", "getMaxDistanceBetweenClusteredItems", "()I", "setMaxDistanceBetweenClusteredItems", "(I)V", "maxDistanceBetweenClusteredItems", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AlgorithmDecorator<T extends ClusterItem> implements Algorithm<T> {

    @NotNull
    private final Algorithm<T> algorithm;

    public AlgorithmDecorator(@NotNull Algorithm<T> algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        this.algorithm = algorithm;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean addItem(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return this.algorithm.addItem(item);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean addItems(@NotNull Collection<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return this.algorithm.addItems(items);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public void clearItems() {
        this.algorithm.clearItems();
    }

    @NotNull
    protected final Algorithm<T> getAlgorithm() {
        return this.algorithm;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public Object getClusters(float f7, @NotNull k kVar, @NotNull d<? super ClusterizingResult<T>> dVar) {
        return this.algorithm.getClusters(f7, kVar, dVar);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public T getItemById(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.algorithm.getItemById(id2);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    @NotNull
    public Collection<T> getItems() {
        return this.algorithm.getItems();
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.algorithm.getMaxDistanceBetweenClusteredItems();
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean isItemExist(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.algorithm.isItemExist(id2);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean removeItem(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return this.algorithm.removeItem(item);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean removeItemById(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.algorithm.removeItemById(id2);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean removeItems(@NotNull Collection<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return this.algorithm.removeItems(items);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i11) {
        this.algorithm.setMaxDistanceBetweenClusteredItems(i11);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean updateItem(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return this.algorithm.updateItem(item);
    }
}
