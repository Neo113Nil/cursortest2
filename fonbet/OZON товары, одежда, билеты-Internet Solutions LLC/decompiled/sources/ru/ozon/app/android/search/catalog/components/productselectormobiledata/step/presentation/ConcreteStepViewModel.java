package ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation;

import AF.b;
import Fn.C3055d;
import Lm0.a;
import androidx.lifecycle.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.productselectormobile.PickerRefreshLinkStore;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.core.UtilsKt;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.ProductSelectorMobileDataDTO;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.data.ConcreteStepCellDataSource;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.domain.FilterActionProcessor;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.CurrentStepAction;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001d\u001a\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00152\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/ConcreteStepViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/data/ConcreteStepCellDataSource;", "cellsDataSource", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/domain/FilterActionProcessor;", "filterActionProcessor", "Lru/ozon/app/android/common/productselectormobile/PickerRefreshLinkStore;", "linkStore", "<init>", "(Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/data/ConcreteStepCellDataSource;Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/domain/FilterActionProcessor;Lru/ozon/app/android/common/productselectormobile/PickerRefreshLinkStore;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "atomAction", "", "processNonFilterAction", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "onCleared", "()V", "", "newText", "onSearchTextChanged", "(Ljava/lang/String;)V", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "cells", "bindStepCells", "(Ljava/util/List;)V", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO$ActiveFilters;", "currentFilters", "action", "processClickAction", "(Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/data/ConcreteStepCellDataSource;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/domain/FilterActionProcessor;", "Lru/ozon/app/android/common/productselectormobile/PickerRefreshLinkStore;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/CurrentStepAction;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getAction", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lnc/a;", "disposables", "Lnc/a;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ConcreteStepViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<CurrentStepAction> action;

    @NotNull
    private final ConcreteStepCellDataSource cellsDataSource;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final FilterActionProcessor filterActionProcessor;

    @NotNull
    private final PickerRefreshLinkStore linkStore;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/util/List;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.ConcreteStepViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends AtomDTO>, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends AtomDTO> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends AtomDTO> list) {
            SingleLiveEvent<CurrentStepAction> action = ConcreteStepViewModel.this.getAction();
            Intrinsics.f(list);
            action.setValue(new CurrentStepAction.ShowCells(list));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.ConcreteStepViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<Throwable, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            a.f17149a.e(th2);
        }
    }

    public ConcreteStepViewModel(@NotNull ConcreteStepCellDataSource cellsDataSource, @NotNull FilterActionProcessor filterActionProcessor, @NotNull PickerRefreshLinkStore linkStore) {
        Intrinsics.checkNotNullParameter(cellsDataSource, "cellsDataSource");
        Intrinsics.checkNotNullParameter(filterActionProcessor, "filterActionProcessor");
        Intrinsics.checkNotNullParameter(linkStore, "linkStore");
        this.cellsDataSource = cellsDataSource;
        this.filterActionProcessor = filterActionProcessor;
        this.linkStore = linkStore;
        this.action = new SingleLiveEvent<>();
        C8486a c8486a = new C8486a();
        this.disposables = c8486a;
        InterfaceC8487b subscribe = cellsDataSource.subscribeCells().observeOn(C8125a.a()).subscribe(new b(new AnonymousClass1(), 4), new C3055d(AnonymousClass2.INSTANCE, 9));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
    }

    private final void processNonFilterAction(AtomAction.Click atomAction) {
        String id2 = atomAction.getId();
        if (Intrinsics.d(id2, "closeSelector")) {
            this.action.setValue(CurrentStepAction.CloseFlow.INSTANCE);
        } else if (Intrinsics.d(id2, "showSelectorResults")) {
            this.linkStore.putRefreshLink(atomAction.getLink());
            this.action.setValue(CurrentStepAction.CloseFlow.INSTANCE);
        }
    }

    public final void bindStepCells(@NotNull List<? extends AtomDTO> cells) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.cellsDataSource.setCells(cells);
    }

    @NotNull
    public final SingleLiveEvent<CurrentStepAction> getAction() {
        return this.action;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.disposables.dispose();
    }

    public final void onSearchTextChanged(String newText) {
        if (newText == null) {
            return;
        }
        this.cellsDataSource.setFilterValue(newText);
    }

    public final void processClickAction(@NotNull List<ProductSelectorMobileDataDTO.ActiveFilters> currentFilters, @NotNull AtomAction.Click action) {
        Intrinsics.checkNotNullParameter(currentFilters, "currentFilters");
        Intrinsics.checkNotNullParameter(action, "action");
        if (!this.filterActionProcessor.isFilterAction(action)) {
            processNonFilterAction(action);
            return;
        }
        List<ProductSelectorMobileDataDTO.ActiveFilters> processFilterAction = this.filterActionProcessor.processFilterAction(currentFilters, action);
        if (processFilterAction != null) {
            this.action.setValue(new CurrentStepAction.ProcessChangeFilter(UtilsKt.buildPostParamsMapForApplyFilters(processFilterAction)));
        }
    }
}
