package ru.ozon.app.android.product.tiles.tilegrid2.presentation.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2CheckBoxVO;", "", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "atomDTO", "", "tileId", "<init>", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;Ljava/lang/String;)V", "copy", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;Ljava/lang/String;)Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2CheckBoxVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "getAtomDTO", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "Ljava/lang/String;", "getTileId", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TileGrid2CheckBoxVO {

    @NotNull
    private final CheckBoxDTO atomDTO;

    @NotNull
    private final String tileId;

    public TileGrid2CheckBoxVO(@NotNull CheckBoxDTO atomDTO, @NotNull String tileId) {
        Intrinsics.checkNotNullParameter(atomDTO, "atomDTO");
        Intrinsics.checkNotNullParameter(tileId, "tileId");
        this.atomDTO = atomDTO;
        this.tileId = tileId;
    }

    public static /* synthetic */ TileGrid2CheckBoxVO copy$default(TileGrid2CheckBoxVO tileGrid2CheckBoxVO, CheckBoxDTO checkBoxDTO, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            checkBoxDTO = tileGrid2CheckBoxVO.atomDTO;
        }
        if ((i11 & 2) != 0) {
            str = tileGrid2CheckBoxVO.tileId;
        }
        return tileGrid2CheckBoxVO.copy(checkBoxDTO, str);
    }

    @NotNull
    public final TileGrid2CheckBoxVO copy(@NotNull CheckBoxDTO atomDTO, @NotNull String tileId) {
        Intrinsics.checkNotNullParameter(atomDTO, "atomDTO");
        Intrinsics.checkNotNullParameter(tileId, "tileId");
        return new TileGrid2CheckBoxVO(atomDTO, tileId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileGrid2CheckBoxVO)) {
            return false;
        }
        TileGrid2CheckBoxVO tileGrid2CheckBoxVO = (TileGrid2CheckBoxVO) other;
        return Intrinsics.d(this.atomDTO, tileGrid2CheckBoxVO.atomDTO) && Intrinsics.d(this.tileId, tileGrid2CheckBoxVO.tileId);
    }

    @NotNull
    public final CheckBoxDTO getAtomDTO() {
        return this.atomDTO;
    }

    @NotNull
    public final String getTileId() {
        return this.tileId;
    }

    public int hashCode() {
        return this.tileId.hashCode() + (this.atomDTO.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "TileGrid2CheckBoxVO(atomDTO=" + this.atomDTO + ", tileId=" + this.tileId + ")";
    }
}
