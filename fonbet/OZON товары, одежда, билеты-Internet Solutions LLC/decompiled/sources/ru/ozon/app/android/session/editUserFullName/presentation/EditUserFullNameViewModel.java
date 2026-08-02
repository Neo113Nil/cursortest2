package ru.ozon.app.android.session.editUserFullName.presentation;

import B0.A0;
import androidx.lifecycle.P;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0019J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModel;", "", "", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO$InputVO;", "inputs", "", "onDataReceived", "(Ljava/util/List;)V", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "text", "onTextChanged", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "onSubmitButtonClicked", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "Landroidx/lifecycle/P;", "", "getShowLoader", "()Landroidx/lifecycle/P;", "showLoader", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModel$Result;", "getResult", "result", "Result", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface EditUserFullNameViewModel {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModel$Result;", "", "<init>", "()V", "Success", "Failure", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModel$Result$Failure;", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModel$Result$Success;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Result {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModel$Result$Failure;", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModel$Result;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Failure extends Result {

            @NotNull
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(@NotNull String message) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Failure) && Intrinsics.d(this.message, ((Failure) other).message);
            }

            @NotNull
            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Failure(message=", this.message, ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModel$Result$Success;", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModel$Result;", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameResult;", "result", "<init>", "(Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameResult;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameResult;", "getResult", "()Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameResult;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends Result {

            @NotNull
            private final EditUserFullNameResult result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull EditUserFullNameResult result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.d(this.result, ((Success) other).result);
            }

            @NotNull
            public final EditUserFullNameResult getResult() {
                return this.result;
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(result=" + this.result + ")";
            }
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Result() {
        }
    }

    @NotNull
    P<Result> getResult();

    @NotNull
    P<Boolean> getShowLoader();

    void onDataReceived(@NotNull List<EditUserFullNameVO.InputVO> inputs);

    void onSubmitButtonClicked(@NotNull AtomAction.ComposerAction action);

    void onTextChanged(@NotNull String name, @NotNull String text);
}
