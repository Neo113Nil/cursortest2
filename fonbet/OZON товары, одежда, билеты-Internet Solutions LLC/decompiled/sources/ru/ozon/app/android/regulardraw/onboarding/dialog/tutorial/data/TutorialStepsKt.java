package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data;

import Sc.o;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialScreenModel;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialSteps;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"getScreensSequence", "Lkotlin/sequences/Sequence;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TutorialStepsKt {
    @NotNull
    public static final Sequence<TutorialScreenModel> getScreensSequence(@NotNull TutorialSteps tutorialSteps) {
        Intrinsics.checkNotNullParameter(tutorialSteps, "<this>");
        if (tutorialSteps instanceof TutorialSteps.WelcomeTutorialSteps) {
            TutorialSteps.WelcomeTutorialSteps welcomeTutorialSteps = (TutorialSteps.WelcomeTutorialSteps) tutorialSteps;
            TutorialScreenModel[] elements = {welcomeTutorialSteps.getFirstTutorialScreenModel(), welcomeTutorialSteps.getSecondTutorialScreenModel(), welcomeTutorialSteps.getThirdTutorialScreenModel(), welcomeTutorialSteps.getFourthTutorialScreenModel(), welcomeTutorialSteps.getMainDrawMajorScreenTutorialScreenModel()};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return C7705l.g(elements);
        }
        if (tutorialSteps instanceof TutorialSteps.MainDrawMajorScreenTutorialSteps) {
            TutorialScreenModel.MainDrawMajorScreenTutorialScreenModel[] elements2 = {((TutorialSteps.MainDrawMajorScreenTutorialSteps) tutorialSteps).getMainDrawMajorScreenTutorialScreenModel()};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            return C7705l.g(elements2);
        }
        if (tutorialSteps instanceof TutorialSteps.LotteryTutorialSteps) {
            return C7714v.w(((TutorialSteps.LotteryTutorialSteps) tutorialSteps).getLotteryScreenModels());
        }
        throw new o();
    }
}
