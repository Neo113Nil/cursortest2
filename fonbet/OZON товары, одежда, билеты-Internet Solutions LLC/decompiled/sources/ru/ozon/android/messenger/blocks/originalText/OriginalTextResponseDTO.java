package ru.ozon.android.messenger.blocks.originalText;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/android/messenger/blocks/originalText/OriginalTextResponseDTO;", "", "data", "Lru/ozon/android/messenger/blocks/originalText/DataTextDTO;", "error", "", "<init>", "(Lru/ozon/android/messenger/blocks/originalText/DataTextDTO;Ljava/lang/String;)V", "getData", "()Lru/ozon/android/messenger/blocks/originalText/DataTextDTO;", "getError", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OriginalTextResponseDTO {
    public static final int $stable = 0;
    private final DataTextDTO data;
    private final String error;

    public OriginalTextResponseDTO(DataTextDTO dataTextDTO, String str) {
        this.data = dataTextDTO;
        this.error = str;
    }

    public static /* synthetic */ OriginalTextResponseDTO copy$default(OriginalTextResponseDTO originalTextResponseDTO, DataTextDTO dataTextDTO, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dataTextDTO = originalTextResponseDTO.data;
        }
        if ((i11 & 2) != 0) {
            str = originalTextResponseDTO.error;
        }
        return originalTextResponseDTO.copy(dataTextDTO, str);
    }

    /* renamed from: component1, reason: from getter */
    public final DataTextDTO getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final OriginalTextResponseDTO copy(DataTextDTO data, String error) {
        return new OriginalTextResponseDTO(data, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OriginalTextResponseDTO)) {
            return false;
        }
        OriginalTextResponseDTO originalTextResponseDTO = (OriginalTextResponseDTO) other;
        return Intrinsics.d(this.data, originalTextResponseDTO.data) && Intrinsics.d(this.error, originalTextResponseDTO.error);
    }

    public final DataTextDTO getData() {
        return this.data;
    }

    public final String getError() {
        return this.error;
    }

    public int hashCode() {
        DataTextDTO dataTextDTO = this.data;
        int hashCode = (dataTextDTO == null ? 0 : dataTextDTO.hashCode()) * 31;
        String str = this.error;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OriginalTextResponseDTO(data=" + this.data + ", error=" + this.error + ")";
    }
}
