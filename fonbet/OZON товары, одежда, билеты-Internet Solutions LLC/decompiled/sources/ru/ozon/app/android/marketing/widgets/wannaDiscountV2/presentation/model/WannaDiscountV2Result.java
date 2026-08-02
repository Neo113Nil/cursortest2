package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.model;

import B0.A0;
import B90.C2618u;
import H3.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.vo.WannaDiscountV2VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result;", "", "<init>", "()V", "SendDiscountError", "SendDiscountSuccess", "PriceError", "QuantityError", "UpdateDiscount", "PriceSuccess", "QuantitySuccess", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result$PriceError;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result$PriceSuccess;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result$QuantityError;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result$QuantitySuccess;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result$SendDiscountError;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result$SendDiscountSuccess;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result$UpdateDiscount;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class WannaDiscountV2Result {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result$PriceError;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceError extends WannaDiscountV2Result {

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PriceError(@NotNull String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PriceError) && Intrinsics.d(this.message, ((PriceError) other).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("PriceError(message=", this.message, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result$PriceSuccess;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result;", "", "buttonEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getButtonEnabled", "()Z", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceSuccess extends WannaDiscountV2Result {
        private final boolean buttonEnabled;

        public PriceSuccess(boolean z11) {
            super(null);
            this.buttonEnabled = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PriceSuccess) && this.buttonEnabled == ((PriceSuccess) other).buttonEnabled;
        }

        public final boolean getButtonEnabled() {
            return this.buttonEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.buttonEnabled);
        }

        @NotNull
        public String toString() {
            return C2618u.g("PriceSuccess(buttonEnabled=", ")", this.buttonEnabled);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result$QuantityError;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuantityError extends WannaDiscountV2Result {

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuantityError(@NotNull String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof QuantityError) && Intrinsics.d(this.message, ((QuantityError) other).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("QuantityError(message=", this.message, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result$QuantitySuccess;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result;", "", "buttonEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getButtonEnabled", "()Z", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuantitySuccess extends WannaDiscountV2Result {
        private final boolean buttonEnabled;

        public QuantitySuccess(boolean z11) {
            super(null);
            this.buttonEnabled = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof QuantitySuccess) && this.buttonEnabled == ((QuantitySuccess) other).buttonEnabled;
        }

        public final boolean getButtonEnabled() {
            return this.buttonEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.buttonEnabled);
        }

        @NotNull
        public String toString() {
            return C2618u.g("QuantitySuccess(buttonEnabled=", ")", this.buttonEnabled);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result$SendDiscountError;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result;", "<init>", "()V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SendDiscountError extends WannaDiscountV2Result {

        @NotNull
        public static final SendDiscountError INSTANCE = new SendDiscountError();

        private SendDiscountError() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result$SendDiscountSuccess;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result;", "", "message", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result$SendDiscountSuccess$NotificationButton;", "notificationButton", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result$SendDiscountSuccess$NotificationButton;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result$SendDiscountSuccess$NotificationButton;", "getNotificationButton", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result$SendDiscountSuccess$NotificationButton;", "NotificationButton", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SendDiscountSuccess extends WannaDiscountV2Result {
        public static final int $stable = AtomAction.$stable;

        @NotNull
        private final String message;
        private final NotificationButton notificationButton;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result$SendDiscountSuccess$NotificationButton;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NotificationButton {
            public static final int $stable = AtomAction.$stable;

            @NotNull
            private final AtomAction action;

            @NotNull
            private final String title;

            public NotificationButton(@NotNull String title, @NotNull AtomAction action) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(action, "action");
                this.title = title;
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NotificationButton)) {
                    return false;
                }
                NotificationButton notificationButton = (NotificationButton) other;
                return Intrinsics.d(this.title, notificationButton.title) && Intrinsics.d(this.action, notificationButton.action);
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.action.hashCode() + (this.title.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "NotificationButton(title=" + this.title + ", action=" + this.action + ")";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendDiscountSuccess(@NotNull String message, NotificationButton notificationButton) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.notificationButton = notificationButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SendDiscountSuccess)) {
                return false;
            }
            SendDiscountSuccess sendDiscountSuccess = (SendDiscountSuccess) other;
            return Intrinsics.d(this.message, sendDiscountSuccess.message) && Intrinsics.d(this.notificationButton, sendDiscountSuccess.notificationButton);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public final NotificationButton getNotificationButton() {
            return this.notificationButton;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            NotificationButton notificationButton = this.notificationButton;
            return hashCode + (notificationButton == null ? 0 : notificationButton.hashCode());
        }

        @NotNull
        public String toString() {
            return "SendDiscountSuccess(message=" + this.message + ", notificationButton=" + this.notificationButton + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result$UpdateDiscount;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result;", "", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/vo/WannaDiscountV2VO$Discount;", "discounts", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDiscounts", "()Ljava/util/List;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateDiscount extends WannaDiscountV2Result {

        @NotNull
        private final List<WannaDiscountV2VO.Discount> discounts;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateDiscount(@NotNull List<WannaDiscountV2VO.Discount> discounts) {
            super(null);
            Intrinsics.checkNotNullParameter(discounts, "discounts");
            this.discounts = discounts;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateDiscount) && Intrinsics.d(this.discounts, ((UpdateDiscount) other).discounts);
        }

        @NotNull
        public final List<WannaDiscountV2VO.Discount> getDiscounts() {
            return this.discounts;
        }

        public int hashCode() {
            return this.discounts.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("UpdateDiscount(discounts=", ")", this.discounts);
        }
    }

    public /* synthetic */ WannaDiscountV2Result(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private WannaDiscountV2Result() {
    }
}
