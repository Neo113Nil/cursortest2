package ru.ozon.app.android.partpayment.formpage.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class FormPageBinder$setView$3 extends C7735q implements Function1<FormPageVO.Field, Unit> {
    FormPageBinder$setView$3(Object obj) {
        super(1, obj, FormPageViewModel.class, "onButtonClick", "onButtonClick(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FormPageVO.Field field) {
        invoke2(field);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FormPageVO.Field p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((FormPageViewModel) this.receiver).onButtonClick(p02);
    }
}
