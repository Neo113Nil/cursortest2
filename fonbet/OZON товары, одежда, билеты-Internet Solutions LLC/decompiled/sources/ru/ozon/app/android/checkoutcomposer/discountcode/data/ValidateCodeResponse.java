package ru.ozon.app.android.checkoutcomposer.discountcode.data;

import B0.A0;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/discountcode/data/ValidateCodeResponse;", "", "data", "Lru/ozon/app/android/checkoutcomposer/discountcode/data/ValidateCodeResponse$Data;", "error", "", "<init>", "(Lru/ozon/app/android/checkoutcomposer/discountcode/data/ValidateCodeResponse$Data;Ljava/lang/String;)V", "getData", "()Lru/ozon/app/android/checkoutcomposer/discountcode/data/ValidateCodeResponse$Data;", "getError", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Data", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ValidateCodeResponse {
    public static final int $stable = 0;
    private final Data data;
    private final String error;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/discountcode/data/ValidateCodeResponse$Data;", "", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Data {
        public static final int $stable = 0;
        private final String message;

        public Data(String str) {
            this.message = str;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = data.message;
            }
            return data.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final Data copy(String message) {
            return new Data(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.d(this.message, ((Data) other).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Data(message=", this.message, ")");
        }
    }

    public ValidateCodeResponse(Data data, String str) {
        this.data = data;
        this.error = str;
    }

    public static /* synthetic */ ValidateCodeResponse copy$default(ValidateCodeResponse validateCodeResponse, Data data, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            data = validateCodeResponse.data;
        }
        if ((i11 & 2) != 0) {
            str = validateCodeResponse.error;
        }
        return validateCodeResponse.copy(data, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final ValidateCodeResponse copy(Data data, String error) {
        return new ValidateCodeResponse(data, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidateCodeResponse)) {
            return false;
        }
        ValidateCodeResponse validateCodeResponse = (ValidateCodeResponse) other;
        return Intrinsics.d(this.data, validateCodeResponse.data) && Intrinsics.d(this.error, validateCodeResponse.error);
    }

    public final Data getData() {
        return this.data;
    }

    public final String getError() {
        return this.error;
    }

    public int hashCode() {
        Data data = this.data;
        int hashCode = (data == null ? 0 : data.hashCode()) * 31;
        String str = this.error;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ValidateCodeResponse(data=" + this.data + ", error=" + this.error + ")";
    }
}
