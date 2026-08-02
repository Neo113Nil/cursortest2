package ru.ozon.uni.foundation.components.toggle;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import u0.InterfaceC9893b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class FoundationToggleKt$Knob$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC6250b $alignment;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ long $iconColor;
    final /* synthetic */ e $iconModifier;
    final /* synthetic */ boolean $isIconVisible;
    final /* synthetic */ long $knobBackgroundColor;
    final /* synthetic */ float $knobPadding;
    final /* synthetic */ float $knobSize;
    final /* synthetic */ e $modifier;
    final /* synthetic */ InterfaceC9893b $this_Knob;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FoundationToggleKt$Knob$2(InterfaceC9893b interfaceC9893b, e eVar, e eVar2, InterfaceC6250b interfaceC6250b, boolean z11, AbstractC8972b abstractC8972b, long j11, long j12, float f7, float f11, int i11) {
        super(2);
        this.$this_Knob = interfaceC9893b;
        this.$modifier = eVar;
        this.$iconModifier = eVar2;
        this.$alignment = interfaceC6250b;
        this.$isIconVisible = z11;
        this.$icon = abstractC8972b;
        this.$knobBackgroundColor = j11;
        this.$iconColor = j12;
        this.$knobSize = f7;
        this.$knobPadding = f11;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FoundationToggleKt.m3040Knob7BdGs9g(this.$this_Knob, this.$modifier, this.$iconModifier, this.$alignment, this.$isIconVisible, this.$icon, this.$knobBackgroundColor, this.$iconColor, this.$knobSize, this.$knobPadding, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
