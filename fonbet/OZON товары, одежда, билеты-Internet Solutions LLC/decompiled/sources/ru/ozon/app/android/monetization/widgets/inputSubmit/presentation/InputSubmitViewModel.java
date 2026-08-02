package ru.ozon.app.android.monetization.widgets.inputSubmit.presentation;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import B0.A0;
import B90.C2618u;
import Tc.d;
import Tc.j;
import Xc.a;
import Xc.b;
import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.monetization.widgets.inputSubmit.data.InputSubmitResponse;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 +2\u00020\u0001:\u0003+,-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\fJ\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001f\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001f\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u001a8\u0006¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\u001e¨\u0006."}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "uploadKey", "", "handleMonetizationInputSubmitAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Ljava/lang/String;)V", "handleAddLinkToPostAction", "Lru/ozon/app/android/action/v2/models/ActionV2Request;", "toActionV2Request", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Ljava/lang/String;)Lru/ozon/app/android/action/v2/models/ActionV2Request;", "submitInput", AppMeasurementSdk.ConditionalUserProperty.VALUE, "onInputUpdated", "(Ljava/lang/String;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LAe/x0;", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$ScreenState;", "_screenState", "LAe/x0;", "LAe/M0;", "screenState", "LAe/M0;", "getScreenState", "()LAe/M0;", "LAe/w0;", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$Error;", "_error", "LAe/w0;", "LAe/B0;", "error", "LAe/B0;", "getError", "()LAe/B0;", "_inputValue", "inputValue", "getInputValue", "Companion", "ScreenState", "Error", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InputSubmitViewModel extends w0 {

    @NotNull
    private final Ae.w0<Error> _error;

    @NotNull
    private final x0<String> _inputValue;

    @NotNull
    private final x0<ScreenState> _screenState;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final B0<Error> error;

    @NotNull
    private final M0<String> inputValue;

    @NotNull
    private final M0<ScreenState> screenState;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$Companion;", "", "<init>", "()V", "MONETIZATION_INPUT_SUBMIT_ACTION_ID", "", "ADD_LINK_TO_POST_ACTION_ID", "EMPTY_STRING_VALUE", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$Error;", "", "TextRequiredError", "ResponseFailed", "InputFieldError", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$Error$InputFieldError;", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$Error$ResponseFailed;", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$Error$TextRequiredError;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Error {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$Error$InputFieldError;", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$Error;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getErrorMessage", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InputFieldError implements Error {

            @NotNull
            private final String errorMessage;

            public InputFieldError(@NotNull String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.errorMessage = errorMessage;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InputFieldError) && Intrinsics.d(this.errorMessage, ((InputFieldError) other).errorMessage);
            }

            @NotNull
            public final String getErrorMessage() {
                return this.errorMessage;
            }

            public int hashCode() {
                return this.errorMessage.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("InputFieldError(errorMessage=", this.errorMessage, ")");
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$Error$ResponseFailed;", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$Error;", "", "isNetworkError", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ResponseFailed implements Error {
            private final boolean isNetworkError;

            public ResponseFailed(boolean z11) {
                this.isNetworkError = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ResponseFailed) && this.isNetworkError == ((ResponseFailed) other).isNetworkError;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isNetworkError);
            }

            /* renamed from: isNetworkError, reason: from getter */
            public final boolean getIsNetworkError() {
                return this.isNetworkError;
            }

            @NotNull
            public String toString() {
                return C2618u.g("ResponseFailed(isNetworkError=", ")", this.isNetworkError);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$Error$TextRequiredError;", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TextRequiredError implements Error {

            @NotNull
            public static final TextRequiredError INSTANCE = new TextRequiredError();

            private TextRequiredError() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof TextRequiredError);
            }

            public int hashCode() {
                return 1355815987;
            }

            @NotNull
            public String toString() {
                return "TextRequiredError";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$ScreenState;", "", "Idle", "SuccessWithNotification", "SuccessWithRefreshRequests", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$ScreenState$Idle;", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$ScreenState$SuccessWithNotification;", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$ScreenState$SuccessWithRefreshRequests;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ScreenState {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$ScreenState$Idle;", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$ScreenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Idle implements ScreenState {

            @NotNull
            public static final Idle INSTANCE = new Idle();

            private Idle() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Idle);
            }

            public int hashCode() {
                return 1124064800;
            }

            @NotNull
            public String toString() {
                return "Idle";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$ScreenState$SuccessWithNotification;", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$ScreenState;", "Lru/ozon/uni/atoms/af/AtomAction;", "successAction", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getSuccessAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SuccessWithNotification implements ScreenState {
            public static final int $stable = NotificationDTO.$stable | AtomAction.$stable;
            private final NotificationDTO notification;

            @NotNull
            private final AtomAction successAction;

            public SuccessWithNotification(@NotNull AtomAction successAction, NotificationDTO notificationDTO) {
                Intrinsics.checkNotNullParameter(successAction, "successAction");
                this.successAction = successAction;
                this.notification = notificationDTO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SuccessWithNotification)) {
                    return false;
                }
                SuccessWithNotification successWithNotification = (SuccessWithNotification) other;
                return Intrinsics.d(this.successAction, successWithNotification.successAction) && Intrinsics.d(this.notification, successWithNotification.notification);
            }

            public final NotificationDTO getNotification() {
                return this.notification;
            }

            @NotNull
            public final AtomAction getSuccessAction() {
                return this.successAction;
            }

            public int hashCode() {
                int hashCode = this.successAction.hashCode() * 31;
                NotificationDTO notificationDTO = this.notification;
                return hashCode + (notificationDTO == null ? 0 : notificationDTO.hashCode());
            }

            @NotNull
            public String toString() {
                return "SuccessWithNotification(successAction=" + this.successAction + ", notification=" + this.notification + ")";
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$ScreenState$SuccessWithRefreshRequests;", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$ScreenState;", "Lru/ozon/uni/atoms/af/AtomAction;", "successAction", "", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$ScreenState$SuccessWithRefreshRequests$RefreshPageRequest;", "refreshRequests", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getSuccessAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/Set;", "getRefreshRequests", "()Ljava/util/Set;", "Companion", "RefreshPageRequest", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SuccessWithRefreshRequests implements ScreenState {

            @NotNull
            private final Set<RefreshPageRequest> refreshRequests;

            @NotNull
            private final AtomAction successAction;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$ScreenState$SuccessWithRefreshRequests$Companion;", "", "<init>", "()V", "create", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$ScreenState$SuccessWithRefreshRequests;", "successAction", "Lru/ozon/uni/atoms/af/AtomAction;", "inputSubmitResponse", "Lru/ozon/app/android/monetization/widgets/inputSubmit/data/InputSubmitResponse;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final SuccessWithRefreshRequests create(@NotNull AtomAction successAction, @NotNull InputSubmitResponse inputSubmitResponse) {
                    Intrinsics.checkNotNullParameter(successAction, "successAction");
                    Intrinsics.checkNotNullParameter(inputSubmitResponse, "inputSubmitResponse");
                    j builder = new j();
                    if (inputSubmitResponse.getState() == InputSubmitResponse.OrganisationStatus.ORGANISATION_STATUSES_REGISTRATION) {
                        builder.add(RefreshPageRequest.BLOGGER_MAIN);
                    }
                    if (inputSubmitResponse.getState() != InputSubmitResponse.OrganisationStatus.ORGANISATION_STATUSES_INVALID) {
                        builder.add(RefreshPageRequest.BLOGGER_CHANNELS);
                    }
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new SuccessWithRefreshRequests(successAction, builder.b());
                }

                private Companion() {
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$ScreenState$SuccessWithRefreshRequests$RefreshPageRequest;", "", "<init>", "(Ljava/lang/String;I)V", "BLOGGER_MAIN", "BLOGGER_CHANNELS", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class RefreshPageRequest {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ RefreshPageRequest[] $VALUES;
                public static final RefreshPageRequest BLOGGER_MAIN = new RefreshPageRequest("BLOGGER_MAIN", 0);
                public static final RefreshPageRequest BLOGGER_CHANNELS = new RefreshPageRequest("BLOGGER_CHANNELS", 1);

                private static final /* synthetic */ RefreshPageRequest[] $values() {
                    return new RefreshPageRequest[]{BLOGGER_MAIN, BLOGGER_CHANNELS};
                }

                static {
                    RefreshPageRequest[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = b.a($values);
                }

                private RefreshPageRequest(String str, int i11) {
                }

                public static RefreshPageRequest valueOf(String str) {
                    return (RefreshPageRequest) Enum.valueOf(RefreshPageRequest.class, str);
                }

                public static RefreshPageRequest[] values() {
                    return (RefreshPageRequest[]) $VALUES.clone();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public SuccessWithRefreshRequests(@NotNull AtomAction successAction, @NotNull Set<? extends RefreshPageRequest> refreshRequests) {
                Intrinsics.checkNotNullParameter(successAction, "successAction");
                Intrinsics.checkNotNullParameter(refreshRequests, "refreshRequests");
                this.successAction = successAction;
                this.refreshRequests = refreshRequests;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SuccessWithRefreshRequests)) {
                    return false;
                }
                SuccessWithRefreshRequests successWithRefreshRequests = (SuccessWithRefreshRequests) other;
                return Intrinsics.d(this.successAction, successWithRefreshRequests.successAction) && Intrinsics.d(this.refreshRequests, successWithRefreshRequests.refreshRequests);
            }

            @NotNull
            public final Set<RefreshPageRequest> getRefreshRequests() {
                return this.refreshRequests;
            }

            @NotNull
            public final AtomAction getSuccessAction() {
                return this.successAction;
            }

            public int hashCode() {
                return this.refreshRequests.hashCode() + (this.successAction.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "SuccessWithRefreshRequests(successAction=" + this.successAction + ", refreshRequests=" + this.refreshRequests + ")";
            }
        }
    }

    public InputSubmitViewModel(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        x0<ScreenState> a11 = O0.a(ScreenState.Idle.INSTANCE);
        this._screenState = a11;
        this.screenState = C2399j.b(a11);
        C0 b11 = E0.b(0, 0, null, 7);
        this._error = b11;
        this.error = C2399j.a(b11);
        x0<String> a12 = O0.a(null);
        this._inputValue = a12;
        this.inputValue = C2399j.b(a12);
    }

    private final void handleAddLinkToPostAction(AtomAction.ComposerAction action, String uploadKey) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new InputSubmitViewModel$handleAddLinkToPostAction$1(this, action, uploadKey, null), 3);
    }

    private final void handleMonetizationInputSubmitAction(AtomAction.ComposerAction action, String uploadKey) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new InputSubmitViewModel$handleMonetizationInputSubmitAction$1(this, action, uploadKey, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActionV2Request toActionV2Request(AtomAction.ComposerAction composerAction, String str) {
        String actionName = composerAction.getActionName();
        d builder = new d();
        Map<String, String> params = composerAction.getParams();
        if (params != null) {
            builder.putAll(params);
        }
        String value = this._inputValue.getValue();
        if (value == null) {
            value = "";
        }
        builder.put(str, value);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return new ActionV2Request(builder.u(), actionName, false, 4, null);
    }

    @NotNull
    public final B0<Error> getError() {
        return this.error;
    }

    @NotNull
    public final M0<String> getInputValue() {
        return this.inputValue;
    }

    @NotNull
    public final M0<ScreenState> getScreenState() {
        return this.screenState;
    }

    public final void onInputUpdated(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._inputValue.setValue(value);
    }

    public final void submitInput(@NotNull AtomAction.ComposerAction action, @NotNull String uploadKey) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        String value = this.inputValue.getValue();
        String obj = value != null ? h.z0(value).toString() : null;
        if (obj == null || obj.length() == 0) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new InputSubmitViewModel$submitInput$1(this, null), 3);
            return;
        }
        String id2 = action.getId();
        if (Intrinsics.d(id2, "monetizationInputSubmit")) {
            handleMonetizationInputSubmitAction(action, uploadKey);
        } else if (Intrinsics.d(id2, "addLinkToPost")) {
            handleAddLinkToPostAction(action, uploadKey);
        }
    }
}
