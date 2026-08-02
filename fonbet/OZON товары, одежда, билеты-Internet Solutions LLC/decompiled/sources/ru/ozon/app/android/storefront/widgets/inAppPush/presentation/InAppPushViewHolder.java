package ru.ozon.app.android.storefront.widgets.inAppPush.presentation;

import T00.m;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.storefront.widgets.inAppPush.core.NotificationShownEvent;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001!\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\r0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/widgets/inAppPush/presentation/InAppPushViewHolder;", "Ld20/b;", "Lru/ozon/app/android/storefront/widgets/inAppPush/presentation/InAppPushVO;", "Ll10/i;", "uiContainer", "Lru/ozon/app/android/storefront/widgets/inAppPush/presentation/InAppPushViewModel;", "viewModel", "<init>", "(Ll10/i;Lru/ozon/app/android/storefront/widgets/inAppPush/presentation/InAppPushViewModel;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationDTO", "", "pixelUrl", "", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/lang/String;)V", "onWidgetCreated", "()V", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/storefront/widgets/inAppPush/presentation/InAppPushVO;)V", "Ll10/i;", "Lru/ozon/app/android/storefront/widgets/inAppPush/presentation/InAppPushViewModel;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ru/ozon/app/android/storefront/widgets/inAppPush/presentation/InAppPushViewHolder$viewObserver$1", "viewObserver", "Lru/ozon/app/android/storefront/widgets/inAppPush/presentation/InAppPushViewHolder$viewObserver$1;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InAppPushViewHolder extends AbstractC6065b<InAppPushVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final View metricView;

    @NotNull
    private final i uiContainer;

    @NotNull
    private final InAppPushViewModel viewModel;

    @NotNull
    private final InAppPushViewHolder$viewObserver$1 viewObserver;

    /* JADX WARN: Type inference failed for: r2v2, types: [ru.ozon.app.android.storefront.widgets.inAppPush.presentation.InAppPushViewHolder$viewObserver$1] */
    public InAppPushViewHolder(@NotNull i uiContainer, @NotNull InAppPushViewModel viewModel) {
        Intrinsics.checkNotNullParameter(uiContainer, "uiContainer");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.uiContainer = uiContainer;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(uiContainer, this).buildHandler();
        this.viewObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.storefront.widgets.inAppPush.presentation.InAppPushViewHolder$viewObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                InAppPushViewModel inAppPushViewModel;
                Intrinsics.checkNotNullParameter(owner, "owner");
                inAppPushViewModel = InAppPushViewHolder.this.viewModel;
                InAppPushVO boundData = InAppPushViewHolder.this.getBoundData();
                if (boundData != null) {
                    inAppPushViewModel.startFetchWidgetWithTimer(boundData.getRefreshInterval());
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                InAppPushViewModel inAppPushViewModel;
                Intrinsics.checkNotNullParameter(owner, "owner");
                inAppPushViewModel = InAppPushViewHolder.this.viewModel;
                inAppPushViewModel.stopTimer();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(NotificationDTO notificationDTO, String pixelUrl) {
        ComponentCallbacksC5392m b11 = this.uiContainer.K().b();
        View view = b11 != null ? b11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || notificationDTO == null) {
            return;
        }
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(viewGroup, NotificationBarKt.isAboveBottomWidgets(notificationDTO));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(viewGroup, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager, notificationDTO, this.uiContainer.K().f(), this.actionHandler).show();
        this.viewModel.trackAnalytics(pixelUrl);
        this.uiContainer.M().update(NotificationShownEvent.INSTANCE);
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        this.viewModel.getNotificationEvent().observe(this.uiContainer.K().f(), new InAppPushViewHolder$sam$androidx_lifecycle_Observer$0(new InAppPushViewHolder$onWidgetCreated$1(this)));
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        this.viewModel.stopTimer();
        getLifecycle().e(this.viewObserver);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull InAppPushVO item) {
        d c11;
        m c12;
        Intrinsics.checkNotNullParameter(item, "item");
        InAppPushViewModel inAppPushViewModel = this.viewModel;
        l viewItem = getViewItem();
        inAppPushViewModel.setAsyncData((viewItem == null || (c11 = viewItem.c()) == null || (c12 = c11.c()) == null) ? null : c12.a());
        this.viewModel.startFetchWidgetWithTimer(item.getRefreshInterval());
        getLifecycle().a(this.viewObserver);
        showNotification(item.getNotificationBar(), item.getPixelUrl());
    }
}
