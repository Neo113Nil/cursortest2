package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.data;

import Ak.b;
import B90.C2616s;
import Bl.C2639a;
import De.C2859b;
import Ds.C2880a;
import G.g;
import Kk.C3532b;
import Tl.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001*BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0003J_\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/data/InsuranceCarouselDTO;", "", "logoImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "insurances", "", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/data/InsuranceCarouselDTO$InsuranceCarouselCardDTO;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "viewTracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getLogoImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getInsurances", "()Ljava/util/List;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getViewTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "InsuranceCarouselCardDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InsuranceCarouselDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<InsuranceCarouselCardDTO> insurances;
    private final ImageDTO logoImage;
    private final TextDTO subtitle;
    private final TestInfo testInfo;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> viewTracking;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010-\u001a\u00020\u0011HÆ\u0003J\t\u0010.\u001a\u00020\u0013HÆ\u0003Jq\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u00100\u001a\u00020\u00112\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010#R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/data/InsuranceCarouselDTO$InsuranceCarouselCardDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitleText", "subtitlePrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "benefits", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "borderColor", "", "isSelected", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;ZLru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitleText", "getSubtitlePrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getBenefits", "()Ljava/util/List;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getBorderColor", "()Ljava/lang/String;", "()Z", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InsuranceCarouselCardDTO {
        public static final int $stable = 8;
        private final BadgeDTO badge;

        @NotNull
        private final List<CellDTO> benefits;
        private final String borderColor;

        @NotNull
        private final ButtonV3DTO button;

        @NotNull
        private final CommonControlSettings common;
        private final boolean isSelected;
        private final PriceDTO subtitlePrice;
        private final TextDTO subtitleText;

        @NotNull
        private final TextDTO title;

        public InsuranceCarouselCardDTO(@NotNull TextDTO title, TextDTO textDTO, PriceDTO priceDTO, @NotNull List<CellDTO> benefits, BadgeDTO badgeDTO, @NotNull ButtonV3DTO button, String str, boolean z11, @NotNull CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(common, "common");
            this.title = title;
            this.subtitleText = textDTO;
            this.subtitlePrice = priceDTO;
            this.benefits = benefits;
            this.badge = badgeDTO;
            this.button = button;
            this.borderColor = str;
            this.isSelected = z11;
            this.common = common;
        }

        public static /* synthetic */ InsuranceCarouselCardDTO copy$default(InsuranceCarouselCardDTO insuranceCarouselCardDTO, TextDTO textDTO, TextDTO textDTO2, PriceDTO priceDTO, List list, BadgeDTO badgeDTO, ButtonV3DTO buttonV3DTO, String str, boolean z11, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = insuranceCarouselCardDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = insuranceCarouselCardDTO.subtitleText;
            }
            if ((i11 & 4) != 0) {
                priceDTO = insuranceCarouselCardDTO.subtitlePrice;
            }
            if ((i11 & 8) != 0) {
                list = insuranceCarouselCardDTO.benefits;
            }
            if ((i11 & 16) != 0) {
                badgeDTO = insuranceCarouselCardDTO.badge;
            }
            if ((i11 & 32) != 0) {
                buttonV3DTO = insuranceCarouselCardDTO.button;
            }
            if ((i11 & 64) != 0) {
                str = insuranceCarouselCardDTO.borderColor;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                z11 = insuranceCarouselCardDTO.isSelected;
            }
            if ((i11 & 256) != 0) {
                commonControlSettings = insuranceCarouselCardDTO.common;
            }
            boolean z12 = z11;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            String str2 = str;
            BadgeDTO badgeDTO2 = badgeDTO;
            PriceDTO priceDTO2 = priceDTO;
            return insuranceCarouselCardDTO.copy(textDTO, textDTO2, priceDTO2, list, badgeDTO2, buttonV3DTO2, str2, z12, commonControlSettings2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitleText() {
            return this.subtitleText;
        }

        /* renamed from: component3, reason: from getter */
        public final PriceDTO getSubtitlePrice() {
            return this.subtitlePrice;
        }

        @NotNull
        public final List<CellDTO> component4() {
            return this.benefits;
        }

        /* renamed from: component5, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        /* renamed from: component7, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component9, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final InsuranceCarouselCardDTO copy(@NotNull TextDTO title, TextDTO subtitleText, PriceDTO subtitlePrice, @NotNull List<CellDTO> benefits, BadgeDTO badge, @NotNull ButtonV3DTO button, String borderColor, boolean isSelected, @NotNull CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(common, "common");
            return new InsuranceCarouselCardDTO(title, subtitleText, subtitlePrice, benefits, badge, button, borderColor, isSelected, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InsuranceCarouselCardDTO)) {
                return false;
            }
            InsuranceCarouselCardDTO insuranceCarouselCardDTO = (InsuranceCarouselCardDTO) other;
            return Intrinsics.d(this.title, insuranceCarouselCardDTO.title) && Intrinsics.d(this.subtitleText, insuranceCarouselCardDTO.subtitleText) && Intrinsics.d(this.subtitlePrice, insuranceCarouselCardDTO.subtitlePrice) && Intrinsics.d(this.benefits, insuranceCarouselCardDTO.benefits) && Intrinsics.d(this.badge, insuranceCarouselCardDTO.badge) && Intrinsics.d(this.button, insuranceCarouselCardDTO.button) && Intrinsics.d(this.borderColor, insuranceCarouselCardDTO.borderColor) && this.isSelected == insuranceCarouselCardDTO.isSelected && Intrinsics.d(this.common, insuranceCarouselCardDTO.common);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final List<CellDTO> getBenefits() {
            return this.benefits;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        @NotNull
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final PriceDTO getSubtitlePrice() {
            return this.subtitlePrice;
        }

        public final TextDTO getSubtitleText() {
            return this.subtitleText;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextDTO textDTO = this.subtitleText;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            PriceDTO priceDTO = this.subtitlePrice;
            int b11 = g.b((hashCode2 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31, 31, this.benefits);
            BadgeDTO badgeDTO = this.badge;
            int c11 = C2859b.c(this.button, (b11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31);
            String str = this.borderColor;
            return this.common.hashCode() + C3532b.a((c11 + (str != null ? str.hashCode() : 0)) * 31, 31, this.isSelected);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitleText;
            PriceDTO priceDTO = this.subtitlePrice;
            List<CellDTO> list = this.benefits;
            BadgeDTO badgeDTO = this.badge;
            ButtonV3DTO buttonV3DTO = this.button;
            String str = this.borderColor;
            boolean z11 = this.isSelected;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder g10 = D3.g.g("InsuranceCarouselCardDTO(title=", textDTO, ", subtitleText=", textDTO2, ", subtitlePrice=");
            g10.append(priceDTO);
            g10.append(", benefits=");
            g10.append(list);
            g10.append(", badge=");
            g10.append(badgeDTO);
            g10.append(", button=");
            g10.append(buttonV3DTO);
            g10.append(", borderColor=");
            C2880a.c(str, ", isSelected=", ", common=", g10, z11);
            return b.g(g10, commonControlSettings, ")");
        }
    }

    public InsuranceCarouselDTO(ImageDTO imageDTO, @NotNull TextDTO title, TextDTO textDTO, @NotNull List<InsuranceCarouselCardDTO> insurances, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(insurances, "insurances");
        this.logoImage = imageDTO;
        this.title = title;
        this.subtitle = textDTO;
        this.insurances = insurances;
        this.testInfo = testInfo;
        this.viewTracking = map;
    }

    public static /* synthetic */ InsuranceCarouselDTO copy$default(InsuranceCarouselDTO insuranceCarouselDTO, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, List list, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = insuranceCarouselDTO.logoImage;
        }
        if ((i11 & 2) != 0) {
            textDTO = insuranceCarouselDTO.title;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = insuranceCarouselDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            list = insuranceCarouselDTO.insurances;
        }
        if ((i11 & 16) != 0) {
            testInfo = insuranceCarouselDTO.testInfo;
        }
        if ((i11 & 32) != 0) {
            map = insuranceCarouselDTO.viewTracking;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        return insuranceCarouselDTO.copy(imageDTO, textDTO, textDTO2, list, testInfo2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageDTO getLogoImage() {
        return this.logoImage;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<InsuranceCarouselCardDTO> component4() {
        return this.insurances;
    }

    /* renamed from: component5, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.viewTracking;
    }

    @NotNull
    public final InsuranceCarouselDTO copy(ImageDTO logoImage, @NotNull TextDTO title, TextDTO subtitle, @NotNull List<InsuranceCarouselCardDTO> insurances, TestInfo testInfo, Map<String, TokenizedTrackingInfo> viewTracking) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(insurances, "insurances");
        return new InsuranceCarouselDTO(logoImage, title, subtitle, insurances, testInfo, viewTracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsuranceCarouselDTO)) {
            return false;
        }
        InsuranceCarouselDTO insuranceCarouselDTO = (InsuranceCarouselDTO) other;
        return Intrinsics.d(this.logoImage, insuranceCarouselDTO.logoImage) && Intrinsics.d(this.title, insuranceCarouselDTO.title) && Intrinsics.d(this.subtitle, insuranceCarouselDTO.subtitle) && Intrinsics.d(this.insurances, insuranceCarouselDTO.insurances) && Intrinsics.d(this.testInfo, insuranceCarouselDTO.testInfo) && Intrinsics.d(this.viewTracking, insuranceCarouselDTO.viewTracking);
    }

    @NotNull
    public final List<InsuranceCarouselCardDTO> getInsurances() {
        return this.insurances;
    }

    public final ImageDTO getLogoImage() {
        return this.logoImage;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTracking() {
        return this.viewTracking;
    }

    public int hashCode() {
        ImageDTO imageDTO = this.logoImage;
        int a11 = Ns.b.a(this.title, (imageDTO == null ? 0 : imageDTO.hashCode()) * 31, 31);
        TextDTO textDTO = this.subtitle;
        int b11 = g.b((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.insurances);
        TestInfo testInfo = this.testInfo;
        int hashCode = (b11 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.viewTracking;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.logoImage;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<InsuranceCarouselCardDTO> list = this.insurances;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.viewTracking;
        StringBuilder d11 = C2616s.d("InsuranceCarouselDTO(logoImage=", imageDTO, ", title=", textDTO, ", subtitle=");
        a.e(d11, textDTO2, ", insurances=", list, ", testInfo=");
        return C2639a.a(", viewTracking=", ")", d11, map, testInfo);
    }
}
