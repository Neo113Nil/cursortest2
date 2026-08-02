package ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.onboarding;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.view.MiniAppTitleView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/onboarding/MiniAppTopTravelOnboardingInfoProvider;", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/onboarding/MiniAppOnboardingInfoProvider;", "<init>", "()V", "getKey", "", "dto", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getChildView", "Landroid/view/View;", "parentView", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/view/MiniAppTitleView;", "getConfig", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "childView", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MiniAppTopTravelOnboardingInfoProvider implements MiniAppOnboardingInfoProvider {
    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.onboarding.MiniAppOnboardingInfoProvider
    @NotNull
    public View getChildView(@NotNull MiniAppTitleView parentView) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        return parentView.getTopTravelBadge();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.onboarding.MiniAppOnboardingInfoProvider
    @NotNull
    public OnBoardingCutConfig getConfig(@NotNull View parentView, @NotNull View childView) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(childView, "childView");
        Context context = parentView.getContext();
        Intrinsics.f(context);
        int px = ResourceExtKt.toPx(4, context);
        return new OnBoardingCutConfig(Integer.valueOf(childView.getLeft() - px), Integer.valueOf(childView.getTop() - px), Integer.valueOf((parentView.getWidth() - childView.getRight()) - px), Integer.valueOf((parentView.getHeight() - childView.getBottom()) - px), null, null, Float.valueOf(ResourceExtKt.toPxF(8, context)), false, 176, null);
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.onboarding.MiniAppOnboardingInfoProvider
    @NotNull
    public String getKey(@NotNull OnBoardingDTO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String onboardingKey = dto.getOnboardingKey();
        return onboardingKey == null ? "travel_mini_app_title_top_travel_onboarding_key" : onboardingKey;
    }
}
