package ru.ozon.app.android.travel.feature.tours.widgets.toursSummary.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.molecules.view.travelCellList.v1.TravelCellListView;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithReverseSubtitleCounterView;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleDefaultView;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleValueView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSummary/presentation/ToursSummaryWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSummary/presentation/ToursSummaryVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSummary/presentation/ToursSummaryVO;Ll20/d;)V", "Lru/ozon/app/android/travel/molecules/view/travelCellList/v1/TravelCellListView;", "travelCellList", "Lru/ozon/app/android/travel/molecules/view/travelCellList/v1/TravelCellListView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ToursSummaryWidgetViewHolder extends k<ToursSummaryVO> {
    public static final int $stable = TravelCellListView.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final TravelCellListView travelCellList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursSummaryWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        this.travelCellList = containerView instanceof TravelCellListView ? (TravelCellListView) containerView : null;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ToursSummaryVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TravelCellListView travelCellListView = this.travelCellList;
        if (travelCellListView != null) {
            travelCellListView.bind(item.getCellList(), this.actionHandler);
            kotlin.reflect.d[] elements = {N.b(CellWithSubtitleValueView.class), N.b(CellWithReverseSubtitleCounterView.class), N.b(CellWithSubtitleDefaultView.class)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            travelCellListView.makeCellTransparent(C7705l.j0(elements));
            TravelCellListView.updateTitleMargin$default(travelCellListView, 0, item.getTitleTopMargin(), 0, 0, 13, null);
        }
    }
}
