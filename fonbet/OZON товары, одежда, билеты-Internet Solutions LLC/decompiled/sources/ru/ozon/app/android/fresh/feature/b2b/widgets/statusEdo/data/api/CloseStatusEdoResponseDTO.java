package ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.data.api;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/statusEdo/data/api/CloseStatusEdoResponseDTO;", "", "isSuccess", "", "error", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getError", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lru/ozon/app/android/fresh/feature/b2b/widgets/statusEdo/data/api/CloseStatusEdoResponseDTO;", "equals", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CloseStatusEdoResponseDTO {
    public static final int $stable = 0;
    private final String error;
    private final Boolean isSuccess;

    public CloseStatusEdoResponseDTO(Boolean bool, String str) {
        this.isSuccess = bool;
        this.error = str;
    }

    public static /* synthetic */ CloseStatusEdoResponseDTO copy$default(CloseStatusEdoResponseDTO closeStatusEdoResponseDTO, Boolean bool, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = closeStatusEdoResponseDTO.isSuccess;
        }
        if ((i11 & 2) != 0) {
            str = closeStatusEdoResponseDTO.error;
        }
        return closeStatusEdoResponseDTO.copy(bool, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final CloseStatusEdoResponseDTO copy(Boolean isSuccess, String error) {
        return new CloseStatusEdoResponseDTO(isSuccess, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloseStatusEdoResponseDTO)) {
            return false;
        }
        CloseStatusEdoResponseDTO closeStatusEdoResponseDTO = (CloseStatusEdoResponseDTO) other;
        return Intrinsics.d(this.isSuccess, closeStatusEdoResponseDTO.isSuccess) && Intrinsics.d(this.error, closeStatusEdoResponseDTO.error);
    }

    public final String getError() {
        return this.error;
    }

    public int hashCode() {
        Boolean bool = this.isSuccess;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.error;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final Boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        return "CloseStatusEdoResponseDTO(isSuccess=" + this.isSuccess + ", error=" + this.error + ")";
    }
}
