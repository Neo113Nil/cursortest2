package ru.ozon.app.android.geo.map.clusterization;

import Sc.s;
import Wc.a;
import ee0.InterfaceC6350a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lee0/a;", "it", "", "<anonymous>", "(Lee0/a;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.geo.map.clusterization.MapClusterizationProvider$observeActions$1", f = "MapClusterizationProvider.kt", l = {202}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class MapClusterizationProvider$observeActions$1 extends j implements Function2<InterfaceC6350a, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MapClusterizationProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapClusterizationProvider$observeActions$1(MapClusterizationProvider mapClusterizationProvider, d<? super MapClusterizationProvider$observeActions$1> dVar) {
        super(2, dVar);
        this.this$0 = mapClusterizationProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        MapClusterizationProvider$observeActions$1 mapClusterizationProvider$observeActions$1 = new MapClusterizationProvider$observeActions$1(this.this$0, dVar);
        mapClusterizationProvider$observeActions$1.L$0 = obj;
        return mapClusterizationProvider$observeActions$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC6350a interfaceC6350a, d<? super Unit> dVar) {
        return ((MapClusterizationProvider$observeActions$1) create(interfaceC6350a, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object handleClickModel;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC6350a interfaceC6350a = (InterfaceC6350a) this.L$0;
            MapClusterizationProvider mapClusterizationProvider = this.this$0;
            this.label = 1;
            handleClickModel = mapClusterizationProvider.handleClickModel(interfaceC6350a, this);
            if (handleClickModel == aVar) {
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
}
