package ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PlayerShowcaseV2CustomizationsSlots$CustomizationTimeGroup$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $durationMs;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Long> $positionMsProvider;
    final /* synthetic */ Function1<Long, String> $timeFormatter;
    final /* synthetic */ PlayerShowcaseV2CustomizationsSlots $tmp2_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PlayerShowcaseV2CustomizationsSlots$CustomizationTimeGroup$1(PlayerShowcaseV2CustomizationsSlots playerShowcaseV2CustomizationsSlots, Function0<Long> function0, long j11, Function1<? super Long, String> function1, e eVar, int i11, int i12) {
        super(2);
        this.$tmp2_rcvr = playerShowcaseV2CustomizationsSlots;
        this.$positionMsProvider = function0;
        this.$durationMs = j11;
        this.$timeFormatter = function1;
        this.$modifier = eVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        this.$tmp2_rcvr.CustomizationTimeGroup(this.$positionMsProvider, this.$durationMs, this.$timeFormatter, this.$modifier, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
