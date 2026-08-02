package ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation.CellHorizontalListEvent;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation.CellHorizontalListVI;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.view.CellHorizontalListView;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.view.cells.CellHorizontalListItemsAdapter;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0014\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/view/CellHorizontalListView;", "containerView", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/view/CellHorizontalListView;Ll10/i;Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListViewModel;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListEvent;", "event", "", "handleEvent", "(Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListEvent;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI;Ll20/d;Ljava/lang/Object;)V", "onAttach", "()V", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/view/CellHorizontalListView;", "Ll10/i;", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/view/cells/CellHorizontalListItemsAdapter;", "cellsAdapter", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/view/cells/CellHorizontalListItemsAdapter;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CellHorizontalListWidgetViewHolder extends k<CellHorizontalListVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private CellHorizontalListItemsAdapter cellsAdapter;

    @NotNull
    private final i container;

    @NotNull
    private final CellHorizontalListView containerView;

    @NotNull
    private final CellHorizontalListViewModel viewModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation.CellHorizontalListWidgetViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<AtomAction, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, CellHorizontalListViewModel.class, "onView", "onView(Lru/ozon/uni/atoms/af/AtomAction;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
            invoke2(atomAction);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((CellHorizontalListViewModel) this.receiver).onView(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellHorizontalListWidgetViewHolder(@NotNull CellHorizontalListView containerView, @NotNull i container, @NotNull CellHorizontalListViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.container = container;
        this.viewModel = viewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).onPreProcess(new CellHorizontalListWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        CellHorizontalListItemsAdapter cellHorizontalListItemsAdapter = new CellHorizontalListItemsAdapter(this, new AnonymousClass1(viewModel), buildHandler);
        containerView.setupCellsRecyclerView(cellHorizontalListItemsAdapter);
        this.cellsAdapter = cellHorizontalListItemsAdapter;
    }

    private final void handleEvent(CellHorizontalListEvent event) {
        CellHorizontalListVI boundData;
        List<CellHorizontalListVI.CellVO> updatedCells;
        if (event instanceof CellHorizontalListEvent.OnViewEvent) {
            this.actionHandler.invoke(((CellHorizontalListEvent.OnViewEvent) event).getViewAction());
        } else {
            if (!(event instanceof CellHorizontalListEvent.OnClickEvent) || (boundData = getBoundData()) == null || (updatedCells = ((CellHorizontalListEvent.OnClickEvent) event).getUpdatedCells()) == null) {
                return;
            }
            this.container.M().update(new CellHorizontalListUpdate(boundData.getId(), updatedCells));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttach$handleEvent(CellHorizontalListWidgetViewHolder cellHorizontalListWidgetViewHolder, CellHorizontalListEvent cellHorizontalListEvent, d dVar) {
        cellHorizontalListWidgetViewHolder.handleEvent(cellHorizontalListEvent);
        return Unit.f71690a;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        C2399j.C(new C2408n0(C5427n.a(this.viewModel.getEvent(), getLifecycle(), AbstractC5434v.b.STARTED), new CellHorizontalListWidgetViewHolder$onAttach$1(this)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CellHorizontalListVI item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.cacheCells(item.getCells());
        this.containerView.bind(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CellHorizontalListVI item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.viewModel.cacheCells(item.getCells());
        if (!(payload instanceof List)) {
            this.containerView.bind(item);
            return;
        }
        for (Object obj : (Iterable) payload) {
            if (obj == CellHorizontalListPayload.TITLE) {
                this.containerView.bindTitle(item.getTitle());
            } else if (obj == CellHorizontalListPayload.CELLS) {
                this.containerView.bindCells(item.getCells());
            } else if (obj == CellHorizontalListPayload.CELL_GAP) {
                this.containerView.bindCellGap(item.getCellGap());
            } else if (obj == CellHorizontalListPayload.SETTINGS) {
                this.containerView.bindSettings(item.getSettings());
            } else if (obj == CellHorizontalListPayload.CELL_SETTINGS) {
                this.containerView.bindCellSettings(item.getCellSettings());
            }
        }
    }
}
