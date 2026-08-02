package ru.ozon.app.android.actionHandlers.monetization.shareLinkBloggerFromTile;

import Sc.r;
import Sc.s;
import Tg.b;
import Vg.f;
import Wc.a;
import androidx.lifecycle.K;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.concurrent.CancellationException;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.actionHandlers.monetization.ActionHandlerExtKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ShareLinkBloggerFromTileActionHandler$processWidgetAction$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ b $action;
    final /* synthetic */ String $actionName;
    final /* synthetic */ C7475g $widgetComponentStorage;
    final /* synthetic */ f.a $widgetInfo;
    final /* synthetic */ ShareLinkBloggerFromTileActionHandler this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.actionHandlers.monetization.shareLinkBloggerFromTile.ShareLinkBloggerFromTileActionHandler$processWidgetAction$1$1", f = "ShareLinkBloggerFromTileActionHandler.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.actionHandlers.monetization.shareLinkBloggerFromTile.ShareLinkBloggerFromTileActionHandler$processWidgetAction$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ b $action;
        final /* synthetic */ String $actionName;
        final /* synthetic */ C7475g $widgetComponentStorage;
        final /* synthetic */ f.a $widgetInfo;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ShareLinkBloggerFromTileActionHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ShareLinkBloggerFromTileActionHandler shareLinkBloggerFromTileActionHandler, b bVar, String str, f.a aVar, C7475g c7475g, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = shareLinkBloggerFromTileActionHandler;
            this.$action = bVar;
            this.$actionName = str;
            this.$widgetInfo = aVar;
            this.$widgetComponentStorage = c7475g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$action, this.$actionName, this.$widgetInfo, this.$widgetComponentStorage, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            ActionV2Repository actionV2Repository;
            ActionV2Request actionV2Request;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            try {
                if (i11 == 0) {
                    s.b(obj);
                    ShareLinkBloggerFromTileActionHandler shareLinkBloggerFromTileActionHandler = this.this$0;
                    b bVar = this.$action;
                    String str = this.$actionName;
                    r.Companion companion = r.INSTANCE;
                    actionV2Repository = shareLinkBloggerFromTileActionHandler.actionV2Repository;
                    actionV2Request = shareLinkBloggerFromTileActionHandler.toActionV2Request((AtomAction.Click) bVar, str);
                    this.label = 1;
                    obj = actionV2Repository.callActionSuspend(actionV2Request, ShareLinkBloggerFromTileResponse.class, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                a11 = (ShareLinkBloggerFromTileResponse) ((ActionV2Response) obj).getData();
                r.Companion companion2 = r.INSTANCE;
            } catch (Throwable th2) {
                r.Companion companion3 = r.INSTANCE;
                a11 = s.a(th2);
            }
            ShareLinkBloggerFromTileActionHandler shareLinkBloggerFromTileActionHandler2 = this.this$0;
            f.a aVar2 = this.$widgetInfo;
            C7475g c7475g = this.$widgetComponentStorage;
            if (!(a11 instanceof r.b)) {
                ShareLinkBloggerFromTileResponse shareLinkBloggerFromTileResponse = (ShareLinkBloggerFromTileResponse) a11;
                if (shareLinkBloggerFromTileResponse != null) {
                    String link = shareLinkBloggerFromTileResponse.getLink();
                    if (link != null && link.length() != 0) {
                        shareLinkBloggerFromTileActionHandler2.copyLink(shareLinkBloggerFromTileResponse.getLink(), aVar2);
                    }
                    shareLinkBloggerFromTileActionHandler2.showNotificationByModel(shareLinkBloggerFromTileResponse.getNotification(), aVar2, ActionHandlerExtKt.createActionHandler(aVar2, c7475g));
                } else {
                    shareLinkBloggerFromTileActionHandler2.showDefaultErrorNotification(aVar2);
                }
            }
            ShareLinkBloggerFromTileActionHandler shareLinkBloggerFromTileActionHandler3 = this.this$0;
            f.a aVar3 = this.$widgetInfo;
            Throwable b11 = r.b(a11);
            if (b11 != null && !(b11 instanceof CancellationException)) {
                shareLinkBloggerFromTileActionHandler3.showDefaultErrorNotification(aVar3);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareLinkBloggerFromTileActionHandler$processWidgetAction$1(ShareLinkBloggerFromTileActionHandler shareLinkBloggerFromTileActionHandler, f.a aVar, b bVar, String str, C7475g c7475g) {
        super(0);
        this.this$0 = shareLinkBloggerFromTileActionHandler;
        this.$widgetInfo = aVar;
        this.$action = bVar;
        this.$actionName = str;
        this.$widgetComponentStorage = c7475g;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NotificationBar notificationBar;
        B0 b02;
        notificationBar = this.this$0.currentNotificationBar;
        if (notificationBar != null) {
            notificationBar.dismiss();
        }
        b02 = this.this$0.currentJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.this$0.currentJob = C10727i.c(K.a(this.$widgetInfo.a().g()), null, null, new AnonymousClass1(this.this$0, this.$action, this.$actionName, this.$widgetInfo, this.$widgetComponentStorage, null), 3);
    }
}
