package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDeleteConsignee;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDeleteConsignee.data.B2bDeleteConsigneeRepository;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDeleteConsignee/B2bDeleteConsigneeViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDeleteConsignee/data/B2bDeleteConsigneeRepository;", "repository", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDeleteConsignee/data/B2bDeleteConsigneeRepository;)V", "", "actionName", "id", "", "deleteConsignee", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDeleteConsignee/data/B2bDeleteConsigneeRepository;", "LAe/x0;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDeleteConsignee/B2bDeleteConsigneeViewModel$ScreenState;", "_screenState", "LAe/x0;", "LAe/M0;", "screenState", "LAe/M0;", "getScreenState", "()LAe/M0;", "ScreenState", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bDeleteConsigneeViewModel extends w0 {

    @NotNull
    private final x0<ScreenState> _screenState;

    @NotNull
    private final B2bDeleteConsigneeRepository repository;

    @NotNull
    private final M0<ScreenState> screenState;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDeleteConsignee/B2bDeleteConsigneeViewModel$ScreenState;", "", "<init>", "()V", "Idle", "Error", "Success", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDeleteConsignee/B2bDeleteConsigneeViewModel$ScreenState$Error;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDeleteConsignee/B2bDeleteConsigneeViewModel$ScreenState$Idle;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDeleteConsignee/B2bDeleteConsigneeViewModel$ScreenState$Success;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ScreenState {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDeleteConsignee/B2bDeleteConsigneeViewModel$ScreenState$Error;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDeleteConsignee/B2bDeleteConsigneeViewModel$ScreenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
                return -211542499;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDeleteConsignee/B2bDeleteConsigneeViewModel$ScreenState$Idle;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDeleteConsignee/B2bDeleteConsigneeViewModel$ScreenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
                return 270376223;
            }

            @NotNull
            public String toString() {
                return "Idle";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDeleteConsignee/B2bDeleteConsigneeViewModel$ScreenState$Success;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDeleteConsignee/B2bDeleteConsigneeViewModel$ScreenState;", "", "isSuccess", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "<init>", "(ZLru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends ScreenState {
            public static final int $stable = NotificationDTO.$stable;
            private final boolean isSuccess;

            @NotNull
            private final NotificationDTO notification;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(boolean z11, @NotNull NotificationDTO notification) {
                super(null);
                Intrinsics.checkNotNullParameter(notification, "notification");
                this.isSuccess = z11;
                this.notification = notification;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return this.isSuccess == success.isSuccess && Intrinsics.d(this.notification, success.notification);
            }

            @NotNull
            public final NotificationDTO getNotification() {
                return this.notification;
            }

            public int hashCode() {
                return this.notification.hashCode() + (Boolean.hashCode(this.isSuccess) * 31);
            }

            /* renamed from: isSuccess, reason: from getter */
            public final boolean getIsSuccess() {
                return this.isSuccess;
            }

            @NotNull
            public String toString() {
                return "Success(isSuccess=" + this.isSuccess + ", notification=" + this.notification + ")";
            }
        }

        public /* synthetic */ ScreenState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ScreenState() {
        }
    }

    public B2bDeleteConsigneeViewModel(@NotNull B2bDeleteConsigneeRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        x0<ScreenState> a11 = O0.a(ScreenState.Idle.INSTANCE);
        this._screenState = a11;
        this.screenState = C2399j.b(a11);
    }

    public final void deleteConsignee(@NotNull String actionName, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(id2, "id");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new B2bDeleteConsigneeViewModel$deleteConsignee$1(this, actionName, id2, null), 3);
    }

    @NotNull
    public final M0<ScreenState> getScreenState() {
        return this.screenState;
    }
}
