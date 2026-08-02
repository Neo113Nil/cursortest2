package ru.ozon.app.android.common.filterWidgets.filtervalues.data.cellstore;

import AJ.a;
import Nc.C3667a;
import io.reactivex.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.models.CellsModel;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ToggleItem;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJI\u0010\f\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u000b*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u000b*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u000b*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\n0\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u00102\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0015J\r\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0003J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u0003J\u0015\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u0015J\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010(\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010'0'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/data/cellstore/FilterValuesCellStore;", "", "<init>", "()V", "", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "", "getSelectedItemsIds", "(Ljava/util/List;)Ljava/util/List;", "getUnSelectedItemsIds", "Lio/reactivex/p;", "kotlin.jvm.PlatformType", "observe", "()Lio/reactivex/p;", "cells", "searchText", "", "initItems", "(Ljava/util/List;Ljava/lang/String;)V", "newSearchText", "onSearchTextChanged", "(Ljava/lang/String;)V", "id", "toggleItem", "toggleSingleItem", "selectAllItems", "unsetAllItems", "expandHeader", "", "getIsInverted", "()Ljava/lang/Boolean;", "isInverted", "collectInfoForRequest", "(Z)Ljava/util/List;", "getSelectedIds", "()Ljava/util/List;", "isSelected", "Ljava/lang/Boolean;", "LNc/a;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/CellsModel;", "store", "LNc/a;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterValuesCellStore {
    private Boolean isSelected;

    @NotNull
    private final C3667a<CellsModel> store;

    public FilterValuesCellStore() {
        C3667a<CellsModel> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.store = d11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<String> getSelectedItemsIds(List<? extends FilterValuesCell> list) {
        ArrayList arrayList = new ArrayList();
        for (FilterValuesCell filterValuesCell : list) {
            String id2 = ((filterValuesCell instanceof ToggleItem) && ((ToggleItem) filterValuesCell).getIsSelected()) ? filterValuesCell.getId() : null;
            if (id2 != null) {
                arrayList.add(id2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<String> getUnSelectedItemsIds(List<? extends FilterValuesCell> list) {
        ArrayList arrayList = new ArrayList();
        for (FilterValuesCell filterValuesCell : list) {
            String id2 = (!(filterValuesCell instanceof ToggleItem) || ((ToggleItem) filterValuesCell).getIsSelected()) ? null : filterValuesCell.getId();
            if (id2 != null) {
                arrayList.add(id2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List observe$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (List) function1.invoke(p02);
    }

    public final List<String> collectInfoForRequest(boolean isInverted) {
        CellsModel f7 = this.store.f();
        if (f7 == null) {
            return null;
        }
        return isInverted ? getUnSelectedItemsIds(f7.getCells()) : getSelectedItemsIds(f7.getCells());
    }

    public final void expandHeader(@NotNull String id2) {
        CellsModel expandHeader;
        Intrinsics.checkNotNullParameter(id2, "id");
        CellsModel f7 = this.store.f();
        if (f7 == null || (expandHeader = CellToggleUtilsKt.expandHeader(f7, id2)) == null) {
            return;
        }
        this.store.onNext(expandHeader);
    }

    public final Boolean getIsInverted() {
        if (this.store.f() == null) {
            return null;
        }
        Boolean bool = this.isSelected;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    @NotNull
    public final List<String> getSelectedIds() {
        CellsModel f7 = this.store.f();
        return f7 == null ? K.f71697a : getSelectedItemsIds(f7.getCells());
    }

    public final void initItems(@NotNull List<? extends FilterValuesCell> cells, @NotNull String searchText) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        this.store.onNext(new CellsModel(searchText, cells));
    }

    public final p<List<FilterValuesCell>> observe() {
        return this.store.map(new a(FilterValuesCellStore$observe$1.INSTANCE, 1)).subscribeOn(Mc.a.a()).hide();
    }

    public final void onSearchTextChanged(@NotNull String newSearchText) {
        CellsModel onSearchTextChange;
        Intrinsics.checkNotNullParameter(newSearchText, "newSearchText");
        CellsModel f7 = this.store.f();
        if (f7 == null || (onSearchTextChange = CellToggleUtilsKt.onSearchTextChange(f7, newSearchText)) == null) {
            return;
        }
        this.store.onNext(onSearchTextChange);
    }

    public final void selectAllItems() {
        CellsModel selectAllItems;
        CellsModel f7 = this.store.f();
        if (f7 != null && (selectAllItems = CellToggleUtilsKt.selectAllItems(f7)) != null) {
            this.store.onNext(selectAllItems);
        }
        this.isSelected = Boolean.TRUE;
    }

    public final void toggleItem(@NotNull String id2) {
        CellsModel cellsModel;
        Intrinsics.checkNotNullParameter(id2, "id");
        CellsModel f7 = this.store.f();
        if (f7 == null || (cellsModel = CellToggleUtilsKt.toggleItem(f7, id2)) == null) {
            return;
        }
        this.store.onNext(cellsModel);
    }

    public final void toggleSingleItem(@NotNull String id2) {
        CellsModel cellsModel;
        Intrinsics.checkNotNullParameter(id2, "id");
        CellsModel f7 = this.store.f();
        if (f7 == null || (cellsModel = CellToggleUtilsKt.toggleSingleItem(f7, id2)) == null) {
            return;
        }
        this.store.onNext(cellsModel);
    }

    public final void unsetAllItems() {
        CellsModel unSelectAllItems;
        CellsModel f7 = this.store.f();
        if (f7 != null && (unSelectAllItems = CellToggleUtilsKt.unSelectAllItems(f7)) != null) {
            this.store.onNext(unSelectAllItems);
        }
        this.isSelected = Boolean.FALSE;
    }
}
