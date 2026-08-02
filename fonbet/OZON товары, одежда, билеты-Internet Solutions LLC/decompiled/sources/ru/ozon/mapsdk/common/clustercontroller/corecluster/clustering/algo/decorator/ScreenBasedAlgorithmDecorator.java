package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.ScreenBasedAlgorithm;
import we0.C10551g;
import we0.k;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0017\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096A¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010\"\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0018\u0010%\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u001e\u0010'\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0096\u0001¢\u0006\u0004\b'\u0010#J\u0018\u0010(\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b(\u0010\u001fJ\u0018\u0010)\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b)\u0010&J\u0010\u0010*\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b*\u0010+J&\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096A¢\u0006\u0004\b,\u0010\u0017R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R\u001c\u00106\u001a\u00020\f8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/decorator/ScreenBasedAlgorithmDecorator;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/ScreenBasedAlgorithm;", "algorithm", "<init>", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/ScreenBasedAlgorithm;)V", "Lwe0/g;", "cameraPosition", "", "onCameraChange", "(Lwe0/g;)V", "", "width", "height", "updateViewSize", "(II)V", "", "zoom", "Lwe0/k;", "clusteringOptions", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "getClustersForSameZoomLevel", "(FLwe0/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "id", "getItemById", "(Ljava/lang/String;)Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "item", "", "addItem", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;)Z", "", "items", "addItems", "(Ljava/util/Collection;)Z", "removeItem", "removeItemById", "(Ljava/lang/String;)Z", "removeItems", "updateItem", "isItemExist", "clearItems", "()V", "getClusters", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/ScreenBasedAlgorithm;", "getAlgorithm", "()Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/ScreenBasedAlgorithm;", "getItems", "()Ljava/util/Collection;", "getMaxDistanceBetweenClusteredItems", "()I", "setMaxDistanceBetweenClusteredItems", "(I)V", "maxDistanceBetweenClusteredItems", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ScreenBasedAlgorithmDecorator<T extends ClusterItem> implements ScreenBasedAlgorithm<T> {

    @NotNull
    private final ScreenBasedAlgorithm<T> algorithm;

    public ScreenBasedAlgorithmDecorator(@NotNull ScreenBasedAlgorithm<T> algorithm) {
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
    protected final ScreenBasedAlgorithm<T> getAlgorithm() {
        return this.algorithm;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public Object getClusters(float f7, @NotNull k kVar, @NotNull d<? super ClusterizingResult<T>> dVar) {
        return this.algorithm.getClusters(f7, kVar, dVar);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.ScreenBasedAlgorithm
    public Object getClustersForSameZoomLevel(float f7, @NotNull k kVar, @NotNull d<? super ClusterizingResult<T>> dVar) {
        return this.algorithm.getClustersForSameZoomLevel(f7, kVar, dVar);
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

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.ScreenBasedAlgorithm
    public void onCameraChange(@NotNull C10551g cameraPosition) {
        Intrinsics.checkNotNullParameter(cameraPosition, "cameraPosition");
        this.algorithm.onCameraChange(cameraPosition);
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

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.ScreenBasedAlgorithm
    public void updateViewSize(int width, int height) {
        this.algorithm.updateViewSize(width, height);
    }
}
