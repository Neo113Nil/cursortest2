package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.runtime;

import Ae.x0;
import He.c;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCache;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.CalcCacheConfig;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCacheResult;
import we0.k;
import we0.u;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J6\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0094@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/runtime/RuntimeClusterCache;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/AbstractClusterCache;", "Lwe0/u;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;", "algorithm", "<init>", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;)V", "()V", "Lkotlin/ranges/IntRange;", "zoomRange", "Lwe0/k;", "clusteringOptions", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/CalcCacheConfig;", "calcCacheConfig", "", "calcCache", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;Lkotlin/ranges/IntRange;Lwe0/k;Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/CalcCacheConfig;Lkotlin/coroutines/d;)Ljava/lang/Object;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RuntimeClusterCache extends AbstractClusterCache<u> {
    public /* synthetic */ RuntimeClusterCache(Algorithm algorithm, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : algorithm);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (r0.emit(r3, r1) != r2) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Object calcCache(@NotNull Algorithm<u> algorithm, @NotNull IntRange intRange, @NotNull k kVar, @NotNull CalcCacheConfig calcCacheConfig, @NotNull d<? super Unit> dVar) {
        RuntimeClusterCache$calcCache$1 runtimeClusterCache$calcCache$1;
        int i11;
        k kVar2;
        RuntimeClusterCache runtimeClusterCache;
        Map map;
        if (dVar instanceof RuntimeClusterCache$calcCache$1) {
            runtimeClusterCache$calcCache$1 = (RuntimeClusterCache$calcCache$1) dVar;
            int i12 = runtimeClusterCache$calcCache$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                runtimeClusterCache$calcCache$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = runtimeClusterCache$calcCache$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = runtimeClusterCache$calcCache$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    HashMap hashMap = new HashMap();
                    c a11 = C10720e0.a();
                    kVar2 = kVar;
                    RuntimeClusterCache$calcCache$2 runtimeClusterCache$calcCache$2 = new RuntimeClusterCache$calcCache$2(calcCacheConfig, intRange, hashMap, algorithm, kVar2, null);
                    runtimeClusterCache$calcCache$1.L$0 = this;
                    runtimeClusterCache$calcCache$1.L$1 = kVar2;
                    runtimeClusterCache$calcCache$1.L$2 = hashMap;
                    runtimeClusterCache$calcCache$1.label = 1;
                    if (C10727i.f(a11, runtimeClusterCache$calcCache$2, runtimeClusterCache$calcCache$1) != aVar) {
                        runtimeClusterCache = this;
                        map = hashMap;
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
                map = (Map) runtimeClusterCache$calcCache$1.L$2;
                k kVar3 = (k) runtimeClusterCache$calcCache$1.L$1;
                runtimeClusterCache = (RuntimeClusterCache) runtimeClusterCache$calcCache$1.L$0;
                s.b(obj);
                kVar2 = kVar3;
                x0<ClusterCacheResult<u>> preparedCacheMutable = runtimeClusterCache.getPreparedCacheMutable();
                RuntimeClusterCacheResult runtimeClusterCacheResult = new RuntimeClusterCacheResult(kVar2, map);
                runtimeClusterCache$calcCache$1.L$0 = null;
                runtimeClusterCache$calcCache$1.L$1 = null;
                runtimeClusterCache$calcCache$1.L$2 = null;
                runtimeClusterCache$calcCache$1.label = 2;
            }
        }
        runtimeClusterCache$calcCache$1 = new RuntimeClusterCache$calcCache$1(this, dVar);
        Object obj2 = runtimeClusterCache$calcCache$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = runtimeClusterCache$calcCache$1.label;
        if (i11 != 0) {
        }
        x0<ClusterCacheResult<u>> preparedCacheMutable2 = runtimeClusterCache.getPreparedCacheMutable();
        RuntimeClusterCacheResult runtimeClusterCacheResult2 = new RuntimeClusterCacheResult(kVar2, map);
        runtimeClusterCache$calcCache$1.L$0 = null;
        runtimeClusterCache$calcCache$1.L$1 = null;
        runtimeClusterCache$calcCache$1.L$2 = null;
        runtimeClusterCache$calcCache$1.label = 2;
    }

    public RuntimeClusterCache(Algorithm<u> algorithm) {
        super(algorithm);
    }

    public RuntimeClusterCache() {
        this(null);
    }
}
