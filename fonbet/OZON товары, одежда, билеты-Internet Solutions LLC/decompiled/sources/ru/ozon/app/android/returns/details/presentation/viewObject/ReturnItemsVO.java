package ru.ozon.app.android.returns.details.presentation.viewObject;

import B90.C2619v;
import Fm.C3051a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVO;
import ru.ozon.app.android.returns.details.data.dto.ReturnItemsDto;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001:\u0002#$B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$Subtitle;", "subtitle", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "packingInstruction", "", "Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO$ItemVO;", "items", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$Subtitle;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$Subtitle;", "getSubtitle", "()Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$Subtitle;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getPackingInstruction", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "ItemVO", "ProductInfoVO", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnItemsVO {

    @NotNull
    private final List<ItemVO> items;
    private final DisclaimerAtom packingInstruction;
    private final ReturnItemsDto.Subtitle subtitle;

    @NotNull
    private final TextAtom title;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO$ItemVO;", "", "Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO$ProductInfoVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME, "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ReturnReason;", "returnReason", "<init>", "(Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO$ProductInfoVO;Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ReturnReason;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO$ProductInfoVO;", "getProductInfo", "()Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO$ProductInfoVO;", "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ReturnReason;", "getReturnReason", "()Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ReturnReason;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemVO {

        @NotNull
        private final ProductInfoVO productInfo;

        @NotNull
        private final ReturnItemsDto.ReturnReason returnReason;

        public ItemVO(@NotNull ProductInfoVO productInfo, @NotNull ReturnItemsDto.ReturnReason returnReason) {
            Intrinsics.checkNotNullParameter(productInfo, "productInfo");
            Intrinsics.checkNotNullParameter(returnReason, "returnReason");
            this.productInfo = productInfo;
            this.returnReason = returnReason;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemVO)) {
                return false;
            }
            ItemVO itemVO = (ItemVO) other;
            return Intrinsics.d(this.productInfo, itemVO.productInfo) && Intrinsics.d(this.returnReason, itemVO.returnReason);
        }

        @NotNull
        public final ProductInfoVO getProductInfo() {
            return this.productInfo;
        }

        @NotNull
        public final ReturnItemsDto.ReturnReason getReturnReason() {
            return this.returnReason;
        }

        public int hashCode() {
            return this.returnReason.hashCode() + (this.productInfo.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ItemVO(productInfo=" + this.productInfo + ", returnReason=" + this.returnReason + ")";
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO$ProductInfoVO;", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "productLink", "Lru/ozon/uni/atoms/data/price/Price;", "price", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "quantity", "", "attributes", "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ExemplarState;", "exemplarStates", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "itemImage", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getProductLink", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getQuantity", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getAttributes", "()Ljava/util/List;", "getExemplarStates", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "getItemImage", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductInfoVO {
        private final List<TextAtom> attributes;
        private final List<ReturnItemsDto.ExemplarState> exemplarStates;

        @NotNull
        private final ImageVO itemImage;

        @NotNull
        private final Price price;

        @NotNull
        private final ButtonV3Atom.SmallBorderlessButton productLink;

        @NotNull
        private final TextAtom quantity;

        public ProductInfoVO(@NotNull ButtonV3Atom.SmallBorderlessButton productLink, @NotNull Price price, @NotNull TextAtom quantity, List<TextAtom> list, List<ReturnItemsDto.ExemplarState> list2, @NotNull ImageVO itemImage) {
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

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductInfoVO)) {
                return false;
            }
            ProductInfoVO productInfoVO = (ProductInfoVO) other;
            return Intrinsics.d(this.productLink, productInfoVO.productLink) && Intrinsics.d(this.price, productInfoVO.price) && Intrinsics.d(this.quantity, productInfoVO.quantity) && Intrinsics.d(this.attributes, productInfoVO.attributes) && Intrinsics.d(this.exemplarStates, productInfoVO.exemplarStates) && Intrinsics.d(this.itemImage, productInfoVO.itemImage);
        }

        public final List<TextAtom> getAttributes() {
            return this.attributes;
        }

        public final List<ReturnItemsDto.ExemplarState> getExemplarStates() {
            return this.exemplarStates;
        }

        @NotNull
        public final ImageVO getItemImage() {
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
            List<ReturnItemsDto.ExemplarState> list2 = this.exemplarStates;
            return this.itemImage.hashCode() + ((hashCode + (list2 != null ? list2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "ProductInfoVO(productLink=" + this.productLink + ", price=" + this.price + ", quantity=" + this.quantity + ", attributes=" + this.attributes + ", exemplarStates=" + this.exemplarStates + ", itemImage=" + this.itemImage + ")";
        }
    }

    public ReturnItemsVO(@NotNull TextAtom title, ReturnItemsDto.Subtitle subtitle, DisclaimerAtom disclaimerAtom, @NotNull List<ItemVO> items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.title = title;
        this.subtitle = subtitle;
        this.packingInstruction = disclaimerAtom;
        this.items = items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnItemsVO)) {
            return false;
        }
        ReturnItemsVO returnItemsVO = (ReturnItemsVO) other;
        return Intrinsics.d(this.title, returnItemsVO.title) && Intrinsics.d(this.subtitle, returnItemsVO.subtitle) && Intrinsics.d(this.packingInstruction, returnItemsVO.packingInstruction) && Intrinsics.d(this.items, returnItemsVO.items);
    }

    @NotNull
    public final List<ItemVO> getItems() {
        return this.items;
    }

    public final DisclaimerAtom getPackingInstruction() {
        return this.packingInstruction;
    }

    public final ReturnItemsDto.Subtitle getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        ReturnItemsDto.Subtitle subtitle = this.subtitle;
        int hashCode2 = (hashCode + (subtitle == null ? 0 : subtitle.hashCode())) * 31;
        DisclaimerAtom disclaimerAtom = this.packingInstruction;
        return this.items.hashCode() + ((hashCode2 + (disclaimerAtom != null ? disclaimerAtom.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "ReturnItemsVO(title=" + this.title + ", subtitle=" + this.subtitle + ", packingInstruction=" + this.packingInstruction + ", items=" + this.items + ")";
    }
}
