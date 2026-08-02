package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import we0.u;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.FlatBufferClusterCacheResult$saveClusterResult$2", f = "FlatBufferClusterCacheResult.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlatBufferClusterCacheResult$saveClusterResult$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ClusterizingResult<u> $clusterizingResult;
    final /* synthetic */ int $zoomLevel;
    int label;
    final /* synthetic */ FlatBufferClusterCacheResult this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlatBufferClusterCacheResult$saveClusterResult$2(FlatBufferClusterCacheResult flatBufferClusterCacheResult, int i11, ClusterizingResult<u> clusterizingResult, d<? super FlatBufferClusterCacheResult$saveClusterResult$2> dVar) {
        super(2, dVar);
        this.this$0 = flatBufferClusterCacheResult;
        this.$zoomLevel = i11;
        this.$clusterizingResult = clusterizingResult;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FlatBufferClusterCacheResult$saveClusterResult$2(this.this$0, this.$zoomLevel, this.$clusterizingResult, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String fileName;
        FlatBufferClusterSerializer flatBufferClusterSerializer;
        FileManager fileManager;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            fileName = this.this$0.getFileName(this.$zoomLevel);
            flatBufferClusterSerializer = this.this$0.flatBufferClusterSerializer;
            byte[] serialize = flatBufferClusterSerializer.serialize(this.$clusterizingResult);
            fileManager = this.this$0.fileManager;
            this.label = 1;
            if (fileManager.writeToFile(fileName, serialize, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FlatBufferClusterCacheResult$saveClusterResult$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
