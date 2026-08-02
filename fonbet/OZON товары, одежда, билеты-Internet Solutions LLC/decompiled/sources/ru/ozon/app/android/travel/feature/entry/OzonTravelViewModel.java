package ru.ozon.app.android.travel.feature.entry;

import Ae.B0;
import Ae.C2399j;
import Ae.E0;
import android.content.Context;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.firstLaunch.FirstLaunchStateStorage;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor;
import xe.C10727i;
import xe.InterfaceC10756x;
import xe.J;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001.B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\fJ\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R$\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010)R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00170*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/OzonTravelViewModel;", "Landroidx/lifecycle/w0;", "Landroid/content/Context;", "appContext", "Lru/ozon/app/android/storage/firstLaunch/FirstLaunchStateStorage;", "firstLaunchStateStorage", "Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractor;", "onboardingInteractor", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/storage/firstLaunch/FirstLaunchStateStorage;Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractor;)V", "", "loadPagesDataIfNecessary", "()V", "startNotificationAction", "Landroidx/lifecycle/P;", "", "onboardingStatusLiveData", "()Landroidx/lifecycle/P;", "initialPageOpened", "loadMapApiKeys", "Landroid/content/Context;", "Lru/ozon/app/android/storage/firstLaunch/FirstLaunchStateStorage;", "Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractor;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "canNavigate", "Z", "getCanNavigate", "()Z", "LAe/w0;", "_notificationAction", "LAe/w0;", "Lxe/J;", "exceptionHandler", "Lxe/J;", "shouldSkipOnboarding", "Lxe/x;", "navigationJob", "Lxe/x;", "mapApiKeysJob", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/V;", "LAe/B0;", "getNotificationAction", "()LAe/B0;", "notificationAction", "Companion", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OzonTravelViewModel extends w0 {

    @NotNull
    private final Ae.w0<Boolean> _notificationAction;

    @NotNull
    private final Context appContext;
    private boolean canNavigate;

    @NotNull
    private final J exceptionHandler;

    @NotNull
    private final FirstLaunchStateStorage firstLaunchStateStorage;

    @NotNull
    private final InterfaceC10756x mapApiKeysJob;

    @NotNull
    private final InterfaceC10756x navigationJob;

    @NotNull
    private final OnboardingInteractor onboardingInteractor;

    @NotNull
    private final V<String> onboardingStatusLiveData;
    private final boolean shouldSkipOnboarding;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/OzonTravelViewModel$Companion;", "", "<init>", "()V", "NO_ONBOARDING_STATUS", "", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OzonTravelViewModel(@NotNull Context appContext, @NotNull FirstLaunchStateStorage firstLaunchStateStorage, @NotNull OnboardingInteractor onboardingInteractor) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(firstLaunchStateStorage, "firstLaunchStateStorage");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        this.appContext = appContext;
        this.firstLaunchStateStorage = firstLaunchStateStorage;
        this.onboardingInteractor = onboardingInteractor;
        this._notificationAction = E0.a(0, 1, EnumC11113a.DROP_OLDEST);
        this.exceptionHandler = new OzonTravelViewModel$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
        this.shouldSkipOnboarding = firstLaunchStateStorage.showedNewOnboarding() || firstLaunchStateStorage.getNotificationPermissionRequested();
        this.navigationJob = xe.E0.a();
        this.mapApiKeysJob = xe.E0.a();
        this.onboardingStatusLiveData = new V<>();
        loadPagesDataIfNecessary();
    }

    private final void loadPagesDataIfNecessary() {
        C10727i.c(x0.a(this), this.navigationJob, null, new OzonTravelViewModel$loadPagesDataIfNecessary$1(this, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startNotificationAction() {
        C10727i.c(x0.a(this), null, null, new OzonTravelViewModel$startNotificationAction$1(this, null), 3);
    }

    public final boolean getCanNavigate() {
        return this.canNavigate;
    }

    @NotNull
    public final B0<Boolean> getNotificationAction() {
        return C2399j.a(this._notificationAction);
    }

    public final void initialPageOpened() {
        this.onboardingStatusLiveData.setValue("");
        startNotificationAction();
    }

    public final void loadMapApiKeys() {
        C10727i.c(x0.a(this), this.mapApiKeysJob.plus(this.exceptionHandler), null, new OzonTravelViewModel$loadMapApiKeys$1(this, null), 2);
    }

    @NotNull
    public final P<String> onboardingStatusLiveData() {
        return this.onboardingStatusLiveData;
    }
}
