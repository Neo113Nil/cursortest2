package ru.ozon.app.android.actionHandlers.monetization.confirmBloggerChannel;

import Sc.r;
import Sc.s;
import Tg.b;
import Vg.f;
import Wc.a;
import android.os.Bundle;
import androidx.fragment.app.G;
import i10.l;
import java.util.Iterator;
import java.util.Set;
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
import ru.ozon.app.android.actionHandlers.monetization.RefreshPageByFragmentResultKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.actionHandlers.monetization.confirmBloggerChannel.ConfirmBloggerChannelActionHandler$processWidgetAction$1", f = "ConfirmBloggerChannelActionHandler.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ConfirmBloggerChannelActionHandler$processWidgetAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ b $action;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ f.a $widgetInfo;
    int label;
    final /* synthetic */ ConfirmBloggerChannelActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ConfirmBloggerChannelActionHandler$processWidgetAction$1(InterfaceC7851b interfaceC7851b, ConfirmBloggerChannelActionHandler confirmBloggerChannelActionHandler, b bVar, f.a aVar, Function1<? super AtomAction, Unit> function1, d<? super ConfirmBloggerChannelActionHandler$processWidgetAction$1> dVar) {
        super(2, dVar);
        this.$controller = interfaceC7851b;
        this.this$0 = confirmBloggerChannelActionHandler;
        this.$action = bVar;
        this.$widgetInfo = aVar;
        this.$actionHandler = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ConfirmBloggerChannelActionHandler$processWidgetAction$1(this.$controller, this.this$0, this.$action, this.$widgetInfo, this.$actionHandler, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        Object mo479requestActionResult0E7RQCE;
        NotificationDTO commonErrorNotification;
        G supportFragmentManager;
        Set<String> refreshPaths;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.$controller.e(new l.a.C1079a(0L, null, 3));
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = new ActionV2Request(((AtomAction.ComposerAction) this.$action).getParams(), ((AtomAction.ComposerAction) this.$action).getActionName(), false, 4, null);
            this.label = 1;
            mo479requestActionResult0E7RQCE = actionV2Repository.mo479requestActionResult0E7RQCE(actionV2Request, ConfirmBloggerChannelResponse.class, this);
            if (mo479requestActionResult0E7RQCE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            mo479requestActionResult0E7RQCE = ((r) obj).getF26106a();
        }
        r.Companion companion = r.INSTANCE;
        if (!(mo479requestActionResult0E7RQCE instanceof r.b)) {
            try {
                Object data = ((ActionV2Response) mo479requestActionResult0E7RQCE).getData();
                if (data == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                mo479requestActionResult0E7RQCE = (ConfirmBloggerChannelResponse) data;
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                mo479requestActionResult0E7RQCE = s.a(th2);
            }
        }
        this.$controller.hideLoader();
        f.a aVar2 = this.$widgetInfo;
        Function1<AtomAction, Unit> function1 = this.$actionHandler;
        ConfirmBloggerChannelActionHandler confirmBloggerChannelActionHandler = this.this$0;
        Throwable b11 = r.b(mo479requestActionResult0E7RQCE);
        if (b11 == null) {
            ConfirmBloggerChannelResponse confirmBloggerChannelResponse = (ConfirmBloggerChannelResponse) mo479requestActionResult0E7RQCE;
            AtomActionDTO action = confirmBloggerChannelResponse.getAction();
            if (action != null) {
                function1.invoke(AtomActionMapperKt.toAtomAction(action, null));
            }
            androidx.fragment.app.r a11 = aVar2.a().a();
            if (a11 != null && (supportFragmentManager = a11.getSupportFragmentManager()) != null && (refreshPaths = confirmBloggerChannelResponse.getRefreshPaths()) != null) {
                Iterator<T> it = refreshPaths.iterator();
                while (it.hasNext()) {
                    supportFragmentManager.m1(Bundle.EMPTY, RefreshPageByFragmentResultKt.refreshPageFragmentRequestKey((String) it.next()));
                }
            }
        } else {
            Lm0.a.f17149a.e(b11);
            commonErrorNotification = confirmBloggerChannelActionHandler.commonErrorNotification();
            confirmBloggerChannelActionHandler.showNotification(commonErrorNotification, aVar2.a());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ConfirmBloggerChannelActionHandler$processWidgetAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
