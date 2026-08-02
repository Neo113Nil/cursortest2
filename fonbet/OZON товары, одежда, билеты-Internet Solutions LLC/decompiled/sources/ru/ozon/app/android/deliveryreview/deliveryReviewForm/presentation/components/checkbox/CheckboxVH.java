package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.checkbox;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewComponentCheckboxBinding;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCheckboxRadioView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/checkbox/CheckboxVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentCheckboxBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;", "deliveryReviewFormViewModel", "<init>", "(Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentCheckboxBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;)V", "", "groupId", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "component", "", "bind", "(ILru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;)V", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentCheckboxBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "I", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckboxVH extends RecyclerView.C {

    @NotNull
    private final ItemDeliveryReviewComponentCheckboxBinding binding;
    private ComponentVO component;
    private int groupId;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxVH(@NotNull ItemDeliveryReviewComponentCheckboxBinding binding, @NotNull ComposerReferences refs, @NotNull DeliveryReviewFormViewModel deliveryReviewFormViewModel) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(deliveryReviewFormViewModel, "deliveryReviewFormViewModel");
        this.binding = binding;
        this.refs = refs;
        this.groupId = -1;
        CellWithSubtitleCheckboxRadioView cellWithSubtitleCheckboxRadioView = binding.checkboxV;
        cellWithSubtitleCheckboxRadioView.setBackground(null);
        cellWithSubtitleCheckboxRadioView.hideSeparator(true);
        cellWithSubtitleCheckboxRadioView.setOnCheckedChangeListener(new CheckboxVH$1$1(this, deliveryReviewFormViewModel));
    }

    public final void bind(int groupId, @NotNull ComponentVO component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.groupId = groupId;
        this.component = component;
        ItemDeliveryReviewComponentCheckboxBinding itemDeliveryReviewComponentCheckboxBinding = this.binding;
        CellWithSubtitleCheckboxRadioView checkboxV = itemDeliveryReviewComponentCheckboxBinding.checkboxV;
        Intrinsics.checkNotNullExpressionValue(checkboxV, "checkboxV");
        ViewExtKt.showOrGone(checkboxV, Boolean.valueOf(!component.getHidden()));
        if (component.getHidden()) {
            return;
        }
        ElementVO element = component.getElement();
        ElementVO.Checkbox checkbox = element instanceof ElementVO.Checkbox ? (ElementVO.Checkbox) element : null;
        if (checkbox != null) {
            itemDeliveryReviewComponentCheckboxBinding.checkboxV.setTitle(checkbox.getText());
            itemDeliveryReviewComponentCheckboxBinding.checkboxV.setSelected(checkbox.getIsSelected());
        }
        itemDeliveryReviewComponentCheckboxBinding.checkboxV.getSelectorView().setEnabled(!component.getDisabled());
    }
}
