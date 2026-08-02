package ru.ozon.debugMenu.internal.core.ui.widgets.badge;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DebugMenuBadgeKt$DebugMenuBadge$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $label;
    final /* synthetic */ e $modifier;
    final /* synthetic */ boolean $showChevron;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugMenuBadgeKt$DebugMenuBadge$2(String str, e eVar, boolean z11, int i11, int i12) {
        super(2);
        this.$label = str;
        this.$modifier = eVar;
        this.$showChevron = z11;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DebugMenuBadgeKt.DebugMenuBadge(this.$label, this.$modifier, this.$showChevron, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
