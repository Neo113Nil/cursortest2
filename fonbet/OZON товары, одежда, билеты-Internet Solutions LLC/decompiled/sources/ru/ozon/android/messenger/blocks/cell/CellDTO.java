package ru.ozon.android.messenger.blocks.cell;

import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/android/messenger/blocks/cell/CellDTO;", "", "textRes", "", "defaultValue", "", "<init>", "(IZ)V", "getTextRes", "()I", "getDefaultValue", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CellDTO {
    public static final int $stable = 0;
    private final boolean defaultValue;
    private final int textRes;

    public CellDTO(int i11, boolean z11) {
        this.textRes = i11;
        this.defaultValue = z11;
    }

    public static /* synthetic */ CellDTO copy$default(CellDTO cellDTO, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = cellDTO.textRes;
        }
        if ((i12 & 2) != 0) {
            z11 = cellDTO.defaultValue;
        }
        return cellDTO.copy(i11, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTextRes() {
        return this.textRes;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDefaultValue() {
        return this.defaultValue;
    }

    @NotNull
    public final CellDTO copy(int textRes, boolean defaultValue) {
        return new CellDTO(textRes, defaultValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellDTO)) {
            return false;
        }
        CellDTO cellDTO = (CellDTO) other;
        return this.textRes == cellDTO.textRes && this.defaultValue == cellDTO.defaultValue;
    }

    public final boolean getDefaultValue() {
        return this.defaultValue;
    }

    public final int getTextRes() {
        return this.textRes;
    }

    public int hashCode() {
        return Boolean.hashCode(this.defaultValue) + (Integer.hashCode(this.textRes) * 31);
    }

    @NotNull
    public String toString() {
        return "CellDTO(textRes=" + this.textRes + ", defaultValue=" + this.defaultValue + ")";
    }
}
