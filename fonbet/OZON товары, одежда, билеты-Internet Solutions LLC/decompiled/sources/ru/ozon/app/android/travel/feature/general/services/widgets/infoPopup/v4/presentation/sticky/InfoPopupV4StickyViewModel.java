package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.sticky;

import Ae.E0;
import Ae.InterfaceC2395h;
import He.b;
import Lm0.a;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import h3.C6788a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2ExtensionsKt;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2RepositoryError;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResponseV2;
import ru.ozon.app.android.travel.logger.TravelActionLogger;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/sticky/InfoPopupV4StickyViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "enableNotificationsSuggestingHandler", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lkotlin/coroutines/d;)Ljava/lang/Object;", "atomAction", "onTravelNotificationCheckAndSubscribeAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LAe/w0;", "", "_permissionFlow", "LAe/w0;", "Lxe/B0;", "composerActionJob", "Lxe/B0;", "LAe/h;", "getPermissionFlow", "()LAe/h;", "permissionFlow", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InfoPopupV4StickyViewModel extends w0 {

    @NotNull
    private final Ae.w0<Boolean> _permissionFlow;

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private B0 composerActionJob;

    @NotNull
    private final EnableNotificationsSuggestingHandler enableNotificationsSuggestingHandler;

    public InfoPopupV4StickyViewModel(@NotNull EnableNotificationsSuggestingHandler enableNotificationsSuggestingHandler, @NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(enableNotificationsSuggestingHandler, "enableNotificationsSuggestingHandler");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.enableNotificationsSuggestingHandler = enableNotificationsSuggestingHandler;
        this.actionV2Repository = actionV2Repository;
        this._permissionFlow = E0.b(0, 0, null, 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bd, code lost:
    
        if (r12.emit(r0, r13) == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processAction(AtomAction atomAction, d<? super Unit> dVar) {
        InfoPopupV4StickyViewModel$processAction$1 infoPopupV4StickyViewModel$processAction$1;
        int i11;
        InfoPopupV4StickyViewModel infoPopupV4StickyViewModel;
        Throwable th2;
        BuildUtils buildUtils;
        try {
            if (dVar instanceof InfoPopupV4StickyViewModel$processAction$1) {
                infoPopupV4StickyViewModel$processAction$1 = (InfoPopupV4StickyViewModel$processAction$1) dVar;
                int i12 = infoPopupV4StickyViewModel$processAction$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    infoPopupV4StickyViewModel$processAction$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    InfoPopupV4StickyViewModel$processAction$1 infoPopupV4StickyViewModel$processAction$12 = infoPopupV4StickyViewModel$processAction$1;
                    Object obj = infoPopupV4StickyViewModel$processAction$12.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = infoPopupV4StickyViewModel$processAction$12.label;
                    if (i11 != 0) {
                        s.b(obj);
                        if (!(atomAction instanceof AtomAction.ComposerAction)) {
                            return Unit.f71690a;
                        }
                        try {
                            ActionV2Repository actionV2Repository = this.actionV2Repository;
                            ActionV2Request actionV2Request = new ActionV2Request(((AtomAction.ComposerAction) atomAction).getParams(), ((AtomAction.ComposerAction) atomAction).getActionName(), true);
                            infoPopupV4StickyViewModel$processAction$12.L$0 = this;
                            infoPopupV4StickyViewModel$processAction$12.label = 1;
                            obj = actionV2Repository.callActionSuspend(actionV2Request, TravelCommonActionResponseV2.class, infoPopupV4StickyViewModel$processAction$12);
                            if (obj != aVar) {
                                infoPopupV4StickyViewModel = this;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            infoPopupV4StickyViewModel = this;
                            th2 = th;
                            if (th2 instanceof ActionV2RepositoryError) {
                                LoggerExtKt.sendNonFatal$default(th2, null, "travel_infoPopup4_action", null, 10, null);
                            } else {
                                TravelActionLogger.INSTANCE.logException(th2, "travel_infoPopup4_action");
                            }
                            buildUtils = BuildUtils.INSTANCE;
                            if (!buildUtils.isQaFlavor() || buildUtils.isDebug()) {
                                a.b bVar = Lm0.a.f17149a;
                                bVar.b("travel_infoPopup4_action");
                                bVar.e(th2);
                            }
                            boolean isPermissionForPushNotificationsForApiMoreThan32Requested = infoPopupV4StickyViewModel.enableNotificationsSuggestingHandler.isPermissionForPushNotificationsForApiMoreThan32Requested();
                            infoPopupV4StickyViewModel.enableNotificationsSuggestingHandler.setPermissionForPushNotificationsForApiMoreThan32Requested(true);
                            Ae.w0<Boolean> w0Var = infoPopupV4StickyViewModel._permissionFlow;
                            Boolean valueOf = Boolean.valueOf(isPermissionForPushNotificationsForApiMoreThan32Requested);
                            infoPopupV4StickyViewModel$processAction$12.L$0 = null;
                            infoPopupV4StickyViewModel$processAction$12.label = 2;
                        }
                        return aVar;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    infoPopupV4StickyViewModel = (InfoPopupV4StickyViewModel) infoPopupV4StickyViewModel$processAction$12.L$0;
                    try {
                        s.b(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        if (th2 instanceof ActionV2RepositoryError) {
                        }
                        buildUtils = BuildUtils.INSTANCE;
                        if (!buildUtils.isQaFlavor()) {
                        }
                        a.b bVar2 = Lm0.a.f17149a;
                        bVar2.b("travel_infoPopup4_action");
                        bVar2.e(th2);
                        boolean isPermissionForPushNotificationsForApiMoreThan32Requested2 = infoPopupV4StickyViewModel.enableNotificationsSuggestingHandler.isPermissionForPushNotificationsForApiMoreThan32Requested();
                        infoPopupV4StickyViewModel.enableNotificationsSuggestingHandler.setPermissionForPushNotificationsForApiMoreThan32Requested(true);
                        Ae.w0<Boolean> w0Var2 = infoPopupV4StickyViewModel._permissionFlow;
                        Boolean valueOf2 = Boolean.valueOf(isPermissionForPushNotificationsForApiMoreThan32Requested2);
                        infoPopupV4StickyViewModel$processAction$12.L$0 = null;
                        infoPopupV4StickyViewModel$processAction$12.label = 2;
                    }
                    ActionV2ExtensionsKt.ensureSuccessful((ActionV2Response) obj);
                    boolean isPermissionForPushNotificationsForApiMoreThan32Requested22 = infoPopupV4StickyViewModel.enableNotificationsSuggestingHandler.isPermissionForPushNotificationsForApiMoreThan32Requested();
                    infoPopupV4StickyViewModel.enableNotificationsSuggestingHandler.setPermissionForPushNotificationsForApiMoreThan32Requested(true);
                    Ae.w0<Boolean> w0Var22 = infoPopupV4StickyViewModel._permissionFlow;
                    Boolean valueOf22 = Boolean.valueOf(isPermissionForPushNotificationsForApiMoreThan32Requested22);
                    infoPopupV4StickyViewModel$processAction$12.L$0 = null;
                    infoPopupV4StickyViewModel$processAction$12.label = 2;
                }
            }
            if (i11 != 0) {
            }
            ActionV2ExtensionsKt.ensureSuccessful((ActionV2Response) obj);
            boolean isPermissionForPushNotificationsForApiMoreThan32Requested222 = infoPopupV4StickyViewModel.enableNotificationsSuggestingHandler.isPermissionForPushNotificationsForApiMoreThan32Requested();
            infoPopupV4StickyViewModel.enableNotificationsSuggestingHandler.setPermissionForPushNotificationsForApiMoreThan32Requested(true);
            Ae.w0<Boolean> w0Var222 = infoPopupV4StickyViewModel._permissionFlow;
            Boolean valueOf222 = Boolean.valueOf(isPermissionForPushNotificationsForApiMoreThan32Requested222);
            infoPopupV4StickyViewModel$processAction$12.L$0 = null;
            infoPopupV4StickyViewModel$processAction$12.label = 2;
        } catch (CancellationException e11) {
            throw e11;
        }
        infoPopupV4StickyViewModel$processAction$1 = new InfoPopupV4StickyViewModel$processAction$1(this, dVar);
        InfoPopupV4StickyViewModel$processAction$1 infoPopupV4StickyViewModel$processAction$122 = infoPopupV4StickyViewModel$processAction$1;
        Object obj2 = infoPopupV4StickyViewModel$processAction$122.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = infoPopupV4StickyViewModel$processAction$122.label;
    }

    @NotNull
    public final InterfaceC2395h<Boolean> getPermissionFlow() {
        return this._permissionFlow;
    }

    public final void onTravelNotificationCheckAndSubscribeAction(@NotNull AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        B0 b02 = this.composerActionJob;
        if (b02 != null) {
            b02.j(null);
        }
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.composerActionJob = C10727i.c(a11, b.f10879b, null, new InfoPopupV4StickyViewModel$onTravelNotificationCheckAndSubscribeAction$1(this, atomAction, null), 2);
    }
}
