package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import B90.C2618u;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.data.B2bResetEdoVerificationRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.AddEdoStatusStorage;
import xe.C10727i;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/B2bResetEdoVerificationViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/data/B2bResetEdoVerificationRepository;", "repository", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/AddEdoStatusStorage;", "addEdoStatusStorage", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/data/B2bResetEdoVerificationRepository;Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/AddEdoStatusStorage;)V", "", "actionName", "id", "", "resetVerificationRequest", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/data/B2bResetEdoVerificationRepository;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/AddEdoStatusStorage;", "LAe/x0;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/B2bResetEdoVerificationViewModel$ScreenState;", "_screenState", "LAe/x0;", "LAe/M0;", "screenState", "LAe/M0;", "getScreenState", "()LAe/M0;", "ScreenState", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bResetEdoVerificationViewModel extends w0 {

    @NotNull
    private final x0<ScreenState> _screenState;

    @NotNull
    private final AddEdoStatusStorage addEdoStatusStorage;

    @NotNull
    private final B2bResetEdoVerificationRepository repository;

    @NotNull
    private final M0<ScreenState> screenState;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/B2bResetEdoVerificationViewModel$ScreenState;", "", "<init>", "()V", "Idle", "Error", "Success", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/B2bResetEdoVerificationViewModel$ScreenState$Error;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/B2bResetEdoVerificationViewModel$ScreenState$Idle;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/B2bResetEdoVerificationViewModel$ScreenState$Success;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ScreenState {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/B2bResetEdoVerificationViewModel$ScreenState$Error;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/B2bResetEdoVerificationViewModel$ScreenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
                return -924309987;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/B2bResetEdoVerificationViewModel$ScreenState$Idle;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/B2bResetEdoVerificationViewModel$ScreenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
                return -168258273;
            }

            @NotNull
            public String toString() {
                return "Idle";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/B2bResetEdoVerificationViewModel$ScreenState$Success;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/B2bResetEdoVerificationViewModel$ScreenState;", "", "isSuccess", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends ScreenState {
            private final boolean isSuccess;

            public Success(boolean z11) {
                super(null);
                this.isSuccess = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && this.isSuccess == ((Success) other).isSuccess;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isSuccess);
            }

            /* renamed from: isSuccess, reason: from getter */
            public final boolean getIsSuccess() {
                return this.isSuccess;
            }

            @NotNull
            public String toString() {
                return C2618u.g("Success(isSuccess=", ")", this.isSuccess);
            }
        }

        public /* synthetic */ ScreenState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ScreenState() {
        }
    }

    public B2bResetEdoVerificationViewModel(@NotNull B2bResetEdoVerificationRepository repository, @NotNull AddEdoStatusStorage addEdoStatusStorage) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(addEdoStatusStorage, "addEdoStatusStorage");
        this.repository = repository;
        this.addEdoStatusStorage = addEdoStatusStorage;
        x0<ScreenState> a11 = O0.a(ScreenState.Idle.INSTANCE);
        this._screenState = a11;
        this.screenState = C2399j.b(a11);
    }

    @NotNull
    public final M0<ScreenState> getScreenState() {
        return this.screenState;
    }

    public final void resetVerificationRequest(@NotNull String actionName, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(id2, "id");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new B2bResetEdoVerificationViewModel$resetVerificationRequest$1(this, actionName, id2, null), 3);
    }
}
