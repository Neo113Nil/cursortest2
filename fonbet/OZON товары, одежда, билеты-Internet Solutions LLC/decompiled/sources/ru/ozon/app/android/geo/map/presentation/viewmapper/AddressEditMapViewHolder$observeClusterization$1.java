package ru.ozon.app.android.geo.map.presentation.viewmapper;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.geo.map.clusterization.PinsState;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/geo/map/clusterization/PinsState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewHolder$observeClusterization$1", f = "AddressEditMapViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddressEditMapViewHolder$observeClusterization$1 extends j implements Function2<PinsState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddressEditMapViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapViewHolder$observeClusterization$1(AddressEditMapViewHolder addressEditMapViewHolder, d<? super AddressEditMapViewHolder$observeClusterization$1> dVar) {
        super(2, dVar);
        this.this$0 = addressEditMapViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddressEditMapViewHolder$observeClusterization$1 addressEditMapViewHolder$observeClusterization$1 = new AddressEditMapViewHolder$observeClusterization$1(this.this$0, dVar);
        addressEditMapViewHolder$observeClusterization$1.L$0 = obj;
        return addressEditMapViewHolder$observeClusterization$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.handleClusterizationState((PinsState) this.L$0);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PinsState pinsState, d<? super Unit> dVar) {
        return ((AddressEditMapViewHolder$observeClusterization$1) create(pinsState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
