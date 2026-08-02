package ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers;

import Sc.r;
import Sc.s;
import W10.c;
import Wc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;
import z00.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.SubscribeAuthorViewModel$processSubscribeAction$1", f = "SubscribeAuthorViewModel.kt", l = {UserVerificationMethods.USER_VERIFY_PATTERN}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class SubscribeAuthorViewModel$processSubscribeAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.Click $action;
    final /* synthetic */ String $authorId;
    final /* synthetic */ c $trackingData;
    int label;
    final /* synthetic */ SubscribeAuthorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscribeAuthorViewModel$processSubscribeAction$1(SubscribeAuthorViewModel subscribeAuthorViewModel, String str, AtomAction.Click click, c cVar, d<? super SubscribeAuthorViewModel$processSubscribeAction$1> dVar) {
        super(2, dVar);
        this.this$0 = subscribeAuthorViewModel;
        this.$authorId = str;
        this.$action = click;
        this.$trackingData = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SubscribeAuthorViewModel$processSubscribeAction$1(this.this$0, this.$authorId, this.$action, this.$trackingData, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SubscribeAuthorsIdStorage subscribeAuthorsIdStorage;
        SingleLiveEvent singleLiveEvent;
        String str;
        ActionV2Repository actionV2Repository;
        Object mo480requestActionResultWithTrackingBWLJW6A;
        SingleLiveEvent singleLiveEvent2;
        String str2;
        AppType appType;
        SingleLiveEvent singleLiveEvent3;
        SingleLiveEvent singleLiveEvent4;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        NotificationDTO notificationDTO = null;
        if (i11 == 0) {
            s.b(obj);
            subscribeAuthorsIdStorage = this.this$0.subscribeAuthorsIdStorage;
            subscribeAuthorsIdStorage.setAuthorSubscription(this.$authorId, Intrinsics.d(this.$action.getId(), "subscribeAuthor"));
            singleLiveEvent = this.this$0._successResponse;
            str = this.this$0.currentActionId;
            singleLiveEvent.setValue(new SubscriptionSuccessAction(str, this.$authorId));
            actionV2Repository = this.this$0.actionV2Repository;
            String link = this.$action.getLink();
            if (link == null) {
                link = "";
            }
            ActionV2Request actionV2Request = new ActionV2Request(this.$action.getParams(), link, false, 4, null);
            c cVar = this.$trackingData;
            if (cVar == null) {
                cVar = new c(null, null, null);
            }
            this.label = 1;
            mo480requestActionResultWithTrackingBWLJW6A = actionV2Repository.mo480requestActionResultWithTrackingBWLJW6A(actionV2Request, cVar, SubscribeAuthorActionDTO.class, this);
            if (mo480requestActionResultWithTrackingBWLJW6A == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            mo480requestActionResultWithTrackingBWLJW6A = ((r) obj).getF26106a();
        }
        r.Companion companion = r.INSTANCE;
        if (!(mo480requestActionResultWithTrackingBWLJW6A instanceof r.b)) {
            try {
                Object data = ((ActionV2Response) mo480requestActionResultWithTrackingBWLJW6A).getData();
                if (data == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                mo480requestActionResultWithTrackingBWLJW6A = (SubscribeAuthorActionDTO) data;
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                mo480requestActionResultWithTrackingBWLJW6A = s.a(th2);
            }
        }
        SubscribeAuthorViewModel subscribeAuthorViewModel = this.this$0;
        String str3 = this.$authorId;
        Throwable b11 = r.b(mo480requestActionResultWithTrackingBWLJW6A);
        if (b11 == null) {
            SubscribeAuthorActionVO vo = subscribeAuthorViewModel.toVO((SubscribeAuthorActionDTO) mo480requestActionResultWithTrackingBWLJW6A);
            if (vo.getSuccessNotification() != null) {
                singleLiveEvent4 = subscribeAuthorViewModel._successNotify;
                singleLiveEvent4.setValue(vo.getSuccessNotification());
            }
            if (vo.getSuccess()) {
                return Unit.f71690a;
            }
            subscribeAuthorViewModel.revertSubscription(vo.getAuthorId());
            singleLiveEvent3 = subscribeAuthorViewModel._revertAction;
            singleLiveEvent3.setValue(new SubscriptionFailureAction(vo.getActionId(), vo.getAuthorId(), vo.getNotification()));
        } else {
            subscribeAuthorViewModel.revertSubscription(str3);
            singleLiveEvent2 = subscribeAuthorViewModel._revertAction;
            str2 = subscribeAuthorViewModel.currentActionId;
            if (g.c(b11)) {
                appType = subscribeAuthorViewModel.appType;
                notificationDTO = NotificationBarHelperKt.createNetworkErrorNotificationDTO(appType == AppType.SELECT);
            }
            singleLiveEvent2.setValue(new SubscriptionFailureAction(str2, str3, notificationDTO));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SubscribeAuthorViewModel$processSubscribeAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
