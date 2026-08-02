package spay.sdk.api;

import B0.A0;
import Sc.InterfaceC3999a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0013\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\n\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lspay/sdk/api/MerchantError;", "Landroid/os/Parcelable;", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "InnerSdkComponentsError", "IsReadyCheckHasNotBeenCalled", "NoInternetConnection", "PayWithBindingError", "PayWithBonusesError", "RequiredDataNotSent", "SPayApiError", "SdkClosedByUser", "TimeoutException", "UnexpectedError", "Lspay/sdk/api/MerchantError$InnerSdkComponentsError;", "Lspay/sdk/api/MerchantError$IsReadyCheckHasNotBeenCalled;", "Lspay/sdk/api/MerchantError$NoInternetConnection;", "Lspay/sdk/api/MerchantError$PayWithBindingError;", "Lspay/sdk/api/MerchantError$PayWithBonusesError;", "Lspay/sdk/api/MerchantError$RequiredDataNotSent;", "Lspay/sdk/api/MerchantError$SPayApiError;", "Lspay/sdk/api/MerchantError$SdkClosedByUser;", "Lspay/sdk/api/MerchantError$TimeoutException;", "Lspay/sdk/api/MerchantError$UnexpectedError;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class MerchantError implements Parcelable {
    private final String description;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lspay/sdk/api/MerchantError$InnerSdkComponentsError;", "Lspay/sdk/api/MerchantError;", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class InnerSdkComponentsError extends MerchantError {

        @NotNull
        public static final Parcelable.Creator<InnerSdkComponentsError> CREATOR = new Creator();

        @NotNull
        private final String description;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InnerSdkComponentsError> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final InnerSdkComponentsError createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InnerSdkComponentsError(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final InnerSdkComponentsError[] newArray(int i11) {
                return new InnerSdkComponentsError[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InnerSdkComponentsError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ InnerSdkComponentsError copy$default(InnerSdkComponentsError innerSdkComponentsError, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = innerSdkComponentsError.getDescription();
            }
            return innerSdkComponentsError.copy(str);
        }

        @NotNull
        public final String component1() {
            return getDescription();
        }

        @NotNull
        public final InnerSdkComponentsError copy(@NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new InnerSdkComponentsError(description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InnerSdkComponentsError) && Intrinsics.d(getDescription(), ((InnerSdkComponentsError) other).getDescription());
        }

        @Override // spay.sdk.api.MerchantError
        @NotNull
        public String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return getDescription().hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("InnerSdkComponentsError(description=", getDescription(), ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.description);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InnerSdkComponentsError(@NotNull String description) {
            super(description, null);
            Intrinsics.checkNotNullParameter(description, "description");
            this.description = description;
        }

        public /* synthetic */ InnerSdkComponentsError(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "Ошибка внутренних компонентов SPaySdk" : str);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lspay/sdk/api/MerchantError$IsReadyCheckHasNotBeenCalled;", "Lspay/sdk/api/MerchantError;", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class IsReadyCheckHasNotBeenCalled extends MerchantError {

        @NotNull
        public static final Parcelable.Creator<IsReadyCheckHasNotBeenCalled> CREATOR = new Creator();

        @NotNull
        private final String description;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IsReadyCheckHasNotBeenCalled> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IsReadyCheckHasNotBeenCalled createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IsReadyCheckHasNotBeenCalled(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IsReadyCheckHasNotBeenCalled[] newArray(int i11) {
                return new IsReadyCheckHasNotBeenCalled[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IsReadyCheckHasNotBeenCalled() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ IsReadyCheckHasNotBeenCalled copy$default(IsReadyCheckHasNotBeenCalled isReadyCheckHasNotBeenCalled, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = isReadyCheckHasNotBeenCalled.getDescription();
            }
            return isReadyCheckHasNotBeenCalled.copy(str);
        }

        @NotNull
        public final String component1() {
            return getDescription();
        }

        @NotNull
        public final IsReadyCheckHasNotBeenCalled copy(@NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new IsReadyCheckHasNotBeenCalled(description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IsReadyCheckHasNotBeenCalled) && Intrinsics.d(getDescription(), ((IsReadyCheckHasNotBeenCalled) other).getDescription());
        }

        @Override // spay.sdk.api.MerchantError
        @NotNull
        public String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return getDescription().hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("IsReadyCheckHasNotBeenCalled(description=", getDescription(), ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.description);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IsReadyCheckHasNotBeenCalled(@NotNull String description) {
            super(description, null);
            Intrinsics.checkNotNullParameter(description, "description");
            this.description = description;
        }

        public /* synthetic */ IsReadyCheckHasNotBeenCalled(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "Перед проведением оплаты необходимо вызвать метод isReadyForSPaySdk()" : str);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lspay/sdk/api/MerchantError$NoInternetConnection;", "Lspay/sdk/api/MerchantError;", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class NoInternetConnection extends MerchantError {

        @NotNull
        public static final Parcelable.Creator<NoInternetConnection> CREATOR = new Creator();

        @NotNull
        private final String description;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NoInternetConnection> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final NoInternetConnection createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NoInternetConnection(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final NoInternetConnection[] newArray(int i11) {
                return new NoInternetConnection[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NoInternetConnection() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NoInternetConnection copy$default(NoInternetConnection noInternetConnection, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = noInternetConnection.getDescription();
            }
            return noInternetConnection.copy(str);
        }

        @NotNull
        public final String component1() {
            return getDescription();
        }

        @NotNull
        public final NoInternetConnection copy(@NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new NoInternetConnection(description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NoInternetConnection) && Intrinsics.d(getDescription(), ((NoInternetConnection) other).getDescription());
        }

        @Override // spay.sdk.api.MerchantError
        @NotNull
        public String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return getDescription().hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("NoInternetConnection(description=", getDescription(), ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.description);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoInternetConnection(@NotNull String description) {
            super(description, null);
            Intrinsics.checkNotNullParameter(description, "description");
            this.description = description;
        }

        public /* synthetic */ NoInternetConnection(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "Отсутствует подключение к интернету" : str);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lspay/sdk/api/MerchantError$PayWithBindingError;", "Lspay/sdk/api/MerchantError;", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PayWithBindingError extends MerchantError {

        @NotNull
        public static final Parcelable.Creator<PayWithBindingError> CREATOR = new Creator();

        @NotNull
        private final String description;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PayWithBindingError> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final PayWithBindingError createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PayWithBindingError(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final PayWithBindingError[] newArray(int i11) {
                return new PayWithBindingError[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PayWithBindingError(@NotNull String description) {
            super(description, null);
            Intrinsics.checkNotNullParameter(description, "description");
            this.description = description;
        }

        public static /* synthetic */ PayWithBindingError copy$default(PayWithBindingError payWithBindingError, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = payWithBindingError.getDescription();
            }
            return payWithBindingError.copy(str);
        }

        @NotNull
        public final String component1() {
            return getDescription();
        }

        @NotNull
        public final PayWithBindingError copy(@NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new PayWithBindingError(description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PayWithBindingError) && Intrinsics.d(getDescription(), ((PayWithBindingError) other).getDescription());
        }

        @Override // spay.sdk.api.MerchantError
        @NotNull
        public String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return getDescription().hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("PayWithBindingError(description=", getDescription(), ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.description);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lspay/sdk/api/MerchantError$PayWithBonusesError;", "Lspay/sdk/api/MerchantError;", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PayWithBonusesError extends MerchantError {

        @NotNull
        public static final Parcelable.Creator<PayWithBonusesError> CREATOR = new Creator();

        @NotNull
        private final String description;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PayWithBonusesError> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final PayWithBonusesError createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PayWithBonusesError(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final PayWithBonusesError[] newArray(int i11) {
                return new PayWithBonusesError[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PayWithBonusesError(@NotNull String description) {
            super(description, null);
            Intrinsics.checkNotNullParameter(description, "description");
            this.description = description;
        }

        public static /* synthetic */ PayWithBonusesError copy$default(PayWithBonusesError payWithBonusesError, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = payWithBonusesError.getDescription();
            }
            return payWithBonusesError.copy(str);
        }

        @NotNull
        public final String component1() {
            return getDescription();
        }

        @NotNull
        public final PayWithBonusesError copy(@NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new PayWithBonusesError(description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PayWithBonusesError) && Intrinsics.d(getDescription(), ((PayWithBonusesError) other).getDescription());
        }

        @Override // spay.sdk.api.MerchantError
        @NotNull
        public String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return getDescription().hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("PayWithBonusesError(description=", getDescription(), ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.description);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lspay/sdk/api/MerchantError$RequiredDataNotSent;", "Lspay/sdk/api/MerchantError;", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RequiredDataNotSent extends MerchantError {

        @NotNull
        public static final Parcelable.Creator<RequiredDataNotSent> CREATOR = new Creator();

        @NotNull
        private final String description;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RequiredDataNotSent> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final RequiredDataNotSent createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RequiredDataNotSent(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final RequiredDataNotSent[] newArray(int i11) {
                return new RequiredDataNotSent[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequiredDataNotSent(@NotNull String description) {
            super(description, null);
            Intrinsics.checkNotNullParameter(description, "description");
            this.description = description;
        }

        public static /* synthetic */ RequiredDataNotSent copy$default(RequiredDataNotSent requiredDataNotSent, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = requiredDataNotSent.getDescription();
            }
            return requiredDataNotSent.copy(str);
        }

        @NotNull
        public final String component1() {
            return getDescription();
        }

        @NotNull
        public final RequiredDataNotSent copy(@NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new RequiredDataNotSent(description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RequiredDataNotSent) && Intrinsics.d(getDescription(), ((RequiredDataNotSent) other).getDescription());
        }

        @Override // spay.sdk.api.MerchantError
        @NotNull
        public String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return getDescription().hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("RequiredDataNotSent(description=", getDescription(), ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.description);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lspay/sdk/api/MerchantError$SPayApiError;", "Lspay/sdk/api/MerchantError;", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SPayApiError extends MerchantError {

        @NotNull
        public static final Parcelable.Creator<SPayApiError> CREATOR = new Creator();

        @NotNull
        private final String description;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SPayApiError> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SPayApiError createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SPayApiError(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SPayApiError[] newArray(int i11) {
                return new SPayApiError[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SPayApiError(@NotNull String description) {
            super(description, null);
            Intrinsics.checkNotNullParameter(description, "description");
            this.description = description;
        }

        public static /* synthetic */ SPayApiError copy$default(SPayApiError sPayApiError, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = sPayApiError.getDescription();
            }
            return sPayApiError.copy(str);
        }

        @NotNull
        public final String component1() {
            return getDescription();
        }

        @NotNull
        public final SPayApiError copy(@NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new SPayApiError(description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SPayApiError) && Intrinsics.d(getDescription(), ((SPayApiError) other).getDescription());
        }

        @Override // spay.sdk.api.MerchantError
        @NotNull
        public String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return getDescription().hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("SPayApiError(description=", getDescription(), ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.description);
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lspay/sdk/api/MerchantError$SdkClosedByUser;", "Lspay/sdk/api/MerchantError;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SdkClosedByUser extends MerchantError {

        @NotNull
        public static final SdkClosedByUser INSTANCE = new SdkClosedByUser();

        @NotNull
        public static final Parcelable.Creator<SdkClosedByUser> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SdkClosedByUser> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SdkClosedByUser createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SdkClosedByUser.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SdkClosedByUser[] newArray(int i11) {
                return new SdkClosedByUser[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private SdkClosedByUser() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lspay/sdk/api/MerchantError$TimeoutException;", "Lspay/sdk/api/MerchantError;", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TimeoutException extends MerchantError {

        @NotNull
        public static final Parcelable.Creator<TimeoutException> CREATOR = new Creator();

        @NotNull
        private final String description;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TimeoutException> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final TimeoutException createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TimeoutException(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final TimeoutException[] newArray(int i11) {
                return new TimeoutException[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TimeoutException(@NotNull String description) {
            super(description, null);
            Intrinsics.checkNotNullParameter(description, "description");
            this.description = description;
        }

        public static /* synthetic */ TimeoutException copy$default(TimeoutException timeoutException, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = timeoutException.getDescription();
            }
            return timeoutException.copy(str);
        }

        @NotNull
        public final String component1() {
            return getDescription();
        }

        @NotNull
        public final TimeoutException copy(@NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new TimeoutException(description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TimeoutException) && Intrinsics.d(getDescription(), ((TimeoutException) other).getDescription());
        }

        @Override // spay.sdk.api.MerchantError
        @NotNull
        public String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return getDescription().hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("TimeoutException(description=", getDescription(), ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.description);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lspay/sdk/api/MerchantError$UnexpectedError;", "Lspay/sdk/api/MerchantError;", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class UnexpectedError extends MerchantError {

        @NotNull
        public static final Parcelable.Creator<UnexpectedError> CREATOR = new Creator();

        @NotNull
        private final String description;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UnexpectedError> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final UnexpectedError createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnexpectedError(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final UnexpectedError[] newArray(int i11) {
                return new UnexpectedError[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnexpectedError(@NotNull String description) {
            super(description, null);
            Intrinsics.checkNotNullParameter(description, "description");
            this.description = description;
        }

        public static /* synthetic */ UnexpectedError copy$default(UnexpectedError unexpectedError, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = unexpectedError.getDescription();
            }
            return unexpectedError.copy(str);
        }

        @NotNull
        public final String component1() {
            return getDescription();
        }

        @NotNull
        public final UnexpectedError copy(@NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new UnexpectedError(description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnexpectedError) && Intrinsics.d(getDescription(), ((UnexpectedError) other).getDescription());
        }

        @Override // spay.sdk.api.MerchantError
        @NotNull
        public String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return getDescription().hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("UnexpectedError(description=", getDescription(), ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.description);
        }
    }

    public /* synthetic */ MerchantError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String getDescription() {
        return this.description;
    }

    private MerchantError(String str) {
        this.description = str;
    }

    public /* synthetic */ MerchantError(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, null);
    }
}
