package ru.ozon.app.android.cart.alltocart.presentation;

import B0.A0;
import B0.C2454a;
import G.g;
import Lh.b;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.alltocart.core.AllToCartDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001%B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/cart/alltocart/presentation/AllToCartVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/cart/alltocart/presentation/AllToCartVO$CartData;", "skus", "Lru/ozon/app/android/cart/alltocart/core/AllToCartDTO$CartSwitchingButton;", "button", "", "idsRelatedButton", "<init>", "(JLjava/util/List;Lru/ozon/app/android/cart/alltocart/core/AllToCartDTO$CartSwitchingButton;Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getSkus", "()Ljava/util/List;", "Lru/ozon/app/android/cart/alltocart/core/AllToCartDTO$CartSwitchingButton;", "getButton", "()Lru/ozon/app/android/cart/alltocart/core/AllToCartDTO$CartSwitchingButton;", "Ljava/util/Set;", "getIdsRelatedButton", "()Ljava/util/Set;", "CartData", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AllToCartVO implements c {

    @NotNull
    private final AllToCartDTO.CartSwitchingButton button;
    private final long id;

    @NotNull
    private final Set<Long> idsRelatedButton;

    @NotNull
    private final List<CartData> skus;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/cart/alltocart/presentation/AllToCartVO$CartData;", "", "", "id", "", "maxItems", "addQuantity", "incrementQuantity", "selectedDeliverySchema", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(JIIILjava/lang/Long;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getMaxItems", "getAddQuantity", "getIncrementQuantity", "Ljava/lang/Long;", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CartData {
        private final int addQuantity;
        private final long id;
        private final int incrementQuantity;
        private final int maxItems;
        private final Long selectedDeliverySchema;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public CartData(long j11, int i11, int i12, int i13, Long l11, Map<String, TokenizedTrackingInfo> map) {
            this.id = j11;
            this.maxItems = i11;
            this.addQuantity = i12;
            this.incrementQuantity = i13;
            this.selectedDeliverySchema = l11;
            this.trackingInfo = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CartData)) {
                return false;
            }
            CartData cartData = (CartData) other;
            return this.id == cartData.id && this.maxItems == cartData.maxItems && this.addQuantity == cartData.addQuantity && this.incrementQuantity == cartData.incrementQuantity && Intrinsics.d(this.selectedDeliverySchema, cartData.selectedDeliverySchema) && Intrinsics.d(this.trackingInfo, cartData.trackingInfo);
        }

        public final int getAddQuantity() {
            return this.addQuantity;
        }

        public final long getId() {
            return this.id;
        }

        public final int getIncrementQuantity() {
            return this.incrementQuantity;
        }

        public final int getMaxItems() {
            return this.maxItems;
        }

        public final Long getSelectedDeliverySchema() {
            return this.selectedDeliverySchema;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.incrementQuantity, C2454a.a(this.addQuantity, C2454a.a(this.maxItems, Long.hashCode(this.id) * 31, 31), 31), 31);
            Long l11 = this.selectedDeliverySchema;
            int hashCode = (a11 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            int i11 = this.maxItems;
            int i12 = this.addQuantity;
            int i13 = this.incrementQuantity;
            Long l11 = this.selectedDeliverySchema;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder b11 = Ql.c.b(j11, "CartData(id=", i11, ", maxItems=");
            A0.c(i12, i13, ", addQuantity=", ", incrementQuantity=", b11);
            b11.append(", selectedDeliverySchema=");
            b11.append(l11);
            b11.append(", trackingInfo=");
            b11.append(map);
            b11.append(")");
            return b11.toString();
        }
    }

    public AllToCartVO(long j11, @NotNull List<CartData> skus, @NotNull AllToCartDTO.CartSwitchingButton button, @NotNull Set<Long> idsRelatedButton) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(idsRelatedButton, "idsRelatedButton");
        this.id = j11;
        this.skus = skus;
        this.button = button;
        this.idsRelatedButton = idsRelatedButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllToCartVO)) {
            return false;
        }
        AllToCartVO allToCartVO = (AllToCartVO) other;
        return this.id == allToCartVO.id && Intrinsics.d(this.skus, allToCartVO.skus) && Intrinsics.d(this.button, allToCartVO.button) && Intrinsics.d(this.idsRelatedButton, allToCartVO.idsRelatedButton);
    }

    @NotNull
    public final AllToCartDTO.CartSwitchingButton getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Set<Long> getIdsRelatedButton() {
        return this.idsRelatedButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<CartData> getSkus() {
        return this.skus;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.idsRelatedButton.hashCode() + ((this.button.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.skus)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<CartData> list = this.skus;
        AllToCartDTO.CartSwitchingButton cartSwitchingButton = this.button;
        Set<Long> set = this.idsRelatedButton;
        StringBuilder b11 = b.b(j11, "AllToCartVO(id=", ", skus=", list);
        b11.append(", button=");
        b11.append(cartSwitchingButton);
        b11.append(", idsRelatedButton=");
        b11.append(set);
        b11.append(")");
        return b11.toString();
    }
}
