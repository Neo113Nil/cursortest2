package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file;

import Ae.x0;
import He.c;
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
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCache;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.CalcCacheConfig;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCacheResult;
import we0.k;
import we0.u;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\b\u0010\nJ6\u0010\u0012\u001a\u00020\u00112\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0094@¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/file/FlatBufferClusterCache;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/AbstractClusterCache;", "Lwe0/u;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/file/FileManager;", "", "fileManager", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;", "algorithm", "<init>", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/file/FileManager;Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;)V", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/file/FileManager;)V", "Lkotlin/ranges/IntRange;", "zoomRange", "Lwe0/k;", "clusteringOptions", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/CalcCacheConfig;", "calcCacheConfig", "", "calcCache", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;Lkotlin/ranges/IntRange;Lwe0/k;Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/CalcCacheConfig;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/file/FileManager;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlatBufferClusterCache extends AbstractClusterCache<u> {

    @NotNull
    private final FileManager<byte[]> fileManager;

    public /* synthetic */ FlatBufferClusterCache(FileManager fileManager, Algorithm algorithm, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fileManager, (i11 & 2) != 0 ? null : algorithm);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c9, code lost:
    
        if (r2.emit(r1, r3) != r4) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Object calcCache(@NotNull Algorithm<u> algorithm, @NotNull IntRange intRange, @NotNull k kVar, @NotNull CalcCacheConfig calcCacheConfig, @NotNull d<? super Unit> dVar) {
        FlatBufferClusterCache$calcCache$1 flatBufferClusterCache$calcCache$1;
        a aVar;
        int i11;
        IntRange intRange2;
        CalcCacheConfig calcCacheConfig2;
        k kVar2;
        FlatBufferClusterCacheResult flatBufferClusterCacheResult;
        Algorithm<u> algorithm2;
        FlatBufferClusterCache flatBufferClusterCache;
        c a11;
        FlatBufferClusterCache$calcCache$2 flatBufferClusterCache$calcCache$2;
        FlatBufferClusterCacheResult flatBufferClusterCacheResult2;
        if (dVar instanceof FlatBufferClusterCache$calcCache$1) {
            flatBufferClusterCache$calcCache$1 = (FlatBufferClusterCache$calcCache$1) dVar;
            int i12 = flatBufferClusterCache$calcCache$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                flatBufferClusterCache$calcCache$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = flatBufferClusterCache$calcCache$1.result;
                aVar = a.COROUTINE_SUSPENDED;
                i11 = flatBufferClusterCache$calcCache$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    FlatBufferClusterCacheResult flatBufferClusterCacheResult3 = new FlatBufferClusterCacheResult(algorithm.getItems(), kVar, this.fileManager);
                    flatBufferClusterCache$calcCache$1.L$0 = this;
                    flatBufferClusterCache$calcCache$1.L$1 = algorithm;
                    intRange2 = intRange;
                    flatBufferClusterCache$calcCache$1.L$2 = intRange2;
                    flatBufferClusterCache$calcCache$1.L$3 = kVar;
                    calcCacheConfig2 = calcCacheConfig;
                    flatBufferClusterCache$calcCache$1.L$4 = calcCacheConfig2;
                    flatBufferClusterCache$calcCache$1.L$5 = flatBufferClusterCacheResult3;
                    flatBufferClusterCache$calcCache$1.label = 1;
                    if (flatBufferClusterCacheResult3.clearSuspend(flatBufferClusterCache$calcCache$1) != aVar) {
                        kVar2 = kVar;
                        flatBufferClusterCacheResult = flatBufferClusterCacheResult3;
                        algorithm2 = algorithm;
                        flatBufferClusterCache = this;
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    FlatBufferClusterCacheResult flatBufferClusterCacheResult4 = (FlatBufferClusterCacheResult) flatBufferClusterCache$calcCache$1.L$5;
                    CalcCacheConfig calcCacheConfig3 = (CalcCacheConfig) flatBufferClusterCache$calcCache$1.L$4;
                    k kVar3 = (k) flatBufferClusterCache$calcCache$1.L$3;
                    intRange2 = (IntRange) flatBufferClusterCache$calcCache$1.L$2;
                    Algorithm<u> algorithm3 = (Algorithm) flatBufferClusterCache$calcCache$1.L$1;
                    FlatBufferClusterCache flatBufferClusterCache2 = (FlatBufferClusterCache) flatBufferClusterCache$calcCache$1.L$0;
                    s.b(obj);
                    flatBufferClusterCacheResult = flatBufferClusterCacheResult4;
                    kVar2 = kVar3;
                    algorithm2 = algorithm3;
                    calcCacheConfig2 = calcCacheConfig3;
                    flatBufferClusterCache = flatBufferClusterCache2;
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    flatBufferClusterCacheResult2 = (FlatBufferClusterCacheResult) flatBufferClusterCache$calcCache$1.L$1;
                    flatBufferClusterCache = (FlatBufferClusterCache) flatBufferClusterCache$calcCache$1.L$0;
                    s.b(obj);
                    x0<ClusterCacheResult<u>> preparedCacheMutable = flatBufferClusterCache.getPreparedCacheMutable();
                    flatBufferClusterCache$calcCache$1.L$0 = null;
                    flatBufferClusterCache$calcCache$1.L$1 = null;
                    flatBufferClusterCache$calcCache$1.label = 3;
                }
                IntRange intRange3 = intRange2;
                a11 = C10720e0.a();
                flatBufferClusterCache$calcCache$2 = new FlatBufferClusterCache$calcCache$2(calcCacheConfig2, intRange3, algorithm2, kVar2, flatBufferClusterCacheResult, null);
                flatBufferClusterCache$calcCache$1.L$0 = flatBufferClusterCache;
                flatBufferClusterCache$calcCache$1.L$1 = flatBufferClusterCacheResult;
                flatBufferClusterCache$calcCache$1.L$2 = null;
                flatBufferClusterCache$calcCache$1.L$3 = null;
                flatBufferClusterCache$calcCache$1.L$4 = null;
                flatBufferClusterCache$calcCache$1.L$5 = null;
                flatBufferClusterCache$calcCache$1.label = 2;
                if (C10727i.f(a11, flatBufferClusterCache$calcCache$2, flatBufferClusterCache$calcCache$1) != aVar) {
                    flatBufferClusterCacheResult2 = flatBufferClusterCacheResult;
                    x0<ClusterCacheResult<u>> preparedCacheMutable2 = flatBufferClusterCache.getPreparedCacheMutable();
                    flatBufferClusterCache$calcCache$1.L$0 = null;
                    flatBufferClusterCache$calcCache$1.L$1 = null;
                    flatBufferClusterCache$calcCache$1.label = 3;
                }
                return aVar;
            }
        }
        flatBufferClusterCache$calcCache$1 = new FlatBufferClusterCache$calcCache$1(this, dVar);
        Object obj2 = flatBufferClusterCache$calcCache$1.result;
        aVar = a.COROUTINE_SUSPENDED;
        i11 = flatBufferClusterCache$calcCache$1.label;
        if (i11 != 0) {
        }
        IntRange intRange32 = intRange2;
        a11 = C10720e0.a();
        flatBufferClusterCache$calcCache$2 = new FlatBufferClusterCache$calcCache$2(calcCacheConfig2, intRange32, algorithm2, kVar2, flatBufferClusterCacheResult, null);
        flatBufferClusterCache$calcCache$1.L$0 = flatBufferClusterCache;
        flatBufferClusterCache$calcCache$1.L$1 = flatBufferClusterCacheResult;
        flatBufferClusterCache$calcCache$1.L$2 = null;
        flatBufferClusterCache$calcCache$1.L$3 = null;
        flatBufferClusterCache$calcCache$1.L$4 = null;
        flatBufferClusterCache$calcCache$1.L$5 = null;
        flatBufferClusterCache$calcCache$1.label = 2;
        if (C10727i.f(a11, flatBufferClusterCache$calcCache$2, flatBufferClusterCache$calcCache$1) != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlatBufferClusterCache(@NotNull FileManager<byte[]> fileManager, Algorithm<u> algorithm) {
        super(algorithm);
        Intrinsics.checkNotNullParameter(fileManager, "fileManager");
        this.fileManager = fileManager;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlatBufferClusterCache(@NotNull FileManager<byte[]> fileManager) {
        this(fileManager, null);
        Intrinsics.checkNotNullParameter(fileManager, "fileManager");
    }
}
