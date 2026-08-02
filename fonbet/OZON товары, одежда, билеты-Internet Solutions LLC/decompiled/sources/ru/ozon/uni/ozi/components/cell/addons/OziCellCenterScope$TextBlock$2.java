package ru.ozon.uni.ozi.components.cell.addons;

import Bl0.C2652m;
import K1.T;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziCellCenterScope$TextBlock$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isReversed;
    final /* synthetic */ CharSequence $subtitle;
    final /* synthetic */ long $subtitleColor;
    final /* synthetic */ int $subtitleMaxLines;
    final /* synthetic */ T $subtitleStyle;
    final /* synthetic */ CharSequence $title;
    final /* synthetic */ long $titleColor;
    final /* synthetic */ int $titleMaxLines;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $titleSlot;
    final /* synthetic */ T $titleStyle;
    final /* synthetic */ OziCellCenterScope $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OziCellCenterScope$TextBlock$2(OziCellCenterScope oziCellCenterScope, CharSequence charSequence, int i11, long j11, T t2, CharSequence charSequence2, int i12, long j12, T t11, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, boolean z11, int i13, int i14, int i15) {
        super(2);
        this.$tmp0_rcvr = oziCellCenterScope;
        this.$title = charSequence;
        this.$titleMaxLines = i11;
        this.$titleColor = j11;
        this.$titleStyle = t2;
        this.$subtitle = charSequence2;
        this.$subtitleMaxLines = i12;
        this.$subtitleColor = j12;
        this.$subtitleStyle = t11;
        this.$titleSlot = function2;
        this.$isReversed = z11;
        this.$$changed = i13;
        this.$$changed1 = i14;
        this.$$default = i15;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        this.$tmp0_rcvr.m3074TextBlockOjOrPUU(this.$title, this.$titleMaxLines, this.$titleColor, this.$titleStyle, this.$subtitle, this.$subtitleMaxLines, this.$subtitleColor, this.$subtitleStyle, this.$titleSlot, this.$isReversed, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
