package ru.ozon.app.android.travel.feature.general.common.widgets.invisibleRefresher.presentation;

import Lm0.a;
import Sc.r;
import Sc.s;
import W10.c;
import Wc.a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2ExtensionsKt;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2RepositoryError;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResponseV2;
import ru.ozon.app.android.travel.feature.general.common.widgets.invisibleRefresher.presentation.InvisibleRefresherViewModel;
import ru.ozon.app.android.travel.logger.TravelActionLogger;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.invisibleRefresher.presentation.InvisibleRefresherViewModel$performAction$1", f = "InvisibleRefresherViewModel.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InvisibleRefresherViewModel$performAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ c $trackingData;
    int label;
    final /* synthetic */ InvisibleRefresherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvisibleRefresherViewModel$performAction$1(InvisibleRefresherViewModel invisibleRefresherViewModel, AtomAction atomAction, c cVar, d<? super InvisibleRefresherViewModel$performAction$1> dVar) {
        super(2, dVar);
        this.this$0 = invisibleRefresherViewModel;
        this.$action = atomAction;
        this.$trackingData = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new InvisibleRefresherViewModel$performAction$1(this.this$0, this.$action, this.$trackingData, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        SingleLiveEvent singleLiveEvent;
        SingleLiveEvent singleLiveEvent2;
        AtomActionDTO action;
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                InvisibleRefresherViewModel invisibleRefresherViewModel = this.this$0;
                AtomAction atomAction = this.$action;
                c cVar = this.$trackingData;
                r.Companion companion = r.INSTANCE;
                actionV2Repository = invisibleRefresherViewModel.actionV2Repository;
                ActionV2Request actionV2Request = new ActionV2Request(((AtomAction.ComposerAction) atomAction).getParams(), ((AtomAction.ComposerAction) atomAction).getActionName(), true);
                this.label = 1;
                obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, cVar, TravelCommonActionResponseV2.class, this);
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
        InvisibleRefresherViewModel invisibleRefresherViewModel2 = this.this$0;
        if (!(a11 instanceof r.b)) {
            TravelCommonActionResponseV2 travelCommonActionResponseV2 = (TravelCommonActionResponseV2) ((ActionV2Response) a11).getData();
            AtomAction atomAction2 = null;
            if (travelCommonActionResponseV2 != null && (action = travelCommonActionResponseV2.getAction()) != null) {
                atomAction2 = AtomActionMapperKt.toAtomAction(action, null);
            }
            singleLiveEvent2 = invisibleRefresherViewModel2.resultLiveData;
            singleLiveEvent2.setValue(atomAction2 != null ? new InvisibleRefresherViewModel.ActionResult.Action(atomAction2) : InvisibleRefresherViewModel.ActionResult.StartTimer.INSTANCE);
        }
        InvisibleRefresherViewModel invisibleRefresherViewModel3 = this.this$0;
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            if (b11 instanceof ActionV2RepositoryError) {
                TravelActionLogger.INSTANCE.logException(b11, "travel_invisibleRefresher_action");
            } else {
                LoggerExtKt.sendNonFatal$default(b11, null, "travel_invisibleRefresher_action", null, 10, null);
            }
            BuildUtils buildUtils = BuildUtils.INSTANCE;
            if (buildUtils.isQaFlavor() || buildUtils.isDebug()) {
                a.b bVar = Lm0.a.f17149a;
                bVar.b("travel_invisibleRefresher_action");
                bVar.e(b11);
            }
            singleLiveEvent = invisibleRefresherViewModel3.resultLiveData;
            singleLiveEvent.setValue(InvisibleRefresherViewModel.ActionResult.StartTimer.INSTANCE);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((InvisibleRefresherViewModel$performAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
