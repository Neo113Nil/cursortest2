package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator.PreCachingAlgorithmDecorator", f = "PreCachingAlgorithmDecorator.kt", l = {130, 134, 140}, m = "getClusters")
/* loaded from: classes3.dex */
final class PreCachingAlgorithmDecorator$getClusters$1 extends c {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PreCachingAlgorithmDecorator<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreCachingAlgorithmDecorator$getClusters$1(PreCachingAlgorithmDecorator<T> preCachingAlgorithmDecorator, d<? super PreCachingAlgorithmDecorator$getClusters$1> dVar) {
        super(dVar);
        this.this$0 = preCachingAlgorithmDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.getClusters(0.0f, null, this);
    }
}
