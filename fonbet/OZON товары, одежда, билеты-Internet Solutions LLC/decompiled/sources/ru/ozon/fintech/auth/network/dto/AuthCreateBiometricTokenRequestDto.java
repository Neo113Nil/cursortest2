package ru.ozon.fintech.auth.network.dto;

import I0.C3173b;
import N3.C3660k;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/fintech/auth/network/dto/AuthCreateBiometricTokenRequestDto;", "", "deviceId", "", "pincode", "password", "fingerprint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "getPincode", "getPassword", "getFingerprint", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "fintech-auth_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AuthCreateBiometricTokenRequestDto {

    @i(name = "deviceId")
    @NotNull
    private final String deviceId;

    @i(name = "fingerprint")
    private final String fingerprint;

    @i(name = "password")
    private final String password;

    @i(name = "pincode")
    private final String pincode;

    public AuthCreateBiometricTokenRequestDto(@NotNull String deviceId, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        this.deviceId = deviceId;
        this.pincode = str;
        this.password = str2;
        this.fingerprint = str3;
    }

    public static /* synthetic */ AuthCreateBiometricTokenRequestDto copy$default(AuthCreateBiometricTokenRequestDto authCreateBiometricTokenRequestDto, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = authCreateBiometricTokenRequestDto.deviceId;
        }
        if ((i11 & 2) != 0) {
            str2 = authCreateBiometricTokenRequestDto.pincode;
        }
        if ((i11 & 4) != 0) {
            str3 = authCreateBiometricTokenRequestDto.password;
        }
        if ((i11 & 8) != 0) {
            str4 = authCreateBiometricTokenRequestDto.fingerprint;
        }
        return authCreateBiometricTokenRequestDto.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPincode() {
        return this.pincode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    @NotNull
    public final AuthCreateBiometricTokenRequestDto copy(@NotNull String deviceId, String pincode, String password, String fingerprint) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return new AuthCreateBiometricTokenRequestDto(deviceId, pincode, password, fingerprint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthCreateBiometricTokenRequestDto)) {
            return false;
        }
        AuthCreateBiometricTokenRequestDto authCreateBiometricTokenRequestDto = (AuthCreateBiometricTokenRequestDto) other;
        return Intrinsics.d(this.deviceId, authCreateBiometricTokenRequestDto.deviceId) && Intrinsics.d(this.pincode, authCreateBiometricTokenRequestDto.pincode) && Intrinsics.d(this.password, authCreateBiometricTokenRequestDto.password) && Intrinsics.d(this.fingerprint, authCreateBiometricTokenRequestDto.fingerprint);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getFingerprint() {
        return this.fingerprint;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPincode() {
        return this.pincode;
    }

    public int hashCode() {
        int hashCode = this.deviceId.hashCode() * 31;
        String str = this.pincode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.password;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fingerprint;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.deviceId;
        String str2 = this.pincode;
        return C3173b.c(C3660k.d("AuthCreateBiometricTokenRequestDto(deviceId=", str, ", pincode=", str2, ", password="), this.password, ", fingerprint=", this.fingerprint, ")");
    }
}
