package ru.ozon.app.android.session.userAdultModalMobileV2.presentation;

import C.o0;
import G.g;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/BirthdateStateUi;", "", "<init>", "()V", "Loading", "ConfirmBirthdate", "Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/BirthdateStateUi$ConfirmBirthdate;", "Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/BirthdateStateUi$Loading;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BirthdateStateUi {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/BirthdateStateUi$ConfirmBirthdate;", "Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/BirthdateStateUi;", "", "birthdate", "birthDateRequestValue", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/BirthdateStateUi$ConfirmBirthdate;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBirthdate", "getBirthDateRequestValue", "getErrorMessage", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConfirmBirthdate extends BirthdateStateUi {

        @NotNull
        private final String birthDateRequestValue;

        @NotNull
        private final String birthdate;
        private final String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmBirthdate(@NotNull String birthdate, @NotNull String birthDateRequestValue, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(birthdate, "birthdate");
            Intrinsics.checkNotNullParameter(birthDateRequestValue, "birthDateRequestValue");
            this.birthdate = birthdate;
            this.birthDateRequestValue = birthDateRequestValue;
            this.errorMessage = str;
        }

        @NotNull
        public final ConfirmBirthdate copy(@NotNull String birthdate, @NotNull String birthDateRequestValue, String errorMessage) {
            Intrinsics.checkNotNullParameter(birthdate, "birthdate");
            Intrinsics.checkNotNullParameter(birthDateRequestValue, "birthDateRequestValue");
            return new ConfirmBirthdate(birthdate, birthDateRequestValue, errorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConfirmBirthdate)) {
                return false;
            }
            ConfirmBirthdate confirmBirthdate = (ConfirmBirthdate) other;
            return Intrinsics.d(this.birthdate, confirmBirthdate.birthdate) && Intrinsics.d(this.birthDateRequestValue, confirmBirthdate.birthDateRequestValue) && Intrinsics.d(this.errorMessage, confirmBirthdate.errorMessage);
        }

        @NotNull
        public final String getBirthDateRequestValue() {
            return this.birthDateRequestValue;
        }

        @NotNull
        public final String getBirthdate() {
            return this.birthdate;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            int a11 = g.a(this.birthdate.hashCode() * 31, 31, this.birthDateRequestValue);
            String str = this.errorMessage;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.birthdate;
            String str2 = this.birthDateRequestValue;
            return o0.c(C3660k.d("ConfirmBirthdate(birthdate=", str, ", birthDateRequestValue=", str2, ", errorMessage="), this.errorMessage, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/BirthdateStateUi$Loading;", "Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/BirthdateStateUi;", "<init>", "()V", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading extends BirthdateStateUi {

        @NotNull
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    public /* synthetic */ BirthdateStateUi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BirthdateStateUi() {
    }
}
