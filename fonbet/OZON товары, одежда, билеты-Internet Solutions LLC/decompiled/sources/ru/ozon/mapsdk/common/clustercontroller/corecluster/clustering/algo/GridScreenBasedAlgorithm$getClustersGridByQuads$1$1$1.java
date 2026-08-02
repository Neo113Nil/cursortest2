package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo;

import Sc.s;
import Wc.a;
import java.util.Iterator;
import java.util.Set;
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
import xe.M;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "Lxe/M;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/StaticCluster;", "<anonymous>", "(Lxe/M;)Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/StaticCluster;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.GridScreenBasedAlgorithm$getClustersGridByQuads$1$1$1", f = "GridScreenBasedAlgorithm.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class GridScreenBasedAlgorithm$getClustersGridByQuads$1$1$1<T> extends j implements Function2<M, d<? super StaticCluster<T>>, Object> {
    final /* synthetic */ OzonPointQuadTree<GridScreenBasedAlgorithm.QuadItem<T>> $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GridScreenBasedAlgorithm$getClustersGridByQuads$1$1$1(OzonPointQuadTree<GridScreenBasedAlgorithm.QuadItem<T>> ozonPointQuadTree, d<? super GridScreenBasedAlgorithm$getClustersGridByQuads$1$1$1> dVar) {
        super(2, dVar);
        this.$it = ozonPointQuadTree;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new GridScreenBasedAlgorithm$getClustersGridByQuads$1$1$1(this.$it, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Set<GridScreenBasedAlgorithm.QuadItem<T>> allChildrens = this.$it.getAllChildrens();
        if (allChildrens.isEmpty()) {
            return null;
        }
        Set<GridScreenBasedAlgorithm.QuadItem<T>> set = allChildrens;
        StaticCluster staticCluster = new StaticCluster(((GridScreenBasedAlgorithm.QuadItem) C7714v.J(set)).getMClusterItem());
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            staticCluster.add(((GridScreenBasedAlgorithm.QuadItem) it.next()).getMClusterItem());
        }
        return staticCluster;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super StaticCluster<T>> dVar) {
        return ((GridScreenBasedAlgorithm$getClustersGridByQuads$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
