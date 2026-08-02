package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.lru;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCache;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.CalcCacheConfig;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCacheResult;
import we0.k;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ6\u0010\u0012\u001a\u00020\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0094@¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/lru/LruClusterCache;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/AbstractClusterCache;", "", "lruCapacity", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;", "initialAlgorithm", "<init>", "(ILru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;)V", "algorithm", "Lkotlin/ranges/IntRange;", "zoomRange", "Lwe0/k;", "clusteringOptions", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/CalcCacheConfig;", "calcCacheConfig", "", "calcCache", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;Lkotlin/ranges/IntRange;Lwe0/k;Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/CalcCacheConfig;Lkotlin/coroutines/d;)Ljava/lang/Object;", "(Lwe0/k;Lkotlin/ranges/IntRange;Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/CalcCacheConfig;Lkotlin/coroutines/d;)Ljava/lang/Object;", "I", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/lru/LruClusterCacheResult;", "getExistLruCache", "()Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/lru/LruClusterCacheResult;", "existLruCache", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LruClusterCache<T extends ClusterItem> extends AbstractClusterCache<T> {
    private final int lruCapacity;

    public /* synthetic */ LruClusterCache(int i11, Algorithm algorithm, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : algorithm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LruClusterCacheResult<T> getExistLruCache() {
        ClusterCacheResult<T> value = getPreparedCache().getValue();
        if (value instanceof LruClusterCacheResult) {
            return (LruClusterCacheResult) value;
        }
        return null;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCache
    protected Object calcCache(@NotNull Algorithm<T> algorithm, @NotNull IntRange intRange, @NotNull k kVar, @NotNull CalcCacheConfig calcCacheConfig, @NotNull d<? super Unit> dVar) {
        Object f7 = C10727i.f(C10720e0.a(), new LruClusterCache$calcCache$2(this, kVar, intRange, algorithm, null), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    public LruClusterCache(int i11, Algorithm<T> algorithm) {
        super(algorithm);
        this.lruCapacity = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        if (r1.calcCache(r11, r3, r8, r5, r6) == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCache, ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object calcCache(@NotNull k kVar, @NotNull IntRange intRange, @NotNull CalcCacheConfig calcCacheConfig, @NotNull d<? super Unit> dVar) {
        LruClusterCache$calcCache$3 lruClusterCache$calcCache$3;
        int i11;
        Algorithm<T> algorithm;
        LruClusterCache<T> lruClusterCache;
        IntRange intRange2;
        CalcCacheConfig calcCacheConfig2;
        LruClusterCache<T> lruClusterCache2;
        if (dVar instanceof LruClusterCache$calcCache$3) {
            lruClusterCache$calcCache$3 = (LruClusterCache$calcCache$3) dVar;
            int i12 = lruClusterCache$calcCache$3.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                lruClusterCache$calcCache$3.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                LruClusterCache$calcCache$3 lruClusterCache$calcCache$32 = lruClusterCache$calcCache$3;
                Object obj = lruClusterCache$calcCache$32.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = lruClusterCache$calcCache$32.label;
                if (i11 != 0) {
                    s.b(obj);
                    algorithm = getAlgorithm();
                    if (algorithm == null) {
                        return Unit.f71690a;
                    }
                    checkZoomConditions(intRange);
                    LruClusterCacheResult<T> existLruCache = getExistLruCache();
                    if (!Intrinsics.d(existLruCache != null ? existLruCache.getClusteringOptions() : null, kVar)) {
                        lruClusterCache$calcCache$32.L$0 = this;
                        lruClusterCache$calcCache$32.L$1 = kVar;
                        lruClusterCache$calcCache$32.L$2 = intRange;
                        lruClusterCache$calcCache$32.L$3 = calcCacheConfig;
                        lruClusterCache$calcCache$32.L$4 = algorithm;
                        lruClusterCache$calcCache$32.label = 1;
                        if (clearCacheSuspend(lruClusterCache$calcCache$32) != aVar) {
                            lruClusterCache2 = this;
                        }
                        return aVar;
                    }
                    lruClusterCache = this;
                    intRange2 = intRange;
                    calcCacheConfig2 = calcCacheConfig;
                    lruClusterCache$calcCache$32.L$0 = null;
                    lruClusterCache$calcCache$32.L$1 = null;
                    lruClusterCache$calcCache$32.L$2 = null;
                    lruClusterCache$calcCache$32.L$3 = null;
                    lruClusterCache$calcCache$32.L$4 = null;
                    lruClusterCache$calcCache$32.label = 2;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    Algorithm<T> algorithm2 = (Algorithm) lruClusterCache$calcCache$32.L$4;
                    calcCacheConfig = (CalcCacheConfig) lruClusterCache$calcCache$32.L$3;
                    intRange = (IntRange) lruClusterCache$calcCache$32.L$2;
                    k kVar2 = (k) lruClusterCache$calcCache$32.L$1;
                    lruClusterCache2 = (LruClusterCache) lruClusterCache$calcCache$32.L$0;
                    s.b(obj);
                    algorithm = algorithm2;
                    kVar = kVar2;
                }
                lruClusterCache = lruClusterCache2;
                calcCacheConfig2 = calcCacheConfig;
                intRange2 = intRange;
                lruClusterCache$calcCache$32.L$0 = null;
                lruClusterCache$calcCache$32.L$1 = null;
                lruClusterCache$calcCache$32.L$2 = null;
                lruClusterCache$calcCache$32.L$3 = null;
                lruClusterCache$calcCache$32.L$4 = null;
                lruClusterCache$calcCache$32.label = 2;
            }
        }
        lruClusterCache$calcCache$3 = new LruClusterCache$calcCache$3(this, dVar);
        LruClusterCache$calcCache$3 lruClusterCache$calcCache$322 = lruClusterCache$calcCache$3;
        Object obj2 = lruClusterCache$calcCache$322.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = lruClusterCache$calcCache$322.label;
        if (i11 != 0) {
        }
        lruClusterCache = lruClusterCache2;
        calcCacheConfig2 = calcCacheConfig;
        intRange2 = intRange;
        lruClusterCache$calcCache$322.L$0 = null;
        lruClusterCache$calcCache$322.L$1 = null;
        lruClusterCache$calcCache$322.L$2 = null;
        lruClusterCache$calcCache$322.L$3 = null;
        lruClusterCache$calcCache$322.L$4 = null;
        lruClusterCache$calcCache$322.label = 2;
    }
}
