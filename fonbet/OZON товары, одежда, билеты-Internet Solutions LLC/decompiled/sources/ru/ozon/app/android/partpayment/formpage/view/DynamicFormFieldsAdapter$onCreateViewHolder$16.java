package ru.ozon.app.android.partpayment.formpage.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.partpayment.formpage.view.vh.DynamicFormFieldVH;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class DynamicFormFieldsAdapter$onCreateViewHolder$16 extends C7735q implements Function1<DynamicFormFieldVH, Unit> {
    DynamicFormFieldsAdapter$onCreateViewHolder$16(Object obj) {
        super(1, obj, DynamicFormFieldsAdapter.class, "onButtonClicked", "onButtonClicked(Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DynamicFormFieldVH dynamicFormFieldVH) {
        invoke2(dynamicFormFieldVH);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DynamicFormFieldVH p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((DynamicFormFieldsAdapter) this.receiver).onButtonClicked(p02);
    }
}
