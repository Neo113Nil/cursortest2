package ru.ozon.uni.foundation.components.disclaimer;

import Bl0.C2652m;
import K1.C3422b;
import K1.T;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class FoundationDisclaimerKt$FoundationDisclaimer$6 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ AbstractC8972b $chevronIcon;
    final /* synthetic */ long $chevronTintColor;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $closeButton;
    final /* synthetic */ float $contentSpacerHeight;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $firstButton;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ long $iconColor;
    final /* synthetic */ e $iconModifier;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $secondButton;
    final /* synthetic */ C3422b $subtitle;
    final /* synthetic */ long $subtitleColor;
    final /* synthetic */ int $subtitleLinesLimit;
    final /* synthetic */ e $subtitleModifier;
    final /* synthetic */ T $subtitleStyle;
    final /* synthetic */ C3422b $title;
    final /* synthetic */ long $titleColor;
    final /* synthetic */ int $titleLinesLimit;
    final /* synthetic */ e $titleModifier;
    final /* synthetic */ T $titleStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FoundationDisclaimerKt$FoundationDisclaimer$6(e eVar, e eVar2, e eVar3, e eVar4, C3422b c3422b, C3422b c3422b2, AbstractC8972b abstractC8972b, int i11, int i12, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, Function2<? super InterfaceC3967k, ? super Integer, Unit> function23, long j11, long j12, long j13, long j14, T t2, T t11, AbstractC8972b abstractC8972b2, long j15, float f7, int i13, int i14, int i15, int i16) {
        super(2);
        this.$modifier = eVar;
        this.$titleModifier = eVar2;
        this.$subtitleModifier = eVar3;
        this.$iconModifier = eVar4;
        this.$title = c3422b;
        this.$subtitle = c3422b2;
        this.$icon = abstractC8972b;
        this.$titleLinesLimit = i11;
        this.$subtitleLinesLimit = i12;
        this.$closeButton = function2;
        this.$firstButton = function22;
        this.$secondButton = function23;
        this.$backgroundColor = j11;
        this.$titleColor = j12;
        this.$subtitleColor = j13;
        this.$iconColor = j14;
        this.$titleStyle = t2;
        this.$subtitleStyle = t11;
        this.$chevronIcon = abstractC8972b2;
        this.$chevronTintColor = j15;
        this.$contentSpacerHeight = f7;
        this.$$changed = i13;
        this.$$changed1 = i14;
        this.$$changed2 = i15;
        this.$$default = i16;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FoundationDisclaimerKt.m2989FoundationDisclaimer4FN_7CA(this.$modifier, this.$titleModifier, this.$subtitleModifier, this.$iconModifier, this.$title, this.$subtitle, this.$icon, this.$titleLinesLimit, this.$subtitleLinesLimit, this.$closeButton, this.$firstButton, this.$secondButton, this.$backgroundColor, this.$titleColor, this.$subtitleColor, this.$iconColor, this.$titleStyle, this.$subtitleStyle, this.$chevronIcon, this.$chevronTintColor, this.$contentSpacerHeight, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), C2652m.e(this.$$changed2), this.$$default);
    }
}
