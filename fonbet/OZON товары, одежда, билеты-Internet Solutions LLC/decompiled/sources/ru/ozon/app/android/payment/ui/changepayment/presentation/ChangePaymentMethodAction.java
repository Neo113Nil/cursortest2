package ru.ozon.app.android.payment.ui.changepayment.presentation;

import W10.c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/payment/ui/changepayment/presentation/ChangePaymentMethodAction;", "Landroid/os/Parcelable;", "<init>", "()V", "Error", "Success", "SuccessAndRecalculate", "Lru/ozon/app/android/payment/ui/changepayment/presentation/ChangePaymentMethodAction$Error;", "Lru/ozon/app/android/payment/ui/changepayment/presentation/ChangePaymentMethodAction$Success;", "Lru/ozon/app/android/payment/ui/changepayment/presentation/ChangePaymentMethodAction$SuccessAndRecalculate;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ChangePaymentMethodAction implements Parcelable {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/payment/ui/changepayment/presentation/ChangePaymentMethodAction$Error;", "Lru/ozon/app/android/payment/ui/changepayment/presentation/ChangePaymentMethodAction;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends ChangePaymentMethodAction {

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new Creator();

        @NotNull
        private final String message;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Error(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i11) {
                return new Error[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.message);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/payment/ui/changepayment/presentation/ChangePaymentMethodAction$Success;", "Lru/ozon/app/android/payment/ui/changepayment/presentation/ChangePaymentMethodAction;", "message", "", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getDeeplink", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success extends ChangePaymentMethodAction {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        private final String deeplink;
        private final String message;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i11) {
                return new Success[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Success() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getMessage() {
            return this.message;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.message);
            dest.writeString(this.deeplink);
        }

        public Success(String str, String str2) {
            super(null);
            this.message = str;
            this.deeplink = str2;
        }

        public /* synthetic */ Success(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/payment/ui/changepayment/presentation/ChangePaymentMethodAction$SuccessAndRecalculate;", "Lru/ozon/app/android/payment/ui/changepayment/presentation/ChangePaymentMethodAction;", "", "link", "orderNumber", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "<init>", "(Ljava/lang/String;Ljava/lang/String;LW10/c;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getLink", "()Ljava/lang/String;", "getOrderNumber", "LW10/c;", "getTrackingData", "()LW10/c;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SuccessAndRecalculate extends ChangePaymentMethodAction {

        @NotNull
        public static final Parcelable.Creator<SuccessAndRecalculate> CREATOR = new Creator();

        @NotNull
        private final String link;

        @NotNull
        private final String orderNumber;

        @NotNull
        private final c trackingData;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SuccessAndRecalculate> {
            @Override // android.os.Parcelable.Creator
            public final SuccessAndRecalculate createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SuccessAndRecalculate(parcel.readString(), parcel.readString(), (c) parcel.readParcelable(SuccessAndRecalculate.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SuccessAndRecalculate[] newArray(int i11) {
                return new SuccessAndRecalculate[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuccessAndRecalculate(@NotNull String link, @NotNull String orderNumber, @NotNull c trackingData) {
            super(null);
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
            Intrinsics.checkNotNullParameter(trackingData, "trackingData");
            this.link = link;
            this.orderNumber = orderNumber;
            this.trackingData = trackingData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        @NotNull
        public final String getOrderNumber() {
            return this.orderNumber;
        }

        @NotNull
        public final c getTrackingData() {
            return this.trackingData;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.link);
            dest.writeString(this.orderNumber);
            dest.writeParcelable(this.trackingData, flags);
        }
    }

    public /* synthetic */ ChangePaymentMethodAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ChangePaymentMethodAction() {
    }
}
