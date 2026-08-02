package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator.PreCachingAlgorithmDecorator", f = "PreCachingAlgorithmDecorator.kt", l = {170, 171}, m = "precacheZoomLevel")
/* loaded from: classes3.dex */
final class PreCachingAlgorithmDecorator$precacheZoomLevel$1 extends c {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PreCachingAlgorithmDecorator<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreCachingAlgorithmDecorator$precacheZoomLevel$1(PreCachingAlgorithmDecorator<T> preCachingAlgorithmDecorator, d<? super PreCachingAlgorithmDecorator$precacheZoomLevel$1> dVar) {
        super(dVar);
        this.this$0 = preCachingAlgorithmDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object precacheZoomLevel;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        precacheZoomLevel = this.this$0.precacheZoomLevel(0, null, this);
        return precacheZoomLevel;
    }
}
