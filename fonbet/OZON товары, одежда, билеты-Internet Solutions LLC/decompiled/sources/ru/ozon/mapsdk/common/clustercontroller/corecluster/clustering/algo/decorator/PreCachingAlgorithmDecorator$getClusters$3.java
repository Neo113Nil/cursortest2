package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import we0.k;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator.PreCachingAlgorithmDecorator$getClusters$3", f = "PreCachingAlgorithmDecorator.kt", l = {143}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PreCachingAlgorithmDecorator$getClusters$3 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ k $clusteringOptions;
    final /* synthetic */ int $prevZoomLevel;
    int label;
    final /* synthetic */ PreCachingAlgorithmDecorator<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreCachingAlgorithmDecorator$getClusters$3(PreCachingAlgorithmDecorator<T> preCachingAlgorithmDecorator, int i11, k kVar, d<? super PreCachingAlgorithmDecorator$getClusters$3> dVar) {
        super(2, dVar);
        this.this$0 = preCachingAlgorithmDecorator;
        this.$prevZoomLevel = i11;
        this.$clusteringOptions = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PreCachingAlgorithmDecorator$getClusters$3(this.this$0, this.$prevZoomLevel, this.$clusteringOptions, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object precacheZoomLevel;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            PreCachingAlgorithmDecorator<T> preCachingAlgorithmDecorator = this.this$0;
            int i12 = this.$prevZoomLevel;
            k kVar = this.$clusteringOptions;
            this.label = 1;
            precacheZoomLevel = preCachingAlgorithmDecorator.precacheZoomLevel(i12, kVar, this);
            if (precacheZoomLevel == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PreCachingAlgorithmDecorator$getClusters$3) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
