package ru.ozon.app.android.cart.domain.cartMode;

import B90.C2618u;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/domain/cartMode/CommonCartModeResponse;", "", "success", "Lru/ozon/app/android/cart/domain/cartMode/CommonCartModeResponse$Success;", "message", "", "<init>", "(Lru/ozon/app/android/cart/domain/cartMode/CommonCartModeResponse$Success;Ljava/lang/String;)V", "getSuccess", "()Lru/ozon/app/android/cart/domain/cartMode/CommonCartModeResponse$Success;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Success", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CommonCartModeResponse {
    private final String message;

    @NotNull
    private final Success success;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cart/domain/cartMode/CommonCartModeResponse$Success;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Z)V", "getValue", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success {
        private final boolean value;

        public Success(boolean z11) {
            this.value = z11;
        }

        public static /* synthetic */ Success copy$default(Success success, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = success.value;
            }
            return success.copy(z11);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getValue() {
            return this.value;
        }

        @NotNull
        public final Success copy(boolean value) {
            return new Success(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && this.value == ((Success) other).value;
        }

        public final boolean getValue() {
            return this.value;
        }

        public int hashCode() {
            return Boolean.hashCode(this.value);
        }

        @NotNull
        public String toString() {
            return C2618u.g("Success(value=", ")", this.value);
        }
    }

    public CommonCartModeResponse(@NotNull Success success, String str) {
        Intrinsics.checkNotNullParameter(success, "success");
        this.success = success;
        this.message = str;
    }

    public static /* synthetic */ CommonCartModeResponse copy$default(CommonCartModeResponse commonCartModeResponse, Success success, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            success = commonCartModeResponse.success;
        }
        if ((i11 & 2) != 0) {
            str = commonCartModeResponse.message;
        }
        return commonCartModeResponse.copy(success, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Success getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final CommonCartModeResponse copy(@NotNull Success success, String message) {
        Intrinsics.checkNotNullParameter(success, "success");
        return new CommonCartModeResponse(success, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonCartModeResponse)) {
            return false;
        }
        CommonCartModeResponse commonCartModeResponse = (CommonCartModeResponse) other;
        return Intrinsics.d(this.success, commonCartModeResponse.success) && Intrinsics.d(this.message, commonCartModeResponse.message);
    }

    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Success getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int hashCode = this.success.hashCode() * 31;
        String str = this.message;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "CommonCartModeResponse(success=" + this.success + ", message=" + this.message + ")";
    }
}
