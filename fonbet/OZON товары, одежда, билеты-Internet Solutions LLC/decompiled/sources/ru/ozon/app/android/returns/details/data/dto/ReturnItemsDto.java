package ru.ozon.app.android.returns.details.data.dto;

import Ak.C2436a;
import B90.C2619v;
import Fm.C3051a;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.data.gallery.Gallery;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0005!\"#$%B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$Subtitle;", "packingInstruction", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "items", "", "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$Item;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$Subtitle;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "()Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$Subtitle;", "getPackingInstruction", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Subtitle", "Item", "ProductInfo", "ReturnReason", "ExemplarState", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnItemsDto {
    public static final int $stable = 8;

    @NotNull
    private final List<Item> items;
    private final DisclaimerAtom packingInstruction;
    private final Subtitle subtitle;

    @NotNull
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ExemplarState;", "", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "quantity", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "<init>", "(Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getQuantity", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExemplarState {
        public static final int $stable = TextAtom.$stable | Badge.$stable;

        @NotNull
        private final Badge badge;
        private final TextAtom quantity;

        public ExemplarState(@i(name = "badge") @NotNull Badge badge, @i(name = "quantity") TextAtom textAtom) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            this.badge = badge;
            this.quantity = textAtom;
        }

        public static /* synthetic */ ExemplarState copy$default(ExemplarState exemplarState, Badge badge, TextAtom textAtom, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                badge = exemplarState.badge;
            }
            if ((i11 & 2) != 0) {
                textAtom = exemplarState.quantity;
            }
            return exemplarState.copy(badge, textAtom);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Badge getBadge() {
            return this.badge;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getQuantity() {
            return this.quantity;
        }

        @NotNull
        public final ExemplarState copy(@i(name = "badge") @NotNull Badge badge, @i(name = "quantity") TextAtom quantity) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            return new ExemplarState(badge, quantity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExemplarState)) {
                return false;
            }
            ExemplarState exemplarState = (ExemplarState) other;
            return Intrinsics.d(this.badge, exemplarState.badge) && Intrinsics.d(this.quantity, exemplarState.quantity);
        }

        @NotNull
        public final Badge getBadge() {
            return this.badge;
        }

        public final TextAtom getQuantity() {
            return this.quantity;
        }

        public int hashCode() {
            int hashCode = this.badge.hashCode() * 31;
            TextAtom textAtom = this.quantity;
            return hashCode + (textAtom == null ? 0 : textAtom.hashCode());
        }

        @NotNull
        public String toString() {
            return "ExemplarState(badge=" + this.badge + ", quantity=" + this.quantity + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$Item;", "", ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME, "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ProductInfo;", "returnReason", "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ReturnReason;", "<init>", "(Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ProductInfo;Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ReturnReason;)V", "getProductInfo", "()Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ProductInfo;", "getReturnReason", "()Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ReturnReason;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;

        @NotNull
        private final ProductInfo productInfo;

        @NotNull
        private final ReturnReason returnReason;

        public Item(@i(name = "productInfo") @NotNull ProductInfo productInfo, @i(name = "returnReason") @NotNull ReturnReason returnReason) {
            Intrinsics.checkNotNullParameter(productInfo, "productInfo");
            Intrinsics.checkNotNullParameter(returnReason, "returnReason");
            this.productInfo = productInfo;
            this.returnReason = returnReason;
        }

        public static /* synthetic */ Item copy$default(Item item, ProductInfo productInfo, ReturnReason returnReason, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                productInfo = item.productInfo;
            }
            if ((i11 & 2) != 0) {
                returnReason = item.returnReason;
            }
            return item.copy(productInfo, returnReason);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ProductInfo getProductInfo() {
            return this.productInfo;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ReturnReason getReturnReason() {
            return this.returnReason;
        }

        @NotNull
        public final Item copy(@i(name = "productInfo") @NotNull ProductInfo productInfo, @i(name = "returnReason") @NotNull ReturnReason returnReason) {
            Intrinsics.checkNotNullParameter(productInfo, "productInfo");
            Intrinsics.checkNotNullParameter(returnReason, "returnReason");
            return new Item(productInfo, returnReason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.d(this.productInfo, item.productInfo) && Intrinsics.d(this.returnReason, item.returnReason);
        }

        @NotNull
        public final ProductInfo getProductInfo() {
            return this.productInfo;
        }

        @NotNull
        public final ReturnReason getReturnReason() {
            return this.returnReason;
        }

        public int hashCode() {
            return this.returnReason.hashCode() + (this.productInfo.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Item(productInfo=" + this.productInfo + ", returnReason=" + this.returnReason + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ProductInfo;", "", "productLink", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "price", "Lru/ozon/uni/atoms/data/price/Price;", "quantity", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "attributes", "", "exemplarStates", "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ExemplarState;", "itemImage", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;)V", "getProductLink", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getQuantity", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAttributes", "()Ljava/util/List;", "getExemplarStates", "getItemImage", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductInfo {
        public static final int $stable = 8;
        private final List<TextAtom> attributes;
        private final List<ExemplarState> exemplarStates;

        @NotNull
        private final ImageDTO itemImage;

        @NotNull
        private final Price price;

        @NotNull
        private final ButtonV3Atom.SmallBorderlessButton productLink;

        @NotNull
        private final TextAtom quantity;

        public ProductInfo(@i(name = "productLink") @NotNull ButtonV3Atom.SmallBorderlessButton productLink, @i(name = "price") @NotNull Price price, @i(name = "quantity") @NotNull TextAtom quantity, @i(name = "attributes") List<TextAtom> list, @i(name = "exemplarStates") List<ExemplarState> list2, @NotNull ImageDTO itemImage) {
            Intrinsics.checkNotNullParameter(productLink, "productLink");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(itemImage, "itemImage");
            this.productLink = productLink;
            this.price = price;
            this.quantity = quantity;
            this.attributes = list;
            this.exemplarStates = list2;
            this.itemImage = itemImage;
        }

        public static /* synthetic */ ProductInfo copy$default(ProductInfo productInfo, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, Price price, TextAtom textAtom, List list, List list2, ImageDTO imageDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                smallBorderlessButton = productInfo.productLink;
            }
            if ((i11 & 2) != 0) {
                price = productInfo.price;
            }
            if ((i11 & 4) != 0) {
                textAtom = productInfo.quantity;
            }
            if ((i11 & 8) != 0) {
                list = productInfo.attributes;
            }
            if ((i11 & 16) != 0) {
                list2 = productInfo.exemplarStates;
            }
            if ((i11 & 32) != 0) {
                imageDTO = productInfo.itemImage;
            }
            List list3 = list2;
            ImageDTO imageDTO2 = imageDTO;
            return productInfo.copy(smallBorderlessButton, price, textAtom, list, list3, imageDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ButtonV3Atom.SmallBorderlessButton getProductLink() {
            return this.productLink;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextAtom getQuantity() {
            return this.quantity;
        }

        public final List<TextAtom> component4() {
            return this.attributes;
        }

        public final List<ExemplarState> component5() {
            return this.exemplarStates;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final ImageDTO getItemImage() {
            return this.itemImage;
        }

        @NotNull
        public final ProductInfo copy(@i(name = "productLink") @NotNull ButtonV3Atom.SmallBorderlessButton productLink, @i(name = "price") @NotNull Price price, @i(name = "quantity") @NotNull TextAtom quantity, @i(name = "attributes") List<TextAtom> attributes, @i(name = "exemplarStates") List<ExemplarState> exemplarStates, @NotNull ImageDTO itemImage) {
            Intrinsics.checkNotNullParameter(productLink, "productLink");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(itemImage, "itemImage");
            return new ProductInfo(productLink, price, quantity, attributes, exemplarStates, itemImage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductInfo)) {
                return false;
            }
            ProductInfo productInfo = (ProductInfo) other;
            return Intrinsics.d(this.productLink, productInfo.productLink) && Intrinsics.d(this.price, productInfo.price) && Intrinsics.d(this.quantity, productInfo.quantity) && Intrinsics.d(this.attributes, productInfo.attributes) && Intrinsics.d(this.exemplarStates, productInfo.exemplarStates) && Intrinsics.d(this.itemImage, productInfo.itemImage);
        }

        public final List<TextAtom> getAttributes() {
            return this.attributes;
        }

        public final List<ExemplarState> getExemplarStates() {
            return this.exemplarStates;
        }

        @NotNull
        public final ImageDTO getItemImage() {
            return this.itemImage;
        }

        @NotNull
        public final Price getPrice() {
            return this.price;
        }

        @NotNull
        public final ButtonV3Atom.SmallBorderlessButton getProductLink() {
            return this.productLink;
        }

        @NotNull
        public final TextAtom getQuantity() {
            return this.quantity;
        }

        public int hashCode() {
            int b11 = C2619v.b(C3051a.a(this.price, this.productLink.hashCode() * 31, 31), 31, this.quantity);
            List<TextAtom> list = this.attributes;
            int hashCode = (b11 + (list == null ? 0 : list.hashCode())) * 31;
            List<ExemplarState> list2 = this.exemplarStates;
            return this.itemImage.hashCode() + ((hashCode + (list2 != null ? list2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "ProductInfo(productLink=" + this.productLink + ", price=" + this.price + ", quantity=" + this.quantity + ", attributes=" + this.attributes + ", exemplarStates=" + this.exemplarStates + ", itemImage=" + this.itemImage + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ReturnReason;", "", "bgColor", "", "reason", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "comment", "photos", "Lru/ozon/app/android/atoms/data/gallery/Gallery;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/gallery/Gallery;)V", "getBgColor", "()Ljava/lang/String;", "getReason", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getComment", "getPhotos", "()Lru/ozon/app/android/atoms/data/gallery/Gallery;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReturnReason {
        public static final int $stable = 8;

        @NotNull
        private final String bgColor;
        private final TextAtom comment;
        private final Gallery photos;

        @NotNull
        private final TextAtom reason;

        public ReturnReason(@i(name = "bgColor") @NotNull String bgColor, @i(name = "reason") @NotNull TextAtom reason, @i(name = "comment") TextAtom textAtom, @i(name = "photos") Gallery gallery) {
            Intrinsics.checkNotNullParameter(bgColor, "bgColor");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.bgColor = bgColor;
            this.reason = reason;
            this.comment = textAtom;
            this.photos = gallery;
        }

        public static /* synthetic */ ReturnReason copy$default(ReturnReason returnReason, String str, TextAtom textAtom, TextAtom textAtom2, Gallery gallery, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = returnReason.bgColor;
            }
            if ((i11 & 2) != 0) {
                textAtom = returnReason.reason;
            }
            if ((i11 & 4) != 0) {
                textAtom2 = returnReason.comment;
            }
            if ((i11 & 8) != 0) {
                gallery = returnReason.photos;
            }
            return returnReason.copy(str, textAtom, textAtom2, gallery);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getBgColor() {
            return this.bgColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getReason() {
            return this.reason;
        }

        /* renamed from: component3, reason: from getter */
        public final TextAtom getComment() {
            return this.comment;
        }

        /* renamed from: component4, reason: from getter */
        public final Gallery getPhotos() {
            return this.photos;
        }

        @NotNull
        public final ReturnReason copy(@i(name = "bgColor") @NotNull String bgColor, @i(name = "reason") @NotNull TextAtom reason, @i(name = "comment") TextAtom comment, @i(name = "photos") Gallery photos) {
            Intrinsics.checkNotNullParameter(bgColor, "bgColor");
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new ReturnReason(bgColor, reason, comment, photos);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReturnReason)) {
                return false;
            }
            ReturnReason returnReason = (ReturnReason) other;
            return Intrinsics.d(this.bgColor, returnReason.bgColor) && Intrinsics.d(this.reason, returnReason.reason) && Intrinsics.d(this.comment, returnReason.comment) && Intrinsics.d(this.photos, returnReason.photos);
        }

        @NotNull
        public final String getBgColor() {
            return this.bgColor;
        }

        public final TextAtom getComment() {
            return this.comment;
        }

        public final Gallery getPhotos() {
            return this.photos;
        }

        @NotNull
        public final TextAtom getReason() {
            return this.reason;
        }

        public int hashCode() {
            int b11 = C2619v.b(this.bgColor.hashCode() * 31, 31, this.reason);
            TextAtom textAtom = this.comment;
            int hashCode = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            Gallery gallery = this.photos;
            return hashCode + (gallery != null ? gallery.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.bgColor;
            TextAtom textAtom = this.reason;
            TextAtom textAtom2 = this.comment;
            Gallery gallery = this.photos;
            StringBuilder d11 = C2436a.d("ReturnReason(bgColor=", str, ", reason=", ", comment=", textAtom);
            d11.append(textAtom2);
            d11.append(", photos=");
            d11.append(gallery);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$Subtitle;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "orderLink", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getOrderLink", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Subtitle {
        public static final int $stable = ButtonV3Atom.SmallBorderlessButton.$stable | TextAtom.$stable;
        private final ButtonV3Atom.SmallBorderlessButton orderLink;

        @NotNull
        private final TextAtom text;

        public Subtitle(@i(name = "text") @NotNull TextAtom text, @i(name = "orderLink") ButtonV3Atom.SmallBorderlessButton smallBorderlessButton) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.orderLink = smallBorderlessButton;
        }

        public static /* synthetic */ Subtitle copy$default(Subtitle subtitle, TextAtom textAtom, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = subtitle.text;
            }
            if ((i11 & 2) != 0) {
                smallBorderlessButton = subtitle.orderLink;
            }
            return subtitle.copy(textAtom, smallBorderlessButton);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final ButtonV3Atom.SmallBorderlessButton getOrderLink() {
            return this.orderLink;
        }

        @NotNull
        public final Subtitle copy(@i(name = "text") @NotNull TextAtom text, @i(name = "orderLink") ButtonV3Atom.SmallBorderlessButton orderLink) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Subtitle(text, orderLink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Subtitle)) {
                return false;
            }
            Subtitle subtitle = (Subtitle) other;
            return Intrinsics.d(this.text, subtitle.text) && Intrinsics.d(this.orderLink, subtitle.orderLink);
        }

        public final ButtonV3Atom.SmallBorderlessButton getOrderLink() {
            return this.orderLink;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.orderLink;
            return hashCode + (smallBorderlessButton == null ? 0 : smallBorderlessButton.hashCode());
        }

        @NotNull
        public String toString() {
            return "Subtitle(text=" + this.text + ", orderLink=" + this.orderLink + ")";
        }
    }

    public ReturnItemsDto(@i(name = "title") @NotNull TextAtom title, @i(name = "subtitle") Subtitle subtitle, @i(name = "packingInstruction") DisclaimerAtom disclaimerAtom, @i(name = "items") @NotNull List<Item> items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.title = title;
        this.subtitle = subtitle;
        this.packingInstruction = disclaimerAtom;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReturnItemsDto copy$default(ReturnItemsDto returnItemsDto, TextAtom textAtom, Subtitle subtitle, DisclaimerAtom disclaimerAtom, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = returnItemsDto.title;
        }
        if ((i11 & 2) != 0) {
            subtitle = returnItemsDto.subtitle;
        }
        if ((i11 & 4) != 0) {
            disclaimerAtom = returnItemsDto.packingInstruction;
        }
        if ((i11 & 8) != 0) {
            list = returnItemsDto.items;
        }
        return returnItemsDto.copy(textAtom, subtitle, disclaimerAtom, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final Subtitle getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final DisclaimerAtom getPackingInstruction() {
        return this.packingInstruction;
    }

    @NotNull
    public final List<Item> component4() {
        return this.items;
    }

    @NotNull
    public final ReturnItemsDto copy(@i(name = "title") @NotNull TextAtom title, @i(name = "subtitle") Subtitle subtitle, @i(name = "packingInstruction") DisclaimerAtom packingInstruction, @i(name = "items") @NotNull List<Item> items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        return new ReturnItemsDto(title, subtitle, packingInstruction, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnItemsDto)) {
            return false;
        }
        ReturnItemsDto returnItemsDto = (ReturnItemsDto) other;
        return Intrinsics.d(this.title, returnItemsDto.title) && Intrinsics.d(this.subtitle, returnItemsDto.subtitle) && Intrinsics.d(this.packingInstruction, returnItemsDto.packingInstruction) && Intrinsics.d(this.items, returnItemsDto.items);
    }

    @NotNull
    public final List<Item> getItems() {
        return this.items;
    }

    public final DisclaimerAtom getPackingInstruction() {
        return this.packingInstruction;
    }

    public final Subtitle getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        Subtitle subtitle = this.subtitle;
        int hashCode2 = (hashCode + (subtitle == null ? 0 : subtitle.hashCode())) * 31;
        DisclaimerAtom disclaimerAtom = this.packingInstruction;
        return this.items.hashCode() + ((hashCode2 + (disclaimerAtom != null ? disclaimerAtom.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "ReturnItemsDto(title=" + this.title + ", subtitle=" + this.subtitle + ", packingInstruction=" + this.packingInstruction + ", items=" + this.items + ")";
    }
}
