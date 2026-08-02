package ru.ozon.uni.android.ds.compose.component.input;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.core.models.UniIconToken;
import u0.InterfaceC9890C;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsInputBaseImplKt$IconSlot$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ UniIconToken $iconToken;
    final /* synthetic */ boolean $isFirst;
    final /* synthetic */ e $locatorModifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ InterfaceC9890C $this_IconSlot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsInputBaseImplKt$IconSlot$4(InterfaceC9890C interfaceC9890C, UniIconToken uniIconToken, e eVar, long j11, Function0<Unit> function0, boolean z11, int i11, int i12) {
        super(2);
        this.$this_IconSlot = interfaceC9890C;
        this.$iconToken = uniIconToken;
        this.$locatorModifier = eVar;
        this.$color = j11;
        this.$onClick = function0;
        this.$isFirst = z11;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DsInputBaseImplKt.m1737IconSlotfWhpE4E(this.$this_IconSlot, this.$iconToken, this.$locatorModifier, this.$color, this.$onClick, this.$isFirst, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
