package ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.onboarding;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.view.MiniAppTitleView;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H&¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/onboarding/MiniAppOnboardingInfoProvider;", "", "getKey", "", "dto", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getChildView", "Landroid/view/View;", "parentView", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/view/MiniAppTitleView;", "getConfig", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "childView", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface MiniAppOnboardingInfoProvider {
    @NotNull
    View getChildView(@NotNull MiniAppTitleView parentView);

    @NotNull
    OnBoardingCutConfig getConfig(@NotNull View parentView, @NotNull View childView);

    @NotNull
    String getKey(@NotNull OnBoardingDTO dto);
}
