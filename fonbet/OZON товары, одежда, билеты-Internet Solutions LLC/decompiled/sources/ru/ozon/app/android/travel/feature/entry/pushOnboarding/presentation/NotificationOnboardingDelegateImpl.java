package ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import B90.D;
import LZ.b;
import android.os.Bundle;
import androidx.appcompat.app.g;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qZ.C9010b;
import qZ.C9011c;
import qZ.InterfaceC9014f;
import rZ.C9237b;
import ru.ozon.app.android.navigation.FlowTag;
import ru.ozon.app.android.travel.utils.extensions.PermissionExtKt;
import sZ.c;
import xe.C10727i;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/NotificationOnboardingDelegateImpl;", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/NotificationOnboardingDelegate;", "Landroidx/appcompat/app/g;", "activity", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/NotificationOnboardingViewModel;", "notificationOnboardingViewModel", "LGZ/g;", "router", "<init>", "(Landroidx/appcompat/app/g;Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/NotificationOnboardingViewModel;LGZ/g;)V", "", "observeViewModel", "()V", "showOnboarding", "setFragmentResultListener", "initNotificationOnboardingFlow", "Landroidx/appcompat/app/g;", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/NotificationOnboardingViewModel;", "LGZ/g;", "Companion", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationOnboardingDelegateImpl implements NotificationOnboardingDelegate {

    @NotNull
    private final g activity;

    @NotNull
    private final NotificationOnboardingViewModel notificationOnboardingViewModel;

    @NotNull
    private final GZ.g router;
    public static final int $stable = 8;

    public NotificationOnboardingDelegateImpl(@NotNull g activity, @NotNull NotificationOnboardingViewModel notificationOnboardingViewModel, @NotNull GZ.g router) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(notificationOnboardingViewModel, "notificationOnboardingViewModel");
        Intrinsics.checkNotNullParameter(router, "router");
        this.activity = activity;
        this.notificationOnboardingViewModel = notificationOnboardingViewModel;
        this.router = router;
        observeViewModel();
        setFragmentResultListener();
    }

    private final void observeViewModel() {
        C2399j.C(new C2408n0(this.notificationOnboardingViewModel.getOnboardingStartAction(), new NotificationOnboardingDelegateImpl$observeViewModel$1(this, null)), K.a(this.activity));
    }

    private final void setFragmentResultListener() {
        this.activity.getSupportFragmentManager().n1("OzonTravelApp-REQUEST_KEY_RATIONALE_DIALOG", this.activity, new D(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFragmentResultListener$lambda$0(NotificationOnboardingDelegateImpl notificationOnboardingDelegateImpl, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (bundle.getBoolean("KEY_IS_OK")) {
            PermissionExtKt.openAppNotificationSettings(notificationOnboardingDelegateImpl.activity);
        }
        notificationOnboardingDelegateImpl.notificationOnboardingViewModel.onRationaleShown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOnboarding() {
        C9010b c9010b = new C9010b(FlowTag.PUSH_ONBOARDING, 6);
        ComponentCallbacksC5392m newInstance = PushOnboardingFragment.INSTANCE.newInstance();
        InterfaceC9014f a11 = c9010b.a();
        String name = c9010b.a().getName();
        C9011c.INSTANCE.getClass();
        Integer num = null;
        int i11 = 1;
        this.router.c(new b(new C9237b(num, a11, new c(name, C9011c.Companion.a(c9010b), null, false, false, null, false, false, false, 508, null), new c("ru.ozon.app.android.travel.feature.entry.fragment.NotificationOnboardingFragment", newInstance, null, false, false, null, false, false, false, 508, null), i11, null)), null);
    }

    @Override // ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.NotificationOnboardingDelegate
    public void initNotificationOnboardingFlow() {
        C10727i.c(K.a(this.activity), null, null, new NotificationOnboardingDelegateImpl$initNotificationOnboardingFlow$1(this, null), 3);
    }
}
