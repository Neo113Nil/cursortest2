package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.ScreenBasedAlgorithm;
import we0.k;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H¤@¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u0005J\u0010\u0010\u001b\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001e\u001a\u00020\u000b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fR&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!0 8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R&\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\b¨\u0006/"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/AbstractClusterCache;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/ClusterCache;", "<init>", "()V", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;", "algorithm", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;)V", "Lkotlin/ranges/IntRange;", "zoomRange", "", "checkZoomConditions", "(Lkotlin/ranges/IntRange;)V", "Lwe0/k;", "clusteringOptions", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/CalcCacheConfig;", "calcCacheConfig", "calcCache", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;Lkotlin/ranges/IntRange;Lwe0/k;Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/CalcCacheConfig;Lkotlin/coroutines/d;)Ljava/lang/Object;", "(Lwe0/k;Lkotlin/ranges/IntRange;Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/CalcCacheConfig;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "items", "addItems", "(Ljava/util/List;)V", "removeItems", "clearItems", "clearCacheSuspend", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "algo", "setCalcAlgorithmSuspend", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LAe/x0;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/ClusterCacheResult;", "preparedCacheMutable", "LAe/x0;", "getPreparedCacheMutable", "()LAe/x0;", "LAe/M0;", "preparedCache", "LAe/M0;", "getPreparedCache", "()LAe/M0;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;", "getAlgorithm", "()Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;", "setAlgorithm", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AbstractClusterCache<T extends ClusterItem> implements ClusterCache<T> {
    private Algorithm<T> algorithm;

    @NotNull
    private final M0<ClusterCacheResult<T>> preparedCache;

    @NotNull
    private final x0<ClusterCacheResult<T>> preparedCacheMutable;

    public AbstractClusterCache() {
        x0<ClusterCacheResult<T>> a11 = O0.a(new EmptyClusterCacheResult());
        this.preparedCacheMutable = a11;
        this.preparedCache = C2399j.b(a11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (r1.calcCache(r7, r3, r4, r5, r6) != r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T extends ClusterItem> Object calcCache$suspendImpl(AbstractClusterCache<T> abstractClusterCache, k kVar, IntRange intRange, CalcCacheConfig calcCacheConfig, d<? super Unit> dVar) {
        AbstractClusterCache$calcCache$1 abstractClusterCache$calcCache$1;
        int i11;
        AbstractClusterCache<T> abstractClusterCache2;
        Algorithm<T> algorithm;
        if (dVar instanceof AbstractClusterCache$calcCache$1) {
            abstractClusterCache$calcCache$1 = (AbstractClusterCache$calcCache$1) dVar;
            int i12 = abstractClusterCache$calcCache$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                abstractClusterCache$calcCache$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                AbstractClusterCache$calcCache$1 abstractClusterCache$calcCache$12 = abstractClusterCache$calcCache$1;
                Object obj = abstractClusterCache$calcCache$12.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = abstractClusterCache$calcCache$12.label;
                if (i11 != 0) {
                    s.b(obj);
                    Algorithm<T> algorithm2 = ((AbstractClusterCache) abstractClusterCache).algorithm;
                    if (algorithm2 == null) {
                        return Unit.f71690a;
                    }
                    abstractClusterCache.checkZoomConditions(intRange);
                    abstractClusterCache$calcCache$12.L$0 = abstractClusterCache;
                    abstractClusterCache$calcCache$12.L$1 = kVar;
                    abstractClusterCache$calcCache$12.L$2 = intRange;
                    abstractClusterCache$calcCache$12.L$3 = calcCacheConfig;
                    abstractClusterCache$calcCache$12.L$4 = algorithm2;
                    abstractClusterCache$calcCache$12.label = 1;
                    if (abstractClusterCache.clearCacheSuspend(abstractClusterCache$calcCache$12) != aVar) {
                        abstractClusterCache2 = abstractClusterCache;
                        algorithm = algorithm2;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                algorithm = (Algorithm) abstractClusterCache$calcCache$12.L$4;
                calcCacheConfig = (CalcCacheConfig) abstractClusterCache$calcCache$12.L$3;
                intRange = (IntRange) abstractClusterCache$calcCache$12.L$2;
                kVar = (k) abstractClusterCache$calcCache$12.L$1;
                abstractClusterCache2 = (AbstractClusterCache) abstractClusterCache$calcCache$12.L$0;
                s.b(obj);
                k kVar2 = kVar;
                IntRange intRange2 = intRange;
                CalcCacheConfig calcCacheConfig2 = calcCacheConfig;
                abstractClusterCache$calcCache$12.L$0 = null;
                abstractClusterCache$calcCache$12.L$1 = null;
                abstractClusterCache$calcCache$12.L$2 = null;
                abstractClusterCache$calcCache$12.L$3 = null;
                abstractClusterCache$calcCache$12.L$4 = null;
                abstractClusterCache$calcCache$12.label = 2;
            }
        }
        abstractClusterCache$calcCache$1 = new AbstractClusterCache$calcCache$1(abstractClusterCache, dVar);
        AbstractClusterCache$calcCache$1 abstractClusterCache$calcCache$122 = abstractClusterCache$calcCache$1;
        Object obj2 = abstractClusterCache$calcCache$122.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = abstractClusterCache$calcCache$122.label;
        if (i11 != 0) {
        }
        k kVar22 = kVar;
        IntRange intRange22 = intRange;
        CalcCacheConfig calcCacheConfig22 = calcCacheConfig;
        abstractClusterCache$calcCache$122.L$0 = null;
        abstractClusterCache$calcCache$122.L$1 = null;
        abstractClusterCache$calcCache$122.L$2 = null;
        abstractClusterCache$calcCache$122.L$3 = null;
        abstractClusterCache$calcCache$122.L$4 = null;
        abstractClusterCache$calcCache$122.label = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T extends ClusterItem> Object clearCacheSuspend$suspendImpl(AbstractClusterCache<T> abstractClusterCache, d<? super Unit> dVar) {
        AbstractClusterCache$clearCacheSuspend$1 abstractClusterCache$clearCacheSuspend$1;
        int i11;
        if (dVar instanceof AbstractClusterCache$clearCacheSuspend$1) {
            abstractClusterCache$clearCacheSuspend$1 = (AbstractClusterCache$clearCacheSuspend$1) dVar;
            int i12 = abstractClusterCache$clearCacheSuspend$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                abstractClusterCache$clearCacheSuspend$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = abstractClusterCache$clearCacheSuspend$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = abstractClusterCache$clearCacheSuspend$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    ClusterCacheResult<T> value = ((AbstractClusterCache) abstractClusterCache).preparedCacheMutable.getValue();
                    abstractClusterCache$clearCacheSuspend$1.L$0 = abstractClusterCache;
                    abstractClusterCache$clearCacheSuspend$1.label = 1;
                    if (value.clearSuspend(abstractClusterCache$clearCacheSuspend$1) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractClusterCache = (AbstractClusterCache) abstractClusterCache$clearCacheSuspend$1.L$0;
                    s.b(obj);
                }
                ((AbstractClusterCache) abstractClusterCache).preparedCacheMutable.setValue(new EmptyClusterCacheResult());
                return Unit.f71690a;
            }
        }
        abstractClusterCache$clearCacheSuspend$1 = new AbstractClusterCache$clearCacheSuspend$1(abstractClusterCache, dVar);
        Object obj2 = abstractClusterCache$clearCacheSuspend$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = abstractClusterCache$clearCacheSuspend$1.label;
        if (i11 != 0) {
        }
        ((AbstractClusterCache) abstractClusterCache).preparedCacheMutable.setValue(new EmptyClusterCacheResult());
        return Unit.f71690a;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCache
    public void addItems(@NotNull List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Algorithm<T> algorithm = this.algorithm;
        if (algorithm != null) {
            algorithm.addItems(items);
        }
    }

    protected abstract Object calcCache(@NotNull Algorithm<T> algorithm, @NotNull IntRange intRange, @NotNull k kVar, @NotNull CalcCacheConfig calcCacheConfig, @NotNull d<? super Unit> dVar);

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCache
    public Object calcCache(@NotNull k kVar, @NotNull IntRange intRange, @NotNull CalcCacheConfig calcCacheConfig, @NotNull d<? super Unit> dVar) {
        return calcCache$suspendImpl(this, kVar, intRange, calcCacheConfig, dVar);
    }

    protected final void checkZoomConditions(@NotNull IntRange zoomRange) {
        Intrinsics.checkNotNullParameter(zoomRange, "zoomRange");
        if (zoomRange.getF71842a() < 0 || zoomRange.getF71843b() < 0) {
            throw new IllegalArgumentException(new IllegalArgumentException("minZoomLevelOfCalc and maxZoomLevelOfCalc must be positive").toString());
        }
        if (zoomRange.getF71842a() > zoomRange.getF71843b()) {
            throw new IllegalArgumentException(new IllegalArgumentException("minZoomLevelOfCalc must be less or equal maxZoomLevelOfCalc").toString());
        }
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCache
    public Object clearCacheSuspend(@NotNull d<? super Unit> dVar) {
        return clearCacheSuspend$suspendImpl(this, dVar);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCache
    public void clearItems() {
        Algorithm<T> algorithm = this.algorithm;
        if (algorithm != null) {
            algorithm.clearItems();
        }
    }

    protected final Algorithm<T> getAlgorithm() {
        return this.algorithm;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCache
    @NotNull
    public M0<ClusterCacheResult<T>> getPreparedCache() {
        return this.preparedCache;
    }

    @NotNull
    protected final x0<ClusterCacheResult<T>> getPreparedCacheMutable() {
        return this.preparedCacheMutable;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCache
    public void removeItems(@NotNull List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Algorithm<T> algorithm = this.algorithm;
        if (algorithm != null) {
            algorithm.removeItems(items);
        }
    }

    protected final void setAlgorithm(Algorithm<T> algorithm) {
        this.algorithm = algorithm;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setCalcAlgorithmSuspend(@NotNull Algorithm<T> algorithm, @NotNull d<? super Unit> dVar) {
        AbstractClusterCache$setCalcAlgorithmSuspend$1 abstractClusterCache$setCalcAlgorithmSuspend$1;
        int i11;
        AbstractClusterCache<T> abstractClusterCache;
        if (dVar instanceof AbstractClusterCache$setCalcAlgorithmSuspend$1) {
            abstractClusterCache$setCalcAlgorithmSuspend$1 = (AbstractClusterCache$setCalcAlgorithmSuspend$1) dVar;
            int i12 = abstractClusterCache$setCalcAlgorithmSuspend$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                abstractClusterCache$setCalcAlgorithmSuspend$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = abstractClusterCache$setCalcAlgorithmSuspend$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = abstractClusterCache$setCalcAlgorithmSuspend$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    if (algorithm instanceof ScreenBasedAlgorithm) {
                        return Unit.f71690a;
                    }
                    clearItems();
                    abstractClusterCache$setCalcAlgorithmSuspend$1.L$0 = this;
                    abstractClusterCache$setCalcAlgorithmSuspend$1.L$1 = algorithm;
                    abstractClusterCache$setCalcAlgorithmSuspend$1.label = 1;
                    if (clearCacheSuspend(abstractClusterCache$setCalcAlgorithmSuspend$1) == aVar) {
                        return aVar;
                    }
                    abstractClusterCache = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    algorithm = (Algorithm) abstractClusterCache$setCalcAlgorithmSuspend$1.L$1;
                    abstractClusterCache = (AbstractClusterCache) abstractClusterCache$setCalcAlgorithmSuspend$1.L$0;
                    s.b(obj);
                }
                abstractClusterCache.algorithm = algorithm;
                return Unit.f71690a;
            }
        }
        abstractClusterCache$setCalcAlgorithmSuspend$1 = new AbstractClusterCache$setCalcAlgorithmSuspend$1(this, dVar);
        Object obj2 = abstractClusterCache$setCalcAlgorithmSuspend$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = abstractClusterCache$setCalcAlgorithmSuspend$1.label;
        if (i11 != 0) {
        }
        abstractClusterCache.algorithm = algorithm;
        return Unit.f71690a;
    }

    public AbstractClusterCache(Algorithm<T> algorithm) {
        x0<ClusterCacheResult<T>> a11 = O0.a(new EmptyClusterCacheResult());
        this.preparedCacheMutable = a11;
        this.preparedCache = C2399j.b(a11);
        this.algorithm = algorithm;
    }
}
