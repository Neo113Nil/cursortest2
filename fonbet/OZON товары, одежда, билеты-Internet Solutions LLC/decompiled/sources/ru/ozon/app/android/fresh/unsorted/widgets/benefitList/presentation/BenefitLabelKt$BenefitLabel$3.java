package ru.ozon.app.android.fresh.unsorted.widgets.benefitList.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import WZ.t;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.unsorted.widgets.benefitList.presentation.BenefitListVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class BenefitLabelKt$BenefitLabel$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ BenefitListVO.Badge $item;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function2<AtomAction, t, Unit> $onClick;
    final /* synthetic */ Function1<t, Unit> $onView;
    final /* synthetic */ float $separatorTopPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BenefitLabelKt$BenefitLabel$3(e eVar, BenefitListVO.Badge badge, Function2<? super AtomAction, ? super t, Unit> function2, Function1<? super t, Unit> function1, float f7, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$item = badge;
        this.$onClick = function2;
        this.$onView = function1;
        this.$separatorTopPadding = f7;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        BenefitLabelKt.m760BenefitLabelFJfuzF0(this.$modifier, this.$item, this.$onClick, this.$onView, this.$separatorTopPadding, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
