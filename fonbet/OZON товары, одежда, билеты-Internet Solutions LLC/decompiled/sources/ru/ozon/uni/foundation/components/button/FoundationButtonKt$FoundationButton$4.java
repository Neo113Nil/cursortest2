package ru.ozon.uni.foundation.components.button;

import Bl0.C2652m;
import K1.T;
import S0.InterfaceC3967k;
import S0.S;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FoundationButtonKt$FoundationButton$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $canShowSubtitle;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $companion;
    final /* synthetic */ float $gap;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ S $iconAlpha;
    final /* synthetic */ long $iconColor;
    final /* synthetic */ e $iconModifier;
    final /* synthetic */ float $iconSize;
    final /* synthetic */ float $labelHorizontalPadding;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $loader;
    final /* synthetic */ e $modifier;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ S $subtitleAlpha;
    final /* synthetic */ long $subtitleColor;
    final /* synthetic */ e $subtitleModifier;
    final /* synthetic */ T $subtitleTextStyle;
    final /* synthetic */ String $title;
    final /* synthetic */ S $titleAlpha;
    final /* synthetic */ long $titleColor;
    final /* synthetic */ e $titleModifier;
    final /* synthetic */ T $titleTextStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FoundationButtonKt$FoundationButton$4(String str, String str2, AbstractC8972b abstractC8972b, boolean z11, T t2, T t11, long j11, long j12, long j13, float f7, float f11, float f12, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, e eVar, e eVar2, e eVar3, e eVar4, S s11, S s12, S s13, int i11, int i12, int i13, int i14) {
        super(2);
        this.$title = str;
        this.$subtitle = str2;
        this.$icon = abstractC8972b;
        this.$canShowSubtitle = z11;
        this.$titleTextStyle = t2;
        this.$subtitleTextStyle = t11;
        this.$titleColor = j11;
        this.$subtitleColor = j12;
        this.$iconColor = j13;
        this.$iconSize = f7;
        this.$labelHorizontalPadding = f11;
        this.$gap = f12;
        this.$loader = function2;
        this.$companion = function22;
        this.$modifier = eVar;
        this.$iconModifier = eVar2;
        this.$titleModifier = eVar3;
        this.$subtitleModifier = eVar4;
        this.$titleAlpha = s11;
        this.$subtitleAlpha = s12;
        this.$iconAlpha = s13;
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
        FoundationButtonKt.m2980FoundationButtonfOU4Dw4(this.$title, this.$subtitle, this.$icon, this.$canShowSubtitle, this.$titleTextStyle, this.$subtitleTextStyle, this.$titleColor, this.$subtitleColor, this.$iconColor, this.$iconSize, this.$labelHorizontalPadding, this.$gap, this.$loader, this.$companion, this.$modifier, this.$iconModifier, this.$titleModifier, this.$subtitleModifier, this.$titleAlpha, this.$subtitleAlpha, this.$iconAlpha, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), C2652m.e(this.$$changed2), this.$$default);
    }
}
