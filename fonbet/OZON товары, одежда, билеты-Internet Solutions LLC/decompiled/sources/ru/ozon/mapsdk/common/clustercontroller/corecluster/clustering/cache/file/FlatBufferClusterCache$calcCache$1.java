package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.FlatBufferClusterCache", f = "FlatBufferClusterCache.kt", l = {32, 34, 49}, m = "calcCache")
/* loaded from: classes3.dex */
final class FlatBufferClusterCache$calcCache$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlatBufferClusterCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlatBufferClusterCache$calcCache$1(FlatBufferClusterCache flatBufferClusterCache, d<? super FlatBufferClusterCache$calcCache$1> dVar) {
        super(dVar);
        this.this$0 = flatBufferClusterCache;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.calcCache(null, null, null, null, this);
    }
}
