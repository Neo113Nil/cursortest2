package ru.ozon.app.android.storefront.data.tiles.addtocart;

import B0.C2454a;
import Fm.C3051a;
import G.g;
import I0.C3173b;
import N3.C3660k;
import Sc.InterfaceC4008j;
import Sc.k;
import T7.P;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0005;<=>?Bw\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010/\u001a\u00020\u000bHÆ\u0003J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J\u008e\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\t2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0013\u0010'\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006@"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "", "skuId", "", "actionButton", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$ActionButton;", "quantityButton", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton;", "isDisabled", "", "theme", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "extend", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Extend;", "extendMap", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$ActionButton;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton;Ljava/lang/Boolean;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Extend;Ljava/util/Map;)V", "getSkuId", "()Ljava/lang/String;", "getActionButton", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$ActionButton;", "getQuantityButton", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTheme", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getExtend", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Extend;", "getExtendMap", "skuLong", "", "getSkuLong", "()Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$ActionButton;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton;Ljava/lang/Boolean;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Extend;Ljava/util/Map;)Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "equals", "other", "hashCode", "", "toString", "Companion", "Extend", "ActionButton", "QuantityButton", "Theme", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AddToCartButtonDTO {

    @NotNull
    public static final String ADD_TO_CART_ACTION_ID = "addToCart";
    public static final int DEFAULT_QUANTITY = 1;

    @NotNull
    public static final String QUANTITY_PARAM_NAME = "quantity";

    @NotNull
    public static final String SELECTED_DELIVERY_SCHEMA_PARAM_NAME = "selectedDeliverySchema";

    @NotNull
    public static final String SKU_ID_PARAM_NAME = "id";

    @NotNull
    private final ActionButton actionButton;
    private final Extend extend;
    private final Map<String, String> extendMap;
    private final Boolean isDisabled;
    private final QuantityButton quantityButton;
    private final String skuId;
    private final TestInfo testInfo;

    @NotNull
    private final Theme theme;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$ActionButton;", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "icon", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "sellerIcon", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$ActionButton$SellerIcon;", "<init>", "(Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$ActionButton$SellerIcon;)V", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getIcon", "()Ljava/lang/String;", "getTitle", "getSellerIcon", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$ActionButton$SellerIcon;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "SellerIcon", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ActionButton {
        private final CommonControlSettings common;
        private final String icon;
        private final SellerIcon sellerIcon;
        private final String title;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$ActionButton$SellerIcon;", "", "sellerIcon", "", "sellerIconBackground", "tileBackground", "sellerIconTint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSellerIcon", "()Ljava/lang/String;", "getSellerIconBackground", "getTileBackground", "getSellerIconTint", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SellerIcon {

            @NotNull
            private final String sellerIcon;

            @NotNull
            private final String sellerIconBackground;
            private final String sellerIconTint;

            @NotNull
            private final String tileBackground;

            public SellerIcon(@NotNull String sellerIcon, @NotNull String sellerIconBackground, @NotNull String tileBackground, String str) {
                Intrinsics.checkNotNullParameter(sellerIcon, "sellerIcon");
                Intrinsics.checkNotNullParameter(sellerIconBackground, "sellerIconBackground");
                Intrinsics.checkNotNullParameter(tileBackground, "tileBackground");
                this.sellerIcon = sellerIcon;
                this.sellerIconBackground = sellerIconBackground;
                this.tileBackground = tileBackground;
                this.sellerIconTint = str;
            }

            public static /* synthetic */ SellerIcon copy$default(SellerIcon sellerIcon, String str, String str2, String str3, String str4, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = sellerIcon.sellerIcon;
                }
                if ((i11 & 2) != 0) {
                    str2 = sellerIcon.sellerIconBackground;
                }
                if ((i11 & 4) != 0) {
                    str3 = sellerIcon.tileBackground;
                }
                if ((i11 & 8) != 0) {
                    str4 = sellerIcon.sellerIconTint;
                }
                return sellerIcon.copy(str, str2, str3, str4);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getSellerIcon() {
                return this.sellerIcon;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getSellerIconBackground() {
                return this.sellerIconBackground;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getTileBackground() {
                return this.tileBackground;
            }

            /* renamed from: component4, reason: from getter */
            public final String getSellerIconTint() {
                return this.sellerIconTint;
            }

            @NotNull
            public final SellerIcon copy(@NotNull String sellerIcon, @NotNull String sellerIconBackground, @NotNull String tileBackground, String sellerIconTint) {
                Intrinsics.checkNotNullParameter(sellerIcon, "sellerIcon");
                Intrinsics.checkNotNullParameter(sellerIconBackground, "sellerIconBackground");
                Intrinsics.checkNotNullParameter(tileBackground, "tileBackground");
                return new SellerIcon(sellerIcon, sellerIconBackground, tileBackground, sellerIconTint);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SellerIcon)) {
                    return false;
                }
                SellerIcon sellerIcon = (SellerIcon) other;
                return Intrinsics.d(this.sellerIcon, sellerIcon.sellerIcon) && Intrinsics.d(this.sellerIconBackground, sellerIcon.sellerIconBackground) && Intrinsics.d(this.tileBackground, sellerIcon.tileBackground) && Intrinsics.d(this.sellerIconTint, sellerIcon.sellerIconTint);
            }

            @NotNull
            public final String getSellerIcon() {
                return this.sellerIcon;
            }

            @NotNull
            public final String getSellerIconBackground() {
                return this.sellerIconBackground;
            }

            public final String getSellerIconTint() {
                return this.sellerIconTint;
            }

            @NotNull
            public final String getTileBackground() {
                return this.tileBackground;
            }

            public int hashCode() {
                int a11 = g.a(g.a(this.sellerIcon.hashCode() * 31, 31, this.sellerIconBackground), 31, this.tileBackground);
                String str = this.sellerIconTint;
                return a11 + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.sellerIcon;
                String str2 = this.sellerIconBackground;
                return C3173b.c(C3660k.d("SellerIcon(sellerIcon=", str, ", sellerIconBackground=", str2, ", tileBackground="), this.tileBackground, ", sellerIconTint=", this.sellerIconTint, ")");
            }
        }

        public ActionButton(CommonControlSettings commonControlSettings, String str, String str2, SellerIcon sellerIcon) {
            this.common = commonControlSettings;
            this.icon = str;
            this.title = str2;
            this.sellerIcon = sellerIcon;
        }

        public static /* synthetic */ ActionButton copy$default(ActionButton actionButton, CommonControlSettings commonControlSettings, String str, String str2, SellerIcon sellerIcon, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                commonControlSettings = actionButton.common;
            }
            if ((i11 & 2) != 0) {
                str = actionButton.icon;
            }
            if ((i11 & 4) != 0) {
                str2 = actionButton.title;
            }
            if ((i11 & 8) != 0) {
                sellerIcon = actionButton.sellerIcon;
            }
            return actionButton.copy(commonControlSettings, str, str2, sellerIcon);
        }

        /* renamed from: component1, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final SellerIcon getSellerIcon() {
            return this.sellerIcon;
        }

        @NotNull
        public final ActionButton copy(CommonControlSettings common, String icon, String title, SellerIcon sellerIcon) {
            return new ActionButton(common, icon, title, sellerIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionButton)) {
                return false;
            }
            ActionButton actionButton = (ActionButton) other;
            return Intrinsics.d(this.common, actionButton.common) && Intrinsics.d(this.icon, actionButton.icon) && Intrinsics.d(this.title, actionButton.title) && Intrinsics.d(this.sellerIcon, actionButton.sellerIcon);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final String getIcon() {
            return this.icon;
        }

        public final SellerIcon getSellerIcon() {
            return this.sellerIcon;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            CommonControlSettings commonControlSettings = this.common;
            int hashCode = (commonControlSettings == null ? 0 : commonControlSettings.hashCode()) * 31;
            String str = this.icon;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.title;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            SellerIcon sellerIcon = this.sellerIcon;
            return hashCode3 + (sellerIcon != null ? sellerIcon.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ActionButton(common=" + this.common + ", icon=" + this.icon + ", title=" + this.title + ", sellerIcon=" + this.sellerIcon + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Extend;", "", "<init>", "(Ljava/lang/String;I)V", "EXTEND_UNDEFINED", "QUANT_NOTIFY", "RECOMS_NOTIFY", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Extend {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Extend[] $VALUES;
        public static final Extend EXTEND_UNDEFINED = new Extend("EXTEND_UNDEFINED", 0);
        public static final Extend QUANT_NOTIFY = new Extend("QUANT_NOTIFY", 1);
        public static final Extend RECOMS_NOTIFY = new Extend("RECOMS_NOTIFY", 2);

        private static final /* synthetic */ Extend[] $values() {
            return new Extend[]{EXTEND_UNDEFINED, QUANT_NOTIFY, RECOMS_NOTIFY};
        }

        static {
            Extend[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Extend(String str, int i11) {
        }

        public static Extend valueOf(String str) {
            return (Extend) Enum.valueOf(Extend.class, str);
        }

        public static Extend[] values() {
            return (Extend[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u0004\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme;", "", "<init>", "()V", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme$Colors;", "colors$delegate", "LSc/j;", "getColors", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme$Colors;", "colors", "StyleWrapper", "Colors", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme$StyleWrapper;", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Theme {

        /* renamed from: colors$delegate, reason: from kotlin metadata */
        @NotNull
        private final InterfaceC4008j colors;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme$Colors;", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme;", "backgroundColor", "", "iconColor", "titleColor", "counterBackgroundColor", "plusMinusColor", "counterTextColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getIconColor", "getTitleColor", "getCounterBackgroundColor", "getPlusMinusColor", "getCounterTextColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Colors extends Theme {

            @NotNull
            private final String backgroundColor;

            @NotNull
            private final String counterBackgroundColor;

            @NotNull
            private final String counterTextColor;
            private final String iconColor;

            @NotNull
            private final String plusMinusColor;

            @NotNull
            private final String titleColor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Colors(@NotNull String backgroundColor, String str, @NotNull String titleColor, @NotNull String counterBackgroundColor, @NotNull String plusMinusColor, @NotNull String counterTextColor) {
                super(null);
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(counterBackgroundColor, "counterBackgroundColor");
                Intrinsics.checkNotNullParameter(plusMinusColor, "plusMinusColor");
                Intrinsics.checkNotNullParameter(counterTextColor, "counterTextColor");
                this.backgroundColor = backgroundColor;
                this.iconColor = str;
                this.titleColor = titleColor;
                this.counterBackgroundColor = counterBackgroundColor;
                this.plusMinusColor = plusMinusColor;
                this.counterTextColor = counterTextColor;
            }

            public static /* synthetic */ Colors copy$default(Colors colors, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = colors.backgroundColor;
                }
                if ((i11 & 2) != 0) {
                    str2 = colors.iconColor;
                }
                if ((i11 & 4) != 0) {
                    str3 = colors.titleColor;
                }
                if ((i11 & 8) != 0) {
                    str4 = colors.counterBackgroundColor;
                }
                if ((i11 & 16) != 0) {
                    str5 = colors.plusMinusColor;
                }
                if ((i11 & 32) != 0) {
                    str6 = colors.counterTextColor;
                }
                String str7 = str5;
                String str8 = str6;
                return colors.copy(str, str2, str3, str4, str7, str8);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component2, reason: from getter */
            public final String getIconColor() {
                return this.iconColor;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final String getCounterBackgroundColor() {
                return this.counterBackgroundColor;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final String getPlusMinusColor() {
                return this.plusMinusColor;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final String getCounterTextColor() {
                return this.counterTextColor;
            }

            @NotNull
            public final Colors copy(@NotNull String backgroundColor, String iconColor, @NotNull String titleColor, @NotNull String counterBackgroundColor, @NotNull String plusMinusColor, @NotNull String counterTextColor) {
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(counterBackgroundColor, "counterBackgroundColor");
                Intrinsics.checkNotNullParameter(plusMinusColor, "plusMinusColor");
                Intrinsics.checkNotNullParameter(counterTextColor, "counterTextColor");
                return new Colors(backgroundColor, iconColor, titleColor, counterBackgroundColor, plusMinusColor, counterTextColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Colors)) {
                    return false;
                }
                Colors colors = (Colors) other;
                return Intrinsics.d(this.backgroundColor, colors.backgroundColor) && Intrinsics.d(this.iconColor, colors.iconColor) && Intrinsics.d(this.titleColor, colors.titleColor) && Intrinsics.d(this.counterBackgroundColor, colors.counterBackgroundColor) && Intrinsics.d(this.plusMinusColor, colors.plusMinusColor) && Intrinsics.d(this.counterTextColor, colors.counterTextColor);
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final String getCounterBackgroundColor() {
                return this.counterBackgroundColor;
            }

            @NotNull
            public final String getCounterTextColor() {
                return this.counterTextColor;
            }

            public final String getIconColor() {
                return this.iconColor;
            }

            @NotNull
            public final String getPlusMinusColor() {
                return this.plusMinusColor;
            }

            @NotNull
            public final String getTitleColor() {
                return this.titleColor;
            }

            public int hashCode() {
                int hashCode = this.backgroundColor.hashCode() * 31;
                String str = this.iconColor;
                return this.counterTextColor.hashCode() + g.a(g.a(g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.titleColor), 31, this.counterBackgroundColor), 31, this.plusMinusColor);
            }

            @NotNull
            public String toString() {
                String str = this.backgroundColor;
                String str2 = this.iconColor;
                String str3 = this.titleColor;
                String str4 = this.counterBackgroundColor;
                String str5 = this.plusMinusColor;
                String str6 = this.counterTextColor;
                StringBuilder d11 = C3660k.d("Colors(backgroundColor=", str, ", iconColor=", str2, ", titleColor=");
                Nh.a.h(d11, str3, ", counterBackgroundColor=", str4, ", plusMinusColor=");
                return C3173b.c(d11, str5, ", counterTextColor=", str6, ")");
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme$StyleWrapper;", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme;", "style", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme$StyleWrapper$Style;", "<init>", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme$StyleWrapper$Style;)V", "getStyle", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme$StyleWrapper$Style;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Style", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class StyleWrapper extends Theme {

            @NotNull
            private final Style style;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme$StyleWrapper$Style;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT_PRIMARY", "SECONDARY_PRIMARY", "DEFAULT_FRESH", "SECONDARY_FRESH", "DEFAULT_EXPRESS", "SECONDARY_EXPRESS", "SELECT_PRIMARY", "SELECT_SECONDARY", "LIKEZONE_DEFAULT_PRIMARY", "LIKEZONE_SECONDARY_PRIMARY", "LIKEZONE_DEFAULT_FRESH", "LIKEZONE_SECONDARY_FRESH", "LIKEZONE_DEFAULT_EXPRESS", "LIKEZONE_SECONDARY_EXPRESS", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes2.dex */
            public static final class Style {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ Style[] $VALUES;
                public static final Style DEFAULT_PRIMARY = new Style("DEFAULT_PRIMARY", 0);
                public static final Style SECONDARY_PRIMARY = new Style("SECONDARY_PRIMARY", 1);
                public static final Style DEFAULT_FRESH = new Style("DEFAULT_FRESH", 2);
                public static final Style SECONDARY_FRESH = new Style("SECONDARY_FRESH", 3);
                public static final Style DEFAULT_EXPRESS = new Style("DEFAULT_EXPRESS", 4);
                public static final Style SECONDARY_EXPRESS = new Style("SECONDARY_EXPRESS", 5);
                public static final Style SELECT_PRIMARY = new Style("SELECT_PRIMARY", 6);
                public static final Style SELECT_SECONDARY = new Style("SELECT_SECONDARY", 7);
                public static final Style LIKEZONE_DEFAULT_PRIMARY = new Style("LIKEZONE_DEFAULT_PRIMARY", 8);
                public static final Style LIKEZONE_SECONDARY_PRIMARY = new Style("LIKEZONE_SECONDARY_PRIMARY", 9);
                public static final Style LIKEZONE_DEFAULT_FRESH = new Style("LIKEZONE_DEFAULT_FRESH", 10);
                public static final Style LIKEZONE_SECONDARY_FRESH = new Style("LIKEZONE_SECONDARY_FRESH", 11);
                public static final Style LIKEZONE_DEFAULT_EXPRESS = new Style("LIKEZONE_DEFAULT_EXPRESS", 12);
                public static final Style LIKEZONE_SECONDARY_EXPRESS = new Style("LIKEZONE_SECONDARY_EXPRESS", 13);

                private static final /* synthetic */ Style[] $values() {
                    return new Style[]{DEFAULT_PRIMARY, SECONDARY_PRIMARY, DEFAULT_FRESH, SECONDARY_FRESH, DEFAULT_EXPRESS, SECONDARY_EXPRESS, SELECT_PRIMARY, SELECT_SECONDARY, LIKEZONE_DEFAULT_PRIMARY, LIKEZONE_SECONDARY_PRIMARY, LIKEZONE_DEFAULT_FRESH, LIKEZONE_SECONDARY_FRESH, LIKEZONE_DEFAULT_EXPRESS, LIKEZONE_SECONDARY_EXPRESS};
                }

                static {
                    Style[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = b.a($values);
                }

                private Style(String str, int i11) {
                }

                public static Style valueOf(String str) {
                    return (Style) Enum.valueOf(Style.class, str);
                }

                public static Style[] values() {
                    return (Style[]) $VALUES.clone();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StyleWrapper(@NotNull Style style) {
                super(null);
                Intrinsics.checkNotNullParameter(style, "style");
                this.style = style;
            }

            public static /* synthetic */ StyleWrapper copy$default(StyleWrapper styleWrapper, Style style, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    style = styleWrapper.style;
                }
                return styleWrapper.copy(style);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final Style getStyle() {
                return this.style;
            }

            @NotNull
            public final StyleWrapper copy(@NotNull Style style) {
                Intrinsics.checkNotNullParameter(style, "style");
                return new StyleWrapper(style);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StyleWrapper) && this.style == ((StyleWrapper) other).style;
            }

            @NotNull
            public final Style getStyle() {
                return this.style;
            }

            public int hashCode() {
                return this.style.hashCode();
            }

            @NotNull
            public String toString() {
                return "StyleWrapper(style=" + this.style + ")";
            }
        }

        public /* synthetic */ Theme(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Colors getColors() {
            return (Colors) this.colors.getValue();
        }

        private Theme() {
            this.colors = k.b(new AddToCartButtonDTO$Theme$colors$2(this));
        }
    }

    public AddToCartButtonDTO(String str, @NotNull ActionButton actionButton, QuantityButton quantityButton, Boolean bool, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "styleWrapper", type = Theme.StyleWrapper.class), @ProtoOneOfSignature(name = "colors", type = Theme.Colors.class)}) @NotNull @ProtoOneOf(label = "type") Theme theme, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, Extend extend, Map<String, String> map2) {
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.skuId = str;
        this.actionButton = actionButton;
        this.quantityButton = quantityButton;
        this.isDisabled = bool;
        this.theme = theme;
        this.trackingInfo = map;
        this.testInfo = testInfo;
        this.extend = extend;
        this.extendMap = map2;
    }

    public static /* synthetic */ AddToCartButtonDTO copy$default(AddToCartButtonDTO addToCartButtonDTO, String str, ActionButton actionButton, QuantityButton quantityButton, Boolean bool, Theme theme, Map map, TestInfo testInfo, Extend extend, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = addToCartButtonDTO.skuId;
        }
        if ((i11 & 2) != 0) {
            actionButton = addToCartButtonDTO.actionButton;
        }
        if ((i11 & 4) != 0) {
            quantityButton = addToCartButtonDTO.quantityButton;
        }
        if ((i11 & 8) != 0) {
            bool = addToCartButtonDTO.isDisabled;
        }
        if ((i11 & 16) != 0) {
            theme = addToCartButtonDTO.theme;
        }
        if ((i11 & 32) != 0) {
            map = addToCartButtonDTO.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            testInfo = addToCartButtonDTO.testInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            extend = addToCartButtonDTO.extend;
        }
        if ((i11 & 256) != 0) {
            map2 = addToCartButtonDTO.extendMap;
        }
        Extend extend2 = extend;
        Map map3 = map2;
        Map map4 = map;
        TestInfo testInfo2 = testInfo;
        Theme theme2 = theme;
        QuantityButton quantityButton2 = quantityButton;
        return addToCartButtonDTO.copy(str, actionButton, quantityButton2, bool, theme2, map4, testInfo2, extend2, map3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSkuId() {
        return this.skuId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ActionButton getActionButton() {
        return this.actionButton;
    }

    /* renamed from: component3, reason: from getter */
    public final QuantityButton getQuantityButton() {
        return this.quantityButton;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Theme getTheme() {
        return this.theme;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final Extend getExtend() {
        return this.extend;
    }

    public final Map<String, String> component9() {
        return this.extendMap;
    }

    @NotNull
    public final AddToCartButtonDTO copy(String skuId, @NotNull ActionButton actionButton, QuantityButton quantityButton, Boolean isDisabled, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "styleWrapper", type = Theme.StyleWrapper.class), @ProtoOneOfSignature(name = "colors", type = Theme.Colors.class)}) @NotNull @ProtoOneOf(label = "type") Theme theme, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo, Extend extend, Map<String, String> extendMap) {
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new AddToCartButtonDTO(skuId, actionButton, quantityButton, isDisabled, theme, trackingInfo, testInfo, extend, extendMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddToCartButtonDTO)) {
            return false;
        }
        AddToCartButtonDTO addToCartButtonDTO = (AddToCartButtonDTO) other;
        return Intrinsics.d(this.skuId, addToCartButtonDTO.skuId) && Intrinsics.d(this.actionButton, addToCartButtonDTO.actionButton) && Intrinsics.d(this.quantityButton, addToCartButtonDTO.quantityButton) && Intrinsics.d(this.isDisabled, addToCartButtonDTO.isDisabled) && Intrinsics.d(this.theme, addToCartButtonDTO.theme) && Intrinsics.d(this.trackingInfo, addToCartButtonDTO.trackingInfo) && Intrinsics.d(this.testInfo, addToCartButtonDTO.testInfo) && this.extend == addToCartButtonDTO.extend && Intrinsics.d(this.extendMap, addToCartButtonDTO.extendMap);
    }

    @NotNull
    public final ActionButton getActionButton() {
        return this.actionButton;
    }

    public final Extend getExtend() {
        return this.extend;
    }

    public final Map<String, String> getExtendMap() {
        return this.extendMap;
    }

    public final QuantityButton getQuantityButton() {
        return this.quantityButton;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    public final Long getSkuLong() {
        String str = this.skuId;
        if (str != null) {
            return h.y0(str);
        }
        return null;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final Theme getTheme() {
        return this.theme;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.skuId;
        int hashCode = (this.actionButton.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        QuantityButton quantityButton = this.quantityButton;
        int hashCode2 = (hashCode + (quantityButton == null ? 0 : quantityButton.hashCode())) * 31;
        Boolean bool = this.isDisabled;
        int hashCode3 = (this.theme.hashCode() + ((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Extend extend = this.extend;
        int hashCode6 = (hashCode5 + (extend == null ? 0 : extend.hashCode())) * 31;
        Map<String, String> map2 = this.extendMap;
        return hashCode6 + (map2 != null ? map2.hashCode() : 0);
    }

    public final Boolean isDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public String toString() {
        String str = this.skuId;
        ActionButton actionButton = this.actionButton;
        QuantityButton quantityButton = this.quantityButton;
        Boolean bool = this.isDisabled;
        Theme theme = this.theme;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        Extend extend = this.extend;
        Map<String, String> map2 = this.extendMap;
        StringBuilder sb2 = new StringBuilder("AddToCartButtonDTO(skuId=");
        sb2.append(str);
        sb2.append(", actionButton=");
        sb2.append(actionButton);
        sb2.append(", quantityButton=");
        sb2.append(quantityButton);
        sb2.append(", isDisabled=");
        sb2.append(bool);
        sb2.append(", theme=");
        sb2.append(theme);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", testInfo=");
        sb2.append(testInfo);
        sb2.append(", extend=");
        sb2.append(extend);
        sb2.append(", extendMap=");
        return P.f(sb2, map2, ")");
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton;", "", "maxItems", "", "updateCartAction", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton$UpdateCartAction;", "minItems", "<init>", "(ILru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton$UpdateCartAction;Ljava/lang/Integer;)V", "getMaxItems", "()I", "getUpdateCartAction", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton$UpdateCartAction;", "getMinItems", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(ILru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton$UpdateCartAction;Ljava/lang/Integer;)Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton;", "equals", "", "other", "hashCode", "toString", "", "UpdateCartAction", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class QuantityButton {
        private final int maxItems;
        private final Integer minItems;

        @NotNull
        private final UpdateCartAction updateCartAction;

        public QuantityButton(int i11, @NotNull UpdateCartAction updateCartAction, Integer num) {
            Intrinsics.checkNotNullParameter(updateCartAction, "updateCartAction");
            this.maxItems = i11;
            this.updateCartAction = updateCartAction;
            this.minItems = num;
        }

        public static /* synthetic */ QuantityButton copy$default(QuantityButton quantityButton, int i11, UpdateCartAction updateCartAction, Integer num, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = quantityButton.maxItems;
            }
            if ((i12 & 2) != 0) {
                updateCartAction = quantityButton.updateCartAction;
            }
            if ((i12 & 4) != 0) {
                num = quantityButton.minItems;
            }
            return quantityButton.copy(i11, updateCartAction, num);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMaxItems() {
            return this.maxItems;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final UpdateCartAction getUpdateCartAction() {
            return this.updateCartAction;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getMinItems() {
            return this.minItems;
        }

        @NotNull
        public final QuantityButton copy(int maxItems, @NotNull UpdateCartAction updateCartAction, Integer minItems) {
            Intrinsics.checkNotNullParameter(updateCartAction, "updateCartAction");
            return new QuantityButton(maxItems, updateCartAction, minItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuantityButton)) {
                return false;
            }
            QuantityButton quantityButton = (QuantityButton) other;
            return this.maxItems == quantityButton.maxItems && Intrinsics.d(this.updateCartAction, quantityButton.updateCartAction) && Intrinsics.d(this.minItems, quantityButton.minItems);
        }

        public final int getMaxItems() {
            return this.maxItems;
        }

        public final Integer getMinItems() {
            return this.minItems;
        }

        @NotNull
        public final UpdateCartAction getUpdateCartAction() {
            return this.updateCartAction;
        }

        public int hashCode() {
            int hashCode = (this.updateCartAction.hashCode() + (Integer.hashCode(this.maxItems) * 31)) * 31;
            Integer num = this.minItems;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            int i11 = this.maxItems;
            UpdateCartAction updateCartAction = this.updateCartAction;
            Integer num = this.minItems;
            StringBuilder sb2 = new StringBuilder("QuantityButton(maxItems=");
            sb2.append(i11);
            sb2.append(", updateCartAction=");
            sb2.append(updateCartAction);
            sb2.append(", minItems=");
            return Ep.a.c(sb2, num, ")");
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton$UpdateCartAction;", "", "id", "", "quantity", "", "selectedDeliverySchema", "", "<init>", "(Ljava/lang/String;ILjava/lang/Long;)V", "getId", "()Ljava/lang/String;", "getQuantity", "()I", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;ILjava/lang/Long;)Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton$UpdateCartAction;", "equals", "", "other", "hashCode", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UpdateCartAction {

            @NotNull
            private final String id;
            private final int quantity;
            private final Long selectedDeliverySchema;

            public UpdateCartAction(@NotNull String id2, int i11, Long l11) {
                Intrinsics.checkNotNullParameter(id2, "id");
                this.id = id2;
                this.quantity = i11;
                this.selectedDeliverySchema = l11;
            }

            public static /* synthetic */ UpdateCartAction copy$default(UpdateCartAction updateCartAction, String str, int i11, Long l11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = updateCartAction.id;
                }
                if ((i12 & 2) != 0) {
                    i11 = updateCartAction.quantity;
                }
                if ((i12 & 4) != 0) {
                    l11 = updateCartAction.selectedDeliverySchema;
                }
                return updateCartAction.copy(str, i11, l11);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final int getQuantity() {
                return this.quantity;
            }

            /* renamed from: component3, reason: from getter */
            public final Long getSelectedDeliverySchema() {
                return this.selectedDeliverySchema;
            }

            @NotNull
            public final UpdateCartAction copy(@NotNull String id2, int quantity, Long selectedDeliverySchema) {
                Intrinsics.checkNotNullParameter(id2, "id");
                return new UpdateCartAction(id2, quantity, selectedDeliverySchema);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateCartAction)) {
                    return false;
                }
                UpdateCartAction updateCartAction = (UpdateCartAction) other;
                return Intrinsics.d(this.id, updateCartAction.id) && this.quantity == updateCartAction.quantity && Intrinsics.d(this.selectedDeliverySchema, updateCartAction.selectedDeliverySchema);
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            public final int getQuantity() {
                return this.quantity;
            }

            public final Long getSelectedDeliverySchema() {
                return this.selectedDeliverySchema;
            }

            public int hashCode() {
                int a11 = C2454a.a(this.quantity, this.id.hashCode() * 31, 31);
                Long l11 = this.selectedDeliverySchema;
                return a11 + (l11 == null ? 0 : l11.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.id;
                int i11 = this.quantity;
                return C3051a.d(C3660k.c(i11, "UpdateCartAction(id=", str, ", quantity=", ", selectedDeliverySchema="), this.selectedDeliverySchema, ")");
            }

            public /* synthetic */ UpdateCartAction(String str, int i11, Long l11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i12 & 2) != 0 ? 1 : i11, (i12 & 4) != 0 ? null : l11);
            }
        }
    }
}
