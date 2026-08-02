package ru.ozon.app.android.cart.cartSplitV2.v2.data;

import Bi.b;
import D3.h;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementDTOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.ProductDTOV2;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003()*BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JQ\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/cart/cartSplitV2/v2/data/HeaderDTO;", "cartItems", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2$Item;", "cartItemsOneOf", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2$CartItemWrapper;", "cartItemsSeparator", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/cart/cartSplitV2/v2/data/Footer;", "<init>", "(Lru/ozon/app/android/cart/cartSplitV2/v2/data/HeaderDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;Lru/ozon/app/android/cart/cartSplitV2/v2/data/Footer;)V", "getHeader", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/HeaderDTO;", "getCartItems$annotations", "()V", "getCartItems", "()Ljava/util/List;", "getCartItemsOneOf$annotations", "getCartItemsOneOf", "getCartItemsSeparator", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;", "getFooter", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/Footer;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CartItemWrapper", "Item", "CellCartItem", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CartSplitV2DTOV2 {
    public static final int $stable = 8;
    private final List<Item> cartItems;
    private final List<CartItemWrapper> cartItemsOneOf;
    private final SeparatorConfig cartItemsSeparator;
    private final Footer footer;
    private final HeaderDTO header;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2$CartItemWrapper;", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cartItem", type = Item.class), @ProtoOneOfSignature(name = "cartCellItem", type = CellCartItem.class)})
    @ProtoOneOf(label = "type")
    public interface CartItemWrapper {
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003JR\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0007HÖ\u0001J\t\u0010(\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\n\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006)"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2$CellCartItem;", "", "id", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "hidingTimeMls", "", "strokeColor", "", "isLast", "", "externalPaddings", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/Paddings;", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/cart/cartSplitV2/v2/data/Paddings;)V", "getId", "()J", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getHidingTimeMls", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStrokeColor", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExternalPaddings", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/Paddings;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/cart/cartSplitV2/v2/data/Paddings;)Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2$CellCartItem;", "equals", "other", "hashCode", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellCartItem {
        public static final int $stable = CellDTO.$stable;

        @NotNull
        private final CellDTO cell;
        private final Paddings externalPaddings;
        private final Integer hidingTimeMls;
        private final long id;
        private final Boolean isLast;
        private final String strokeColor;

        public CellCartItem(long j11, @NotNull CellDTO cell, Integer num, String str, Boolean bool, Paddings paddings) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.id = j11;
            this.cell = cell;
            this.hidingTimeMls = num;
            this.strokeColor = str;
            this.isLast = bool;
            this.externalPaddings = paddings;
        }

        public static /* synthetic */ CellCartItem copy$default(CellCartItem cellCartItem, long j11, CellDTO cellDTO, Integer num, String str, Boolean bool, Paddings paddings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = cellCartItem.id;
            }
            long j12 = j11;
            if ((i11 & 2) != 0) {
                cellDTO = cellCartItem.cell;
            }
            CellDTO cellDTO2 = cellDTO;
            if ((i11 & 4) != 0) {
                num = cellCartItem.hidingTimeMls;
            }
            Integer num2 = num;
            if ((i11 & 8) != 0) {
                str = cellCartItem.strokeColor;
            }
            String str2 = str;
            if ((i11 & 16) != 0) {
                bool = cellCartItem.isLast;
            }
            Boolean bool2 = bool;
            if ((i11 & 32) != 0) {
                paddings = cellCartItem.externalPaddings;
            }
            return cellCartItem.copy(j12, cellDTO2, num2, str2, bool2, paddings);
        }

        /* renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CellDTO getCell() {
            return this.cell;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getHidingTimeMls() {
            return this.hidingTimeMls;
        }

        /* renamed from: component4, reason: from getter */
        public final String getStrokeColor() {
            return this.strokeColor;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getIsLast() {
            return this.isLast;
        }

        /* renamed from: component6, reason: from getter */
        public final Paddings getExternalPaddings() {
            return this.externalPaddings;
        }

        @NotNull
        public final CellCartItem copy(long id2, @NotNull CellDTO cell, Integer hidingTimeMls, String strokeColor, Boolean isLast, Paddings externalPaddings) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            return new CellCartItem(id2, cell, hidingTimeMls, strokeColor, isLast, externalPaddings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellCartItem)) {
                return false;
            }
            CellCartItem cellCartItem = (CellCartItem) other;
            return this.id == cellCartItem.id && Intrinsics.d(this.cell, cellCartItem.cell) && Intrinsics.d(this.hidingTimeMls, cellCartItem.hidingTimeMls) && Intrinsics.d(this.strokeColor, cellCartItem.strokeColor) && Intrinsics.d(this.isLast, cellCartItem.isLast) && Intrinsics.d(this.externalPaddings, cellCartItem.externalPaddings);
        }

        @NotNull
        public final CellDTO getCell() {
            return this.cell;
        }

        public final Paddings getExternalPaddings() {
            return this.externalPaddings;
        }

        public final Integer getHidingTimeMls() {
            return this.hidingTimeMls;
        }

        public final long getId() {
            return this.id;
        }

        public final String getStrokeColor() {
            return this.strokeColor;
        }

        public int hashCode() {
            int c11 = b.c(this.cell, Long.hashCode(this.id) * 31, 31);
            Integer num = this.hidingTimeMls;
            int hashCode = (c11 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.strokeColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isLast;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Paddings paddings = this.externalPaddings;
            return hashCode3 + (paddings != null ? paddings.hashCode() : 0);
        }

        public final Boolean isLast() {
            return this.isLast;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            CellDTO cellDTO = this.cell;
            Integer num = this.hidingTimeMls;
            String str = this.strokeColor;
            Boolean bool = this.isLast;
            Paddings paddings = this.externalPaddings;
            StringBuilder e11 = h.e("CellCartItem(id=", j11, ", cell=", cellDTO);
            e11.append(", hidingTimeMls=");
            e11.append(num);
            e11.append(", strokeColor=");
            e11.append(str);
            e11.append(", isLast=");
            e11.append(bool);
            e11.append(", externalPaddings=");
            e11.append(paddings);
            e11.append(")");
            return e11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003JU\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2$Item;", "", "checkbox", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CheckboxDTO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductDTOV2;", "dynamicElements", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementDTOV2;", "controls", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO;", "getAccessoriesAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "swipeInfo", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/SwipeInfoDTO;", "<init>", "(Lru/ozon/app/android/cart/cartSplitV2/v2/data/CheckboxDTO;Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductDTOV2;Ljava/util/List;Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/cart/cartSplitV2/v2/data/SwipeInfoDTO;)V", "getCheckbox", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/CheckboxDTO;", "getProduct", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductDTOV2;", "getDynamicElements", "()Ljava/util/List;", "getControls", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO;", "getGetAccessoriesAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getSwipeInfo", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/SwipeInfoDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final CheckboxDTO checkbox;
        private final ControlsDTO controls;
        private final List<DynamicElementDTOV2> dynamicElements;
        private final AtomActionDTO getAccessoriesAction;

        @NotNull
        private final ProductDTOV2 product;
        private final SwipeInfoDTO swipeInfo;

        /* JADX WARN: Multi-variable type inference failed */
        public Item(CheckboxDTO checkboxDTO, @NotNull ProductDTOV2 product, List<? extends DynamicElementDTOV2> list, ControlsDTO controlsDTO, AtomActionDTO atomActionDTO, SwipeInfoDTO swipeInfoDTO) {
            Intrinsics.checkNotNullParameter(product, "product");
            this.checkbox = checkboxDTO;
            this.product = product;
            this.dynamicElements = list;
            this.controls = controlsDTO;
            this.getAccessoriesAction = atomActionDTO;
            this.swipeInfo = swipeInfoDTO;
        }

        public static /* synthetic */ Item copy$default(Item item, CheckboxDTO checkboxDTO, ProductDTOV2 productDTOV2, List list, ControlsDTO controlsDTO, AtomActionDTO atomActionDTO, SwipeInfoDTO swipeInfoDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                checkboxDTO = item.checkbox;
            }
            if ((i11 & 2) != 0) {
                productDTOV2 = item.product;
            }
            if ((i11 & 4) != 0) {
                list = item.dynamicElements;
            }
            if ((i11 & 8) != 0) {
                controlsDTO = item.controls;
            }
            if ((i11 & 16) != 0) {
                atomActionDTO = item.getAccessoriesAction;
            }
            if ((i11 & 32) != 0) {
                swipeInfoDTO = item.swipeInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            SwipeInfoDTO swipeInfoDTO2 = swipeInfoDTO;
            return item.copy(checkboxDTO, productDTOV2, list, controlsDTO, atomActionDTO2, swipeInfoDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final CheckboxDTO getCheckbox() {
            return this.checkbox;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ProductDTOV2 getProduct() {
            return this.product;
        }

        public final List<DynamicElementDTOV2> component3() {
            return this.dynamicElements;
        }

        /* renamed from: component4, reason: from getter */
        public final ControlsDTO getControls() {
            return this.controls;
        }

        /* renamed from: component5, reason: from getter */
        public final AtomActionDTO getGetAccessoriesAction() {
            return this.getAccessoriesAction;
        }

        /* renamed from: component6, reason: from getter */
        public final SwipeInfoDTO getSwipeInfo() {
            return this.swipeInfo;
        }

        @NotNull
        public final Item copy(CheckboxDTO checkbox, @NotNull ProductDTOV2 product, List<? extends DynamicElementDTOV2> dynamicElements, ControlsDTO controls, AtomActionDTO getAccessoriesAction, SwipeInfoDTO swipeInfo) {
            Intrinsics.checkNotNullParameter(product, "product");
            return new Item(checkbox, product, dynamicElements, controls, getAccessoriesAction, swipeInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.d(this.checkbox, item.checkbox) && Intrinsics.d(this.product, item.product) && Intrinsics.d(this.dynamicElements, item.dynamicElements) && Intrinsics.d(this.controls, item.controls) && Intrinsics.d(this.getAccessoriesAction, item.getAccessoriesAction) && Intrinsics.d(this.swipeInfo, item.swipeInfo);
        }

        public final CheckboxDTO getCheckbox() {
            return this.checkbox;
        }

        public final ControlsDTO getControls() {
            return this.controls;
        }

        public final List<DynamicElementDTOV2> getDynamicElements() {
            return this.dynamicElements;
        }

        public final AtomActionDTO getGetAccessoriesAction() {
            return this.getAccessoriesAction;
        }

        @NotNull
        public final ProductDTOV2 getProduct() {
            return this.product;
        }

        public final SwipeInfoDTO getSwipeInfo() {
            return this.swipeInfo;
        }

        public int hashCode() {
            CheckboxDTO checkboxDTO = this.checkbox;
            int hashCode = (this.product.hashCode() + ((checkboxDTO == null ? 0 : checkboxDTO.hashCode()) * 31)) * 31;
            List<DynamicElementDTOV2> list = this.dynamicElements;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            ControlsDTO controlsDTO = this.controls;
            int hashCode3 = (hashCode2 + (controlsDTO == null ? 0 : controlsDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.getAccessoriesAction;
            int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            SwipeInfoDTO swipeInfoDTO = this.swipeInfo;
            return hashCode4 + (swipeInfoDTO != null ? swipeInfoDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Item(checkbox=" + this.checkbox + ", product=" + this.product + ", dynamicElements=" + this.dynamicElements + ", controls=" + this.controls + ", getAccessoriesAction=" + this.getAccessoriesAction + ", swipeInfo=" + this.swipeInfo + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CartSplitV2DTOV2(HeaderDTO headerDTO, List<Item> list, List<? extends CartItemWrapper> list2, SeparatorConfig separatorConfig, Footer footer) {
        this.header = headerDTO;
        this.cartItems = list;
        this.cartItemsOneOf = list2;
        this.cartItemsSeparator = separatorConfig;
        this.footer = footer;
    }

    public static /* synthetic */ CartSplitV2DTOV2 copy$default(CartSplitV2DTOV2 cartSplitV2DTOV2, HeaderDTO headerDTO, List list, List list2, SeparatorConfig separatorConfig, Footer footer, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            headerDTO = cartSplitV2DTOV2.header;
        }
        if ((i11 & 2) != 0) {
            list = cartSplitV2DTOV2.cartItems;
        }
        if ((i11 & 4) != 0) {
            list2 = cartSplitV2DTOV2.cartItemsOneOf;
        }
        if ((i11 & 8) != 0) {
            separatorConfig = cartSplitV2DTOV2.cartItemsSeparator;
        }
        if ((i11 & 16) != 0) {
            footer = cartSplitV2DTOV2.footer;
        }
        Footer footer2 = footer;
        List list3 = list2;
        return cartSplitV2DTOV2.copy(headerDTO, list, list3, separatorConfig, footer2);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getCartItems$annotations() {
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getCartItemsOneOf$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    public final List<Item> component2() {
        return this.cartItems;
    }

    public final List<CartItemWrapper> component3() {
        return this.cartItemsOneOf;
    }

    /* renamed from: component4, reason: from getter */
    public final SeparatorConfig getCartItemsSeparator() {
        return this.cartItemsSeparator;
    }

    /* renamed from: component5, reason: from getter */
    public final Footer getFooter() {
        return this.footer;
    }

    @NotNull
    public final CartSplitV2DTOV2 copy(HeaderDTO header, List<Item> cartItems, List<? extends CartItemWrapper> cartItemsOneOf, SeparatorConfig cartItemsSeparator, Footer footer) {
        return new CartSplitV2DTOV2(header, cartItems, cartItemsOneOf, cartItemsSeparator, footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartSplitV2DTOV2)) {
            return false;
        }
        CartSplitV2DTOV2 cartSplitV2DTOV2 = (CartSplitV2DTOV2) other;
        return Intrinsics.d(this.header, cartSplitV2DTOV2.header) && Intrinsics.d(this.cartItems, cartSplitV2DTOV2.cartItems) && Intrinsics.d(this.cartItemsOneOf, cartSplitV2DTOV2.cartItemsOneOf) && Intrinsics.d(this.cartItemsSeparator, cartSplitV2DTOV2.cartItemsSeparator) && Intrinsics.d(this.footer, cartSplitV2DTOV2.footer);
    }

    public final List<Item> getCartItems() {
        return this.cartItems;
    }

    public final List<CartItemWrapper> getCartItemsOneOf() {
        return this.cartItemsOneOf;
    }

    public final SeparatorConfig getCartItemsSeparator() {
        return this.cartItemsSeparator;
    }

    public final Footer getFooter() {
        return this.footer;
    }

    public final HeaderDTO getHeader() {
        return this.header;
    }

    public int hashCode() {
        HeaderDTO headerDTO = this.header;
        int hashCode = (headerDTO == null ? 0 : headerDTO.hashCode()) * 31;
        List<Item> list = this.cartItems;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<CartItemWrapper> list2 = this.cartItemsOneOf;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        SeparatorConfig separatorConfig = this.cartItemsSeparator;
        int hashCode4 = (hashCode3 + (separatorConfig == null ? 0 : separatorConfig.hashCode())) * 31;
        Footer footer = this.footer;
        return hashCode4 + (footer != null ? footer.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CartSplitV2DTOV2(header=" + this.header + ", cartItems=" + this.cartItems + ", cartItemsOneOf=" + this.cartItemsOneOf + ", cartItemsSeparator=" + this.cartItemsSeparator + ", footer=" + this.footer + ")";
    }
}
