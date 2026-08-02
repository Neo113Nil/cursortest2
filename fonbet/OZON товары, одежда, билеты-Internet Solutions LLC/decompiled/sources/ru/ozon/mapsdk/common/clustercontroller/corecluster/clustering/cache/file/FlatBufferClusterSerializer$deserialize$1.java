package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.FlatBufferClusterSerializer", f = "FlatBufferClusterSerializer.kt", l = {56}, m = "deserialize")
/* loaded from: classes3.dex */
final class FlatBufferClusterSerializer$deserialize$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlatBufferClusterSerializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlatBufferClusterSerializer$deserialize$1(FlatBufferClusterSerializer flatBufferClusterSerializer, d<? super FlatBufferClusterSerializer$deserialize$1> dVar) {
        super(dVar);
        this.this$0 = flatBufferClusterSerializer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.deserialize(null, null, this);
    }
}
