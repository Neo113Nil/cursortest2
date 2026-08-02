package ru.ozon.uni.android.ds.compose.component.badge;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;
import q1.AbstractC8972b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DsBadgeKt$DsBadge$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $accessibilityContentDescription;
    final /* synthetic */ AbstractC7799Q $backgroundBrush;
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ boolean $hideDisclosure;
    final /* synthetic */ boolean $isBottomLeftCornerDisabled;
    final /* synthetic */ boolean $isBottomRightCornerDisabled;
    final /* synthetic */ boolean $isTopLeftCornerDisabled;
    final /* synthetic */ boolean $isTopRightCornerDisabled;
    final /* synthetic */ AbstractC8972b $leftIcon;
    final /* synthetic */ long $leftIconColor;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ long $rightIconColor;
    final /* synthetic */ DsBadgeSize $size;
    final /* synthetic */ String $text;
    final /* synthetic */ long $textColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsBadgeKt$DsBadge$3(DsBadgeSize dsBadgeSize, AbstractC7799Q abstractC7799Q, e eVar, long j11, long j12, long j13, float f7, String str, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, AbstractC8972b abstractC8972b, Function0<Unit> function0, String str2, int i11, int i12, int i13) {
        super(2);
        this.$size = dsBadgeSize;
        this.$backgroundBrush = abstractC7799Q;
        this.$modifier = eVar;
        this.$textColor = j11;
        this.$leftIconColor = j12;
        this.$rightIconColor = j13;
        this.$cornerRadius = f7;
        this.$text = str;
        this.$isTopLeftCornerDisabled = z11;
        this.$isTopRightCornerDisabled = z12;
        this.$isBottomLeftCornerDisabled = z13;
        this.$isBottomRightCornerDisabled = z14;
        this.$hideDisclosure = z15;
        this.$leftIcon = abstractC8972b;
        this.$onClick = function0;
        this.$accessibilityContentDescription = str2;
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
        DsBadgeKt.m1675DsBadgeATjRvoI(this.$size, this.$backgroundBrush, this.$modifier, this.$textColor, this.$leftIconColor, this.$rightIconColor, this.$cornerRadius, this.$text, this.$isTopLeftCornerDisabled, this.$isTopRightCornerDisabled, this.$isBottomLeftCornerDisabled, this.$isBottomRightCornerDisabled, this.$hideDisclosure, this.$leftIcon, this.$onClick, this.$accessibilityContentDescription, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
