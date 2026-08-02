package ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class ModalPickerBinder$setView$2 extends C7735q implements Function0<Unit> {
    ModalPickerBinder$setView$2(Object obj) {
        super(0, obj, ModalPickerFragmentViewModel.class, "onComplete", "onComplete()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ModalPickerFragmentViewModel) this.receiver).onComplete();
    }
}
