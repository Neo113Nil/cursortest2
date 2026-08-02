package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation;

import Sc.s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data.TravelAddNewPassengerFormV3ResponseDTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data.TravelAddNewPassengerFormV3ResultApi;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3ResponseDTO;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3ResponseDTO;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3ViewModel$performOnFocusLostComposerAction$1$1$1", f = "TravelAddNewPassengerFormV3ViewModel.kt", l = {292}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TravelAddNewPassengerFormV3ViewModel$performOnFocusLostComposerAction$1$1$1 extends j implements Function2<M, d<? super TravelAddNewPassengerFormV3ResponseDTO>, Object> {
    final /* synthetic */ AtomAction $atomAction;
    final /* synthetic */ Map<String, String> $params;
    int label;
    final /* synthetic */ TravelAddNewPassengerFormV3ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelAddNewPassengerFormV3ViewModel$performOnFocusLostComposerAction$1$1$1(TravelAddNewPassengerFormV3ViewModel travelAddNewPassengerFormV3ViewModel, AtomAction atomAction, Map<String, String> map, d<? super TravelAddNewPassengerFormV3ViewModel$performOnFocusLostComposerAction$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = travelAddNewPassengerFormV3ViewModel;
        this.$atomAction = atomAction;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TravelAddNewPassengerFormV3ViewModel$performOnFocusLostComposerAction$1$1$1(this.this$0, this.$atomAction, this.$params, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TravelAddNewPassengerFormV3ResultApi travelAddNewPassengerFormV3ResultApi;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        travelAddNewPassengerFormV3ResultApi = this.this$0.api;
        String actionName = ((AtomAction.ComposerAction) this.$atomAction).getActionName();
        Map<String, String> map = this.$params;
        this.label = 1;
        Object processPassengerFormRequest = travelAddNewPassengerFormV3ResultApi.processPassengerFormRequest(actionName, map, this);
        return processPassengerFormRequest == aVar ? aVar : processPassengerFormRequest;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super TravelAddNewPassengerFormV3ResponseDTO> dVar) {
        return ((TravelAddNewPassengerFormV3ViewModel$performOnFocusLostComposerAction$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
