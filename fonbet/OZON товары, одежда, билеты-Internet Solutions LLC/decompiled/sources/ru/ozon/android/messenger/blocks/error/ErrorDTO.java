package ru.ozon.android.messenger.blocks.error;

import T7.E;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/android/messenger/blocks/error/ErrorDTO;", "", "message", "", "<init>", "(I)V", "getMessage", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ErrorDTO {
    public static final int $stable = 0;
    private final int message;

    public ErrorDTO(int i11) {
        this.message = i11;
    }

    public static /* synthetic */ ErrorDTO copy$default(ErrorDTO errorDTO, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = errorDTO.message;
        }
        return errorDTO.copy(i11);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMessage() {
        return this.message;
    }

    @NotNull
    public final ErrorDTO copy(int message) {
        return new ErrorDTO(message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ErrorDTO) && this.message == ((ErrorDTO) other).message;
    }

    public final int getMessage() {
        return this.message;
    }

    public int hashCode() {
        return Integer.hashCode(this.message);
    }

    @NotNull
    public String toString() {
        return E.a(this.message, "ErrorDTO(message=", ")");
    }
}
