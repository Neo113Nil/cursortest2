package ru.ozon.app.android.fresh.navigation.onboarding;

import androidx.lifecycle.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\nR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/navigation/onboarding/FreshTabOnboardingViewModel;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "image", "", "loadOnBoarding", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "onBackgroundClicked", "()V", "onFreshTabClicked", "onCloseIconClicked", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/fresh/navigation/onboarding/OnBoardingDialogState;", "getOnBoardingDialogState", "()Landroidx/lifecycle/P;", "onBoardingDialogState", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface FreshTabOnboardingViewModel {
    @NotNull
    P<OnBoardingDialogState> getOnBoardingDialogState();

    void loadOnBoarding(String title, String description, String image);

    void onBackgroundClicked();

    void onCloseIconClicked();

    void onFreshTabClicked();
}
