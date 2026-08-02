package ru.ozon.uni.foundation.components.checkbox;

import Bl0.C2652m;
import J1.a;
import K1.T;
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
/* loaded from: classes4.dex */
final class FoundationCheckboxKt$FoundationCheckbox$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ long $disabledBackgroundColor;
    final /* synthetic */ long $disabledSelectedBackgroundColor;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ long $enabledBackgroundColor;
    final /* synthetic */ long $enabledBorderColor;
    final /* synthetic */ long $errorBackgroundColor;
    final /* synthetic */ long $errorBorderColor;
    final /* synthetic */ boolean $hasError;
    final /* synthetic */ long $iconColor;
    final /* synthetic */ e $iconModifier;
    final /* synthetic */ float $iconSize;
    final /* synthetic */ AbstractC8972b $indeterminateIcon;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ float $margin;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Integer $quantity;
    final /* synthetic */ T $quantityTextStyle;
    final /* synthetic */ long $selectedEnabledBackgroundColor;
    final /* synthetic */ long $selectedEnabledBorderColor;
    final /* synthetic */ long $selectedErrorBackgroundColor;
    final /* synthetic */ long $selectedErrorBorderColor;
    final /* synthetic */ AbstractC8972b $selectedIcon;
    final /* synthetic */ float $size;
    final /* synthetic */ float $sizeOffset;
    final /* synthetic */ a $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FoundationCheckboxKt$FoundationCheckbox$2(e eVar, e eVar2, Function0<Unit> function0, a aVar, boolean z11, boolean z12, AbstractC8972b abstractC8972b, AbstractC8972b abstractC8972b2, Integer num, T t2, long j11, float f7, float f11, float f12, float f13, float f14, q qVar, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, int i11, int i12, int i13) {
        super(2);
        this.$modifier = eVar;
        this.$iconModifier = eVar2;
        this.$onClick = function0;
        this.$state = aVar;
        this.$enabled = z11;
        this.$hasError = z12;
        this.$selectedIcon = abstractC8972b;
        this.$indeterminateIcon = abstractC8972b2;
        this.$quantity = num;
        this.$quantityTextStyle = t2;
        this.$iconColor = j11;
        this.$size = f7;
        this.$iconSize = f11;
        this.$sizeOffset = f12;
        this.$cornerRadius = f13;
        this.$margin = f14;
        this.$interactionSource = qVar;
        this.$disabledBackgroundColor = j12;
        this.$disabledSelectedBackgroundColor = j13;
        this.$selectedErrorBackgroundColor = j14;
        this.$selectedErrorBorderColor = j15;
        this.$selectedEnabledBackgroundColor = j16;
        this.$selectedEnabledBorderColor = j17;
        this.$errorBackgroundColor = j18;
        this.$errorBorderColor = j19;
        this.$enabledBackgroundColor = j21;
        this.$enabledBorderColor = j22;
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
        FoundationCheckboxKt.m2987FoundationCheckboxOs3FA(this.$modifier, this.$iconModifier, this.$onClick, this.$state, this.$enabled, this.$hasError, this.$selectedIcon, this.$indeterminateIcon, this.$quantity, this.$quantityTextStyle, this.$iconColor, this.$size, this.$iconSize, this.$sizeOffset, this.$cornerRadius, this.$margin, this.$interactionSource, this.$disabledBackgroundColor, this.$disabledSelectedBackgroundColor, this.$selectedErrorBackgroundColor, this.$selectedErrorBorderColor, this.$selectedEnabledBackgroundColor, this.$selectedEnabledBorderColor, this.$errorBackgroundColor, this.$errorBorderColor, this.$enabledBackgroundColor, this.$enabledBorderColor, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), C2652m.e(this.$$changed2));
    }
}
