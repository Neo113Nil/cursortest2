package ru.ozon.app.android.regulardraw.onboarding.lottery;

import C.C2702w;
import WZ.l;
import android.content.SharedPreferences;
import androidx.fragment.app.G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.regulardraw.flags.MegaSkipFirstOnboardingEnabled;
import ru.ozon.app.android.regulardraw.onboarding.LotteryOnboardingModel;
import ru.ozon.app.android.regulardraw.onboarding.dialog.MorkovskHintDialog;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialScreenModel;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialSteps;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.presentation.LotteryOnboardingInfoVI;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001.B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010\u0011J\r\u0010#\u001a\u00020\u000f¢\u0006\u0004\b#\u0010\u0011J\r\u0010$\u001a\u00020\u000f¢\u0006\u0004\b$\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R\u0016\u0010*\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010+\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/lottery/LotteryOnboardingManager;", "", "Landroid/content/SharedPreferences;", "sharedPrefs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "", "checkSkipOnboarding", "Lkotlin/Function0;", "Landroidx/fragment/app/G;", "getFragmentManager", "<init>", "(Landroid/content/SharedPreferences;LWZ/l;Lru/ozon/app/android/network/abtool/FeatureChecker;ZLkotlin/jvm/functions/Function0;)V", "", "markFirstPartAsShown", "()V", "Lru/ozon/app/android/regulardraw/onboarding/LotteryOnboardingModel;", "onboardingModel", "isForceShow", "Lkotlin/Function1;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep;", "filterCondition", "startOnboarding", "(Lru/ozon/app/android/regulardraw/onboarding/LotteryOnboardingModel;ZLkotlin/jvm/functions/Function1;)V", "", "key", "getOnboardingPrefsValueByKey", "(Ljava/lang/String;)Z", "putLotteryOnboardingModel", "(Lru/ozon/app/android/regulardraw/onboarding/LotteryOnboardingModel;)V", "showSecondPartIfNeeded", "()Z", "markSecondPartAsShown", "forceShowOnboarding", "disposeLotteryOnboardingModel", "Landroid/content/SharedPreferences;", "LWZ/l;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Z", "Lkotlin/jvm/functions/Function0;", "showFirstPartOnboarding", "showSecondPartOnboarding", "currentLotteryOnboardingModel", "Lru/ozon/app/android/regulardraw/onboarding/LotteryOnboardingModel;", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LotteryOnboardingManager {
    private final boolean checkSkipOnboarding;
    private LotteryOnboardingModel currentLotteryOnboardingModel;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final Function0<G> getFragmentManager;

    @NotNull
    private final SharedPreferences sharedPrefs;
    private boolean showFirstPartOnboarding;
    private boolean showSecondPartOnboarding;
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/lottery/LotteryOnboardingManager$Companion;", "", "<init>", "()V", "FIRST_PART_LOTTERY_ONBOARDING_KEY", "", "SECOND_PART_LOTTERY_ONBOARDING_KEY", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LotteryOnboardingManager(@NotNull SharedPreferences sharedPrefs, l lVar, @NotNull FeatureChecker featureChecker, boolean z11, @NotNull Function0<? extends G> getFragmentManager) {
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(getFragmentManager, "getFragmentManager");
        this.sharedPrefs = sharedPrefs;
        this.tokenizedAnalytics = lVar;
        this.featureChecker = featureChecker;
        this.checkSkipOnboarding = z11;
        this.getFragmentManager = getFragmentManager;
        this.showFirstPartOnboarding = getOnboardingPrefsValueByKey("FIRST_PART_LOTTERY_ONBOARDING_KEY");
        this.showSecondPartOnboarding = getOnboardingPrefsValueByKey("SECOND_PART_LOTTERY_ONBOARDING_KEY");
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

    private final void markFirstPartAsShown() {
        C2702w.e(this.sharedPrefs, "FIRST_PART_LOTTERY_ONBOARDING_KEY", true);
        this.showFirstPartOnboarding = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startOnboarding(LotteryOnboardingModel onboardingModel, boolean isForceShow, Function1<? super LotteryOnboardingInfoVI.OnboardingStep, Boolean> filterCondition) {
        List<LotteryOnboardingInfoVI.OnboardingStep> onboardingItems = onboardingModel.getLotteryOnboardingInfo().getOnboardingItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : onboardingItems) {
            if (filterCondition.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList2.add(new TutorialScreenModel.LotteryOnboardingTutorialScreenModel(onboardingModel.getLotteryOnboardingInfo().getId(), ((LotteryOnboardingInfoVI.OnboardingStep) next).filterFirstPresentationCompletedAction(isForceShow), isForceShow, i11 == 0, i11 == size + (-1), onboardingModel.getHandleComposerAction(), onboardingModel.getSendOnboardingViewedRequest()));
            i11 = i12;
        }
        MorkovskHintDialog.INSTANCE.newInstance(this.getFragmentManager.invoke(), new TutorialSteps.LotteryTutorialSteps(arrayList2), this.tokenizedAnalytics);
    }

    public final void disposeLotteryOnboardingModel() {
        this.currentLotteryOnboardingModel = null;
    }

    public final void forceShowOnboarding() {
        LotteryOnboardingModel lotteryOnboardingModel = this.currentLotteryOnboardingModel;
        if (lotteryOnboardingModel != null) {
            startOnboarding(lotteryOnboardingModel, true, LotteryOnboardingManager$forceShowOnboarding$1$1.INSTANCE);
        }
    }

    public final void markSecondPartAsShown() {
        C2702w.e(this.sharedPrefs, "SECOND_PART_LOTTERY_ONBOARDING_KEY", true);
        this.showSecondPartOnboarding = false;
    }

    public final void putLotteryOnboardingModel(@NotNull LotteryOnboardingModel onboardingModel) {
        Intrinsics.checkNotNullParameter(onboardingModel, "onboardingModel");
        this.currentLotteryOnboardingModel = onboardingModel;
        if (!this.showFirstPartOnboarding || onboardingModel.mustSkipOnboarding()) {
            return;
        }
        startOnboarding(onboardingModel, false, LotteryOnboardingManager$putLotteryOnboardingModel$1.INSTANCE);
        markFirstPartAsShown();
    }

    public final boolean showSecondPartIfNeeded() {
        LotteryOnboardingModel lotteryOnboardingModel = this.currentLotteryOnboardingModel;
        if (lotteryOnboardingModel == null || !this.showSecondPartOnboarding || lotteryOnboardingModel.mustSkipOnboarding()) {
            return false;
        }
        startOnboarding(lotteryOnboardingModel, false, LotteryOnboardingManager$showSecondPartIfNeeded$1$1.INSTANCE);
        return true;
    }
}
