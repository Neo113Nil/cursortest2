package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.NonHierarchicalViewBasedAlgorithm", f = "NonHierarchicalViewBasedAlgorithm.kt", l = {79}, m = "getClustersForSameZoomLevel")
/* loaded from: classes3.dex */
final class NonHierarchicalViewBasedAlgorithm$getClustersForSameZoomLevel$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NonHierarchicalViewBasedAlgorithm<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NonHierarchicalViewBasedAlgorithm$getClustersForSameZoomLevel$1(NonHierarchicalViewBasedAlgorithm<T> nonHierarchicalViewBasedAlgorithm, d<? super NonHierarchicalViewBasedAlgorithm$getClustersForSameZoomLevel$1> dVar) {
        super(dVar);
        this.this$0 = nonHierarchicalViewBasedAlgorithm;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.getClustersForSameZoomLevel(0.0f, null, this);
    }
}
