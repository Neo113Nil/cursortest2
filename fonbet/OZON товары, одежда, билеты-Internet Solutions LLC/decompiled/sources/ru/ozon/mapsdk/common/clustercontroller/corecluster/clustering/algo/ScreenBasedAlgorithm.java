package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import we0.C10551g;
import we0.k;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/ScreenBasedAlgorithm;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;", "Lwe0/g;", "cameraPosition", "", "onCameraChange", "(Lwe0/g;)V", "", "width", "height", "updateViewSize", "(II)V", "", "zoom", "Lwe0/k;", "clusteringOptions", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "getClustersForSameZoomLevel", "(FLwe0/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ScreenBasedAlgorithm<T extends ClusterItem> extends Algorithm<T> {
    Object getClustersForSameZoomLevel(float f7, @NotNull k kVar, @NotNull d<? super ClusterizingResult<T>> dVar);

    void onCameraChange(@NotNull C10551g cameraPosition);

    void updateViewSize(int width, int height);
}
