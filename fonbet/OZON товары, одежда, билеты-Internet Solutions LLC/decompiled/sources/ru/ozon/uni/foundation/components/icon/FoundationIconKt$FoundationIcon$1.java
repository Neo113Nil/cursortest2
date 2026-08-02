package ru.ozon.uni.foundation.components.icon;

import B1.InterfaceC2547p;
import Bl0.C2652m;
import K1.T;
import S0.InterfaceC3967k;
import V1.r;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.J0;
import q1.AbstractC8972b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FoundationIconKt$FoundationIcon$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ int $$default;
    final /* synthetic */ AbstractC7799Q $backgroundBrush;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ AbstractC8972b $backgroundImage;
    final /* synthetic */ e $backgroundImageModifier;
    final /* synthetic */ J0 $backgroundShape;
    final /* synthetic */ AbstractC7799Q $borderBrush;
    final /* synthetic */ float $borderWidth;
    final /* synthetic */ C7807Z $color;
    final /* synthetic */ InterfaceC2547p $contentScale;
    final /* synthetic */ float $contentSize;
    final /* synthetic */ AbstractC7799Q $gradientBrush;
    final /* synthetic */ e $graphicModifier;
    final /* synthetic */ boolean $hasBorder;
    final /* synthetic */ boolean $hasParanja;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ boolean $isLabel;
    final /* synthetic */ e $labelModifier;
    final /* synthetic */ e $modifier;
    final /* synthetic */ long $paranjaColor;
    final /* synthetic */ e $paranjaModifier;
    final /* synthetic */ float $shapeSize;
    final /* synthetic */ T $style;
    final /* synthetic */ String $text;
    final /* synthetic */ r $textOverflow;
    final /* synthetic */ float $textPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FoundationIconKt$FoundationIcon$1(e eVar, boolean z11, AbstractC8972b abstractC8972b, C7807Z c7807z, AbstractC7799Q abstractC7799Q, String str, T t2, r rVar, e eVar2, e eVar3, e eVar4, e eVar5, AbstractC8972b abstractC8972b2, J0 j02, boolean z12, long j11, boolean z13, long j12, AbstractC7799Q abstractC7799Q2, AbstractC7799Q abstractC7799Q3, float f7, float f11, float f12, float f13, InterfaceC2547p interfaceC2547p, int i11, int i12, int i13, int i14) {
        super(2);
        this.$modifier = eVar;
        this.$isLabel = z11;
        this.$icon = abstractC8972b;
        this.$color = c7807z;
        this.$gradientBrush = abstractC7799Q;
        this.$text = str;
        this.$style = t2;
        this.$textOverflow = rVar;
        this.$backgroundImageModifier = eVar2;
        this.$paranjaModifier = eVar3;
        this.$graphicModifier = eVar4;
        this.$labelModifier = eVar5;
        this.$backgroundImage = abstractC8972b2;
        this.$backgroundShape = j02;
        this.$hasParanja = z12;
        this.$paranjaColor = j11;
        this.$hasBorder = z13;
        this.$backgroundColor = j12;
        this.$backgroundBrush = abstractC7799Q2;
        this.$borderBrush = abstractC7799Q3;
        this.$shapeSize = f7;
        this.$contentSize = f11;
        this.$textPadding = f12;
        this.$borderWidth = f13;
        this.$contentScale = interfaceC2547p;
        this.$$changed = i11;
        this.$$changed1 = i12;
        this.$$changed2 = i13;
        this.$$default = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FoundationIconKt.m2991FoundationIconom_xur8(this.$modifier, this.$isLabel, this.$icon, this.$color, this.$gradientBrush, this.$text, this.$style, this.$textOverflow, this.$backgroundImageModifier, this.$paranjaModifier, this.$graphicModifier, this.$labelModifier, this.$backgroundImage, this.$backgroundShape, this.$hasParanja, this.$paranjaColor, this.$hasBorder, this.$backgroundColor, this.$backgroundBrush, this.$borderBrush, this.$shapeSize, this.$contentSize, this.$textPadding, this.$borderWidth, this.$contentScale, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), C2652m.e(this.$$changed2), this.$$default);
    }
}
