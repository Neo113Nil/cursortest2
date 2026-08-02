package ru.ozon.app.android.checkoutcomposer.totalV3.data;

import B90.C2618u;
import D3.g;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.totalV3.progressBar.ProgressBarDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\u001c\u001d\u001eB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/data/TotalV3DTO;", "", "interactiveActions", "Lru/ozon/app/android/checkoutcomposer/totalV3/data/TotalV3DTO$InteractiveActionsDTO;", "progressBar", "Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/checkoutcomposer/totalV3/data/TotalV3DTO$InteractiveActionsDTO;Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarDTO;Ljava/util/Map;)V", "getInteractiveActions", "()Lru/ozon/app/android/checkoutcomposer/totalV3/data/TotalV3DTO$InteractiveActionsDTO;", "getProgressBar", "()Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "InteractiveActionsDTO", "HintDTO", "InteractiveSummaryDTO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TotalV3DTO {
    public static final int $stable = 8;

    @NotNull
    private final InteractiveActionsDTO interactiveActions;
    private final ProgressBarDTO progressBar;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/data/TotalV3DTO$HintDTO;", "", "message", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getMessage", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HintDTO {
        public static final int $stable = 0;
        private final TextDTO message;

        public HintDTO(TextDTO textDTO) {
            this.message = textDTO;
        }

        public static /* synthetic */ HintDTO copy$default(HintDTO hintDTO, TextDTO textDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = hintDTO.message;
            }
            return hintDTO.copy(textDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getMessage() {
            return this.message;
        }

        @NotNull
        public final HintDTO copy(TextDTO message) {
            return new HintDTO(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HintDTO) && Intrinsics.d(this.message, ((HintDTO) other).message);
        }

        public final TextDTO getMessage() {
            return this.message;
        }

        public int hashCode() {
            TextDTO textDTO = this.message;
            if (textDTO == null) {
                return 0;
            }
            return textDTO.hashCode();
        }

        @NotNull
        public String toString() {
            return "HintDTO(message=" + this.message + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/data/TotalV3DTO$InteractiveActionsDTO;", "", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "hints", "", "Lru/ozon/app/android/checkoutcomposer/totalV3/data/TotalV3DTO$HintDTO;", "interactiveSummary", "Lru/ozon/app/android/checkoutcomposer/totalV3/data/TotalV3DTO$InteractiveSummaryDTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/List;Ljava/util/List;)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getHints", "()Ljava/util/List;", "getInteractiveSummary", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InteractiveActionsDTO {
        public static final int $stable = 8;

        @NotNull
        private final ButtonV3DTO button;
        private final List<HintDTO> hints;
        private final List<InteractiveSummaryDTO> interactiveSummary;

        public InteractiveActionsDTO(@NotNull ButtonV3DTO button, List<HintDTO> list, List<InteractiveSummaryDTO> list2) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
            this.hints = list;
            this.interactiveSummary = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InteractiveActionsDTO copy$default(InteractiveActionsDTO interactiveActionsDTO, ButtonV3DTO buttonV3DTO, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                buttonV3DTO = interactiveActionsDTO.button;
            }
            if ((i11 & 2) != 0) {
                list = interactiveActionsDTO.hints;
            }
            if ((i11 & 4) != 0) {
                list2 = interactiveActionsDTO.interactiveSummary;
            }
            return interactiveActionsDTO.copy(buttonV3DTO, list, list2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final List<HintDTO> component2() {
            return this.hints;
        }

        public final List<InteractiveSummaryDTO> component3() {
            return this.interactiveSummary;
        }

        @NotNull
        public final InteractiveActionsDTO copy(@NotNull ButtonV3DTO button, List<HintDTO> hints, List<InteractiveSummaryDTO> interactiveSummary) {
            Intrinsics.checkNotNullParameter(button, "button");
            return new InteractiveActionsDTO(button, hints, interactiveSummary);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InteractiveActionsDTO)) {
                return false;
            }
            InteractiveActionsDTO interactiveActionsDTO = (InteractiveActionsDTO) other;
            return Intrinsics.d(this.button, interactiveActionsDTO.button) && Intrinsics.d(this.hints, interactiveActionsDTO.hints) && Intrinsics.d(this.interactiveSummary, interactiveActionsDTO.interactiveSummary);
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final List<HintDTO> getHints() {
            return this.hints;
        }

        public final List<InteractiveSummaryDTO> getInteractiveSummary() {
            return this.interactiveSummary;
        }

        public int hashCode() {
            int hashCode = this.button.hashCode() * 31;
            List<HintDTO> list = this.hints;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<InteractiveSummaryDTO> list2 = this.interactiveSummary;
            return hashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ButtonV3DTO buttonV3DTO = this.button;
            List<HintDTO> list = this.hints;
            List<InteractiveSummaryDTO> list2 = this.interactiveSummary;
            StringBuilder sb2 = new StringBuilder("InteractiveActionsDTO(button=");
            sb2.append(buttonV3DTO);
            sb2.append(", hints=");
            sb2.append(list);
            sb2.append(", interactiveSummary=");
            return C2618u.h(sb2, list2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/data/TotalV3DTO$InteractiveSummaryDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "info", "backgroundColor", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getInfo", "getBackgroundColor", "()Ljava/lang/String;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InteractiveSummaryDTO {
        public static final int $stable = IconDTO.$stable;
        private final String backgroundColor;
        private final CommonControlSettings common;
        private final IconDTO icon;
        private final TextDTO info;
        private final TextDTO subtitle;
        private final TextDTO title;

        public InteractiveSummaryDTO(TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, TextDTO textDTO3, String str, CommonControlSettings commonControlSettings) {
            this.title = textDTO;
            this.subtitle = textDTO2;
            this.icon = iconDTO;
            this.info = textDTO3;
            this.backgroundColor = str;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ InteractiveSummaryDTO copy$default(InteractiveSummaryDTO interactiveSummaryDTO, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, TextDTO textDTO3, String str, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = interactiveSummaryDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = interactiveSummaryDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                iconDTO = interactiveSummaryDTO.icon;
            }
            if ((i11 & 8) != 0) {
                textDTO3 = interactiveSummaryDTO.info;
            }
            if ((i11 & 16) != 0) {
                str = interactiveSummaryDTO.backgroundColor;
            }
            if ((i11 & 32) != 0) {
                commonControlSettings = interactiveSummaryDTO.common;
            }
            String str2 = str;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            return interactiveSummaryDTO.copy(textDTO, textDTO2, iconDTO, textDTO3, str2, commonControlSettings2);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getInfo() {
            return this.info;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component6, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final InteractiveSummaryDTO copy(TextDTO title, TextDTO subtitle, IconDTO icon, TextDTO info, String backgroundColor, CommonControlSettings common) {
            return new InteractiveSummaryDTO(title, subtitle, icon, info, backgroundColor, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InteractiveSummaryDTO)) {
                return false;
            }
            InteractiveSummaryDTO interactiveSummaryDTO = (InteractiveSummaryDTO) other;
            return Intrinsics.d(this.title, interactiveSummaryDTO.title) && Intrinsics.d(this.subtitle, interactiveSummaryDTO.subtitle) && Intrinsics.d(this.icon, interactiveSummaryDTO.icon) && Intrinsics.d(this.info, interactiveSummaryDTO.info) && Intrinsics.d(this.backgroundColor, interactiveSummaryDTO.backgroundColor) && Intrinsics.d(this.common, interactiveSummaryDTO.common);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        public final TextDTO getInfo() {
            return this.info;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            TextDTO textDTO2 = this.subtitle;
            int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            IconDTO iconDTO = this.icon;
            int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            TextDTO textDTO3 = this.info;
            int hashCode4 = (hashCode3 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode5 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            IconDTO iconDTO = this.icon;
            TextDTO textDTO3 = this.info;
            String str = this.backgroundColor;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder g10 = g.g("InteractiveSummaryDTO(title=", textDTO, ", subtitle=", textDTO2, ", icon=");
            g10.append(iconDTO);
            g10.append(", info=");
            g10.append(textDTO3);
            g10.append(", backgroundColor=");
            g10.append(str);
            g10.append(", common=");
            g10.append(commonControlSettings);
            g10.append(")");
            return g10.toString();
        }
    }

    public TotalV3DTO(@NotNull InteractiveActionsDTO interactiveActions, ProgressBarDTO progressBarDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(interactiveActions, "interactiveActions");
        this.interactiveActions = interactiveActions;
        this.progressBar = progressBarDTO;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TotalV3DTO copy$default(TotalV3DTO totalV3DTO, InteractiveActionsDTO interactiveActionsDTO, ProgressBarDTO progressBarDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interactiveActionsDTO = totalV3DTO.interactiveActions;
        }
        if ((i11 & 2) != 0) {
            progressBarDTO = totalV3DTO.progressBar;
        }
        if ((i11 & 4) != 0) {
            map = totalV3DTO.trackingInfo;
        }
        return totalV3DTO.copy(interactiveActionsDTO, progressBarDTO, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InteractiveActionsDTO getInteractiveActions() {
        return this.interactiveActions;
    }

    /* renamed from: component2, reason: from getter */
    public final ProgressBarDTO getProgressBar() {
        return this.progressBar;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final TotalV3DTO copy(@NotNull InteractiveActionsDTO interactiveActions, ProgressBarDTO progressBar, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(interactiveActions, "interactiveActions");
        return new TotalV3DTO(interactiveActions, progressBar, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalV3DTO)) {
            return false;
        }
        TotalV3DTO totalV3DTO = (TotalV3DTO) other;
        return Intrinsics.d(this.interactiveActions, totalV3DTO.interactiveActions) && Intrinsics.d(this.progressBar, totalV3DTO.progressBar) && Intrinsics.d(this.trackingInfo, totalV3DTO.trackingInfo);
    }

    @NotNull
    public final InteractiveActionsDTO getInteractiveActions() {
        return this.interactiveActions;
    }

    public final ProgressBarDTO getProgressBar() {
        return this.progressBar;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.interactiveActions.hashCode() * 31;
        ProgressBarDTO progressBarDTO = this.progressBar;
        int hashCode2 = (hashCode + (progressBarDTO == null ? 0 : progressBarDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        InteractiveActionsDTO interactiveActionsDTO = this.interactiveActions;
        ProgressBarDTO progressBarDTO = this.progressBar;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("TotalV3DTO(interactiveActions=");
        sb2.append(interactiveActionsDTO);
        sb2.append(", progressBar=");
        sb2.append(progressBarDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
