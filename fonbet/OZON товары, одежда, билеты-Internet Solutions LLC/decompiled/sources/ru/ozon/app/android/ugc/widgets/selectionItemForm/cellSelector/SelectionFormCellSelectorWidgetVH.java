package ru.ozon.app.android.ugc.widgets.selectionItemForm.cellSelector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SelectionFormViewModel;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.ViewIntent;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.selectionControls.ToggleView;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0012\u001a\u00020\u0010*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR&\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/cellSelector/SelectionFormCellSelectorWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/cellSelector/SelectionFormCellSelectorVO;", "Lru/ozon/uni/android/cell/CellView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;", "selectionFormViewModel", "<init>", "(Lru/ozon/uni/android/cell/CellView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;)V", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lkotlin/Function2;", "Lru/ozon/uni/android/atom/selectionControls/ToggleView;", "", "", "toggleListener", "bindAndSetupToggleListener", "(Lru/ozon/uni/android/cell/CellView;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lkotlin/jvm/functions/Function2;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/cellSelector/SelectionFormCellSelectorVO;Ll20/d;)V", "Lru/ozon/uni/android/cell/CellView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;", "changeStateListener", "Lkotlin/jvm/functions/Function2;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionFormCellSelectorWidgetVH extends k<SelectionFormCellSelectorVO> {

    @NotNull
    private final Function2<ToggleView, Boolean, Unit> changeStateListener;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final SelectionFormViewModel selectionFormViewModel;

    @NotNull
    private final CellView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionFormCellSelectorWidgetVH(@NotNull CellView view, @NotNull ComposerReferences refs, @NotNull SelectionFormViewModel selectionFormViewModel) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(selectionFormViewModel, "selectionFormViewModel");
        this.view = view;
        this.refs = refs;
        this.selectionFormViewModel = selectionFormViewModel;
        this.changeStateListener = new SelectionFormCellSelectorWidgetVH$changeStateListener$1(this);
    }

    private final void bindAndSetupToggleListener(CellView cellView, CellDTO cellDTO, Function2<? super ToggleView, ? super Boolean, Unit> function2) {
        cellView.getRightBlock().getToggleView().setOnStateChangeListener(null);
        CellHolderKt.bind$default(cellView, cellDTO, null, 2, null);
        cellView.getRightBlock().getToggleView().setOnStateChangeListener(function2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SelectionFormCellSelectorVO item, @NotNull d info) {
        Boolean isSelected;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        CellDTO normal = (!item.getIsSelected() || item.getSelected() == null) ? item.getNormal() : item.getSelected();
        bindAndSetupToggleListener(this.view, normal, this.changeStateListener);
        CellDTO.RightBlock rightBlock = normal.getRightBlock();
        AtomDTO control = rightBlock != null ? rightBlock.getControl() : null;
        ToggleDTO toggleDTO = control instanceof ToggleDTO ? (ToggleDTO) control : null;
        this.selectionFormViewModel.onViewIntent(new ViewIntent.CellUpdated(item.getUploadKey(), Boolean.valueOf((toggleDTO == null || (isSelected = toggleDTO.isSelected()) == null) ? false : isSelected.booleanValue())));
    }
}
