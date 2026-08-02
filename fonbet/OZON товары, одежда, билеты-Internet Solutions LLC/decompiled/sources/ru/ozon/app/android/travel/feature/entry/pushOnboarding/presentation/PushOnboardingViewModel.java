package ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation;

import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.data.PushOnboardingDataRepository;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.data.PushOnboardingPageData;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001bB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/PushOnboardingViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/data/PushOnboardingDataRepository;", "repository", "Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "enableNotificationsSuggestingHandler", "<init>", "(Lru/ozon/app/android/travel/feature/entry/pushOnboarding/data/PushOnboardingDataRepository;Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;)V", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/data/PushOnboardingPageData;", "getData", "()Lru/ozon/app/android/travel/feature/entry/pushOnboarding/data/PushOnboardingPageData;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "onboardingDismissed", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "onboardingConfirm", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/data/PushOnboardingDataRepository;", "Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "LAe/w0;", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/PushOnboardingViewModel$OnboardingResultAction;", "_onboardingStateFlow", "LAe/w0;", "LAe/h;", "getOnboardingAction", "()LAe/h;", "onboardingAction", "OnboardingResultAction", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushOnboardingViewModel extends w0 {

    @NotNull
    private final Ae.w0<OnboardingResultAction> _onboardingStateFlow;

    @NotNull
    private final EnableNotificationsSuggestingHandler enableNotificationsSuggestingHandler;

    @NotNull
    private final PushOnboardingDataRepository repository;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/PushOnboardingViewModel$OnboardingResultAction;", "", "<init>", "()V", "ShowPermissionsDialog", "DismissFlow", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/PushOnboardingViewModel$OnboardingResultAction$DismissFlow;", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/PushOnboardingViewModel$OnboardingResultAction$ShowPermissionsDialog;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class OnboardingResultAction {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/PushOnboardingViewModel$OnboardingResultAction$DismissFlow;", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/PushOnboardingViewModel$OnboardingResultAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DismissFlow extends OnboardingResultAction {

            @NotNull
            public static final DismissFlow INSTANCE = new DismissFlow();

            private DismissFlow() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof DismissFlow);
            }

            public int hashCode() {
                return -1962483531;
            }

            @NotNull
            public String toString() {
                return "DismissFlow";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/PushOnboardingViewModel$OnboardingResultAction$ShowPermissionsDialog;", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/PushOnboardingViewModel$OnboardingResultAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowPermissionsDialog extends OnboardingResultAction {

            @NotNull
            public static final ShowPermissionsDialog INSTANCE = new ShowPermissionsDialog();

            private ShowPermissionsDialog() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowPermissionsDialog);
            }

            public int hashCode() {
                return -570448116;
            }

            @NotNull
            public String toString() {
                return "ShowPermissionsDialog";
            }
        }

        public /* synthetic */ OnboardingResultAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private OnboardingResultAction() {
        }
    }

    public PushOnboardingViewModel(@NotNull PushOnboardingDataRepository repository, @NotNull EnableNotificationsSuggestingHandler enableNotificationsSuggestingHandler) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(enableNotificationsSuggestingHandler, "enableNotificationsSuggestingHandler");
        this.repository = repository;
        this.enableNotificationsSuggestingHandler = enableNotificationsSuggestingHandler;
        this._onboardingStateFlow = E0.b(0, 0, null, 7);
    }

    @NotNull
    public final PushOnboardingPageData getData() {
        return this.repository.getPageData();
    }

    @NotNull
    public final InterfaceC2395h<OnboardingResultAction> getOnboardingAction() {
        return C2399j.o(this._onboardingStateFlow);
    }

    public final void onboardingConfirm(AtomAction action) {
        C10727i.c(x0.a(this), null, null, new PushOnboardingViewModel$onboardingConfirm$2(this, null), 3);
    }

    public final void onboardingDismissed(AtomAction action) {
        C10727i.c(x0.a(this), null, null, new PushOnboardingViewModel$onboardingDismissed$2(this, null), 3);
    }
}
