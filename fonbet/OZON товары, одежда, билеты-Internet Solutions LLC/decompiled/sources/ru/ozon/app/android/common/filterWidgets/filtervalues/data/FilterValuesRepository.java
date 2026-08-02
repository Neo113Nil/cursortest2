package ru.ozon.app.android.common.filterWidgets.filtervalues.data;

import Bc.m;
import Bc.o;
import Fw.b;
import Sq.CallableC4012a;
import io.reactivex.C;
import io.reactivex.p;
import io.reactivex.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.api.FilterValuesApi;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.api.applyfilters.ApplySearchFiltersRequest;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.api.applyfilters.MapperKt;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.buttonstate.ButtonEnabledStore;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.cellstore.FilterValuesCellStore;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ApplyFilterShortRequestInfo;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ApplyFiltersResults;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterState;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0011\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f \u0010*\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\n0\n¢\u0006\u0004\b\u0011\u0010\u000eJ#\u0010\u0016\u001a\u00020\u00152\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0015¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010\u001dJ\u0015\u0010#\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0013¢\u0006\u0004\b#\u0010\u001dJ\u0015\u0010$\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0013¢\u0006\u0004\b$\u0010\u001dJ#\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0013¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/data/FilterValuesRepository;", "", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/cellstore/FilterValuesCellStore;", "cellsStore", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/api/FilterValuesApi;", "filterValuesApi", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/buttonstate/ButtonEnabledStore;", "buttonStateStore", "<init>", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/data/cellstore/FilterValuesCellStore;Lru/ozon/app/android/common/filterWidgets/filtervalues/data/api/FilterValuesApi;Lru/ozon/app/android/common/filterWidgets/filtervalues/data/buttonstate/ButtonEnabledStore;)V", "Lio/reactivex/p;", "", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "observe", "()Lio/reactivex/p;", "", "kotlin.jvm.PlatformType", "observeButtonChange", "cells", "", "searchText", "", "submitItems", "(Ljava/util/List;Ljava/lang/String;)V", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterState;", "initState", "putInitFilterState", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterState;)V", "onSearchTextChanged", "(Ljava/lang/String;)V", "selectAllItems", "()V", "unsetAllItems", "id", "toggleItem", "toggleSingleItem", "expandHeader", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/ApplyFilterShortRequestInfo;", "shortRequest", "actionId", "Lio/reactivex/y;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/ApplyFiltersResults;", "executeApplySearchFilters", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/ApplyFilterShortRequestInfo;Ljava/lang/String;)Lio/reactivex/y;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/cellstore/FilterValuesCellStore;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/api/FilterValuesApi;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/buttonstate/ButtonEnabledStore;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterValuesRepository {

    @NotNull
    private final ButtonEnabledStore buttonStateStore;

    @NotNull
    private final FilterValuesCellStore cellsStore;

    @NotNull
    private final FilterValuesApi filterValuesApi;

    public FilterValuesRepository(@NotNull FilterValuesCellStore cellsStore, @NotNull FilterValuesApi filterValuesApi, @NotNull ButtonEnabledStore buttonStateStore) {
        Intrinsics.checkNotNullParameter(cellsStore, "cellsStore");
        Intrinsics.checkNotNullParameter(filterValuesApi, "filterValuesApi");
        Intrinsics.checkNotNullParameter(buttonStateStore, "buttonStateStore");
        this.cellsStore = cellsStore;
        this.filterValuesApi = filterValuesApi;
        this.buttonStateStore = buttonStateStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ApplySearchFiltersRequest executeApplySearchFilters$lambda$0(FilterValuesRepository filterValuesRepository, ApplyFilterShortRequestInfo applyFilterShortRequestInfo) {
        Boolean isInverted = filterValuesRepository.cellsStore.getIsInverted();
        if (isInverted == null) {
            throw new Exception("incorrect data");
        }
        boolean booleanValue = isInverted.booleanValue();
        List<String> collectInfoForRequest = filterValuesRepository.cellsStore.collectInfoForRequest(booleanValue);
        if (collectInfoForRequest != null) {
            return MapperKt.toRequest(applyFilterShortRequestInfo, collectInfoForRequest, booleanValue);
        }
        throw new Exception("incorrect data");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C executeApplySearchFilters$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    @NotNull
    public final y<ApplyFiltersResults> executeApplySearchFilters(@NotNull ApplyFilterShortRequestInfo shortRequest, @NotNull String actionId) {
        Intrinsics.checkNotNullParameter(shortRequest, "shortRequest");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        m mVar = new m(new o(new CallableC4012a(0, this, shortRequest)).j(Mc.a.b()), new b(new FilterValuesRepository$executeApplySearchFilters$2(this, actionId), 2));
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    public final void expandHeader(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.cellsStore.expandHeader(id2);
    }

    @NotNull
    public final p<List<FilterValuesCell>> observe() {
        p<List<FilterValuesCell>> observe = this.cellsStore.observe();
        Intrinsics.checkNotNullExpressionValue(observe, "observe(...)");
        return observe;
    }

    public final p<Boolean> observeButtonChange() {
        return this.buttonStateStore.observe();
    }

    public final void onSearchTextChanged(@NotNull String searchText) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        this.cellsStore.onSearchTextChanged(searchText);
    }

    public final void putInitFilterState(@NotNull FilterState initState) {
        Intrinsics.checkNotNullParameter(initState, "initState");
        this.buttonStateStore.putInitial(initState);
    }

    public final void selectAllItems() {
        this.buttonStateStore.selectAll();
        this.cellsStore.selectAllItems();
    }

    public final void submitItems(@NotNull List<? extends FilterValuesCell> cells, @NotNull String searchText) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        this.cellsStore.initItems(cells, searchText);
    }

    public final void toggleItem(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.buttonStateStore.toggle(id2);
        this.cellsStore.toggleItem(id2);
    }

    public final void toggleSingleItem(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.buttonStateStore.toggleSingleItem(id2);
        this.cellsStore.toggleSingleItem(id2);
    }

    public final void unsetAllItems() {
        this.buttonStateStore.unSelectAll();
        this.cellsStore.unsetAllItems();
    }
}
