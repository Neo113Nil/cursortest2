package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.lru;

import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import we0.k;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.lru.LruClusterCache$calcCache$2$1$1", f = "LruClusterCache.kt", l = {DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LruClusterCache$calcCache$2$1$1<T> extends j implements Function1<d<? super ClusterizingResult<T>>, Object> {
    final /* synthetic */ Algorithm<T> $algorithm;
    final /* synthetic */ k $clusteringOptions;
    final /* synthetic */ int $zoomLevel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LruClusterCache$calcCache$2$1$1(Algorithm<T> algorithm, int i11, k kVar, d<? super LruClusterCache$calcCache$2$1$1> dVar) {
        super(1, dVar);
        this.$algorithm = algorithm;
        this.$zoomLevel = i11;
        this.$clusteringOptions = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new LruClusterCache$calcCache$2$1$1(this.$algorithm, this.$zoomLevel, this.$clusteringOptions, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        Algorithm<T> algorithm = this.$algorithm;
        float f7 = this.$zoomLevel;
        k kVar = this.$clusteringOptions;
        this.label = 1;
        Object clusters = algorithm.getClusters(f7, kVar, this);
        return clusters == aVar ? aVar : clusters;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super ClusterizingResult<T>> dVar) {
        return ((LruClusterCache$calcCache$2$1$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
