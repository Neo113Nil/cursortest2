package ru.ozon.uni.foundation.components.toggle;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import t0.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class FoundationToggleKt$FoundationToggle$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ e $iconModifier;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isKnobIconVisible;
    final /* synthetic */ long $knobBackgroundColor;
    final /* synthetic */ AbstractC8972b $knobIcon;
    final /* synthetic */ long $knobIconColor;
    final /* synthetic */ e $knobModifier;
    final /* synthetic */ float $knobPadding;
    final /* synthetic */ float $knobSize;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;
    final /* synthetic */ long $size;
    final /* synthetic */ boolean $status;
    final /* synthetic */ long $toggledBackgroundColor;
    final /* synthetic */ long $untoggledBackgroundColor;
    final /* synthetic */ long $untoggledDisabledBbackgroundColor;
    final /* synthetic */ float $verticalPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FoundationToggleKt$FoundationToggle$3(e eVar, e eVar2, e eVar3, boolean z11, boolean z12, q qVar, Function1<? super Boolean, Unit> function1, boolean z13, long j11, AbstractC8972b abstractC8972b, long j12, long j13, float f7, float f11, float f12, long j14, long j15, long j16, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$knobModifier = eVar2;
        this.$iconModifier = eVar3;
        this.$status = z11;
        this.$isEnabled = z12;
        this.$interactionSource = qVar;
        this.$onCheckedChange = function1;
        this.$isKnobIconVisible = z13;
        this.$knobBackgroundColor = j11;
        this.$knobIcon = abstractC8972b;
        this.$knobIconColor = j12;
        this.$size = j13;
        this.$verticalPadding = f7;
        this.$knobSize = f11;
        this.$knobPadding = f12;
        this.$untoggledBackgroundColor = j14;
        this.$untoggledDisabledBbackgroundColor = j15;
        this.$toggledBackgroundColor = j16;
        this.$$changed = i11;
        this.$$changed1 = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FoundationToggleKt.m3039FoundationToggleMcPsvjw(this.$modifier, this.$knobModifier, this.$iconModifier, this.$status, this.$isEnabled, this.$interactionSource, this.$onCheckedChange, this.$isKnobIconVisible, this.$knobBackgroundColor, this.$knobIcon, this.$knobIconColor, this.$size, this.$verticalPadding, this.$knobSize, this.$knobPadding, this.$untoggledBackgroundColor, this.$untoggledDisabledBbackgroundColor, this.$toggledBackgroundColor, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1));
    }
}
