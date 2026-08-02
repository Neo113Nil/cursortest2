package com.vk.id.internal.auth;

import B0.A0;
import V.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/vk/id/internal/auth/AuthResult;", "", "<init>", "()V", "Success", "Canceled", "NoBrowserAvailable", "AuthActiviyResultFailed", "OAuth", "Lcom/vk/id/internal/auth/AuthResult$AuthActiviyResultFailed;", "Lcom/vk/id/internal/auth/AuthResult$Canceled;", "Lcom/vk/id/internal/auth/AuthResult$NoBrowserAvailable;", "Lcom/vk/id/internal/auth/AuthResult$Success;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class AuthResult {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH×\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/vk/id/internal/auth/AuthResult$AuthActiviyResultFailed;", "Lcom/vk/id/internal/auth/AuthResult;", "", "message", "", "error", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AuthActiviyResultFailed extends AuthResult {
        private final Throwable error;

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthActiviyResultFailed(@NotNull String message, Throwable th2) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.error = th2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthActiviyResultFailed)) {
                return false;
            }
            AuthActiviyResultFailed authActiviyResultFailed = (AuthActiviyResultFailed) other;
            return Intrinsics.d(this.message, authActiviyResultFailed.message) && Intrinsics.d(this.error, authActiviyResultFailed.error);
        }

        public final Throwable getError() {
            return this.error;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            Throwable th2 = this.error;
            return hashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @NotNull
        public String toString() {
            return "AuthActiviyResultFailed(message=" + this.message + ", error=" + this.error + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH×\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH×\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/vk/id/internal/auth/AuthResult$Canceled;", "Lcom/vk/id/internal/auth/AuthResult;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Canceled extends AuthResult {

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Canceled(@NotNull String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Canceled) && Intrinsics.d(this.message, ((Canceled) other).message);
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
            return A0.b("Canceled(message=", this.message, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH×\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/vk/id/internal/auth/AuthResult$NoBrowserAvailable;", "Lcom/vk/id/internal/auth/AuthResult;", "", "message", "", "error", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoBrowserAvailable extends AuthResult {
        private final Throwable error;

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoBrowserAvailable(@NotNull String message, Throwable th2) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.error = th2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoBrowserAvailable)) {
                return false;
            }
            NoBrowserAvailable noBrowserAvailable = (NoBrowserAvailable) other;
            return Intrinsics.d(this.message, noBrowserAvailable.message) && Intrinsics.d(this.error, noBrowserAvailable.error);
        }

        public final Throwable getError() {
            return this.error;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            Throwable th2 = this.error;
            return hashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @NotNull
        public String toString() {
            return "NoBrowserAvailable(message=" + this.message + ", error=" + this.error + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH×\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vk/id/internal/auth/AuthResult$OAuth;", "", "", "code", "state", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCode", "getState", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OAuth {

        @NotNull
        private final String code;

        @NotNull
        private final String state;

        public OAuth(@NotNull String code, @NotNull String state) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(state, "state");
            this.code = code;
            this.state = state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OAuth)) {
                return false;
            }
            OAuth oAuth = (OAuth) other;
            return Intrinsics.d(this.code, oAuth.code) && Intrinsics.d(this.state, oAuth.state);
        }

        @NotNull
        public final String getCode() {
            return this.code;
        }

        @NotNull
        public final String getState() {
            return this.state;
        }

        public int hashCode() {
            return this.state.hashCode() + (this.code.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("OAuth(code=", this.code, ", state=", this.state, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH×\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/vk/id/internal/auth/AuthResult$Success;", "Lcom/vk/id/internal/auth/AuthResult;", "Lcom/vk/id/internal/auth/AuthResult$OAuth;", "oauth", "", "deviceId", "<init>", "(Lcom/vk/id/internal/auth/AuthResult$OAuth;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/vk/id/internal/auth/AuthResult$OAuth;", "getOauth", "()Lcom/vk/id/internal/auth/AuthResult$OAuth;", "Ljava/lang/String;", "getDeviceId", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends AuthResult {

        @NotNull
        private final String deviceId;
        private final OAuth oauth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(OAuth oAuth, @NotNull String deviceId) {
            super(null);
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            this.oauth = oAuth;
            this.deviceId = deviceId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.d(this.oauth, success.oauth) && Intrinsics.d(this.deviceId, success.deviceId);
        }

        @NotNull
        public final String getDeviceId() {
            return this.deviceId;
        }

        public final OAuth getOauth() {
            return this.oauth;
        }

        public int hashCode() {
            OAuth oAuth = this.oauth;
            return this.deviceId.hashCode() + ((oAuth == null ? 0 : oAuth.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "Success(oauth=" + this.oauth + ", deviceId=" + this.deviceId + ")";
        }
    }

    public /* synthetic */ AuthResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AuthResult() {
    }
}
