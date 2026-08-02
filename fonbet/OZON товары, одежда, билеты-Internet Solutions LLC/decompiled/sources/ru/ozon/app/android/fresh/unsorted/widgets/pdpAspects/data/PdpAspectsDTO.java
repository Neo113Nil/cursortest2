package ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.data;

import B3.p;
import D40.d;
import Fm.C3051a;
import GR.b;
import Lh.a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002+,BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J_\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/data/PdpAspectsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "spacers", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/data/PdpAspectsDTO$SpacersDTO;", "backgroundColor", "items", "", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/data/PdpAspectsDTO$Aspect;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/Map;Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/data/PdpAspectsDTO$SpacersDTO;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getSpacers", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/data/PdpAspectsDTO$SpacersDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "SpacersDTO", "Aspect", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PdpAspectsDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final BadgeDTO badge;

    @NotNull
    private final List<Aspect> items;
    private final SpacersDTO spacers;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003JU\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/data/PdpAspectsDTO$Aspect;", "", "wrapper", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "image", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "spacers", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/data/PdpAspectsDTO$Aspect$ItemSpacersDTO;", "<init>", "(Lru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/data/PdpAspectsDTO$Aspect$ItemSpacersDTO;)V", "getWrapper", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getImage", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getSpacers", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/data/PdpAspectsDTO$Aspect$ItemSpacersDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ItemSpacersDTO", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Aspect {
        public static final int $stable = (ProductMediaDTO.$stable | PriceDTO.$stable) | AspectDTO.$stable;
        private final BadgeDTO badge;

        @NotNull
        private final ProductMediaDTO image;

        @NotNull
        private final PriceDTO price;
        private final ItemSpacersDTO spacers;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        @NotNull
        private final AspectDTO wrapper;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/data/PdpAspectsDTO$Aspect$ItemSpacersDTO;", "", "vertical", "Lru/ozon/uni/atoms/data/common/Paddings;", "horizontal", "betweenPhotoPrice", "betweenPriceTitle", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getVertical", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getHorizontal", "getBetweenPhotoPrice", "getBetweenPriceTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ItemSpacersDTO {
            public static final int $stable = 0;
            private final Paddings betweenPhotoPrice;
            private final Paddings betweenPriceTitle;
            private final Paddings horizontal;
            private final Paddings vertical;

            public ItemSpacersDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4) {
                this.vertical = paddings;
                this.horizontal = paddings2;
                this.betweenPhotoPrice = paddings3;
                this.betweenPriceTitle = paddings4;
            }

            public static /* synthetic */ ItemSpacersDTO copy$default(ItemSpacersDTO itemSpacersDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    paddings = itemSpacersDTO.vertical;
                }
                if ((i11 & 2) != 0) {
                    paddings2 = itemSpacersDTO.horizontal;
                }
                if ((i11 & 4) != 0) {
                    paddings3 = itemSpacersDTO.betweenPhotoPrice;
                }
                if ((i11 & 8) != 0) {
                    paddings4 = itemSpacersDTO.betweenPriceTitle;
                }
                return itemSpacersDTO.copy(paddings, paddings2, paddings3, paddings4);
            }

            /* renamed from: component1, reason: from getter */
            public final Paddings getVertical() {
                return this.vertical;
            }

            /* renamed from: component2, reason: from getter */
            public final Paddings getHorizontal() {
                return this.horizontal;
            }

            /* renamed from: component3, reason: from getter */
            public final Paddings getBetweenPhotoPrice() {
                return this.betweenPhotoPrice;
            }

            /* renamed from: component4, reason: from getter */
            public final Paddings getBetweenPriceTitle() {
                return this.betweenPriceTitle;
            }

            @NotNull
            public final ItemSpacersDTO copy(Paddings vertical, Paddings horizontal, Paddings betweenPhotoPrice, Paddings betweenPriceTitle) {
                return new ItemSpacersDTO(vertical, horizontal, betweenPhotoPrice, betweenPriceTitle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ItemSpacersDTO)) {
                    return false;
                }
                ItemSpacersDTO itemSpacersDTO = (ItemSpacersDTO) other;
                return this.vertical == itemSpacersDTO.vertical && this.horizontal == itemSpacersDTO.horizontal && this.betweenPhotoPrice == itemSpacersDTO.betweenPhotoPrice && this.betweenPriceTitle == itemSpacersDTO.betweenPriceTitle;
            }

            public final Paddings getBetweenPhotoPrice() {
                return this.betweenPhotoPrice;
            }

            public final Paddings getBetweenPriceTitle() {
                return this.betweenPriceTitle;
            }

            public final Paddings getHorizontal() {
                return this.horizontal;
            }

            public final Paddings getVertical() {
                return this.vertical;
            }

            public int hashCode() {
                Paddings paddings = this.vertical;
                int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
                Paddings paddings2 = this.horizontal;
                int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
                Paddings paddings3 = this.betweenPhotoPrice;
                int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
                Paddings paddings4 = this.betweenPriceTitle;
                return hashCode3 + (paddings4 != null ? paddings4.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                Paddings paddings = this.vertical;
                Paddings paddings2 = this.horizontal;
                return b.e(p.b("ItemSpacersDTO(vertical=", paddings, ", horizontal=", paddings2, ", betweenPhotoPrice="), this.betweenPhotoPrice, ", betweenPriceTitle=", this.betweenPriceTitle, ")");
            }
        }

        public Aspect(@NotNull AspectDTO wrapper, @NotNull PriceDTO price, @NotNull ProductMediaDTO image, BadgeDTO badgeDTO, @NotNull TextDTO title, TextDTO textDTO, ItemSpacersDTO itemSpacersDTO) {
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            this.wrapper = wrapper;
            this.price = price;
            this.image = image;
            this.badge = badgeDTO;
            this.title = title;
            this.subtitle = textDTO;
            this.spacers = itemSpacersDTO;
        }

        public static /* synthetic */ Aspect copy$default(Aspect aspect, AspectDTO aspectDTO, PriceDTO priceDTO, ProductMediaDTO productMediaDTO, BadgeDTO badgeDTO, TextDTO textDTO, TextDTO textDTO2, ItemSpacersDTO itemSpacersDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                aspectDTO = aspect.wrapper;
            }
            if ((i11 & 2) != 0) {
                priceDTO = aspect.price;
            }
            if ((i11 & 4) != 0) {
                productMediaDTO = aspect.image;
            }
            if ((i11 & 8) != 0) {
                badgeDTO = aspect.badge;
            }
            if ((i11 & 16) != 0) {
                textDTO = aspect.title;
            }
            if ((i11 & 32) != 0) {
                textDTO2 = aspect.subtitle;
            }
            if ((i11 & 64) != 0) {
                itemSpacersDTO = aspect.spacers;
            }
            TextDTO textDTO3 = textDTO2;
            ItemSpacersDTO itemSpacersDTO2 = itemSpacersDTO;
            TextDTO textDTO4 = textDTO;
            ProductMediaDTO productMediaDTO2 = productMediaDTO;
            return aspect.copy(aspectDTO, priceDTO, productMediaDTO2, badgeDTO, textDTO4, textDTO3, itemSpacersDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AspectDTO getWrapper() {
            return this.wrapper;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ProductMediaDTO getImage() {
            return this.image;
        }

        /* renamed from: component4, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component6, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component7, reason: from getter */
        public final ItemSpacersDTO getSpacers() {
            return this.spacers;
        }

        @NotNull
        public final Aspect copy(@NotNull AspectDTO wrapper, @NotNull PriceDTO price, @NotNull ProductMediaDTO image, BadgeDTO badge, @NotNull TextDTO title, TextDTO subtitle, ItemSpacersDTO spacers) {
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            return new Aspect(wrapper, price, image, badge, title, subtitle, spacers);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Aspect)) {
                return false;
            }
            Aspect aspect = (Aspect) other;
            return Intrinsics.d(this.wrapper, aspect.wrapper) && Intrinsics.d(this.price, aspect.price) && Intrinsics.d(this.image, aspect.image) && Intrinsics.d(this.badge, aspect.badge) && Intrinsics.d(this.title, aspect.title) && Intrinsics.d(this.subtitle, aspect.subtitle) && Intrinsics.d(this.spacers, aspect.spacers);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final ProductMediaDTO getImage() {
            return this.image;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        public final ItemSpacersDTO getSpacers() {
            return this.spacers;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final AspectDTO getWrapper() {
            return this.wrapper;
        }

        public int hashCode() {
            int hashCode = (this.image.hashCode() + C3051a.b(this.price, this.wrapper.hashCode() * 31, 31)) * 31;
            BadgeDTO badgeDTO = this.badge;
            int a11 = Ns.b.a(this.title, (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31);
            TextDTO textDTO = this.subtitle;
            int hashCode2 = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            ItemSpacersDTO itemSpacersDTO = this.spacers;
            return hashCode2 + (itemSpacersDTO != null ? itemSpacersDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            AspectDTO aspectDTO = this.wrapper;
            PriceDTO priceDTO = this.price;
            ProductMediaDTO productMediaDTO = this.image;
            BadgeDTO badgeDTO = this.badge;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            ItemSpacersDTO itemSpacersDTO = this.spacers;
            StringBuilder sb2 = new StringBuilder("Aspect(wrapper=");
            sb2.append(aspectDTO);
            sb2.append(", price=");
            sb2.append(priceDTO);
            sb2.append(", image=");
            sb2.append(productMediaDTO);
            sb2.append(", badge=");
            sb2.append(badgeDTO);
            sb2.append(", title=");
            d.e(", subtitle=", ", spacers=", sb2, textDTO, textDTO2);
            sb2.append(itemSpacersDTO);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/data/PdpAspectsDTO$SpacersDTO;", "", "verticalTitle", "Lru/ozon/uni/atoms/data/common/Paddings;", "horizontalTitle", "horizontalDot", "betweenAspects", "bottomAspects", "topAspects", "leftAspects", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getVerticalTitle", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getHorizontalTitle", "getHorizontalDot", "getBetweenAspects", "getBottomAspects", "getTopAspects", "getLeftAspects", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpacersDTO {
        public static final int $stable = 0;
        private final Paddings betweenAspects;
        private final Paddings bottomAspects;
        private final Paddings horizontalDot;
        private final Paddings horizontalTitle;
        private final Paddings leftAspects;
        private final Paddings topAspects;
        private final Paddings verticalTitle;

        public SpacersDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, Paddings paddings6, Paddings paddings7) {
            this.verticalTitle = paddings;
            this.horizontalTitle = paddings2;
            this.horizontalDot = paddings3;
            this.betweenAspects = paddings4;
            this.bottomAspects = paddings5;
            this.topAspects = paddings6;
            this.leftAspects = paddings7;
        }

        public static /* synthetic */ SpacersDTO copy$default(SpacersDTO spacersDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, Paddings paddings6, Paddings paddings7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = spacersDTO.verticalTitle;
            }
            if ((i11 & 2) != 0) {
                paddings2 = spacersDTO.horizontalTitle;
            }
            if ((i11 & 4) != 0) {
                paddings3 = spacersDTO.horizontalDot;
            }
            if ((i11 & 8) != 0) {
                paddings4 = spacersDTO.betweenAspects;
            }
            if ((i11 & 16) != 0) {
                paddings5 = spacersDTO.bottomAspects;
            }
            if ((i11 & 32) != 0) {
                paddings6 = spacersDTO.topAspects;
            }
            if ((i11 & 64) != 0) {
                paddings7 = spacersDTO.leftAspects;
            }
            Paddings paddings8 = paddings6;
            Paddings paddings9 = paddings7;
            Paddings paddings10 = paddings5;
            Paddings paddings11 = paddings3;
            return spacersDTO.copy(paddings, paddings2, paddings11, paddings4, paddings10, paddings8, paddings9);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getVerticalTitle() {
            return this.verticalTitle;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getHorizontalTitle() {
            return this.horizontalTitle;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getHorizontalDot() {
            return this.horizontalDot;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getBetweenAspects() {
            return this.betweenAspects;
        }

        /* renamed from: component5, reason: from getter */
        public final Paddings getBottomAspects() {
            return this.bottomAspects;
        }

        /* renamed from: component6, reason: from getter */
        public final Paddings getTopAspects() {
            return this.topAspects;
        }

        /* renamed from: component7, reason: from getter */
        public final Paddings getLeftAspects() {
            return this.leftAspects;
        }

        @NotNull
        public final SpacersDTO copy(Paddings verticalTitle, Paddings horizontalTitle, Paddings horizontalDot, Paddings betweenAspects, Paddings bottomAspects, Paddings topAspects, Paddings leftAspects) {
            return new SpacersDTO(verticalTitle, horizontalTitle, horizontalDot, betweenAspects, bottomAspects, topAspects, leftAspects);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpacersDTO)) {
                return false;
            }
            SpacersDTO spacersDTO = (SpacersDTO) other;
            return this.verticalTitle == spacersDTO.verticalTitle && this.horizontalTitle == spacersDTO.horizontalTitle && this.horizontalDot == spacersDTO.horizontalDot && this.betweenAspects == spacersDTO.betweenAspects && this.bottomAspects == spacersDTO.bottomAspects && this.topAspects == spacersDTO.topAspects && this.leftAspects == spacersDTO.leftAspects;
        }

        public final Paddings getBetweenAspects() {
            return this.betweenAspects;
        }

        public final Paddings getBottomAspects() {
            return this.bottomAspects;
        }

        public final Paddings getHorizontalDot() {
            return this.horizontalDot;
        }

        public final Paddings getHorizontalTitle() {
            return this.horizontalTitle;
        }

        public final Paddings getLeftAspects() {
            return this.leftAspects;
        }

        public final Paddings getTopAspects() {
            return this.topAspects;
        }

        public final Paddings getVerticalTitle() {
            return this.verticalTitle;
        }

        public int hashCode() {
            Paddings paddings = this.verticalTitle;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.horizontalTitle;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.horizontalDot;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.betweenAspects;
            int hashCode4 = (hashCode3 + (paddings4 == null ? 0 : paddings4.hashCode())) * 31;
            Paddings paddings5 = this.bottomAspects;
            int hashCode5 = (hashCode4 + (paddings5 == null ? 0 : paddings5.hashCode())) * 31;
            Paddings paddings6 = this.topAspects;
            int hashCode6 = (hashCode5 + (paddings6 == null ? 0 : paddings6.hashCode())) * 31;
            Paddings paddings7 = this.leftAspects;
            return hashCode6 + (paddings7 != null ? paddings7.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.verticalTitle;
            Paddings paddings2 = this.horizontalTitle;
            Paddings paddings3 = this.horizontalDot;
            Paddings paddings4 = this.betweenAspects;
            Paddings paddings5 = this.bottomAspects;
            Paddings paddings6 = this.topAspects;
            Paddings paddings7 = this.leftAspects;
            StringBuilder b11 = p.b("SpacersDTO(verticalTitle=", paddings, ", horizontalTitle=", paddings2, ", horizontalDot=");
            a.e(b11, paddings3, ", betweenAspects=", paddings4, ", bottomAspects=");
            a.e(b11, paddings5, ", topAspects=", paddings6, ", leftAspects=");
            return D40.b.b(b11, paddings7, ")");
        }
    }

    public PdpAspectsDTO(@NotNull TextDTO title, BadgeDTO badgeDTO, Map<String, TokenizedTrackingInfo> map, SpacersDTO spacersDTO, String str, @NotNull List<Aspect> items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.title = title;
        this.badge = badgeDTO;
        this.trackingInfo = map;
        this.spacers = spacersDTO;
        this.backgroundColor = str;
        this.items = items;
    }

    public static /* synthetic */ PdpAspectsDTO copy$default(PdpAspectsDTO pdpAspectsDTO, TextDTO textDTO, BadgeDTO badgeDTO, Map map, SpacersDTO spacersDTO, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = pdpAspectsDTO.title;
        }
        if ((i11 & 2) != 0) {
            badgeDTO = pdpAspectsDTO.badge;
        }
        if ((i11 & 4) != 0) {
            map = pdpAspectsDTO.trackingInfo;
        }
        if ((i11 & 8) != 0) {
            spacersDTO = pdpAspectsDTO.spacers;
        }
        if ((i11 & 16) != 0) {
            str = pdpAspectsDTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            list = pdpAspectsDTO.items;
        }
        String str2 = str;
        List list2 = list;
        return pdpAspectsDTO.copy(textDTO, badgeDTO, map, spacersDTO, str2, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final SpacersDTO getSpacers() {
        return this.spacers;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<Aspect> component6() {
        return this.items;
    }

    @NotNull
    public final PdpAspectsDTO copy(@NotNull TextDTO title, BadgeDTO badge, Map<String, TokenizedTrackingInfo> trackingInfo, SpacersDTO spacers, String backgroundColor, @NotNull List<Aspect> items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        return new PdpAspectsDTO(title, badge, trackingInfo, spacers, backgroundColor, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdpAspectsDTO)) {
            return false;
        }
        PdpAspectsDTO pdpAspectsDTO = (PdpAspectsDTO) other;
        return Intrinsics.d(this.title, pdpAspectsDTO.title) && Intrinsics.d(this.badge, pdpAspectsDTO.badge) && Intrinsics.d(this.trackingInfo, pdpAspectsDTO.trackingInfo) && Intrinsics.d(this.spacers, pdpAspectsDTO.spacers) && Intrinsics.d(this.backgroundColor, pdpAspectsDTO.backgroundColor) && Intrinsics.d(this.items, pdpAspectsDTO.items);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final List<Aspect> getItems() {
        return this.items;
    }

    public final SpacersDTO getSpacers() {
        return this.spacers;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        SpacersDTO spacersDTO = this.spacers;
        int hashCode4 = (hashCode3 + (spacersDTO == null ? 0 : spacersDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        return this.items.hashCode() + ((hashCode4 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "PdpAspectsDTO(title=" + this.title + ", badge=" + this.badge + ", trackingInfo=" + this.trackingInfo + ", spacers=" + this.spacers + ", backgroundColor=" + this.backgroundColor + ", items=" + this.items + ")";
    }
}
