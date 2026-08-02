package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo;

import Sc.InterfaceC3999a;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.collection.C5153w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.Cluster;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.StaticCluster;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.geometry.Bounds;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.geometry.Point;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.projection.SphericalMercatorProjection;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.quadtree.OzonPointQuadTree;
import we0.C10551g;
import we0.k;
import we0.m;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;

@InterfaceC3999a
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001kB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\f2\u0018\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00170\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ=\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00170\u001e2\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010#\u001a\u00020\u001c2\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00172\u0006\u0010\"\u001a\u00020\u001cH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020*2\u0006\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u001cH\u0016¢\u0006\u0004\b/\u00100J\u001e\u00102\u001a\b\u0012\u0004\u0012\u00028\u0000012\u0006\u0010\u000b\u001a\u00020\nH\u0094@¢\u0006\u0004\b2\u00103J&\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00105\u001a\u000204H\u0096@¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u0002092\u0006\u00108\u001a\u00028\u0000H\u0016¢\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\u0002092\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020*H\u0016¢\u0006\u0004\b>\u0010\u0006J\u0017\u0010?\u001a\u0002092\u0006\u00108\u001a\u00028\u0000H\u0016¢\u0006\u0004\b?\u0010;J\u001d\u0010@\u001a\u0002092\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b@\u0010=J\u0017\u0010A\u001a\u0002092\u0006\u00108\u001a\u00028\u0000H\u0016¢\u0006\u0004\bA\u0010;J\u0019\u0010D\u001a\u0004\u0018\u00018\u00002\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u0002092\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u0002092\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bH\u0010GJ#\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bI\u0010JJ=\u0010Q\u001a\u00020P2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010L\u001a\u00020%2\u0006\u0010M\u001a\u00020\u001c2\u0006\u0010N\u001a\u00020\u001c2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\bU\u0010TR\u0016\u0010V\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010TR\u0016\u0010W\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010TR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR&\u0010\\\u001a\u0014\u0012\u0004\u0012\u00020B\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R \u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010`\u001a\u0004\ba\u0010bR\u0016\u0010d\u001a\u00020c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\"\u0010f\u001a\u00020\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bf\u0010T\u001a\u0004\bg\u0010h\"\u0004\bi\u0010j¨\u0006l"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/GridScreenBasedAlgorithm;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/AbstractAlgorithm;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/ScreenBasedAlgorithm;", "<init>", "()V", "", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/GridScreenBasedAlgorithm$QuadItem;", "items", "", "zoom", "", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/Cluster;", "getClustersByGrid", "(Ljava/util/Collection;F)Ljava/util/Set;", "", "numCells", "", "x", "y", "getCoord", "(JDD)J", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/quadtree/OzonPointQuadTree;", "visibleQuads", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/StaticCluster;", "getClustersGridByQuads", "currPoint", "", "targetMaxDepth", "", "seekDown", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/quadtree/OzonPointQuadTree;I)Ljava/util/List;", "point", "stopDepth", "findMaxDepth", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/quadtree/OzonPointQuadTree;I)I", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Bounds;", "getVisibleBounds", "(F)Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Bounds;", "Lwe0/g;", "cameraPosition", "", "onCameraChange", "(Lwe0/g;)V", "width", "height", "updateViewSize", "(II)V", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "getZoomOutOfMinValueClusterizingResult", "(FLkotlin/coroutines/d;)Ljava/lang/Object;", "Lwe0/k;", "clusteringOptions", "getClustersForSameZoomLevel", "(FLwe0/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "item", "", "addItem", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;)Z", "addItems", "(Ljava/util/Collection;)Z", "clearItems", "removeItem", "removeItems", "updateItem", "", "id", "getItemById", "(Ljava/lang/String;)Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "removeItemById", "(Ljava/lang/String;)Z", "isItemExist", "getClusters", "(F)Ljava/util/Set;", "quadTree", "searchBound", "imageWidth", "imageHeight", "drawDepth", "Landroid/graphics/Bitmap;", "drawQuadTree", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/quadtree/OzonPointQuadTree;Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Bounds;IILjava/lang/Integer;)Landroid/graphics/Bitmap;", "seekDepthBefore7Zoom", "I", "seekDepthAfter7Zoom", "mViewWidth", "mViewHeight", "Lwe0/m;", "mMapCenter", "Lwe0/m;", "", "mItems", "Ljava/util/Map;", "mQuadTree", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/quadtree/OzonPointQuadTree;", "Ljava/util/Collection;", "getItems", "()Ljava/util/Collection;", "Lxe/M;", "gridScreenBasedScope", "Lxe/M;", "maxDistanceBetweenClusteredItems", "getMaxDistanceBetweenClusteredItems", "()I", "setMaxDistanceBetweenClusteredItems", "(I)V", "QuadItem", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GridScreenBasedAlgorithm<T extends ClusterItem> extends AbstractAlgorithm<T> implements ScreenBasedAlgorithm<T> {

    @NotNull
    private M gridScreenBasedScope;

    @NotNull
    private final Collection<T> items;

    @NotNull
    private final Map<String, QuadItem<T>> mItems;
    private m mMapCenter;

    @NotNull
    private final OzonPointQuadTree<QuadItem<T>> mQuadTree;
    private int mViewHeight;
    private int mViewWidth;
    private int maxDistanceBetweenClusteredItems;
    private final int seekDepthBefore7Zoom = 3;
    private final int seekDepthAfter7Zoom = 6;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\n\b\u0001\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/GridScreenBasedAlgorithm$QuadItem;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/quadtree/OzonPointQuadTree$Item;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/Cluster;", "mClusterItem", "<init>", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;)V", "Lwe0/m;", "getPosition", "()Lwe0/m;", "", "getItems", "()Ljava/util/Set;", "", "getSize", "()I", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "getMClusterItem", "()Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "mPosition", "Lwe0/m;", "singletonSet", "Ljava/util/Set;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Point;", "point", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Point;", "getPoint", "()Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Point;", "isProcessed", "()Z", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class QuadItem<T extends ClusterItem> implements OzonPointQuadTree.Item, Cluster<T> {
        private final T mClusterItem;

        @NotNull
        private final m mPosition;

        @NotNull
        private final Point point;

        @NotNull
        private final Set<T> singletonSet;

        public QuadItem(T t2) {
            this.mClusterItem = t2;
            Intrinsics.f(t2);
            m position = t2.getPosition();
            Intrinsics.checkNotNullExpressionValue(position, "getPosition(...)");
            this.mPosition = position;
            this.singletonSet = e0.h(t2);
            Point point = NonHierarchicalDistanceBasedAlgorithm.INSTANCE.getPROJECTION().toPoint(position);
            Intrinsics.checkNotNullExpressionValue(point, "toPoint(...)");
            this.point = point;
        }

        public boolean equals(Object other) {
            if (other instanceof QuadItem) {
                return Intrinsics.d(((QuadItem) other).mClusterItem, this.mClusterItem);
            }
            return false;
        }

        public final T getMClusterItem() {
            return this.mClusterItem;
        }

        @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.quadtree.OzonPointQuadTree.Item
        @NotNull
        public Point getPoint() {
            return this.point;
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
            T t2 = this.mClusterItem;
            if (t2 != null) {
                return t2.hashCode();
            }
            return 0;
        }

        @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.quadtree.OzonPointQuadTree.Item
        public boolean isProcessed() {
            T t2 = this.mClusterItem;
            if (t2 != null) {
                return t2.isProcessed();
            }
            return false;
        }

        @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.Cluster
        @NotNull
        public Set<T> getItems() {
            return this.singletonSet;
        }
    }

    public GridScreenBasedAlgorithm() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.mItems = linkedHashMap;
        this.mQuadTree = new OzonPointQuadTree<>(new Bounds(0.0d, 1.0d, 0.0d, 1.0d));
        Collection values = linkedHashMap.values();
        ArrayList arrayList = new ArrayList(C7714v.z(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((QuadItem) it.next()).getMClusterItem());
        }
        this.items = C7714v.W0(arrayList);
        this.gridScreenBasedScope = N.a(CoroutineContext.Element.a.d(C10720e0.a(), (H0) X0.b()));
        this.maxDistanceBetweenClusteredItems = 100;
    }

    public static /* synthetic */ Bitmap drawQuadTree$default(GridScreenBasedAlgorithm gridScreenBasedAlgorithm, OzonPointQuadTree ozonPointQuadTree, Bounds bounds, int i11, int i12, Integer num, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            num = null;
        }
        return gridScreenBasedAlgorithm.drawQuadTree(ozonPointQuadTree, bounds, i11, i12, num);
    }

    private static final void drawQuadTree$drawBounds(Paint paint, OzonPointQuadTree<?> ozonPointQuadTree, int i11, int i12, Canvas canvas, Bounds bounds, int i13) {
        paint.setColor(i13);
        paint.setStyle(Paint.Style.STROKE);
        double d11 = i11;
        float f7 = (float) ((bounds.minX / ozonPointQuadTree.getMBounds().maxX) * d11);
        double d12 = i12;
        float f11 = (float) ((bounds.minY / ozonPointQuadTree.getMBounds().maxY) * d12);
        canvas.drawRect(f7, f11, ((float) (((bounds.maxX - bounds.minX) / ozonPointQuadTree.getMBounds().maxX) * d11)) + f7, ((float) (((bounds.maxY - bounds.minY) / ozonPointQuadTree.getMBounds().maxY) * d12)) + f11, paint);
    }

    private static final void drawQuadTree$drawQuad(Integer num, Bounds bounds, Paint paint, OzonPointQuadTree<?> ozonPointQuadTree, int i11, int i12, Canvas canvas, OzonPointQuadTree<?> ozonPointQuadTree2) {
        Bounds bounds2;
        if (num == null || ozonPointQuadTree2.getMDepth() == num.intValue()) {
            bounds2 = bounds;
            drawQuadTree$drawBounds(paint, ozonPointQuadTree, i11, i12, canvas, ozonPointQuadTree2.getMBounds(), drawQuadTree$getBoundsColor(bounds2, ozonPointQuadTree2.getMBounds()));
        } else {
            bounds2 = bounds;
        }
        List<OzonPointQuadTree<?>> mChildren = ozonPointQuadTree2.getMChildren();
        if (mChildren != null) {
            Iterator<T> it = mChildren.iterator();
            while (it.hasNext()) {
                drawQuadTree$drawQuad(num, bounds2, paint, ozonPointQuadTree, i11, i12, canvas, (OzonPointQuadTree) it.next());
                bounds2 = bounds;
            }
        }
    }

    private static final int drawQuadTree$getBoundsColor(Bounds bounds, Bounds bounds2) {
        boolean intersects = bounds2.intersects(bounds);
        boolean contains = bounds2.contains(bounds);
        if (intersects && contains) {
            return -16711936;
        }
        if (intersects || !contains) {
            return (!intersects || contains) ? -16776961 : -65281;
        }
        return -256;
    }

    private final int findMaxDepth(OzonPointQuadTree<QuadItem<T>> point, int stopDepth) {
        List<OzonPointQuadTree<QuadItem<T>>> mChildren = point.getMChildren();
        if (mChildren == null || mChildren.isEmpty() || point.getMDepth() == stopDepth) {
            return point.getMDepth();
        }
        List<OzonPointQuadTree<QuadItem<T>>> mChildren2 = point.getMChildren();
        Intrinsics.f(mChildren2);
        List<OzonPointQuadTree<QuadItem<T>>> list = mChildren2;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(findMaxDepth((OzonPointQuadTree) it.next(), stopDepth)));
        }
        return ((Number) C7714v.g0(arrayList)).intValue();
    }

    private final Set<Cluster<T>> getClustersByGrid(Collection<QuadItem<T>> items, float zoom) {
        long j11;
        long ceil = (long) Math.ceil((Math.pow(2.0d, zoom) * 256) / getMaxDistanceBetweenClusteredItems());
        SphericalMercatorProjection sphericalMercatorProjection = new SphericalMercatorProjection(ceil);
        HashSet hashSet = new HashSet();
        C5153w c5153w = new C5153w();
        GridScreenBasedAlgorithm<T> gridScreenBasedAlgorithm = this;
        synchronized (gridScreenBasedAlgorithm.mItems) {
            try {
                for (QuadItem<T> quadItem : items) {
                    Point point = sphericalMercatorProjection.toPoint(quadItem.getMPosition());
                    Intrinsics.checkNotNullExpressionValue(point, "toPoint(...)");
                    long coord = gridScreenBasedAlgorithm.getCoord(ceil, point.f97555x, point.f97556y);
                    StaticCluster staticCluster = (StaticCluster) c5153w.b(coord);
                    if (staticCluster == null) {
                        j11 = ceil;
                        staticCluster = new StaticCluster(sphericalMercatorProjection.toLatLng(new Point(Math.floor(point.f97555x) + 0.5d, Math.floor(point.f97556y) + 0.5d)));
                        c5153w.f(coord, staticCluster);
                        hashSet.add(staticCluster);
                    } else {
                        j11 = ceil;
                    }
                    staticCluster.add(quadItem.getMClusterItem());
                    gridScreenBasedAlgorithm = this;
                    ceil = j11;
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hashSet;
    }

    private final Set<StaticCluster<T>> getClustersGridByQuads(Collection<OzonPointQuadTree<QuadItem<T>>> visibleQuads, float zoom) {
        Collection<OzonPointQuadTree<QuadItem<T>>> collection = visibleQuads;
        ArrayList arrayList = new ArrayList(C7714v.z(collection, 10));
        for (OzonPointQuadTree<QuadItem<T>> ozonPointQuadTree : collection) {
            int mDepth = ozonPointQuadTree.getMDepth() + (zoom <= 7.0f ? this.seekDepthBefore7Zoom : this.seekDepthAfter7Zoom);
            List<OzonPointQuadTree<QuadItem<T>>> mChildren = ozonPointQuadTree.getMChildren();
            arrayList.add((mChildren == null || mChildren.isEmpty()) ? e0.h(ozonPointQuadTree) : seekDown(ozonPointQuadTree, mDepth));
        }
        return C7714v.Y0((Iterable) C10727i.d(g.f71771a, new GridScreenBasedAlgorithm$getClustersGridByQuads$1(C7714v.N(arrayList), this, null)));
    }

    private final long getCoord(long numCells, double x11, double y11) {
        return (long) (Math.floor(y11) + (Math.floor(x11) * numCells));
    }

    private final Bounds getVisibleBounds(float zoom) {
        if (this.mMapCenter == null || this.mViewWidth == 0 || this.mViewHeight == 0) {
            return new Bounds(0.0d, 0.0d, 0.0d, 0.0d);
        }
        Point point = NonHierarchicalDistanceBasedAlgorithm.INSTANCE.getPROJECTION().toPoint(this.mMapCenter);
        Intrinsics.checkNotNullExpressionValue(point, "toPoint(...)");
        double d11 = 1.0d / (1 << ((int) zoom));
        int i11 = this.mViewWidth;
        double d12 = 256;
        double d13 = 2;
        double d14 = ((i11 * d11) / d12) / d13;
        double d15 = ((i11 * d11) / d12) / d13;
        double d16 = point.f97555x;
        double d17 = d16 - d14;
        double d18 = d16 + d14;
        double d19 = point.f97556y;
        return new Bounds(d17, d18, d19 - d15, d19 + d15);
    }

    private final List<OzonPointQuadTree<QuadItem<T>>> seekDown(OzonPointQuadTree<QuadItem<T>> currPoint, int targetMaxDepth) {
        List<OzonPointQuadTree<QuadItem<T>>> mChildren;
        if (targetMaxDepth == currPoint.getMDepth() || (mChildren = currPoint.getMChildren()) == null || mChildren.isEmpty()) {
            return C7714v.a0(currPoint);
        }
        List<OzonPointQuadTree<QuadItem<T>>> mChildren2 = currPoint.getMChildren();
        Intrinsics.f(mChildren2);
        List<OzonPointQuadTree<QuadItem<T>>> list = mChildren2;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(seekDown((OzonPointQuadTree) it.next(), targetMaxDepth));
        }
        return C7714v.N(arrayList);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean addItem(@NotNull T item) {
        boolean z11;
        Intrinsics.checkNotNullParameter(item, "item");
        QuadItem<T> quadItem = new QuadItem<>(item);
        synchronized (this) {
            try {
                Map<String, QuadItem<T>> map = this.mItems;
                String itemId = item.getItemId();
                Intrinsics.checkNotNullExpressionValue(itemId, "getItemId(...)");
                z11 = map.put(itemId, quadItem) == null;
                if (z11) {
                    this.mQuadTree.add(quadItem);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean addItems(@NotNull Collection<? extends T> items) {
        Object obj;
        Intrinsics.checkNotNullParameter(items, "items");
        Collection<? extends T> collection = items;
        ArrayList arrayList = new ArrayList(C7714v.z(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(addItem((ClusterItem) it.next())));
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((Boolean) obj).booleanValue()) {
                break;
            }
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public synchronized void clearItems() {
        synchronized (this.mQuadTree) {
            this.mItems.clear();
            this.mQuadTree.clear();
            Unit unit = Unit.f71690a;
        }
    }

    @NotNull
    public final Bitmap drawQuadTree(@NotNull OzonPointQuadTree<?> quadTree, @NotNull Bounds searchBound, int imageWidth, int imageHeight, Integer drawDepth) {
        Intrinsics.checkNotNullParameter(quadTree, "quadTree");
        Intrinsics.checkNotNullParameter(searchBound, "searchBound");
        Bitmap createBitmap = Bitmap.createBitmap(imageWidth, imageHeight, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        canvas.drawColor(-1);
        drawQuadTree$drawQuad(drawDepth, searchBound, paint, quadTree, imageWidth, imageHeight, canvas, quadTree);
        drawQuadTree$drawBounds(paint, quadTree, imageWidth, imageHeight, canvas, searchBound, -65536);
        return createBitmap;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.AbstractAlgorithm
    @NotNull
    public Set<Cluster<T>> getClusters(float zoom) {
        Bounds visibleBounds = getVisibleBounds(zoom);
        return zoom > 9.0f ? getClustersByGrid(this.mQuadTree.searchItems(visibleBounds), zoom) : getClustersGridByQuads(this.mQuadTree.searchQuadsFitBoundsAndZoom(visibleBounds, zoom), zoom);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.ScreenBasedAlgorithm
    public Object getClustersForSameZoomLevel(float f7, @NotNull k kVar, @NotNull d<? super ClusterizingResult<T>> dVar) {
        return super.getClusters(f7, kVar, dVar);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public T getItemById(@NotNull String id2) {
        T mClusterItem;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this) {
            try {
                QuadItem<T> quadItem = this.mItems.get(id2);
                mClusterItem = quadItem != null ? quadItem.getMClusterItem() : null;
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mClusterItem;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    @NotNull
    public Collection<T> getItems() {
        return this.items;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.maxDistanceBetweenClusteredItems;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.AbstractAlgorithm
    protected Object getZoomOutOfMinValueClusterizingResult(float f7, @NotNull d<? super ClusterizingResult<T>> dVar) {
        Collection<QuadItem<T>> searchItems = this.mQuadTree.searchItems(getVisibleBounds(f7));
        kotlin.collections.M m11 = kotlin.collections.M.f71699a;
        Collection<QuadItem<T>> collection = searchItems;
        ArrayList arrayList = new ArrayList(C7714v.z(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((QuadItem) it.next()).getMClusterItem());
        }
        return new ClusterizingResult(m11, arrayList);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean isItemExist(@NotNull String id2) {
        boolean containsKey;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this) {
            containsKey = this.mItems.containsKey(id2);
            Unit unit = Unit.f71690a;
        }
        return containsKey;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.ScreenBasedAlgorithm
    public void onCameraChange(@NotNull C10551g cameraPosition) {
        Intrinsics.checkNotNullParameter(cameraPosition, "cameraPosition");
        this.mMapCenter = cameraPosition.c();
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean removeItem(@NotNull T item) {
        boolean remove;
        Intrinsics.checkNotNullParameter(item, "item");
        synchronized (this) {
            try {
                QuadItem<T> remove2 = this.mItems.remove(item.getItemId());
                remove = remove2 != null ? this.mQuadTree.remove(remove2) : false;
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return remove;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean removeItemById(@NotNull String id2) {
        boolean remove;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this) {
            try {
                QuadItem<T> remove2 = this.mItems.remove(id2);
                remove = remove2 != null ? this.mQuadTree.remove(remove2) : false;
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return remove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean removeItems(@NotNull Collection<? extends T> items) {
        Object obj;
        Intrinsics.checkNotNullParameter(items, "items");
        Collection<? extends T> collection = items;
        ArrayList arrayList = new ArrayList(C7714v.z(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(removeItem((ClusterItem) it.next())));
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((Boolean) obj).booleanValue()) {
                break;
            }
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i11) {
        this.maxDistanceBetweenClusteredItems = i11;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean updateItem(@NotNull T item) {
        boolean addItem;
        Intrinsics.checkNotNullParameter(item, "item");
        synchronized (this.mQuadTree) {
            addItem = removeItem(item) ? addItem(item) : false;
        }
        return addItem;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.ScreenBasedAlgorithm
    public void updateViewSize(int width, int height) {
        this.mViewWidth = width;
        this.mViewHeight = height;
    }
}
