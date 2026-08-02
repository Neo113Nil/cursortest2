package ru.ozon.app.android.videomoleculecompose.slots.controlpanel;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.p;
import fd.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarBehavior;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarState;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarStyle;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoMoleculeControlPanelKt$PortraitControlPanel$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ ControlPanelActions $actions;
    final /* synthetic */ SlimTimeBarBehavior $behavior;
    final /* synthetic */ boolean $isFullscreen;
    final /* synthetic */ boolean $isScrubbing;
    final /* synthetic */ p<Boolean, e, Function0<Unit>, InterfaceC3967k, Integer, Unit> $modeButton;
    final /* synthetic */ e $modifier;
    final /* synthetic */ p<VideoMoleculePlayPauseState, e, Function0<Unit>, InterfaceC3967k, Integer, Unit> $playPause;
    final /* synthetic */ VideoMoleculePlayPauseState $playPauseState;
    final /* synthetic */ SlimTimeBarStyle $style;
    final /* synthetic */ t<SlimTimeBarState, e, SlimTimeBarStyle, SlimTimeBarBehavior, Function1<? super Long, Unit>, Function1<? super Long, Unit>, Function2<? super Long, ? super Boolean, Unit>, InterfaceC3967k, Integer, Unit> $timeBar;
    final /* synthetic */ Function1<Long, String> $timeFormatter;
    final /* synthetic */ SlimTimeBarState $timeline;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VideoMoleculeControlPanelKt$PortraitControlPanel$2(SlimTimeBarState slimTimeBarState, VideoMoleculePlayPauseState videoMoleculePlayPauseState, Function1<? super Long, String> function1, boolean z11, boolean z12, e eVar, p<? super VideoMoleculePlayPauseState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar, t<? super SlimTimeBarState, ? super e, ? super SlimTimeBarStyle, ? super SlimTimeBarBehavior, ? super Function1<? super Long, Unit>, ? super Function1<? super Long, Unit>, ? super Function2<? super Long, ? super Boolean, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> tVar, p<? super Boolean, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar2, SlimTimeBarStyle slimTimeBarStyle, SlimTimeBarBehavior slimTimeBarBehavior, ControlPanelActions controlPanelActions, int i11, int i12) {
        super(2);
        this.$timeline = slimTimeBarState;
        this.$playPauseState = videoMoleculePlayPauseState;
        this.$timeFormatter = function1;
        this.$isFullscreen = z11;
        this.$isScrubbing = z12;
        this.$modifier = eVar;
        this.$playPause = pVar;
        this.$timeBar = tVar;
        this.$modeButton = pVar2;
        this.$style = slimTimeBarStyle;
        this.$behavior = slimTimeBarBehavior;
        this.$actions = controlPanelActions;
        this.$$changed = i11;
        this.$$changed1 = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        VideoMoleculeControlPanelKt.PortraitControlPanel(this.$timeline, this.$playPauseState, this.$timeFormatter, this.$isFullscreen, this.$isScrubbing, this.$modifier, this.$playPause, this.$timeBar, this.$modeButton, this.$style, this.$behavior, this.$actions, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1));
    }
}
