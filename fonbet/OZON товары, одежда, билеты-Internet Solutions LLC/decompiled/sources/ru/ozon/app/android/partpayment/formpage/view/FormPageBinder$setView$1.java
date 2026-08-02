package ru.ozon.app.android.partpayment.formpage.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class FormPageBinder$setView$1 extends C7735q implements Function2<FormPageVO.Field, Boolean, Unit> {
    FormPageBinder$setView$1(Object obj) {
        super(2, obj, FormPageViewModel.class, "onFieldChanged", "onFieldChanged(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(FormPageVO.Field field, Boolean bool) {
        invoke(field, bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(FormPageVO.Field p02, boolean z11) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((FormPageViewModel) this.receiver).onFieldChanged(p02, z11);
    }
}
