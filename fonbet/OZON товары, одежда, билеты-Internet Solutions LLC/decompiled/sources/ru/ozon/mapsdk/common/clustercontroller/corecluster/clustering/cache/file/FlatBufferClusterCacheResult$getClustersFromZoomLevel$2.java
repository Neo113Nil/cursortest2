package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file;

import Sc.s;
import Wc.a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import we0.u;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "Lwe0/u;", "<anonymous>", "(Lxe/M;)Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.FlatBufferClusterCacheResult$getClustersFromZoomLevel$2", f = "FlatBufferClusterCacheResult.kt", l = {49, 50}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlatBufferClusterCacheResult$getClustersFromZoomLevel$2 extends j implements Function2<M, d<? super ClusterizingResult<u>>, Object> {
    final /* synthetic */ int $zoomLevel;
    int label;
    final /* synthetic */ FlatBufferClusterCacheResult this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlatBufferClusterCacheResult$getClustersFromZoomLevel$2(FlatBufferClusterCacheResult flatBufferClusterCacheResult, int i11, d<? super FlatBufferClusterCacheResult$getClustersFromZoomLevel$2> dVar) {
        super(2, dVar);
        this.this$0 = flatBufferClusterCacheResult;
        this.$zoomLevel = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FlatBufferClusterCacheResult$getClustersFromZoomLevel$2(this.this$0, this.$zoomLevel, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r6 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if (r6 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String fileName;
        FileManager fileManager;
        FlatBufferClusterSerializer flatBufferClusterSerializer;
        HashMap hashMap;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            fileName = this.this$0.getFileName(this.$zoomLevel);
            fileManager = this.this$0.fileManager;
            this.label = 1;
            obj = fileManager.readFromFile(fileName, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                ClusterizingResult clusterizingResult = (ClusterizingResult) obj;
                if (clusterizingResult.isEmpty()) {
                    return null;
                }
                return clusterizingResult;
            }
            s.b(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr == null) {
            return null;
        }
        flatBufferClusterSerializer = this.this$0.flatBufferClusterSerializer;
        hashMap = this.this$0.clusterItemsMap;
        this.label = 2;
        obj = flatBufferClusterSerializer.deserialize(bArr, hashMap, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super ClusterizingResult<u>> dVar) {
        return ((FlatBufferClusterCacheResult$getClustersFromZoomLevel$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
