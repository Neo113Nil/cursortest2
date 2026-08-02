package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation;

import Ae.C0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import B0.A0;
import De.C2859b;
import HY.b;
import Nh.a;
import Sc.o;
import Sc.s;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.AddLegalRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.AddLegalResponse;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.ProcessRegistrationResponse;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.data.RegistrationDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationVI;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.utils.Result;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 =2\u00020\u0001:\u0004=>?@B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJN\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u00102\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00112\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u0011H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u0016*\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u001f\u001a\u00020\u0016*\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b\u001f\u0010\"JG\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u0007¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0007¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020/028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u000208028\u0006¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b<\u00106¨\u0006A"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalRepository;", "repository", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalRepository;)V", "", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/InputData;", "inputs", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI;", "registrationVI", "Lorg/json/JSONObject;", "jsonPostData", "validateAndBuildJson", "(Ljava/util/Map;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI;Lorg/json/JSONObject;)Ljava/util/Map;", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "Lru/ozon/app/android/utils/Result;", "", "operation", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$OperationResult;", "mapper", "", "executeRepositoryOperation", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "result", "handleOperationResult", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$OperationResult;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalResponse;", "toState", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalResponse;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$OperationResult;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/ProcessRegistrationResponse;", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/ProcessRegistrationResponse;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$OperationResult;", "action", "postData", "Lxe/B0;", "processRegistration", "(Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI;Ljava/util/Map;)Lxe/B0;", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "updateAddress", "(Ljava/lang/String;)V", "getPostCodeByAddress", "(Ljava/lang/String;)Lxe/B0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalRepository;", "LAe/x0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$State;", "_state", "LAe/x0;", "LAe/h;", "state", "LAe/h;", "getState", "()LAe/h;", "LAe/w0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent;", "_events", "LAe/w0;", "events", "getEvents", "Companion", "State", "UIEvent", "OperationResult", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RegistrationViewModel extends w0 {

    @NotNull
    private final Ae.w0<UIEvent> _events;

    @NotNull
    private final x0<State> _state;

    @NotNull
    private final InterfaceC2395h<UIEvent> events;

    @NotNull
    private final AddLegalRepository repository;

    @NotNull
    private final InterfaceC2395h<State> state;
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$OperationResult;", "", "<init>", "()V", "Error", "Success", "InputsError", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$OperationResult$Error;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$OperationResult$InputsError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$OperationResult$Success;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static abstract class OperationResult {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$OperationResult$Error;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$OperationResult;", "", "message", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends OperationResult {
            public static final int $stable = NotificationDTO.$stable;
            private final String message;
            private final NotificationDTO notification;

            /* JADX WARN: Multi-variable type inference failed */
            public Error() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return Intrinsics.d(this.message, error.message) && Intrinsics.d(this.notification, error.notification);
            }

            public final String getMessage() {
                return this.message;
            }

            public final NotificationDTO getNotification() {
                return this.notification;
            }

            public int hashCode() {
                String str = this.message;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                NotificationDTO notificationDTO = this.notification;
                return hashCode + (notificationDTO != null ? notificationDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Error(message=" + this.message + ", notification=" + this.notification + ")";
            }

            public /* synthetic */ Error(String str, NotificationDTO notificationDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : notificationDTO);
            }

            public Error(String str, NotificationDTO notificationDTO) {
                super(null);
                this.message = str;
                this.notification = notificationDTO;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$OperationResult$InputsError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$OperationResult;", "", "", "errors", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getErrors", "()Ljava/util/Map;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InputsError extends OperationResult {

            @NotNull
            private final Map<String, String> errors;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InputsError(@NotNull Map<String, String> errors) {
                super(null);
                Intrinsics.checkNotNullParameter(errors, "errors");
                this.errors = errors;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InputsError) && Intrinsics.d(this.errors, ((InputsError) other).errors);
            }

            @NotNull
            public final Map<String, String> getErrors() {
                return this.errors;
            }

            public int hashCode() {
                return this.errors.hashCode();
            }

            @NotNull
            public String toString() {
                return b.b("InputsError(errors=", ")", this.errors);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$OperationResult$Success;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$OperationResult;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationDTO", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotificationDTO", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends OperationResult {
            public static final int $stable = NotificationDTO.$stable;
            private final AtomActionDTO action;
            private final NotificationDTO notificationDTO;

            /* JADX WARN: Multi-variable type inference failed */
            public Success() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.d(this.action, success.action) && Intrinsics.d(this.notificationDTO, success.notificationDTO);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final NotificationDTO getNotificationDTO() {
                return this.notificationDTO;
            }

            public int hashCode() {
                AtomActionDTO atomActionDTO = this.action;
                int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
                NotificationDTO notificationDTO = this.notificationDTO;
                return hashCode + (notificationDTO != null ? notificationDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Success(action=" + this.action + ", notificationDTO=" + this.notificationDTO + ")";
            }

            public /* synthetic */ Success(AtomActionDTO atomActionDTO, NotificationDTO notificationDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : atomActionDTO, (i11 & 2) != 0 ? null : notificationDTO);
            }

            public Success(AtomActionDTO atomActionDTO, NotificationDTO notificationDTO) {
                super(null);
                this.action = atomActionDTO;
                this.notificationDTO = notificationDTO;
            }
        }

        public /* synthetic */ OperationResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private OperationResult() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$State;", "", "Idle", "Loading", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$State$Idle;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$State$Loading;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$State$Idle;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Idle implements State {

            @NotNull
            public static final Idle INSTANCE = new Idle();

            private Idle() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Idle);
            }

            public int hashCode() {
                return 641355439;
            }

            @NotNull
            public String toString() {
                return "Idle";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$State$Loading;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading implements State {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            private Loading() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return 1277730945;
            }

            @NotNull
            public String toString() {
                return "Loading";
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent;", "", "<init>", "()V", "NetworkError", "AddressUpdate", "PostCodeUpdate", "Navigation", "Notification", "InputsError", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent$AddressUpdate;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent$InputsError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent$Navigation;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent$NetworkError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent$Notification;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent$PostCodeUpdate;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class UIEvent {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent$AddressUpdate;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AddressUpdate extends UIEvent {

            @NotNull
            private final String value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddressUpdate(@NotNull String value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AddressUpdate) && Intrinsics.d(this.value, ((AddressUpdate) other).value);
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("AddressUpdate(value=", this.value, ")");
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent$InputsError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent;", "", "", "errors", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getErrors", "()Ljava/util/Map;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InputsError extends UIEvent {

            @NotNull
            private final Map<String, String> errors;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InputsError(@NotNull Map<String, String> errors) {
                super(null);
                Intrinsics.checkNotNullParameter(errors, "errors");
                this.errors = errors;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InputsError) && Intrinsics.d(this.errors, ((InputsError) other).errors);
            }

            @NotNull
            public final Map<String, String> getErrors() {
                return this.errors;
            }

            public int hashCode() {
                return this.errors.hashCode();
            }

            @NotNull
            public String toString() {
                return b.b("InputsError(errors=", ")", this.errors);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent$Navigation;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Navigation extends UIEvent {

            @NotNull
            private final AtomActionDTO action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Navigation(@NotNull AtomActionDTO action) {
                super(null);
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Navigation) && Intrinsics.d(this.action, ((Navigation) other).action);
            }

            @NotNull
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return C2859b.f("Navigation(action=", ")", this.action);
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent$NetworkError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent;", "", "message", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NetworkError extends UIEvent {
            public static final int $stable = NotificationDTO.$stable;
            private final String message;
            private final NotificationDTO notification;

            /* JADX WARN: Multi-variable type inference failed */
            public NetworkError() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NetworkError)) {
                    return false;
                }
                NetworkError networkError = (NetworkError) other;
                return Intrinsics.d(this.message, networkError.message) && Intrinsics.d(this.notification, networkError.notification);
            }

            public final String getMessage() {
                return this.message;
            }

            public final NotificationDTO getNotification() {
                return this.notification;
            }

            public int hashCode() {
                String str = this.message;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                NotificationDTO notificationDTO = this.notification;
                return hashCode + (notificationDTO != null ? notificationDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "NetworkError(message=" + this.message + ", notification=" + this.notification + ")";
            }

            public /* synthetic */ NetworkError(String str, NotificationDTO notificationDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : notificationDTO);
            }

            public NetworkError(String str, NotificationDTO notificationDTO) {
                super(null);
                this.message = str;
                this.notification = notificationDTO;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent$Notification;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getValue", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Notification extends UIEvent {
            public static final int $stable = NotificationDTO.$stable;

            @NotNull
            private final NotificationDTO value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Notification(@NotNull NotificationDTO value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Notification) && Intrinsics.d(this.value, ((Notification) other).value);
            }

            @NotNull
            public final NotificationDTO getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            @NotNull
            public String toString() {
                return a.e("Notification(value=", ")", this.value);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent$PostCodeUpdate;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel$UIEvent;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PostCodeUpdate extends UIEvent {

            @NotNull
            private final String value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PostCodeUpdate(@NotNull String value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PostCodeUpdate) && Intrinsics.d(this.value, ((PostCodeUpdate) other).value);
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("PostCodeUpdate(value=", this.value, ")");
            }
        }

        public /* synthetic */ UIEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private UIEvent() {
        }
    }

    public RegistrationViewModel(@NotNull AddLegalRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        x0<State> a11 = O0.a(State.Idle.INSTANCE);
        this._state = a11;
        this.state = a11;
        C0 b11 = E0.b(0, 0, null, 7);
        this._events = b11;
        this.events = b11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r6.handleOperationResult(r7, r0) != r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object executeRepositoryOperation(Function1<? super d<? super Result<T>>, ? extends Object> function1, Function1<? super T, ? extends OperationResult> function12, d<? super Unit> dVar) {
        RegistrationViewModel$executeRepositoryOperation$1 registrationViewModel$executeRepositoryOperation$1;
        int i11;
        RegistrationViewModel registrationViewModel;
        Result result;
        OperationResult error;
        if (dVar instanceof RegistrationViewModel$executeRepositoryOperation$1) {
            registrationViewModel$executeRepositoryOperation$1 = (RegistrationViewModel$executeRepositoryOperation$1) dVar;
            int i12 = registrationViewModel$executeRepositoryOperation$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                registrationViewModel$executeRepositoryOperation$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = registrationViewModel$executeRepositoryOperation$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = registrationViewModel$executeRepositoryOperation$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    registrationViewModel$executeRepositoryOperation$1.L$0 = this;
                    registrationViewModel$executeRepositoryOperation$1.L$1 = function12;
                    registrationViewModel$executeRepositoryOperation$1.label = 1;
                    obj = function1.invoke(registrationViewModel$executeRepositoryOperation$1);
                    if (obj != aVar) {
                        registrationViewModel = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                function12 = (Function1) registrationViewModel$executeRepositoryOperation$1.L$1;
                registrationViewModel = (RegistrationViewModel) registrationViewModel$executeRepositoryOperation$1.L$0;
                s.b(obj);
                result = (Result) obj;
                String str = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (!(result instanceof Result.Success)) {
                    error = function12.invoke((Object) ((Result.Success) result).getValue());
                } else {
                    if (!(result instanceof Result.Failure)) {
                        throw new o();
                    }
                    error = new OperationResult.Error(str, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
                }
                registrationViewModel$executeRepositoryOperation$1.L$0 = null;
                registrationViewModel$executeRepositoryOperation$1.L$1 = null;
                registrationViewModel$executeRepositoryOperation$1.label = 2;
            }
        }
        registrationViewModel$executeRepositoryOperation$1 = new RegistrationViewModel$executeRepositoryOperation$1(this, dVar);
        Object obj2 = registrationViewModel$executeRepositoryOperation$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = registrationViewModel$executeRepositoryOperation$1.label;
        if (i11 != 0) {
        }
        result = (Result) obj2;
        String str2 = null;
        Object[] objArr3 = 0;
        Object[] objArr22 = 0;
        if (!(result instanceof Result.Success)) {
        }
        registrationViewModel$executeRepositoryOperation$1.L$0 = null;
        registrationViewModel$executeRepositoryOperation$1.L$1 = null;
        registrationViewModel$executeRepositoryOperation$1.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fb, code lost:
    
        if (r7.emit(r8, r0) != r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
    
        if (r8.emit(r4, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        if (r4.emit(r5, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c6, code lost:
    
        if (r8.emit(r4, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e9, code lost:
    
        if (r8.emit(r4, r0) == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleOperationResult(OperationResult operationResult, d<? super Unit> dVar) {
        RegistrationViewModel$handleOperationResult$1 registrationViewModel$handleOperationResult$1;
        RegistrationViewModel registrationViewModel;
        NotificationDTO notificationDTO;
        if (dVar instanceof RegistrationViewModel$handleOperationResult$1) {
            registrationViewModel$handleOperationResult$1 = (RegistrationViewModel$handleOperationResult$1) dVar;
            int i11 = registrationViewModel$handleOperationResult$1.label;
            if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                registrationViewModel$handleOperationResult$1.label = i11 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = registrationViewModel$handleOperationResult$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                switch (registrationViewModel$handleOperationResult$1.label) {
                    case 0:
                        s.b(obj);
                        x0<State> x0Var = this._state;
                        State.Loading loading = State.Loading.INSTANCE;
                        registrationViewModel$handleOperationResult$1.L$0 = this;
                        registrationViewModel$handleOperationResult$1.L$1 = operationResult;
                        registrationViewModel$handleOperationResult$1.label = 1;
                        if (x0Var.emit(loading, registrationViewModel$handleOperationResult$1) != aVar) {
                            registrationViewModel = this;
                            if (!(operationResult instanceof OperationResult.Success)) {
                                AtomActionDTO action = ((OperationResult.Success) operationResult).getAction();
                                if (action != null) {
                                    Ae.w0<UIEvent> w0Var = registrationViewModel._events;
                                    UIEvent.Navigation navigation = new UIEvent.Navigation(action);
                                    registrationViewModel$handleOperationResult$1.L$0 = registrationViewModel;
                                    registrationViewModel$handleOperationResult$1.L$1 = operationResult;
                                    registrationViewModel$handleOperationResult$1.label = 2;
                                    break;
                                }
                                notificationDTO = ((OperationResult.Success) operationResult).getNotificationDTO();
                                if (notificationDTO != null) {
                                    Ae.w0<UIEvent> w0Var2 = registrationViewModel._events;
                                    UIEvent.Notification notification = new UIEvent.Notification(notificationDTO);
                                    registrationViewModel$handleOperationResult$1.L$0 = registrationViewModel;
                                    registrationViewModel$handleOperationResult$1.L$1 = null;
                                    registrationViewModel$handleOperationResult$1.label = 3;
                                    break;
                                }
                                x0<State> x0Var2 = registrationViewModel._state;
                                State.Idle idle = State.Idle.INSTANCE;
                                registrationViewModel$handleOperationResult$1.L$0 = null;
                                registrationViewModel$handleOperationResult$1.L$1 = null;
                                registrationViewModel$handleOperationResult$1.label = 6;
                                break;
                            } else {
                                if (operationResult instanceof OperationResult.InputsError) {
                                    Ae.w0<UIEvent> w0Var3 = registrationViewModel._events;
                                    UIEvent.InputsError inputsError = new UIEvent.InputsError(((OperationResult.InputsError) operationResult).getErrors());
                                    registrationViewModel$handleOperationResult$1.L$0 = registrationViewModel;
                                    registrationViewModel$handleOperationResult$1.L$1 = null;
                                    registrationViewModel$handleOperationResult$1.label = 4;
                                    break;
                                } else {
                                    if (!(operationResult instanceof OperationResult.Error)) {
                                        throw new o();
                                    }
                                    Ae.w0<UIEvent> w0Var4 = registrationViewModel._events;
                                    OperationResult.Error error = (OperationResult.Error) operationResult;
                                    UIEvent.NetworkError networkError = new UIEvent.NetworkError(error.getMessage(), error.getNotification());
                                    registrationViewModel$handleOperationResult$1.L$0 = registrationViewModel;
                                    registrationViewModel$handleOperationResult$1.L$1 = null;
                                    registrationViewModel$handleOperationResult$1.label = 5;
                                    break;
                                }
                                registrationViewModel = r7;
                                x0<State> x0Var22 = registrationViewModel._state;
                                State.Idle idle2 = State.Idle.INSTANCE;
                                registrationViewModel$handleOperationResult$1.L$0 = null;
                                registrationViewModel$handleOperationResult$1.L$1 = null;
                                registrationViewModel$handleOperationResult$1.label = 6;
                            }
                        }
                        return aVar;
                    case 1:
                        operationResult = (OperationResult) registrationViewModel$handleOperationResult$1.L$1;
                        registrationViewModel = (RegistrationViewModel) registrationViewModel$handleOperationResult$1.L$0;
                        s.b(obj);
                        if (!(operationResult instanceof OperationResult.Success)) {
                        }
                        return aVar;
                    case 2:
                        operationResult = (OperationResult) registrationViewModel$handleOperationResult$1.L$1;
                        registrationViewModel = (RegistrationViewModel) registrationViewModel$handleOperationResult$1.L$0;
                        s.b(obj);
                        notificationDTO = ((OperationResult.Success) operationResult).getNotificationDTO();
                        if (notificationDTO != null) {
                        }
                        x0<State> x0Var222 = registrationViewModel._state;
                        State.Idle idle22 = State.Idle.INSTANCE;
                        registrationViewModel$handleOperationResult$1.L$0 = null;
                        registrationViewModel$handleOperationResult$1.L$1 = null;
                        registrationViewModel$handleOperationResult$1.label = 6;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        RegistrationViewModel registrationViewModel2 = (RegistrationViewModel) registrationViewModel$handleOperationResult$1.L$0;
                        s.b(obj);
                        registrationViewModel = registrationViewModel2;
                        x0<State> x0Var2222 = registrationViewModel._state;
                        State.Idle idle222 = State.Idle.INSTANCE;
                        registrationViewModel$handleOperationResult$1.L$0 = null;
                        registrationViewModel$handleOperationResult$1.L$1 = null;
                        registrationViewModel$handleOperationResult$1.label = 6;
                        break;
                    case 6:
                        s.b(obj);
                        return Unit.f71690a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        registrationViewModel$handleOperationResult$1 = new RegistrationViewModel$handleOperationResult$1(this, dVar);
        Object obj2 = registrationViewModel$handleOperationResult$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        switch (registrationViewModel$handleOperationResult$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final OperationResult toState(AddLegalResponse addLegalResponse) {
        int i11 = 3;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        if (addLegalResponse == null) {
            return new OperationResult.Error(str, objArr7 == true ? 1 : 0, i11, objArr6 == true ? 1 : 0);
        }
        if (addLegalResponse.isSuccess()) {
            return new OperationResult.Success(objArr5 == true ? 1 : 0, addLegalResponse.getNotification(), 1, objArr4 == true ? 1 : 0);
        }
        if (addLegalResponse.getNotification() != null || addLegalResponse.getError() != null) {
            return new OperationResult.Error(addLegalResponse.getError(), addLegalResponse.getNotification());
        }
        Map<String, String> errors = addLegalResponse.getErrors();
        return errors == null ? new OperationResult.Error(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0) : new OperationResult.InputsError(errors);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> validateAndBuildJson(Map<String, InputData> inputs, RegistrationVI registrationVI, JSONObject jsonPostData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<RegistrationVI.FieldVI> fields = registrationVI.getFields();
        ArrayList<RegistrationVI.FieldVI.InputVI> arrayList = new ArrayList();
        Iterator<T> it = fields.iterator();
        while (it.hasNext()) {
            RegistrationVI.FieldVI.InputVI input = ((RegistrationVI.FieldVI) it.next()).getInput();
            if (input != null) {
                arrayList.add(input);
            }
        }
        for (RegistrationVI.FieldVI.InputVI inputVI : arrayList) {
            InputData inputData = inputs.get(inputVI.getName());
            if (inputData != null) {
                String obj = h.z0(inputData.getText()).toString();
                if (!inputData.getIsCheckBoxMarked()) {
                    if (!(obj.length() == 0 && inputVI.getRequired()) && obj.length() >= inputVI.getMinLength()) {
                        String name = inputVI.getName();
                        if (h.K(obj)) {
                            obj = null;
                        }
                        jsonPostData.put(name, obj);
                    } else {
                        String name2 = inputVI.getName();
                        RegistrationDTO.FieldDTO.InputDTO.Errors lexemes = inputVI.getLexemes();
                        String emptyTextErrorMessage = lexemes != null ? lexemes.getEmptyTextErrorMessage() : null;
                        if (emptyTextErrorMessage == null) {
                            emptyTextErrorMessage = "";
                        }
                        linkedHashMap.put(name2, emptyTextErrorMessage);
                    }
                } else if (Intrinsics.d(inputVI.getName(), "postCode")) {
                    jsonPostData.put("noPostCode", true);
                }
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public final InterfaceC2395h<UIEvent> getEvents() {
        return this.events;
    }

    @NotNull
    public final B0 getPostCodeByAddress(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        return C10727i.c(androidx.lifecycle.x0.a(this), null, null, new RegistrationViewModel$getPostCodeByAddress$1(this, address, null), 3);
    }

    @NotNull
    public final InterfaceC2395h<State> getState() {
        return this.state;
    }

    @NotNull
    public final B0 processRegistration(@NotNull String action, @NotNull Map<String, InputData> inputs, @NotNull RegistrationVI registrationVI, Map<String, String> postData) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(registrationVI, "registrationVI");
        return C10727i.c(androidx.lifecycle.x0.a(this), null, null, new RegistrationViewModel$processRegistration$1(postData, action, this, inputs, registrationVI, null), 3);
    }

    public final void updateAddress(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new RegistrationViewModel$updateAddress$1(this, address, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final OperationResult toState(ProcessRegistrationResponse processRegistrationResponse) {
        int i11 = 3;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        if (processRegistrationResponse == null) {
            return new OperationResult.Error(str, objArr9 == true ? 1 : 0, i11, objArr8 == true ? 1 : 0);
        }
        if (processRegistrationResponse.getAction() != null) {
            return new OperationResult.Success(processRegistrationResponse.getAction(), objArr7 == true ? 1 : 0, 2, objArr6 == true ? 1 : 0);
        }
        if (processRegistrationResponse.getNotificationBar() != null) {
            return new OperationResult.Error(objArr5 == true ? 1 : 0, processRegistrationResponse.getNotificationBar(), 1, objArr4 == true ? 1 : 0);
        }
        Map<String, String> errors = processRegistrationResponse.getErrors();
        if (errors == null) {
            return new OperationResult.Error(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0);
        }
        return new OperationResult.InputsError(errors);
    }
}
