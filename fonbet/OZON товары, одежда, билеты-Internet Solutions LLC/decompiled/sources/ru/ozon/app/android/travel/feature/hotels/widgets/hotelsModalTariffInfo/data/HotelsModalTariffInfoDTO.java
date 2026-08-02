package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.data;

import B3.p;
import G.g;
import GR.b;
import I0.C3173b;
import Pk0.a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u001b\u001c\u001d\u001eB7\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/data/HotelsModalTariffInfoDTO;", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "elements", "", "enableHtmlTags", "", "<init>", "(Ljava/util/Map;Ljava/util/List;Z)V", "getTrackingInfo", "()Ljava/util/Map;", "getElements", "()Ljava/util/List;", "getEnableHtmlTags", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "CellBlockDTO", "ElementMargins", "Disclaimer", "HtmlBlock", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsModalTariffInfoDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Object> elements;
    private final boolean enableHtmlTags;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/data/HotelsModalTariffInfoDTO$Disclaimer;", "", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "settings", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "<init>", "(Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;)V", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getSettings", "()Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Disclaimer {
        public static final int $stable = 8;

        @NotNull
        private final DisclaimerDTO disclaimer;

        @NotNull
        private final TravelWidgetSettingsDTO settings;

        public Disclaimer(@NotNull DisclaimerDTO disclaimer, @NotNull TravelWidgetSettingsDTO settings) {
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.disclaimer = disclaimer;
            this.settings = settings;
        }

        public static /* synthetic */ Disclaimer copy$default(Disclaimer disclaimer, DisclaimerDTO disclaimerDTO, TravelWidgetSettingsDTO travelWidgetSettingsDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                disclaimerDTO = disclaimer.disclaimer;
            }
            if ((i11 & 2) != 0) {
                travelWidgetSettingsDTO = disclaimer.settings;
            }
            return disclaimer.copy(disclaimerDTO, travelWidgetSettingsDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final DisclaimerDTO getDisclaimer() {
            return this.disclaimer;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TravelWidgetSettingsDTO getSettings() {
            return this.settings;
        }

        @NotNull
        public final Disclaimer copy(@NotNull DisclaimerDTO disclaimer, @NotNull TravelWidgetSettingsDTO settings) {
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            Intrinsics.checkNotNullParameter(settings, "settings");
            return new Disclaimer(disclaimer, settings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Disclaimer)) {
                return false;
            }
            Disclaimer disclaimer = (Disclaimer) other;
            return Intrinsics.d(this.disclaimer, disclaimer.disclaimer) && Intrinsics.d(this.settings, disclaimer.settings);
        }

        @NotNull
        public final DisclaimerDTO getDisclaimer() {
            return this.disclaimer;
        }

        @NotNull
        public final TravelWidgetSettingsDTO getSettings() {
            return this.settings;
        }

        public int hashCode() {
            return this.settings.hashCode() + (this.disclaimer.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Disclaimer(disclaimer=" + this.disclaimer + ", settings=" + this.settings + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/data/HotelsModalTariffInfoDTO$ElementMargins;", "", "leading", "Lru/ozon/uni/atoms/data/common/Paddings;", "top", "trailing", "bottom", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getLeading", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTop", "getTrailing", "getBottom", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ElementMargins {
        public static final int $stable = 0;

        @EnumNullFallback
        @NotNull
        private final Paddings bottom;

        @EnumNullFallback
        @NotNull
        private final Paddings leading;

        @EnumNullFallback
        @NotNull
        private final Paddings top;

        @EnumNullFallback
        @NotNull
        private final Paddings trailing;

        public ElementMargins() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ ElementMargins copy$default(ElementMargins elementMargins, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = elementMargins.leading;
            }
            if ((i11 & 2) != 0) {
                paddings2 = elementMargins.top;
            }
            if ((i11 & 4) != 0) {
                paddings3 = elementMargins.trailing;
            }
            if ((i11 & 8) != 0) {
                paddings4 = elementMargins.bottom;
            }
            return elementMargins.copy(paddings, paddings2, paddings3, paddings4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getLeading() {
            return this.leading;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getTrailing() {
            return this.trailing;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final ElementMargins copy(@NotNull Paddings leading, @NotNull Paddings top, @NotNull Paddings trailing, @NotNull Paddings bottom) {
            Intrinsics.checkNotNullParameter(leading, "leading");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(trailing, "trailing");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            return new ElementMargins(leading, top, trailing, bottom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ElementMargins)) {
                return false;
            }
            ElementMargins elementMargins = (ElementMargins) other;
            return this.leading == elementMargins.leading && this.top == elementMargins.top && this.trailing == elementMargins.trailing && this.bottom == elementMargins.bottom;
        }

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings getLeading() {
            return this.leading;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        public final Paddings getTrailing() {
            return this.trailing;
        }

        public int hashCode() {
            return this.bottom.hashCode() + b.b(this.trailing, b.b(this.top, this.leading.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.leading;
            Paddings paddings2 = this.top;
            return b.e(p.b("ElementMargins(leading=", paddings, ", top=", paddings2, ", trailing="), this.trailing, ", bottom=", this.bottom, ")");
        }

        public ElementMargins(@NotNull Paddings leading, @NotNull Paddings top, @NotNull Paddings trailing, @NotNull Paddings bottom) {
            Intrinsics.checkNotNullParameter(leading, "leading");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(trailing, "trailing");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            this.leading = leading;
            this.top = top;
            this.trailing = trailing;
            this.bottom = bottom;
        }

        public /* synthetic */ ElementMargins(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.NONE : paddings, (i11 & 2) != 0 ? Paddings.NONE : paddings2, (i11 & 4) != 0 ? Paddings.NONE : paddings3, (i11 & 8) != 0 ? Paddings.NONE : paddings4);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/data/HotelsModalTariffInfoDTO$HtmlBlock;", "", "htmlString", "", "settings", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "typographyToken", "textColor", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;Ljava/lang/String;Ljava/lang/String;)V", "getHtmlString", "()Ljava/lang/String;", "getSettings", "()Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "getTypographyToken", "getTextColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HtmlBlock {
        public static final int $stable = 8;

        @NotNull
        private final String htmlString;

        @NotNull
        private final TravelWidgetSettingsDTO settings;

        @NotNull
        private final String textColor;

        @NotNull
        private final String typographyToken;

        public HtmlBlock(@NotNull String htmlString, @NotNull TravelWidgetSettingsDTO settings, @NotNull String typographyToken, @NotNull String textColor) {
            Intrinsics.checkNotNullParameter(htmlString, "htmlString");
            Intrinsics.checkNotNullParameter(settings, "settings");
            Intrinsics.checkNotNullParameter(typographyToken, "typographyToken");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            this.htmlString = htmlString;
            this.settings = settings;
            this.typographyToken = typographyToken;
            this.textColor = textColor;
        }

        public static /* synthetic */ HtmlBlock copy$default(HtmlBlock htmlBlock, String str, TravelWidgetSettingsDTO travelWidgetSettingsDTO, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = htmlBlock.htmlString;
            }
            if ((i11 & 2) != 0) {
                travelWidgetSettingsDTO = htmlBlock.settings;
            }
            if ((i11 & 4) != 0) {
                str2 = htmlBlock.typographyToken;
            }
            if ((i11 & 8) != 0) {
                str3 = htmlBlock.textColor;
            }
            return htmlBlock.copy(str, travelWidgetSettingsDTO, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getHtmlString() {
            return this.htmlString;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TravelWidgetSettingsDTO getSettings() {
            return this.settings;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getTypographyToken() {
            return this.typographyToken;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        @NotNull
        public final HtmlBlock copy(@NotNull String htmlString, @NotNull TravelWidgetSettingsDTO settings, @NotNull String typographyToken, @NotNull String textColor) {
            Intrinsics.checkNotNullParameter(htmlString, "htmlString");
            Intrinsics.checkNotNullParameter(settings, "settings");
            Intrinsics.checkNotNullParameter(typographyToken, "typographyToken");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            return new HtmlBlock(htmlString, settings, typographyToken, textColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HtmlBlock)) {
                return false;
            }
            HtmlBlock htmlBlock = (HtmlBlock) other;
            return Intrinsics.d(this.htmlString, htmlBlock.htmlString) && Intrinsics.d(this.settings, htmlBlock.settings) && Intrinsics.d(this.typographyToken, htmlBlock.typographyToken) && Intrinsics.d(this.textColor, htmlBlock.textColor);
        }

        @NotNull
        public final String getHtmlString() {
            return this.htmlString;
        }

        @NotNull
        public final TravelWidgetSettingsDTO getSettings() {
            return this.settings;
        }

        @NotNull
        public final String getTextColor() {
            return this.textColor;
        }

        @NotNull
        public final String getTypographyToken() {
            return this.typographyToken;
        }

        public int hashCode() {
            return this.textColor.hashCode() + g.a((this.settings.hashCode() + (this.htmlString.hashCode() * 31)) * 31, 31, this.typographyToken);
        }

        @NotNull
        public String toString() {
            String str = this.htmlString;
            TravelWidgetSettingsDTO travelWidgetSettingsDTO = this.settings;
            String str2 = this.typographyToken;
            String str3 = this.textColor;
            StringBuilder sb2 = new StringBuilder("HtmlBlock(htmlString=");
            sb2.append(str);
            sb2.append(", settings=");
            sb2.append(travelWidgetSettingsDTO);
            sb2.append(", typographyToken=");
            return C3173b.c(sb2, str2, ", textColor=", str3, ")");
        }
    }

    public HotelsModalTariffInfoDTO(Map<String, TokenizedTrackingInfo> map, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "cellBlock", type = CellBlockDTO.class), @ProtoOneOfSignature(name = "disclaimer", type = Disclaimer.class), @ProtoOneOfSignature(name = "htmlBlock", type = HtmlBlock.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> elements, boolean z11) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.trackingInfo = map;
        this.elements = elements;
        this.enableHtmlTags = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelsModalTariffInfoDTO copy$default(HotelsModalTariffInfoDTO hotelsModalTariffInfoDTO, Map map, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = hotelsModalTariffInfoDTO.trackingInfo;
        }
        if ((i11 & 2) != 0) {
            list = hotelsModalTariffInfoDTO.elements;
        }
        if ((i11 & 4) != 0) {
            z11 = hotelsModalTariffInfoDTO.enableHtmlTags;
        }
        return hotelsModalTariffInfoDTO.copy(map, list, z11);
    }

    public final Map<String, TokenizedTrackingInfo> component1() {
        return this.trackingInfo;
    }

    @NotNull
    public final List<Object> component2() {
        return this.elements;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnableHtmlTags() {
        return this.enableHtmlTags;
    }

    @NotNull
    public final HotelsModalTariffInfoDTO copy(Map<String, TokenizedTrackingInfo> trackingInfo, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "cellBlock", type = CellBlockDTO.class), @ProtoOneOfSignature(name = "disclaimer", type = Disclaimer.class), @ProtoOneOfSignature(name = "htmlBlock", type = HtmlBlock.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> elements, boolean enableHtmlTags) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new HotelsModalTariffInfoDTO(trackingInfo, elements, enableHtmlTags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsModalTariffInfoDTO)) {
            return false;
        }
        HotelsModalTariffInfoDTO hotelsModalTariffInfoDTO = (HotelsModalTariffInfoDTO) other;
        return Intrinsics.d(this.trackingInfo, hotelsModalTariffInfoDTO.trackingInfo) && Intrinsics.d(this.elements, hotelsModalTariffInfoDTO.elements) && this.enableHtmlTags == hotelsModalTariffInfoDTO.enableHtmlTags;
    }

    @NotNull
    public final List<Object> getElements() {
        return this.elements;
    }

    public final boolean getEnableHtmlTags() {
        return this.enableHtmlTags;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return Boolean.hashCode(this.enableHtmlTags) + g.b((map == null ? 0 : map.hashCode()) * 31, 31, this.elements);
    }

    @NotNull
    public String toString() {
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        List<Object> list = this.elements;
        boolean z11 = this.enableHtmlTags;
        StringBuilder sb2 = new StringBuilder("HotelsModalTariffInfoDTO(trackingInfo=");
        sb2.append(map);
        sb2.append(", elements=");
        sb2.append(list);
        sb2.append(", enableHtmlTags=");
        return a.a(")", sb2, z11);
    }

    public HotelsModalTariffInfoDTO(Map map, List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i11 & 2) != 0 ? K.f71697a : list, (i11 & 4) != 0 ? false : z11);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003J[\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/data/HotelsModalTariffInfoDTO$CellBlockDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "margins", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/data/HotelsModalTariffInfoDTO$ElementMargins;", "cells", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "enableHtmlTags", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/data/HotelsModalTariffInfoDTO$ElementMargins;Ljava/util/List;Z)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getMargins", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/data/HotelsModalTariffInfoDTO$ElementMargins;", "getCells", "()Ljava/util/List;", "getEnableHtmlTags", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellBlockDTO {
        public static final int $stable = 8;
        private final String backgroundColor;

        @NotNull
        private final List<CellDTO> cells;

        @EnumNullFallback
        @NotNull
        private final CornerRadius cornerRadius;
        private final boolean enableHtmlTags;

        @NotNull
        private final ElementMargins margins;
        private final TextDTO subtitle;
        private final TextDTO title;

        public CellBlockDTO(TextDTO textDTO, TextDTO textDTO2, String str, @NotNull CornerRadius cornerRadius, @NotNull ElementMargins margins, @ProtoOneOfSignature(name = "dsCell", type = CellDTO.class) @NotNull @ProtoOneOf(label = "type") List<CellDTO> cells, boolean z11) {
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            Intrinsics.checkNotNullParameter(margins, "margins");
            Intrinsics.checkNotNullParameter(cells, "cells");
            this.title = textDTO;
            this.subtitle = textDTO2;
            this.backgroundColor = str;
            this.cornerRadius = cornerRadius;
            this.margins = margins;
            this.cells = cells;
            this.enableHtmlTags = z11;
        }

        public static /* synthetic */ CellBlockDTO copy$default(CellBlockDTO cellBlockDTO, TextDTO textDTO, TextDTO textDTO2, String str, CornerRadius cornerRadius, ElementMargins elementMargins, List list, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = cellBlockDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = cellBlockDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                str = cellBlockDTO.backgroundColor;
            }
            if ((i11 & 8) != 0) {
                cornerRadius = cellBlockDTO.cornerRadius;
            }
            if ((i11 & 16) != 0) {
                elementMargins = cellBlockDTO.margins;
            }
            if ((i11 & 32) != 0) {
                list = cellBlockDTO.cells;
            }
            if ((i11 & 64) != 0) {
                z11 = cellBlockDTO.enableHtmlTags;
            }
            List list2 = list;
            boolean z12 = z11;
            ElementMargins elementMargins2 = elementMargins;
            String str2 = str;
            return cellBlockDTO.copy(textDTO, textDTO2, str2, cornerRadius, elementMargins2, list2, z12);
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
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final ElementMargins getMargins() {
            return this.margins;
        }

        @NotNull
        public final List<CellDTO> component6() {
            return this.cells;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getEnableHtmlTags() {
            return this.enableHtmlTags;
        }

        @NotNull
        public final CellBlockDTO copy(TextDTO title, TextDTO subtitle, String backgroundColor, @NotNull CornerRadius cornerRadius, @NotNull ElementMargins margins, @ProtoOneOfSignature(name = "dsCell", type = CellDTO.class) @NotNull @ProtoOneOf(label = "type") List<CellDTO> cells, boolean enableHtmlTags) {
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            Intrinsics.checkNotNullParameter(margins, "margins");
            Intrinsics.checkNotNullParameter(cells, "cells");
            return new CellBlockDTO(title, subtitle, backgroundColor, cornerRadius, margins, cells, enableHtmlTags);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellBlockDTO)) {
                return false;
            }
            CellBlockDTO cellBlockDTO = (CellBlockDTO) other;
            return Intrinsics.d(this.title, cellBlockDTO.title) && Intrinsics.d(this.subtitle, cellBlockDTO.subtitle) && Intrinsics.d(this.backgroundColor, cellBlockDTO.backgroundColor) && this.cornerRadius == cellBlockDTO.cornerRadius && Intrinsics.d(this.margins, cellBlockDTO.margins) && Intrinsics.d(this.cells, cellBlockDTO.cells) && this.enableHtmlTags == cellBlockDTO.enableHtmlTags;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<CellDTO> getCells() {
            return this.cells;
        }

        @NotNull
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        public final boolean getEnableHtmlTags() {
            return this.enableHtmlTags;
        }

        @NotNull
        public final ElementMargins getMargins() {
            return this.margins;
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
            String str = this.backgroundColor;
            return Boolean.hashCode(this.enableHtmlTags) + g.b((this.margins.hashCode() + Tl.b.b(this.cornerRadius, (hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31)) * 31, 31, this.cells);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            String str = this.backgroundColor;
            CornerRadius cornerRadius = this.cornerRadius;
            ElementMargins elementMargins = this.margins;
            List<CellDTO> list = this.cells;
            boolean z11 = this.enableHtmlTags;
            StringBuilder g10 = D3.g.g("CellBlockDTO(title=", textDTO, ", subtitle=", textDTO2, ", backgroundColor=");
            g10.append(str);
            g10.append(", cornerRadius=");
            g10.append(cornerRadius);
            g10.append(", margins=");
            g10.append(elementMargins);
            g10.append(", cells=");
            g10.append(list);
            g10.append(", enableHtmlTags=");
            return a.a(")", g10, z11);
        }

        public /* synthetic */ CellBlockDTO(TextDTO textDTO, TextDTO textDTO2, String str, CornerRadius cornerRadius, ElementMargins elementMargins, List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, textDTO2, str, (i11 & 8) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, (i11 & 16) != 0 ? new ElementMargins(null, null, null, null, 15, null) : elementMargins, list, (i11 & 64) != 0 ? false : z11);
        }
    }
}
