package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.runtime;

import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import we0.k;
import we0.u;
import xe.M;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxe/M;", "Lkotlin/Pair;", "", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "Lwe0/u;", "<anonymous>", "(Lxe/M;)Lkotlin/Pair;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.runtime.RuntimeClusterCache$calcCache$2$results$1$1", f = "RuntimeClusterCache.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RuntimeClusterCache$calcCache$2$results$1$1 extends j implements Function2<M, d<? super Pair<? extends Integer, ? extends ClusterizingResult<u>>>, Object> {
    final /* synthetic */ Algorithm<u> $algorithm;
    final /* synthetic */ k $clusteringOptions;
    final /* synthetic */ int $zoomLevel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RuntimeClusterCache$calcCache$2$results$1$1(Algorithm<u> algorithm, int i11, k kVar, d<? super RuntimeClusterCache$calcCache$2$results$1$1> dVar) {
        super(2, dVar);
        this.$algorithm = algorithm;
        this.$zoomLevel = i11;
        this.$clusteringOptions = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RuntimeClusterCache$calcCache$2$results$1$1(this.$algorithm, this.$zoomLevel, this.$clusteringOptions, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super Pair<? extends Integer, ? extends ClusterizingResult<u>>> dVar) {
        return invoke2(m11, (d<? super Pair<Integer, ClusterizingResult<u>>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            Algorithm<u> algorithm = this.$algorithm;
            float f7 = this.$zoomLevel;
            k kVar = this.$clusteringOptions;
            this.label = 1;
            obj = algorithm.getClusters(f7, kVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        ClusterizingResult clusterizingResult = (ClusterizingResult) obj;
        clusterizingResult.trySwitchClustersToSimpleCollection();
        return new Pair(new Integer(this.$zoomLevel), clusterizingResult);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super Pair<Integer, ClusterizingResult<u>>> dVar) {
        return ((RuntimeClusterCache$calcCache$2$results$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
