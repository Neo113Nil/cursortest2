package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.Cluster;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.NonHierarchicalDistanceBasedAlgorithm;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.geometry.Bounds;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.geometry.Point;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.quadtree.PointQuadTree;
import we0.C10551g;
import we0.k;
import we0.m;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00192\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b \u0010\u001fJ\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\b\u001a\u00020\u0007H\u0094@¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00028\u0000H\u0014¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010+\u001a\u00028\u0000H\u0014¢\u0006\u0004\b,\u0010*J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010+\u001a\u00028\u0000H\u0014¢\u0006\u0004\b-\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u001e\u00104\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/NonHierarchicalViewBasedAlgorithm;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/NonHierarchicalDistanceBasedAlgorithm;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/ScreenBasedAlgorithm;", "<init>", "()V", "", "zoom", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Bounds;", "getVisibleBounds", "(F)Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Bounds;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "", "isProcessed", "", "updateClustersProcessState", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;Z)V", "Lwe0/g;", "cameraPosition", "onCameraChange", "(Lwe0/g;)V", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/quadtree/PointQuadTree;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/NonHierarchicalDistanceBasedAlgorithm$QuadItem;", "quadTree", "", "getClusteringItems", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/quadtree/PointQuadTree;F)Ljava/util/Collection;", "Lwe0/k;", "clusteringOptions", "getClusters", "(FLwe0/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getClustersForSameZoomLevel", "getZoomOutOfMinValueClusterizingResult", "(FLkotlin/coroutines/d;)Ljava/lang/Object;", "", "width", "height", "updateViewSize", "(II)V", "clusterItem", "onClusterItemProcessed", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;)V", "item", "onAddItem", "onDeleteItem", "Lwe0/m;", "mapCenter", "Lwe0/m;", "viewWidth", "I", "viewHeight", "currentClusterizingResult", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NonHierarchicalViewBasedAlgorithm<T extends ClusterItem> extends NonHierarchicalDistanceBasedAlgorithm<T> implements ScreenBasedAlgorithm<T> {
    private ClusterizingResult<T> currentClusterizingResult;
    private m mapCenter;
    private int viewHeight;
    private int viewWidth;

    public NonHierarchicalViewBasedAlgorithm() {
        super(true);
    }

    private final Bounds getVisibleBounds(float zoom) {
        if (this.mapCenter == null || this.viewWidth <= 0 || this.viewHeight <= 0) {
            return new Bounds(0.0d, 0.0d, 0.0d, 0.0d);
        }
        Point point = NonHierarchicalDistanceBasedAlgorithm.INSTANCE.getPROJECTION().toPoint(this.mapCenter);
        Intrinsics.checkNotNullExpressionValue(point, "toPoint(...)");
        double d11 = 1.0d / (1 << ((int) zoom));
        double d12 = 256;
        double d13 = 2;
        double d14 = ((this.viewWidth * d11) / d12) / d13;
        double d15 = ((this.viewHeight * d11) / d12) / d13;
        double d16 = point.f97555x;
        double d17 = point.f97556y;
        return new Bounds(d16 - d14, d16 + d14, d17 - d15, d17 + d15);
    }

    private final void updateClustersProcessState(ClusterizingResult<T> clusterizingResult, boolean z11) {
        Iterator<T> it = clusterizingResult.getCalculatedClusters().iterator();
        while (it.hasNext()) {
            Collection<T> items = ((Cluster) it.next()).getItems();
            Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
            Iterator<T> it2 = items.iterator();
            while (it2.hasNext()) {
                ((ClusterItem) it2.next()).updateProcessedState(z11);
            }
        }
        Iterator<T> it3 = clusterizingResult.getCalculatedClusterItems().iterator();
        while (it3.hasNext()) {
            ((ClusterItem) it3.next()).updateProcessedState(z11);
        }
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.NonHierarchicalDistanceBasedAlgorithm
    @NotNull
    protected Collection<NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> getClusteringItems(@NotNull PointQuadTree<NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> quadTree, float zoom) {
        Bounds bounds;
        Collection<NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> searchItems;
        Intrinsics.checkNotNullParameter(quadTree, "quadTree");
        Bounds visibleBounds = getVisibleBounds(zoom);
        LinkedHashSet linkedHashSet = new LinkedHashSet(getItems().size());
        double d11 = visibleBounds.minX;
        if (d11 < 0.0d || visibleBounds.maxX > 1.0d) {
            if (d11 < 0.0d) {
                linkedHashSet.addAll(quadTree.searchItems(new Bounds(d11 + 1, 1.0d, visibleBounds.minY, visibleBounds.maxY)));
                bounds = new Bounds(0.0d, visibleBounds.maxX, visibleBounds.minY, visibleBounds.maxY);
            } else {
                linkedHashSet.addAll(quadTree.searchItems(new Bounds(d11, 1.0d, visibleBounds.minY, visibleBounds.maxY)));
                bounds = new Bounds(0.0d, visibleBounds.maxX - 1, visibleBounds.minY, visibleBounds.maxY);
            }
            searchItems = quadTree.searchItems(bounds);
        } else {
            searchItems = quadTree.searchItems(visibleBounds);
        }
        linkedHashSet.addAll(searchItems);
        return linkedHashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.AbstractAlgorithm, ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getClusters(float f7, @NotNull k kVar, @NotNull d<? super ClusterizingResult<T>> dVar) {
        NonHierarchicalViewBasedAlgorithm$getClusters$1 nonHierarchicalViewBasedAlgorithm$getClusters$1;
        int i11;
        NonHierarchicalViewBasedAlgorithm<T> nonHierarchicalViewBasedAlgorithm;
        if (dVar instanceof NonHierarchicalViewBasedAlgorithm$getClusters$1) {
            nonHierarchicalViewBasedAlgorithm$getClusters$1 = (NonHierarchicalViewBasedAlgorithm$getClusters$1) dVar;
            int i12 = nonHierarchicalViewBasedAlgorithm$getClusters$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                nonHierarchicalViewBasedAlgorithm$getClusters$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = nonHierarchicalViewBasedAlgorithm$getClusters$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = nonHierarchicalViewBasedAlgorithm$getClusters$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    ClusterizingResult<T> clusterizingResult = this.currentClusterizingResult;
                    if (clusterizingResult != null) {
                        updateClustersProcessState(clusterizingResult, false);
                    }
                    nonHierarchicalViewBasedAlgorithm$getClusters$1.L$0 = this;
                    nonHierarchicalViewBasedAlgorithm$getClusters$1.label = 1;
                    obj = super.getClusters(f7, kVar, nonHierarchicalViewBasedAlgorithm$getClusters$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    nonHierarchicalViewBasedAlgorithm = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nonHierarchicalViewBasedAlgorithm = (NonHierarchicalViewBasedAlgorithm) nonHierarchicalViewBasedAlgorithm$getClusters$1.L$0;
                    s.b(obj);
                }
                ClusterizingResult<T> clusterizingResult2 = (ClusterizingResult) obj;
                nonHierarchicalViewBasedAlgorithm.currentClusterizingResult = clusterizingResult2;
                return clusterizingResult2;
            }
        }
        nonHierarchicalViewBasedAlgorithm$getClusters$1 = new NonHierarchicalViewBasedAlgorithm$getClusters$1(this, dVar);
        Object obj2 = nonHierarchicalViewBasedAlgorithm$getClusters$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = nonHierarchicalViewBasedAlgorithm$getClusters$1.label;
        if (i11 != 0) {
        }
        ClusterizingResult<T> clusterizingResult22 = (ClusterizingResult) obj2;
        nonHierarchicalViewBasedAlgorithm.currentClusterizingResult = clusterizingResult22;
        return clusterizingResult22;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.ScreenBasedAlgorithm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getClustersForSameZoomLevel(float f7, @NotNull k kVar, @NotNull d<? super ClusterizingResult<T>> dVar) {
        NonHierarchicalViewBasedAlgorithm$getClustersForSameZoomLevel$1 nonHierarchicalViewBasedAlgorithm$getClustersForSameZoomLevel$1;
        int i11;
        NonHierarchicalViewBasedAlgorithm<T> nonHierarchicalViewBasedAlgorithm;
        ClusterizingResult<T> clusterizingResult;
        ClusterizingResult<T> clusterizingResult2;
        if (dVar instanceof NonHierarchicalViewBasedAlgorithm$getClustersForSameZoomLevel$1) {
            nonHierarchicalViewBasedAlgorithm$getClustersForSameZoomLevel$1 = (NonHierarchicalViewBasedAlgorithm$getClustersForSameZoomLevel$1) dVar;
            int i12 = nonHierarchicalViewBasedAlgorithm$getClustersForSameZoomLevel$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                nonHierarchicalViewBasedAlgorithm$getClustersForSameZoomLevel$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = nonHierarchicalViewBasedAlgorithm$getClustersForSameZoomLevel$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = nonHierarchicalViewBasedAlgorithm$getClustersForSameZoomLevel$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    nonHierarchicalViewBasedAlgorithm$getClustersForSameZoomLevel$1.L$0 = this;
                    nonHierarchicalViewBasedAlgorithm$getClustersForSameZoomLevel$1.label = 1;
                    obj = super.getClusters(f7, kVar, nonHierarchicalViewBasedAlgorithm$getClustersForSameZoomLevel$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    nonHierarchicalViewBasedAlgorithm = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nonHierarchicalViewBasedAlgorithm = (NonHierarchicalViewBasedAlgorithm) nonHierarchicalViewBasedAlgorithm$getClustersForSameZoomLevel$1.L$0;
                    s.b(obj);
                }
                clusterizingResult = (ClusterizingResult) obj;
                clusterizingResult2 = nonHierarchicalViewBasedAlgorithm.currentClusterizingResult;
                if (clusterizingResult2 != null || (r6 = clusterizingResult2.plus(clusterizingResult)) == null) {
                    ClusterizingResult<T> clusterizingResult3 = clusterizingResult;
                }
                nonHierarchicalViewBasedAlgorithm.currentClusterizingResult = clusterizingResult3;
                return clusterizingResult;
            }
        }
        nonHierarchicalViewBasedAlgorithm$getClustersForSameZoomLevel$1 = new NonHierarchicalViewBasedAlgorithm$getClustersForSameZoomLevel$1(this, dVar);
        Object obj2 = nonHierarchicalViewBasedAlgorithm$getClustersForSameZoomLevel$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = nonHierarchicalViewBasedAlgorithm$getClustersForSameZoomLevel$1.label;
        if (i11 != 0) {
        }
        clusterizingResult = (ClusterizingResult) obj2;
        clusterizingResult2 = nonHierarchicalViewBasedAlgorithm.currentClusterizingResult;
        if (clusterizingResult2 != null) {
        }
        ClusterizingResult<T> clusterizingResult32 = clusterizingResult;
        nonHierarchicalViewBasedAlgorithm.currentClusterizingResult = clusterizingResult32;
        return clusterizingResult;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.AbstractAlgorithm
    protected Object getZoomOutOfMinValueClusterizingResult(float f7, @NotNull d<? super ClusterizingResult<T>> dVar) {
        ClusterizingResult<T> clusterizingResult;
        ReentrantReadWriteLock.ReadLock readLock = getLock().readLock();
        readLock.lock();
        try {
            Collection<NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> clusteringItems = getClusteringItems(getMQuadTree(), f7);
            M m11 = M.f71699a;
            Collection<NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> collection = clusteringItems;
            ArrayList arrayList = new ArrayList(C7714v.z(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((NonHierarchicalDistanceBasedAlgorithm.QuadItem) it.next()).getMClusterItem());
            }
            ClusterizingResult<T> clusterizingResult2 = new ClusterizingResult<>(m11, arrayList);
            ClusterizingResult<T> clusterizingResult3 = this.currentClusterizingResult;
            if (clusterizingResult3 == null || (clusterizingResult = clusterizingResult3.plus(clusterizingResult2)) == null) {
                clusterizingResult = clusterizingResult2;
            }
            this.currentClusterizingResult = clusterizingResult;
            readLock.unlock();
            return clusterizingResult2;
        } catch (Throwable th2) {
            readLock.unlock();
            throw th2;
        }
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.NonHierarchicalDistanceBasedAlgorithm
    protected void onAddItem(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        item.updateProcessedState(false);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.ScreenBasedAlgorithm
    public void onCameraChange(@NotNull C10551g cameraPosition) {
        Intrinsics.checkNotNullParameter(cameraPosition, "cameraPosition");
        this.mapCenter = cameraPosition.c();
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.AbstractAlgorithm
    protected void onClusterItemProcessed(@NotNull T clusterItem) {
        Intrinsics.checkNotNullParameter(clusterItem, "clusterItem");
        clusterItem.updateProcessedState(true);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.NonHierarchicalDistanceBasedAlgorithm
    protected void onDeleteItem(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        item.updateProcessedState(false);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.ScreenBasedAlgorithm
    public void updateViewSize(int width, int height) {
        this.viewWidth = width;
        this.viewHeight = height;
    }
}
