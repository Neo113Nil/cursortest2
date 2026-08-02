package ru.ozon.app.android.cart.common.data.prefetch.state;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;", "", "AppStart", "Authentication", "OrderDone", "AddToCart", "AddToFamilyCart", "ChangeMiniApp", "CartUpdate", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState$AddToCart;", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState$AddToFamilyCart;", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState$AppStart;", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState$Authentication;", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState$CartUpdate;", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState$ChangeMiniApp;", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState$OrderDone;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CartPrefetchState {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState$AddToCart;", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddToCart implements CartPrefetchState {

        @NotNull
        public static final AddToCart INSTANCE = new AddToCart();

        private AddToCart() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AddToCart);
        }

        public int hashCode() {
            return 1617993854;
        }

        @NotNull
        public String toString() {
            return "AddToCart";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState$AddToFamilyCart;", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class AddToFamilyCart implements CartPrefetchState {

        @NotNull
        public static final AddToFamilyCart INSTANCE = new AddToFamilyCart();

        private AddToFamilyCart() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AddToFamilyCart);
        }

        public int hashCode() {
            return -1989140606;
        }

        @NotNull
        public String toString() {
            return "AddToFamilyCart";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState$AppStart;", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AppStart implements CartPrefetchState {

        @NotNull
        public static final AppStart INSTANCE = new AppStart();

        private AppStart() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AppStart);
        }

        public int hashCode() {
            return 2039465535;
        }

        @NotNull
        public String toString() {
            return "AppStart";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState$Authentication;", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Authentication implements CartPrefetchState {

        @NotNull
        public static final Authentication INSTANCE = new Authentication();

        private Authentication() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Authentication);
        }

        public int hashCode() {
            return 1449855862;
        }

        @NotNull
        public String toString() {
            return "Authentication";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState$CartUpdate;", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CartUpdate implements CartPrefetchState {

        @NotNull
        public static final CartUpdate INSTANCE = new CartUpdate();

        private CartUpdate() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CartUpdate);
        }

        public int hashCode() {
            return -90300409;
        }

        @NotNull
        public String toString() {
            return "CartUpdate";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState$ChangeMiniApp;", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChangeMiniApp implements CartPrefetchState {

        @NotNull
        public static final ChangeMiniApp INSTANCE = new ChangeMiniApp();

        private ChangeMiniApp() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ChangeMiniApp);
        }

        public int hashCode() {
            return -2098419780;
        }

        @NotNull
        public String toString() {
            return "ChangeMiniApp";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState$OrderDone;", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrderDone implements CartPrefetchState {

        @NotNull
        public static final OrderDone INSTANCE = new OrderDone();

        private OrderDone() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OrderDone);
        }

        public int hashCode() {
            return 1202485298;
        }

        @NotNull
        public String toString() {
            return "OrderDone";
        }
    }
}
