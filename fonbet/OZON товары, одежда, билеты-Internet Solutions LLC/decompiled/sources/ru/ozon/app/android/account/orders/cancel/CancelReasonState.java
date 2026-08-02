package ru.ozon.app.android.account.orders.cancel;

import C.C2702w;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/CancelReasonState;", "T", "", "<init>", "()V", "Success", "SuccessWithAcceptEPoints", "Loading", "Error", "Lru/ozon/app/android/account/orders/cancel/CancelReasonState$Error;", "Lru/ozon/app/android/account/orders/cancel/CancelReasonState$Loading;", "Lru/ozon/app/android/account/orders/cancel/CancelReasonState$Success;", "Lru/ozon/app/android/account/orders/cancel/CancelReasonState$SuccessWithAcceptEPoints;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class CancelReasonState<T> {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00018\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/CancelReasonState$Error;", "T", "Lru/ozon/app/android/account/orders/cancel/CancelReasonState;", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "errorState", "data", "<init>", "(Lru/ozon/app/android/uikit/screenstate/ScreenState;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "getErrorState", "()Lru/ozon/app/android/uikit/screenstate/ScreenState;", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error<T> extends CancelReasonState<T> {
        private final T data;

        @NotNull
        private final ScreenState errorState;

        public /* synthetic */ Error(ScreenState screenState, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(screenState, (i11 & 2) != 0 ? null : obj);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.d(this.errorState, error.errorState) && Intrinsics.d(this.data, error.data);
        }

        @NotNull
        public final ScreenState getErrorState() {
            return this.errorState;
        }

        public int hashCode() {
            int hashCode = this.errorState.hashCode() * 31;
            T t2 = this.data;
            return hashCode + (t2 == null ? 0 : t2.hashCode());
        }

        @NotNull
        public String toString() {
            return "Error(errorState=" + this.errorState + ", data=" + this.data + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull ScreenState errorState, T t2) {
            super(null);
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            this.errorState = errorState;
            this.data = t2;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00018\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/CancelReasonState$Loading;", "T", "Lru/ozon/app/android/account/orders/cancel/CancelReasonState;", "data", "", "isLoading", "<init>", "(Ljava/lang/Object;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "Z", "()Z", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loading<T> extends CancelReasonState<T> {
        private final T data;
        private final boolean isLoading;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Loading() {
            this(r2, false, 3, r2);
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) other;
            return Intrinsics.d(this.data, loading.data) && this.isLoading == loading.isLoading;
        }

        public int hashCode() {
            T t2 = this.data;
            return Boolean.hashCode(this.isLoading) + ((t2 == null ? 0 : t2.hashCode()) * 31);
        }

        /* renamed from: isLoading, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        @NotNull
        public String toString() {
            return "Loading(data=" + this.data + ", isLoading=" + this.isLoading + ")";
        }

        public /* synthetic */ Loading(Object obj, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : obj, (i11 & 2) != 0 ? false : z11);
        }

        public Loading(T t2, boolean z11) {
            super(null);
            this.data = t2;
            this.isLoading = z11;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00018\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/CancelReasonState$Success;", "T", "Lru/ozon/app/android/account/orders/cancel/CancelReasonState;", "data", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success<T> extends CancelReasonState<T> {
        private final T data;

        public Success(T t2) {
            super(null);
            this.data = t2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.d(this.data, ((Success) other).data);
        }

        public T getData() {
            return this.data;
        }

        public int hashCode() {
            T t2 = this.data;
            if (t2 == null) {
                return 0;
            }
            return t2.hashCode();
        }

        @NotNull
        public String toString() {
            return C2702w.c(this.data, "Success(data=", ")");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00018\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/CancelReasonState$SuccessWithAcceptEPoints;", "T", "Lru/ozon/app/android/account/orders/cancel/CancelReasonState;", "data", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationData", "<init>", "(Ljava/lang/Object;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotificationData", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuccessWithAcceptEPoints<T> extends CancelReasonState<T> {
        public static final int $stable = NotificationDTO.$stable;
        private final T data;
        private final NotificationDTO notificationData;

        public SuccessWithAcceptEPoints(T t2, NotificationDTO notificationDTO) {
            super(null);
            this.data = t2;
            this.notificationData = notificationDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuccessWithAcceptEPoints)) {
                return false;
            }
            SuccessWithAcceptEPoints successWithAcceptEPoints = (SuccessWithAcceptEPoints) other;
            return Intrinsics.d(this.data, successWithAcceptEPoints.data) && Intrinsics.d(this.notificationData, successWithAcceptEPoints.notificationData);
        }

        public T getData() {
            return this.data;
        }

        public final NotificationDTO getNotificationData() {
            return this.notificationData;
        }

        public int hashCode() {
            T t2 = this.data;
            int hashCode = (t2 == null ? 0 : t2.hashCode()) * 31;
            NotificationDTO notificationDTO = this.notificationData;
            return hashCode + (notificationDTO != null ? notificationDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SuccessWithAcceptEPoints(data=" + this.data + ", notificationData=" + this.notificationData + ")";
        }
    }

    public /* synthetic */ CancelReasonState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CancelReasonState() {
    }
}
