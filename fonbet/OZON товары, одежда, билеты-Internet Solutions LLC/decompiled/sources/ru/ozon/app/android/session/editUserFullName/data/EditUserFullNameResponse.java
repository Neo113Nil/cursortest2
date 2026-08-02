package ru.ozon.app.android.session.editUserFullName.data;

import H3.c;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0019\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameResponse;", "", "fieldViolations", "", "Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameResponse$FieldViolation;", "<init>", "(Ljava/util/List;)V", "getFieldViolations", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "FieldViolation", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EditUserFullNameResponse {
    public static final int $stable = 8;
    private final List<FieldViolation> fieldViolations;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameResponse$FieldViolation;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FieldViolation {
        public static final int $stable = 0;

        @NotNull
        private final String message;

        @NotNull
        private final String name;

        public FieldViolation(@NotNull String name, @NotNull String message) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            this.name = name;
            this.message = message;
        }

        public static /* synthetic */ FieldViolation copy$default(FieldViolation fieldViolation, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = fieldViolation.name;
            }
            if ((i11 & 2) != 0) {
                str2 = fieldViolation.message;
            }
            return fieldViolation.copy(str, str2);
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
        public final FieldViolation copy(@NotNull String name, @NotNull String message) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            return new FieldViolation(name, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FieldViolation)) {
                return false;
            }
            FieldViolation fieldViolation = (FieldViolation) other;
            return Intrinsics.d(this.name, fieldViolation.name) && Intrinsics.d(this.message, fieldViolation.message);
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
            return e.a("FieldViolation(name=", this.name, ", message=", this.message, ")");
        }
    }

    public EditUserFullNameResponse(@i(name = "field_violations") List<FieldViolation> list) {
        this.fieldViolations = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditUserFullNameResponse copy$default(EditUserFullNameResponse editUserFullNameResponse, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = editUserFullNameResponse.fieldViolations;
        }
        return editUserFullNameResponse.copy(list);
    }

    public final List<FieldViolation> component1() {
        return this.fieldViolations;
    }

    @NotNull
    public final EditUserFullNameResponse copy(@i(name = "field_violations") List<FieldViolation> fieldViolations) {
        return new EditUserFullNameResponse(fieldViolations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EditUserFullNameResponse) && Intrinsics.d(this.fieldViolations, ((EditUserFullNameResponse) other).fieldViolations);
    }

    public final List<FieldViolation> getFieldViolations() {
        return this.fieldViolations;
    }

    public int hashCode() {
        List<FieldViolation> list = this.fieldViolations;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("EditUserFullNameResponse(fieldViolations=", ")", this.fieldViolations);
    }
}
