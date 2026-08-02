package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.data;

import B90.C2618u;
import Kk.C3532b;
import Lh.a;
import Tl.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.data.PriceV2DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper;", "", "<init>", "()V", "Separator", "Info", "Multiplicity", "Price", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Info;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Multiplicity;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Price;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Separator;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PriceV2DtoWrapper {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Info;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper;", "", "isLastItem", "showBottomRounding", "", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$BonusInfo;", "infoCards", "<init>", "(ZZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "getShowBottomRounding", "()Ljava/lang/Boolean;", "Ljava/util/List;", "getInfoCards", "()Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Info extends PriceV2DtoWrapper {

        @NotNull
        private final List<PriceV2DTO.BonusInfo> infoCards;
        private final boolean isLastItem;
        private final boolean showBottomRounding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Info(boolean z11, boolean z12, @NotNull List<PriceV2DTO.BonusInfo> infoCards) {
            super(null);
            Intrinsics.checkNotNullParameter(infoCards, "infoCards");
            this.isLastItem = z11;
            this.showBottomRounding = z12;
            this.infoCards = infoCards;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Info)) {
                return false;
            }
            Info info = (Info) other;
            return this.isLastItem == info.isLastItem && this.showBottomRounding == info.showBottomRounding && Intrinsics.d(this.infoCards, info.infoCards);
        }

        @NotNull
        public final List<PriceV2DTO.BonusInfo> getInfoCards() {
            return this.infoCards;
        }

        @NotNull
        public Boolean getShowBottomRounding() {
            return Boolean.valueOf(this.showBottomRounding);
        }

        public int hashCode() {
            return this.infoCards.hashCode() + C3532b.a(Boolean.hashCode(this.isLastItem) * 31, 31, this.showBottomRounding);
        }

        /* renamed from: isLastItem, reason: from getter */
        public boolean getIsLastItem() {
            return this.isLastItem;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isLastItem;
            boolean z12 = this.showBottomRounding;
            return C2618u.h(a.d("Info(isLastItem=", ", showBottomRounding=", ", infoCards=", z11, z12), this.infoCards, ")");
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Multiplicity;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper;", "", "isLastItem", "showBottomRounding", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "<init>", "(ZZLru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "getShowBottomRounding", "()Ljava/lang/Boolean;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Multiplicity extends PriceV2DtoWrapper {
        private final boolean isLastItem;
        private final boolean showBottomRounding;

        @NotNull
        private final TextDTO text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Multiplicity(boolean z11, boolean z12, @NotNull TextDTO text) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.isLastItem = z11;
            this.showBottomRounding = z12;
            this.text = text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Multiplicity)) {
                return false;
            }
            Multiplicity multiplicity = (Multiplicity) other;
            return this.isLastItem == multiplicity.isLastItem && this.showBottomRounding == multiplicity.showBottomRounding && Intrinsics.d(this.text, multiplicity.text);
        }

        @NotNull
        public Boolean getShowBottomRounding() {
            return Boolean.valueOf(this.showBottomRounding);
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + C3532b.a(Boolean.hashCode(this.isLastItem) * 31, 31, this.showBottomRounding);
        }

        /* renamed from: isLastItem, reason: from getter */
        public boolean getIsLastItem() {
            return this.isLastItem;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isLastItem;
            boolean z12 = this.showBottomRounding;
            return b.e(a.d("Multiplicity(isLastItem=", ", showBottomRounding=", ", text=", z11, z12), this.text, ")");
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u0003\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Price;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper;", "", "isLastItem", "showBottomRounding", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;", "ordinaryPrice", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$OzonCardPrice;", "ozonCardPrice", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$VATPrice;", "vatPrice", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(ZZLru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$OzonCardPrice;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$VATPrice;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "getShowBottomRounding", "()Ljava/lang/Boolean;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;", "getOrdinaryPrice", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$OzonCardPrice;", "getOzonCardPrice", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$OzonCardPrice;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$VATPrice;", "getVatPrice", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$VATPrice;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Price extends PriceV2DtoWrapper {
        private final boolean isLastItem;
        private final PriceV2DTO.PriceContainer ordinaryPrice;
        private final PriceV2DTO.OzonCardPrice ozonCardPrice;
        private final boolean showBottomRounding;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final PriceV2DTO.VATPrice vatPrice;

        public Price(boolean z11, boolean z12, PriceV2DTO.PriceContainer priceContainer, PriceV2DTO.OzonCardPrice ozonCardPrice, PriceV2DTO.VATPrice vATPrice, Map<String, TokenizedTrackingInfo> map) {
            super(null);
            this.isLastItem = z11;
            this.showBottomRounding = z12;
            this.ordinaryPrice = priceContainer;
            this.ozonCardPrice = ozonCardPrice;
            this.vatPrice = vATPrice;
            this.trackingInfo = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Price)) {
                return false;
            }
            Price price = (Price) other;
            return this.isLastItem == price.isLastItem && this.showBottomRounding == price.showBottomRounding && Intrinsics.d(this.ordinaryPrice, price.ordinaryPrice) && Intrinsics.d(this.ozonCardPrice, price.ozonCardPrice) && Intrinsics.d(this.vatPrice, price.vatPrice) && Intrinsics.d(this.trackingInfo, price.trackingInfo);
        }

        public final PriceV2DTO.PriceContainer getOrdinaryPrice() {
            return this.ordinaryPrice;
        }

        public final PriceV2DTO.OzonCardPrice getOzonCardPrice() {
            return this.ozonCardPrice;
        }

        @NotNull
        public Boolean getShowBottomRounding() {
            return Boolean.valueOf(this.showBottomRounding);
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final PriceV2DTO.VATPrice getVatPrice() {
            return this.vatPrice;
        }

        public int hashCode() {
            int a11 = C3532b.a(Boolean.hashCode(this.isLastItem) * 31, 31, this.showBottomRounding);
            PriceV2DTO.PriceContainer priceContainer = this.ordinaryPrice;
            int hashCode = (a11 + (priceContainer == null ? 0 : priceContainer.hashCode())) * 31;
            PriceV2DTO.OzonCardPrice ozonCardPrice = this.ozonCardPrice;
            int hashCode2 = (hashCode + (ozonCardPrice == null ? 0 : ozonCardPrice.hashCode())) * 31;
            PriceV2DTO.VATPrice vATPrice = this.vatPrice;
            int hashCode3 = (hashCode2 + (vATPrice == null ? 0 : vATPrice.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        /* renamed from: isLastItem, reason: from getter */
        public boolean getIsLastItem() {
            return this.isLastItem;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isLastItem;
            boolean z12 = this.showBottomRounding;
            PriceV2DTO.PriceContainer priceContainer = this.ordinaryPrice;
            PriceV2DTO.OzonCardPrice ozonCardPrice = this.ozonCardPrice;
            PriceV2DTO.VATPrice vATPrice = this.vatPrice;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = a.d("Price(isLastItem=", ", showBottomRounding=", ", ordinaryPrice=", z11, z12);
            d11.append(priceContainer);
            d11.append(", ozonCardPrice=");
            d11.append(ozonCardPrice);
            d11.append(", vatPrice=");
            d11.append(vATPrice);
            d11.append(", trackingInfo=");
            d11.append(map);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Separator;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "isLastItem", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Separator extends PriceV2DtoWrapper {

        @NotNull
        public static final Separator INSTANCE = new Separator();
        private static final boolean isLastItem = true;

        private Separator() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Separator);
        }

        public int hashCode() {
            return -750938007;
        }

        @NotNull
        public String toString() {
            return "Separator";
        }
    }

    public /* synthetic */ PriceV2DtoWrapper(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PriceV2DtoWrapper() {
    }
}
