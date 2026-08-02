package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Je.InterfaceC3394a;
import Sc.s;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapAction;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4Wrapper$drawPins$1", f = "HotelsMapInfoV4Wrapper.kt", l = {568, 287}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsMapInfoV4Wrapper$drawPins$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ MapAction.DrawPins $action;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ HotelsMapInfoV4Wrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4Wrapper$drawPins$1(HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper, MapAction.DrawPins drawPins, d<? super HotelsMapInfoV4Wrapper$drawPins$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsMapInfoV4Wrapper;
        this.$action = drawPins;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsMapInfoV4Wrapper$drawPins$1 hotelsMapInfoV4Wrapper$drawPins$1 = new HotelsMapInfoV4Wrapper$drawPins$1(this.this$0, this.$action, dVar);
        hotelsMapInfoV4Wrapper$drawPins$1.L$0 = obj;
        return hotelsMapInfoV4Wrapper$drawPins$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        M m11;
        InterfaceC3394a interfaceC3394a;
        HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper;
        InterfaceC3394a interfaceC3394a2;
        MapAction.DrawPins drawPins;
        InterfaceC3394a interfaceC3394a3;
        HashMap currentPinsOnMapExceptDistrictLabels;
        Object pinsToInsertAndDelete;
        M m12;
        HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper2;
        HashMap hashMap;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                m11 = (M) this.L$0;
                interfaceC3394a = this.this$0.mutex;
                HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper3 = this.this$0;
                MapAction.DrawPins drawPins2 = this.$action;
                this.L$0 = m11;
                this.L$1 = interfaceC3394a;
                this.L$2 = hotelsMapInfoV4Wrapper3;
                this.L$3 = drawPins2;
                this.label = 1;
                if (interfaceC3394a.a(this) != aVar) {
                    hotelsMapInfoV4Wrapper = hotelsMapInfoV4Wrapper3;
                    interfaceC3394a2 = interfaceC3394a;
                    drawPins = drawPins2;
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hotelsMapInfoV4Wrapper2 = (HotelsMapInfoV4Wrapper) this.L$2;
                interfaceC3394a3 = (InterfaceC3394a) this.L$1;
                m12 = (M) this.L$0;
                try {
                    s.b(obj);
                    hotelsMapInfoV4Wrapper2.hotelsMapInfoView.getController().b().l((List) obj);
                    hashMap = hotelsMapInfoV4Wrapper2.pinsToDrawing;
                    final HotelsMapInfoV4Wrapper$drawPins$1$1$1 hotelsMapInfoV4Wrapper$drawPins$1$1$1 = new HotelsMapInfoV4Wrapper$drawPins$1$1$1(m12, hotelsMapInfoV4Wrapper2);
                    hashMap.forEach(new BiConsumer() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.a
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj2, Object obj3) {
                            Function2.this.invoke(obj2, obj3);
                        }
                    });
                    hotelsMapInfoV4Wrapper2.viewModel.onEvent(new MapEvent.OnFinishDrawPins(hotelsMapInfoV4Wrapper2.getCurrentPinIdsOnMapExceptDistrictLabels(), MapExtKt.getVisibleArea(hotelsMapInfoV4Wrapper2.hotelsMapInfoView.getController()), MapExtKt.getZoom(hotelsMapInfoV4Wrapper2.hotelsMapInfoView.getController())));
                    Unit unit = Unit.f71690a;
                    interfaceC3394a3.c(null);
                    return Unit.f71690a;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC3394a3.c(null);
                    throw th;
                }
            }
            drawPins = (MapAction.DrawPins) this.L$3;
            hotelsMapInfoV4Wrapper = (HotelsMapInfoV4Wrapper) this.L$2;
            interfaceC3394a2 = (InterfaceC3394a) this.L$1;
            M m13 = (M) this.L$0;
            s.b(obj);
            m11 = m13;
            currentPinsOnMapExceptDistrictLabels = hotelsMapInfoV4Wrapper.getCurrentPinsOnMapExceptDistrictLabels();
            Map<String, HotelsMapInfoV4VO.Pin> newPins = drawPins.getNewPins();
            this.L$0 = m11;
            this.L$1 = interfaceC3394a2;
            this.L$2 = hotelsMapInfoV4Wrapper;
            this.L$3 = null;
            this.label = 2;
            pinsToInsertAndDelete = hotelsMapInfoV4Wrapper.getPinsToInsertAndDelete(currentPinsOnMapExceptDistrictLabels, newPins, this);
            if (pinsToInsertAndDelete != aVar) {
                m12 = m11;
                obj = pinsToInsertAndDelete;
                hotelsMapInfoV4Wrapper2 = hotelsMapInfoV4Wrapper;
                interfaceC3394a3 = interfaceC3394a2;
                hotelsMapInfoV4Wrapper2.hotelsMapInfoView.getController().b().l((List) obj);
                hashMap = hotelsMapInfoV4Wrapper2.pinsToDrawing;
                final Function2 hotelsMapInfoV4Wrapper$drawPins$1$1$12 = new HotelsMapInfoV4Wrapper$drawPins$1$1$1(m12, hotelsMapInfoV4Wrapper2);
                hashMap.forEach(new BiConsumer() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.a
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj2, Object obj3) {
                        Function2.this.invoke(obj2, obj3);
                    }
                });
                hotelsMapInfoV4Wrapper2.viewModel.onEvent(new MapEvent.OnFinishDrawPins(hotelsMapInfoV4Wrapper2.getCurrentPinIdsOnMapExceptDistrictLabels(), MapExtKt.getVisibleArea(hotelsMapInfoV4Wrapper2.hotelsMapInfoView.getController()), MapExtKt.getZoom(hotelsMapInfoV4Wrapper2.hotelsMapInfoView.getController())));
                Unit unit2 = Unit.f71690a;
                interfaceC3394a3.c(null);
                return Unit.f71690a;
            }
            return aVar;
        } catch (Throwable th3) {
            th = th3;
            interfaceC3394a3 = interfaceC3394a2;
            interfaceC3394a3.c(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsMapInfoV4Wrapper$drawPins$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
