package ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.cellList.viewItem;

import Ak.b;
import B0.C2454a;
import G.g;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.cellList.data.CmlCellListMoleculeDTO;
import ru.ozon.app.android.cml.delivery.molecules.cellList.presenation.CellItem;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010JT\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/cellList/viewItem/CellListVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeDTO;", "cellList", "", "Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CellItem;", "mappedList", "LWZ/t;", "tokenizedEvent", "", "headerWidgetKey", "", "needScroll", "<init>", "(JLru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeDTO;Ljava/util/List;LWZ/t;IZ)V", "copy", "(JLru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeDTO;Ljava/util/List;LWZ/t;IZ)Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/cellList/viewItem/CellListVI;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeDTO;", "getCellList", "()Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeDTO;", "Ljava/util/List;", "getMappedList", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "I", "getHeaderWidgetKey", "Z", "getNeedScroll", "()Z", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CellListVI implements c {

    @NotNull
    private final CmlCellListMoleculeDTO cellList;
    private final int headerWidgetKey;
    private final long id;

    @NotNull
    private final List<CellItem> mappedList;
    private final boolean needScroll;
    private final t tokenizedEvent;

    public CellListVI(long j11, @NotNull CmlCellListMoleculeDTO cellList, @NotNull List<CellItem> mappedList, t tVar, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(cellList, "cellList");
        Intrinsics.checkNotNullParameter(mappedList, "mappedList");
        this.id = j11;
        this.cellList = cellList;
        this.mappedList = mappedList;
        this.tokenizedEvent = tVar;
        this.headerWidgetKey = i11;
        this.needScroll = z11;
    }

    public static /* synthetic */ CellListVI copy$default(CellListVI cellListVI, long j11, CmlCellListMoleculeDTO cmlCellListMoleculeDTO, List list, t tVar, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = cellListVI.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            cmlCellListMoleculeDTO = cellListVI.cellList;
        }
        CmlCellListMoleculeDTO cmlCellListMoleculeDTO2 = cmlCellListMoleculeDTO;
        if ((i12 & 4) != 0) {
            list = cellListVI.mappedList;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            tVar = cellListVI.tokenizedEvent;
        }
        t tVar2 = tVar;
        if ((i12 & 16) != 0) {
            i11 = cellListVI.headerWidgetKey;
        }
        int i13 = i11;
        if ((i12 & 32) != 0) {
            z11 = cellListVI.needScroll;
        }
        return cellListVI.copy(j12, cmlCellListMoleculeDTO2, list2, tVar2, i13, z11);
    }

    @NotNull
    public final CellListVI copy(long id2, @NotNull CmlCellListMoleculeDTO cellList, @NotNull List<CellItem> mappedList, t tokenizedEvent, int headerWidgetKey, boolean needScroll) {
        Intrinsics.checkNotNullParameter(cellList, "cellList");
        Intrinsics.checkNotNullParameter(mappedList, "mappedList");
        return new CellListVI(id2, cellList, mappedList, tokenizedEvent, headerWidgetKey, needScroll);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellListVI)) {
            return false;
        }
        CellListVI cellListVI = (CellListVI) other;
        return this.id == cellListVI.id && Intrinsics.d(this.cellList, cellListVI.cellList) && Intrinsics.d(this.mappedList, cellListVI.mappedList) && Intrinsics.d(this.tokenizedEvent, cellListVI.tokenizedEvent) && this.headerWidgetKey == cellListVI.headerWidgetKey && this.needScroll == cellListVI.needScroll;
    }

    @NotNull
    public final CmlCellListMoleculeDTO getCellList() {
        return this.cellList;
    }

    public final int getHeaderWidgetKey() {
        return this.headerWidgetKey;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<CellItem> getMappedList() {
        return this.mappedList;
    }

    public final boolean getNeedScroll() {
        return this.needScroll;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b((this.cellList.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.mappedList);
        t tVar = this.tokenizedEvent;
        return Boolean.hashCode(this.needScroll) + C2454a.a(this.headerWidgetKey, (b11 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CmlCellListMoleculeDTO cmlCellListMoleculeDTO = this.cellList;
        List<CellItem> list = this.mappedList;
        t tVar = this.tokenizedEvent;
        int i11 = this.headerWidgetKey;
        boolean z11 = this.needScroll;
        StringBuilder sb2 = new StringBuilder("CellListVI(id=");
        sb2.append(j11);
        sb2.append(", cellList=");
        sb2.append(cmlCellListMoleculeDTO);
        b.h(sb2, ", mappedList=", list, ", tokenizedEvent=", tVar);
        sb2.append(", headerWidgetKey=");
        sb2.append(i11);
        sb2.append(", needScroll=");
        sb2.append(z11);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ CellListVI(long j11, CmlCellListMoleculeDTO cmlCellListMoleculeDTO, List list, t tVar, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, cmlCellListMoleculeDTO, list, tVar, i11, (i12 & 32) != 0 ? false : z11);
    }
}
