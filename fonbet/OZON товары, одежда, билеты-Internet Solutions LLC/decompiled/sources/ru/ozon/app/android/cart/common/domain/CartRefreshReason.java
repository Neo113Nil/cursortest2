package ru.ozon.app.android.cart.common.domain;

import B0.A0;
import B90.C2618u;
import J0.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "", "CloseCartShareModal", "AppEnterForeground", "MinCheckAddMore", "AddToCartFirstProduct", "AddToFamilyCartFirstProduct", "AddToCartFromAnotherTab", "AddToCartFromFreshTab", "RemoveRfbsSplit", "RemoveRestoreCartSplit", "CancelOrder", "AddressChanged", "CartShared", "CheckoutItemQuantityChanged", "BackToCartFromFamilyCart", "AddToFamilyCart", "AddToCart", "RemoveCartSplit", "BackToCartByAnchor", "BackToCart", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$AddToCart;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$AddToCartFirstProduct;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$AddToCartFromAnotherTab;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$AddToCartFromFreshTab;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$AddToFamilyCart;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$AddToFamilyCartFirstProduct;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$AddressChanged;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$AppEnterForeground;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$BackToCart;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$BackToCartByAnchor;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$BackToCartFromFamilyCart;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$CancelOrder;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$CartShared;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$CheckoutItemQuantityChanged;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$CloseCartShareModal;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$MinCheckAddMore;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$RemoveCartSplit;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$RemoveRestoreCartSplit;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason$RemoveRfbsSplit;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CartRefreshReason {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartRefreshReason$AddToCart;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "", "screenDeeplink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScreenDeeplink", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddToCart implements CartRefreshReason {
        private final String screenDeeplink;

        public AddToCart(String str) {
            this.screenDeeplink = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AddToCart) && Intrinsics.d(this.screenDeeplink, ((AddToCart) other).screenDeeplink);
        }

        public final String getScreenDeeplink() {
            return this.screenDeeplink;
        }

        public int hashCode() {
            String str = this.screenDeeplink;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("AddToCart(screenDeeplink=", this.screenDeeplink, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartRefreshReason$AddToCartFirstProduct;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddToCartFirstProduct implements CartRefreshReason {

        @NotNull
        public static final AddToCartFirstProduct INSTANCE = new AddToCartFirstProduct();

        private AddToCartFirstProduct() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AddToCartFirstProduct);
        }

        public int hashCode() {
            return -1701111236;
        }

        @NotNull
        public String toString() {
            return "AddToCartFirstProduct";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartRefreshReason$AddToCartFromAnotherTab;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddToCartFromAnotherTab implements CartRefreshReason {

        @NotNull
        public static final AddToCartFromAnotherTab INSTANCE = new AddToCartFromAnotherTab();

        private AddToCartFromAnotherTab() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AddToCartFromAnotherTab);
        }

        public int hashCode() {
            return -1163984967;
        }

        @NotNull
        public String toString() {
            return "AddToCartFromAnotherTab";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartRefreshReason$AddToCartFromFreshTab;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddToCartFromFreshTab implements CartRefreshReason {

        @NotNull
        public static final AddToCartFromFreshTab INSTANCE = new AddToCartFromFreshTab();

        private AddToCartFromFreshTab() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AddToCartFromFreshTab);
        }

        public int hashCode() {
            return -967379090;
        }

        @NotNull
        public String toString() {
            return "AddToCartFromFreshTab";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartRefreshReason$AddToFamilyCart;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddToFamilyCart implements CartRefreshReason {

        @NotNull
        public static final AddToFamilyCart INSTANCE = new AddToFamilyCart();

        private AddToFamilyCart() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AddToFamilyCart);
        }

        public int hashCode() {
            return -261721791;
        }

        @NotNull
        public String toString() {
            return "AddToFamilyCart";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartRefreshReason$AddToFamilyCartFirstProduct;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddToFamilyCartFirstProduct implements CartRefreshReason {

        @NotNull
        public static final AddToFamilyCartFirstProduct INSTANCE = new AddToFamilyCartFirstProduct();

        private AddToFamilyCartFirstProduct() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AddToFamilyCartFirstProduct);
        }

        public int hashCode() {
            return -550823936;
        }

        @NotNull
        public String toString() {
            return "AddToFamilyCartFirstProduct";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartRefreshReason$AddressChanged;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddressChanged implements CartRefreshReason {

        @NotNull
        public static final AddressChanged INSTANCE = new AddressChanged();

        private AddressChanged() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AddressChanged);
        }

        public int hashCode() {
            return -545069185;
        }

        @NotNull
        public String toString() {
            return "AddressChanged";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartRefreshReason$AppEnterForeground;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AppEnterForeground implements CartRefreshReason {

        @NotNull
        public static final AppEnterForeground INSTANCE = new AppEnterForeground();

        private AppEnterForeground() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AppEnterForeground);
        }

        public int hashCode() {
            return 1235063225;
        }

        @NotNull
        public String toString() {
            return "AppEnterForeground";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartRefreshReason$BackToCart;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "", "isScrollUp", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackToCart implements CartRefreshReason {
        private final boolean isScrollUp;

        public BackToCart(boolean z11) {
            this.isScrollUp = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BackToCart) && this.isScrollUp == ((BackToCart) other).isScrollUp;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isScrollUp);
        }

        /* renamed from: isScrollUp, reason: from getter */
        public final boolean getIsScrollUp() {
            return this.isScrollUp;
        }

        @NotNull
        public String toString() {
            return C2618u.g("BackToCart(isScrollUp=", ")", this.isScrollUp);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartRefreshReason$BackToCartByAnchor;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "", "link", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackToCartByAnchor implements CartRefreshReason {

        @NotNull
        private final String link;

        public BackToCartByAnchor(@NotNull String link) {
            Intrinsics.checkNotNullParameter(link, "link");
            this.link = link;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BackToCartByAnchor) && Intrinsics.d(this.link, ((BackToCartByAnchor) other).link);
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        public int hashCode() {
            return this.link.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("BackToCartByAnchor(link=", this.link, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartRefreshReason$BackToCartFromFamilyCart;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackToCartFromFamilyCart implements CartRefreshReason {

        @NotNull
        public static final BackToCartFromFamilyCart INSTANCE = new BackToCartFromFamilyCart();

        private BackToCartFromFamilyCart() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof BackToCartFromFamilyCart);
        }

        public int hashCode() {
            return -34215633;
        }

        @NotNull
        public String toString() {
            return "BackToCartFromFamilyCart";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartRefreshReason$CancelOrder;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CancelOrder implements CartRefreshReason {

        @NotNull
        public static final CancelOrder INSTANCE = new CancelOrder();

        private CancelOrder() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CancelOrder);
        }

        public int hashCode() {
            return 1522210293;
        }

        @NotNull
        public String toString() {
            return "CancelOrder";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartRefreshReason$CartShared;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CartShared implements CartRefreshReason {

        @NotNull
        public static final CartShared INSTANCE = new CartShared();

        private CartShared() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CartShared);
        }

        public int hashCode() {
            return -1132337532;
        }

        @NotNull
        public String toString() {
            return "CartShared";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartRefreshReason$CheckoutItemQuantityChanged;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CheckoutItemQuantityChanged implements CartRefreshReason {

        @NotNull
        public static final CheckoutItemQuantityChanged INSTANCE = new CheckoutItemQuantityChanged();

        private CheckoutItemQuantityChanged() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CheckoutItemQuantityChanged);
        }

        public int hashCode() {
            return -1430499343;
        }

        @NotNull
        public String toString() {
            return "CheckoutItemQuantityChanged";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartRefreshReason$CloseCartShareModal;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CloseCartShareModal implements CartRefreshReason {

        @NotNull
        public static final CloseCartShareModal INSTANCE = new CloseCartShareModal();

        private CloseCartShareModal() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CloseCartShareModal);
        }

        public int hashCode() {
            return 1495905639;
        }

        @NotNull
        public String toString() {
            return "CloseCartShareModal";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartRefreshReason$MinCheckAddMore;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MinCheckAddMore implements CartRefreshReason {

        @NotNull
        public static final MinCheckAddMore INSTANCE = new MinCheckAddMore();

        private MinCheckAddMore() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MinCheckAddMore);
        }

        public int hashCode() {
            return -419577503;
        }

        @NotNull
        public String toString() {
            return "MinCheckAddMore";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartRefreshReason$RemoveCartSplit;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "", "link", "", "offset", "widgetKey", "", "", "postParams", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "Ljava/lang/Integer;", "getOffset", "()Ljava/lang/Integer;", "getWidgetKey", "Ljava/util/Map;", "getPostParams", "()Ljava/util/Map;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoveCartSplit implements CartRefreshReason {

        @NotNull
        private final String link;
        private final Integer offset;
        private final Map<String, Object> postParams;
        private final Integer widgetKey;

        public RemoveCartSplit(@NotNull String link, Integer num, Integer num2, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(link, "link");
            this.link = link;
            this.offset = num;
            this.widgetKey = num2;
            this.postParams = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RemoveCartSplit)) {
                return false;
            }
            RemoveCartSplit removeCartSplit = (RemoveCartSplit) other;
            return Intrinsics.d(this.link, removeCartSplit.link) && Intrinsics.d(this.offset, removeCartSplit.offset) && Intrinsics.d(this.widgetKey, removeCartSplit.widgetKey) && Intrinsics.d(this.postParams, removeCartSplit.postParams);
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        public final Integer getOffset() {
            return this.offset;
        }

        public final Map<String, Object> getPostParams() {
            return this.postParams;
        }

        public final Integer getWidgetKey() {
            return this.widgetKey;
        }

        public int hashCode() {
            int hashCode = this.link.hashCode() * 31;
            Integer num = this.offset;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.widgetKey;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Map<String, Object> map = this.postParams;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.link;
            Integer num = this.offset;
            Integer num2 = this.widgetKey;
            Map<String, Object> map = this.postParams;
            StringBuilder b11 = P.b("RemoveCartSplit(link=", str, num, ", offset=", ", widgetKey=");
            b11.append(num2);
            b11.append(", postParams=");
            b11.append(map);
            b11.append(")");
            return b11.toString();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartRefreshReason$RemoveRestoreCartSplit;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoveRestoreCartSplit implements CartRefreshReason {

        @NotNull
        public static final RemoveRestoreCartSplit INSTANCE = new RemoveRestoreCartSplit();

        private RemoveRestoreCartSplit() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof RemoveRestoreCartSplit);
        }

        public int hashCode() {
            return 822868463;
        }

        @NotNull
        public String toString() {
            return "RemoveRestoreCartSplit";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartRefreshReason$RemoveRfbsSplit;", "Lru/ozon/app/android/cart/common/domain/CartRefreshReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoveRfbsSplit implements CartRefreshReason {

        @NotNull
        public static final RemoveRfbsSplit INSTANCE = new RemoveRfbsSplit();

        private RemoveRfbsSplit() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof RemoveRfbsSplit);
        }

        public int hashCode() {
            return -1278460686;
        }

        @NotNull
        public String toString() {
            return "RemoveRfbsSplit";
        }
    }
}
