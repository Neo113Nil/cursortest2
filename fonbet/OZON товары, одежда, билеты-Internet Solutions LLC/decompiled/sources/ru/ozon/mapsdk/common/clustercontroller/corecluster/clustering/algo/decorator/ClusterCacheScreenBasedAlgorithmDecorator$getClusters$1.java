package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator.ClusterCacheScreenBasedAlgorithmDecorator", f = "ClusterCacheScreenBasedAlgorithmDecorator.kt", l = {34, DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "getClusters")
/* loaded from: classes3.dex */
final class ClusterCacheScreenBasedAlgorithmDecorator$getClusters$1 extends c {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ClusterCacheScreenBasedAlgorithmDecorator<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClusterCacheScreenBasedAlgorithmDecorator$getClusters$1(ClusterCacheScreenBasedAlgorithmDecorator<T> clusterCacheScreenBasedAlgorithmDecorator, d<? super ClusterCacheScreenBasedAlgorithmDecorator$getClusters$1> dVar) {
        super(dVar);
        this.this$0 = clusterCacheScreenBasedAlgorithmDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.getClusters(0.0f, null, this);
    }
}
