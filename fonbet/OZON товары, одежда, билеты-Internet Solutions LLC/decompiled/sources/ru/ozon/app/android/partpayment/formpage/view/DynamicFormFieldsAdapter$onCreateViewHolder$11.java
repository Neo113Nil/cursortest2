package ru.ozon.app.android.partpayment.formpage.view;

import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.partpayment.formpage.view.vh.DynamicFormFieldVH;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class DynamicFormFieldsAdapter$onCreateViewHolder$11 extends C7735q implements InterfaceC6511n<DynamicFormFieldVH, FormPageVO.Field, Boolean, Unit> {
    DynamicFormFieldsAdapter$onCreateViewHolder$11(Object obj) {
        super(3, obj, DynamicFormFieldsAdapter.class, "onValueChanged", "onValueChanged(Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;Z)V", 0);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(DynamicFormFieldVH dynamicFormFieldVH, FormPageVO.Field field, Boolean bool) {
        invoke(dynamicFormFieldVH, field, bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(DynamicFormFieldVH p02, FormPageVO.Field p12, boolean z11) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((DynamicFormFieldsAdapter) this.receiver).onValueChanged(p02, p12, z11);
    }
}
