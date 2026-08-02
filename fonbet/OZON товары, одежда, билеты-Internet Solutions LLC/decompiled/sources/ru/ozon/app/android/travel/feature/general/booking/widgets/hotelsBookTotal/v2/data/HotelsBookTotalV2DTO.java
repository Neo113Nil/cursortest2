package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.data;

import B90.C2618u;
import Cm.e;
import D3.g;
import De.C2859b;
import Fm.C3051a;
import Ns.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002-.Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007HÆ\u0003Jo\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "nextButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "totalPriceDetails", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2DTO$TotalPriceDetailItemDTO;", "dividerColor", "", "agreement", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "priceDetails", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2DTO$PriceDetailItemDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/Map;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getNextButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTotalPriceDetails", "()Ljava/util/List;", "getDividerColor", "()Ljava/lang/String;", "getAgreement", "getTrackingInfo", "()Ljava/util/Map;", "getPriceDetails", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "TotalPriceDetailItemDTO", "PriceDetailItemDTO", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HotelsBookTotalV2DTO {
    private final TextDTO agreement;
    private final String dividerColor;

    @NotNull
    private final ButtonV3DTO nextButton;

    @NotNull
    private final List<PriceDetailItemDTO> priceDetails;

    @NotNull
    private final TextDTO title;
    private final List<TotalPriceDetailItemDTO> totalPriceDetails;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2DTO$PriceDetailItemDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "note", "detailsButton", "Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "infoButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "extendedPrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getNote", "getDetailsButton", "()Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "getInfoButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getExtendedPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceDetailItemDTO {
        private final BadgeDTO badge;
        private final LinkButtonDTO detailsButton;
        private final PriceDTO extendedPrice;
        private final IconButtonV3DTO infoButton;

        @NotNull
        private final TextDTO name;
        private final TextDTO note;

        @NotNull
        private final TextDTO price;

        public PriceDetailItemDTO(@NotNull TextDTO name, @NotNull TextDTO price, BadgeDTO badgeDTO, TextDTO textDTO, LinkButtonDTO linkButtonDTO, IconButtonV3DTO iconButtonV3DTO, PriceDTO priceDTO) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(price, "price");
            this.name = name;
            this.price = price;
            this.badge = badgeDTO;
            this.note = textDTO;
            this.detailsButton = linkButtonDTO;
            this.infoButton = iconButtonV3DTO;
            this.extendedPrice = priceDTO;
        }

        public static /* synthetic */ PriceDetailItemDTO copy$default(PriceDetailItemDTO priceDetailItemDTO, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, TextDTO textDTO3, LinkButtonDTO linkButtonDTO, IconButtonV3DTO iconButtonV3DTO, PriceDTO priceDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = priceDetailItemDTO.name;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = priceDetailItemDTO.price;
            }
            if ((i11 & 4) != 0) {
                badgeDTO = priceDetailItemDTO.badge;
            }
            if ((i11 & 8) != 0) {
                textDTO3 = priceDetailItemDTO.note;
            }
            if ((i11 & 16) != 0) {
                linkButtonDTO = priceDetailItemDTO.detailsButton;
            }
            if ((i11 & 32) != 0) {
                iconButtonV3DTO = priceDetailItemDTO.infoButton;
            }
            if ((i11 & 64) != 0) {
                priceDTO = priceDetailItemDTO.extendedPrice;
            }
            IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
            PriceDTO priceDTO2 = priceDTO;
            LinkButtonDTO linkButtonDTO2 = linkButtonDTO;
            BadgeDTO badgeDTO2 = badgeDTO;
            return priceDetailItemDTO.copy(textDTO, textDTO2, badgeDTO2, textDTO3, linkButtonDTO2, iconButtonV3DTO2, priceDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getPrice() {
            return this.price;
        }

        /* renamed from: component3, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getNote() {
            return this.note;
        }

        /* renamed from: component5, reason: from getter */
        public final LinkButtonDTO getDetailsButton() {
            return this.detailsButton;
        }

        /* renamed from: component6, reason: from getter */
        public final IconButtonV3DTO getInfoButton() {
            return this.infoButton;
        }

        /* renamed from: component7, reason: from getter */
        public final PriceDTO getExtendedPrice() {
            return this.extendedPrice;
        }

        @NotNull
        public final PriceDetailItemDTO copy(@NotNull TextDTO name, @NotNull TextDTO price, BadgeDTO badge, TextDTO note, LinkButtonDTO detailsButton, IconButtonV3DTO infoButton, PriceDTO extendedPrice) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(price, "price");
            return new PriceDetailItemDTO(name, price, badge, note, detailsButton, infoButton, extendedPrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceDetailItemDTO)) {
                return false;
            }
            PriceDetailItemDTO priceDetailItemDTO = (PriceDetailItemDTO) other;
            return Intrinsics.d(this.name, priceDetailItemDTO.name) && Intrinsics.d(this.price, priceDetailItemDTO.price) && Intrinsics.d(this.badge, priceDetailItemDTO.badge) && Intrinsics.d(this.note, priceDetailItemDTO.note) && Intrinsics.d(this.detailsButton, priceDetailItemDTO.detailsButton) && Intrinsics.d(this.infoButton, priceDetailItemDTO.infoButton) && Intrinsics.d(this.extendedPrice, priceDetailItemDTO.extendedPrice);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final LinkButtonDTO getDetailsButton() {
            return this.detailsButton;
        }

        public final PriceDTO getExtendedPrice() {
            return this.extendedPrice;
        }

        public final IconButtonV3DTO getInfoButton() {
            return this.infoButton;
        }

        @NotNull
        public final TextDTO getName() {
            return this.name;
        }

        public final TextDTO getNote() {
            return this.note;
        }

        @NotNull
        public final TextDTO getPrice() {
            return this.price;
        }

        public int hashCode() {
            int a11 = b.a(this.price, this.name.hashCode() * 31, 31);
            BadgeDTO badgeDTO = this.badge;
            int hashCode = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            TextDTO textDTO = this.note;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            LinkButtonDTO linkButtonDTO = this.detailsButton;
            int hashCode3 = (hashCode2 + (linkButtonDTO == null ? 0 : linkButtonDTO.hashCode())) * 31;
            IconButtonV3DTO iconButtonV3DTO = this.infoButton;
            int hashCode4 = (hashCode3 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
            PriceDTO priceDTO = this.extendedPrice;
            return hashCode4 + (priceDTO != null ? priceDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.name;
            TextDTO textDTO2 = this.price;
            BadgeDTO badgeDTO = this.badge;
            TextDTO textDTO3 = this.note;
            LinkButtonDTO linkButtonDTO = this.detailsButton;
            IconButtonV3DTO iconButtonV3DTO = this.infoButton;
            PriceDTO priceDTO = this.extendedPrice;
            StringBuilder g10 = g.g("PriceDetailItemDTO(name=", textDTO, ", price=", textDTO2, ", badge=");
            g10.append(badgeDTO);
            g10.append(", note=");
            g10.append(textDTO3);
            g10.append(", detailsButton=");
            g10.append(linkButtonDTO);
            g10.append(", infoButton=");
            g10.append(iconButtonV3DTO);
            g10.append(", extendedPrice=");
            g10.append(priceDTO);
            g10.append(")");
            return g10.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JM\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2DTO$TotalPriceDetailItemDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "infoIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "infoIconAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "note", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getInfoIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getInfoIconAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getNote", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TotalPriceDetailItemDTO {
        private final CommonControlSettings common;
        private final IconDTO infoIcon;
        private final AtomActionDTO infoIconAction;

        @NotNull
        private final TextDTO name;
        private final TextDTO note;

        @NotNull
        private final PriceDTO price;

        public TotalPriceDetailItemDTO(@NotNull TextDTO name, @NotNull PriceDTO price, IconDTO iconDTO, AtomActionDTO atomActionDTO, TextDTO textDTO, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(price, "price");
            this.name = name;
            this.price = price;
            this.infoIcon = iconDTO;
            this.infoIconAction = atomActionDTO;
            this.note = textDTO;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ TotalPriceDetailItemDTO copy$default(TotalPriceDetailItemDTO totalPriceDetailItemDTO, TextDTO textDTO, PriceDTO priceDTO, IconDTO iconDTO, AtomActionDTO atomActionDTO, TextDTO textDTO2, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = totalPriceDetailItemDTO.name;
            }
            if ((i11 & 2) != 0) {
                priceDTO = totalPriceDetailItemDTO.price;
            }
            if ((i11 & 4) != 0) {
                iconDTO = totalPriceDetailItemDTO.infoIcon;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = totalPriceDetailItemDTO.infoIconAction;
            }
            if ((i11 & 16) != 0) {
                textDTO2 = totalPriceDetailItemDTO.note;
            }
            if ((i11 & 32) != 0) {
                commonControlSettings = totalPriceDetailItemDTO.common;
            }
            TextDTO textDTO3 = textDTO2;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            return totalPriceDetailItemDTO.copy(textDTO, priceDTO, iconDTO, atomActionDTO, textDTO3, commonControlSettings2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        /* renamed from: component3, reason: from getter */
        public final IconDTO getInfoIcon() {
            return this.infoIcon;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getInfoIconAction() {
            return this.infoIconAction;
        }

        /* renamed from: component5, reason: from getter */
        public final TextDTO getNote() {
            return this.note;
        }

        /* renamed from: component6, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final TotalPriceDetailItemDTO copy(@NotNull TextDTO name, @NotNull PriceDTO price, IconDTO infoIcon, AtomActionDTO infoIconAction, TextDTO note, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(price, "price");
            return new TotalPriceDetailItemDTO(name, price, infoIcon, infoIconAction, note, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TotalPriceDetailItemDTO)) {
                return false;
            }
            TotalPriceDetailItemDTO totalPriceDetailItemDTO = (TotalPriceDetailItemDTO) other;
            return Intrinsics.d(this.name, totalPriceDetailItemDTO.name) && Intrinsics.d(this.price, totalPriceDetailItemDTO.price) && Intrinsics.d(this.infoIcon, totalPriceDetailItemDTO.infoIcon) && Intrinsics.d(this.infoIconAction, totalPriceDetailItemDTO.infoIconAction) && Intrinsics.d(this.note, totalPriceDetailItemDTO.note) && Intrinsics.d(this.common, totalPriceDetailItemDTO.common);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final IconDTO getInfoIcon() {
            return this.infoIcon;
        }

        public final AtomActionDTO getInfoIconAction() {
            return this.infoIconAction;
        }

        @NotNull
        public final TextDTO getName() {
            return this.name;
        }

        public final TextDTO getNote() {
            return this.note;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        public int hashCode() {
            int b11 = C3051a.b(this.price, this.name.hashCode() * 31, 31);
            IconDTO iconDTO = this.infoIcon;
            int hashCode = (b11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.infoIconAction;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            TextDTO textDTO = this.note;
            int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode3 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TotalPriceDetailItemDTO(name=" + this.name + ", price=" + this.price + ", infoIcon=" + this.infoIcon + ", infoIconAction=" + this.infoIconAction + ", note=" + this.note + ", common=" + this.common + ")";
        }
    }

    public HotelsBookTotalV2DTO(@NotNull TextDTO title, @NotNull ButtonV3DTO nextButton, List<TotalPriceDetailItemDTO> list, String str, TextDTO textDTO, Map<String, TokenizedTrackingInfo> map, @NotNull List<PriceDetailItemDTO> priceDetails) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        Intrinsics.checkNotNullParameter(priceDetails, "priceDetails");
        this.title = title;
        this.nextButton = nextButton;
        this.totalPriceDetails = list;
        this.dividerColor = str;
        this.agreement = textDTO;
        this.trackingInfo = map;
        this.priceDetails = priceDetails;
    }

    public static /* synthetic */ HotelsBookTotalV2DTO copy$default(HotelsBookTotalV2DTO hotelsBookTotalV2DTO, TextDTO textDTO, ButtonV3DTO buttonV3DTO, List list, String str, TextDTO textDTO2, Map map, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = hotelsBookTotalV2DTO.title;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = hotelsBookTotalV2DTO.nextButton;
        }
        if ((i11 & 4) != 0) {
            list = hotelsBookTotalV2DTO.totalPriceDetails;
        }
        if ((i11 & 8) != 0) {
            str = hotelsBookTotalV2DTO.dividerColor;
        }
        if ((i11 & 16) != 0) {
            textDTO2 = hotelsBookTotalV2DTO.agreement;
        }
        if ((i11 & 32) != 0) {
            map = hotelsBookTotalV2DTO.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            list2 = hotelsBookTotalV2DTO.priceDetails;
        }
        Map map2 = map;
        List list3 = list2;
        TextDTO textDTO3 = textDTO2;
        List list4 = list;
        return hotelsBookTotalV2DTO.copy(textDTO, buttonV3DTO, list4, str, textDTO3, map2, list3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getNextButton() {
        return this.nextButton;
    }

    public final List<TotalPriceDetailItemDTO> component3() {
        return this.totalPriceDetails;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDividerColor() {
        return this.dividerColor;
    }

    /* renamed from: component5, reason: from getter */
    public final TextDTO getAgreement() {
        return this.agreement;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final List<PriceDetailItemDTO> component7() {
        return this.priceDetails;
    }

    @NotNull
    public final HotelsBookTotalV2DTO copy(@NotNull TextDTO title, @NotNull ButtonV3DTO nextButton, List<TotalPriceDetailItemDTO> totalPriceDetails, String dividerColor, TextDTO agreement, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull List<PriceDetailItemDTO> priceDetails) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        Intrinsics.checkNotNullParameter(priceDetails, "priceDetails");
        return new HotelsBookTotalV2DTO(title, nextButton, totalPriceDetails, dividerColor, agreement, trackingInfo, priceDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsBookTotalV2DTO)) {
            return false;
        }
        HotelsBookTotalV2DTO hotelsBookTotalV2DTO = (HotelsBookTotalV2DTO) other;
        return Intrinsics.d(this.title, hotelsBookTotalV2DTO.title) && Intrinsics.d(this.nextButton, hotelsBookTotalV2DTO.nextButton) && Intrinsics.d(this.totalPriceDetails, hotelsBookTotalV2DTO.totalPriceDetails) && Intrinsics.d(this.dividerColor, hotelsBookTotalV2DTO.dividerColor) && Intrinsics.d(this.agreement, hotelsBookTotalV2DTO.agreement) && Intrinsics.d(this.trackingInfo, hotelsBookTotalV2DTO.trackingInfo) && Intrinsics.d(this.priceDetails, hotelsBookTotalV2DTO.priceDetails);
    }

    public final TextDTO getAgreement() {
        return this.agreement;
    }

    public final String getDividerColor() {
        return this.dividerColor;
    }

    @NotNull
    public final ButtonV3DTO getNextButton() {
        return this.nextButton;
    }

    @NotNull
    public final List<PriceDetailItemDTO> getPriceDetails() {
        return this.priceDetails;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final List<TotalPriceDetailItemDTO> getTotalPriceDetails() {
        return this.totalPriceDetails;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.nextButton, this.title.hashCode() * 31, 31);
        List<TotalPriceDetailItemDTO> list = this.totalPriceDetails;
        int hashCode = (c11 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.dividerColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        TextDTO textDTO = this.agreement;
        int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return this.priceDetails.hashCode() + ((hashCode3 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        ButtonV3DTO buttonV3DTO = this.nextButton;
        List<TotalPriceDetailItemDTO> list = this.totalPriceDetails;
        String str = this.dividerColor;
        TextDTO textDTO2 = this.agreement;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        List<PriceDetailItemDTO> list2 = this.priceDetails;
        StringBuilder sb2 = new StringBuilder("HotelsBookTotalV2DTO(title=");
        sb2.append(textDTO);
        sb2.append(", nextButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", totalPriceDetails=");
        e.i(", dividerColor=", str, ", agreement=", sb2, list);
        sb2.append(textDTO2);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", priceDetails=");
        return C2618u.h(sb2, list2, ")");
    }

    public HotelsBookTotalV2DTO(TextDTO textDTO, ButtonV3DTO buttonV3DTO, List list, String str, TextDTO textDTO2, Map map, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, buttonV3DTO, list, str, textDTO2, map, (i11 & 64) != 0 ? K.f71697a : list2);
    }
}
