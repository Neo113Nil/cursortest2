package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.FlatBufferClusterCacheResult", f = "FlatBufferClusterCacheResult.kt", l = {77}, m = "clearSuspend")
/* loaded from: classes3.dex */
final class FlatBufferClusterCacheResult$clearSuspend$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlatBufferClusterCacheResult this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlatBufferClusterCacheResult$clearSuspend$1(FlatBufferClusterCacheResult flatBufferClusterCacheResult, d<? super FlatBufferClusterCacheResult$clearSuspend$1> dVar) {
        super(dVar);
        this.this$0 = flatBufferClusterCacheResult;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.clearSuspend(this);
    }
}
