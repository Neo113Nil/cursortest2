package com.vk.id.auth;

import V.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/vk/id/auth/AuthCodeData;", "", "code", "", "deviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDeviceId", "equals", "", "other", "hashCode", "", "toString", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AuthCodeData {

    @NotNull
    private final String code;

    @NotNull
    private final String deviceId;

    public AuthCodeData(@NotNull String code, @NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        this.code = code;
        this.deviceId = deviceId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!AuthCodeData.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type com.vk.id.auth.AuthCodeData");
        AuthCodeData authCodeData = (AuthCodeData) other;
        return Intrinsics.d(this.code, authCodeData.code) && Intrinsics.d(this.deviceId, authCodeData.deviceId);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public int hashCode() {
        return this.deviceId.hashCode() + (this.code.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("AuthCodeData(code='", this.code, "', deviceId='", this.deviceId, "')");
    }
}
