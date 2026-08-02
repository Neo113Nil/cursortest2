package ru.ozon.app.android.partpayment.formpage.view.vh;

import DS.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.databinding.ItemDynamicFormFieldPickerBinding;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vh/PickerFieldVH;", "Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;", "Landroid/view/View;", "containerView", "Lkotlin/Function1;", "", "onPickerFieldsClicked", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "item", "bind", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldPickerBinding;", "binding", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldPickerBinding;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PickerFieldVH extends DynamicFormFieldVH {

    @NotNull
    private final ItemDynamicFormFieldPickerBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final Function1<DynamicFormFieldVH, Unit> onPickerFieldsClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PickerFieldVH(@NotNull View containerView, @NotNull Function1<? super DynamicFormFieldVH, Unit> onPickerFieldsClicked) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(onPickerFieldsClicked, "onPickerFieldsClicked");
        this.containerView = containerView;
        this.onPickerFieldsClicked = onPickerFieldsClicked;
        ItemDynamicFormFieldPickerBinding bind = ItemDynamicFormFieldPickerBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        containerView.setOnClickListener(new a(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(PickerFieldVH pickerFieldVH, View view) {
        pickerFieldVH.onPickerFieldsClicked.invoke(pickerFieldVH);
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.vh.DynamicFormFieldVH
    public void bind(@NotNull FormPageVO.Field item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind(item);
        FormPageVO.Field.Picker picker = (FormPageVO.Field.Picker) item;
        ItemDynamicFormFieldPickerBinding itemDynamicFormFieldPickerBinding = this.binding;
        itemDynamicFormFieldPickerBinding.titleTv.setText(picker.getTitle());
        itemDynamicFormFieldPickerBinding.titleTv.setContentDescription(picker.getTitle());
        itemDynamicFormFieldPickerBinding.subtitleTv.setText(picker.getDisplayValue());
        itemDynamicFormFieldPickerBinding.subtitleTv.setContentDescription(picker.getDisplayValue());
    }
}
