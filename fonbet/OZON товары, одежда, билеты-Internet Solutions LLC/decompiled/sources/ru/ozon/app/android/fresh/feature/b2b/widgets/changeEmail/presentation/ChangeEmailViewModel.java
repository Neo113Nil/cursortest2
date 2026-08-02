package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import B0.A0;
import HY.b;
import Nh.a;
import androidx.lifecycle.w0;
import com.google.android.gms.common.Scopes;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.domain.ChangeEmailRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailVO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 N2\u00020\u0001:\u0003NOPB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0012\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u0015\u001a\u00020\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0017\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001c\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J-\u0010)\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010'2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\b¢\u0006\u0004\b-\u0010,J\r\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\b¢\u0006\u0004\b1\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020 038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020 068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00060;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00060>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020#0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010=R\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020#0>8\u0006¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\bE\u0010BR\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006Q"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/ChangeEmailRepository;", "repository", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/ChangeEmailRepository;)V", "", "seconds", "", "startTimer", "(I)V", "Lkotlin/Function0;", "", "emailProvider", "", "lexemes", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "b2bGetOtpAction", "(Lkotlin/jvm/functions/Function0;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "maskOtp", "b2bChangeEmailAction", "(Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Ljava/lang/String;)V", Scopes.EMAIL, "validateEmail", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "otp", FormPageDTO.Field.FIELD_TYPE_MASK, "validateOtpByMask", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "lexemeOrDefault", "(Ljava/util/Map;)Ljava/lang/String;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel$Action;", "emitAction", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel$Action;)V", "", "isSelected", "initCommsPermission", "(Z)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO$InputVO;", "inputVO", "onComposerAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO$InputVO;Lkotlin/jvm/functions/Function0;)Z", "toggleCommsPermission", "()V", "resetFlags", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel$TimerState;", "getTimerState", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel$TimerState;", "stopTimer", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/ChangeEmailRepository;", "LAe/w0;", "_actions", "LAe/w0;", "LAe/B0;", "actions", "LAe/B0;", "getActions", "()LAe/B0;", "LAe/x0;", "_timer", "LAe/x0;", "LAe/M0;", DynamicElementDTO.TIMER, "LAe/M0;", "getTimer", "()LAe/M0;", "_emailSet", "emailSet", "getEmailSet", "Lxe/B0;", "timerJob", "Lxe/B0;", "commsPermission", "Z", "isCommsPermissionSetFromBackend", "emailFromParams", "Ljava/lang/String;", "Companion", "TimerState", "Action", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChangeEmailViewModel extends w0 {

    @NotNull
    private final Ae.w0<Action> _actions;

    @NotNull
    private final x0<Boolean> _emailSet;

    @NotNull
    private final x0<Integer> _timer;

    @NotNull
    private final B0<Action> actions;
    private boolean commsPermission;
    private String emailFromParams;

    @NotNull
    private final M0<Boolean> emailSet;
    private boolean isCommsPermissionSetFromBackend;

    @NotNull
    private final ChangeEmailRepository repository;

    @NotNull
    private final M0<Integer> timer;
    private xe.B0 timerJob;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel$Action;", "", "ShowError", "ShowNotification", "RefreshWithParams", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel$Action$RefreshWithParams;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel$Action$ShowError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel$Action$ShowNotification;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Action {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel$Action$RefreshWithParams;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel$Action;", "", "", "", "params", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RefreshWithParams implements Action {

            @NotNull
            private final Map<String, Object> params;

            public RefreshWithParams(@NotNull Map<String, ? extends Object> params) {
                Intrinsics.checkNotNullParameter(params, "params");
                this.params = params;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RefreshWithParams) && Intrinsics.d(this.params, ((RefreshWithParams) other).params);
            }

            @NotNull
            public final Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            @NotNull
            public String toString() {
                return b.b("RefreshWithParams(params=", ")", this.params);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel$Action$ShowError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel$Action;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowError implements Action {

            @NotNull
            private final String message;

            public ShowError(@NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowError) && Intrinsics.d(this.message, ((ShowError) other).message);
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
                return A0.b("ShowError(message=", this.message, ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel$Action$ShowNotification;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel$Action;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowNotification implements Action {
            public static final int $stable = NotificationDTO.$stable;

            @NotNull
            private final NotificationDTO notification;

            public ShowNotification(@NotNull NotificationDTO notification) {
                Intrinsics.checkNotNullParameter(notification, "notification");
                this.notification = notification;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowNotification) && Intrinsics.d(this.notification, ((ShowNotification) other).notification);
            }

            @NotNull
            public final NotificationDTO getNotification() {
                return this.notification;
            }

            public int hashCode() {
                return this.notification.hashCode();
            }

            @NotNull
            public String toString() {
                return a.e("ShowNotification(notification=", ")", this.notification);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel$Companion;", "", "<init>", "()V", "B2B_GET_OTP", "", "B2B_CHANGE_EMAIL", "B2B_CHANGE_LEGAL_EMAIL", "EMPTY_TEXT_ERROR_MESSAGE", "EMAIL", "OTP_ID", "OTP_VALUE", "TIMER", "OTP_LENGTH", "IS_OTP_EXPIRED", "IS_SUCCESS", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel$TimerState;", "", "", "remainingSeconds", "", "formattedTime", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getRemainingSeconds", "Ljava/lang/String;", "getFormattedTime", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimerState {

        @NotNull
        private final String formattedTime;
        private final int remainingSeconds;

        public TimerState(int i11, @NotNull String formattedTime) {
            Intrinsics.checkNotNullParameter(formattedTime, "formattedTime");
            this.remainingSeconds = i11;
            this.formattedTime = formattedTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerState)) {
                return false;
            }
            TimerState timerState = (TimerState) other;
            return this.remainingSeconds == timerState.remainingSeconds && Intrinsics.d(this.formattedTime, timerState.formattedTime);
        }

        @NotNull
        public final String getFormattedTime() {
            return this.formattedTime;
        }

        public final int getRemainingSeconds() {
            return this.remainingSeconds;
        }

        public int hashCode() {
            return this.formattedTime.hashCode() + (Integer.hashCode(this.remainingSeconds) * 31);
        }

        @NotNull
        public String toString() {
            return a.c(this.remainingSeconds, "TimerState(remainingSeconds=", ", formattedTime=", this.formattedTime, ")");
        }
    }

    public ChangeEmailViewModel(@NotNull ChangeEmailRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        C0 b11 = E0.b(0, 0, null, 7);
        this._actions = b11;
        this.actions = b11;
        x0<Integer> a11 = O0.a(0);
        this._timer = a11;
        this.timer = a11;
        x0<Boolean> a12 = O0.a(Boolean.FALSE);
        this._emailSet = a12;
        this.emailSet = C2399j.b(a12);
        this.commsPermission = true;
    }

    private final void b2bChangeEmailAction(Map<String, String> lexemes, AtomAction.ComposerAction action, String maskOtp) {
        Map<String, String> params = action.getParams();
        if (params == null) {
            params = U.c();
        }
        String str = params.get("otpValue");
        String str2 = str == null ? "" : str;
        String str3 = params.get(Scopes.EMAIL);
        String str4 = str3 == null ? "" : str3;
        String str5 = params.get("otpId");
        if (str5 == null || h.K(str4)) {
            emitAction(new Action.ShowError(lexemeOrDefault(lexemes)));
            return;
        }
        String validateOtpByMask = validateOtpByMask(str2, maskOtp, lexemes);
        if (validateOtpByMask != null) {
            emitAction(new Action.ShowError(validateOtpByMask));
        } else {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ChangeEmailViewModel$b2bChangeEmailAction$2(this, action, str5, str2, str4, lexemes, null), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r0 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b2bGetOtpAction(Function0<String> emailProvider, Map<String, String> lexemes, AtomAction.ComposerAction action) {
        String obj;
        String str = this.emailFromParams;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                obj = h.z0(str).toString();
            }
        }
        obj = h.z0(emailProvider.invoke()).toString();
        String str2 = obj;
        String validateEmail = validateEmail(str2, lexemes);
        if (validateEmail != null) {
            emitAction(new Action.ShowError(validateEmail));
        } else {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ChangeEmailViewModel$b2bGetOtpAction$2(this, action, str2, lexemes, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitAction(Action action) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ChangeEmailViewModel$emitAction$1(this, action, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String lexemeOrDefault(Map<String, String> lexemes) {
        String str = lexemes.get("emptyTextErrorMessage");
        return str == null ? StringProvider.getString(R$string.error_common_error_technical_error_title) : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startTimer(int seconds) {
        xe.B0 b02 = this.timerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.timerJob = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ChangeEmailViewModel$startTimer$1(seconds, this, null), 3);
    }

    private final String validateEmail(String email, Map<String, String> lexemes) {
        if (h.K(email)) {
            return lexemes.get("emptyTextErrorMessage");
        }
        return null;
    }

    private final String validateOtpByMask(String otp, String mask, Map<String, String> lexemes) {
        if (h.K(otp)) {
            return lexemes.get("emptyTextErrorMessage");
        }
        if (mask == null) {
            return null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < mask.length(); i12++) {
            if (mask.charAt(i12) == '#') {
                i11++;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int length = otp.length();
        for (int i13 = 0; i13 < length; i13++) {
            char charAt = otp.charAt(i13);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        if (sb3.length() >= i11) {
            return null;
        }
        String str = lexemes.get("emptyTextErrorMessage");
        return str == null ? StringProvider.getString(ru.ozon.app.android.fresh.feature.b2b.R$string.incorrect_format_error) : str;
    }

    @NotNull
    public final B0<Action> getActions() {
        return this.actions;
    }

    @NotNull
    public final M0<Boolean> getEmailSet() {
        return this.emailSet;
    }

    @NotNull
    public final M0<Integer> getTimer() {
        return this.timer;
    }

    @NotNull
    public final TimerState getTimerState() {
        String str;
        int intValue = this._timer.getValue().intValue();
        if (intValue > 0) {
            long j11 = intValue;
            long minutes = TimeUnit.SECONDS.toMinutes(j11);
            str = StringProvider.getString(ru.ozon.app.android.fresh.feature.b2b.R$string.timer_through, Long.valueOf(minutes), Long.valueOf(j11 - TimeUnit.MINUTES.toSeconds(minutes)));
        } else {
            str = "";
        }
        return new TimerState(intValue, str);
    }

    public final void initCommsPermission(boolean isSelected) {
        if (this.isCommsPermissionSetFromBackend) {
            return;
        }
        this.commsPermission = isSelected;
        this.isCommsPermissionSetFromBackend = true;
    }

    public final boolean onComposerAction(@NotNull AtomAction.ComposerAction action, ChangeEmailVO.InputVO inputVO, @NotNull Function0<String> emailProvider) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(emailProvider, "emailProvider");
        Map<String, String> lexemes = inputVO != null ? inputVO.getLexemes() : null;
        if (lexemes == null) {
            lexemes = U.c();
        }
        String id2 = action.getId();
        if (id2 == null) {
            return false;
        }
        int hashCode = id2.hashCode();
        if (hashCode == -885179161) {
            if (!id2.equals("b2bGetOtp")) {
                return false;
            }
            b2bGetOtpAction(emailProvider, lexemes, action);
            return true;
        }
        if (hashCode != -36012006) {
            if (hashCode != 184987301 || !id2.equals("b2bChangeLegalEmail")) {
                return false;
            }
        } else if (!id2.equals("b2bChangeEmail")) {
            return false;
        }
        b2bChangeEmailAction(lexemes, action, inputVO != null ? inputVO.getMaskOtp() : null);
        return true;
    }

    public final void resetFlags() {
        this.emailFromParams = null;
        this.isCommsPermissionSetFromBackend = false;
    }

    public final void stopTimer() {
        xe.B0 b02 = this.timerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.timerJob = null;
        this._timer.setValue(0);
    }

    public final void toggleCommsPermission() {
        this.commsPermission = !this.commsPermission;
    }
}
