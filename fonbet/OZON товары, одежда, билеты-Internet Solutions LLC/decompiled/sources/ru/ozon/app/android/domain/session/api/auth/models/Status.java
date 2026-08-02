package ru.ozon.app.android.domain.session.api.auth.models;

import I0.C3173b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/domain/session/api/auth/models/Status;", "", "deeplink", "", "isCompleted", "", "message", "otpToken", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessage", "getOtpToken", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/domain/session/api/auth/models/Status;", "equals", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Status {
    private final String deeplink;
    private final Boolean isCompleted;
    private final String message;
    private final String otpToken;

    public Status(String str, Boolean bool, String str2, String str3) {
        this.deeplink = str;
        this.isCompleted = bool;
        this.message = str2;
        this.otpToken = str3;
    }

    public static /* synthetic */ Status copy$default(Status status, String str, Boolean bool, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = status.deeplink;
        }
        if ((i11 & 2) != 0) {
            bool = status.isCompleted;
        }
        if ((i11 & 4) != 0) {
            str2 = status.message;
        }
        if ((i11 & 8) != 0) {
            str3 = status.otpToken;
        }
        return status.copy(str, bool, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsCompleted() {
        return this.isCompleted;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOtpToken() {
        return this.otpToken;
    }

    @NotNull
    public final Status copy(String deeplink, Boolean isCompleted, String message, String otpToken) {
        return new Status(deeplink, isCompleted, message, otpToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Status)) {
            return false;
        }
        Status status = (Status) other;
        return Intrinsics.d(this.deeplink, status.deeplink) && Intrinsics.d(this.isCompleted, status.isCompleted) && Intrinsics.d(this.message, status.message) && Intrinsics.d(this.otpToken, status.otpToken);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getOtpToken() {
        return this.otpToken;
    }

    public int hashCode() {
        String str = this.deeplink;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isCompleted;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.message;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.otpToken;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Boolean isCompleted() {
        return this.isCompleted;
    }

    @NotNull
    public String toString() {
        String str = this.deeplink;
        Boolean bool = this.isCompleted;
        String str2 = this.message;
        String str3 = this.otpToken;
        StringBuilder sb2 = new StringBuilder("Status(deeplink=");
        sb2.append(str);
        sb2.append(", isCompleted=");
        sb2.append(bool);
        sb2.append(", message=");
        return C3173b.c(sb2, str2, ", otpToken=", str3, ")");
    }
}
