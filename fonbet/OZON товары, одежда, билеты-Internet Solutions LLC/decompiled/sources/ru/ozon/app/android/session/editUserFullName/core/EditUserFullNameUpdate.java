package ru.ozon.app.android.session.editUserFullName.core;

import A00.a;
import H3.c;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameResult;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/core/EditUserFullNameUpdate;", "LA00/a$J$a;", "<init>", "()V", "TextChange", "Error", "Lru/ozon/app/android/session/editUserFullName/core/EditUserFullNameUpdate$Error;", "Lru/ozon/app/android/session/editUserFullName/core/EditUserFullNameUpdate$TextChange;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class EditUserFullNameUpdate implements a.J.InterfaceC0007a {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/core/EditUserFullNameUpdate$Error;", "Lru/ozon/app/android/session/editUserFullName/core/EditUserFullNameUpdate;", "", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameResult$Failure$Field;", "fieldsWithErrors", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFieldsWithErrors", "()Ljava/util/List;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends EditUserFullNameUpdate {

        @NotNull
        private final List<EditUserFullNameResult.Failure.Field> fieldsWithErrors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull List<EditUserFullNameResult.Failure.Field> fieldsWithErrors) {
            super(null);
            Intrinsics.checkNotNullParameter(fieldsWithErrors, "fieldsWithErrors");
            this.fieldsWithErrors = fieldsWithErrors;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.d(this.fieldsWithErrors, ((Error) other).fieldsWithErrors);
        }

        @NotNull
        public final List<EditUserFullNameResult.Failure.Field> getFieldsWithErrors() {
            return this.fieldsWithErrors;
        }

        public int hashCode() {
            return this.fieldsWithErrors.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("Error(fieldsWithErrors=", ")", this.fieldsWithErrors);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/core/EditUserFullNameUpdate$TextChange;", "Lru/ozon/app/android/session/editUserFullName/core/EditUserFullNameUpdate;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getText", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextChange extends EditUserFullNameUpdate {

        @NotNull
        private final String name;

        @NotNull
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextChange(@NotNull String name, @NotNull String text) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(text, "text");
            this.name = name;
            this.text = text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextChange)) {
                return false;
            }
            TextChange textChange = (TextChange) other;
            return Intrinsics.d(this.name, textChange.name) && Intrinsics.d(this.text, textChange.text);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.name.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("TextChange(name=", this.name, ", text=", this.text, ")");
        }
    }

    public /* synthetic */ EditUserFullNameUpdate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private EditUserFullNameUpdate() {
    }
}
