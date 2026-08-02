package ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.di;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.onboarding.MiniAppMilesOnboardingInfoProvider;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.onboarding.MiniAppOnboardingInfoProvider;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.onboarding.MiniAppTopTravelOnboardingInfoProvider;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.presentation.OnboardingType;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/OnboardingType;", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/onboarding/MiniAppOnboardingInfoProvider;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MiniAppTitleComponent$Companion$create$1$1$onboardingInfoProviders$2 extends AbstractC7737t implements Function0<Map<OnboardingType, ? extends MiniAppOnboardingInfoProvider>> {
    public static final MiniAppTitleComponent$Companion$create$1$1$onboardingInfoProviders$2 INSTANCE = new MiniAppTitleComponent$Companion$create$1$1$onboardingInfoProviders$2();

    MiniAppTitleComponent$Companion$create$1$1$onboardingInfoProviders$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<OnboardingType, ? extends MiniAppOnboardingInfoProvider> invoke() {
        return U.j(new Pair(OnboardingType.Miles.INSTANCE, new MiniAppMilesOnboardingInfoProvider()), new Pair(OnboardingType.Top.INSTANCE, new MiniAppTopTravelOnboardingInfoProvider()));
    }
}
