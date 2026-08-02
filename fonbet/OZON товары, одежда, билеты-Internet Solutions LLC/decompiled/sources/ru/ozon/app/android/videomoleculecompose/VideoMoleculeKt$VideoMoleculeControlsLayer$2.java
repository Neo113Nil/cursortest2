package ru.ozon.app.android.videomoleculecompose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3.PlayerTimelineState;
import ru.ozon.app.android.videomoleculecompose.intent.VideoMoleculeIntent;
import ru.ozon.app.android.videomoleculecompose.interaction.VideoMoleculeInteractionState;
import ru.ozon.app.android.videomoleculecompose.slots.controlpanel.VideoMoleculeControlPanelState;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoMoleculeKt$VideoMoleculeControlsLayer$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function0<Long> $bufferedPositionMsProvider;
    final /* synthetic */ p<VideoMoleculeControlPanelState, e, Function1<? super VideoMoleculeIntent, Unit>, InterfaceC3967k, Integer, Unit> $controlPanel;
    final /* synthetic */ VideoMoleculeInteractionState $interactionState;
    final /* synthetic */ boolean $isCompactControls;
    final /* synthetic */ boolean $isFullscreen;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<VideoMoleculeIntent, Unit> $onIntent;
    final /* synthetic */ boolean $playPauseEnabled;
    final /* synthetic */ Function0<Long> $positionMsProvider;
    final /* synthetic */ boolean $showPlay;
    final /* synthetic */ Function1<Long, String> $timeFormatter;
    final /* synthetic */ PlayerTimelineState $timelineState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VideoMoleculeKt$VideoMoleculeControlsLayer$2(p<? super VideoMoleculeControlPanelState, ? super e, ? super Function1<? super VideoMoleculeIntent, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar, PlayerTimelineState playerTimelineState, Function0<Long> function0, Function0<Long> function02, boolean z11, boolean z12, VideoMoleculeInteractionState videoMoleculeInteractionState, boolean z13, boolean z14, Function1<? super Long, String> function1, Function1<? super VideoMoleculeIntent, Unit> function12, e eVar, int i11, int i12, int i13) {
        super(2);
        this.$controlPanel = pVar;
        this.$timelineState = playerTimelineState;
        this.$positionMsProvider = function0;
        this.$bufferedPositionMsProvider = function02;
        this.$showPlay = z11;
        this.$playPauseEnabled = z12;
        this.$interactionState = videoMoleculeInteractionState;
        this.$isCompactControls = z13;
        this.$isFullscreen = z14;
        this.$timeFormatter = function1;
        this.$onIntent = function12;
        this.$modifier = eVar;
        this.$$changed = i11;
        this.$$changed1 = i12;
        this.$$default = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        VideoMoleculeKt.VideoMoleculeControlsLayer(this.$controlPanel, this.$timelineState, this.$positionMsProvider, this.$bufferedPositionMsProvider, this.$showPlay, this.$playPauseEnabled, this.$interactionState, this.$isCompactControls, this.$isFullscreen, this.$timeFormatter, this.$onIntent, this.$modifier, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
