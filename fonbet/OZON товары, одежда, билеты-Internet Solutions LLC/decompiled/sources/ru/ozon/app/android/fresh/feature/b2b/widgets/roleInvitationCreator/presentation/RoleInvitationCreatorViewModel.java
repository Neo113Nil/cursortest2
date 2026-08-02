package ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import B90.C2618u;
import Nh.a;
import Sc.s;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.domain.api.CreateRoleInvitationsResponse;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.domain.api.NotificationResponseDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.domain.api.RoleInvitationCreatorData;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.domain.api.RoleInvitationCreatorRepository;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 E2\u00020\u0001:\u0002EFB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JC\u0010\r\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\t2\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001d\u001a\u00020\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0017¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u0007¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u000b¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\u00020\u00122\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R \u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00150/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00120/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u0012038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106R&\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u00060/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00101R)\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0006038\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00106R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020;0>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/api/RoleInvitationCreatorRepository;", "repository", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/api/RoleInvitationCreatorRepository;)V", "", "", "lexemes", "Lkotlin/Pair;", "", "", "", "validateInputs", "(Ljava/util/Map;)Lkotlin/Pair;", Scopes.EMAIL, "validateEmail", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "", "isValidEmailFormat", "(Ljava/lang/String;)Z", "", "emails", "", "sendInvitations", "(Ljava/util/List;)V", "Lretrofit2/Response;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/api/CreateRoleInvitationsResponse;", "response", "handleApiResponse", "(Lretrofit2/Response;Lkotlin/coroutines/d;)Ljava/lang/Object;", "emitDefaultErrorNotification", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", AppMeasurementSdk.ConditionalUserProperty.NAME, "setRoleName", "(Ljava/lang/String;)V", "clearEmails", "()V", "index", AppMeasurementSdk.ConditionalUserProperty.VALUE, "updateEmail", "(ILjava/lang/String;)V", "removeEmail", "(I)V", "validateAll", "(Ljava/util/Map;)Z", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/api/RoleInvitationCreatorRepository;", "LAe/x0;", "_emails", "LAe/x0;", "_isLoading", "LAe/M0;", "isLoading", "LAe/M0;", "()LAe/M0;", "_validationErrors", "validationErrors", "getValidationErrors", "LAe/w0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel$Action;", "_actions", "LAe/w0;", "LAe/B0;", "actions", "LAe/B0;", "getActions", "()LAe/B0;", "roleName", "Ljava/lang/String;", "Companion", "Action", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RoleInvitationCreatorViewModel extends w0 {

    @NotNull
    private final Ae.w0<Action> _actions;

    @NotNull
    private final x0<List<String>> _emails;

    @NotNull
    private final x0<Boolean> _isLoading;

    @NotNull
    private final x0<Map<Integer, String>> _validationErrors;

    @NotNull
    private final B0<Action> actions;

    @NotNull
    private final M0<Boolean> isLoading;

    @NotNull
    private final RoleInvitationCreatorRepository repository;

    @NotNull
    private String roleName;

    @NotNull
    private final M0<Map<Integer, String>> validationErrors;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel$Action;", "", "<init>", "()V", "Redirect", "ShowError", "ShowNotification", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel$Action$Redirect;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel$Action$ShowError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel$Action$ShowNotification;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel$Action$Redirect;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel$Action;", "<init>", "()V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Redirect extends Action {

            @NotNull
            public static final Redirect INSTANCE = new Redirect();

            private Redirect() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel$Action$ShowError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel$Action;", "", "message", "", "inputIndex", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "I", "getInputIndex", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowError extends Action {
            private final int inputIndex;

            @NotNull
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowError(@NotNull String message, int i11) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
                this.inputIndex = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowError)) {
                    return false;
                }
                ShowError showError = (ShowError) other;
                return Intrinsics.d(this.message, showError.message) && this.inputIndex == showError.inputIndex;
            }

            public final int getInputIndex() {
                return this.inputIndex;
            }

            @NotNull
            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return Integer.hashCode(this.inputIndex) + (this.message.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return C2618u.f(this.inputIndex, "ShowError(message=", this.message, ", inputIndex=", ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel$Action$ShowNotification;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel$Action;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowNotification extends Action {
            public static final int $stable = NotificationDTO.$stable;

            @NotNull
            private final NotificationDTO notification;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowNotification(@NotNull NotificationDTO notification) {
                super(null);
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

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/RoleInvitationCreatorViewModel$Companion;", "", "<init>", "()V", "EMPTY_TEXT_ERROR_MESSAGE", "", "WRONG_FORMAT_ERROR_MESSAGE", "ROLE_NAME_DEFAULT", "PROVIDE_EMAIL", "INCORRECT_EMAIL", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public RoleInvitationCreatorViewModel(@NotNull RoleInvitationCreatorRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        this._emails = O0.a(C7714v.a0(""));
        x0<Boolean> a11 = O0.a(Boolean.FALSE);
        this._isLoading = a11;
        this.isLoading = C2399j.b(a11);
        x0<Map<Integer, String>> a12 = O0.a(U.c());
        this._validationErrors = a12;
        this.validationErrors = C2399j.b(a12);
        C0 b11 = E0.b(0, 0, null, 7);
        this._actions = b11;
        this.actions = C2399j.a(b11);
        this.roleName = "user";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object emitDefaultErrorNotification(d<? super Unit> dVar) {
        Object emit = this._actions.emit(new Action.ShowNotification(new NotificationDTO(StringProvider.getString(R$string.error_common_error_technical_error_title), StringProvider.getString(R$string.error_common_message_service_error), null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 508, null)), dVar);
        return emit == Wc.a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d3, code lost:
    
        if (r9.emit(r10, r0) != r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0069, code lost:
    
        if (emitDefaultErrorNotification(r0) == r1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x007f, code lost:
    
        if (emitDefaultErrorNotification(r0) == r1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0168, code lost:
    
        if (r10.emit(r2, r0) == r1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0175, code lost:
    
        if (emitDefaultErrorNotification(r0) == r1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0138 -> B:18:0x0139). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleApiResponse(Response<CreateRoleInvitationsResponse> response, d<? super Unit> dVar) {
        RoleInvitationCreatorViewModel$handleApiResponse$1 roleInvitationCreatorViewModel$handleApiResponse$1;
        int i11;
        NotificationResponseDTO notification;
        RoleInvitationCreatorViewModel roleInvitationCreatorViewModel;
        Iterator it;
        RoleInvitationCreatorViewModel roleInvitationCreatorViewModel2;
        int i12;
        if (dVar instanceof RoleInvitationCreatorViewModel$handleApiResponse$1) {
            roleInvitationCreatorViewModel$handleApiResponse$1 = (RoleInvitationCreatorViewModel$handleApiResponse$1) dVar;
            int i13 = roleInvitationCreatorViewModel$handleApiResponse$1.label;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                roleInvitationCreatorViewModel$handleApiResponse$1.label = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = roleInvitationCreatorViewModel$handleApiResponse$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                NotificationDTO notificationDTO = null;
                switch (roleInvitationCreatorViewModel$handleApiResponse$1.label) {
                    case 0:
                        s.b(obj);
                        if (!response.isSuccessful()) {
                            roleInvitationCreatorViewModel$handleApiResponse$1.label = 1;
                            break;
                        } else {
                            CreateRoleInvitationsResponse body = response.body();
                            if (body != null) {
                                RoleInvitationCreatorData data = body.getData();
                                i11 = 0;
                                if (data != null ? Intrinsics.d(data.isSuccess(), Boolean.TRUE) : false) {
                                    NotificationResponseDTO notification2 = data.getNotification();
                                    if ((notification2 != null ? notification2.getNotificationBar() : null) != null) {
                                        Ae.w0<Action> w0Var = this._actions;
                                        Action.ShowNotification showNotification = new Action.ShowNotification(data.getNotification().getNotificationBar());
                                        roleInvitationCreatorViewModel$handleApiResponse$1.L$0 = this;
                                        roleInvitationCreatorViewModel$handleApiResponse$1.label = 3;
                                        if (w0Var.emit(showNotification, roleInvitationCreatorViewModel$handleApiResponse$1) != aVar) {
                                            roleInvitationCreatorViewModel2 = this;
                                            Ae.w0<Action> w0Var2 = roleInvitationCreatorViewModel2._actions;
                                            Action.Redirect redirect = Action.Redirect.INSTANCE;
                                            roleInvitationCreatorViewModel$handleApiResponse$1.L$0 = null;
                                            roleInvitationCreatorViewModel$handleApiResponse$1.label = 4;
                                            break;
                                        }
                                    }
                                }
                                if ((data != null ? data.getErrors() : null) == null) {
                                    if (data != null && (notification = data.getNotification()) != null) {
                                        notificationDTO = notification.getNotificationBar();
                                    }
                                    if (notificationDTO == null) {
                                        roleInvitationCreatorViewModel$handleApiResponse$1.label = 7;
                                        break;
                                    } else {
                                        Ae.w0<Action> w0Var3 = this._actions;
                                        Action.ShowNotification showNotification2 = new Action.ShowNotification(data.getNotification().getNotificationBar());
                                        roleInvitationCreatorViewModel$handleApiResponse$1.label = 6;
                                        break;
                                    }
                                } else {
                                    roleInvitationCreatorViewModel = this;
                                    it = data.getErrors().iterator();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        int i14 = i11 + 1;
                                        if (i11 < 0) {
                                            C7714v.O0();
                                            throw null;
                                        }
                                        String str = (String) next;
                                        if (str == null || h.K(str)) {
                                            i11 = i14;
                                        } else {
                                            LinkedHashMap u11 = U.u(roleInvitationCreatorViewModel._validationErrors.getValue());
                                            u11.put(new Integer(i11), str);
                                            roleInvitationCreatorViewModel._validationErrors.setValue(u11);
                                            Ae.w0<Action> w0Var4 = roleInvitationCreatorViewModel._actions;
                                            Action.ShowError showError = new Action.ShowError(str, i11);
                                            roleInvitationCreatorViewModel$handleApiResponse$1.L$0 = roleInvitationCreatorViewModel;
                                            roleInvitationCreatorViewModel$handleApiResponse$1.L$1 = it;
                                            roleInvitationCreatorViewModel$handleApiResponse$1.I$0 = i14;
                                            roleInvitationCreatorViewModel$handleApiResponse$1.label = 5;
                                            if (w0Var4.emit(showError, roleInvitationCreatorViewModel$handleApiResponse$1) != aVar) {
                                                i12 = i14;
                                                i11 = i12;
                                                while (it.hasNext()) {
                                                }
                                            }
                                        }
                                    }
                                    return Unit.f71690a;
                                }
                            } else {
                                roleInvitationCreatorViewModel$handleApiResponse$1.label = 2;
                                break;
                            }
                        }
                        return aVar;
                    case 1:
                        s.b(obj);
                        return Unit.f71690a;
                    case 2:
                        s.b(obj);
                        return Unit.f71690a;
                    case 3:
                        roleInvitationCreatorViewModel2 = (RoleInvitationCreatorViewModel) roleInvitationCreatorViewModel$handleApiResponse$1.L$0;
                        s.b(obj);
                        Ae.w0<Action> w0Var22 = roleInvitationCreatorViewModel2._actions;
                        Action.Redirect redirect2 = Action.Redirect.INSTANCE;
                        roleInvitationCreatorViewModel$handleApiResponse$1.L$0 = null;
                        roleInvitationCreatorViewModel$handleApiResponse$1.label = 4;
                        break;
                    case 4:
                        s.b(obj);
                        return Unit.f71690a;
                    case 5:
                        i12 = roleInvitationCreatorViewModel$handleApiResponse$1.I$0;
                        it = (Iterator) roleInvitationCreatorViewModel$handleApiResponse$1.L$1;
                        roleInvitationCreatorViewModel = (RoleInvitationCreatorViewModel) roleInvitationCreatorViewModel$handleApiResponse$1.L$0;
                        s.b(obj);
                        i11 = i12;
                        while (it.hasNext()) {
                        }
                        return Unit.f71690a;
                    case 6:
                        s.b(obj);
                        return Unit.f71690a;
                    case 7:
                        s.b(obj);
                        return Unit.f71690a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        roleInvitationCreatorViewModel$handleApiResponse$1 = new RoleInvitationCreatorViewModel$handleApiResponse$1(this, dVar);
        Object obj2 = roleInvitationCreatorViewModel$handleApiResponse$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        NotificationDTO notificationDTO2 = null;
        switch (roleInvitationCreatorViewModel$handleApiResponse$1.label) {
        }
    }

    private final boolean isValidEmailFormat(String email) {
        return new Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$").f(email);
    }

    private final void sendInvitations(List<String> emails) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new RoleInvitationCreatorViewModel$sendInvitations$1(this, emails, null), 3);
    }

    private final String validateEmail(String email, Map<String, String> lexemes) {
        if (h.K(email)) {
            String str = lexemes.get("emptyTextErrorMessage");
            return str == null ? "Укажите почту" : str;
        }
        if (isValidEmailFormat(email)) {
            return null;
        }
        String str2 = lexemes.get("wrongFormatErrorMessage");
        return str2 == null ? "Некорректный формат почты" : str2;
    }

    private final Pair<Map<Integer, String>, List<String>> validateInputs(Map<String, String> lexemes) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : this._emails.getValue()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            String obj2 = h.z0((String) obj).toString();
            String validateEmail = validateEmail(obj2, lexemes == null ? U.c() : lexemes);
            if (validateEmail != null) {
                linkedHashMap.put(Integer.valueOf(i11), validateEmail);
            } else if (obj2.length() > 0) {
                arrayList.add(obj2);
            }
            i11 = i12;
        }
        return new Pair<>(linkedHashMap, arrayList);
    }

    public final void clearEmails() {
        this._emails.setValue(C7714v.a0(""));
        this._validationErrors.setValue(U.c());
    }

    @NotNull
    public final B0<Action> getActions() {
        return this.actions;
    }

    @NotNull
    public final M0<Map<Integer, String>> getValidationErrors() {
        return this.validationErrors;
    }

    @NotNull
    public final M0<Boolean> isLoading() {
        return this.isLoading;
    }

    public final void removeEmail(int index) {
        ArrayList W02 = C7714v.W0(this._emails.getValue());
        if (index < W02.size()) {
            W02.remove(index);
            this._emails.setValue(W02);
            LinkedHashMap u11 = U.u(this._validationErrors.getValue());
            u11.remove(Integer.valueOf(index));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : u11.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                String str = (String) entry.getValue();
                if (intValue > index) {
                    intValue--;
                }
                linkedHashMap.put(Integer.valueOf(intValue), str);
            }
            this._validationErrors.setValue(linkedHashMap);
        }
    }

    public final void setRoleName(String name) {
        if (name == null) {
            name = "user";
        }
        this.roleName = name;
    }

    public final void updateEmail(int index, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList W02 = C7714v.W0(this._emails.getValue());
        while (W02.size() <= index) {
            W02.add("");
        }
        W02.set(index, value);
        this._emails.setValue(W02);
        if (this._validationErrors.getValue().containsKey(Integer.valueOf(index))) {
            LinkedHashMap u11 = U.u(this._validationErrors.getValue());
            u11.remove(Integer.valueOf(index));
            this._validationErrors.setValue(u11);
        }
    }

    public final boolean validateAll(Map<String, String> lexemes) {
        Pair<Map<Integer, String>, List<String>> validateInputs = validateInputs(lexemes);
        Map<Integer, String> a11 = validateInputs.a();
        List<String> b11 = validateInputs.b();
        this._validationErrors.setValue(a11);
        if (!a11.isEmpty() || b11.isEmpty()) {
            return false;
        }
        sendInvitations(b11);
        return true;
    }
}
