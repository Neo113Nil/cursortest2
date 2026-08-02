package ru.ozon.app.android.ugc.widgets.selectionItemForm.productPicker;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile.ProductPickerViewModel;
import ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile.data.ProductPickerDTO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SelectionFormViewModel;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.ViewIntent;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.productPicker.nested.SelectionFormProductPickerAdapter;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/SelectionFormProductPickerVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/SelectionFormProductPickerVO;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/ProductPickerViewModel;", "viewModel", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;", "selectionFormViewModel", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/ProductPickerViewModel;Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/SelectionFormProductPickerVO;Ll20/d;)V", "Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/ProductPickerViewModel;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/nested/SelectionFormProductPickerAdapter;", "adapter", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/nested/SelectionFormProductPickerAdapter;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionFormProductPickerVH extends k<SelectionFormProductPickerVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final SelectionFormProductPickerAdapter adapter;

    @NotNull
    private final SelectionFormViewModel selectionFormViewModel;

    @NotNull
    private final ProductPickerViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionFormProductPickerVH(@NotNull ComposerReferences refs, @NotNull RecyclerView recyclerView, @NotNull ProductPickerViewModel viewModel, @NotNull SelectionFormViewModel selectionFormViewModel) {
        super(recyclerView);
        AbstractC5434v lifecycle;
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(selectionFormViewModel, "selectionFormViewModel");
        this.viewModel = viewModel;
        this.selectionFormViewModel = selectionFormViewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        SelectionFormProductPickerAdapter selectionFormProductPickerAdapter = new SelectionFormProductPickerAdapter(buildHandler);
        this.adapter = selectionFormProductPickerAdapter;
        recyclerView.setAdapter(selectionFormProductPickerAdapter);
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        if (c11 == null || (lifecycle = c11.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.ugc.widgets.selectionItemForm.productPicker.SelectionFormProductPickerVH.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                SelectionFormProductPickerVH.this.viewModel.clear();
                owner.getLifecycle().e(this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SelectionFormProductPickerVO item, @NotNull d info) {
        SelectionFormProductPickerVO createFromProductPickerDTO;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ProductPickerDTO updatedProductPickerModel = this.viewModel.getUpdatedProductPickerModel();
        if (updatedProductPickerModel != null && (createFromProductPickerDTO = SelectionFormProductPickerVO.INSTANCE.createFromProductPickerDTO(item.getId(), updatedProductPickerModel)) != null) {
            item = createFromProductPickerDTO;
        }
        this.adapter.submitList(item);
        this.selectionFormViewModel.onViewIntent(new ViewIntent.ProductsUpdated(item.getUploadValue()));
    }
}
