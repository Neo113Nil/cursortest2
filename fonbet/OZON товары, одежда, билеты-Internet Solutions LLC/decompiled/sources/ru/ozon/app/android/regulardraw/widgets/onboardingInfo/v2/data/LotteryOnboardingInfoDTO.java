package ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.data;

import D40.a;
import G.g;
import K1.G;
import Kk.C3532b;
import N3.C3660k;
import Xc.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0018B#\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J%\u0010\u0011\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R$\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO;", "", "onboardingItems", "", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem;", "mustSkipOnboarding", "", "<init>", "(Ljava/util/List;Z)V", "getOnboardingItems$annotations", "()V", "getOnboardingItems", "()Ljava/util/List;", "getMustSkipOnboarding", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "OnboardingItem", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LotteryOnboardingInfoDTO {
    public static final int $stable = 8;
    private final boolean mustSkipOnboarding;
    private final List<OnboardingItem> onboardingItems;

    /* JADX WARN: Multi-variable type inference failed */
    public LotteryOnboardingInfoDTO(@ProtoOneOfSignature(fieldName = "onboardingStep", name = "CONTENT_TYPE_ONBOARDING_STEP", type = OnboardingItem.OnboardingStep.class) @ProtoOneOf(label = "type") List<? extends OnboardingItem> list, boolean z11) {
        this.onboardingItems = list;
        this.mustSkipOnboarding = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LotteryOnboardingInfoDTO copy$default(LotteryOnboardingInfoDTO lotteryOnboardingInfoDTO, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = lotteryOnboardingInfoDTO.onboardingItems;
        }
        if ((i11 & 2) != 0) {
            z11 = lotteryOnboardingInfoDTO.mustSkipOnboarding;
        }
        return lotteryOnboardingInfoDTO.copy(list, z11);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getOnboardingItems$annotations() {
    }

    public final List<OnboardingItem> component1() {
        return this.onboardingItems;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getMustSkipOnboarding() {
        return this.mustSkipOnboarding;
    }

    @NotNull
    public final LotteryOnboardingInfoDTO copy(@ProtoOneOfSignature(fieldName = "onboardingStep", name = "CONTENT_TYPE_ONBOARDING_STEP", type = OnboardingItem.OnboardingStep.class) @ProtoOneOf(label = "type") List<? extends OnboardingItem> onboardingItems, boolean mustSkipOnboarding) {
        return new LotteryOnboardingInfoDTO(onboardingItems, mustSkipOnboarding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LotteryOnboardingInfoDTO)) {
            return false;
        }
        LotteryOnboardingInfoDTO lotteryOnboardingInfoDTO = (LotteryOnboardingInfoDTO) other;
        return Intrinsics.d(this.onboardingItems, lotteryOnboardingInfoDTO.onboardingItems) && this.mustSkipOnboarding == lotteryOnboardingInfoDTO.mustSkipOnboarding;
    }

    public final boolean getMustSkipOnboarding() {
        return this.mustSkipOnboarding;
    }

    public final List<OnboardingItem> getOnboardingItems() {
        return this.onboardingItems;
    }

    public int hashCode() {
        List<OnboardingItem> list = this.onboardingItems;
        return Boolean.hashCode(this.mustSkipOnboarding) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "LotteryOnboardingInfoDTO(onboardingItems=" + this.onboardingItems + ", mustSkipOnboarding=" + this.mustSkipOnboarding + ")";
    }

    public /* synthetic */ LotteryOnboardingInfoDTO(List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? false : z11);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem;", "", "OnboardingStep", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnboardingItem {

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004)*+,BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003JU\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0019R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006-"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem;", "stepType", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$StepType;", "image", "", "closeButton", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$CloseButton;", "footerContent", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$FooterContentWrapper;", "isSkipable", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$StepType;Ljava/lang/String;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$CloseButton;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$FooterContentWrapper;ZLjava/util/Map;)V", "getStepType", "()Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$StepType;", "getImage", "()Ljava/lang/String;", "getCloseButton", "()Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$CloseButton;", "getFooterContent", "()Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$FooterContentWrapper;", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "FooterContentWrapper", "StepType", "CloseButton", "FinishButton", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class OnboardingStep implements OnboardingItem {
            public static final int $stable = 8;

            @NotNull
            private final CloseButton closeButton;
            private final FooterContentWrapper footerContent;

            @NotNull
            private final String image;
            private final boolean isSkipable;

            @NotNull
            private final StepType stepType;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$CloseButton;", "", "defaultAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "firstPresentationAction", "firstPresentationCompletedAction", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getDefaultAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getFirstPresentationAction", "getFirstPresentationCompletedAction", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class CloseButton {
                public static final int $stable = 8;

                @NotNull
                private final AtomActionDTO defaultAction;
                private final AtomActionDTO firstPresentationAction;
                private final AtomActionDTO firstPresentationCompletedAction;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                public CloseButton(@NotNull AtomActionDTO defaultAction, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, Map<String, TokenizedTrackingInfo> map) {
                    Intrinsics.checkNotNullParameter(defaultAction, "defaultAction");
                    this.defaultAction = defaultAction;
                    this.firstPresentationAction = atomActionDTO;
                    this.firstPresentationCompletedAction = atomActionDTO2;
                    this.trackingInfo = map;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ CloseButton copy$default(CloseButton closeButton, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, AtomActionDTO atomActionDTO3, Map map, int i11, Object obj) {
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
                        map = closeButton.trackingInfo;
                    }
                    return closeButton.copy(atomActionDTO, atomActionDTO2, atomActionDTO3, map);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final AtomActionDTO getDefaultAction() {
                    return this.defaultAction;
                }

                /* renamed from: component2, reason: from getter */
                public final AtomActionDTO getFirstPresentationAction() {
                    return this.firstPresentationAction;
                }

                /* renamed from: component3, reason: from getter */
                public final AtomActionDTO getFirstPresentationCompletedAction() {
                    return this.firstPresentationCompletedAction;
                }

                public final Map<String, TokenizedTrackingInfo> component4() {
                    return this.trackingInfo;
                }

                @NotNull
                public final CloseButton copy(@NotNull AtomActionDTO defaultAction, AtomActionDTO firstPresentationAction, AtomActionDTO firstPresentationCompletedAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
                    Intrinsics.checkNotNullParameter(defaultAction, "defaultAction");
                    return new CloseButton(defaultAction, firstPresentationAction, firstPresentationCompletedAction, trackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof CloseButton)) {
                        return false;
                    }
                    CloseButton closeButton = (CloseButton) other;
                    return Intrinsics.d(this.defaultAction, closeButton.defaultAction) && Intrinsics.d(this.firstPresentationAction, closeButton.firstPresentationAction) && Intrinsics.d(this.firstPresentationCompletedAction, closeButton.firstPresentationCompletedAction) && Intrinsics.d(this.trackingInfo, closeButton.trackingInfo);
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

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    int hashCode = this.defaultAction.hashCode() * 31;
                    AtomActionDTO atomActionDTO = this.firstPresentationAction;
                    int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                    AtomActionDTO atomActionDTO2 = this.firstPresentationCompletedAction;
                    int hashCode3 = (hashCode2 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return hashCode3 + (map != null ? map.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    AtomActionDTO atomActionDTO = this.defaultAction;
                    AtomActionDTO atomActionDTO2 = this.firstPresentationAction;
                    AtomActionDTO atomActionDTO3 = this.firstPresentationCompletedAction;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    StringBuilder sb2 = new StringBuilder("CloseButton(defaultAction=");
                    sb2.append(atomActionDTO);
                    sb2.append(", firstPresentationAction=");
                    sb2.append(atomActionDTO2);
                    sb2.append(", firstPresentationCompletedAction=");
                    return a.d(sb2, atomActionDTO3, ", trackingInfo=", map, ")");
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$FinishButton;", "", "defaultButton", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "firstPresentationButton", "firstPresentationCompletedAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getDefaultButton", "()Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "getFirstPresentationButton", "getFirstPresentationCompletedAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class FinishButton {
                public static final int $stable = 8;

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
                /* renamed from: component1, reason: from getter */
                public final MorkovskShadowButtonDTO getDefaultButton() {
                    return this.defaultButton;
                }

                /* renamed from: component2, reason: from getter */
                public final MorkovskShadowButtonDTO getFirstPresentationButton() {
                    return this.firstPresentationButton;
                }

                /* renamed from: component3, reason: from getter */
                public final AtomActionDTO getFirstPresentationCompletedAction() {
                    return this.firstPresentationCompletedAction;
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

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$FooterContentWrapper;", "", "type", "", "actionText", "finishButton", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$FinishButton;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$FinishButton;)V", "getType", "()Ljava/lang/String;", "getActionText", "getFinishButton", "()Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$FinishButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class FooterContentWrapper {
                public static final int $stable = 8;
                private final String actionText;
                private final FinishButton finishButton;

                @NotNull
                private final String type;

                public FooterContentWrapper(@NotNull String type, String str, FinishButton finishButton) {
                    Intrinsics.checkNotNullParameter(type, "type");
                    this.type = type;
                    this.actionText = str;
                    this.finishButton = finishButton;
                }

                public static /* synthetic */ FooterContentWrapper copy$default(FooterContentWrapper footerContentWrapper, String str, String str2, FinishButton finishButton, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = footerContentWrapper.type;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = footerContentWrapper.actionText;
                    }
                    if ((i11 & 4) != 0) {
                        finishButton = footerContentWrapper.finishButton;
                    }
                    return footerContentWrapper.copy(str, str2, finishButton);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getType() {
                    return this.type;
                }

                /* renamed from: component2, reason: from getter */
                public final String getActionText() {
                    return this.actionText;
                }

                /* renamed from: component3, reason: from getter */
                public final FinishButton getFinishButton() {
                    return this.finishButton;
                }

                @NotNull
                public final FooterContentWrapper copy(@NotNull String type, String actionText, FinishButton finishButton) {
                    Intrinsics.checkNotNullParameter(type, "type");
                    return new FooterContentWrapper(type, actionText, finishButton);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof FooterContentWrapper)) {
                        return false;
                    }
                    FooterContentWrapper footerContentWrapper = (FooterContentWrapper) other;
                    return Intrinsics.d(this.type, footerContentWrapper.type) && Intrinsics.d(this.actionText, footerContentWrapper.actionText) && Intrinsics.d(this.finishButton, footerContentWrapper.finishButton);
                }

                public final String getActionText() {
                    return this.actionText;
                }

                public final FinishButton getFinishButton() {
                    return this.finishButton;
                }

                @NotNull
                public final String getType() {
                    return this.type;
                }

                public int hashCode() {
                    int hashCode = this.type.hashCode() * 31;
                    String str = this.actionText;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    FinishButton finishButton = this.finishButton;
                    return hashCode2 + (finishButton != null ? finishButton.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.type;
                    String str2 = this.actionText;
                    FinishButton finishButton = this.finishButton;
                    StringBuilder d11 = C3660k.d("FooterContentWrapper(type=", str, ", actionText=", str2, ", finishButton=");
                    d11.append(finishButton);
                    d11.append(")");
                    return d11.toString();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$StepType;", "", "<init>", "(Ljava/lang/String;I)V", "STEP_TYPE_FIRST", "STEP_TYPE_SECOND", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class StepType {
                private static final /* synthetic */ Xc.a $ENTRIES;
                private static final /* synthetic */ StepType[] $VALUES;
                public static final StepType STEP_TYPE_FIRST = new StepType("STEP_TYPE_FIRST", 0);
                public static final StepType STEP_TYPE_SECOND = new StepType("STEP_TYPE_SECOND", 1);

                private static final /* synthetic */ StepType[] $values() {
                    return new StepType[]{STEP_TYPE_FIRST, STEP_TYPE_SECOND};
                }

                static {
                    StepType[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = b.a($values);
                }

                private StepType(String str, int i11) {
                }

                public static StepType valueOf(String str) {
                    return (StepType) Enum.valueOf(StepType.class, str);
                }

                public static StepType[] values() {
                    return (StepType[]) $VALUES.clone();
                }
            }

            public OnboardingStep(@NotNull StepType stepType, @NotNull String image, @NotNull CloseButton closeButton, FooterContentWrapper footerContentWrapper, boolean z11, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(stepType, "stepType");
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(closeButton, "closeButton");
                this.stepType = stepType;
                this.image = image;
                this.closeButton = closeButton;
                this.footerContent = footerContentWrapper;
                this.isSkipable = z11;
                this.trackingInfo = map;
            }

            public static /* synthetic */ OnboardingStep copy$default(OnboardingStep onboardingStep, StepType stepType, String str, CloseButton closeButton, FooterContentWrapper footerContentWrapper, boolean z11, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    stepType = onboardingStep.stepType;
                }
                if ((i11 & 2) != 0) {
                    str = onboardingStep.image;
                }
                if ((i11 & 4) != 0) {
                    closeButton = onboardingStep.closeButton;
                }
                if ((i11 & 8) != 0) {
                    footerContentWrapper = onboardingStep.footerContent;
                }
                if ((i11 & 16) != 0) {
                    z11 = onboardingStep.isSkipable;
                }
                if ((i11 & 32) != 0) {
                    map = onboardingStep.trackingInfo;
                }
                boolean z12 = z11;
                Map map2 = map;
                return onboardingStep.copy(stepType, str, closeButton, footerContentWrapper, z12, map2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final StepType getStepType() {
                return this.stepType;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final CloseButton getCloseButton() {
                return this.closeButton;
            }

            /* renamed from: component4, reason: from getter */
            public final FooterContentWrapper getFooterContent() {
                return this.footerContent;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsSkipable() {
                return this.isSkipable;
            }

            public final Map<String, TokenizedTrackingInfo> component6() {
                return this.trackingInfo;
            }

            @NotNull
            public final OnboardingStep copy(@NotNull StepType stepType, @NotNull String image, @NotNull CloseButton closeButton, FooterContentWrapper footerContent, boolean isSkipable, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(stepType, "stepType");
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(closeButton, "closeButton");
                return new OnboardingStep(stepType, image, closeButton, footerContent, isSkipable, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnboardingStep)) {
                    return false;
                }
                OnboardingStep onboardingStep = (OnboardingStep) other;
                return this.stepType == onboardingStep.stepType && Intrinsics.d(this.image, onboardingStep.image) && Intrinsics.d(this.closeButton, onboardingStep.closeButton) && Intrinsics.d(this.footerContent, onboardingStep.footerContent) && this.isSkipable == onboardingStep.isSkipable && Intrinsics.d(this.trackingInfo, onboardingStep.trackingInfo);
            }

            @NotNull
            public final CloseButton getCloseButton() {
                return this.closeButton;
            }

            public final FooterContentWrapper getFooterContent() {
                return this.footerContent;
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            @NotNull
            public final StepType getStepType() {
                return this.stepType;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = (this.closeButton.hashCode() + g.a(this.stepType.hashCode() * 31, 31, this.image)) * 31;
                FooterContentWrapper footerContentWrapper = this.footerContent;
                int a11 = C3532b.a((hashCode + (footerContentWrapper == null ? 0 : footerContentWrapper.hashCode())) * 31, 31, this.isSkipable);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return a11 + (map != null ? map.hashCode() : 0);
            }

            public final boolean isSkipable() {
                return this.isSkipable;
            }

            @NotNull
            public String toString() {
                return "OnboardingStep(stepType=" + this.stepType + ", image=" + this.image + ", closeButton=" + this.closeButton + ", footerContent=" + this.footerContent + ", isSkipable=" + this.isSkipable + ", trackingInfo=" + this.trackingInfo + ")";
            }

            public /* synthetic */ OnboardingStep(StepType stepType, String str, CloseButton closeButton, FooterContentWrapper footerContentWrapper, boolean z11, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(stepType, str, closeButton, footerContentWrapper, (i11 & 16) != 0 ? false : z11, map);
            }
        }
    }
}
