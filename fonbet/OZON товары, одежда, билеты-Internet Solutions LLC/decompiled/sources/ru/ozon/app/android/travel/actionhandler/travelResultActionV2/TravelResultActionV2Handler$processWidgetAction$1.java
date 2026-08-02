package ru.ozon.app.android.travel.actionhandler.travelResultActionV2;

import Lm0.a;
import Sc.InterfaceC4008j;
import Sc.s;
import Tg.b;
import Vg.f;
import W10.c;
import Wc.a;
import i10.l;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.travel.actionhandler.utils.NotificationBarDelegate;
import ru.ozon.app.android.travel.actionhandler.utils.TravelResultActionV2ErrorUpdate;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2ExtensionsKt;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2RepositoryError;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResponseV2;
import ru.ozon.app.android.travel.logger.TravelActionLogger;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.actionhandler.travelResultActionV2.TravelResultActionV2Handler$processWidgetAction$1", f = "TravelResultActionV2Handler.kt", l = {188}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TravelResultActionV2Handler$processWidgetAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ b $action;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ boolean $isSilentRefresh;
    final /* synthetic */ InterfaceC4008j<NotificationBarDelegate> $notificationBarDelegate$delegate;
    final /* synthetic */ f.a $widgetInfo;
    int label;
    final /* synthetic */ TravelResultActionV2Handler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TravelResultActionV2Handler$processWidgetAction$1(boolean z11, InterfaceC7851b interfaceC7851b, TravelResultActionV2Handler travelResultActionV2Handler, b bVar, f.a aVar, InterfaceC4008j<NotificationBarDelegate> interfaceC4008j, Function1<? super AtomAction, Unit> function1, d<? super TravelResultActionV2Handler$processWidgetAction$1> dVar) {
        super(2, dVar);
        this.$isSilentRefresh = z11;
        this.$controller = interfaceC7851b;
        this.this$0 = travelResultActionV2Handler;
        this.$action = bVar;
        this.$widgetInfo = aVar;
        this.$notificationBarDelegate$delegate = interfaceC4008j;
        this.$actionHandler = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TravelResultActionV2Handler$processWidgetAction$1(this.$isSilentRefresh, this.$controller, this.this$0, this.$action, this.$widgetInfo, this.$notificationBarDelegate$delegate, this.$actionHandler, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0110, code lost:
    
        r1 = ru.ozon.app.android.travel.actionhandler.travelResultActionV2.TravelResultActionV2Handler.processWidgetAction$lambda$0(r10.$notificationBarDelegate$delegate);
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NotificationBarDelegate processWidgetAction$lambda$0;
        ActionV2Response actionV2Response;
        TrackableActions trackableActions;
        TravelCommonActionResponseV2 travelCommonActionResponseV2;
        AtomActionDTO action;
        TravelCommonActionResponseV2 travelCommonActionResponseV22;
        NotificationDTO notification;
        NotificationBarDelegate processWidgetAction$lambda$02;
        ActionV2Repository actionV2Repository;
        l.a loaderType;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        AtomAction atomAction = null;
        try {
            try {
                try {
                    if (i11 == 0) {
                        s.b(obj);
                        if (!this.$isSilentRefresh) {
                            InterfaceC7851b interfaceC7851b = this.$controller;
                            loaderType = this.this$0.getLoaderType((AtomAction.ComposerAction) this.$action);
                            interfaceC7851b.e(loaderType);
                        }
                        actionV2Repository = this.this$0.actionV2Repository;
                        ActionV2Request actionV2Request = new ActionV2Request(((AtomAction.ComposerAction) this.$action).getParams(), ((AtomAction.ComposerAction) this.$action).getActionName(), true);
                        c n11 = this.$widgetInfo.c().n();
                        this.label = 1;
                        obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, n11, TravelCommonActionResponseV2.class, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    actionV2Response = ActionV2ExtensionsKt.ensureSuccessful((ActionV2Response) obj);
                    if (!this.$isSilentRefresh) {
                        this.$controller.hideLoader();
                    }
                } catch (CancellationException e11) {
                    throw e11;
                }
            } catch (Throwable th2) {
                if (th2 instanceof ActionV2RepositoryError) {
                    TravelActionLogger.INSTANCE.logException(th2, "travel_travelResultActionV2");
                } else {
                    LoggerExtKt.sendNonFatal$default(th2, null, "travel_travelResultActionV2", null, 10, null);
                }
                BuildUtils buildUtils = BuildUtils.INSTANCE;
                if (buildUtils.isQaFlavor() || buildUtils.isDebug()) {
                    a.b bVar = Lm0.a.f17149a;
                    bVar.b("travel_travelResultActionV2");
                    bVar.e(th2);
                }
                processWidgetAction$lambda$0 = TravelResultActionV2Handler.processWidgetAction$lambda$0(this.$notificationBarDelegate$delegate);
                if (processWidgetAction$lambda$0 != null) {
                    processWidgetAction$lambda$0.showDefaultError();
                }
                this.$controller.update(new TravelResultActionV2ErrorUpdate(((AtomAction.ComposerAction) this.$action).getActionName()));
                if (!this.$isSilentRefresh) {
                    this.$controller.hideLoader();
                }
                actionV2Response = null;
            }
            trackableActions = this.this$0.trackableActions;
            if (trackableActions.contains(((AtomAction.ComposerAction) this.$action).getActionName())) {
                this.this$0.trackPerformance(actionV2Response != null ? actionV2Response.getMetrics() : null, this.$widgetInfo.c().i().b().c().e());
            }
            if (actionV2Response != null && (travelCommonActionResponseV22 = (TravelCommonActionResponseV2) actionV2Response.getData()) != null && (notification = travelCommonActionResponseV22.getNotification()) != null && processWidgetAction$lambda$02 != null) {
                processWidgetAction$lambda$02.show(notification);
            }
            if (actionV2Response != null && (travelCommonActionResponseV2 = (TravelCommonActionResponseV2) actionV2Response.getData()) != null && (action = travelCommonActionResponseV2.getAction()) != null) {
                atomAction = AtomActionMapperKt.toAtomAction(action, null);
            }
            if (atomAction != null) {
                this.this$0.handleAtomAction(this.$actionHandler, atomAction);
            }
            return Unit.f71690a;
        } catch (Throwable th3) {
            if (this.$isSilentRefresh) {
                throw th3;
            }
            this.$controller.hideLoader();
            throw th3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TravelResultActionV2Handler$processWidgetAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
