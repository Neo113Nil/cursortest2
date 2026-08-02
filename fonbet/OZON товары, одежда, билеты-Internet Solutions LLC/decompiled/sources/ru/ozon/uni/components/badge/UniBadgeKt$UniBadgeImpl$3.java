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
final class UniBadgeKt$UniBadgeImpl$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ String $label;
    final /* synthetic */ e $modifier;
    final /* synthetic */ boolean $numeric;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ boolean $showChevron;
    final /* synthetic */ UniBadgeSize $size;
    final /* synthetic */ AbstractC8972b $startGraphic;
    final /* synthetic */ UniBadgeStraightCorners $straightCorners;
    final /* synthetic */ UniBadgeStyle $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniBadgeKt$UniBadgeImpl$3(String str, boolean z11, Function0<Unit> function0, e eVar, AbstractC8972b abstractC8972b, UniBadgeStyle uniBadgeStyle, boolean z12, UniBadgeSize uniBadgeSize, float f7, UniBadgeStraightCorners uniBadgeStraightCorners, String str2, int i11, int i12) {
        super(2);
        this.$label = str;
        this.$showChevron = z11;
        this.$onClick = function0;
        this.$modifier = eVar;
        this.$startGraphic = abstractC8972b;
        this.$style = uniBadgeStyle;
        this.$numeric = z12;
        this.$size = uniBadgeSize;
        this.$cornerRadius = f7;
        this.$straightCorners = uniBadgeStraightCorners;
        this.$contentDescription = str2;
        this.$$changed = i11;
        this.$$changed1 = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        UniBadgeKt.m1873UniBadgeImplrqE1x30(this.$label, this.$showChevron, this.$onClick, this.$modifier, this.$startGraphic, this.$style, this.$numeric, this.$size, this.$cornerRadius, this.$straightCorners, this.$contentDescription, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1));
    }
}
