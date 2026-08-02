package ru.ozon.app.android.search.widgets.history.search.data;

import Ef0.c;
import Ep.a;
import G.g;
import GR.b;
import K1.G;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002&'B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JI\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "historyItems", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "deleteButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "presentationSettings", "Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO$PresentationSettings;", "onboarding", "Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO$Onboarding;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO$PresentationSettings;Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO$Onboarding;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getHistoryItems", "()Ljava/util/List;", "getDeleteButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getPresentationSettings", "()Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO$PresentationSettings;", "getOnboarding", "()Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO$Onboarding;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PresentationSettings", "Onboarding", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HistoryDTO {
    public static final int $stable = 8;
    private final ButtonV3DTO deleteButton;

    @NotNull
    private final List<AtomDTO> historyItems;
    private final Onboarding onboarding;
    private final PresentationSettings presentationSettings;
    private final TextDTO title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO$Onboarding;", "", "tooltip", "Lru/ozon/uni/atoms/data/common/TooltipDTO;", "onboardingId", "", "onboardingDelay", "", "<init>", "(Lru/ozon/uni/atoms/data/common/TooltipDTO;Ljava/lang/String;Ljava/lang/Integer;)V", "getTooltip", "()Lru/ozon/uni/atoms/data/common/TooltipDTO;", "getOnboardingId", "()Ljava/lang/String;", "getOnboardingDelay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/common/TooltipDTO;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO$Onboarding;", "equals", "", "other", "hashCode", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Onboarding {
        public static final int $stable = TooltipDTO.$stable;
        private final Integer onboardingDelay;

        @NotNull
        private final String onboardingId;

        @NotNull
        private final TooltipDTO tooltip;

        public Onboarding(@NotNull TooltipDTO tooltip, @NotNull String onboardingId, Integer num) {
            Intrinsics.checkNotNullParameter(tooltip, "tooltip");
            Intrinsics.checkNotNullParameter(onboardingId, "onboardingId");
            this.tooltip = tooltip;
            this.onboardingId = onboardingId;
            this.onboardingDelay = num;
        }

        public static /* synthetic */ Onboarding copy$default(Onboarding onboarding, TooltipDTO tooltipDTO, String str, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                tooltipDTO = onboarding.tooltip;
            }
            if ((i11 & 2) != 0) {
                str = onboarding.onboardingId;
            }
            if ((i11 & 4) != 0) {
                num = onboarding.onboardingDelay;
            }
            return onboarding.copy(tooltipDTO, str, num);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TooltipDTO getTooltip() {
            return this.tooltip;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getOnboardingId() {
            return this.onboardingId;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getOnboardingDelay() {
            return this.onboardingDelay;
        }

        @NotNull
        public final Onboarding copy(@NotNull TooltipDTO tooltip, @NotNull String onboardingId, Integer onboardingDelay) {
            Intrinsics.checkNotNullParameter(tooltip, "tooltip");
            Intrinsics.checkNotNullParameter(onboardingId, "onboardingId");
            return new Onboarding(tooltip, onboardingId, onboardingDelay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Onboarding)) {
                return false;
            }
            Onboarding onboarding = (Onboarding) other;
            return Intrinsics.d(this.tooltip, onboarding.tooltip) && Intrinsics.d(this.onboardingId, onboarding.onboardingId) && Intrinsics.d(this.onboardingDelay, onboarding.onboardingDelay);
        }

        public final Integer getOnboardingDelay() {
            return this.onboardingDelay;
        }

        @NotNull
        public final String getOnboardingId() {
            return this.onboardingId;
        }

        @NotNull
        public final TooltipDTO getTooltip() {
            return this.tooltip;
        }

        public int hashCode() {
            int a11 = g.a(this.tooltip.hashCode() * 31, 31, this.onboardingId);
            Integer num = this.onboardingDelay;
            return a11 + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            TooltipDTO tooltipDTO = this.tooltip;
            String str = this.onboardingId;
            Integer num = this.onboardingDelay;
            StringBuilder sb2 = new StringBuilder("Onboarding(tooltip=");
            sb2.append(tooltipDTO);
            sb2.append(", onboardingId=");
            sb2.append(str);
            sb2.append(", onboardingDelay=");
            return a.c(sb2, num, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0084\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0007HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001c¨\u00063"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO$PresentationSettings;", "", "showMoreButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "hasMoreItems", "", "collapsedMaxRows", "", "lastItemMinWidth", "paddingTop", "Lru/ozon/uni/atoms/data/common/Paddings;", "paddingRight", "paddingBottom", "paddingLeft", "rowGap", "columnGap", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getShowMoreButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getHasMoreItems", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCollapsedMaxRows", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLastItemMinWidth", "getPaddingTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getPaddingRight", "getPaddingBottom", "getPaddingLeft", "getRowGap", "getColumnGap", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO$PresentationSettings;", "equals", "other", "hashCode", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PresentationSettings {
        public static final int $stable = 0;
        private final Integer collapsedMaxRows;
        private final Paddings columnGap;
        private final Boolean hasMoreItems;
        private final Integer lastItemMinWidth;
        private final Paddings paddingBottom;
        private final Paddings paddingLeft;
        private final Paddings paddingRight;
        private final Paddings paddingTop;
        private final Paddings rowGap;

        @NotNull
        private final ButtonV3DTO showMoreButton;

        public PresentationSettings(@NotNull ButtonV3DTO showMoreButton, Boolean bool, Integer num, Integer num2, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, Paddings paddings6) {
            Intrinsics.checkNotNullParameter(showMoreButton, "showMoreButton");
            this.showMoreButton = showMoreButton;
            this.hasMoreItems = bool;
            this.collapsedMaxRows = num;
            this.lastItemMinWidth = num2;
            this.paddingTop = paddings;
            this.paddingRight = paddings2;
            this.paddingBottom = paddings3;
            this.paddingLeft = paddings4;
            this.rowGap = paddings5;
            this.columnGap = paddings6;
        }

        public static /* synthetic */ PresentationSettings copy$default(PresentationSettings presentationSettings, ButtonV3DTO buttonV3DTO, Boolean bool, Integer num, Integer num2, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, Paddings paddings6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                buttonV3DTO = presentationSettings.showMoreButton;
            }
            if ((i11 & 2) != 0) {
                bool = presentationSettings.hasMoreItems;
            }
            if ((i11 & 4) != 0) {
                num = presentationSettings.collapsedMaxRows;
            }
            if ((i11 & 8) != 0) {
                num2 = presentationSettings.lastItemMinWidth;
            }
            if ((i11 & 16) != 0) {
                paddings = presentationSettings.paddingTop;
            }
            if ((i11 & 32) != 0) {
                paddings2 = presentationSettings.paddingRight;
            }
            if ((i11 & 64) != 0) {
                paddings3 = presentationSettings.paddingBottom;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                paddings4 = presentationSettings.paddingLeft;
            }
            if ((i11 & 256) != 0) {
                paddings5 = presentationSettings.rowGap;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                paddings6 = presentationSettings.columnGap;
            }
            Paddings paddings7 = paddings5;
            Paddings paddings8 = paddings6;
            Paddings paddings9 = paddings3;
            Paddings paddings10 = paddings4;
            Paddings paddings11 = paddings;
            Paddings paddings12 = paddings2;
            return presentationSettings.copy(buttonV3DTO, bool, num, num2, paddings11, paddings12, paddings9, paddings10, paddings7, paddings8);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ButtonV3DTO getShowMoreButton() {
            return this.showMoreButton;
        }

        /* renamed from: component10, reason: from getter */
        public final Paddings getColumnGap() {
            return this.columnGap;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getHasMoreItems() {
            return this.hasMoreItems;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getCollapsedMaxRows() {
            return this.collapsedMaxRows;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getLastItemMinWidth() {
            return this.lastItemMinWidth;
        }

        /* renamed from: component5, reason: from getter */
        public final Paddings getPaddingTop() {
            return this.paddingTop;
        }

        /* renamed from: component6, reason: from getter */
        public final Paddings getPaddingRight() {
            return this.paddingRight;
        }

        /* renamed from: component7, reason: from getter */
        public final Paddings getPaddingBottom() {
            return this.paddingBottom;
        }

        /* renamed from: component8, reason: from getter */
        public final Paddings getPaddingLeft() {
            return this.paddingLeft;
        }

        /* renamed from: component9, reason: from getter */
        public final Paddings getRowGap() {
            return this.rowGap;
        }

        @NotNull
        public final PresentationSettings copy(@NotNull ButtonV3DTO showMoreButton, Boolean hasMoreItems, Integer collapsedMaxRows, Integer lastItemMinWidth, Paddings paddingTop, Paddings paddingRight, Paddings paddingBottom, Paddings paddingLeft, Paddings rowGap, Paddings columnGap) {
            Intrinsics.checkNotNullParameter(showMoreButton, "showMoreButton");
            return new PresentationSettings(showMoreButton, hasMoreItems, collapsedMaxRows, lastItemMinWidth, paddingTop, paddingRight, paddingBottom, paddingLeft, rowGap, columnGap);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PresentationSettings)) {
                return false;
            }
            PresentationSettings presentationSettings = (PresentationSettings) other;
            return Intrinsics.d(this.showMoreButton, presentationSettings.showMoreButton) && Intrinsics.d(this.hasMoreItems, presentationSettings.hasMoreItems) && Intrinsics.d(this.collapsedMaxRows, presentationSettings.collapsedMaxRows) && Intrinsics.d(this.lastItemMinWidth, presentationSettings.lastItemMinWidth) && this.paddingTop == presentationSettings.paddingTop && this.paddingRight == presentationSettings.paddingRight && this.paddingBottom == presentationSettings.paddingBottom && this.paddingLeft == presentationSettings.paddingLeft && this.rowGap == presentationSettings.rowGap && this.columnGap == presentationSettings.columnGap;
        }

        public final Integer getCollapsedMaxRows() {
            return this.collapsedMaxRows;
        }

        public final Paddings getColumnGap() {
            return this.columnGap;
        }

        public final Boolean getHasMoreItems() {
            return this.hasMoreItems;
        }

        public final Integer getLastItemMinWidth() {
            return this.lastItemMinWidth;
        }

        public final Paddings getPaddingBottom() {
            return this.paddingBottom;
        }

        public final Paddings getPaddingLeft() {
            return this.paddingLeft;
        }

        public final Paddings getPaddingRight() {
            return this.paddingRight;
        }

        public final Paddings getPaddingTop() {
            return this.paddingTop;
        }

        public final Paddings getRowGap() {
            return this.rowGap;
        }

        @NotNull
        public final ButtonV3DTO getShowMoreButton() {
            return this.showMoreButton;
        }

        public int hashCode() {
            int hashCode = this.showMoreButton.hashCode() * 31;
            Boolean bool = this.hasMoreItems;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.collapsedMaxRows;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.lastItemMinWidth;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Paddings paddings = this.paddingTop;
            int hashCode5 = (hashCode4 + (paddings == null ? 0 : paddings.hashCode())) * 31;
            Paddings paddings2 = this.paddingRight;
            int hashCode6 = (hashCode5 + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.paddingBottom;
            int hashCode7 = (hashCode6 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.paddingLeft;
            int hashCode8 = (hashCode7 + (paddings4 == null ? 0 : paddings4.hashCode())) * 31;
            Paddings paddings5 = this.rowGap;
            int hashCode9 = (hashCode8 + (paddings5 == null ? 0 : paddings5.hashCode())) * 31;
            Paddings paddings6 = this.columnGap;
            return hashCode9 + (paddings6 != null ? paddings6.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ButtonV3DTO buttonV3DTO = this.showMoreButton;
            Boolean bool = this.hasMoreItems;
            Integer num = this.collapsedMaxRows;
            Integer num2 = this.lastItemMinWidth;
            Paddings paddings = this.paddingTop;
            Paddings paddings2 = this.paddingRight;
            Paddings paddings3 = this.paddingBottom;
            Paddings paddings4 = this.paddingLeft;
            Paddings paddings5 = this.rowGap;
            Paddings paddings6 = this.columnGap;
            StringBuilder sb2 = new StringBuilder("PresentationSettings(showMoreButton=");
            sb2.append(buttonV3DTO);
            sb2.append(", hasMoreItems=");
            sb2.append(bool);
            sb2.append(", collapsedMaxRows=");
            c.e(sb2, num, ", lastItemMinWidth=", num2, ", paddingTop=");
            Lh.a.e(sb2, paddings, ", paddingRight=", paddings2, ", paddingBottom=");
            Lh.a.e(sb2, paddings3, ", paddingLeft=", paddings4, ", rowGap=");
            return b.e(sb2, paddings5, ", columnGap=", paddings6, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HistoryDTO(TextDTO textDTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "historyButtonItem", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "historyTagButtonItem", type = TagButtonDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends AtomDTO> historyItems, ButtonV3DTO buttonV3DTO, PresentationSettings presentationSettings, Onboarding onboarding) {
        Intrinsics.checkNotNullParameter(historyItems, "historyItems");
        this.title = textDTO;
        this.historyItems = historyItems;
        this.deleteButton = buttonV3DTO;
        this.presentationSettings = presentationSettings;
        this.onboarding = onboarding;
    }

    public static /* synthetic */ HistoryDTO copy$default(HistoryDTO historyDTO, TextDTO textDTO, List list, ButtonV3DTO buttonV3DTO, PresentationSettings presentationSettings, Onboarding onboarding, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = historyDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = historyDTO.historyItems;
        }
        if ((i11 & 4) != 0) {
            buttonV3DTO = historyDTO.deleteButton;
        }
        if ((i11 & 8) != 0) {
            presentationSettings = historyDTO.presentationSettings;
        }
        if ((i11 & 16) != 0) {
            onboarding = historyDTO.onboarding;
        }
        Onboarding onboarding2 = onboarding;
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        return historyDTO.copy(textDTO, list, buttonV3DTO2, presentationSettings, onboarding2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final List<AtomDTO> component2() {
        return this.historyItems;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3DTO getDeleteButton() {
        return this.deleteButton;
    }

    /* renamed from: component4, reason: from getter */
    public final PresentationSettings getPresentationSettings() {
        return this.presentationSettings;
    }

    /* renamed from: component5, reason: from getter */
    public final Onboarding getOnboarding() {
        return this.onboarding;
    }

    @NotNull
    public final HistoryDTO copy(TextDTO title, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "historyButtonItem", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "historyTagButtonItem", type = TagButtonDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends AtomDTO> historyItems, ButtonV3DTO deleteButton, PresentationSettings presentationSettings, Onboarding onboarding) {
        Intrinsics.checkNotNullParameter(historyItems, "historyItems");
        return new HistoryDTO(title, historyItems, deleteButton, presentationSettings, onboarding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryDTO)) {
            return false;
        }
        HistoryDTO historyDTO = (HistoryDTO) other;
        return Intrinsics.d(this.title, historyDTO.title) && Intrinsics.d(this.historyItems, historyDTO.historyItems) && Intrinsics.d(this.deleteButton, historyDTO.deleteButton) && Intrinsics.d(this.presentationSettings, historyDTO.presentationSettings) && Intrinsics.d(this.onboarding, historyDTO.onboarding);
    }

    public final ButtonV3DTO getDeleteButton() {
        return this.deleteButton;
    }

    @NotNull
    public final List<AtomDTO> getHistoryItems() {
        return this.historyItems;
    }

    public final Onboarding getOnboarding() {
        return this.onboarding;
    }

    public final PresentationSettings getPresentationSettings() {
        return this.presentationSettings;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int b11 = g.b((textDTO == null ? 0 : textDTO.hashCode()) * 31, 31, this.historyItems);
        ButtonV3DTO buttonV3DTO = this.deleteButton;
        int hashCode = (b11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        PresentationSettings presentationSettings = this.presentationSettings;
        int hashCode2 = (hashCode + (presentationSettings == null ? 0 : presentationSettings.hashCode())) * 31;
        Onboarding onboarding = this.onboarding;
        return hashCode2 + (onboarding != null ? onboarding.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<AtomDTO> list = this.historyItems;
        ButtonV3DTO buttonV3DTO = this.deleteButton;
        PresentationSettings presentationSettings = this.presentationSettings;
        Onboarding onboarding = this.onboarding;
        StringBuilder e11 = G.e("HistoryDTO(title=", textDTO, ", historyItems=", list, ", deleteButton=");
        e11.append(buttonV3DTO);
        e11.append(", presentationSettings=");
        e11.append(presentationSettings);
        e11.append(", onboarding=");
        e11.append(onboarding);
        e11.append(")");
        return e11.toString();
    }
}
