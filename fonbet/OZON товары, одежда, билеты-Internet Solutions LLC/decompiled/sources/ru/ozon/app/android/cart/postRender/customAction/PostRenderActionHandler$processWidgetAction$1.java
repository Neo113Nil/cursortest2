package ru.ozon.app.android.cart.postRender.customAction;

import Sc.r;
import Sc.s;
import Vg.f;
import W10.c;
import Wc.a;
import a00.C4911f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cart.postRender.customAction.PostRenderActionHandler$processWidgetAction$1", f = "PostRenderActionHandler.kt", l = {133}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class PostRenderActionHandler$processWidgetAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ C4911f $container;
    final /* synthetic */ ActionV2Request $request;
    final /* synthetic */ f.a $widgetInfo;
    int label;
    final /* synthetic */ PostRenderActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostRenderActionHandler$processWidgetAction$1(PostRenderActionHandler postRenderActionHandler, ActionV2Request actionV2Request, f.a aVar, C4911f c4911f, d<? super PostRenderActionHandler$processWidgetAction$1> dVar) {
        super(2, dVar);
        this.this$0 = postRenderActionHandler;
        this.$request = actionV2Request;
        this.$widgetInfo = aVar;
        this.$container = c4911f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PostRenderActionHandler$processWidgetAction$1(this.this$0, this.$request, this.$widgetInfo, this.$container, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        r0 = r0.actionHandler;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        Object mo480requestActionResultWithTrackingBWLJW6A;
        NotificationDTO commonErrorNotification;
        Function1 function1;
        ComposerActionWithActionDTO action;
        ComposerActionWithActionDTO action2;
        AtomActionDTO action3;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = this.$request;
            c n11 = this.$widgetInfo.c().n();
            this.label = 1;
            mo480requestActionResultWithTrackingBWLJW6A = actionV2Repository.mo480requestActionResultWithTrackingBWLJW6A(actionV2Request, n11, PostRenderResponse.class, this);
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
        PostRenderActionHandler postRenderActionHandler = this.this$0;
        C4911f c4911f = this.$container;
        r.Companion companion = r.INSTANCE;
        if (!(mo480requestActionResultWithTrackingBWLJW6A instanceof r.b)) {
            ActionV2Response actionV2Response = (ActionV2Response) mo480requestActionResultWithTrackingBWLJW6A;
            PostRenderResponse postRenderResponse = (PostRenderResponse) actionV2Response.getData();
            NotificationDTO notificationDTO = null;
            AtomAction atomAction = (postRenderResponse == null || (action2 = postRenderResponse.getAction()) == null || (action3 = action2.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action3, null);
            PostRenderResponse postRenderResponse2 = (PostRenderResponse) actionV2Response.getData();
            if (postRenderResponse2 != null && (action = postRenderResponse2.getAction()) != null) {
                notificationDTO = action.getNotificationBar();
            }
            if (notificationDTO != null) {
                postRenderActionHandler.showNotification(notificationDTO, c4911f, atomAction);
            }
            if (atomAction != null && function1 != null) {
                function1.invoke(atomAction);
            }
        }
        PostRenderActionHandler postRenderActionHandler2 = this.this$0;
        C4911f c4911f2 = this.$container;
        Throwable b11 = r.b(mo480requestActionResultWithTrackingBWLJW6A);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
            commonErrorNotification = postRenderActionHandler2.commonErrorNotification();
            PostRenderActionHandler.showNotification$default(postRenderActionHandler2, commonErrorNotification, c4911f2, null, 4, null);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PostRenderActionHandler$processWidgetAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
