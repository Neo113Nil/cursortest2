package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo;

import androidx.collection.C5153w;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.Cluster;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.StaticCluster;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.geometry.Point;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.projection.SphericalMercatorProjection;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u0000 /*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001/B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0015\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u00192\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0015\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bJ\u0010\u0010 \u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0016\u0010!\u001a\u00020\u00192\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u0015\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bJ\u0010\u0010#\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u001c\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0%2\u0006\u0010'\u001a\u00020(H\u0016J \u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0002R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00028\u00000\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/GridBasedAlgorithm;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/AbstractAlgorithm;", "<init>", "()V", "items", "", "getItems", "()Ljava/util/Collection;", "maxDistanceBetweenClusteredItems", "", "getMaxDistanceBetweenClusteredItems", "()I", "setMaxDistanceBetweenClusteredItems", "(I)V", "mItems", "", "", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "getItemById", "id", "(Ljava/lang/String;)Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "addItem", "", "item", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;)Z", "addItems", "clearItems", "", "removeItem", "removeItemById", "removeItems", "updateItem", "isItemExist", "getClusters", "", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/Cluster;", "zoom", "", "getCoord", "", "numCells", "x", "", "y", "Companion", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GridBasedAlgorithm<T extends ClusterItem> extends AbstractAlgorithm<T> {
    public static final int DEFAULT_GRID_SIZE = 100;
    private int maxDistanceBetweenClusteredItems = 100;

    @NotNull
    private final Map<String, T> mItems = new LinkedHashMap();

    @NotNull
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    private final long getCoord(long numCells, double x11, double y11) {
        return (long) (Math.floor(y11) + (Math.floor(x11) * numCells));
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean addItem(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Map<String, T> map = this.mItems;
            Intrinsics.checkNotNullExpressionValue(item.getItemId(), "getItemId(...)");
            return !Intrinsics.d(map.put(r5, item), item);
        } finally {
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
        }
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean addItems(@NotNull Collection<? extends T> items) {
        boolean z11;
        Intrinsics.checkNotNullParameter(items, "items");
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Iterator<T> it = items.iterator();
            while (true) {
                while (it.hasNext()) {
                    ClusterItem clusterItem = (ClusterItem) it.next();
                    Map<String, T> map = this.mItems;
                    String itemId = clusterItem.getItemId();
                    Intrinsics.checkNotNullExpressionValue(itemId, "getItemId(...)");
                    z11 = map.put(itemId, clusterItem) != null;
                }
            }
            return z11;
        } finally {
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
        }
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public void clearItems() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.mItems.clear();
            Unit unit = Unit.f71690a;
        } finally {
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
        }
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.AbstractAlgorithm
    @NotNull
    public Set<Cluster<T>> getClusters(float zoom) {
        ReentrantReadWriteLock.ReadLock readLock;
        double d11;
        long j11;
        long j12;
        GridBasedAlgorithm<T> gridBasedAlgorithm = this;
        ReentrantReadWriteLock.ReadLock readLock2 = gridBasedAlgorithm.lock.readLock();
        readLock2.lock();
        try {
            long ceil = (long) Math.ceil((256 * Math.pow(2.0d, (int) zoom)) / gridBasedAlgorithm.getMaxDistanceBetweenClusteredItems());
            double d12 = ceil;
            SphericalMercatorProjection sphericalMercatorProjection = new SphericalMercatorProjection(d12);
            HashSet hashSet = new HashSet();
            C5153w c5153w = new C5153w();
            for (T t2 : gridBasedAlgorithm.mItems.values()) {
                if (t2.isSeparated()) {
                    StaticCluster staticCluster = new StaticCluster(t2.getPosition());
                    staticCluster.add(t2);
                    hashSet.add(staticCluster);
                    j12 = ceil;
                    readLock = readLock2;
                    d11 = d12;
                } else {
                    Point point = sphericalMercatorProjection.toPoint(t2.getPosition());
                    Intrinsics.checkNotNullExpressionValue(point, "toPoint(...)");
                    long coord = gridBasedAlgorithm.getCoord(ceil, point.f97555x, point.f97556y);
                    double floor = Math.floor(point.f97555x);
                    StaticCluster staticCluster2 = (StaticCluster) c5153w.b(coord);
                    if (staticCluster2 == null && floor == 0.0d) {
                        readLock = readLock2;
                        d11 = d12;
                        j11 = coord;
                        try {
                            staticCluster2 = (StaticCluster) c5153w.b(getCoord(ceil, d12 - 1.0d, point.f97556y));
                        } catch (Throwable th2) {
                            th = th2;
                            readLock.unlock();
                            throw th;
                        }
                    } else {
                        readLock = readLock2;
                        d11 = d12;
                        j11 = coord;
                        if (staticCluster2 == null && floor == d11 - 1.0d) {
                            staticCluster2 = (StaticCluster) c5153w.b(getCoord(ceil, 0.0d, point.f97556y));
                        }
                    }
                    if (staticCluster2 == null) {
                        j12 = ceil;
                        staticCluster2 = new StaticCluster(sphericalMercatorProjection.toLatLng(new Point(Math.floor(point.f97555x) + 0.5d, Math.floor(point.f97556y) + 0.5d)));
                        staticCluster2.switchToSimpleCollection();
                        c5153w.f(j11, staticCluster2);
                        hashSet.add(staticCluster2);
                    } else {
                        j12 = ceil;
                    }
                    staticCluster2.add(t2);
                }
                gridBasedAlgorithm = this;
                ceil = j12;
                readLock2 = readLock;
                d12 = d11;
            }
            readLock2.unlock();
            return hashSet;
        } catch (Throwable th3) {
            th = th3;
            readLock = readLock2;
        }
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public T getItemById(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ReentrantReadWriteLock.ReadLock readLock = this.lock.readLock();
        readLock.lock();
        try {
            return this.mItems.get(id2);
        } finally {
            readLock.unlock();
        }
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    @NotNull
    public Collection<T> getItems() {
        return this.mItems.values();
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.maxDistanceBetweenClusteredItems;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean isItemExist(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ReentrantReadWriteLock.ReadLock readLock = this.lock.readLock();
        readLock.lock();
        try {
            return this.mItems.containsKey(id2);
        } finally {
            readLock.unlock();
        }
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean removeItem(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return this.mItems.remove(item.getItemId()) != null;
        } finally {
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
        }
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean removeItemById(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return this.mItems.remove(id2) != null;
        } finally {
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
        }
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean removeItems(@NotNull Collection<? extends T> items) {
        boolean z11;
        Intrinsics.checkNotNullParameter(items, "items");
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Iterator<T> it = items.iterator();
            while (true) {
                while (it.hasNext()) {
                    z11 = this.mItems.remove(((ClusterItem) it.next()).getItemId()) != null;
                }
            }
            return z11;
        } finally {
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
        }
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i11) {
        this.maxDistanceBetweenClusteredItems = i11;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean updateItem(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return this.mItems.replace(item.getItemId(), item) != null;
        } finally {
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
        }
    }
}
