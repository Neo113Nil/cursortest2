package ru.ozon.app.android.actionHandlers.monetization.shareLinkBloggerFromTile;

import Sc.InterfaceC4008j;
import Tc.d;
import Tg.b;
import Vg.f;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.ClipboardWrapperKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.B0;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 82\u00020\u0001:\u00018B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00122\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u001a\u0010(\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/actionHandlers/monetization/shareLinkBloggerFromTile/ShareLinkBloggerFromTileActionHandler;", "LVg/f;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "", "actionName", "Lru/ozon/app/android/action/v2/models/ActionV2Request;", "toActionV2Request", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/lang/String;)Lru/ozon/app/android/action/v2/models/ActionV2Request;", "link", "LVg/f$a;", "widgetInfo", "", "copyLink", "(Ljava/lang/String;LVg/f$a;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "model", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "showNotificationByModel", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;LVg/f$a;Lkotlin/jvm/functions/Function1;)V", "showDefaultErrorNotification", "(LVg/f$a;)V", "Landroid/view/ViewGroup;", "rootView", "Landroidx/lifecycle/J;", "lifecycleOwner", "showNotification", "(Landroid/view/ViewGroup;Landroidx/lifecycle/J;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lkotlin/jvm/functions/Function1;)V", "LTg/b;", "action", "Lk20/g;", "widgetComponentStorage", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "LSc/j;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/uni/android/notificationbar/NotificationBar;", "currentNotificationBar", "Lru/ozon/uni/android/notificationbar/NotificationBar;", "Lxe/B0;", "currentJob", "Lxe/B0;", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShareLinkBloggerFromTileActionHandler extends f {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private B0 currentJob;
    private NotificationBar currentNotificationBar;

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j handlersInhibitor;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/actionHandlers/monetization/shareLinkBloggerFromTile/ShareLinkBloggerFromTileActionHandler$Companion;", "", "<init>", "()V", "ACTION_ID", "", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ShareLinkBloggerFromTileActionHandler(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this.actionId = "shareLinkBloggerFromTile";
        this.handlersInhibitor = LazyUtilsKt.unsafeLazy(ShareLinkBloggerFromTileActionHandler$handlersInhibitor$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copyLink(String link, f.a widgetInfo) {
        Context applicationContext;
        r a11 = widgetInfo.a().a();
        if (a11 == null || (applicationContext = a11.getApplicationContext()) == null) {
            return;
        }
        ClipboardWrapperKt.toClipboard$default(applicationContext, null, link, 1, null);
    }

    private final HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDefaultErrorNotification(f.a widgetInfo) {
        ComponentCallbacksC5392m c11 = widgetInfo.a().c();
        ViewGroup rootView = ContextExtKt.getRootView(c11);
        if (rootView == null || c11 == null) {
            return;
        }
        showNotification$default(this, rootView, c11, new NotificationDTO(StringProvider.getString(R$string.common_message_request_problem), StringProvider.getString(ru.ozon.app.android.pdp.domain.actionHandlers.R$string.reviews_try_again_later_android), null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 476, null), null, 8, null);
    }

    private final void showNotification(ViewGroup rootView, J lifecycleOwner, NotificationDTO model, Function1<? super AtomAction, Unit> actionHandler) {
        NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(ComposerViewExtensionKt.composerContainer(rootView), null, 1, null);
        if (asNotificationLayoutManager$default == null) {
            return;
        }
        NotificationBar make = NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, model, lifecycleOwner, actionHandler);
        make.addCallback(new NotificationBar.Callback() { // from class: ru.ozon.app.android.actionHandlers.monetization.shareLinkBloggerFromTile.ShareLinkBloggerFromTileActionHandler$showNotification$1
            @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
            public void onDismissed(NotificationBar notificationBar, NotificationBar.DismissReason reason) {
                Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
                Intrinsics.checkNotNullParameter(reason, "reason");
                ShareLinkBloggerFromTileActionHandler.this.currentNotificationBar = null;
                notificationBar.removeCallback(this);
            }

            @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
            public void onShown(NotificationBar notificationBar) {
                Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
                ShareLinkBloggerFromTileActionHandler.this.currentNotificationBar = notificationBar;
            }
        });
        make.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void showNotification$default(ShareLinkBloggerFromTileActionHandler shareLinkBloggerFromTileActionHandler, ViewGroup viewGroup, J j11, NotificationDTO notificationDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        shareLinkBloggerFromTileActionHandler.showNotification(viewGroup, j11, notificationDTO, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotificationByModel(NotificationDTO model, f.a widgetInfo, Function1<? super AtomAction, Unit> actionHandler) {
        ComponentCallbacksC5392m c11 = widgetInfo.a().c();
        ViewGroup rootView = ContextExtKt.getRootView(c11);
        if (rootView == null || c11 == null) {
            return;
        }
        showNotification(rootView, c11, model, actionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActionV2Request toActionV2Request(AtomAction.Click click, String str) {
        d builder = new d();
        if (click.getParams() != null) {
            builder.put("content", click.getParams());
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return new ActionV2Request(builder.u(), str, false, 4, null);
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // Vg.f
    public void processWidgetAction(@NotNull b action, @NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        String link;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        if ((action instanceof AtomAction.Click) && (link = ((AtomAction.Click) action).getLink()) != null) {
            HandlersInhibitor.run$default(getHandlersInhibitor(), 0L, new ShareLinkBloggerFromTileActionHandler$processWidgetAction$1(this, widgetInfo, action, link, widgetComponentStorage), 1, null);
        }
    }
}
