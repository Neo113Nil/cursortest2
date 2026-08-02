package ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger;

import Sc.o;
import Sc.s;
import Vg.f;
import Wc.a;
import a00.C4911f;
import androidx.fragment.app.r;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.actionHandlers.monetization.ActionHandlerExtKt;
import ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger.ShareLinkBloggerViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel$ShareLinkBloggerAction;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger.ShareLinkBloggerActionHandler$processWidgetAction$1$newJob$1", f = "ShareLinkBloggerActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ShareLinkBloggerActionHandler$processWidgetAction$1$newJob$1 extends j implements Function2<ShareLinkBloggerViewModel.ShareLinkBloggerAction, d<? super Unit>, Object> {
    final /* synthetic */ r $activity;
    final /* synthetic */ C4911f $container;
    final /* synthetic */ C7475g $widgetComponentStorage;
    final /* synthetic */ f.a $widgetInfo;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ShareLinkBloggerActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareLinkBloggerActionHandler$processWidgetAction$1$newJob$1(ShareLinkBloggerActionHandler shareLinkBloggerActionHandler, r rVar, C4911f c4911f, f.a aVar, C7475g c7475g, d<? super ShareLinkBloggerActionHandler$processWidgetAction$1$newJob$1> dVar) {
        super(2, dVar);
        this.this$0 = shareLinkBloggerActionHandler;
        this.$activity = rVar;
        this.$container = c4911f;
        this.$widgetInfo = aVar;
        this.$widgetComponentStorage = c7475g;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ShareLinkBloggerActionHandler$processWidgetAction$1$newJob$1 shareLinkBloggerActionHandler$processWidgetAction$1$newJob$1 = new ShareLinkBloggerActionHandler$processWidgetAction$1$newJob$1(this.this$0, this.$activity, this.$container, this.$widgetInfo, this.$widgetComponentStorage, dVar);
        shareLinkBloggerActionHandler$processWidgetAction$1$newJob$1.L$0 = obj;
        return shareLinkBloggerActionHandler$processWidgetAction$1$newJob$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ShareLinkBloggerViewModel.ShareLinkBloggerAction shareLinkBloggerAction = (ShareLinkBloggerViewModel.ShareLinkBloggerAction) this.L$0;
        if (shareLinkBloggerAction instanceof ShareLinkBloggerViewModel.ShareLinkBloggerAction.ShowShareSheet) {
            ShareLinkBloggerViewModel.ShareLinkBloggerAction.ShowShareSheet showShareSheet = (ShareLinkBloggerViewModel.ShareLinkBloggerAction.ShowShareSheet) shareLinkBloggerAction;
            this.this$0.startShareSheet(showShareSheet.getShareText(), showShareSheet.getTitle(), this.$activity);
        } else {
            if (!(shareLinkBloggerAction instanceof ShareLinkBloggerViewModel.ShareLinkBloggerAction.ShowNotification)) {
                throw new o();
            }
            this.this$0.showNotification(this.$container, ActionHandlerExtKt.createActionHandler(this.$widgetInfo, this.$widgetComponentStorage), ((ShareLinkBloggerViewModel.ShareLinkBloggerAction.ShowNotification) shareLinkBloggerAction).getNotificationBar());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ShareLinkBloggerViewModel.ShareLinkBloggerAction shareLinkBloggerAction, d<? super Unit> dVar) {
        return ((ShareLinkBloggerActionHandler$processWidgetAction$1$newJob$1) create(shareLinkBloggerAction, dVar)).invokeSuspend(Unit.f71690a);
    }
}
