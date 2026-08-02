package ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.molecules.view.travelCellList.v1.TravelCellListView;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCheckboxRadioCounterView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001c2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001\u001cB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/ToursMealWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/ToursMealVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "isItemVisible", "", "processVisibility", "(Z)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/ToursMealVO;Ll20/d;)V", "Lru/ozon/app/android/travel/molecules/view/travelCellList/v1/TravelCellListView;", "cellListView", "Lru/ozon/app/android/travel/molecules/view/travelCellList/v1/TravelCellListView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ToursMealWidgetViewHolder extends k<ToursMealVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final TravelCellListView cellListView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = TravelCellListView.$stable;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/ToursMealWidgetViewHolder$Companion;", "", "<init>", "()V", "TITLE_PARAM_KEY", "", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes5.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursMealWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        this.cellListView = containerView instanceof TravelCellListView ? (TravelCellListView) containerView : null;
        this.actionHandler = new ActionHandler.Builder(references, this).onClick(new ToursMealWidgetViewHolder$actionHandler$1(references)).buildHandler();
    }

    private final void processVisibility(boolean isItemVisible) {
        if (isItemVisible) {
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            if (itemView.getVisibility() == 8) {
                View itemView2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                ViewGroup.LayoutParams layoutParams = itemView2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = -1;
                layoutParams.height = -2;
                itemView2.setLayoutParams(layoutParams);
                View itemView3 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
                itemView3.setVisibility(0);
                return;
            }
            return;
        }
        View itemView4 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
        if (itemView4.getVisibility() == 0) {
            View itemView5 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView5, "itemView");
            ViewGroup.LayoutParams layoutParams2 = itemView5.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = 0;
            layoutParams2.height = 0;
            itemView5.setLayoutParams(layoutParams2);
            View itemView6 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView6, "itemView");
            itemView6.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ToursMealVO item, @NotNull d info) {
        TravelCellListView travelCellListView;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (item.getIsCellListVisible() && (travelCellListView = this.cellListView) != null) {
            travelCellListView.bind(item.getFilteredCellList(), this.actionHandler);
            travelCellListView.makeCellTransparent(e0.h(N.b(CellWithSubtitleCheckboxRadioCounterView.class)));
        }
        item.setForceUpdate(false);
        processVisibility(item.getIsCellListVisible());
    }
}
