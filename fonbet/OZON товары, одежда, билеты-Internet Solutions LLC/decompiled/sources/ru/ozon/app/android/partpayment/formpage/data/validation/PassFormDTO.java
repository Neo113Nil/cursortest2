package ru.ozon.app.android.partpayment.formpage.data.validation;

import B90.C2618u;
import N3.C3660k;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/data/validation/PassFormDTO;", "", "deeplink", "", "message", "fields", "", "Lru/ozon/app/android/partpayment/formpage/data/validation/PassFormDTO$ErrorField;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDeeplink", "()Ljava/lang/String;", "getMessage", "getFields", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ErrorField", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PassFormDTO {
    private final String deeplink;
    private final List<ErrorField> fields;
    private final String message;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/data/validation/PassFormDTO$ErrorField;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorField {

        @NotNull
        private final String message;

        @NotNull
        private final String name;

        public ErrorField(@NotNull String name, @NotNull String message) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            this.name = name;
            this.message = message;
        }

        public static /* synthetic */ ErrorField copy$default(ErrorField errorField, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = errorField.name;
            }
            if ((i11 & 2) != 0) {
                str2 = errorField.message;
            }
            return errorField.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final ErrorField copy(@NotNull String name, @NotNull String message) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            return new ErrorField(name, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorField)) {
                return false;
            }
            ErrorField errorField = (ErrorField) other;
            return Intrinsics.d(this.name, errorField.name) && Intrinsics.d(this.message, errorField.message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.message.hashCode() + (this.name.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("ErrorField(name=", this.name, ", message=", this.message, ")");
        }
    }

    public PassFormDTO(String str, String str2, List<ErrorField> list) {
        this.deeplink = str;
        this.message = str2;
        this.fields = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PassFormDTO copy$default(PassFormDTO passFormDTO, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = passFormDTO.deeplink;
        }
        if ((i11 & 2) != 0) {
            str2 = passFormDTO.message;
        }
        if ((i11 & 4) != 0) {
            list = passFormDTO.fields;
        }
        return passFormDTO.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final List<ErrorField> component3() {
        return this.fields;
    }

    @NotNull
    public final PassFormDTO copy(String deeplink, String message, List<ErrorField> fields) {
        return new PassFormDTO(deeplink, message, fields);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassFormDTO)) {
            return false;
        }
        PassFormDTO passFormDTO = (PassFormDTO) other;
        return Intrinsics.d(this.deeplink, passFormDTO.deeplink) && Intrinsics.d(this.message, passFormDTO.message) && Intrinsics.d(this.fields, passFormDTO.fields);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final List<ErrorField> getFields() {
        return this.fields;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.deeplink;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ErrorField> list = this.fields;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.deeplink;
        String str2 = this.message;
        return C2618u.h(C3660k.d("PassFormDTO(deeplink=", str, ", message=", str2, ", fields="), this.fields, ")");
    }
}
