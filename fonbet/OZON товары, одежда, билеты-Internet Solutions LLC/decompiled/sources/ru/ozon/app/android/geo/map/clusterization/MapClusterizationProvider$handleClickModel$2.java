package ru.ozon.app.android.geo.map.clusterization;

import Sc.o;
import Sc.s;
import Wc.a;
import ee0.InterfaceC6350a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.geo.map.clusterization.MapClusterizationProvider$handleClickModel$2", f = "MapClusterizationProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class MapClusterizationProvider$handleClickModel$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC6350a $clickModel;
    int label;
    final /* synthetic */ MapClusterizationProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapClusterizationProvider$handleClickModel$2(InterfaceC6350a interfaceC6350a, MapClusterizationProvider mapClusterizationProvider, d<? super MapClusterizationProvider$handleClickModel$2> dVar) {
        super(2, dVar);
        this.$clickModel = interfaceC6350a;
        this.this$0 = mapClusterizationProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MapClusterizationProvider$handleClickModel$2(this.$clickModel, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        InterfaceC6350a interfaceC6350a = this.$clickModel;
        if (interfaceC6350a instanceof InterfaceC6350a.C0978a) {
            this.this$0.handleClusterClick(((InterfaceC6350a.C0978a) interfaceC6350a).a().d());
        } else {
            if (!(interfaceC6350a instanceof InterfaceC6350a.b)) {
                throw new o();
            }
            Object k11 = ((InterfaceC6350a.b) interfaceC6350a).a().k();
            PinMetadata pinMetadata = k11 instanceof PinMetadata ? (PinMetadata) k11 : null;
            if (pinMetadata == null) {
                return Unit.f71690a;
            }
            this.this$0.handlePinClick(((InterfaceC6350a.b) this.$clickModel).a().e(), pinMetadata.getIsMergedPin());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((MapClusterizationProvider$handleClickModel$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
