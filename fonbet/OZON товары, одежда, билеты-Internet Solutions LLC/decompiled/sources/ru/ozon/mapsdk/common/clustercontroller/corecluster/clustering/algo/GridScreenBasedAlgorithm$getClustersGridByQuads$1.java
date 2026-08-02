package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo;

import Sc.s;
import Wc.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.StaticCluster;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.GridScreenBasedAlgorithm;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.quadtree.OzonPointQuadTree;
import xe.C10721f;
import xe.C10727i;
import xe.M;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "Lxe/M;", "", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/StaticCluster;", "<anonymous>", "(Lxe/M;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.GridScreenBasedAlgorithm$getClustersGridByQuads$1", f = "GridScreenBasedAlgorithm.kt", l = {236}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class GridScreenBasedAlgorithm$getClustersGridByQuads$1<T> extends j implements Function2<M, d<? super List<? extends StaticCluster<T>>>, Object> {
    final /* synthetic */ List<OzonPointQuadTree<GridScreenBasedAlgorithm.QuadItem<T>>> $rawClusters;
    int label;
    final /* synthetic */ GridScreenBasedAlgorithm<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GridScreenBasedAlgorithm$getClustersGridByQuads$1(List<OzonPointQuadTree<GridScreenBasedAlgorithm.QuadItem<T>>> list, GridScreenBasedAlgorithm<T> gridScreenBasedAlgorithm, d<? super GridScreenBasedAlgorithm$getClustersGridByQuads$1> dVar) {
        super(2, dVar);
        this.$rawClusters = list;
        this.this$0 = gridScreenBasedAlgorithm;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new GridScreenBasedAlgorithm$getClustersGridByQuads$1(this.$rawClusters, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        M m11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            List<OzonPointQuadTree<GridScreenBasedAlgorithm.QuadItem<T>>> list = this.$rawClusters;
            GridScreenBasedAlgorithm<T> gridScreenBasedAlgorithm = this.this$0;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                OzonPointQuadTree ozonPointQuadTree = (OzonPointQuadTree) it.next();
                m11 = ((GridScreenBasedAlgorithm) gridScreenBasedAlgorithm).gridScreenBasedScope;
                arrayList.add(C10727i.a(m11, null, null, new GridScreenBasedAlgorithm$getClustersGridByQuads$1$1$1(ozonPointQuadTree, null), 3));
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
        return C7714v.I((Iterable) obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super List<? extends StaticCluster<T>>> dVar) {
        return ((GridScreenBasedAlgorithm$getClustersGridByQuads$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
