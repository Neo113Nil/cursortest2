package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator;

import Ae.M0;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.collections.M;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.ScreenBasedAlgorithm;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCacheResult;
import we0.k;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u001d*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001\u001dB/\b\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R0\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0018\u00010\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/decorator/ClusterCacheScreenBasedAlgorithmDecorator;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/decorator/ScreenBasedAlgorithmDecorator;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/decorator/ClusterCacheDecorator;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/ScreenBasedAlgorithm;", "algorithm", "LAe/M0;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/ClusterCacheResult;", "initClusterCacheResult", "<init>", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/ScreenBasedAlgorithm;LAe/M0;)V", "", "zoom", "Lwe0/k;", "clusteringOptions", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "getClusters", "(FLwe0/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getClustersForSameZoomLevel", "", "isUseCache", "Z", "clusterCacheResult", "LAe/M0;", "getClusterCacheResult", "()LAe/M0;", "setClusterCacheResult", "(LAe/M0;)V", "Companion", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClusterCacheScreenBasedAlgorithmDecorator<T extends ClusterItem> extends ScreenBasedAlgorithmDecorator<T> implements ClusterCacheDecorator<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private M0<? extends ClusterCacheResult<T>> clusterCacheResult;
    private boolean isUseCache;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b\"\b\b\u0001\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0018\u00010\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/decorator/ClusterCacheScreenBasedAlgorithmDecorator$Companion;", "", "<init>", "()V", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;", "algorithm", "LAe/M0;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/ClusterCacheResult;", "clusterCacheResult", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/decorator/ClusterCacheScreenBasedAlgorithmDecorator;", "create", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;LAe/M0;)Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/decorator/ClusterCacheScreenBasedAlgorithmDecorator;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ClusterCacheScreenBasedAlgorithmDecorator create$default(Companion companion, Algorithm algorithm, M0 m02, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                m02 = null;
            }
            return companion.create(algorithm, m02);
        }

        public final <T extends ClusterItem> ClusterCacheScreenBasedAlgorithmDecorator<T> create(@NotNull Algorithm<T> algorithm, M0<? extends ClusterCacheResult<T>> clusterCacheResult) {
            Intrinsics.checkNotNullParameter(algorithm, "algorithm");
            if ((algorithm instanceof ClusterCacheDecorator) || !(algorithm instanceof ScreenBasedAlgorithm)) {
                return null;
            }
            return new ClusterCacheScreenBasedAlgorithmDecorator<>((ScreenBasedAlgorithm) algorithm, clusterCacheResult);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ClusterCacheScreenBasedAlgorithmDecorator(ScreenBasedAlgorithm screenBasedAlgorithm, M0 m02, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(screenBasedAlgorithm, (i11 & 2) != 0 ? null : m02);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator.ClusterCacheDecorator
    public M0<ClusterCacheResult<T>> getClusterCacheResult() {
        return this.clusterCacheResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator.ScreenBasedAlgorithmDecorator, ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getClusters(float f7, @NotNull k kVar, @NotNull d<? super ClusterizingResult<T>> dVar) {
        ClusterCacheScreenBasedAlgorithmDecorator$getClusters$1 clusterCacheScreenBasedAlgorithmDecorator$getClusters$1;
        int i11;
        ClusterCacheScreenBasedAlgorithmDecorator<T> clusterCacheScreenBasedAlgorithmDecorator;
        ClusterizingResult clusterizingResult;
        ClusterCacheResult<T> value;
        if (dVar instanceof ClusterCacheScreenBasedAlgorithmDecorator$getClusters$1) {
            clusterCacheScreenBasedAlgorithmDecorator$getClusters$1 = (ClusterCacheScreenBasedAlgorithmDecorator$getClusters$1) dVar;
            int i12 = clusterCacheScreenBasedAlgorithmDecorator$getClusters$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                clusterCacheScreenBasedAlgorithmDecorator$getClusters$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = clusterCacheScreenBasedAlgorithmDecorator$getClusters$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = clusterCacheScreenBasedAlgorithmDecorator$getClusters$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    M0<ClusterCacheResult<T>> clusterCacheResult = getClusterCacheResult();
                    if (clusterCacheResult != null && (value = clusterCacheResult.getValue()) != null) {
                        clusterCacheScreenBasedAlgorithmDecorator$getClusters$1.L$0 = this;
                        clusterCacheScreenBasedAlgorithmDecorator$getClusters$1.L$1 = kVar;
                        clusterCacheScreenBasedAlgorithmDecorator$getClusters$1.F$0 = f7;
                        clusterCacheScreenBasedAlgorithmDecorator$getClusters$1.label = 1;
                        obj = value.getClustersFromZoomLevel((int) f7, kVar, clusterCacheScreenBasedAlgorithmDecorator$getClusters$1);
                        if (obj != aVar) {
                            clusterCacheScreenBasedAlgorithmDecorator = this;
                        }
                    }
                    clusterCacheScreenBasedAlgorithmDecorator = this;
                    clusterizingResult = null;
                    clusterCacheScreenBasedAlgorithmDecorator.isUseCache = clusterizingResult != null;
                    if (clusterizingResult != null) {
                        return clusterizingResult;
                    }
                    ScreenBasedAlgorithm<T> algorithm = clusterCacheScreenBasedAlgorithmDecorator.getAlgorithm();
                    clusterCacheScreenBasedAlgorithmDecorator$getClusters$1.L$0 = null;
                    clusterCacheScreenBasedAlgorithmDecorator$getClusters$1.L$1 = null;
                    clusterCacheScreenBasedAlgorithmDecorator$getClusters$1.label = 2;
                    Object clusters = algorithm.getClusters(f7, kVar, clusterCacheScreenBasedAlgorithmDecorator$getClusters$1);
                    return clusters == aVar ? aVar : clusters;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return obj;
                }
                f7 = clusterCacheScreenBasedAlgorithmDecorator$getClusters$1.F$0;
                kVar = (k) clusterCacheScreenBasedAlgorithmDecorator$getClusters$1.L$1;
                clusterCacheScreenBasedAlgorithmDecorator = (ClusterCacheScreenBasedAlgorithmDecorator) clusterCacheScreenBasedAlgorithmDecorator$getClusters$1.L$0;
                s.b(obj);
                clusterizingResult = (ClusterizingResult) obj;
                clusterCacheScreenBasedAlgorithmDecorator.isUseCache = clusterizingResult != null;
                if (clusterizingResult != null) {
                }
            }
        }
        clusterCacheScreenBasedAlgorithmDecorator$getClusters$1 = new ClusterCacheScreenBasedAlgorithmDecorator$getClusters$1(this, dVar);
        Object obj2 = clusterCacheScreenBasedAlgorithmDecorator$getClusters$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = clusterCacheScreenBasedAlgorithmDecorator$getClusters$1.label;
        if (i11 != 0) {
        }
        clusterizingResult = (ClusterizingResult) obj2;
        clusterCacheScreenBasedAlgorithmDecorator.isUseCache = clusterizingResult != null;
        if (clusterizingResult != null) {
        }
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator.ScreenBasedAlgorithmDecorator, ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.ScreenBasedAlgorithm
    public Object getClustersForSameZoomLevel(float f7, @NotNull k kVar, @NotNull d<? super ClusterizingResult<T>> dVar) {
        return this.isUseCache ? new ClusterizingResult(M.f71699a, K.f71697a) : getAlgorithm().getClustersForSameZoomLevel(f7, kVar, dVar);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator.ClusterCacheDecorator
    public void setClusterCacheResult(M0<? extends ClusterCacheResult<T>> m02) {
        this.clusterCacheResult = m02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClusterCacheScreenBasedAlgorithmDecorator(@NotNull ScreenBasedAlgorithm<T> algorithm, M0<? extends ClusterCacheResult<T>> m02) {
        super(algorithm);
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        this.clusterCacheResult = m02;
    }
}
