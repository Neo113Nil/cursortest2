package ru.ozon.app.android.fresh.feature.entry;

import He.b;
import android.content.Context;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import h3.C6788a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.firstLaunch.FirstLaunchStateStorage;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor;
import xe.C10720e0;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fJ\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R$\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/feature/entry/OzonFreshViewModel;", "Landroidx/lifecycle/w0;", "Landroid/content/Context;", "appContext", "Lru/ozon/app/android/storage/firstLaunch/FirstLaunchStateStorage;", "firstLaunchStateStorage", "Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractor;", "onboardingInteractor", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/storage/firstLaunch/FirstLaunchStateStorage;Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractor;)V", "", "loadPagesDataIfNecessary", "()V", "Landroidx/lifecycle/P;", "", "onboardingStatusLiveData", "()Landroidx/lifecycle/P;", "initialPageOpened", "loadMapApiKeys", "Landroid/content/Context;", "Lru/ozon/app/android/storage/firstLaunch/FirstLaunchStateStorage;", "Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractor;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "canNavigate", "Z", "getCanNavigate", "()Z", "shouldSkipOnboarding", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/V;", "Lxe/J;", "exceptionHandler", "Lxe/J;", "Companion", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OzonFreshViewModel extends w0 {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Context appContext;
    private boolean canNavigate;

    @NotNull
    private final J exceptionHandler;

    @NotNull
    private final FirstLaunchStateStorage firstLaunchStateStorage;

    @NotNull
    private final OnboardingInteractor onboardingInteractor;

    @NotNull
    private final V<String> onboardingStatusLiveData;
    private final boolean shouldSkipOnboarding;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/feature/entry/OzonFreshViewModel$Companion;", "", "<init>", "()V", "NO_ONBOARDING_STATUS", "", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OzonFreshViewModel(@NotNull Context appContext, @NotNull FirstLaunchStateStorage firstLaunchStateStorage, @NotNull OnboardingInteractor onboardingInteractor) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(firstLaunchStateStorage, "firstLaunchStateStorage");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        this.appContext = appContext;
        this.firstLaunchStateStorage = firstLaunchStateStorage;
        this.onboardingInteractor = onboardingInteractor;
        this.shouldSkipOnboarding = firstLaunchStateStorage.showedNewOnboarding() || firstLaunchStateStorage.getNotificationPermissionRequested();
        this.onboardingStatusLiveData = new V<>();
        this.exceptionHandler = new OzonFreshViewModel$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
        loadPagesDataIfNecessary();
    }

    private final void loadPagesDataIfNecessary() {
        C10727i.c(x0.a(this), null, null, new OzonFreshViewModel$loadPagesDataIfNecessary$1(this, null), 3);
    }

    public final boolean getCanNavigate() {
        return this.canNavigate;
    }

    public final void initialPageOpened() {
        this.onboardingStatusLiveData.setValue("");
    }

    public final void loadMapApiKeys() {
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, b.f10879b.plus(this.exceptionHandler), null, new OzonFreshViewModel$loadMapApiKeys$1(this, null), 2);
    }

    @NotNull
    public final P<String> onboardingStatusLiveData() {
        return this.onboardingStatusLiveData;
    }
}
