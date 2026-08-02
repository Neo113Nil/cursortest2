package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.runtime;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.runtime.RuntimeClusterCache", f = "RuntimeClusterCache.kt", l = {DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER, 54}, m = "calcCache")
/* loaded from: classes3.dex */
final class RuntimeClusterCache$calcCache$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RuntimeClusterCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RuntimeClusterCache$calcCache$1(RuntimeClusterCache runtimeClusterCache, d<? super RuntimeClusterCache$calcCache$1> dVar) {
        super(dVar);
        this.this$0 = runtimeClusterCache;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.calcCache(null, null, null, null, this);
    }
}
