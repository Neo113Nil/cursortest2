package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.presentation;

import G.g;
import Ns.b;
import TY.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00029:Bm\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b(\u0010'R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b)\u0010'R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b*\u0010'R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b+\u0010'R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b,\u0010'R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/presentation/TravelTrainSeatInfoV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "type", "serviceType", "carriageNumber", "seatsCount", "seatsDetailed", "selectionTitle", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/presentation/TravelTrainSeatInfoV2VO$SeatPriceVO;", "seatPrices", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/presentation/TravelTrainSeatInfoV2VO$SeatDiscountVO;", "seatDiscount", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "annotation", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "typeBadge", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/presentation/TravelTrainSeatInfoV2VO$SeatDiscountVO;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getType", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getServiceType", "getCarriageNumber", "getSeatsCount", "getSeatsDetailed", "getSelectionTitle", "Ljava/util/List;", "getSeatPrices", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/presentation/TravelTrainSeatInfoV2VO$SeatDiscountVO;", "getSeatDiscount", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/presentation/TravelTrainSeatInfoV2VO$SeatDiscountVO;", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getAnnotation", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTypeBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "SeatPriceVO", "SeatDiscountVO", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelTrainSeatInfoV2VO implements c {
    private final DisclaimerDTO annotation;

    @NotNull
    private final TextDTO carriageNumber;
    private final long id;
    private final SeatDiscountVO seatDiscount;

    @NotNull
    private final List<SeatPriceVO> seatPrices;

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

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/presentation/TravelTrainSeatInfoV2VO$SeatDiscountVO;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "discountIcon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "discount", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "infoIcon", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getDiscountIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getDiscount", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getInfoIcon", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatDiscountVO {
        public static final int $stable = IconButtonV3DTO.$stable | IconDTO.$stable;

        @NotNull
        private final TextDTO discount;

        @NotNull
        private final IconDTO discountIcon;

        @NotNull
        private final IconButtonV3DTO infoIcon;

        public SeatDiscountVO(@NotNull IconDTO discountIcon, @NotNull TextDTO discount, @NotNull IconButtonV3DTO infoIcon) {
            Intrinsics.checkNotNullParameter(discountIcon, "discountIcon");
            Intrinsics.checkNotNullParameter(discount, "discount");
            Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
            this.discountIcon = discountIcon;
            this.discount = discount;
            this.infoIcon = infoIcon;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeatDiscountVO)) {
                return false;
            }
            SeatDiscountVO seatDiscountVO = (SeatDiscountVO) other;
            return Intrinsics.d(this.discountIcon, seatDiscountVO.discountIcon) && Intrinsics.d(this.discount, seatDiscountVO.discount) && Intrinsics.d(this.infoIcon, seatDiscountVO.infoIcon);
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
            StringBuilder i11 = Bi.b.i("SeatDiscountVO(discountIcon=", ", discount=", ", infoIcon=", iconDTO, textDTO);
            i11.append(iconButtonV3DTO);
            i11.append(")");
            return i11.toString();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/presentation/TravelTrainSeatInfoV2VO$SeatPriceVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "", "color", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getColor", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatPriceVO {

        @NotNull
        private final String color;

        @NotNull
        private final TextDTO price;

        public SeatPriceVO(@NotNull TextDTO price, @NotNull String color) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(color, "color");
            this.price = price;
            this.color = color;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeatPriceVO)) {
                return false;
            }
            SeatPriceVO seatPriceVO = (SeatPriceVO) other;
            return Intrinsics.d(this.price, seatPriceVO.price) && Intrinsics.d(this.color, seatPriceVO.color);
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
            return "SeatPriceVO(price=" + this.price + ", color=" + this.color + ")";
        }
    }

    public TravelTrainSeatInfoV2VO(long j11, @NotNull TextDTO type, TextDTO textDTO, @NotNull TextDTO carriageNumber, @NotNull TextDTO seatsCount, @NotNull TextDTO seatsDetailed, @NotNull TextDTO selectionTitle, @NotNull List<SeatPriceVO> seatPrices, SeatDiscountVO seatDiscountVO, DisclaimerDTO disclaimerDTO, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(carriageNumber, "carriageNumber");
        Intrinsics.checkNotNullParameter(seatsCount, "seatsCount");
        Intrinsics.checkNotNullParameter(seatsDetailed, "seatsDetailed");
        Intrinsics.checkNotNullParameter(selectionTitle, "selectionTitle");
        Intrinsics.checkNotNullParameter(seatPrices, "seatPrices");
        this.id = j11;
        this.type = type;
        this.serviceType = textDTO;
        this.carriageNumber = carriageNumber;
        this.seatsCount = seatsCount;
        this.seatsDetailed = seatsDetailed;
        this.selectionTitle = selectionTitle;
        this.seatPrices = seatPrices;
        this.seatDiscount = seatDiscountVO;
        this.annotation = disclaimerDTO;
        this.typeBadge = badgeDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelTrainSeatInfoV2VO)) {
            return false;
        }
        TravelTrainSeatInfoV2VO travelTrainSeatInfoV2VO = (TravelTrainSeatInfoV2VO) other;
        return this.id == travelTrainSeatInfoV2VO.id && Intrinsics.d(this.type, travelTrainSeatInfoV2VO.type) && Intrinsics.d(this.serviceType, travelTrainSeatInfoV2VO.serviceType) && Intrinsics.d(this.carriageNumber, travelTrainSeatInfoV2VO.carriageNumber) && Intrinsics.d(this.seatsCount, travelTrainSeatInfoV2VO.seatsCount) && Intrinsics.d(this.seatsDetailed, travelTrainSeatInfoV2VO.seatsDetailed) && Intrinsics.d(this.selectionTitle, travelTrainSeatInfoV2VO.selectionTitle) && Intrinsics.d(this.seatPrices, travelTrainSeatInfoV2VO.seatPrices) && Intrinsics.d(this.seatDiscount, travelTrainSeatInfoV2VO.seatDiscount) && Intrinsics.d(this.annotation, travelTrainSeatInfoV2VO.annotation) && Intrinsics.d(this.typeBadge, travelTrainSeatInfoV2VO.typeBadge);
    }

    public final DisclaimerDTO getAnnotation() {
        return this.annotation;
    }

    @NotNull
    public final TextDTO getCarriageNumber() {
        return this.carriageNumber;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final SeatDiscountVO getSeatDiscount() {
        return this.seatDiscount;
    }

    @NotNull
    public final List<SeatPriceVO> getSeatPrices() {
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

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.type, Long.hashCode(this.id) * 31, 31);
        TextDTO textDTO = this.serviceType;
        int b11 = g.b(b.a(this.selectionTitle, b.a(this.seatsDetailed, b.a(this.seatsCount, b.a(this.carriageNumber, (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31), 31), 31), 31), 31, this.seatPrices);
        SeatDiscountVO seatDiscountVO = this.seatDiscount;
        int hashCode = (b11 + (seatDiscountVO == null ? 0 : seatDiscountVO.hashCode())) * 31;
        DisclaimerDTO disclaimerDTO = this.annotation;
        int hashCode2 = (hashCode + (disclaimerDTO == null ? 0 : disclaimerDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.typeBadge;
        return hashCode2 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.type;
        TextDTO textDTO2 = this.serviceType;
        TextDTO textDTO3 = this.carriageNumber;
        TextDTO textDTO4 = this.seatsCount;
        TextDTO textDTO5 = this.seatsDetailed;
        TextDTO textDTO6 = this.selectionTitle;
        List<SeatPriceVO> list = this.seatPrices;
        SeatDiscountVO seatDiscountVO = this.seatDiscount;
        DisclaimerDTO disclaimerDTO = this.annotation;
        BadgeDTO badgeDTO = this.typeBadge;
        StringBuilder b11 = a.b("TravelTrainSeatInfoV2VO(id=", j11, ", type=", textDTO);
        D3.g.i(", serviceType=", ", carriageNumber=", b11, textDTO2, textDTO3);
        D3.g.i(", seatsCount=", ", seatsDetailed=", b11, textDTO4, textDTO5);
        b11.append(", selectionTitle=");
        b11.append(textDTO6);
        b11.append(", seatPrices=");
        b11.append(list);
        b11.append(", seatDiscount=");
        b11.append(seatDiscountVO);
        b11.append(", annotation=");
        b11.append(disclaimerDTO);
        b11.append(", typeBadge=");
        b11.append(badgeDTO);
        b11.append(")");
        return b11.toString();
    }
}
