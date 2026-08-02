package ru.ozon.app.android.cml.delivery.actionHandler.cellList.updateKeys;

import A00.a;
import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cml/delivery/actionHandler/cellList/updateKeys/CellListUpdateKey;", "LA00/a$J$a;", "", "getItemId", "()J", "itemId", "Append", "Replace", "Lru/ozon/app/android/cml/delivery/actionHandler/cellList/updateKeys/CellListUpdateKey$Append;", "Lru/ozon/app/android/cml/delivery/actionHandler/cellList/updateKeys/CellListUpdateKey$Replace;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CellListUpdateKey extends a.J.InterfaceC0007a {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cml/delivery/actionHandler/cellList/updateKeys/CellListUpdateKey$Append;", "Lru/ozon/app/android/cml/delivery/actionHandler/cellList/updateKeys/CellListUpdateKey;", "", "itemId", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cells", "<init>", "(JLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getItemId", "()J", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Append implements CellListUpdateKey {

        @NotNull
        private final List<CellDTO> cells;
        private final long itemId;

        public Append(long j11, @NotNull List<CellDTO> cells) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            this.itemId = j11;
            this.cells = cells;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Append)) {
                return false;
            }
            Append append = (Append) other;
            return this.itemId == append.itemId && Intrinsics.d(this.cells, append.cells);
        }

        @NotNull
        public List<CellDTO> getCells() {
            return this.cells;
        }

        @Override // ru.ozon.app.android.cml.delivery.actionHandler.cellList.updateKeys.CellListUpdateKey
        public long getItemId() {
            return this.itemId;
        }

        public int hashCode() {
            return this.cells.hashCode() + (Long.hashCode(this.itemId) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder b11 = b.b(this.itemId, "Append(itemId=", ", cells=", this.cells);
            b11.append(")");
            return b11.toString();
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cml/delivery/actionHandler/cellList/updateKeys/CellListUpdateKey$Replace;", "Lru/ozon/app/android/cml/delivery/actionHandler/cellList/updateKeys/CellListUpdateKey;", "", "itemId", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cells", "<init>", "(JLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getItemId", "()J", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Replace implements CellListUpdateKey {

        @NotNull
        private final List<CellDTO> cells;
        private final long itemId;

        public Replace(long j11, @NotNull List<CellDTO> cells) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            this.itemId = j11;
            this.cells = cells;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Replace)) {
                return false;
            }
            Replace replace = (Replace) other;
            return this.itemId == replace.itemId && Intrinsics.d(this.cells, replace.cells);
        }

        @NotNull
        public List<CellDTO> getCells() {
            return this.cells;
        }

        @Override // ru.ozon.app.android.cml.delivery.actionHandler.cellList.updateKeys.CellListUpdateKey
        public long getItemId() {
            return this.itemId;
        }

        public int hashCode() {
            return this.cells.hashCode() + (Long.hashCode(this.itemId) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder b11 = b.b(this.itemId, "Replace(itemId=", ", cells=", this.cells);
            b11.append(")");
            return b11.toString();
        }
    }

    long getItemId();
}
