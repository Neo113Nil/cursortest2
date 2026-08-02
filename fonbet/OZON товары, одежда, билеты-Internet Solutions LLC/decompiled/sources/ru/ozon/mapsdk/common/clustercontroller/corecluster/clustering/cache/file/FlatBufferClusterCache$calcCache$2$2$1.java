package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file;

import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import we0.k;
import we0.u;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.FlatBufferClusterCache$calcCache$2$2$1", f = "FlatBufferClusterCache.kt", l = {43, DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlatBufferClusterCache$calcCache$2$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Algorithm<u> $algorithm;
    final /* synthetic */ FlatBufferClusterCacheResult $clusterCacheResult;
    final /* synthetic */ k $clusteringOptions;
    final /* synthetic */ int $zoomLevel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlatBufferClusterCache$calcCache$2$2$1(Algorithm<u> algorithm, int i11, k kVar, FlatBufferClusterCacheResult flatBufferClusterCacheResult, d<? super FlatBufferClusterCache$calcCache$2$2$1> dVar) {
        super(2, dVar);
        this.$algorithm = algorithm;
        this.$zoomLevel = i11;
        this.$clusteringOptions = kVar;
        this.$clusterCacheResult = flatBufferClusterCacheResult;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FlatBufferClusterCache$calcCache$2$2$1(this.$algorithm, this.$zoomLevel, this.$clusteringOptions, this.$clusterCacheResult, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r1.saveClusterResult(r3, (ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult) r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        FlatBufferClusterCacheResult flatBufferClusterCacheResult = this.$clusterCacheResult;
        int i12 = this.$zoomLevel;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FlatBufferClusterCache$calcCache$2$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
