package ru.ozon.uni.ozi.components.cell.addons;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziCellEndScope$Icon$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ long $iconColor;
    final /* synthetic */ e $modifier;
    final /* synthetic */ OziCellEndScope $tmp0_rcvr;
    final /* synthetic */ InterfaceC6250b.c $verticalAlignment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziCellEndScope$Icon$2(OziCellEndScope oziCellEndScope, e eVar, AbstractC8972b abstractC8972b, long j11, InterfaceC6250b.c cVar, int i11, int i12) {
        super(2);
        this.$tmp0_rcvr = oziCellEndScope;
        this.$modifier = eVar;
        this.$icon = abstractC8972b;
        this.$iconColor = j11;
        this.$verticalAlignment = cVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        this.$tmp0_rcvr.m3078Iconcf5BqRc(this.$modifier, this.$icon, this.$iconColor, this.$verticalAlignment, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
