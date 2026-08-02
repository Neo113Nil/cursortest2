package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering;

import java.util.Collection;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import we0.m;

/* loaded from: classes3.dex */
public interface Cluster<T extends ClusterItem> {
    Collection<T> getItems();

    m getPosition();

    int getSize();
}
