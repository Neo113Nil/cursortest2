package ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Nh.a;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.data.AddConsigneeRepository;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u0000 B2\u00020\u0001:\u0003BCDB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\fJ\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010!R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\"8\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001f\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00130+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010-R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u00130.8\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00130+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010-R\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\u00130.8\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u00102R\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010!R\u001f\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\"8\u0006¢\u0006\f\n\u0004\b:\u0010$\u001a\u0004\b;\u0010&R\u001c\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010!R\u001f\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\"8\u0006¢\u0006\f\n\u0004\b=\u0010$\u001a\u0004\b>\u0010&R\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010!R\u001f\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\"8\u0006¢\u0006\f\n\u0004\b@\u0010$\u001a\u0004\bA\u0010&¨\u0006E"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeRepository;", "addConsigneeRepository", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "ozonGeoProxyClient", "Lru/ozon/app/android/location/AreaLocalStore;", "areaLocalStore", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeRepository;Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;Lru/ozon/app/android/location/AreaLocalStore;)V", "", "onCleared", "()V", "", "kpp", "branch", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "addConsignee", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "allFieldsValid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "resetScreenState", "updateKpp", "(Ljava/lang/String;)V", "updateBranchName", "updateAddress", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeRepository;", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "Lru/ozon/app/android/location/AreaLocalStore;", "LAe/x0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$ScreenState;", "_screenState", "LAe/x0;", "LAe/M0;", "screenState", "LAe/M0;", "getScreenState", "()LAe/M0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$InputFieldError;", "_kppError", "kppError", "getKppError", "LAe/w0;", "_notFullAddressError", "LAe/w0;", "LAe/B0;", "notFullAddressError", "LAe/B0;", "getNotFullAddressError", "()LAe/B0;", "_hasBranchEmptyError", "hasBranchEmptyError", "getHasBranchEmptyError", "_hasAddressEmptyError", "hasAddressEmptyError", "getHasAddressEmptyError", "_kppInput", "kppInput", "getKppInput", "_branchInput", "branchInput", "getBranchInput", "_addressInput", "addressInput", "getAddressInput", "Companion", "InputFieldError", "ScreenState", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddConsigneeViewModel extends w0 {

    @NotNull
    private final x0<String> _addressInput;

    @NotNull
    private final x0<String> _branchInput;

    @NotNull
    private final Ae.w0<Boolean> _hasAddressEmptyError;

    @NotNull
    private final Ae.w0<Boolean> _hasBranchEmptyError;

    @NotNull
    private final x0<InputFieldError> _kppError;

    @NotNull
    private final x0<String> _kppInput;

    @NotNull
    private final Ae.w0<String> _notFullAddressError;

    @NotNull
    private final x0<ScreenState> _screenState;

    @NotNull
    private final AddConsigneeRepository addConsigneeRepository;

    @NotNull
    private final M0<String> addressInput;

    @NotNull
    private final AreaLocalStore areaLocalStore;

    @NotNull
    private final M0<String> branchInput;

    @NotNull
    private final B0<Boolean> hasAddressEmptyError;

    @NotNull
    private final B0<Boolean> hasBranchEmptyError;

    @NotNull
    private final M0<InputFieldError> kppError;

    @NotNull
    private final M0<String> kppInput;

    @NotNull
    private final B0<String> notFullAddressError;

    @NotNull
    private final OzonGeoProxyClient ozonGeoProxyClient;

    @NotNull
    private final M0<ScreenState> screenState;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$InputFieldError;", "", "<init>", "()V", "EmptyFieldError", "IncorrectFieldError", "AnotherFieldError", "None", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$InputFieldError$AnotherFieldError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$InputFieldError$EmptyFieldError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$InputFieldError$IncorrectFieldError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$InputFieldError$None;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class InputFieldError {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$InputFieldError$AnotherFieldError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$InputFieldError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AnotherFieldError extends InputFieldError {

            @NotNull
            public static final AnotherFieldError INSTANCE = new AnotherFieldError();

            private AnotherFieldError() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof AnotherFieldError);
            }

            public int hashCode() {
                return -693455241;
            }

            @NotNull
            public String toString() {
                return "AnotherFieldError";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$InputFieldError$EmptyFieldError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$InputFieldError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class EmptyFieldError extends InputFieldError {

            @NotNull
            public static final EmptyFieldError INSTANCE = new EmptyFieldError();

            private EmptyFieldError() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof EmptyFieldError);
            }

            public int hashCode() {
                return 733848001;
            }

            @NotNull
            public String toString() {
                return "EmptyFieldError";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$InputFieldError$IncorrectFieldError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$InputFieldError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class IncorrectFieldError extends InputFieldError {

            @NotNull
            public static final IncorrectFieldError INSTANCE = new IncorrectFieldError();

            private IncorrectFieldError() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof IncorrectFieldError);
            }

            public int hashCode() {
                return 1113678617;
            }

            @NotNull
            public String toString() {
                return "IncorrectFieldError";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$InputFieldError$None;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$InputFieldError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class None extends InputFieldError {

            @NotNull
            public static final None INSTANCE = new None();

            private None() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof None);
            }

            public int hashCode() {
                return 174089106;
            }

            @NotNull
            public String toString() {
                return "None";
            }
        }

        public /* synthetic */ InputFieldError(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private InputFieldError() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$ScreenState;", "", "<init>", "()V", "Idle", "Error", "ValidationError", "Success", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$ScreenState$Error;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$ScreenState$Idle;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$ScreenState$Success;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$ScreenState$ValidationError;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ScreenState {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$ScreenState$Error;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$ScreenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends ScreenState {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return -1520468965;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$ScreenState$Idle;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$ScreenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Idle extends ScreenState {

            @NotNull
            public static final Idle INSTANCE = new Idle();

            private Idle() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Idle);
            }

            public int hashCode() {
                return 643794785;
            }

            @NotNull
            public String toString() {
                return "Idle";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$ScreenState$Success;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$ScreenState;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends ScreenState {
            public static final int $stable = NotificationDTO.$stable;

            @NotNull
            private final NotificationDTO notification;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull NotificationDTO notification) {
                super(null);
                Intrinsics.checkNotNullParameter(notification, "notification");
                this.notification = notification;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.d(this.notification, ((Success) other).notification);
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
                return a.e("Success(notification=", ")", this.notification);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$ScreenState$ValidationError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$ScreenState;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ValidationError extends ScreenState {
            public static final int $stable = NotificationDTO.$stable;
            private final NotificationDTO notification;

            /* JADX WARN: Multi-variable type inference failed */
            public ValidationError() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ValidationError) && Intrinsics.d(this.notification, ((ValidationError) other).notification);
            }

            public final NotificationDTO getNotification() {
                return this.notification;
            }

            public int hashCode() {
                NotificationDTO notificationDTO = this.notification;
                if (notificationDTO == null) {
                    return 0;
                }
                return notificationDTO.hashCode();
            }

            @NotNull
            public String toString() {
                return a.e("ValidationError(notification=", ")", this.notification);
            }

            public ValidationError(NotificationDTO notificationDTO) {
                super(null);
                this.notification = notificationDTO;
            }

            public /* synthetic */ ValidationError(NotificationDTO notificationDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : notificationDTO);
            }
        }

        public /* synthetic */ ScreenState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ScreenState() {
        }
    }

    public AddConsigneeViewModel(@NotNull AddConsigneeRepository addConsigneeRepository, @NotNull OzonGeoProxyClient ozonGeoProxyClient, @NotNull AreaLocalStore areaLocalStore) {
        Intrinsics.checkNotNullParameter(addConsigneeRepository, "addConsigneeRepository");
        Intrinsics.checkNotNullParameter(ozonGeoProxyClient, "ozonGeoProxyClient");
        Intrinsics.checkNotNullParameter(areaLocalStore, "areaLocalStore");
        this.addConsigneeRepository = addConsigneeRepository;
        this.ozonGeoProxyClient = ozonGeoProxyClient;
        this.areaLocalStore = areaLocalStore;
        x0<ScreenState> a11 = O0.a(ScreenState.Idle.INSTANCE);
        this._screenState = a11;
        this.screenState = C2399j.b(a11);
        x0<InputFieldError> a12 = O0.a(InputFieldError.None.INSTANCE);
        this._kppError = a12;
        this.kppError = C2399j.b(a12);
        C0 b11 = E0.b(1, 0, null, 6);
        this._notFullAddressError = b11;
        this.notFullAddressError = C2399j.a(b11);
        C0 b12 = E0.b(1, 0, null, 6);
        this._hasBranchEmptyError = b12;
        this.hasBranchEmptyError = C2399j.a(b12);
        C0 b13 = E0.b(1, 0, null, 6);
        this._hasAddressEmptyError = b13;
        this.hasAddressEmptyError = C2399j.a(b13);
        x0<String> a13 = O0.a(null);
        this._kppInput = a13;
        this.kppInput = C2399j.b(a13);
        x0<String> a14 = O0.a(null);
        this._branchInput = a14;
        this.branchInput = C2399j.b(a14);
        x0<String> a15 = O0.a(null);
        this._addressInput = a15;
        this.addressInput = C2399j.b(a15);
        ozonGeoProxyClient.setAppName("b2b-bx-android", areaLocalStore.getLocationUid());
    }

    public static /* synthetic */ void addConsignee$default(AddConsigneeViewModel addConsigneeViewModel, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        addConsigneeViewModel.addConsignee(str, str2, str3);
    }

    public static /* synthetic */ boolean allFieldsValid$default(AddConsigneeViewModel addConsigneeViewModel, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        return addConsigneeViewModel.allFieldsValid(str, str2, str3);
    }

    public final void addConsignee(@NotNull String kpp, String branch, String address) {
        Intrinsics.checkNotNullParameter(kpp, "kpp");
        if (allFieldsValid(kpp, branch, address)) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AddConsigneeViewModel$addConsignee$1(this, kpp, branch, address, null), 3);
        }
    }

    public final boolean allFieldsValid(@NotNull String kpp, String branch, String address) {
        Intrinsics.checkNotNullParameter(kpp, "kpp");
        this._kppError.setValue(kpp.length() == 0 ? InputFieldError.EmptyFieldError.INSTANCE : kpp.length() < 9 ? InputFieldError.IncorrectFieldError.INSTANCE : InputFieldError.None.INSTANCE);
        boolean d11 = Intrinsics.d(this._kppError.getValue(), InputFieldError.None.INSTANCE);
        boolean z11 = branch != null && branch.length() == 0;
        boolean z12 = address != null && address.length() == 0;
        if (branch == null || address == null) {
            return d11;
        }
        this._hasBranchEmptyError.tryEmit(Boolean.valueOf(z11));
        this._hasAddressEmptyError.tryEmit(Boolean.valueOf(z12));
        return (!d11 || z11 || z12) ? false : true;
    }

    @NotNull
    public final M0<String> getAddressInput() {
        return this.addressInput;
    }

    @NotNull
    public final M0<String> getBranchInput() {
        return this.branchInput;
    }

    @NotNull
    public final B0<Boolean> getHasAddressEmptyError() {
        return this.hasAddressEmptyError;
    }

    @NotNull
    public final B0<Boolean> getHasBranchEmptyError() {
        return this.hasBranchEmptyError;
    }

    @NotNull
    public final M0<InputFieldError> getKppError() {
        return this.kppError;
    }

    @NotNull
    public final M0<String> getKppInput() {
        return this.kppInput;
    }

    @NotNull
    public final B0<String> getNotFullAddressError() {
        return this.notFullAddressError;
    }

    @NotNull
    public final M0<ScreenState> getScreenState() {
        return this.screenState;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.ozonGeoProxyClient.setAppName("ozonapp_android", this.areaLocalStore.getLocationUid());
    }

    public final void resetScreenState() {
        this._screenState.setValue(ScreenState.Idle.INSTANCE);
    }

    public final void updateAddress(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this._addressInput.setValue(address);
    }

    public final void updateBranchName(@NotNull String branch) {
        Intrinsics.checkNotNullParameter(branch, "branch");
        this._branchInput.setValue(branch);
        this._hasBranchEmptyError.tryEmit(Boolean.FALSE);
    }

    public final void updateKpp(@NotNull String branch) {
        Intrinsics.checkNotNullParameter(branch, "branch");
        this._kppInput.setValue(branch);
        this._kppError.setValue(InputFieldError.None.INSTANCE);
    }
}
