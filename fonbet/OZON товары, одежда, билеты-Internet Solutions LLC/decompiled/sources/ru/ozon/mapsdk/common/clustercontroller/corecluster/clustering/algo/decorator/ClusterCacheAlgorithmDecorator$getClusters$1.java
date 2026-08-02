package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator.ClusterCacheAlgorithmDecorator", f = "ClusterCacheAlgorithmDecorator.kt", l = {DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, 33}, m = "getClusters")
/* loaded from: classes3.dex */
final class ClusterCacheAlgorithmDecorator$getClusters$1 extends c {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ClusterCacheAlgorithmDecorator<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClusterCacheAlgorithmDecorator$getClusters$1(ClusterCacheAlgorithmDecorator<T> clusterCacheAlgorithmDecorator, d<? super ClusterCacheAlgorithmDecorator$getClusters$1> dVar) {
        super(dVar);
        this.this$0 = clusterCacheAlgorithmDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.getClusters(0.0f, null, this);
    }
}
