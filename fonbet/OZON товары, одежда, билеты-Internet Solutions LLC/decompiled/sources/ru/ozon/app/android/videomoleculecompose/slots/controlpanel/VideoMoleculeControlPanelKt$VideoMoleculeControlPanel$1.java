package ru.ozon.app.android.videomoleculecompose.slots.controlpanel;

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

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class VideoMoleculeControlPanelKt$VideoMoleculeControlPanel$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ ControlPanelActions $actions;
    final /* synthetic */ SlimTimeBarBehavior $behavior;
    final /* synthetic */ boolean $isLandscape;
    final /* synthetic */ p<Boolean, e, Function0<Unit>, InterfaceC3967k, Integer, Unit> $modeButton;
    final /* synthetic */ e $modifier;
    final /* synthetic */ p<VideoMoleculePlayPauseState, e, Function0<Unit>, InterfaceC3967k, Integer, Unit> $playPause;
    final /* synthetic */ VideoMoleculeControlPanelState $state;
    final /* synthetic */ SlimTimeBarStyle $style;
    final /* synthetic */ t<SlimTimeBarState, e, SlimTimeBarStyle, SlimTimeBarBehavior, Function1<? super Long, Unit>, Function1<? super Long, Unit>, Function2<? super Long, ? super Boolean, Unit>, InterfaceC3967k, Integer, Unit> $timeBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VideoMoleculeControlPanelKt$VideoMoleculeControlPanel$1(VideoMoleculeControlPanelState videoMoleculeControlPanelState, e eVar, t<? super SlimTimeBarState, ? super e, ? super SlimTimeBarStyle, ? super SlimTimeBarBehavior, ? super Function1<? super Long, Unit>, ? super Function1<? super Long, Unit>, ? super Function2<? super Long, ? super Boolean, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> tVar, SlimTimeBarStyle slimTimeBarStyle, SlimTimeBarBehavior slimTimeBarBehavior, ControlPanelActions controlPanelActions, boolean z11, p<? super VideoMoleculePlayPauseState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar, p<? super Boolean, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar2) {
        super(2);
        this.$state = videoMoleculeControlPanelState;
        this.$modifier = eVar;
        this.$timeBar = tVar;
        this.$style = slimTimeBarStyle;
        this.$behavior = slimTimeBarBehavior;
        this.$actions = controlPanelActions;
        this.$isLandscape = z11;
        this.$playPause = pVar;
        this.$modeButton = pVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        if (this.$state.getIsCompact()) {
            interfaceC3967k.o(-886108947);
            VideoMoleculeControlPanelKt.CompactControlPanel(this.$state.getTimeline(), this.$modifier, this.$timeBar, this.$style, this.$behavior, this.$actions, interfaceC3967k, 0);
            interfaceC3967k.k();
        } else if (this.$isLandscape) {
            interfaceC3967k.o(-886099670);
            VideoMoleculeControlPanelKt.LandscapeControlPanel(this.$state.getTimeline(), this.$state.getPlayPause(), this.$state.getTimeFormatter(), this.$state.getIsFullscreen(), this.$state.getIsScrubbing(), this.$modifier, this.$playPause, this.$timeBar, this.$modeButton, this.$style, this.$behavior, this.$actions, interfaceC3967k, 0, 0);
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(-886081783);
            VideoMoleculeControlPanelKt.PortraitControlPanel(this.$state.getTimeline(), this.$state.getPlayPause(), this.$state.getTimeFormatter(), this.$state.getIsFullscreen(), this.$state.getIsScrubbing(), this.$modifier, this.$playPause, this.$timeBar, this.$modeButton, this.$style, this.$behavior, this.$actions, interfaceC3967k, 0, 0);
            interfaceC3967k.k();
        }
    }
}
