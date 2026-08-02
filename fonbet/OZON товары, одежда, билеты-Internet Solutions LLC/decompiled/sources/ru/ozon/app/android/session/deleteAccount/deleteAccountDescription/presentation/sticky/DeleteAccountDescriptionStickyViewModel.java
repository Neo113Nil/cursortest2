package ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky;

import B0.A0;
import V.e;
import androidx.lifecycle.P;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0017\u0018J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel;", "", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyVO;", "vo", "", "bind", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyVO;)V", "", "link", "deleteAccount", "(Ljava/lang/String;)V", "id", "input", "textUpdated", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action;", "getAction", "()Landroidx/lifecycle/P;", "action", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$State;", "getState", "state", "Action", "State", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DeleteAccountDescriptionStickyViewModel {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action;", "", "<init>", "()V", "Loading", "Navigate", "Restriction", "FieldError", "Reload", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action$FieldError;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action$Loading;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action$Navigate;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action$Reload;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action$Restriction;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action$FieldError;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action;", "", "fieldId", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFieldId", "getMessage", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FieldError extends Action {

            @NotNull
            private final String fieldId;
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FieldError(@NotNull String fieldId, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(fieldId, "fieldId");
                this.fieldId = fieldId;
                this.message = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FieldError)) {
                    return false;
                }
                FieldError fieldError = (FieldError) other;
                return Intrinsics.d(this.fieldId, fieldError.fieldId) && Intrinsics.d(this.message, fieldError.message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                int hashCode = this.fieldId.hashCode() * 31;
                String str = this.message;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return e.a("FieldError(fieldId=", this.fieldId, ", message=", this.message, ")");
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action$Loading;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
                return 1450897229;
            }

            @NotNull
            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action$Navigate;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action;", "", "deeplink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action$Reload;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action;", "", "deeplink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Reload extends Action {

            @NotNull
            private final String deeplink;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Reload(@NotNull String deeplink) {
                super(null);
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.deeplink = deeplink;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Reload) && Intrinsics.d(this.deeplink, ((Reload) other).deeplink);
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
                return A0.b("Reload(deeplink=", this.deeplink, ")");
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action$Restriction;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Restriction extends Action {
            private final String message;

            /* JADX WARN: Multi-variable type inference failed */
            public Restriction() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Restriction) && Intrinsics.d(this.message, ((Restriction) other).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                String str = this.message;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Restriction(message=", this.message, ")");
            }

            public Restriction(String str) {
                super(null);
                this.message = str;
            }

            public /* synthetic */ Restriction(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str);
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$State;", "", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyVO;", "data", "", "isSilent", "<init>", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyVO;Z)V", "copy", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyVO;Z)Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$State;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyVO;", "getData", "()Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyVO;", "Z", "()Z", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class State {
        public static final int $stable = ButtonV3Atom.LargeButton.$stable;

        @NotNull
        private final DeleteAccountDescriptionStickyVO data;
        private final boolean isSilent;

        public State(@NotNull DeleteAccountDescriptionStickyVO data, boolean z11) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
            this.isSilent = z11;
        }

        @NotNull
        public final State copy(@NotNull DeleteAccountDescriptionStickyVO data, boolean isSilent) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new State(data, isSilent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.d(this.data, state.data) && this.isSilent == state.isSilent;
        }

        @NotNull
        public final DeleteAccountDescriptionStickyVO getData() {
            return this.data;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSilent) + (this.data.hashCode() * 31);
        }

        /* renamed from: isSilent, reason: from getter */
        public final boolean getIsSilent() {
            return this.isSilent;
        }

        @NotNull
        public String toString() {
            return "State(data=" + this.data + ", isSilent=" + this.isSilent + ")";
        }
    }

    void bind(@NotNull DeleteAccountDescriptionStickyVO vo);

    void deleteAccount(@NotNull String link);

    @NotNull
    P<Action> getAction();

    @NotNull
    P<State> getState();

    void textUpdated(@NotNull String id2, @NotNull String input);
}
