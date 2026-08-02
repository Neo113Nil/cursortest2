package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file;

import Sc.s;
import Wc.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kd.C7665d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.ranges.h;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.StaticCluster;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.model.CacheClusterList;
import we0.u;
import xe.C10721f;
import xe.C10727i;
import xe.M;
import xe.U;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.FlatBufferClusterSerializer$deserialize$2", f = "FlatBufferClusterSerializer.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlatBufferClusterSerializer$deserialize$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $batchSize;
    final /* synthetic */ CacheClusterList $clusterList;
    final /* synthetic */ HashSet<StaticCluster<u>> $clusters;
    final /* synthetic */ int $clustersCount;
    final /* synthetic */ int $effectiveThreadCount;
    final /* synthetic */ Map<Long, u> $mapOfItmes;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlatBufferClusterSerializer$deserialize$2(int i11, int i12, int i13, CacheClusterList cacheClusterList, Map<Long, u> map, HashSet<StaticCluster<u>> hashSet, d<? super FlatBufferClusterSerializer$deserialize$2> dVar) {
        super(2, dVar);
        this.$effectiveThreadCount = i11;
        this.$batchSize = i12;
        this.$clustersCount = i13;
        this.$clusterList = cacheClusterList;
        this.$mapOfItmes = map;
        this.$clusters = hashSet;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FlatBufferClusterSerializer$deserialize$2 flatBufferClusterSerializer$deserialize$2 = new FlatBufferClusterSerializer$deserialize$2(this.$effectiveThreadCount, this.$batchSize, this.$clustersCount, this.$clusterList, this.$mapOfItmes, this.$clusters, dVar);
        flatBufferClusterSerializer$deserialize$2.L$0 = obj;
        return flatBufferClusterSerializer$deserialize$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            IntRange o11 = h.o(0, this.$effectiveThreadCount);
            int i12 = this.$batchSize;
            int i13 = this.$clustersCount;
            CacheClusterList cacheClusterList = this.$clusterList;
            Map<Long, u> map = this.$mapOfItmes;
            ArrayList arrayList = new ArrayList();
            C7665d it = o11.iterator();
            while (it.hasNext()) {
                int b11 = it.b() * i12;
                int min = Math.min(b11 + i12, i13);
                U a11 = b11 < min ? C10727i.a(m11, null, null, new FlatBufferClusterSerializer$deserialize$2$workers$1$1(b11, min, cacheClusterList, map, null), 3) : null;
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
            this.label = 1;
            obj = C10721f.a(arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        HashSet<StaticCluster<u>> hashSet = this.$clusters;
        Iterator it2 = ((Iterable) obj).iterator();
        while (it2.hasNext()) {
            hashSet.addAll((ArrayList) it2.next());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FlatBufferClusterSerializer$deserialize$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
