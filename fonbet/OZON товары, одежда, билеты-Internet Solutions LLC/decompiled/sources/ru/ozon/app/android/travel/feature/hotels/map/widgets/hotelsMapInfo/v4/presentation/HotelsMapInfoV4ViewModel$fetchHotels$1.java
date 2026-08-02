package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Sc.s;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.ThrowableExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapAction;
import ru.ozon.uni.atoms.af.AtomAction;
import we0.i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4ViewModel$fetchHotels$1", f = "HotelsMapInfoV4ViewModel.kt", l = {654}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsMapInfoV4ViewModel$fetchHotels$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ i $area;
    final /* synthetic */ List<String> $pinsOnMap;
    final /* synthetic */ List<String> $polygonsOnMap;
    final /* synthetic */ float $zoom;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HotelsMapInfoV4ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4ViewModel$fetchHotels$1(HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel, List<String> list, i iVar, List<String> list2, float f7, d<? super HotelsMapInfoV4ViewModel$fetchHotels$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsMapInfoV4ViewModel;
        this.$pinsOnMap = list;
        this.$area = iVar;
        this.$polygonsOnMap = list2;
        this.$zoom = f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsMapInfoV4ViewModel$fetchHotels$1 hotelsMapInfoV4ViewModel$fetchHotels$1 = new HotelsMapInfoV4ViewModel$fetchHotels$1(this.this$0, this.$pinsOnMap, this.$area, this.$polygonsOnMap, this.$zoom, dVar);
        hotelsMapInfoV4ViewModel$fetchHotels$1.L$0 = obj;
        return hotelsMapInfoV4ViewModel$fetchHotels$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        HotelsMapInfoV4ViewModel$fetchHotels$1 hotelsMapInfoV4ViewModel$fetchHotels$1;
        Object obj2;
        M m11;
        UpdateHotelsManager updateHotelsManager;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                m11 = (M) this.L$0;
                try {
                    HotelsMapInfoV4VO hotelsMapInfoV4VO = this.this$0.vo;
                    AtomAction fetchPinsAction = hotelsMapInfoV4VO != null ? hotelsMapInfoV4VO.getFetchPinsAction() : null;
                    AtomAction.ComposerAction composerAction = fetchPinsAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) fetchPinsAction : null;
                    if (composerAction == null) {
                        return Unit.f71690a;
                    }
                    updateHotelsManager = this.this$0.updateHotelsManager;
                    HotelsMapInfoV4VO hotelsMapInfoV4VO2 = this.this$0.vo;
                    Long l11 = hotelsMapInfoV4VO2 != null ? new Long(hotelsMapInfoV4VO2.getId()) : null;
                    List<String> list = this.$pinsOnMap;
                    i iVar = this.$area;
                    List<String> list2 = this.$polygonsOnMap;
                    Float f7 = new Float(this.$zoom);
                    this.L$0 = m11;
                    this.label = 1;
                    hotelsMapInfoV4ViewModel$fetchHotels$1 = this;
                    try {
                        obj = updateHotelsManager.fetchHotels(l11, composerAction, list, iVar, list2, f7, hotelsMapInfoV4ViewModel$fetchHotels$1);
                        m11 = m11;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } catch (CancellationException e11) {
                        e = e11;
                        throw e;
                    } catch (Throwable th3) {
                        th = th3;
                        th2 = th;
                        obj2 = m11;
                        hotelsMapInfoV4ViewModel$fetchHotels$1.this$0.send(MapAction.ShowErrorNotification.INSTANCE);
                        ThrowableExtKt.log(th2, obj2.getClass().getSimpleName().concat("_fetchHotels"));
                        return Unit.f71690a;
                    }
                } catch (CancellationException e12) {
                    e = e12;
                    throw e;
                } catch (Throwable th4) {
                    th = th4;
                    hotelsMapInfoV4ViewModel$fetchHotels$1 = this;
                    th2 = th;
                    obj2 = m11;
                    hotelsMapInfoV4ViewModel$fetchHotels$1.this$0.send(MapAction.ShowErrorNotification.INSTANCE);
                    ThrowableExtKt.log(th2, obj2.getClass().getSimpleName().concat("_fetchHotels"));
                    return Unit.f71690a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                M m12 = (M) this.L$0;
                s.b(obj);
                hotelsMapInfoV4ViewModel$fetchHotels$1 = this;
                m11 = m12;
            }
            hotelsMapInfoV4ViewModel$fetchHotels$1.this$0.fetchState(hotelsMapInfoV4ViewModel$fetchHotels$1.$area, (FetchPinsActionResponseVO) obj, hotelsMapInfoV4ViewModel$fetchHotels$1.$zoom, true);
        } catch (CancellationException e13) {
            throw e13;
        } catch (Throwable th5) {
            th2 = th5;
            hotelsMapInfoV4ViewModel$fetchHotels$1 = this;
            obj2 = i11;
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsMapInfoV4ViewModel$fetchHotels$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
