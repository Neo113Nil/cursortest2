package ru.ozon.fintech.notifications.models;

import V.e;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/notifications/models/NotificationGwt3dsBody;", "", "deviceId", "", "jwt", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "getJwt", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "fintech-notifications_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NotificationGwt3dsBody {
    private final String deviceId;
    private final String jwt;

    public NotificationGwt3dsBody(@i(name = "deviceId") String str, @i(name = "jwt") String str2) {
        this.deviceId = str;
        this.jwt = str2;
    }

    public static /* synthetic */ NotificationGwt3dsBody copy$default(NotificationGwt3dsBody notificationGwt3dsBody, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = notificationGwt3dsBody.deviceId;
        }
        if ((i11 & 2) != 0) {
            str2 = notificationGwt3dsBody.jwt;
        }
        return notificationGwt3dsBody.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getJwt() {
        return this.jwt;
    }

    @NotNull
    public final NotificationGwt3dsBody copy(@i(name = "deviceId") String deviceId, @i(name = "jwt") String jwt) {
        return new NotificationGwt3dsBody(deviceId, jwt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationGwt3dsBody)) {
            return false;
        }
        NotificationGwt3dsBody notificationGwt3dsBody = (NotificationGwt3dsBody) other;
        return Intrinsics.d(this.deviceId, notificationGwt3dsBody.deviceId) && Intrinsics.d(this.jwt, notificationGwt3dsBody.jwt);
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getJwt() {
        return this.jwt;
    }

    public int hashCode() {
        String str = this.deviceId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.jwt;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return e.a("NotificationGwt3dsBody(deviceId=", this.deviceId, ", jwt=", this.jwt, ")");
    }
}
