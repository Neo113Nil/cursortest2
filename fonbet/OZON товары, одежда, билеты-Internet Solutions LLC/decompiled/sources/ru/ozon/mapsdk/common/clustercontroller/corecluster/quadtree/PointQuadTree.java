package ru.ozon.mapsdk.common.clustercontroller.corecluster.quadtree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.geometry.Bounds;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.geometry.Point;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.quadtree.PointQuadTree.Item;

/* loaded from: classes3.dex */
public class PointQuadTree<T extends Item> {
    private static final int MAX_DEPTH = 40;
    private static final int MAX_ELEMENTS = 50;
    private final boolean isSupportProcessingItems;
    private final Bounds mBounds;
    private List<PointQuadTree<T>> mChildren;
    private final int mDepth;
    private Set<T> mItems;

    public interface Item {
        Point getPoint();

        boolean isProcessed();

        default boolean isSeparated() {
            return false;
        }
    }

    public PointQuadTree(double d11, double d12, double d13, double d14, boolean z11) {
        this(new Bounds(d11, d12, d13, d14), z11);
    }

    private void insert(double d11, double d12, T t2) {
        List<PointQuadTree<T>> list = this.mChildren;
        if (list == null) {
            if (this.mItems == null) {
                this.mItems = new LinkedHashSet();
            }
            this.mItems.add(t2);
            if (this.mItems.size() <= 50 || this.mDepth >= 40) {
                return;
            }
            split();
            return;
        }
        Bounds bounds = this.mBounds;
        if (d12 < bounds.midY) {
            if (d11 < bounds.midX) {
                list.get(0).insert(d11, d12, t2);
                return;
            } else {
                list.get(1).insert(d11, d12, t2);
                return;
            }
        }
        if (d11 < bounds.midX) {
            list.get(2).insert(d11, d12, t2);
        } else {
            list.get(3).insert(d11, d12, t2);
        }
    }

    private void split() {
        ArrayList arrayList = new ArrayList(4);
        this.mChildren = arrayList;
        Bounds bounds = this.mBounds;
        arrayList.add(new PointQuadTree(bounds.minX, bounds.midX, bounds.minY, bounds.midY, this.mDepth + 1, this.isSupportProcessingItems));
        List<PointQuadTree<T>> list = this.mChildren;
        Bounds bounds2 = this.mBounds;
        list.add(new PointQuadTree<>(bounds2.midX, bounds2.maxX, bounds2.minY, bounds2.midY, this.mDepth + 1, this.isSupportProcessingItems));
        List<PointQuadTree<T>> list2 = this.mChildren;
        Bounds bounds3 = this.mBounds;
        list2.add(new PointQuadTree<>(bounds3.minX, bounds3.midX, bounds3.midY, bounds3.maxY, this.mDepth + 1, this.isSupportProcessingItems));
        List<PointQuadTree<T>> list3 = this.mChildren;
        Bounds bounds4 = this.mBounds;
        list3.add(new PointQuadTree<>(bounds4.midX, bounds4.maxX, bounds4.midY, bounds4.maxY, this.mDepth + 1, this.isSupportProcessingItems));
        Set<T> set = this.mItems;
        this.mItems = null;
        for (T t2 : set) {
            insert(t2.getPoint().f97555x, t2.getPoint().f97556y, t2);
        }
    }

    public void add(T t2) {
        Point point = t2.getPoint();
        if (this.mBounds.contains(point.f97555x, point.f97556y)) {
            insert(point.f97555x, point.f97556y, t2);
        }
    }

    public void clear() {
        this.mChildren = null;
        Set<T> set = this.mItems;
        if (set != null) {
            set.clear();
        }
    }

    public boolean remove(T t2) {
        Point point = t2.getPoint();
        if (this.mBounds.contains(point.f97555x, point.f97556y)) {
            return remove(point.f97555x, point.f97556y, t2);
        }
        return false;
    }

    public Collection<T> searchItems(Bounds bounds) {
        ArrayList arrayList = new ArrayList();
        searchItems(bounds, arrayList);
        return arrayList;
    }

    public PointQuadTree(Bounds bounds, boolean z11) {
        this(bounds, 0, z11);
    }

    private PointQuadTree(double d11, double d12, double d13, double d14, int i11, boolean z11) {
        this(new Bounds(d11, d12, d13, d14), i11, z11);
    }

    private void searchItems(Bounds bounds, Collection<T> collection) {
        if (this.mBounds.intersects(bounds)) {
            List<PointQuadTree<T>> list = this.mChildren;
            if (list != null) {
                Iterator<PointQuadTree<T>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().searchItems(bounds, collection);
                }
                return;
            }
            Set<T> set = this.mItems;
            if (set == null || set.isEmpty()) {
                return;
            }
            boolean contains = bounds.contains(this.mBounds);
            if (!this.isSupportProcessingItems) {
                if (contains) {
                    collection.addAll(this.mItems);
                    return;
                }
                for (T t2 : this.mItems) {
                    if (bounds.contains(t2.getPoint())) {
                        collection.add(t2);
                    }
                }
                return;
            }
            if (contains) {
                for (T t11 : this.mItems) {
                    if (!t11.isProcessed()) {
                        collection.add(t11);
                    }
                }
                return;
            }
            for (T t12 : this.mItems) {
                if (!t12.isProcessed() && bounds.contains(t12.getPoint())) {
                    collection.add(t12);
                }
            }
        }
    }

    private PointQuadTree(Bounds bounds, int i11, boolean z11) {
        this.mChildren = null;
        this.mBounds = bounds;
        this.mDepth = i11;
        this.isSupportProcessingItems = z11;
    }

    private boolean remove(double d11, double d12, T t2) {
        List<PointQuadTree<T>> list = this.mChildren;
        if (list != null) {
            Bounds bounds = this.mBounds;
            if (d12 < bounds.midY) {
                if (d11 < bounds.midX) {
                    return list.get(0).remove(d11, d12, t2);
                }
                return list.get(1).remove(d11, d12, t2);
            }
            if (d11 < bounds.midX) {
                return list.get(2).remove(d11, d12, t2);
            }
            return list.get(3).remove(d11, d12, t2);
        }
        Set<T> set = this.mItems;
        if (set == null) {
            return false;
        }
        return set.remove(t2);
    }
}
