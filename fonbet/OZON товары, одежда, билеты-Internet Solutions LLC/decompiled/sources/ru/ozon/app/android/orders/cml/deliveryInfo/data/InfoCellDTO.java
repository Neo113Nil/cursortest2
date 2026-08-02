package ru.ozon.app.android.orders.cml.deliveryInfo.data;

import D3.g;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J6\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryInfo/data/InfoCellDTO;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "hasSeparator", "", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Ljava/lang/Boolean;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getButtons", "()Ljava/util/List;", "getHasSeparator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Ljava/lang/Boolean;)Lru/ozon/app/android/orders/cml/deliveryInfo/data/InfoCellDTO;", "equals", "other", "hashCode", "", "toString", "", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InfoCellDTO {
    public static final int $stable = 8;
    private final List<ButtonV3DTO> buttons;

    @NotNull
    private final CellDTO cell;
    private final Boolean hasSeparator;

    public InfoCellDTO(@NotNull CellDTO cell, List<ButtonV3DTO> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.cell = cell;
        this.buttons = list;
        this.hasSeparator = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InfoCellDTO copy$default(InfoCellDTO infoCellDTO, CellDTO cellDTO, List list, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellDTO = infoCellDTO.cell;
        }
        if ((i11 & 2) != 0) {
            list = infoCellDTO.buttons;
        }
        if ((i11 & 4) != 0) {
            bool = infoCellDTO.hasSeparator;
        }
        return infoCellDTO.copy(cellDTO, list, bool);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    public final List<ButtonV3DTO> component2() {
        return this.buttons;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getHasSeparator() {
        return this.hasSeparator;
    }

    @NotNull
    public final InfoCellDTO copy(@NotNull CellDTO cell, List<ButtonV3DTO> buttons, Boolean hasSeparator) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new InfoCellDTO(cell, buttons, hasSeparator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoCellDTO)) {
            return false;
        }
        InfoCellDTO infoCellDTO = (InfoCellDTO) other;
        return Intrinsics.d(this.cell, infoCellDTO.cell) && Intrinsics.d(this.buttons, infoCellDTO.buttons) && Intrinsics.d(this.hasSeparator, infoCellDTO.hasSeparator);
    }

    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final Boolean getHasSeparator() {
        return this.hasSeparator;
    }

    public int hashCode() {
        int hashCode = this.cell.hashCode() * 31;
        List<ButtonV3DTO> list = this.buttons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.hasSeparator;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CellDTO cellDTO = this.cell;
        List<ButtonV3DTO> list = this.buttons;
        Boolean bool = this.hasSeparator;
        StringBuilder sb2 = new StringBuilder("InfoCellDTO(cell=");
        sb2.append(cellDTO);
        sb2.append(", buttons=");
        sb2.append(list);
        sb2.append(", hasSeparator=");
        return g.d(sb2, bool, ")");
    }
}
