package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import B90.P;
import Sc.o;
import a00.C4908c;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.core.app.n;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.H;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.permission.extension.ActivitiesKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerViewModel;
import ru.ozon.app.android.travel.molecules.fragment.alertDialog.TravelAlertDialogFragment;
import ru.ozon.app.android.utils.PermissionExtKt;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u0012J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\n¢\u0006\u0004\b&\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0016\u0010)\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerDelegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel;", "viewModel", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect;", "viewEffect", "", "trigger", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect;)V", "", "isPermissionForApiMoreThan32Requested", "checkNotifications", "(Z)V", "requestNotifications", "()V", "openSettings", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$RationaleDialog;", "rationaleDialog", "showRationale", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$RationaleDialog;)V", "", "widgetId", "removeWidget", "(J)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "showDefaultError", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "onDestroy", "observeViewEffects", "Ll10/i;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel;", "isSettingsRequested", "Z", "getAreNotificationsEnabled", "()Z", "areNotificationsEnabled", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionBannerDelegate implements DefaultLifecycleObserver {

    @NotNull
    private final i container;
    private boolean isSettingsRequested;

    @NotNull
    private final NotificationSubscriptionBannerViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerDelegate$Companion;", "", "<init>", "()V", "REQUEST_KEY_RATIONALE_DIALOG", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public NotificationSubscriptionBannerDelegate(@NotNull i container, @NotNull NotificationSubscriptionBannerViewModel viewModel) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.container = container;
        this.viewModel = viewModel;
    }

    private final void checkNotifications(boolean isPermissionForApiMoreThan32Requested) {
        if (getAreNotificationsEnabled()) {
            this.viewModel.onViewIntent(NotificationSubscriptionBannerViewModel.ViewIntent.OnNotificationsTurnedOn.INSTANCE);
        } else {
            this.viewModel.onViewIntent(new NotificationSubscriptionBannerViewModel.ViewIntent.OnNotificationsTurnedOff(Build.VERSION.SDK_INT < 33 || isPermissionForApiMoreThan32Requested));
        }
    }

    private final boolean getAreNotificationsEnabled() {
        return n.e(this.container.L()).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeViewEffects$lambda$0(NotificationSubscriptionBannerDelegate notificationSubscriptionBannerDelegate, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        notificationSubscriptionBannerDelegate.viewModel.onViewIntent(bundle.getBoolean("KEY_IS_OK") ? NotificationSubscriptionBannerViewModel.ViewIntent.OnSettingsRequested.INSTANCE : NotificationSubscriptionBannerViewModel.ViewIntent.OnNotificationsRejected.INSTANCE);
    }

    private final void openSettings() {
        this.isSettingsRequested = true;
        r a11 = this.container.K().a();
        if (a11 != null) {
            PermissionExtKt.openAppNotificationsSettings(a11);
        }
    }

    private final void removeWidget(long widgetId) {
        this.container.M().m(widgetId);
    }

    private final void requestNotifications() {
        r a11;
        if (Build.VERSION.SDK_INT >= 33 && (a11 = this.container.K().a()) != null) {
            ActivitiesKt.requestPermission(a11, new NotificationSubscriptionBannerDelegate$requestNotifications$1(this));
        }
    }

    private final void showDefaultError() {
        ViewGroup rootView;
        ComponentCallbacksC5392m b11 = this.container.K().b();
        if (b11 == null || (rootView = ContextExtKt.getRootView(b11)) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, this.container.K().d(), 62, null).show();
    }

    private final void showNotification(NotificationDTO notification) {
        NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(this.container.Z(), null, 1, null);
        if (asNotificationLayoutManager$default == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, notification, this.container.K().f(), null, 8, null).show();
    }

    private final void showRationale(NotificationSubscriptionBannerVO.RationaleDialog rationaleDialog) {
        ComponentCallbacksC5392m b11 = this.container.K().b();
        if (b11 == null) {
            return;
        }
        Integer num = null;
        Integer num2 = null;
        TravelAlertDialogFragment.INSTANCE.newInstance(new TravelAlertDialogFragment.Settings(num, rationaleDialog.getMessage(), num2, rationaleDialog.getTitle(), null, rationaleDialog.getPositiveButton(), null, rationaleDialog.getNegativeButton(), 0, 341, null), "NotificationSubscriptionBanner-REQUEST_KEY_RATIONALE_DIALOG").show(b11.getChildFragmentManager(), "TravelAlertDialogFragment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trigger(NotificationSubscriptionBannerViewModel.ViewEffect viewEffect) {
        if (viewEffect instanceof NotificationSubscriptionBannerViewModel.ViewEffect.CheckNotifications) {
            checkNotifications(((NotificationSubscriptionBannerViewModel.ViewEffect.CheckNotifications) viewEffect).getIsPermissionForApiMoreThan32Requested());
            return;
        }
        if (Intrinsics.d(viewEffect, NotificationSubscriptionBannerViewModel.ViewEffect.RequestNotifications.INSTANCE)) {
            requestNotifications();
            return;
        }
        if (Intrinsics.d(viewEffect, NotificationSubscriptionBannerViewModel.ViewEffect.OpenSettings.INSTANCE)) {
            openSettings();
            return;
        }
        if (viewEffect instanceof NotificationSubscriptionBannerViewModel.ViewEffect.ShowRationale) {
            showRationale(((NotificationSubscriptionBannerViewModel.ViewEffect.ShowRationale) viewEffect).getDialog());
            return;
        }
        if (viewEffect instanceof NotificationSubscriptionBannerViewModel.ViewEffect.RemoveWidget) {
            removeWidget(((NotificationSubscriptionBannerViewModel.ViewEffect.RemoveWidget) viewEffect).getWidgetId());
        } else if (viewEffect instanceof NotificationSubscriptionBannerViewModel.ViewEffect.ShowNotification) {
            showNotification(((NotificationSubscriptionBannerViewModel.ViewEffect.ShowNotification) viewEffect).getNotification());
        } else {
            if (!Intrinsics.d(viewEffect, NotificationSubscriptionBannerViewModel.ViewEffect.ShowNetworkError.INSTANCE)) {
                throw new o();
            }
            showDefaultError();
        }
    }

    public final void observeViewEffects() {
        G childFragmentManager;
        C4908c f7 = this.container.K().f();
        f7.getLifecycle().a(this);
        ComponentCallbacksC5392m b11 = this.container.K().b();
        if (b11 != null && (childFragmentManager = b11.getChildFragmentManager()) != null) {
            childFragmentManager.n1("NotificationSubscriptionBanner-REQUEST_KEY_RATIONALE_DIALOG", f7, new P(this));
        }
        C2399j.C(new C2408n0(C5427n.a(this.viewModel.getViewEffectsSharedFlow(), f7.getLifecycle(), AbstractC5434v.b.STARTED), new NotificationSubscriptionBannerDelegate$observeViewEffects$2(this, null)), H.a(f7.getLifecycle()));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        owner.getLifecycle().e(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.isSettingsRequested) {
            this.isSettingsRequested = false;
            this.viewModel.onViewIntent(getAreNotificationsEnabled() ? NotificationSubscriptionBannerViewModel.ViewIntent.OnNotificationsTurnedOn.INSTANCE : NotificationSubscriptionBannerViewModel.ViewIntent.OnNotificationsRejected.INSTANCE);
        }
    }
}
