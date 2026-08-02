package ru.ozon.app.android.session.deleteAccount.data;

import C.o0;
import G.g;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApiResponse;", "", "status", "Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApiResponse$Status;", "error", "Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApiResponse$Error;", "<init>", "(Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApiResponse$Status;Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApiResponse$Error;)V", "getStatus", "()Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApiResponse$Status;", "getError", "()Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApiResponse$Error;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Status", "Error", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DeleteAccountApiResponse {
    public static final int $stable = 0;
    private final Error error;

    @NotNull
    private final Status status;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApiResponse$Error;", "", "type", "", "message", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getMessage", "getDeeplink", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Error {
        public static final int $stable = 0;

        @NotNull
        public static final String TYPE_RELOAD = "reload";

        @NotNull
        public static final String TYPE_RESTRICTION = "restriction";

        @NotNull
        public static final String TYPE_VALIDATION = "validation";
        private final String deeplink;

        @NotNull
        private final String message;

        @NotNull
        private final String type;

        public Error(@NotNull String type, @NotNull String message, String str) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(message, "message");
            this.type = type;
            this.message = message;
            this.deeplink = str;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = error.type;
            }
            if ((i11 & 2) != 0) {
                str2 = error.message;
            }
            if ((i11 & 4) != 0) {
                str3 = error.deeplink;
            }
            return error.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final Error copy(@NotNull String type, @NotNull String message, String deeplink) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(message, "message");
            return new Error(type, message, deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.d(this.type, error.type) && Intrinsics.d(this.message, error.message) && Intrinsics.d(this.deeplink, error.deeplink);
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int a11 = g.a(this.type.hashCode() * 31, 31, this.message);
            String str = this.deeplink;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.type;
            String str2 = this.message;
            return o0.c(C3660k.d("Error(type=", str, ", message=", str2, ", deeplink="), this.deeplink, ")");
        }
    }

    public DeleteAccountApiResponse(@NotNull Status status, Error error) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.error = error;
    }

    public static /* synthetic */ DeleteAccountApiResponse copy$default(DeleteAccountApiResponse deleteAccountApiResponse, Status status, Error error, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            status = deleteAccountApiResponse.status;
        }
        if ((i11 & 2) != 0) {
            error = deleteAccountApiResponse.error;
        }
        return deleteAccountApiResponse.copy(status, error);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final Error getError() {
        return this.error;
    }

    @NotNull
    public final DeleteAccountApiResponse copy(@NotNull Status status, Error error) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new DeleteAccountApiResponse(status, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteAccountApiResponse)) {
            return false;
        }
        DeleteAccountApiResponse deleteAccountApiResponse = (DeleteAccountApiResponse) other;
        return Intrinsics.d(this.status, deleteAccountApiResponse.status) && Intrinsics.d(this.error, deleteAccountApiResponse.error);
    }

    public final Error getError() {
        return this.error;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        Error error = this.error;
        return hashCode + (error == null ? 0 : error.hashCode());
    }

    @NotNull
    public String toString() {
        return "DeleteAccountApiResponse(status=" + this.status + ", error=" + this.error + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApiResponse$Status;", "", "isCompleted", "", "deeplink", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getDeeplink", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Status {
        public static final int $stable = 0;

        @NotNull
        private final String deeplink;
        private final boolean isCompleted;

        public Status(boolean z11, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.isCompleted = z11;
            this.deeplink = deeplink;
        }

        public static /* synthetic */ Status copy$default(Status status, boolean z11, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = status.isCompleted;
            }
            if ((i11 & 2) != 0) {
                str = status.deeplink;
            }
            return status.copy(z11, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCompleted() {
            return this.isCompleted;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final Status copy(boolean isCompleted, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new Status(isCompleted, deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Status)) {
                return false;
            }
            Status status = (Status) other;
            return this.isCompleted == status.isCompleted && Intrinsics.d(this.deeplink, status.deeplink);
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        public int hashCode() {
            return this.deeplink.hashCode() + (Boolean.hashCode(this.isCompleted) * 31);
        }

        public final boolean isCompleted() {
            return this.isCompleted;
        }

        @NotNull
        public String toString() {
            return "Status(isCompleted=" + this.isCompleted + ", deeplink=" + this.deeplink + ")";
        }

        public /* synthetic */ Status(boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, str);
        }
    }
}
