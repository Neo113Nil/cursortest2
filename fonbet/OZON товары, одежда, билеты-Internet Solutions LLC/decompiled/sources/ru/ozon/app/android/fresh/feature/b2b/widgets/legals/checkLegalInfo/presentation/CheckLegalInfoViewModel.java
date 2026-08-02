package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.presentation;

import B0.A0;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.LegalsResultStateHolder;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.AddLegalRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.AddLegalResponse;
import xe.C10727i;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001c\u001d\u001eB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/LegalsResultStateHolder;", "legalsResultStateHolder", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalRepository;", "repository", "<init>", "(Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/LegalsResultStateHolder;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalRepository;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalResponse;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$LoginResult;", "toResult", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalResponse;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$LoginResult;", "", "action", "postData", "", "addLegal", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/LegalsResultStateHolder;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalRepository;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$State;", "_state", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/P;", "getState", "()Landroidx/lifecycle/P;", "state", "Companion", "State", "LoginResult", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckLegalInfoViewModel extends w0 {

    @NotNull
    private final V<State> _state;

    @NotNull
    private final LegalsResultStateHolder legalsResultStateHolder;

    @NotNull
    private final AddLegalRepository repository;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$LoginResult;", "", "<init>", "()V", "Success", "Error", "ErrorWithMessage", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$LoginResult$Error;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$LoginResult$ErrorWithMessage;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$LoginResult$Success;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class LoginResult {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$LoginResult$Error;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$LoginResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends LoginResult {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return 820578454;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$LoginResult$ErrorWithMessage;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$LoginResult;", "", "msg", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMsg", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ErrorWithMessage extends LoginResult {

            @NotNull
            private final String msg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorWithMessage(@NotNull String msg) {
                super(null);
                Intrinsics.checkNotNullParameter(msg, "msg");
                this.msg = msg;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ErrorWithMessage) && Intrinsics.d(this.msg, ((ErrorWithMessage) other).msg);
            }

            @NotNull
            public final String getMsg() {
                return this.msg;
            }

            public int hashCode() {
                return this.msg.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("ErrorWithMessage(msg=", this.msg, ")");
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$LoginResult$Success;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$LoginResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends LoginResult {

            @NotNull
            public static final Success INSTANCE = new Success();

            private Success() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Success);
            }

            public int hashCode() {
                return -2086270191;
            }

            @NotNull
            public String toString() {
                return "Success";
            }
        }

        public /* synthetic */ LoginResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private LoginResult() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$State;", "", "Success", "KppError", "KppErrorWithMessage", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$State$KppError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$State$KppErrorWithMessage;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$State$Success;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$State$KppError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class KppError implements State {

            @NotNull
            public static final KppError INSTANCE = new KppError();

            private KppError() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof KppError);
            }

            public int hashCode() {
                return 656013316;
            }

            @NotNull
            public String toString() {
                return "KppError";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$State$KppErrorWithMessage;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$State;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class KppErrorWithMessage implements State {

            @NotNull
            private final String message;

            public KppErrorWithMessage(@NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof KppErrorWithMessage) && Intrinsics.d(this.message, ((KppErrorWithMessage) other).message);
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
                return A0.b("KppErrorWithMessage(message=", this.message, ")");
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$State$Success;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success implements State {

            @NotNull
            public static final Success INSTANCE = new Success();

            private Success() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Success);
            }

            public int hashCode() {
                return 602940476;
            }

            @NotNull
            public String toString() {
                return "Success";
            }
        }
    }

    public CheckLegalInfoViewModel(@NotNull LegalsResultStateHolder legalsResultStateHolder, @NotNull AddLegalRepository repository) {
        Intrinsics.checkNotNullParameter(legalsResultStateHolder, "legalsResultStateHolder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.legalsResultStateHolder = legalsResultStateHolder;
        this.repository = repository;
        this._state = new V<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoginResult toResult(AddLegalResponse addLegalResponse) {
        String str;
        if (addLegalResponse.isSuccess()) {
            return LoginResult.Success.INSTANCE;
        }
        Map<String, String> errors = addLegalResponse.getErrors();
        return (errors == null || (str = errors.get("kpp")) == null) ? LoginResult.Error.INSTANCE : new LoginResult.ErrorWithMessage(str);
    }

    public final void addLegal(@NotNull String action, @NotNull String postData) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(postData, "postData");
        C10727i.c(x0.a(this), null, null, new CheckLegalInfoViewModel$addLegal$1(this, action, postData, null), 3);
    }

    @NotNull
    public final P<State> getState() {
        return this._state;
    }
}
