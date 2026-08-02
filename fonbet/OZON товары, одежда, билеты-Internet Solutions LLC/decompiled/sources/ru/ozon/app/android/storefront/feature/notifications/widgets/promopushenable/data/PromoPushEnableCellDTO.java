package ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/data/PromoPushEnableCellDTO;", "", "typeIds", "", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "getTypeIds", "()Ljava/util/List;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PromoPushEnableCellDTO {
    public static final int $stable = 8;

    @NotNull
    private final CellDTO cell;
    private final List<String> typeIds;

    public PromoPushEnableCellDTO(List<String> list, @NotNull CellDTO cell) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.typeIds = list;
        this.cell = cell;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromoPushEnableCellDTO copy$default(PromoPushEnableCellDTO promoPushEnableCellDTO, List list, CellDTO cellDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = promoPushEnableCellDTO.typeIds;
        }
        if ((i11 & 2) != 0) {
            cellDTO = promoPushEnableCellDTO.cell;
        }
        return promoPushEnableCellDTO.copy(list, cellDTO);
    }

    public final List<String> component1() {
        return this.typeIds;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    public final PromoPushEnableCellDTO copy(List<String> typeIds, @NotNull CellDTO cell) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new PromoPushEnableCellDTO(typeIds, cell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoPushEnableCellDTO)) {
            return false;
        }
        PromoPushEnableCellDTO promoPushEnableCellDTO = (PromoPushEnableCellDTO) other;
        return Intrinsics.d(this.typeIds, promoPushEnableCellDTO.typeIds) && Intrinsics.d(this.cell, promoPushEnableCellDTO.cell);
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final List<String> getTypeIds() {
        return this.typeIds;
    }

    public int hashCode() {
        List<String> list = this.typeIds;
        return this.cell.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "PromoPushEnableCellDTO(typeIds=" + this.typeIds + ", cell=" + this.cell + ")";
    }

    public /* synthetic */ PromoPushEnableCellDTO(List list, CellDTO cellDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, cellDTO);
    }
}
