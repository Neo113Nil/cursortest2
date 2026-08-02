package ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger;

import Pc.a;
import Sc.InterfaceC4008j;
import Tg.b;
import Vg.f;
import a00.C4911f;
import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.core.app.t;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import java.util.concurrent.atomic.AtomicReference;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.B0;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 22\u00020\u0001:\u00012B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u001a\u0010!\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerActionHandler;", "LVg/f;", "LPc/a;", "Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerViewModel;", "pViewModel", "<init>", "(LPc/a;)V", "", "shareText", SelectionItemFormDTO.TITLE_FIELD_NAME, "Landroid/app/Activity;", "activity", "", "startShareSheet", "(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V", "La00/f;", "container", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "model", "showNotification", "(La00/f;Lkotlin/jvm/functions/Function1;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "LTg/b;", "action", "LVg/f$a;", "widgetInfo", "Lk20/g;", "widgetComponentStorage", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "LPc/a;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "LSc/j;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/uni/android/notificationbar/NotificationBar;", "currentNotificationBar", "Lru/ozon/uni/android/notificationbar/NotificationBar;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lxe/B0;", "currentJob", "Ljava/util/concurrent/atomic/AtomicReference;", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShareLinkBloggerActionHandler extends f {

    @NotNull
    private final String actionId;

    @NotNull
    private AtomicReference<B0> currentJob;
    private NotificationBar currentNotificationBar;

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j handlersInhibitor;

    @NotNull
    private final a<ShareLinkBloggerViewModel> pViewModel;

    public ShareLinkBloggerActionHandler(@NotNull a<ShareLinkBloggerViewModel> pViewModel) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        this.pViewModel = pViewModel;
        this.actionId = "shareLinkBlogger";
        this.handlersInhibitor = LazyUtilsKt.unsafeLazy(ShareLinkBloggerActionHandler$handlersInhibitor$2.INSTANCE);
        this.currentJob = new AtomicReference<>();
    }

    private final HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(C4911f container, Function1<? super AtomAction, Unit> actionHandler, NotificationDTO model) {
        ViewGroup rootView;
        NotificationLayoutManager asNotificationLayoutManager$default;
        ComponentCallbacksC5392m c11 = container.c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null) {
            return;
        }
        NotificationBar make = NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, model, container.e(), actionHandler);
        make.addCallback(new NotificationBar.Callback() { // from class: ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger.ShareLinkBloggerActionHandler$showNotification$1
            @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
            public void onDismissed(NotificationBar notificationBar, NotificationBar.DismissReason reason) {
                AtomicReference atomicReference;
                Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
                Intrinsics.checkNotNullParameter(reason, "reason");
                ShareLinkBloggerActionHandler.this.currentNotificationBar = null;
                notificationBar.removeCallback(this);
                atomicReference = ShareLinkBloggerActionHandler.this.currentJob;
                B0 b02 = (B0) atomicReference.getAndSet(null);
                if (b02 != null) {
                    b02.j(null);
                }
            }

            @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
            public void onShown(NotificationBar notificationBar) {
                Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
                ShareLinkBloggerActionHandler.this.currentNotificationBar = notificationBar;
            }
        });
        make.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startShareSheet(String shareText, String title, Activity activity) {
        t.a aVar = new t.a(activity);
        aVar.g("text/plain");
        aVar.f(shareText);
        aVar.d(title);
        Intent a11 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a11, "createChooserIntent(...)");
        activity.startActivityForResult(a11, 3434);
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // Vg.f
    public void processWidgetAction(@NotNull b action, @NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        C4911f a11;
        r a12;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        if ((action instanceof AtomAction.Click) && (a12 = (a11 = widgetInfo.a()).a()) != null) {
            HandlersInhibitor.run$default(getHandlersInhibitor(), 0L, new ShareLinkBloggerActionHandler$processWidgetAction$1(widgetInfo, this, a11.e(), action, a12, a11, widgetComponentStorage), 1, null);
        }
    }
}
