package ru.ozon.app.android.fresh.navigation.onboarding;

import Bc.o;
import Mc.a;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.navigation.onboarding.FreshTabOnboardingViewModelImpl;
import ru.ozon.app.android.fresh.navigation.onboarding.OnBoardingVO;
import ru.ozon.app.android.fresh.navigation.onboarding.analytics.FreshTabOnBoardingAnalytics;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/navigation/onboarding/FreshTabOnboardingViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/navigation/onboarding/FreshTabOnboardingViewModel;", "Lru/ozon/app/android/fresh/navigation/onboarding/OnBoardingMapper;", "onboardingMapper", "Lru/ozon/app/android/fresh/navigation/onboarding/analytics/FreshTabOnBoardingAnalytics;", "analytics", "<init>", "(Lru/ozon/app/android/fresh/navigation/onboarding/OnBoardingMapper;Lru/ozon/app/android/fresh/navigation/onboarding/analytics/FreshTabOnBoardingAnalytics;)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "image", "", "loadOnBoarding", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "onBackgroundClicked", "()V", "onFreshTabClicked", "onCloseIconClicked", "onCleared", "Lru/ozon/app/android/fresh/navigation/onboarding/OnBoardingMapper;", "Lru/ozon/app/android/fresh/navigation/onboarding/analytics/FreshTabOnBoardingAnalytics;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/fresh/navigation/onboarding/OnBoardingDialogState;", "onBoardingDialogState", "Landroidx/lifecycle/V;", "getOnBoardingDialogState", "()Landroidx/lifecycle/V;", "Lnc/a;", "disposables", "Lnc/a;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshTabOnboardingViewModelImpl extends w0 implements FreshTabOnboardingViewModel {

    @NotNull
    private final FreshTabOnBoardingAnalytics analytics;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final V<OnBoardingDialogState> onBoardingDialogState;

    @NotNull
    private final OnBoardingMapper onboardingMapper;

    public FreshTabOnboardingViewModelImpl(@NotNull OnBoardingMapper onboardingMapper, @NotNull FreshTabOnBoardingAnalytics analytics) {
        Intrinsics.checkNotNullParameter(onboardingMapper, "onboardingMapper");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.onboardingMapper = onboardingMapper;
        this.analytics = analytics;
        this.onBoardingDialogState = new V<>();
        this.disposables = new C8486a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnBoardingVO loadOnBoarding$lambda$0(FreshTabOnboardingViewModelImpl freshTabOnboardingViewModelImpl, String str, String str2, String str3) {
        return freshTabOnboardingViewModelImpl.onboardingMapper.getOnBoardingVO(str, str2, str3);
    }

    @Override // ru.ozon.app.android.fresh.navigation.onboarding.FreshTabOnboardingViewModel
    public void loadOnBoarding(final String title, final String description, final String image) {
        C8486a c8486a = this.disposables;
        InterfaceC8487b h11 = new o(new Callable() { // from class: Pw.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                OnBoardingVO loadOnBoarding$lambda$0;
                loadOnBoarding$lambda$0 = FreshTabOnboardingViewModelImpl.loadOnBoarding$lambda$0(FreshTabOnboardingViewModelImpl.this, title, description, image);
                return loadOnBoarding$lambda$0;
            }
        }).j(a.b()).g(C8125a.a()).h(new DM.a(new FreshTabOnboardingViewModelImpl$loadOnBoarding$2(this), 5), new CJ.a(new FreshTabOnboardingViewModelImpl$loadOnBoarding$3(this), 3));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    @Override // ru.ozon.app.android.fresh.navigation.onboarding.FreshTabOnboardingViewModel
    public void onBackgroundClicked() {
        this.analytics.trackOnBoardingBackgroundClicked();
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.disposables.d();
    }

    @Override // ru.ozon.app.android.fresh.navigation.onboarding.FreshTabOnboardingViewModel
    public void onCloseIconClicked() {
        this.analytics.trackOnBoardingCloseIconClicked();
    }

    @Override // ru.ozon.app.android.fresh.navigation.onboarding.FreshTabOnboardingViewModel
    public void onFreshTabClicked() {
        this.analytics.trackFreshTabClicked();
    }

    @Override // ru.ozon.app.android.fresh.navigation.onboarding.FreshTabOnboardingViewModel
    @NotNull
    public V<OnBoardingDialogState> getOnBoardingDialogState() {
        return this.onBoardingDialogState;
    }
}
