package ru.ozon.uni.foundation.components.radio;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import t0.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class FoundationRadioKt$FoundationRadio$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ long $disabledBackgroundColor;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ long $enabledBackgroundColor;
    final /* synthetic */ long $enabledBorderColor;
    final /* synthetic */ long $errorBackgroundColor;
    final /* synthetic */ long $errorBorderColor;
    final /* synthetic */ boolean $hasError;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ long $iconColor;
    final /* synthetic */ e $iconModifier;
    final /* synthetic */ float $iconSize;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ float $margin;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ long $selectedEnabledBackgroundColor;
    final /* synthetic */ long $selectedEnabledBorderColor;
    final /* synthetic */ long $selectedErrorBackgroundColor;
    final /* synthetic */ long $selectedErrorBorderColor;
    final /* synthetic */ float $size;
    final /* synthetic */ float $sizeOffset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FoundationRadioKt$FoundationRadio$2(e eVar, e eVar2, Function0<Unit> function0, boolean z11, boolean z12, boolean z13, AbstractC8972b abstractC8972b, long j11, float f7, float f11, float f12, float f13, q qVar, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, int i11, int i12, int i13) {
        super(2);
        this.$modifier = eVar;
        this.$iconModifier = eVar2;
        this.$onClick = function0;
        this.$selected = z11;
        this.$enabled = z12;
        this.$hasError = z13;
        this.$icon = abstractC8972b;
        this.$iconColor = j11;
        this.$size = f7;
        this.$iconSize = f11;
        this.$sizeOffset = f12;
        this.$margin = f13;
        this.$interactionSource = qVar;
        this.$disabledBackgroundColor = j12;
        this.$selectedErrorBackgroundColor = j13;
        this.$selectedErrorBorderColor = j14;
        this.$selectedEnabledBackgroundColor = j15;
        this.$selectedEnabledBorderColor = j16;
        this.$errorBackgroundColor = j17;
        this.$errorBorderColor = j18;
        this.$enabledBackgroundColor = j19;
        this.$enabledBorderColor = j21;
        this.$$changed = i11;
        this.$$changed1 = i12;
        this.$$changed2 = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FoundationRadioKt.m3026FoundationRadioYYtx3bQ(this.$modifier, this.$iconModifier, this.$onClick, this.$selected, this.$enabled, this.$hasError, this.$icon, this.$iconColor, this.$size, this.$iconSize, this.$sizeOffset, this.$margin, this.$interactionSource, this.$disabledBackgroundColor, this.$selectedErrorBackgroundColor, this.$selectedErrorBorderColor, this.$selectedEnabledBackgroundColor, this.$selectedEnabledBorderColor, this.$errorBackgroundColor, this.$errorBorderColor, this.$enabledBackgroundColor, this.$enabledBorderColor, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), C2652m.e(this.$$changed2));
    }
}
