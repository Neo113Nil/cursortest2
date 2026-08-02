package ru.ozon.app.android.orders.cml.deliveryInfo.presentation.viewItem;

import D3.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/InfoCellVO;", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "", "hasSeparator", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Ljava/lang/Boolean;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getHasSeparator", "()Ljava/lang/Boolean;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InfoCellVO {
    private final List<ButtonV3DTO> buttons;

    @NotNull
    private final CellDTO cell;
    private final Boolean hasSeparator;

    public InfoCellVO(@NotNull CellDTO cell, List<ButtonV3DTO> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.cell = cell;
        this.buttons = list;
        this.hasSeparator = bool;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoCellVO)) {
            return false;
        }
        InfoCellVO infoCellVO = (InfoCellVO) other;
        return Intrinsics.d(this.cell, infoCellVO.cell) && Intrinsics.d(this.buttons, infoCellVO.buttons) && Intrinsics.d(this.hasSeparator, infoCellVO.hasSeparator);
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
        StringBuilder sb2 = new StringBuilder("InfoCellVO(cell=");
        sb2.append(cellDTO);
        sb2.append(", buttons=");
        sb2.append(list);
        sb2.append(", hasSeparator=");
        return g.d(sb2, bool, ")");
    }
}
