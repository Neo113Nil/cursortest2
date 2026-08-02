package ru.ozon.app.android.partpayment.formpage.view.vh;

import DQ.b;
import android.text.method.LinkMovementMethod;
import android.view.View;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.databinding.ItemDynamicFormFieldCheckboxBinding;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R,\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vh/CheckboxFieldVH;", "Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;", "Landroid/view/View;", "containerView", "Lkotlin/Function3;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "", "", "onFieldsChanged", "<init>", "(Landroid/view/View;Lfd/n;)V", "item", "bind", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lfd/n;", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldCheckboxBinding;", "binding", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldCheckboxBinding;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CheckboxFieldVH extends DynamicFormFieldVH {

    @NotNull
    private final ItemDynamicFormFieldCheckboxBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final InterfaceC6511n<DynamicFormFieldVH, FormPageVO.Field, Boolean, Unit> onFieldsChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckboxFieldVH(@NotNull View containerView, @NotNull InterfaceC6511n<? super DynamicFormFieldVH, ? super FormPageVO.Field, ? super Boolean, Unit> onFieldsChanged) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(onFieldsChanged, "onFieldsChanged");
        this.containerView = containerView;
        this.onFieldsChanged = onFieldsChanged;
        ItemDynamicFormFieldCheckboxBinding bind = ItemDynamicFormFieldCheckboxBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        b bVar = new b(this, 6);
        bind.agreementContainerCl.setOnClickListener(bVar);
        bind.descriptionTv.setOnClickListener(bVar);
        bind.descriptionTv.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(CheckboxFieldVH checkboxFieldVH, View view) {
        FormPageVO.Field.Checkbox checkbox = (FormPageVO.Field.Checkbox) checkboxFieldVH.getField();
        if (checkbox != null) {
            boolean isSelected = checkboxFieldVH.binding.checkbox.isSelected();
            boolean z11 = !isSelected;
            checkboxFieldVH.onFieldsChanged.invoke(checkboxFieldVH, FormPageVO.Field.Checkbox.copy$default(checkbox, null, null, !isSelected ? "1" : "0", "", null, 19, null), Boolean.FALSE);
            checkboxFieldVH.binding.checkbox.setSelected(z11);
        }
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.vh.DynamicFormFieldVH
    public void bind(@NotNull FormPageVO.Field item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind(item);
        FormPageVO.Field.Checkbox checkbox = (FormPageVO.Field.Checkbox) item;
        this.binding.descriptionTv.setText(checkbox.getTitle());
        this.binding.descriptionTv.setContentDescription(checkbox.getTitle());
        this.binding.checkbox.setSelected(Intrinsics.d(checkbox.getValue(), "1"));
        this.binding.checkbox.setContentDescription(checkbox.getTitle());
    }
}
