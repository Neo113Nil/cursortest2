package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation;

import G.g;
import Ns.b;
import TY.a;
import android.graphics.Bitmap;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.travel.molecules.view.priceCard.PriceCardVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002ABB\u0087\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b-\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b1\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b2\u0010+R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u00105R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r8\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b6\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010)\u001a\u0004\b7\u0010+R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010>\u001a\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "number", "type", "serviceType", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO$PriceBlockVO;", "priceBlock", "seatsCount", "seatsDetails", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", ResultDTO.CONTENT_TYPE_SERVICES, "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO$StoreyVO;", "storeys", "additionalInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "selectSeatAction", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "premiumBadge", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "originalPrice", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO$PriceBlockVO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getNumber", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getType", "getServiceType", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO$PriceBlockVO;", "getPriceBlock", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO$PriceBlockVO;", "getSeatsCount", "getSeatsDetails", "Ljava/util/List;", "getServices", "()Ljava/util/List;", "getStoreys", "getAdditionalInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "getSelectSeatAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getPremiumBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getOriginalPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "PriceBlockVO", "StoreyVO", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelCarriageSelectV3VO implements c {
    private final TextDTO additionalInfo;
    private final long id;

    @NotNull
    private final TextDTO number;
    private final PriceDTO originalPrice;
    private final BadgeDTO premiumBadge;
    private final PriceBlockVO priceBlock;

    @NotNull
    private final TextDTO seatsCount;
    private final TextDTO seatsDetails;
    private final AtomAction selectSeatAction;

    @NotNull
    private final TextDTO serviceType;

    @NotNull
    private final List<IconButtonV3DTO> services;

    @NotNull
    private final List<StoreyVO> storeys;

    @NotNull
    private final TextDTO type;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO$PriceBlockVO;", "", "Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardVO;", "discountPriceCard", "originalPriceCard", "<init>", "(Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardVO;Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardVO;", "getDiscountPriceCard", "()Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardVO;", "getOriginalPriceCard", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceBlockVO {
        public static final int $stable = PriceCardVO.$stable;

        @NotNull
        private final PriceCardVO discountPriceCard;

        @NotNull
        private final PriceCardVO originalPriceCard;

        public PriceBlockVO(@NotNull PriceCardVO discountPriceCard, @NotNull PriceCardVO originalPriceCard) {
            Intrinsics.checkNotNullParameter(discountPriceCard, "discountPriceCard");
            Intrinsics.checkNotNullParameter(originalPriceCard, "originalPriceCard");
            this.discountPriceCard = discountPriceCard;
            this.originalPriceCard = originalPriceCard;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceBlockVO)) {
                return false;
            }
            PriceBlockVO priceBlockVO = (PriceBlockVO) other;
            return Intrinsics.d(this.discountPriceCard, priceBlockVO.discountPriceCard) && Intrinsics.d(this.originalPriceCard, priceBlockVO.originalPriceCard);
        }

        @NotNull
        public final PriceCardVO getDiscountPriceCard() {
            return this.discountPriceCard;
        }

        @NotNull
        public final PriceCardVO getOriginalPriceCard() {
            return this.originalPriceCard;
        }

        public int hashCode() {
            return this.originalPriceCard.hashCode() + (this.discountPriceCard.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PriceBlockVO(discountPriceCard=" + this.discountPriceCard + ", originalPriceCard=" + this.originalPriceCard + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO$StoreyVO;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Landroid/graphics/Bitmap;", "darkSchemeImage", "Landroid/graphics/Bitmap;", "getDarkSchemeImage", "()Landroid/graphics/Bitmap;", "setDarkSchemeImage", "(Landroid/graphics/Bitmap;)V", "lightSchemeImage", "getLightSchemeImage", "setLightSchemeImage", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StoreyVO {
        private Bitmap darkSchemeImage;
        private final int id;
        private Bitmap lightSchemeImage;
        private final TextDTO name;

        public StoreyVO(int i11, TextDTO textDTO) {
            this.id = i11;
            this.name = textDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StoreyVO)) {
                return false;
            }
            StoreyVO storeyVO = (StoreyVO) other;
            return this.id == storeyVO.id && Intrinsics.d(this.name, storeyVO.name);
        }

        public final Bitmap getDarkSchemeImage() {
            return this.darkSchemeImage;
        }

        public final int getId() {
            return this.id;
        }

        public final Bitmap getLightSchemeImage() {
            return this.lightSchemeImage;
        }

        public final TextDTO getName() {
            return this.name;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.id) * 31;
            TextDTO textDTO = this.name;
            return hashCode + (textDTO == null ? 0 : textDTO.hashCode());
        }

        public final void setDarkSchemeImage(Bitmap bitmap) {
            this.darkSchemeImage = bitmap;
        }

        public final void setLightSchemeImage(Bitmap bitmap) {
            this.lightSchemeImage = bitmap;
        }

        @NotNull
        public String toString() {
            return "StoreyVO(id=" + this.id + ", name=" + this.name + ")";
        }
    }

    public TravelCarriageSelectV3VO(long j11, @NotNull TextDTO number, @NotNull TextDTO type, @NotNull TextDTO serviceType, PriceBlockVO priceBlockVO, @NotNull TextDTO seatsCount, TextDTO textDTO, @NotNull List<IconButtonV3DTO> services, @NotNull List<StoreyVO> storeys, TextDTO textDTO2, AtomAction atomAction, BadgeDTO badgeDTO, PriceDTO priceDTO) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        Intrinsics.checkNotNullParameter(seatsCount, "seatsCount");
        Intrinsics.checkNotNullParameter(services, "services");
        Intrinsics.checkNotNullParameter(storeys, "storeys");
        this.id = j11;
        this.number = number;
        this.type = type;
        this.serviceType = serviceType;
        this.priceBlock = priceBlockVO;
        this.seatsCount = seatsCount;
        this.seatsDetails = textDTO;
        this.services = services;
        this.storeys = storeys;
        this.additionalInfo = textDTO2;
        this.selectSeatAction = atomAction;
        this.premiumBadge = badgeDTO;
        this.originalPrice = priceDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelCarriageSelectV3VO)) {
            return false;
        }
        TravelCarriageSelectV3VO travelCarriageSelectV3VO = (TravelCarriageSelectV3VO) other;
        return this.id == travelCarriageSelectV3VO.id && Intrinsics.d(this.number, travelCarriageSelectV3VO.number) && Intrinsics.d(this.type, travelCarriageSelectV3VO.type) && Intrinsics.d(this.serviceType, travelCarriageSelectV3VO.serviceType) && Intrinsics.d(this.priceBlock, travelCarriageSelectV3VO.priceBlock) && Intrinsics.d(this.seatsCount, travelCarriageSelectV3VO.seatsCount) && Intrinsics.d(this.seatsDetails, travelCarriageSelectV3VO.seatsDetails) && Intrinsics.d(this.services, travelCarriageSelectV3VO.services) && Intrinsics.d(this.storeys, travelCarriageSelectV3VO.storeys) && Intrinsics.d(this.additionalInfo, travelCarriageSelectV3VO.additionalInfo) && Intrinsics.d(this.selectSeatAction, travelCarriageSelectV3VO.selectSeatAction) && Intrinsics.d(this.premiumBadge, travelCarriageSelectV3VO.premiumBadge) && Intrinsics.d(this.originalPrice, travelCarriageSelectV3VO.originalPrice);
    }

    public final TextDTO getAdditionalInfo() {
        return this.additionalInfo;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TextDTO getNumber() {
        return this.number;
    }

    public final PriceDTO getOriginalPrice() {
        return this.originalPrice;
    }

    public final BadgeDTO getPremiumBadge() {
        return this.premiumBadge;
    }

    public final PriceBlockVO getPriceBlock() {
        return this.priceBlock;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getSeatsCount() {
        return this.seatsCount;
    }

    public final TextDTO getSeatsDetails() {
        return this.seatsDetails;
    }

    public final AtomAction getSelectSeatAction() {
        return this.selectSeatAction;
    }

    @NotNull
    public final TextDTO getServiceType() {
        return this.serviceType;
    }

    @NotNull
    public final List<IconButtonV3DTO> getServices() {
        return this.services;
    }

    @NotNull
    public final List<StoreyVO> getStoreys() {
        return this.storeys;
    }

    @NotNull
    public final TextDTO getType() {
        return this.type;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.serviceType, b.a(this.type, b.a(this.number, Long.hashCode(this.id) * 31, 31), 31), 31);
        PriceBlockVO priceBlockVO = this.priceBlock;
        int a12 = b.a(this.seatsCount, (a11 + (priceBlockVO == null ? 0 : priceBlockVO.hashCode())) * 31, 31);
        TextDTO textDTO = this.seatsDetails;
        int b11 = g.b(g.b((a12 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.services), 31, this.storeys);
        TextDTO textDTO2 = this.additionalInfo;
        int hashCode = (b11 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        AtomAction atomAction = this.selectSeatAction;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        BadgeDTO badgeDTO = this.premiumBadge;
        int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        PriceDTO priceDTO = this.originalPrice;
        return hashCode3 + (priceDTO != null ? priceDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.number;
        TextDTO textDTO2 = this.type;
        TextDTO textDTO3 = this.serviceType;
        PriceBlockVO priceBlockVO = this.priceBlock;
        TextDTO textDTO4 = this.seatsCount;
        TextDTO textDTO5 = this.seatsDetails;
        List<IconButtonV3DTO> list = this.services;
        List<StoreyVO> list2 = this.storeys;
        TextDTO textDTO6 = this.additionalInfo;
        AtomAction atomAction = this.selectSeatAction;
        BadgeDTO badgeDTO = this.premiumBadge;
        PriceDTO priceDTO = this.originalPrice;
        StringBuilder b11 = a.b("TravelCarriageSelectV3VO(id=", j11, ", number=", textDTO);
        D3.g.i(", type=", ", serviceType=", b11, textDTO2, textDTO3);
        b11.append(", priceBlock=");
        b11.append(priceBlockVO);
        b11.append(", seatsCount=");
        b11.append(textDTO4);
        b11.append(", seatsDetails=");
        b11.append(textDTO5);
        b11.append(", services=");
        b11.append(list);
        b11.append(", storeys=");
        b11.append(list2);
        b11.append(", additionalInfo=");
        b11.append(textDTO6);
        b11.append(", selectSeatAction=");
        b11.append(atomAction);
        b11.append(", premiumBadge=");
        b11.append(badgeDTO);
        b11.append(", originalPrice=");
        b11.append(priceDTO);
        b11.append(")");
        return b11.toString();
    }
}
