package ru.ozon.app.android.saleBadge.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.saleBadge.presentation.SaleBadgeVO;
import ru.ozon.app.android.timerMolecule.presentation.TimerVO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SaleBadgeWidgetKt$BadgeContentWithAnimLabels$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ float $labelAlpha;
    final /* synthetic */ SaleBadgeVO.LabelAnimation $labelAnimation;
    final /* synthetic */ TextDTO $text;
    final /* synthetic */ TimerVO $timer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaleBadgeWidgetKt$BadgeContentWithAnimLabels$2(float f7, TextDTO textDTO, TimerVO timerVO, SaleBadgeVO.LabelAnimation labelAnimation, int i11) {
        super(2);
        this.$labelAlpha = f7;
        this.$text = textDTO;
        this.$timer = timerVO;
        this.$labelAnimation = labelAnimation;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        SaleBadgeWidgetKt.BadgeContentWithAnimLabels(this.$labelAlpha, this.$text, this.$timer, this.$labelAnimation, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
