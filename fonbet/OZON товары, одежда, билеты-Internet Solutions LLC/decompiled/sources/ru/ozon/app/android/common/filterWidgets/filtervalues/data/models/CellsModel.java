package ru.ozon.app.android.common.filterWidgets.filtervalues.data.models;

import An.C2439a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/CellsModel;", "", "", "searchText", "", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "cells", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/util/List;)Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/CellsModel;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSearchText", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CellsModel {

    @NotNull
    private final List<FilterValuesCell> cells;

    @NotNull
    private final String searchText;

    /* JADX WARN: Multi-variable type inference failed */
    public CellsModel(@NotNull String searchText, @NotNull List<? extends FilterValuesCell> cells) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.searchText = searchText;
        this.cells = cells;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CellsModel copy$default(CellsModel cellsModel, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cellsModel.searchText;
        }
        if ((i11 & 2) != 0) {
            list = cellsModel.cells;
        }
        return cellsModel.copy(str, list);
    }

    @NotNull
    public final CellsModel copy(@NotNull String searchText, @NotNull List<? extends FilterValuesCell> cells) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        Intrinsics.checkNotNullParameter(cells, "cells");
        return new CellsModel(searchText, cells);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellsModel)) {
            return false;
        }
        CellsModel cellsModel = (CellsModel) other;
        return Intrinsics.d(this.searchText, cellsModel.searchText) && Intrinsics.d(this.cells, cellsModel.cells);
    }

    @NotNull
    public final List<FilterValuesCell> getCells() {
        return this.cells;
    }

    @NotNull
    public final String getSearchText() {
        return this.searchText;
    }

    public int hashCode() {
        return this.cells.hashCode() + (this.searchText.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return C2439a.a("CellsModel(searchText=", this.searchText, ", cells=", ")", this.cells);
    }
}
