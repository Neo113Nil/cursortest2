package ru.ozon.app.android.ugc.core.widgets.avatarAchievements.di;

import DU.a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.tooltip.TooltipViewModel;
import ru.ozon.app.android.ugc.core.widgets.avatarAchievements.core.AchievementsPrefetcher;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001d2\u00060\u0001j\u0002`\u0002:\u0001\u001dB\u0015\b\u0002\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/di/AvatarAchievementsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onboardingComponentApi$delegate", "LSc/j;", "getOnboardingComponentApi", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onboardingComponentApi", "", "isDarkTheme", "Z", "()Z", "setDarkTheme", "(Z)V", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/core/AchievementsPrefetcher;", "imagePrefetcher$delegate", "getImagePrefetcher", "()Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/core/AchievementsPrefetcher;", "imagePrefetcher", "Lru/ozon/app/android/pdp/ui/configurators/tooltip/TooltipViewModel;", "getOnboardingViewModel", "()Lru/ozon/app/android/pdp/ui/configurators/tooltip/TooltipViewModel;", "onboardingViewModel", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AvatarAchievementsComponent implements InterfaceC6958a {

    /* renamed from: imagePrefetcher$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j imagePrefetcher;
    private boolean isDarkTheme;

    /* renamed from: onboardingComponentApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j onboardingComponentApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/di/AvatarAchievementsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/di/AvatarAchievementsComponent;", "getInstance", "(Lk20/g;)Lk20/e;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AvatarAchievementsComponent getInstance$lambda$0(C7475g c7475g) {
            return new AvatarAchievementsComponent(c7475g, null);
        }

        @NotNull
        public final C7473e<AvatarAchievementsComponent> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(AvatarAchievementsComponent.class), new a(storage, 0));
        }

        private Companion() {
        }
    }

    public /* synthetic */ AvatarAchievementsComponent(C7475g c7475g, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7475g);
    }

    private final OnBoardingComponentApi getOnboardingComponentApi() {
        return (OnBoardingComponentApi) this.onboardingComponentApi.getValue();
    }

    @NotNull
    public final AchievementsPrefetcher getImagePrefetcher() {
        return (AchievementsPrefetcher) this.imagePrefetcher.getValue();
    }

    @NotNull
    public final TooltipViewModel getOnboardingViewModel() {
        return new TooltipViewModel(getOnboardingComponentApi().getDefaultOnBoardingDisplayRepository(), getOnboardingComponentApi().getDefaultOnBoardingDisplayOnPageRepository(), getOnboardingComponentApi().getDefaultOnBoardingDisplayDisableRepository());
    }

    /* renamed from: isDarkTheme, reason: from getter */
    public final boolean getIsDarkTheme() {
        return this.isDarkTheme;
    }

    public final void setDarkTheme(boolean z11) {
        this.isDarkTheme = z11;
    }

    private AvatarAchievementsComponent(C7475g c7475g) {
        this.onboardingComponentApi = k.b(new AvatarAchievementsComponent$onboardingComponentApi$2(c7475g));
        this.imagePrefetcher = k.b(new AvatarAchievementsComponent$imagePrefetcher$2(c7475g));
    }
}
