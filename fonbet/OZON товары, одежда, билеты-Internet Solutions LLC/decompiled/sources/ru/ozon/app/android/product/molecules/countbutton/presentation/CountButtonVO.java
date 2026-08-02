package ru.ozon.app.android.product.molecules.countbutton.presentation;

import Am.C2438a;
import B0.C2454a;
import Bl.b;
import E0.C2942q;
import G.g;
import Kk.C3532b;
import Nh.a;
import Pk0.c;
import T7.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.data.tiles.countbutton.UpdateCartMode;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001:\u0001+BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u0005\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b\"\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b#\u0010\u0013R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b*\u0010\u0013¨\u0006,"}, d2 = {"Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO;", "", "", "sku", "", "isDisabled", "widgetId", "", "icon", "iconColor", "backgroundColor", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO$UpdateCart;", "updateCart", "Lru/ozon/uni/atoms/af/AtomAction;", "commonAction", "automatizationId", "<init>", "(JZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO$UpdateCart;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getSku", "()J", "Z", "()Z", "getWidgetId", "Ljava/lang/String;", "getIcon", "getIconColor", "getBackgroundColor", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO$UpdateCart;", "getUpdateCart", "()Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO$UpdateCart;", "Lru/ozon/uni/atoms/af/AtomAction;", "getCommonAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getAutomatizationId", "UpdateCart", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CountButtonVO {
    private final String automatizationId;

    @NotNull
    private final String backgroundColor;
    private final AtomAction commonAction;

    @NotNull
    private final String icon;

    @NotNull
    private final String iconColor;
    private final boolean isDisabled;
    private final long sku;
    private final UpdateCart updateCart;
    private final long widgetId;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b&\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO$UpdateCart;", "", "", "quantity", "minItems", "maxItems", "", "selectedDeliverySchema", "Lru/ozon/app/android/storefront/data/tiles/countbutton/UpdateCartMode;", "mode", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "extendMap", "<init>", "(IIILjava/lang/Long;Lru/ozon/app/android/storefront/data/tiles/countbutton/UpdateCartMode;Ljava/util/Map;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getQuantity", "getMinItems", "getMaxItems", "Ljava/lang/Long;", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "Lru/ozon/app/android/storefront/data/tiles/countbutton/UpdateCartMode;", "getMode", "()Lru/ozon/app/android/storefront/data/tiles/countbutton/UpdateCartMode;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "getExtendMap", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateCart {
        private final Map<String, String> extendMap;
        private final int maxItems;
        private final int minItems;

        @NotNull
        private final UpdateCartMode mode;
        private final int quantity;
        private final Long selectedDeliverySchema;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public UpdateCart(int i11, int i12, int i13, Long l11, @NotNull UpdateCartMode mode, Map<String, TokenizedTrackingInfo> map, Map<String, String> map2) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.quantity = i11;
            this.minItems = i12;
            this.maxItems = i13;
            this.selectedDeliverySchema = l11;
            this.mode = mode;
            this.trackingInfo = map;
            this.extendMap = map2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateCart)) {
                return false;
            }
            UpdateCart updateCart = (UpdateCart) other;
            return this.quantity == updateCart.quantity && this.minItems == updateCart.minItems && this.maxItems == updateCart.maxItems && Intrinsics.d(this.selectedDeliverySchema, updateCart.selectedDeliverySchema) && this.mode == updateCart.mode && Intrinsics.d(this.trackingInfo, updateCart.trackingInfo) && Intrinsics.d(this.extendMap, updateCart.extendMap);
        }

        public final Map<String, String> getExtendMap() {
            return this.extendMap;
        }

        public final int getMaxItems() {
            return this.maxItems;
        }

        public final int getMinItems() {
            return this.minItems;
        }

        @NotNull
        public final UpdateCartMode getMode() {
            return this.mode;
        }

        public final int getQuantity() {
            return this.quantity;
        }

        public final Long getSelectedDeliverySchema() {
            return this.selectedDeliverySchema;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.maxItems, C2454a.a(this.minItems, Integer.hashCode(this.quantity) * 31, 31), 31);
            Long l11 = this.selectedDeliverySchema;
            int hashCode = (this.mode.hashCode() + ((a11 + (l11 == null ? 0 : l11.hashCode())) * 31)) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, String> map2 = this.extendMap;
            return hashCode2 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.quantity;
            int i12 = this.minItems;
            int i13 = this.maxItems;
            Long l11 = this.selectedDeliverySchema;
            UpdateCartMode updateCartMode = this.mode;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Map<String, String> map2 = this.extendMap;
            StringBuilder a11 = C2438a.a("UpdateCart(quantity=", i11, ", minItems=", ", maxItems=", i12);
            a11.append(i13);
            a11.append(", selectedDeliverySchema=");
            a11.append(l11);
            a11.append(", mode=");
            a11.append(updateCartMode);
            a11.append(", trackingInfo=");
            a11.append(map);
            a11.append(", extendMap=");
            return P.f(a11, map2, ")");
        }
    }

    public CountButtonVO(long j11, boolean z11, long j12, @NotNull String icon, @NotNull String iconColor, @NotNull String backgroundColor, UpdateCart updateCart, AtomAction atomAction, String str) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.sku = j11;
        this.isDisabled = z11;
        this.widgetId = j12;
        this.icon = icon;
        this.iconColor = iconColor;
        this.backgroundColor = backgroundColor;
        this.updateCart = updateCart;
        this.commonAction = atomAction;
        this.automatizationId = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountButtonVO)) {
            return false;
        }
        CountButtonVO countButtonVO = (CountButtonVO) other;
        return this.sku == countButtonVO.sku && this.isDisabled == countButtonVO.isDisabled && this.widgetId == countButtonVO.widgetId && Intrinsics.d(this.icon, countButtonVO.icon) && Intrinsics.d(this.iconColor, countButtonVO.iconColor) && Intrinsics.d(this.backgroundColor, countButtonVO.backgroundColor) && Intrinsics.d(this.updateCart, countButtonVO.updateCart) && Intrinsics.d(this.commonAction, countButtonVO.commonAction) && Intrinsics.d(this.automatizationId, countButtonVO.automatizationId);
    }

    public final String getAutomatizationId() {
        return this.automatizationId;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final AtomAction getCommonAction() {
        return this.commonAction;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getIconColor() {
        return this.iconColor;
    }

    public final long getSku() {
        return this.sku;
    }

    public final UpdateCart getUpdateCart() {
        return this.updateCart;
    }

    public final long getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int a11 = g.a(g.a(g.a(c.a(C3532b.a(Long.hashCode(this.sku) * 31, 31, this.isDisabled), 31, this.widgetId), 31, this.icon), 31, this.iconColor), 31, this.backgroundColor);
        UpdateCart updateCart = this.updateCart;
        int hashCode = (a11 + (updateCart == null ? 0 : updateCart.hashCode())) * 31;
        AtomAction atomAction = this.commonAction;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        String str = this.automatizationId;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: isDisabled, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public String toString() {
        long j11 = this.sku;
        boolean z11 = this.isDisabled;
        long j12 = this.widgetId;
        String str = this.icon;
        String str2 = this.iconColor;
        String str3 = this.backgroundColor;
        UpdateCart updateCart = this.updateCart;
        AtomAction atomAction = this.commonAction;
        String str4 = this.automatizationId;
        StringBuilder c11 = b.c(j11, "CountButtonVO(sku=", ", isDisabled=", z11);
        C2942q.f(c11, ", widgetId=", j12, ", icon=");
        a.h(c11, str, ", iconColor=", str2, ", backgroundColor=");
        c11.append(str3);
        c11.append(", updateCart=");
        c11.append(updateCart);
        c11.append(", commonAction=");
        c11.append(atomAction);
        c11.append(", automatizationId=");
        c11.append(str4);
        c11.append(")");
        return c11.toString();
    }
}
