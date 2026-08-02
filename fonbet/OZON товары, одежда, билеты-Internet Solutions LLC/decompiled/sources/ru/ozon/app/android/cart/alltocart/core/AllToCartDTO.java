package ru.ozon.app.android.cart.alltocart.core;

import B0.C2454a;
import Ef0.c;
import Kk.C3532b;
import N3.C3660k;
import Tl.b;
import Ve.C4636t5;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/cart/alltocart/core/AllToCartDTO;", "", "skus", "", "Lru/ozon/app/android/cart/alltocart/core/AllToCartDTO$CartData;", "button", "Lru/ozon/app/android/cart/alltocart/core/AllToCartDTO$CartSwitchingButton;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/cart/alltocart/core/AllToCartDTO$CartSwitchingButton;)V", "getSkus", "()Ljava/util/List;", "getButton", "()Lru/ozon/app/android/cart/alltocart/core/AllToCartDTO$CartSwitchingButton;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CartData", "CartSwitchingButton", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AllToCartDTO {
    public static final int $stable = 8;

    @NotNull
    private final CartSwitchingButton button;

    @NotNull
    private final List<CartData> skus;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J^\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/cart/alltocart/core/AllToCartDTO$CartData;", "", "id", "", "maxItems", "", "addQuantity", "incrementQuantity", "selectedDeliverySchema", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getMaxItems", "()I", "getAddQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIncrementQuantity", "getSelectedDeliverySchema", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)Lru/ozon/app/android/cart/alltocart/core/AllToCartDTO$CartData;", "equals", "", "other", "hashCode", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CartData {
        public static final int $stable = 8;
        private final Integer addQuantity;

        @NotNull
        private final String id;
        private final Integer incrementQuantity;
        private final int maxItems;
        private final Integer selectedDeliverySchema;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public CartData(@NotNull String id2, int i11, Integer num, Integer num2, Integer num3, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.id = id2;
            this.maxItems = i11;
            this.addQuantity = num;
            this.incrementQuantity = num2;
            this.selectedDeliverySchema = num3;
            this.trackingInfo = map;
        }

        public static /* synthetic */ CartData copy$default(CartData cartData, String str, int i11, Integer num, Integer num2, Integer num3, Map map, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = cartData.id;
            }
            if ((i12 & 2) != 0) {
                i11 = cartData.maxItems;
            }
            if ((i12 & 4) != 0) {
                num = cartData.addQuantity;
            }
            if ((i12 & 8) != 0) {
                num2 = cartData.incrementQuantity;
            }
            if ((i12 & 16) != 0) {
                num3 = cartData.selectedDeliverySchema;
            }
            if ((i12 & 32) != 0) {
                map = cartData.trackingInfo;
            }
            Integer num4 = num3;
            Map map2 = map;
            return cartData.copy(str, i11, num, num2, num4, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaxItems() {
            return this.maxItems;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getAddQuantity() {
            return this.addQuantity;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getIncrementQuantity() {
            return this.incrementQuantity;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getSelectedDeliverySchema() {
            return this.selectedDeliverySchema;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final CartData copy(@NotNull String id2, int maxItems, Integer addQuantity, Integer incrementQuantity, Integer selectedDeliverySchema, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return new CartData(id2, maxItems, addQuantity, incrementQuantity, selectedDeliverySchema, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CartData)) {
                return false;
            }
            CartData cartData = (CartData) other;
            return Intrinsics.d(this.id, cartData.id) && this.maxItems == cartData.maxItems && Intrinsics.d(this.addQuantity, cartData.addQuantity) && Intrinsics.d(this.incrementQuantity, cartData.incrementQuantity) && Intrinsics.d(this.selectedDeliverySchema, cartData.selectedDeliverySchema) && Intrinsics.d(this.trackingInfo, cartData.trackingInfo);
        }

        public final Integer getAddQuantity() {
            return this.addQuantity;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final Integer getIncrementQuantity() {
            return this.incrementQuantity;
        }

        public final int getMaxItems() {
            return this.maxItems;
        }

        public final Integer getSelectedDeliverySchema() {
            return this.selectedDeliverySchema;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.maxItems, this.id.hashCode() * 31, 31);
            Integer num = this.addQuantity;
            int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.incrementQuantity;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.selectedDeliverySchema;
            int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            int i11 = this.maxItems;
            Integer num = this.addQuantity;
            Integer num2 = this.incrementQuantity;
            Integer num3 = this.selectedDeliverySchema;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder c11 = C3660k.c(i11, "CartData(id=", str, ", maxItems=", ", addQuantity=");
            c.e(c11, num, ", incrementQuantity=", num2, ", selectedDeliverySchema=");
            c11.append(num3);
            c11.append(", trackingInfo=");
            c11.append(map);
            c11.append(")");
            return c11.toString();
        }
    }

    public AllToCartDTO(@NotNull List<CartData> skus, @NotNull CartSwitchingButton button) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        Intrinsics.checkNotNullParameter(button, "button");
        this.skus = skus;
        this.button = button;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AllToCartDTO copy$default(AllToCartDTO allToCartDTO, List list, CartSwitchingButton cartSwitchingButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = allToCartDTO.skus;
        }
        if ((i11 & 2) != 0) {
            cartSwitchingButton = allToCartDTO.button;
        }
        return allToCartDTO.copy(list, cartSwitchingButton);
    }

    @NotNull
    public final List<CartData> component1() {
        return this.skus;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CartSwitchingButton getButton() {
        return this.button;
    }

    @NotNull
    public final AllToCartDTO copy(@NotNull List<CartData> skus, @NotNull CartSwitchingButton button) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        Intrinsics.checkNotNullParameter(button, "button");
        return new AllToCartDTO(skus, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllToCartDTO)) {
            return false;
        }
        AllToCartDTO allToCartDTO = (AllToCartDTO) other;
        return Intrinsics.d(this.skus, allToCartDTO.skus) && Intrinsics.d(this.button, allToCartDTO.button);
    }

    @NotNull
    public final CartSwitchingButton getButton() {
        return this.button;
    }

    @NotNull
    public final List<CartData> getSkus() {
        return this.skus;
    }

    public int hashCode() {
        return this.button.hashCode() + (this.skus.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AllToCartDTO(skus=" + this.skus + ", button=" + this.button + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/cart/alltocart/core/AllToCartDTO$CartSwitchingButton;", "", "id", "", "isActive", "", "defaultButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "activeButton", "<init>", "(Ljava/lang/String;ZLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "getId", "()Ljava/lang/String;", "()Z", "getDefaultButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getActiveButton", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CartSwitchingButton {
        public static final int $stable = ButtonV3Atom.LargeButton.$stable;

        @NotNull
        private final ButtonV3Atom.LargeButton activeButton;

        @NotNull
        private final ButtonV3Atom.LargeButton defaultButton;

        @NotNull
        private final String id;
        private final boolean isActive;

        public CartSwitchingButton(@NotNull String id2, boolean z11, @NotNull ButtonV3Atom.LargeButton defaultButton, @NotNull ButtonV3Atom.LargeButton activeButton) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(defaultButton, "defaultButton");
            Intrinsics.checkNotNullParameter(activeButton, "activeButton");
            this.id = id2;
            this.isActive = z11;
            this.defaultButton = defaultButton;
            this.activeButton = activeButton;
        }

        public static /* synthetic */ CartSwitchingButton copy$default(CartSwitchingButton cartSwitchingButton, String str, boolean z11, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.LargeButton largeButton2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cartSwitchingButton.id;
            }
            if ((i11 & 2) != 0) {
                z11 = cartSwitchingButton.isActive;
            }
            if ((i11 & 4) != 0) {
                largeButton = cartSwitchingButton.defaultButton;
            }
            if ((i11 & 8) != 0) {
                largeButton2 = cartSwitchingButton.activeButton;
            }
            return cartSwitchingButton.copy(str, z11, largeButton, largeButton2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ButtonV3Atom.LargeButton getDefaultButton() {
            return this.defaultButton;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final ButtonV3Atom.LargeButton getActiveButton() {
            return this.activeButton;
        }

        @NotNull
        public final CartSwitchingButton copy(@NotNull String id2, boolean isActive, @NotNull ButtonV3Atom.LargeButton defaultButton, @NotNull ButtonV3Atom.LargeButton activeButton) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(defaultButton, "defaultButton");
            Intrinsics.checkNotNullParameter(activeButton, "activeButton");
            return new CartSwitchingButton(id2, isActive, defaultButton, activeButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CartSwitchingButton)) {
                return false;
            }
            CartSwitchingButton cartSwitchingButton = (CartSwitchingButton) other;
            return Intrinsics.d(this.id, cartSwitchingButton.id) && this.isActive == cartSwitchingButton.isActive && Intrinsics.d(this.defaultButton, cartSwitchingButton.defaultButton) && Intrinsics.d(this.activeButton, cartSwitchingButton.activeButton);
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getActiveButton() {
            return this.activeButton;
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getDefaultButton() {
            return this.defaultButton;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.activeButton.hashCode() + b.a(this.defaultButton, C3532b.a(this.id.hashCode() * 31, 31, this.isActive), 31);
        }

        public final boolean isActive() {
            return this.isActive;
        }

        @NotNull
        public String toString() {
            String str = this.id;
            boolean z11 = this.isActive;
            ButtonV3Atom.LargeButton largeButton = this.defaultButton;
            ButtonV3Atom.LargeButton largeButton2 = this.activeButton;
            StringBuilder b11 = C4636t5.b("CartSwitchingButton(id=", str, ", isActive=", ", defaultButton=", z11);
            b11.append(largeButton);
            b11.append(", activeButton=");
            b11.append(largeButton2);
            b11.append(")");
            return b11.toString();
        }

        public /* synthetic */ CartSwitchingButton(String str, boolean z11, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.LargeButton largeButton2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? false : z11, largeButton, largeButton2);
        }
    }
}
