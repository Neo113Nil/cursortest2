package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import we0.k;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u0000 (*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001(J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\u0010\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH&¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH¦@¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001c\u0010'\u001a\u00020\"8&@&X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "", "", "id", "getItemById", "(Ljava/lang/String;)Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "item", "", "addItem", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;)Z", "", "items", "addItems", "(Ljava/util/Collection;)Z", "removeItem", "removeItemById", "(Ljava/lang/String;)Z", "removeItems", "updateItem", "isItemExist", "", "clearItems", "()V", "", "zoom", "Lwe0/k;", "clusteringOptions", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "getClusters", "(FLwe0/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getItems", "()Ljava/util/Collection;", "", "getMaxDistanceBetweenClusteredItems", "()I", "setMaxDistanceBetweenClusteredItems", "(I)V", "maxDistanceBetweenClusteredItems", "Companion", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Algorithm<T extends ClusterItem> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int STANDARD_TILE_SIZE = 256;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm$Companion;", "", "<init>", "()V", "STANDARD_TILE_SIZE", "", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int STANDARD_TILE_SIZE = 256;

        private Companion() {
        }
    }

    boolean addItem(@NotNull T item);

    boolean addItems(@NotNull Collection<? extends T> items);

    void clearItems();

    Object getClusters(float f7, @NotNull k kVar, @NotNull d<? super ClusterizingResult<T>> dVar);

    T getItemById(@NotNull String id2);

    @NotNull
    Collection<T> getItems();

    int getMaxDistanceBetweenClusteredItems();

    boolean isItemExist(@NotNull String id2);

    boolean removeItem(@NotNull T item);

    boolean removeItemById(@NotNull String id2);

    boolean removeItems(@NotNull Collection<? extends T> items);

    void setMaxDistanceBetweenClusteredItems(int i11);

    boolean updateItem(@NotNull T item);
}
