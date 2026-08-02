package ru.ozon.app.android.session.deleteAccount.deleteAccountButton.presentation;

import B0.A0;
import androidx.lifecycle.P;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel;", "", "", "actionName", "", "deleteAccountStartRequest", "(Ljava/lang/String;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel$Action;", "getAction", "()Landroidx/lifecycle/P;", "action", "Action", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DeleteAccountButtonViewModel {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel$Action;", "", "<init>", "()V", "ShowLoading", "HideLoading", "Restriction", "Navigate", "NavigateBottomSheet", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel$Action$HideLoading;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel$Action$Navigate;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel$Action$NavigateBottomSheet;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel$Action$Restriction;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel$Action$ShowLoading;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel$Action$HideLoading;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class HideLoading extends Action {

            @NotNull
            public static final HideLoading INSTANCE = new HideLoading();

            private HideLoading() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof HideLoading);
            }

            public int hashCode() {
                return -546474833;
            }

            @NotNull
            public String toString() {
                return "HideLoading";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel$Action$Navigate;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel$Action;", "", "deeplink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Navigate extends Action {

            @NotNull
            private final String deeplink;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Navigate(@NotNull String deeplink) {
                super(null);
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.deeplink = deeplink;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Navigate) && Intrinsics.d(this.deeplink, ((Navigate) other).deeplink);
            }

            @NotNull
            public final String getDeeplink() {
                return this.deeplink;
            }

            public int hashCode() {
                return this.deeplink.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Navigate(deeplink=", this.deeplink, ")");
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel$Action$NavigateBottomSheet;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel$Action;", "", "deeplink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NavigateBottomSheet extends Action {

            @NotNull
            private final String deeplink;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateBottomSheet(@NotNull String deeplink) {
                super(null);
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.deeplink = deeplink;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateBottomSheet) && Intrinsics.d(this.deeplink, ((NavigateBottomSheet) other).deeplink);
            }

            @NotNull
            public final String getDeeplink() {
                return this.deeplink;
            }

            public int hashCode() {
                return this.deeplink.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("NavigateBottomSheet(deeplink=", this.deeplink, ")");
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel$Action$Restriction;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel$Action;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Restriction extends Action {

            @NotNull
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Restriction(@NotNull String message) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Restriction) && Intrinsics.d(this.message, ((Restriction) other).message);
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
                return A0.b("Restriction(message=", this.message, ")");
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel$Action$ShowLoading;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowLoading extends Action {

            @NotNull
            public static final ShowLoading INSTANCE = new ShowLoading();

            private ShowLoading() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowLoading);
            }

            public int hashCode() {
                return -37904748;
            }

            @NotNull
            public String toString() {
                return "ShowLoading";
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    void deleteAccountStartRequest(@NotNull String actionName);

    @NotNull
    P<Action> getAction();
}
