package ru.ozon.app.android.ugc.widgets.selectionItemForm.cell;

import Vg.d;
import androidx.fragment.app.C5402x;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SelectionFormViewModel;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.ViewIntent;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.selectionControls.ToggleView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J#\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00100 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/cell/SelectionFormCellWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/cell/SelectionFormCellVO;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/cell/SelectionFormCellWrapper;", "cellWrapper", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;", "selectionFormViewModel", "<init>", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/cell/SelectionFormCellWrapper;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;)V", "", "isChecked", "", "setToggleState", "(Z)V", "configFragmentResultListener", "()V", "clearFragmentResultListener", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/cell/SelectionFormCellVO;Ll20/d;)V", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/cell/SelectionFormCellWrapper;", "Lru/ozon/app/android/composer/ComposerReferences;", "LVg/d;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionFormCellWidgetVH extends k<SelectionFormCellVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final SelectionFormCellWrapper cellWrapper;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final SelectionFormViewModel selectionFormViewModel;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<unused var>", "Lru/ozon/uni/android/atom/selectionControls/ToggleView;", "isChecked", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.widgets.selectionItemForm.cell.SelectionFormCellWidgetVH$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<ToggleView, Boolean, Unit> {
        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(ToggleView toggleView, Boolean bool) {
            invoke(toggleView, bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(ToggleView toggleView, boolean z11) {
            Intrinsics.checkNotNullParameter(toggleView, "<unused var>");
            SelectionFormCellWidgetVH.this.setToggleState(z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionFormCellWidgetVH(@NotNull SelectionFormCellWrapper cellWrapper, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory, @NotNull SelectionFormViewModel selectionFormViewModel) {
        super(cellWrapper);
        AbstractC5434v lifecycle;
        Intrinsics.checkNotNullParameter(cellWrapper, "cellWrapper");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(selectionFormViewModel, "selectionFormViewModel");
        this.cellWrapper = cellWrapper;
        this.refs = refs;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.selectionFormViewModel = selectionFormViewModel;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new SelectionFormCellWidgetVH$actionHandler$1(this)).buildHandler();
        cellWrapper.getCellView().getRightBlock().getToggleView().setOnStateChangeListener(new AnonymousClass1());
        configFragmentResultListener();
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        if (c11 == null || (lifecycle = c11.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.ugc.widgets.selectionItemForm.cell.SelectionFormCellWidgetVH.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                SelectionFormCellWidgetVH.this.clearFragmentResultListener();
                owner.getLifecycle().e(this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearFragmentResultListener() {
        ComponentCallbacksC5392m parentFragment;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (parentFragment = c11.getParentFragment()) == null) {
            return;
        }
        parentFragment.getParentFragmentManager().s("CELL_SELECTION_FORM_REQUEST_KEY");
    }

    private final void configFragmentResultListener() {
        ComponentCallbacksC5392m parentFragment;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (parentFragment = c11.getParentFragment()) == null) {
            return;
        }
        C5402x.b(parentFragment, "CELL_SELECTION_FORM_REQUEST_KEY", new SelectionFormCellWidgetVH$configFragmentResultListener$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setToggleState(boolean isChecked) {
        SelectionFormCellVO boundData = getBoundData();
        if (boundData != null && boundData.getUploadValue() == null) {
            this.refs.getController().update(new SelectionFormToggleUpdateKey(boundData.getId(), isChecked));
            this.selectionFormViewModel.onViewIntent(new ViewIntent.CellUpdated(boundData.getUploadKey(), Boolean.valueOf(isChecked)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SelectionFormCellVO item, @NotNull l20.d info) {
        Boolean isSelected;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.cellWrapper.bind(item, this.actionHandler);
        String uploadValue = item.getUploadValue();
        if (uploadValue != null) {
            this.selectionFormViewModel.onViewIntent(new ViewIntent.CellUpdated(item.getUploadKey(), uploadValue));
        }
        CellDTO.RightBlock rightBlock = item.getCell().getRightBlock();
        AtomDTO control = rightBlock != null ? rightBlock.getControl() : null;
        ToggleDTO toggleDTO = control instanceof ToggleDTO ? (ToggleDTO) control : null;
        setToggleState((toggleDTO == null || (isSelected = toggleDTO.isSelected()) == null) ? false : isSelected.booleanValue());
    }
}
