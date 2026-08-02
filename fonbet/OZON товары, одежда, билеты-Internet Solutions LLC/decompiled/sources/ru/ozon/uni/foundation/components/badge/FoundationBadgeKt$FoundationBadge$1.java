package ru.ozon.uni.foundation.components.badge;

import Bl0.C2652m;
import K1.T;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;
import q1.AbstractC8972b;
import u0.InterfaceC9914x;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FoundationBadgeKt$FoundationBadge$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ int $$default;
    final /* synthetic */ AbstractC7799Q $backgroundBrush;
    final /* synthetic */ float $bottomEndCornerRadius;
    final /* synthetic */ float $bottomStartCornerRadius;
    final /* synthetic */ InterfaceC9914x $contentPadding;
    final /* synthetic */ AbstractC8972b $endGraphic;
    final /* synthetic */ long $endGraphicColor;
    final /* synthetic */ e $endGraphicModifier;
    final /* synthetic */ float $endGraphicPadding;
    final /* synthetic */ float $graphicSize;
    final /* synthetic */ float $height;
    final /* synthetic */ boolean $isAllCaps;
    final /* synthetic */ boolean $isClickable;
    final /* synthetic */ String $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ e $labelModifier;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ AbstractC8972b $startGraphic;
    final /* synthetic */ long $startGraphicColor;
    final /* synthetic */ e $startGraphicModifier;
    final /* synthetic */ float $startGraphicPadding;
    final /* synthetic */ T $textStyle;
    final /* synthetic */ float $topEndCornerRadius;
    final /* synthetic */ float $topStartCornerRadius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FoundationBadgeKt$FoundationBadge$1(e eVar, e eVar2, e eVar3, e eVar4, float f7, float f11, float f12, float f13, float f14, AbstractC7799Q abstractC7799Q, Function0<Unit> function0, boolean z11, AbstractC8972b abstractC8972b, AbstractC8972b abstractC8972b2, long j11, long j12, String str, T t2, long j13, float f15, float f16, float f17, InterfaceC9914x interfaceC9914x, boolean z12, int i11, int i12, int i13, int i14) {
        super(2);
        this.$modifier = eVar;
        this.$labelModifier = eVar2;
        this.$startGraphicModifier = eVar3;
        this.$endGraphicModifier = eVar4;
        this.$height = f7;
        this.$topStartCornerRadius = f11;
        this.$topEndCornerRadius = f12;
        this.$bottomEndCornerRadius = f13;
        this.$bottomStartCornerRadius = f14;
        this.$backgroundBrush = abstractC7799Q;
        this.$onClick = function0;
        this.$isClickable = z11;
        this.$startGraphic = abstractC8972b;
        this.$endGraphic = abstractC8972b2;
        this.$startGraphicColor = j11;
        this.$labelColor = j12;
        this.$label = str;
        this.$textStyle = t2;
        this.$endGraphicColor = j13;
        this.$startGraphicPadding = f15;
        this.$endGraphicPadding = f16;
        this.$graphicSize = f17;
        this.$contentPadding = interfaceC9914x;
        this.$isAllCaps = z12;
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
        FoundationBadgeKt.m2974FoundationBadgeWhIEsx8(this.$modifier, this.$labelModifier, this.$startGraphicModifier, this.$endGraphicModifier, this.$height, this.$topStartCornerRadius, this.$topEndCornerRadius, this.$bottomEndCornerRadius, this.$bottomStartCornerRadius, this.$backgroundBrush, this.$onClick, this.$isClickable, this.$startGraphic, this.$endGraphic, this.$startGraphicColor, this.$labelColor, this.$label, this.$textStyle, this.$endGraphicColor, this.$startGraphicPadding, this.$endGraphicPadding, this.$graphicSize, this.$contentPadding, this.$isAllCaps, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), C2652m.e(this.$$changed2), this.$$default);
    }
}
