package ru.ozon.app.android.regulardraw.onboarding;

import androidx.fragment.app.G;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "morkovskOnboardingDelegate", "<init>", "(Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;)V", "Landroidx/lifecycle/J;", "owner", "", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MorkovskOnboardingConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final MorkovskOnboardingDelegate morkovskOnboardingDelegate;

    public MorkovskOnboardingConfigurator(@NotNull MorkovskOnboardingDelegate morkovskOnboardingDelegate) {
        Intrinsics.checkNotNullParameter(morkovskOnboardingDelegate, "morkovskOnboardingDelegate");
        this.morkovskOnboardingDelegate = morkovskOnboardingDelegate;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        MorkovskOnboardingDelegate morkovskOnboardingDelegate = this.morkovskOnboardingDelegate;
        G supportFragmentManager = getContainer().i().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        ConfiguratorReferences references = getReferences();
        morkovskOnboardingDelegate.init(supportFragmentManager, references != null ? references.getTokenizedAnalytics() : null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        this.morkovskOnboardingDelegate.clear();
    }
}
