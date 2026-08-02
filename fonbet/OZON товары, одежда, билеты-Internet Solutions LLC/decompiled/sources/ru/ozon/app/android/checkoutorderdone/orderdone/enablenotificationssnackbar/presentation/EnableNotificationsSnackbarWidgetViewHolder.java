package ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.presentation;

import Dc0.p;
import L3.m;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.notifications.utils.NotificationHelper;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001!\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/enablenotificationssnackbar/presentation/EnableNotificationsSnackbarWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/checkoutorderdone/orderdone/enablenotificationssnackbar/presentation/EnableNotificationsSnackbarVO;", "Landroid/view/ViewGroup;", "root", "Ll10/i;", "container", "<init>", "(Landroid/view/ViewGroup;Ll10/i;)V", "", "dismissNotification", "()Z", "", "onWidgetCreated", "()V", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/checkoutorderdone/orderdone/enablenotificationssnackbar/presentation/EnableNotificationsSnackbarVO;)V", "Landroid/view/ViewGroup;", "Ll10/i;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/android/notificationbar/NotificationBar;", "notification", "Lru/ozon/uni/android/notificationbar/NotificationBar;", "ru/ozon/app/android/checkoutorderdone/orderdone/enablenotificationssnackbar/presentation/EnableNotificationsSnackbarWidgetViewHolder$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/checkoutorderdone/orderdone/enablenotificationssnackbar/presentation/EnableNotificationsSnackbarWidgetViewHolder$lifecycleObserver$1;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EnableNotificationsSnackbarWidgetViewHolder extends AbstractC6065b<EnableNotificationsSnackbarVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final EnableNotificationsSnackbarWidgetViewHolder$lifecycleObserver$1 lifecycleObserver;
    private final View metricView;
    private NotificationBar notification;

    @NotNull
    private final ViewGroup root;

    /* JADX WARN: Type inference failed for: r2v3, types: [ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.presentation.EnableNotificationsSnackbarWidgetViewHolder$lifecycleObserver$1] */
    public EnableNotificationsSnackbarWidgetViewHolder(@NotNull ViewGroup root, @NotNull i container) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(container, "container");
        this.root = root;
        this.container = container;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
        this.lifecycleObserver = new G() { // from class: ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.presentation.EnableNotificationsSnackbarWidgetViewHolder$lifecycleObserver$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AbstractC5434v.a.values().length];
                    try {
                        iArr[AbstractC5434v.a.ON_RESUME.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AbstractC5434v.a.ON_DESTROY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.lifecycle.G
            public void onStateChanged(J source, AbstractC5434v.a event) {
                i iVar;
                i iVar2;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                int i11 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        return;
                    }
                    iVar2 = EnableNotificationsSnackbarWidgetViewHolder.this.container;
                    iVar2.K().f().getLifecycle().e(this);
                    return;
                }
                NotificationHelper notificationHelper = NotificationHelper.INSTANCE;
                iVar = EnableNotificationsSnackbarWidgetViewHolder.this.container;
                if (notificationHelper.isSystemNotificationsTurnedOn(iVar.K().g())) {
                    EnableNotificationsSnackbarWidgetViewHolder.this.dismissNotification();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(EnableNotificationsSnackbarWidgetViewHolder enableNotificationsSnackbarWidgetViewHolder, NotificationLayoutManager notificationLayoutManager, EnableNotificationsSnackbarVO enableNotificationsSnackbarVO) {
        NotificationBar turnOffDismissOnAction = NotificationBar.INSTANCE.make(notificationLayoutManager, enableNotificationsSnackbarVO.getNotification(), enableNotificationsSnackbarWidgetViewHolder.container.K().f(), enableNotificationsSnackbarWidgetViewHolder.actionHandler).turnOffDismissOnAction();
        enableNotificationsSnackbarWidgetViewHolder.notification = turnOffDismissOnAction;
        if (turnOffDismissOnAction != null) {
            turnOffDismissOnAction.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean dismissNotification() {
        return this.root.post(new m(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissNotification$lambda$1(EnableNotificationsSnackbarWidgetViewHolder enableNotificationsSnackbarWidgetViewHolder) {
        NotificationBar notificationBar = enableNotificationsSnackbarWidgetViewHolder.notification;
        if (notificationBar != null) {
            notificationBar.dismiss();
        }
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        this.container.K().f().getLifecycle().a(this.lifecycleObserver);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        this.container.K().f().getLifecycle().e(this.lifecycleObserver);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull EnableNotificationsSnackbarVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getAreNotificationsEnabled()) {
            dismissNotification();
            return;
        }
        ViewGroup viewGroup = this.root;
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(viewGroup, NotificationBarKt.isAboveBottomWidgets(item.getNotification()));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(viewGroup, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        this.root.post(new p(this, asNotificationLayoutManager, item, 1));
    }
}
