package ru.ozon.app.android.ugc.widgets.ugccounters.onboarding;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayDisableRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayOnPageRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ>\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u001c\u0010\u0013\u001a\u00020\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u0012\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/onboarding/UgcCountersOnboardingViewModel;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "displayRepository", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository;", "displayOnPageRepository", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayOnPageRepository;", "disableOnBoardingRepository", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayDisableRepository;", "<init>", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayOnPageRepository;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayDisableRepository;)V", "getFirstNonShownOnboarding", "Lkotlin/Pair;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "", "onboardings", "", "pageTag", "", "widgetKey", "canShow", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UgcCountersOnboardingViewModel extends BaseOnBoardingViewModel {

    @NotNull
    private final OnBoardingDisplayDisableRepository disableOnBoardingRepository;

    @NotNull
    private final OnBoardingDisplayOnPageRepository displayOnPageRepository;

    @NotNull
    private final OnBoardingDisplayRepository displayRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcCountersOnboardingViewModel(@NotNull OnBoardingDisplayRepository displayRepository, @NotNull OnBoardingDisplayOnPageRepository displayOnPageRepository, @NotNull OnBoardingDisplayDisableRepository disableOnBoardingRepository) {
        super(displayRepository, displayOnPageRepository, disableOnBoardingRepository);
        Intrinsics.checkNotNullParameter(displayRepository, "displayRepository");
        Intrinsics.checkNotNullParameter(displayOnPageRepository, "displayOnPageRepository");
        Intrinsics.checkNotNullParameter(disableOnBoardingRepository, "disableOnBoardingRepository");
        this.displayRepository = displayRepository;
        this.displayOnPageRepository = displayOnPageRepository;
        this.disableOnBoardingRepository = disableOnBoardingRepository;
    }

    public final boolean canShow(@NotNull List<OnBoardingDTO> onboardings, @NotNull String widgetKey) {
        Object obj;
        Intrinsics.checkNotNullParameter(onboardings, "onboardings");
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        Iterator<T> it = onboardings.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            OnBoardingDisplayRepository onBoardingDisplayRepository = this.displayRepository;
            String onboardingKey = ((OnBoardingDTO) obj).getOnboardingKey();
            if (onboardingKey == null) {
                onboardingKey = widgetKey;
            }
            if (onBoardingDisplayRepository.canShow(onboardingKey)) {
                break;
            }
        }
        return obj != null;
    }

    public final Pair<OnBoardingDTO, Integer> getFirstNonShownOnboarding(@NotNull List<Pair<OnBoardingDTO, Integer>> onboardings, @NotNull String pageTag, @NotNull String widgetKey) {
        Object obj;
        Intrinsics.checkNotNullParameter(onboardings, "onboardings");
        Intrinsics.checkNotNullParameter(pageTag, "pageTag");
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        Iterator<T> it = onboardings.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            OnBoardingDTO onBoardingDTO = (OnBoardingDTO) ((Pair) obj).a();
            if (this.disableOnBoardingRepository.canShow() && this.displayOnPageRepository.canShow(pageTag)) {
                OnBoardingDisplayRepository onBoardingDisplayRepository = this.displayRepository;
                String onboardingKey = onBoardingDTO.getOnboardingKey();
                if (onboardingKey == null) {
                    onboardingKey = widgetKey;
                }
                if (onBoardingDisplayRepository.canShow(onboardingKey)) {
                    break;
                }
            }
        }
        return (Pair) obj;
    }
}
