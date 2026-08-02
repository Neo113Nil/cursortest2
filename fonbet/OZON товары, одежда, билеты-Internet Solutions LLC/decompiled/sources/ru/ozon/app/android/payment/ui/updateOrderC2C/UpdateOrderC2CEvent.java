package ru.ozon.app.android.payment.ui.updateOrderC2C;

import B0.A0;
import D40.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.payment.ui.updateOrderC2C.UpdateOrderDO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent;", "", "<init>", "()V", "ShowLoader", "HideLoader", "Redirect", "Error", "CriticalError", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent$CriticalError;", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent$Error;", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent$HideLoader;", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent$Redirect;", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent$ShowLoader;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class UpdateOrderC2CEvent {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent$CriticalError;", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CriticalError extends UpdateOrderC2CEvent {

        @NotNull
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CriticalError(@NotNull Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CriticalError) && Intrinsics.d(this.throwable, ((CriticalError) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        @NotNull
        public String toString() {
            return a.c("CriticalError(throwable=", ")", this.throwable);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent$Error;", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent;", "", "widgetId", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDO$UpdateOrderError;", "error", "<init>", "(Ljava/lang/Long;Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDO$UpdateOrderError;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getWidgetId", "()Ljava/lang/Long;", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDO$UpdateOrderError;", "getError", "()Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDO$UpdateOrderError;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends UpdateOrderC2CEvent {

        @NotNull
        private final UpdateOrderDO.UpdateOrderError error;
        private final Long widgetId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Long l11, @NotNull UpdateOrderDO.UpdateOrderError error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.widgetId = l11;
            this.error = error;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.d(this.widgetId, error.widgetId) && Intrinsics.d(this.error, error.error);
        }

        @NotNull
        public final UpdateOrderDO.UpdateOrderError getError() {
            return this.error;
        }

        public final Long getWidgetId() {
            return this.widgetId;
        }

        public int hashCode() {
            Long l11 = this.widgetId;
            return this.error.hashCode() + ((l11 == null ? 0 : l11.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "Error(widgetId=" + this.widgetId + ", error=" + this.error + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent$HideLoader;", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HideLoader extends UpdateOrderC2CEvent {

        @NotNull
        public static final HideLoader INSTANCE = new HideLoader();

        private HideLoader() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof HideLoader);
        }

        public int hashCode() {
            return -1235300790;
        }

        @NotNull
        public String toString() {
            return "HideLoader";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent$Redirect;", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent;", "", "redirectLink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRedirectLink", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Redirect extends UpdateOrderC2CEvent {

        @NotNull
        private final String redirectLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Redirect(@NotNull String redirectLink) {
            super(null);
            Intrinsics.checkNotNullParameter(redirectLink, "redirectLink");
            this.redirectLink = redirectLink;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Redirect) && Intrinsics.d(this.redirectLink, ((Redirect) other).redirectLink);
        }

        @NotNull
        public final String getRedirectLink() {
            return this.redirectLink;
        }

        public int hashCode() {
            return this.redirectLink.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Redirect(redirectLink=", this.redirectLink, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent$ShowLoader;", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowLoader extends UpdateOrderC2CEvent {

        @NotNull
        public static final ShowLoader INSTANCE = new ShowLoader();

        private ShowLoader() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowLoader);
        }

        public int hashCode() {
            return -803253307;
        }

        @NotNull
        public String toString() {
            return "ShowLoader";
        }
    }

    public /* synthetic */ UpdateOrderC2CEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UpdateOrderC2CEvent() {
    }
}
