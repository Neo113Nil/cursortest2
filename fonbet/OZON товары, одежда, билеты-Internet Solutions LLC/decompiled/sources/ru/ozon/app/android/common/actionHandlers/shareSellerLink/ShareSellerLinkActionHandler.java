package ru.ozon.app.android.common.actionHandlers.shareSellerLink;

import Sc.r;
import Sc.s;
import Wc.a;
import android.content.Context;
import androidx.core.app.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/common/actionHandlers/shareSellerLink/ShareSellerLinkActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "", "requestShortLink", "(Lru/ozon/uni/atoms/af/AtomAction;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/content/Context;", "context", SelectionItemFormDTO.TITLE_FIELD_NAME, "text", "share", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "", "lastCall", "J", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShareSellerLinkActionHandler extends CustomActionHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private long lastCall;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/shareSellerLink/ShareSellerLinkActionHandler$Companion;", "", "<init>", "()V", "SHARE_DATA_TYPE", "", "KEY_TITLE", "KEY_SELLER_ID", "KEY_HOST_NAME", "SHARING_UI_DELAY", "", "MINIFY_SELLER_ACTION_ID", "SHARE_SELLER_ACTION_ID", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ShareSellerLinkActionHandler(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this.actionId = "shareSellerLink";
    }

    private final void handleAction(AtomAction.Click action, CustomActionHandler.HandlerReferences handlerRefs) {
        String link = action.getLink();
        if (link == null) {
            return;
        }
        Map<String, String> params = action.getParams();
        C10727i.c(CoroutineUtilsKt.getSafeScope(), null, null, new ShareSellerLinkActionHandler$handleAction$1(this, action, handlerRefs, link, params != null ? params.get(SelectionItemFormDTO.TITLE_FIELD_NAME) : null, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:27|28))(2:29|(1:41)(5:33|(1:35)(1:40)|36|37|(1:39)))|11|12|(4:18|(1:20)|21|(2:23|24)(1:25))(1:16)))|46|6|7|(0)(0)|11|12|(1:14)|18|(0)|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0028, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0080, code lost:
    
        r13 = Sc.r.INSTANCE;
        r12 = Sc.s.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestShortLink(AtomAction atomAction, d<? super String> dVar) {
        ShareSellerLinkActionHandler$requestShortLink$1 shareSellerLinkActionHandler$requestShortLink$1;
        int i11;
        Object a11;
        Throwable b11;
        ShareSellerLinkResponse shareSellerLinkResponse;
        String str;
        if (dVar instanceof ShareSellerLinkActionHandler$requestShortLink$1) {
            shareSellerLinkActionHandler$requestShortLink$1 = (ShareSellerLinkActionHandler$requestShortLink$1) dVar;
            int i12 = shareSellerLinkActionHandler$requestShortLink$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                shareSellerLinkActionHandler$requestShortLink$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = shareSellerLinkActionHandler$requestShortLink$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = shareSellerLinkActionHandler$requestShortLink$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    Map<String, String> params = atomAction.getParams();
                    if (params == null || (str = params.get("sellerId")) == null) {
                        return null;
                    }
                    Map<String, String> params2 = atomAction.getParams();
                    ActionV2Request actionV2Request = new ActionV2Request(new ShareSellerLinkRequest(str, params2 != null ? params2.get("hostName") : null), "minifySeller", false, 4, null);
                    r.Companion companion = r.INSTANCE;
                    ActionV2Repository actionV2Repository = this.actionV2Repository;
                    shareSellerLinkActionHandler$requestShortLink$1.label = 1;
                    obj = actionV2Repository.callActionSuspend(actionV2Request, ShareSellerLinkResponse.class, shareSellerLinkActionHandler$requestShortLink$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                a11 = (ShareSellerLinkResponse) ((ActionV2Response) obj).getData();
                r.Companion companion2 = r.INSTANCE;
                b11 = r.b(a11);
                if (b11 == null && (b11 instanceof CancellationException)) {
                    throw b11;
                }
                if (a11 instanceof r.b) {
                    a11 = null;
                }
                shareSellerLinkResponse = (ShareSellerLinkResponse) a11;
                if (shareSellerLinkResponse == null) {
                    return shareSellerLinkResponse.getShortURL();
                }
                return null;
            }
        }
        shareSellerLinkActionHandler$requestShortLink$1 = new ShareSellerLinkActionHandler$requestShortLink$1(this, dVar);
        Object obj2 = shareSellerLinkActionHandler$requestShortLink$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = shareSellerLinkActionHandler$requestShortLink$1.label;
        if (i11 != 0) {
        }
        a11 = (ShareSellerLinkResponse) ((ActionV2Response) obj2).getData();
        r.Companion companion22 = r.INSTANCE;
        b11 = r.b(a11);
        if (b11 == null) {
        }
        if (a11 instanceof r.b) {
        }
        shareSellerLinkResponse = (ShareSellerLinkResponse) a11;
        if (shareSellerLinkResponse == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void share(Context context, String title, String text) {
        t.a aVar = new t.a(context);
        aVar.g("text/plain");
        aVar.f(text);
        aVar.d(title);
        aVar.h();
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.Click) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.lastCall >= 1000) {
                this.lastCall = currentTimeMillis;
                handleAction((AtomAction.Click) action, handlerRefs);
            }
        }
    }
}
