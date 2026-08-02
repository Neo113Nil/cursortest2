package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import android.net.Uri;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.appOnboarding.data.AppOnboardingStorage;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002()B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\fJ!\u0010\u0014\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\fJ\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0 8\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$¨\u0006*"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingStorage;", "appOnboardingStorage", "<init>", "(Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingStorage;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "", "handle", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "onShow", "()V", "", "isShown", "()Z", "markAsWizard", "Landroid/net/Uri;", "uri", "referrerUri", "setRedirectData", "(Landroid/net/Uri;Landroid/net/Uri;)V", "markAsNotWizard", "onFinished", "Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingStorage;", "Lxe/B0;", "handleActionJob", "Lxe/B0;", "LAe/w0;", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel$Event;", "_events", "LAe/w0;", "LAe/h;", "events", "LAe/h;", "getEvents", "()LAe/h;", "_finishedEvents", "finishedEvents", "getFinishedEvents", "Companion", "Event", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppOnboardingViewModel extends w0 {

    @NotNull
    private final Ae.w0<Event> _events;

    @NotNull
    private final Ae.w0<Unit> _finishedEvents;

    @NotNull
    private final AppOnboardingStorage appOnboardingStorage;

    @NotNull
    private final InterfaceC2395h<Event> events;

    @NotNull
    private final InterfaceC2395h<Unit> finishedEvents;
    private B0 handleActionJob;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel$Event;", "", "NextStep", "CloseFlow", "CloseFlowWithRedirect", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel$Event$CloseFlow;", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel$Event$CloseFlowWithRedirect;", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel$Event$NextStep;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Event {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel$Event$CloseFlow;", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CloseFlow implements Event {

            @NotNull
            public static final CloseFlow INSTANCE = new CloseFlow();

            private CloseFlow() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CloseFlow);
            }

            public int hashCode() {
                return -1242118674;
            }

            @NotNull
            public String toString() {
                return "CloseFlow";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel$Event$CloseFlowWithRedirect;", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel$Event;", "Landroid/net/Uri;", "deeplink", "referrer", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getDeeplink", "()Landroid/net/Uri;", "getReferrer", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CloseFlowWithRedirect implements Event {

            @NotNull
            private final Uri deeplink;

            @NotNull
            private final Uri referrer;

            public CloseFlowWithRedirect(@NotNull Uri deeplink, @NotNull Uri referrer) {
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                Intrinsics.checkNotNullParameter(referrer, "referrer");
                this.deeplink = deeplink;
                this.referrer = referrer;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CloseFlowWithRedirect)) {
                    return false;
                }
                CloseFlowWithRedirect closeFlowWithRedirect = (CloseFlowWithRedirect) other;
                return Intrinsics.d(this.deeplink, closeFlowWithRedirect.deeplink) && Intrinsics.d(this.referrer, closeFlowWithRedirect.referrer);
            }

            @NotNull
            public final Uri getDeeplink() {
                return this.deeplink;
            }

            @NotNull
            public final Uri getReferrer() {
                return this.referrer;
            }

            public int hashCode() {
                return this.referrer.hashCode() + (this.deeplink.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "CloseFlowWithRedirect(deeplink=" + this.deeplink + ", referrer=" + this.referrer + ")";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel$Event$NextStep;", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NextStep implements Event {

            @NotNull
            public static final NextStep INSTANCE = new NextStep();

            private NextStep() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NextStep);
            }

            public int hashCode() {
                return 1538437303;
            }

            @NotNull
            public String toString() {
                return "NextStep";
            }
        }
    }

    public AppOnboardingViewModel(@NotNull AppOnboardingStorage appOnboardingStorage) {
        Intrinsics.checkNotNullParameter(appOnboardingStorage, "appOnboardingStorage");
        this.appOnboardingStorage = appOnboardingStorage;
        C0 b11 = E0.b(0, 0, null, 7);
        this._events = b11;
        this.events = C2399j.a(b11);
        C0 b12 = E0.b(0, 1, null, 5);
        this._finishedEvents = b12;
        this.finishedEvents = C2399j.a(b12);
    }

    @NotNull
    public final InterfaceC2395h<Event> getEvents() {
        return this.events;
    }

    @NotNull
    public final InterfaceC2395h<Unit> getFinishedEvents() {
        return this.finishedEvents;
    }

    public final void handle(@NotNull AtomAction.Click action) {
        Intrinsics.checkNotNullParameter(action, "action");
        B0 b02 = this.handleActionJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.handleActionJob = C10727i.c(x0.a(this), null, null, new AppOnboardingViewModel$handle$1(action, this, null), 3);
    }

    public final boolean isShown() {
        return this.appOnboardingStorage.isShown();
    }

    public final void markAsNotWizard() {
        this.appOnboardingStorage.markAsNotWizard();
    }

    public final void markAsWizard() {
        this.appOnboardingStorage.markAsWizard();
    }

    public final void onFinished() {
        this._finishedEvents.tryEmit(Unit.f71690a);
    }

    public final void onShow() {
        if (!this.appOnboardingStorage.getOpenedAsWizard() || this.appOnboardingStorage.isShown()) {
            return;
        }
        this.appOnboardingStorage.markAsShown();
    }

    public final void setRedirectData(Uri uri, Uri referrerUri) {
        this.appOnboardingStorage.setRedirectData(uri, referrerUri);
    }
}
