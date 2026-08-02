package ru.ozon.app.android.account.orders.onorderchangenew;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeEvent;", "", "<init>", "()V", "RefreshScreen", "ShowMessage", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeEvent$RefreshScreen;", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeEvent$ShowMessage;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class OrderChangeEvent {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeEvent$RefreshScreen;", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RefreshScreen extends OrderChangeEvent {

        @NotNull
        public static final RefreshScreen INSTANCE = new RefreshScreen();

        private RefreshScreen() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof RefreshScreen);
        }

        public int hashCode() {
            return 1427398207;
        }

        @NotNull
        public String toString() {
            return "RefreshScreen";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeEvent$ShowMessage;", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeEvent;", "", "message", "", "iconId", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Ljava/lang/Integer;", "getIconId", "()Ljava/lang/Integer;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowMessage extends OrderChangeEvent {
        private final Integer iconId;

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowMessage(@NotNull String message, Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.iconId = num;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowMessage)) {
                return false;
            }
            ShowMessage showMessage = (ShowMessage) other;
            return Intrinsics.d(this.message, showMessage.message) && Intrinsics.d(this.iconId, showMessage.iconId);
        }

        public final Integer getIconId() {
            return this.iconId;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            Integer num = this.iconId;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            return "ShowMessage(message=" + this.message + ", iconId=" + this.iconId + ")";
        }
    }

    public /* synthetic */ OrderChangeEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OrderChangeEvent() {
    }
}
