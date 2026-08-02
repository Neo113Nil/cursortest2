package ru.ozon.app.android.account.user.model.composer.patch;

import H3.c;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0019\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\f\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\nHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/account/user/model/composer/patch/PatchUserProfileResponse;", "", "fieldViolations", "", "Lru/ozon/app/android/account/user/model/composer/patch/PatchUserProfileResponse$ViolationField;", "<init>", "(Ljava/util/List;)V", "getFieldViolations", "()Ljava/util/List;", "getErrorMessage", "", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ViolationField", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PatchUserProfileResponse {
    private final List<ViolationField> fieldViolations;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/account/user/model/composer/patch/PatchUserProfileResponse$ViolationField;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViolationField {

        @NotNull
        private final String message;

        @NotNull
        private final String name;

        public ViolationField(@NotNull String name, @NotNull String message) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            this.name = name;
            this.message = message;
        }

        public static /* synthetic */ ViolationField copy$default(ViolationField violationField, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = violationField.name;
            }
            if ((i11 & 2) != 0) {
                str2 = violationField.message;
            }
            return violationField.copy(str, str2);
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
        public final ViolationField copy(@NotNull String name, @NotNull String message) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            return new ViolationField(name, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViolationField)) {
                return false;
            }
            ViolationField violationField = (ViolationField) other;
            return Intrinsics.d(this.name, violationField.name) && Intrinsics.d(this.message, violationField.message);
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
            return e.a("ViolationField(name=", this.name, ", message=", this.message, ")");
        }
    }

    public PatchUserProfileResponse(@i(name = "field_violations") List<ViolationField> list) {
        this.fieldViolations = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PatchUserProfileResponse copy$default(PatchUserProfileResponse patchUserProfileResponse, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = patchUserProfileResponse.fieldViolations;
        }
        return patchUserProfileResponse.copy(list);
    }

    public final List<ViolationField> component1() {
        return this.fieldViolations;
    }

    @NotNull
    public final PatchUserProfileResponse copy(@i(name = "field_violations") List<ViolationField> fieldViolations) {
        return new PatchUserProfileResponse(fieldViolations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PatchUserProfileResponse) && Intrinsics.d(this.fieldViolations, ((PatchUserProfileResponse) other).fieldViolations);
    }

    public final String getErrorMessage() {
        ViolationField violationField;
        List<ViolationField> list = this.fieldViolations;
        if (list == null || (violationField = (ViolationField) C7714v.M(list)) == null) {
            return null;
        }
        return violationField.getMessage();
    }

    public final List<ViolationField> getFieldViolations() {
        return this.fieldViolations;
    }

    public int hashCode() {
        List<ViolationField> list = this.fieldViolations;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("PatchUserProfileResponse(fieldViolations=", ")", this.fieldViolations);
    }
}
