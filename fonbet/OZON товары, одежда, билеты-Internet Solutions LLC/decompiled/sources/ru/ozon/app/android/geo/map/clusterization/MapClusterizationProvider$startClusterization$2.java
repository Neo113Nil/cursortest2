package ru.ozon.app.android.geo.map.clusterization;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.geo.map.clusterization.MapClusterizationProvider$startClusterization$2", f = "MapClusterizationProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class MapClusterizationProvider$startClusterization$2 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ MapClusterizationProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapClusterizationProvider$startClusterization$2(MapClusterizationProvider mapClusterizationProvider, d<? super MapClusterizationProvider$startClusterization$2> dVar) {
        super(2, dVar);
        this.this$0 = mapClusterizationProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MapClusterizationProvider$startClusterization$2(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        r2 = r1.this$0.clusterizer;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        Function0 function0;
        de0.d dVar;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.updateClusterizationState();
        z11 = this.this$0.isClusterizationEnabled;
        if (z11 && dVar != null) {
            dVar.d();
        }
        function0 = this.this$0.onClusterizationFinished;
        function0.invoke();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((MapClusterizationProvider$startClusterization$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
