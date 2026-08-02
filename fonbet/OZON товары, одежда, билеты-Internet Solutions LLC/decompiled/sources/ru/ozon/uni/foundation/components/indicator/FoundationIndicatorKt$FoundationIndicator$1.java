package ru.ozon.uni.foundation.components.indicator;

import Bl0.C2652m;
import K1.T;
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
final class FoundationIndicatorKt$FoundationIndicator$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ J0 $backgroundShape;
    final /* synthetic */ float $height;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ long $iconColor;
    final /* synthetic */ e $iconModifier;
    final /* synthetic */ float $labelHorizontalPadding;
    final /* synthetic */ e $labelModifier;
    final /* synthetic */ float $minWidth;
    final /* synthetic */ e $modifier;
    final /* synthetic */ String $text;
    final /* synthetic */ long $textColor;
    final /* synthetic */ T $textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FoundationIndicatorKt$FoundationIndicator$1(e eVar, e eVar2, e eVar3, long j11, J0 j02, float f7, AbstractC8972b abstractC8972b, long j12, float f11, float f12, String str, long j13, T t2, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$iconModifier = eVar2;
        this.$labelModifier = eVar3;
        this.$backgroundColor = j11;
        this.$backgroundShape = j02;
        this.$height = f7;
        this.$icon = abstractC8972b;
        this.$iconColor = j12;
        this.$labelHorizontalPadding = f11;
        this.$minWidth = f12;
        this.$text = str;
        this.$textColor = j13;
        this.$textStyle = t2;
        this.$$changed = i11;
        this.$$changed1 = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FoundationIndicatorKt.m3002FoundationIndicatorgSnA9MM(this.$modifier, this.$iconModifier, this.$labelModifier, this.$backgroundColor, this.$backgroundShape, this.$height, this.$icon, this.$iconColor, this.$labelHorizontalPadding, this.$minWidth, this.$text, this.$textColor, this.$textStyle, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1));
    }
}
