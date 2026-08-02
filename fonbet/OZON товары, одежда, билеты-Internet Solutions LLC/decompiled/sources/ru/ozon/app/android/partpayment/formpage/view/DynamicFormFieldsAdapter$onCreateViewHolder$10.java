package ru.ozon.app.android.partpayment.formpage.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.partpayment.formpage.view.vh.DynamicFormFieldVH;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DynamicFormFieldsAdapter$onCreateViewHolder$10 extends AbstractC7737t implements Function1<DynamicFormFieldVH, Unit> {
    final /* synthetic */ DynamicFormFieldsAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DynamicFormFieldsAdapter$onCreateViewHolder$10(DynamicFormFieldsAdapter dynamicFormFieldsAdapter) {
        super(1);
        this.this$0 = dynamicFormFieldsAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DynamicFormFieldVH dynamicFormFieldVH) {
        invoke2(dynamicFormFieldVH);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DynamicFormFieldVH PickerFieldVH) {
        FormPageVO.Field currentItem;
        Function1<FormPageVO.Field, Unit> onPickerClick;
        Intrinsics.checkNotNullParameter(PickerFieldVH, "$this$PickerFieldVH");
        currentItem = this.this$0.getCurrentItem(PickerFieldVH);
        if (currentItem == null || (onPickerClick = this.this$0.getOnPickerClick()) == null) {
            return;
        }
        onPickerClick.invoke(currentItem);
    }
}
