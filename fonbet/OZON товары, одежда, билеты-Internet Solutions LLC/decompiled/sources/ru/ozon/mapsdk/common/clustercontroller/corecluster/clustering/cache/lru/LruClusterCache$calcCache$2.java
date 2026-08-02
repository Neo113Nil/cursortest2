package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.lru;

import Ae.x0;
import Sc.s;
import Wc.a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.Q;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import we0.k;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.lru.LruClusterCache$calcCache$2", f = "LruClusterCache.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LruClusterCache$calcCache$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Algorithm<T> $algorithm;
    final /* synthetic */ k $clusteringOptions;
    final /* synthetic */ IntRange $zoomRange;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ LruClusterCache<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LruClusterCache$calcCache$2(LruClusterCache<T> lruClusterCache, k kVar, IntRange intRange, Algorithm<T> algorithm, d<? super LruClusterCache$calcCache$2> dVar) {
        super(2, dVar);
        this.this$0 = lruClusterCache;
        this.$clusteringOptions = kVar;
        this.$zoomRange = intRange;
        this.$algorithm = algorithm;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new LruClusterCache$calcCache$2(this.this$0, this.$clusteringOptions, this.$zoomRange, this.$algorithm, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        LruClusterCacheResult existLruCache;
        Iterator<Integer> it;
        Algorithm algorithm;
        k kVar;
        LruClusterCacheResult lruClusterCacheResult;
        int i11;
        x0 preparedCacheMutable;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = this.label;
        if (i12 == 0) {
            s.b(obj);
            existLruCache = this.this$0.getExistLruCache();
            if (existLruCache == null) {
                i11 = ((LruClusterCache) this.this$0).lruCapacity;
                existLruCache = new LruClusterCacheResult(i11, this.$clusteringOptions);
                preparedCacheMutable = this.this$0.getPreparedCacheMutable();
                preparedCacheMutable.setValue(existLruCache);
            }
            IntRange intRange = this.$zoomRange;
            Algorithm algorithm2 = this.$algorithm;
            k kVar2 = this.$clusteringOptions;
            it = intRange.iterator();
            algorithm = algorithm2;
            kVar = kVar2;
            lruClusterCacheResult = existLruCache;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$3;
            kVar = (k) this.L$2;
            algorithm = (Algorithm) this.L$1;
            lruClusterCacheResult = (LruClusterCacheResult) this.L$0;
            s.b(obj);
        }
        while (it.hasNext()) {
            int b11 = ((Q) it).b();
            LruClusterCache$calcCache$2$1$1 lruClusterCache$calcCache$2$1$1 = new LruClusterCache$calcCache$2$1$1(algorithm, b11, kVar, null);
            this.L$0 = lruClusterCacheResult;
            this.L$1 = algorithm;
            this.L$2 = kVar;
            this.L$3 = it;
            this.label = 1;
            if (lruClusterCacheResult.saveClusters(b11, lruClusterCache$calcCache$2$1$1, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((LruClusterCache$calcCache$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
