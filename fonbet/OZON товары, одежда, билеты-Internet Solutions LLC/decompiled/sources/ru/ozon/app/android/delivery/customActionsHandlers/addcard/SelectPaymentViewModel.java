package ru.ozon.app.android.delivery.customActionsHandlers.addcard;

import B0.A0;
import V.e;
import We.M;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.api.CsmaErrorBody;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import xe.C10727i;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0002!\"B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00102\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel;", "Landroidx/lifecycle/w0;", "", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentRepository;", "repository", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentRepository;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "handleAddCardException", "(Ljava/lang/Exception;)V", "", "errorBody", "getErrorMessageSafety", "(Ljava/lang/String;)Ljava/lang/String;", "actionName", "", "body", "addCardCard", "(Ljava/lang/String;Ljava/util/Map;)V", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentRepository;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel$Action;", "singleAction", "Landroidx/lifecycle/V;", "getSingleAction", "()Landroidx/lifecycle/V;", "Companion", "Action", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SelectPaymentViewModel extends w0 {

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final SelectPaymentRepository repository;

    @NotNull
    private final V<Action> singleAction;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel$Action;", "", "<init>", "()V", "Loading", "Error", "Success", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel$Action$Error;", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel$Action$Loading;", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel$Action$Success;", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel$Action$Error;", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel$Action;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends Action {

            @NotNull
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull String message) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.d(this.message, ((Error) other).message);
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
                return A0.b("Error(message=", this.message, ")");
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel$Action$Loading;", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading extends Action {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return 664520717;
            }

            @NotNull
            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel$Action$Success;", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel$Action;", "", "deeplink", "successRefreshDeeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "getSuccessRefreshDeeplink", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends Action {

            @NotNull
            private final String deeplink;

            @NotNull
            private final String successRefreshDeeplink;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull String deeplink, @NotNull String successRefreshDeeplink) {
                super(null);
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                Intrinsics.checkNotNullParameter(successRefreshDeeplink, "successRefreshDeeplink");
                this.deeplink = deeplink;
                this.successRefreshDeeplink = successRefreshDeeplink;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.d(this.deeplink, success.deeplink) && Intrinsics.d(this.successRefreshDeeplink, success.successRefreshDeeplink);
            }

            @NotNull
            public final String getDeeplink() {
                return this.deeplink;
            }

            @NotNull
            public final String getSuccessRefreshDeeplink() {
                return this.successRefreshDeeplink;
            }

            public int hashCode() {
                return this.successRefreshDeeplink.hashCode() + (this.deeplink.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("Success(deeplink=", this.deeplink, ", successRefreshDeeplink=", this.successRefreshDeeplink, ")");
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    public SelectPaymentViewModel(@NotNull SelectPaymentRepository repository, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.repository = repository;
        this.jsonDeserializer = jsonDeserializer;
        this.singleAction = new V<>();
    }

    private final String getErrorMessageSafety(String errorBody) {
        try {
            return ((CsmaErrorBody) this.jsonDeserializer.fromJson(errorBody, CsmaErrorBody.class)).getError();
        } catch (Exception unused) {
            return StringProvider.getString(R$string.error_common_message_service_error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r1 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleAddCardException(Exception exception) {
        M errorBody;
        String str = null;
        if (!(exception instanceof HttpException)) {
            exception = null;
        }
        if (exception != null) {
            Response<?> response = ((HttpException) exception).response();
            if (response != null && (errorBody = response.errorBody()) != null) {
                str = getErrorMessageSafety(errorBody.string());
            }
        }
        str = StringProvider.getString(R$string.error_common_message_service_error);
        this.singleAction.setValue(new Action.Error(str));
    }

    public final void addCardCard(@NotNull String actionName, Map<String, String> body) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        this.singleAction.setValue(Action.Loading.INSTANCE);
        C10727i.c(x0.a(this), null, null, new SelectPaymentViewModel$addCardCard$1(this, actionName, body, null), 3);
    }

    @NotNull
    public final V<Action> getSingleAction() {
        return this.singleAction;
    }
}
