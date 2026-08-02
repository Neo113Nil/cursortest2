package ru.ozon.app.android.fresh.unsorted.widgets.benefitList.presentation;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.unsorted.widgets.benefitList.presentation.BenefitListVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class BenefitLabelKt$BenefitLabel$2$2$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ BenefitListVO.Badge $item;
    final /* synthetic */ Function2<AtomAction, t, Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BenefitLabelKt$BenefitLabel$2$2$1(BenefitListVO.Badge badge, Function2<? super AtomAction, ? super t, Unit> function2) {
        super(0);
        this.$item = badge;
        this.$onClick = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AtomAction action = this.$item.getAction();
        if (action != null) {
            this.$onClick.invoke(action, this.$item.getTrackingInfo());
        }
    }
}
