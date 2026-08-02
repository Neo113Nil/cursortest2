package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation;

import Ae.w0;
import Ae.x0;
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
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2ExtensionsKt;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResponse;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3ViewModel;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import xe.M;
import ze.h;
import ze.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3ViewModel$subscribe$1", f = "NotificationSubscriptionBannerV3ViewModel.kt", l = {136, 137, 255, 158, 161}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationSubscriptionBannerV3ViewModel$subscribe$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ NotificationSubscriptionBannerV3VI $safeItemVo;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ NotificationSubscriptionBannerV3ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionBannerV3ViewModel$subscribe$1(NotificationSubscriptionBannerV3ViewModel notificationSubscriptionBannerV3ViewModel, NotificationSubscriptionBannerV3VI notificationSubscriptionBannerV3VI, d<? super NotificationSubscriptionBannerV3ViewModel$subscribe$1> dVar) {
        super(2, dVar);
        this.this$0 = notificationSubscriptionBannerV3ViewModel;
        this.$safeItemVo = notificationSubscriptionBannerV3VI;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        NotificationSubscriptionBannerV3ViewModel$subscribe$1 notificationSubscriptionBannerV3ViewModel$subscribe$1 = new NotificationSubscriptionBannerV3ViewModel$subscribe$1(this.this$0, this.$safeItemVo, dVar);
        notificationSubscriptionBannerV3ViewModel$subscribe$1.L$0 = obj;
        return notificationSubscriptionBannerV3ViewModel$subscribe$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1 A[Catch: CancellationException -> 0x0023, p -> 0x0026, all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:31:0x017c, B:39:0x0050, B:40:0x0121, B:42:0x012f, B:44:0x0135, B:46:0x0141, B:48:0x0149, B:52:0x0155, B:55:0x015d, B:61:0x005d, B:62:0x00a7, B:64:0x00b1, B:65:0x00b7, B:68:0x00c9, B:71:0x00cc, B:73:0x00dc, B:76:0x00e4, B:77:0x00ea, B:80:0x00fc, B:83:0x0110, B:87:0x01ba, B:90:0x0065), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc A[Catch: CancellationException -> 0x0023, p -> 0x0026, all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:31:0x017c, B:39:0x0050, B:40:0x0121, B:42:0x012f, B:44:0x0135, B:46:0x0141, B:48:0x0149, B:52:0x0155, B:55:0x015d, B:61:0x005d, B:62:0x00a7, B:64:0x00b1, B:65:0x00b7, B:68:0x00c9, B:71:0x00cc, B:73:0x00dc, B:76:0x00e4, B:77:0x00ea, B:80:0x00fc, B:83:0x0110, B:87:0x01ba, B:90:0x0065), top: B:2:0x000b }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        M m12;
        EnableNotificationsSuggestingHandler enableNotificationsSuggestingHandler;
        w0 w0Var;
        h hVar;
        M m13;
        AtomActionDTO action;
        x0 x0Var;
        Object value;
        ActionV2Repository actionV2Repository;
        x0 x0Var2;
        Object value2;
        ActionV2Response actionV2Response;
        TravelCommonActionResponse travelCommonActionResponse;
        AtomActionDTO action2;
        NotificationSubscriptionBannerV3VI notificationSubscriptionBannerV3VI;
        boolean z11;
        w0 w0Var2;
        NotificationSubscriptionBannerV3ViewModel.ViewEffect.ShowNotification showNotification;
        NotificationSubscriptionBannerV3ViewModel notificationSubscriptionBannerV3ViewModel;
        w0 w0Var3;
        NotificationSubscriptionBannerV3ViewModel.Action.Success success;
        x0 x0Var3;
        Object value3;
        a aVar = a.COROUTINE_SUSPENDED;
        ?? r12 = this.label;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
                m11 = r12;
            }
        } catch (CancellationException e11) {
            throw e11;
        } catch (p e12) {
            Lm0.a.f17149a.e(e12);
        }
        if (r12 == 0) {
            s.b(obj);
            m12 = (M) this.L$0;
            try {
                enableNotificationsSuggestingHandler = this.this$0.enableNotificationsSuggestingHandler;
                boolean isPermissionForPushNotificationsForApiMoreThan32Requested = enableNotificationsSuggestingHandler.isPermissionForPushNotificationsForApiMoreThan32Requested();
                w0Var = this.this$0.viewEffects;
                NotificationSubscriptionBannerV3ViewModel.ViewEffect.CheckNotifications checkNotifications = new NotificationSubscriptionBannerV3ViewModel.ViewEffect.CheckNotifications(isPermissionForPushNotificationsForApiMoreThan32Requested);
                this.L$0 = m12;
                this.label = 1;
                if (w0Var.emit(checkNotifications, this) == aVar) {
                    return aVar;
                }
            } catch (Throwable th3) {
                m11 = m12;
                th = th3;
                this.this$0.handleCoroutineError(m11, th, "subscribe");
                return Unit.f71690a;
            }
        } else {
            if (r12 != 1) {
                if (r12 == 2) {
                    m13 = (M) this.L$0;
                    s.b(obj);
                    if (Intrinsics.d((NotificationSubscriptionBannerV3ViewModel.NotificationsRequestResult) obj, NotificationSubscriptionBannerV3ViewModel.NotificationsRequestResult.NotificationsGranted.INSTANCE)) {
                        x0Var2 = this.this$0.buttonStateFlow;
                        do {
                            value2 = x0Var2.getValue();
                        } while (!x0Var2.b(value2, new NotificationSubscriptionBannerV3ViewModel.ButtonState(false, false, 1, null)));
                        return Unit.f71690a;
                    }
                    CommonControlSettings common = this.$safeItemVo.getContent().getSubscribeButton().getCommon();
                    if (common != null && (action = common.getAction()) != null) {
                        x0Var = this.this$0.buttonStateFlow;
                        do {
                            value = x0Var.getValue();
                        } while (!x0Var.b(value, new NotificationSubscriptionBannerV3ViewModel.ButtonState(false, true, 1, null)));
                        actionV2Repository = this.this$0.actionV2Repository;
                        Map<String, String> params = action.getParams();
                        String link = action.getLink();
                        if (link == null) {
                            link = "";
                        }
                        ActionV2Request actionV2Request = new ActionV2Request(params, link, true);
                        this.L$0 = m13;
                        this.label = 3;
                        obj = actionV2Repository.callActionSuspend(actionV2Request, TravelCommonActionResponse.class, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        actionV2Response = (ActionV2Response) obj;
                        ActionV2ExtensionsKt.ensureSuccessful(actionV2Response);
                        travelCommonActionResponse = (TravelCommonActionResponse) actionV2Response.getData();
                        if (travelCommonActionResponse != null) {
                            notificationSubscriptionBannerV3VI = this.$safeItemVo;
                            NotificationSubscriptionBannerV3ViewModel notificationSubscriptionBannerV3ViewModel2 = this.this$0;
                            if (action2.getBehavior() != AtomActionDTO.Behavior.DISMISS) {
                                z11 = false;
                                if (notificationSubscriptionBannerV3VI.getSubscriptionCompletedNotification() != null) {
                                }
                            }
                            z11 = true;
                            if (notificationSubscriptionBannerV3VI.getSubscriptionCompletedNotification() != null) {
                            }
                        }
                        m11 = m13;
                        x0Var3 = this.this$0.buttonStateFlow;
                        do {
                            value3 = x0Var3.getValue();
                        } while (!x0Var3.b(value3, new NotificationSubscriptionBannerV3ViewModel.ButtonState(true, false)));
                        return Unit.f71690a;
                    }
                    return Unit.f71690a;
                }
                if (r12 != 3) {
                    if (r12 != 4) {
                        if (r12 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        m11 = (M) this.L$0;
                        try {
                            s.b(obj);
                            m13 = m11;
                            m11 = m13;
                            x0Var3 = this.this$0.buttonStateFlow;
                            do {
                                value3 = x0Var3.getValue();
                            } while (!x0Var3.b(value3, new NotificationSubscriptionBannerV3ViewModel.ButtonState(true, false)));
                        } catch (Throwable th4) {
                            th = th4;
                            this.this$0.handleCoroutineError(m11, th, "subscribe");
                            return Unit.f71690a;
                        }
                        return Unit.f71690a;
                    }
                    AtomActionDTO atomActionDTO = (AtomActionDTO) this.L$3;
                    notificationSubscriptionBannerV3ViewModel = (NotificationSubscriptionBannerV3ViewModel) this.L$2;
                    actionV2Response = (ActionV2Response) this.L$1;
                    M m14 = (M) this.L$0;
                    try {
                        s.b(obj);
                        action2 = atomActionDTO;
                        m13 = m14;
                        w0Var3 = notificationSubscriptionBannerV3ViewModel._actionFlow;
                        success = new NotificationSubscriptionBannerV3ViewModel.Action.Success(AtomActionMapperKt.toAtomAction(action2, actionV2Response.getTrackingInfo()));
                        this.L$0 = m13;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 5;
                    } catch (Throwable th5) {
                        th = th5;
                        m11 = m14;
                        this.this$0.handleCoroutineError(m11, th, "subscribe");
                        return Unit.f71690a;
                    }
                    if (w0Var3.emit(success, this) != aVar) {
                        m11 = m13;
                        m13 = m11;
                        m11 = m13;
                        x0Var3 = this.this$0.buttonStateFlow;
                        do {
                            value3 = x0Var3.getValue();
                        } while (!x0Var3.b(value3, new NotificationSubscriptionBannerV3ViewModel.ButtonState(true, false)));
                        return Unit.f71690a;
                    }
                    return aVar;
                }
                m13 = (M) this.L$0;
                s.b(obj);
                actionV2Response = (ActionV2Response) obj;
                ActionV2ExtensionsKt.ensureSuccessful(actionV2Response);
                travelCommonActionResponse = (TravelCommonActionResponse) actionV2Response.getData();
                if (travelCommonActionResponse != null && (action2 = travelCommonActionResponse.getAction()) != null) {
                    notificationSubscriptionBannerV3VI = this.$safeItemVo;
                    NotificationSubscriptionBannerV3ViewModel notificationSubscriptionBannerV3ViewModel22 = this.this$0;
                    if (action2.getBehavior() != AtomActionDTO.Behavior.DISMISS && action2.getBehavior() != AtomActionDTO.Behavior.DISMISS_REFRESH && action2.getBehavior() != AtomActionDTO.Behavior.DISMISS_REDIRECT) {
                        z11 = false;
                        if (notificationSubscriptionBannerV3VI.getSubscriptionCompletedNotification() != null && z11) {
                            w0Var2 = notificationSubscriptionBannerV3ViewModel22.viewEffects;
                            showNotification = new NotificationSubscriptionBannerV3ViewModel.ViewEffect.ShowNotification(notificationSubscriptionBannerV3VI.getSubscriptionCompletedNotification(), action2);
                            this.L$0 = m13;
                            this.L$1 = actionV2Response;
                            this.L$2 = notificationSubscriptionBannerV3ViewModel22;
                            this.L$3 = action2;
                            this.label = 4;
                            if (w0Var2.emit(showNotification, this) != aVar) {
                                return aVar;
                            }
                            notificationSubscriptionBannerV3ViewModel = notificationSubscriptionBannerV3ViewModel22;
                            w0Var3 = notificationSubscriptionBannerV3ViewModel._actionFlow;
                            success = new NotificationSubscriptionBannerV3ViewModel.Action.Success(AtomActionMapperKt.toAtomAction(action2, actionV2Response.getTrackingInfo()));
                            this.L$0 = m13;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 5;
                            if (w0Var3.emit(success, this) != aVar) {
                            }
                            return aVar;
                        }
                    }
                    z11 = true;
                    if (notificationSubscriptionBannerV3VI.getSubscriptionCompletedNotification() != null) {
                        w0Var2 = notificationSubscriptionBannerV3ViewModel22.viewEffects;
                        showNotification = new NotificationSubscriptionBannerV3ViewModel.ViewEffect.ShowNotification(notificationSubscriptionBannerV3VI.getSubscriptionCompletedNotification(), action2);
                        this.L$0 = m13;
                        this.L$1 = actionV2Response;
                        this.L$2 = notificationSubscriptionBannerV3ViewModel22;
                        this.L$3 = action2;
                        this.label = 4;
                        if (w0Var2.emit(showNotification, this) != aVar) {
                        }
                    }
                }
                m11 = m13;
                x0Var3 = this.this$0.buttonStateFlow;
                do {
                    value3 = x0Var3.getValue();
                } while (!x0Var3.b(value3, new NotificationSubscriptionBannerV3ViewModel.ButtonState(true, false)));
                return Unit.f71690a;
            }
            M m15 = (M) this.L$0;
            s.b(obj);
            m12 = m15;
        }
        hVar = this.this$0.syncChannel;
        this.L$0 = m12;
        this.label = 2;
        Object i11 = hVar.i(this);
        if (i11 != aVar) {
            m13 = m12;
            obj = i11;
            if (Intrinsics.d((NotificationSubscriptionBannerV3ViewModel.NotificationsRequestResult) obj, NotificationSubscriptionBannerV3ViewModel.NotificationsRequestResult.NotificationsGranted.INSTANCE)) {
            }
        }
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((NotificationSubscriptionBannerV3ViewModel$subscribe$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
