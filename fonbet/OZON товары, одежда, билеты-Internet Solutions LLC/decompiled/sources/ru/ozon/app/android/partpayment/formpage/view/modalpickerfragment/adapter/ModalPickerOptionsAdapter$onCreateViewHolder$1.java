package ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/adapter/ModalPickerOptionsViewHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ModalPickerOptionsAdapter$onCreateViewHolder$1 extends AbstractC7737t implements Function1<ModalPickerOptionsViewHolder, Unit> {
    final /* synthetic */ ModalPickerOptionsAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModalPickerOptionsAdapter$onCreateViewHolder$1(ModalPickerOptionsAdapter modalPickerOptionsAdapter) {
        super(1);
        this.this$0 = modalPickerOptionsAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ModalPickerOptionsViewHolder modalPickerOptionsViewHolder) {
        invoke2(modalPickerOptionsViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ModalPickerOptionsViewHolder ModalPickerOptionsViewHolder) {
        List list;
        Function1<FormPageVO.Field.Options.Picker, Unit> onSelect;
        Intrinsics.checkNotNullParameter(ModalPickerOptionsViewHolder, "$this$ModalPickerOptionsViewHolder");
        Integer valueOf = Integer.valueOf(ModalPickerOptionsViewHolder.getAdapterPosition());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            ModalPickerOptionsAdapter modalPickerOptionsAdapter = this.this$0;
            int intValue = valueOf.intValue();
            list = modalPickerOptionsAdapter.items;
            FormPageVO.Field.Options.Picker picker = (FormPageVO.Field.Options.Picker) list.get(intValue);
            if (picker == null || (onSelect = this.this$0.getOnSelect()) == null) {
                return;
            }
            onSelect.invoke(picker);
        }
    }
}
