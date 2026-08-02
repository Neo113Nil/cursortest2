package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation;

import Lm0.a;
import Sc.r;
import Sc.s;
import Wc.a;
import i10.l;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2ExtensionsKt;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2RepositoryError;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResponse;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ViewModel;
import ru.ozon.app.android.travel.logger.TravelActionLogger;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ViewModel$submitRequest$1", f = "TouristCountSelectorV3ViewModel.kt", l = {317}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TouristCountSelectorV3ViewModel$submitRequest$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ Map<String, Object> $request;
    int label;
    final /* synthetic */ TouristCountSelectorV3ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TouristCountSelectorV3ViewModel$submitRequest$1(TouristCountSelectorV3ViewModel touristCountSelectorV3ViewModel, Map<String, ? extends Object> map, AtomAction atomAction, d<? super TouristCountSelectorV3ViewModel$submitRequest$1> dVar) {
        super(2, dVar);
        this.this$0 = touristCountSelectorV3ViewModel;
        this.$request = map;
        this.$action = atomAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TouristCountSelectorV3ViewModel$submitRequest$1(this.this$0, this.$request, this.$action, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        InterfaceC7851b interfaceC7851b;
        SingleLiveEvent singleLiveEvent;
        InterfaceC7851b interfaceC7851b2;
        SingleLiveEvent singleLiveEvent2;
        InterfaceC7851b interfaceC7851b3;
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                interfaceC7851b3 = this.this$0.composerController;
                interfaceC7851b3.e(new l.a.C1079a(0L, null, 3));
                TouristCountSelectorV3ViewModel touristCountSelectorV3ViewModel = this.this$0;
                Map<String, Object> map = this.$request;
                AtomAction atomAction = this.$action;
                r.Companion companion = r.INSTANCE;
                actionV2Repository = touristCountSelectorV3ViewModel.actionV2Repository;
                ActionV2Request actionV2Request = new ActionV2Request(map, ((AtomAction.ComposerAction) atomAction).getActionName(), true);
                this.label = 1;
                obj = actionV2Repository.callActionSuspend(actionV2Request, TravelCommonActionResponse.class, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = ActionV2ExtensionsKt.ensureSuccessful((ActionV2Response) obj);
            r.Companion companion2 = r.INSTANCE;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (!(a11 instanceof r.b)) {
            try {
                Object data = ((ActionV2Response) a11).getData();
                if (data == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                AtomActionDTO action = ((TravelCommonActionResponse) data).getAction();
                a11 = action.getBehavior() == AtomActionDTO.Behavior.BEHAVIOR_TYPE_REFRESH ? new TouristCountSelectorV3ViewModel.Action.RefreshAction(action.getLink(), action.getParams()) : new TouristCountSelectorV3ViewModel.Action.HandleAction(AtomActionMapperKt.toAtomAction(action, null));
            } catch (Throwable th3) {
                r.Companion companion4 = r.INSTANCE;
                a11 = s.a(th3);
            }
        }
        TouristCountSelectorV3ViewModel touristCountSelectorV3ViewModel2 = this.this$0;
        if (!(a11 instanceof r.b)) {
            interfaceC7851b2 = touristCountSelectorV3ViewModel2.composerController;
            interfaceC7851b2.hideLoader();
            singleLiveEvent2 = touristCountSelectorV3ViewModel2.actionLiveData;
            singleLiveEvent2.setValue((TouristCountSelectorV3ViewModel.Action) a11);
        }
        TouristCountSelectorV3ViewModel touristCountSelectorV3ViewModel3 = this.this$0;
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            if (b11 instanceof ActionV2RepositoryError) {
                TravelActionLogger.INSTANCE.logException(b11, "travel_touristCountSelector3_action");
            } else {
                LoggerExtKt.sendNonFatal$default(b11, null, "travel_touristCountSelector3_action", null, 10, null);
            }
            BuildUtils buildUtils = BuildUtils.INSTANCE;
            if (buildUtils.isQaFlavor() || buildUtils.isDebug()) {
                a.b bVar = Lm0.a.f17149a;
                bVar.b("travel_touristCountSelector3_action");
                bVar.e(b11);
            }
            interfaceC7851b = touristCountSelectorV3ViewModel3.composerController;
            interfaceC7851b.hideLoader();
            singleLiveEvent = touristCountSelectorV3ViewModel3.actionLiveData;
            singleLiveEvent.setValue(TouristCountSelectorV3ViewModel.Action.Error.INSTANCE);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TouristCountSelectorV3ViewModel$submitRequest$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
