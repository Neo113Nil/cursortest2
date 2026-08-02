package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.data;

import D40.d;
import G.g;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u000256Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003J{\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/data/TravelTrainSeatInfoV2DTO;", "", "type", "Lru/ozon/uni/atoms/data/text/TextDTO;", "serviceType", "carriageNumber", "seatsCount", "seatsDetailed", "selectionTitle", "seatPrices", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/data/TravelTrainSeatInfoV2DTO$SeatPriceDTO;", "seatDiscount", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/data/TravelTrainSeatInfoV2DTO$SeatDiscountDTO;", "annotation", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "typeBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/data/TravelTrainSeatInfoV2DTO$SeatDiscountDTO;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getType", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getServiceType", "getCarriageNumber", "getSeatsCount", "getSeatsDetailed", "getSelectionTitle", "getSeatPrices", "()Ljava/util/List;", "getSeatDiscount", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/data/TravelTrainSeatInfoV2DTO$SeatDiscountDTO;", "getAnnotation", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getTypeBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SeatPriceDTO", "SeatDiscountDTO", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelTrainSeatInfoV2DTO {
    public static final int $stable = 8;
    private final DisclaimerDTO annotation;

    @NotNull
    private final TextDTO carriageNumber;
    private final SeatDiscountDTO seatDiscount;

    @NotNull
    private final List<SeatPriceDTO> seatPrices;

    @NotNull
    private final TextDTO seatsCount;

    @NotNull
    private final TextDTO seatsDetailed;

    @NotNull
    private final TextDTO selectionTitle;
    private final TextDTO serviceType;

    @NotNull
    private final TextDTO type;
    private final BadgeDTO typeBadge;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/data/TravelTrainSeatInfoV2DTO$SeatDiscountDTO;", "", "discountIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "discount", "Lru/ozon/uni/atoms/data/text/TextDTO;", "infoIcon", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getDiscountIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getDiscount", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getInfoIcon", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatDiscountDTO {
        public static final int $stable = IconButtonV3DTO.$stable | IconDTO.$stable;

        @NotNull
        private final TextDTO discount;

        @NotNull
        private final IconDTO discountIcon;

        @NotNull
        private final IconButtonV3DTO infoIcon;

        public SeatDiscountDTO(@NotNull IconDTO discountIcon, @NotNull TextDTO discount, @NotNull IconButtonV3DTO infoIcon) {
            Intrinsics.checkNotNullParameter(discountIcon, "discountIcon");
            Intrinsics.checkNotNullParameter(discount, "discount");
            Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
            this.discountIcon = discountIcon;
            this.discount = discount;
            this.infoIcon = infoIcon;
        }

        public static /* synthetic */ SeatDiscountDTO copy$default(SeatDiscountDTO seatDiscountDTO, IconDTO iconDTO, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = seatDiscountDTO.discountIcon;
            }
            if ((i11 & 2) != 0) {
                textDTO = seatDiscountDTO.discount;
            }
            if ((i11 & 4) != 0) {
                iconButtonV3DTO = seatDiscountDTO.infoIcon;
            }
            return seatDiscountDTO.copy(iconDTO, textDTO, iconButtonV3DTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getDiscountIcon() {
            return this.discountIcon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getDiscount() {
            return this.discount;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final IconButtonV3DTO getInfoIcon() {
            return this.infoIcon;
        }

        @NotNull
        public final SeatDiscountDTO copy(@NotNull IconDTO discountIcon, @NotNull TextDTO discount, @NotNull IconButtonV3DTO infoIcon) {
            Intrinsics.checkNotNullParameter(discountIcon, "discountIcon");
            Intrinsics.checkNotNullParameter(discount, "discount");
            Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
            return new SeatDiscountDTO(discountIcon, discount, infoIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeatDiscountDTO)) {
                return false;
            }
            SeatDiscountDTO seatDiscountDTO = (SeatDiscountDTO) other;
            return Intrinsics.d(this.discountIcon, seatDiscountDTO.discountIcon) && Intrinsics.d(this.discount, seatDiscountDTO.discount) && Intrinsics.d(this.infoIcon, seatDiscountDTO.infoIcon);
        }

        @NotNull
        public final TextDTO getDiscount() {
            return this.discount;
        }

        @NotNull
        public final IconDTO getDiscountIcon() {
            return this.discountIcon;
        }

        @NotNull
        public final IconButtonV3DTO getInfoIcon() {
            return this.infoIcon;
        }

        public int hashCode() {
            return this.infoIcon.hashCode() + b.a(this.discount, this.discountIcon.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.discountIcon;
            TextDTO textDTO = this.discount;
            IconButtonV3DTO iconButtonV3DTO = this.infoIcon;
            StringBuilder i11 = Bi.b.i("SeatDiscountDTO(discountIcon=", ", discount=", ", infoIcon=", iconDTO, textDTO);
            i11.append(iconButtonV3DTO);
            i11.append(")");
            return i11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/data/TravelTrainSeatInfoV2DTO$SeatPriceDTO;", "", "price", "Lru/ozon/uni/atoms/data/text/TextDTO;", "color", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "getPrice", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatPriceDTO {
        public static final int $stable = 0;

        @NotNull
        private final String color;

        @NotNull
        private final TextDTO price;

        public SeatPriceDTO(@NotNull TextDTO price, @NotNull String color) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(color, "color");
            this.price = price;
            this.color = color;
        }

        public static /* synthetic */ SeatPriceDTO copy$default(SeatPriceDTO seatPriceDTO, TextDTO textDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = seatPriceDTO.price;
            }
            if ((i11 & 2) != 0) {
                str = seatPriceDTO.color;
            }
            return seatPriceDTO.copy(textDTO, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getPrice() {
            return this.price;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final SeatPriceDTO copy(@NotNull TextDTO price, @NotNull String color) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(color, "color");
            return new SeatPriceDTO(price, color);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeatPriceDTO)) {
                return false;
            }
            SeatPriceDTO seatPriceDTO = (SeatPriceDTO) other;
            return Intrinsics.d(this.price, seatPriceDTO.price) && Intrinsics.d(this.color, seatPriceDTO.color);
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final TextDTO getPrice() {
            return this.price;
        }

        public int hashCode() {
            return this.color.hashCode() + (this.price.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "SeatPriceDTO(price=" + this.price + ", color=" + this.color + ")";
        }
    }

    public TravelTrainSeatInfoV2DTO(@NotNull TextDTO type, TextDTO textDTO, @NotNull TextDTO carriageNumber, @NotNull TextDTO seatsCount, @NotNull TextDTO seatsDetailed, @NotNull TextDTO selectionTitle, @NotNull List<SeatPriceDTO> seatPrices, SeatDiscountDTO seatDiscountDTO, DisclaimerDTO disclaimerDTO, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(carriageNumber, "carriageNumber");
        Intrinsics.checkNotNullParameter(seatsCount, "seatsCount");
        Intrinsics.checkNotNullParameter(seatsDetailed, "seatsDetailed");
        Intrinsics.checkNotNullParameter(selectionTitle, "selectionTitle");
        Intrinsics.checkNotNullParameter(seatPrices, "seatPrices");
        this.type = type;
        this.serviceType = textDTO;
        this.carriageNumber = carriageNumber;
        this.seatsCount = seatsCount;
        this.seatsDetailed = seatsDetailed;
        this.selectionTitle = selectionTitle;
        this.seatPrices = seatPrices;
        this.seatDiscount = seatDiscountDTO;
        this.annotation = disclaimerDTO;
        this.typeBadge = badgeDTO;
    }

    public static /* synthetic */ TravelTrainSeatInfoV2DTO copy$default(TravelTrainSeatInfoV2DTO travelTrainSeatInfoV2DTO, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, TextDTO textDTO4, TextDTO textDTO5, TextDTO textDTO6, List list, SeatDiscountDTO seatDiscountDTO, DisclaimerDTO disclaimerDTO, BadgeDTO badgeDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = travelTrainSeatInfoV2DTO.type;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = travelTrainSeatInfoV2DTO.serviceType;
        }
        if ((i11 & 4) != 0) {
            textDTO3 = travelTrainSeatInfoV2DTO.carriageNumber;
        }
        if ((i11 & 8) != 0) {
            textDTO4 = travelTrainSeatInfoV2DTO.seatsCount;
        }
        if ((i11 & 16) != 0) {
            textDTO5 = travelTrainSeatInfoV2DTO.seatsDetailed;
        }
        if ((i11 & 32) != 0) {
            textDTO6 = travelTrainSeatInfoV2DTO.selectionTitle;
        }
        if ((i11 & 64) != 0) {
            list = travelTrainSeatInfoV2DTO.seatPrices;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            seatDiscountDTO = travelTrainSeatInfoV2DTO.seatDiscount;
        }
        if ((i11 & 256) != 0) {
            disclaimerDTO = travelTrainSeatInfoV2DTO.annotation;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            badgeDTO = travelTrainSeatInfoV2DTO.typeBadge;
        }
        DisclaimerDTO disclaimerDTO2 = disclaimerDTO;
        BadgeDTO badgeDTO2 = badgeDTO;
        List list2 = list;
        SeatDiscountDTO seatDiscountDTO2 = seatDiscountDTO;
        TextDTO textDTO7 = textDTO5;
        TextDTO textDTO8 = textDTO6;
        return travelTrainSeatInfoV2DTO.copy(textDTO, textDTO2, textDTO3, textDTO4, textDTO7, textDTO8, list2, seatDiscountDTO2, disclaimerDTO2, badgeDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getType() {
        return this.type;
    }

    /* renamed from: component10, reason: from getter */
    public final BadgeDTO getTypeBadge() {
        return this.typeBadge;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getServiceType() {
        return this.serviceType;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getCarriageNumber() {
        return this.carriageNumber;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextDTO getSeatsCount() {
        return this.seatsCount;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final TextDTO getSeatsDetailed() {
        return this.seatsDetailed;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final TextDTO getSelectionTitle() {
        return this.selectionTitle;
    }

    @NotNull
    public final List<SeatPriceDTO> component7() {
        return this.seatPrices;
    }

    /* renamed from: component8, reason: from getter */
    public final SeatDiscountDTO getSeatDiscount() {
        return this.seatDiscount;
    }

    /* renamed from: component9, reason: from getter */
    public final DisclaimerDTO getAnnotation() {
        return this.annotation;
    }

    @NotNull
    public final TravelTrainSeatInfoV2DTO copy(@NotNull TextDTO type, TextDTO serviceType, @NotNull TextDTO carriageNumber, @NotNull TextDTO seatsCount, @NotNull TextDTO seatsDetailed, @NotNull TextDTO selectionTitle, @NotNull List<SeatPriceDTO> seatPrices, SeatDiscountDTO seatDiscount, DisclaimerDTO annotation, BadgeDTO typeBadge) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(carriageNumber, "carriageNumber");
        Intrinsics.checkNotNullParameter(seatsCount, "seatsCount");
        Intrinsics.checkNotNullParameter(seatsDetailed, "seatsDetailed");
        Intrinsics.checkNotNullParameter(selectionTitle, "selectionTitle");
        Intrinsics.checkNotNullParameter(seatPrices, "seatPrices");
        return new TravelTrainSeatInfoV2DTO(type, serviceType, carriageNumber, seatsCount, seatsDetailed, selectionTitle, seatPrices, seatDiscount, annotation, typeBadge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelTrainSeatInfoV2DTO)) {
            return false;
        }
        TravelTrainSeatInfoV2DTO travelTrainSeatInfoV2DTO = (TravelTrainSeatInfoV2DTO) other;
        return Intrinsics.d(this.type, travelTrainSeatInfoV2DTO.type) && Intrinsics.d(this.serviceType, travelTrainSeatInfoV2DTO.serviceType) && Intrinsics.d(this.carriageNumber, travelTrainSeatInfoV2DTO.carriageNumber) && Intrinsics.d(this.seatsCount, travelTrainSeatInfoV2DTO.seatsCount) && Intrinsics.d(this.seatsDetailed, travelTrainSeatInfoV2DTO.seatsDetailed) && Intrinsics.d(this.selectionTitle, travelTrainSeatInfoV2DTO.selectionTitle) && Intrinsics.d(this.seatPrices, travelTrainSeatInfoV2DTO.seatPrices) && Intrinsics.d(this.seatDiscount, travelTrainSeatInfoV2DTO.seatDiscount) && Intrinsics.d(this.annotation, travelTrainSeatInfoV2DTO.annotation) && Intrinsics.d(this.typeBadge, travelTrainSeatInfoV2DTO.typeBadge);
    }

    public final DisclaimerDTO getAnnotation() {
        return this.annotation;
    }

    @NotNull
    public final TextDTO getCarriageNumber() {
        return this.carriageNumber;
    }

    public final SeatDiscountDTO getSeatDiscount() {
        return this.seatDiscount;
    }

    @NotNull
    public final List<SeatPriceDTO> getSeatPrices() {
        return this.seatPrices;
    }

    @NotNull
    public final TextDTO getSeatsCount() {
        return this.seatsCount;
    }

    @NotNull
    public final TextDTO getSeatsDetailed() {
        return this.seatsDetailed;
    }

    @NotNull
    public final TextDTO getSelectionTitle() {
        return this.selectionTitle;
    }

    public final TextDTO getServiceType() {
        return this.serviceType;
    }

    @NotNull
    public final TextDTO getType() {
        return this.type;
    }

    public final BadgeDTO getTypeBadge() {
        return this.typeBadge;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        TextDTO textDTO = this.serviceType;
        int b11 = g.b(b.a(this.selectionTitle, b.a(this.seatsDetailed, b.a(this.seatsCount, b.a(this.carriageNumber, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31), 31), 31), 31), 31, this.seatPrices);
        SeatDiscountDTO seatDiscountDTO = this.seatDiscount;
        int hashCode2 = (b11 + (seatDiscountDTO == null ? 0 : seatDiscountDTO.hashCode())) * 31;
        DisclaimerDTO disclaimerDTO = this.annotation;
        int hashCode3 = (hashCode2 + (disclaimerDTO == null ? 0 : disclaimerDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.typeBadge;
        return hashCode3 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.type;
        TextDTO textDTO2 = this.serviceType;
        TextDTO textDTO3 = this.carriageNumber;
        TextDTO textDTO4 = this.seatsCount;
        TextDTO textDTO5 = this.seatsDetailed;
        TextDTO textDTO6 = this.selectionTitle;
        List<SeatPriceDTO> list = this.seatPrices;
        SeatDiscountDTO seatDiscountDTO = this.seatDiscount;
        DisclaimerDTO disclaimerDTO = this.annotation;
        BadgeDTO badgeDTO = this.typeBadge;
        StringBuilder g10 = D3.g.g("TravelTrainSeatInfoV2DTO(type=", textDTO, ", serviceType=", textDTO2, ", carriageNumber=");
        d.e(", seatsCount=", ", seatsDetailed=", g10, textDTO3, textDTO4);
        d.e(", selectionTitle=", ", seatPrices=", g10, textDTO5, textDTO6);
        g10.append(list);
        g10.append(", seatDiscount=");
        g10.append(seatDiscountDTO);
        g10.append(", annotation=");
        g10.append(disclaimerDTO);
        g10.append(", typeBadge=");
        g10.append(badgeDTO);
        g10.append(")");
        return g10.toString();
    }
}
