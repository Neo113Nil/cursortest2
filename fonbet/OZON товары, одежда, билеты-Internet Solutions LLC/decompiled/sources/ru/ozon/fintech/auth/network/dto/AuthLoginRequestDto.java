package ru.ozon.fintech.auth.network.dto;

import C.o0;
import N3.C3660k;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/fintech/auth/network/dto/AuthLoginRequestDto;", "", "pincode", "", "password", "biometricToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPincode", "()Ljava/lang/String;", "getPassword", "getBiometricToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "fintech-auth_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AuthLoginRequestDto {

    @i(name = "biometricToken")
    private final String biometricToken;

    @i(name = "password")
    private final String password;

    @i(name = "pincode")
    private final String pincode;

    public AuthLoginRequestDto(String str, String str2, String str3) {
        this.pincode = str;
        this.password = str2;
        this.biometricToken = str3;
    }

    public static /* synthetic */ AuthLoginRequestDto copy$default(AuthLoginRequestDto authLoginRequestDto, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = authLoginRequestDto.pincode;
        }
        if ((i11 & 2) != 0) {
            str2 = authLoginRequestDto.password;
        }
        if ((i11 & 4) != 0) {
            str3 = authLoginRequestDto.biometricToken;
        }
        return authLoginRequestDto.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPincode() {
        return this.pincode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBiometricToken() {
        return this.biometricToken;
    }

    @NotNull
    public final AuthLoginRequestDto copy(String pincode, String password, String biometricToken) {
        return new AuthLoginRequestDto(pincode, password, biometricToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthLoginRequestDto)) {
            return false;
        }
        AuthLoginRequestDto authLoginRequestDto = (AuthLoginRequestDto) other;
        return Intrinsics.d(this.pincode, authLoginRequestDto.pincode) && Intrinsics.d(this.password, authLoginRequestDto.password) && Intrinsics.d(this.biometricToken, authLoginRequestDto.biometricToken);
    }

    public final String getBiometricToken() {
        return this.biometricToken;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPincode() {
        return this.pincode;
    }

    public int hashCode() {
        String str = this.pincode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.password;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.biometricToken;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.pincode;
        String str2 = this.password;
        return o0.c(C3660k.d("AuthLoginRequestDto(pincode=", str, ", password=", str2, ", biometricToken="), this.biometricToken, ")");
    }
}
