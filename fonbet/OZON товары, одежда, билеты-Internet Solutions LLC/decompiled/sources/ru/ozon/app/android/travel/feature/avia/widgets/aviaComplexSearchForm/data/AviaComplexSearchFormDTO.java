package ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.data;

import Ak.b;
import D3.g;
import De.C2859b;
import Nh.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.iconField.IconFieldDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003%&'BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO;", "", "flights", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO$Flight;", "addFlight", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "passenger", "Lru/ozon/app/android/travel/molecules/dto/iconField/IconFieldDTO;", "submitButton", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/travel/molecules/dto/iconField/IconFieldDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getFlights", "()Ljava/util/List;", "getAddFlight", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getPassenger", "()Lru/ozon/app/android/travel/molecules/dto/iconField/IconFieldDTO;", "getSubmitButton", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Flight", "Field", "Content", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaComplexSearchFormDTO {
    public static final int $stable = 8;
    private final ButtonV3DTO addFlight;

    @NotNull
    private final List<Flight> flights;

    @NotNull
    private final IconFieldDTO passenger;

    @NotNull
    private final ButtonV3DTO submitButton;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO$Content;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "commonControlSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getCommonControlSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content {
        public static final int $stable = 0;

        @NotNull
        private final CommonControlSettings commonControlSettings;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public Content(@NotNull TextDTO title, TextDTO textDTO, @NotNull CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
            this.title = title;
            this.subtitle = textDTO;
            this.commonControlSettings = commonControlSettings;
        }

        public static /* synthetic */ Content copy$default(Content content, TextDTO textDTO, TextDTO textDTO2, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = content.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = content.subtitle;
            }
            if ((i11 & 4) != 0) {
                commonControlSettings = content.commonControlSettings;
            }
            return content.copy(textDTO, textDTO2, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final CommonControlSettings getCommonControlSettings() {
            return this.commonControlSettings;
        }

        @NotNull
        public final Content copy(@NotNull TextDTO title, TextDTO subtitle, @NotNull CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
            return new Content(title, subtitle, commonControlSettings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.d(this.title, content.title) && Intrinsics.d(this.subtitle, content.subtitle) && Intrinsics.d(this.commonControlSettings, content.commonControlSettings);
        }

        @NotNull
        public final CommonControlSettings getCommonControlSettings() {
            return this.commonControlSettings;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextDTO textDTO = this.subtitle;
            return this.commonControlSettings.hashCode() + ((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            return b.g(g.g("Content(title=", textDTO, ", subtitle=", textDTO2, ", commonControlSettings="), this.commonControlSettings, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JW\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO$Field;", "", "leftValue", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO$Content;", "rightValue", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "errorMessage", "Lru/ozon/uni/atoms/data/text/TextDTO;", "borderColor", "", "backgroundColor", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO$Content;Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO$Content;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getLeftValue", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO$Content;", "getRightValue", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getErrorMessage", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBorderColor", "()Ljava/lang/String;", "getBackgroundColor", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Field {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final String backgroundColor;
        private final String borderColor;

        @NotNull
        private final CornerRadius cornerRadius;
        private final TextDTO errorMessage;
        private final IconDTO icon;

        @NotNull
        private final Content leftValue;
        private final Content rightValue;

        public Field(@NotNull Content leftValue, Content content, IconDTO iconDTO, TextDTO textDTO, String str, @NotNull String backgroundColor, @NotNull CornerRadius cornerRadius) {
            Intrinsics.checkNotNullParameter(leftValue, "leftValue");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            this.leftValue = leftValue;
            this.rightValue = content;
            this.icon = iconDTO;
            this.errorMessage = textDTO;
            this.borderColor = str;
            this.backgroundColor = backgroundColor;
            this.cornerRadius = cornerRadius;
        }

        public static /* synthetic */ Field copy$default(Field field, Content content, Content content2, IconDTO iconDTO, TextDTO textDTO, String str, String str2, CornerRadius cornerRadius, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                content = field.leftValue;
            }
            if ((i11 & 2) != 0) {
                content2 = field.rightValue;
            }
            if ((i11 & 4) != 0) {
                iconDTO = field.icon;
            }
            if ((i11 & 8) != 0) {
                textDTO = field.errorMessage;
            }
            if ((i11 & 16) != 0) {
                str = field.borderColor;
            }
            if ((i11 & 32) != 0) {
                str2 = field.backgroundColor;
            }
            if ((i11 & 64) != 0) {
                cornerRadius = field.cornerRadius;
            }
            String str3 = str2;
            CornerRadius cornerRadius2 = cornerRadius;
            String str4 = str;
            IconDTO iconDTO2 = iconDTO;
            return field.copy(content, content2, iconDTO2, textDTO, str4, str3, cornerRadius2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Content getLeftValue() {
            return this.leftValue;
        }

        /* renamed from: component2, reason: from getter */
        public final Content getRightValue() {
            return this.rightValue;
        }

        /* renamed from: component3, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final Field copy(@NotNull Content leftValue, Content rightValue, IconDTO icon, TextDTO errorMessage, String borderColor, @NotNull String backgroundColor, @NotNull CornerRadius cornerRadius) {
            Intrinsics.checkNotNullParameter(leftValue, "leftValue");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            return new Field(leftValue, rightValue, icon, errorMessage, borderColor, backgroundColor, cornerRadius);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Field)) {
                return false;
            }
            Field field = (Field) other;
            return Intrinsics.d(this.leftValue, field.leftValue) && Intrinsics.d(this.rightValue, field.rightValue) && Intrinsics.d(this.icon, field.icon) && Intrinsics.d(this.errorMessage, field.errorMessage) && Intrinsics.d(this.borderColor, field.borderColor) && Intrinsics.d(this.backgroundColor, field.backgroundColor) && this.cornerRadius == field.cornerRadius;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        public final TextDTO getErrorMessage() {
            return this.errorMessage;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final Content getLeftValue() {
            return this.leftValue;
        }

        public final Content getRightValue() {
            return this.rightValue;
        }

        public int hashCode() {
            int hashCode = this.leftValue.hashCode() * 31;
            Content content = this.rightValue;
            int hashCode2 = (hashCode + (content == null ? 0 : content.hashCode())) * 31;
            IconDTO iconDTO = this.icon;
            int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            TextDTO textDTO = this.errorMessage;
            int hashCode4 = (hashCode3 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            String str = this.borderColor;
            return this.cornerRadius.hashCode() + G.g.a((hashCode4 + (str != null ? str.hashCode() : 0)) * 31, 31, this.backgroundColor);
        }

        @NotNull
        public String toString() {
            Content content = this.leftValue;
            Content content2 = this.rightValue;
            IconDTO iconDTO = this.icon;
            TextDTO textDTO = this.errorMessage;
            String str = this.borderColor;
            String str2 = this.backgroundColor;
            CornerRadius cornerRadius = this.cornerRadius;
            StringBuilder sb2 = new StringBuilder("Field(leftValue=");
            sb2.append(content);
            sb2.append(", rightValue=");
            sb2.append(content2);
            sb2.append(", icon=");
            sb2.append(iconDTO);
            sb2.append(", errorMessage=");
            sb2.append(textDTO);
            sb2.append(", borderColor=");
            a.h(sb2, str, ", backgroundColor=", str2, ", cornerRadius=");
            sb2.append(cornerRadius);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO$Flight;", "", "direction", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO$Field;", "date", "deleteButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO$Field;Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO$Field;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getDirection", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO$Field;", "getDate", "getDeleteButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Flight {
        public static final int $stable;

        @NotNull
        private final Field date;
        private final IconButtonV3DTO deleteButton;

        @NotNull
        private final Field direction;

        static {
            int i11 = IconButtonV3DTO.$stable;
            int i12 = IconDTO.$stable;
            $stable = i11 | i12 | i12;
        }

        public Flight(@NotNull Field direction, @NotNull Field date, IconButtonV3DTO iconButtonV3DTO) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(date, "date");
            this.direction = direction;
            this.date = date;
            this.deleteButton = iconButtonV3DTO;
        }

        public static /* synthetic */ Flight copy$default(Flight flight, Field field, Field field2, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                field = flight.direction;
            }
            if ((i11 & 2) != 0) {
                field2 = flight.date;
            }
            if ((i11 & 4) != 0) {
                iconButtonV3DTO = flight.deleteButton;
            }
            return flight.copy(field, field2, iconButtonV3DTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Field getDirection() {
            return this.direction;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Field getDate() {
            return this.date;
        }

        /* renamed from: component3, reason: from getter */
        public final IconButtonV3DTO getDeleteButton() {
            return this.deleteButton;
        }

        @NotNull
        public final Flight copy(@NotNull Field direction, @NotNull Field date, IconButtonV3DTO deleteButton) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(date, "date");
            return new Flight(direction, date, deleteButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Flight)) {
                return false;
            }
            Flight flight = (Flight) other;
            return Intrinsics.d(this.direction, flight.direction) && Intrinsics.d(this.date, flight.date) && Intrinsics.d(this.deleteButton, flight.deleteButton);
        }

        @NotNull
        public final Field getDate() {
            return this.date;
        }

        public final IconButtonV3DTO getDeleteButton() {
            return this.deleteButton;
        }

        @NotNull
        public final Field getDirection() {
            return this.direction;
        }

        public int hashCode() {
            int hashCode = (this.date.hashCode() + (this.direction.hashCode() * 31)) * 31;
            IconButtonV3DTO iconButtonV3DTO = this.deleteButton;
            return hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "Flight(direction=" + this.direction + ", date=" + this.date + ", deleteButton=" + this.deleteButton + ")";
        }
    }

    public AviaComplexSearchFormDTO(@NotNull List<Flight> flights, ButtonV3DTO buttonV3DTO, @NotNull IconFieldDTO passenger, @NotNull ButtonV3DTO submitButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(flights, "flights");
        Intrinsics.checkNotNullParameter(passenger, "passenger");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.flights = flights;
        this.addFlight = buttonV3DTO;
        this.passenger = passenger;
        this.submitButton = submitButton;
        this.trackingInfo = map;
    }

    public static /* synthetic */ AviaComplexSearchFormDTO copy$default(AviaComplexSearchFormDTO aviaComplexSearchFormDTO, List list, ButtonV3DTO buttonV3DTO, IconFieldDTO iconFieldDTO, ButtonV3DTO buttonV3DTO2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = aviaComplexSearchFormDTO.flights;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = aviaComplexSearchFormDTO.addFlight;
        }
        if ((i11 & 4) != 0) {
            iconFieldDTO = aviaComplexSearchFormDTO.passenger;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO2 = aviaComplexSearchFormDTO.submitButton;
        }
        if ((i11 & 16) != 0) {
            map = aviaComplexSearchFormDTO.trackingInfo;
        }
        Map map2 = map;
        IconFieldDTO iconFieldDTO2 = iconFieldDTO;
        return aviaComplexSearchFormDTO.copy(list, buttonV3DTO, iconFieldDTO2, buttonV3DTO2, map2);
    }

    @NotNull
    public final List<Flight> component1() {
        return this.flights;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getAddFlight() {
        return this.addFlight;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final IconFieldDTO getPassenger() {
        return this.passenger;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final AviaComplexSearchFormDTO copy(@NotNull List<Flight> flights, ButtonV3DTO addFlight, @NotNull IconFieldDTO passenger, @NotNull ButtonV3DTO submitButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(flights, "flights");
        Intrinsics.checkNotNullParameter(passenger, "passenger");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        return new AviaComplexSearchFormDTO(flights, addFlight, passenger, submitButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaComplexSearchFormDTO)) {
            return false;
        }
        AviaComplexSearchFormDTO aviaComplexSearchFormDTO = (AviaComplexSearchFormDTO) other;
        return Intrinsics.d(this.flights, aviaComplexSearchFormDTO.flights) && Intrinsics.d(this.addFlight, aviaComplexSearchFormDTO.addFlight) && Intrinsics.d(this.passenger, aviaComplexSearchFormDTO.passenger) && Intrinsics.d(this.submitButton, aviaComplexSearchFormDTO.submitButton) && Intrinsics.d(this.trackingInfo, aviaComplexSearchFormDTO.trackingInfo);
    }

    public final ButtonV3DTO getAddFlight() {
        return this.addFlight;
    }

    @NotNull
    public final List<Flight> getFlights() {
        return this.flights;
    }

    @NotNull
    public final IconFieldDTO getPassenger() {
        return this.passenger;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.flights.hashCode() * 31;
        ButtonV3DTO buttonV3DTO = this.addFlight;
        int c11 = C2859b.c(this.submitButton, (this.passenger.hashCode() + ((hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31)) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return c11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Flight> list = this.flights;
        ButtonV3DTO buttonV3DTO = this.addFlight;
        IconFieldDTO iconFieldDTO = this.passenger;
        ButtonV3DTO buttonV3DTO2 = this.submitButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("AviaComplexSearchFormDTO(flights=");
        sb2.append(list);
        sb2.append(", addFlight=");
        sb2.append(buttonV3DTO);
        sb2.append(", passenger=");
        sb2.append(iconFieldDTO);
        sb2.append(", submitButton=");
        sb2.append(buttonV3DTO2);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
