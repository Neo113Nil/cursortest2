package ru.ozon.app.android.fresh.unsorted.liveActivity.orderStatus;

import G.g;
import N3.C3660k;
import V.e;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.fresh.unsorted.R$color;
import ru.ozon.app.android.fresh.unsorted.R$drawable;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u00042345BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jk\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00066"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO;", "", "status", "Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$OrderStatus;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "progressBar", "Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ProgressBar;", "button", "Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$Button;", "widgetLink", "serverTimestamp", "Lorg/joda/time/DateTime;", "deadlineTimestamp", "bottomButton", "Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ActionButton;", "<init>", "(Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$OrderStatus;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ProgressBar;Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$Button;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ActionButton;)V", "getStatus", "()Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$OrderStatus;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getProgressBar", "()Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ProgressBar;", "getButton", "()Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$Button;", "getWidgetLink", "getServerTimestamp", "()Lorg/joda/time/DateTime;", "getDeadlineTimestamp", "getBottomButton", "()Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ActionButton;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "OrderStatus", "ProgressBar", "Button", "ActionButton", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OrderStatusLiveActivityStateDTO {
    public static final int $stable = 8;
    private final ActionButton bottomButton;
    private final Button button;
    private final DateTime deadlineTimestamp;

    @NotNull
    private final ProgressBar progressBar;
    private final DateTime serverTimestamp;

    @NotNull
    private final OrderStatus status;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;

    @NotNull
    private final String widgetLink;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ActionButton;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "actionLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getActionLink", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionButton {
        public static final int $stable = 0;

        @NotNull
        private final String actionLink;

        @NotNull
        private final String title;

        public ActionButton(@NotNull String title, @NotNull String actionLink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(actionLink, "actionLink");
            this.title = title;
            this.actionLink = actionLink;
        }

        public static /* synthetic */ ActionButton copy$default(ActionButton actionButton, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = actionButton.title;
            }
            if ((i11 & 2) != 0) {
                str2 = actionButton.actionLink;
            }
            return actionButton.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getActionLink() {
            return this.actionLink;
        }

        @NotNull
        public final ActionButton copy(@NotNull String title, @NotNull String actionLink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(actionLink, "actionLink");
            return new ActionButton(title, actionLink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionButton)) {
                return false;
            }
            ActionButton actionButton = (ActionButton) other;
            return Intrinsics.d(this.title, actionButton.title) && Intrinsics.d(this.actionLink, actionButton.actionLink);
        }

        @NotNull
        public final String getActionLink() {
            return this.actionLink;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.actionLink.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("ActionButton(title=", this.title, ", actionLink=", this.actionLink, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$OrderStatus;", "", "color", "", "<init>", "(Ljava/lang/String;II)V", "getColor", "()I", "ORDER_STATUS_INVALID", "ORDER_STATUS_PAYMENT", "ORDER_STATUS_CREATED", "ORDER_STATUS_PACKAGING", "ORDER_STATUS_ON_THE_WAY", "ORDER_STATUS_DELAYED", "ORDER_STATUS_RECEIVED", "ORDER_STATUS_CANCELED", "ORDER_STATUS_WAITING", "ORDER_STATUS_WAITING_LONG", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OrderStatus {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ OrderStatus[] $VALUES;
        private final int color;
        public static final OrderStatus ORDER_STATUS_INVALID = new OrderStatus("ORDER_STATUS_INVALID", 0, -1);
        public static final OrderStatus ORDER_STATUS_PAYMENT = new OrderStatus("ORDER_STATUS_PAYMENT", 1, R$color.notification_red);
        public static final OrderStatus ORDER_STATUS_CREATED = new OrderStatus("ORDER_STATUS_CREATED", 2, R$color.notification_fresh);
        public static final OrderStatus ORDER_STATUS_PACKAGING = new OrderStatus("ORDER_STATUS_PACKAGING", 3, R$color.notification_fresh);
        public static final OrderStatus ORDER_STATUS_ON_THE_WAY = new OrderStatus("ORDER_STATUS_ON_THE_WAY", 4, R$color.notification_fresh);
        public static final OrderStatus ORDER_STATUS_DELAYED = new OrderStatus("ORDER_STATUS_DELAYED", 5, R$color.notification_orange);
        public static final OrderStatus ORDER_STATUS_RECEIVED = new OrderStatus("ORDER_STATUS_RECEIVED", 6, R$color.notification_fresh);
        public static final OrderStatus ORDER_STATUS_CANCELED = new OrderStatus("ORDER_STATUS_CANCELED", 7, R$color.notification_red);
        public static final OrderStatus ORDER_STATUS_WAITING = new OrderStatus("ORDER_STATUS_WAITING", 8, R$color.notification_orange);
        public static final OrderStatus ORDER_STATUS_WAITING_LONG = new OrderStatus("ORDER_STATUS_WAITING_LONG", 9, R$color.notification_red);

        private static final /* synthetic */ OrderStatus[] $values() {
            return new OrderStatus[]{ORDER_STATUS_INVALID, ORDER_STATUS_PAYMENT, ORDER_STATUS_CREATED, ORDER_STATUS_PACKAGING, ORDER_STATUS_ON_THE_WAY, ORDER_STATUS_DELAYED, ORDER_STATUS_RECEIVED, ORDER_STATUS_CANCELED, ORDER_STATUS_WAITING, ORDER_STATUS_WAITING_LONG};
        }

        static {
            OrderStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private OrderStatus(String str, int i11, int i12) {
            this.color = i12;
        }

        public static OrderStatus valueOf(String str) {
            return (OrderStatus) Enum.valueOf(OrderStatus.class, str);
        }

        public static OrderStatus[] values() {
            return (OrderStatus[]) $VALUES.clone();
        }

        public final int getColor() {
            return this.color;
        }
    }

    public OrderStatusLiveActivityStateDTO(@NotNull OrderStatus status, @NotNull String title, @NotNull String subtitle, @NotNull ProgressBar progressBar, Button button, @NotNull String widgetLink, DateTime dateTime, DateTime dateTime2, ActionButton actionButton) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        Intrinsics.checkNotNullParameter(widgetLink, "widgetLink");
        this.status = status;
        this.title = title;
        this.subtitle = subtitle;
        this.progressBar = progressBar;
        this.button = button;
        this.widgetLink = widgetLink;
        this.serverTimestamp = dateTime;
        this.deadlineTimestamp = dateTime2;
        this.bottomButton = actionButton;
    }

    public static /* synthetic */ OrderStatusLiveActivityStateDTO copy$default(OrderStatusLiveActivityStateDTO orderStatusLiveActivityStateDTO, OrderStatus orderStatus, String str, String str2, ProgressBar progressBar, Button button, String str3, DateTime dateTime, DateTime dateTime2, ActionButton actionButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            orderStatus = orderStatusLiveActivityStateDTO.status;
        }
        if ((i11 & 2) != 0) {
            str = orderStatusLiveActivityStateDTO.title;
        }
        if ((i11 & 4) != 0) {
            str2 = orderStatusLiveActivityStateDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            progressBar = orderStatusLiveActivityStateDTO.progressBar;
        }
        if ((i11 & 16) != 0) {
            button = orderStatusLiveActivityStateDTO.button;
        }
        if ((i11 & 32) != 0) {
            str3 = orderStatusLiveActivityStateDTO.widgetLink;
        }
        if ((i11 & 64) != 0) {
            dateTime = orderStatusLiveActivityStateDTO.serverTimestamp;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            dateTime2 = orderStatusLiveActivityStateDTO.deadlineTimestamp;
        }
        if ((i11 & 256) != 0) {
            actionButton = orderStatusLiveActivityStateDTO.bottomButton;
        }
        DateTime dateTime3 = dateTime2;
        ActionButton actionButton2 = actionButton;
        String str4 = str3;
        DateTime dateTime4 = dateTime;
        Button button2 = button;
        String str5 = str2;
        return orderStatusLiveActivityStateDTO.copy(orderStatus, str, str5, progressBar, button2, str4, dateTime4, dateTime3, actionButton2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OrderStatus getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ProgressBar getProgressBar() {
        return this.progressBar;
    }

    /* renamed from: component5, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getWidgetLink() {
        return this.widgetLink;
    }

    /* renamed from: component7, reason: from getter */
    public final DateTime getServerTimestamp() {
        return this.serverTimestamp;
    }

    /* renamed from: component8, reason: from getter */
    public final DateTime getDeadlineTimestamp() {
        return this.deadlineTimestamp;
    }

    /* renamed from: component9, reason: from getter */
    public final ActionButton getBottomButton() {
        return this.bottomButton;
    }

    @NotNull
    public final OrderStatusLiveActivityStateDTO copy(@NotNull OrderStatus status, @NotNull String title, @NotNull String subtitle, @NotNull ProgressBar progressBar, Button button, @NotNull String widgetLink, DateTime serverTimestamp, DateTime deadlineTimestamp, ActionButton bottomButton) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        Intrinsics.checkNotNullParameter(widgetLink, "widgetLink");
        return new OrderStatusLiveActivityStateDTO(status, title, subtitle, progressBar, button, widgetLink, serverTimestamp, deadlineTimestamp, bottomButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderStatusLiveActivityStateDTO)) {
            return false;
        }
        OrderStatusLiveActivityStateDTO orderStatusLiveActivityStateDTO = (OrderStatusLiveActivityStateDTO) other;
        return this.status == orderStatusLiveActivityStateDTO.status && Intrinsics.d(this.title, orderStatusLiveActivityStateDTO.title) && Intrinsics.d(this.subtitle, orderStatusLiveActivityStateDTO.subtitle) && Intrinsics.d(this.progressBar, orderStatusLiveActivityStateDTO.progressBar) && Intrinsics.d(this.button, orderStatusLiveActivityStateDTO.button) && Intrinsics.d(this.widgetLink, orderStatusLiveActivityStateDTO.widgetLink) && Intrinsics.d(this.serverTimestamp, orderStatusLiveActivityStateDTO.serverTimestamp) && Intrinsics.d(this.deadlineTimestamp, orderStatusLiveActivityStateDTO.deadlineTimestamp) && Intrinsics.d(this.bottomButton, orderStatusLiveActivityStateDTO.bottomButton);
    }

    public final ActionButton getBottomButton() {
        return this.bottomButton;
    }

    public final Button getButton() {
        return this.button;
    }

    public final DateTime getDeadlineTimestamp() {
        return this.deadlineTimestamp;
    }

    @NotNull
    public final ProgressBar getProgressBar() {
        return this.progressBar;
    }

    public final DateTime getServerTimestamp() {
        return this.serverTimestamp;
    }

    @NotNull
    public final OrderStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getWidgetLink() {
        return this.widgetLink;
    }

    public int hashCode() {
        int hashCode = (this.progressBar.hashCode() + g.a(g.a(this.status.hashCode() * 31, 31, this.title), 31, this.subtitle)) * 31;
        Button button = this.button;
        int a11 = g.a((hashCode + (button == null ? 0 : button.hashCode())) * 31, 31, this.widgetLink);
        DateTime dateTime = this.serverTimestamp;
        int hashCode2 = (a11 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.deadlineTimestamp;
        int hashCode3 = (hashCode2 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        ActionButton actionButton = this.bottomButton;
        return hashCode3 + (actionButton != null ? actionButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OrderStatusLiveActivityStateDTO(status=" + this.status + ", title=" + this.title + ", subtitle=" + this.subtitle + ", progressBar=" + this.progressBar + ", button=" + this.button + ", widgetLink=" + this.widgetLink + ", serverTimestamp=" + this.serverTimestamp + ", deadlineTimestamp=" + this.deadlineTimestamp + ", bottomButton=" + this.bottomButton + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$Button;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isRatingButton", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getTitle", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$Button;", "equals", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button {
        public static final int $stable = 0;
        private final Boolean isRatingButton;
        private final String title;

        public Button(String str, Boolean bool) {
            this.title = str;
            this.isRatingButton = bool;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = button.title;
            }
            if ((i11 & 2) != 0) {
                bool = button.isRatingButton;
            }
            return button.copy(str, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsRatingButton() {
            return this.isRatingButton;
        }

        @NotNull
        public final Button copy(String title, Boolean isRatingButton) {
            return new Button(title, isRatingButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.d(this.title, button.title) && Intrinsics.d(this.isRatingButton, button.isRatingButton);
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isRatingButton;
            return hashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final Boolean isRatingButton() {
            return this.isRatingButton;
        }

        @NotNull
        public String toString() {
            return "Button(title=" + this.title + ", isRatingButton=" + this.isRatingButton + ")";
        }

        public /* synthetic */ Button(String str, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, bool);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\"#B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ProgressBar;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "icon", "Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ProgressBar$ProgressIcon;", "progress", "", "mode", "Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ProgressBar$TimerMode;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ProgressBar$ProgressIcon;DLru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ProgressBar$TimerMode;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getIcon", "()Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ProgressBar$ProgressIcon;", "getProgress", "()D", "getMode", "()Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ProgressBar$TimerMode;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "TimerMode", "ProgressIcon", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ProgressBar {
        public static final int $stable = 0;
        private final ProgressIcon icon;

        @NotNull
        private final TimerMode mode;
        private final double progress;
        private final String subtitle;
        private final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ProgressBar$ProgressIcon;", "", "resourceId", "", "<init>", "(Ljava/lang/String;II)V", "getResourceId", "()I", "DANGER", "TIMER", "DOOR", "DONE", "CANCEL", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ProgressIcon {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ ProgressIcon[] $VALUES;
            private final int resourceId;

            @i(name = "ic_danger")
            public static final ProgressIcon DANGER = new ProgressIcon("DANGER", 0, R$drawable.ic_progress_danger);

            @i(name = "ic_timer")
            public static final ProgressIcon TIMER = new ProgressIcon("TIMER", 1, R$drawable.ic_progress_timer);

            @i(name = "ic_door")
            public static final ProgressIcon DOOR = new ProgressIcon("DOOR", 2, R$drawable.ic_progress_door);

            @i(name = "ic_done")
            public static final ProgressIcon DONE = new ProgressIcon("DONE", 3, R$drawable.ic_progress_done);

            @i(name = "ic_cancel")
            public static final ProgressIcon CANCEL = new ProgressIcon("CANCEL", 4, R$drawable.ic_progress_cancel);

            private static final /* synthetic */ ProgressIcon[] $values() {
                return new ProgressIcon[]{DANGER, TIMER, DOOR, DONE, CANCEL};
            }

            static {
                ProgressIcon[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private ProgressIcon(String str, int i11, int i12) {
                this.resourceId = i12;
            }

            public static ProgressIcon valueOf(String str) {
                return (ProgressIcon) Enum.valueOf(ProgressIcon.class, str);
            }

            public static ProgressIcon[] values() {
                return (ProgressIcon[]) $VALUES.clone();
            }

            public final int getResourceId() {
                return this.resourceId;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/liveActivity/orderStatus/OrderStatusLiveActivityStateDTO$ProgressBar$TimerMode;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "TARGET", "ESTIMATED", "ICON", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class TimerMode {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ TimerMode[] $VALUES;
            public static final TimerMode INVALID = new TimerMode("INVALID", 0);
            public static final TimerMode TARGET = new TimerMode("TARGET", 1);
            public static final TimerMode ESTIMATED = new TimerMode("ESTIMATED", 2);
            public static final TimerMode ICON = new TimerMode("ICON", 3);

            private static final /* synthetic */ TimerMode[] $values() {
                return new TimerMode[]{INVALID, TARGET, ESTIMATED, ICON};
            }

            static {
                TimerMode[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private TimerMode(String str, int i11) {
            }

            public static TimerMode valueOf(String str) {
                return (TimerMode) Enum.valueOf(TimerMode.class, str);
            }

            public static TimerMode[] values() {
                return (TimerMode[]) $VALUES.clone();
            }
        }

        public ProgressBar(String str, String str2, ProgressIcon progressIcon, double d11, @NotNull TimerMode mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.title = str;
            this.subtitle = str2;
            this.icon = progressIcon;
            this.progress = d11;
            this.mode = mode;
        }

        public static /* synthetic */ ProgressBar copy$default(ProgressBar progressBar, String str, String str2, ProgressIcon progressIcon, double d11, TimerMode timerMode, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = progressBar.title;
            }
            if ((i11 & 2) != 0) {
                str2 = progressBar.subtitle;
            }
            if ((i11 & 4) != 0) {
                progressIcon = progressBar.icon;
            }
            if ((i11 & 8) != 0) {
                d11 = progressBar.progress;
            }
            if ((i11 & 16) != 0) {
                timerMode = progressBar.mode;
            }
            TimerMode timerMode2 = timerMode;
            ProgressIcon progressIcon2 = progressIcon;
            return progressBar.copy(str, str2, progressIcon2, d11, timerMode2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final ProgressIcon getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final double getProgress() {
            return this.progress;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final TimerMode getMode() {
            return this.mode;
        }

        @NotNull
        public final ProgressBar copy(String title, String subtitle, ProgressIcon icon, double progress, @NotNull TimerMode mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            return new ProgressBar(title, subtitle, icon, progress, mode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressBar)) {
                return false;
            }
            ProgressBar progressBar = (ProgressBar) other;
            return Intrinsics.d(this.title, progressBar.title) && Intrinsics.d(this.subtitle, progressBar.subtitle) && this.icon == progressBar.icon && Double.compare(this.progress, progressBar.progress) == 0 && this.mode == progressBar.mode;
        }

        public final ProgressIcon getIcon() {
            return this.icon;
        }

        @NotNull
        public final TimerMode getMode() {
            return this.mode;
        }

        public final double getProgress() {
            return this.progress;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ProgressIcon progressIcon = this.icon;
            return this.mode.hashCode() + Pk0.g.a((hashCode2 + (progressIcon != null ? progressIcon.hashCode() : 0)) * 31, 31, this.progress);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            ProgressIcon progressIcon = this.icon;
            double d11 = this.progress;
            TimerMode timerMode = this.mode;
            StringBuilder d12 = C3660k.d("ProgressBar(title=", str, ", subtitle=", str2, ", icon=");
            d12.append(progressIcon);
            d12.append(", progress=");
            d12.append(d11);
            d12.append(", mode=");
            d12.append(timerMode);
            d12.append(")");
            return d12.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ ProgressBar(String str, String str2, ProgressIcon progressIcon, double d11, TimerMode timerMode, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, r5, r6, r8);
            TimerMode timerMode2;
            double d12;
            ProgressIcon progressIcon2;
            str = (i11 & 1) != 0 ? null : str;
            str2 = (i11 & 2) != 0 ? null : str2;
            if ((i11 & 4) != 0) {
                timerMode2 = timerMode;
                d12 = d11;
                progressIcon2 = null;
            } else {
                timerMode2 = timerMode;
                d12 = d11;
                progressIcon2 = progressIcon;
            }
        }
    }

    public /* synthetic */ OrderStatusLiveActivityStateDTO(OrderStatus orderStatus, String str, String str2, ProgressBar progressBar, Button button, String str3, DateTime dateTime, DateTime dateTime2, ActionButton actionButton, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(orderStatus, str, str2, progressBar, (i11 & 16) != 0 ? null : button, str3, dateTime, dateTime2, actionButton);
    }
}
