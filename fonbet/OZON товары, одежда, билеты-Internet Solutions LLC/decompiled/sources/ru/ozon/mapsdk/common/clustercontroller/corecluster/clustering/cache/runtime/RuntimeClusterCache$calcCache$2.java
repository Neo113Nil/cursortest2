package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.runtime;

import Sc.s;
import Wc.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kd.C7665d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.Q;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.CalcCacheConfig;
import we0.k;
import we0.u;
import xe.C10721f;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.runtime.RuntimeClusterCache$calcCache$2", f = "RuntimeClusterCache.kt", l = {38, 50}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RuntimeClusterCache$calcCache$2 extends j implements Function2<M, d<? super Object>, Object> {
    final /* synthetic */ Algorithm<u> $algorithm;
    final /* synthetic */ CalcCacheConfig $calcCacheConfig;
    final /* synthetic */ k $clusteringOptions;
    final /* synthetic */ Map<Integer, ClusterizingResult<u>> $clusters;
    final /* synthetic */ IntRange $zoomRange;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RuntimeClusterCache$calcCache$2(CalcCacheConfig calcCacheConfig, IntRange intRange, Map<Integer, ClusterizingResult<u>> map, Algorithm<u> algorithm, k kVar, d<? super RuntimeClusterCache$calcCache$2> dVar) {
        super(2, dVar);
        this.$calcCacheConfig = calcCacheConfig;
        this.$zoomRange = intRange;
        this.$clusters = map;
        this.$algorithm = algorithm;
        this.$clusteringOptions = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        RuntimeClusterCache$calcCache$2 runtimeClusterCache$calcCache$2 = new RuntimeClusterCache$calcCache$2(this.$calcCacheConfig, this.$zoomRange, this.$clusters, this.$algorithm, this.$clusteringOptions, dVar);
        runtimeClusterCache$calcCache$2.L$0 = obj;
        return runtimeClusterCache$calcCache$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super Object> dVar) {
        return invoke2(m11, (d<Object>) dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008b -> B:12:0x008c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map<Integer, ClusterizingResult<u>> map;
        Iterator it;
        Algorithm<u> algorithm;
        k kVar;
        Collection collection;
        Map<Integer, ClusterizingResult<u>> map2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            if (!this.$calcCacheConfig.getIsSequentialCalculation()) {
                IntRange intRange = this.$zoomRange;
                Algorithm<u> algorithm2 = this.$algorithm;
                k kVar2 = this.$clusteringOptions;
                ArrayList arrayList = new ArrayList(C7714v.z(intRange, 10));
                C7665d it2 = intRange.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C10727i.a(m11, null, null, new RuntimeClusterCache$calcCache$2$results$1$1(algorithm2, it2.b(), kVar2, null), 3));
                }
                Map<Integer, ClusterizingResult<u>> map3 = this.$clusters;
                this.L$0 = map3;
                this.label = 2;
                Object a11 = C10721f.a(arrayList, this);
                if (a11 != aVar) {
                    map = map3;
                    obj = a11;
                }
                return aVar;
            }
            IntRange intRange2 = this.$zoomRange;
            Algorithm<u> algorithm3 = this.$algorithm;
            k kVar3 = this.$clusteringOptions;
            Map<Integer, ClusterizingResult<u>> map4 = this.$clusters;
            ArrayList arrayList2 = new ArrayList(C7714v.z(intRange2, 10));
            it = intRange2.iterator();
            algorithm = algorithm3;
            kVar = kVar3;
            collection = arrayList2;
            map2 = map4;
            if (it.hasNext()) {
            }
        } else if (i11 == 1) {
            int b11 = this.I$0;
            collection = (Collection) this.L$5;
            it = (Iterator) this.L$4;
            Collection collection2 = (Collection) this.L$3;
            map2 = (Map) this.L$2;
            kVar = (k) this.L$1;
            algorithm = (Algorithm) this.L$0;
            s.b(obj);
            ClusterizingResult<u> clusterizingResult = (ClusterizingResult) obj;
            clusterizingResult.trySwitchClustersToSimpleCollection();
            map2.put(new Integer(b11), clusterizingResult);
            collection.add(Unit.f71690a);
            collection = collection2;
            if (it.hasNext()) {
                b11 = ((Q) it).b();
                this.L$0 = algorithm;
                this.L$1 = kVar;
                this.L$2 = map2;
                this.L$3 = collection;
                this.L$4 = it;
                this.L$5 = collection;
                this.I$0 = b11;
                this.label = 1;
                obj = algorithm.getClusters(b11, kVar, this);
                if (obj != aVar) {
                    collection2 = collection;
                    ClusterizingResult<u> clusterizingResult2 = (ClusterizingResult) obj;
                    clusterizingResult2.trySwitchClustersToSimpleCollection();
                    map2.put(new Integer(b11), clusterizingResult2);
                    collection.add(Unit.f71690a);
                    collection = collection2;
                    if (it.hasNext()) {
                        return (List) collection;
                    }
                }
                return aVar;
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) this.L$0;
            s.b(obj);
        }
        U.p(map, (Iterable) obj);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<Object> dVar) {
        return ((RuntimeClusterCache$calcCache$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
