package ru.ozon.app.android.regulardraw.onboarding;

import C.C2702w;
import Sc.InterfaceC4008j;
import WZ.l;
import android.content.SharedPreferences;
import androidx.fragment.app.G;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.regulardraw.flags.MegaSkipFirstOnboardingEnabled;
import ru.ozon.app.android.regulardraw.onboarding.dialog.MorkovskHintDialog;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialSteps;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 <2\u00020\u0001:\u0001<B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\u001eJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R\u0016\u0010'\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010(\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010%R)\u00100\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020+0*0)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R!\u00105\u001a\b\u0012\u0004\u0012\u00020+018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u00104R)\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020+0*0)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b7\u0010/R!\u0010;\u001a\b\u0012\u0004\u0012\u00020+018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b:\u00104¨\u0006="}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingManager;", "", "Landroid/content/SharedPreferences;", "sharedPrefs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "", "checkSkipOnboarding", "Lkotlin/Function0;", "Landroidx/fragment/app/G;", "getFragmentManager", "<init>", "(Landroid/content/SharedPreferences;LWZ/l;Lru/ozon/app/android/network/abtool/FeatureChecker;ZLkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps;", "tutorialSteps", "", "startOnboarding", "(Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps;)V", "", "key", "getOnboardingPrefsValueByKey", "(Ljava/lang/String;)Z", "Lru/ozon/app/android/regulardraw/onboarding/BaseOnboardingModel;", "onboardingModel", "putOnboardingModel", "(Lru/ozon/app/android/regulardraw/onboarding/BaseOnboardingModel;)V", "isShown", "markWelcomeOnboardingIsShown", "(Z)V", "markMainDrawMajorScreenOnboardingIsShown", "shouldShowFirstOnboarding", "()Z", "Landroid/content/SharedPreferences;", "LWZ/l;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Z", "Lkotlin/jvm/functions/Function0;", "showFirstOnboarding", "showMainDrawMajorScreenOnboarding", "", "Ljava/lang/Class;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel;", "firstShowOnboardingModels$delegate", "LSc/j;", "getFirstShowOnboardingModels", "()Ljava/util/Set;", "firstShowOnboardingModels", "Lru/ozon/app/android/regulardraw/onboarding/InfoCollector;", "firstShowInfoCollector$delegate", "getFirstShowInfoCollector", "()Lru/ozon/app/android/regulardraw/onboarding/InfoCollector;", "firstShowInfoCollector", "mainDrawMajorScreenOnboardingModels$delegate", "getMainDrawMajorScreenOnboardingModels", "mainDrawMajorScreenOnboardingModels", "mainDrawMajorScreenInfoCollector$delegate", "getMainDrawMajorScreenInfoCollector", "mainDrawMajorScreenInfoCollector", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskOnboardingManager {
    private final boolean checkSkipOnboarding;

    @NotNull
    private final FeatureChecker featureChecker;

    /* renamed from: firstShowInfoCollector$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j firstShowInfoCollector;

    /* renamed from: firstShowOnboardingModels$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j firstShowOnboardingModels;

    @NotNull
    private final Function0<G> getFragmentManager;

    /* renamed from: mainDrawMajorScreenInfoCollector$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mainDrawMajorScreenInfoCollector;

    /* renamed from: mainDrawMajorScreenOnboardingModels$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mainDrawMajorScreenOnboardingModels;

    @NotNull
    private final SharedPreferences sharedPrefs;
    private boolean showFirstOnboarding;
    private boolean showMainDrawMajorScreenOnboarding;
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingManager$Companion;", "", "<init>", "()V", "WELCOME_ONBOARDING_KEY", "", "MAIN_DRAW_MAJOR_SCREEN_ONBOARDING_KEY", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MorkovskOnboardingManager(@NotNull SharedPreferences sharedPrefs, l lVar, @NotNull FeatureChecker featureChecker, boolean z11, @NotNull Function0<? extends G> getFragmentManager) {
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(getFragmentManager, "getFragmentManager");
        this.sharedPrefs = sharedPrefs;
        this.tokenizedAnalytics = lVar;
        this.featureChecker = featureChecker;
        this.checkSkipOnboarding = z11;
        this.getFragmentManager = getFragmentManager;
        this.showFirstOnboarding = getOnboardingPrefsValueByKey("WELCOME_ONBOARDING_KEY");
        this.showMainDrawMajorScreenOnboarding = getOnboardingPrefsValueByKey("MAIN_DRAW_MAJOR_SCREEN_ONBOARDING_KEY");
        this.firstShowOnboardingModels = LazyUtilsKt.unsafeLazy(MorkovskOnboardingManager$firstShowOnboardingModels$2.INSTANCE);
        this.firstShowInfoCollector = LazyUtilsKt.unsafeLazy(new MorkovskOnboardingManager$firstShowInfoCollector$2(this));
        this.mainDrawMajorScreenOnboardingModels = LazyUtilsKt.unsafeLazy(MorkovskOnboardingManager$mainDrawMajorScreenOnboardingModels$2.INSTANCE);
        this.mainDrawMajorScreenInfoCollector = LazyUtilsKt.unsafeLazy(new MorkovskOnboardingManager$mainDrawMajorScreenInfoCollector$2(this));
    }

    private final InfoCollector<OnboardingModel> getFirstShowInfoCollector() {
        return (InfoCollector) this.firstShowInfoCollector.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<Class<? extends OnboardingModel>> getFirstShowOnboardingModels() {
        return (Set) this.firstShowOnboardingModels.getValue();
    }

    private final InfoCollector<OnboardingModel> getMainDrawMajorScreenInfoCollector() {
        return (InfoCollector) this.mainDrawMajorScreenInfoCollector.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<Class<? extends OnboardingModel>> getMainDrawMajorScreenOnboardingModels() {
        return (Set) this.mainDrawMajorScreenOnboardingModels.getValue();
    }

    private final boolean getOnboardingPrefsValueByKey(String key) {
        if (!this.checkSkipOnboarding) {
            return !this.sharedPrefs.getBoolean(key, false);
        }
        boolean isEnabled = this.featureChecker.isEnabled(MegaSkipFirstOnboardingEnabled.INSTANCE);
        Boolean valueOf = Boolean.valueOf(isEnabled);
        if (!isEnabled) {
            valueOf = null;
        }
        return valueOf != null ? !valueOf.booleanValue() : !this.sharedPrefs.getBoolean(key, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startOnboarding(TutorialSteps tutorialSteps) {
        MorkovskHintDialog.INSTANCE.newInstance(this.getFragmentManager.invoke(), tutorialSteps, this.tokenizedAnalytics);
    }

    public final void markMainDrawMajorScreenOnboardingIsShown(boolean isShown) {
        C2702w.e(this.sharedPrefs, "MAIN_DRAW_MAJOR_SCREEN_ONBOARDING_KEY", isShown);
        this.showMainDrawMajorScreenOnboarding = !isShown;
    }

    public final void markWelcomeOnboardingIsShown(boolean isShown) {
        C2702w.e(this.sharedPrefs, "WELCOME_ONBOARDING_KEY", isShown);
        this.showFirstOnboarding = !isShown;
    }

    public final void putOnboardingModel(@NotNull BaseOnboardingModel onboardingModel) {
        Intrinsics.checkNotNullParameter(onboardingModel, "onboardingModel");
        if (this.showFirstOnboarding || this.showMainDrawMajorScreenOnboarding) {
            OnboardingModel onboardingModel2 = onboardingModel instanceof OnboardingModel ? (OnboardingModel) onboardingModel : null;
            if (onboardingModel2 == null) {
                return;
            }
            Class<?> cls = onboardingModel2.getClass();
            if (!this.showFirstOnboarding || getFirstShowOnboardingModels().contains(cls)) {
                if (this.showFirstOnboarding || !this.showMainDrawMajorScreenOnboarding || getMainDrawMajorScreenOnboardingModels().contains(cls)) {
                    if (this.showFirstOnboarding) {
                        getFirstShowInfoCollector().addInfo(onboardingModel2);
                    } else if (this.showMainDrawMajorScreenOnboarding) {
                        getMainDrawMajorScreenInfoCollector().addInfo(onboardingModel2);
                    }
                }
            }
        }
    }

    /* renamed from: shouldShowFirstOnboarding, reason: from getter */
    public final boolean getShowFirstOnboarding() {
        return this.showFirstOnboarding;
    }
}
