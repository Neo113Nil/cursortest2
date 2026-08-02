package ru.ozon.uni.components.badge;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UniBadgeKt$UniBadge$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ boolean $hideDisclosure;
    final /* synthetic */ AbstractC8972b $leftIcon;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ UniBadgeSize $size;
    final /* synthetic */ UniBadgeStraightCorners $straightCorners;
    final /* synthetic */ UniBadgeStyle $styleType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniBadgeKt$UniBadge$2(AbstractC8972b abstractC8972b, Function0<Unit> function0, e eVar, UniBadgeStyle uniBadgeStyle, UniBadgeSize uniBadgeSize, boolean z11, float f7, UniBadgeStraightCorners uniBadgeStraightCorners, String str, int i11, int i12) {
        super(2);
        this.$leftIcon = abstractC8972b;
        this.$onClick = function0;
        this.$modifier = eVar;
        this.$styleType = uniBadgeStyle;
        this.$size = uniBadgeSize;
        this.$hideDisclosure = z11;
        this.$cornerRadius = f7;
        this.$straightCorners = uniBadgeStraightCorners;
        this.$contentDescription = str;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        UniBadgeKt.m1870UniBadgeV95POc(this.$leftIcon, this.$onClick, this.$modifier, this.$styleType, this.$size, this.$hideDisclosure, this.$cornerRadius, this.$straightCorners, this.$contentDescription, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
