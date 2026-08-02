package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.domain;

import B4.V;
import D3.g;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\b\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/B2bGetOtpResponseDTO;", "", "otpId", "", DynamicElementDTO.TIMER, "otpLength", "", "error", "isOtpExpired", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "getOtpId", "()Ljava/lang/String;", "getTimer", "getOtpLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getError", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/B2bGetOtpResponseDTO;", "equals", "other", "hashCode", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class B2bGetOtpResponseDTO {
    public static final int $stable = 0;
    private final String error;
    private final Boolean isOtpExpired;
    private final String otpId;
    private final Integer otpLength;
    private final String timer;

    public B2bGetOtpResponseDTO() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ B2bGetOtpResponseDTO copy$default(B2bGetOtpResponseDTO b2bGetOtpResponseDTO, String str, String str2, Integer num, String str3, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = b2bGetOtpResponseDTO.otpId;
        }
        if ((i11 & 2) != 0) {
            str2 = b2bGetOtpResponseDTO.timer;
        }
        if ((i11 & 4) != 0) {
            num = b2bGetOtpResponseDTO.otpLength;
        }
        if ((i11 & 8) != 0) {
            str3 = b2bGetOtpResponseDTO.error;
        }
        if ((i11 & 16) != 0) {
            bool = b2bGetOtpResponseDTO.isOtpExpired;
        }
        Boolean bool2 = bool;
        Integer num2 = num;
        return b2bGetOtpResponseDTO.copy(str, str2, num2, str3, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOtpId() {
        return this.otpId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTimer() {
        return this.timer;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getOtpLength() {
        return this.otpLength;
    }

    /* renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsOtpExpired() {
        return this.isOtpExpired;
    }

    @NotNull
    public final B2bGetOtpResponseDTO copy(String otpId, String timer, Integer otpLength, String error, Boolean isOtpExpired) {
        return new B2bGetOtpResponseDTO(otpId, timer, otpLength, error, isOtpExpired);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2bGetOtpResponseDTO)) {
            return false;
        }
        B2bGetOtpResponseDTO b2bGetOtpResponseDTO = (B2bGetOtpResponseDTO) other;
        return Intrinsics.d(this.otpId, b2bGetOtpResponseDTO.otpId) && Intrinsics.d(this.timer, b2bGetOtpResponseDTO.timer) && Intrinsics.d(this.otpLength, b2bGetOtpResponseDTO.otpLength) && Intrinsics.d(this.error, b2bGetOtpResponseDTO.error) && Intrinsics.d(this.isOtpExpired, b2bGetOtpResponseDTO.isOtpExpired);
    }

    public final String getError() {
        return this.error;
    }

    public final String getOtpId() {
        return this.otpId;
    }

    public final Integer getOtpLength() {
        return this.otpLength;
    }

    public final String getTimer() {
        return this.timer;
    }

    public int hashCode() {
        String str = this.otpId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.timer;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.otpLength;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.error;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isOtpExpired;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isOtpExpired() {
        return this.isOtpExpired;
    }

    @NotNull
    public String toString() {
        String str = this.otpId;
        String str2 = this.timer;
        Integer num = this.otpLength;
        String str3 = this.error;
        Boolean bool = this.isOtpExpired;
        StringBuilder d11 = C3660k.d("B2bGetOtpResponseDTO(otpId=", str, ", timer=", str2, ", otpLength=");
        V.f(num, ", error=", str3, ", isOtpExpired=", d11);
        return g.d(d11, bool, ")");
    }

    public B2bGetOtpResponseDTO(String str, String str2, Integer num, String str3, Boolean bool) {
        this.otpId = str;
        this.timer = str2;
        this.otpLength = num;
        this.error = str3;
        this.isOtpExpired = bool;
    }

    public /* synthetic */ B2bGetOtpResponseDTO(String str, String str2, Integer num, String str3, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : bool);
    }
}
