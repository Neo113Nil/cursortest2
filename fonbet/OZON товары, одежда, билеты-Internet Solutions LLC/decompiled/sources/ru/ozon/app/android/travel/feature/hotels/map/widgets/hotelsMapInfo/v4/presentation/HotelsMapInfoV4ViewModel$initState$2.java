package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapAction;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4ViewModel$initState$2", f = "HotelsMapInfoV4ViewModel.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsMapInfoV4ViewModel$initState$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ MapEvent.OnBind $event;
    int label;
    final /* synthetic */ HotelsMapInfoV4ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4ViewModel$initState$2(HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel, MapEvent.OnBind onBind, d<? super HotelsMapInfoV4ViewModel$initState$2> dVar) {
        super(2, dVar);
        this.this$0 = hotelsMapInfoV4ViewModel;
        this.$event = onBind;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsMapInfoV4ViewModel$initState$2(this.this$0, this.$event, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object syncPolygonsState;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel = this.this$0;
            HotelsMapInfoV4VO vo = this.$event.getVo();
            this.label = 1;
            syncPolygonsState = hotelsMapInfoV4ViewModel.syncPolygonsState(vo, this);
            if (syncPolygonsState == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        HotelsMapInfoV4VO hotelsMapInfoV4VO = this.this$0.vo;
        if (hotelsMapInfoV4VO != null) {
            this.this$0.send(new MapAction.InitState(hotelsMapInfoV4VO, null, false, 6, null));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsMapInfoV4ViewModel$initState$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
