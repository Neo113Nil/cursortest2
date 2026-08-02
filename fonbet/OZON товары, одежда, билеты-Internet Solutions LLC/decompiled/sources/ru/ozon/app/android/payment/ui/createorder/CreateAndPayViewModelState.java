package ru.ozon.app.android.payment.ui.createorder;

import W10.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.OrderDO;
import ru.ozon.app.android.payment.ui.createorder.highload.HighLoadProgressBar;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR$\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0019\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001c\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R,\u0010#\u001a\u00060\u001dj\u0002`\u001e2\n\u0010\u000e\u001a\u00060\u001dj\u0002`\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010)\u001a\u0004\u0018\u00010$2\b\u0010\u000e\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModelState;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "", "saveState", "(Landroid/os/Bundle;)V", "loadState", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModelState$Data;", "data", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModelState$Data;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative$NativePaymentInfo;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getLastGooglePayInfo", "()Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative$NativePaymentInfo;", "setLastGooglePayInfo", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative$NativePaymentInfo;)V", "lastGooglePayInfo", "", "getLastCancelLink", "()Ljava/lang/String;", "setLastCancelLink", "(Ljava/lang/String;)V", "lastCancelLink", "getLastActionName", "setLastActionName", "lastActionName", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "getLastTrackingData", "()LW10/c;", "setLastTrackingData", "(LW10/c;)V", "lastTrackingData", "Lru/ozon/app/android/payment/ui/createorder/highload/HighLoadProgressBar;", "getLastProgressBar", "()Lru/ozon/app/android/payment/ui/createorder/highload/HighLoadProgressBar;", "setLastProgressBar", "(Lru/ozon/app/android/payment/ui/createorder/highload/HighLoadProgressBar;)V", "lastProgressBar", "Data", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CreateAndPayViewModelState {

    @NotNull
    private Data data = new Data(null, null, null, null, null, 31, null);

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0083\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019JR\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u001a\u0010!\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u001dR\u001f\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModelState$Data;", "Landroid/os/Parcelable;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative$NativePaymentInfo;", "lastGooglePayInfo", "", "lastActionName", "lastCancelLink", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/app/android/payment/ui/createorder/highload/HighLoadProgressBar;", "progressBar", "<init>", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative$NativePaymentInfo;Ljava/lang/String;Ljava/lang/String;LW10/c;Lru/ozon/app/android/payment/ui/createorder/highload/HighLoadProgressBar;)V", "", "isEmpty", "()Z", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative$NativePaymentInfo;Ljava/lang/String;Ljava/lang/String;LW10/c;Lru/ozon/app/android/payment/ui/createorder/highload/HighLoadProgressBar;)Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModelState$Data;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative$NativePaymentInfo;", "getLastGooglePayInfo", "()Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative$NativePaymentInfo;", "Ljava/lang/String;", "getLastActionName", "getLastCancelLink", "LW10/c;", "getTrackingData", "()LW10/c;", "Lru/ozon/app/android/payment/ui/createorder/highload/HighLoadProgressBar;", "getProgressBar", "()Lru/ozon/app/android/payment/ui/createorder/highload/HighLoadProgressBar;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class Data implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Data> CREATOR = new Creator();
        private final String lastActionName;
        private final String lastCancelLink;
        private final OrderDO.PayByNative.NativePaymentInfo lastGooglePayInfo;
        private final HighLoadProgressBar progressBar;
        private final c trackingData;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            public final Data createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Data((OrderDO.PayByNative.NativePaymentInfo) parcel.readParcelable(Data.class.getClassLoader()), parcel.readString(), parcel.readString(), (c) parcel.readParcelable(Data.class.getClassLoader()), (HighLoadProgressBar) parcel.readParcelable(Data.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i11) {
                return new Data[i11];
            }
        }

        public Data() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ Data copy$default(Data data, OrderDO.PayByNative.NativePaymentInfo nativePaymentInfo, String str, String str2, c cVar, HighLoadProgressBar highLoadProgressBar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                nativePaymentInfo = data.lastGooglePayInfo;
            }
            if ((i11 & 2) != 0) {
                str = data.lastActionName;
            }
            if ((i11 & 4) != 0) {
                str2 = data.lastCancelLink;
            }
            if ((i11 & 8) != 0) {
                cVar = data.trackingData;
            }
            if ((i11 & 16) != 0) {
                highLoadProgressBar = data.progressBar;
            }
            HighLoadProgressBar highLoadProgressBar2 = highLoadProgressBar;
            String str3 = str2;
            return data.copy(nativePaymentInfo, str, str3, cVar, highLoadProgressBar2);
        }

        @NotNull
        public final Data copy(OrderDO.PayByNative.NativePaymentInfo lastGooglePayInfo, String lastActionName, String lastCancelLink, c trackingData, HighLoadProgressBar progressBar) {
            return new Data(lastGooglePayInfo, lastActionName, lastCancelLink, trackingData, progressBar);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.d(this.lastGooglePayInfo, data.lastGooglePayInfo) && Intrinsics.d(this.lastActionName, data.lastActionName) && Intrinsics.d(this.lastCancelLink, data.lastCancelLink) && Intrinsics.d(this.trackingData, data.trackingData) && Intrinsics.d(this.progressBar, data.progressBar);
        }

        public final String getLastActionName() {
            return this.lastActionName;
        }

        public final String getLastCancelLink() {
            return this.lastCancelLink;
        }

        public final OrderDO.PayByNative.NativePaymentInfo getLastGooglePayInfo() {
            return this.lastGooglePayInfo;
        }

        public final HighLoadProgressBar getProgressBar() {
            return this.progressBar;
        }

        public final c getTrackingData() {
            return this.trackingData;
        }

        public int hashCode() {
            OrderDO.PayByNative.NativePaymentInfo nativePaymentInfo = this.lastGooglePayInfo;
            int hashCode = (nativePaymentInfo == null ? 0 : nativePaymentInfo.hashCode()) * 31;
            String str = this.lastActionName;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.lastCancelLink;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            c cVar = this.trackingData;
            int hashCode4 = (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            HighLoadProgressBar highLoadProgressBar = this.progressBar;
            return hashCode4 + (highLoadProgressBar != null ? highLoadProgressBar.hashCode() : 0);
        }

        public final boolean isEmpty() {
            return this.lastGooglePayInfo == null && this.lastActionName == null && this.lastCancelLink == null && this.trackingData == null && this.progressBar == null;
        }

        @NotNull
        public String toString() {
            return "Data(lastGooglePayInfo=" + this.lastGooglePayInfo + ", lastActionName=" + this.lastActionName + ", lastCancelLink=" + this.lastCancelLink + ", trackingData=" + this.trackingData + ", progressBar=" + this.progressBar + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.lastGooglePayInfo, flags);
            dest.writeString(this.lastActionName);
            dest.writeString(this.lastCancelLink);
            dest.writeParcelable(this.trackingData, flags);
            dest.writeParcelable(this.progressBar, flags);
        }

        public Data(OrderDO.PayByNative.NativePaymentInfo nativePaymentInfo, String str, String str2, c cVar, HighLoadProgressBar highLoadProgressBar) {
            this.lastGooglePayInfo = nativePaymentInfo;
            this.lastActionName = str;
            this.lastCancelLink = str2;
            this.trackingData = cVar;
            this.progressBar = highLoadProgressBar;
        }

        public /* synthetic */ Data(OrderDO.PayByNative.NativePaymentInfo nativePaymentInfo, String str, String str2, c cVar, HighLoadProgressBar highLoadProgressBar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : nativePaymentInfo, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : cVar, (i11 & 16) != 0 ? null : highLoadProgressBar);
        }
    }

    public final String getLastActionName() {
        return this.data.getLastActionName();
    }

    public final String getLastCancelLink() {
        return this.data.getLastCancelLink();
    }

    @NotNull
    public final OrderDO.PayByNative.NativePaymentInfo getLastGooglePayInfo() {
        OrderDO.PayByNative.NativePaymentInfo lastGooglePayInfo = this.data.getLastGooglePayInfo();
        if (lastGooglePayInfo != null) {
            return lastGooglePayInfo;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final HighLoadProgressBar getLastProgressBar() {
        return this.data.getProgressBar();
    }

    @NotNull
    public final c getLastTrackingData() {
        c trackingData = this.data.getTrackingData();
        return trackingData == null ? new c(null, null, null) : trackingData;
    }

    public final void loadState(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Data data = (Data) bundle.getParcelable("ru.ozon.app.android.payment.createorder.CreateAndPayViewModelState");
        if (data != null) {
            this.data = data;
        }
    }

    public final void saveState(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (this.data.isEmpty()) {
            return;
        }
        bundle.putParcelable("ru.ozon.app.android.payment.createorder.CreateAndPayViewModelState", this.data);
    }

    public final void setLastActionName(String str) {
        this.data = Data.copy$default(this.data, null, str, null, null, null, 29, null);
    }

    public final void setLastCancelLink(String str) {
        this.data = Data.copy$default(this.data, null, null, str, null, null, 27, null);
    }

    public final void setLastGooglePayInfo(@NotNull OrderDO.PayByNative.NativePaymentInfo value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.data = Data.copy$default(this.data, value, null, null, null, null, 30, null);
    }

    public final void setLastProgressBar(HighLoadProgressBar highLoadProgressBar) {
        this.data = Data.copy$default(this.data, null, null, null, null, highLoadProgressBar, 15, null);
    }

    public final void setLastTrackingData(@NotNull c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.data = Data.copy$default(this.data, null, null, null, value, null, 23, null);
    }
}
