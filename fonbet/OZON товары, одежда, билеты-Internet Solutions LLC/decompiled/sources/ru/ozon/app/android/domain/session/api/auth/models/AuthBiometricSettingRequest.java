package ru.ozon.app.android.domain.session.api.auth.models;

import C.o0;
import Kk.C3532b;
import Ve.C4636t5;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/domain/session/api/auth/models/AuthBiometricSettingRequest;", "", "deviceId", "", "isBiometryEnabled", "", "analyticTag", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "()Z", "getAnalyticTag", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AuthBiometricSettingRequest {

    @NotNull
    private final String analyticTag;

    @NotNull
    private final String deviceId;
    private final boolean isBiometryEnabled;

    public AuthBiometricSettingRequest(@NotNull String deviceId, boolean z11, @NotNull String analyticTag) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(analyticTag, "analyticTag");
        this.deviceId = deviceId;
        this.isBiometryEnabled = z11;
        this.analyticTag = analyticTag;
    }

    public static /* synthetic */ AuthBiometricSettingRequest copy$default(AuthBiometricSettingRequest authBiometricSettingRequest, String str, boolean z11, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = authBiometricSettingRequest.deviceId;
        }
        if ((i11 & 2) != 0) {
            z11 = authBiometricSettingRequest.isBiometryEnabled;
        }
        if ((i11 & 4) != 0) {
            str2 = authBiometricSettingRequest.analyticTag;
        }
        return authBiometricSettingRequest.copy(str, z11, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsBiometryEnabled() {
        return this.isBiometryEnabled;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getAnalyticTag() {
        return this.analyticTag;
    }

    @NotNull
    public final AuthBiometricSettingRequest copy(@NotNull String deviceId, boolean isBiometryEnabled, @NotNull String analyticTag) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(analyticTag, "analyticTag");
        return new AuthBiometricSettingRequest(deviceId, isBiometryEnabled, analyticTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthBiometricSettingRequest)) {
            return false;
        }
        AuthBiometricSettingRequest authBiometricSettingRequest = (AuthBiometricSettingRequest) other;
        return Intrinsics.d(this.deviceId, authBiometricSettingRequest.deviceId) && this.isBiometryEnabled == authBiometricSettingRequest.isBiometryEnabled && Intrinsics.d(this.analyticTag, authBiometricSettingRequest.analyticTag);
    }

    @NotNull
    public final String getAnalyticTag() {
        return this.analyticTag;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public int hashCode() {
        return this.analyticTag.hashCode() + C3532b.a(this.deviceId.hashCode() * 31, 31, this.isBiometryEnabled);
    }

    public final boolean isBiometryEnabled() {
        return this.isBiometryEnabled;
    }

    @NotNull
    public String toString() {
        String str = this.deviceId;
        boolean z11 = this.isBiometryEnabled;
        return o0.c(C4636t5.b("AuthBiometricSettingRequest(deviceId=", str, ", isBiometryEnabled=", ", analyticTag=", z11), this.analyticTag, ")");
    }
}
