package ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.presentation;

import B0.A0;
import Bl.b;
import D3.h;
import G.g;
import K1.G;
import Kk.C3532b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.data.LotteryOnboardingInfoDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001eB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI;", "Ll20/c;", "", "id", "", "mustSkipOnboarding", "", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep;", "onboardingItems", "<init>", "(JZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "getMustSkipOnboarding", "()Z", "Ljava/util/List;", "getOnboardingItems", "()Ljava/util/List;", "OnboardingStep", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LotteryOnboardingInfoVI implements c {
    private final long id;
    private final boolean mustSkipOnboarding;

    @NotNull
    private final List<OnboardingStep> onboardingItems;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001:\u0002./BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013JV\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b\u000b\u0010*R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep;", "", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$StepType;", "stepType", "", "imageUrl", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$CloseButton;", "closeButton", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$FooterContent;", "footerContent", "", "isSkipable", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$StepType;Ljava/lang/String;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$CloseButton;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$FooterContent;ZLWZ/t;)V", "removeFirstPresentationCompletedAction", "filterFirstPresentationCompletedAction", "(Z)Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep;", "copy", "(Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$StepType;Ljava/lang/String;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$CloseButton;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$FooterContent;ZLWZ/t;)Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$StepType;", "getStepType", "()Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$StepType;", "Ljava/lang/String;", "getImageUrl", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$CloseButton;", "getCloseButton", "()Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$CloseButton;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$FooterContent;", "getFooterContent", "()Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$FooterContent;", "Z", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "CloseButton", "FooterContent", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnboardingStep {

        @NotNull
        private final CloseButton closeButton;
        private final FooterContent footerContent;

        @NotNull
        private final String imageUrl;
        private final boolean isSkipable;

        @NotNull
        private final LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.StepType stepType;
        private final t tokenizedEvent;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJD\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$CloseButton;", "", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "defaultAction", "firstPresentationAction", "firstPresentationCompletedAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;LWZ/t;)V", "copy", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;LWZ/t;)Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$CloseButton;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getDefaultAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getFirstPresentationAction", "getFirstPresentationCompletedAction", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CloseButton {

            @NotNull
            private final AtomActionDTO defaultAction;
            private final AtomActionDTO firstPresentationAction;
            private final AtomActionDTO firstPresentationCompletedAction;
            private final t tokenizedEvent;

            public CloseButton(@NotNull AtomActionDTO defaultAction, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, t tVar) {
                Intrinsics.checkNotNullParameter(defaultAction, "defaultAction");
                this.defaultAction = defaultAction;
                this.firstPresentationAction = atomActionDTO;
                this.firstPresentationCompletedAction = atomActionDTO2;
                this.tokenizedEvent = tVar;
            }

            public static /* synthetic */ CloseButton copy$default(CloseButton closeButton, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, AtomActionDTO atomActionDTO3, t tVar, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    atomActionDTO = closeButton.defaultAction;
                }
                if ((i11 & 2) != 0) {
                    atomActionDTO2 = closeButton.firstPresentationAction;
                }
                if ((i11 & 4) != 0) {
                    atomActionDTO3 = closeButton.firstPresentationCompletedAction;
                }
                if ((i11 & 8) != 0) {
                    tVar = closeButton.tokenizedEvent;
                }
                return closeButton.copy(atomActionDTO, atomActionDTO2, atomActionDTO3, tVar);
            }

            @NotNull
            public final CloseButton copy(@NotNull AtomActionDTO defaultAction, AtomActionDTO firstPresentationAction, AtomActionDTO firstPresentationCompletedAction, t tokenizedEvent) {
                Intrinsics.checkNotNullParameter(defaultAction, "defaultAction");
                return new CloseButton(defaultAction, firstPresentationAction, firstPresentationCompletedAction, tokenizedEvent);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CloseButton)) {
                    return false;
                }
                CloseButton closeButton = (CloseButton) other;
                return Intrinsics.d(this.defaultAction, closeButton.defaultAction) && Intrinsics.d(this.firstPresentationAction, closeButton.firstPresentationAction) && Intrinsics.d(this.firstPresentationCompletedAction, closeButton.firstPresentationCompletedAction) && Intrinsics.d(this.tokenizedEvent, closeButton.tokenizedEvent);
            }

            @NotNull
            public final AtomActionDTO getDefaultAction() {
                return this.defaultAction;
            }

            public final AtomActionDTO getFirstPresentationAction() {
                return this.firstPresentationAction;
            }

            public final AtomActionDTO getFirstPresentationCompletedAction() {
                return this.firstPresentationCompletedAction;
            }

            public final t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int hashCode = this.defaultAction.hashCode() * 31;
                AtomActionDTO atomActionDTO = this.firstPresentationAction;
                int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                AtomActionDTO atomActionDTO2 = this.firstPresentationCompletedAction;
                int hashCode3 = (hashCode2 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "CloseButton(defaultAction=" + this.defaultAction + ", firstPresentationAction=" + this.firstPresentationAction + ", firstPresentationCompletedAction=" + this.firstPresentationCompletedAction + ", tokenizedEvent=" + this.tokenizedEvent + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$FooterContent;", "", "TextContent", "FinishButton", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$FooterContent$FinishButton;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$FooterContent$TextContent;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface FooterContent {

            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$FooterContent$FinishButton;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$FooterContent;", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "defaultButton", "firstPresentationButton", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "firstPresentationCompletedAction", "<init>", "(Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "copy", "(Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$FooterContent$FinishButton;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "getDefaultButton", "()Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "getFirstPresentationButton", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getFirstPresentationCompletedAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class FinishButton implements FooterContent {

                @NotNull
                private final MorkovskShadowButtonDTO defaultButton;
                private final MorkovskShadowButtonDTO firstPresentationButton;
                private final AtomActionDTO firstPresentationCompletedAction;

                public FinishButton(@NotNull MorkovskShadowButtonDTO defaultButton, MorkovskShadowButtonDTO morkovskShadowButtonDTO, AtomActionDTO atomActionDTO) {
                    Intrinsics.checkNotNullParameter(defaultButton, "defaultButton");
                    this.defaultButton = defaultButton;
                    this.firstPresentationButton = morkovskShadowButtonDTO;
                    this.firstPresentationCompletedAction = atomActionDTO;
                }

                public static /* synthetic */ FinishButton copy$default(FinishButton finishButton, MorkovskShadowButtonDTO morkovskShadowButtonDTO, MorkovskShadowButtonDTO morkovskShadowButtonDTO2, AtomActionDTO atomActionDTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        morkovskShadowButtonDTO = finishButton.defaultButton;
                    }
                    if ((i11 & 2) != 0) {
                        morkovskShadowButtonDTO2 = finishButton.firstPresentationButton;
                    }
                    if ((i11 & 4) != 0) {
                        atomActionDTO = finishButton.firstPresentationCompletedAction;
                    }
                    return finishButton.copy(morkovskShadowButtonDTO, morkovskShadowButtonDTO2, atomActionDTO);
                }

                @NotNull
                public final FinishButton copy(@NotNull MorkovskShadowButtonDTO defaultButton, MorkovskShadowButtonDTO firstPresentationButton, AtomActionDTO firstPresentationCompletedAction) {
                    Intrinsics.checkNotNullParameter(defaultButton, "defaultButton");
                    return new FinishButton(defaultButton, firstPresentationButton, firstPresentationCompletedAction);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof FinishButton)) {
                        return false;
                    }
                    FinishButton finishButton = (FinishButton) other;
                    return Intrinsics.d(this.defaultButton, finishButton.defaultButton) && Intrinsics.d(this.firstPresentationButton, finishButton.firstPresentationButton) && Intrinsics.d(this.firstPresentationCompletedAction, finishButton.firstPresentationCompletedAction);
                }

                @NotNull
                public final MorkovskShadowButtonDTO getDefaultButton() {
                    return this.defaultButton;
                }

                public final MorkovskShadowButtonDTO getFirstPresentationButton() {
                    return this.firstPresentationButton;
                }

                public final AtomActionDTO getFirstPresentationCompletedAction() {
                    return this.firstPresentationCompletedAction;
                }

                public int hashCode() {
                    int hashCode = this.defaultButton.hashCode() * 31;
                    MorkovskShadowButtonDTO morkovskShadowButtonDTO = this.firstPresentationButton;
                    int hashCode2 = (hashCode + (morkovskShadowButtonDTO == null ? 0 : morkovskShadowButtonDTO.hashCode())) * 31;
                    AtomActionDTO atomActionDTO = this.firstPresentationCompletedAction;
                    return hashCode2 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    MorkovskShadowButtonDTO morkovskShadowButtonDTO = this.defaultButton;
                    MorkovskShadowButtonDTO morkovskShadowButtonDTO2 = this.firstPresentationButton;
                    AtomActionDTO atomActionDTO = this.firstPresentationCompletedAction;
                    StringBuilder sb2 = new StringBuilder("FinishButton(defaultButton=");
                    sb2.append(morkovskShadowButtonDTO);
                    sb2.append(", firstPresentationButton=");
                    sb2.append(morkovskShadowButtonDTO2);
                    sb2.append(", firstPresentationCompletedAction=");
                    return G.c(sb2, atomActionDTO, ")");
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$FooterContent$TextContent;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep$FooterContent;", "", "actionText", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActionText", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class TextContent implements FooterContent {

                @NotNull
                private final String actionText;

                public TextContent(@NotNull String actionText) {
                    Intrinsics.checkNotNullParameter(actionText, "actionText");
                    this.actionText = actionText;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof TextContent) && Intrinsics.d(this.actionText, ((TextContent) other).actionText);
                }

                @NotNull
                public final String getActionText() {
                    return this.actionText;
                }

                public int hashCode() {
                    return this.actionText.hashCode();
                }

                @NotNull
                public String toString() {
                    return A0.b("TextContent(actionText=", this.actionText, ")");
                }
            }
        }

        public OnboardingStep(@NotNull LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.StepType stepType, @NotNull String imageUrl, @NotNull CloseButton closeButton, FooterContent footerContent, boolean z11, t tVar) {
            Intrinsics.checkNotNullParameter(stepType, "stepType");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(closeButton, "closeButton");
            this.stepType = stepType;
            this.imageUrl = imageUrl;
            this.closeButton = closeButton;
            this.footerContent = footerContent;
            this.isSkipable = z11;
            this.tokenizedEvent = tVar;
        }

        public static /* synthetic */ OnboardingStep copy$default(OnboardingStep onboardingStep, LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.StepType stepType, String str, CloseButton closeButton, FooterContent footerContent, boolean z11, t tVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                stepType = onboardingStep.stepType;
            }
            if ((i11 & 2) != 0) {
                str = onboardingStep.imageUrl;
            }
            if ((i11 & 4) != 0) {
                closeButton = onboardingStep.closeButton;
            }
            if ((i11 & 8) != 0) {
                footerContent = onboardingStep.footerContent;
            }
            if ((i11 & 16) != 0) {
                z11 = onboardingStep.isSkipable;
            }
            if ((i11 & 32) != 0) {
                tVar = onboardingStep.tokenizedEvent;
            }
            boolean z12 = z11;
            t tVar2 = tVar;
            return onboardingStep.copy(stepType, str, closeButton, footerContent, z12, tVar2);
        }

        @NotNull
        public final OnboardingStep copy(@NotNull LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.StepType stepType, @NotNull String imageUrl, @NotNull CloseButton closeButton, FooterContent footerContent, boolean isSkipable, t tokenizedEvent) {
            Intrinsics.checkNotNullParameter(stepType, "stepType");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(closeButton, "closeButton");
            return new OnboardingStep(stepType, imageUrl, closeButton, footerContent, isSkipable, tokenizedEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnboardingStep)) {
                return false;
            }
            OnboardingStep onboardingStep = (OnboardingStep) other;
            return this.stepType == onboardingStep.stepType && Intrinsics.d(this.imageUrl, onboardingStep.imageUrl) && Intrinsics.d(this.closeButton, onboardingStep.closeButton) && Intrinsics.d(this.footerContent, onboardingStep.footerContent) && this.isSkipable == onboardingStep.isSkipable && Intrinsics.d(this.tokenizedEvent, onboardingStep.tokenizedEvent);
        }

        @NotNull
        public final OnboardingStep filterFirstPresentationCompletedAction(boolean removeFirstPresentationCompletedAction) {
            if (!removeFirstPresentationCompletedAction) {
                return this;
            }
            CloseButton copy$default = CloseButton.copy$default(this.closeButton, null, null, null, null, 11, null);
            FooterContent footerContent = this.footerContent;
            if (footerContent instanceof FooterContent.FinishButton) {
                footerContent = FooterContent.FinishButton.copy$default((FooterContent.FinishButton) footerContent, null, null, null, 3, null);
            }
            return copy$default(this, null, null, copy$default, footerContent, false, null, 51, null);
        }

        @NotNull
        public final CloseButton getCloseButton() {
            return this.closeButton;
        }

        public final FooterContent getFooterContent() {
            return this.footerContent;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        public final LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.StepType getStepType() {
            return this.stepType;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = (this.closeButton.hashCode() + g.a(this.stepType.hashCode() * 31, 31, this.imageUrl)) * 31;
            FooterContent footerContent = this.footerContent;
            int a11 = C3532b.a((hashCode + (footerContent == null ? 0 : footerContent.hashCode())) * 31, 31, this.isSkipable);
            t tVar = this.tokenizedEvent;
            return a11 + (tVar != null ? tVar.hashCode() : 0);
        }

        /* renamed from: isSkipable, reason: from getter */
        public final boolean getIsSkipable() {
            return this.isSkipable;
        }

        @NotNull
        public String toString() {
            return "OnboardingStep(stepType=" + this.stepType + ", imageUrl=" + this.imageUrl + ", closeButton=" + this.closeButton + ", footerContent=" + this.footerContent + ", isSkipable=" + this.isSkipable + ", tokenizedEvent=" + this.tokenizedEvent + ")";
        }
    }

    public LotteryOnboardingInfoVI(long j11, boolean z11, @NotNull List<OnboardingStep> onboardingItems) {
        Intrinsics.checkNotNullParameter(onboardingItems, "onboardingItems");
        this.id = j11;
        this.mustSkipOnboarding = z11;
        this.onboardingItems = onboardingItems;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LotteryOnboardingInfoVI)) {
            return false;
        }
        LotteryOnboardingInfoVI lotteryOnboardingInfoVI = (LotteryOnboardingInfoVI) other;
        return this.id == lotteryOnboardingInfoVI.id && this.mustSkipOnboarding == lotteryOnboardingInfoVI.mustSkipOnboarding && Intrinsics.d(this.onboardingItems, lotteryOnboardingInfoVI.onboardingItems);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final boolean getMustSkipOnboarding() {
        return this.mustSkipOnboarding;
    }

    @NotNull
    public final List<OnboardingStep> getOnboardingItems() {
        return this.onboardingItems;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.onboardingItems.hashCode() + C3532b.a(Long.hashCode(this.id) * 31, 31, this.mustSkipOnboarding);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.mustSkipOnboarding;
        return h.c(b.c(j11, "LotteryOnboardingInfoVI(id=", ", mustSkipOnboarding=", z11), ", onboardingItems=", this.onboardingItems, ")");
    }
}
