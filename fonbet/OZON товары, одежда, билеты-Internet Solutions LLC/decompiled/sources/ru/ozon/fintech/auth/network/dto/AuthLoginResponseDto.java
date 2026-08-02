package ru.ozon.fintech.auth.network.dto;

import V.e;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/auth/network/dto/AuthLoginResponseDto;", "", "challengeID", "", "signToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getChallengeID", "()Ljava/lang/String;", "getSignToken", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "fintech-auth_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AuthLoginResponseDto {

    @i(name = "challengeID")
    private final String challengeID;

    @i(name = "signToken")
    private final String signToken;

    public AuthLoginResponseDto(String str, String str2) {
        this.challengeID = str;
        this.signToken = str2;
    }

    public static /* synthetic */ AuthLoginResponseDto copy$default(AuthLoginResponseDto authLoginResponseDto, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = authLoginResponseDto.challengeID;
        }
        if ((i11 & 2) != 0) {
            str2 = authLoginResponseDto.signToken;
        }
        return authLoginResponseDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChallengeID() {
        return this.challengeID;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSignToken() {
        return this.signToken;
    }

    @NotNull
    public final AuthLoginResponseDto copy(String challengeID, String signToken) {
        return new AuthLoginResponseDto(challengeID, signToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthLoginResponseDto)) {
            return false;
        }
        AuthLoginResponseDto authLoginResponseDto = (AuthLoginResponseDto) other;
        return Intrinsics.d(this.challengeID, authLoginResponseDto.challengeID) && Intrinsics.d(this.signToken, authLoginResponseDto.signToken);
    }

    public final String getChallengeID() {
        return this.challengeID;
    }

    public final String getSignToken() {
        return this.signToken;
    }

    public int hashCode() {
        String str = this.challengeID;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.signToken;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return e.a("AuthLoginResponseDto(challengeID=", this.challengeID, ", signToken=", this.signToken, ")");
    }
}
