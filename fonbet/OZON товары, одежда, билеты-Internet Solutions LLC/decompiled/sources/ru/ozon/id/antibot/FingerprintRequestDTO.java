package ru.ozon.id.antibot;

import Ep.a;
import N3.C3660k;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/id/antibot/FingerprintRequestDTO;", "", "mf", "", "mfToken", "encryptionByIncidentId", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getMf", "()Ljava/lang/String;", "getMfToken", "getEncryptionByIncidentId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/id/antibot/FingerprintRequestDTO;", "equals", "", "other", "hashCode", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FingerprintRequestDTO {

    @i(name = "n")
    private final Integer encryptionByIncidentId;

    @NotNull
    private final String mf;
    private final String mfToken;

    public FingerprintRequestDTO(@NotNull String mf2, String str, Integer num) {
        Intrinsics.checkNotNullParameter(mf2, "mf");
        this.mf = mf2;
        this.mfToken = str;
        this.encryptionByIncidentId = num;
    }

    public static /* synthetic */ FingerprintRequestDTO copy$default(FingerprintRequestDTO fingerprintRequestDTO, String str, String str2, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fingerprintRequestDTO.mf;
        }
        if ((i11 & 2) != 0) {
            str2 = fingerprintRequestDTO.mfToken;
        }
        if ((i11 & 4) != 0) {
            num = fingerprintRequestDTO.encryptionByIncidentId;
        }
        return fingerprintRequestDTO.copy(str, str2, num);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMf() {
        return this.mf;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMfToken() {
        return this.mfToken;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getEncryptionByIncidentId() {
        return this.encryptionByIncidentId;
    }

    @NotNull
    public final FingerprintRequestDTO copy(@NotNull String mf2, String mfToken, Integer encryptionByIncidentId) {
        Intrinsics.checkNotNullParameter(mf2, "mf");
        return new FingerprintRequestDTO(mf2, mfToken, encryptionByIncidentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FingerprintRequestDTO)) {
            return false;
        }
        FingerprintRequestDTO fingerprintRequestDTO = (FingerprintRequestDTO) other;
        return Intrinsics.d(this.mf, fingerprintRequestDTO.mf) && Intrinsics.d(this.mfToken, fingerprintRequestDTO.mfToken) && Intrinsics.d(this.encryptionByIncidentId, fingerprintRequestDTO.encryptionByIncidentId);
    }

    public final Integer getEncryptionByIncidentId() {
        return this.encryptionByIncidentId;
    }

    @NotNull
    public final String getMf() {
        return this.mf;
    }

    public final String getMfToken() {
        return this.mfToken;
    }

    public int hashCode() {
        int hashCode = this.mf.hashCode() * 31;
        String str = this.mfToken;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.encryptionByIncidentId;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.mf;
        String str2 = this.mfToken;
        return a.c(C3660k.d("FingerprintRequestDTO(mf=", str, ", mfToken=", str2, ", encryptionByIncidentId="), this.encryptionByIncidentId, ")");
    }
}
