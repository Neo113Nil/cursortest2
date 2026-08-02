package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial;

import Sc.o;
import WZ.l;
import android.widget.FrameLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialScreenModel;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialSteps;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialStepsKt;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.FirstGreetingScreen;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.FourthEndScreen;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.LotteryOnboardingScreen;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.SecondBalanceScreen;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.StandaloneMainDrawMajorScreenScreen;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.ThirdProgressScreen;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR(\u0010\t\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/TutorialScreensNavigator;", "", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps;", "tutorialSteps", "LWZ/l;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onFinish", "<init>", "(Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps;LWZ/l;Lkotlin/jvm/functions/Function1;)V", "", "forceDismiss", "onDismiss", "nextScreenOrFinish", "(ZLkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel;", "model", "openScreenByModel", "(Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel;)V", "Landroid/widget/FrameLayout;", "root", "attach", "(Landroid/widget/FrameLayout;)V", "detach", "()V", "LWZ/l;", "Lkotlin/jvm/functions/Function1;", "rootContainer", "Landroid/widget/FrameLayout;", "Lkotlin/sequences/Sequence;", "tutorialSequence", "Lkotlin/sequences/Sequence;", "", "tutorialIterator", "Ljava/util/Iterator;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TutorialScreensNavigator {

    @NotNull
    private final Function1<Function0<Unit>, Unit> onFinish;
    private FrameLayout rootContainer;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final Iterator<TutorialScreenModel> tutorialIterator;

    @NotNull
    private final Sequence<TutorialScreenModel> tutorialSequence;

    /* JADX WARN: Multi-variable type inference failed */
    public TutorialScreensNavigator(@NotNull TutorialSteps tutorialSteps, @NotNull l tokenizedAnalytics, @NotNull Function1<? super Function0<Unit>, Unit> onFinish) {
        Intrinsics.checkNotNullParameter(tutorialSteps, "tutorialSteps");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onFinish = onFinish;
        Sequence<TutorialScreenModel> screensSequence = TutorialStepsKt.getScreensSequence(tutorialSteps);
        this.tutorialSequence = screensSequence;
        this.tutorialIterator = screensSequence.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nextScreenOrFinish(boolean forceDismiss, Function0<Unit> onDismiss) {
        if (forceDismiss) {
            this.onFinish.invoke(onDismiss);
        } else if (this.tutorialIterator.hasNext()) {
            openScreenByModel(this.tutorialIterator.next());
        } else {
            this.onFinish.invoke(onDismiss);
        }
    }

    private final void openScreenByModel(TutorialScreenModel model) {
        FrameLayout frameLayout = this.rootContainer;
        if (frameLayout != null) {
            if (model instanceof TutorialScreenModel.FirstTutorialScreenModel) {
                new FirstGreetingScreen().show(frameLayout, (TutorialScreenModel.FirstTutorialScreenModel) model, this.tokenizedAnalytics, new TutorialScreensNavigator$openScreenByModel$1$1(this));
                return;
            }
            if (model instanceof TutorialScreenModel.SecondTutorialScreenModel) {
                new SecondBalanceScreen().show(frameLayout, (TutorialScreenModel.SecondTutorialScreenModel) model, this.tokenizedAnalytics, new TutorialScreensNavigator$openScreenByModel$1$2(this));
                return;
            }
            if (model instanceof TutorialScreenModel.ThirdTutorialScreenModel) {
                new ThirdProgressScreen().show(frameLayout, (TutorialScreenModel.ThirdTutorialScreenModel) model, this.tokenizedAnalytics, new TutorialScreensNavigator$openScreenByModel$1$3(this));
                return;
            }
            if (model instanceof TutorialScreenModel.FourthTutorialScreenModel) {
                new FourthEndScreen().show(frameLayout, (TutorialScreenModel.FourthTutorialScreenModel) model, this.tokenizedAnalytics, new TutorialScreensNavigator$openScreenByModel$1$4(this));
            } else if (model instanceof TutorialScreenModel.MainDrawMajorScreenTutorialScreenModel) {
                new StandaloneMainDrawMajorScreenScreen().show(frameLayout, (TutorialScreenModel.MainDrawMajorScreenTutorialScreenModel) model, this.tokenizedAnalytics, new TutorialScreensNavigator$openScreenByModel$1$5(this));
            } else {
                if (!(model instanceof TutorialScreenModel.LotteryOnboardingTutorialScreenModel)) {
                    throw new o();
                }
                new LotteryOnboardingScreen().show(frameLayout, (TutorialScreenModel.LotteryOnboardingTutorialScreenModel) model, this.tokenizedAnalytics, new TutorialScreensNavigator$openScreenByModel$1$6(this));
            }
        }
    }

    public final void attach(@NotNull FrameLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.rootContainer = root;
        nextScreenOrFinish(false, null);
    }

    public final void detach() {
        this.rootContainer = null;
    }
}
