package ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class ModalPickerBinder$setView$1 extends C7735q implements Function1<FormPageVO.Field.Options.Picker, Unit> {
    ModalPickerBinder$setView$1(Object obj) {
        super(1, obj, ModalPickerFragmentViewModel.class, "onSelect", "onSelect(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FormPageVO.Field.Options.Picker picker) {
        invoke2(picker);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FormPageVO.Field.Options.Picker p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((ModalPickerFragmentViewModel) this.receiver).onSelect(p02);
    }
}
