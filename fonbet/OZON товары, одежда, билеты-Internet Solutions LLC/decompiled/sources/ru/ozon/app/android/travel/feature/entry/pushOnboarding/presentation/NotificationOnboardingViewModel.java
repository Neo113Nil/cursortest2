package ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import android.app.NotificationManager;
import android.content.Context;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.entry.data.PushOnboardingPrefsRepository;
import xe.C10727i;
import ze.EnumC11113a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0018B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/NotificationOnboardingViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/entry/data/PushOnboardingPrefsRepository;", "pushOnboardingRepository", "<init>", "(Lru/ozon/app/android/travel/feature/entry/data/PushOnboardingPrefsRepository;)V", "Landroid/content/Context;", "context", "", "runNotificationOnboardingFlow", "(Landroid/content/Context;)V", "checkOnboardingFlow", "onRationaleShown", "()V", "Lru/ozon/app/android/travel/feature/entry/data/PushOnboardingPrefsRepository;", "LAe/w0;", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/NotificationOnboardingViewModel$OnboardingStartAction;", "_onboardingStartAction", "LAe/w0;", "LAe/B0;", "onboardingStartAction", "LAe/B0;", "getOnboardingStartAction", "()LAe/B0;", "OnboardingStartAction", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationOnboardingViewModel extends w0 {

    @NotNull
    private final Ae.w0<OnboardingStartAction> _onboardingStartAction;

    @NotNull
    private final B0<OnboardingStartAction> onboardingStartAction;

    @NotNull
    private final PushOnboardingPrefsRepository pushOnboardingRepository;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/NotificationOnboardingViewModel$OnboardingStartAction;", "", "<init>", "()V", "None", "ShowOnboarding", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/NotificationOnboardingViewModel$OnboardingStartAction$None;", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/NotificationOnboardingViewModel$OnboardingStartAction$ShowOnboarding;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class OnboardingStartAction {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/NotificationOnboardingViewModel$OnboardingStartAction$None;", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/NotificationOnboardingViewModel$OnboardingStartAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class None extends OnboardingStartAction {

            @NotNull
            public static final None INSTANCE = new None();

            private None() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof None);
            }

            public int hashCode() {
                return -1833981161;
            }

            @NotNull
            public String toString() {
                return "None";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/NotificationOnboardingViewModel$OnboardingStartAction$ShowOnboarding;", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/NotificationOnboardingViewModel$OnboardingStartAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowOnboarding extends OnboardingStartAction {

            @NotNull
            public static final ShowOnboarding INSTANCE = new ShowOnboarding();

            private ShowOnboarding() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowOnboarding);
            }

            public int hashCode() {
                return 1132201495;
            }

            @NotNull
            public String toString() {
                return "ShowOnboarding";
            }
        }

        public /* synthetic */ OnboardingStartAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private OnboardingStartAction() {
        }
    }

    public NotificationOnboardingViewModel(@NotNull PushOnboardingPrefsRepository pushOnboardingRepository) {
        Intrinsics.checkNotNullParameter(pushOnboardingRepository, "pushOnboardingRepository");
        this.pushOnboardingRepository = pushOnboardingRepository;
        C0 a11 = E0.a(0, 1, EnumC11113a.DROP_OLDEST);
        this._onboardingStartAction = a11;
        this.onboardingStartAction = C2399j.a(a11);
    }

    private final void runNotificationOnboardingFlow(Context context) {
        Object systemService = context.getSystemService("notification");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        C10727i.c(x0.a(this), null, null, new NotificationOnboardingViewModel$runNotificationOnboardingFlow$1(((NotificationManager) systemService).areNotificationsEnabled(), this, null), 3);
    }

    public final void checkOnboardingFlow(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        runNotificationOnboardingFlow(context);
    }

    @NotNull
    public final B0<OnboardingStartAction> getOnboardingStartAction() {
        return this.onboardingStartAction;
    }

    public final void onRationaleShown() {
        C10727i.c(x0.a(this), null, null, new NotificationOnboardingViewModel$onRationaleShown$1(this, null), 3);
    }
}
