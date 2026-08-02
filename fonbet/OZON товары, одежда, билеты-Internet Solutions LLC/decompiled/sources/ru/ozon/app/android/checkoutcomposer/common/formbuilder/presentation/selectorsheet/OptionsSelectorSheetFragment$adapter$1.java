package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.selectorsheet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OptionsSelectorSheetFragment$adapter$1 extends C7735q implements Function1<FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option, Unit> {
    OptionsSelectorSheetFragment$adapter$1(Object obj) {
        super(1, obj, OptionsSelectorSheetFragment.class, "handleOnOptionSelected", "handleOnOptionSelected(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions$Option;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option option) {
        invoke2(option);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((OptionsSelectorSheetFragment) this.receiver).handleOnOptionSelected(p02);
    }
}
