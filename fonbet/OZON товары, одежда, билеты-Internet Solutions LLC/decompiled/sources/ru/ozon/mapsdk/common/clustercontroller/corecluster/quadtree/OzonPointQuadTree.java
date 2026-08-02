package ru.ozon.mapsdk.common.clustercontroller.corecluster.quadtree;

import Sc.InterfaceC3999a;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.geometry.Bounds;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.geometry.Point;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.quadtree.OzonPointQuadTree.Item;

@InterfaceC3999a
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0001\u0018\u0000 B*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\u00020\u0003:\u0002ABB\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0011B1\b\u0012\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0013J\u0013\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00028\u0000¢\u0006\u0002\u0010'J%\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010&\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010+J\b\u0010,\u001a\u00020%H\u0002J\u0013\u0010-\u001a\u00020.2\u0006\u0010&\u001a\u00028\u0000¢\u0006\u0002\u0010/J%\u0010-\u001a\u00020.2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010&\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00100J\u0006\u00101\u001a\u00020%J\u001c\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000032\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u0014\u00107\u001a\b\u0012\u0004\u0012\u00028\u0000082\u0006\u00109\u001a\u00020\u0005J\u001e\u00107\u001a\u00020%2\u0006\u00109\u001a\u00020\u00052\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000;H\u0002J\"\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000082\u0006\u00109\u001a\u00020\u00052\u0006\u0010=\u001a\u00020>J$\u0010<\u001a\u00020%2\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000;H\u0002J\u001e\u0010?\u001a\u00020.2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00109\u001a\u00020\u0005H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00028\u0000038F¢\u0006\u0006\u001a\u0004\b4\u0010\u001b¨\u0006C"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/quadtree/OzonPointQuadTree;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/quadtree/OzonPointQuadTree$Item;", "", "mBounds", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Bounds;", "mDepth", "", "<init>", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Bounds;I)V", "minX", "", "maxX", "minY", "maxY", "(DDDD)V", "bounds", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Bounds;)V", "depth", "(DDDDI)V", "getMBounds", "()Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Bounds;", "getMDepth", "()I", "mItems", "", "getMItems", "()Ljava/util/Set;", "setMItems", "(Ljava/util/Set;)V", "mChildren", "", "getMChildren", "()Ljava/util/List;", "setMChildren", "(Ljava/util/List;)V", ProductAction.ACTION_ADD, "", "item", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/quadtree/OzonPointQuadTree$Item;)V", "insert", "x", "y", "(DDLru/ozon/mapsdk/common/clustercontroller/corecluster/quadtree/OzonPointQuadTree$Item;)V", "split", ProductAction.ACTION_REMOVE, "", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/quadtree/OzonPointQuadTree$Item;)Z", "(DDLru/ozon/mapsdk/common/clustercontroller/corecluster/quadtree/OzonPointQuadTree$Item;)Z", "clear", "allChildrens", "", "getAllChildrens", "getAllChildrensOf", "point", "searchItems", "", "searchBounds", "results", "", "searchQuadsFitBoundsAndZoom", "zoom", "", "isAllChildsInViewPort", "quad", "Item", "Companion", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OzonPointQuadTree<T extends Item> {
    private static final int MAX_DEPTH = 40;
    private static final int MAX_ELEMENTS = 50;

    @NotNull
    private final Bounds mBounds;
    private List<OzonPointQuadTree<T>> mChildren;
    private final int mDepth;
    private Set<T> mItems;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/quadtree/OzonPointQuadTree$Item;", "", "point", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Point;", "getPoint", "()Lru/ozon/mapsdk/common/clustercontroller/corecluster/geometry/Point;", "isProcessed", "", "()Z", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Item {
        @NotNull
        Point getPoint();

        boolean isProcessed();
    }

    private OzonPointQuadTree(Bounds bounds, int i11) {
        this.mBounds = bounds;
        this.mDepth = i11;
    }

    private final Set<T> getAllChildrensOf(OzonPointQuadTree<T> point) {
        List<OzonPointQuadTree<T>> list = point.mChildren;
        if (list == null || list.isEmpty()) {
            Set<T> set = point.mItems;
            return set == null ? M.f71699a : set;
        }
        Set set2 = this.mItems;
        if (set2 == null) {
            set2 = new LinkedHashSet();
        }
        List<OzonPointQuadTree<T>> list2 = point.mChildren;
        Intrinsics.f(list2);
        List<OzonPointQuadTree<T>> list3 = list2;
        ArrayList arrayList = new ArrayList(C7714v.z(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(getAllChildrensOf((OzonPointQuadTree) it.next()));
        }
        set2.addAll(C7714v.N(arrayList));
        return C7714v.Y0(set2);
    }

    private final void insert(double x11, double y11, T item) {
        List<OzonPointQuadTree<T>> list = this.mChildren;
        if (list == null) {
            if (this.mItems == null) {
                this.mItems = new LinkedHashSet();
            }
            Set<T> set = this.mItems;
            Intrinsics.f(set);
            set.add(item);
            Set<T> set2 = this.mItems;
            Intrinsics.f(set2);
            if (set2.size() <= 50 || this.mDepth >= 40) {
                return;
            }
            split();
            return;
        }
        Bounds bounds = this.mBounds;
        if (y11 < bounds.midY) {
            if (x11 < bounds.midX) {
                Intrinsics.f(list);
                list.get(0).insert(x11, y11, item);
                return;
            } else {
                Intrinsics.f(list);
                list.get(1).insert(x11, y11, item);
                return;
            }
        }
        if (x11 < bounds.midX) {
            Intrinsics.f(list);
            list.get(2).insert(x11, y11, item);
        } else {
            Intrinsics.f(list);
            list.get(3).insert(x11, y11, item);
        }
    }

    private final boolean isAllChildsInViewPort(OzonPointQuadTree<T> quad, Bounds searchBounds) {
        List<OzonPointQuadTree<T>> list = quad.mChildren;
        if (list != null) {
            List<OzonPointQuadTree<T>> list2 = list;
            ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                OzonPointQuadTree ozonPointQuadTree = (OzonPointQuadTree) it.next();
                arrayList.add(Boolean.valueOf(ozonPointQuadTree.mBounds.intersects(searchBounds) && ozonPointQuadTree.mBounds.contains(searchBounds)));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((Boolean) it2.next()).getClass();
            }
        }
        return false;
    }

    private final void split() {
        ArrayList arrayList = new ArrayList(4);
        this.mChildren = arrayList;
        Bounds bounds = this.mBounds;
        arrayList.add(new OzonPointQuadTree(bounds.minX, bounds.midX, bounds.minY, bounds.midY, this.mDepth + 1));
        List<OzonPointQuadTree<T>> list = this.mChildren;
        Intrinsics.f(list);
        Bounds bounds2 = this.mBounds;
        list.add(new OzonPointQuadTree<>(bounds2.midX, bounds2.maxX, bounds2.minY, bounds2.midY, this.mDepth + 1));
        List<OzonPointQuadTree<T>> list2 = this.mChildren;
        Intrinsics.f(list2);
        Bounds bounds3 = this.mBounds;
        list2.add(new OzonPointQuadTree<>(bounds3.minX, bounds3.midX, bounds3.midY, bounds3.maxY, this.mDepth + 1));
        List<OzonPointQuadTree<T>> list3 = this.mChildren;
        Intrinsics.f(list3);
        Bounds bounds4 = this.mBounds;
        list3.add(new OzonPointQuadTree<>(bounds4.midX, bounds4.maxX, bounds4.midY, bounds4.maxY, this.mDepth + 1));
        Set<T> set = this.mItems;
        this.mItems = null;
        Intrinsics.f(set);
        for (T t2 : set) {
            Intrinsics.f(t2);
            insert(t2.getPoint().f97555x, t2.getPoint().f97556y, t2);
        }
    }

    public final void add(T item) {
        Intrinsics.f(item);
        Point point = item.getPoint();
        if (this.mBounds.contains(point.f97555x, point.f97556y)) {
            insert(point.f97555x, point.f97556y, item);
        }
    }

    public final void clear() {
        this.mChildren = null;
        Set<T> set = this.mItems;
        if (set != null) {
            Intrinsics.f(set);
            set.clear();
        }
    }

    @NotNull
    public final Set<T> getAllChildrens() {
        return getAllChildrensOf(this);
    }

    @NotNull
    public final Bounds getMBounds() {
        return this.mBounds;
    }

    public final List<OzonPointQuadTree<T>> getMChildren() {
        return this.mChildren;
    }

    public final int getMDepth() {
        return this.mDepth;
    }

    public final Set<T> getMItems() {
        return this.mItems;
    }

    public final boolean remove(T item) {
        Intrinsics.f(item);
        Point point = item.getPoint();
        if (this.mBounds.contains(point.f97555x, point.f97556y)) {
            return remove(point.f97555x, point.f97556y, item);
        }
        return false;
    }

    @NotNull
    public final Collection<T> searchItems(@NotNull Bounds searchBounds) {
        Intrinsics.checkNotNullParameter(searchBounds, "searchBounds");
        ArrayList arrayList = new ArrayList();
        searchItems(searchBounds, arrayList);
        return arrayList;
    }

    @NotNull
    public final Collection<OzonPointQuadTree<T>> searchQuadsFitBoundsAndZoom(@NotNull Bounds searchBounds, float zoom) {
        List U02;
        Intrinsics.checkNotNullParameter(searchBounds, "searchBounds");
        ArrayList arrayList = new ArrayList();
        if (h.l(0.0f, 3.0f).c(Float.valueOf(zoom))) {
            List<OzonPointQuadTree<T>> list = this.mChildren;
            return (list == null || (U02 = C7714v.U0(list)) == null) ? K.f71697a : U02;
        }
        searchQuadsFitBoundsAndZoom(searchBounds, arrayList);
        return arrayList;
    }

    public final void setMChildren(List<OzonPointQuadTree<T>> list) {
        this.mChildren = list;
    }

    public final void setMItems(Set<T> set) {
        this.mItems = set;
    }

    private final void searchItems(Bounds searchBounds, Collection<T> results) {
        if (this.mBounds.intersects(searchBounds)) {
            List<OzonPointQuadTree<T>> list = this.mChildren;
            if (list != null) {
                Intrinsics.f(list);
                Iterator<OzonPointQuadTree<T>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().searchItems(searchBounds, results);
                }
                return;
            }
            if (this.mItems != null) {
                if (searchBounds.contains(this.mBounds)) {
                    Set<T> set = this.mItems;
                    Intrinsics.f(set);
                    for (T t2 : set) {
                        Intrinsics.f(t2);
                        if (!t2.isProcessed()) {
                            results.add(t2);
                        }
                    }
                    return;
                }
                Set<T> set2 = this.mItems;
                Intrinsics.f(set2);
                for (T t11 : set2) {
                    Intrinsics.f(t11);
                    if (searchBounds.contains(t11.getPoint()) && !t11.isProcessed()) {
                        results.add(t11);
                    }
                }
            }
        }
    }

    public OzonPointQuadTree(double d11, double d12, double d13, double d14) {
        this(new Bounds(d11, d12, d13, d14));
    }

    private final boolean remove(double x11, double y11, T item) {
        List<OzonPointQuadTree<T>> list = this.mChildren;
        if (list != null) {
            Bounds bounds = this.mBounds;
            if (y11 < bounds.midY) {
                if (x11 < bounds.midX) {
                    Intrinsics.f(list);
                    return list.get(0).remove(x11, y11, item);
                }
                Intrinsics.f(list);
                return list.get(1).remove(x11, y11, item);
            }
            if (x11 < bounds.midX) {
                Intrinsics.f(list);
                return list.get(2).remove(x11, y11, item);
            }
            Intrinsics.f(list);
            return list.get(3).remove(x11, y11, item);
        }
        Set<T> set = this.mItems;
        if (set == null) {
            return false;
        }
        Intrinsics.f(set);
        return set.remove(item);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OzonPointQuadTree(@NotNull Bounds bounds) {
        this(bounds, 0);
        Intrinsics.checkNotNullParameter(bounds, "bounds");
    }

    private OzonPointQuadTree(double d11, double d12, double d13, double d14, int i11) {
        this(new Bounds(d11, d12, d13, d14), i11);
    }

    private final void searchQuadsFitBoundsAndZoom(Bounds searchBounds, Collection<OzonPointQuadTree<T>> results) {
        List<OzonPointQuadTree<T>> list;
        if (this.mBounds.intersects(searchBounds) && this.mBounds.contains(searchBounds) && (list = this.mChildren) != null) {
            Intrinsics.f(list);
            if (list.isEmpty()) {
                return;
            }
            List<OzonPointQuadTree<T>> list2 = this.mChildren;
            Intrinsics.f(list2);
            for (OzonPointQuadTree<T> ozonPointQuadTree : list2) {
                boolean intersects = ozonPointQuadTree.mBounds.intersects(searchBounds);
                boolean contains = ozonPointQuadTree.mBounds.contains(searchBounds);
                if (intersects && !contains) {
                    results.add(ozonPointQuadTree);
                } else if (intersects && contains) {
                    ozonPointQuadTree.searchQuadsFitBoundsAndZoom(searchBounds, results);
                }
            }
        }
    }
}
