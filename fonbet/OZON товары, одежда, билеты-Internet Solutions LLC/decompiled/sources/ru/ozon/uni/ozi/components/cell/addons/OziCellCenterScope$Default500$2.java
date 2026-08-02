package ru.ozon.uni.ozi.components.cell.addons;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziCellCenterScope$Default500$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ float $minWidth;
    final /* synthetic */ e $modifier;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ long $subtitleColor;
    final /* synthetic */ int $subtitleMaxLines;
    final /* synthetic */ String $title;
    final /* synthetic */ long $titleColor;
    final /* synthetic */ int $titleMaxLines;
    final /* synthetic */ OziCellCenterScope $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziCellCenterScope$Default500$2(OziCellCenterScope oziCellCenterScope, String str, String str2, e eVar, int i11, int i12, long j11, long j12, float f7, int i13, int i14) {
        super(2);
        this.$tmp0_rcvr = oziCellCenterScope;
        this.$title = str;
        this.$subtitle = str2;
        this.$modifier = eVar;
        this.$titleMaxLines = i11;
        this.$subtitleMaxLines = i12;
        this.$titleColor = j11;
        this.$subtitleColor = j12;
        this.$minWidth = f7;
        this.$$changed = i13;
        this.$$default = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        this.$tmp0_rcvr.m3076Default500Rx1qByU(this.$title, this.$subtitle, this.$modifier, this.$titleMaxLines, this.$subtitleMaxLines, this.$titleColor, this.$subtitleColor, this.$minWidth, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
