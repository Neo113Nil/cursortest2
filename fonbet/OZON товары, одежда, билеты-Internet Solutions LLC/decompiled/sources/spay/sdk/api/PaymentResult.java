package spay.sdk.api;

import Lf.a;
import N3.C3660k;
import V.e;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lspay/sdk/api/PaymentResult;", "Landroid/os/Parcelable;", "()V", "Cancel", "Error", "Processing", "Success", "Lspay/sdk/api/PaymentResult$Cancel;", "Lspay/sdk/api/PaymentResult$Error;", "Lspay/sdk/api/PaymentResult$Processing;", "Lspay/sdk/api/PaymentResult$Success;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class PaymentResult implements Parcelable {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lspay/sdk/api/PaymentResult$Cancel;", "Lspay/sdk/api/PaymentResult;", "userId", "", "localSessionId", "(Ljava/lang/String;Ljava/lang/String;)V", "getLocalSessionId", "()Ljava/lang/String;", "getUserId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Cancel extends PaymentResult {

        @NotNull
        public static final Parcelable.Creator<Cancel> CREATOR = new Creator();

        @NotNull
        private final String localSessionId;

        @NotNull
        private final String userId;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Cancel> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Cancel createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cancel(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Cancel[] newArray(int i11) {
                return new Cancel[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cancel(@NotNull String userId, @NotNull String localSessionId) {
            super(null);
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(localSessionId, "localSessionId");
            this.userId = userId;
            this.localSessionId = localSessionId;
        }

        public static /* synthetic */ Cancel copy$default(Cancel cancel, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cancel.userId;
            }
            if ((i11 & 2) != 0) {
                str2 = cancel.localSessionId;
            }
            return cancel.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getLocalSessionId() {
            return this.localSessionId;
        }

        @NotNull
        public final Cancel copy(@NotNull String userId, @NotNull String localSessionId) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(localSessionId, "localSessionId");
            return new Cancel(userId, localSessionId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cancel)) {
                return false;
            }
            Cancel cancel = (Cancel) other;
            return Intrinsics.d(this.userId, cancel.userId) && Intrinsics.d(this.localSessionId, cancel.localSessionId);
        }

        @NotNull
        public final String getLocalSessionId() {
            return this.localSessionId;
        }

        @NotNull
        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.localSessionId.hashCode() + (this.userId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Cancel(userId=", this.userId, ", localSessionId=", this.localSessionId, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.userId);
            parcel.writeString(this.localSessionId);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001e"}, d2 = {"Lspay/sdk/api/PaymentResult$Error;", "Lspay/sdk/api/PaymentResult;", "userId", "", "localSessionId", "merchantError", "Lspay/sdk/api/MerchantError;", "(Ljava/lang/String;Ljava/lang/String;Lspay/sdk/api/MerchantError;)V", "getLocalSessionId", "()Ljava/lang/String;", "getMerchantError", "()Lspay/sdk/api/MerchantError;", "getUserId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Error extends PaymentResult {

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new Creator();

        @NotNull
        private final String localSessionId;
        private final MerchantError merchantError;

        @NotNull
        private final String userId;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Error createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Error(parcel.readString(), parcel.readString(), (MerchantError) parcel.readParcelable(Error.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Error[] newArray(int i11) {
                return new Error[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull String userId, @NotNull String localSessionId, MerchantError merchantError) {
            super(null);
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(localSessionId, "localSessionId");
            this.userId = userId;
            this.localSessionId = localSessionId;
            this.merchantError = merchantError;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, String str2, MerchantError merchantError, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = error.userId;
            }
            if ((i11 & 2) != 0) {
                str2 = error.localSessionId;
            }
            if ((i11 & 4) != 0) {
                merchantError = error.merchantError;
            }
            return error.copy(str, str2, merchantError);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getLocalSessionId() {
            return this.localSessionId;
        }

        /* renamed from: component3, reason: from getter */
        public final MerchantError getMerchantError() {
            return this.merchantError;
        }

        @NotNull
        public final Error copy(@NotNull String userId, @NotNull String localSessionId, MerchantError merchantError) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(localSessionId, "localSessionId");
            return new Error(userId, localSessionId, merchantError);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.d(this.userId, error.userId) && Intrinsics.d(this.localSessionId, error.localSessionId) && Intrinsics.d(this.merchantError, error.merchantError);
        }

        @NotNull
        public final String getLocalSessionId() {
            return this.localSessionId;
        }

        public final MerchantError getMerchantError() {
            return this.merchantError;
        }

        @NotNull
        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            int b02 = a.b0(this.userId.hashCode() * 31, this.localSessionId);
            MerchantError merchantError = this.merchantError;
            return b02 + (merchantError == null ? 0 : merchantError.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.userId;
            String str2 = this.localSessionId;
            MerchantError merchantError = this.merchantError;
            StringBuilder d11 = C3660k.d("Error(userId=", str, ", localSessionId=", str2, ", merchantError=");
            d11.append(merchantError);
            d11.append(")");
            return d11.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.userId);
            parcel.writeString(this.localSessionId);
            parcel.writeParcelable(this.merchantError, flags);
        }

        public /* synthetic */ Error(String str, String str2, MerchantError merchantError, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : merchantError);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lspay/sdk/api/PaymentResult$Processing;", "Lspay/sdk/api/PaymentResult;", "userId", "", "localSessionId", "(Ljava/lang/String;Ljava/lang/String;)V", "getLocalSessionId", "()Ljava/lang/String;", "getUserId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Processing extends PaymentResult {

        @NotNull
        public static final Parcelable.Creator<Processing> CREATOR = new Creator();

        @NotNull
        private final String localSessionId;

        @NotNull
        private final String userId;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Processing> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Processing createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Processing(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Processing[] newArray(int i11) {
                return new Processing[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Processing(@NotNull String userId, @NotNull String localSessionId) {
            super(null);
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(localSessionId, "localSessionId");
            this.userId = userId;
            this.localSessionId = localSessionId;
        }

        public static /* synthetic */ Processing copy$default(Processing processing, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = processing.userId;
            }
            if ((i11 & 2) != 0) {
                str2 = processing.localSessionId;
            }
            return processing.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getLocalSessionId() {
            return this.localSessionId;
        }

        @NotNull
        public final Processing copy(@NotNull String userId, @NotNull String localSessionId) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(localSessionId, "localSessionId");
            return new Processing(userId, localSessionId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Processing)) {
                return false;
            }
            Processing processing = (Processing) other;
            return Intrinsics.d(this.userId, processing.userId) && Intrinsics.d(this.localSessionId, processing.localSessionId);
        }

        @NotNull
        public final String getLocalSessionId() {
            return this.localSessionId;
        }

        @NotNull
        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.localSessionId.hashCode() + (this.userId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Processing(userId=", this.userId, ", localSessionId=", this.localSessionId, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.userId);
            parcel.writeString(this.localSessionId);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lspay/sdk/api/PaymentResult$Success;", "Lspay/sdk/api/PaymentResult;", "userId", "", "localSessionId", "(Ljava/lang/String;Ljava/lang/String;)V", "getLocalSessionId", "()Ljava/lang/String;", "getUserId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Success extends PaymentResult {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new Creator();

        @NotNull
        private final String localSessionId;

        @NotNull
        private final String userId;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Success createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Success[] newArray(int i11) {
                return new Success[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull String userId, @NotNull String localSessionId) {
            super(null);
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(localSessionId, "localSessionId");
            this.userId = userId;
            this.localSessionId = localSessionId;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = success.userId;
            }
            if ((i11 & 2) != 0) {
                str2 = success.localSessionId;
            }
            return success.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getLocalSessionId() {
            return this.localSessionId;
        }

        @NotNull
        public final Success copy(@NotNull String userId, @NotNull String localSessionId) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(localSessionId, "localSessionId");
            return new Success(userId, localSessionId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.d(this.userId, success.userId) && Intrinsics.d(this.localSessionId, success.localSessionId);
        }

        @NotNull
        public final String getLocalSessionId() {
            return this.localSessionId;
        }

        @NotNull
        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.localSessionId.hashCode() + (this.userId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Success(userId=", this.userId, ", localSessionId=", this.localSessionId, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.userId);
            parcel.writeString(this.localSessionId);
        }
    }

    public /* synthetic */ PaymentResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PaymentResult() {
    }
}
