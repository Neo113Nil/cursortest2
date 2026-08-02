package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import B90.C2606h;
import Sc.o;
import a00.C4908c;
import a00.C4911f;
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
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3VI;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3ViewModel;
import ru.ozon.app.android.travel.molecules.fragment.alertDialog.TravelAlertDialogFragment;
import ru.ozon.app.android.utils.PermissionExtKt;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 32\u00020\u0001:\u00013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u0012J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\n¢\u0006\u0004\b&\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0016\u0010)\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0018\u00102\u001a\u00060.j\u0002`/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3Delegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel;", "viewModel", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect;", "viewEffect", "", "trigger", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect;)V", "", "isPermissionForApiMoreThan32Requested", "checkNotifications", "(Z)V", "requestNotifications", "()V", "openSettings", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$RationaleDialog;", "rationaleDialog", "showRationale", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$RationaleDialog;)V", "", "widgetId", "removeWidget", "(J)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "showDefaultError", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "onDestroy", "observeViewEffects", "Ll10/i;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel;", "isSettingsRequested", "Z", "getAreNotificationsEnabled", "()Z", "areNotificationsEnabled", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "getOwnerContainer", "()La00/f;", "ownerContainer", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionBannerV3Delegate implements DefaultLifecycleObserver {

    @NotNull
    private final i container;
    private boolean isSettingsRequested;

    @NotNull
    private final NotificationSubscriptionBannerV3ViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3Delegate$Companion;", "", "<init>", "()V", "REQUEST_KEY_RATIONALE_DIALOG", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public NotificationSubscriptionBannerV3Delegate(@NotNull i container, @NotNull NotificationSubscriptionBannerV3ViewModel viewModel) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.container = container;
        this.viewModel = viewModel;
    }

    private final void checkNotifications(boolean isPermissionForApiMoreThan32Requested) {
        if (getAreNotificationsEnabled()) {
            this.viewModel.onViewIntent(NotificationSubscriptionBannerV3ViewModel.ViewIntent.OnNotificationsTurnedOn.INSTANCE);
        } else {
            this.viewModel.onViewIntent(new NotificationSubscriptionBannerV3ViewModel.ViewIntent.OnNotificationsTurnedOff(Build.VERSION.SDK_INT < 33 || isPermissionForApiMoreThan32Requested));
        }
    }

    private final boolean getAreNotificationsEnabled() {
        return n.e(this.container.L()).a();
    }

    private final C4911f getOwnerContainer() {
        return this.container.Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeViewEffects$lambda$0(NotificationSubscriptionBannerV3Delegate notificationSubscriptionBannerV3Delegate, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        notificationSubscriptionBannerV3Delegate.viewModel.onViewIntent(bundle.getBoolean("KEY_IS_OK") ? NotificationSubscriptionBannerV3ViewModel.ViewIntent.OnSettingsRequested.INSTANCE : NotificationSubscriptionBannerV3ViewModel.ViewIntent.OnNotificationsRejected.INSTANCE);
    }

    private final void openSettings() {
        this.isSettingsRequested = true;
        r a11 = getOwnerContainer().a();
        if (a11 != null) {
            PermissionExtKt.openAppNotificationsSettings(a11);
        }
    }

    private final void removeWidget(long widgetId) {
        this.container.M().m(widgetId);
    }

    private final void requestNotifications() {
        r a11;
        if (Build.VERSION.SDK_INT >= 33 && (a11 = getOwnerContainer().a()) != null) {
            ActivitiesKt.requestPermission(a11, new NotificationSubscriptionBannerV3Delegate$requestNotifications$1(this));
        }
    }

    private final void showDefaultError() {
        ViewGroup rootView;
        ComponentCallbacksC5392m c11 = getOwnerContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, getOwnerContainer().f(), 62, null).show();
    }

    private final void showNotification(NotificationDTO notification) {
        ViewGroup rootView;
        NotificationLayoutManager asNotificationLayoutManager$default;
        r a11 = getOwnerContainer().a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, notification, a11, null, 8, null).show();
    }

    private final void showRationale(NotificationSubscriptionBannerV3VI.RationaleDialog rationaleDialog) {
        ComponentCallbacksC5392m c11 = this.container.Q().c();
        if (c11 == null) {
            return;
        }
        Integer num = null;
        Integer num2 = null;
        TravelAlertDialogFragment.INSTANCE.newInstance(new TravelAlertDialogFragment.Settings(num, rationaleDialog.getMessage(), num2, rationaleDialog.getTitle(), null, rationaleDialog.getPositiveButton(), null, rationaleDialog.getNegativeButton(), 0, 341, null), "NotificationSubscriptionBanner-3-REQUEST_KEY_RATIONALE_DIALOG").show(c11.getChildFragmentManager(), "TravelAlertDialogFragment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trigger(NotificationSubscriptionBannerV3ViewModel.ViewEffect viewEffect) {
        if (viewEffect instanceof NotificationSubscriptionBannerV3ViewModel.ViewEffect.CheckNotifications) {
            checkNotifications(((NotificationSubscriptionBannerV3ViewModel.ViewEffect.CheckNotifications) viewEffect).getIsPermissionForApiMoreThan32Requested());
            return;
        }
        if (Intrinsics.d(viewEffect, NotificationSubscriptionBannerV3ViewModel.ViewEffect.RequestNotifications.INSTANCE)) {
            requestNotifications();
            return;
        }
        if (Intrinsics.d(viewEffect, NotificationSubscriptionBannerV3ViewModel.ViewEffect.OpenSettings.INSTANCE)) {
            openSettings();
            return;
        }
        if (viewEffect instanceof NotificationSubscriptionBannerV3ViewModel.ViewEffect.ShowRationale) {
            showRationale(((NotificationSubscriptionBannerV3ViewModel.ViewEffect.ShowRationale) viewEffect).getDialog());
            return;
        }
        if (viewEffect instanceof NotificationSubscriptionBannerV3ViewModel.ViewEffect.RemoveWidget) {
            removeWidget(((NotificationSubscriptionBannerV3ViewModel.ViewEffect.RemoveWidget) viewEffect).getWidgetId());
        } else if (viewEffect instanceof NotificationSubscriptionBannerV3ViewModel.ViewEffect.ShowNotification) {
            showNotification(((NotificationSubscriptionBannerV3ViewModel.ViewEffect.ShowNotification) viewEffect).getNotification());
        } else {
            if (!Intrinsics.d(viewEffect, NotificationSubscriptionBannerV3ViewModel.ViewEffect.ShowNetworkError.INSTANCE)) {
                throw new o();
            }
            showDefaultError();
        }
    }

    public final void observeViewEffects() {
        G childFragmentManager;
        C4908c g10 = this.container.Q().g();
        g10.getLifecycle().a(this);
        ComponentCallbacksC5392m c11 = this.container.Q().c();
        if (c11 != null && (childFragmentManager = c11.getChildFragmentManager()) != null) {
            childFragmentManager.n1("NotificationSubscriptionBanner-3-REQUEST_KEY_RATIONALE_DIALOG", g10, new C2606h(this, 2));
        }
        C2399j.C(new C2408n0(C5427n.a(this.viewModel.getViewEffectsSharedFlow(), g10.getLifecycle(), AbstractC5434v.b.STARTED), new NotificationSubscriptionBannerV3Delegate$observeViewEffects$2(this, null)), H.a(g10.getLifecycle()));
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
            this.viewModel.onViewIntent(getAreNotificationsEnabled() ? NotificationSubscriptionBannerV3ViewModel.ViewIntent.OnNotificationsTurnedOn.INSTANCE : NotificationSubscriptionBannerV3ViewModel.ViewIntent.OnNotificationsRejected.INSTANCE);
        }
    }
}
