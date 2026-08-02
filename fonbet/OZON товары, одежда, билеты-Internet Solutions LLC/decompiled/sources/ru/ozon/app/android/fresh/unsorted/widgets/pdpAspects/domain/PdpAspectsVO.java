package ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.domain;

import Am.C2438a;
import B0.C2454a;
import D40.d;
import Ek.a;
import Fm.C3051a;
import J0.P;
import Ns.b;
import WZ.t;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000267BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u0010\u0017R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "scrollWidgetKey", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$SpacersVO;", "spacers", "", "backgroundColor", "", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$Aspect;", "items", "<init>", "(JILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;LWZ/t;Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$SpacersVO;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getScrollWidgetKey", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$SpacersVO;", "getSpacers", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$SpacersVO;", "Ljava/lang/String;", "getBackgroundColor", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "SpacersVO", "Aspect", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PdpAspectsVO implements c {
    private final String backgroundColor;
    private final BadgeDTO badge;
    private final long id;

    @NotNull
    private final List<Aspect> items;
    private final int scrollWidgetKey;

    @NotNull
    private final SpacersVO spacers;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$Aspect;", "", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "wrapper", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "image", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$Aspect$ItemSpacersVO;", "spacers", "<init>", "(Lru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$Aspect$ItemSpacersVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getWrapper", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getImage", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$Aspect$ItemSpacersVO;", "getSpacers", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$Aspect$ItemSpacersVO;", "ItemSpacersVO", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Aspect {
        public static final int $stable = (ProductMediaDTO.$stable | PriceDTO.$stable) | AspectDTO.$stable;
        private final BadgeDTO badge;

        @NotNull
        private final ProductMediaDTO image;

        @NotNull
        private final PriceDTO price;

        @NotNull
        private final ItemSpacersVO spacers;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        @NotNull
        private final AspectDTO wrapper;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$Aspect$ItemSpacersVO;", "", "", "vertical", "horizontal", "betweenPhotoPrice", "betweenPriceTitle", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getVertical", "getHorizontal", "getBetweenPhotoPrice", "getBetweenPriceTitle", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ItemSpacersVO {
            private final int betweenPhotoPrice;
            private final int betweenPriceTitle;
            private final int horizontal;
            private final int vertical;

            public ItemSpacersVO(int i11, int i12, int i13, int i14) {
                this.vertical = i11;
                this.horizontal = i12;
                this.betweenPhotoPrice = i13;
                this.betweenPriceTitle = i14;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ItemSpacersVO)) {
                    return false;
                }
                ItemSpacersVO itemSpacersVO = (ItemSpacersVO) other;
                return this.vertical == itemSpacersVO.vertical && this.horizontal == itemSpacersVO.horizontal && this.betweenPhotoPrice == itemSpacersVO.betweenPhotoPrice && this.betweenPriceTitle == itemSpacersVO.betweenPriceTitle;
            }

            public final int getBetweenPhotoPrice() {
                return this.betweenPhotoPrice;
            }

            public final int getBetweenPriceTitle() {
                return this.betweenPriceTitle;
            }

            public final int getHorizontal() {
                return this.horizontal;
            }

            public final int getVertical() {
                return this.vertical;
            }

            public int hashCode() {
                return Integer.hashCode(this.betweenPriceTitle) + C2454a.a(this.betweenPhotoPrice, C2454a.a(this.horizontal, Integer.hashCode(this.vertical) * 31, 31), 31);
            }

            @NotNull
            public String toString() {
                return P.a(this.betweenPhotoPrice, this.betweenPriceTitle, ", betweenPriceTitle=", ")", C2438a.a("ItemSpacersVO(vertical=", this.vertical, ", horizontal=", ", betweenPhotoPrice=", this.horizontal));
            }
        }

        public Aspect(@NotNull AspectDTO wrapper, @NotNull PriceDTO price, @NotNull ProductMediaDTO image, BadgeDTO badgeDTO, @NotNull TextDTO title, TextDTO textDTO, @NotNull ItemSpacersVO spacers) {
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(spacers, "spacers");
            this.wrapper = wrapper;
            this.price = price;
            this.image = image;
            this.badge = badgeDTO;
            this.title = title;
            this.subtitle = textDTO;
            this.spacers = spacers;
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

        @NotNull
        public final ItemSpacersVO getSpacers() {
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
            int a11 = b.a(this.title, (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31);
            TextDTO textDTO = this.subtitle;
            return this.spacers.hashCode() + ((a11 + (textDTO != null ? textDTO.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            AspectDTO aspectDTO = this.wrapper;
            PriceDTO priceDTO = this.price;
            ProductMediaDTO productMediaDTO = this.image;
            BadgeDTO badgeDTO = this.badge;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            ItemSpacersVO itemSpacersVO = this.spacers;
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
            sb2.append(itemSpacersVO);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$SpacersVO;", "", "verticalTitle", "", "horizontalTitle", "horizontalDot", "betweenAspects", "bottomAspects", "topAspects", "leftAspects", "<init>", "(IIIIIII)V", "getVerticalTitle", "()I", "getHorizontalTitle", "getHorizontalDot", "getBetweenAspects", "getBottomAspects", "getTopAspects", "getLeftAspects", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpacersVO {
        public static final int $stable = 0;
        private final int betweenAspects;
        private final int bottomAspects;
        private final int horizontalDot;
        private final int horizontalTitle;
        private final int leftAspects;
        private final int topAspects;
        private final int verticalTitle;

        public SpacersVO(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.verticalTitle = i11;
            this.horizontalTitle = i12;
            this.horizontalDot = i13;
            this.betweenAspects = i14;
            this.bottomAspects = i15;
            this.topAspects = i16;
            this.leftAspects = i17;
        }

        public static /* synthetic */ SpacersVO copy$default(SpacersVO spacersVO, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Object obj) {
            if ((i18 & 1) != 0) {
                i11 = spacersVO.verticalTitle;
            }
            if ((i18 & 2) != 0) {
                i12 = spacersVO.horizontalTitle;
            }
            if ((i18 & 4) != 0) {
                i13 = spacersVO.horizontalDot;
            }
            if ((i18 & 8) != 0) {
                i14 = spacersVO.betweenAspects;
            }
            if ((i18 & 16) != 0) {
                i15 = spacersVO.bottomAspects;
            }
            if ((i18 & 32) != 0) {
                i16 = spacersVO.topAspects;
            }
            if ((i18 & 64) != 0) {
                i17 = spacersVO.leftAspects;
            }
            int i19 = i16;
            int i21 = i17;
            int i22 = i15;
            int i23 = i13;
            return spacersVO.copy(i11, i12, i23, i14, i22, i19, i21);
        }

        /* renamed from: component1, reason: from getter */
        public final int getVerticalTitle() {
            return this.verticalTitle;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHorizontalTitle() {
            return this.horizontalTitle;
        }

        /* renamed from: component3, reason: from getter */
        public final int getHorizontalDot() {
            return this.horizontalDot;
        }

        /* renamed from: component4, reason: from getter */
        public final int getBetweenAspects() {
            return this.betweenAspects;
        }

        /* renamed from: component5, reason: from getter */
        public final int getBottomAspects() {
            return this.bottomAspects;
        }

        /* renamed from: component6, reason: from getter */
        public final int getTopAspects() {
            return this.topAspects;
        }

        /* renamed from: component7, reason: from getter */
        public final int getLeftAspects() {
            return this.leftAspects;
        }

        @NotNull
        public final SpacersVO copy(int verticalTitle, int horizontalTitle, int horizontalDot, int betweenAspects, int bottomAspects, int topAspects, int leftAspects) {
            return new SpacersVO(verticalTitle, horizontalTitle, horizontalDot, betweenAspects, bottomAspects, topAspects, leftAspects);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpacersVO)) {
                return false;
            }
            SpacersVO spacersVO = (SpacersVO) other;
            return this.verticalTitle == spacersVO.verticalTitle && this.horizontalTitle == spacersVO.horizontalTitle && this.horizontalDot == spacersVO.horizontalDot && this.betweenAspects == spacersVO.betweenAspects && this.bottomAspects == spacersVO.bottomAspects && this.topAspects == spacersVO.topAspects && this.leftAspects == spacersVO.leftAspects;
        }

        public final int getBetweenAspects() {
            return this.betweenAspects;
        }

        public final int getBottomAspects() {
            return this.bottomAspects;
        }

        public final int getHorizontalDot() {
            return this.horizontalDot;
        }

        public final int getHorizontalTitle() {
            return this.horizontalTitle;
        }

        public final int getLeftAspects() {
            return this.leftAspects;
        }

        public final int getTopAspects() {
            return this.topAspects;
        }

        public final int getVerticalTitle() {
            return this.verticalTitle;
        }

        public int hashCode() {
            return Integer.hashCode(this.leftAspects) + C2454a.a(this.topAspects, C2454a.a(this.bottomAspects, C2454a.a(this.betweenAspects, C2454a.a(this.horizontalDot, C2454a.a(this.horizontalTitle, Integer.hashCode(this.verticalTitle) * 31, 31), 31), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.verticalTitle;
            int i12 = this.horizontalTitle;
            int i13 = this.horizontalDot;
            int i14 = this.betweenAspects;
            int i15 = this.bottomAspects;
            int i16 = this.topAspects;
            int i17 = this.leftAspects;
            StringBuilder a11 = C2438a.a("SpacersVO(verticalTitle=", i11, ", horizontalTitle=", ", horizontalDot=", i12);
            a.f(i13, i14, ", betweenAspects=", ", bottomAspects=", a11);
            a.f(i15, i16, ", topAspects=", ", leftAspects=", a11);
            return K00.b.e(i17, ")", a11);
        }
    }

    public PdpAspectsVO(long j11, int i11, @NotNull TextDTO title, BadgeDTO badgeDTO, t tVar, @NotNull SpacersVO spacers, String str, @NotNull List<Aspect> items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.scrollWidgetKey = i11;
        this.title = title;
        this.badge = badgeDTO;
        this.tokenizedEvent = tVar;
        this.spacers = spacers;
        this.backgroundColor = str;
        this.items = items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdpAspectsVO)) {
            return false;
        }
        PdpAspectsVO pdpAspectsVO = (PdpAspectsVO) other;
        return this.id == pdpAspectsVO.id && this.scrollWidgetKey == pdpAspectsVO.scrollWidgetKey && Intrinsics.d(this.title, pdpAspectsVO.title) && Intrinsics.d(this.badge, pdpAspectsVO.badge) && Intrinsics.d(this.tokenizedEvent, pdpAspectsVO.tokenizedEvent) && Intrinsics.d(this.spacers, pdpAspectsVO.spacers) && Intrinsics.d(this.backgroundColor, pdpAspectsVO.backgroundColor) && Intrinsics.d(this.items, pdpAspectsVO.items);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<Aspect> getItems() {
        return this.items;
    }

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        return Integer.valueOf(this.scrollWidgetKey);
    }

    @NotNull
    public final SpacersVO getSpacers() {
        return this.spacers;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.title, C2454a.a(this.scrollWidgetKey, Long.hashCode(this.id) * 31, 31), 31);
        BadgeDTO badgeDTO = this.badge;
        int hashCode = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode2 = (this.spacers.hashCode() + ((hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31)) * 31;
        String str = this.backgroundColor;
        return this.items.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        int i11 = this.scrollWidgetKey;
        TextDTO textDTO = this.title;
        BadgeDTO badgeDTO = this.badge;
        t tVar = this.tokenizedEvent;
        SpacersVO spacersVO = this.spacers;
        String str = this.backgroundColor;
        List<Aspect> list = this.items;
        StringBuilder b11 = Ql.c.b(j11, "PdpAspectsVO(id=", i11, ", scrollWidgetKey=");
        b11.append(", title=");
        b11.append(textDTO);
        b11.append(", badge=");
        b11.append(badgeDTO);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", spacers=");
        b11.append(spacersVO);
        Nh.a.g(", backgroundColor=", str, ", items=", b11, list);
        b11.append(")");
        return b11.toString();
    }
}
