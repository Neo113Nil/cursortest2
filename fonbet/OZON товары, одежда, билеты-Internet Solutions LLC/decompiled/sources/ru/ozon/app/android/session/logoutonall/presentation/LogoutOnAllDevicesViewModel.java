package ru.ozon.app.android.session.logoutonall.presentation;

import B90.C2618u;
import W10.c;
import androidx.lifecycle.P;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H&¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel;", "", "", "actionName", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "onConfirmClick", "(Ljava/lang/String;LW10/c;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel$Action;", "getActionLiveData", "()Landroidx/lifecycle/P;", "actionLiveData", "Action", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface LogoutOnAllDevicesViewModel {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel$Action;", "", "<init>", "()V", "Error", "ToHome", "Loading", "Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel$Action$Error;", "Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel$Action$Loading;", "Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel$Action$ToHome;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel$Action$Error;", "Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends Action {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return 353163744;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel$Action$Loading;", "Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel$Action;", "", "loading", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getLoading", "()Z", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading extends Action {
            private final boolean loading;

            public Loading(boolean z11) {
                super(null);
                this.loading = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && this.loading == ((Loading) other).loading;
            }

            public final boolean getLoading() {
                return this.loading;
            }

            public int hashCode() {
                return Boolean.hashCode(this.loading);
            }

            @NotNull
            public String toString() {
                return C2618u.g("Loading(loading=", ")", this.loading);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel$Action$ToHome;", "Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ToHome extends Action {

            @NotNull
            public static final ToHome INSTANCE = new ToHome();

            private ToHome() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ToHome);
            }

            public int hashCode() {
                return -1511410398;
            }

            @NotNull
            public String toString() {
                return "ToHome";
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @NotNull
    P<Action> getActionLiveData();

    void onConfirmClick(@NotNull String actionName, @NotNull c trackingData);
}
