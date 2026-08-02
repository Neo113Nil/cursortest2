package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data;

import H3.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.onboarding.OnboardingModel;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialScreenModel;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00042\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps;", "", "<init>", "()V", "Companion", "WelcomeTutorialSteps", "MainDrawMajorScreenTutorialSteps", "LotteryTutorialSteps", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps$LotteryTutorialSteps;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps$MainDrawMajorScreenTutorialSteps;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps$WelcomeTutorialSteps;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class TutorialSteps {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u001a\u0010\u0006\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u0007J$\u0010\n\u001a\u0004\u0018\u00010\u00052\u001a\u0010\u0006\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u0007¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps$Companion;", "", "<init>", "()V", "buildWelcomeTutorialStepsFromModels", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps;", "modelMap", "", "Ljava/lang/Class;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel;", "buildMainDrawMajorScreenTutorialStepsFromModels", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TutorialSteps buildMainDrawMajorScreenTutorialStepsFromModels(@NotNull Map<Class<? extends OnboardingModel>, ? extends OnboardingModel> modelMap) {
            Intrinsics.checkNotNullParameter(modelMap, "modelMap");
            OnboardingModel onboardingModel = modelMap.get(OnboardingModel.MainDrawMajorScreenModel.class);
            OnboardingModel.MainDrawMajorScreenModel mainDrawMajorScreenModel = onboardingModel instanceof OnboardingModel.MainDrawMajorScreenModel ? (OnboardingModel.MainDrawMajorScreenModel) onboardingModel : null;
            if (mainDrawMajorScreenModel == null) {
                return null;
            }
            return new MainDrawMajorScreenTutorialSteps(new TutorialScreenModel.MainDrawMajorScreenTutorialScreenModel(mainDrawMajorScreenModel));
        }

        public final TutorialSteps buildWelcomeTutorialStepsFromModels(@NotNull Map<Class<? extends OnboardingModel>, ? extends OnboardingModel> modelMap) {
            Intrinsics.checkNotNullParameter(modelMap, "modelMap");
            OnboardingModel onboardingModel = modelMap.get(OnboardingModel.FirstScreenImageModel.class);
            OnboardingModel.FirstScreenImageModel firstScreenImageModel = onboardingModel instanceof OnboardingModel.FirstScreenImageModel ? (OnboardingModel.FirstScreenImageModel) onboardingModel : null;
            if (firstScreenImageModel == null) {
                return null;
            }
            TutorialScreenModel.FirstTutorialScreenModel firstTutorialScreenModel = new TutorialScreenModel.FirstTutorialScreenModel(firstScreenImageModel);
            OnboardingModel onboardingModel2 = modelMap.get(OnboardingModel.SecondBalanceWithToolTipModel.BalanceModel.class);
            OnboardingModel.SecondBalanceWithToolTipModel.BalanceModel balanceModel = onboardingModel2 instanceof OnboardingModel.SecondBalanceWithToolTipModel.BalanceModel ? (OnboardingModel.SecondBalanceWithToolTipModel.BalanceModel) onboardingModel2 : null;
            if (balanceModel == null) {
                return null;
            }
            OnboardingModel onboardingModel3 = modelMap.get(OnboardingModel.SecondBalanceWithToolTipModel.ScreenInfoModel.class);
            OnboardingModel.SecondBalanceWithToolTipModel.ScreenInfoModel screenInfoModel = onboardingModel3 instanceof OnboardingModel.SecondBalanceWithToolTipModel.ScreenInfoModel ? (OnboardingModel.SecondBalanceWithToolTipModel.ScreenInfoModel) onboardingModel3 : null;
            if (screenInfoModel == null) {
                return null;
            }
            TutorialScreenModel.SecondTutorialScreenModel secondTutorialScreenModel = new TutorialScreenModel.SecondTutorialScreenModel(balanceModel, screenInfoModel);
            OnboardingModel onboardingModel4 = modelMap.get(OnboardingModel.ThirdPrizeProgressTooltipModel.PrizeModel.class);
            OnboardingModel.ThirdPrizeProgressTooltipModel.PrizeModel prizeModel = onboardingModel4 instanceof OnboardingModel.ThirdPrizeProgressTooltipModel.PrizeModel ? (OnboardingModel.ThirdPrizeProgressTooltipModel.PrizeModel) onboardingModel4 : null;
            if (prizeModel == null) {
                return null;
            }
            OnboardingModel onboardingModel5 = modelMap.get(OnboardingModel.ThirdPrizeProgressTooltipModel.ProgressModel.class);
            OnboardingModel.ThirdPrizeProgressTooltipModel.ProgressModel progressModel = onboardingModel5 instanceof OnboardingModel.ThirdPrizeProgressTooltipModel.ProgressModel ? (OnboardingModel.ThirdPrizeProgressTooltipModel.ProgressModel) onboardingModel5 : null;
            if (progressModel == null) {
                return null;
            }
            OnboardingModel onboardingModel6 = modelMap.get(OnboardingModel.ThirdPrizeProgressTooltipModel.ScreenInfoModel.class);
            OnboardingModel.ThirdPrizeProgressTooltipModel.ScreenInfoModel screenInfoModel2 = onboardingModel6 instanceof OnboardingModel.ThirdPrizeProgressTooltipModel.ScreenInfoModel ? (OnboardingModel.ThirdPrizeProgressTooltipModel.ScreenInfoModel) onboardingModel6 : null;
            if (screenInfoModel2 == null) {
                return null;
            }
            TutorialScreenModel.ThirdTutorialScreenModel thirdTutorialScreenModel = new TutorialScreenModel.ThirdTutorialScreenModel(prizeModel, progressModel, screenInfoModel2);
            OnboardingModel onboardingModel7 = modelMap.get(OnboardingModel.FourthNavbarTooltipModel.FirstNavbarItemModel.class);
            OnboardingModel.FourthNavbarTooltipModel.FirstNavbarItemModel firstNavbarItemModel = onboardingModel7 instanceof OnboardingModel.FourthNavbarTooltipModel.FirstNavbarItemModel ? (OnboardingModel.FourthNavbarTooltipModel.FirstNavbarItemModel) onboardingModel7 : null;
            if (firstNavbarItemModel == null) {
                return null;
            }
            OnboardingModel onboardingModel8 = modelMap.get(OnboardingModel.FourthNavbarTooltipModel.SecondNavbarItemModel.class);
            OnboardingModel.FourthNavbarTooltipModel.SecondNavbarItemModel secondNavbarItemModel = onboardingModel8 instanceof OnboardingModel.FourthNavbarTooltipModel.SecondNavbarItemModel ? (OnboardingModel.FourthNavbarTooltipModel.SecondNavbarItemModel) onboardingModel8 : null;
            if (secondNavbarItemModel == null) {
                return null;
            }
            OnboardingModel onboardingModel9 = modelMap.get(OnboardingModel.FourthNavbarTooltipModel.ScreenInfoModel.class);
            OnboardingModel.FourthNavbarTooltipModel.ScreenInfoModel screenInfoModel3 = onboardingModel9 instanceof OnboardingModel.FourthNavbarTooltipModel.ScreenInfoModel ? (OnboardingModel.FourthNavbarTooltipModel.ScreenInfoModel) onboardingModel9 : null;
            if (screenInfoModel3 == null) {
                return null;
            }
            TutorialScreenModel.FourthTutorialScreenModel fourthTutorialScreenModel = new TutorialScreenModel.FourthTutorialScreenModel(firstNavbarItemModel, secondNavbarItemModel, screenInfoModel3);
            OnboardingModel onboardingModel10 = modelMap.get(OnboardingModel.MainDrawMajorScreenModel.class);
            OnboardingModel.MainDrawMajorScreenModel mainDrawMajorScreenModel = onboardingModel10 instanceof OnboardingModel.MainDrawMajorScreenModel ? (OnboardingModel.MainDrawMajorScreenModel) onboardingModel10 : null;
            if (mainDrawMajorScreenModel == null) {
                return null;
            }
            return new WelcomeTutorialSteps(firstTutorialScreenModel, secondTutorialScreenModel, thirdTutorialScreenModel, fourthTutorialScreenModel, new TutorialScreenModel.MainDrawMajorScreenTutorialScreenModel(mainDrawMajorScreenModel));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps$LotteryTutorialSteps;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps;", "", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$LotteryOnboardingTutorialScreenModel;", "lotteryScreenModels", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getLotteryScreenModels", "()Ljava/util/List;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LotteryTutorialSteps extends TutorialSteps {

        @NotNull
        private final List<TutorialScreenModel.LotteryOnboardingTutorialScreenModel> lotteryScreenModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LotteryTutorialSteps(@NotNull List<TutorialScreenModel.LotteryOnboardingTutorialScreenModel> lotteryScreenModels) {
            super(null);
            Intrinsics.checkNotNullParameter(lotteryScreenModels, "lotteryScreenModels");
            this.lotteryScreenModels = lotteryScreenModels;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LotteryTutorialSteps) && Intrinsics.d(this.lotteryScreenModels, ((LotteryTutorialSteps) other).lotteryScreenModels);
        }

        @NotNull
        public final List<TutorialScreenModel.LotteryOnboardingTutorialScreenModel> getLotteryScreenModels() {
            return this.lotteryScreenModels;
        }

        public int hashCode() {
            return this.lotteryScreenModels.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("LotteryTutorialSteps(lotteryScreenModels=", ")", this.lotteryScreenModels);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps$MainDrawMajorScreenTutorialSteps;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$MainDrawMajorScreenTutorialScreenModel;", "mainDrawMajorScreenTutorialScreenModel", "<init>", "(Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$MainDrawMajorScreenTutorialScreenModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$MainDrawMajorScreenTutorialScreenModel;", "getMainDrawMajorScreenTutorialScreenModel", "()Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$MainDrawMajorScreenTutorialScreenModel;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MainDrawMajorScreenTutorialSteps extends TutorialSteps {

        @NotNull
        private final TutorialScreenModel.MainDrawMajorScreenTutorialScreenModel mainDrawMajorScreenTutorialScreenModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MainDrawMajorScreenTutorialSteps(@NotNull TutorialScreenModel.MainDrawMajorScreenTutorialScreenModel mainDrawMajorScreenTutorialScreenModel) {
            super(null);
            Intrinsics.checkNotNullParameter(mainDrawMajorScreenTutorialScreenModel, "mainDrawMajorScreenTutorialScreenModel");
            this.mainDrawMajorScreenTutorialScreenModel = mainDrawMajorScreenTutorialScreenModel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MainDrawMajorScreenTutorialSteps) && Intrinsics.d(this.mainDrawMajorScreenTutorialScreenModel, ((MainDrawMajorScreenTutorialSteps) other).mainDrawMajorScreenTutorialScreenModel);
        }

        @NotNull
        public final TutorialScreenModel.MainDrawMajorScreenTutorialScreenModel getMainDrawMajorScreenTutorialScreenModel() {
            return this.mainDrawMajorScreenTutorialScreenModel;
        }

        public int hashCode() {
            return this.mainDrawMajorScreenTutorialScreenModel.hashCode();
        }

        @NotNull
        public String toString() {
            return "MainDrawMajorScreenTutorialSteps(mainDrawMajorScreenTutorialScreenModel=" + this.mainDrawMajorScreenTutorialScreenModel + ")";
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps$WelcomeTutorialSteps;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$FirstTutorialScreenModel;", "firstTutorialScreenModel", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$SecondTutorialScreenModel;", "secondTutorialScreenModel", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$ThirdTutorialScreenModel;", "thirdTutorialScreenModel", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$FourthTutorialScreenModel;", "fourthTutorialScreenModel", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$MainDrawMajorScreenTutorialScreenModel;", "mainDrawMajorScreenTutorialScreenModel", "<init>", "(Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$FirstTutorialScreenModel;Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$SecondTutorialScreenModel;Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$ThirdTutorialScreenModel;Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$FourthTutorialScreenModel;Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$MainDrawMajorScreenTutorialScreenModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$FirstTutorialScreenModel;", "getFirstTutorialScreenModel", "()Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$FirstTutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$SecondTutorialScreenModel;", "getSecondTutorialScreenModel", "()Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$SecondTutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$ThirdTutorialScreenModel;", "getThirdTutorialScreenModel", "()Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$ThirdTutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$FourthTutorialScreenModel;", "getFourthTutorialScreenModel", "()Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$FourthTutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$MainDrawMajorScreenTutorialScreenModel;", "getMainDrawMajorScreenTutorialScreenModel", "()Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$MainDrawMajorScreenTutorialScreenModel;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WelcomeTutorialSteps extends TutorialSteps {

        @NotNull
        private final TutorialScreenModel.FirstTutorialScreenModel firstTutorialScreenModel;

        @NotNull
        private final TutorialScreenModel.FourthTutorialScreenModel fourthTutorialScreenModel;

        @NotNull
        private final TutorialScreenModel.MainDrawMajorScreenTutorialScreenModel mainDrawMajorScreenTutorialScreenModel;

        @NotNull
        private final TutorialScreenModel.SecondTutorialScreenModel secondTutorialScreenModel;

        @NotNull
        private final TutorialScreenModel.ThirdTutorialScreenModel thirdTutorialScreenModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WelcomeTutorialSteps(@NotNull TutorialScreenModel.FirstTutorialScreenModel firstTutorialScreenModel, @NotNull TutorialScreenModel.SecondTutorialScreenModel secondTutorialScreenModel, @NotNull TutorialScreenModel.ThirdTutorialScreenModel thirdTutorialScreenModel, @NotNull TutorialScreenModel.FourthTutorialScreenModel fourthTutorialScreenModel, @NotNull TutorialScreenModel.MainDrawMajorScreenTutorialScreenModel mainDrawMajorScreenTutorialScreenModel) {
            super(null);
            Intrinsics.checkNotNullParameter(firstTutorialScreenModel, "firstTutorialScreenModel");
            Intrinsics.checkNotNullParameter(secondTutorialScreenModel, "secondTutorialScreenModel");
            Intrinsics.checkNotNullParameter(thirdTutorialScreenModel, "thirdTutorialScreenModel");
            Intrinsics.checkNotNullParameter(fourthTutorialScreenModel, "fourthTutorialScreenModel");
            Intrinsics.checkNotNullParameter(mainDrawMajorScreenTutorialScreenModel, "mainDrawMajorScreenTutorialScreenModel");
            this.firstTutorialScreenModel = firstTutorialScreenModel;
            this.secondTutorialScreenModel = secondTutorialScreenModel;
            this.thirdTutorialScreenModel = thirdTutorialScreenModel;
            this.fourthTutorialScreenModel = fourthTutorialScreenModel;
            this.mainDrawMajorScreenTutorialScreenModel = mainDrawMajorScreenTutorialScreenModel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WelcomeTutorialSteps)) {
                return false;
            }
            WelcomeTutorialSteps welcomeTutorialSteps = (WelcomeTutorialSteps) other;
            return Intrinsics.d(this.firstTutorialScreenModel, welcomeTutorialSteps.firstTutorialScreenModel) && Intrinsics.d(this.secondTutorialScreenModel, welcomeTutorialSteps.secondTutorialScreenModel) && Intrinsics.d(this.thirdTutorialScreenModel, welcomeTutorialSteps.thirdTutorialScreenModel) && Intrinsics.d(this.fourthTutorialScreenModel, welcomeTutorialSteps.fourthTutorialScreenModel) && Intrinsics.d(this.mainDrawMajorScreenTutorialScreenModel, welcomeTutorialSteps.mainDrawMajorScreenTutorialScreenModel);
        }

        @NotNull
        public final TutorialScreenModel.FirstTutorialScreenModel getFirstTutorialScreenModel() {
            return this.firstTutorialScreenModel;
        }

        @NotNull
        public final TutorialScreenModel.FourthTutorialScreenModel getFourthTutorialScreenModel() {
            return this.fourthTutorialScreenModel;
        }

        @NotNull
        public final TutorialScreenModel.MainDrawMajorScreenTutorialScreenModel getMainDrawMajorScreenTutorialScreenModel() {
            return this.mainDrawMajorScreenTutorialScreenModel;
        }

        @NotNull
        public final TutorialScreenModel.SecondTutorialScreenModel getSecondTutorialScreenModel() {
            return this.secondTutorialScreenModel;
        }

        @NotNull
        public final TutorialScreenModel.ThirdTutorialScreenModel getThirdTutorialScreenModel() {
            return this.thirdTutorialScreenModel;
        }

        public int hashCode() {
            return this.mainDrawMajorScreenTutorialScreenModel.hashCode() + ((this.fourthTutorialScreenModel.hashCode() + ((this.thirdTutorialScreenModel.hashCode() + ((this.secondTutorialScreenModel.hashCode() + (this.firstTutorialScreenModel.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "WelcomeTutorialSteps(firstTutorialScreenModel=" + this.firstTutorialScreenModel + ", secondTutorialScreenModel=" + this.secondTutorialScreenModel + ", thirdTutorialScreenModel=" + this.thirdTutorialScreenModel + ", fourthTutorialScreenModel=" + this.fourthTutorialScreenModel + ", mainDrawMajorScreenTutorialScreenModel=" + this.mainDrawMajorScreenTutorialScreenModel + ")";
        }
    }

    public /* synthetic */ TutorialSteps(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TutorialSteps() {
    }
}
