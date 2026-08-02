package ru.ozon.app.android.videomoleculecompose.slots.controlpanel;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarBehavior;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarState;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarStyle;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoMoleculeControlPanelKt$CompactControlPanel$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ControlPanelActions $actions;
    final /* synthetic */ SlimTimeBarBehavior $behavior;
    final /* synthetic */ e $modifier;
    final /* synthetic */ SlimTimeBarStyle $style;
    final /* synthetic */ t<SlimTimeBarState, e, SlimTimeBarStyle, SlimTimeBarBehavior, Function1<? super Long, Unit>, Function1<? super Long, Unit>, Function2<? super Long, ? super Boolean, Unit>, InterfaceC3967k, Integer, Unit> $timeBar;
    final /* synthetic */ SlimTimeBarState $timeline;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VideoMoleculeControlPanelKt$CompactControlPanel$1(SlimTimeBarState slimTimeBarState, e eVar, t<? super SlimTimeBarState, ? super e, ? super SlimTimeBarStyle, ? super SlimTimeBarBehavior, ? super Function1<? super Long, Unit>, ? super Function1<? super Long, Unit>, ? super Function2<? super Long, ? super Boolean, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> tVar, SlimTimeBarStyle slimTimeBarStyle, SlimTimeBarBehavior slimTimeBarBehavior, ControlPanelActions controlPanelActions, int i11) {
        super(2);
        this.$timeline = slimTimeBarState;
        this.$modifier = eVar;
        this.$timeBar = tVar;
        this.$style = slimTimeBarStyle;
        this.$behavior = slimTimeBarBehavior;
        this.$actions = controlPanelActions;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        VideoMoleculeControlPanelKt.CompactControlPanel(this.$timeline, this.$modifier, this.$timeBar, this.$style, this.$behavior, this.$actions, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
