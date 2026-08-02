package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker.VariantPickerVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class VariantPickerVH$variantsAdapter$1 extends C7735q implements Function1<VariantPickerVO.VariantPickerItem.Variant, Unit> {
    VariantPickerVH$variantsAdapter$1(Object obj) {
        super(1, obj, VariantPickerVH.class, "onVariantSelected", "onVariantSelected(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO$VariantPickerItem$Variant;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(VariantPickerVO.VariantPickerItem.Variant variant) {
        invoke2(variant);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(VariantPickerVO.VariantPickerItem.Variant p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((VariantPickerVH) this.receiver).onVariantSelected(p02);
    }
}
