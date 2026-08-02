package ru.ozon.uni.foundation.components.button;

import Bl0.C2652m;
import K1.T;
import S0.InterfaceC3967k;
import S0.S;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FoundationButtonKt$ButtonContent$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $canShowSubtitle;
    final /* synthetic */ InterfaceC6250b.InterfaceC0966b $horizontalAlignment;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ S $iconAlpha;
    final /* synthetic */ long $iconColor;
    final /* synthetic */ e $iconModifier;
    final /* synthetic */ float $iconSize;
    final /* synthetic */ float $labelHorizontalPadding;
    final /* synthetic */ float $labelIconGap;
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
    FoundationButtonKt$ButtonContent$2(e eVar, e eVar2, e eVar3, InterfaceC6250b.InterfaceC0966b interfaceC0966b, String str, String str2, AbstractC8972b abstractC8972b, boolean z11, S s11, S s12, S s13, T t2, T t11, long j11, long j12, long j13, float f7, float f11, float f12, e eVar4, int i11, int i12, int i13) {
        super(2);
        this.$iconModifier = eVar;
        this.$titleModifier = eVar2;
        this.$subtitleModifier = eVar3;
        this.$horizontalAlignment = interfaceC0966b;
        this.$title = str;
        this.$subtitle = str2;
        this.$icon = abstractC8972b;
        this.$canShowSubtitle = z11;
        this.$titleAlpha = s11;
        this.$subtitleAlpha = s12;
        this.$iconAlpha = s13;
        this.$titleTextStyle = t2;
        this.$subtitleTextStyle = t11;
        this.$titleColor = j11;
        this.$subtitleColor = j12;
        this.$iconColor = j13;
        this.$iconSize = f7;
        this.$labelHorizontalPadding = f11;
        this.$labelIconGap = f12;
        this.$modifier = eVar4;
        this.$$changed = i11;
        this.$$changed1 = i12;
        this.$$default = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FoundationButtonKt.m2978ButtonContent3Qfi9_U(this.$iconModifier, this.$titleModifier, this.$subtitleModifier, this.$horizontalAlignment, this.$title, this.$subtitle, this.$icon, this.$canShowSubtitle, this.$titleAlpha, this.$subtitleAlpha, this.$iconAlpha, this.$titleTextStyle, this.$subtitleTextStyle, this.$titleColor, this.$subtitleColor, this.$iconColor, this.$iconSize, this.$labelHorizontalPadding, this.$labelIconGap, this.$modifier, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
