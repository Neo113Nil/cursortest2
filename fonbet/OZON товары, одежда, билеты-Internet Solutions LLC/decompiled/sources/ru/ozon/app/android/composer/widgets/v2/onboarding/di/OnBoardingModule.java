package ru.ozon.app.android.composer.widgets.v2.onboarding.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayOnPageRepository;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingModule;", "", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OnBoardingModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingModule$Companion;", "", "<init>", "()V", "provideDefaultOnBoardingDisplayOnPageRepository", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayOnPageRepository;", "provideEmptyOnBoardingDisplayOnPageRepository", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final OnBoardingDisplayOnPageRepository provideDefaultOnBoardingDisplayOnPageRepository() {
            return OnBoardingDisplayOnPageRepository.Default.INSTANCE;
        }

        @NotNull
        public final OnBoardingDisplayOnPageRepository provideEmptyOnBoardingDisplayOnPageRepository() {
            return OnBoardingDisplayOnPageRepository.Empty.INSTANCE;
        }
    }
}
