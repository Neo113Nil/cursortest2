package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation;

import Lm0.a;
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
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.EmptyStateV3UiState;
import ru.ozon.app.android.travel.logger.TravelActionLogger;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.EmptyStateV3ViewModel$handleAction$1", f = "EmptyStateV3ViewModel.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EmptyStateV3ViewModel$handleAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ String $buttonId;
    final /* synthetic */ c $trackingData;
    int label;
    final /* synthetic */ EmptyStateV3ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmptyStateV3ViewModel$handleAction$1(EmptyStateV3ViewModel emptyStateV3ViewModel, String str, AtomAction atomAction, c cVar, d<? super EmptyStateV3ViewModel$handleAction$1> dVar) {
        super(2, dVar);
        this.this$0 = emptyStateV3ViewModel;
        this.$buttonId = str;
        this.$action = atomAction;
        this.$trackingData = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new EmptyStateV3ViewModel$handleAction$1(this.this$0, this.$buttonId, this.$action, this.$trackingData, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        EmptyStateV3ViewModel emptyStateV3ViewModel;
        Object data;
        EmptyStateV3UiState.Action action;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            try {
                try {
                    if (i11 == 0) {
                        s.b(obj);
                        this.this$0.showButtonLoader(this.$buttonId);
                        actionV2Repository = this.this$0.actionV2Repository;
                        ActionV2Request actionV2Request = new ActionV2Request(((AtomAction.ComposerAction) this.$action).getParams(), ((AtomAction.ComposerAction) this.$action).getActionName(), true);
                        c cVar = this.$trackingData;
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
                    ActionV2Response ensureSuccessful = ActionV2ExtensionsKt.ensureSuccessful((ActionV2Response) obj);
                    emptyStateV3ViewModel = this.this$0;
                    data = ensureSuccessful.getData();
                } catch (CancellationException e11) {
                    throw e11;
                }
            } catch (Throwable th2) {
                if (th2 instanceof ActionV2RepositoryError) {
                    TravelActionLogger.INSTANCE.logException(th2, "travel_emptyState3_action");
                } else {
                    LoggerExtKt.sendNonFatal$default(th2, null, "travel_emptyState3_action", null, 10, null);
                }
                BuildUtils buildUtils = BuildUtils.INSTANCE;
                if (buildUtils.isQaFlavor() || buildUtils.isDebug()) {
                    a.b bVar = Lm0.a.f17149a;
                    bVar.b("travel_emptyState3_action");
                    bVar.e(th2);
                }
                this.this$0.showError();
            }
            if (data == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            action = emptyStateV3ViewModel.toAction((TravelCommonActionResponseV2) data);
            emptyStateV3ViewModel.setAction(action);
            this.this$0.hideButtonLoader(this.$buttonId);
            return Unit.f71690a;
        } catch (Throwable th3) {
            this.this$0.hideButtonLoader(this.$buttonId);
            throw th3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((EmptyStateV3ViewModel$handleAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
