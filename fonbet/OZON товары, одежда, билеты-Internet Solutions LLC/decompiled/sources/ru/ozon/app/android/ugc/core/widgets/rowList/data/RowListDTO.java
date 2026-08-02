package ru.ozon.app.android.ugc.core.widgets.rowList.data;

import Bi.b;
import Kk.c;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0018B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/rowList/data/RowListDTO;", "", "items", "", "Lru/ozon/app/android/ugc/core/widgets/rowList/data/RowListDTO$Item;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Item", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RowListDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Item> items;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/rowList/data/RowListDTO$Item;", "", "isSelected", "", "normal", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "selected", "<init>", "(ZLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "()Z", "getNormal", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSelected", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = CellDTO.$stable;
        private final boolean isSelected;

        @NotNull
        private final CellDTO normal;
        private final CellDTO selected;

        public Item(boolean z11, @NotNull CellDTO normal, CellDTO cellDTO) {
            Intrinsics.checkNotNullParameter(normal, "normal");
            this.isSelected = z11;
            this.normal = normal;
            this.selected = cellDTO;
        }

        public static /* synthetic */ Item copy$default(Item item, boolean z11, CellDTO cellDTO, CellDTO cellDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = item.isSelected;
            }
            if ((i11 & 2) != 0) {
                cellDTO = item.normal;
            }
            if ((i11 & 4) != 0) {
                cellDTO2 = item.selected;
            }
            return item.copy(z11, cellDTO, cellDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CellDTO getNormal() {
            return this.normal;
        }

        /* renamed from: component3, reason: from getter */
        public final CellDTO getSelected() {
            return this.selected;
        }

        @NotNull
        public final Item copy(boolean isSelected, @NotNull CellDTO normal, CellDTO selected) {
            Intrinsics.checkNotNullParameter(normal, "normal");
            return new Item(isSelected, normal, selected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return this.isSelected == item.isSelected && Intrinsics.d(this.normal, item.normal) && Intrinsics.d(this.selected, item.selected);
        }

        @NotNull
        public final CellDTO getNormal() {
            return this.normal;
        }

        public final CellDTO getSelected() {
            return this.selected;
        }

        public int hashCode() {
            int c11 = b.c(this.normal, Boolean.hashCode(this.isSelected) * 31, 31);
            CellDTO cellDTO = this.selected;
            return c11 + (cellDTO == null ? 0 : cellDTO.hashCode());
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            return "Item(isSelected=" + this.isSelected + ", normal=" + this.normal + ", selected=" + this.selected + ")";
        }
    }

    public RowListDTO(@NotNull List<Item> items, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RowListDTO copy$default(RowListDTO rowListDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = rowListDTO.items;
        }
        if ((i11 & 2) != 0) {
            map = rowListDTO.trackingInfo;
        }
        return rowListDTO.copy(list, map);
    }

    @NotNull
    public final List<Item> component1() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final RowListDTO copy(@NotNull List<Item> items, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new RowListDTO(items, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowListDTO)) {
            return false;
        }
        RowListDTO rowListDTO = (RowListDTO) other;
        return Intrinsics.d(this.items, rowListDTO.items) && Intrinsics.d(this.trackingInfo, rowListDTO.trackingInfo);
    }

    @NotNull
    public final List<Item> getItems() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("RowListDTO(items=", ", trackingInfo=", ")", this.items, this.trackingInfo);
    }
}
