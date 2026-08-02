package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file;

import Sc.s;
import Wc.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.StaticCluster;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.model.CacheCluster;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.model.CacheClusterList;
import we0.u;
import xe.M;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxe/M;", "Ljava/util/ArrayList;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/StaticCluster;", "Lwe0/u;", "Lkotlin/collections/ArrayList;", "<anonymous>", "(Lxe/M;)Ljava/util/ArrayList;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.FlatBufferClusterSerializer$deserialize$2$workers$1$1", f = "FlatBufferClusterSerializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlatBufferClusterSerializer$deserialize$2$workers$1$1 extends j implements Function2<M, d<? super ArrayList<StaticCluster<u>>>, Object> {
    final /* synthetic */ CacheClusterList $clusterList;
    final /* synthetic */ int $from;
    final /* synthetic */ Map<Long, u> $mapOfItmes;
    final /* synthetic */ int $to;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlatBufferClusterSerializer$deserialize$2$workers$1$1(int i11, int i12, CacheClusterList cacheClusterList, Map<Long, u> map, d<? super FlatBufferClusterSerializer$deserialize$2$workers$1$1> dVar) {
        super(2, dVar);
        this.$from = i11;
        this.$to = i12;
        this.$clusterList = cacheClusterList;
        this.$mapOfItmes = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FlatBufferClusterSerializer$deserialize$2$workers$1$1(this.$from, this.$to, this.$clusterList, this.$mapOfItmes, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ArrayList arrayList = new ArrayList();
        for (int i11 = this.$from; i11 < this.$to; i11++) {
            CacheCluster clusters = this.$clusterList.clusters(i11);
            int itemIdsLength = clusters.itemIdsLength();
            if (itemIdsLength != 0) {
                ArrayList arrayList2 = new ArrayList(itemIdsLength);
                int itemIdsLength2 = clusters.itemIdsLength();
                for (int i12 = 0; i12 < itemIdsLength2; i12++) {
                    u uVar = this.$mapOfItmes.get(new Long(clusters.itemIds(i12)));
                    if (uVar != null) {
                        arrayList2.add(uVar);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    StaticCluster staticCluster = new StaticCluster();
                    staticCluster.switchToSimpleCollection();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        staticCluster.add((u) it.next());
                    }
                    arrayList.add(staticCluster);
                }
            }
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super ArrayList<StaticCluster<u>>> dVar) {
        return ((FlatBufferClusterSerializer$deserialize$2$workers$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
