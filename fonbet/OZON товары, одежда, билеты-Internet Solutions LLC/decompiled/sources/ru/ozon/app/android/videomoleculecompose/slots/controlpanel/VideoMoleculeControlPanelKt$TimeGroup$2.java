package ru.ozon.app.android.videomoleculecompose.slots.controlpanel;

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
/* loaded from: classes2.dex */
final class VideoMoleculeControlPanelKt$TimeGroup$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $durationMs;
    final /* synthetic */ boolean $hidden;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Long> $positionMsProvider;
    final /* synthetic */ Function1<Long, String> $timeFormatter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VideoMoleculeControlPanelKt$TimeGroup$2(Function0<Long> function0, long j11, Function1<? super Long, String> function1, e eVar, boolean z11, int i11, int i12) {
        super(2);
        this.$positionMsProvider = function0;
        this.$durationMs = j11;
        this.$timeFormatter = function1;
        this.$modifier = eVar;
        this.$hidden = z11;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        VideoMoleculeControlPanelKt.TimeGroup(this.$positionMsProvider, this.$durationMs, this.$timeFormatter, this.$modifier, this.$hidden, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
