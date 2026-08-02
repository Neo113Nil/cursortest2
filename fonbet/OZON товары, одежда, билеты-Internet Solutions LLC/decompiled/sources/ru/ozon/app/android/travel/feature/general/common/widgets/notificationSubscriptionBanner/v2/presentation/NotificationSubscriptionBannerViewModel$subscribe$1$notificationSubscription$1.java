package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import java.util.Map;
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
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerViewModel;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.M;
import ze.h;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/action/v2/models/ActionV2Response;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerViewModel$subscribe$1$notificationSubscription$1", f = "NotificationSubscriptionBannerViewModel.kt", l = {157, 158, 224}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationSubscriptionBannerViewModel$subscribe$1$notificationSubscription$1 extends j implements Function2<M, d<? super ActionV2Response<Object>>, Object> {
    final /* synthetic */ NotificationSubscriptionBannerVO $safeItemVo;
    Object L$0;
    int label;
    final /* synthetic */ NotificationSubscriptionBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionBannerViewModel$subscribe$1$notificationSubscription$1(NotificationSubscriptionBannerVO notificationSubscriptionBannerVO, NotificationSubscriptionBannerViewModel notificationSubscriptionBannerViewModel, d<? super NotificationSubscriptionBannerViewModel$subscribe$1$notificationSubscription$1> dVar) {
        super(2, dVar);
        this.$safeItemVo = notificationSubscriptionBannerVO;
        this.this$0 = notificationSubscriptionBannerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new NotificationSubscriptionBannerViewModel$subscribe$1$notificationSubscription$1(this.$safeItemVo, this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        if (r9 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r9 == r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnableNotificationsSuggestingHandler enableNotificationsSuggestingHandler;
        w0 w0Var;
        AtomActionDTO atomActionDTO;
        h hVar;
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            AtomActionDTO action = this.$safeItemVo.getNotificationSubscriptionControlSettings().getAction();
            if (action != null) {
                enableNotificationsSuggestingHandler = this.this$0.enableNotificationsSuggestingHandler;
                boolean isPermissionForPushNotificationsForApiMoreThan32Requested = enableNotificationsSuggestingHandler.isPermissionForPushNotificationsForApiMoreThan32Requested();
                w0Var = this.this$0.viewEffects;
                NotificationSubscriptionBannerViewModel.ViewEffect.CheckNotifications checkNotifications = new NotificationSubscriptionBannerViewModel.ViewEffect.CheckNotifications(isPermissionForPushNotificationsForApiMoreThan32Requested);
                this.L$0 = action;
                this.label = 1;
                if (w0Var.emit(checkNotifications, this) != aVar) {
                    atomActionDTO = action;
                }
                return aVar;
            }
            return null;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return ActionV2ExtensionsKt.ensureSuccessful((ActionV2Response) obj);
            }
            atomActionDTO = (AtomActionDTO) this.L$0;
            s.b(obj);
            if (Intrinsics.d((NotificationSubscriptionBannerViewModel.NotificationsRequestResult) obj, NotificationSubscriptionBannerViewModel.NotificationsRequestResult.NotificationsGranted.INSTANCE)) {
                actionV2Repository = this.this$0.actionV2Repository;
                Map<String, String> params = atomActionDTO.getParams();
                String link = atomActionDTO.getLink();
                if (link == null) {
                    link = "";
                }
                ActionV2Request actionV2Request = new ActionV2Request(params, link, true);
                this.L$0 = null;
                this.label = 3;
                obj = actionV2Repository.callActionSuspend(actionV2Request, Object.class, this);
            }
            return null;
        }
        atomActionDTO = (AtomActionDTO) this.L$0;
        s.b(obj);
        hVar = this.this$0.syncChannel;
        this.L$0 = atomActionDTO;
        this.label = 2;
        obj = hVar.i(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super ActionV2Response<Object>> dVar) {
        return ((NotificationSubscriptionBannerViewModel$subscribe$1$notificationSubscription$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
