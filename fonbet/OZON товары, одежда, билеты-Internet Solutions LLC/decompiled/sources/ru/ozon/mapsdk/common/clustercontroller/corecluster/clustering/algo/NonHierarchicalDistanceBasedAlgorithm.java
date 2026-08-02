package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.Cluster;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.StaticCluster;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.geometry.Bounds;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.geometry.Point;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.projection.SphericalMercatorProjection;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.quadtree.PointQuadTree;
import we0.m;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0007\b\u0016\u0018\u0000 Q*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002RQB\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u000eJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\nJ\u001d\u0010 \u001a\u00020\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010\nJ\u0017\u0010&\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b&\u0010\u000eJ\u001d\u0010'\u001a\u00020\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b'\u0010!J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010\nJ#\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0+2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\"2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\"2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b1\u00100J7\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000030\u001e2\u0012\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000003022\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b5\u00106J/\u0010:\u001a\u00020\"2\u0006\u00107\u001a\u00020\u00172\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\"08H\u0084\bø\u0001\u0000¢\u0006\u0004\b:\u0010;R\"\u0010=\u001a\u00020<8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR&\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000003028\u0004X\u0084\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010H\u001a\u00020G8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR&\u0010M\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000030L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006S"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/NonHierarchicalDistanceBasedAlgorithm;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/AbstractAlgorithm;", "", "isSupportProcessingItems", "<init>", "(Z)V", "item", "addItemInternal", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;)Z", "", "id", "removeItemInternal", "(Ljava/lang/String;)Z", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Point;", "a", "b", "", "distanceSquared", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Point;Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Point;)D", "p", "span", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Bounds;", "createBoundsFromSpan", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Point;D)Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Bounds;", "getItemById", "(Ljava/lang/String;)Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "isItemExist", "addItem", "", "items", "addItems", "(Ljava/util/Collection;)Z", "", "clearItems", "()V", "removeItem", "removeItemById", "removeItems", "updateItem", "", "zoom", "", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/Cluster;", "getClusters", "(F)Ljava/util/Set;", "onDeleteItem", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;)V", "onAddItem", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/quadtree/PointQuadTree;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/NonHierarchicalDistanceBasedAlgorithm$QuadItem;", "quadTree", "getClusteringItems", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/quadtree/PointQuadTree;F)Ljava/util/Collection;", "calculatedVisibleBounds", "Lkotlin/Function1;", "processSearch", "startSearchProcess", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Bounds;Lkotlin/jvm/functions/Function1;)V", "", "maxDistanceBetweenClusteredItems", "I", "getMaxDistanceBetweenClusteredItems", "()I", "setMaxDistanceBetweenClusteredItems", "(I)V", "mQuadTree", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/quadtree/PointQuadTree;", "getMQuadTree", "()Lru/ozon/mapsdk/common/clustercontroller/corecluster/quadtree/PointQuadTree;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "", "mItems", "Ljava/util/Map;", "getItems", "()Ljava/util/Collection;", "Companion", "QuadItem", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class NonHierarchicalDistanceBasedAlgorithm<T extends ClusterItem> extends AbstractAlgorithm<T> {
    public static final int DEFAULT_MAX_DISTANCE_AT_ZOOM = 100;

    @NotNull
    private final ReentrantReadWriteLock lock;

    @NotNull
    private final Map<String, QuadItem<T>> mItems;

    @NotNull
    private final PointQuadTree<QuadItem<T>> mQuadTree;
    private int maxDistanceBetweenClusteredItems;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SphericalMercatorProjection PROJECTION = new SphericalMercatorProjection(1.0d);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/NonHierarchicalDistanceBasedAlgorithm$Companion;", "", "<init>", "()V", "DEFAULT_MAX_DISTANCE_AT_ZOOM", "", "PROJECTION", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/projection/SphericalMercatorProjection;", "getPROJECTION", "()Lru/ozon/mapsdk/common/clustercontroller/corecluster/projection/SphericalMercatorProjection;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SphericalMercatorProjection getPROJECTION() {
            return NonHierarchicalDistanceBasedAlgorithm.PROJECTION;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\b\u0004\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/NonHierarchicalDistanceBasedAlgorithm$QuadItem;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/quadtree/PointQuadTree$Item;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/Cluster;", "mClusterItem", "<init>", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;)V", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Point;", "getPoint", "()Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Point;", "", "isProcessed", "()Z", "isSeparated", "Lwe0/m;", "getPosition", "()Lwe0/m;", "", "getItems", "()Ljava/util/Set;", "", "getSize", "()I", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "getMClusterItem", "()Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "mPoint", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Point;", "mPosition", "Lwe0/m;", "singletonSet", "Ljava/util/Set;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    protected static final class QuadItem<T extends ClusterItem> implements PointQuadTree.Item, Cluster<T> {

        @NotNull
        private final T mClusterItem;

        @NotNull
        private final Point mPoint;

        @NotNull
        private final m mPosition;

        @NotNull
        private final Set<T> singletonSet;

        public QuadItem(@NotNull T mClusterItem) {
            Intrinsics.checkNotNullParameter(mClusterItem, "mClusterItem");
            this.mClusterItem = mClusterItem;
            m position = mClusterItem.getPosition();
            Intrinsics.checkNotNullExpressionValue(position, "getPosition(...)");
            this.mPosition = position;
            this.mPoint = NonHierarchicalDistanceBasedAlgorithm.INSTANCE.getPROJECTION().toPoint(position);
            this.singletonSet = e0.h(mClusterItem);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof QuadItem) {
                return Intrinsics.d(((QuadItem) other).mClusterItem.getItemId(), this.mClusterItem.getItemId());
            }
            return false;
        }

        @NotNull
        public final T getMClusterItem() {
            return this.mClusterItem;
        }

        @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.quadtree.PointQuadTree.Item
        @NotNull
        /* renamed from: getPoint, reason: from getter */
        public Point getMPoint() {
            return this.mPoint;
        }

        @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.Cluster
        @NotNull
        /* renamed from: getPosition, reason: from getter */
        public m getMPosition() {
            return this.mPosition;
        }

        @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.Cluster
        public int getSize() {
            return 1;
        }

        public int hashCode() {
            return this.mClusterItem.getItemId().hashCode();
        }

        @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.quadtree.PointQuadTree.Item
        public boolean isProcessed() {
            return this.mClusterItem.isProcessed();
        }

        @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.quadtree.PointQuadTree.Item
        public boolean isSeparated() {
            return this.mClusterItem.isSeparated();
        }

        @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.Cluster
        @NotNull
        public Set<T> getItems() {
            return this.singletonSet;
        }
    }

    public NonHierarchicalDistanceBasedAlgorithm() {
        this(false, 1, null);
    }

    private final boolean addItemInternal(T item) {
        QuadItem<T> quadItem = new QuadItem<>(item);
        Map<String, QuadItem<T>> map = this.mItems;
        String itemId = item.getItemId();
        Intrinsics.checkNotNullExpressionValue(itemId, "getItemId(...)");
        QuadItem<T> put = map.put(itemId, quadItem);
        if (put == null) {
            this.mQuadTree.add(quadItem);
            return true;
        }
        if (Intrinsics.d(put.getMPosition(), item.getPosition())) {
            return false;
        }
        this.mQuadTree.remove(put);
        this.mQuadTree.add(quadItem);
        onAddItem(quadItem.getMClusterItem());
        return false;
    }

    private final Bounds createBoundsFromSpan(Point p11, double span) {
        double d11 = span / 2;
        double d12 = p11.f97555x;
        double d13 = p11.f97556y;
        return new Bounds(d12 - d11, d12 + d11, d13 - d11, d13 + d11);
    }

    private final double distanceSquared(Point a11, Point b11) {
        double abs = Math.abs(a11.f97555x - b11.f97555x);
        double min = Math.min(abs, 1 - abs);
        double d11 = a11.f97556y - b11.f97556y;
        return (d11 * d11) + (min * min);
    }

    private final boolean removeItemInternal(String id2) {
        QuadItem<T> remove = this.mItems.remove(id2);
        if (remove == null) {
            return false;
        }
        boolean remove2 = this.mQuadTree.remove(remove);
        onDeleteItem(remove.getMClusterItem());
        return remove2;
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
            return addItemInternal(item);
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
            Iterator<? extends T> it = items.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                z11 = addItemInternal(it.next());
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

    /* JADX WARN: Multi-variable type inference failed */
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
            Iterator<T> it = this.mItems.values().iterator();
            while (it.hasNext()) {
                onDeleteItem(((QuadItem) it.next()).getMClusterItem());
            }
            this.mItems.clear();
            this.mQuadTree.clear();
            Unit unit = Unit.f71690a;
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    @NotNull
    protected Collection<QuadItem<T>> getClusteringItems(@NotNull PointQuadTree<QuadItem<T>> quadTree, float zoom) {
        Intrinsics.checkNotNullParameter(quadTree, "quadTree");
        return this.mItems.values();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0119 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:3:0x000e, B:4:0x003d, B:6:0x0043, B:9:0x0050, B:13:0x0069, B:15:0x0071, B:16:0x007a, B:17:0x0113, B:19:0x0119, B:23:0x012a, B:24:0x013e, B:26:0x0144, B:43:0x0150, B:29:0x0154, B:31:0x0168, B:34:0x0170, B:36:0x0178, B:37:0x017f, B:46:0x0191, B:49:0x0089, B:50:0x00cb), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012a A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:3:0x000e, B:4:0x003d, B:6:0x0043, B:9:0x0050, B:13:0x0069, B:15:0x0071, B:16:0x007a, B:17:0x0113, B:19:0x0119, B:23:0x012a, B:24:0x013e, B:26:0x0144, B:43:0x0150, B:29:0x0154, B:31:0x0168, B:34:0x0170, B:36:0x0178, B:37:0x017f, B:46:0x0191, B:49:0x0089, B:50:0x00cb), top: B:2:0x000e }] */
    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.AbstractAlgorithm
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Set<Cluster<T>> getClusters(float zoom) {
        double d11;
        int i11;
        Collection<QuadItem<T>> searchItems;
        ReentrantReadWriteLock.ReadLock readLock = this.lock.readLock();
        readLock.lock();
        try {
            double maxDistanceBetweenClusteredItems = (getMaxDistanceBetweenClusteredItems() / Math.pow(2.0d, (int) zoom)) / 256;
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (QuadItem<T> quadItem : getClusteringItems(this.mQuadTree, zoom)) {
                if (!hashSet.contains(quadItem)) {
                    Bounds createBoundsFromSpan = createBoundsFromSpan(quadItem.getMPoint(), maxDistanceBetweenClusteredItems);
                    HashSet<QuadItem> hashSet3 = new HashSet();
                    double d12 = createBoundsFromSpan.minX;
                    if (d12 >= 0.0d) {
                        d11 = maxDistanceBetweenClusteredItems;
                        if (createBoundsFromSpan.maxX <= 1.0d) {
                            searchItems = this.mQuadTree.searchItems(createBoundsFromSpan);
                            Intrinsics.checkNotNullExpressionValue(searchItems, "searchItems(...)");
                            hashSet3.addAll(searchItems);
                            i11 = 1;
                            if (hashSet3.size() == i11) {
                                hashSet2.add(quadItem);
                                hashSet.add(quadItem);
                                hashMap.put(quadItem, Double.valueOf(0.0d));
                            } else {
                                StaticCluster staticCluster = new StaticCluster(quadItem.getMClusterItem().getPosition());
                                hashSet2.add(staticCluster);
                                for (QuadItem quadItem2 : hashSet3) {
                                    if (quadItem2.isSeparated()) {
                                        hashSet2.add(quadItem2);
                                    } else {
                                        Double d13 = (Double) hashMap.get(quadItem2);
                                        double distanceSquared = distanceSquared(quadItem2.getMPoint(), quadItem.getMPoint());
                                        if (d13 == null || d13.doubleValue() > distanceSquared) {
                                            StaticCluster staticCluster2 = (StaticCluster) hashMap2.get(quadItem2);
                                            if (staticCluster2 != 0) {
                                                staticCluster2.remove(quadItem2.getMClusterItem());
                                            }
                                            hashMap.put(quadItem2, Double.valueOf(distanceSquared));
                                            staticCluster.add(quadItem2.getMClusterItem());
                                            hashMap2.put(quadItem2, staticCluster);
                                        }
                                    }
                                }
                                hashSet.addAll(hashSet3);
                            }
                            maxDistanceBetweenClusteredItems = d11;
                        }
                    } else {
                        d11 = maxDistanceBetweenClusteredItems;
                    }
                    if (d12 < 0.0d) {
                        Collection<QuadItem<T>> searchItems2 = this.mQuadTree.searchItems(new Bounds(d12 + 1, 1.0d, createBoundsFromSpan.minY, createBoundsFromSpan.maxY));
                        Intrinsics.checkNotNullExpressionValue(searchItems2, "searchItems(...)");
                        hashSet3.addAll(searchItems2);
                        searchItems = this.mQuadTree.searchItems(new Bounds(0.0d, createBoundsFromSpan.maxX, createBoundsFromSpan.minY, createBoundsFromSpan.maxY));
                        Intrinsics.checkNotNullExpressionValue(searchItems, "searchItems(...)");
                        hashSet3.addAll(searchItems);
                        i11 = 1;
                        if (hashSet3.size() == i11) {
                        }
                        maxDistanceBetweenClusteredItems = d11;
                    } else {
                        i11 = 1;
                        Collection<QuadItem<T>> searchItems3 = this.mQuadTree.searchItems(new Bounds(d12, 1.0d, createBoundsFromSpan.minY, createBoundsFromSpan.maxY));
                        Intrinsics.checkNotNullExpressionValue(searchItems3, "searchItems(...)");
                        hashSet3.addAll(searchItems3);
                        Collection<QuadItem<T>> searchItems4 = this.mQuadTree.searchItems(new Bounds(0.0d, createBoundsFromSpan.maxX - 1, createBoundsFromSpan.minY, createBoundsFromSpan.maxY));
                        Intrinsics.checkNotNullExpressionValue(searchItems4, "searchItems(...)");
                        hashSet3.addAll(searchItems4);
                        if (hashSet3.size() == i11) {
                        }
                        maxDistanceBetweenClusteredItems = d11;
                    }
                }
            }
            readLock.unlock();
            return hashSet2;
        } catch (Throwable th2) {
            readLock.unlock();
            throw th2;
        }
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public T getItemById(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ReentrantReadWriteLock.ReadLock readLock = this.lock.readLock();
        readLock.lock();
        try {
            QuadItem<T> quadItem = this.mItems.get(id2);
            return quadItem != null ? quadItem.getMClusterItem() : null;
        } finally {
            readLock.unlock();
        }
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    @NotNull
    public Collection<T> getItems() {
        ReentrantReadWriteLock.ReadLock readLock = this.lock.readLock();
        readLock.lock();
        try {
            Collection<QuadItem<T>> values = this.mItems.values();
            ArrayList arrayList = new ArrayList(C7714v.z(values, 10));
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                arrayList.add(((QuadItem) it.next()).getMClusterItem());
            }
            return arrayList;
        } finally {
            readLock.unlock();
        }
    }

    @NotNull
    protected final ReentrantReadWriteLock getLock() {
        return this.lock;
    }

    @NotNull
    protected final PointQuadTree<QuadItem<T>> getMQuadTree() {
        return this.mQuadTree;
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

    protected void onAddItem(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    protected void onDeleteItem(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
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
            String itemId = item.getItemId();
            Intrinsics.checkNotNullExpressionValue(itemId, "getItemId(...)");
            return removeItemInternal(itemId);
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
            return removeItemInternal(id2);
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
            Iterator<? extends T> it = items.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                String itemId = it.next().getItemId();
                Intrinsics.checkNotNullExpressionValue(itemId, "getItemId(...)");
                z11 = removeItemInternal(itemId);
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

    protected final void startSearchProcess(@NotNull Bounds calculatedVisibleBounds, @NotNull Function1<? super Bounds, Unit> processSearch) {
        Intrinsics.checkNotNullParameter(calculatedVisibleBounds, "calculatedVisibleBounds");
        Intrinsics.checkNotNullParameter(processSearch, "processSearch");
        double d11 = calculatedVisibleBounds.minX;
        if (d11 >= 0.0d && calculatedVisibleBounds.maxX <= 1.0d) {
            processSearch.invoke(calculatedVisibleBounds);
        } else if (d11 < 0.0d) {
            processSearch.invoke(new Bounds(d11 + 1, 1.0d, calculatedVisibleBounds.minY, calculatedVisibleBounds.maxY));
            processSearch.invoke(new Bounds(0.0d, calculatedVisibleBounds.maxX, calculatedVisibleBounds.minY, calculatedVisibleBounds.maxY));
        } else {
            processSearch.invoke(new Bounds(d11, 1.0d, calculatedVisibleBounds.minY, calculatedVisibleBounds.maxY));
            processSearch.invoke(new Bounds(0.0d, calculatedVisibleBounds.maxX - 1, calculatedVisibleBounds.minY, calculatedVisibleBounds.maxY));
        }
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
            String itemId = item.getItemId();
            Intrinsics.checkNotNullExpressionValue(itemId, "getItemId(...)");
            boolean removeItemInternal = removeItemInternal(itemId);
            if (removeItemInternal) {
                removeItemInternal = addItemInternal(item);
            }
            return removeItemInternal;
        } finally {
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
        }
    }

    public /* synthetic */ NonHierarchicalDistanceBasedAlgorithm(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }

    public NonHierarchicalDistanceBasedAlgorithm(boolean z11) {
        this.maxDistanceBetweenClusteredItems = 100;
        this.mQuadTree = new PointQuadTree<>(0.0d, 1.0d, 0.0d, 1.0d, z11);
        this.lock = new ReentrantReadWriteLock();
        this.mItems = new LinkedHashMap();
    }
}
