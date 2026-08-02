package ru.ozon.app.android.geo.map.clusterization;

import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import we0.u;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.geo.map.clusterization.MapClusterizationProvider$observeCameraCenterAndClusterize$2", f = "MapClusterizationProvider.kt", l = {178}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class MapClusterizationProvider$observeCameraCenterAndClusterize$2 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    final /* synthetic */ List<u> $placemarks;
    int label;
    final /* synthetic */ MapClusterizationProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapClusterizationProvider$observeCameraCenterAndClusterize$2(MapClusterizationProvider mapClusterizationProvider, List<u> list, d<? super MapClusterizationProvider$observeCameraCenterAndClusterize$2> dVar) {
        super(2, dVar);
        this.this$0 = mapClusterizationProvider;
        this.$placemarks = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MapClusterizationProvider$observeCameraCenterAndClusterize$2(this.this$0, this.$placemarks, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object startClusterization;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            MapClusterizationProvider mapClusterizationProvider = this.this$0;
            List<u> list = this.$placemarks;
            this.label = 1;
            startClusterization = mapClusterizationProvider.startClusterization(list, this);
            if (startClusterization == aVar) {
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

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((MapClusterizationProvider$observeCameraCenterAndClusterize$2) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
