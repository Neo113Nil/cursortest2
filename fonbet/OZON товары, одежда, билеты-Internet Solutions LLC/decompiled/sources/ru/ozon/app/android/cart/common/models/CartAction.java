package ru.ozon.app.android.cart.common.models;

import De.C2859b;
import G.g;
import HY.b;
import Nh.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/cart/common/models/CartAction;", "", "<init>", "()V", "CartSuccess", "CartShowRestriction", "CartShowNotificationBar", "CartOpenSheetDeeplink", "Action", "Lru/ozon/app/android/cart/common/models/CartAction$Action;", "Lru/ozon/app/android/cart/common/models/CartAction$CartOpenSheetDeeplink;", "Lru/ozon/app/android/cart/common/models/CartAction$CartShowNotificationBar;", "Lru/ozon/app/android/cart/common/models/CartAction$CartShowRestriction;", "Lru/ozon/app/android/cart/common/models/CartAction$CartSuccess;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class CartAction {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/cart/common/models/CartAction$Action;", "Lru/ozon/app/android/cart/common/models/CartAction;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action extends CartAction {

        @NotNull
        private final AtomActionDTO action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Action(@NotNull AtomActionDTO action) {
            super(null);
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Action) && Intrinsics.d(this.action, ((Action) other).action);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        @NotNull
        public String toString() {
            return C2859b.f("Action(action=", ")", this.action);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/common/models/CartAction$CartOpenSheetDeeplink;", "Lru/ozon/app/android/cart/common/models/CartAction;", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "products", "", "deeplink", "Lru/ozon/app/android/cart/common/models/AnalyticsActionEvents;", "events", "<init>", "(Ljava/util/Map;Ljava/lang/String;Lru/ozon/app/android/cart/common/models/AnalyticsActionEvents;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getProducts", "()Ljava/util/Map;", "Ljava/lang/String;", "getDeeplink", "Lru/ozon/app/android/cart/common/models/AnalyticsActionEvents;", "getEvents", "()Lru/ozon/app/android/cart/common/models/AnalyticsActionEvents;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CartOpenSheetDeeplink extends CartAction {

        @NotNull
        private final String deeplink;

        @NotNull
        private final AnalyticsActionEvents events;

        @NotNull
        private final Map<Long, CartItemInfo> products;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CartOpenSheetDeeplink(@NotNull Map<Long, CartItemInfo> products, @NotNull String deeplink, @NotNull AnalyticsActionEvents events) {
            super(null);
            Intrinsics.checkNotNullParameter(products, "products");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(events, "events");
            this.products = products;
            this.deeplink = deeplink;
            this.events = events;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CartOpenSheetDeeplink)) {
                return false;
            }
            CartOpenSheetDeeplink cartOpenSheetDeeplink = (CartOpenSheetDeeplink) other;
            return Intrinsics.d(this.products, cartOpenSheetDeeplink.products) && Intrinsics.d(this.deeplink, cartOpenSheetDeeplink.deeplink) && Intrinsics.d(this.events, cartOpenSheetDeeplink.events);
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final Map<Long, CartItemInfo> getProducts() {
            return this.products;
        }

        public int hashCode() {
            return this.events.hashCode() + g.a(this.products.hashCode() * 31, 31, this.deeplink);
        }

        @NotNull
        public String toString() {
            return "CartOpenSheetDeeplink(products=" + this.products + ", deeplink=" + this.deeplink + ", events=" + this.events + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/cart/common/models/CartAction$CartShowNotificationBar;", "Lru/ozon/app/android/cart/common/models/CartAction;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationBar", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CartShowNotificationBar extends CartAction {

        @NotNull
        private final NotificationDTO notificationBar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CartShowNotificationBar(@NotNull NotificationDTO notificationBar) {
            super(null);
            Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
            this.notificationBar = notificationBar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CartShowNotificationBar) && Intrinsics.d(this.notificationBar, ((CartShowNotificationBar) other).notificationBar);
        }

        @NotNull
        public final NotificationDTO getNotificationBar() {
            return this.notificationBar;
        }

        public int hashCode() {
            return this.notificationBar.hashCode();
        }

        @NotNull
        public String toString() {
            return a.e("CartShowNotificationBar(notificationBar=", ")", this.notificationBar);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/cart/common/models/CartAction$CartShowRestriction;", "Lru/ozon/app/android/cart/common/models/CartAction;", "Lru/ozon/uni/android/flashbar/model/Restriction;", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "<init>", "(Lru/ozon/uni/android/flashbar/model/Restriction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/flashbar/model/Restriction;", "getRestriction", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CartShowRestriction extends CartAction {

        @NotNull
        private final Restriction restriction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CartShowRestriction(@NotNull Restriction restriction) {
            super(null);
            Intrinsics.checkNotNullParameter(restriction, "restriction");
            this.restriction = restriction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CartShowRestriction) && Intrinsics.d(this.restriction, ((CartShowRestriction) other).restriction);
        }

        @NotNull
        public final Restriction getRestriction() {
            return this.restriction;
        }

        public int hashCode() {
            return this.restriction.hashCode();
        }

        @NotNull
        public String toString() {
            return "CartShowRestriction(restriction=" + this.restriction + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/common/models/CartAction$CartSuccess;", "Lru/ozon/app/android/cart/common/models/CartAction;", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "products", "<init>", "(Ljava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getProducts", "()Ljava/util/Map;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CartSuccess extends CartAction {

        @NotNull
        private final Map<Long, CartItemInfo> products;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CartSuccess(@NotNull Map<Long, CartItemInfo> products) {
            super(null);
            Intrinsics.checkNotNullParameter(products, "products");
            this.products = products;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CartSuccess) && Intrinsics.d(this.products, ((CartSuccess) other).products);
        }

        @NotNull
        public final Map<Long, CartItemInfo> getProducts() {
            return this.products;
        }

        public int hashCode() {
            return this.products.hashCode();
        }

        @NotNull
        public String toString() {
            return b.b("CartSuccess(products=", ")", this.products);
        }
    }

    public /* synthetic */ CartAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CartAction() {
    }
}
