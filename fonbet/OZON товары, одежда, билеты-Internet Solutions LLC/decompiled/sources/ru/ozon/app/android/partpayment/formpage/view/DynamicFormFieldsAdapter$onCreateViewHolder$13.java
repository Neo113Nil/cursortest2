package ru.ozon.app.android.partpayment.formpage.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.partpayment.formpage.view.vh.DynamicFormFieldVH;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class DynamicFormFieldsAdapter$onCreateViewHolder$13 extends C7735q implements Function2<DynamicFormFieldVH, String, Unit> {
    DynamicFormFieldsAdapter$onCreateViewHolder$13(Object obj) {
        super(2, obj, DynamicFormFieldsAdapter.class, "onChangeClick", "onChangeClick(Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(DynamicFormFieldVH dynamicFormFieldVH, String str) {
        invoke2(dynamicFormFieldVH, str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DynamicFormFieldVH p02, String p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((DynamicFormFieldsAdapter) this.receiver).onChangeClick(p02, p12);
    }
}
