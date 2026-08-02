package ru.ozon.app.android.travel.feature.general.common.widgets.notificationInformer.v2.presentation;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.G;
import androidx.lifecycle.J;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationInformer/v2/presentation/NotificationInformerV2WidgetHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationInformer/v2/presentation/NotificationInformerV2VO;", "Ll10/i;", "container", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;", "layoutManager", "<init>", "(Ll10/i;Landroid/view/ViewGroup;Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;)V", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationInformer/v2/presentation/NotificationInformerV2VO;)V", "Ll10/i;", "Landroid/view/ViewGroup;", "Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Ll10/b;", "composerController", "Ll10/b;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Landroidx/lifecycle/J;", "Landroidx/core/view/G;", "onPreDrawListener", "Landroidx/core/view/G;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationInformerV2WidgetHolder extends AbstractC6065b<NotificationInformerV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final InterfaceC7851b composerController;
    private final ViewGroup composerRootView;

    @NotNull
    private final i container;

    @NotNull
    private final NotificationLayoutManager layoutManager;

    @NotNull
    private final J lifecycleOwner;
    private final View metricView;
    private G onPreDrawListener;

    public NotificationInformerV2WidgetHolder(@NotNull i container, ViewGroup viewGroup, @NotNull NotificationLayoutManager layoutManager) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        this.container = container;
        this.composerRootView = viewGroup;
        this.layoutManager = layoutManager;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
        this.composerController = container.M();
        this.lifecycleOwner = container.K().d();
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull final NotificationInformerV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.composerController.m(item.getId());
        final ViewGroup viewGroup = this.composerRootView;
        this.onPreDrawListener = viewGroup != null ? G.a(viewGroup, new Runnable() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.notificationInformer.v2.presentation.NotificationInformerV2WidgetHolder$bind$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                NotificationLayoutManager notificationLayoutManager;
                J j11;
                G g10;
                NotificationBar.Companion companion = NotificationBar.INSTANCE;
                notificationLayoutManager = this.layoutManager;
                NotificationDTO notification = item.getNotification();
                j11 = this.lifecycleOwner;
                companion.make(notificationLayoutManager, notification, j11, new NotificationInformerV2WidgetHolder$bind$1$1(this, item)).show();
                g10 = this.onPreDrawListener;
                if (g10 != null) {
                    g10.b();
                }
            }
        }) : null;
    }
}
