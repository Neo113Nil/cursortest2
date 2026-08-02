package ru.ozon.uni.ozi.components.cell.addons;

import Bl0.C2652m;
import K1.C3422b;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import ru.ozon.uni.ozi.components.badge.presets.OziBadgeStyle;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziCellCenterScope$Default500Badge$6 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $badgeLabel;
    final /* synthetic */ e $badgeModifier;
    final /* synthetic */ boolean $badgeNumeric;
    final /* synthetic */ AbstractC8972b $badgeStartGraphic;
    final /* synthetic */ OziBadgeStyle $badgeStyle;
    final /* synthetic */ float $minWidth;
    final /* synthetic */ e $modifier;
    final /* synthetic */ C3422b $subtitle;
    final /* synthetic */ long $subtitleColor;
    final /* synthetic */ int $subtitleMaxLines;
    final /* synthetic */ C3422b $title;
    final /* synthetic */ long $titleColor;
    final /* synthetic */ OziCellCenterScope $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziCellCenterScope$Default500Badge$6(OziCellCenterScope oziCellCenterScope, C3422b c3422b, C3422b c3422b2, e eVar, e eVar2, int i11, String str, AbstractC8972b abstractC8972b, OziBadgeStyle oziBadgeStyle, boolean z11, long j11, long j12, float f7, int i12, int i13, int i14) {
        super(2);
        this.$tmp0_rcvr = oziCellCenterScope;
        this.$title = c3422b;
        this.$subtitle = c3422b2;
        this.$modifier = eVar;
        this.$badgeModifier = eVar2;
        this.$subtitleMaxLines = i11;
        this.$badgeLabel = str;
        this.$badgeStartGraphic = abstractC8972b;
        this.$badgeStyle = oziBadgeStyle;
        this.$badgeNumeric = z11;
        this.$titleColor = j11;
        this.$subtitleColor = j12;
        this.$minWidth = f7;
        this.$$changed = i12;
        this.$$changed1 = i13;
        this.$$default = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        this.$tmp0_rcvr.m3077Default500BadgeX9ctgU4(this.$title, this.$subtitle, this.$modifier, this.$badgeModifier, this.$subtitleMaxLines, this.$badgeLabel, this.$badgeStartGraphic, this.$badgeStyle, this.$badgeNumeric, this.$titleColor, this.$subtitleColor, this.$minWidth, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
