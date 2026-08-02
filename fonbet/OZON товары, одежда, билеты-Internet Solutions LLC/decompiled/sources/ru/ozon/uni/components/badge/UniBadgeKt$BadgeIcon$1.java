package ru.ozon.uni.components.badge;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UniBadgeKt$BadgeIcon$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ AbstractC8972b $graphic;
    final /* synthetic */ e $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniBadgeKt$BadgeIcon$1(e eVar, AbstractC8972b abstractC8972b, long j11, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$graphic = abstractC8972b;
        this.$color = j11;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        UniBadgeKt.m1868BadgeIconFNF3uiM(this.$modifier, this.$graphic, this.$color, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
