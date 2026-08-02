package ru.ozon.app.android.videomoleculecompose;

import B1.InterfaceC2547p;
import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import fd.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController;
import ru.ozon.app.android.videomoleculecompose.intent.VideoMoleculeIntent;
import ru.ozon.app.android.videomoleculecompose.slots.centeraction.VideoMoleculeCenterActionState;
import ru.ozon.app.android.videomoleculecompose.slots.controlpanel.VideoMoleculeControlPanelState;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoMoleculeKt$VideoMolecule$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC6512o<Boolean, e, InterfaceC3967k, Integer, Unit> $buffering;
    final /* synthetic */ p<VideoMoleculeCenterActionState, e, Function0<Unit>, InterfaceC3967k, Integer, Unit> $centerActionOverlay;
    final /* synthetic */ InterfaceC2547p $contentScale;
    final /* synthetic */ p<VideoMoleculeControlPanelState, e, Function1<? super VideoMoleculeIntent, Unit>, InterfaceC3967k, Integer, Unit> $controlPanel;
    final /* synthetic */ InterfaceC6511n<e, InterfaceC3967k, Integer, Unit> $gradientOverlay;
    final /* synthetic */ boolean $isCompactControls;
    final /* synthetic */ boolean $isFullscreen;
    final /* synthetic */ InterfaceC6511n<BasePlayerController, InterfaceC3967k, Integer, Unit> $lifecyclePlaybackEffect;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<VideoMoleculeIntent, Unit> $onIntent;
    final /* synthetic */ InterfaceC6511n<e, InterfaceC3967k, Integer, Unit> $overlay;
    final /* synthetic */ BasePlayerController $playerController;
    final /* synthetic */ InterfaceC6512o<Boolean, e, InterfaceC3967k, Integer, Unit> $preview;
    final /* synthetic */ int $surfaceType;
    final /* synthetic */ Function1<Long, String> $timeFormatter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VideoMoleculeKt$VideoMolecule$3(BasePlayerController basePlayerController, Function1<? super VideoMoleculeIntent, Unit> function1, boolean z11, boolean z12, e eVar, InterfaceC2547p interfaceC2547p, int i11, Function1<? super Long, String> function12, InterfaceC6511n<? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, InterfaceC6511n<? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2, p<? super VideoMoleculeCenterActionState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar, p<? super VideoMoleculeControlPanelState, ? super e, ? super Function1<? super VideoMoleculeIntent, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar2, InterfaceC6512o<? super Boolean, ? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6512o, InterfaceC6512o<? super Boolean, ? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6512o2, InterfaceC6511n<? super BasePlayerController, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n3, int i12, int i13, int i14) {
        super(2);
        this.$playerController = basePlayerController;
        this.$onIntent = function1;
        this.$isFullscreen = z11;
        this.$isCompactControls = z12;
        this.$modifier = eVar;
        this.$contentScale = interfaceC2547p;
        this.$surfaceType = i11;
        this.$timeFormatter = function12;
        this.$gradientOverlay = interfaceC6511n;
        this.$overlay = interfaceC6511n2;
        this.$centerActionOverlay = pVar;
        this.$controlPanel = pVar2;
        this.$preview = interfaceC6512o;
        this.$buffering = interfaceC6512o2;
        this.$lifecyclePlaybackEffect = interfaceC6511n3;
        this.$$changed = i12;
        this.$$changed1 = i13;
        this.$$default = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        VideoMoleculeKt.VideoMolecule(this.$playerController, this.$onIntent, this.$isFullscreen, this.$isCompactControls, this.$modifier, this.$contentScale, this.$surfaceType, this.$timeFormatter, this.$gradientOverlay, this.$overlay, this.$centerActionOverlay, this.$controlPanel, this.$preview, this.$buffering, this.$lifecyclePlaybackEffect, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
