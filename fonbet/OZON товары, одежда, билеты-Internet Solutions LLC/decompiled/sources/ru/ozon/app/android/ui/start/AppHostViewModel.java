package ru.ozon.app.android.ui.start;

import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.firstLaunch.FirstLaunchStateStorage;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor;
import xe.B0;
import xe.C10727i;
import xe.E0;
import xe.InterfaceC10756x;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0017¨\u0006#"}, d2 = {"Lru/ozon/app/android/ui/start/AppHostViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/storage/firstLaunch/FirstLaunchStateStorage;", "firstLaunchStateStorage", "Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractor;", "onboardingInteractor", "<init>", "(Lru/ozon/app/android/storage/firstLaunch/FirstLaunchStateStorage;Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractor;)V", "Lxe/B0;", "loadPagesDataIfNecessary", "()Lxe/B0;", "", "canNavigate", "()Z", "", "initialPageOpened", "()V", "Lru/ozon/app/android/storage/firstLaunch/FirstLaunchStateStorage;", "Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractor;", "Lxe/x;", "navigationJob", "Lxe/x;", "shouldSkipOnboarding", "Z", "Landroidx/lifecycle/V;", "", "onboardingStatusLiveData", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/P;", "onboardingRequiredLiveData", "Landroidx/lifecycle/P;", "getOnboardingRequiredLiveData", "()Landroidx/lifecycle/P;", "canNavigateFurther", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppHostViewModel extends w0 {
    private boolean canNavigateFurther;

    @NotNull
    private final FirstLaunchStateStorage firstLaunchStateStorage;

    @NotNull
    private final InterfaceC10756x navigationJob;

    @NotNull
    private final OnboardingInteractor onboardingInteractor;

    @NotNull
    private final P<String> onboardingRequiredLiveData;

    @NotNull
    private final V<String> onboardingStatusLiveData;
    private boolean shouldSkipOnboarding;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ui/start/AppHostViewModel$Companion;", "", "<init>", "()V", "NO_ONBOARDING_STATUS", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AppHostViewModel(@NotNull FirstLaunchStateStorage firstLaunchStateStorage, @NotNull OnboardingInteractor onboardingInteractor) {
        Intrinsics.checkNotNullParameter(firstLaunchStateStorage, "firstLaunchStateStorage");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        this.firstLaunchStateStorage = firstLaunchStateStorage;
        this.onboardingInteractor = onboardingInteractor;
        this.navigationJob = E0.a();
        this.shouldSkipOnboarding = firstLaunchStateStorage.showedNewOnboarding() || firstLaunchStateStorage.getNotificationPermissionRequested();
        V<String> v11 = new V<>();
        this.onboardingStatusLiveData = v11;
        this.onboardingRequiredLiveData = v11;
        loadPagesDataIfNecessary();
    }

    private final B0 loadPagesDataIfNecessary() {
        return C10727i.c(x0.a(this), this.navigationJob, null, new AppHostViewModel$loadPagesDataIfNecessary$1(this, null), 2);
    }

    /* renamed from: canNavigate, reason: from getter */
    public final boolean getCanNavigateFurther() {
        return this.canNavigateFurther;
    }

    @NotNull
    public final P<String> getOnboardingRequiredLiveData() {
        return this.onboardingRequiredLiveData;
    }

    public final void initialPageOpened() {
        this.onboardingStatusLiveData.setValue("");
    }
}
