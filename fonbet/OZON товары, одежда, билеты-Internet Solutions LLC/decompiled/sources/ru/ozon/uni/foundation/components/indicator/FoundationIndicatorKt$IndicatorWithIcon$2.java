package ru.ozon.uni.foundation.components.indicator;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.J0;
import q1.AbstractC8972b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FoundationIndicatorKt$IndicatorWithIcon$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ J0 $backgroundShape;
    final /* synthetic */ float $height;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ long $iconColor;
    final /* synthetic */ e $iconModifier;
    final /* synthetic */ float $minWidth;
    final /* synthetic */ e $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FoundationIndicatorKt$IndicatorWithIcon$2(e eVar, e eVar2, float f7, float f11, long j11, J0 j02, AbstractC8972b abstractC8972b, long j12, int i11) {
        super(2);
        this.$modifier = eVar;
        this.$iconModifier = eVar2;
        this.$minWidth = f7;
        this.$height = f11;
        this.$backgroundColor = j11;
        this.$backgroundShape = j02;
        this.$icon = abstractC8972b;
        this.$iconColor = j12;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FoundationIndicatorKt.m3003IndicatorWithIconm2WDlOo(this.$modifier, this.$iconModifier, this.$minWidth, this.$height, this.$backgroundColor, this.$backgroundShape, this.$icon, this.$iconColor, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
