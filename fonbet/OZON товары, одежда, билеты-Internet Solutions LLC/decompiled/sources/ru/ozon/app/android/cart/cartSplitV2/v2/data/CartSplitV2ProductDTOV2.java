package ru.ozon.app.android.cart.cartSplitV2.v2.data;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.ProductDTOV2;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jl\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0015J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010\u001fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010#¨\u0006>"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2ProductDTOV2;", "", "", "index", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CheckboxDTO;", "checkbox", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductDTOV2;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;", "cartItemsSeparator", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/SwipeInfoDTO;", "swipeInfo", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "favoriteProduct", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "removeAction", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DynamicElementsDTOV2;", "bottomDynamicElements", "<init>", "(ILru/ozon/app/android/cart/cartSplitV2/v2/data/CheckboxDTO;Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductDTOV2;Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;Lru/ozon/app/android/cart/cartSplitV2/v2/data/SwipeInfoDTO;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DynamicElementsDTOV2;)V", "component1", "()I", "component2", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/CheckboxDTO;", "component3", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductDTOV2;", "component4", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;", "component5", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/SwipeInfoDTO;", "component6", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "component7", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component8", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DynamicElementsDTOV2;", "copy", "(ILru/ozon/app/android/cart/cartSplitV2/v2/data/CheckboxDTO;Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductDTOV2;Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;Lru/ozon/app/android/cart/cartSplitV2/v2/data/SwipeInfoDTO;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DynamicElementsDTOV2;)Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2ProductDTOV2;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getIndex", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CheckboxDTO;", "getCheckbox", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductDTOV2;", "getProduct", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;", "getCartItemsSeparator", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/SwipeInfoDTO;", "getSwipeInfo", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getFavoriteProduct", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getRemoveAction", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DynamicElementsDTOV2;", "getBottomDynamicElements", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartSplitV2ProductDTOV2 {
    public static final int $stable = 8;
    private final CartSplitV2DynamicElementsDTOV2 bottomDynamicElements;
    private final SeparatorConfig cartItemsSeparator;
    private final CheckboxDTO checkbox;
    private final FavoriteProductMolecule favoriteProduct;
    private final int index;

    @NotNull
    private final ProductDTOV2 product;
    private final AtomActionDTO removeAction;
    private final SwipeInfoDTO swipeInfo;

    public CartSplitV2ProductDTOV2(int i11, CheckboxDTO checkboxDTO, @NotNull ProductDTOV2 product, SeparatorConfig separatorConfig, SwipeInfoDTO swipeInfoDTO, FavoriteProductMolecule favoriteProductMolecule, AtomActionDTO atomActionDTO, CartSplitV2DynamicElementsDTOV2 cartSplitV2DynamicElementsDTOV2) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.index = i11;
        this.checkbox = checkboxDTO;
        this.product = product;
        this.cartItemsSeparator = separatorConfig;
        this.swipeInfo = swipeInfoDTO;
        this.favoriteProduct = favoriteProductMolecule;
        this.removeAction = atomActionDTO;
        this.bottomDynamicElements = cartSplitV2DynamicElementsDTOV2;
    }

    public static /* synthetic */ CartSplitV2ProductDTOV2 copy$default(CartSplitV2ProductDTOV2 cartSplitV2ProductDTOV2, int i11, CheckboxDTO checkboxDTO, ProductDTOV2 productDTOV2, SeparatorConfig separatorConfig, SwipeInfoDTO swipeInfoDTO, FavoriteProductMolecule favoriteProductMolecule, AtomActionDTO atomActionDTO, CartSplitV2DynamicElementsDTOV2 cartSplitV2DynamicElementsDTOV2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = cartSplitV2ProductDTOV2.index;
        }
        if ((i12 & 2) != 0) {
            checkboxDTO = cartSplitV2ProductDTOV2.checkbox;
        }
        if ((i12 & 4) != 0) {
            productDTOV2 = cartSplitV2ProductDTOV2.product;
        }
        if ((i12 & 8) != 0) {
            separatorConfig = cartSplitV2ProductDTOV2.cartItemsSeparator;
        }
        if ((i12 & 16) != 0) {
            swipeInfoDTO = cartSplitV2ProductDTOV2.swipeInfo;
        }
        if ((i12 & 32) != 0) {
            favoriteProductMolecule = cartSplitV2ProductDTOV2.favoriteProduct;
        }
        if ((i12 & 64) != 0) {
            atomActionDTO = cartSplitV2ProductDTOV2.removeAction;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            cartSplitV2DynamicElementsDTOV2 = cartSplitV2ProductDTOV2.bottomDynamicElements;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        CartSplitV2DynamicElementsDTOV2 cartSplitV2DynamicElementsDTOV22 = cartSplitV2DynamicElementsDTOV2;
        SwipeInfoDTO swipeInfoDTO2 = swipeInfoDTO;
        FavoriteProductMolecule favoriteProductMolecule2 = favoriteProductMolecule;
        return cartSplitV2ProductDTOV2.copy(i11, checkboxDTO, productDTOV2, separatorConfig, swipeInfoDTO2, favoriteProductMolecule2, atomActionDTO2, cartSplitV2DynamicElementsDTOV22);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: component2, reason: from getter */
    public final CheckboxDTO getCheckbox() {
        return this.checkbox;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ProductDTOV2 getProduct() {
        return this.product;
    }

    /* renamed from: component4, reason: from getter */
    public final SeparatorConfig getCartItemsSeparator() {
        return this.cartItemsSeparator;
    }

    /* renamed from: component5, reason: from getter */
    public final SwipeInfoDTO getSwipeInfo() {
        return this.swipeInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final FavoriteProductMolecule getFavoriteProduct() {
        return this.favoriteProduct;
    }

    /* renamed from: component7, reason: from getter */
    public final AtomActionDTO getRemoveAction() {
        return this.removeAction;
    }

    /* renamed from: component8, reason: from getter */
    public final CartSplitV2DynamicElementsDTOV2 getBottomDynamicElements() {
        return this.bottomDynamicElements;
    }

    @NotNull
    public final CartSplitV2ProductDTOV2 copy(int index, CheckboxDTO checkbox, @NotNull ProductDTOV2 product, SeparatorConfig cartItemsSeparator, SwipeInfoDTO swipeInfo, FavoriteProductMolecule favoriteProduct, AtomActionDTO removeAction, CartSplitV2DynamicElementsDTOV2 bottomDynamicElements) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new CartSplitV2ProductDTOV2(index, checkbox, product, cartItemsSeparator, swipeInfo, favoriteProduct, removeAction, bottomDynamicElements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartSplitV2ProductDTOV2)) {
            return false;
        }
        CartSplitV2ProductDTOV2 cartSplitV2ProductDTOV2 = (CartSplitV2ProductDTOV2) other;
        return this.index == cartSplitV2ProductDTOV2.index && Intrinsics.d(this.checkbox, cartSplitV2ProductDTOV2.checkbox) && Intrinsics.d(this.product, cartSplitV2ProductDTOV2.product) && Intrinsics.d(this.cartItemsSeparator, cartSplitV2ProductDTOV2.cartItemsSeparator) && Intrinsics.d(this.swipeInfo, cartSplitV2ProductDTOV2.swipeInfo) && Intrinsics.d(this.favoriteProduct, cartSplitV2ProductDTOV2.favoriteProduct) && Intrinsics.d(this.removeAction, cartSplitV2ProductDTOV2.removeAction) && Intrinsics.d(this.bottomDynamicElements, cartSplitV2ProductDTOV2.bottomDynamicElements);
    }

    public final CartSplitV2DynamicElementsDTOV2 getBottomDynamicElements() {
        return this.bottomDynamicElements;
    }

    public final SeparatorConfig getCartItemsSeparator() {
        return this.cartItemsSeparator;
    }

    public final CheckboxDTO getCheckbox() {
        return this.checkbox;
    }

    public final FavoriteProductMolecule getFavoriteProduct() {
        return this.favoriteProduct;
    }

    public int getIndex() {
        return this.index;
    }

    @NotNull
    public final ProductDTOV2 getProduct() {
        return this.product;
    }

    public final AtomActionDTO getRemoveAction() {
        return this.removeAction;
    }

    public final SwipeInfoDTO getSwipeInfo() {
        return this.swipeInfo;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.index) * 31;
        CheckboxDTO checkboxDTO = this.checkbox;
        int hashCode2 = (this.product.hashCode() + ((hashCode + (checkboxDTO == null ? 0 : checkboxDTO.hashCode())) * 31)) * 31;
        SeparatorConfig separatorConfig = this.cartItemsSeparator;
        int hashCode3 = (hashCode2 + (separatorConfig == null ? 0 : separatorConfig.hashCode())) * 31;
        SwipeInfoDTO swipeInfoDTO = this.swipeInfo;
        int hashCode4 = (hashCode3 + (swipeInfoDTO == null ? 0 : swipeInfoDTO.hashCode())) * 31;
        FavoriteProductMolecule favoriteProductMolecule = this.favoriteProduct;
        int hashCode5 = (hashCode4 + (favoriteProductMolecule == null ? 0 : favoriteProductMolecule.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.removeAction;
        int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        CartSplitV2DynamicElementsDTOV2 cartSplitV2DynamicElementsDTOV2 = this.bottomDynamicElements;
        return hashCode6 + (cartSplitV2DynamicElementsDTOV2 != null ? cartSplitV2DynamicElementsDTOV2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CartSplitV2ProductDTOV2(index=" + this.index + ", checkbox=" + this.checkbox + ", product=" + this.product + ", cartItemsSeparator=" + this.cartItemsSeparator + ", swipeInfo=" + this.swipeInfo + ", favoriteProduct=" + this.favoriteProduct + ", removeAction=" + this.removeAction + ", bottomDynamicElements=" + this.bottomDynamicElements + ")";
    }
}
