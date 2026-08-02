package ru.ozon.fintech.auth.network.dto;

import B90.C2618u;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/fintech/auth/network/dto/EnableFastEntryResponseDto;", "", "success", "", "<init>", "(Z)V", "getSuccess", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "fintech-auth_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EnableFastEntryResponseDto {

    @i(name = "success")
    private final boolean success;

    public EnableFastEntryResponseDto(boolean z11) {
        this.success = z11;
    }

    public static /* synthetic */ EnableFastEntryResponseDto copy$default(EnableFastEntryResponseDto enableFastEntryResponseDto, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = enableFastEntryResponseDto.success;
        }
        return enableFastEntryResponseDto.copy(z11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final EnableFastEntryResponseDto copy(boolean success) {
        return new EnableFastEntryResponseDto(success);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EnableFastEntryResponseDto) && this.success == ((EnableFastEntryResponseDto) other).success;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return Boolean.hashCode(this.success);
    }

    @NotNull
    public String toString() {
        return C2618u.g("EnableFastEntryResponseDto(success=", ")", this.success);
    }
}
