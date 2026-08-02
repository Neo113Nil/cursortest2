package ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger;

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
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger.ShareLinkBloggerViewModel;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;
import xe.I;
import xe.M;
import ze.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger.ShareLinkBloggerViewModel$requestMinifyLink$1", f = "ShareLinkBloggerViewModel.kt", l = {75, 93, 97, 105}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ShareLinkBloggerViewModel$requestMinifyLink$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.Click $action;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ ShareLinkBloggerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareLinkBloggerViewModel$requestMinifyLink$1(ShareLinkBloggerViewModel shareLinkBloggerViewModel, AtomAction.Click click, d<? super ShareLinkBloggerViewModel$requestMinifyLink$1> dVar) {
        super(2, dVar);
        this.this$0 = shareLinkBloggerViewModel;
        this.$action = click;
    }

    private static final ShareLinkBloggerViewModel.ShareLinkBloggerState invokeSuspend$buildFallbackShareState(ShareLinkBloggerViewModel shareLinkBloggerViewModel, AtomAction.Click click) {
        String buildShareText;
        NotificationDTO buildErrorNotification;
        Map<String, String> params = click.getParams();
        String str = params != null ? params.get(SelectionItemFormDTO.TITLE_FIELD_NAME) : null;
        String link = click.getLink();
        if (link == null) {
            link = "";
        }
        buildShareText = shareLinkBloggerViewModel.buildShareText(str, link);
        Map<String, String> params2 = click.getParams();
        String str2 = params2 != null ? params2.get(SelectionItemFormDTO.TITLE_FIELD_NAME) : null;
        buildErrorNotification = shareLinkBloggerViewModel.buildErrorNotification();
        return new ShareLinkBloggerViewModel.ShareLinkBloggerState(buildShareText, str2, buildErrorNotification);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ShareLinkBloggerViewModel$requestMinifyLink$1(this.this$0, this.$action, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:(1:(4:7|8|9|10)(2:12|13))(1:14))(1:26)|15|16|17|9|10) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0142, code lost:
    
        if (r1.n(r3, r11) == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0106, code lost:
    
        if (r4.n(r7, r11) == r0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014a  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ActionV2Request actionV2Request;
        AtomAction.Click click;
        ShareLinkBloggerViewModel shareLinkBloggerViewModel;
        AtomAction.Click click2;
        CoroutineDispatcherProvider coroutineDispatcherProvider;
        ShareLinkBloggerViewModel shareLinkBloggerViewModel2;
        ShareLinkBloggerViewModel shareLinkBloggerViewModel3;
        x0 x0Var;
        h hVar;
        String buildShareText;
        x0 x0Var2;
        h hVar2;
        x0 x0Var3;
        h hVar3;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Request = this.this$0.toActionV2Request(this.$action);
            ShareLinkBloggerViewModel shareLinkBloggerViewModel4 = this.this$0;
            click = this.$action;
            try {
                coroutineDispatcherProvider = shareLinkBloggerViewModel4.dispatcherProvider;
                I io2 = coroutineDispatcherProvider.getIO();
                ShareLinkBloggerViewModel$requestMinifyLink$1$1$response$1 shareLinkBloggerViewModel$requestMinifyLink$1$1$response$1 = new ShareLinkBloggerViewModel$requestMinifyLink$1$1$response$1(shareLinkBloggerViewModel4, actionV2Request, null);
                this.L$0 = shareLinkBloggerViewModel4;
                this.L$1 = click;
                this.L$2 = shareLinkBloggerViewModel4;
                this.L$3 = click;
                this.label = 1;
                obj = C10727i.f(io2, shareLinkBloggerViewModel$requestMinifyLink$1$1$response$1, this);
                if (obj != aVar) {
                    shareLinkBloggerViewModel2 = shareLinkBloggerViewModel4;
                    shareLinkBloggerViewModel3 = shareLinkBloggerViewModel2;
                    click2 = click;
                }
            } catch (Throwable th2) {
                th = th2;
                shareLinkBloggerViewModel = shareLinkBloggerViewModel4;
                click2 = click;
                if (th instanceof CancellationException) {
                    throw th;
                }
                Lm0.a.f17149a.e(th);
                ShareLinkBloggerViewModel.ShareLinkBloggerState invokeSuspend$buildFallbackShareState = invokeSuspend$buildFallbackShareState(shareLinkBloggerViewModel, click2);
                x0Var3 = shareLinkBloggerViewModel._state;
                x0Var3.setValue(invokeSuspend$buildFallbackShareState);
                hVar3 = shareLinkBloggerViewModel._action;
                ShareLinkBloggerViewModel.ShareLinkBloggerAction.ShowShareSheet showShareSheet = new ShareLinkBloggerViewModel.ShareLinkBloggerAction.ShowShareSheet(invokeSuspend$buildFallbackShareState.getShareText(), invokeSuspend$buildFallbackShareState.getTitle());
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 4;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                click2 = (AtomAction.Click) this.L$1;
                shareLinkBloggerViewModel = (ShareLinkBloggerViewModel) this.L$0;
            } else {
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    Unit unit = Unit.f71690a;
                    return Unit.f71690a;
                }
                click2 = (AtomAction.Click) this.L$1;
                shareLinkBloggerViewModel = (ShareLinkBloggerViewModel) this.L$0;
            }
            s.b(obj);
            Unit unit2 = Unit.f71690a;
            return Unit.f71690a;
        }
        click2 = (AtomAction.Click) this.L$3;
        shareLinkBloggerViewModel2 = (ShareLinkBloggerViewModel) this.L$2;
        click = (AtomAction.Click) this.L$1;
        shareLinkBloggerViewModel3 = (ShareLinkBloggerViewModel) this.L$0;
        try {
            s.b(obj);
        } catch (Throwable th3) {
            th = th3;
            shareLinkBloggerViewModel = shareLinkBloggerViewModel2;
            if (th instanceof CancellationException) {
            }
        }
        ShareLinkBloggerResponse shareLinkBloggerResponse = (ShareLinkBloggerResponse) obj;
        if (shareLinkBloggerResponse != null) {
            Map<String, String> params = click.getParams();
            buildShareText = shareLinkBloggerViewModel3.buildShareText(params != null ? params.get(SelectionItemFormDTO.TITLE_FIELD_NAME) : null, shareLinkBloggerResponse.getShortURL());
            Map<String, String> params2 = click.getParams();
            ShareLinkBloggerViewModel.ShareLinkBloggerState shareLinkBloggerState = new ShareLinkBloggerViewModel.ShareLinkBloggerState(buildShareText, params2 != null ? params2.get(SelectionItemFormDTO.TITLE_FIELD_NAME) : null, shareLinkBloggerResponse.getNotificationBar());
            x0Var2 = shareLinkBloggerViewModel3._state;
            x0Var2.setValue(shareLinkBloggerState);
            hVar2 = shareLinkBloggerViewModel3._action;
            ShareLinkBloggerViewModel.ShareLinkBloggerAction.ShowShareSheet showShareSheet2 = new ShareLinkBloggerViewModel.ShareLinkBloggerAction.ShowShareSheet(buildShareText, shareLinkBloggerState.getTitle());
            this.L$0 = shareLinkBloggerViewModel2;
            this.L$1 = click2;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            if (hVar2.n(showShareSheet2, this) == aVar) {
                return aVar;
            }
            shareLinkBloggerViewModel = shareLinkBloggerViewModel2;
        } else {
            ShareLinkBloggerViewModel.ShareLinkBloggerState invokeSuspend$buildFallbackShareState2 = invokeSuspend$buildFallbackShareState(shareLinkBloggerViewModel3, click);
            x0Var = shareLinkBloggerViewModel3._state;
            x0Var.setValue(invokeSuspend$buildFallbackShareState2);
            hVar = shareLinkBloggerViewModel3._action;
            ShareLinkBloggerViewModel.ShareLinkBloggerAction.ShowShareSheet showShareSheet3 = new ShareLinkBloggerViewModel.ShareLinkBloggerAction.ShowShareSheet(invokeSuspend$buildFallbackShareState2.getShareText(), invokeSuspend$buildFallbackShareState2.getTitle());
            this.L$0 = shareLinkBloggerViewModel2;
            this.L$1 = click2;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
        }
        Unit unit22 = Unit.f71690a;
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ShareLinkBloggerViewModel$requestMinifyLink$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
