package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResponse;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResultApi;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation.TravelPassengersSelectorViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation.TravelPassengersSelectorViewModel$sendFormData$1", f = "TravelPassengersSelectorViewModel.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TravelPassengersSelectorViewModel$sendFormData$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ Map<String, Object> $requestMap;
    int label;
    final /* synthetic */ TravelPassengersSelectorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPassengersSelectorViewModel$sendFormData$1(TravelPassengersSelectorViewModel travelPassengersSelectorViewModel, AtomAction.ComposerAction composerAction, Map<String, ? extends Object> map, d<? super TravelPassengersSelectorViewModel$sendFormData$1> dVar) {
        super(2, dVar);
        this.this$0 = travelPassengersSelectorViewModel;
        this.$action = composerAction;
        this.$requestMap = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TravelPassengersSelectorViewModel$sendFormData$1(this.this$0, this.$action, this.$requestMap, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        SingleLiveEvent singleLiveEvent;
        SingleLiveEvent singleLiveEvent2;
        SingleLiveEvent singleLiveEvent3;
        SingleLiveEvent singleLiveEvent4;
        TravelCommonActionResultApi travelCommonActionResultApi;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                singleLiveEvent4 = this.this$0._actionLiveData;
                singleLiveEvent4.setValue(TravelPassengersSelectorViewModel.Action.ShowProgress.INSTANCE);
                TravelPassengersSelectorViewModel travelPassengersSelectorViewModel = this.this$0;
                AtomAction.ComposerAction composerAction = this.$action;
                Map<String, Object> map = this.$requestMap;
                r.Companion companion = r.INSTANCE;
                travelCommonActionResultApi = travelPassengersSelectorViewModel.api;
                String actionName = composerAction.getActionName();
                this.label = 1;
                obj = travelCommonActionResultApi.suspendActionWithAnyParams(actionName, map, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = (TravelCommonActionResponse) obj;
            r.Companion companion2 = r.INSTANCE;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        TravelPassengersSelectorViewModel travelPassengersSelectorViewModel2 = this.this$0;
        if (!(a11 instanceof r.b)) {
            singleLiveEvent3 = travelPassengersSelectorViewModel2._actionLiveData;
            singleLiveEvent3.setValue(new TravelPassengersSelectorViewModel.Action.DismissAndRefresh(((TravelCommonActionResponse) a11).getAction()));
        }
        TravelPassengersSelectorViewModel travelPassengersSelectorViewModel3 = this.this$0;
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
            singleLiveEvent2 = travelPassengersSelectorViewModel3._actionLiveData;
            singleLiveEvent2.setValue(TravelPassengersSelectorViewModel.Action.Error.INSTANCE);
        }
        singleLiveEvent = this.this$0._actionLiveData;
        singleLiveEvent.setValue(TravelPassengersSelectorViewModel.Action.HideProgress.INSTANCE);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TravelPassengersSelectorViewModel$sendFormData$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
