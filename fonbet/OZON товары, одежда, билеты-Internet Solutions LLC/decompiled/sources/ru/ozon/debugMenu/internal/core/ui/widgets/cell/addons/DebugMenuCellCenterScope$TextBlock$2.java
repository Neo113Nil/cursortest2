package ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DebugMenuCellCenterScope$TextBlock$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isReversed;
    final /* synthetic */ e $modifier;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ int $subtitleMaxLines;
    final /* synthetic */ String $title;
    final /* synthetic */ int $titleMaxLines;
    final /* synthetic */ DebugMenuCellCenterScope $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugMenuCellCenterScope$TextBlock$2(DebugMenuCellCenterScope debugMenuCellCenterScope, String str, e eVar, String str2, boolean z11, int i11, int i12, int i13, int i14) {
        super(2);
        this.$tmp0_rcvr = debugMenuCellCenterScope;
        this.$title = str;
        this.$modifier = eVar;
        this.$subtitle = str2;
        this.$isReversed = z11;
        this.$titleMaxLines = i11;
        this.$subtitleMaxLines = i12;
        this.$$changed = i13;
        this.$$default = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        this.$tmp0_rcvr.TextBlock(this.$title, this.$modifier, this.$subtitle, this.$isReversed, this.$titleMaxLines, this.$subtitleMaxLines, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
