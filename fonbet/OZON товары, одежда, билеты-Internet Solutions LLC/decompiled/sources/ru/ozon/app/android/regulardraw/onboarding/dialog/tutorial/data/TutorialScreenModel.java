package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data;

import Ak.C2436a;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.onboarding.OnboardingModel;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.presentation.LotteryOnboardingInfoVI;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel;", "", "<init>", "()V", "FirstTutorialScreenModel", "SecondTutorialScreenModel", "ThirdTutorialScreenModel", "FourthTutorialScreenModel", "MainDrawMajorScreenTutorialScreenModel", "LotteryOnboardingTutorialScreenModel", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$FirstTutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$FourthTutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$LotteryOnboardingTutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$MainDrawMajorScreenTutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$SecondTutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$ThirdTutorialScreenModel;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class TutorialScreenModel {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$FirstTutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FirstScreenImageModel;", "firstScreenModel", "<init>", "(Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FirstScreenImageModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FirstScreenImageModel;", "getFirstScreenModel", "()Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FirstScreenImageModel;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FirstTutorialScreenModel extends TutorialScreenModel {

        @NotNull
        private final OnboardingModel.FirstScreenImageModel firstScreenModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FirstTutorialScreenModel(@NotNull OnboardingModel.FirstScreenImageModel firstScreenModel) {
            super(null);
            Intrinsics.checkNotNullParameter(firstScreenModel, "firstScreenModel");
            this.firstScreenModel = firstScreenModel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FirstTutorialScreenModel) && Intrinsics.d(this.firstScreenModel, ((FirstTutorialScreenModel) other).firstScreenModel);
        }

        @NotNull
        public final OnboardingModel.FirstScreenImageModel getFirstScreenModel() {
            return this.firstScreenModel;
        }

        public int hashCode() {
            return this.firstScreenModel.hashCode();
        }

        @NotNull
        public String toString() {
            return "FirstTutorialScreenModel(firstScreenModel=" + this.firstScreenModel + ")";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$FourthTutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel$FirstNavbarItemModel;", "firstNavbarItemModel", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel$SecondNavbarItemModel;", "secondNavbarItemModel", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel$ScreenInfoModel;", "screenInfoModel", "<init>", "(Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel$FirstNavbarItemModel;Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel$SecondNavbarItemModel;Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel$ScreenInfoModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel$FirstNavbarItemModel;", "getFirstNavbarItemModel", "()Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel$FirstNavbarItemModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel$SecondNavbarItemModel;", "getSecondNavbarItemModel", "()Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel$SecondNavbarItemModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel$ScreenInfoModel;", "getScreenInfoModel", "()Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel$ScreenInfoModel;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FourthTutorialScreenModel extends TutorialScreenModel {

        @NotNull
        private final OnboardingModel.FourthNavbarTooltipModel.FirstNavbarItemModel firstNavbarItemModel;

        @NotNull
        private final OnboardingModel.FourthNavbarTooltipModel.ScreenInfoModel screenInfoModel;

        @NotNull
        private final OnboardingModel.FourthNavbarTooltipModel.SecondNavbarItemModel secondNavbarItemModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FourthTutorialScreenModel(@NotNull OnboardingModel.FourthNavbarTooltipModel.FirstNavbarItemModel firstNavbarItemModel, @NotNull OnboardingModel.FourthNavbarTooltipModel.SecondNavbarItemModel secondNavbarItemModel, @NotNull OnboardingModel.FourthNavbarTooltipModel.ScreenInfoModel screenInfoModel) {
            super(null);
            Intrinsics.checkNotNullParameter(firstNavbarItemModel, "firstNavbarItemModel");
            Intrinsics.checkNotNullParameter(secondNavbarItemModel, "secondNavbarItemModel");
            Intrinsics.checkNotNullParameter(screenInfoModel, "screenInfoModel");
            this.firstNavbarItemModel = firstNavbarItemModel;
            this.secondNavbarItemModel = secondNavbarItemModel;
            this.screenInfoModel = screenInfoModel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FourthTutorialScreenModel)) {
                return false;
            }
            FourthTutorialScreenModel fourthTutorialScreenModel = (FourthTutorialScreenModel) other;
            return Intrinsics.d(this.firstNavbarItemModel, fourthTutorialScreenModel.firstNavbarItemModel) && Intrinsics.d(this.secondNavbarItemModel, fourthTutorialScreenModel.secondNavbarItemModel) && Intrinsics.d(this.screenInfoModel, fourthTutorialScreenModel.screenInfoModel);
        }

        @NotNull
        public final OnboardingModel.FourthNavbarTooltipModel.FirstNavbarItemModel getFirstNavbarItemModel() {
            return this.firstNavbarItemModel;
        }

        @NotNull
        public final OnboardingModel.FourthNavbarTooltipModel.ScreenInfoModel getScreenInfoModel() {
            return this.screenInfoModel;
        }

        @NotNull
        public final OnboardingModel.FourthNavbarTooltipModel.SecondNavbarItemModel getSecondNavbarItemModel() {
            return this.secondNavbarItemModel;
        }

        public int hashCode() {
            return this.screenInfoModel.hashCode() + ((this.secondNavbarItemModel.hashCode() + (this.firstNavbarItemModel.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "FourthTutorialScreenModel(firstNavbarItemModel=" + this.firstNavbarItemModel + ", secondNavbarItemModel=" + this.secondNavbarItemModel + ", screenInfoModel=" + this.screenInfoModel + ")";
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b\u0007\u0010#R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b\b\u0010#R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b\t\u0010#R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b'\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$LotteryOnboardingTutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel;", "", "widgetId", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep;", "lotteryOnboardingStep", "", "isForceShow", "isFirstScreen", "isLastScreen", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "handleComposerAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "sendOnboardingViewedRequest", "<init>", "(JLru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getWidgetId", "()J", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep;", "getLotteryOnboardingStep", "()Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep;", "Z", "()Z", "Lkotlin/jvm/functions/Function1;", "getHandleComposerAction", "()Lkotlin/jvm/functions/Function1;", "getSendOnboardingViewedRequest", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LotteryOnboardingTutorialScreenModel extends TutorialScreenModel {

        @NotNull
        private final Function1<AtomAction, Unit> handleComposerAction;
        private final boolean isFirstScreen;
        private final boolean isForceShow;
        private final boolean isLastScreen;

        @NotNull
        private final LotteryOnboardingInfoVI.OnboardingStep lotteryOnboardingStep;

        @NotNull
        private final Function1<AtomActionDTO, Unit> sendOnboardingViewedRequest;
        private final long widgetId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LotteryOnboardingTutorialScreenModel(long j11, @NotNull LotteryOnboardingInfoVI.OnboardingStep lotteryOnboardingStep, boolean z11, boolean z12, boolean z13, @NotNull Function1<? super AtomAction, Unit> handleComposerAction, @NotNull Function1<? super AtomActionDTO, Unit> sendOnboardingViewedRequest) {
            super(null);
            Intrinsics.checkNotNullParameter(lotteryOnboardingStep, "lotteryOnboardingStep");
            Intrinsics.checkNotNullParameter(handleComposerAction, "handleComposerAction");
            Intrinsics.checkNotNullParameter(sendOnboardingViewedRequest, "sendOnboardingViewedRequest");
            this.widgetId = j11;
            this.lotteryOnboardingStep = lotteryOnboardingStep;
            this.isForceShow = z11;
            this.isFirstScreen = z12;
            this.isLastScreen = z13;
            this.handleComposerAction = handleComposerAction;
            this.sendOnboardingViewedRequest = sendOnboardingViewedRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LotteryOnboardingTutorialScreenModel)) {
                return false;
            }
            LotteryOnboardingTutorialScreenModel lotteryOnboardingTutorialScreenModel = (LotteryOnboardingTutorialScreenModel) other;
            return this.widgetId == lotteryOnboardingTutorialScreenModel.widgetId && Intrinsics.d(this.lotteryOnboardingStep, lotteryOnboardingTutorialScreenModel.lotteryOnboardingStep) && this.isForceShow == lotteryOnboardingTutorialScreenModel.isForceShow && this.isFirstScreen == lotteryOnboardingTutorialScreenModel.isFirstScreen && this.isLastScreen == lotteryOnboardingTutorialScreenModel.isLastScreen && Intrinsics.d(this.handleComposerAction, lotteryOnboardingTutorialScreenModel.handleComposerAction) && Intrinsics.d(this.sendOnboardingViewedRequest, lotteryOnboardingTutorialScreenModel.sendOnboardingViewedRequest);
        }

        @NotNull
        public final Function1<AtomAction, Unit> getHandleComposerAction() {
            return this.handleComposerAction;
        }

        @NotNull
        public final LotteryOnboardingInfoVI.OnboardingStep getLotteryOnboardingStep() {
            return this.lotteryOnboardingStep;
        }

        @NotNull
        public final Function1<AtomActionDTO, Unit> getSendOnboardingViewedRequest() {
            return this.sendOnboardingViewedRequest;
        }

        public final long getWidgetId() {
            return this.widgetId;
        }

        public int hashCode() {
            return this.sendOnboardingViewedRequest.hashCode() + ((this.handleComposerAction.hashCode() + C3532b.a(C3532b.a(C3532b.a((this.lotteryOnboardingStep.hashCode() + (Long.hashCode(this.widgetId) * 31)) * 31, 31, this.isForceShow), 31, this.isFirstScreen), 31, this.isLastScreen)) * 31);
        }

        /* renamed from: isFirstScreen, reason: from getter */
        public final boolean getIsFirstScreen() {
            return this.isFirstScreen;
        }

        /* renamed from: isForceShow, reason: from getter */
        public final boolean getIsForceShow() {
            return this.isForceShow;
        }

        /* renamed from: isLastScreen, reason: from getter */
        public final boolean getIsLastScreen() {
            return this.isLastScreen;
        }

        @NotNull
        public String toString() {
            long j11 = this.widgetId;
            LotteryOnboardingInfoVI.OnboardingStep onboardingStep = this.lotteryOnboardingStep;
            boolean z11 = this.isForceShow;
            boolean z12 = this.isFirstScreen;
            boolean z13 = this.isLastScreen;
            Function1<AtomAction, Unit> function1 = this.handleComposerAction;
            Function1<AtomActionDTO, Unit> function12 = this.sendOnboardingViewedRequest;
            StringBuilder sb2 = new StringBuilder("LotteryOnboardingTutorialScreenModel(widgetId=");
            sb2.append(j11);
            sb2.append(", lotteryOnboardingStep=");
            sb2.append(onboardingStep);
            C2436a.e(", isForceShow=", ", isFirstScreen=", sb2, z11, z12);
            sb2.append(", isLastScreen=");
            sb2.append(z13);
            sb2.append(", handleComposerAction=");
            sb2.append(function1);
            sb2.append(", sendOnboardingViewedRequest=");
            sb2.append(function12);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$MainDrawMajorScreenTutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$MainDrawMajorScreenModel;", "mainDrawMajorScreenModel", "<init>", "(Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$MainDrawMajorScreenModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$MainDrawMajorScreenModel;", "getMainDrawMajorScreenModel", "()Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$MainDrawMajorScreenModel;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MainDrawMajorScreenTutorialScreenModel extends TutorialScreenModel {

        @NotNull
        private final OnboardingModel.MainDrawMajorScreenModel mainDrawMajorScreenModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MainDrawMajorScreenTutorialScreenModel(@NotNull OnboardingModel.MainDrawMajorScreenModel mainDrawMajorScreenModel) {
            super(null);
            Intrinsics.checkNotNullParameter(mainDrawMajorScreenModel, "mainDrawMajorScreenModel");
            this.mainDrawMajorScreenModel = mainDrawMajorScreenModel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MainDrawMajorScreenTutorialScreenModel) && Intrinsics.d(this.mainDrawMajorScreenModel, ((MainDrawMajorScreenTutorialScreenModel) other).mainDrawMajorScreenModel);
        }

        @NotNull
        public final OnboardingModel.MainDrawMajorScreenModel getMainDrawMajorScreenModel() {
            return this.mainDrawMajorScreenModel;
        }

        public int hashCode() {
            return this.mainDrawMajorScreenModel.hashCode();
        }

        @NotNull
        public String toString() {
            return "MainDrawMajorScreenTutorialScreenModel(mainDrawMajorScreenModel=" + this.mainDrawMajorScreenModel + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$SecondTutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$SecondBalanceWithToolTipModel$BalanceModel;", "balanceModel", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$SecondBalanceWithToolTipModel$ScreenInfoModel;", "screenInfoModel", "<init>", "(Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$SecondBalanceWithToolTipModel$BalanceModel;Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$SecondBalanceWithToolTipModel$ScreenInfoModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$SecondBalanceWithToolTipModel$BalanceModel;", "getBalanceModel", "()Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$SecondBalanceWithToolTipModel$BalanceModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$SecondBalanceWithToolTipModel$ScreenInfoModel;", "getScreenInfoModel", "()Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$SecondBalanceWithToolTipModel$ScreenInfoModel;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SecondTutorialScreenModel extends TutorialScreenModel {

        @NotNull
        private final OnboardingModel.SecondBalanceWithToolTipModel.BalanceModel balanceModel;

        @NotNull
        private final OnboardingModel.SecondBalanceWithToolTipModel.ScreenInfoModel screenInfoModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SecondTutorialScreenModel(@NotNull OnboardingModel.SecondBalanceWithToolTipModel.BalanceModel balanceModel, @NotNull OnboardingModel.SecondBalanceWithToolTipModel.ScreenInfoModel screenInfoModel) {
            super(null);
            Intrinsics.checkNotNullParameter(balanceModel, "balanceModel");
            Intrinsics.checkNotNullParameter(screenInfoModel, "screenInfoModel");
            this.balanceModel = balanceModel;
            this.screenInfoModel = screenInfoModel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SecondTutorialScreenModel)) {
                return false;
            }
            SecondTutorialScreenModel secondTutorialScreenModel = (SecondTutorialScreenModel) other;
            return Intrinsics.d(this.balanceModel, secondTutorialScreenModel.balanceModel) && Intrinsics.d(this.screenInfoModel, secondTutorialScreenModel.screenInfoModel);
        }

        @NotNull
        public final OnboardingModel.SecondBalanceWithToolTipModel.BalanceModel getBalanceModel() {
            return this.balanceModel;
        }

        @NotNull
        public final OnboardingModel.SecondBalanceWithToolTipModel.ScreenInfoModel getScreenInfoModel() {
            return this.screenInfoModel;
        }

        public int hashCode() {
            return this.screenInfoModel.hashCode() + (this.balanceModel.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "SecondTutorialScreenModel(balanceModel=" + this.balanceModel + ", screenInfoModel=" + this.screenInfoModel + ")";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$ThirdTutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel$PrizeModel;", "prizeModel", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel$ProgressModel;", "progressModel", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel$ScreenInfoModel;", "screenInfoModel", "<init>", "(Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel$PrizeModel;Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel$ProgressModel;Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel$ScreenInfoModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel$PrizeModel;", "getPrizeModel", "()Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel$PrizeModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel$ProgressModel;", "getProgressModel", "()Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel$ProgressModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel$ScreenInfoModel;", "getScreenInfoModel", "()Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel$ScreenInfoModel;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ThirdTutorialScreenModel extends TutorialScreenModel {

        @NotNull
        private final OnboardingModel.ThirdPrizeProgressTooltipModel.PrizeModel prizeModel;

        @NotNull
        private final OnboardingModel.ThirdPrizeProgressTooltipModel.ProgressModel progressModel;

        @NotNull
        private final OnboardingModel.ThirdPrizeProgressTooltipModel.ScreenInfoModel screenInfoModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThirdTutorialScreenModel(@NotNull OnboardingModel.ThirdPrizeProgressTooltipModel.PrizeModel prizeModel, @NotNull OnboardingModel.ThirdPrizeProgressTooltipModel.ProgressModel progressModel, @NotNull OnboardingModel.ThirdPrizeProgressTooltipModel.ScreenInfoModel screenInfoModel) {
            super(null);
            Intrinsics.checkNotNullParameter(prizeModel, "prizeModel");
            Intrinsics.checkNotNullParameter(progressModel, "progressModel");
            Intrinsics.checkNotNullParameter(screenInfoModel, "screenInfoModel");
            this.prizeModel = prizeModel;
            this.progressModel = progressModel;
            this.screenInfoModel = screenInfoModel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ThirdTutorialScreenModel)) {
                return false;
            }
            ThirdTutorialScreenModel thirdTutorialScreenModel = (ThirdTutorialScreenModel) other;
            return Intrinsics.d(this.prizeModel, thirdTutorialScreenModel.prizeModel) && Intrinsics.d(this.progressModel, thirdTutorialScreenModel.progressModel) && Intrinsics.d(this.screenInfoModel, thirdTutorialScreenModel.screenInfoModel);
        }

        @NotNull
        public final OnboardingModel.ThirdPrizeProgressTooltipModel.PrizeModel getPrizeModel() {
            return this.prizeModel;
        }

        @NotNull
        public final OnboardingModel.ThirdPrizeProgressTooltipModel.ProgressModel getProgressModel() {
            return this.progressModel;
        }

        @NotNull
        public final OnboardingModel.ThirdPrizeProgressTooltipModel.ScreenInfoModel getScreenInfoModel() {
            return this.screenInfoModel;
        }

        public int hashCode() {
            return this.screenInfoModel.hashCode() + ((this.progressModel.hashCode() + (this.prizeModel.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "ThirdTutorialScreenModel(prizeModel=" + this.prizeModel + ", progressModel=" + this.progressModel + ", screenInfoModel=" + this.screenInfoModel + ")";
        }
    }

    public /* synthetic */ TutorialScreenModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TutorialScreenModel() {
    }
}
