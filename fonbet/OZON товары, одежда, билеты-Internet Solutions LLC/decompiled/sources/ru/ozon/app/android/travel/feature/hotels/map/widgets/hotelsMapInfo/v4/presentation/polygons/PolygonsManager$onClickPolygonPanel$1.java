package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.polygons;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.polygons.PolygonsRepository;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.polygons.PolygonsManager$onClickPolygonPanel$1", f = "PolygonsManager.kt", l = {86}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PolygonsManager$onClickPolygonPanel$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ PolygonsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PolygonsManager$onClickPolygonPanel$1(PolygonsManager polygonsManager, d<? super PolygonsManager$onClickPolygonPanel$1> dVar) {
        super(2, dVar);
        this.this$0 = polygonsManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PolygonsManager$onClickPolygonPanel$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        PolygonsRepository polygonsRepository;
        boolean z11;
        boolean z12;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            polygonsRepository = this.this$0.polygonsRepository;
            z11 = this.this$0.isPolygonsEnable;
            this.label = 1;
            if (polygonsRepository.toggle(z11, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        PolygonsManager polygonsManager = this.this$0;
        z12 = polygonsManager.isPolygonsEnable;
        polygonsManager.canShowPolygons = Boolean.valueOf(z12);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PolygonsManager$onClickPolygonPanel$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
