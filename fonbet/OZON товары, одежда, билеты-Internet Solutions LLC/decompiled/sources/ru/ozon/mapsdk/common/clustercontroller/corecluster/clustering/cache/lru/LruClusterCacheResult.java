package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.lru;

import Sc.s;
import Wc.a;
import android.util.LruCache;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.Q;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult;
import we0.k;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00042\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u0004H\u0094@¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\fH\u0094@¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0094@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0015H\u0096@¢\u0006\u0004\b \u0010\u001bR(\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/lru/LruClusterCacheResult;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/AbstractClusterCacheResult;", "", "lruCapacity", "Lwe0/k;", "clusteringOptions", "<init>", "(ILwe0/k;)V", "Lkotlin/ranges/IntRange;", "zoomRange", "", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "toResultMap", "(Lkotlin/ranges/IntRange;)Ljava/util/Map;", "zoomLevel", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "calcPinsAction", "", "saveClusters", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getClustersFromZoomLevel", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "getAllCachedClusters", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "getClustersFromZoomRange", "(Lkotlin/ranges/IntRange;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "isCacheExistSuspend", "clearSuspend", "Landroid/util/LruCache;", "lruCache", "Landroid/util/LruCache;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LruClusterCacheResult<T extends ClusterItem> extends AbstractClusterCacheResult<T> {

    @NotNull
    private final LruCache<Integer, ClusterizingResult<T>> lruCache;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LruClusterCacheResult(int i11, @NotNull k clusteringOptions) {
        super(clusteringOptions);
        Intrinsics.checkNotNullParameter(clusteringOptions, "clusteringOptions");
        this.lruCache = new LruCache<>(i11);
    }

    private final Map<Integer, ClusterizingResult<T>> toResultMap(IntRange zoomRange) {
        HashMap hashMap = new HashMap();
        if (zoomRange == null) {
            Map<Integer, ClusterizingResult<T>> snapshot = this.lruCache.snapshot();
            Intrinsics.checkNotNullExpressionValue(snapshot, "snapshot(...)");
            for (Map.Entry<Integer, ClusterizingResult<T>> entry : snapshot.entrySet()) {
                ClusterizingResult<T> value = entry.getValue();
                if (value != null) {
                    hashMap.put(entry.getKey(), value);
                }
            }
        } else {
            Iterator<Integer> it = zoomRange.iterator();
            while (it.hasNext()) {
                int b11 = ((Q) it).b();
                ClusterizingResult<T> clusterizingResult = this.lruCache.get(Integer.valueOf(b11));
                if (clusterizingResult != null) {
                    hashMap.put(Integer.valueOf(b11), clusterizingResult);
                }
            }
        }
        return hashMap;
    }

    static /* synthetic */ Map toResultMap$default(LruClusterCacheResult lruClusterCacheResult, IntRange intRange, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            intRange = null;
        }
        return lruClusterCacheResult.toResultMap(intRange);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult, ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCacheResult
    public Object clearSuspend(@NotNull d<? super Unit> dVar) {
        this.lruCache.evictAll();
        return Unit.f71690a;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult
    protected Object getAllCachedClusters(@NotNull d<? super Map<Integer, ClusterizingResult<T>>> dVar) {
        return toResultMap$default(this, null, 1, null);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult
    protected Object getClustersFromZoomLevel(int i11, @NotNull d<? super ClusterizingResult<T>> dVar) {
        return this.lruCache.get(new Integer(i11));
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult
    protected Object getClustersFromZoomRange(@NotNull IntRange intRange, @NotNull d<? super Map<Integer, ClusterizingResult<T>>> dVar) {
        return toResultMap(intRange);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult, ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCacheResult
    public Object isCacheExistSuspend(@NotNull d<? super Boolean> dVar) {
        return Boolean.valueOf(this.lruCache.size() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveClusters(int i11, @NotNull Function1<? super d<? super ClusterizingResult<T>>, ? extends Object> function1, @NotNull d<? super Unit> dVar) {
        LruClusterCacheResult$saveClusters$1 lruClusterCacheResult$saveClusters$1;
        int i12;
        ClusterizingResult<T> clusterizingResult;
        LruClusterCacheResult<T> lruClusterCacheResult;
        if (dVar instanceof LruClusterCacheResult$saveClusters$1) {
            lruClusterCacheResult$saveClusters$1 = (LruClusterCacheResult$saveClusters$1) dVar;
            int i13 = lruClusterCacheResult$saveClusters$1.label;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                lruClusterCacheResult$saveClusters$1.label = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = lruClusterCacheResult$saveClusters$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i12 = lruClusterCacheResult$saveClusters$1.label;
                if (i12 != 0) {
                    s.b(obj);
                    clusterizingResult = this.lruCache.get(new Integer(i11));
                    if (clusterizingResult != null) {
                        lruClusterCacheResult = this;
                        lruClusterCacheResult.lruCache.put(new Integer(i11), clusterizingResult);
                        return Unit.f71690a;
                    }
                    lruClusterCacheResult$saveClusters$1.L$0 = this;
                    lruClusterCacheResult$saveClusters$1.I$0 = i11;
                    lruClusterCacheResult$saveClusters$1.label = 1;
                    obj = function1.invoke(lruClusterCacheResult$saveClusters$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    lruClusterCacheResult = this;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = lruClusterCacheResult$saveClusters$1.I$0;
                    lruClusterCacheResult = (LruClusterCacheResult) lruClusterCacheResult$saveClusters$1.L$0;
                    s.b(obj);
                }
                clusterizingResult = (ClusterizingResult) obj;
                lruClusterCacheResult.lruCache.put(new Integer(i11), clusterizingResult);
                return Unit.f71690a;
            }
        }
        lruClusterCacheResult$saveClusters$1 = new LruClusterCacheResult$saveClusters$1(this, dVar);
        Object obj2 = lruClusterCacheResult$saveClusters$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i12 = lruClusterCacheResult$saveClusters$1.label;
        if (i12 != 0) {
        }
        clusterizingResult = (ClusterizingResult) obj2;
        lruClusterCacheResult.lruCache.put(new Integer(i11), clusterizingResult);
        return Unit.f71690a;
    }
}
