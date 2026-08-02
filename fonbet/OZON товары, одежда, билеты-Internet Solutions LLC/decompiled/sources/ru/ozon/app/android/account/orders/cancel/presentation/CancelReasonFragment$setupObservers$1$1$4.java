package ru.ozon.app.android.account.orders.cancel.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class CancelReasonFragment$setupObservers$1$1$4 extends C7735q implements Function1<TextDTO, Unit> {
    CancelReasonFragment$setupObservers$1$1$4(Object obj) {
        super(1, obj, CancelReasonFragment.class, "handleButtonCaption", "handleButtonCaption(Lru/ozon/uni/atoms/data/text/TextDTO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextDTO textDTO) {
        invoke2(textDTO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TextDTO textDTO) {
        ((CancelReasonFragment) this.receiver).handleButtonCaption(textDTO);
    }
}
