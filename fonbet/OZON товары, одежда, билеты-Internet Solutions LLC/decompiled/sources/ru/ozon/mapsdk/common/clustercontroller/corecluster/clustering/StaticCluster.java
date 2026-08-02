package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import we0.m;

/* loaded from: classes3.dex */
public class StaticCluster<T extends ClusterItem> implements Cluster<T> {
    private boolean isNeedUpdateCenter;
    private m mCenter;
    private Collection<T> mItems;
    private double sumLat;
    private double sumLngX;
    private double sumLngY;

    public StaticCluster() {
        this.mCenter = new m(0.0d, 0.0d);
        this.sumLat = 0.0d;
        this.sumLngX = 0.0d;
        this.sumLngY = 0.0d;
        this.isNeedUpdateCenter = false;
        this.mItems = new LinkedHashSet();
    }

    private void updateCenter() {
        int size = this.mItems.size();
        if (size > 0) {
            this.mCenter = new m(this.sumLat / size, ((Math.toDegrees(Math.atan2(this.sumLngY, this.sumLngX)) + 540.0d) % 360.0d) - 180.0d);
        } else {
            this.mCenter = new m(0.0d, 0.0d);
        }
        this.isNeedUpdateCenter = false;
    }

    public boolean add(T t2) {
        this.sumLat = t2.getPosition().getLatitude() + this.sumLat;
        double radians = Math.toRadians(t2.getPosition().getLongitude());
        this.sumLngX = Math.cos(radians) + this.sumLngX;
        this.sumLngY = Math.sin(radians) + this.sumLngY;
        this.isNeedUpdateCenter = true;
        return this.mItems.add(t2);
    }

    public void addAll(Collection<T> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StaticCluster)) {
            return false;
        }
        StaticCluster staticCluster = (StaticCluster) obj;
        return staticCluster.mCenter.equals(this.mCenter) && staticCluster.mItems.equals(this.mItems);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.Cluster
    public Collection<T> getItems() {
        return this.mItems;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.Cluster
    public m getPosition() {
        if (this.isNeedUpdateCenter) {
            updateCenter();
        }
        return this.mCenter;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.Cluster
    public int getSize() {
        return this.mItems.size();
    }

    public int hashCode() {
        return this.mItems.hashCode() + this.mCenter.hashCode();
    }

    public boolean remove(T t2) {
        boolean remove = this.mItems.remove(t2);
        if (remove) {
            this.sumLat -= t2.getPosition().getLatitude();
            double radians = Math.toRadians(t2.getPosition().getLongitude());
            this.sumLngX -= Math.cos(radians);
            this.sumLngY -= Math.sin(radians);
            this.isNeedUpdateCenter = true;
        }
        return remove;
    }

    public void switchToSimpleCollection() {
        Collection<T> collection = this.mItems;
        this.mItems = new ArrayList(this.mItems);
        collection.clear();
    }

    @NonNull
    public String toString() {
        return "StaticCluster{mCenter=" + this.mCenter + ", mItems.size=" + this.mItems.size() + '}';
    }

    public StaticCluster(m mVar) {
        this.mCenter = new m(0.0d, 0.0d);
        this.sumLat = 0.0d;
        this.sumLngX = 0.0d;
        this.sumLngY = 0.0d;
        this.isNeedUpdateCenter = false;
        this.mItems = new LinkedHashSet();
        this.mCenter = mVar;
    }

    public StaticCluster(T t2) {
        this.mCenter = new m(0.0d, 0.0d);
        this.sumLat = 0.0d;
        this.sumLngX = 0.0d;
        this.sumLngY = 0.0d;
        this.isNeedUpdateCenter = false;
        this.mItems = new LinkedHashSet();
        this.mCenter = t2.getPosition();
        add(t2);
    }
}
