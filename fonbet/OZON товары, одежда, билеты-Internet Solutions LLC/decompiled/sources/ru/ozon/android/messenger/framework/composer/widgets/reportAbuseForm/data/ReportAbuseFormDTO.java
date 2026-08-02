package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.data;

import De.C2859b;
import K00.b;
import N3.C3660k;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001&BG\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/android/messenger/framework/composer/widgets/reportAbuseForm/data/ReportAbuseFormDTO;", "", "elementsCell", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, "Lru/ozon/android/messenger/framework/composer/widgets/reportAbuseForm/data/ReportAbuseFormDTO$TextArea;", "complainButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/android/messenger/framework/composer/widgets/reportAbuseForm/data/ReportAbuseFormDTO$TextArea;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;Ljava/util/Map;)V", "getElementsCell", "()Ljava/util/List;", "getTextArea", "()Lru/ozon/android/messenger/framework/composer/widgets/reportAbuseForm/data/ReportAbuseFormDTO$TextArea;", "getComplainButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "TextArea", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ReportAbuseFormDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final ButtonV3DTO complainButton;

    @NotNull
    private final List<CellDTO> elementsCell;
    private final TextArea textArea;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/android/messenger/framework/composer/widgets/reportAbuseForm/data/ReportAbuseFormDTO$TextArea;", "", HammersV3BodyDTO.PLACEHOLDER, "", "notEmptyCaption", "maxLength", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getPlaceholder", "()Ljava/lang/String;", "getNotEmptyCaption", "getMaxLength", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextArea {
        public static final int $stable = 0;
        private final int maxLength;
        private final String notEmptyCaption;

        @NotNull
        private final String placeholder;

        public TextArea(@NotNull String placeholder, String str, int i11) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            this.placeholder = placeholder;
            this.notEmptyCaption = str;
            this.maxLength = i11;
        }

        public static /* synthetic */ TextArea copy$default(TextArea textArea, String str, String str2, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = textArea.placeholder;
            }
            if ((i12 & 2) != 0) {
                str2 = textArea.notEmptyCaption;
            }
            if ((i12 & 4) != 0) {
                i11 = textArea.maxLength;
            }
            return textArea.copy(str, str2, i11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component2, reason: from getter */
        public final String getNotEmptyCaption() {
            return this.notEmptyCaption;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMaxLength() {
            return this.maxLength;
        }

        @NotNull
        public final TextArea copy(@NotNull String placeholder, String notEmptyCaption, int maxLength) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            return new TextArea(placeholder, notEmptyCaption, maxLength);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextArea)) {
                return false;
            }
            TextArea textArea = (TextArea) other;
            return Intrinsics.d(this.placeholder, textArea.placeholder) && Intrinsics.d(this.notEmptyCaption, textArea.notEmptyCaption) && this.maxLength == textArea.maxLength;
        }

        public final int getMaxLength() {
            return this.maxLength;
        }

        public final String getNotEmptyCaption() {
            return this.notEmptyCaption;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public int hashCode() {
            int hashCode = this.placeholder.hashCode() * 31;
            String str = this.notEmptyCaption;
            return Integer.hashCode(this.maxLength) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return b.e(this.maxLength, ")", C3660k.d("TextArea(placeholder=", this.placeholder, ", notEmptyCaption=", this.notEmptyCaption, ", maxLength="));
        }
    }

    public ReportAbuseFormDTO(@NotNull List<CellDTO> elementsCell, TextArea textArea, @NotNull ButtonV3DTO complainButton, String str, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(elementsCell, "elementsCell");
        Intrinsics.checkNotNullParameter(complainButton, "complainButton");
        this.elementsCell = elementsCell;
        this.textArea = textArea;
        this.complainButton = complainButton;
        this.backgroundColor = str;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ReportAbuseFormDTO copy$default(ReportAbuseFormDTO reportAbuseFormDTO, List list, TextArea textArea, ButtonV3DTO buttonV3DTO, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = reportAbuseFormDTO.elementsCell;
        }
        if ((i11 & 2) != 0) {
            textArea = reportAbuseFormDTO.textArea;
        }
        if ((i11 & 4) != 0) {
            buttonV3DTO = reportAbuseFormDTO.complainButton;
        }
        if ((i11 & 8) != 0) {
            str = reportAbuseFormDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            map = reportAbuseFormDTO.trackingInfo;
        }
        Map map2 = map;
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        return reportAbuseFormDTO.copy(list, textArea, buttonV3DTO2, str, map2);
    }

    @NotNull
    public final List<CellDTO> component1() {
        return this.elementsCell;
    }

    /* renamed from: component2, reason: from getter */
    public final TextArea getTextArea() {
        return this.textArea;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3DTO getComplainButton() {
        return this.complainButton;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, MessengerTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final ReportAbuseFormDTO copy(@NotNull List<CellDTO> elementsCell, TextArea textArea, @NotNull ButtonV3DTO complainButton, String backgroundColor, Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(elementsCell, "elementsCell");
        Intrinsics.checkNotNullParameter(complainButton, "complainButton");
        return new ReportAbuseFormDTO(elementsCell, textArea, complainButton, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportAbuseFormDTO)) {
            return false;
        }
        ReportAbuseFormDTO reportAbuseFormDTO = (ReportAbuseFormDTO) other;
        return Intrinsics.d(this.elementsCell, reportAbuseFormDTO.elementsCell) && Intrinsics.d(this.textArea, reportAbuseFormDTO.textArea) && Intrinsics.d(this.complainButton, reportAbuseFormDTO.complainButton) && Intrinsics.d(this.backgroundColor, reportAbuseFormDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, reportAbuseFormDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final ButtonV3DTO getComplainButton() {
        return this.complainButton;
    }

    @NotNull
    public final List<CellDTO> getElementsCell() {
        return this.elementsCell;
    }

    public final TextArea getTextArea() {
        return this.textArea;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.elementsCell.hashCode() * 31;
        TextArea textArea = this.textArea;
        int c11 = C2859b.c(this.complainButton, (hashCode + (textArea == null ? 0 : textArea.hashCode())) * 31, 31);
        String str = this.backgroundColor;
        int hashCode2 = (c11 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<CellDTO> list = this.elementsCell;
        TextArea textArea = this.textArea;
        ButtonV3DTO buttonV3DTO = this.complainButton;
        String str = this.backgroundColor;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ReportAbuseFormDTO(elementsCell=");
        sb2.append(list);
        sb2.append(", textArea=");
        sb2.append(textArea);
        sb2.append(", complainButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
