package ru.ozon.id.antibot;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0011"}, d2 = {"Lru/ozon/id/antibot/FingerprintResponseDTO;", "", "isValid", "", "<init>", "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lru/ozon/id/antibot/FingerprintResponseDTO;", "equals", "other", "hashCode", "", "toString", "", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FingerprintResponseDTO {
    private final Boolean isValid;

    public FingerprintResponseDTO(Boolean bool) {
        this.isValid = bool;
    }

    public static /* synthetic */ FingerprintResponseDTO copy$default(FingerprintResponseDTO fingerprintResponseDTO, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = fingerprintResponseDTO.isValid;
        }
        return fingerprintResponseDTO.copy(bool);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsValid() {
        return this.isValid;
    }

    @NotNull
    public final FingerprintResponseDTO copy(Boolean isValid) {
        return new FingerprintResponseDTO(isValid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FingerprintResponseDTO) && Intrinsics.d(this.isValid, ((FingerprintResponseDTO) other).isValid);
    }

    public int hashCode() {
        Boolean bool = this.isValid;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean isValid() {
        return this.isValid;
    }

    @NotNull
    public String toString() {
        return "FingerprintResponseDTO(isValid=" + this.isValid + ")";
    }
}
