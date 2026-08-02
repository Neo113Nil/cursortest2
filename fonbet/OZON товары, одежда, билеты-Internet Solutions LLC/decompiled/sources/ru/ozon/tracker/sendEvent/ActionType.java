package ru.ozon.tracker.sendEvent;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import spay.sdk.domain.model.FraudMonInfo;

@Metadata(d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\bD\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 G2\u00020\u0001:@\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001FHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001¨\u0006\u0087\u0001"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType;", "", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "ADD", "AUTOCOMPLIT", "AVAIL_OFF", "AVAIL_ON", "CLEAR", "CLICK", "CLICK_ADDRESS_CHANGE", "CLOSE", "CLOSE_APP", "CLOUDPUSH_CLICK", "CLOUDPUSH_DELIVERY", "CLOUDPUSH_OPEN", "COLLAPSE_APP", "COMPARE", "DECREMENT", "DISLIKE", "EMAIL_CHANGE", "EXPAND_APP", "FAVORITE", "HELP_TYPE", "INCREMENT", "LIKE", "LOGIN", "LOGIN_CHANGE", "LOGOUT", "METRIC", "ORDER", "PAGE_VIEW", "PASSWORD_CHANGE", "PAYMENT_SUCCESS", "PAYMENT_FAILURE", "PAYMENT_COMPLETION", "PHONE_CHANGE", "PRE_ORDER", "PROMOCODE_ACTIVATION", "REGISTRATION", "REMOVE", "SEARCH", "SEARCH_HELPER", "SELECT", "SELECT_DELIVERY", "SELECT_ADDRESS", "SEND", "SET", "SAVE", "SHOW_PRICE_REPORT", "START_APP", "SUBSCRIBE_PRICE", "TO_CART", "TO_CART_ALL", "TO_CHECKOUT", "TRACK_CAMPAIGN", "UNCOMPARE", "UNFAVORITE", FraudMonInfo.UNKNOWN, "UNSELECT", "UNSUBSCRIBE_PRICE", "REVERSE_GEOCODE_FAIL", "VIEW", "WIDGET_VIEW", "ERROR_VIEW", "SUBMIT", "Custom", "Companion", "Lru/ozon/tracker/sendEvent/ActionType$ADD;", "Lru/ozon/tracker/sendEvent/ActionType$AUTOCOMPLIT;", "Lru/ozon/tracker/sendEvent/ActionType$AVAIL_OFF;", "Lru/ozon/tracker/sendEvent/ActionType$AVAIL_ON;", "Lru/ozon/tracker/sendEvent/ActionType$CLEAR;", "Lru/ozon/tracker/sendEvent/ActionType$CLICK;", "Lru/ozon/tracker/sendEvent/ActionType$CLICK_ADDRESS_CHANGE;", "Lru/ozon/tracker/sendEvent/ActionType$CLOSE;", "Lru/ozon/tracker/sendEvent/ActionType$CLOSE_APP;", "Lru/ozon/tracker/sendEvent/ActionType$CLOUDPUSH_CLICK;", "Lru/ozon/tracker/sendEvent/ActionType$CLOUDPUSH_DELIVERY;", "Lru/ozon/tracker/sendEvent/ActionType$CLOUDPUSH_OPEN;", "Lru/ozon/tracker/sendEvent/ActionType$COLLAPSE_APP;", "Lru/ozon/tracker/sendEvent/ActionType$COMPARE;", "Lru/ozon/tracker/sendEvent/ActionType$Custom;", "Lru/ozon/tracker/sendEvent/ActionType$DECREMENT;", "Lru/ozon/tracker/sendEvent/ActionType$DISLIKE;", "Lru/ozon/tracker/sendEvent/ActionType$EMAIL_CHANGE;", "Lru/ozon/tracker/sendEvent/ActionType$ERROR_VIEW;", "Lru/ozon/tracker/sendEvent/ActionType$EXPAND_APP;", "Lru/ozon/tracker/sendEvent/ActionType$FAVORITE;", "Lru/ozon/tracker/sendEvent/ActionType$HELP_TYPE;", "Lru/ozon/tracker/sendEvent/ActionType$INCREMENT;", "Lru/ozon/tracker/sendEvent/ActionType$LIKE;", "Lru/ozon/tracker/sendEvent/ActionType$LOGIN;", "Lru/ozon/tracker/sendEvent/ActionType$LOGIN_CHANGE;", "Lru/ozon/tracker/sendEvent/ActionType$LOGOUT;", "Lru/ozon/tracker/sendEvent/ActionType$METRIC;", "Lru/ozon/tracker/sendEvent/ActionType$ORDER;", "Lru/ozon/tracker/sendEvent/ActionType$PAGE_VIEW;", "Lru/ozon/tracker/sendEvent/ActionType$PASSWORD_CHANGE;", "Lru/ozon/tracker/sendEvent/ActionType$PAYMENT_COMPLETION;", "Lru/ozon/tracker/sendEvent/ActionType$PAYMENT_FAILURE;", "Lru/ozon/tracker/sendEvent/ActionType$PAYMENT_SUCCESS;", "Lru/ozon/tracker/sendEvent/ActionType$PHONE_CHANGE;", "Lru/ozon/tracker/sendEvent/ActionType$PRE_ORDER;", "Lru/ozon/tracker/sendEvent/ActionType$PROMOCODE_ACTIVATION;", "Lru/ozon/tracker/sendEvent/ActionType$REGISTRATION;", "Lru/ozon/tracker/sendEvent/ActionType$REMOVE;", "Lru/ozon/tracker/sendEvent/ActionType$REVERSE_GEOCODE_FAIL;", "Lru/ozon/tracker/sendEvent/ActionType$SAVE;", "Lru/ozon/tracker/sendEvent/ActionType$SEARCH;", "Lru/ozon/tracker/sendEvent/ActionType$SEARCH_HELPER;", "Lru/ozon/tracker/sendEvent/ActionType$SELECT;", "Lru/ozon/tracker/sendEvent/ActionType$SELECT_ADDRESS;", "Lru/ozon/tracker/sendEvent/ActionType$SELECT_DELIVERY;", "Lru/ozon/tracker/sendEvent/ActionType$SEND;", "Lru/ozon/tracker/sendEvent/ActionType$SET;", "Lru/ozon/tracker/sendEvent/ActionType$SHOW_PRICE_REPORT;", "Lru/ozon/tracker/sendEvent/ActionType$START_APP;", "Lru/ozon/tracker/sendEvent/ActionType$SUBMIT;", "Lru/ozon/tracker/sendEvent/ActionType$SUBSCRIBE_PRICE;", "Lru/ozon/tracker/sendEvent/ActionType$TO_CART;", "Lru/ozon/tracker/sendEvent/ActionType$TO_CART_ALL;", "Lru/ozon/tracker/sendEvent/ActionType$TO_CHECKOUT;", "Lru/ozon/tracker/sendEvent/ActionType$TRACK_CAMPAIGN;", "Lru/ozon/tracker/sendEvent/ActionType$UNCOMPARE;", "Lru/ozon/tracker/sendEvent/ActionType$UNFAVORITE;", "Lru/ozon/tracker/sendEvent/ActionType$UNKNOWN;", "Lru/ozon/tracker/sendEvent/ActionType$UNSELECT;", "Lru/ozon/tracker/sendEvent/ActionType$UNSUBSCRIBE_PRICE;", "Lru/ozon/tracker/sendEvent/ActionType$VIEW;", "Lru/ozon/tracker/sendEvent/ActionType$WIDGET_VIEW;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ActionType {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String type;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$ADD;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ADD extends ActionType {

        @NotNull
        public static final ADD INSTANCE = new ADD();

        private ADD() {
            super(ProductAction.ACTION_ADD, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$AUTOCOMPLIT;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AUTOCOMPLIT extends ActionType {

        @NotNull
        public static final AUTOCOMPLIT INSTANCE = new AUTOCOMPLIT();

        private AUTOCOMPLIT() {
            super("autocomplit", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$AVAIL_OFF;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AVAIL_OFF extends ActionType {

        @NotNull
        public static final AVAIL_OFF INSTANCE = new AVAIL_OFF();

        private AVAIL_OFF() {
            super("avail_off", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$AVAIL_ON;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AVAIL_ON extends ActionType {

        @NotNull
        public static final AVAIL_ON INSTANCE = new AVAIL_ON();

        private AVAIL_ON() {
            super("avail_on", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$CLEAR;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CLEAR extends ActionType {

        @NotNull
        public static final CLEAR INSTANCE = new CLEAR();

        private CLEAR() {
            super("clear", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$CLICK;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CLICK extends ActionType {

        @NotNull
        public static final CLICK INSTANCE = new CLICK();

        private CLICK() {
            super("click", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$CLICK_ADDRESS_CHANGE;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CLICK_ADDRESS_CHANGE extends ActionType {

        @NotNull
        public static final CLICK_ADDRESS_CHANGE INSTANCE = new CLICK_ADDRESS_CHANGE();

        private CLICK_ADDRESS_CHANGE() {
            super("button_click_address_change", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$CLOSE;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CLOSE extends ActionType {

        @NotNull
        public static final CLOSE INSTANCE = new CLOSE();

        private CLOSE() {
            super("close", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$CLOSE_APP;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class CLOSE_APP extends ActionType {

        @NotNull
        public static final CLOSE_APP INSTANCE = new CLOSE_APP();

        private CLOSE_APP() {
            super("close_app", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$CLOUDPUSH_CLICK;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CLOUDPUSH_CLICK extends ActionType {

        @NotNull
        public static final CLOUDPUSH_CLICK INSTANCE = new CLOUDPUSH_CLICK();

        private CLOUDPUSH_CLICK() {
            super("cloudpush_click", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$CLOUDPUSH_DELIVERY;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CLOUDPUSH_DELIVERY extends ActionType {

        @NotNull
        public static final CLOUDPUSH_DELIVERY INSTANCE = new CLOUDPUSH_DELIVERY();

        private CLOUDPUSH_DELIVERY() {
            super("cloudpush_delivery", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$CLOUDPUSH_OPEN;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CLOUDPUSH_OPEN extends ActionType {

        @NotNull
        public static final CLOUDPUSH_OPEN INSTANCE = new CLOUDPUSH_OPEN();

        private CLOUDPUSH_OPEN() {
            super("cloudpush_open", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$COLLAPSE_APP;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class COLLAPSE_APP extends ActionType {

        @NotNull
        public static final COLLAPSE_APP INSTANCE = new COLLAPSE_APP();

        private COLLAPSE_APP() {
            super("collapse_app", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$COMPARE;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class COMPARE extends ActionType {

        @NotNull
        public static final COMPARE INSTANCE = new COMPARE();

        private COMPARE() {
            super("compare", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$Companion;", "", "<init>", "()V", "getByName", "Lru/ozon/tracker/sendEvent/ActionType;", "type", "", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionType getByName(@NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            ADD add = ADD.INSTANCE;
            if (Intrinsics.d(type, add.getType())) {
                return add;
            }
            AUTOCOMPLIT autocomplit = AUTOCOMPLIT.INSTANCE;
            if (Intrinsics.d(type, autocomplit.getType())) {
                return autocomplit;
            }
            AVAIL_OFF avail_off = AVAIL_OFF.INSTANCE;
            if (Intrinsics.d(type, avail_off.getType())) {
                return avail_off;
            }
            AVAIL_ON avail_on = AVAIL_ON.INSTANCE;
            if (Intrinsics.d(type, avail_on.getType())) {
                return avail_on;
            }
            CLEAR clear = CLEAR.INSTANCE;
            if (Intrinsics.d(type, clear.getType())) {
                return clear;
            }
            CLICK click = CLICK.INSTANCE;
            if (Intrinsics.d(type, click.getType())) {
                return click;
            }
            CLICK_ADDRESS_CHANGE click_address_change = CLICK_ADDRESS_CHANGE.INSTANCE;
            if (Intrinsics.d(type, click_address_change.getType())) {
                return click_address_change;
            }
            CLOSE close = CLOSE.INSTANCE;
            if (Intrinsics.d(type, close.getType())) {
                return close;
            }
            CLOUDPUSH_CLICK cloudpush_click = CLOUDPUSH_CLICK.INSTANCE;
            if (Intrinsics.d(type, cloudpush_click.getType())) {
                return cloudpush_click;
            }
            CLOUDPUSH_DELIVERY cloudpush_delivery = CLOUDPUSH_DELIVERY.INSTANCE;
            if (Intrinsics.d(type, cloudpush_delivery.getType())) {
                return cloudpush_delivery;
            }
            CLOUDPUSH_OPEN cloudpush_open = CLOUDPUSH_OPEN.INSTANCE;
            if (Intrinsics.d(type, cloudpush_open.getType())) {
                return cloudpush_open;
            }
            COMPARE compare = COMPARE.INSTANCE;
            if (Intrinsics.d(type, compare.getType())) {
                return compare;
            }
            DECREMENT decrement = DECREMENT.INSTANCE;
            if (Intrinsics.d(type, decrement.getType())) {
                return decrement;
            }
            DISLIKE dislike = DISLIKE.INSTANCE;
            if (Intrinsics.d(type, dislike.getType())) {
                return dislike;
            }
            EMAIL_CHANGE email_change = EMAIL_CHANGE.INSTANCE;
            if (Intrinsics.d(type, email_change.getType())) {
                return email_change;
            }
            FAVORITE favorite = FAVORITE.INSTANCE;
            if (Intrinsics.d(type, favorite.getType())) {
                return favorite;
            }
            HELP_TYPE help_type = HELP_TYPE.INSTANCE;
            if (Intrinsics.d(type, help_type.getType())) {
                return help_type;
            }
            INCREMENT increment = INCREMENT.INSTANCE;
            if (Intrinsics.d(type, increment.getType())) {
                return increment;
            }
            LIKE like = LIKE.INSTANCE;
            if (Intrinsics.d(type, like.getType())) {
                return like;
            }
            LOGIN login = LOGIN.INSTANCE;
            if (Intrinsics.d(type, login.getType())) {
                return login;
            }
            LOGIN_CHANGE login_change = LOGIN_CHANGE.INSTANCE;
            if (Intrinsics.d(type, login_change.getType())) {
                return login_change;
            }
            LOGOUT logout = LOGOUT.INSTANCE;
            if (Intrinsics.d(type, logout.getType())) {
                return logout;
            }
            METRIC metric = METRIC.INSTANCE;
            if (Intrinsics.d(type, metric.getType())) {
                return metric;
            }
            ORDER order = ORDER.INSTANCE;
            if (Intrinsics.d(type, order.getType())) {
                return order;
            }
            PAGE_VIEW page_view = PAGE_VIEW.INSTANCE;
            if (Intrinsics.d(type, page_view.getType())) {
                return page_view;
            }
            PASSWORD_CHANGE password_change = PASSWORD_CHANGE.INSTANCE;
            if (Intrinsics.d(type, password_change.getType())) {
                return password_change;
            }
            PAYMENT_SUCCESS payment_success = PAYMENT_SUCCESS.INSTANCE;
            if (Intrinsics.d(type, payment_success.getType())) {
                return payment_success;
            }
            PAYMENT_FAILURE payment_failure = PAYMENT_FAILURE.INSTANCE;
            if (Intrinsics.d(type, payment_failure.getType())) {
                return payment_failure;
            }
            PAYMENT_COMPLETION payment_completion = PAYMENT_COMPLETION.INSTANCE;
            if (Intrinsics.d(type, payment_completion.getType())) {
                return payment_completion;
            }
            PHONE_CHANGE phone_change = PHONE_CHANGE.INSTANCE;
            if (Intrinsics.d(type, phone_change.getType())) {
                return phone_change;
            }
            PRE_ORDER pre_order = PRE_ORDER.INSTANCE;
            if (Intrinsics.d(type, pre_order.getType())) {
                return pre_order;
            }
            PROMOCODE_ACTIVATION promocode_activation = PROMOCODE_ACTIVATION.INSTANCE;
            if (Intrinsics.d(type, promocode_activation.getType())) {
                return promocode_activation;
            }
            REGISTRATION registration = REGISTRATION.INSTANCE;
            if (Intrinsics.d(type, registration.getType())) {
                return registration;
            }
            REMOVE remove = REMOVE.INSTANCE;
            if (Intrinsics.d(type, remove.getType())) {
                return remove;
            }
            SEARCH search = SEARCH.INSTANCE;
            if (Intrinsics.d(type, search.getType())) {
                return search;
            }
            SEARCH_HELPER search_helper = SEARCH_HELPER.INSTANCE;
            if (Intrinsics.d(type, search_helper.getType())) {
                return search_helper;
            }
            SELECT select = SELECT.INSTANCE;
            if (Intrinsics.d(type, select.getType())) {
                return select;
            }
            SELECT_DELIVERY select_delivery = SELECT_DELIVERY.INSTANCE;
            if (Intrinsics.d(type, select_delivery.getType())) {
                return select_delivery;
            }
            SELECT_ADDRESS select_address = SELECT_ADDRESS.INSTANCE;
            if (Intrinsics.d(type, select_address.getType())) {
                return select_address;
            }
            SEND send = SEND.INSTANCE;
            if (Intrinsics.d(type, send.getType())) {
                return send;
            }
            SET set = SET.INSTANCE;
            if (Intrinsics.d(type, set.getType())) {
                return set;
            }
            SHOW_PRICE_REPORT show_price_report = SHOW_PRICE_REPORT.INSTANCE;
            if (Intrinsics.d(type, show_price_report.getType())) {
                return show_price_report;
            }
            SUBSCRIBE_PRICE subscribe_price = SUBSCRIBE_PRICE.INSTANCE;
            if (Intrinsics.d(type, subscribe_price.getType())) {
                return subscribe_price;
            }
            TO_CART to_cart = TO_CART.INSTANCE;
            if (Intrinsics.d(type, to_cart.getType())) {
                return to_cart;
            }
            TO_CHECKOUT to_checkout = TO_CHECKOUT.INSTANCE;
            if (Intrinsics.d(type, to_checkout.getType())) {
                return to_checkout;
            }
            TRACK_CAMPAIGN track_campaign = TRACK_CAMPAIGN.INSTANCE;
            if (Intrinsics.d(type, track_campaign.getType())) {
                return track_campaign;
            }
            UNCOMPARE uncompare = UNCOMPARE.INSTANCE;
            if (Intrinsics.d(type, uncompare.getType())) {
                return uncompare;
            }
            UNFAVORITE unfavorite = UNFAVORITE.INSTANCE;
            if (Intrinsics.d(type, unfavorite.getType())) {
                return unfavorite;
            }
            UNKNOWN unknown = UNKNOWN.INSTANCE;
            if (Intrinsics.d(type, unknown.getType())) {
                return unknown;
            }
            UNSELECT unselect = UNSELECT.INSTANCE;
            if (Intrinsics.d(type, unselect.getType())) {
                return unselect;
            }
            UNSUBSCRIBE_PRICE unsubscribe_price = UNSUBSCRIBE_PRICE.INSTANCE;
            if (Intrinsics.d(type, unsubscribe_price.getType())) {
                return unsubscribe_price;
            }
            REVERSE_GEOCODE_FAIL reverse_geocode_fail = REVERSE_GEOCODE_FAIL.INSTANCE;
            if (Intrinsics.d(type, reverse_geocode_fail.getType())) {
                return reverse_geocode_fail;
            }
            VIEW view = VIEW.INSTANCE;
            return Intrinsics.d(type, view.getType()) ? view : new Custom(type);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$Custom;", "Lru/ozon/tracker/sendEvent/ActionType;", "type", "", "<init>", "(Ljava/lang/String;)V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Custom extends ActionType {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(@NotNull String type) {
            super(type, null);
            Intrinsics.checkNotNullParameter(type, "type");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$DECREMENT;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DECREMENT extends ActionType {

        @NotNull
        public static final DECREMENT INSTANCE = new DECREMENT();

        private DECREMENT() {
            super("decrement", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$DISLIKE;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DISLIKE extends ActionType {

        @NotNull
        public static final DISLIKE INSTANCE = new DISLIKE();

        private DISLIKE() {
            super("dislike", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$EMAIL_CHANGE;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EMAIL_CHANGE extends ActionType {

        @NotNull
        public static final EMAIL_CHANGE INSTANCE = new EMAIL_CHANGE();

        private EMAIL_CHANGE() {
            super("email_change", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$ERROR_VIEW;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ERROR_VIEW extends ActionType {

        @NotNull
        public static final ERROR_VIEW INSTANCE = new ERROR_VIEW();

        private ERROR_VIEW() {
            super(TokenizedTrackingInfo.ACTION_ERROR_VIEW, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$EXPAND_APP;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class EXPAND_APP extends ActionType {

        @NotNull
        public static final EXPAND_APP INSTANCE = new EXPAND_APP();

        private EXPAND_APP() {
            super("expand_app", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$FAVORITE;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FAVORITE extends ActionType {

        @NotNull
        public static final FAVORITE INSTANCE = new FAVORITE();

        private FAVORITE() {
            super("favorite", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$HELP_TYPE;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HELP_TYPE extends ActionType {

        @NotNull
        public static final HELP_TYPE INSTANCE = new HELP_TYPE();

        private HELP_TYPE() {
            super("help_type", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$INCREMENT;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class INCREMENT extends ActionType {

        @NotNull
        public static final INCREMENT INSTANCE = new INCREMENT();

        private INCREMENT() {
            super("increment", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$LIKE;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LIKE extends ActionType {

        @NotNull
        public static final LIKE INSTANCE = new LIKE();

        private LIKE() {
            super("like", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$LOGIN;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LOGIN extends ActionType {

        @NotNull
        public static final LOGIN INSTANCE = new LOGIN();

        private LOGIN() {
            super("login", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$LOGIN_CHANGE;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LOGIN_CHANGE extends ActionType {

        @NotNull
        public static final LOGIN_CHANGE INSTANCE = new LOGIN_CHANGE();

        private LOGIN_CHANGE() {
            super("login_change", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$LOGOUT;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LOGOUT extends ActionType {

        @NotNull
        public static final LOGOUT INSTANCE = new LOGOUT();

        private LOGOUT() {
            super("logout", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$METRIC;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class METRIC extends ActionType {

        @NotNull
        public static final METRIC INSTANCE = new METRIC();

        private METRIC() {
            super("metric", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$ORDER;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ORDER extends ActionType {

        @NotNull
        public static final ORDER INSTANCE = new ORDER();

        private ORDER() {
            super("order", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$PAGE_VIEW;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PAGE_VIEW extends ActionType {

        @NotNull
        public static final PAGE_VIEW INSTANCE = new PAGE_VIEW();

        private PAGE_VIEW() {
            super("page_view", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$PASSWORD_CHANGE;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PASSWORD_CHANGE extends ActionType {

        @NotNull
        public static final PASSWORD_CHANGE INSTANCE = new PASSWORD_CHANGE();

        private PASSWORD_CHANGE() {
            super("password_change", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$PAYMENT_COMPLETION;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PAYMENT_COMPLETION extends ActionType {

        @NotNull
        public static final PAYMENT_COMPLETION INSTANCE = new PAYMENT_COMPLETION();

        private PAYMENT_COMPLETION() {
            super("payment_completion", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$PAYMENT_FAILURE;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PAYMENT_FAILURE extends ActionType {

        @NotNull
        public static final PAYMENT_FAILURE INSTANCE = new PAYMENT_FAILURE();

        private PAYMENT_FAILURE() {
            super("payment_failure", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$PAYMENT_SUCCESS;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PAYMENT_SUCCESS extends ActionType {

        @NotNull
        public static final PAYMENT_SUCCESS INSTANCE = new PAYMENT_SUCCESS();

        private PAYMENT_SUCCESS() {
            super("payment_success", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$PHONE_CHANGE;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PHONE_CHANGE extends ActionType {

        @NotNull
        public static final PHONE_CHANGE INSTANCE = new PHONE_CHANGE();

        private PHONE_CHANGE() {
            super("phone_change", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$PRE_ORDER;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PRE_ORDER extends ActionType {

        @NotNull
        public static final PRE_ORDER INSTANCE = new PRE_ORDER();

        private PRE_ORDER() {
            super("pre_order", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$PROMOCODE_ACTIVATION;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PROMOCODE_ACTIVATION extends ActionType {

        @NotNull
        public static final PROMOCODE_ACTIVATION INSTANCE = new PROMOCODE_ACTIVATION();

        private PROMOCODE_ACTIVATION() {
            super("promocode_activation", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$REGISTRATION;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class REGISTRATION extends ActionType {

        @NotNull
        public static final REGISTRATION INSTANCE = new REGISTRATION();

        private REGISTRATION() {
            super("registration", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$REMOVE;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class REMOVE extends ActionType {

        @NotNull
        public static final REMOVE INSTANCE = new REMOVE();

        private REMOVE() {
            super(ProductAction.ACTION_REMOVE, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$REVERSE_GEOCODE_FAIL;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class REVERSE_GEOCODE_FAIL extends ActionType {

        @NotNull
        public static final REVERSE_GEOCODE_FAIL INSTANCE = new REVERSE_GEOCODE_FAIL();

        private REVERSE_GEOCODE_FAIL() {
            super("reverse_geocode_fail", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$SAVE;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class SAVE extends ActionType {

        @NotNull
        public static final SAVE INSTANCE = new SAVE();

        private SAVE() {
            super("save", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$SEARCH;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SEARCH extends ActionType {

        @NotNull
        public static final SEARCH INSTANCE = new SEARCH();

        private SEARCH() {
            super("search", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$SEARCH_HELPER;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SEARCH_HELPER extends ActionType {

        @NotNull
        public static final SEARCH_HELPER INSTANCE = new SEARCH_HELPER();

        private SEARCH_HELPER() {
            super("search_helper", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$SELECT;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SELECT extends ActionType {

        @NotNull
        public static final SELECT INSTANCE = new SELECT();

        private SELECT() {
            super("select", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$SELECT_ADDRESS;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SELECT_ADDRESS extends ActionType {

        @NotNull
        public static final SELECT_ADDRESS INSTANCE = new SELECT_ADDRESS();

        private SELECT_ADDRESS() {
            super("select_address", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$SELECT_DELIVERY;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SELECT_DELIVERY extends ActionType {

        @NotNull
        public static final SELECT_DELIVERY INSTANCE = new SELECT_DELIVERY();

        private SELECT_DELIVERY() {
            super("select_delivery", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$SEND;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SEND extends ActionType {

        @NotNull
        public static final SEND INSTANCE = new SEND();

        private SEND() {
            super("send", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$SET;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SET extends ActionType {

        @NotNull
        public static final SET INSTANCE = new SET();

        private SET() {
            super("set", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$SHOW_PRICE_REPORT;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SHOW_PRICE_REPORT extends ActionType {

        @NotNull
        public static final SHOW_PRICE_REPORT INSTANCE = new SHOW_PRICE_REPORT();

        private SHOW_PRICE_REPORT() {
            super("show_price_report", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$START_APP;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class START_APP extends ActionType {

        @NotNull
        public static final START_APP INSTANCE = new START_APP();

        private START_APP() {
            super("start_app", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$SUBMIT;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class SUBMIT extends ActionType {

        @NotNull
        public static final SUBMIT INSTANCE = new SUBMIT();

        private SUBMIT() {
            super("submit", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$SUBSCRIBE_PRICE;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SUBSCRIBE_PRICE extends ActionType {

        @NotNull
        public static final SUBSCRIBE_PRICE INSTANCE = new SUBSCRIBE_PRICE();

        private SUBSCRIBE_PRICE() {
            super("subscribe_price", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$TO_CART;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TO_CART extends ActionType {

        @NotNull
        public static final TO_CART INSTANCE = new TO_CART();

        private TO_CART() {
            super("to_cart", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$TO_CART_ALL;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class TO_CART_ALL extends ActionType {

        @NotNull
        public static final TO_CART_ALL INSTANCE = new TO_CART_ALL();

        private TO_CART_ALL() {
            super("to_cart_all", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$TO_CHECKOUT;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TO_CHECKOUT extends ActionType {

        @NotNull
        public static final TO_CHECKOUT INSTANCE = new TO_CHECKOUT();

        private TO_CHECKOUT() {
            super("to_checkout", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$TRACK_CAMPAIGN;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TRACK_CAMPAIGN extends ActionType {

        @NotNull
        public static final TRACK_CAMPAIGN INSTANCE = new TRACK_CAMPAIGN();

        private TRACK_CAMPAIGN() {
            super("track_campaign", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$UNCOMPARE;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UNCOMPARE extends ActionType {

        @NotNull
        public static final UNCOMPARE INSTANCE = new UNCOMPARE();

        private UNCOMPARE() {
            super("uncompare", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$UNFAVORITE;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UNFAVORITE extends ActionType {

        @NotNull
        public static final UNFAVORITE INSTANCE = new UNFAVORITE();

        private UNFAVORITE() {
            super("unfavorite", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$UNKNOWN;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UNKNOWN extends ActionType {

        @NotNull
        public static final UNKNOWN INSTANCE = new UNKNOWN();

        private UNKNOWN() {
            super("", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$UNSELECT;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UNSELECT extends ActionType {

        @NotNull
        public static final UNSELECT INSTANCE = new UNSELECT();

        private UNSELECT() {
            super("unselect", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$UNSUBSCRIBE_PRICE;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UNSUBSCRIBE_PRICE extends ActionType {

        @NotNull
        public static final UNSUBSCRIBE_PRICE INSTANCE = new UNSUBSCRIBE_PRICE();

        private UNSUBSCRIBE_PRICE() {
            super("unsubscribe_price", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$VIEW;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class VIEW extends ActionType {

        @NotNull
        public static final VIEW INSTANCE = new VIEW();

        private VIEW() {
            super("view", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/tracker/sendEvent/ActionType$WIDGET_VIEW;", "Lru/ozon/tracker/sendEvent/ActionType;", "<init>", "()V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WIDGET_VIEW extends ActionType {

        @NotNull
        public static final WIDGET_VIEW INSTANCE = new WIDGET_VIEW();

        private WIDGET_VIEW() {
            super("widget_view", null);
        }
    }

    public /* synthetic */ ActionType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public String getType() {
        return this.type;
    }

    private ActionType(String str) {
        this.type = str;
    }

    public /* synthetic */ ActionType(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, null);
    }
}
