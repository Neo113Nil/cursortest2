package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache;

import Ae.M0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import we0.k;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u001f*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u001fJ\u001e\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/ClusterCache;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;", "algo", "", "setCalcAlgorithmSuspend", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "items", "addItems", "(Ljava/util/List;)V", "removeItems", "clearItems", "()V", "clearCacheSuspend", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lwe0/k;", "clusteringOptions", "Lkotlin/ranges/IntRange;", "zoomRange", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/CalcCacheConfig;", "calcCacheConfig", "calcCache", "(Lwe0/k;Lkotlin/ranges/IntRange;Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/CalcCacheConfig;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LAe/M0;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/ClusterCacheResult;", "getPreparedCache", "()LAe/M0;", "preparedCache", "Companion", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ClusterCache<T extends ClusterItem> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int MAX_SUPPORTED_ZOOM = 24;
    public static final int MAX_ZOOM_OF_CALC = 12;
    public static final int MIN_SUPPORTED_ZOOM = 0;
    public static final int MIN_ZOOM_OF_CALC = 1;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/ClusterCache$Companion;", "", "<init>", "()V", "MIN_ZOOM_OF_CALC", "", "MAX_ZOOM_OF_CALC", "MIN_SUPPORTED_ZOOM", "MAX_SUPPORTED_ZOOM", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int MAX_SUPPORTED_ZOOM = 24;
        public static final int MAX_ZOOM_OF_CALC = 12;
        public static final int MIN_SUPPORTED_ZOOM = 0;
        public static final int MIN_ZOOM_OF_CALC = 1;

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Object calcCache$default(ClusterCache clusterCache, k kVar, IntRange intRange, CalcCacheConfig calcCacheConfig, d dVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calcCache");
            }
            if ((i11 & 2) != 0) {
                intRange = new IntRange(1, 12, 1);
            }
            if ((i11 & 4) != 0) {
                calcCacheConfig = new CalcCacheConfig(false, 1, null);
            }
            return clusterCache.calcCache(kVar, intRange, calcCacheConfig, dVar);
        }

        public static <T extends ClusterItem> Object clearCacheSuspend(@NotNull ClusterCache<T> clusterCache, @NotNull d<? super Unit> dVar) {
            return Unit.f71690a;
        }

        public static <T extends ClusterItem> Object setCalcAlgorithmSuspend(@NotNull ClusterCache<T> clusterCache, @NotNull Algorithm<T> algorithm, @NotNull d<? super Unit> dVar) {
            return Unit.f71690a;
        }
    }

    void addItems(@NotNull List<? extends T> items);

    Object calcCache(@NotNull k kVar, @NotNull IntRange intRange, @NotNull CalcCacheConfig calcCacheConfig, @NotNull d<? super Unit> dVar);

    Object clearCacheSuspend(@NotNull d<? super Unit> dVar);

    void clearItems();

    @NotNull
    M0<ClusterCacheResult<T>> getPreparedCache();

    void removeItems(@NotNull List<? extends T> items);

    Object setCalcAlgorithmSuspend(@NotNull Algorithm<T> algorithm, @NotNull d<? super Unit> dVar);
}
