package ru.ozon.app.android.session.auth.data;

import B0.A0;
import N3.C3660k;
import Nh.a;
import T7.P;
import V.e;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.session.models.BiometricDialogConfig;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/session/auth/data/Action;", "", "<init>", "()V", "SilentReload", "Completed", "Error", "Reload", "Redirect", "BiometryDialog", "AuthDialog", "SberLogin", "SequentialDialog", "Progress", "Lru/ozon/app/android/session/auth/data/Action$AuthDialog;", "Lru/ozon/app/android/session/auth/data/Action$BiometryDialog;", "Lru/ozon/app/android/session/auth/data/Action$Completed;", "Lru/ozon/app/android/session/auth/data/Action$Error;", "Lru/ozon/app/android/session/auth/data/Action$Progress;", "Lru/ozon/app/android/session/auth/data/Action$Redirect;", "Lru/ozon/app/android/session/auth/data/Action$Reload;", "Lru/ozon/app/android/session/auth/data/Action$SberLogin;", "Lru/ozon/app/android/session/auth/data/Action$SequentialDialog;", "Lru/ozon/app/android/session/auth/data/Action$SilentReload;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Action {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/session/auth/data/Action$AuthDialog;", "Lru/ozon/app/android/session/auth/data/Action;", "", "action", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAction", "getMessage", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AuthDialog extends Action {

        @NotNull
        private final String action;

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthDialog(@NotNull String action, @NotNull String message) {
            super(null);
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(message, "message");
            this.action = action;
            this.message = message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthDialog)) {
                return false;
            }
            AuthDialog authDialog = (AuthDialog) other;
            return Intrinsics.d(this.action, authDialog.action) && Intrinsics.d(this.message, authDialog.message);
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode() + (this.action.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("AuthDialog(action=", this.action, ", message=", this.message, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/session/auth/data/Action$BiometryDialog;", "Lru/ozon/app/android/session/auth/data/Action;", "Lru/ozon/app/android/domain/session/models/BiometricDialogConfig;", "biometricDialogConfig", "<init>", "(Lru/ozon/app/android/domain/session/models/BiometricDialogConfig;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/domain/session/models/BiometricDialogConfig;", "getBiometricDialogConfig", "()Lru/ozon/app/android/domain/session/models/BiometricDialogConfig;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BiometryDialog extends Action {

        @NotNull
        private final BiometricDialogConfig biometricDialogConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BiometryDialog(@NotNull BiometricDialogConfig biometricDialogConfig) {
            super(null);
            Intrinsics.checkNotNullParameter(biometricDialogConfig, "biometricDialogConfig");
            this.biometricDialogConfig = biometricDialogConfig;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BiometryDialog) && Intrinsics.d(this.biometricDialogConfig, ((BiometryDialog) other).biometricDialogConfig);
        }

        @NotNull
        public final BiometricDialogConfig getBiometricDialogConfig() {
            return this.biometricDialogConfig;
        }

        public int hashCode() {
            return this.biometricDialogConfig.hashCode();
        }

        @NotNull
        public String toString() {
            return "BiometryDialog(biometricDialogConfig=" + this.biometricDialogConfig + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/session/auth/data/Action$Completed;", "Lru/ozon/app/android/session/auth/data/Action;", "", "deeplink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Completed extends Action {
        private final String deeplink;

        public Completed(String str) {
            super(null);
            this.deeplink = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Completed) && Intrinsics.d(this.deeplink, ((Completed) other).deeplink);
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public int hashCode() {
            String str = this.deeplink;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Completed(deeplink=", this.deeplink, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/session/auth/data/Action$Error;", "Lru/ozon/app/android/session/auth/data/Action;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends Action {
        private final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.d(this.message, ((Error) other).message);
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
            return A0.b("Error(message=", this.message, ")");
        }

        public Error(String str) {
            super(null);
            this.message = str;
        }

        public /* synthetic */ Error(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/session/auth/data/Action$Progress;", "Lru/ozon/app/android/session/auth/data/Action;", "<init>", "()V", "Show", "Hide", "Lru/ozon/app/android/session/auth/data/Action$Progress$Hide;", "Lru/ozon/app/android/session/auth/data/Action$Progress$Show;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Progress extends Action {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/session/auth/data/Action$Progress$Hide;", "Lru/ozon/app/android/session/auth/data/Action$Progress;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Hide extends Progress {

            @NotNull
            public static final Hide INSTANCE = new Hide();

            private Hide() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Hide);
            }

            public int hashCode() {
                return -686752602;
            }

            @NotNull
            public String toString() {
                return "Hide";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/session/auth/data/Action$Progress$Show;", "Lru/ozon/app/android/session/auth/data/Action$Progress;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Show extends Progress {

            @NotNull
            public static final Show INSTANCE = new Show();

            private Show() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Show);
            }

            public int hashCode() {
                return -686425503;
            }

            @NotNull
            public String toString() {
                return "Show";
            }
        }

        public /* synthetic */ Progress(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Progress() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/session/auth/data/Action$Redirect;", "Lru/ozon/app/android/session/auth/data/Action;", "", "deeplink", "", "", "postData", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "Ljava/util/Map;", "getPostData", "()Ljava/util/Map;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Redirect extends Action {
        private final String deeplink;
        private final Map<String, Object> postData;

        public Redirect(String str, Map<String, ? extends Object> map) {
            super(null);
            this.deeplink = str;
            this.postData = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Redirect)) {
                return false;
            }
            Redirect redirect = (Redirect) other;
            return Intrinsics.d(this.deeplink, redirect.deeplink) && Intrinsics.d(this.postData, redirect.postData);
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final Map<String, Object> getPostData() {
            return this.postData;
        }

        public int hashCode() {
            String str = this.deeplink;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Map<String, Object> map = this.postData;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return a.d("Redirect(deeplink=", this.deeplink, ", postData=", ")", this.postData);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/session/auth/data/Action$Reload;", "Lru/ozon/app/android/session/auth/data/Action;", "", "deeplink", "message", "", "", "postData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "getMessage", "Ljava/util/Map;", "getPostData", "()Ljava/util/Map;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Reload extends Action {
        private final String deeplink;
        private final String message;
        private final Map<String, Object> postData;

        public Reload(String str, String str2, Map<String, ? extends Object> map) {
            super(null);
            this.deeplink = str;
            this.message = str2;
            this.postData = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Reload)) {
                return false;
            }
            Reload reload = (Reload) other;
            return Intrinsics.d(this.deeplink, reload.deeplink) && Intrinsics.d(this.message, reload.message) && Intrinsics.d(this.postData, reload.postData);
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getMessage() {
            return this.message;
        }

        public final Map<String, Object> getPostData() {
            return this.postData;
        }

        public int hashCode() {
            String str = this.deeplink;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.message;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, Object> map = this.postData;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.deeplink;
            String str2 = this.message;
            return P.f(C3660k.d("Reload(deeplink=", str, ", message=", str2, ", postData="), this.postData, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/session/auth/data/Action$SberLogin;", "Lru/ozon/app/android/session/auth/data/Action;", "", ImagesContract.URL, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SberLogin extends Action {

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SberLogin(@NotNull String url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SberLogin) && Intrinsics.d(this.url, ((SberLogin) other).url);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("SberLogin(url=", this.url, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/session/auth/data/Action$SequentialDialog;", "Lru/ozon/app/android/session/auth/data/Action;", "", "action", "Lru/ozon/app/android/domain/session/models/BiometricDialogConfig;", "biometricConfig", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/domain/session/models/BiometricDialogConfig;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAction", "Lru/ozon/app/android/domain/session/models/BiometricDialogConfig;", "getBiometricConfig", "()Lru/ozon/app/android/domain/session/models/BiometricDialogConfig;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SequentialDialog extends Action {
        private final String action;
        private final BiometricDialogConfig biometricConfig;

        public SequentialDialog(String str, BiometricDialogConfig biometricDialogConfig) {
            super(null);
            this.action = str;
            this.biometricConfig = biometricDialogConfig;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SequentialDialog)) {
                return false;
            }
            SequentialDialog sequentialDialog = (SequentialDialog) other;
            return Intrinsics.d(this.action, sequentialDialog.action) && Intrinsics.d(this.biometricConfig, sequentialDialog.biometricConfig);
        }

        public final BiometricDialogConfig getBiometricConfig() {
            return this.biometricConfig;
        }

        public int hashCode() {
            String str = this.action;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            BiometricDialogConfig biometricDialogConfig = this.biometricConfig;
            return hashCode + (biometricDialogConfig != null ? biometricDialogConfig.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SequentialDialog(action=" + this.action + ", biometricConfig=" + this.biometricConfig + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/session/auth/data/Action$SilentReload;", "Lru/ozon/app/android/session/auth/data/Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SilentReload extends Action {

        @NotNull
        public static final SilentReload INSTANCE = new SilentReload();

        private SilentReload() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SilentReload);
        }

        public int hashCode() {
            return 357809611;
        }

        @NotNull
        public String toString() {
            return "SilentReload";
        }
    }

    public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Action() {
    }
}
