package ru.ozon.uni.foundation.components.button;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import S0.S;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;
import q1.AbstractC8972b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FoundationIconButtonKt$FoundationIconButton$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ S $iconAlpha;
    final /* synthetic */ long $iconColor;
    final /* synthetic */ AbstractC7799Q $iconGradientBrush;
    final /* synthetic */ e $iconModifier;
    final /* synthetic */ float $iconSize;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $loader;
    final /* synthetic */ e $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FoundationIconButtonKt$FoundationIconButton$3(AbstractC8972b abstractC8972b, long j11, AbstractC7799Q abstractC7799Q, float f7, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, e eVar, e eVar2, S s11, int i11, int i12) {
        super(2);
        this.$icon = abstractC8972b;
        this.$iconColor = j11;
        this.$iconGradientBrush = abstractC7799Q;
        this.$iconSize = f7;
        this.$loader = function2;
        this.$modifier = eVar;
        this.$iconModifier = eVar2;
        this.$iconAlpha = s11;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FoundationIconButtonKt.m2984FoundationIconButtonM1461ms(this.$icon, this.$iconColor, this.$iconGradientBrush, this.$iconSize, this.$loader, this.$modifier, this.$iconModifier, this.$iconAlpha, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
