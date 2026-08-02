package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.presentation;

import Sc.r;
import Sc.s;
import W10.c;
import Wc.a;
import i10.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.shared.HotelsBookTotalIsLoadingUpdate;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.presentation.HotelsBookTotalV2ViewModel;
import ru.ozon.app.android.travel.usecase.RequestTravelCommonActionV2UseCase;
import ru.ozon.app.android.travel.usecase.TravelCommonActionV2Model;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.presentation.HotelsBookTotalV2ViewModel$performApiAction$4", f = "HotelsBookTotalV2ViewModel.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class HotelsBookTotalV2ViewModel$performApiAction$4 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ Map<String, Object> $filledParams;
    final /* synthetic */ boolean $isButtonLoader;
    final /* synthetic */ c $trackingData;
    int label;
    final /* synthetic */ HotelsBookTotalV2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsBookTotalV2ViewModel$performApiAction$4(boolean z11, HotelsBookTotalV2ViewModel hotelsBookTotalV2ViewModel, String str, Map<String, Object> map, c cVar, d<? super HotelsBookTotalV2ViewModel$performApiAction$4> dVar) {
        super(2, dVar);
        this.$isButtonLoader = z11;
        this.this$0 = hotelsBookTotalV2ViewModel;
        this.$actionName = str;
        this.$filledParams = map;
        this.$trackingData = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsBookTotalV2ViewModel$performApiAction$4(this.$isButtonLoader, this.this$0, this.$actionName, this.$filledParams, this.$trackingData, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC7851b interfaceC7851b;
        RequestTravelCommonActionV2UseCase requestTravelCommonActionV2UseCase;
        InterfaceC7851b interfaceC7851b2;
        InterfaceC7851b interfaceC7851b3;
        InterfaceC7851b interfaceC7851b4;
        SingleLiveEvent singleLiveEvent;
        InterfaceC7851b interfaceC7851b5;
        InterfaceC7851b interfaceC7851b6;
        SingleLiveEvent singleLiveEvent2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (this.$isButtonLoader) {
                interfaceC7851b2 = this.this$0.controller;
                interfaceC7851b2.update(new HotelsBookTotalIsLoadingUpdate(true));
            } else {
                interfaceC7851b = this.this$0.controller;
                interfaceC7851b.e(new l.a.C1079a(0L, null, 3));
            }
            requestTravelCommonActionV2UseCase = this.this$0.requestTravelCommonActionV2UseCase;
            String str = this.$actionName;
            Map<String, ? extends Object> map = this.$filledParams;
            c cVar = this.$trackingData;
            this.label = 1;
            obj = requestTravelCommonActionV2UseCase.invoke(str, map, cVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        Object f26106a = ((r) obj).getF26106a();
        HotelsBookTotalV2ViewModel hotelsBookTotalV2ViewModel = this.this$0;
        if (!(f26106a instanceof r.b)) {
            interfaceC7851b5 = hotelsBookTotalV2ViewModel.controller;
            interfaceC7851b5.hideLoader();
            interfaceC7851b6 = hotelsBookTotalV2ViewModel.controller;
            interfaceC7851b6.update(new HotelsBookTotalIsLoadingUpdate(false));
            singleLiveEvent2 = hotelsBookTotalV2ViewModel.resultLiveData;
            singleLiveEvent2.setValue(new HotelsBookTotalV2ViewModel.ActionResult.NewAction(((TravelCommonActionV2Model) f26106a).getAction()));
        }
        HotelsBookTotalV2ViewModel hotelsBookTotalV2ViewModel2 = this.this$0;
        Throwable b11 = r.b(f26106a);
        if (b11 != null) {
            interfaceC7851b3 = hotelsBookTotalV2ViewModel2.controller;
            interfaceC7851b3.hideLoader();
            interfaceC7851b4 = hotelsBookTotalV2ViewModel2.controller;
            interfaceC7851b4.update(new HotelsBookTotalIsLoadingUpdate(false));
            Lm0.a.f17149a.e(b11);
            singleLiveEvent = hotelsBookTotalV2ViewModel2.resultLiveData;
            singleLiveEvent.setValue(HotelsBookTotalV2ViewModel.ActionResult.Error.INSTANCE);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsBookTotalV2ViewModel$performApiAction$4) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
