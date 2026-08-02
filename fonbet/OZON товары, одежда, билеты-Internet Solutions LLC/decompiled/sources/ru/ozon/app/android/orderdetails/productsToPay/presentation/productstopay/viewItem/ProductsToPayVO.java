package ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewItem;

import B0.C2454a;
import Cm.e;
import Ek.a;
import Kk.C3532b;
import Ns.b;
import T7.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.cscore.orderdetails.molecule.media.presentation.ProductMediaImageVO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b+\b\u0081\b\u0018\u00002\u00020\u0001:\u0006EFGHIJBy\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b6\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010@\u001a\u0004\bA\u0010\u001cR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\bC\u0010D¨\u0006K"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "checkbox", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductsToPayImage;", "image", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductPriceVO;", "productPrice", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductCounterVO;", "productCounter", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "", "disableSeparator", "", "state", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$VerticalPadding;", "verticalPadding", "<init>", "(JLru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductsToPayImage;Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductPriceVO;Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductCounterVO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;ZLjava/lang/String;Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$VerticalPadding;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "getCheckbox", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductsToPayImage;", "getImage", "()Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductsToPayImage;", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductPriceVO;", "getProductPrice", "()Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductPriceVO;", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductCounterVO;", "getProductCounter", "()Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductCounterVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "Z", "getDisableSeparator", "()Z", "Ljava/lang/String;", "getState", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$VerticalPadding;", "getVerticalPadding", "()Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$VerticalPadding;", "ProductsToPayImage", "ProductImageVO", "ProductToPayMediaImage", "ProductPriceVO", "ProductCounterVO", "VerticalPadding", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProductsToPayVO implements c {
    private final BadgeDTO badge;
    private final CheckBoxDTO checkbox;
    private final CommonControlSettings common;
    private final boolean disableSeparator;
    private final long id;

    @NotNull
    private final ProductsToPayImage image;
    private final ProductCounterVO productCounter;
    private final ProductPriceVO productPrice;
    private final String state;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final VerticalPadding verticalPadding;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b$\u0010\u0014R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductCounterVO;", "", "", "id", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "plusButton", "minusButton", "Lru/ozon/uni/atoms/data/text/TextDTO;", "countValue", "", "maxValue", "minValue", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;IILjava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getPlusButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getMinusButton", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getCountValue", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "I", "getMaxValue", "getMinValue", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductCounterVO {

        @NotNull
        private final TextDTO countValue;

        @NotNull
        private final String id;
        private final int maxValue;
        private final int minValue;

        @NotNull
        private final IconButtonV3DTO minusButton;

        @NotNull
        private final IconButtonV3DTO plusButton;

        @NotNull
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ProductCounterVO(@NotNull String id2, @NotNull IconButtonV3DTO plusButton, @NotNull IconButtonV3DTO minusButton, @NotNull TextDTO countValue, int i11, int i12, @NotNull Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(plusButton, "plusButton");
            Intrinsics.checkNotNullParameter(minusButton, "minusButton");
            Intrinsics.checkNotNullParameter(countValue, "countValue");
            Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
            this.id = id2;
            this.plusButton = plusButton;
            this.minusButton = minusButton;
            this.countValue = countValue;
            this.maxValue = i11;
            this.minValue = i12;
            this.trackingInfo = trackingInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductCounterVO)) {
                return false;
            }
            ProductCounterVO productCounterVO = (ProductCounterVO) other;
            return Intrinsics.d(this.id, productCounterVO.id) && Intrinsics.d(this.plusButton, productCounterVO.plusButton) && Intrinsics.d(this.minusButton, productCounterVO.minusButton) && Intrinsics.d(this.countValue, productCounterVO.countValue) && this.maxValue == productCounterVO.maxValue && this.minValue == productCounterVO.minValue && Intrinsics.d(this.trackingInfo, productCounterVO.trackingInfo);
        }

        @NotNull
        public final TextDTO getCountValue() {
            return this.countValue;
        }

        public final int getMaxValue() {
            return this.maxValue;
        }

        public final int getMinValue() {
            return this.minValue;
        }

        @NotNull
        public final IconButtonV3DTO getMinusButton() {
            return this.minusButton;
        }

        @NotNull
        public final IconButtonV3DTO getPlusButton() {
            return this.plusButton;
        }

        public int hashCode() {
            return this.trackingInfo.hashCode() + C2454a.a(this.minValue, C2454a.a(this.maxValue, b.a(this.countValue, GR.b.c(this.minusButton, GR.b.c(this.plusButton, this.id.hashCode() * 31, 31), 31), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            IconButtonV3DTO iconButtonV3DTO = this.plusButton;
            IconButtonV3DTO iconButtonV3DTO2 = this.minusButton;
            TextDTO textDTO = this.countValue;
            int i11 = this.maxValue;
            int i12 = this.minValue;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("ProductCounterVO(id=");
            sb2.append(str);
            sb2.append(", plusButton=");
            sb2.append(iconButtonV3DTO);
            sb2.append(", minusButton=");
            sb2.append(iconButtonV3DTO2);
            sb2.append(", countValue=");
            sb2.append(textDTO);
            sb2.append(", maxValue=");
            a.f(i11, i12, ", minValue=", ", trackingInfo=", sb2);
            return P.f(sb2, map, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductPriceVO;", "", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductPriceVO {
        public static final int $stable = PriceDTO.$stable;
        private final BadgeDTO badge;

        @NotNull
        private final PriceDTO price;

        public ProductPriceVO(@NotNull PriceDTO price, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(price, "price");
            this.price = price;
            this.badge = badgeDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductPriceVO)) {
                return false;
            }
            ProductPriceVO productPriceVO = (ProductPriceVO) other;
            return Intrinsics.d(this.price, productPriceVO.price) && Intrinsics.d(this.badge, productPriceVO.badge);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        public int hashCode() {
            int hashCode = this.price.hashCode() * 31;
            BadgeDTO badgeDTO = this.badge;
            return hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "ProductPriceVO(price=" + this.price + ", badge=" + this.badge + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductToPayMediaImage;", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductsToPayImage;", "Lru/ozon/app/android/cscore/orderdetails/molecule/media/presentation/ProductMediaImageVO;", "media", "<init>", "(Lru/ozon/app/android/cscore/orderdetails/molecule/media/presentation/ProductMediaImageVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/cscore/orderdetails/molecule/media/presentation/ProductMediaImageVO;", "getMedia", "()Lru/ozon/app/android/cscore/orderdetails/molecule/media/presentation/ProductMediaImageVO;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductToPayMediaImage implements ProductsToPayImage {
        public static final int $stable = ProductMediaImageVO.$stable;

        @NotNull
        private final ProductMediaImageVO media;

        public ProductToPayMediaImage(@NotNull ProductMediaImageVO media) {
            Intrinsics.checkNotNullParameter(media, "media");
            this.media = media;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProductToPayMediaImage) && Intrinsics.d(this.media, ((ProductToPayMediaImage) other).media);
        }

        @NotNull
        public final ProductMediaImageVO getMedia() {
            return this.media;
        }

        public int hashCode() {
            return this.media.hashCode();
        }

        @NotNull
        public String toString() {
            return "ProductToPayMediaImage(media=" + this.media + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductsToPayImage;", "", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductImageVO;", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductToPayMediaImage;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ProductsToPayImage {
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$VerticalPadding;", "", "", "topPaddingResId", "bottomPaddingResId", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTopPaddingResId", "getBottomPaddingResId", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VerticalPadding {
        private final int bottomPaddingResId;
        private final int topPaddingResId;

        public VerticalPadding(int i11, int i12) {
            this.topPaddingResId = i11;
            this.bottomPaddingResId = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerticalPadding)) {
                return false;
            }
            VerticalPadding verticalPadding = (VerticalPadding) other;
            return this.topPaddingResId == verticalPadding.topPaddingResId && this.bottomPaddingResId == verticalPadding.bottomPaddingResId;
        }

        public final int getBottomPaddingResId() {
            return this.bottomPaddingResId;
        }

        public final int getTopPaddingResId() {
            return this.topPaddingResId;
        }

        public int hashCode() {
            return Integer.hashCode(this.bottomPaddingResId) + (Integer.hashCode(this.topPaddingResId) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("VerticalPadding(topPaddingResId=", this.topPaddingResId, ", bottomPaddingResId=", ")", this.bottomPaddingResId);
        }
    }

    public ProductsToPayVO(long j11, CheckBoxDTO checkBoxDTO, @NotNull ProductsToPayImage image, ProductPriceVO productPriceVO, ProductCounterVO productCounterVO, @NotNull TextDTO title, TextDTO textDTO, BadgeDTO badgeDTO, CommonControlSettings commonControlSettings, boolean z11, String str, VerticalPadding verticalPadding) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.checkbox = checkBoxDTO;
        this.image = image;
        this.productPrice = productPriceVO;
        this.productCounter = productCounterVO;
        this.title = title;
        this.subtitle = textDTO;
        this.badge = badgeDTO;
        this.common = commonControlSettings;
        this.disableSeparator = z11;
        this.state = str;
        this.verticalPadding = verticalPadding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductsToPayVO)) {
            return false;
        }
        ProductsToPayVO productsToPayVO = (ProductsToPayVO) other;
        return this.id == productsToPayVO.id && Intrinsics.d(this.checkbox, productsToPayVO.checkbox) && Intrinsics.d(this.image, productsToPayVO.image) && Intrinsics.d(this.productPrice, productsToPayVO.productPrice) && Intrinsics.d(this.productCounter, productsToPayVO.productCounter) && Intrinsics.d(this.title, productsToPayVO.title) && Intrinsics.d(this.subtitle, productsToPayVO.subtitle) && Intrinsics.d(this.badge, productsToPayVO.badge) && Intrinsics.d(this.common, productsToPayVO.common) && this.disableSeparator == productsToPayVO.disableSeparator && Intrinsics.d(this.state, productsToPayVO.state) && Intrinsics.d(this.verticalPadding, productsToPayVO.verticalPadding);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final CheckBoxDTO getCheckbox() {
        return this.checkbox;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final boolean getDisableSeparator() {
        return this.disableSeparator;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ProductsToPayImage getImage() {
        return this.image;
    }

    public final ProductCounterVO getProductCounter() {
        return this.productCounter;
    }

    public final ProductPriceVO getProductPrice() {
        return this.productPrice;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getState() {
        return this.state;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final VerticalPadding getVerticalPadding() {
        return this.verticalPadding;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        CheckBoxDTO checkBoxDTO = this.checkbox;
        int hashCode2 = (this.image.hashCode() + ((hashCode + (checkBoxDTO == null ? 0 : checkBoxDTO.hashCode())) * 31)) * 31;
        ProductPriceVO productPriceVO = this.productPrice;
        int hashCode3 = (hashCode2 + (productPriceVO == null ? 0 : productPriceVO.hashCode())) * 31;
        ProductCounterVO productCounterVO = this.productCounter;
        int a11 = b.a(this.title, (hashCode3 + (productCounterVO == null ? 0 : productCounterVO.hashCode())) * 31, 31);
        TextDTO textDTO = this.subtitle;
        int hashCode4 = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode5 = (hashCode4 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int a12 = C3532b.a((hashCode5 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31, 31, this.disableSeparator);
        String str = this.state;
        int hashCode6 = (a12 + (str == null ? 0 : str.hashCode())) * 31;
        VerticalPadding verticalPadding = this.verticalPadding;
        return hashCode6 + (verticalPadding != null ? verticalPadding.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProductsToPayVO(id=" + this.id + ", checkbox=" + this.checkbox + ", image=" + this.image + ", productPrice=" + this.productPrice + ", productCounter=" + this.productCounter + ", title=" + this.title + ", subtitle=" + this.subtitle + ", badge=" + this.badge + ", common=" + this.common + ", disableSeparator=" + this.disableSeparator + ", state=" + this.state + ", verticalPadding=" + this.verticalPadding + ")";
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\b\u0010\u001dR\"\u0010\t\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001e\u0010\u001d\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductImageVO;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductsToPayImage;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "counter", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "shouldBlur", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getCounter", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Z", "()Z", "getShouldBlur", "setShouldBlur", "(Z)V", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductImageVO implements AdultVO, ProductsToPayImage {
        private final BadgeDTO counter;

        @NotNull
        private final ImageDTO image;
        private final boolean isAdult;
        private boolean shouldBlur;

        public ProductImageVO(@NotNull ImageDTO image, BadgeDTO badgeDTO, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.counter = badgeDTO;
            this.isAdult = z11;
            this.shouldBlur = z12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductImageVO)) {
                return false;
            }
            ProductImageVO productImageVO = (ProductImageVO) other;
            return Intrinsics.d(this.image, productImageVO.image) && Intrinsics.d(this.counter, productImageVO.counter) && this.isAdult == productImageVO.isAdult && this.shouldBlur == productImageVO.shouldBlur;
        }

        public final BadgeDTO getCounter() {
            return this.counter;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public boolean getShouldBlur() {
            return this.shouldBlur;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            BadgeDTO badgeDTO = this.counter;
            return Boolean.hashCode(this.shouldBlur) + C3532b.a((hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.isAdult);
        }

        @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
        /* renamed from: isAdult, reason: from getter */
        public boolean getIsAdult() {
            return this.isAdult;
        }

        @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
        public void setShouldBlur(boolean z11) {
            this.shouldBlur = z11;
        }

        @NotNull
        public String toString() {
            return "ProductImageVO(image=" + this.image + ", counter=" + this.counter + ", isAdult=" + this.isAdult + ", shouldBlur=" + this.shouldBlur + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ ProductImageVO(ImageDTO imageDTO, BadgeDTO badgeDTO, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(imageDTO, badgeDTO, z11, (i11 & 8) != 0 ? z11 : z12);
            z11 = (i11 & 4) != 0 ? false : z11;
        }
    }
}
