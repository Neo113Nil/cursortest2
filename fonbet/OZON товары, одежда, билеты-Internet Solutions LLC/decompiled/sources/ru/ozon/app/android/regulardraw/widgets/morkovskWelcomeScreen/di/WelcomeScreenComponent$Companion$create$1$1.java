package ru.ozon.app.android.regulardraw.widgets.morkovskWelcomeScreen.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.app.android.regulardraw.onboarding.di.MorkovskOnboardingComponentApi;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/di/WelcomeScreenComponent$Companion$create$1$1", "Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/di/WelcomeScreenComponent;", "Lru/ozon/app/android/regulardraw/onboarding/di/MorkovskOnboardingComponentApi;", "morkovskOnboardingComponentApi", "Lru/ozon/app/android/regulardraw/onboarding/di/MorkovskOnboardingComponentApi;", "getMorkovskOnboardingComponentApi", "()Lru/ozon/app/android/regulardraw/onboarding/di/MorkovskOnboardingComponentApi;", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "getComposerComponentApi", "()Lru/ozon/app/android/composer/di/ComposerComponentApi;", "Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator$delegate", "LSc/j;", "getComposerNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "getMorkovskOnboardingDelegate", "()Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "morkovskOnboardingDelegate", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WelcomeScreenComponent$Companion$create$1$1 implements WelcomeScreenComponent {
    private final ComposerComponentApi composerComponentApi;

    /* renamed from: composerNavigator$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j composerNavigator = k.b(new WelcomeScreenComponent$Companion$create$1$1$composerNavigator$2(this));
    private final MorkovskOnboardingComponentApi morkovskOnboardingComponentApi;

    WelcomeScreenComponent$Companion$create$1$1(C7475g c7475g) {
        this.morkovskOnboardingComponentApi = (MorkovskOnboardingComponentApi) c7475g.getComponent(MorkovskOnboardingComponentApi.class);
        this.composerComponentApi = (ComposerComponentApi) c7475g.getComponent(ComposerComponentApi.class);
    }

    public final ComposerComponentApi getComposerComponentApi() {
        return this.composerComponentApi;
    }

    @Override // ru.ozon.app.android.regulardraw.widgets.morkovskWelcomeScreen.di.WelcomeScreenComponent
    public ComposerNavigator getComposerNavigator() {
        return (ComposerNavigator) this.composerNavigator.getValue();
    }

    @Override // ru.ozon.app.android.regulardraw.widgets.morkovskWelcomeScreen.di.WelcomeScreenComponent
    public MorkovskOnboardingDelegate getMorkovskOnboardingDelegate() {
        return this.morkovskOnboardingComponentApi.getMorkovskOnboardingDelegate();
    }
}
